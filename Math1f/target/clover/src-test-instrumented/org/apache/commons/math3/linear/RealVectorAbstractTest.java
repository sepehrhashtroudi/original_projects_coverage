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
package org.apache.commons.math3.linear;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Abs;
import org.apache.commons.math3.analysis.function.Acos;
import org.apache.commons.math3.analysis.function.Asin;
import org.apache.commons.math3.analysis.function.Atan;
import org.apache.commons.math3.analysis.function.Cbrt;
import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.commons.math3.analysis.function.Cos;
import org.apache.commons.math3.analysis.function.Cosh;
import org.apache.commons.math3.analysis.function.Exp;
import org.apache.commons.math3.analysis.function.Expm1;
import org.apache.commons.math3.analysis.function.Floor;
import org.apache.commons.math3.analysis.function.Inverse;
import org.apache.commons.math3.analysis.function.Log;
import org.apache.commons.math3.analysis.function.Log10;
import org.apache.commons.math3.analysis.function.Log1p;
import org.apache.commons.math3.analysis.function.Power;
import org.apache.commons.math3.analysis.function.Rint;
import org.apache.commons.math3.analysis.function.Signum;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.analysis.function.Sinh;
import org.apache.commons.math3.analysis.function.Sqrt;
import org.apache.commons.math3.analysis.function.Tan;
import org.apache.commons.math3.analysis.function.Tanh;
import org.apache.commons.math3.analysis.function.Ulp;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


