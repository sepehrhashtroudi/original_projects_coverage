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
package org.apache.commons.math3.analysis.solvers;

import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.util.FastMath;

/**
 * This class implements the <a href="http://mathworld.wolfram.com/MullersMethod.html">
 * Muller's Method</a> for root finding of real univariate functions. For
 * reference, see <b>Elementary Numerical Analysis</b>, ISBN 0070124477,
 * chapter 3.
 * <p>
 * Muller's method applies to both real and complex functions, but here we
 * restrict ourselves to real functions.
 * This class differs from {@link MullerSolver} in the way it avoids complex
 * operations.</p>
 * Except for the initial [min, max], it does not require bracketing
 * condition, e.g. f(x0), f(x1), f(x2) can have the same sign. If complex
 * number arises in the computation, we simply use its modulus as real
 * approximation.</p>
 * <p>
 * Because the interval may not be bracketing, bisection alternative is
 * not applicable here. However in practice our treatment usually works
 * well, especially near real zeroes where the imaginary part of complex
 * approximation is often negligible.</p>
 * <p>
 * The formulas here do not use divided differences directly.</p>
 *
 * @version $Id$
 * @since 1.2
 * @see MullerSolver
 */
public class MullerSolver2 extends AbstractUnivariateSolver {public static class __CLR4_4_14j74j7lb90p75o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,5947,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Default absolute accuracy. */
    private static final double DEFAULT_ABSOLUTE_ACCURACY = 1e-6;

