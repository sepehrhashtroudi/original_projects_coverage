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

import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test of the LoessInterpolator class.
 */
public class LoessInterpolatorTest {static class __CLR4_4_11fbb1fbblb90pc1m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,66639,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testOnOnePoint() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1absg7y1fbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testOnOnePoint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1absg7y1fbb(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66503);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66504);double[] xval = {0.5};
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66505);double[] yval = {0.7};
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66506);double[] res = new LoessInterpolator().smooth(xval, yval);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66507);Assert.assertEquals(1, res.length);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66508);Assert.assertEquals(0.7, res[0], 0.0);
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test
    public void testOnTwoPoints() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tms6631fbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testOnTwoPoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tms6631fbh(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66509);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66510);double[] xval = {0.5, 0.6};
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66511);double[] yval = {0.7, 0.8};
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66512);double[] res = new LoessInterpolator().smooth(xval, yval);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66513);Assert.assertEquals(2, res.length);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66514);Assert.assertEquals(0.7, res[0], 0.0);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66515);Assert.assertEquals(0.8, res[1], 0.0);
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test
    public void testOnStraightLine() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vo5ra1fbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testOnStraightLine",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vo5ra1fbo(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66516);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66517);double[] xval = {1,2,3,4,5};
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66518);double[] yval = {2,4,6,8,10};
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66519);LoessInterpolator li = new LoessInterpolator(0.6, 2, 1e-12);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66520);double[] res = li.smooth(xval, yval);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66521);Assert.assertEquals(5, res.length);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66522);for(int i = 0; (((i < 5)&&(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66523)!=0|true))||(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66524)==0&false)); ++i) {{
            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66525);Assert.assertEquals(yval[i], res[i], 1e-8);
        }
    }}finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test
    public void testOnDistortedSine() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13hhr0t1fby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testOnDistortedSine",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13hhr0t1fby(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66526);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66527);int numPoints = 100;
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66528);double[] xval = new double[numPoints];
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66529);double[] yval = new double[numPoints];
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66530);double xnoise = 0.1;
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66531);double ynoise = 0.2;

        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66532);generateSineData(xval, yval, xnoise, ynoise);

        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66533);LoessInterpolator li = new LoessInterpolator(0.3, 4, 1e-12);

        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66534);double[] res = li.smooth(xval, yval);

        // Check that the resulting curve differs from
        // the "real" sine less than the jittered one

        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66535);double noisyResidualSum = 0;
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66536);double fitResidualSum = 0;

        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66537);for(int i = 0; (((i < numPoints)&&(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66538)!=0|true))||(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66539)==0&false)); ++i) {{
            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66540);double expected = FastMath.sin(xval[i]);
            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66541);double noisy = yval[i];
            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66542);double fit = res[i];

            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66543);noisyResidualSum += FastMath.pow(noisy - expected, 2);
            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66544);fitResidualSum += FastMath.pow(fit - expected, 2);
        }

        }__CLR4_4_11fbb1fbblb90pc1m.R.inc(66545);Assert.assertTrue(fitResidualSum < noisyResidualSum);
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test
    public void testIncreasingBandwidthIncreasesSmoothness() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ose1191fci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testIncreasingBandwidthIncreasesSmoothness",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ose1191fci(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66546);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66547);int numPoints = 100;
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66548);double[] xval = new double[numPoints];
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66549);double[] yval = new double[numPoints];
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66550);double xnoise = 0.1;
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66551);double ynoise = 0.1;

        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66552);generateSineData(xval, yval, xnoise, ynoise);

        // Check that variance decreases as bandwidth increases

        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66553);double[] bandwidths = {0.1, 0.5, 1.0};
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66554);double[] variances = new double[bandwidths.length];
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66555);for (int i = 0; (((i < bandwidths.length)&&(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66556)!=0|true))||(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66557)==0&false)); i++) {{
            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66558);double bw = bandwidths[i];

            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66559);LoessInterpolator li = new LoessInterpolator(bw, 4, 1e-12);

            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66560);double[] res = li.smooth(xval, yval);

            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66561);for (int j = 1; (((j < res.length)&&(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66562)!=0|true))||(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66563)==0&false)); ++j) {{
                __CLR4_4_11fbb1fbblb90pc1m.R.inc(66564);variances[i] += FastMath.pow(res[j] - res[j-1], 2);
            }
        }}

        }__CLR4_4_11fbb1fbblb90pc1m.R.inc(66565);for(int i = 1; (((i < variances.length)&&(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66566)!=0|true))||(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66567)==0&false)); ++i) {{
            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66568);Assert.assertTrue(variances[i] < variances[i-1]);
        }
    }}finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test
    public void testIncreasingRobustnessItersIncreasesSmoothnessWithOutliers() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nyhpng1fd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testIncreasingRobustnessItersIncreasesSmoothnessWithOutliers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nyhpng1fd5(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66569);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66570);int numPoints = 100;
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66571);double[] xval = new double[numPoints];
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66572);double[] yval = new double[numPoints];
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66573);double xnoise = 0.1;
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66574);double ynoise = 0.1;

        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66575);generateSineData(xval, yval, xnoise, ynoise);

        // Introduce a couple of outliers
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66576);yval[numPoints/3] *= 100;
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66577);yval[2 * numPoints/3] *= -100;

        // Check that variance decreases as the number of robustness
        // iterations increases

        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66578);double[] variances = new double[4];
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66579);for (int i = 0; (((i < 4)&&(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66580)!=0|true))||(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66581)==0&false)); i++) {{
            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66582);LoessInterpolator li = new LoessInterpolator(0.3, i, 1e-12);

            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66583);double[] res = li.smooth(xval, yval);

            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66584);for (int j = 1; (((j < res.length)&&(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66585)!=0|true))||(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66586)==0&false)); ++j) {{
                __CLR4_4_11fbb1fbblb90pc1m.R.inc(66587);variances[i] += FastMath.abs(res[j] - res[j-1]);
            }
        }}

        }__CLR4_4_11fbb1fbblb90pc1m.R.inc(66588);for(int i = 1; (((i < variances.length)&&(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66589)!=0|true))||(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66590)==0&false)); ++i) {{
            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66591);Assert.assertTrue(variances[i] < variances[i-1]);
        }
    }}finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testUnequalSizeArguments() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bwgl031fds();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,85,110,101,113,117,97,108,83,105,122,101,65,114,103,117,109,101,110,116,115,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testUnequalSizeArguments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bwgl031fds(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66592);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66593);new LoessInterpolator().smooth(new double[] {1,2,3}, new double[] {1,2,3,4});
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test(expected=NoDataException.class)
    public void testEmptyData() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gh4yx81fdu();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,109,112,116,121,68,97,116,97,58,32,91,78,111,68,97,116,97,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoDataException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testEmptyData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gh4yx81fdu(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66594);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66595);new LoessInterpolator().smooth(new double[] {}, new double[] {});
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test(expected=NonMonotonicSequenceException.class)
    public void testNonStrictlyIncreasing1() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k07ppk1fdw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,83,116,114,105,99,116,108,121,73,110,99,114,101,97,115,105,110,103,49,58,32,91,78,111,110,77,111,110,111,116,111,110,105,99,83,101,113,117,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonMonotonicSequenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testNonStrictlyIncreasing1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k07ppk1fdw(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66596);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66597);new LoessInterpolator().smooth(new double[] {4,3,1,2}, new double[] {3,4,5,6});
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test(expected=NonMonotonicSequenceException.class)
    public void testNonStrictlyIncreasing2() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n97oi11fdy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,83,116,114,105,99,116,108,121,73,110,99,114,101,97,115,105,110,103,50,58,32,91,78,111,110,77,111,110,111,116,111,110,105,99,83,101,113,117,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonMonotonicSequenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testNonStrictlyIncreasing2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n97oi11fdy(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66598);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66599);new LoessInterpolator().smooth(new double[] {1,2,2,3}, new double[] {3,4,5,6});
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test(expected=NotFiniteNumberException.class)
    public void testNotAllFiniteReal1() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qx52et1fe0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,116,65,108,108,70,105,110,105,116,101,82,101,97,108,49,58,32,91,78,111,116,70,105,110,105,116,101,78,117,109,98,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotFiniteNumberException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testNotAllFiniteReal1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qx52et1fe0(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66600);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66601);new LoessInterpolator().smooth(new double[] {1,2,Double.NaN}, new double[] {3,4,5});
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test(expected=NotFiniteNumberException.class)
    public void testNotAllFiniteReal2() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1no53mc1fe2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,116,65,108,108,70,105,110,105,116,101,82,101,97,108,50,58,32,91,78,111,116,70,105,110,105,116,101,78,117,109,98,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotFiniteNumberException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testNotAllFiniteReal2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1no53mc1fe2(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66602);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66603);new LoessInterpolator().smooth(new double[] {1,2,Double.POSITIVE_INFINITY}, new double[] {3,4,5});
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test(expected=NotFiniteNumberException.class)
    public void testNotAllFiniteReal3() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kf54tv1fe4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,116,65,108,108,70,105,110,105,116,101,82,101,97,108,51,58,32,91,78,111,116,70,105,110,105,116,101,78,117,109,98,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotFiniteNumberException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testNotAllFiniteReal3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kf54tv1fe4(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66604);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66605);new LoessInterpolator().smooth(new double[] {1,2,Double.NEGATIVE_INFINITY}, new double[] {3,4,5});
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test(expected=NotFiniteNumberException.class)
    public void testNotAllFiniteReal4() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h6561e1fe6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,116,65,108,108,70,105,110,105,116,101,82,101,97,108,52,58,32,91,78,111,116,70,105,110,105,116,101,78,117,109,98,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotFiniteNumberException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testNotAllFiniteReal4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h6561e1fe6(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66606);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66607);new LoessInterpolator().smooth(new double[] {3,4,5}, new double[] {1,2,Double.NaN});
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test(expected=NotFiniteNumberException.class)
    public void testNotAllFiniteReal5() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dx578x1fe8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,116,65,108,108,70,105,110,105,116,101,82,101,97,108,53,58,32,91,78,111,116,70,105,110,105,116,101,78,117,109,98,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotFiniteNumberException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testNotAllFiniteReal5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dx578x1fe8(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66608);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66609);new LoessInterpolator().smooth(new double[] {3,4,5}, new double[] {1,2,Double.POSITIVE_INFINITY});
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test(expected=NotFiniteNumberException.class)
    public void testNotAllFiniteReal6() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ao58gg1fea();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,116,65,108,108,70,105,110,105,116,101,82,101,97,108,54,58,32,91,78,111,116,70,105,110,105,116,101,78,117,109,98,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotFiniteNumberException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testNotAllFiniteReal6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ao58gg1fea(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66610);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66611);new LoessInterpolator().smooth(new double[] {3,4,5}, new double[] {1,2,Double.NEGATIVE_INFINITY});
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test(expected=NumberIsTooSmallException.class)
    public void testInsufficientBandwidth() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4ep4t1fec();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,115,117,102,102,105,99,105,101,110,116,66,97,110,100,119,105,100,116,104,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testInsufficientBandwidth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4ep4t1fec(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66612);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66613);LoessInterpolator li = new LoessInterpolator(0.1, 3, 1e-12);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66614);li.smooth(new double[] {1,2,3,4,5,6,7,8,9,10,11,12}, new double[] {1,2,3,4,5,6,7,8,9,10,11,12});
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test(expected=OutOfRangeException.class)
    public void testCompletelyIncorrectBandwidth1() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6tgxg1fef();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,108,101,116,101,108,121,73,110,99,111,114,114,101,99,116,66,97,110,100,119,105,100,116,104,49,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testCompletelyIncorrectBandwidth1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6tgxg1fef(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66615);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66616);new LoessInterpolator(-0.2, 3, 1e-12);
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test(expected=OutOfRangeException.class)
    public void testCompletelyIncorrectBandwidth2() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tftfpx1feh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,108,101,116,101,108,121,73,110,99,111,114,114,101,99,116,66,97,110,100,119,105,100,116,104,50,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testCompletelyIncorrectBandwidth2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tftfpx1feh(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66617);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66618);new LoessInterpolator(1.1, 3, 1e-12);
    }finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    @Test
    public void testMath296withoutWeights() {__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceStart(getClass().getName(),66619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dz5ap1fej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fbb1fbblb90pc1m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fbb1fbblb90pc1m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest.testMath296withoutWeights",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dz5ap1fej(){try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66619);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66620);double[] xval = {
                0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0,
                 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0};
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66621);double[] yval = {
                0.47, 0.48, 0.55, 0.56, -0.08, -0.04, -0.07, -0.07,
                -0.56, -0.46, -0.56, -0.52, -3.03, -3.08, -3.09,
                -3.04, 3.54, 3.46, 3.36, 3.35};
        // Output from R, rounded to .001
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66622);double[] yref = {
                0.461, 0.499, 0.541, 0.308, 0.175, -0.042, -0.072,
                -0.196, -0.311, -0.446, -0.557, -1.497, -2.133,
                -3.08, -3.09, -0.621, 0.982, 3.449, 3.389, 3.336
        };
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66623);LoessInterpolator li = new LoessInterpolator(0.3, 4, 1e-12);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66624);double[] res = li.smooth(xval, yval);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66625);Assert.assertEquals(xval.length, res.length);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66626);for(int i = 0; (((i < res.length)&&(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66627)!=0|true))||(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66628)==0&false)); ++i) {{
            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66629);Assert.assertEquals(yref[i], res[i], 0.02);
        }
    }}finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}

    private void generateSineData(double[] xval, double[] yval, double xnoise, double ynoise) {try{__CLR4_4_11fbb1fbblb90pc1m.R.inc(66630);
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66631);double dx = 2 * FastMath.PI / xval.length;
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66632);double x = 0;
        __CLR4_4_11fbb1fbblb90pc1m.R.inc(66633);for(int i = 0; (((i < xval.length)&&(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66634)!=0|true))||(__CLR4_4_11fbb1fbblb90pc1m.R.iget(66635)==0&false)); ++i) {{
            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66636);xval[i] = x;
            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66637);yval[i] = FastMath.sin(x) + (2 * FastMath.random() - 1) * ynoise;
            __CLR4_4_11fbb1fbblb90pc1m.R.inc(66638);x += dx * (1 + (2 * FastMath.random() - 1) * xnoise);
        }
    }}finally{__CLR4_4_11fbb1fbblb90pc1m.R.flushNeeded();}}
}
