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
package org.apache.commons.math3.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link CombinatoricsUtils} class.
 *
 * @version $Id: $
 */
public class CombinatoricsUtilsTest {static class __CLR4_4_12eik2eiklb90pexf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,112388,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** cached binomial coefficients */
    private static final List<Map<Integer, Long>> binomialCache = new ArrayList<Map<Integer, Long>>();

    /** Verify that b(0,0) = 1 */
    @Test
    public void test0Choose0() {__CLR4_4_12eik2eiklb90pexf.R.globalSliceStart(getClass().getName(),112124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r96i8u2eik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eik2eiklb90pexf.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eik2eiklb90pexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.CombinatoricsUtilsTest.test0Choose0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r96i8u2eik(){try{__CLR4_4_12eik2eiklb90pexf.R.inc(112124);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112125);Assert.assertEquals(CombinatoricsUtils.binomialCoefficientDouble(0, 0), 1d, 0);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112126);Assert.assertEquals(CombinatoricsUtils.binomialCoefficientLog(0, 0), 0d, 0);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112127);Assert.assertEquals(CombinatoricsUtils.binomialCoefficient(0, 0), 1);
    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}

    @Test
    public void testBinomialCoefficient() {__CLR4_4_12eik2eiklb90pexf.R.globalSliceStart(getClass().getName(),112128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdc9kr2eio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eik2eiklb90pexf.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eik2eiklb90pexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.CombinatoricsUtilsTest.testBinomialCoefficient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdc9kr2eio(){try{__CLR4_4_12eik2eiklb90pexf.R.inc(112128);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112129);long[] bcoef5 = {
            1,
            5,
            10,
            10,
            5,
            1 };
        __CLR4_4_12eik2eiklb90pexf.R.inc(112130);long[] bcoef6 = {
            1,
            6,
            15,
            20,
            15,
            6,
            1 };
        __CLR4_4_12eik2eiklb90pexf.R.inc(112131);for (int i = 0; (((i < 6)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112132)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112133)==0&false)); i++) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112134);Assert.assertEquals("5 choose " + i, bcoef5[i], CombinatoricsUtils.binomialCoefficient(5, i));
        }
        }__CLR4_4_12eik2eiklb90pexf.R.inc(112135);for (int i = 0; (((i < 7)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112136)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112137)==0&false)); i++) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112138);Assert.assertEquals("6 choose " + i, bcoef6[i], CombinatoricsUtils.binomialCoefficient(6, i));
        }

        }__CLR4_4_12eik2eiklb90pexf.R.inc(112139);for (int n = 1; (((n < 10)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112140)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112141)==0&false)); n++) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112142);for (int k = 0; (((k <= n)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112143)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112144)==0&false)); k++) {{
                __CLR4_4_12eik2eiklb90pexf.R.inc(112145);Assert.assertEquals(n + " choose " + k, binomialCoefficient(n, k), CombinatoricsUtils.binomialCoefficient(n, k));
                __CLR4_4_12eik2eiklb90pexf.R.inc(112146);Assert.assertEquals(n + " choose " + k, binomialCoefficient(n, k), CombinatoricsUtils.binomialCoefficientDouble(n, k), Double.MIN_VALUE);
                __CLR4_4_12eik2eiklb90pexf.R.inc(112147);Assert.assertEquals(n + " choose " + k, FastMath.log(binomialCoefficient(n, k)), CombinatoricsUtils.binomialCoefficientLog(n, k), 10E-12);
            }
        }}

        }__CLR4_4_12eik2eiklb90pexf.R.inc(112148);int[] n = { 34, 66, 100, 1500, 1500 };
        __CLR4_4_12eik2eiklb90pexf.R.inc(112149);int[] k = { 17, 33, 10, 1500 - 4, 4 };
        __CLR4_4_12eik2eiklb90pexf.R.inc(112150);for (int i = 0; (((i < n.length)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112151)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112152)==0&false)); i++) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112153);long expected = binomialCoefficient(n[i], k[i]);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112154);Assert.assertEquals(n[i] + " choose " + k[i], expected,
                CombinatoricsUtils.binomialCoefficient(n[i], k[i]));
            __CLR4_4_12eik2eiklb90pexf.R.inc(112155);Assert.assertEquals(n[i] + " choose " + k[i], expected,
                CombinatoricsUtils.binomialCoefficientDouble(n[i], k[i]), 0.0);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112156);Assert.assertEquals("log(" + n[i] + " choose " + k[i] + ")", FastMath.log(expected),
                CombinatoricsUtils.binomialCoefficientLog(n[i], k[i]), 0.0);
        }
    }}finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}

    @Test
    public void testBinomialCoefficientFail() {__CLR4_4_12eik2eiklb90pexf.R.globalSliceStart(getClass().getName(),112157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18itkp32ejh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eik2eiklb90pexf.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eik2eiklb90pexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.CombinatoricsUtilsTest.testBinomialCoefficientFail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18itkp32ejh(){try{__CLR4_4_12eik2eiklb90pexf.R.inc(112157);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112158);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112159);CombinatoricsUtils.binomialCoefficient(4, 5);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112160);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }

        __CLR4_4_12eik2eiklb90pexf.R.inc(112161);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112162);CombinatoricsUtils.binomialCoefficientDouble(4, 5);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112163);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }

        __CLR4_4_12eik2eiklb90pexf.R.inc(112164);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112165);CombinatoricsUtils.binomialCoefficientLog(4, 5);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112166);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }

        __CLR4_4_12eik2eiklb90pexf.R.inc(112167);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112168);CombinatoricsUtils.binomialCoefficient(-1, -2);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112169);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_12eik2eiklb90pexf.R.inc(112170);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112171);CombinatoricsUtils.binomialCoefficientDouble(-1, -2);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112172);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_12eik2eiklb90pexf.R.inc(112173);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112174);CombinatoricsUtils.binomialCoefficientLog(-1, -2);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112175);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }

        __CLR4_4_12eik2eiklb90pexf.R.inc(112176);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112177);CombinatoricsUtils.binomialCoefficient(67, 30);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112178);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
            // ignored
        }
        __CLR4_4_12eik2eiklb90pexf.R.inc(112179);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112180);CombinatoricsUtils.binomialCoefficient(67, 34);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112181);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
            // ignored
        }
        __CLR4_4_12eik2eiklb90pexf.R.inc(112182);double x = CombinatoricsUtils.binomialCoefficientDouble(1030, 515);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112183);Assert.assertTrue("expecting infinite binomial coefficient", Double
            .isInfinite(x));
    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}

    /**
     * Tests correctness for large n and sharpness of upper bound in API doc
     * JIRA: MATH-241
     */
    @Test
    public void testBinomialCoefficientLarge() throws Exception {__CLR4_4_12eik2eiklb90pexf.R.globalSliceStart(getClass().getName(),112184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8tnzm2ek8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eik2eiklb90pexf.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eik2eiklb90pexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.CombinatoricsUtilsTest.testBinomialCoefficientLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8tnzm2ek8() throws Exception{try{__CLR4_4_12eik2eiklb90pexf.R.inc(112184);
        // This tests all legal and illegal values for n <= 200.
        __CLR4_4_12eik2eiklb90pexf.R.inc(112185);for (int n = 0; (((n <= 200)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112186)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112187)==0&false)); n++) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112188);for (int k = 0; (((k <= n)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112189)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112190)==0&false)); k++) {{
                __CLR4_4_12eik2eiklb90pexf.R.inc(112191);long ourResult = -1;
                __CLR4_4_12eik2eiklb90pexf.R.inc(112192);long exactResult = -1;
                __CLR4_4_12eik2eiklb90pexf.R.inc(112193);boolean shouldThrow = false;
                __CLR4_4_12eik2eiklb90pexf.R.inc(112194);boolean didThrow = false;
                __CLR4_4_12eik2eiklb90pexf.R.inc(112195);try {
                    __CLR4_4_12eik2eiklb90pexf.R.inc(112196);ourResult = CombinatoricsUtils.binomialCoefficient(n, k);
                } catch (MathArithmeticException ex) {
                    __CLR4_4_12eik2eiklb90pexf.R.inc(112197);didThrow = true;
                }
                __CLR4_4_12eik2eiklb90pexf.R.inc(112198);try {
                    __CLR4_4_12eik2eiklb90pexf.R.inc(112199);exactResult = binomialCoefficient(n, k);
                } catch (MathArithmeticException ex) {
                    __CLR4_4_12eik2eiklb90pexf.R.inc(112200);shouldThrow = true;
                }
                __CLR4_4_12eik2eiklb90pexf.R.inc(112201);Assert.assertEquals(n + " choose " + k, exactResult, ourResult);
                __CLR4_4_12eik2eiklb90pexf.R.inc(112202);Assert.assertEquals(n + " choose " + k, shouldThrow, didThrow);
                __CLR4_4_12eik2eiklb90pexf.R.inc(112203);Assert.assertTrue(n + " choose " + k, (n > 66 || !didThrow));

                __CLR4_4_12eik2eiklb90pexf.R.inc(112204);if ((((!shouldThrow && exactResult > 1)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112205)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112206)==0&false))) {{
                    __CLR4_4_12eik2eiklb90pexf.R.inc(112207);Assert.assertEquals(n + " choose " + k, 1.,
                        CombinatoricsUtils.binomialCoefficientDouble(n, k) / exactResult, 1e-10);
                    __CLR4_4_12eik2eiklb90pexf.R.inc(112208);Assert.assertEquals(n + " choose " + k, 1,
                        CombinatoricsUtils.binomialCoefficientLog(n, k) / FastMath.log(exactResult), 1e-10);
                }
            }}
        }}

        }__CLR4_4_12eik2eiklb90pexf.R.inc(112209);long ourResult = CombinatoricsUtils.binomialCoefficient(300, 3);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112210);long exactResult = binomialCoefficient(300, 3);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112211);Assert.assertEquals(exactResult, ourResult);

        __CLR4_4_12eik2eiklb90pexf.R.inc(112212);ourResult = CombinatoricsUtils.binomialCoefficient(700, 697);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112213);exactResult = binomialCoefficient(700, 697);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112214);Assert.assertEquals(exactResult, ourResult);

        // This one should throw
        __CLR4_4_12eik2eiklb90pexf.R.inc(112215);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112216);CombinatoricsUtils.binomialCoefficient(700, 300);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112217);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
            // Expected
        }

        __CLR4_4_12eik2eiklb90pexf.R.inc(112218);int n = 10000;
        __CLR4_4_12eik2eiklb90pexf.R.inc(112219);ourResult = CombinatoricsUtils.binomialCoefficient(n, 3);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112220);exactResult = binomialCoefficient(n, 3);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112221);Assert.assertEquals(exactResult, ourResult);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112222);Assert.assertEquals(1, CombinatoricsUtils.binomialCoefficientDouble(n, 3) / exactResult, 1e-10);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112223);Assert.assertEquals(1, CombinatoricsUtils.binomialCoefficientLog(n, 3) / FastMath.log(exactResult), 1e-10);

    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}

    @Test
    public void testFactorial() {__CLR4_4_12eik2eiklb90pexf.R.globalSliceStart(getClass().getName(),112224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11i9l2e2elc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eik2eiklb90pexf.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eik2eiklb90pexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.CombinatoricsUtilsTest.testFactorial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11i9l2e2elc(){try{__CLR4_4_12eik2eiklb90pexf.R.inc(112224);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112225);for (int i = 1; (((i < 21)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112226)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112227)==0&false)); i++) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112228);Assert.assertEquals(i + "! ", factorial(i), CombinatoricsUtils.factorial(i));
            __CLR4_4_12eik2eiklb90pexf.R.inc(112229);Assert.assertEquals(i + "! ", factorial(i), CombinatoricsUtils.factorialDouble(i), Double.MIN_VALUE);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112230);Assert.assertEquals(i + "! ", FastMath.log(factorial(i)), CombinatoricsUtils.factorialLog(i), 10E-12);
        }

        }__CLR4_4_12eik2eiklb90pexf.R.inc(112231);Assert.assertEquals("0", 1, CombinatoricsUtils.factorial(0));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112232);Assert.assertEquals("0", 1.0d, CombinatoricsUtils.factorialDouble(0), 1E-14);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112233);Assert.assertEquals("0", 0.0d, CombinatoricsUtils.factorialLog(0), 1E-14);
    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}

    @Test
    public void testFactorialFail() {__CLR4_4_12eik2eiklb90pexf.R.globalSliceStart(getClass().getName(),112234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fhyjmw2elm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eik2eiklb90pexf.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eik2eiklb90pexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.CombinatoricsUtilsTest.testFactorialFail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fhyjmw2elm(){try{__CLR4_4_12eik2eiklb90pexf.R.inc(112234);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112235);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112236);CombinatoricsUtils.factorial(-1);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112237);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_12eik2eiklb90pexf.R.inc(112238);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112239);CombinatoricsUtils.factorialDouble(-1);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112240);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_12eik2eiklb90pexf.R.inc(112241);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112242);CombinatoricsUtils.factorialLog(-1);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112243);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_12eik2eiklb90pexf.R.inc(112244);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112245);CombinatoricsUtils.factorial(21);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112246);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
            // ignored
        }
        __CLR4_4_12eik2eiklb90pexf.R.inc(112247);Assert.assertTrue("expecting infinite factorial value", Double.isInfinite(CombinatoricsUtils.factorialDouble(171)));
    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}

    @Test
    public void testStirlingS2() {__CLR4_4_12eik2eiklb90pexf.R.globalSliceStart(getClass().getName(),112248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xz8nvc2em0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eik2eiklb90pexf.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eik2eiklb90pexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.CombinatoricsUtilsTest.testStirlingS2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xz8nvc2em0(){try{__CLR4_4_12eik2eiklb90pexf.R.inc(112248);

        __CLR4_4_12eik2eiklb90pexf.R.inc(112249);Assert.assertEquals(1, CombinatoricsUtils.stirlingS2(0, 0));

        __CLR4_4_12eik2eiklb90pexf.R.inc(112250);for (int n = 1; (((n < 30)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112251)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112252)==0&false)); ++n) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112253);Assert.assertEquals(0, CombinatoricsUtils.stirlingS2(n, 0));
            __CLR4_4_12eik2eiklb90pexf.R.inc(112254);Assert.assertEquals(1, CombinatoricsUtils.stirlingS2(n, 1));
            __CLR4_4_12eik2eiklb90pexf.R.inc(112255);if ((((n > 2)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112256)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112257)==0&false))) {{
                __CLR4_4_12eik2eiklb90pexf.R.inc(112258);Assert.assertEquals((1l << (n - 1)) - 1l, CombinatoricsUtils.stirlingS2(n, 2));
                __CLR4_4_12eik2eiklb90pexf.R.inc(112259);Assert.assertEquals(CombinatoricsUtils.binomialCoefficient(n, 2),
                                    CombinatoricsUtils.stirlingS2(n, n - 1));
            }
            }__CLR4_4_12eik2eiklb90pexf.R.inc(112260);Assert.assertEquals(1, CombinatoricsUtils.stirlingS2(n, n));
        }
        }__CLR4_4_12eik2eiklb90pexf.R.inc(112261);Assert.assertEquals(536870911l, CombinatoricsUtils.stirlingS2(30, 2));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112262);Assert.assertEquals(576460752303423487l, CombinatoricsUtils.stirlingS2(60, 2));

        __CLR4_4_12eik2eiklb90pexf.R.inc(112263);Assert.assertEquals(   25, CombinatoricsUtils.stirlingS2( 5, 3));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112264);Assert.assertEquals(   90, CombinatoricsUtils.stirlingS2( 6, 3));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112265);Assert.assertEquals(   65, CombinatoricsUtils.stirlingS2( 6, 4));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112266);Assert.assertEquals(  301, CombinatoricsUtils.stirlingS2( 7, 3));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112267);Assert.assertEquals(  350, CombinatoricsUtils.stirlingS2( 7, 4));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112268);Assert.assertEquals(  140, CombinatoricsUtils.stirlingS2( 7, 5));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112269);Assert.assertEquals(  966, CombinatoricsUtils.stirlingS2( 8, 3));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112270);Assert.assertEquals( 1701, CombinatoricsUtils.stirlingS2( 8, 4));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112271);Assert.assertEquals( 1050, CombinatoricsUtils.stirlingS2( 8, 5));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112272);Assert.assertEquals(  266, CombinatoricsUtils.stirlingS2( 8, 6));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112273);Assert.assertEquals( 3025, CombinatoricsUtils.stirlingS2( 9, 3));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112274);Assert.assertEquals( 7770, CombinatoricsUtils.stirlingS2( 9, 4));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112275);Assert.assertEquals( 6951, CombinatoricsUtils.stirlingS2( 9, 5));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112276);Assert.assertEquals( 2646, CombinatoricsUtils.stirlingS2( 9, 6));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112277);Assert.assertEquals(  462, CombinatoricsUtils.stirlingS2( 9, 7));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112278);Assert.assertEquals( 9330, CombinatoricsUtils.stirlingS2(10, 3));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112279);Assert.assertEquals(34105, CombinatoricsUtils.stirlingS2(10, 4));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112280);Assert.assertEquals(42525, CombinatoricsUtils.stirlingS2(10, 5));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112281);Assert.assertEquals(22827, CombinatoricsUtils.stirlingS2(10, 6));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112282);Assert.assertEquals( 5880, CombinatoricsUtils.stirlingS2(10, 7));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112283);Assert.assertEquals(  750, CombinatoricsUtils.stirlingS2(10, 8));

    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}

    @Test(expected=NotPositiveException.class)
    public void testStirlingS2NegativeN() {__CLR4_4_12eik2eiklb90pexf.R.globalSliceStart(getClass().getName(),112284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1goixxr2en0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,116,105,114,108,105,110,103,83,50,78,101,103,97,116,105,118,101,78,58,32,91,78,111,116,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eik2eiklb90pexf.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eik2eiklb90pexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.CombinatoricsUtilsTest.testStirlingS2NegativeN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1goixxr2en0(){try{__CLR4_4_12eik2eiklb90pexf.R.inc(112284);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112285);CombinatoricsUtils.stirlingS2(3, -1);
    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}

    @Test(expected=NumberIsTooLargeException.class)
    public void testStirlingS2LargeK() {__CLR4_4_12eik2eiklb90pexf.R.globalSliceStart(getClass().getName(),112286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qr6p942en2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,116,105,114,108,105,110,103,83,50,76,97,114,103,101,75,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eik2eiklb90pexf.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eik2eiklb90pexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.CombinatoricsUtilsTest.testStirlingS2LargeK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qr6p942en2(){try{__CLR4_4_12eik2eiklb90pexf.R.inc(112286);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112287);CombinatoricsUtils.stirlingS2(3, 4);
    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}

    @Test(expected=MathArithmeticException.class)
    public void testStirlingS2Overflow() {__CLR4_4_12eik2eiklb90pexf.R.globalSliceStart(getClass().getName(),112288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wt95tm2en4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,116,105,114,108,105,110,103,83,50,79,118,101,114,102,108,111,119,58,32,91,77,97,116,104,65,114,105,116,104,109,101,116,105,99,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathArithmeticException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eik2eiklb90pexf.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eik2eiklb90pexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.CombinatoricsUtilsTest.testStirlingS2Overflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wt95tm2en4(){try{__CLR4_4_12eik2eiklb90pexf.R.inc(112288);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112289);CombinatoricsUtils.stirlingS2(26, 9);
    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}

    /**
     * Exact (caching) recursive implementation to test against
     */
    private long binomialCoefficient(int n, int k) throws MathArithmeticException {try{__CLR4_4_12eik2eiklb90pexf.R.inc(112290);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112291);if ((((binomialCache.size() > n)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112292)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112293)==0&false))) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112294);Long cachedResult = binomialCache.get(n).get(Integer.valueOf(k));
            __CLR4_4_12eik2eiklb90pexf.R.inc(112295);if ((((cachedResult != null)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112296)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112297)==0&false))) {{
                __CLR4_4_12eik2eiklb90pexf.R.inc(112298);return cachedResult.longValue();
            }
        }}
        }__CLR4_4_12eik2eiklb90pexf.R.inc(112299);long result = -1;
        __CLR4_4_12eik2eiklb90pexf.R.inc(112300);if (((((n == k) || (k == 0))&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112301)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112302)==0&false))) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112303);result = 1;
        } }else {__CLR4_4_12eik2eiklb90pexf.R.inc(112304);if (((((k == 1) || (k == n - 1))&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112305)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112306)==0&false))) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112307);result = n;
        } }else {{
            // Reduce stack depth for larger values of n
            __CLR4_4_12eik2eiklb90pexf.R.inc(112308);if ((((k < n - 100)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112309)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112310)==0&false))) {{
                __CLR4_4_12eik2eiklb90pexf.R.inc(112311);binomialCoefficient(n - 100, k);
            }
            }__CLR4_4_12eik2eiklb90pexf.R.inc(112312);if ((((k > 100)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112313)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112314)==0&false))) {{
                __CLR4_4_12eik2eiklb90pexf.R.inc(112315);binomialCoefficient(n - 100, k - 100);
            }
            }__CLR4_4_12eik2eiklb90pexf.R.inc(112316);result = ArithmeticUtils.addAndCheck(binomialCoefficient(n - 1, k - 1),
                binomialCoefficient(n - 1, k));
        }
        }}__CLR4_4_12eik2eiklb90pexf.R.inc(112317);if ((((result == -1)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112318)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112319)==0&false))) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112320);throw new MathArithmeticException();
        }
        }__CLR4_4_12eik2eiklb90pexf.R.inc(112321);for (int i = binomialCache.size(); (((i < n + 1)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112322)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112323)==0&false)); i++) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112324);binomialCache.add(new HashMap<Integer, Long>());
        }
        }__CLR4_4_12eik2eiklb90pexf.R.inc(112325);binomialCache.get(n).put(Integer.valueOf(k), Long.valueOf(result));
        __CLR4_4_12eik2eiklb90pexf.R.inc(112326);return result;
    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}

    /**
     * Exact direct multiplication implementation to test against
     */
    private long factorial(int n) {try{__CLR4_4_12eik2eiklb90pexf.R.inc(112327);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112328);long result = 1;
        __CLR4_4_12eik2eiklb90pexf.R.inc(112329);for (int i = 2; (((i <= n)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112330)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112331)==0&false)); i++) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112332);result *= i;
        }
        }__CLR4_4_12eik2eiklb90pexf.R.inc(112333);return result;
    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}
    
    @Test
    public void testCombinationsIterator() {__CLR4_4_12eik2eiklb90pexf.R.globalSliceStart(getClass().getName(),112334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17abkaz2eoe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eik2eiklb90pexf.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eik2eiklb90pexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.CombinatoricsUtilsTest.testCombinationsIterator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17abkaz2eoe(){try{__CLR4_4_12eik2eiklb90pexf.R.inc(112334);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112335);Iterator<int[]> combinationsIterator = CombinatoricsUtils.combinationsIterator(5, 3);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112336);checkIterator(combinationsIterator, 5, 3);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112337);combinationsIterator = CombinatoricsUtils.combinationsIterator(6, 4);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112338);checkIterator(combinationsIterator, 6, 4);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112339);combinationsIterator = CombinatoricsUtils.combinationsIterator(8, 2);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112340);checkIterator(combinationsIterator, 8, 2);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112341);combinationsIterator = CombinatoricsUtils.combinationsIterator(6, 1);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112342);checkIterator(combinationsIterator, 6, 1);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112343);combinationsIterator = CombinatoricsUtils.combinationsIterator(3, 3);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112344);checkIterator(combinationsIterator, 3, 3);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112345);combinationsIterator = CombinatoricsUtils.combinationsIterator(1, 1);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112346);checkIterator(combinationsIterator, 1, 1);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112347);combinationsIterator = CombinatoricsUtils.combinationsIterator(1, 1);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112348);checkIterator(combinationsIterator, 1, 1);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112349);combinationsIterator = CombinatoricsUtils.combinationsIterator(1, 0);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112350);checkIterator(combinationsIterator, 1, 0);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112351);combinationsIterator = CombinatoricsUtils.combinationsIterator(0, 0);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112352);checkIterator(combinationsIterator, 0, 0);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112353);combinationsIterator = CombinatoricsUtils.combinationsIterator(4, 2);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112354);checkIterator(combinationsIterator, 4, 2);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112355);combinationsIterator = CombinatoricsUtils.combinationsIterator(123, 2);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112356);checkIterator(combinationsIterator, 123, 2);
    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}
    
    /**
     * Verifies that the iterator generates a lexicographically
     * increasing sequence of b(n,k) arrays, each having length k
     * and each array itself increasing.
     * 
     * @param iterator 
     * @param n size of universe
     * @param k size of subsets
     */
    private void checkIterator(Iterator<int[]> iterator, int n, int k) {try{__CLR4_4_12eik2eiklb90pexf.R.inc(112357);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112358);long lastLex = -1;
        __CLR4_4_12eik2eiklb90pexf.R.inc(112359);long length = 0;
        __CLR4_4_12eik2eiklb90pexf.R.inc(112360);while ((((iterator.hasNext())&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112361)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112362)==0&false))) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112363);final int[] iterate = iterator.next();
            __CLR4_4_12eik2eiklb90pexf.R.inc(112364);Assert.assertEquals(k, iterate.length);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112365);final long curLex = lexNorm(iterate, n);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112366);Assert.assertTrue(curLex > lastLex);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112367);lastLex = curLex;
            __CLR4_4_12eik2eiklb90pexf.R.inc(112368);length++;
            __CLR4_4_12eik2eiklb90pexf.R.inc(112369);for (int i = 1; (((i < iterate.length)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112370)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112371)==0&false)); i++) {{
                __CLR4_4_12eik2eiklb90pexf.R.inc(112372);Assert.assertTrue(iterate[i] > iterate[i - 1]);
            }
        }}
        }__CLR4_4_12eik2eiklb90pexf.R.inc(112373);Assert.assertEquals(CombinatoricsUtils.binomialCoefficient(n, k), length);
    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}
    
    @Test
    public void testCombinationsIteratorFail() {__CLR4_4_12eik2eiklb90pexf.R.globalSliceStart(getClass().getName(),112374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eefe2f2epi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eik2eiklb90pexf.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eik2eiklb90pexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.CombinatoricsUtilsTest.testCombinationsIteratorFail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eefe2f2epi(){try{__CLR4_4_12eik2eiklb90pexf.R.inc(112374);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112375);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112376);CombinatoricsUtils.combinationsIterator(4, 5);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112377);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }

        __CLR4_4_12eik2eiklb90pexf.R.inc(112378);try {
            __CLR4_4_12eik2eiklb90pexf.R.inc(112379);CombinatoricsUtils.combinationsIterator(-1, -2);
            __CLR4_4_12eik2eiklb90pexf.R.inc(112380);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}
    
    /**
     * Returns the value represented by the digits in the input array in reverse order.
     * For example [3,2,1] returns 123.
     * 
     * @param iterate input array
     * @param n size of universe
     * @return lexicographic norm
     */
    private long lexNorm(int[] iterate, int n) {try{__CLR4_4_12eik2eiklb90pexf.R.inc(112381);
        __CLR4_4_12eik2eiklb90pexf.R.inc(112382);long ret = 0;
        __CLR4_4_12eik2eiklb90pexf.R.inc(112383);for (int i = iterate.length - 1; (((i >= 0)&&(__CLR4_4_12eik2eiklb90pexf.R.iget(112384)!=0|true))||(__CLR4_4_12eik2eiklb90pexf.R.iget(112385)==0&false)); i--) {{
            __CLR4_4_12eik2eiklb90pexf.R.inc(112386);ret += iterate[i] * ArithmeticUtils.pow(n, (long) i);
        }
        }__CLR4_4_12eik2eiklb90pexf.R.inc(112387);return ret;
    }finally{__CLR4_4_12eik2eiklb90pexf.R.flushNeeded();}}
}
