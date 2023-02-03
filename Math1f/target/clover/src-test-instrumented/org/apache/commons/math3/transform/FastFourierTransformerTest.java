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
package org.apache.commons.math3.transform;

import java.util.Random;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.analysis.function.Sinc;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for fast Fourier transformer.
 * <p>
 * FFT algorithm is exact, the small tolerance number is used only
 * to account for round-off errors.
 *
 * @version $Id$
 */
public final class FastFourierTransformerTest {static class __CLR4_4_12ddw2ddwlb90peu6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,111078,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The common seed of all random number generators used in this test. */
    private final static long SEED = 20110111L;

    /*
     * Precondition checks.
     */

    @Test
    public void testTransformComplexSizeNotAPowerOfTwo() {__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceStart(getClass().getName(),110660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmxh2c2ddw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ddw2ddwlb90peu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformComplexSizeNotAPowerOfTwo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmxh2c2ddw(){try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110660);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110661);final int n = 127;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110662);final Complex[] x = createComplexData(n);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110663);final DftNormalization[] norm;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110664);norm = DftNormalization.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110665);final TransformType[] type;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110666);type = TransformType.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110667);for (int i = 0; (((i < norm.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110668)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110669)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110670);for (int j = 0; (((j < type.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110671)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110672)==0&false)); j++) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110673);final FastFourierTransformer fft;
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110674);fft = new FastFourierTransformer(norm[i]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110675);try {
                    __CLR4_4_12ddw2ddwlb90peu6.R.inc(110676);fft.transform(x, type[j]);
                    __CLR4_4_12ddw2ddwlb90peu6.R.inc(110677);Assert.fail(norm[i] + ", " + type[j] +
                        ": MathIllegalArgumentException was expected");
                } catch (MathIllegalArgumentException e) {
                    // Expected behaviour
                }
            }
        }}
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    @Test
    public void testTransformRealSizeNotAPowerOfTwo() {__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceStart(getClass().getName(),110678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn0av22dee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ddw2ddwlb90peu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformRealSizeNotAPowerOfTwo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn0av22dee(){try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110678);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110679);final int n = 127;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110680);final double[] x = createRealData(n);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110681);final DftNormalization[] norm;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110682);norm = DftNormalization.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110683);final TransformType[] type;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110684);type = TransformType.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110685);for (int i = 0; (((i < norm.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110686)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110687)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110688);for (int j = 0; (((j < type.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110689)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110690)==0&false)); j++) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110691);final FastFourierTransformer fft;
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110692);fft = new FastFourierTransformer(norm[i]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110693);try {
                    __CLR4_4_12ddw2ddwlb90peu6.R.inc(110694);fft.transform(x, type[j]);
                    __CLR4_4_12ddw2ddwlb90peu6.R.inc(110695);Assert.fail(norm[i] + ", " + type[j] +
                        ": MathIllegalArgumentException was expected");
                } catch (MathIllegalArgumentException e) {
                    // Expected behaviour
                }
            }
        }}
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    @Test
    public void testTransformFunctionSizeNotAPowerOfTwo() {__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceStart(getClass().getName(),110696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyaglk2dew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ddw2ddwlb90peu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformFunctionSizeNotAPowerOfTwo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyaglk2dew(){try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110696);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110697);final int n = 127;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110698);final UnivariateFunction f = new Sin();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110699);final DftNormalization[] norm;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110700);norm = DftNormalization.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110701);final TransformType[] type;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110702);type = TransformType.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110703);for (int i = 0; (((i < norm.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110704)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110705)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110706);for (int j = 0; (((j < type.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110707)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110708)==0&false)); j++) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110709);final FastFourierTransformer fft;
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110710);fft = new FastFourierTransformer(norm[i]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110711);try {
                    __CLR4_4_12ddw2ddwlb90peu6.R.inc(110712);fft.transform(f, 0.0, Math.PI, n, type[j]);
                    __CLR4_4_12ddw2ddwlb90peu6.R.inc(110713);Assert.fail(norm[i] + ", " + type[j] +
                        ": MathIllegalArgumentException was expected");
                } catch (MathIllegalArgumentException e) {
                    // Expected behaviour
                }
            }
        }}
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    @Test
    public void testTransformFunctionNotStrictlyPositiveNumberOfSamples() {__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceStart(getClass().getName(),110714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jjaqo2dfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ddw2ddwlb90peu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformFunctionNotStrictlyPositiveNumberOfSamples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jjaqo2dfe(){try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110714);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110715);final int n = -128;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110716);final UnivariateFunction f = new Sin();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110717);final DftNormalization[] norm;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110718);norm = DftNormalization.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110719);final TransformType[] type;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110720);type = TransformType.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110721);for (int i = 0; (((i < norm.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110722)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110723)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110724);for (int j = 0; (((j < type.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110725)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110726)==0&false)); j++) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110727);final FastFourierTransformer fft;
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110728);fft = new FastFourierTransformer(norm[i]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110729);try {
                    __CLR4_4_12ddw2ddwlb90peu6.R.inc(110730);fft.transform(f, 0.0, Math.PI, n, type[j]);
                    __CLR4_4_12ddw2ddwlb90peu6.R.inc(110731);fft.transform(f, 0.0, Math.PI, n, type[j]);
                    __CLR4_4_12ddw2ddwlb90peu6.R.inc(110732);Assert.fail(norm[i] + ", " + type[j] +
                        ": NotStrictlyPositiveException was expected");
                } catch (NotStrictlyPositiveException e) {
                    // Expected behaviour
                }
            }
        }}
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    @Test
    public void testTransformFunctionInvalidBounds() {__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceStart(getClass().getName(),110733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uvcthb2dfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ddw2ddwlb90peu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformFunctionInvalidBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uvcthb2dfx(){try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110733);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110734);final int n = 128;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110735);final UnivariateFunction f = new Sin();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110736);final DftNormalization[] norm;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110737);norm = DftNormalization.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110738);final TransformType[] type;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110739);type = TransformType.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110740);for (int i = 0; (((i < norm.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110741)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110742)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110743);for (int j = 0; (((j < type.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110744)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110745)==0&false)); j++) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110746);final FastFourierTransformer fft;
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110747);fft = new FastFourierTransformer(norm[i]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110748);try {
                    __CLR4_4_12ddw2ddwlb90peu6.R.inc(110749);fft.transform(f, Math.PI, 0.0, n, type[j]);
                    __CLR4_4_12ddw2ddwlb90peu6.R.inc(110750);Assert.fail(norm[i] + ", " + type[j] +
                        ": NumberIsTooLargeException was expected");
                } catch (NumberIsTooLargeException e) {
                    // Expected behaviour
                }
            }
        }}
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    /*
     * Utility methods for checking (successful) transforms.
     */

    private static Complex[] createComplexData(final int n) {try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110751);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110752);final Random random = new Random(SEED);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110753);final Complex[] data = new Complex[n];
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110754);for (int i = 0; (((i < n)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110755)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110756)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110757);final double re = 2.0 * random.nextDouble() - 1.0;
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110758);final double im = 2.0 * random.nextDouble() - 1.0;
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110759);data[i] = new Complex(re, im);
        }
        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(110760);return data;
    }finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    private static double[] createRealData(final int n) {try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110761);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110762);final Random random = new Random(SEED);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110763);final double[] data = new double[n];
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110764);for (int i = 0; (((i < n)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110765)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110766)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110767);data[i] = 2.0 * random.nextDouble() - 1.0;
        }
        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(110768);return data;
    }finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    /** Naive implementation of DFT, for reference. */
    private static Complex[] dft(final Complex[] x, final int sgn) {try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110769);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110770);final int n = x.length;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110771);final double[] cos = new double[n];
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110772);final double[] sin = new double[n];
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110773);final Complex[] y = new Complex[n];
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110774);for (int i = 0; (((i < n)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110775)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110776)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110777);final double arg = 2.0 * FastMath.PI * i / n;
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110778);cos[i] = FastMath.cos(arg);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110779);sin[i] = FastMath.sin(arg);
        }
        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(110780);for (int i = 0; (((i < n)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110781)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110782)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110783);double yr = 0.0;
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110784);double yi = 0.0;
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110785);for (int j = 0; (((j < n)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110786)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110787)==0&false)); j++) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110788);final int index = (i * j) % n;
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110789);final double c = cos[index];
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110790);final double s = sin[index];
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110791);final double xr = x[j].getReal();
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110792);final double xi = x[j].getImaginary();
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110793);yr += c * xr - sgn * s * xi;
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110794);yi += sgn * s * xr + c * xi;
            }
            }__CLR4_4_12ddw2ddwlb90peu6.R.inc(110795);y[i] = new Complex(yr, yi);
        }
        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(110796);return y;
    }finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    private static void doTestTransformComplex(final int n, final double tol,
        final DftNormalization normalization,
        final TransformType type) {try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110797);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110798);final FastFourierTransformer fft;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110799);fft = new FastFourierTransformer(normalization);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110800);final Complex[] x = createComplexData(n);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110801);final Complex[] expected;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110802);final double s;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110803);if ((((type==TransformType.FORWARD)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110804)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110805)==0&false))) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110806);expected = dft(x, -1);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110807);if ((((normalization == DftNormalization.STANDARD)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110808)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110809)==0&false))){{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110810);s = 1.0;
            } }else {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110811);s = 1.0 / FastMath.sqrt(n);
            }
        }} }else {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110812);expected = dft(x, 1);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110813);if ((((normalization == DftNormalization.STANDARD)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110814)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110815)==0&false))) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110816);s = 1.0 / n;
            } }else {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110817);s = 1.0 / FastMath.sqrt(n);
            }
        }}
        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(110818);final Complex[] actual = fft.transform(x, type);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110819);for (int i = 0; (((i < n)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110820)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110821)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110822);final String msg;
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110823);msg = String.format("%s, %s, %d, %d", normalization, type, n, i);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110824);final double re = s * expected[i].getReal();
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110825);Assert.assertEquals(msg, re, actual[i].getReal(),
                tol * FastMath.abs(re));
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110826);final double im = s * expected[i].getImaginary();
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110827);Assert.assertEquals(msg, im, actual[i].getImaginary(), tol *
                FastMath.abs(re));
        }
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    private static void doTestTransformReal(final int n, final double tol,
        final DftNormalization normalization,
        final TransformType type) {try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110828);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110829);final FastFourierTransformer fft;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110830);fft = new FastFourierTransformer(normalization);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110831);final double[] x = createRealData(n);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110832);final Complex[] xc = new Complex[n];
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110833);for (int i = 0; (((i < n)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110834)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110835)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110836);xc[i] = new Complex(x[i], 0.0);
        }
        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(110837);final Complex[] expected;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110838);final double s;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110839);if ((((type == TransformType.FORWARD)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110840)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110841)==0&false))) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110842);expected = dft(xc, -1);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110843);if ((((normalization == DftNormalization.STANDARD)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110844)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110845)==0&false))) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110846);s = 1.0;
            } }else {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110847);s = 1.0 / FastMath.sqrt(n);
            }
        }} }else {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110848);expected = dft(xc, 1);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110849);if ((((normalization == DftNormalization.STANDARD)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110850)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110851)==0&false))) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110852);s = 1.0 / n;
            } }else {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110853);s = 1.0 / FastMath.sqrt(n);
            }
        }}
        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(110854);final Complex[] actual = fft.transform(x, type);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110855);for (int i = 0; (((i < n)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110856)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110857)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110858);final String msg;
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110859);msg = String.format("%s, %s, %d, %d", normalization, type, n, i);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110860);final double re = s * expected[i].getReal();
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110861);Assert.assertEquals(msg, re, actual[i].getReal(),
                tol * FastMath.abs(re));
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110862);final double im = s * expected[i].getImaginary();
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110863);Assert.assertEquals(msg, im, actual[i].getImaginary(), tol *
                FastMath.abs(re));
        }
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    private static void doTestTransformFunction(final UnivariateFunction f,
        final double min, final double max, int n, final double tol,
        final DftNormalization normalization,
        final TransformType type) {try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110864);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110865);final FastFourierTransformer fft;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110866);fft = new FastFourierTransformer(normalization);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110867);final Complex[] x = new Complex[n];
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110868);for (int i = 0; (((i < n)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110869)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110870)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110871);final double t = min + i * (max - min) / n;
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110872);x[i] = new Complex(f.value(t));
        }
        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(110873);final Complex[] expected;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110874);final double s;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110875);if ((((type == TransformType.FORWARD)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110876)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110877)==0&false))) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110878);expected = dft(x, -1);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110879);if ((((normalization == DftNormalization.STANDARD)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110880)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110881)==0&false))) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110882);s = 1.0;
            } }else {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110883);s = 1.0 / FastMath.sqrt(n);
            }
        }} }else {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110884);expected = dft(x, 1);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110885);if ((((normalization == DftNormalization.STANDARD)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110886)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110887)==0&false))) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110888);s = 1.0 / n;
            } }else {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110889);s = 1.0 / FastMath.sqrt(n);
            }
        }}
        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(110890);final Complex[] actual = fft.transform(f, min, max, n, type);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110891);for (int i = 0; (((i < n)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110892)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110893)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110894);final String msg = String.format("%d, %d", n, i);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110895);final double re = s * expected[i].getReal();
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110896);Assert.assertEquals(msg, re, actual[i].getReal(),
                tol * FastMath.abs(re));
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110897);final double im = s * expected[i].getImaginary();
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110898);Assert.assertEquals(msg, im, actual[i].getImaginary(), tol *
                FastMath.abs(re));
        }
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    /*
     * Tests of standard transform (when data is valid).
     */

    @Test
    public void testTransformComplex() {__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceStart(getClass().getName(),110899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1og9wpp2dkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ddw2ddwlb90peu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformComplex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1og9wpp2dkj(){try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110899);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110900);final DftNormalization[] norm;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110901);norm = DftNormalization.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110902);final TransformType[] type;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110903);type = TransformType.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110904);for (int i = 0; (((i < norm.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110905)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110906)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110907);for (int j = 0; (((j < type.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110908)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110909)==0&false)); j++) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110910);doTestTransformComplex(2, 1.0E-15, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110911);doTestTransformComplex(4, 1.0E-14, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110912);doTestTransformComplex(8, 1.0E-14, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110913);doTestTransformComplex(16, 1.0E-13, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110914);doTestTransformComplex(32, 1.0E-13, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110915);doTestTransformComplex(64, 1.0E-12, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110916);doTestTransformComplex(128, 1.0E-12, norm[i], type[j]);
            }
        }}
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    @Test
    public void testStandardTransformReal() {__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceStart(getClass().getName(),110917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19l2tb62dl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ddw2ddwlb90peu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastFourierTransformerTest.testStandardTransformReal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19l2tb62dl1(){try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110917);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110918);final DftNormalization[] norm;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110919);norm = DftNormalization.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110920);final TransformType[] type;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110921);type = TransformType.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110922);for (int i = 0; (((i < norm.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110923)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110924)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110925);for (int j = 0; (((j < type.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110926)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110927)==0&false)); j++) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110928);doTestTransformReal(2, 1.0E-15, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110929);doTestTransformReal(4, 1.0E-14, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110930);doTestTransformReal(8, 1.0E-14, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110931);doTestTransformReal(16, 1.0E-13, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110932);doTestTransformReal(32, 1.0E-13, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110933);doTestTransformReal(64, 1.0E-13, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110934);doTestTransformReal(128, 1.0E-11, norm[i], type[j]);
            }
        }}
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    @Test
    public void testStandardTransformFunction() {__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceStart(getClass().getName(),110935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6yc2s2dlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ddw2ddwlb90peu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastFourierTransformerTest.testStandardTransformFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6yc2s2dlj(){try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110935);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110936);final UnivariateFunction f = new Sinc();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110937);final double min = -FastMath.PI;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110938);final double max = FastMath.PI;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110939);final DftNormalization[] norm;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110940);norm = DftNormalization.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110941);final TransformType[] type;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110942);type = TransformType.values();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110943);for (int i = 0; (((i < norm.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110944)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110945)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110946);for (int j = 0; (((j < type.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110947)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110948)==0&false)); j++) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110949);doTestTransformFunction(f, min, max, 2, 1.0E-15, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110950);doTestTransformFunction(f, min, max, 4, 1.0E-14, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110951);doTestTransformFunction(f, min, max, 8, 1.0E-14, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110952);doTestTransformFunction(f, min, max, 16, 1.0E-13, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110953);doTestTransformFunction(f, min, max, 32, 1.0E-13, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110954);doTestTransformFunction(f, min, max, 64, 1.0E-12, norm[i], type[j]);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(110955);doTestTransformFunction(f, min, max, 128, 1.0E-11, norm[i], type[j]);
            }
        }}
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    /*
     * Additional tests for 1D data.
     */

    /**
     * Test of transformer for the ad hoc data taken from Mathematica.
     */
    @Test
    public void testAdHocData() {__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceStart(getClass().getName(),110956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vz0c882dm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ddw2ddwlb90peu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastFourierTransformerTest.testAdHocData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vz0c882dm4(){try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110956);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110957);FastFourierTransformer transformer;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110958);transformer = new FastFourierTransformer(DftNormalization.STANDARD);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110959);Complex result[]; __CLR4_4_12ddw2ddwlb90peu6.R.inc(110960);double tolerance = 1E-12;

        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110961);double x[] = {1.3, 2.4, 1.7, 4.1, 2.9, 1.7, 5.1, 2.7};
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110962);Complex y[] = {
            new Complex(21.9, 0.0),
            new Complex(-2.09497474683058, 1.91507575950825),
            new Complex(-2.6, 2.7),
            new Complex(-1.10502525316942, -4.88492424049175),
            new Complex(0.1, 0.0),
            new Complex(-1.10502525316942, 4.88492424049175),
            new Complex(-2.6, -2.7),
            new Complex(-2.09497474683058, -1.91507575950825)};

        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110963);result = transformer.transform(x, TransformType.FORWARD);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110964);for (int i = 0; (((i < result.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110965)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110966)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110967);Assert.assertEquals(y[i].getReal(), result[i].getReal(), tolerance);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110968);Assert.assertEquals(y[i].getImaginary(), result[i].getImaginary(), tolerance);
        }

        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(110969);result = transformer.transform(y, TransformType.INVERSE);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110970);for (int i = 0; (((i < result.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110971)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110972)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110973);Assert.assertEquals(x[i], result[i].getReal(), tolerance);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110974);Assert.assertEquals(0.0, result[i].getImaginary(), tolerance);
        }

        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(110975);double x2[] = {10.4, 21.6, 40.8, 13.6, 23.2, 32.8, 13.6, 19.2};
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110976);TransformUtils.scaleArray(x2, 1.0 / FastMath.sqrt(x2.length));
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110977);Complex y2[] = y;

        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110978);transformer = new FastFourierTransformer(DftNormalization.UNITARY);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110979);result = transformer.transform(y2, TransformType.FORWARD);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110980);for (int i = 0; (((i < result.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110981)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110982)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110983);Assert.assertEquals(x2[i], result[i].getReal(), tolerance);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110984);Assert.assertEquals(0.0, result[i].getImaginary(), tolerance);
        }

        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(110985);result = transformer.transform(x2, TransformType.INVERSE);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110986);for (int i = 0; (((i < result.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110987)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(110988)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110989);Assert.assertEquals(y2[i].getReal(), result[i].getReal(), tolerance);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(110990);Assert.assertEquals(y2[i].getImaginary(), result[i].getImaginary(), tolerance);
        }
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    /**
     * Test of transformer for the sine function.
     */
    @Test
    public void testSinFunction() {__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceStart(getClass().getName(),110991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doerh72dn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ddw2ddwlb90peu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastFourierTransformerTest.testSinFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doerh72dn3(){try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(110991);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110992);UnivariateFunction f = new Sin();
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110993);FastFourierTransformer transformer;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110994);transformer = new FastFourierTransformer(DftNormalization.STANDARD);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110995);Complex result[]; __CLR4_4_12ddw2ddwlb90peu6.R.inc(110996);int N = 1 << 8;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110997);double min, max, tolerance = 1E-12;

        __CLR4_4_12ddw2ddwlb90peu6.R.inc(110998);min = 0.0; __CLR4_4_12ddw2ddwlb90peu6.R.inc(110999);max = 2.0 * FastMath.PI;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111000);result = transformer.transform(f, min, max, N, TransformType.FORWARD);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111001);Assert.assertEquals(0.0, result[1].getReal(), tolerance);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111002);Assert.assertEquals(-(N >> 1), result[1].getImaginary(), tolerance);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111003);Assert.assertEquals(0.0, result[N-1].getReal(), tolerance);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111004);Assert.assertEquals(N >> 1, result[N-1].getImaginary(), tolerance);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111005);for (int i = 0; (((i < N-1)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111006)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111007)==0&false)); i += ((((i == 0 )&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111008)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111009)==0&false))? 2 : 1)) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(111010);Assert.assertEquals(0.0, result[i].getReal(), tolerance);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(111011);Assert.assertEquals(0.0, result[i].getImaginary(), tolerance);
        }

        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(111012);min = -FastMath.PI; __CLR4_4_12ddw2ddwlb90peu6.R.inc(111013);max = FastMath.PI;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111014);result = transformer.transform(f, min, max, N, TransformType.INVERSE);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111015);Assert.assertEquals(0.0, result[1].getReal(), tolerance);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111016);Assert.assertEquals(-0.5, result[1].getImaginary(), tolerance);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111017);Assert.assertEquals(0.0, result[N-1].getReal(), tolerance);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111018);Assert.assertEquals(0.5, result[N-1].getImaginary(), tolerance);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111019);for (int i = 0; (((i < N-1)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111020)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111021)==0&false)); i += ((((i == 0 )&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111022)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111023)==0&false))? 2 : 1)) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(111024);Assert.assertEquals(0.0, result[i].getReal(), tolerance);
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(111025);Assert.assertEquals(0.0, result[i].getImaginary(), tolerance);
        }
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    /*
     * Additional tests for 2D data.
     */

    @Test
    public void test2DData() {__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceStart(getClass().getName(),111026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1atoxx12do2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ddw2ddwlb90peu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastFourierTransformerTest.test2DData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1atoxx12do2(){try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(111026);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111027);FastFourierTransformer transformer;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111028);transformer = new FastFourierTransformer(DftNormalization.STANDARD);

        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111029);double tolerance = 1E-12;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111030);Complex[][] input = new Complex[][] {new Complex[] {new Complex(1, 0),
                                                            new Complex(2, 0)},
                                             new Complex[] {new Complex(3, 1),
                                                            new Complex(4, 2)}};
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111031);Complex[][] goodOutput = new Complex[][] {new Complex[] {new Complex(5,
                1.5), new Complex(-1, -.5)}, new Complex[] {new Complex(-2,
                -1.5), new Complex(0, .5)}};
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111032);for (int i = 0; (((i < goodOutput.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111033)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111034)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(111035);TransformUtils.scaleArray(
                goodOutput[i],
                FastMath.sqrt(goodOutput[i].length) *
                    FastMath.sqrt(goodOutput.length));
        }
        }__CLR4_4_12ddw2ddwlb90peu6.R.inc(111036);Complex[][] output = (Complex[][])transformer.mdfft(input, TransformType.FORWARD);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111037);Complex[][] output2 = (Complex[][])transformer.mdfft(output, TransformType.INVERSE);

        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111038);Assert.assertEquals(input.length, output.length);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111039);Assert.assertEquals(input.length, output2.length);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111040);Assert.assertEquals(input[0].length, output[0].length);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111041);Assert.assertEquals(input[0].length, output2[0].length);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111042);Assert.assertEquals(input[1].length, output[1].length);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111043);Assert.assertEquals(input[1].length, output2[1].length);

        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111044);for (int i = 0; (((i < input.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111045)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111046)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(111047);for (int j = 0; (((j < input[0].length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111048)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111049)==0&false)); j++) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(111050);Assert.assertEquals(input[i][j].getImaginary(), output2[i][j].getImaginary(),
                             tolerance);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(111051);Assert.assertEquals(input[i][j].getReal(), output2[i][j].getReal(), tolerance);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(111052);Assert.assertEquals(goodOutput[i][j].getImaginary(), output[i][j].getImaginary(),
                             tolerance);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(111053);Assert.assertEquals(goodOutput[i][j].getReal(), output[i][j].getReal(), tolerance);
            }
        }}
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

    @Test
    public void test2DDataUnitary() {__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceStart(getClass().getName(),111054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h609wj2dou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ddw2ddwlb90peu6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ddw2ddwlb90peu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastFourierTransformerTest.test2DDataUnitary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h609wj2dou(){try{__CLR4_4_12ddw2ddwlb90peu6.R.inc(111054);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111055);FastFourierTransformer transformer;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111056);transformer = new FastFourierTransformer(DftNormalization.UNITARY);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111057);double tolerance = 1E-12;
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111058);Complex[][] input = new Complex[][] {new Complex[] {new Complex(1, 0),
                                                            new Complex(2, 0)},
                                             new Complex[] {new Complex(3, 1),
                                                            new Complex(4, 2)}};
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111059);Complex[][] goodOutput = new Complex[][] {new Complex[] {new Complex(5,
                1.5), new Complex(-1, -.5)}, new Complex[] {new Complex(-2,
                -1.5), new Complex(0, .5)}};
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111060);Complex[][] output = (Complex[][])transformer.mdfft(input, TransformType.FORWARD);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111061);Complex[][] output2 = (Complex[][])transformer.mdfft(output, TransformType.INVERSE);

        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111062);Assert.assertEquals(input.length, output.length);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111063);Assert.assertEquals(input.length, output2.length);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111064);Assert.assertEquals(input[0].length, output[0].length);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111065);Assert.assertEquals(input[0].length, output2[0].length);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111066);Assert.assertEquals(input[1].length, output[1].length);
        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111067);Assert.assertEquals(input[1].length, output2[1].length);

        __CLR4_4_12ddw2ddwlb90peu6.R.inc(111068);for (int i = 0; (((i < input.length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111069)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111070)==0&false)); i++) {{
            __CLR4_4_12ddw2ddwlb90peu6.R.inc(111071);for (int j = 0; (((j < input[0].length)&&(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111072)!=0|true))||(__CLR4_4_12ddw2ddwlb90peu6.R.iget(111073)==0&false)); j++) {{
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(111074);Assert.assertEquals(input[i][j].getImaginary(), output2[i][j].getImaginary(),
                             tolerance);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(111075);Assert.assertEquals(input[i][j].getReal(), output2[i][j].getReal(), tolerance);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(111076);Assert.assertEquals(goodOutput[i][j].getImaginary(), output[i][j].getImaginary(),
                             tolerance);
                __CLR4_4_12ddw2ddwlb90peu6.R.inc(111077);Assert.assertEquals(goodOutput[i][j].getReal(), output[i][j].getReal(), tolerance);
            }
        }}
    }}finally{__CLR4_4_12ddw2ddwlb90peu6.R.flushNeeded();}}

}
