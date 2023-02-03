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
package org.apache.commons.math3.analysis.differentiation;

import java.io.Serializable;

import org.apache.commons.math3.RealFieldElement;
import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.MathUtils;

/** Class representing both the value and the differentials of a function.
 * <p>This class is the workhorse of the differentiation package.</p>
 * <p>This class is an implementation of the extension to Rall's
 * numbers described in Dan Kalman's paper <a
 * href="http://www1.american.edu/cas/mathstat/People/kalman/pdffiles/mmgautodiff.pdf">Doubly
 * Recursive Multivariate Automatic Differentiation</a>, Mathematics Magazine, vol. 75,
 * no. 3, June 2002.</p>. Rall's numbers are an extension to the real numbers used
 * throughout mathematical expressions; they hold the derivative together with the
 * value of a function. Dan Kalman's derivative structures hold all partial derivatives
 * up to any specified order, with respect to any number of free parameters. Rall's
 * numbers therefore can be seen as derivative structures for order one derivative and
 * one free parameter, and real numbers can be seen as derivative structures with zero
 * order derivative and no free parameters.</p>
 * <p>{@link DerivativeStructure} instances can be used directly thanks to
 * the arithmetic operators to the mathematical functions provided as
 * methods by this class (+, -, *, /, %, sin, cos ...).</p>
 * <p>Implementing complex expressions by hand using these classes is
 * a tedious and error-prone task but has the advantage of having no limitation
 * on the derivation order despite no requiring users to compute the derivatives by
 * themselves. Implementing complex expression can also be done by developing computation
 * code using standard primitive double values and to use {@link
 * UnivariateFunctionDifferentiator differentiators} to create the {@link
 * DerivativeStructure}-based instances. This method is simpler but may be limited in
 * the accuracy and derivation orders and may be computationally intensive (this is
 * typically the case for {@link FiniteDifferencesDifferentiator finite differences
 * differentiator}.</p>
 * <p>Instances of this class are guaranteed to be immutable.</p>
 * @see DSCompiler
 * @version $Id$
 * @since 3.1
 */
public class DerivativeStructure implements RealFieldElement<DerivativeStructure>, Serializable {public static class __CLR4_4_1xoxolb90p6dy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,1623,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable UID. */
    private static final long serialVersionUID = 20120730L;

    /** Compiler for the current dimensions. */
    private transient DSCompiler compiler;

    /** Combined array holding all values. */
    private final double[] data;

