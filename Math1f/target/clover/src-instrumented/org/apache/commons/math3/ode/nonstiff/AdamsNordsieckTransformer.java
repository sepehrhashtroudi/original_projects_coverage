/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.math3.ode.nonstiff;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.linear.Array2DRowFieldMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayFieldVector;
import org.apache.commons.math3.linear.FieldDecompositionSolver;
import org.apache.commons.math3.linear.FieldLUDecomposition;
import org.apache.commons.math3.linear.FieldMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.QRDecomposition;
import org.apache.commons.math3.linear.RealMatrix;

/** Transformer to Nordsieck vectors for Adams integrators.
 * <p>This class is used by {@link AdamsBashforthIntegrator Adams-Bashforth} and
 * {@link AdamsMoultonIntegrator Adams-Moulton} integrators to convert between
 * classical representation with several previous first derivatives and Nordsieck
 * representation with higher order scaled derivatives.</p>
 *
 * <p>We define scaled derivatives s<sub>i</sub>(n) at step n as:
 * <pre>
 * s<sub>1</sub>(n) = h y'<sub>n</sub> for first derivative
 * s<sub>2</sub>(n) = h<sup>2</sup>/2 y''<sub>n</sub> for second derivative
 * s<sub>3</sub>(n) = h<sup>3</sup>/6 y'''<sub>n</sub> for third derivative
 * ...
 * s<sub>k</sub>(n) = h<sup>k</sup>/k! y<sup>(k)</sup><sub>n</sub> for k<sup>th</sup> derivative
 * </pre></p>
 *
 * <p>With the previous definition, the classical representation of multistep methods
 * uses first derivatives only, i.e. it handles y<sub>n</sub>, s<sub>1</sub>(n) and
 * q<sub>n</sub> where q<sub>n</sub> is defined as:
 * <pre>
 *   q<sub>n</sub> = [ s<sub>1</sub>(n-1) s<sub>1</sub>(n-2) ... s<sub>1</sub>(n-(k-1)) ]<sup>T</sup>
 * </pre>
 * (we omit the k index in the notation for clarity).</p>
 *
 * <p>Another possible representation uses the Nordsieck vector with
 * higher degrees scaled derivatives all taken at the same step, i.e it handles y<sub>n</sub>,
 * s<sub>1</sub>(n) and r<sub>n</sub>) where r<sub>n</sub> is defined as:
 * <pre>
 * r<sub>n</sub> = [ s<sub>2</sub>(n), s<sub>3</sub>(n) ... s<sub>k</sub>(n) ]<sup>T</sup>
 * </pre>
 * (here again we omit the k index in the notation for clarity)
 * </p>
 *
 * <p>Taylor series formulas show that for any index offset i, s<sub>1</sub>(n-i) can be
 * computed from s<sub>1</sub>(n), s<sub>2</sub>(n) ... s<sub>k</sub>(n), the formula being exact
 * for degree k polynomials.
 * <pre>
 * s<sub>1</sub>(n-i) = s<sub>1</sub>(n) + &sum;<sub>j&gt;1</sub> j (-i)<sup>j-1</sup> s<sub>j</sub>(n)
 * </pre>
 * The previous formula can be used with several values for i to compute the transform between
 * classical representation and Nordsieck vector at step end. The transform between r<sub>n</sub>
 * and q<sub>n</sub> resulting from the Taylor series formulas above is:
 * <pre>
 * q<sub>n</sub> = s<sub>1</sub>(n) u + P r<sub>n</sub>
 * </pre>
 * where u is the [ 1 1 ... 1 ]<sup>T</sup> vector and P is the (k-1)&times;(k-1) matrix built
 * with the j (-i)<sup>j-1</sup> terms:
 * <pre>
 *        [  -2   3   -4    5  ... ]
 *        [  -4  12  -32   80  ... ]
 *   P =  [  -6  27 -108  405  ... ]
 *        [  -8  48 -256 1280  ... ]
 *        [          ...           ]
 * </pre></p>
 *
 * <p>Changing -i into +i in the formula above can be used to compute a similar transform between
 * classical representation and Nordsieck vector at step start. The resulting matrix is simply
 * the absolute value of matrix P.</p>
 *
 * <p>For {@link AdamsBashforthIntegrator Adams-Bashforth} method, the Nordsieck vector
 * at step n+1 is computed from the Nordsieck vector at step n as follows:
 * <ul>
 *   <li>y<sub>n+1</sub> = y<sub>n</sub> + s<sub>1</sub>(n) + u<sup>T</sup> r<sub>n</sub></li>
 *   <li>s<sub>1</sub>(n+1) = h f(t<sub>n+1</sub>, y<sub>n+1</sub>)</li>
 *   <li>r<sub>n+1</sub> = (s<sub>1</sub>(n) - s<sub>1</sub>(n+1)) P<sup>-1</sup> u + P<sup>-1</sup> A P r<sub>n</sub></li>
 * </ul>
 * where A is a rows shifting matrix (the lower left part is an identity matrix):
 * <pre>
 *        [ 0 0   ...  0 0 | 0 ]
 *        [ ---------------+---]
 *        [ 1 0   ...  0 0 | 0 ]
 *    A = [ 0 1   ...  0 0 | 0 ]
 *        [       ...      | 0 ]
 *        [ 0 0   ...  1 0 | 0 ]
 *        [ 0 0   ...  0 1 | 0 ]
 * </pre></p>
 *
 * <p>For {@link AdamsMoultonIntegrator Adams-Moulton} method, the predicted Nordsieck vector
 * at step n+1 is computed from the Nordsieck vector at step n as follows:
 * <ul>
 *   <li>Y<sub>n+1</sub> = y<sub>n</sub> + s<sub>1</sub>(n) + u<sup>T</sup> r<sub>n</sub></li>
 *   <li>S<sub>1</sub>(n+1) = h f(t<sub>n+1</sub>, Y<sub>n+1</sub>)</li>
 *   <li>R<sub>n+1</sub> = (s<sub>1</sub>(n) - s<sub>1</sub>(n+1)) P<sup>-1</sup> u + P<sup>-1</sup> A P r<sub>n</sub></li>
 * </ul>
 * From this predicted vector, the corrected vector is computed as follows:
 * <ul>
 *   <li>y<sub>n+1</sub> = y<sub>n</sub> + S<sub>1</sub>(n+1) + [ -1 +1 -1 +1 ... &plusmn;1 ] r<sub>n+1</sub></li>
 *   <li>s<sub>1</sub>(n+1) = h f(t<sub>n+1</sub>, y<sub>n+1</sub>)</li>
 *   <li>r<sub>n+1</sub> = R<sub>n+1</sub> + (s<sub>1</sub>(n+1) - S<sub>1</sub>(n+1)) P<sup>-1</sup> u</li>
 * </ul>
 * where the upper case Y<sub>n+1</sub>, S<sub>1</sub>(n+1) and R<sub>n+1</sub> represent the
 * predicted states whereas the lower case y<sub>n+1</sub>, s<sub>n+1</sub> and r<sub>n+1</sub>
 * represent the corrected states.</p>
 *
 * <p>We observe that both methods use similar update formulas. In both cases a P<sup>-1</sup>u
 * vector and a P<sup>-1</sup> A P matrix are used that do not depend on the state,
 * they only depend on k. This class handles these transformations.</p>
 *
 * @version $Id$
 * @since 2.0
 */
