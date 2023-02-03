/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.apache.commons.math3.util;

import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.distribution.UniformRealDistribution;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomDataImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the MathUtils class.
 * @version $Id$
 *          2007) $
 */
public final class MathUtilsTest {static class __CLR4_4_12gkl2gkllb90pf5o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,114966,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testHash() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1djgsu12gkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testHash",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1djgsu12gkl(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114789);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114790);double[] testArray = {
            Double.NaN,
            Double.POSITIVE_INFINITY,
            Double.NEGATIVE_INFINITY,
            1d,
            0d,
            1E-14,
            (1 + 1E-14),
            Double.MIN_VALUE,
            Double.MAX_VALUE };
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114791);for (int i = 0; (((i < testArray.length)&&(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114792)!=0|true))||(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114793)==0&false)); i++) {{
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114794);for (int j = 0; (((j < testArray.length)&&(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114795)!=0|true))||(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114796)==0&false)); j++) {{
                __CLR4_4_12gkl2gkllb90pf5o.R.inc(114797);if ((((i == j)&&(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114798)!=0|true))||(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114799)==0&false))) {{
                    __CLR4_4_12gkl2gkllb90pf5o.R.inc(114800);Assert.assertEquals(MathUtils.hash(testArray[i]), MathUtils.hash(testArray[j]));
                    __CLR4_4_12gkl2gkllb90pf5o.R.inc(114801);Assert.assertEquals(MathUtils.hash(testArray[j]), MathUtils.hash(testArray[i]));
                } }else {{
                    __CLR4_4_12gkl2gkllb90pf5o.R.inc(114802);Assert.assertTrue(MathUtils.hash(testArray[i]) != MathUtils.hash(testArray[j]));
                    __CLR4_4_12gkl2gkllb90pf5o.R.inc(114803);Assert.assertTrue(MathUtils.hash(testArray[j]) != MathUtils.hash(testArray[i]));
                }
            }}
        }}
    }}finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testArrayHash() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1di71s42gl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testArrayHash",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1di71s42gl0(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114804);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114805);Assert.assertEquals(0, MathUtils.hash((double[]) null));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114806);Assert.assertEquals(MathUtils.hash(new double[] {
                                      Double.NaN, Double.POSITIVE_INFINITY,
                                      Double.NEGATIVE_INFINITY, 1d, 0d
                                    }),
                     MathUtils.hash(new double[] {
                                      Double.NaN, Double.POSITIVE_INFINITY,
                                      Double.NEGATIVE_INFINITY, 1d, 0d
                                    }));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114807);Assert.assertFalse(MathUtils.hash(new double[] { 1d }) ==
                    MathUtils.hash(new double[] { FastMath.nextAfter(1d, 2d) }));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114808);Assert.assertFalse(MathUtils.hash(new double[] { 1d }) ==
                    MathUtils.hash(new double[] { 1d, 1d }));
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    /**
     * Make sure that permuted arrays do not hash to the same value.
     */
    @Test
    public void testPermutedArrayHash() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gbp1oy2gl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testPermutedArrayHash",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gbp1oy2gl5(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114809);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114810);double[] original = new double[10];
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114811);double[] permuted = new double[10];
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114812);RandomDataImpl random = new RandomDataImpl();

        // Generate 10 distinct random values
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114813);for (int i = 0; (((i < 10)&&(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114814)!=0|true))||(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114815)==0&false)); i++) {{
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114816);final RealDistribution u = new UniformRealDistribution(i + 0.5, i + 0.75);
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114817);original[i] = u.sample();
        }

        // Generate a random permutation, making sure it is not the identity
        }__CLR4_4_12gkl2gkllb90pf5o.R.inc(114818);boolean isIdentity = true;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114819);do {{
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114820);int[] permutation = random.nextPermutation(10, 10);
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114821);for (int i = 0; (((i < 10)&&(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114822)!=0|true))||(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114823)==0&false)); i++) {{
                __CLR4_4_12gkl2gkllb90pf5o.R.inc(114824);if ((((i != permutation[i])&&(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114825)!=0|true))||(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114826)==0&false))) {{
                    __CLR4_4_12gkl2gkllb90pf5o.R.inc(114827);isIdentity = false;
                }
                }__CLR4_4_12gkl2gkllb90pf5o.R.inc(114828);permuted[i] = original[permutation[i]];
            }
        }} }while ((((isIdentity)&&(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114829)!=0|true))||(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114830)==0&false)));

        // Verify that permuted array has different hash
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114831);Assert.assertFalse(MathUtils.hash(original) == MathUtils.hash(permuted));
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testIndicatorByte() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdwwdo2gls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testIndicatorByte",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdwwdo2gls(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114832);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114833);Assert.assertEquals((byte)1, MathUtils.copySign((byte)1, (byte)2));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114834);Assert.assertEquals((byte)1, MathUtils.copySign((byte)1, (byte)0));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114835);Assert.assertEquals((byte)(-1), MathUtils.copySign((byte)1, (byte)(-2)));
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testIndicatorInt() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ml6op2glw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testIndicatorInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ml6op2glw(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114836);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114837);Assert.assertEquals(1, MathUtils.copySign(1, 2));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114838);Assert.assertEquals(1, MathUtils.copySign(1, 0));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114839);Assert.assertEquals((-1), MathUtils.copySign(1, -2));
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testIndicatorLong() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11h8teo2gm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testIndicatorLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11h8teo2gm0(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114840);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114841);Assert.assertEquals(1L, MathUtils.copySign(1L, 2L));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114842);Assert.assertEquals(1L, MathUtils.copySign(1L, 0L));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114843);Assert.assertEquals(-1L, MathUtils.copySign(1L, -2L));
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testIndicatorShort() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6qq122gm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testIndicatorShort",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6qq122gm4(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114844);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114845);Assert.assertEquals((short)1, MathUtils.copySign((short)1, (short)2));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114846);Assert.assertEquals((short)1, MathUtils.copySign((short)1, (short)0));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114847);Assert.assertEquals((short)(-1), MathUtils.copySign((short)1, (short)(-2)));
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testNormalizeAngle() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iu24ld2gm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testNormalizeAngle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iu24ld2gm8(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114848);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114849);for (double a = -15.0; (((a <= 15.0)&&(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114850)!=0|true))||(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114851)==0&false)); a += 0.1) {{
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114852);for (double b = -15.0; (((b <= 15.0)&&(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114853)!=0|true))||(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114854)==0&false)); b += 0.2) {{
                __CLR4_4_12gkl2gkllb90pf5o.R.inc(114855);double c = MathUtils.normalizeAngle(a, b);
                __CLR4_4_12gkl2gkllb90pf5o.R.inc(114856);Assert.assertTrue((b - FastMath.PI) <= c);
                __CLR4_4_12gkl2gkllb90pf5o.R.inc(114857);Assert.assertTrue(c <= (b + FastMath.PI));
                __CLR4_4_12gkl2gkllb90pf5o.R.inc(114858);double twoK = FastMath.rint((a - c) / FastMath.PI);
                __CLR4_4_12gkl2gkllb90pf5o.R.inc(114859);Assert.assertEquals(c, a - twoK * FastMath.PI, 1.0e-14);
            }
        }}
    }}finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testReduce() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wogq1r2gmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testReduce",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wogq1r2gmk(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114860);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114861);final double period = -12.222;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114862);final double offset = 13;

        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114863);final double delta = 1.5;

        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114864);double orig = offset + 122456789 * period + delta;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114865);double expected = delta;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114866);Assert.assertEquals(expected,
                            MathUtils.reduce(orig, period, offset),
                            1e-7);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114867);Assert.assertEquals(expected,
                            MathUtils.reduce(orig, -period, offset),
                            1e-7);

        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114868);orig = offset - 123356789 * period - delta;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114869);expected = Math.abs(period) - delta;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114870);Assert.assertEquals(expected,
                            MathUtils.reduce(orig, period, offset),
                            1e-6);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114871);Assert.assertEquals(expected,
                            MathUtils.reduce(orig, -period, offset),
                            1e-6);

        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114872);orig = offset - 123446789 * period + delta;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114873);expected = delta;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114874);Assert.assertEquals(expected,
                            MathUtils.reduce(orig, period, offset),
                            1e-6);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114875);Assert.assertEquals(expected,
                            MathUtils.reduce(orig, -period, offset),
                            1e-6);

        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114876);Assert.assertTrue(Double.isNaN(MathUtils.reduce(orig, Double.NaN, offset)));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114877);Assert.assertTrue(Double.isNaN(MathUtils.reduce(Double.NaN, period, offset)));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114878);Assert.assertTrue(Double.isNaN(MathUtils.reduce(orig, period, Double.NaN)));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114879);Assert.assertTrue(Double.isNaN(MathUtils.reduce(orig, period,
                Double.POSITIVE_INFINITY)));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114880);Assert.assertTrue(Double.isNaN(MathUtils.reduce(Double.POSITIVE_INFINITY,
                period, offset)));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114881);Assert.assertTrue(Double.isNaN(MathUtils.reduce(orig,
                Double.POSITIVE_INFINITY, offset)));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114882);Assert.assertTrue(Double.isNaN(MathUtils.reduce(orig,
                Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY)));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114883);Assert.assertTrue(Double.isNaN(MathUtils.reduce(Double.POSITIVE_INFINITY,
                period, Double.POSITIVE_INFINITY)));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114884);Assert.assertTrue(Double.isNaN(MathUtils.reduce(Double.POSITIVE_INFINITY,
                Double.POSITIVE_INFINITY, offset)));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114885);Assert.assertTrue(Double.isNaN(MathUtils.reduce(Double.POSITIVE_INFINITY,
                Double.POSITIVE_INFINITY,  Double.POSITIVE_INFINITY)));
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testReduceComparedWithNormalizeAngle() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19vjaru2gna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testReduceComparedWithNormalizeAngle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19vjaru2gna(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114886);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114887);final double tol = Math.ulp(1d);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114888);final double period = 2 * Math.PI;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114889);for (double a = -15; (((a <= 15)&&(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114890)!=0|true))||(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114891)==0&false)); a += 0.5) {{
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114892);for (double center = -15; (((center <= 15)&&(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114893)!=0|true))||(__CLR4_4_12gkl2gkllb90pf5o.R.iget(114894)==0&false)); center += 1) {{
                __CLR4_4_12gkl2gkllb90pf5o.R.inc(114895);final double nA = MathUtils.normalizeAngle(a, center);
                __CLR4_4_12gkl2gkllb90pf5o.R.inc(114896);final double offset = center - Math.PI;
                __CLR4_4_12gkl2gkllb90pf5o.R.inc(114897);final double r = MathUtils.reduce(a, period, offset);
                __CLR4_4_12gkl2gkllb90pf5o.R.inc(114898);Assert.assertEquals(nA, r + offset, tol);
            }
        }}
    }}finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testSignByte() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fak8762gnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testSignByte",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fak8762gnn(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114899);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114900);final byte one = (byte) 1;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114901);Assert.assertEquals((byte) 1, MathUtils.copySign(one, (byte) 2));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114902);Assert.assertEquals((byte) (-1), MathUtils.copySign(one, (byte) (-2)));
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testSignInt() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11i8rbb2gnr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testSignInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11i8rbb2gnr(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114903);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114904);final int one = 1;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114905);Assert.assertEquals(1, MathUtils.copySign(one, 2));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114906);Assert.assertEquals((-1), MathUtils.copySign(one, -2));
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testSignLong() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otvqsy2gnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testSignLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otvqsy2gnv(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114907);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114908);final long one = 1L;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114909);Assert.assertEquals(1L, MathUtils.copySign(one, 2L));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114910);Assert.assertEquals(-1L, MathUtils.copySign(one, -2L));
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testSignShort() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrcxkk2gnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testSignShort",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrcxkk2gnz(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114911);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114912);final short one = (short) 1;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114913);Assert.assertEquals((short) 1, MathUtils.copySign(one, (short) 2));
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114914);Assert.assertEquals((short) (-1), MathUtils.copySign(one, (short) (-2)));
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testCheckFinite() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m3pjsk2go3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testCheckFinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m3pjsk2go3(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114915);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114916);try {
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114917);MathUtils.checkFinite(Double.POSITIVE_INFINITY);
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114918);Assert.fail("an exception should have been thrown");
        } catch (NotFiniteNumberException e) {
            // Expected
        }
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114919);try {
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114920);MathUtils.checkFinite(Double.NEGATIVE_INFINITY);
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114921);Assert.fail("an exception should have been thrown");
        } catch (NotFiniteNumberException e) {
            // Expected
        }
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114922);try {
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114923);MathUtils.checkFinite(Double.NaN);
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114924);Assert.fail("an exception should have been thrown");
        } catch (NotFiniteNumberException e) {
            // Expected
        }

        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114925);try {
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114926);MathUtils.checkFinite(new double[] {0, -1, Double.POSITIVE_INFINITY, -2, 3});
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114927);Assert.fail("an exception should have been thrown");
        } catch (NotFiniteNumberException e) {
            // Expected
        }
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114928);try {
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114929);MathUtils.checkFinite(new double[] {1, Double.NEGATIVE_INFINITY, -2, 3});
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114930);Assert.fail("an exception should have been thrown");
        } catch (NotFiniteNumberException e) {
            // Expected
        }
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114931);try {
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114932);MathUtils.checkFinite(new double[] {4, 3, -1, Double.NaN, -2, 1});
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114933);Assert.fail("an exception should have been thrown");
        } catch (NotFiniteNumberException e) {
            // Expected
        }
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testCheckNotNull1() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fz82j82gom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testCheckNotNull1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fz82j82gom(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114934);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114935);try {
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114936);Object obj = null;
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114937);MathUtils.checkNotNull(obj);
        } catch (NullArgumentException e) {
            // Expected.
        }
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testCheckNotNull2() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j881bp2goq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testCheckNotNull2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j881bp2goq(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114938);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114939);try {
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114940);double[] array = null;
            __CLR4_4_12gkl2gkllb90pf5o.R.inc(114941);MathUtils.checkNotNull(array, LocalizedFormats.INPUT_ARRAY);
        } catch (NullArgumentException e) {
            // Expected.
        }
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test
    public void testCopySignByte() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xqvzn2gou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testCopySignByte",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xqvzn2gou(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114942);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114943);byte a = MathUtils.copySign(Byte.MIN_VALUE, (byte) -1);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114944);Assert.assertEquals(Byte.MIN_VALUE, a);

        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114945);final byte minValuePlusOne = Byte.MIN_VALUE + (byte) 1;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114946);a = MathUtils.copySign(minValuePlusOne, (byte) 1);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114947);Assert.assertEquals(Byte.MAX_VALUE, a);

        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114948);a = MathUtils.copySign(Byte.MAX_VALUE, (byte) -1);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114949);Assert.assertEquals(minValuePlusOne, a);

        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114950);final byte one = 1;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114951);byte val = -2;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114952);a = MathUtils.copySign(val, one);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114953);Assert.assertEquals(-val, a);

        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114954);final byte minusOne = -one;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114955);val = 2;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114956);a = MathUtils.copySign(val, minusOne);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114957);Assert.assertEquals(-val, a);

        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114958);val = 0;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114959);a = MathUtils.copySign(val, minusOne);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114960);Assert.assertEquals(val, a);

        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114961);val = 0;
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114962);a = MathUtils.copySign(val, one);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114963);Assert.assertEquals(val, a);
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}

    @Test(expected=MathArithmeticException.class)
    public void testCopySignByte2() {__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceStart(getClass().getName(),114964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q5kel2gpg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,112,121,83,105,103,110,66,121,116,101,50,58,32,91,77,97,116,104,65,114,105,116,104,109,101,116,105,99,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathArithmeticException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gkl2gkllb90pf5o.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gkl2gkllb90pf5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathUtilsTest.testCopySignByte2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q5kel2gpg(){try{__CLR4_4_12gkl2gkllb90pf5o.R.inc(114964);
        __CLR4_4_12gkl2gkllb90pf5o.R.inc(114965);MathUtils.copySign(Byte.MIN_VALUE, (byte) 1);
    }finally{__CLR4_4_12gkl2gkllb90pf5o.R.flushNeeded();}}
}