    /** Build an instance with all values and derivatives set to 0.
     * @param compiler compiler to use for computation
     */
    private DerivativeStructure(final DSCompiler compiler) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1212);
        __CLR4_4_1xoxolb90p6dy.R.inc(1213);this.compiler = compiler;
        __CLR4_4_1xoxolb90p6dy.R.inc(1214);this.data     = new double[compiler.getSize()];
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Build an instance with all values and derivatives set to 0.
     * @param parameters number of free parameters
     * @param order derivation order
     * @throws NumberIsTooLargeException if order is too large
     */
    public DerivativeStructure(final int parameters, final int order)
        throws NumberIsTooLargeException {
        this(DSCompiler.getCompiler(parameters, order));__CLR4_4_1xoxolb90p6dy.R.inc(1216);try{__CLR4_4_1xoxolb90p6dy.R.inc(1215);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Build an instance representing a constant value.
     * @param parameters number of free parameters
     * @param order derivation order
     * @param value value of the constant
     * @throws NumberIsTooLargeException if order is too large
     * @see #DerivativeStructure(int, int, int, double)
     */
    public DerivativeStructure(final int parameters, final int order, final double value)
        throws NumberIsTooLargeException {
        this(parameters, order);__CLR4_4_1xoxolb90p6dy.R.inc(1218);try{__CLR4_4_1xoxolb90p6dy.R.inc(1217);
        __CLR4_4_1xoxolb90p6dy.R.inc(1219);this.data[0] = value;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Build an instance representing a variable.
     * <p>Instances built using this constructor are considered
     * to be the free variables with respect to which differentials
     * are computed. As such, their differential with respect to
     * themselves is +1.</p>
     * @param parameters number of free parameters
     * @param order derivation order
     * @param index index of the variable (from 0 to {@code parameters - 1})
     * @param value value of the variable
     * @exception NumberIsTooLargeException if {@code index >= parameters}.
     * @see #DerivativeStructure(int, int, double)
     */
    public DerivativeStructure(final int parameters, final int order,
                               final int index, final double value)
        throws NumberIsTooLargeException {
        this(parameters, order, value);__CLR4_4_1xoxolb90p6dy.R.inc(1221);try{__CLR4_4_1xoxolb90p6dy.R.inc(1220);

        __CLR4_4_1xoxolb90p6dy.R.inc(1222);if ((((index >= parameters)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1223)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1224)==0&false))) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1225);throw new NumberIsTooLargeException(index, parameters, false);
        }

        }__CLR4_4_1xoxolb90p6dy.R.inc(1226);if ((((order > 0)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1227)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1228)==0&false))) {{
            // the derivative of the variable with respect to itself is 1.
            __CLR4_4_1xoxolb90p6dy.R.inc(1229);data[DSCompiler.getCompiler(index, order).getSize()] = 1.0;
        }

    }}finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Linear combination constructor.
     * The derivative structure built will be a1 * ds1 + a2 * ds2
     * @param a1 first scale factor
     * @param ds1 first base (unscaled) derivative structure
     * @param a2 second scale factor
     * @param ds2 second base (unscaled) derivative structure
     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent
     */
    public DerivativeStructure(final double a1, final DerivativeStructure ds1,
                               final double a2, final DerivativeStructure ds2)
        throws DimensionMismatchException {
        this(ds1.compiler);__CLR4_4_1xoxolb90p6dy.R.inc(1231);try{__CLR4_4_1xoxolb90p6dy.R.inc(1230);
        __CLR4_4_1xoxolb90p6dy.R.inc(1232);compiler.checkCompatibility(ds2.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1233);compiler.linearCombination(a1, ds1.data, 0, a2, ds2.data, 0, data, 0);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Linear combination constructor.
     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3
     * @param a1 first scale factor
     * @param ds1 first base (unscaled) derivative structure
     * @param a2 second scale factor
     * @param ds2 second base (unscaled) derivative structure
     * @param a3 third scale factor
     * @param ds3 third base (unscaled) derivative structure
     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent
     */
    public DerivativeStructure(final double a1, final DerivativeStructure ds1,
                               final double a2, final DerivativeStructure ds2,
                               final double a3, final DerivativeStructure ds3)
        throws DimensionMismatchException {
        this(ds1.compiler);__CLR4_4_1xoxolb90p6dy.R.inc(1235);try{__CLR4_4_1xoxolb90p6dy.R.inc(1234);
        __CLR4_4_1xoxolb90p6dy.R.inc(1236);compiler.checkCompatibility(ds2.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1237);compiler.checkCompatibility(ds3.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1238);compiler.linearCombination(a1, ds1.data, 0, a2, ds2.data, 0, a3, ds3.data, 0, data, 0);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Linear combination constructor.
     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3 + a4 * ds4
     * @param a1 first scale factor
     * @param ds1 first base (unscaled) derivative structure
     * @param a2 second scale factor
     * @param ds2 second base (unscaled) derivative structure
     * @param a3 third scale factor
     * @param ds3 third base (unscaled) derivative structure
     * @param a4 fourth scale factor
     * @param ds4 fourth base (unscaled) derivative structure
     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent
     */
    public DerivativeStructure(final double a1, final DerivativeStructure ds1,
                               final double a2, final DerivativeStructure ds2,
                               final double a3, final DerivativeStructure ds3,
                               final double a4, final DerivativeStructure ds4)
        throws DimensionMismatchException {
        this(ds1.compiler);__CLR4_4_1xoxolb90p6dy.R.inc(1240);try{__CLR4_4_1xoxolb90p6dy.R.inc(1239);
        __CLR4_4_1xoxolb90p6dy.R.inc(1241);compiler.checkCompatibility(ds2.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1242);compiler.checkCompatibility(ds3.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1243);compiler.checkCompatibility(ds4.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1244);compiler.linearCombination(a1, ds1.data, 0, a2, ds2.data, 0,
                                   a3, ds3.data, 0, a4, ds4.data, 0,
                                   data, 0);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Build an instance from all its derivatives.
     * @param parameters number of free parameters
     * @param order derivation order
     * @param derivatives derivatives sorted according to
     * {@link DSCompiler#getPartialDerivativeIndex(int...)}
     * @exception DimensionMismatchException if derivatives array does not match the
     * {@link DSCompiler#getSize() size} expected by the compiler
     * @throws NumberIsTooLargeException if order is too large
     * @see #getAllDerivatives()
     */
    public DerivativeStructure(final int parameters, final int order, final double ... derivatives)
        throws DimensionMismatchException, NumberIsTooLargeException {
        this(parameters, order);__CLR4_4_1xoxolb90p6dy.R.inc(1246);try{__CLR4_4_1xoxolb90p6dy.R.inc(1245);
        __CLR4_4_1xoxolb90p6dy.R.inc(1247);if ((((derivatives.length != data.length)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1248)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1249)==0&false))) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1250);throw new DimensionMismatchException(derivatives.length, data.length);
        }
        }__CLR4_4_1xoxolb90p6dy.R.inc(1251);System.arraycopy(derivatives, 0, data, 0, data.length);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Copy constructor.
     * @param ds instance to copy
     */
    private DerivativeStructure(final DerivativeStructure ds) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1252);
        __CLR4_4_1xoxolb90p6dy.R.inc(1253);this.compiler = ds.compiler;
        __CLR4_4_1xoxolb90p6dy.R.inc(1254);this.data     = ds.data.clone();
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Get the number of free parameters.
     * @return number of free parameters
     */
    public int getFreeParameters() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1255);
        __CLR4_4_1xoxolb90p6dy.R.inc(1256);return compiler.getFreeParameters();
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Get the derivation order.
     * @return derivation order
     */
    public int getOrder() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1257);
        __CLR4_4_1xoxolb90p6dy.R.inc(1258);return compiler.getOrder();
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Create a constant compatible with instance order and number of parameters.
     * <p>
     * This method is a convenience factory method, it simply calls
     * {@code new DerivativeStructure(getFreeParameters(), getOrder(), c)}
     * </p>
     * @param c value of the constant
     * @return a constant compatible with instance order and number of parameters
     * @see #DerivativeStructure(int, int, double)
     * @since 3.3
     */
    public DerivativeStructure createConstant(final double c) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1259);
        __CLR4_4_1xoxolb90p6dy.R.inc(1260);return new DerivativeStructure(getFreeParameters(), getOrder(), c);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public double getReal() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1261);
        __CLR4_4_1xoxolb90p6dy.R.inc(1262);return data[0];
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Get the value part of the derivative structure.
     * @return value part of the derivative structure
     * @see #getPartialDerivative(int...)
     */
    public double getValue() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1263);
        __CLR4_4_1xoxolb90p6dy.R.inc(1264);return data[0];
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Get a partial derivative.
     * @param orders derivation orders with respect to each variable (if all orders are 0,
     * the value is returned)
     * @return partial derivative
     * @see #getValue()
     * @exception DimensionMismatchException if the numbers of variables does not
     * match the instance
     * @exception NumberIsTooLargeException if sum of derivation orders is larger
     * than the instance limits
     */
    public double getPartialDerivative(final int ... orders)
        throws DimensionMismatchException, NumberIsTooLargeException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1265);
        __CLR4_4_1xoxolb90p6dy.R.inc(1266);return data[compiler.getPartialDerivativeIndex(orders)];
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Get all partial derivatives.
     * @return a fresh copy of partial derivatives, in an array sorted according to
     * {@link DSCompiler#getPartialDerivativeIndex(int...)}
     */
    public double[] getAllDerivatives() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1267);
        __CLR4_4_1xoxolb90p6dy.R.inc(1268);return data.clone();
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure add(final double a) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1269);
        __CLR4_4_1xoxolb90p6dy.R.inc(1270);final DerivativeStructure ds = new DerivativeStructure(this);
        __CLR4_4_1xoxolb90p6dy.R.inc(1271);ds.data[0] += a;
        __CLR4_4_1xoxolb90p6dy.R.inc(1272);return ds;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     */
    public DerivativeStructure add(final DerivativeStructure a)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1273);
        __CLR4_4_1xoxolb90p6dy.R.inc(1274);compiler.checkCompatibility(a.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1275);final DerivativeStructure ds = new DerivativeStructure(this);
        __CLR4_4_1xoxolb90p6dy.R.inc(1276);compiler.add(data, 0, a.data, 0, ds.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1277);return ds;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure subtract(final double a) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1278);
        __CLR4_4_1xoxolb90p6dy.R.inc(1279);return add(-a);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     */
    public DerivativeStructure subtract(final DerivativeStructure a)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1280);
        __CLR4_4_1xoxolb90p6dy.R.inc(1281);compiler.checkCompatibility(a.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1282);final DerivativeStructure ds = new DerivativeStructure(this);
        __CLR4_4_1xoxolb90p6dy.R.inc(1283);compiler.subtract(data, 0, a.data, 0, ds.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1284);return ds;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc} */
    public DerivativeStructure multiply(final int n) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1285);
        __CLR4_4_1xoxolb90p6dy.R.inc(1286);return multiply((double) n);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure multiply(final double a) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1287);
        __CLR4_4_1xoxolb90p6dy.R.inc(1288);final DerivativeStructure ds = new DerivativeStructure(this);
        __CLR4_4_1xoxolb90p6dy.R.inc(1289);for (int i = 0; (((i < ds.data.length)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1290)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1291)==0&false)); ++i) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1292);ds.data[i] *= a;
        }
        }__CLR4_4_1xoxolb90p6dy.R.inc(1293);return ds;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     */
    public DerivativeStructure multiply(final DerivativeStructure a)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1294);
        __CLR4_4_1xoxolb90p6dy.R.inc(1295);compiler.checkCompatibility(a.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1296);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1297);compiler.multiply(data, 0, a.data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1298);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure divide(final double a) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1299);
        __CLR4_4_1xoxolb90p6dy.R.inc(1300);final DerivativeStructure ds = new DerivativeStructure(this);
        __CLR4_4_1xoxolb90p6dy.R.inc(1301);for (int i = 0; (((i < ds.data.length)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1302)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1303)==0&false)); ++i) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1304);ds.data[i] /= a;
        }
        }__CLR4_4_1xoxolb90p6dy.R.inc(1305);return ds;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     */
    public DerivativeStructure divide(final DerivativeStructure a)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1306);
        __CLR4_4_1xoxolb90p6dy.R.inc(1307);compiler.checkCompatibility(a.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1308);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1309);compiler.divide(data, 0, a.data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1310);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc} */
    public DerivativeStructure remainder(final double a) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1311);
        __CLR4_4_1xoxolb90p6dy.R.inc(1312);final DerivativeStructure ds = new DerivativeStructure(this);
        __CLR4_4_1xoxolb90p6dy.R.inc(1313);ds.data[0] = FastMath.IEEEremainder(ds.data[0], a);
        __CLR4_4_1xoxolb90p6dy.R.inc(1314);return ds;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     * @since 3.2
     */
    public DerivativeStructure remainder(final DerivativeStructure a)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1315);
        __CLR4_4_1xoxolb90p6dy.R.inc(1316);compiler.checkCompatibility(a.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1317);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1318);compiler.remainder(data, 0, a.data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1319);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc} */
    public DerivativeStructure negate() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1320);
        __CLR4_4_1xoxolb90p6dy.R.inc(1321);final DerivativeStructure ds = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1322);for (int i = 0; (((i < ds.data.length)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1323)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1324)==0&false)); ++i) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1325);ds.data[i] = -data[i];
        }
        }__CLR4_4_1xoxolb90p6dy.R.inc(1326);return ds;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure abs() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1327);
        __CLR4_4_1xoxolb90p6dy.R.inc(1328);if ((((Double.doubleToLongBits(data[0]) < 0)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1329)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1330)==0&false))) {{
            // we use the bits representation to also handle -0.0
            __CLR4_4_1xoxolb90p6dy.R.inc(1331);return negate();
        } }else {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1332);return this;
        }
    }}finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure ceil() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1333);
        __CLR4_4_1xoxolb90p6dy.R.inc(1334);return new DerivativeStructure(compiler.getFreeParameters(),
                                       compiler.getOrder(),
                                       FastMath.ceil(data[0]));
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure floor() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1335);
        __CLR4_4_1xoxolb90p6dy.R.inc(1336);return new DerivativeStructure(compiler.getFreeParameters(),
                                       compiler.getOrder(),
                                       FastMath.floor(data[0]));
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure rint() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1337);
        __CLR4_4_1xoxolb90p6dy.R.inc(1338);return new DerivativeStructure(compiler.getFreeParameters(),
                                       compiler.getOrder(),
                                       FastMath.rint(data[0]));
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc} */
    public long round() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1339);
        __CLR4_4_1xoxolb90p6dy.R.inc(1340);return FastMath.round(data[0]);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure signum() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1341);
        __CLR4_4_1xoxolb90p6dy.R.inc(1342);return new DerivativeStructure(compiler.getFreeParameters(),
                                       compiler.getOrder(),
                                       FastMath.signum(data[0]));
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure copySign(final DerivativeStructure sign){try{__CLR4_4_1xoxolb90p6dy.R.inc(1343);
        __CLR4_4_1xoxolb90p6dy.R.inc(1344);long m = Double.doubleToLongBits(data[0]);
        __CLR4_4_1xoxolb90p6dy.R.inc(1345);long s = Double.doubleToLongBits(sign.data[0]);
        __CLR4_4_1xoxolb90p6dy.R.inc(1346);if (((((m >= 0 && s >= 0) || (m < 0 && s < 0))&&(__CLR4_4_1xoxolb90p6dy.R.iget(1347)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1348)==0&false))) {{ // Sign is currently OK
            __CLR4_4_1xoxolb90p6dy.R.inc(1349);return this;
        }
        }__CLR4_4_1xoxolb90p6dy.R.inc(1350);return negate(); // flip sign
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure copySign(final double sign) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1351);
        __CLR4_4_1xoxolb90p6dy.R.inc(1352);long m = Double.doubleToLongBits(data[0]);
        __CLR4_4_1xoxolb90p6dy.R.inc(1353);long s = Double.doubleToLongBits(sign);
        __CLR4_4_1xoxolb90p6dy.R.inc(1354);if (((((m >= 0 && s >= 0) || (m < 0 && s < 0))&&(__CLR4_4_1xoxolb90p6dy.R.iget(1355)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1356)==0&false))) {{ // Sign is currently OK
            __CLR4_4_1xoxolb90p6dy.R.inc(1357);return this;
        }
        }__CLR4_4_1xoxolb90p6dy.R.inc(1358);return negate(); // flip sign
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /**
     * Return the exponent of the instance value, removing the bias.
     * <p>
     * For double numbers of the form 2<sup>x</sup>, the unbiased
     * exponent is exactly x.
     * </p>
     * @return exponent for instance in IEEE754 representation, without bias
     */
    public int getExponent() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1359);
        __CLR4_4_1xoxolb90p6dy.R.inc(1360);return FastMath.getExponent(data[0]);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure scalb(final int n) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1361);
        __CLR4_4_1xoxolb90p6dy.R.inc(1362);final DerivativeStructure ds = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1363);for (int i = 0; (((i < ds.data.length)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1364)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1365)==0&false)); ++i) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1366);ds.data[i] = FastMath.scalb(data[i], n);
        }
        }__CLR4_4_1xoxolb90p6dy.R.inc(1367);return ds;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     * @since 3.2
     */
    public DerivativeStructure hypot(final DerivativeStructure y)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1368);

        __CLR4_4_1xoxolb90p6dy.R.inc(1369);compiler.checkCompatibility(y.compiler);

        __CLR4_4_1xoxolb90p6dy.R.inc(1370);if ((((Double.isInfinite(data[0]) || Double.isInfinite(y.data[0]))&&(__CLR4_4_1xoxolb90p6dy.R.iget(1371)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1372)==0&false))) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1373);return new DerivativeStructure(compiler.getFreeParameters(),
                                           compiler.getFreeParameters(),
                                           Double.POSITIVE_INFINITY);
        } }else {__CLR4_4_1xoxolb90p6dy.R.inc(1374);if ((((Double.isNaN(data[0]) || Double.isNaN(y.data[0]))&&(__CLR4_4_1xoxolb90p6dy.R.iget(1375)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1376)==0&false))) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1377);return new DerivativeStructure(compiler.getFreeParameters(),
                                           compiler.getFreeParameters(),
                                           Double.NaN);
        } }else {{

            __CLR4_4_1xoxolb90p6dy.R.inc(1378);final int expX = getExponent();
            __CLR4_4_1xoxolb90p6dy.R.inc(1379);final int expY = y.getExponent();
            __CLR4_4_1xoxolb90p6dy.R.inc(1380);if ((((expX > expY + 27)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1381)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1382)==0&false))) {{
                // y is neglectible with respect to x
                __CLR4_4_1xoxolb90p6dy.R.inc(1383);return abs();
            } }else {__CLR4_4_1xoxolb90p6dy.R.inc(1384);if ((((expY > expX + 27)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1385)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1386)==0&false))) {{
                // x is neglectible with respect to y
                __CLR4_4_1xoxolb90p6dy.R.inc(1387);return y.abs();
            } }else {{

                // find an intermediate scale to avoid both overflow and underflow
                __CLR4_4_1xoxolb90p6dy.R.inc(1388);final int middleExp = (expX + expY) / 2;

                // scale parameters without losing precision
                __CLR4_4_1xoxolb90p6dy.R.inc(1389);final DerivativeStructure scaledX = scalb(-middleExp);
                __CLR4_4_1xoxolb90p6dy.R.inc(1390);final DerivativeStructure scaledY = y.scalb(-middleExp);

                // compute scaled hypotenuse
                __CLR4_4_1xoxolb90p6dy.R.inc(1391);final DerivativeStructure scaledH =
                        scaledX.multiply(scaledX).add(scaledY.multiply(scaledY)).sqrt();

                // remove scaling
                __CLR4_4_1xoxolb90p6dy.R.inc(1392);return scaledH.scalb(middleExp);

            }

        }}}
    }}}finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /**
     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}
     * - sqrt(<i>x</i><sup>2</sup>&nbsp;+<i>y</i><sup>2</sup>)<br/>
     * avoiding intermediate overflow or underflow.
     *
     * <ul>
     * <li> If either argument is infinite, then the result is positive infinity.</li>
     * <li> else, if either argument is NaN then the result is NaN.</li>
     * </ul>
     *
     * @param x a value
     * @param y a value
     * @return sqrt(<i>x</i><sup>2</sup>&nbsp;+<i>y</i><sup>2</sup>)
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     * @since 3.2
     */
    public static DerivativeStructure hypot(final DerivativeStructure x, final DerivativeStructure y)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1393);
        __CLR4_4_1xoxolb90p6dy.R.inc(1394);return x.hypot(y);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Compute composition of the instance by a univariate function.
     * @param f array of value and derivatives of the function at
     * the current point (i.e. [f({@link #getValue()}),
     * f'({@link #getValue()}), f''({@link #getValue()})...]).
     * @return f(this)
     * @exception DimensionMismatchException if the number of derivatives
     * in the array is not equal to {@link #getOrder() order} + 1
     */
    public DerivativeStructure compose(final double ... f)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1395);
        __CLR4_4_1xoxolb90p6dy.R.inc(1396);if ((((f.length != getOrder() + 1)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1397)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1398)==0&false))) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1399);throw new DimensionMismatchException(f.length, getOrder() + 1);
        }
        }__CLR4_4_1xoxolb90p6dy.R.inc(1400);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1401);compiler.compose(data, 0, f, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1402);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc} */
    public DerivativeStructure reciprocal() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1403);
        __CLR4_4_1xoxolb90p6dy.R.inc(1404);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1405);compiler.pow(data, 0, -1, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1406);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure sqrt() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1407);
        __CLR4_4_1xoxolb90p6dy.R.inc(1408);return rootN(2);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure cbrt() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1409);
        __CLR4_4_1xoxolb90p6dy.R.inc(1410);return rootN(3);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure rootN(final int n) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1411);
        __CLR4_4_1xoxolb90p6dy.R.inc(1412);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1413);compiler.rootN(data, 0, n, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1414);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Field<DerivativeStructure> getField() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1415);
        __CLR4_4_1xoxolb90p6dy.R.inc(1416);return new Field<DerivativeStructure>() {

            /** {@inheritDoc} */
            public DerivativeStructure getZero() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1417);
                __CLR4_4_1xoxolb90p6dy.R.inc(1418);return new DerivativeStructure(compiler.getFreeParameters(), compiler.getOrder(), 0.0);
            }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

            /** {@inheritDoc} */
            public DerivativeStructure getOne() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1419);
                __CLR4_4_1xoxolb90p6dy.R.inc(1420);return new DerivativeStructure(compiler.getFreeParameters(), compiler.getOrder(), 1.0);
            }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

            /** {@inheritDoc} */
            public Class<? extends FieldElement<DerivativeStructure>> getRuntimeClass() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1421);
                __CLR4_4_1xoxolb90p6dy.R.inc(1422);return DerivativeStructure.class;
            }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

        };
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Compute a<sup>x</sup> where a is a double and x a {@link DerivativeStructure}
     * @param a number to exponentiate
     * @param x power to apply
     * @return a<sup>x</sup>
     * @since 3.3
     */
    public static DerivativeStructure pow(final double a, final DerivativeStructure x) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1423);
        __CLR4_4_1xoxolb90p6dy.R.inc(1424);final DerivativeStructure result = new DerivativeStructure(x.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1425);x.compiler.pow(a, x.data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1426);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure pow(final double p) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1427);
        __CLR4_4_1xoxolb90p6dy.R.inc(1428);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1429);compiler.pow(data, 0, p, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1430);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure pow(final int n) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1431);
        __CLR4_4_1xoxolb90p6dy.R.inc(1432);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1433);compiler.pow(data, 0, n, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1434);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     * @since 3.2
     */
    public DerivativeStructure pow(final DerivativeStructure e)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1435);
        __CLR4_4_1xoxolb90p6dy.R.inc(1436);compiler.checkCompatibility(e.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1437);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1438);compiler.pow(data, 0, e.data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1439);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure exp() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1440);
        __CLR4_4_1xoxolb90p6dy.R.inc(1441);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1442);compiler.exp(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1443);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure expm1() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1444);
        __CLR4_4_1xoxolb90p6dy.R.inc(1445);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1446);compiler.expm1(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1447);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure log() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1448);
        __CLR4_4_1xoxolb90p6dy.R.inc(1449);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1450);compiler.log(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1451);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure log1p() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1452);
        __CLR4_4_1xoxolb90p6dy.R.inc(1453);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1454);compiler.log1p(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1455);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Base 10 logarithm.
     * @return base 10 logarithm of the instance
     */
    public DerivativeStructure log10() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1456);
        __CLR4_4_1xoxolb90p6dy.R.inc(1457);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1458);compiler.log10(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1459);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure cos() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1460);
        __CLR4_4_1xoxolb90p6dy.R.inc(1461);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1462);compiler.cos(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1463);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure sin() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1464);
        __CLR4_4_1xoxolb90p6dy.R.inc(1465);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1466);compiler.sin(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1467);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure tan() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1468);
        __CLR4_4_1xoxolb90p6dy.R.inc(1469);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1470);compiler.tan(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1471);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure acos() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1472);
        __CLR4_4_1xoxolb90p6dy.R.inc(1473);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1474);compiler.acos(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1475);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure asin() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1476);
        __CLR4_4_1xoxolb90p6dy.R.inc(1477);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1478);compiler.asin(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1479);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure atan() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1480);
        __CLR4_4_1xoxolb90p6dy.R.inc(1481);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1482);compiler.atan(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1483);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure atan2(final DerivativeStructure x)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1484);
        __CLR4_4_1xoxolb90p6dy.R.inc(1485);compiler.checkCompatibility(x.compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1486);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1487);compiler.atan2(data, 0, x.data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1488);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Two arguments arc tangent operation.
     * @param y first argument of the arc tangent
     * @param x second argument of the arc tangent
     * @return atan2(y, x)
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     * @since 3.2
     */
    public static DerivativeStructure atan2(final DerivativeStructure y, final DerivativeStructure x)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1489);
        __CLR4_4_1xoxolb90p6dy.R.inc(1490);return y.atan2(x);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure cosh() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1491);
        __CLR4_4_1xoxolb90p6dy.R.inc(1492);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1493);compiler.cosh(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1494);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure sinh() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1495);
        __CLR4_4_1xoxolb90p6dy.R.inc(1496);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1497);compiler.sinh(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1498);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure tanh() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1499);
        __CLR4_4_1xoxolb90p6dy.R.inc(1500);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1501);compiler.tanh(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1502);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure acosh() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1503);
        __CLR4_4_1xoxolb90p6dy.R.inc(1504);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1505);compiler.acosh(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1506);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure asinh() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1507);
        __CLR4_4_1xoxolb90p6dy.R.inc(1508);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1509);compiler.asinh(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1510);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public DerivativeStructure atanh() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1511);
        __CLR4_4_1xoxolb90p6dy.R.inc(1512);final DerivativeStructure result = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1513);compiler.atanh(data, 0, result.data, 0);
        __CLR4_4_1xoxolb90p6dy.R.inc(1514);return result;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Convert radians to degrees, with error of less than 0.5 ULP
     *  @return instance converted into degrees
     */
    public DerivativeStructure toDegrees() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1515);
        __CLR4_4_1xoxolb90p6dy.R.inc(1516);final DerivativeStructure ds = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1517);for (int i = 0; (((i < ds.data.length)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1518)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1519)==0&false)); ++i) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1520);ds.data[i] = FastMath.toDegrees(data[i]);
        }
        }__CLR4_4_1xoxolb90p6dy.R.inc(1521);return ds;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Convert degrees to radians, with error of less than 0.5 ULP
     *  @return instance converted into radians
     */
    public DerivativeStructure toRadians() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1522);
        __CLR4_4_1xoxolb90p6dy.R.inc(1523);final DerivativeStructure ds = new DerivativeStructure(compiler);
        __CLR4_4_1xoxolb90p6dy.R.inc(1524);for (int i = 0; (((i < ds.data.length)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1525)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1526)==0&false)); ++i) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1527);ds.data[i] = FastMath.toRadians(data[i]);
        }
        }__CLR4_4_1xoxolb90p6dy.R.inc(1528);return ds;
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Evaluate Taylor expansion a derivative structure.
     * @param delta parameters offsets (&Delta;x, &Delta;y, ...)
     * @return value of the Taylor expansion at x + &Delta;x, y + &Delta;y, ...
     * @throws MathArithmeticException if factorials becomes too large
     */
    public double taylor(final double ... delta) throws MathArithmeticException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1529);
        __CLR4_4_1xoxolb90p6dy.R.inc(1530);return compiler.taylor(data, 0, delta);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     * @since 3.2
     */
    public DerivativeStructure linearCombination(final DerivativeStructure[] a, final DerivativeStructure[] b)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1531);

        // compute an accurate value, taking care of cancellations
        __CLR4_4_1xoxolb90p6dy.R.inc(1532);final double[] aDouble = new double[a.length];
        __CLR4_4_1xoxolb90p6dy.R.inc(1533);for (int i = 0; (((i < a.length)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1534)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1535)==0&false)); ++i) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1536);aDouble[i] = a[i].getValue();
        }
        }__CLR4_4_1xoxolb90p6dy.R.inc(1537);final double[] bDouble = new double[b.length];
        __CLR4_4_1xoxolb90p6dy.R.inc(1538);for (int i = 0; (((i < b.length)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1539)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1540)==0&false)); ++i) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1541);bDouble[i] = b[i].getValue();
        }
        }__CLR4_4_1xoxolb90p6dy.R.inc(1542);final double accurateValue = MathArrays.linearCombination(aDouble, bDouble);

        // compute a simple value, with all partial derivatives
        __CLR4_4_1xoxolb90p6dy.R.inc(1543);DerivativeStructure simpleValue = a[0].getField().getZero();
        __CLR4_4_1xoxolb90p6dy.R.inc(1544);for (int i = 0; (((i < a.length)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1545)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1546)==0&false)); ++i) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1547);simpleValue = simpleValue.add(a[i].multiply(b[i]));
        }

        // create a result with accurate value and all derivatives (not necessarily as accurate as the value)
        }__CLR4_4_1xoxolb90p6dy.R.inc(1548);final double[] all = simpleValue.getAllDerivatives();
        __CLR4_4_1xoxolb90p6dy.R.inc(1549);all[0] = accurateValue;
        __CLR4_4_1xoxolb90p6dy.R.inc(1550);return new DerivativeStructure(simpleValue.getFreeParameters(), simpleValue.getOrder(), all);

    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     * @since 3.2
     */
    public DerivativeStructure linearCombination(final double[] a, final DerivativeStructure[] b)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1551);

        // compute an accurate value, taking care of cancellations
        __CLR4_4_1xoxolb90p6dy.R.inc(1552);final double[] bDouble = new double[b.length];
        __CLR4_4_1xoxolb90p6dy.R.inc(1553);for (int i = 0; (((i < b.length)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1554)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1555)==0&false)); ++i) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1556);bDouble[i] = b[i].getValue();
        }
        }__CLR4_4_1xoxolb90p6dy.R.inc(1557);final double accurateValue = MathArrays.linearCombination(a, bDouble);

        // compute a simple value, with all partial derivatives
        __CLR4_4_1xoxolb90p6dy.R.inc(1558);DerivativeStructure simpleValue = b[0].getField().getZero();
        __CLR4_4_1xoxolb90p6dy.R.inc(1559);for (int i = 0; (((i < a.length)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1560)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1561)==0&false)); ++i) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1562);simpleValue = simpleValue.add(b[i].multiply(a[i]));
        }

        // create a result with accurate value and all derivatives (not necessarily as accurate as the value)
        }__CLR4_4_1xoxolb90p6dy.R.inc(1563);final double[] all = simpleValue.getAllDerivatives();
        __CLR4_4_1xoxolb90p6dy.R.inc(1564);all[0] = accurateValue;
        __CLR4_4_1xoxolb90p6dy.R.inc(1565);return new DerivativeStructure(simpleValue.getFreeParameters(), simpleValue.getOrder(), all);

    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     * @since 3.2
     */
    public DerivativeStructure linearCombination(final DerivativeStructure a1, final DerivativeStructure b1,
                                                 final DerivativeStructure a2, final DerivativeStructure b2)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1566);

        // compute an accurate value, taking care of cancellations
        __CLR4_4_1xoxolb90p6dy.R.inc(1567);final double accurateValue = MathArrays.linearCombination(a1.getValue(), b1.getValue(),
                                                                  a2.getValue(), b2.getValue());

        // compute a simple value, with all partial derivatives
        __CLR4_4_1xoxolb90p6dy.R.inc(1568);final DerivativeStructure simpleValue = a1.multiply(b1).add(a2.multiply(b2));

        // create a result with accurate value and all derivatives (not necessarily as accurate as the value)
        __CLR4_4_1xoxolb90p6dy.R.inc(1569);final double[] all = simpleValue.getAllDerivatives();
        __CLR4_4_1xoxolb90p6dy.R.inc(1570);all[0] = accurateValue;
        __CLR4_4_1xoxolb90p6dy.R.inc(1571);return new DerivativeStructure(getFreeParameters(), getOrder(), all);

    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     * @since 3.2
     */
    public DerivativeStructure linearCombination(final double a1, final DerivativeStructure b1,
                                                 final double a2, final DerivativeStructure b2)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1572);

        // compute an accurate value, taking care of cancellations
        __CLR4_4_1xoxolb90p6dy.R.inc(1573);final double accurateValue = MathArrays.linearCombination(a1, b1.getValue(),
                                                                  a2, b2.getValue());

        // compute a simple value, with all partial derivatives
        __CLR4_4_1xoxolb90p6dy.R.inc(1574);final DerivativeStructure simpleValue = b1.multiply(a1).add(b2.multiply(a2));

        // create a result with accurate value and all derivatives (not necessarily as accurate as the value)
        __CLR4_4_1xoxolb90p6dy.R.inc(1575);final double[] all = simpleValue.getAllDerivatives();
        __CLR4_4_1xoxolb90p6dy.R.inc(1576);all[0] = accurateValue;
        __CLR4_4_1xoxolb90p6dy.R.inc(1577);return new DerivativeStructure(getFreeParameters(), getOrder(), all);

    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     * @since 3.2
     */
    public DerivativeStructure linearCombination(final DerivativeStructure a1, final DerivativeStructure b1,
                                                 final DerivativeStructure a2, final DerivativeStructure b2,
                                                 final DerivativeStructure a3, final DerivativeStructure b3)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1578);

        // compute an accurate value, taking care of cancellations
        __CLR4_4_1xoxolb90p6dy.R.inc(1579);final double accurateValue = MathArrays.linearCombination(a1.getValue(), b1.getValue(),
                                                                  a2.getValue(), b2.getValue(),
                                                                  a3.getValue(), b3.getValue());

        // compute a simple value, with all partial derivatives
        __CLR4_4_1xoxolb90p6dy.R.inc(1580);final DerivativeStructure simpleValue = a1.multiply(b1).add(a2.multiply(b2)).add(a3.multiply(b3));

        // create a result with accurate value and all derivatives (not necessarily as accurate as the value)
        __CLR4_4_1xoxolb90p6dy.R.inc(1581);final double[] all = simpleValue.getAllDerivatives();
        __CLR4_4_1xoxolb90p6dy.R.inc(1582);all[0] = accurateValue;
        __CLR4_4_1xoxolb90p6dy.R.inc(1583);return new DerivativeStructure(getFreeParameters(), getOrder(), all);

    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     * @since 3.2
     */
    public DerivativeStructure linearCombination(final double a1, final DerivativeStructure b1,
                                                 final double a2, final DerivativeStructure b2,
                                                 final double a3, final DerivativeStructure b3)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1584);

        // compute an accurate value, taking care of cancellations
        __CLR4_4_1xoxolb90p6dy.R.inc(1585);final double accurateValue = MathArrays.linearCombination(a1, b1.getValue(),
                                                                  a2, b2.getValue(),
                                                                  a3, b3.getValue());

        // compute a simple value, with all partial derivatives
        __CLR4_4_1xoxolb90p6dy.R.inc(1586);final DerivativeStructure simpleValue = b1.multiply(a1).add(b2.multiply(a2)).add(b3.multiply(a3));

        // create a result with accurate value and all derivatives (not necessarily as accurate as the value)
        __CLR4_4_1xoxolb90p6dy.R.inc(1587);final double[] all = simpleValue.getAllDerivatives();
        __CLR4_4_1xoxolb90p6dy.R.inc(1588);all[0] = accurateValue;
        __CLR4_4_1xoxolb90p6dy.R.inc(1589);return new DerivativeStructure(getFreeParameters(), getOrder(), all);

    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     * @since 3.2
     */
    public DerivativeStructure linearCombination(final DerivativeStructure a1, final DerivativeStructure b1,
                                                 final DerivativeStructure a2, final DerivativeStructure b2,
                                                 final DerivativeStructure a3, final DerivativeStructure b3,
                                                 final DerivativeStructure a4, final DerivativeStructure b4)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1590);

        // compute an accurate value, taking care of cancellations
        __CLR4_4_1xoxolb90p6dy.R.inc(1591);final double accurateValue = MathArrays.linearCombination(a1.getValue(), b1.getValue(),
                                                                  a2.getValue(), b2.getValue(),
                                                                  a3.getValue(), b3.getValue(),
                                                                  a4.getValue(), b4.getValue());

        // compute a simple value, with all partial derivatives
        __CLR4_4_1xoxolb90p6dy.R.inc(1592);final DerivativeStructure simpleValue = a1.multiply(b1).add(a2.multiply(b2)).add(a3.multiply(b3)).add(a4.multiply(b4));

        // create a result with accurate value and all derivatives (not necessarily as accurate as the value)
        __CLR4_4_1xoxolb90p6dy.R.inc(1593);final double[] all = simpleValue.getAllDerivatives();
        __CLR4_4_1xoxolb90p6dy.R.inc(1594);all[0] = accurateValue;
        __CLR4_4_1xoxolb90p6dy.R.inc(1595);return new DerivativeStructure(getFreeParameters(), getOrder(), all);

    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception DimensionMismatchException if number of free parameters
     * or orders do not match
     * @since 3.2
     */
    public DerivativeStructure linearCombination(final double a1, final DerivativeStructure b1,
                                                 final double a2, final DerivativeStructure b2,
                                                 final double a3, final DerivativeStructure b3,
                                                 final double a4, final DerivativeStructure b4)
        throws DimensionMismatchException {try{__CLR4_4_1xoxolb90p6dy.R.inc(1596);

        // compute an accurate value, taking care of cancellations
        __CLR4_4_1xoxolb90p6dy.R.inc(1597);final double accurateValue = MathArrays.linearCombination(a1, b1.getValue(),
                                                                  a2, b2.getValue(),
                                                                  a3, b3.getValue(),
                                                                  a4, b4.getValue());

        // compute a simple value, with all partial derivatives
        __CLR4_4_1xoxolb90p6dy.R.inc(1598);final DerivativeStructure simpleValue = b1.multiply(a1).add(b2.multiply(a2)).add(b3.multiply(a3)).add(b4.multiply(a4));

        // create a result with accurate value and all derivatives (not necessarily as accurate as the value)
        __CLR4_4_1xoxolb90p6dy.R.inc(1599);final double[] all = simpleValue.getAllDerivatives();
        __CLR4_4_1xoxolb90p6dy.R.inc(1600);all[0] = accurateValue;
        __CLR4_4_1xoxolb90p6dy.R.inc(1601);return new DerivativeStructure(getFreeParameters(), getOrder(), all);

    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /**
     * Test for the equality of two derivative structures.
     * <p>
     * Derivative structures are considered equal if they have the same number
     * of free parameters, the same derivation order, and the same derivatives.
     * </p>
     * @param other Object to test for equality to this
     * @return true if two derivative structures are equal
     * @since 3.2
     */
    @Override
    public boolean equals(Object other) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1602);

        __CLR4_4_1xoxolb90p6dy.R.inc(1603);if ((((this == other)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1604)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1605)==0&false))) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1606);return true;
        }

        }__CLR4_4_1xoxolb90p6dy.R.inc(1607);if ((((other instanceof DerivativeStructure)&&(__CLR4_4_1xoxolb90p6dy.R.iget(1608)!=0|true))||(__CLR4_4_1xoxolb90p6dy.R.iget(1609)==0&false))) {{
            __CLR4_4_1xoxolb90p6dy.R.inc(1610);final DerivativeStructure rhs = (DerivativeStructure)other;
            __CLR4_4_1xoxolb90p6dy.R.inc(1611);return (getFreeParameters() == rhs.getFreeParameters()) &&
                   (getOrder() == rhs.getOrder()) &&
                   MathArrays.equals(data, rhs.data);
        }

        }__CLR4_4_1xoxolb90p6dy.R.inc(1612);return false;

    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /**
     * Get a hashCode for the derivative structure.
     * @return a hash code value for this object
     * @since 3.2
     */
    @Override
    public int hashCode() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1613);
        __CLR4_4_1xoxolb90p6dy.R.inc(1614);return 227 + 229 * getFreeParameters() + 233 * getOrder() + 239 * MathUtils.hash(data);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /**
     * Replace the instance with a data transfer object for serialization.
     * @return data transfer object that will be serialized
     */
    private Object writeReplace() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1615);
        __CLR4_4_1xoxolb90p6dy.R.inc(1616);return new DataTransferObject(compiler.getFreeParameters(), compiler.getOrder(), data);
    }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    /** Internal class used only for serialization. */
    private static class DataTransferObject implements Serializable {

        /** Serializable UID. */
        private static final long serialVersionUID = 20120730L;

        /** Number of variables.
         * @serial
         */
        private final int variables;

        /** Derivation order.
         * @serial
         */
        private final int order;

        /** Partial derivatives.
         * @serial
         */
        private final double[] data;

        /** Simple constructor.
         * @param variables number of variables
         * @param order derivation order
         * @param data partial derivatives
         */
        public DataTransferObject(final int variables, final int order, final double[] data) {try{__CLR4_4_1xoxolb90p6dy.R.inc(1617);
            __CLR4_4_1xoxolb90p6dy.R.inc(1618);this.variables = variables;
            __CLR4_4_1xoxolb90p6dy.R.inc(1619);this.order     = order;
            __CLR4_4_1xoxolb90p6dy.R.inc(1620);this.data      = data;
        }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

        /** Replace the deserialized data transfer object with a {@link DerivativeStructure}.
         * @return replacement {@link DerivativeStructure}
         */
        private Object readResolve() {try{__CLR4_4_1xoxolb90p6dy.R.inc(1621);
            __CLR4_4_1xoxolb90p6dy.R.inc(1622);return new DerivativeStructure(variables, order, data);
        }finally{__CLR4_4_1xoxolb90p6dy.R.flushNeeded();}}

    }

}