public class AdamsNordsieckTransformer {public static class __CLR4_4_1po0po0lb90p9e2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,33354,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Cache for already computed coefficients. */
    private static final Map<Integer, AdamsNordsieckTransformer> CACHE =
        new HashMap<Integer, AdamsNordsieckTransformer>();

    /** Update matrix for the higher order derivatives h<sup>2</sup>/2y'', h<sup>3</sup>/6 y''' ... */
    private final Array2DRowRealMatrix update;

    /** Update coefficients of the higher order derivatives wrt y'. */
    private final double[] c1;

    /** Simple constructor.
     * @param nSteps number of steps of the multistep method
     * (excluding the one being computed)
     */
    private AdamsNordsieckTransformer(final int nSteps) {try{__CLR4_4_1po0po0lb90p9e2.R.inc(33264);

        // compute exact coefficients
        __CLR4_4_1po0po0lb90p9e2.R.inc(33265);FieldMatrix<BigFraction> bigP = buildP(nSteps);
        __CLR4_4_1po0po0lb90p9e2.R.inc(33266);FieldDecompositionSolver<BigFraction> pSolver =
            new FieldLUDecomposition<BigFraction>(bigP).getSolver();

        __CLR4_4_1po0po0lb90p9e2.R.inc(33267);BigFraction[] u = new BigFraction[nSteps];
        __CLR4_4_1po0po0lb90p9e2.R.inc(33268);Arrays.fill(u, BigFraction.ONE);
        __CLR4_4_1po0po0lb90p9e2.R.inc(33269);BigFraction[] bigC1 = pSolver
            .solve(new ArrayFieldVector<BigFraction>(u, false)).toArray();

        // update coefficients are computed by combining transform from
        // Nordsieck to multistep, then shifting rows to represent step advance
        // then applying inverse transform
        __CLR4_4_1po0po0lb90p9e2.R.inc(33270);BigFraction[][] shiftedP = bigP.getData();
        __CLR4_4_1po0po0lb90p9e2.R.inc(33271);for (int i = shiftedP.length - 1; (((i > 0)&&(__CLR4_4_1po0po0lb90p9e2.R.iget(33272)!=0|true))||(__CLR4_4_1po0po0lb90p9e2.R.iget(33273)==0&false)); --i) {{
            // shift rows
            __CLR4_4_1po0po0lb90p9e2.R.inc(33274);shiftedP[i] = shiftedP[i - 1];
        }
        }__CLR4_4_1po0po0lb90p9e2.R.inc(33275);shiftedP[0] = new BigFraction[nSteps];
        __CLR4_4_1po0po0lb90p9e2.R.inc(33276);Arrays.fill(shiftedP[0], BigFraction.ZERO);
        __CLR4_4_1po0po0lb90p9e2.R.inc(33277);FieldMatrix<BigFraction> bigMSupdate =
            pSolver.solve(new Array2DRowFieldMatrix<BigFraction>(shiftedP, false));

        // convert coefficients to double
        __CLR4_4_1po0po0lb90p9e2.R.inc(33278);update         = MatrixUtils.bigFractionMatrixToRealMatrix(bigMSupdate);
        __CLR4_4_1po0po0lb90p9e2.R.inc(33279);c1             = new double[nSteps];
        __CLR4_4_1po0po0lb90p9e2.R.inc(33280);for (int i = 0; (((i < nSteps)&&(__CLR4_4_1po0po0lb90p9e2.R.iget(33281)!=0|true))||(__CLR4_4_1po0po0lb90p9e2.R.iget(33282)==0&false)); ++i) {{
            __CLR4_4_1po0po0lb90p9e2.R.inc(33283);c1[i] = bigC1[i].doubleValue();
        }

    }}finally{__CLR4_4_1po0po0lb90p9e2.R.flushNeeded();}}