@java.lang.SuppressWarnings({"fallthrough"}) public abstract class RealVectorAbstractTest {static class __CLR4_4_11vg71vg7lb90pdbg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,88563,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private enum BinaryOperation {
        ADD, SUB, MUL, DIV
    }

    /**
     * <p>
     * This is an attempt at covering most particular cases of combining two
     * values. Here {@code x} is the value returned by
     * {@link #getPreferredEntryValue()}, while {@code y} and {@code z} are two
     * "normal" values.
     * </p>
     * <ol>
     *   <li>
     *     Addition: the following cases should be covered
     *     <ul>
     *       <li>{@code (2 * x) + (-x)}</li>
     *       <li>{@code (-x) + 2 * x}</li>
     *       <li>{@code x + y}</li>
     *       <li>{@code y + x}</li>
     *       <li>{@code y + z}</li>
     *       <li>{@code y + (x - y)}</li>
     *       <li>{@code (y - x) + x}</li>
     *     </ul>
     *     The values to be considered are:
     *     {@code x, y, z, 2 * x, -x, x - y, y - x}.
     *   </li>
     *   <li>
     *     Subtraction: the following cases should be covered
     *     <ul>
     *       <li>{@code (2 * x) - x}</li>
     *       <li>{@code x - y}</li>
     *       <li>{@code y - x}</li>
     *       <li>{@code y - z}</li>
     *       <li>{@code y - (y - x)}</li>
     *       <li>{@code (y + x) - y}</li>
     *     </ul>
     *     The values to be considered are: {@code x, y, z, x + y, y - x}.
     *   </li>
     *   <li>
     *     Multiplication
     *     <ul>
     *       <li>{@code (x * x) * (1 / x)}</li>
     *       <li>{@code (1 / x) * (x * x)}</li>
     *       <li>{@code x * y}</li>
     *       <li>{@code y * x}</li>
     *       <li>{@code y * z}</li>
     *     </ul>
     *     The values to be considered are: {@code x, y, z, 1 / x, x * x}.
     *   </li>
     *   <li>
     *     Division
     *     <ul>
     *       <li>{@code (x * x) / x}</li>
     *       <li>{@code x / y}</li>
     *       <li>{@code y / x}</li>
     *       <li>{@code y / z}</li>
     *     </ul>
     *     The values to be considered are: {@code x, y, z, x * x}.
     *   </li>
     * </ol>
     * Also to be considered {@code NaN}, {@code POSITIVE_INFINITY},
     * {@code NEGATIVE_INFINITY}, {@code +0.0}, {@code -0.0}.
     */
    private final double[] values;

    /**
     * Creates a new instance of {@link RealVector}, with specified entries.
     * The returned vector must be of the type currently tested. It should be
     * noted that some tests assume that no references to the specified
     * {@code double[]} are kept in the returned object: if necessary, defensive
     * copy of this array should be made.
     *
     * @param data the entries of the vector to be created
     * @return a new {@link RealVector} of the type to be tested
     */
    public abstract RealVector create(double[] data);

    /**
     * Creates a new instance of {@link RealVector}, with specified entries.
     * The type of the returned vector must be different from the type currently
     * tested. It should be noted that some tests assume that no references to
     * the specified {@code double[]} are kept in the returned object: if
     * necessary, defensive copy of this array should be made.
     *
     * @param data the entries of the vector to be created
     * @return a new {@link RealVector} of an alien type
     */
    public RealVector createAlien(double[] data){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87415);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87416);return new RealVectorTestImpl(data);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /**
     * Returns a preferred value of the entries, to be tested specifically. Some
     * implementations of {@link RealVector} (e.g. {@link OpenMapRealVector}) do
     * not store specific values of entries. In order to ensure that all tests
     * take into account this specific value, some entries of the vectors to be
     * tested are deliberately set to the value returned by the present method.
     * The default implementation returns {@code 0.0}.
     *
     * @return a value which <em>should</em> be present in all vectors to be
     * tested
     */
    public double getPreferredEntryValue() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87417);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87418);return 0.0;
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    public RealVectorAbstractTest() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87419);
        /*
         * Make sure that x, y, z are three different values. Also, x is the
         * preferred value (e.g. the value which is not stored in sparse
         * implementations).
         */
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87420);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87421);final double y = x + 1d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87422);final double z = y + 1d;

        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87423);values =
            new double[] {
                Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY,
                0d, -0d, x, y, z, 2 * x, -x, 1 / x, x * x, x + y, x - y, y - x
            };
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testGetDimension() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bfaffb1vgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetDimension",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bfaffb1vgg(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87424);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87425);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87426);final double[] data1 = {x, x, x, x};
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87427);Assert.assertEquals(data1.length, create(data1).getDimension());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87428);final double y = x + 1;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87429);final double[] data2 = {y, y, y, y};
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87430);Assert.assertEquals(data2.length, create(data2).getDimension());
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testGetEntry() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kt3pn1vgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kt3pn1vgn(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87431);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87432);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87433);final double[] data = {x, 1d, 2d, x, x};
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87434);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87435);for (int i = 0; (((i < data.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87436)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87437)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87438);Assert.assertEquals("entry " + i, data[i], v.getEntry(i), 0d);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected=OutOfRangeException.class)
    public void testGetEntryInvalidIndex1() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_194b1m71vgv();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,69,110,116,114,121,73,110,118,97,108,105,100,73,110,100,101,120,49,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetEntryInvalidIndex1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_194b1m71vgv(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87439);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87440);create(new double[4]).getEntry(-1);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected=OutOfRangeException.class)
    public void testGetEntryInvalidIndex2() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdb0eo1vgx();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,69,110,116,114,121,73,110,118,97,108,105,100,73,110,100,101,120,50,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetEntryInvalidIndex2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdb0eo1vgx(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87441);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87442);create(new double[4]).getEntry(4);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testSetEntry() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ayxmuh1vgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testSetEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ayxmuh1vgz(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87443);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87444);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87445);final double[] data = {x, 1d, 2d, x, x};
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87446);final double[] expected = MathArrays.copyOf(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87447);final RealVector actual = create(data);

        /*
         * Try setting to any value.
         */
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87448);for (int i = 0; (((i < data.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87449)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87450)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87451);final double oldValue = data[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87452);final double newValue = oldValue + 1d;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87453);expected[i] = newValue;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87454);actual.setEntry(i, newValue);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87455);TestUtils.assertEquals("while setting entry #" + i, expected,
                actual, 0d);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87456);expected[i] = oldValue;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87457);actual.setEntry(i, oldValue);
        }

        /*
         * Try setting to the preferred value.
         */
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87458);for (int i = 0; (((i < data.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87459)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87460)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87461);final double oldValue = data[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87462);final double newValue = x;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87463);expected[i] = newValue;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87464);actual.setEntry(i, newValue);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87465);TestUtils.assertEquals("while setting entry #" + i, expected,
                actual, 0d);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87466);expected[i] = oldValue;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87467);actual.setEntry(i, oldValue);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected=OutOfRangeException.class)
    public void testSetEntryInvalidIndex1() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vginv1vho();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,69,110,116,114,121,73,110,118,97,108,105,100,73,110,100,101,120,49,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testSetEntryInvalidIndex1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vginv1vho(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87468);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87469);create(new double[4]).setEntry(-1, getPreferredEntryValue());
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected=OutOfRangeException.class)
    public void testSetEntryInvalidIndex2() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4ghgc1vhq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,69,110,116,114,121,73,110,118,97,108,105,100,73,110,100,101,120,50,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testSetEntryInvalidIndex2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4ghgc1vhq(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87470);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87471);create(new double[4]).setEntry(4, getPreferredEntryValue());
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testAddToEntry() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g8achd1vhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testAddToEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g8achd1vhs(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87472);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87473);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87474);final double[] data1 = {x, 1d, 2d, x, x};
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87475);final double[] data2 = {x, x, 3d, x, 4d, x};

        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87476);final double[] expected = MathArrays.copyOf(data1);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87477);final RealVector actual = create(data1);

        /*
         * Try adding any value.
         */
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87478);double increment = 1d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87479);for (int i = 0; (((i < data1.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87480)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87481)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87482);final double oldValue = data1[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87483);expected[i] += increment;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87484);actual.addToEntry(i, increment);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87485);TestUtils.assertEquals("while incrementing entry #" + i, expected,
                actual, 0d);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87486);expected[i] = oldValue;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87487);actual.setEntry(i, oldValue);
        }

        /*
         * Try incrementing so that result is equal to preferred value.
         */
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87488);for (int i = 0; (((i < data1.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87489)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87490)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87491);final double oldValue = data1[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87492);increment = x - oldValue;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87493);expected[i] = x;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87494);actual.addToEntry(i, increment);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87495);TestUtils.assertEquals("while incrementing entry #" + i, expected,
                actual, 0d);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87496);expected[i] = oldValue;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87497);actual.setEntry(i, oldValue);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected=OutOfRangeException.class)
    public void testAddToEntryInvalidIndex1() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11dujth1vii();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,84,111,69,110,116,114,121,73,110,118,97,108,105,100,73,110,100,101,120,49,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testAddToEntryInvalidIndex1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11dujth1vii(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87498);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87499);create(new double[3]).addToEntry(-1, getPreferredEntryValue());
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected=OutOfRangeException.class)
    public void testAddToEntryInvalidIndex2() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14muily1vik();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,84,111,69,110,116,114,121,73,110,118,97,108,105,100,73,110,100,101,120,50,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testAddToEntryInvalidIndex2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14muily1vik(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87500);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87501);create(new double[3]).addToEntry(4, getPreferredEntryValue());
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestAppendVector(final String message, final RealVector v1,
        final RealVector v2, final double delta) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87502);

        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87503);final int n1 = v1.getDimension();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87504);final int n2 = v2.getDimension();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87505);final RealVector v = v1.append(v2);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87506);Assert.assertEquals(message, n1 + n2, v.getDimension());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87507);for (int i = 0; (((i < n1)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87508)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87509)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87510);final String msg = message + ", entry #" + i;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87511);Assert.assertEquals(msg, v1.getEntry(i), v.getEntry(i), delta);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87512);for (int i = 0; (((i < n2)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87513)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87514)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87515);final String msg = message + ", entry #" + (n1 + i);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87516);Assert.assertEquals(msg, v2.getEntry(i), v.getEntry(n1 + i), delta);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testAppendVector() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qori1i1vj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testAppendVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qori1i1vj1(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87517);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87518);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87519);final double[] data1 =  {x, 1d, 2d, x, x};
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87520);final double[] data2 =  {x, x, 3d, x, 4d, x};

        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87521);doTestAppendVector("same type", create(data1), create(data2), 0d);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87522);doTestAppendVector("mixed types", create(data1), createAlien(data2), 0d);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestAppendScalar(final String message, final RealVector v,
        final double d, final double delta) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87523);

        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87524);final int n = v.getDimension();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87525);final RealVector w = v.append(d);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87526);Assert.assertEquals(message, n + 1, w.getDimension());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87527);for (int i = 0; (((i < n)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87528)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87529)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87530);final String msg = message + ", entry #" + i;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87531);Assert.assertEquals(msg, v.getEntry(i), w.getEntry(i), delta);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87532);final String msg = message + ", entry #" + n;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87533);Assert.assertEquals(msg, d, w.getEntry(n), delta);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testAppendScalar() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8ft0f1vji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testAppendScalar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8ft0f1vji(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87534);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87535);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87536);final double[] data = new double[] {x, 1d, 2d, x, x};

        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87537);doTestAppendScalar("", create(data), 1d, 0d);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87538);doTestAppendScalar("", create(data), x, 0d);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testGetSubVector() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1v7ra1vjn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1v7ra1vjn(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87539);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87540);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87541);final double[] data = {x, x, x, 1d, x, 2d, x, x, 3d, x, x, x, 4d, x, x, x};
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87542);final int index = 1;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87543);final int n = data.length - 5;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87544);final RealVector actual = create(data).getSubVector(index, n);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87545);final double[] expected = new double[n];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87546);System.arraycopy(data, index, expected, 0, n);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87547);TestUtils.assertEquals("", expected, actual, 0d);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = OutOfRangeException.class)
    public void testGetSubVectorInvalidIndex1() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bdlbb61vjw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,83,117,98,86,101,99,116,111,114,73,110,118,97,108,105,100,73,110,100,101,120,49,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bdlbb61vjw(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87548);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87549);final int n = 10;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87550);create(new double[n]).getSubVector(-1, 2);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = OutOfRangeException.class)
    public void testGetSubVectorInvalidIndex2() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184lcip1vjz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,83,117,98,86,101,99,116,111,114,73,110,118,97,108,105,100,73,110,100,101,120,50,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184lcip1vjz(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87551);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87552);final int n = 10;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87553);create(new double[n]).getSubVector(n, 2);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = OutOfRangeException.class)
    public void testGetSubVectorInvalidIndex3() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vldq81vk2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,83,117,98,86,101,99,116,111,114,73,110,118,97,108,105,100,73,110,100,101,120,51,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vldq81vk2(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87554);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87555);final int n = 10;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87556);create(new double[n]).getSubVector(0, n + 1);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = NotPositiveException.class)
    public void testGetSubVectorInvalidIndex4() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mlexr1vk5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,83,117,98,86,101,99,116,111,114,73,110,118,97,108,105,100,73,110,100,101,120,52,58,32,91,78,111,116,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mlexr1vk5(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87557);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87558);final int n = 10;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87559);create(new double[n]).getSubVector(3, -2);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testSetSubVectorSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1532qli1vk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1532qli1vk8(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87560);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87561);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87562);final double[] expected = {x, x, x, 1d, x, 2d, x, x, 3d, x, x, x, 4d, x, x, x};
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87563);final double[] sub = {5d, x, 6d, 7d, 8d};
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87564);final RealVector actual = create(expected);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87565);final int index = 2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87566);actual.setSubVector(index, create(sub));

        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87567);for (int i = 0; (((i < sub.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87568)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87569)==0&false)); i++){{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87570);expected[index + i] = sub[i];
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87571);TestUtils.assertEquals("", expected, actual, 0d);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testSetSubVectorMixedType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecu77b1vkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorMixedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecu77b1vkk(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87572);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87573);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87574);final double[] expected = {x, x, x, 1d, x, 2d, x, x, 3d, x, x, x, 4d, x, x, x};
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87575);final double[] sub = {5d, x, 6d, 7d, 8d};
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87576);final RealVector actual = create(expected);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87577);final int index = 2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87578);actual.setSubVector(index, createAlien(sub));

        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87579);for (int i = 0; (((i < sub.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87580)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87581)==0&false)); i++){{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87582);expected[index + i] = sub[i];
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87583);TestUtils.assertEquals("", expected, actual, 0d);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = OutOfRangeException.class)
    public void testSetSubVectorInvalidIndex1() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11svdo61vkw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,83,117,98,86,101,99,116,111,114,73,110,118,97,108,105,100,73,110,100,101,120,49,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorInvalidIndex1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11svdo61vkw(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87584);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87585);create(new double[10]).setSubVector(-1, create(new double[2]));
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = OutOfRangeException.class)
    public void testSetSubVectorInvalidIndex2() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11g4l4b1vky();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,83,117,98,86,101,99,116,111,114,73,110,118,97,108,105,100,73,110,100,101,120,50,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorInvalidIndex2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11g4l4b1vky(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87586);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87587);create(new double[10]).setSubVector(10, create(new double[2]));
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = OutOfRangeException.class)
    public void testSetSubVectorInvalidIndex3() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14p4jws1vl0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,83,117,98,86,101,99,116,111,114,73,110,118,97,108,105,100,73,110,100,101,120,51,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorInvalidIndex3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14p4jws1vl0(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87588);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87589);create(new double[10]).setSubVector(9, create(new double[2]));
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testIsNaN() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z6qlqy1vl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testIsNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z6qlqy1vl2(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87590);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87591);final RealVector v = create(new double[] {0, 1, 2});

        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87592);Assert.assertFalse(v.isNaN());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87593);v.setEntry(1, Double.NaN);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87594);Assert.assertTrue(v.isNaN());
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testIsInfinite() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1587wev1vl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testIsInfinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1587wev1vl7(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87595);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87596);final RealVector v = create(new double[] { 0, 1, 2 });

        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87597);Assert.assertFalse(v.isInfinite());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87598);v.setEntry(0, Double.POSITIVE_INFINITY);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87599);Assert.assertTrue(v.isInfinite());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87600);v.setEntry(1, Double.NaN);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87601);Assert.assertFalse(v.isInfinite());
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestEbeBinaryOperation(final BinaryOperation op, final boolean mixed) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87602);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87603);final double[] data1 = new double[values.length * values.length];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87604);final double[] data2 = new double[values.length * values.length];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87605);int k = 0;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87606);for (int i = 0; (((i < values.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87607)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87608)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87609);for (int j = 0; (((j < values.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87610)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87611)==0&false)); j++) {{
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87612);data1[k] = values[i];
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87613);data2[k] = values[j];
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87614);++k;
            }
        }}
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87615);final RealVector v1 = create(data1);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87616);final RealVector v2 = (((mixed )&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87617)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87618)==0&false))? createAlien(data2) : create(data2);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87619);final RealVector actual;
        boolean __CLB4_4_1_bool0=false;__CLR4_4_11vg71vg7lb90pdbg.R.inc(87620);switch (op) {
            case ADD:if (!__CLB4_4_1_bool0) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87621);__CLB4_4_1_bool0=true;}
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87622);actual = v1.add(v2);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87623);break;
            case SUB:if (!__CLB4_4_1_bool0) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87624);__CLB4_4_1_bool0=true;}
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87625);actual = v1.subtract(v2);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87626);break;
            case MUL:if (!__CLB4_4_1_bool0) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87627);__CLB4_4_1_bool0=true;}
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87628);actual = v1.ebeMultiply(v2);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87629);break;
            case DIV:if (!__CLB4_4_1_bool0) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87630);__CLB4_4_1_bool0=true;}
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87631);actual = v1.ebeDivide(v2);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87632);break;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87633);__CLB4_4_1_bool0=true;}
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87634);throw new AssertionError("unexpected value");
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87635);final double[] expected = new double[data1.length];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87636);for (int i = 0; (((i < expected.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87637)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87638)==0&false)); i++) {{
            boolean __CLB4_4_1_bool1=false;__CLR4_4_11vg71vg7lb90pdbg.R.inc(87639);switch (op) {
                case ADD:if (!__CLB4_4_1_bool1) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87640);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(87641);expected[i] = data1[i] + data2[i];
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(87642);break;
                case SUB:if (!__CLB4_4_1_bool1) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87643);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(87644);expected[i] = data1[i] - data2[i];
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(87645);break;
                case MUL:if (!__CLB4_4_1_bool1) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87646);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(87647);expected[i] = data1[i] * data2[i];
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(87648);break;
                case DIV:if (!__CLB4_4_1_bool1) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87649);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(87650);expected[i] = data1[i] / data2[i];
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(87651);break;
                default:if (!__CLB4_4_1_bool1) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87652);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(87653);throw new AssertionError("unexpected value");
            }
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87654);for (int i = 0; (((i < expected.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87655)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87656)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87657);final String msg = "entry #"+i+", left = "+data1[i]+", right = " + data2[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87658);Assert.assertEquals(msg, expected[i], actual.getEntry(i), 0.0);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestEbeBinaryOperationDimensionMismatch(final BinaryOperation op) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87659);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87660);final int n = 10;
        boolean __CLB4_4_1_bool2=false;__CLR4_4_11vg71vg7lb90pdbg.R.inc(87661);switch (op) {
            case ADD:if (!__CLB4_4_1_bool2) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87662);__CLB4_4_1_bool2=true;}
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87663);create(new double[n]).add(create(new double[n + 1]));
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87664);break;
            case SUB:if (!__CLB4_4_1_bool2) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87665);__CLB4_4_1_bool2=true;}
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87666);create(new double[n]).subtract(create(new double[n + 1]));
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87667);break;
            case MUL:if (!__CLB4_4_1_bool2) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87668);__CLB4_4_1_bool2=true;}
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87669);create(new double[n]).ebeMultiply(create(new double[n + 1]));
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87670);break;
            case DIV:if (!__CLB4_4_1_bool2) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87671);__CLB4_4_1_bool2=true;}
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87672);create(new double[n]).ebeDivide(create(new double[n + 1]));
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87673);break;
            default:if (!__CLB4_4_1_bool2) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87674);__CLB4_4_1_bool2=true;}
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87675);throw new AssertionError("unexpected value");
        }
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testAddSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h6yxva1vng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testAddSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h6yxva1vng(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87676);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87677);doTestEbeBinaryOperation(BinaryOperation.ADD, false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testAddMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j2gg0c1vni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testAddMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j2gg0c1vni(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87678);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87679);doTestEbeBinaryOperation(BinaryOperation.ADD, true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testAddDimensionMismatch() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svpa8c1vnk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testAddDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svpa8c1vnk(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87680);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87681);doTestEbeBinaryOperationDimensionMismatch(BinaryOperation.ADD);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testSubtractSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16gursd1vnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testSubtractSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16gursd1vnm(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87682);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87683);doTestEbeBinaryOperation(BinaryOperation.SUB, false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testSubtractMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qqetg51vno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testSubtractMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qqetg51vno(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87684);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87685);doTestEbeBinaryOperation(BinaryOperation.SUB, true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testSubtractDimensionMismatch() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19k5fp11vnq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,117,98,116,114,97,99,116,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testSubtractDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19k5fp11vnq(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87686);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87687);doTestEbeBinaryOperationDimensionMismatch(BinaryOperation.SUB);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Ignore("ebeMultiply(RealVector) is known to be faulty (MATH-803) and is deprecated.")
    @Test
    public void testEbeMultiplySameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ay6bmn1vns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeMultiplySameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ay6bmn1vns(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87688);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87689);doTestEbeBinaryOperation(BinaryOperation.MUL, false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Ignore("ebeMultiply(RealVector) is known to be faulty (MATH-803) and is deprecated.")
    @Test
    public void testEbeMultiplyMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11o22ox1vnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeMultiplyMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11o22ox1vnu(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87690);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87691);doTestEbeBinaryOperation(BinaryOperation.MUL, true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Ignore("ebeMultiply(RealVector) is known to be faulty (MATH-803) and is deprecated.")
    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiplyDimensionMismatch() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15s0jpd1vnw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,98,101,77,117,108,116,105,112,108,121,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeMultiplyDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15s0jpd1vnw(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87692);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87693);doTestEbeBinaryOperationDimensionMismatch(BinaryOperation.MUL);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Ignore("ebeDivide(RealVector) is known to be faulty (MATH-803) and is deprecated.")
    @Test
    public void testEbeDivideSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16c3q5m1vny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeDivideSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16c3q5m1vny(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87694);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87695);doTestEbeBinaryOperation(BinaryOperation.DIV, false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Ignore("ebeDivide(RealVector) is known to be faulty (MATH-803) and is deprecated.")
    @Test
    public void testEbeDivideMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rm9qdw1vo0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeDivideMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rm9qdw1vo0(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87696);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87697);doTestEbeBinaryOperation(BinaryOperation.DIV, true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Ignore("ebeDivide(RealVector) is known to be faulty (MATH-803) and is deprecated.")
    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivideDimensionMismatch() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5d9v01vo2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,98,101,68,105,118,105,100,101,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeDivideDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5d9v01vo2(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87698);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87699);doTestEbeBinaryOperationDimensionMismatch(BinaryOperation.DIV);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestGetDistance(final boolean mixed) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87700);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87701);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87702);final double[] data1 = new double[] { x, x, 1d, x, 2d, x, x, 3d, x };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87703);final double[] data2 = new double[] { 4d, x, x, 5d, 6d, 7d, x, x, 8d };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87704);final RealVector v1 = create(data1);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87705);final RealVector v2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87706);if ((((mixed)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87707)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87708)==0&false))) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87709);v2 = createAlien(data2);
        } }else {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87710);v2 = create(data2);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87711);final double actual = v1.getDistance(v2);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87712);double expected = 0d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87713);for (int i = 0; (((i < data1.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87714)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87715)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87716);final double delta = data2[i] - data1[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87717);expected += delta * delta;
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87718);expected = FastMath.sqrt(expected);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87719);Assert.assertEquals("", expected, actual, 0d);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testGetDistanceSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svi0001voo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetDistanceSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svi0001voo(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87720);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87721);doTestGetDistance(false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testGetDistanceMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g5h81u1voq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetDistanceMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g5h81u1voq(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87722);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87723);doTestGetDistance(true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testGetDistanceDimensionMismatch() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aqeuo21vos();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,68,105,115,116,97,110,99,101,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetDistanceDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aqeuo21vos(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87724);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87725);create(new double[4]).getDistance(createAlien(new double[5]));
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testGetNorm() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnxu9l1vou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetNorm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnxu9l1vou(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87726);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87727);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87728);final double[] data = new double[] { x, x, 1d, x, 2d, x, x, 3d, x };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87729);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87730);final double actual = v.getNorm();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87731);double expected = 0d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87732);for (int i = 0; (((i < data.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87733)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87734)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87735);expected += data[i] * data[i];
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87736);expected = FastMath.sqrt(expected);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87737);Assert.assertEquals("", expected, actual, 0d);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestGetL1Distance(final boolean mixed) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87738);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87739);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87740);final double[] data1 = new double[] { x, x, 1d, x, 2d, x, x, 3d, x };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87741);final double[] data2 = new double[] { 4d, x, x, 5d, 6d, 7d, x, x, 8d };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87742);final RealVector v1 = create(data1);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87743);final RealVector v2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87744);if ((((mixed)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87745)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87746)==0&false))) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87747);v2 = createAlien(data2);
        } }else {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87748);v2 = create(data2);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87749);final double actual = v1.getL1Distance(v2);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87750);double expected = 0d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87751);for (int i = 0; (((i < data1.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87752)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87753)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87754);final double delta = data2[i] - data1[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87755);expected += FastMath.abs(delta);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87756);Assert.assertEquals("", expected, actual, 0d);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testGetL1DistanceSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ojtghn1vpp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetL1DistanceSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ojtghn1vpp(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87757);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87758);doTestGetL1Distance(false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testGetL1DistanceMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12pwqrh1vpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetL1DistanceMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12pwqrh1vpr(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87759);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87760);doTestGetL1Distance(true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testGetL1DistanceDimensionMismatch() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19vr4gz1vpt();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,76,49,68,105,115,116,97,110,99,101,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetL1DistanceDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19vr4gz1vpt(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87761);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87762);create(new double[4]).getL1Distance(createAlien(new double[5]));
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testGetL1Norm() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghr6bw1vpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetL1Norm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghr6bw1vpv(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87763);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87764);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87765);final double[] data = new double[] { x, x, 1d, x, 2d, x, x, 3d, x };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87766);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87767);final double actual = v.getL1Norm();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87768);double expected = 0d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87769);for (int i = 0; (((i < data.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87770)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87771)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87772);expected += FastMath.abs(data[i]);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87773);Assert.assertEquals("", expected, actual, 0d);

    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestGetLInfDistance(final boolean mixed) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87774);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87775);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87776);final double[] data1 = new double[] { x, x, 1d, x, 2d, x, x, 3d, x };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87777);final double[] data2 = new double[] { 4d, x, x, 5d, 6d, 7d, x, x, 8d };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87778);final RealVector v1 = create(data1);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87779);final RealVector v2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87780);if ((((mixed)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87781)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87782)==0&false))) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87783);v2 = createAlien(data2);
        } }else {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87784);v2 = create(data2);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87785);final double actual = v1.getLInfDistance(v2);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87786);double expected = 0d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87787);for (int i = 0; (((i < data1.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87788)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87789)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87790);final double delta = data2[i] - data1[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87791);expected = FastMath.max(expected, FastMath.abs(delta));
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87792);Assert.assertEquals("", expected, actual, 0d);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testGetLInfDistanceSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jaycwl1vqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetLInfDistanceSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jaycwl1vqp(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87793);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87794);doTestGetLInfDistance(false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testGetLInfDistanceMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1keuej71vqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetLInfDistanceMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1keuej71vqr(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87795);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87796);doTestGetLInfDistance(true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testGetLInfDistanceDimensionMismatch() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9vgul1vqt();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,76,73,110,102,68,105,115,116,97,110,99,101,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetLInfDistanceDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9vgul1vqt(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87797);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87798);create(new double[4]).getLInfDistance(createAlien(new double[5]));
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testGetLInfNorm() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gnwys1vqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testGetLInfNorm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gnwys1vqv(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87799);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87800);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87801);final double[] data = new double[] { x, x, 1d, x, 2d, x, x, 3d, x };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87802);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87803);final double actual = v.getLInfNorm();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87804);double expected = 0d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87805);for (int i = 0; (((i < data.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87806)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87807)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87808);expected = FastMath.max(expected, FastMath.abs(data[i]));
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87809);Assert.assertEquals("", expected, actual, 0d);

    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestMapBinaryOperation(final BinaryOperation op, final boolean inPlace) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87810);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87811);final double[] expected = new double[values.length];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87812);for (int i = 0; (((i < values.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87813)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87814)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87815);final double d = values[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87816);for (int j = 0; (((j < expected.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87817)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87818)==0&false)); j++) {{
                boolean __CLB4_4_1_bool3=false;__CLR4_4_11vg71vg7lb90pdbg.R.inc(87819);switch (op) {
                    case ADD:if (!__CLB4_4_1_bool3) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87820);__CLB4_4_1_bool3=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87821);expected[j] = values[j] + d;
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87822);break;
                    case SUB:if (!__CLB4_4_1_bool3) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87823);__CLB4_4_1_bool3=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87824);expected[j] = values[j] - d;
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87825);break;
                    case MUL:if (!__CLB4_4_1_bool3) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87826);__CLB4_4_1_bool3=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87827);expected[j] = values[j] * d;
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87828);break;
                    case DIV:if (!__CLB4_4_1_bool3) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87829);__CLB4_4_1_bool3=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87830);expected[j] = values[j] / d;
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87831);break;
                    default:if (!__CLB4_4_1_bool3) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87832);__CLB4_4_1_bool3=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87833);throw new AssertionError("unexpected value");
                }
            }
            }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87834);final RealVector v = create(values);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87835);final RealVector actual;
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87836);if ((((inPlace)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87837)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87838)==0&false))) {{
                boolean __CLB4_4_1_bool4=false;__CLR4_4_11vg71vg7lb90pdbg.R.inc(87839);switch (op) {
                    case ADD:if (!__CLB4_4_1_bool4) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87840);__CLB4_4_1_bool4=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87841);actual = v.mapAddToSelf(d);
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87842);break;
                    case SUB:if (!__CLB4_4_1_bool4) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87843);__CLB4_4_1_bool4=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87844);actual = v.mapSubtractToSelf(d);
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87845);break;
                    case MUL:if (!__CLB4_4_1_bool4) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87846);__CLB4_4_1_bool4=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87847);actual = v.mapMultiplyToSelf(d);
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87848);break;
                    case DIV:if (!__CLB4_4_1_bool4) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87849);__CLB4_4_1_bool4=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87850);actual = v.mapDivideToSelf(d);
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87851);break;
                    default:if (!__CLB4_4_1_bool4) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87852);__CLB4_4_1_bool4=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87853);throw new AssertionError("unexpected value");
                }
            } }else {{
                boolean __CLB4_4_1_bool5=false;__CLR4_4_11vg71vg7lb90pdbg.R.inc(87854);switch (op) {
                    case ADD:if (!__CLB4_4_1_bool5) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87855);__CLB4_4_1_bool5=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87856);actual = v.mapAdd(d);
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87857);break;
                    case SUB:if (!__CLB4_4_1_bool5) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87858);__CLB4_4_1_bool5=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87859);actual = v.mapSubtract(d);
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87860);break;
                    case MUL:if (!__CLB4_4_1_bool5) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87861);__CLB4_4_1_bool5=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87862);actual = v.mapMultiply(d);
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87863);break;
                    case DIV:if (!__CLB4_4_1_bool5) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87864);__CLB4_4_1_bool5=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87865);actual = v.mapDivide(d);
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87866);break;
                    default:if (!__CLB4_4_1_bool5) {__CLR4_4_11vg71vg7lb90pdbg.R.inc(87867);__CLB4_4_1_bool5=true;}
                        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87868);throw new AssertionError("unexpected value");
                }
            }
            }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87869);TestUtils.assertEquals(Double.toString(d), expected, actual, 0d);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testMapAdd() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zh7xa61vsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testMapAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zh7xa61vsu(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87870);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87871);doTestMapBinaryOperation(BinaryOperation.ADD, false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testMapAddToSelf() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tklu1n1vsw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testMapAddToSelf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tklu1n1vsw(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87872);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87873);doTestMapBinaryOperation(BinaryOperation.ADD, true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testMapSubtract() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s8znq31vsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testMapSubtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s8znq31vsy(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87874);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87875);doTestMapBinaryOperation(BinaryOperation.SUB, false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testMapSubtractToSelf() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyq0tw1vt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testMapSubtractToSelf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyq0tw1vt0(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87876);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87877);doTestMapBinaryOperation(BinaryOperation.SUB, true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testMapMultiply() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16aju8b1vt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testMapMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16aju8b1vt2(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87878);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87879);doTestMapBinaryOperation(BinaryOperation.MUL, false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testMapMultiplyToSelf() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wztjms1vt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testMapMultiplyToSelf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wztjms1vt4(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87880);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87881);doTestMapBinaryOperation(BinaryOperation.MUL, true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testMapDivide() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zggm0a1vt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testMapDivide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zggm0a1vt6(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87882);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87883);doTestMapBinaryOperation(BinaryOperation.DIV, false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testMapDivideToSelf() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hjhq9b1vt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testMapDivideToSelf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hjhq9b1vt8(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87884);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87885);doTestMapBinaryOperation(BinaryOperation.DIV, true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestMapFunction(final UnivariateFunction f,
        final boolean inPlace) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87886);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87887);final double[] data = new double[values.length + 6];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87888);System.arraycopy(values, 0, data, 0, values.length);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87889);data[values.length + 0] = 0.5 * FastMath.PI;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87890);data[values.length + 1] = -0.5 * FastMath.PI;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87891);data[values.length + 2] = FastMath.E;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87892);data[values.length + 3] = -FastMath.E;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87893);data[values.length + 4] = 1.0;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87894);data[values.length + 5] = -1.0;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87895);final double[] expected = new double[data.length];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87896);for (int i = 0; (((i < data.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87897)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87898)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87899);expected[i] = f.value(data[i]);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87900);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87901);final RealVector actual;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87902);if ((((inPlace)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87903)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87904)==0&false))) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87905);actual = v.mapToSelf(f);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87906);Assert.assertSame(v, actual);
        } }else {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87907);actual = v.map(f);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87908);TestUtils.assertEquals(f.getClass().getSimpleName(), expected, actual, 1E-16);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private UnivariateFunction[] createFunctions() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87909);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87910);return new UnivariateFunction[] {
            new Power(2.0), new Exp(), new Expm1(), new Log(), new Log10(),
            new Log1p(), new Cosh(), new Sinh(), new Tanh(), new Cos(),
            new Sin(), new Tan(), new Acos(), new Asin(), new Atan(),
            new Inverse(), new Abs(), new Sqrt(), new Cbrt(), new Ceil(),
            new Floor(), new Rint(), new Signum(), new Ulp()
        };
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testMap() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r37vjl1vtz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testMap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r37vjl1vtz(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87911);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87912);final UnivariateFunction[] functions = createFunctions();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87913);for (UnivariateFunction f : functions) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87914);doTestMapFunction(f, false);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testMapToSelf() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1khtnc81vu3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testMapToSelf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1khtnc81vu3(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87915);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87916);final UnivariateFunction[] functions = createFunctions();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87917);for (UnivariateFunction f : functions) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87918);doTestMapFunction(f, true);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestOuterProduct(final boolean mixed) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87919);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87920);final double[] dataU = values;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87921);final RealVector u = create(dataU);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87922);final double[] dataV = new double[values.length + 3];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87923);System.arraycopy(values, 0, dataV, 0, values.length);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87924);dataV[values.length] = 1d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87925);dataV[values.length] = -2d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87926);dataV[values.length] = 3d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87927);final RealVector v;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87928);if ((((mixed)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87929)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87930)==0&false))) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87931);v = createAlien(dataV);
        } }else {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87932);v = create(dataV);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87933);final RealMatrix uv = u.outerProduct(v);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87934);Assert.assertEquals("number of rows", dataU.length, uv
            .getRowDimension());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87935);Assert.assertEquals("number of columns", dataV.length, uv
            .getColumnDimension());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87936);for (int i = 0; (((i < dataU.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87937)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87938)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87939);for (int j = 0; (((j < dataV.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87940)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87941)==0&false)); j++) {{
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87942);final double expected = dataU[i] * dataV[j];
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87943);final double actual = uv.getEntry(i, j);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87944);Assert.assertEquals(dataU[i] + " * " + dataV[j], expected, actual, 0d);
            }
        }}
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testOuterProductSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vewz651vux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testOuterProductSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vewz651vux(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87945);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87946);doTestOuterProduct(false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testOuterProductMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_193hrnv1vuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testOuterProductMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_193hrnv1vuz(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87947);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87948);doTestOuterProduct(true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestProjection(final boolean mixed) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87949);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87950);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87951);final double[] data1 = {
            x, 1d, x, x, 2d, x, x, x, 3d, x, x, x, x
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87952);final double[] data2 = {
            5d, -6d, 7d, x, x, -8d, -9d, 10d, 11d, x, 12d, 13d, -15d
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87953);double dotProduct = 0d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87954);double norm2 = 0d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87955);for (int i = 0; (((i < data1.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87956)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87957)==0&false)); i++){{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87958);dotProduct += data1[i] * data2[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87959);norm2 += data2[i] * data2[i];
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87960);final double s = dotProduct / norm2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87961);final double[] expected = new double[data1.length];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87962);for (int i = 0; (((i < data2.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87963)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87964)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87965);expected[i] = s * data2[i];
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87966);final RealVector v1 = create(data1);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87967);final RealVector v2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87968);if ((((mixed)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87969)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87970)==0&false))) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87971);v2 = createAlien(data2);
        } }else {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87972);v2 = create(data2);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(87973);final RealVector actual = v1.projection(v2);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87974);TestUtils.assertEquals("", expected, actual, 0d);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testProjectionSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mf9caw1vvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testProjectionSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mf9caw1vvr(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87975);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87976);doTestProjection(false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testProjectionMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z1b0g61vvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testProjectionMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z1b0g61vvt(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87977);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87978);doTestProjection(true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = MathArithmeticException.class)
    public void testProjectionNullVector() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y63aby1vvv();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,111,106,101,99,116,105,111,110,78,117,108,108,86,101,99,116,111,114,58,32,91,77,97,116,104,65,114,105,116,104,109,101,116,105,99,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathArithmeticException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testProjectionNullVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y63aby1vvv(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87979);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87980);create(new double[4]).projection(create(new double[4]));
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testProjectionDimensionMismatch() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjyf5y1vvx();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,111,106,101,99,116,105,111,110,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testProjectionDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjyf5y1vvx(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87981);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87982);final RealVector v1 = create(new double[4]);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87983);final RealVector v2 = create(new double[5]);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87984);v2.set(1.0);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87985);v1.projection(v2);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testSet() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143b3qv1vw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143b3qv1vw2(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87986);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87987);for (int i = 0; (((i < values.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87988)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87989)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87990);final double expected = values[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87991);final RealVector v = create(values);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87992);v.set(expected);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(87993);for (int j = 0; (((j < values.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87994)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(87995)==0&false)); j++) {{
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(87996);Assert.assertEquals("entry #" + j, expected, v.getEntry(j), 0);
            }
        }}
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testToArray() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),87997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ru2nar1vwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testToArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ru2nar1vwd(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(87997);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87998);final double[] data = create(values).toArray();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(87999);Assert.assertNotSame(values, data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88000);for (int i = 0; (((i < values.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88001)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88002)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88003);Assert.assertEquals("entry #" + i, values[i], data[i], 0);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestUnitVector(final boolean inPlace) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88004);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88005);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88006);final double[] data = {
            x, 1d, x, x, 2d, x, x, x, 3d, x, x, x, x
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88007);double norm = 0d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88008);for (int i = 0; (((i < data.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88009)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88010)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88011);norm += data[i] * data[i];
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88012);norm = FastMath.sqrt(norm);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88013);final double[] expected = new double[data.length];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88014);for (int i = 0; (((i < expected.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88015)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88016)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88017);expected[i] = data[i] / norm;
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88018);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88019);final RealVector actual;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88020);if ((((inPlace)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88021)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88022)==0&false))) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88023);v.unitize();
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88024);actual = v;
        } }else {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88025);actual = v.unitVector();
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88026);Assert.assertNotSame(v, actual);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88027);TestUtils.assertEquals("", expected, actual, 0d);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testUnitVector() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xab9s01vx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testUnitVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xab9s01vx8(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88028);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88029);doTestUnitVector(false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testUnitize() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xyttzv1vxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testUnitize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xyttzv1vxa(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88030);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88031);doTestUnitVector(true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestUnitVectorNullVector(final boolean inPlace) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88032);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88033);final double[] data = {
            0d, 0d, 0d, 0d, 0d
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88034);if ((((inPlace)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88035)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88036)==0&false))) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88037);create(data).unitize();
        } }else {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88038);create(data).unitVector();
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected=ArithmeticException.class)
    public void testUnitVectorNullVector() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jwn0q1vxj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,85,110,105,116,86,101,99,116,111,114,78,117,108,108,86,101,99,116,111,114,58,32,91,65,114,105,116,104,109,101,116,105,99,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ArithmeticException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testUnitVectorNullVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jwn0q1vxj(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88039);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88040);doTestUnitVectorNullVector(false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected=ArithmeticException.class)
    public void testUnitizeNullVector() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tjhnu71vxl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,85,110,105,116,105,122,101,78,117,108,108,86,101,99,116,111,114,58,32,91,65,114,105,116,104,109,101,116,105,99,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ArithmeticException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testUnitizeNullVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tjhnu71vxl(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88041);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88042);doTestUnitVectorNullVector(true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testIterator() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9uicn1vxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testIterator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9uicn1vxn(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88043);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88044);final RealVector v = create(values);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88045);final Iterator<RealVector.Entry> it = v.iterator();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88046);for (int i = 0; (((i < values.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88047)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88048)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88049);Assert.assertTrue("entry #" + i, it.hasNext());
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88050);final RealVector.Entry e = it.next();
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88051);Assert.assertEquals("", i, e.getIndex());
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88052);Assert.assertEquals("", values[i], e.getValue(), 0d);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88053);try {
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88054);it.remove();
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88055);Assert.fail("UnsupportedOperationException should have been thrown");
            } catch (UnsupportedOperationException exc) {
                // Expected behavior
            }
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88056);Assert.assertFalse(it.hasNext());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88057);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88058);it.next();
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88059);Assert.fail("NoSuchElementException should have been thrown");
        } catch (NoSuchElementException e) {
            // Expected behavior
        }
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestCombine(final boolean inPlace, final boolean mixed) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88060);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88061);final int n = values.length * values.length;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88062);final double[] data1 = new double[n];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88063);final double[] data2 = new double[n];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88064);for (int i = 0; (((i < values.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88065)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88066)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88067);for (int j = 0; (((j < values.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88068)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88069)==0&false)); j++) {{
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88070);final int index = values.length * i + j;
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88071);data1[index] = values[i];
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88072);data2[index] = values[j];
            }
        }}
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88073);final RealVector v1 = create(data1);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88074);final RealVector v2 = (((mixed )&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88075)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88076)==0&false))? createAlien(data2) : create(data2);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88077);final double[] expected = new double[n];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88078);for (int i = 0; (((i < values.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88079)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88080)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88081);final double a1 = values[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88082);for (int j = 0; (((j < values.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88083)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88084)==0&false)); j++) {{
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88085);final double a2 = values[j];
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88086);for (int k = 0; (((k < n)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88087)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88088)==0&false)); k++) {{
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(88089);expected[k] = a1 * data1[k] + a2 * data2[k];
                }
                }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88090);final RealVector actual;
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88091);if ((((inPlace)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88092)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88093)==0&false))) {{
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(88094);final RealVector v1bis = v1.copy();
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(88095);actual = v1bis.combineToSelf(a1, a2, v2);
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(88096);Assert.assertSame(v1bis, actual);
                } }else {{
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(88097);actual = v1.combine(a1, a2, v2);
                }
                }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88098);TestUtils.assertEquals("a1 = " + a1 + ", a2 = " + a2, expected,
                    actual, 0.);
            }
        }}
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestCombineDimensionMismatch(final boolean inPlace, final boolean mixed) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88099);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88100);final RealVector v1 = create(new double[10]);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88101);final RealVector v2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88102);if ((((mixed)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88103)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88104)==0&false))) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88105);v2 = createAlien(new double[15]);
        } }else {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88106);v2 = create(new double[15]);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88107);if ((((inPlace)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88108)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88109)==0&false))) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88110);v1.combineToSelf(1.0, 1.0, v2);
        } }else {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88111);v1.combine(1.0, 1.0, v2);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testCombineSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bigk441vzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bigk441vzk(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88112);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88113);doTestCombine(false, false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testCombineMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18zhe3y1vzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18zhe3y1vzm(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88114);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88115);doTestCombine(false, true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testCombineDimensionMismatchSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikqimm1vzo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,98,105,110,101,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,83,97,109,101,84,121,112,101,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineDimensionMismatchSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikqimm1vzo(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88116);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88117);doTestCombineDimensionMismatch(false, false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testCombineDimensionMismatchMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uunq301vzq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,98,105,110,101,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,77,105,120,101,100,84,121,112,101,115,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineDimensionMismatchMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uunq301vzq(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88118);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88119);doTestCombineDimensionMismatch(false, true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testCombineToSelfSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1563ej1vzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1563ej1vzs(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88120);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88121);doTestCombine(true, false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testCombineToSelfMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ziz5l1vzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ziz5l1vzu(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88122);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88123);doTestCombine(true, true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testCombineToSelfDimensionMismatchSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j1h8sn1vzw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,98,105,110,101,84,111,83,101,108,102,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,83,97,109,101,84,121,112,101,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfDimensionMismatchSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j1h8sn1vzw(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88124);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88125);doTestCombineDimensionMismatch(true, false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testCombineToSelfDimensionMismatchMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfo4u31vzy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,98,105,110,101,84,111,83,101,108,102,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,77,105,120,101,100,84,121,112,101,115,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfDimensionMismatchMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfo4u31vzy(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88126);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88127);doTestCombineDimensionMismatch(true, true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testCopy() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukax6a1w00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukax6a1w00(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88128);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88129);final RealVector v = create(values);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88130);final RealVector w = v.copy();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88131);Assert.assertNotSame(v, w);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88132);TestUtils.assertEquals("", values, w, 0d);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestDotProductRegularValues(final boolean mixed) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88133);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88134);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88135);final double[] data1 = {
            x, 1d, x, x, 2d, x, x, x, 3d, x, x, x, x
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88136);final double[] data2 = {
            5d, -6d, 7d, x, x, -8d, -9d, 10d, 11d, x, 12d, 13d, -15d
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88137);double expected = 0d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88138);for (int i = 0; (((i < data1.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88139)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88140)==0&false)); i++){{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88141);expected += data1[i] * data2[i];
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88142);final RealVector v1 = create(data1);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88143);final RealVector v2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88144);if ((((mixed)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88145)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88146)==0&false))) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88147);v2 = createAlien(data2);
        } }else {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88148);v2 = create(data2);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88149);final double actual = v1.dotProduct(v2);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88150);Assert.assertEquals("", expected, actual, 0d);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestDotProductSpecialValues(final boolean mixed) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88151);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88152);for (int i = 0; (((i < values.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88153)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88154)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88155);final double[] data1 = {
                values[i]
            };
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88156);final RealVector v1 = create(data1);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88157);for (int j = 0; (((j < values.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88158)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88159)==0&false)); j++) {{
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88160);final double[] data2 = {
                    values[j]
                };
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88161);final RealVector v2;
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88162);if ((((mixed)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88163)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88164)==0&false))) {{
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(88165);v2 = createAlien(data2);
                } }else {{
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(88166);v2 = create(data2);
                }
                }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88167);final double expected = data1[0] * data2[0];
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88168);final double actual = v1.dotProduct(v2);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88169);Assert.assertEquals(data1[0] + " * " + data2[0], expected,
                    actual, 0d);
            }
        }}
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestDotProductDimensionMismatch(final boolean mixed) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88170);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88171);final double[] data1 = new double[10];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88172);final double[] data2 = new double[data1.length + 1];
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88173);final RealVector v1 = create(data1);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88174);final RealVector v2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88175);if ((((mixed)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88176)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88177)==0&false))) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88178);v2 = createAlien(data2);
        } }else {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88179);v2 = create(data2);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88180);v1.dotProduct(v2);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testDotProductSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_158gjep1w1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testDotProductSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_158gjep1w1h(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88181);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88182);doTestDotProductRegularValues(false);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88183);doTestDotProductSpecialValues(false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testDotProductDimensionMismatchSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n3mif11w1k();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,111,116,80,114,111,100,117,99,116,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,83,97,109,101,84,121,112,101,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testDotProductDimensionMismatchSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n3mif11w1k(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88184);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88185);doTestDotProductDimensionMismatch(false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testDotProductMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kfk1a51w1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testDotProductMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kfk1a51w1m(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88186);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88187);doTestDotProductRegularValues(true);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88188);doTestDotProductSpecialValues(true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testDotProductDimensionMismatchMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u2qakf1w1p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,111,116,80,114,111,100,117,99,116,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,77,105,120,101,100,84,121,112,101,115,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testDotProductDimensionMismatchMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u2qakf1w1p(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88189);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88190);doTestDotProductDimensionMismatch(true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    private void doTestCosine(final boolean mixed) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88191);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88192);final double x = getPreferredEntryValue();
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88193);final double[] data1 = {
            x, 1d, x, x, 2d, x, x, x, 3d, x, x, x, x
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88194);final double[] data2 = {
            5d, -6d, 7d, x, x, -8d, -9d, 10d, 11d, x, 12d, 13d, -15d
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88195);double norm1 = 0d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88196);double norm2 = 0d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88197);double dotProduct = 0d;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88198);for (int i = 0; (((i < data1.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88199)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88200)==0&false)); i++){{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88201);norm1 += data1[i] * data1[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88202);norm2 += data2[i] * data2[i];
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88203);dotProduct += data1[i] * data2[i];
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88204);norm1 = FastMath.sqrt(norm1);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88205);norm2 = FastMath.sqrt(norm2);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88206);final double expected = dotProduct / (norm1 * norm2);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88207);final RealVector v1 = create(data1);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88208);final RealVector v2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88209);if ((((mixed)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88210)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88211)==0&false))) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88212);v2 = createAlien(data2);
        } }else {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88213);v2 = create(data2);
        }
        }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88214);final double actual = v1.cosine(v2);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88215);Assert.assertEquals("", expected, actual, 0d);

    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testCosineSameType() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c32u421w2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCosineSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c32u421w2g(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88216);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88217);doTestCosine(false);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testCosineMixedTypes() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qtoxe81w2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCosineMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qtoxe81w2i(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88218);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88219);doTestCosine(true);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected=MathArithmeticException.class)
    public void testCosineLeftNullVector() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcfcwt1w2k();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,115,105,110,101,76,101,102,116,78,117,108,108,86,101,99,116,111,114,58,32,91,77,97,116,104,65,114,105,116,104,109,101,116,105,99,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathArithmeticException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCosineLeftNullVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcfcwt1w2k(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88220);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88221);final RealVector v = create(new double[] {0, 0, 0});
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88222);final RealVector w = create(new double[] {1, 0, 0});
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88223);v.cosine(w);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected=MathArithmeticException.class)
    public void testCosineRightNullVector() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yo2le1w2o();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,115,105,110,101,82,105,103,104,116,78,117,108,108,86,101,99,116,111,114,58,32,91,77,97,116,104,65,114,105,116,104,109,101,116,105,99,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathArithmeticException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCosineRightNullVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yo2le1w2o(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88224);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88225);final RealVector v = create(new double[] {0, 0, 0});
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88226);final RealVector w = create(new double[] {1, 0, 0});
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88227);w.cosine(v);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testCosineDimensionMismatch() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12215lc1w2s();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,115,105,110,101,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testCosineDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12215lc1w2s(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88228);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88229);final RealVector v = create(new double[] {1, 2, 3});
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88230);final RealVector w = create(new double[] {1, 2, 3, 4});
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88231);v.cosine(w);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6081w2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6081w2w(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88232);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88233);final RealVector v = create(new double[] { 0, 1, 2 });

        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88234);Assert.assertTrue(v.equals(v));
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88235);Assert.assertTrue(v.equals(v.copy()));
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88236);Assert.assertFalse(v.equals(null));
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88237);Assert.assertFalse(v.equals(v.getSubVector(0, v.getDimension() - 1)));
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88238);Assert.assertTrue(v.equals(v.getSubVector(0, v.getDimension())));
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testSerial()  {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv1w33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv1w33(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88239);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88240);RealVector v = create(new double[] { 0, 1, 2 });
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88241);Assert.assertEquals(v,TestUtils.serializeAndRecover(v));
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    @Test
    public void testMinMax() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s543111w36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testMinMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s543111w36(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88242);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88243);final RealVector v1 = create(new double[] {0, -6, 4, 12, 7});
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88244);Assert.assertEquals(1, v1.getMinIndex());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88245);Assert.assertEquals(-6, v1.getMinValue(), 1.0e-12);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88246);Assert.assertEquals(3, v1.getMaxIndex());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88247);Assert.assertEquals(12, v1.getMaxValue(), 1.0e-12);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88248);final RealVector v2 = create(new double[] {Double.NaN, 3, Double.NaN, -2});
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88249);Assert.assertEquals(3, v2.getMinIndex());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88250);Assert.assertEquals(-2, v2.getMinValue(), 1.0e-12);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88251);Assert.assertEquals(1, v2.getMaxIndex());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88252);Assert.assertEquals(3, v2.getMaxValue(), 1.0e-12);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88253);final RealVector v3 = create(new double[] {Double.NaN, Double.NaN});
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88254);Assert.assertEquals(-1, v3.getMinIndex());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88255);Assert.assertTrue(Double.isNaN(v3.getMinValue()));
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88256);Assert.assertEquals(-1, v3.getMaxIndex());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88257);Assert.assertTrue(Double.isNaN(v3.getMaxValue()));
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88258);final RealVector v4 = create(new double[0]);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88259);Assert.assertEquals(-1, v4.getMinIndex());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88260);Assert.assertTrue(Double.isNaN(v4.getMinValue()));
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88261);Assert.assertEquals(-1, v4.getMaxIndex());
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88262);Assert.assertTrue(Double.isNaN(v4.getMaxValue()));
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /*
     * TESTS OF THE VISITOR PATTERN
     */

    /** The whole vector is visited. */
    @Test
    public void testWalkInDefaultOrderPreservingVisitor1() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fo2co01w3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderPreservingVisitor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fo2co01w3r(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88263);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88264);final double[] data = new double[] {
            0d, 1d, 0d, 0d, 2d, 0d, 0d, 0d, 3d
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88265);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88266);final RealVectorPreservingVisitor visitor;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88267);visitor = new RealVectorPreservingVisitor() {

            private int expectedIndex;

            public void visit(final int actualIndex, final double actualValue) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88268);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88269);Assert.assertEquals(expectedIndex, actualIndex);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88270);Assert.assertEquals(Integer.toString(actualIndex),
                                    data[actualIndex], actualValue, 0d);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88271);++expectedIndex;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public void start(final int actualSize, final int actualStart,
                              final int actualEnd) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88272);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88273);Assert.assertEquals(data.length, actualSize);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88274);Assert.assertEquals(0, actualStart);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88275);Assert.assertEquals(data.length - 1, actualEnd);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88276);expectedIndex = 0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public double end() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88277);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88278);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88279);v.walkInDefaultOrder(visitor);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /** Visiting an invalid subvector. */
    @Test
    public void testWalkInDefaultOrderPreservingVisitor2() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cf2dvj1w48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderPreservingVisitor2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cf2dvj1w48(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88280);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88281);final RealVector v = create(new double[5]);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88282);final RealVectorPreservingVisitor visitor;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88283);visitor = new RealVectorPreservingVisitor() {

            public void visit(int index, double value) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88284);
                // Do nothing
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public void start(int dimension, int start, int end) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88285);
                // Do nothing
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public double end() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88286);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88287);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88288);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88289);v.walkInDefaultOrder(visitor, -1, 4);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88290);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88291);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88292);v.walkInDefaultOrder(visitor, 5, 4);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88293);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88294);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88295);v.walkInDefaultOrder(visitor, 0, -1);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88296);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88297);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88298);v.walkInDefaultOrder(visitor, 0, 5);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88299);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88300);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88301);v.walkInDefaultOrder(visitor, 4, 0);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88302);Assert.fail();
        } catch (NumberIsTooSmallException e) {
            // Expected behavior
        }
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /** Visiting a valid subvector. */
    @Test
    public void testWalkInDefaultOrderPreservingVisitor3() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1962f321w4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderPreservingVisitor3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1962f321w4v(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88303);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88304);final double[] data = new double[] {
            0d, 1d, 0d, 0d, 2d, 0d, 0d, 0d, 3d
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88305);final int expectedStart = 2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88306);final int expectedEnd = 7;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88307);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88308);final RealVectorPreservingVisitor visitor;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88309);visitor = new RealVectorPreservingVisitor() {

            private int expectedIndex;

            public void visit(final int actualIndex, final double actualValue) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88310);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88311);Assert.assertEquals(expectedIndex, actualIndex);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88312);Assert.assertEquals(Integer.toString(actualIndex),
                                    data[actualIndex], actualValue, 0d);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88313);++expectedIndex;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public void start(final int actualSize, final int actualStart,
                              final int actualEnd) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88314);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88315);Assert.assertEquals(data.length, actualSize);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88316);Assert.assertEquals(expectedStart, actualStart);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88317);Assert.assertEquals(expectedEnd, actualEnd);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88318);expectedIndex = expectedStart;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public double end() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88319);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88320);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88321);v.walkInDefaultOrder(visitor, expectedStart, expectedEnd);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /** The whole vector is visited. */
    @Test
    public void testWalkInOptimizedOrderPreservingVisitor1() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dad5ru1w5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderPreservingVisitor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dad5ru1w5e(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88322);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88323);final double[] data = new double[] {
            0d, 1d, 0d, 0d, 2d, 0d, 0d, 0d, 3d
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88324);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88325);final RealVectorPreservingVisitor visitor;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88326);visitor = new RealVectorPreservingVisitor() {
            private final boolean[] visited = new boolean[data.length];

            public void visit(final int actualIndex, final double actualValue) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88327);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88328);visited[actualIndex] = true;
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88329);Assert.assertEquals(Integer.toString(actualIndex),
                                    data[actualIndex], actualValue, 0d);
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public void start(final int actualSize, final int actualStart,
                              final int actualEnd) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88330);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88331);Assert.assertEquals(data.length, actualSize);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88332);Assert.assertEquals(0, actualStart);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88333);Assert.assertEquals(data.length - 1, actualEnd);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88334);Arrays.fill(visited, false);
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public double end() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88335);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88336);for (int i = 0; (((i < data.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88337)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88338)==0&false)); i++) {{
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(88339);Assert.assertTrue("entry " + i + "has not been visited",
                                      visited[i]);
                }
                }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88340);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88341);v.walkInOptimizedOrder(visitor);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /** Visiting an invalid subvector. */
    @Test
    public void testWalkInOptimizedOrderPreservingVisitor2() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gjd4kb1w5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderPreservingVisitor2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gjd4kb1w5y(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88342);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88343);final RealVector v = create(new double[5]);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88344);final RealVectorPreservingVisitor visitor;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88345);visitor = new RealVectorPreservingVisitor() {

            public void visit(int index, double value) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88346);
                // Do nothing
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public void start(int dimension, int start, int end) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88347);
                // Do nothing
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public double end() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88348);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88349);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88350);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88351);v.walkInOptimizedOrder(visitor, -1, 4);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88352);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88353);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88354);v.walkInOptimizedOrder(visitor, 5, 4);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88355);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88356);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88357);v.walkInOptimizedOrder(visitor, 0, -1);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88358);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88359);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88360);v.walkInOptimizedOrder(visitor, 0, 5);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88361);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88362);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88363);v.walkInOptimizedOrder(visitor, 4, 0);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88364);Assert.fail();
        } catch (NumberIsTooSmallException e) {
            // Expected behavior
        }
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /** Visiting a valid subvector. */
    @Test
    public void testWalkInOptimizedOrderPreservingVisitor3() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jsd3cs1w6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderPreservingVisitor3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jsd3cs1w6l(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88365);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88366);final double[] data = new double[] {
            0d, 1d, 0d, 0d, 2d, 0d, 0d, 0d, 3d
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88367);final int expectedStart = 2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88368);final int expectedEnd = 7;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88369);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88370);final RealVectorPreservingVisitor visitor;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88371);visitor = new RealVectorPreservingVisitor() {
            private final boolean[] visited = new boolean[data.length];

            public void visit(final int actualIndex, final double actualValue) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88372);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88373);Assert.assertEquals(Integer.toString(actualIndex),
                                    data[actualIndex], actualValue, 0d);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88374);visited[actualIndex] = true;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public void start(final int actualSize, final int actualStart,
                              final int actualEnd) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88375);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88376);Assert.assertEquals(data.length, actualSize);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88377);Assert.assertEquals(expectedStart, actualStart);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88378);Assert.assertEquals(expectedEnd, actualEnd);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88379);Arrays.fill(visited, true);
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public double end() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88380);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88381);for (int i = expectedStart; (((i <= expectedEnd)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88382)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88383)==0&false)); i++) {{
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(88384);Assert.assertTrue("entry " + i + "has not been visited",
                                      visited[i]);
                }
                }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88385);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88386);v.walkInOptimizedOrder(visitor, expectedStart, expectedEnd);
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /** The whole vector is visited. */
    @Test
    public void testWalkInDefaultOrderChangingVisitor1() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186s8781w77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderChangingVisitor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186s8781w77(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88387);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88388);final double[] data = new double[] {
            0d, 1d, 0d, 0d, 2d, 0d, 0d, 0d, 3d
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88389);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88390);final RealVectorChangingVisitor visitor;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88391);visitor = new RealVectorChangingVisitor() {

            private int expectedIndex;

            public double visit(final int actualIndex, final double actualValue) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88392);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88393);Assert.assertEquals(expectedIndex, actualIndex);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88394);Assert.assertEquals(Integer.toString(actualIndex),
                                    data[actualIndex], actualValue, 0d);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88395);++expectedIndex;
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88396);return actualIndex + actualValue;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public void start(final int actualSize, final int actualStart,
                              final int actualEnd) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88397);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88398);Assert.assertEquals(data.length, actualSize);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88399);Assert.assertEquals(0, actualStart);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88400);Assert.assertEquals(data.length - 1, actualEnd);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88401);expectedIndex = 0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public double end() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88402);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88403);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88404);v.walkInDefaultOrder(visitor);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88405);for (int i = 0; (((i < data.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88406)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88407)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88408);Assert.assertEquals("entry " + i, i + data[i], v.getEntry(i), 0.0);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /** Visiting an invalid subvector. */
    @Test
    public void testWalkInDefaultOrderChangingVisitor2() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bfs6zp1w7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderChangingVisitor2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bfs6zp1w7t(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88409);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88410);final RealVector v = create(new double[5]);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88411);final RealVectorChangingVisitor visitor;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88412);visitor = new RealVectorChangingVisitor() {

            public double visit(int index, double value) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88413);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88414);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public void start(int dimension, int start, int end) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88415);
                // Do nothing
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public double end() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88416);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88417);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88418);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88419);v.walkInDefaultOrder(visitor, -1, 4);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88420);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88421);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88422);v.walkInDefaultOrder(visitor, 5, 4);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88423);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88424);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88425);v.walkInDefaultOrder(visitor, 0, -1);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88426);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88427);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88428);v.walkInDefaultOrder(visitor, 0, 5);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88429);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88430);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88431);v.walkInDefaultOrder(visitor, 4, 0);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88432);Assert.fail();
        } catch (NumberIsTooSmallException e) {
            // Expected behavior
        }
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /** Visiting a valid subvector. */
    @Test
    public void testWalkInDefaultOrderChangingVisitor3() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eos5s61w8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderChangingVisitor3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eos5s61w8h(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88433);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88434);final double[] data = new double[] {
            0d, 1d, 0d, 0d, 2d, 0d, 0d, 0d, 3d
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88435);final int expectedStart = 2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88436);final int expectedEnd = 7;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88437);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88438);final RealVectorChangingVisitor visitor;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88439);visitor = new RealVectorChangingVisitor() {

            private int expectedIndex;

            public double visit(final int actualIndex, final double actualValue) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88440);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88441);Assert.assertEquals(expectedIndex, actualIndex);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88442);Assert.assertEquals(Integer.toString(actualIndex),
                                    data[actualIndex], actualValue, 0d);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88443);++expectedIndex;
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88444);return actualIndex + actualValue;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public void start(final int actualSize, final int actualStart,
                              final int actualEnd) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88445);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88446);Assert.assertEquals(data.length, actualSize);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88447);Assert.assertEquals(expectedStart, actualStart);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88448);Assert.assertEquals(expectedEnd, actualEnd);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88449);expectedIndex = expectedStart;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public double end() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88450);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88451);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88452);v.walkInDefaultOrder(visitor, expectedStart, expectedEnd);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88453);for (int i = expectedStart; (((i <= expectedEnd)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88454)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88455)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88456);Assert.assertEquals("entry " + i, i + data[i], v.getEntry(i), 0.0);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /** The whole vector is visited. */
    @Test
    public void testWalkInOptimizedOrderChangingVisitor1() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yb5tzy1w95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderChangingVisitor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yb5tzy1w95(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88457);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88458);final double[] data = new double[] {
            0d, 1d, 0d, 0d, 2d, 0d, 0d, 0d, 3d
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88459);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88460);final RealVectorChangingVisitor visitor;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88461);visitor = new RealVectorChangingVisitor() {
            private final boolean[] visited = new boolean[data.length];

            public double visit(final int actualIndex, final double actualValue) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88462);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88463);visited[actualIndex] = true;
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88464);Assert.assertEquals(Integer.toString(actualIndex),
                                    data[actualIndex], actualValue, 0d);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88465);return actualIndex + actualValue;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public void start(final int actualSize, final int actualStart,
                              final int actualEnd) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88466);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88467);Assert.assertEquals(data.length, actualSize);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88468);Assert.assertEquals(0, actualStart);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88469);Assert.assertEquals(data.length - 1, actualEnd);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88470);Arrays.fill(visited, false);
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public double end() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88471);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88472);for (int i = 0; (((i < data.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88473)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88474)==0&false)); i++) {{
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(88475);Assert.assertTrue("entry " + i + "has not been visited",
                                      visited[i]);
                }
                }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88476);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88477);v.walkInOptimizedOrder(visitor);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88478);for (int i = 0; (((i < data.length)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88479)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88480)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88481);Assert.assertEquals("entry " + i, i + data[i], v.getEntry(i), 0.0);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /** Visiting an invalid subvector. */
    @Test
    public void testWalkInOptimizedOrderChangingVisitor2() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xgy96p1w9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderChangingVisitor2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xgy96p1w9u(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88482);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88483);final RealVector v = create(new double[5]);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88484);final RealVectorChangingVisitor visitor;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88485);visitor = new RealVectorChangingVisitor() {

            public double visit(int index, double value) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88486);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88487);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public void start(int dimension, int start, int end) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88488);
                // Do nothing
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public double end() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88489);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88490);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88491);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88492);v.walkInOptimizedOrder(visitor, -1, 4);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88493);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88494);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88495);v.walkInOptimizedOrder(visitor, 5, 4);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88496);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88497);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88498);v.walkInOptimizedOrder(visitor, 0, -1);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88499);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88500);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88501);v.walkInOptimizedOrder(visitor, 0, 5);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88502);Assert.fail();
        } catch (OutOfRangeException e) {
            // Expected behavior
        }
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88503);try {
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88504);v.walkInOptimizedOrder(visitor, 4, 0);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88505);Assert.fail();
        } catch (NumberIsTooSmallException e) {
            // Expected behavior
        }
    }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /** Visiting a valid subvector. */
    @Test
    public void testWalkInOptimizedOrderChangingVisitor3() {__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceStart(getClass().getName(),88506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7yae81wai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11vg71vg7lb90pdbg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11vg71vg7lb90pdbg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderChangingVisitor3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7yae81wai(){try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88506);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88507);final double[] data = new double[] {
            0d, 1d, 0d, 0d, 2d, 0d, 0d, 0d, 3d
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88508);final int expectedStart = 2;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88509);final int expectedEnd = 7;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88510);final RealVector v = create(data);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88511);final RealVectorChangingVisitor visitor;
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88512);visitor = new RealVectorChangingVisitor() {
            private final boolean[] visited = new boolean[data.length];

            public double visit(final int actualIndex, final double actualValue) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88513);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88514);Assert.assertEquals(Integer.toString(actualIndex),
                                    data[actualIndex], actualValue, 0d);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88515);visited[actualIndex] = true;
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88516);return actualIndex + actualValue;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public void start(final int actualSize, final int actualStart,
                              final int actualEnd) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88517);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88518);Assert.assertEquals(data.length, actualSize);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88519);Assert.assertEquals(expectedStart, actualStart);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88520);Assert.assertEquals(expectedEnd, actualEnd);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88521);Arrays.fill(visited, true);
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

            public double end() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88522);
                __CLR4_4_11vg71vg7lb90pdbg.R.inc(88523);for (int i = expectedStart; (((i <= expectedEnd)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88524)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88525)==0&false)); i++) {{
                    __CLR4_4_11vg71vg7lb90pdbg.R.inc(88526);Assert.assertTrue("entry " + i + "has not been visited",
                                      visited[i]);
                }
                }__CLR4_4_11vg71vg7lb90pdbg.R.inc(88527);return 0.0;
            }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}
        };
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88528);v.walkInOptimizedOrder(visitor, expectedStart, expectedEnd);
        __CLR4_4_11vg71vg7lb90pdbg.R.inc(88529);for (int i = expectedStart; (((i <= expectedEnd)&&(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88530)!=0|true))||(__CLR4_4_11vg71vg7lb90pdbg.R.iget(88531)==0&false)); i++) {{
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88532);Assert.assertEquals("entry " + i, i + data[i], v.getEntry(i), 0.0);
        }
    }}finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

    /**
     * Minimal implementation of the {@link RealVector} abstract class, for
     * mixed types unit tests.
     */
    public static class RealVectorTestImpl extends RealVector
        implements Serializable {

        /** Serializable version identifier. */
        private static final long serialVersionUID = 20120706L;

        /** Entries of the vector. */
        protected double data[];

        public RealVectorTestImpl(double[] d) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88533);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88534);data = d.clone();
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

        private UnsupportedOperationException unsupported() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88535);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88536);return new UnsupportedOperationException("Not supported, unneeded for test purposes");
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

        @Override
        public RealVector copy() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88537);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88538);return new RealVectorTestImpl(data);
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

        @Override
        public RealVector ebeMultiply(RealVector v) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88539);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88540);throw unsupported();
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

        @Override
        public RealVector ebeDivide(RealVector v) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88541);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88542);throw unsupported();
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

        @Override
        public double getEntry(int index) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88543);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88544);checkIndex(index);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88545);return data[index];
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

        @Override
        public int getDimension() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88546);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88547);return data.length;
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

        @Override
        public RealVector append(RealVector v) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88548);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88549);throw unsupported();
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

        @Override
        public RealVector append(double d) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88550);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88551);throw unsupported();
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

        @Override
        public RealVector getSubVector(int index, int n) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88552);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88553);throw unsupported();
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

        @Override
        public void setEntry(int index, double value) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88554);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88555);checkIndex(index);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88556);data[index] = value;
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

        @Override
        public void setSubVector(int index, RealVector v) {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88557);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88558);throw unsupported();
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

        @Override
        public boolean isNaN() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88559);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88560);throw unsupported();
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}

        @Override
        public boolean isInfinite() {try{__CLR4_4_11vg71vg7lb90pdbg.R.inc(88561);
            __CLR4_4_11vg71vg7lb90pdbg.R.inc(88562);throw unsupported();
        }finally{__CLR4_4_11vg71vg7lb90pdbg.R.flushNeeded();}}
    }
}