    /**
     * Construct a solver with default accuracy (1e-6).
     */
    public MullerSolver2() {
        this(DEFAULT_ABSOLUTE_ACCURACY);__CLR4_4_14j74j7lb90p75o.R.inc(5876);try{__CLR4_4_14j74j7lb90p75o.R.inc(5875);
    }finally{__CLR4_4_14j74j7lb90p75o.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param absoluteAccuracy Absolute accuracy.
     */
    public MullerSolver2(double absoluteAccuracy) {
        super(absoluteAccuracy);__CLR4_4_14j74j7lb90p75o.R.inc(5878);try{__CLR4_4_14j74j7lb90p75o.R.inc(5877);
    }finally{__CLR4_4_14j74j7lb90p75o.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     */
    public MullerSolver2(double relativeAccuracy,
                        double absoluteAccuracy) {
        super(relativeAccuracy, absoluteAccuracy);__CLR4_4_14j74j7lb90p75o.R.inc(5880);try{__CLR4_4_14j74j7lb90p75o.R.inc(5879);
    }finally{__CLR4_4_14j74j7lb90p75o.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    protected double doSolve()
        throws TooManyEvaluationsException,
               NumberIsTooLargeException,
               NoBracketingException {try{__CLR4_4_14j74j7lb90p75o.R.inc(5881);
        __CLR4_4_14j74j7lb90p75o.R.inc(5882);final double min = getMin();
        __CLR4_4_14j74j7lb90p75o.R.inc(5883);final double max = getMax();

        __CLR4_4_14j74j7lb90p75o.R.inc(5884);verifyInterval(min, max);

        __CLR4_4_14j74j7lb90p75o.R.inc(5885);final double relativeAccuracy = getRelativeAccuracy();
        __CLR4_4_14j74j7lb90p75o.R.inc(5886);final double absoluteAccuracy = getAbsoluteAccuracy();
        __CLR4_4_14j74j7lb90p75o.R.inc(5887);final double functionValueAccuracy = getFunctionValueAccuracy();

        // x2 is the last root approximation
        // x is the new approximation and new x2 for next round
        // x0 < x1 < x2 does not hold here

        __CLR4_4_14j74j7lb90p75o.R.inc(5888);double x0 = min;
        __CLR4_4_14j74j7lb90p75o.R.inc(5889);double y0 = computeObjectiveValue(x0);
        __CLR4_4_14j74j7lb90p75o.R.inc(5890);if ((((FastMath.abs(y0) < functionValueAccuracy)&&(__CLR4_4_14j74j7lb90p75o.R.iget(5891)!=0|true))||(__CLR4_4_14j74j7lb90p75o.R.iget(5892)==0&false))) {{
            __CLR4_4_14j74j7lb90p75o.R.inc(5893);return x0;
        }
        }__CLR4_4_14j74j7lb90p75o.R.inc(5894);double x1 = max;
        __CLR4_4_14j74j7lb90p75o.R.inc(5895);double y1 = computeObjectiveValue(x1);
        __CLR4_4_14j74j7lb90p75o.R.inc(5896);if ((((FastMath.abs(y1) < functionValueAccuracy)&&(__CLR4_4_14j74j7lb90p75o.R.iget(5897)!=0|true))||(__CLR4_4_14j74j7lb90p75o.R.iget(5898)==0&false))) {{
            __CLR4_4_14j74j7lb90p75o.R.inc(5899);return x1;
        }

        }__CLR4_4_14j74j7lb90p75o.R.inc(5900);if((((y0 * y1 > 0)&&(__CLR4_4_14j74j7lb90p75o.R.iget(5901)!=0|true))||(__CLR4_4_14j74j7lb90p75o.R.iget(5902)==0&false))) {{
            __CLR4_4_14j74j7lb90p75o.R.inc(5903);throw new NoBracketingException(x0, x1, y0, y1);
        }

        }__CLR4_4_14j74j7lb90p75o.R.inc(5904);double x2 = 0.5 * (x0 + x1);
        __CLR4_4_14j74j7lb90p75o.R.inc(5905);double y2 = computeObjectiveValue(x2);

        __CLR4_4_14j74j7lb90p75o.R.inc(5906);double oldx = Double.POSITIVE_INFINITY;
        __CLR4_4_14j74j7lb90p75o.R.inc(5907);while (true) {{
            // quadratic interpolation through x0, x1, x2
            __CLR4_4_14j74j7lb90p75o.R.inc(5908);final double q = (x2 - x1) / (x1 - x0);
            __CLR4_4_14j74j7lb90p75o.R.inc(5909);final double a = q * (y2 - (1 + q) * y1 + q * y0);
            __CLR4_4_14j74j7lb90p75o.R.inc(5910);final double b = (2 * q + 1) * y2 - (1 + q) * (1 + q) * y1 + q * q * y0;
            __CLR4_4_14j74j7lb90p75o.R.inc(5911);final double c = (1 + q) * y2;
            __CLR4_4_14j74j7lb90p75o.R.inc(5912);final double delta = b * b - 4 * a * c;
            __CLR4_4_14j74j7lb90p75o.R.inc(5913);double x;
            __CLR4_4_14j74j7lb90p75o.R.inc(5914);final double denominator;
            __CLR4_4_14j74j7lb90p75o.R.inc(5915);if ((((delta >= 0.0)&&(__CLR4_4_14j74j7lb90p75o.R.iget(5916)!=0|true))||(__CLR4_4_14j74j7lb90p75o.R.iget(5917)==0&false))) {{
                // choose a denominator larger in magnitude
                __CLR4_4_14j74j7lb90p75o.R.inc(5918);double dplus = b + FastMath.sqrt(delta);
                __CLR4_4_14j74j7lb90p75o.R.inc(5919);double dminus = b - FastMath.sqrt(delta);
                __CLR4_4_14j74j7lb90p75o.R.inc(5920);denominator = (((FastMath.abs(dplus) > FastMath.abs(dminus) )&&(__CLR4_4_14j74j7lb90p75o.R.iget(5921)!=0|true))||(__CLR4_4_14j74j7lb90p75o.R.iget(5922)==0&false))? dplus : dminus;
            } }else {{
                // take the modulus of (B +/- FastMath.sqrt(delta))
                __CLR4_4_14j74j7lb90p75o.R.inc(5923);denominator = FastMath.sqrt(b * b - delta);
            }
            }__CLR4_4_14j74j7lb90p75o.R.inc(5924);if ((((denominator != 0)&&(__CLR4_4_14j74j7lb90p75o.R.iget(5925)!=0|true))||(__CLR4_4_14j74j7lb90p75o.R.iget(5926)==0&false))) {{
                __CLR4_4_14j74j7lb90p75o.R.inc(5927);x = x2 - 2.0 * c * (x2 - x1) / denominator;
                // perturb x if it exactly coincides with x1 or x2
                // the equality tests here are intentional
                __CLR4_4_14j74j7lb90p75o.R.inc(5928);while ((((x == x1 || x == x2)&&(__CLR4_4_14j74j7lb90p75o.R.iget(5929)!=0|true))||(__CLR4_4_14j74j7lb90p75o.R.iget(5930)==0&false))) {{
                    __CLR4_4_14j74j7lb90p75o.R.inc(5931);x += absoluteAccuracy;
                }
            }} }else {{
                // extremely rare case, get a random number to skip it
                __CLR4_4_14j74j7lb90p75o.R.inc(5932);x = min + FastMath.random() * (max - min);
                __CLR4_4_14j74j7lb90p75o.R.inc(5933);oldx = Double.POSITIVE_INFINITY;
            }
            }__CLR4_4_14j74j7lb90p75o.R.inc(5934);final double y = computeObjectiveValue(x);

            // check for convergence
            __CLR4_4_14j74j7lb90p75o.R.inc(5935);final double tolerance = FastMath.max(relativeAccuracy * FastMath.abs(x), absoluteAccuracy);
            __CLR4_4_14j74j7lb90p75o.R.inc(5936);if ((((FastMath.abs(x - oldx) <= tolerance ||
                FastMath.abs(y) <= functionValueAccuracy)&&(__CLR4_4_14j74j7lb90p75o.R.iget(5937)!=0|true))||(__CLR4_4_14j74j7lb90p75o.R.iget(5938)==0&false))) {{
                __CLR4_4_14j74j7lb90p75o.R.inc(5939);return x;
            }

            // prepare the next iteration
            }__CLR4_4_14j74j7lb90p75o.R.inc(5940);x0 = x1;
            __CLR4_4_14j74j7lb90p75o.R.inc(5941);y0 = y1;
            __CLR4_4_14j74j7lb90p75o.R.inc(5942);x1 = x2;
            __CLR4_4_14j74j7lb90p75o.R.inc(5943);y1 = y2;
            __CLR4_4_14j74j7lb90p75o.R.inc(5944);x2 = x;
            __CLR4_4_14j74j7lb90p75o.R.inc(5945);y2 = y;
            __CLR4_4_14j74j7lb90p75o.R.inc(5946);oldx = x;
        }
    }}finally{__CLR4_4_14j74j7lb90p75o.R.flushNeeded();}}
}
