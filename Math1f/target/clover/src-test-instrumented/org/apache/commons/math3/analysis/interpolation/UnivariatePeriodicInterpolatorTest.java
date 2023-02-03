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
package org.apache.commons.math3.analysis.interpolation;

import java.util.Random;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;

import org.junit.Assert;
import org.junit.Test;


/**
 * Test for {@link UnivariatePeriodicInterpolator}.
 */
public class UnivariatePeriodicInterpolatorTest {static class __CLR4_4_11g0s1g0slb90pc2u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,67512,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final Random rng = new Random(1224465L);

    @Test
    public void testSine() {__CLR4_4_11g0s1g0slb90pc2u.R.globalSliceStart(getClass().getName(),67420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16h6gfa1g0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g0s1g0slb90pc2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g0s1g0slb90pc2u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest.testSine",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16h6gfa1g0s(){try{__CLR4_4_11g0s1g0slb90pc2u.R.inc(67420);
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67421);final int n = 30;
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67422);final double[] xval = new double[n];
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67423);final double[] yval = new double[n];
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67424);final double period = 12.3;
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67425);final double offset = 45.67;

        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67426);double delta = 0;
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67427);for (int i = 0; (((i < n)&&(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67428)!=0|true))||(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67429)==0&false)); i++) {{
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67430);delta += rng.nextDouble() * period / n;
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67431);xval[i] = offset + delta;
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67432);yval[i] = FastMath.sin(xval[i]);
        }

        }__CLR4_4_11g0s1g0slb90pc2u.R.inc(67433);final UnivariateInterpolator inter = new LinearInterpolator();
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67434);final UnivariateFunction f = inter.interpolate(xval, yval);

        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67435);final UnivariateInterpolator interP
            = new UnivariatePeriodicInterpolator(new LinearInterpolator(),
                                                     period, 1);
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67436);final UnivariateFunction fP = interP.interpolate(xval, yval);

        // Comparing with original interpolation algorithm.
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67437);final double xMin = xval[0];
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67438);final double xMax = xval[n - 1];
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67439);for (int i = 0; (((i < n)&&(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67440)!=0|true))||(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67441)==0&false)); i++) {{
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67442);final double x = xMin + (xMax - xMin) * rng.nextDouble();
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67443);final double y = f.value(x);
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67444);final double yP = fP.value(x);

            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67445);Assert.assertEquals("x=" + x, y, yP, Math.ulp(1d));
        }

        // Test interpolation outside the primary interval.
        }__CLR4_4_11g0s1g0slb90pc2u.R.inc(67446);for (int i = 0; (((i < n)&&(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67447)!=0|true))||(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67448)==0&false)); i++) {{
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67449);final double xIn = offset + rng.nextDouble() * period;
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67450);final double xOut = xIn + rng.nextInt(123456789) * period;
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67451);final double yIn = fP.value(xIn);
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67452);final double yOut = fP.value(xOut);

            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67453);Assert.assertEquals(yIn, yOut, 1e-7);
        }
    }}finally{__CLR4_4_11g0s1g0slb90pc2u.R.flushNeeded();}}

    @Test
    public void testLessThanOnePeriodCoverage() {__CLR4_4_11g0s1g0slb90pc2u.R.globalSliceStart(getClass().getName(),67454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqlz061g1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g0s1g0slb90pc2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g0s1g0slb90pc2u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest.testLessThanOnePeriodCoverage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqlz061g1q(){try{__CLR4_4_11g0s1g0slb90pc2u.R.inc(67454);
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67455);final int n = 30;
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67456);final double[] xval = new double[n];
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67457);final double[] yval = new double[n];
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67458);final double period = 12.3;
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67459);final double offset = 45.67;

        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67460);double delta = period / 2;
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67461);for (int i = 0; (((i < n)&&(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67462)!=0|true))||(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67463)==0&false)); i++) {{
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67464);delta += period / (2 * n) * rng.nextDouble();
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67465);xval[i] = offset + delta;
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67466);yval[i] = FastMath.sin(xval[i]);
        }

        }__CLR4_4_11g0s1g0slb90pc2u.R.inc(67467);final UnivariateInterpolator interP
            = new UnivariatePeriodicInterpolator(new LinearInterpolator(),
                                                     period, 1);
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67468);final UnivariateFunction fP = interP.interpolate(xval, yval);

        // Test interpolation outside the sample data interval.
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67469);for (int i = 0; (((i < n)&&(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67470)!=0|true))||(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67471)==0&false)); i++) {{
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67472);final double xIn = offset + rng.nextDouble() * period;
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67473);final double xOut = xIn + rng.nextInt(123456789) * period;
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67474);final double yIn = fP.value(xIn);
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67475);final double yOut = fP.value(xOut);

            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67476);Assert.assertEquals(yIn, yOut, 1e-7);
        }
    }}finally{__CLR4_4_11g0s1g0slb90pc2u.R.flushNeeded();}}

    @Test
    public void testMoreThanOnePeriodCoverage() {__CLR4_4_11g0s1g0slb90pc2u.R.globalSliceStart(getClass().getName(),67477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9k6vi1g2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g0s1g0slb90pc2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g0s1g0slb90pc2u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest.testMoreThanOnePeriodCoverage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9k6vi1g2d(){try{__CLR4_4_11g0s1g0slb90pc2u.R.inc(67477);
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67478);final int n = 30;
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67479);final double[] xval = new double[n];
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67480);final double[] yval = new double[n];
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67481);final double period = 12.3;
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67482);final double offset = 45.67;

        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67483);double delta = period / 2;
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67484);for (int i = 0; (((i < n)&&(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67485)!=0|true))||(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67486)==0&false)); i++) {{
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67487);delta += 10 * period / n * rng.nextDouble();
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67488);xval[i] = offset + delta;
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67489);yval[i] = FastMath.sin(xval[i]);
        }

        }__CLR4_4_11g0s1g0slb90pc2u.R.inc(67490);final UnivariateInterpolator interP
            = new UnivariatePeriodicInterpolator(new LinearInterpolator(),
                                                     period, 1);
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67491);final UnivariateFunction fP = interP.interpolate(xval, yval);

        // Test interpolation outside the sample data interval.
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67492);for (int i = 0; (((i < n)&&(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67493)!=0|true))||(__CLR4_4_11g0s1g0slb90pc2u.R.iget(67494)==0&false)); i++) {{
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67495);final double xIn = offset + rng.nextDouble() * period;
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67496);final double xOut = xIn + rng.nextInt(123456789) * period;
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67497);final double yIn = fP.value(xIn);
            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67498);final double yOut = fP.value(xOut);

            __CLR4_4_11g0s1g0slb90pc2u.R.inc(67499);Assert.assertEquals(yIn, yOut, 1e-6);
        }
    }}finally{__CLR4_4_11g0s1g0slb90pc2u.R.flushNeeded();}}

    @Test(expected=NumberIsTooSmallException.class)
    public void testTooFewSamples() {__CLR4_4_11g0s1g0slb90pc2u.R.globalSliceStart(getClass().getName(),67500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qn51ae1g30();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,111,70,101,119,83,97,109,112,108,101,115,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g0s1g0slb90pc2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g0s1g0slb90pc2u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest.testTooFewSamples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qn51ae1g30(){try{__CLR4_4_11g0s1g0slb90pc2u.R.inc(67500);
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67501);final double[] xval = { 2, 3, 7 };
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67502);final double[] yval = { 1, 6, 5 };
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67503);final double period = 10;

        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67504);final UnivariateInterpolator interpolator
            = new UnivariatePeriodicInterpolator(new LinearInterpolator(), period);
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67505);interpolator.interpolate(xval, yval);
    }finally{__CLR4_4_11g0s1g0slb90pc2u.R.flushNeeded();}}

    @Test(expected=NonMonotonicSequenceException.class)
    public void testUnsortedSamples() {__CLR4_4_11g0s1g0slb90pc2u.R.globalSliceStart(getClass().getName(),67506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w24yq01g36();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,85,110,115,111,114,116,101,100,83,97,109,112,108,101,115,58,32,91,78,111,110,77,111,110,111,116,111,110,105,99,83,101,113,117,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonMonotonicSequenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g0s1g0slb90pc2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g0s1g0slb90pc2u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest.testUnsortedSamples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w24yq01g36(){try{__CLR4_4_11g0s1g0slb90pc2u.R.inc(67506);
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67507);final double[] xval = { 2, 3, 7, 4, 6 };
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67508);final double[] yval = { 1, 6, 5, -1, -2 };
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67509);final double period = 10;

        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67510);final UnivariateInterpolator interpolator
            = new UnivariatePeriodicInterpolator(new LinearInterpolator(), period);
        __CLR4_4_11g0s1g0slb90pc2u.R.inc(67511);interpolator.interpolate(xval, yval);
    }finally{__CLR4_4_11g0s1g0slb90pc2u.R.flushNeeded();}}
}