    /** Get the Nordsieck transformer for a given number of steps.
     * @param nSteps number of steps of the multistep method
     * (excluding the one being computed)
     * @return Nordsieck transformer for the specified number of steps
     */
    public static AdamsNordsieckTransformer getInstance(final int nSteps) {try{__CLR4_4_1po0po0lb90p9e2.R.inc(33284);
        __CLR4_4_1po0po0lb90p9e2.R.inc(33285);synchronized(CACHE) {
            __CLR4_4_1po0po0lb90p9e2.R.inc(33286);AdamsNordsieckTransformer t = CACHE.get(nSteps);
            __CLR4_4_1po0po0lb90p9e2.R.inc(33287);if ((((t == null)&&(__CLR4_4_1po0po0lb90p9e2.R.iget(33288)!=0|true))||(__CLR4_4_1po0po0lb90p9e2.R.iget(33289)==0&false))) {{
                __CLR4_4_1po0po0lb90p9e2.R.inc(33290);t = new AdamsNordsieckTransformer(nSteps);
                __CLR4_4_1po0po0lb90p9e2.R.inc(33291);CACHE.put(nSteps, t);
            }
            }__CLR4_4_1po0po0lb90p9e2.R.inc(33292);return t;
        }
    }finally{__CLR4_4_1po0po0lb90p9e2.R.flushNeeded();}}

