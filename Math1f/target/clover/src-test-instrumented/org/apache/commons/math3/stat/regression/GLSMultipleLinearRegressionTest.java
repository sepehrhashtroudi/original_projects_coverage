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
package org.apache.commons.math3.stat.regression;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.random.CorrelatedRandomVectorGenerator;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.GaussianRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.stat.correlation.Covariance;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class GLSMultipleLinearRegressionTest extends MultipleLinearRegressionAbstractTest {static class __CLR4_4_12c6l2c6llb90per0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,109243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double[] y;
    private double[][] x;
    private double[][] omega;
    private double[] longley = new double[] {
            60323,83.0,234289,2356,1590,107608,1947,
            61122,88.5,259426,2325,1456,108632,1948,
            60171,88.2,258054,3682,1616,109773,1949,
            61187,89.5,284599,3351,1650,110929,1950,
            63221,96.2,328975,2099,3099,112075,1951,
            63639,98.1,346999,1932,3594,113270,1952,
            64989,99.0,365385,1870,3547,115094,1953,
            63761,100.0,363112,3578,3350,116219,1954,
            66019,101.2,397469,2904,3048,117388,1955,
            67857,104.6,419180,2822,2857,118734,1956,
            68169,108.4,442769,2936,2798,120445,1957,
            66513,110.8,444546,4681,2637,121950,1958,
            68655,112.6,482704,3813,2552,123366,1959,
            69564,114.2,502601,3931,2514,125368,1960,
            69331,115.7,518173,4806,2572,127852,1961,
            70551,116.9,554894,4007,2827,130081,1962
        };

    @Before
    @Override
    public void setUp(){try{__CLR4_4_12c6l2c6llb90per0.R.inc(109101);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109102);y = new double[]{11.0, 12.0, 13.0, 14.0, 15.0, 16.0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109103);x = new double[6][];
        __CLR4_4_12c6l2c6llb90per0.R.inc(109104);x[0] = new double[]{0, 0, 0, 0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109105);x[1] = new double[]{2.0, 0, 0, 0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109106);x[2] = new double[]{0, 3.0, 0, 0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109107);x[3] = new double[]{0, 0, 4.0, 0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109108);x[4] = new double[]{0, 0, 0, 5.0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109109);x[5] = new double[]{0, 0, 0, 0, 6.0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109110);omega = new double[6][];
        __CLR4_4_12c6l2c6llb90per0.R.inc(109111);omega[0] = new double[]{1.0, 0, 0, 0, 0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109112);omega[1] = new double[]{0, 2.0, 0, 0, 0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109113);omega[2] = new double[]{0, 0, 3.0, 0, 0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109114);omega[3] = new double[]{0, 0, 0, 4.0, 0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109115);omega[4] = new double[]{0, 0, 0, 0, 5.0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109116);omega[5] = new double[]{0, 0, 0, 0, 0, 6.0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109117);super.setUp();
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void cannotAddXSampleData() {__CLR4_4_12c6l2c6llb90per0.R.globalSliceStart(getClass().getName(),109118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sueyuj2c72();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,99,97,110,110,111,116,65,100,100,88,83,97,109,112,108,101,68,97,116,97,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c6l2c6llb90per0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c6l2c6llb90per0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest.cannotAddXSampleData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sueyuj2c72(){try{__CLR4_4_12c6l2c6llb90per0.R.inc(109118);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109119);createRegression().newSampleData(new double[]{}, null, null);
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void cannotAddNullYSampleData() {__CLR4_4_12c6l2c6llb90per0.R.globalSliceStart(getClass().getName(),109120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vdtgx2c74();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,99,97,110,110,111,116,65,100,100,78,117,108,108,89,83,97,109,112,108,101,68,97,116,97,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c6l2c6llb90per0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c6l2c6llb90per0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest.cannotAddNullYSampleData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vdtgx2c74(){try{__CLR4_4_12c6l2c6llb90per0.R.inc(109120);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109121);createRegression().newSampleData(null, new double[][]{}, null);
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void cannotAddSampleDataWithSizeMismatch() {__CLR4_4_12c6l2c6llb90per0.R.globalSliceStart(getClass().getName(),109122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1budlo22c76();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,99,97,110,110,111,116,65,100,100,83,97,109,112,108,101,68,97,116,97,87,105,116,104,83,105,122,101,77,105,115,109,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c6l2c6llb90per0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c6l2c6llb90per0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest.cannotAddSampleDataWithSizeMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1budlo22c76(){try{__CLR4_4_12c6l2c6llb90per0.R.inc(109122);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109123);double[] y = new double[]{1.0, 2.0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109124);double[][] x = new double[1][];
        __CLR4_4_12c6l2c6llb90per0.R.inc(109125);x[0] = new double[]{1.0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109126);createRegression().newSampleData(y, x, null);
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void cannotAddNullCovarianceData() {__CLR4_4_12c6l2c6llb90per0.R.globalSliceStart(getClass().getName(),109127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgc42b2c7b();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,99,97,110,110,111,116,65,100,100,78,117,108,108,67,111,118,97,114,105,97,110,99,101,68,97,116,97,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c6l2c6llb90per0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c6l2c6llb90per0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest.cannotAddNullCovarianceData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgc42b2c7b(){try{__CLR4_4_12c6l2c6llb90per0.R.inc(109127);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109128);createRegression().newSampleData(new double[]{}, new double[][]{}, null);
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void notEnoughData() {__CLR4_4_12c6l2c6llb90per0.R.globalSliceStart(getClass().getName(),109129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eu7ffw2c7d();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,110,111,116,69,110,111,117,103,104,68,97,116,97,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c6l2c6llb90per0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c6l2c6llb90per0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest.notEnoughData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eu7ffw2c7d(){try{__CLR4_4_12c6l2c6llb90per0.R.inc(109129);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109130);double[]   reducedY = new double[y.length - 1];
        __CLR4_4_12c6l2c6llb90per0.R.inc(109131);double[][] reducedX = new double[x.length - 1][];
        __CLR4_4_12c6l2c6llb90per0.R.inc(109132);double[][] reducedO = new double[omega.length - 1][];
        __CLR4_4_12c6l2c6llb90per0.R.inc(109133);System.arraycopy(y,     0, reducedY, 0, reducedY.length);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109134);System.arraycopy(x,     0, reducedX, 0, reducedX.length);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109135);System.arraycopy(omega, 0, reducedO, 0, reducedO.length);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109136);createRegression().newSampleData(reducedY, reducedX, reducedO);
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void cannotAddCovarianceDataWithSampleSizeMismatch() {__CLR4_4_12c6l2c6llb90per0.R.globalSliceStart(getClass().getName(),109137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198lmzv2c7l();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,99,97,110,110,111,116,65,100,100,67,111,118,97,114,105,97,110,99,101,68,97,116,97,87,105,116,104,83,97,109,112,108,101,83,105,122,101,77,105,115,109,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c6l2c6llb90per0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c6l2c6llb90per0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest.cannotAddCovarianceDataWithSampleSizeMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198lmzv2c7l(){try{__CLR4_4_12c6l2c6llb90per0.R.inc(109137);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109138);double[] y = new double[]{1.0, 2.0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109139);double[][] x = new double[2][];
        __CLR4_4_12c6l2c6llb90per0.R.inc(109140);x[0] = new double[]{1.0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109141);x[1] = new double[]{0, 1.0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109142);double[][] omega = new double[1][];
        __CLR4_4_12c6l2c6llb90per0.R.inc(109143);omega[0] = new double[]{1.0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109144);createRegression().newSampleData(y, x, omega);
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void cannotAddCovarianceDataThatIsNotSquare() {__CLR4_4_12c6l2c6llb90per0.R.globalSliceStart(getClass().getName(),109145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2e7b32c7t();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,99,97,110,110,111,116,65,100,100,67,111,118,97,114,105,97,110,99,101,68,97,116,97,84,104,97,116,73,115,78,111,116,83,113,117,97,114,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c6l2c6llb90per0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c6l2c6llb90per0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest.cannotAddCovarianceDataThatIsNotSquare",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2e7b32c7t(){try{__CLR4_4_12c6l2c6llb90per0.R.inc(109145);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109146);double[] y = new double[]{1.0, 2.0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109147);double[][] x = new double[2][];
        __CLR4_4_12c6l2c6llb90per0.R.inc(109148);x[0] = new double[]{1.0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109149);x[1] = new double[]{0, 1.0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109150);double[][] omega = new double[3][];
        __CLR4_4_12c6l2c6llb90per0.R.inc(109151);omega[0] = new double[]{1.0, 0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109152);omega[1] = new double[]{0, 1.0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109153);omega[2] = new double[]{0, 2.0};
        __CLR4_4_12c6l2c6llb90per0.R.inc(109154);createRegression().newSampleData(y, x, omega);
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}

    @Override
    protected GLSMultipleLinearRegression createRegression() {try{__CLR4_4_12c6l2c6llb90per0.R.inc(109155);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109156);GLSMultipleLinearRegression regression = new GLSMultipleLinearRegression();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109157);regression.newSampleData(y, x, omega);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109158);return regression;
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}

    @Override
    protected int getNumberOfRegressors() {try{__CLR4_4_12c6l2c6llb90per0.R.inc(109159);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109160);return x[0].length + 1;
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}

    @Override
    protected int getSampleSize() {try{__CLR4_4_12c6l2c6llb90per0.R.inc(109161);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109162);return y.length;
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}

    /**
     * test calculateYVariance
     */
    @Test
    public void testYVariance() {__CLR4_4_12c6l2c6llb90per0.R.globalSliceStart(getClass().getName(),109163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cw1fz52c8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c6l2c6llb90per0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c6l2c6llb90per0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest.testYVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cw1fz52c8b(){try{__CLR4_4_12c6l2c6llb90per0.R.inc(109163);

        // assumes: y = new double[]{11.0, 12.0, 13.0, 14.0, 15.0, 16.0};

        __CLR4_4_12c6l2c6llb90per0.R.inc(109164);GLSMultipleLinearRegression model = new GLSMultipleLinearRegression();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109165);model.newSampleData(y, x, omega);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109166);TestUtils.assertEquals(model.calculateYVariance(), 3.5, 0);
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}
    
    /**
     * Verifies that setting X, Y and covariance separately has the same effect as newSample(X,Y,cov).
     */
    @Test
    public void testNewSample2() {__CLR4_4_12c6l2c6llb90per0.R.globalSliceStart(getClass().getName(),109167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmbfsv2c8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c6l2c6llb90per0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c6l2c6llb90per0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest.testNewSample2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmbfsv2c8f(){try{__CLR4_4_12c6l2c6llb90per0.R.inc(109167);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109168);double[] y = new double[] {1, 2, 3, 4}; 
        __CLR4_4_12c6l2c6llb90per0.R.inc(109169);double[][] x = new double[][] {
          {19, 22, 33},
          {20, 30, 40},
          {25, 35, 45},
          {27, 37, 47}   
        };
        __CLR4_4_12c6l2c6llb90per0.R.inc(109170);double[][] covariance = MatrixUtils.createRealIdentityMatrix(4).scalarMultiply(2).getData();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109171);GLSMultipleLinearRegression regression = new GLSMultipleLinearRegression();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109172);regression.newSampleData(y, x, covariance);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109173);RealMatrix combinedX = regression.getX().copy();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109174);RealVector combinedY = regression.getY().copy();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109175);RealMatrix combinedCovInv = regression.getOmegaInverse();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109176);regression.newXSampleData(x);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109177);regression.newYSampleData(y);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109178);Assert.assertEquals(combinedX, regression.getX());
        __CLR4_4_12c6l2c6llb90per0.R.inc(109179);Assert.assertEquals(combinedY, regression.getY());
        __CLR4_4_12c6l2c6llb90per0.R.inc(109180);Assert.assertEquals(combinedCovInv, regression.getOmegaInverse());
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}
    
    /**
     * Verifies that GLS with identity covariance matrix gives the same results
     * as OLS.
     */
    @Test
    public void testGLSOLSConsistency() {__CLR4_4_12c6l2c6llb90per0.R.globalSliceStart(getClass().getName(),109181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18kkisb2c8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c6l2c6llb90per0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c6l2c6llb90per0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest.testGLSOLSConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18kkisb2c8t(){try{__CLR4_4_12c6l2c6llb90per0.R.inc(109181);      
        __CLR4_4_12c6l2c6llb90per0.R.inc(109182);RealMatrix identityCov = MatrixUtils.createRealIdentityMatrix(16);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109183);GLSMultipleLinearRegression glsModel = new GLSMultipleLinearRegression();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109184);OLSMultipleLinearRegression olsModel = new OLSMultipleLinearRegression();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109185);glsModel.newSampleData(longley, 16, 6);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109186);olsModel.newSampleData(longley, 16, 6);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109187);glsModel.newCovarianceData(identityCov.getData());
        __CLR4_4_12c6l2c6llb90per0.R.inc(109188);double[] olsBeta = olsModel.calculateBeta().toArray();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109189);double[] glsBeta = glsModel.calculateBeta().toArray();
        // TODO:  Should have assertRelativelyEquals(double[], double[], eps) in TestUtils
        //        Should also add RealVector and RealMatrix versions
        __CLR4_4_12c6l2c6llb90per0.R.inc(109190);for (int i = 0; (((i < olsBeta.length)&&(__CLR4_4_12c6l2c6llb90per0.R.iget(109191)!=0|true))||(__CLR4_4_12c6l2c6llb90per0.R.iget(109192)==0&false)); i++) {{
            __CLR4_4_12c6l2c6llb90per0.R.inc(109193);TestUtils.assertRelativelyEquals(olsBeta[i], glsBeta[i], 10E-7);
        }
    }}finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}
    
    /**
     * Generate an error covariance matrix and sample data representing models
     * with this error structure. Then verify that GLS estimated coefficients,
     * on average, perform better than OLS.
     */
    @Test
    public void testGLSEfficiency() {__CLR4_4_12c6l2c6llb90per0.R.globalSliceStart(getClass().getName(),109194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11v40b82c96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c6l2c6llb90per0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c6l2c6llb90per0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest.testGLSEfficiency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11v40b82c96(){try{__CLR4_4_12c6l2c6llb90per0.R.inc(109194);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109195);RandomGenerator rg = new JDKRandomGenerator();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109196);rg.setSeed(200);  // Seed has been selected to generate non-trivial covariance
        
        // Assume model has 16 observations (will use Longley data).  Start by generating
        // non-constant variances for the 16 error terms.
        __CLR4_4_12c6l2c6llb90per0.R.inc(109197);final int nObs = 16;
        __CLR4_4_12c6l2c6llb90per0.R.inc(109198);double[] sigma = new double[nObs];
        __CLR4_4_12c6l2c6llb90per0.R.inc(109199);for (int i = 0; (((i < nObs)&&(__CLR4_4_12c6l2c6llb90per0.R.iget(109200)!=0|true))||(__CLR4_4_12c6l2c6llb90per0.R.iget(109201)==0&false)); i++) {{
            __CLR4_4_12c6l2c6llb90per0.R.inc(109202);sigma[i] = 10 * rg.nextDouble();
        }
        
        // Now generate 1000 error vectors to use to estimate the covariance matrix
        // Columns are draws on N(0, sigma[col])
        }__CLR4_4_12c6l2c6llb90per0.R.inc(109203);final int numSeeds = 1000;
        __CLR4_4_12c6l2c6llb90per0.R.inc(109204);RealMatrix errorSeeds = MatrixUtils.createRealMatrix(numSeeds, nObs);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109205);for (int i = 0; (((i < numSeeds)&&(__CLR4_4_12c6l2c6llb90per0.R.iget(109206)!=0|true))||(__CLR4_4_12c6l2c6llb90per0.R.iget(109207)==0&false)); i++) {{
            __CLR4_4_12c6l2c6llb90per0.R.inc(109208);for (int j = 0; (((j < nObs)&&(__CLR4_4_12c6l2c6llb90per0.R.iget(109209)!=0|true))||(__CLR4_4_12c6l2c6llb90per0.R.iget(109210)==0&false)); j++) {{
                __CLR4_4_12c6l2c6llb90per0.R.inc(109211);errorSeeds.setEntry(i, j, rg.nextGaussian() * sigma[j]);
            }
        }}
        
        // Get covariance matrix for columns
        }__CLR4_4_12c6l2c6llb90per0.R.inc(109212);RealMatrix cov = (new Covariance(errorSeeds)).getCovarianceMatrix();
          
        // Create a CorrelatedRandomVectorGenerator to use to generate correlated errors
        __CLR4_4_12c6l2c6llb90per0.R.inc(109213);GaussianRandomGenerator rawGenerator = new GaussianRandomGenerator(rg);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109214);double[] errorMeans = new double[nObs];  // Counting on init to 0 here
        __CLR4_4_12c6l2c6llb90per0.R.inc(109215);CorrelatedRandomVectorGenerator gen = new CorrelatedRandomVectorGenerator(errorMeans, cov,
         1.0e-12 * cov.getNorm(), rawGenerator);
        
        // Now start generating models.  Use Longley X matrix on LHS
        // and Longley OLS beta vector as "true" beta.  Generate
        // Y values by XB + u where u is a CorrelatedRandomVector generated
        // from cov.
        __CLR4_4_12c6l2c6llb90per0.R.inc(109216);OLSMultipleLinearRegression ols = new OLSMultipleLinearRegression();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109217);ols.newSampleData(longley, nObs, 6);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109218);final RealVector b = ols.calculateBeta().copy();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109219);final RealMatrix x = ols.getX().copy();
        
        // Create a GLS model to reuse
        __CLR4_4_12c6l2c6llb90per0.R.inc(109220);GLSMultipleLinearRegression gls = new GLSMultipleLinearRegression();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109221);gls.newSampleData(longley, nObs, 6);
        __CLR4_4_12c6l2c6llb90per0.R.inc(109222);gls.newCovarianceData(cov.getData());
        
        // Create aggregators for stats measuring model performance
        __CLR4_4_12c6l2c6llb90per0.R.inc(109223);DescriptiveStatistics olsBetaStats = new DescriptiveStatistics();
        __CLR4_4_12c6l2c6llb90per0.R.inc(109224);DescriptiveStatistics glsBetaStats = new DescriptiveStatistics();
        
        // Generate Y vectors for 10000 models, estimate GLS and OLS and
        // Verify that OLS estimates are better
        __CLR4_4_12c6l2c6llb90per0.R.inc(109225);final int nModels = 10000;
        __CLR4_4_12c6l2c6llb90per0.R.inc(109226);for (int i = 0; (((i < nModels)&&(__CLR4_4_12c6l2c6llb90per0.R.iget(109227)!=0|true))||(__CLR4_4_12c6l2c6llb90per0.R.iget(109228)==0&false)); i++) {{
            
            // Generate y = xb + u with u cov
            __CLR4_4_12c6l2c6llb90per0.R.inc(109229);RealVector u = MatrixUtils.createRealVector(gen.nextVector());
            __CLR4_4_12c6l2c6llb90per0.R.inc(109230);double[] y = u.add(x.operate(b)).toArray();
            
            // Estimate OLS parameters
            __CLR4_4_12c6l2c6llb90per0.R.inc(109231);ols.newYSampleData(y);
            __CLR4_4_12c6l2c6llb90per0.R.inc(109232);RealVector olsBeta = ols.calculateBeta();
            
            // Estimate GLS parameters
            __CLR4_4_12c6l2c6llb90per0.R.inc(109233);gls.newYSampleData(y);
            __CLR4_4_12c6l2c6llb90per0.R.inc(109234);RealVector glsBeta = gls.calculateBeta();
            
            // Record deviations from "true" beta
            __CLR4_4_12c6l2c6llb90per0.R.inc(109235);double dist = olsBeta.getDistance(b);
            __CLR4_4_12c6l2c6llb90per0.R.inc(109236);olsBetaStats.addValue(dist * dist);
            __CLR4_4_12c6l2c6llb90per0.R.inc(109237);dist = glsBeta.getDistance(b);
            __CLR4_4_12c6l2c6llb90per0.R.inc(109238);glsBetaStats.addValue(dist * dist);
            
        }
        
        // Verify that GLS is on average more efficient, lower variance
        }assert((((olsBetaStats.getMean() > 1.5 * glsBetaStats.getMean()))&&(__CLR4_4_12c6l2c6llb90per0.R.iget(109239)!=0|true))||(__CLR4_4_12c6l2c6llb90per0.R.iget(109240)==0&false));
        assert((((olsBetaStats.getStandardDeviation() > glsBetaStats.getStandardDeviation()))&&(__CLR4_4_12c6l2c6llb90per0.R.iget(109241)!=0|true))||(__CLR4_4_12c6l2c6llb90per0.R.iget(109242)==0&false));  
    }finally{__CLR4_4_12c6l2c6llb90per0.R.flushNeeded();}}
    
}
