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
package org.apache.commons.math3.fitting;

import java.util.Random;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.analysis.function.HarmonicOscillator;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

import org.junit.Test;
import org.junit.Assert;

public class HarmonicFitterTest {static class __CLR4_4_11l491l49lb90pci6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,74128,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test(expected=NumberIsTooSmallException.class)
    public void testPreconditions1() {__CLR4_4_11l491l49lb90pci6.R.globalSliceStart(getClass().getName(),74025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vuhld1l49();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,49,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l491l49lb90pci6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l491l49lb90pci6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.HarmonicFitterTest.testPreconditions1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vuhld1l49(){try{__CLR4_4_11l491l49lb90pci6.R.inc(74025);
        __CLR4_4_11l491l49lb90pci6.R.inc(74026);HarmonicFitter fitter =
            new HarmonicFitter(new LevenbergMarquardtOptimizer());

        __CLR4_4_11l491l49lb90pci6.R.inc(74027);fitter.fit();
    }finally{__CLR4_4_11l491l49lb90pci6.R.flushNeeded();}}

    @Test
    public void testNoError() {__CLR4_4_11l491l49lb90pci6.R.globalSliceStart(getClass().getName(),74028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9ceis1l4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l491l49lb90pci6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l491l49lb90pci6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.HarmonicFitterTest.testNoError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9ceis1l4c(){try{__CLR4_4_11l491l49lb90pci6.R.inc(74028);
        __CLR4_4_11l491l49lb90pci6.R.inc(74029);final double a = 0.2;
        __CLR4_4_11l491l49lb90pci6.R.inc(74030);final double w = 3.4;
        __CLR4_4_11l491l49lb90pci6.R.inc(74031);final double p = 4.1;
        __CLR4_4_11l491l49lb90pci6.R.inc(74032);HarmonicOscillator f = new HarmonicOscillator(a, w, p);

        __CLR4_4_11l491l49lb90pci6.R.inc(74033);HarmonicFitter fitter =
            new HarmonicFitter(new LevenbergMarquardtOptimizer());
        __CLR4_4_11l491l49lb90pci6.R.inc(74034);for (double x = 0.0; (((x < 1.3)&&(__CLR4_4_11l491l49lb90pci6.R.iget(74035)!=0|true))||(__CLR4_4_11l491l49lb90pci6.R.iget(74036)==0&false)); x += 0.01) {{
            __CLR4_4_11l491l49lb90pci6.R.inc(74037);fitter.addObservedPoint(1, x, f.value(x));
        }

        }__CLR4_4_11l491l49lb90pci6.R.inc(74038);final double[] fitted = fitter.fit();
        __CLR4_4_11l491l49lb90pci6.R.inc(74039);Assert.assertEquals(a, fitted[0], 1.0e-13);
        __CLR4_4_11l491l49lb90pci6.R.inc(74040);Assert.assertEquals(w, fitted[1], 1.0e-13);
        __CLR4_4_11l491l49lb90pci6.R.inc(74041);Assert.assertEquals(p, MathUtils.normalizeAngle(fitted[2], p), 1e-13);

        __CLR4_4_11l491l49lb90pci6.R.inc(74042);HarmonicOscillator ff = new HarmonicOscillator(fitted[0], fitted[1], fitted[2]);

        __CLR4_4_11l491l49lb90pci6.R.inc(74043);for (double x = -1.0; (((x < 1.0)&&(__CLR4_4_11l491l49lb90pci6.R.iget(74044)!=0|true))||(__CLR4_4_11l491l49lb90pci6.R.iget(74045)==0&false)); x += 0.01) {{
            __CLR4_4_11l491l49lb90pci6.R.inc(74046);Assert.assertTrue(FastMath.abs(f.value(x) - ff.value(x)) < 1e-13);
        }
    }}finally{__CLR4_4_11l491l49lb90pci6.R.flushNeeded();}}

    @Test
    public void test1PercentError() {__CLR4_4_11l491l49lb90pci6.R.globalSliceStart(getClass().getName(),74047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnh0ll1l4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l491l49lb90pci6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l491l49lb90pci6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.HarmonicFitterTest.test1PercentError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnh0ll1l4v(){try{__CLR4_4_11l491l49lb90pci6.R.inc(74047);
        __CLR4_4_11l491l49lb90pci6.R.inc(74048);Random randomizer = new Random(64925784252l);
        __CLR4_4_11l491l49lb90pci6.R.inc(74049);final double a = 0.2;
        __CLR4_4_11l491l49lb90pci6.R.inc(74050);final double w = 3.4;
        __CLR4_4_11l491l49lb90pci6.R.inc(74051);final double p = 4.1;
        __CLR4_4_11l491l49lb90pci6.R.inc(74052);HarmonicOscillator f = new HarmonicOscillator(a, w, p);

        __CLR4_4_11l491l49lb90pci6.R.inc(74053);HarmonicFitter fitter =
            new HarmonicFitter(new LevenbergMarquardtOptimizer());
        __CLR4_4_11l491l49lb90pci6.R.inc(74054);for (double x = 0.0; (((x < 10.0)&&(__CLR4_4_11l491l49lb90pci6.R.iget(74055)!=0|true))||(__CLR4_4_11l491l49lb90pci6.R.iget(74056)==0&false)); x += 0.1) {{
            __CLR4_4_11l491l49lb90pci6.R.inc(74057);fitter.addObservedPoint(1, x,
                                    f.value(x) + 0.01 * randomizer.nextGaussian());
        }

        }__CLR4_4_11l491l49lb90pci6.R.inc(74058);final double[] fitted = fitter.fit();
        __CLR4_4_11l491l49lb90pci6.R.inc(74059);Assert.assertEquals(a, fitted[0], 7.6e-4);
        __CLR4_4_11l491l49lb90pci6.R.inc(74060);Assert.assertEquals(w, fitted[1], 2.7e-3);
        __CLR4_4_11l491l49lb90pci6.R.inc(74061);Assert.assertEquals(p, MathUtils.normalizeAngle(fitted[2], p), 1.3e-2);
    }finally{__CLR4_4_11l491l49lb90pci6.R.flushNeeded();}}

    @Test
    public void testTinyVariationsData() {__CLR4_4_11l491l49lb90pci6.R.globalSliceStart(getClass().getName(),74062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y2q2jh1l5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l491l49lb90pci6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l491l49lb90pci6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.HarmonicFitterTest.testTinyVariationsData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y2q2jh1l5a(){try{__CLR4_4_11l491l49lb90pci6.R.inc(74062);
        __CLR4_4_11l491l49lb90pci6.R.inc(74063);Random randomizer = new Random(64925784252l);

        __CLR4_4_11l491l49lb90pci6.R.inc(74064);HarmonicFitter fitter =
            new HarmonicFitter(new LevenbergMarquardtOptimizer());
        __CLR4_4_11l491l49lb90pci6.R.inc(74065);for (double x = 0.0; (((x < 10.0)&&(__CLR4_4_11l491l49lb90pci6.R.iget(74066)!=0|true))||(__CLR4_4_11l491l49lb90pci6.R.iget(74067)==0&false)); x += 0.1) {{
            __CLR4_4_11l491l49lb90pci6.R.inc(74068);fitter.addObservedPoint(1, x, 1e-7 * randomizer.nextGaussian());
        }

        }__CLR4_4_11l491l49lb90pci6.R.inc(74069);fitter.fit();
        // This test serves to cover the part of the code of "guessAOmega"
        // when the algorithm using integrals fails.
    }finally{__CLR4_4_11l491l49lb90pci6.R.flushNeeded();}}

    @Test
    public void testInitialGuess() {__CLR4_4_11l491l49lb90pci6.R.globalSliceStart(getClass().getName(),74070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1io0sb01l5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l491l49lb90pci6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l491l49lb90pci6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.HarmonicFitterTest.testInitialGuess",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1io0sb01l5i(){try{__CLR4_4_11l491l49lb90pci6.R.inc(74070);
        __CLR4_4_11l491l49lb90pci6.R.inc(74071);Random randomizer = new Random(45314242l);
        __CLR4_4_11l491l49lb90pci6.R.inc(74072);final double a = 0.2;
        __CLR4_4_11l491l49lb90pci6.R.inc(74073);final double w = 3.4;
        __CLR4_4_11l491l49lb90pci6.R.inc(74074);final double p = 4.1;
        __CLR4_4_11l491l49lb90pci6.R.inc(74075);HarmonicOscillator f = new HarmonicOscillator(a, w, p);

        __CLR4_4_11l491l49lb90pci6.R.inc(74076);HarmonicFitter fitter =
            new HarmonicFitter(new LevenbergMarquardtOptimizer());
        __CLR4_4_11l491l49lb90pci6.R.inc(74077);for (double x = 0.0; (((x < 10.0)&&(__CLR4_4_11l491l49lb90pci6.R.iget(74078)!=0|true))||(__CLR4_4_11l491l49lb90pci6.R.iget(74079)==0&false)); x += 0.1) {{
            __CLR4_4_11l491l49lb90pci6.R.inc(74080);fitter.addObservedPoint(1, x,
                                    f.value(x) + 0.01 * randomizer.nextGaussian());
        }

        }__CLR4_4_11l491l49lb90pci6.R.inc(74081);final double[] fitted = fitter.fit(new double[] { 0.15, 3.6, 4.5 });
        __CLR4_4_11l491l49lb90pci6.R.inc(74082);Assert.assertEquals(a, fitted[0], 1.2e-3);
        __CLR4_4_11l491l49lb90pci6.R.inc(74083);Assert.assertEquals(w, fitted[1], 3.3e-3);
        __CLR4_4_11l491l49lb90pci6.R.inc(74084);Assert.assertEquals(p, MathUtils.normalizeAngle(fitted[2], p), 1.7e-2);
    }finally{__CLR4_4_11l491l49lb90pci6.R.flushNeeded();}}

    @Test
    public void testUnsorted() {__CLR4_4_11l491l49lb90pci6.R.globalSliceStart(getClass().getName(),74085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gvvjw11l5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l491l49lb90pci6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l491l49lb90pci6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.HarmonicFitterTest.testUnsorted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gvvjw11l5x(){try{__CLR4_4_11l491l49lb90pci6.R.inc(74085);
        __CLR4_4_11l491l49lb90pci6.R.inc(74086);Random randomizer = new Random(64925784252l);
        __CLR4_4_11l491l49lb90pci6.R.inc(74087);final double a = 0.2;
        __CLR4_4_11l491l49lb90pci6.R.inc(74088);final double w = 3.4;
        __CLR4_4_11l491l49lb90pci6.R.inc(74089);final double p = 4.1;
        __CLR4_4_11l491l49lb90pci6.R.inc(74090);HarmonicOscillator f = new HarmonicOscillator(a, w, p);

        __CLR4_4_11l491l49lb90pci6.R.inc(74091);HarmonicFitter fitter =
            new HarmonicFitter(new LevenbergMarquardtOptimizer());

        // build a regularly spaced array of measurements
        __CLR4_4_11l491l49lb90pci6.R.inc(74092);int size = 100;
        __CLR4_4_11l491l49lb90pci6.R.inc(74093);double[] xTab = new double[size];
        __CLR4_4_11l491l49lb90pci6.R.inc(74094);double[] yTab = new double[size];
        __CLR4_4_11l491l49lb90pci6.R.inc(74095);for (int i = 0; (((i < size)&&(__CLR4_4_11l491l49lb90pci6.R.iget(74096)!=0|true))||(__CLR4_4_11l491l49lb90pci6.R.iget(74097)==0&false)); ++i) {{
            __CLR4_4_11l491l49lb90pci6.R.inc(74098);xTab[i] = 0.1 * i;
            __CLR4_4_11l491l49lb90pci6.R.inc(74099);yTab[i] = f.value(xTab[i]) + 0.01 * randomizer.nextGaussian();
        }

        // shake it
        }__CLR4_4_11l491l49lb90pci6.R.inc(74100);for (int i = 0; (((i < size)&&(__CLR4_4_11l491l49lb90pci6.R.iget(74101)!=0|true))||(__CLR4_4_11l491l49lb90pci6.R.iget(74102)==0&false)); ++i) {{
            __CLR4_4_11l491l49lb90pci6.R.inc(74103);int i1 = randomizer.nextInt(size);
            __CLR4_4_11l491l49lb90pci6.R.inc(74104);int i2 = randomizer.nextInt(size);
            __CLR4_4_11l491l49lb90pci6.R.inc(74105);double xTmp = xTab[i1];
            __CLR4_4_11l491l49lb90pci6.R.inc(74106);double yTmp = yTab[i1];
            __CLR4_4_11l491l49lb90pci6.R.inc(74107);xTab[i1] = xTab[i2];
            __CLR4_4_11l491l49lb90pci6.R.inc(74108);yTab[i1] = yTab[i2];
            __CLR4_4_11l491l49lb90pci6.R.inc(74109);xTab[i2] = xTmp;
            __CLR4_4_11l491l49lb90pci6.R.inc(74110);yTab[i2] = yTmp;
        }

        // pass it to the fitter
        }__CLR4_4_11l491l49lb90pci6.R.inc(74111);for (int i = 0; (((i < size)&&(__CLR4_4_11l491l49lb90pci6.R.iget(74112)!=0|true))||(__CLR4_4_11l491l49lb90pci6.R.iget(74113)==0&false)); ++i) {{
            __CLR4_4_11l491l49lb90pci6.R.inc(74114);fitter.addObservedPoint(1, xTab[i], yTab[i]);
        }

        }__CLR4_4_11l491l49lb90pci6.R.inc(74115);final double[] fitted = fitter.fit();
        __CLR4_4_11l491l49lb90pci6.R.inc(74116);Assert.assertEquals(a, fitted[0], 7.6e-4);
        __CLR4_4_11l491l49lb90pci6.R.inc(74117);Assert.assertEquals(w, fitted[1], 3.5e-3);
        __CLR4_4_11l491l49lb90pci6.R.inc(74118);Assert.assertEquals(p, MathUtils.normalizeAngle(fitted[2], p), 1.5e-2);
    }finally{__CLR4_4_11l491l49lb90pci6.R.flushNeeded();}}

    @Test(expected=MathIllegalStateException.class)
    public void testMath844() {__CLR4_4_11l491l49lb90pci6.R.globalSliceStart(getClass().getName(),74119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vruksb1l6v();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,116,104,56,52,52,58,32,91,77,97,116,104,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l491l49lb90pci6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l491l49lb90pci6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.HarmonicFitterTest.testMath844",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vruksb1l6v(){try{__CLR4_4_11l491l49lb90pci6.R.inc(74119);
        __CLR4_4_11l491l49lb90pci6.R.inc(74120);final double[] y = { 0, 1, 2, 3, 2, 1,
                             0, -1, -2, -3, -2, -1,
                             0, 1, 2, 3, 2, 1,
                             0, -1, -2, -3, -2, -1,
                             0, 1, 2, 3, 2, 1, 0 };
        __CLR4_4_11l491l49lb90pci6.R.inc(74121);final int len = y.length;
        __CLR4_4_11l491l49lb90pci6.R.inc(74122);final WeightedObservedPoint[] points = new WeightedObservedPoint[len];
        __CLR4_4_11l491l49lb90pci6.R.inc(74123);for (int i = 0; (((i < len)&&(__CLR4_4_11l491l49lb90pci6.R.iget(74124)!=0|true))||(__CLR4_4_11l491l49lb90pci6.R.iget(74125)==0&false)); i++) {{
            __CLR4_4_11l491l49lb90pci6.R.inc(74126);points[i] = new WeightedObservedPoint(1, i, y[i]);
        }

        // The guesser fails because the function is far from an harmonic
        // function: It is a triangular periodic function with amplitude 3
        // and period 12, and all sample points are taken at integer abscissae
        // so function values all belong to the integer subset {-3, -2, -1, 0,
        // 1, 2, 3}.
        }__CLR4_4_11l491l49lb90pci6.R.inc(74127);new HarmonicFitter.ParameterGuesser(points);
    }finally{__CLR4_4_11l491l49lb90pci6.R.flushNeeded();}}
}