    /** Get the number of steps of the method
     * (excluding the one being computed).
     * @return number of steps of the method
     * (excluding the one being computed)
     */
    public int getNSteps() {try{__CLR4_4_1po0po0lb90p9e2.R.inc(33293);
        __CLR4_4_1po0po0lb90p9e2.R.inc(33294);return c1.length;
    }finally{__CLR4_4_1po0po0lb90p9e2.R.flushNeeded();}}

    /** Build the P matrix.
     * <p>The P matrix general terms are shifted j (-i)<sup>j-1</sup> terms:
     * <pre>
     *        [  -2   3   -4    5  ... ]
     *        [  -4  12  -32   80  ... ]
     *   P =  [  -6  27 -108  405  ... ]
     *        [  -8  48 -256 1280  ... ]
     *        [          ...           ]
     * </pre></p>
     * @param nSteps number of steps of the multistep method
     * (excluding the one being computed)
     * @return P matrix
     */
    private FieldMatrix<BigFraction> buildP(final int nSteps) {try{__CLR4_4_1po0po0lb90p9e2.R.inc(33295);

        __CLR4_4_1po0po0lb90p9e2.R.inc(33296);final BigFraction[][] pData = new BigFraction[nSteps][nSteps];

        __CLR4_4_1po0po0lb90p9e2.R.inc(33297);for (int i = 0; (((i < pData.length)&&(__CLR4_4_1po0po0lb90p9e2.R.iget(33298)!=0|true))||(__CLR4_4_1po0po0lb90p9e2.R.iget(33299)==0&false)); ++i) {{
            // build the P matrix elements from Taylor series formulas
            __CLR4_4_1po0po0lb90p9e2.R.inc(33300);final BigFraction[] pI = pData[i];
            __CLR4_4_1po0po0lb90p9e2.R.inc(33301);final int factor = -(i + 1);
            __CLR4_4_1po0po0lb90p9e2.R.inc(33302);int aj = factor;
            __CLR4_4_1po0po0lb90p9e2.R.inc(33303);for (int j = 0; (((j < pI.length)&&(__CLR4_4_1po0po0lb90p9e2.R.iget(33304)!=0|true))||(__CLR4_4_1po0po0lb90p9e2.R.iget(33305)==0&false)); ++j) {{
                __CLR4_4_1po0po0lb90p9e2.R.inc(33306);pI[j] = new BigFraction(aj * (j + 2));
                __CLR4_4_1po0po0lb90p9e2.R.inc(33307);aj *= factor;
            }
        }}

        }__CLR4_4_1po0po0lb90p9e2.R.inc(33308);return new Array2DRowFieldMatrix<BigFraction>(pData, false);

    }finally{__CLR4_4_1po0po0lb90p9e2.R.flushNeeded();}}

    /** Initialize the high order scaled derivatives at step start.
     * @param h step size to use for scaling
     * @param t first steps times
     * @param y first steps states
     * @param yDot first steps derivatives
     * @return Nordieck vector at first step (h<sup>2</sup>/2 y''<sub>n</sub>,
     * h<sup>3</sup>/6 y'''<sub>n</sub> ... h<sup>k</sup>/k! y<sup>(k)</sup><sub>n</sub>)
     */
    public Array2DRowRealMatrix initializeHighOrderDerivatives(final double h, final double[] t,
                                                               final double[][] y,
                                                               final double[][] yDot) {try{__CLR4_4_1po0po0lb90p9e2.R.inc(33309);

        // using Taylor series with di = ti - t0, we get:
        //  y(ti)  - y(t0)  - di y'(t0) =   di^2 / h^2 s2 + ... +   di^k     / h^k sk + O(h^(k+1))
        //  y'(ti) - y'(t0)             = 2 di   / h^2 s2 + ... + k di^(k-1) / h^k sk + O(h^k)
        // we write these relations for i = 1 to i= n-1 as a set of 2(n-1) linear
        // equations depending on the Nordsieck vector [s2 ... sk]
        __CLR4_4_1po0po0lb90p9e2.R.inc(33310);final double[][] a     = new double[2 * (y.length - 1)][c1.length];
        __CLR4_4_1po0po0lb90p9e2.R.inc(33311);final double[][] b     = new double[2 * (y.length - 1)][y[0].length];
        __CLR4_4_1po0po0lb90p9e2.R.inc(33312);final double[]   y0    = y[0];
        __CLR4_4_1po0po0lb90p9e2.R.inc(33313);final double[]   yDot0 = yDot[0];
        __CLR4_4_1po0po0lb90p9e2.R.inc(33314);for (int i = 1; (((i < y.length)&&(__CLR4_4_1po0po0lb90p9e2.R.iget(33315)!=0|true))||(__CLR4_4_1po0po0lb90p9e2.R.iget(33316)==0&false)); ++i) {{

            __CLR4_4_1po0po0lb90p9e2.R.inc(33317);final double di    = t[i] - t[0];
            __CLR4_4_1po0po0lb90p9e2.R.inc(33318);final double ratio = di / h;
            __CLR4_4_1po0po0lb90p9e2.R.inc(33319);double dikM1Ohk    =  1 / h;

            // linear coefficients of equations
            // y(ti) - y(t0) - di y'(t0) and y'(ti) - y'(t0)
            __CLR4_4_1po0po0lb90p9e2.R.inc(33320);final double[] aI    = a[2 * i - 2];
            __CLR4_4_1po0po0lb90p9e2.R.inc(33321);final double[] aDotI = a[2 * i - 1];
            __CLR4_4_1po0po0lb90p9e2.R.inc(33322);for (int j = 0; (((j < aI.length)&&(__CLR4_4_1po0po0lb90p9e2.R.iget(33323)!=0|true))||(__CLR4_4_1po0po0lb90p9e2.R.iget(33324)==0&false)); ++j) {{
                __CLR4_4_1po0po0lb90p9e2.R.inc(33325);dikM1Ohk *= ratio;
                __CLR4_4_1po0po0lb90p9e2.R.inc(33326);aI[j]     = di      * dikM1Ohk;
                __CLR4_4_1po0po0lb90p9e2.R.inc(33327);aDotI[j]  = (j + 2) * dikM1Ohk;
            }

            // expected value of the previous equations
            }__CLR4_4_1po0po0lb90p9e2.R.inc(33328);final double[] yI    = y[i];
            __CLR4_4_1po0po0lb90p9e2.R.inc(33329);final double[] yDotI = yDot[i];
            __CLR4_4_1po0po0lb90p9e2.R.inc(33330);final double[] bI    = b[2 * i - 2];
            __CLR4_4_1po0po0lb90p9e2.R.inc(33331);final double[] bDotI = b[2 * i - 1];
            __CLR4_4_1po0po0lb90p9e2.R.inc(33332);for (int j = 0; (((j < yI.length)&&(__CLR4_4_1po0po0lb90p9e2.R.iget(33333)!=0|true))||(__CLR4_4_1po0po0lb90p9e2.R.iget(33334)==0&false)); ++j) {{
                __CLR4_4_1po0po0lb90p9e2.R.inc(33335);bI[j]    = yI[j] - y0[j] - di * yDot0[j];
                __CLR4_4_1po0po0lb90p9e2.R.inc(33336);bDotI[j] = yDotI[j] - yDot0[j];
            }

        }}

        // solve the rectangular system in the least square sense
        // to get the best estimate of the Nordsieck vector [s2 ... sk]
        }__CLR4_4_1po0po0lb90p9e2.R.inc(33337);QRDecomposition decomposition;
        __CLR4_4_1po0po0lb90p9e2.R.inc(33338);decomposition = new QRDecomposition(new Array2DRowRealMatrix(a, false));
        __CLR4_4_1po0po0lb90p9e2.R.inc(33339);RealMatrix x = decomposition.getSolver().solve(new Array2DRowRealMatrix(b, false));
        __CLR4_4_1po0po0lb90p9e2.R.inc(33340);return new Array2DRowRealMatrix(x.getData(), false);
    }finally{__CLR4_4_1po0po0lb90p9e2.R.flushNeeded();}}

    /** Update the high order scaled derivatives for Adams integrators (phase 1).
     * <p>The complete update of high order derivatives has a form similar to:
     * <pre>
     * r<sub>n+1</sub> = (s<sub>1</sub>(n) - s<sub>1</sub>(n+1)) P<sup>-1</sup> u + P<sup>-1</sup> A P r<sub>n</sub>
     * </pre>
     * this method computes the P<sup>-1</sup> A P r<sub>n</sub> part.</p>
     * @param highOrder high order scaled derivatives
     * (h<sup>2</sup>/2 y'', ... h<sup>k</sup>/k! y(k))
     * @return updated high order derivatives
     * @see #updateHighOrderDerivativesPhase2(double[], double[], Array2DRowRealMatrix)
     */
    public Array2DRowRealMatrix updateHighOrderDerivativesPhase1(final Array2DRowRealMatrix highOrder) {try{__CLR4_4_1po0po0lb90p9e2.R.inc(33341);
        __CLR4_4_1po0po0lb90p9e2.R.inc(33342);return update.multiply(highOrder);
    }finally{__CLR4_4_1po0po0lb90p9e2.R.flushNeeded();}}

    /** Update the high order scaled derivatives Adams integrators (phase 2).
     * <p>The complete update of high order derivatives has a form similar to:
     * <pre>
     * r<sub>n+1</sub> = (s<sub>1</sub>(n) - s<sub>1</sub>(n+1)) P<sup>-1</sup> u + P<sup>-1</sup> A P r<sub>n</sub>
     * </pre>
     * this method computes the (s<sub>1</sub>(n) - s<sub>1</sub>(n+1)) P<sup>-1</sup> u part.</p>
     * <p>Phase 1 of the update must already have been performed.</p>
     * @param start first order scaled derivatives at step start
     * @param end first order scaled derivatives at step end
     * @param highOrder high order scaled derivatives, will be modified
     * (h<sup>2</sup>/2 y'', ... h<sup>k</sup>/k! y(k))
     * @see #updateHighOrderDerivativesPhase1(Array2DRowRealMatrix)
     */
    public void updateHighOrderDerivativesPhase2(final double[] start,
                                                 final double[] end,
                                                 final Array2DRowRealMatrix highOrder) {try{__CLR4_4_1po0po0lb90p9e2.R.inc(33343);
        __CLR4_4_1po0po0lb90p9e2.R.inc(33344);final double[][] data = highOrder.getDataRef();
        __CLR4_4_1po0po0lb90p9e2.R.inc(33345);for (int i = 0; (((i < data.length)&&(__CLR4_4_1po0po0lb90p9e2.R.iget(33346)!=0|true))||(__CLR4_4_1po0po0lb90p9e2.R.iget(33347)==0&false)); ++i) {{
            __CLR4_4_1po0po0lb90p9e2.R.inc(33348);final double[] dataI = data[i];
            __CLR4_4_1po0po0lb90p9e2.R.inc(33349);final double c1I = c1[i];
            __CLR4_4_1po0po0lb90p9e2.R.inc(33350);for (int j = 0; (((j < dataI.length)&&(__CLR4_4_1po0po0lb90p9e2.R.iget(33351)!=0|true))||(__CLR4_4_1po0po0lb90p9e2.R.iget(33352)==0&false)); ++j) {{
                __CLR4_4_1po0po0lb90p9e2.R.inc(33353);dataI[j] += c1I * (start[j] - end[j]);
            }
        }}
    }}finally{__CLR4_4_1po0po0lb90p9e2.R.flushNeeded();}}

}
