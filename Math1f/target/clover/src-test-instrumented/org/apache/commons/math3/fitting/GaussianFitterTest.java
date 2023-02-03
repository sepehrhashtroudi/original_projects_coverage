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

import org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests {@link GaussianFitter}.
 *
 * @since 2.2
 * @version $Id: GaussianFitterTest.java 1349707 2012-06-13 09:30:56Z erans $
 */
public class GaussianFitterTest {static class __CLR4_4_11l2c1l2clb90pci1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,74025,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Good data. */
    protected static final double[][] DATASET1 = new double[][] {
        {4.0254623,  531026.0},
        {4.02804905, 664002.0},
        {4.02934242, 787079.0},
        {4.03128248, 984167.0},
        {4.03386923, 1294546.0},
        {4.03580929, 1560230.0},
        {4.03839603, 1887233.0},
        {4.0396894,  2113240.0},
        {4.04162946, 2375211.0},
        {4.04421621, 2687152.0},
        {4.04550958, 2862644.0},
        {4.04744964, 3078898.0},
        {4.05003639, 3327238.0},
        {4.05132976, 3461228.0},
        {4.05326982, 3580526.0},
        {4.05585657, 3576946.0},
        {4.05779662, 3439750.0},
        {4.06038337, 3220296.0},
        {4.06167674, 3070073.0},
        {4.0636168,  2877648.0},
        {4.06620355, 2595848.0},
        {4.06749692, 2390157.0},
        {4.06943698, 2175960.0},
        {4.07202373, 1895104.0},
        {4.0733171,  1687576.0},
        {4.07525716, 1447024.0},
        {4.0778439,  1130879.0},
        {4.07978396, 904900.0},
        {4.08237071, 717104.0},
        {4.08366408, 620014.0}
    };
    /** Poor data: right of peak not symmetric with left of peak. */
    protected static final double[][] DATASET2 = new double[][] {
        {-20.15,   1523.0},
        {-19.65,   1566.0},
        {-19.15,   1592.0},
        {-18.65,   1927.0},
        {-18.15,   3089.0},
        {-17.65,   6068.0},
        {-17.15,  14239.0},
        {-16.65,  34124.0},
        {-16.15,  64097.0},
        {-15.65, 110352.0},
        {-15.15, 164742.0},
        {-14.65, 209499.0},
        {-14.15, 267274.0},
        {-13.65, 283290.0},
        {-13.15, 275363.0},
        {-12.65, 258014.0},
        {-12.15, 225000.0},
        {-11.65, 200000.0},
        {-11.15, 190000.0},
        {-10.65, 185000.0},
        {-10.15, 180000.0},
        { -9.65, 179000.0},
        { -9.15, 178000.0},
        { -8.65, 177000.0},
        { -8.15, 176000.0},
        { -7.65, 175000.0},
        { -7.15, 174000.0},
        { -6.65, 173000.0},
        { -6.15, 172000.0},
        { -5.65, 171000.0},
        { -5.15, 170000.0}
    };
    /** Poor data: long tails. */
    protected static final double[][] DATASET3 = new double[][] {
        {-90.15,   1513.0},
        {-80.15,   1514.0},
        {-70.15,   1513.0},
        {-60.15,   1514.0},
        {-50.15,   1513.0},
        {-40.15,   1514.0},
        {-30.15,   1513.0},
        {-20.15,   1523.0},
        {-19.65,   1566.0},
        {-19.15,   1592.0},
        {-18.65,   1927.0},
        {-18.15,   3089.0},
        {-17.65,   6068.0},
        {-17.15,  14239.0},
        {-16.65,  34124.0},
        {-16.15,  64097.0},
        {-15.65, 110352.0},
        {-15.15, 164742.0},
        {-14.65, 209499.0},
        {-14.15, 267274.0},
        {-13.65, 283290.0},
        {-13.15, 275363.0},
        {-12.65, 258014.0},
        {-12.15, 214073.0},
        {-11.65, 182244.0},
        {-11.15, 136419.0},
        {-10.65,  97823.0},
        {-10.15,  58930.0},
        { -9.65,  35404.0},
        { -9.15,  16120.0},
        { -8.65,   9823.0},
        { -8.15,   5064.0},
        { -7.65,   2575.0},
        { -7.15,   1642.0},
        { -6.65,   1101.0},
        { -6.15,    812.0},
        { -5.65,    690.0},
        { -5.15,    565.0},
        {  5.15,    564.0},
        { 15.15,    565.0},
        { 25.15,    564.0},
        { 35.15,    565.0},
        { 45.15,    564.0},
        { 55.15,    565.0},
        { 65.15,    564.0},
        { 75.15,    565.0}
    };
    /** Poor data: right of peak is missing. */
    protected static final double[][] DATASET4 = new double[][] {
        {-20.15,   1523.0},
        {-19.65,   1566.0},
        {-19.15,   1592.0},
        {-18.65,   1927.0},
        {-18.15,   3089.0},
        {-17.65,   6068.0},
        {-17.15,  14239.0},
        {-16.65,  34124.0},
        {-16.15,  64097.0},
        {-15.65, 110352.0},
        {-15.15, 164742.0},
        {-14.65, 209499.0},
        {-14.15, 267274.0},
        {-13.65, 283290.0}
    };
    /** Good data, but few points. */
    protected static final double[][] DATASET5 = new double[][] {
        {4.0254623,  531026.0},
        {4.03128248, 984167.0},
        {4.03839603, 1887233.0},
        {4.04421621, 2687152.0},
        {4.05132976, 3461228.0},
        {4.05326982, 3580526.0},
        {4.05779662, 3439750.0},
        {4.0636168,  2877648.0},
        {4.06943698, 2175960.0},
        {4.07525716, 1447024.0},
        {4.08237071, 717104.0},
        {4.08366408, 620014.0}
    };

    /**
     * Basic.
     */
    @Test
    public void testFit01() {__CLR4_4_11l2c1l2clb90pci1.R.globalSliceStart(getClass().getName(),73956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zet4mf1l2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l2c1l2clb90pci1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l2c1l2clb90pci1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.GaussianFitterTest.testFit01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zet4mf1l2c(){try{__CLR4_4_11l2c1l2clb90pci1.R.inc(73956);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73957);GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73958);addDatasetToGaussianFitter(DATASET1, fitter);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73959);double[] parameters = fitter.fit();

        __CLR4_4_11l2c1l2clb90pci1.R.inc(73960);Assert.assertEquals(3496978.1837704973, parameters[0], 1e-4);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73961);Assert.assertEquals(4.054933085999146, parameters[1], 1e-4);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73962);Assert.assertEquals(0.015039355620304326, parameters[2], 1e-4);
    }finally{__CLR4_4_11l2c1l2clb90pci1.R.flushNeeded();}}

    /**
     * Zero points is not enough observed points.
     */
    @Test(expected=MathIllegalArgumentException.class)
    public void testFit02() {__CLR4_4_11l2c1l2clb90pci1.R.globalSliceStart(getClass().getName(),73963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdayk81l2j();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,70,105,116,48,50,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l2c1l2clb90pci1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l2c1l2clb90pci1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.GaussianFitterTest.testFit02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdayk81l2j(){try{__CLR4_4_11l2c1l2clb90pci1.R.inc(73963);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73964);GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73965);fitter.fit();
    }finally{__CLR4_4_11l2c1l2clb90pci1.R.flushNeeded();}}
    
    /**
     * Two points is not enough observed points.
     */
    @Test(expected=MathIllegalArgumentException.class)
    public void testFit03() {__CLR4_4_11l2c1l2clb90pci1.R.globalSliceStart(getClass().getName(),73966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4azrr1l2m();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,70,105,116,48,51,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l2c1l2clb90pci1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l2c1l2clb90pci1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.GaussianFitterTest.testFit03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4azrr1l2m(){try{__CLR4_4_11l2c1l2clb90pci1.R.inc(73966);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73967);GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73968);addDatasetToGaussianFitter(new double[][] {
            {4.0254623,  531026.0},
            {4.02804905, 664002.0}},
            fitter);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73969);fitter.fit();
    }finally{__CLR4_4_11l2c1l2clb90pci1.R.flushNeeded();}}
    
    /**
     * Poor data: right of peak not symmetric with left of peak.
     */
    @Test
    public void testFit04() {__CLR4_4_11l2c1l2clb90pci1.R.globalSliceStart(getClass().getName(),73970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pvb0za1l2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l2c1l2clb90pci1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l2c1l2clb90pci1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.GaussianFitterTest.testFit04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pvb0za1l2q(){try{__CLR4_4_11l2c1l2clb90pci1.R.inc(73970);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73971);GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73972);addDatasetToGaussianFitter(DATASET2, fitter);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73973);double[] parameters = fitter.fit();

        __CLR4_4_11l2c1l2clb90pci1.R.inc(73974);Assert.assertEquals(233003.2967252038, parameters[0], 1e-4);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73975);Assert.assertEquals(-10.654887521095983, parameters[1], 1e-4);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73976);Assert.assertEquals(4.335937353196641, parameters[2], 1e-4);
    }finally{__CLR4_4_11l2c1l2clb90pci1.R.flushNeeded();}}  
    
    /**
     * Poor data: long tails.
     */
    @Test
    public void testFit05() {__CLR4_4_11l2c1l2clb90pci1.R.globalSliceStart(getClass().getName(),73977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mmb26t1l2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l2c1l2clb90pci1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l2c1l2clb90pci1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.GaussianFitterTest.testFit05",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mmb26t1l2x(){try{__CLR4_4_11l2c1l2clb90pci1.R.inc(73977);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73978);GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73979);addDatasetToGaussianFitter(DATASET3, fitter);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73980);double[] parameters = fitter.fit();

        __CLR4_4_11l2c1l2clb90pci1.R.inc(73981);Assert.assertEquals(283863.81929180305, parameters[0], 1e-4);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73982);Assert.assertEquals(-13.29641995105174, parameters[1], 1e-4);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73983);Assert.assertEquals(1.7297330293549908, parameters[2], 1e-4);
    }finally{__CLR4_4_11l2c1l2clb90pci1.R.flushNeeded();}}
    
    /**
     * Poor data: right of peak is missing.
     */
    @Test
    public void testFit06() {__CLR4_4_11l2c1l2clb90pci1.R.globalSliceStart(getClass().getName(),73984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdb3ec1l34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l2c1l2clb90pci1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l2c1l2clb90pci1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.GaussianFitterTest.testFit06",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdb3ec1l34(){try{__CLR4_4_11l2c1l2clb90pci1.R.inc(73984);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73985);GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73986);addDatasetToGaussianFitter(DATASET4, fitter);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73987);double[] parameters = fitter.fit();

        __CLR4_4_11l2c1l2clb90pci1.R.inc(73988);Assert.assertEquals(285250.66754309234, parameters[0], 1e-4);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73989);Assert.assertEquals(-13.528375695228455, parameters[1], 1e-4);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73990);Assert.assertEquals(1.5204344894331614, parameters[2], 1e-4);
    }finally{__CLR4_4_11l2c1l2clb90pci1.R.flushNeeded();}}    

    /**
     * Basic with smaller dataset.
     */
    @Test
    public void testFit07() {__CLR4_4_11l2c1l2clb90pci1.R.globalSliceStart(getClass().getName(),73991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4b4lv1l3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l2c1l2clb90pci1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l2c1l2clb90pci1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.GaussianFitterTest.testFit07",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4b4lv1l3b(){try{__CLR4_4_11l2c1l2clb90pci1.R.inc(73991);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73992);GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73993);addDatasetToGaussianFitter(DATASET5, fitter);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73994);double[] parameters = fitter.fit();

        __CLR4_4_11l2c1l2clb90pci1.R.inc(73995);Assert.assertEquals(3514384.729342235, parameters[0], 1e-4);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73996);Assert.assertEquals(4.054970307455625, parameters[1], 1e-4);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(73997);Assert.assertEquals(0.015029412832160017, parameters[2], 1e-4);
    }finally{__CLR4_4_11l2c1l2clb90pci1.R.flushNeeded();}}

    @Test
    public void testMath519() {__CLR4_4_11l2c1l2clb90pci1.R.globalSliceStart(getClass().getName(),73998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r8rbw61l3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l2c1l2clb90pci1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l2c1l2clb90pci1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.GaussianFitterTest.testMath519",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r8rbw61l3i(){try{__CLR4_4_11l2c1l2clb90pci1.R.inc(73998);
        // The optimizer will try negative sigma values but "GaussianFitter"
        // will catch the raised exceptions and return NaN values instead.

        __CLR4_4_11l2c1l2clb90pci1.R.inc(73999);final double[] data = { 
            1.1143831578403364E-29,
            4.95281403484594E-28,
            1.1171347211930288E-26,
            1.7044813962636277E-25,
            1.9784716574832164E-24,
            1.8630236407866774E-23,
            1.4820532905097742E-22,
            1.0241963854632831E-21,
            6.275077366673128E-21,
            3.461808994532493E-20,
            1.7407124684715706E-19,
            8.056687953553974E-19,
            3.460193945992071E-18,
            1.3883326374011525E-17,
            5.233894983671116E-17,
            1.8630791465263745E-16,
            6.288759227922111E-16,
            2.0204433920597856E-15,
            6.198768938576155E-15,
            1.821419346860626E-14,
            5.139176445538471E-14,
            1.3956427429045787E-13,
            3.655705706448139E-13,
            9.253753324779779E-13,
            2.267636001476696E-12,
            5.3880460095836855E-12,
            1.2431632654852931E-11
        };

        __CLR4_4_11l2c1l2clb90pci1.R.inc(74000);GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        __CLR4_4_11l2c1l2clb90pci1.R.inc(74001);for (int i = 0; (((i < data.length)&&(__CLR4_4_11l2c1l2clb90pci1.R.iget(74002)!=0|true))||(__CLR4_4_11l2c1l2clb90pci1.R.iget(74003)==0&false)); i++) {{
            __CLR4_4_11l2c1l2clb90pci1.R.inc(74004);fitter.addObservedPoint(i, data[i]);
        }
        }__CLR4_4_11l2c1l2clb90pci1.R.inc(74005);final double[] p = fitter.fit();

        __CLR4_4_11l2c1l2clb90pci1.R.inc(74006);Assert.assertEquals(53.1572792, p[1], 1e-7);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(74007);Assert.assertEquals(5.75214622, p[2], 1e-8);
    }finally{__CLR4_4_11l2c1l2clb90pci1.R.flushNeeded();}}

    @Test
    public void testMath798() {__CLR4_4_11l2c1l2clb90pci1.R.globalSliceStart(getClass().getName(),74008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3xlzx1l3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l2c1l2clb90pci1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l2c1l2clb90pci1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.GaussianFitterTest.testMath798",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3xlzx1l3s(){try{__CLR4_4_11l2c1l2clb90pci1.R.inc(74008);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(74009);final GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());

        // When the data points are not commented out below, the fit stalls.
        // This is expected however, since the whole dataset hardly looks like
        // a Gaussian.
        // When commented out, the fit proceeds fine.

        __CLR4_4_11l2c1l2clb90pci1.R.inc(74010);fitter.addObservedPoint(0.23, 395.0);
        //fitter.addObservedPoint(0.68, 0.0);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(74011);fitter.addObservedPoint(1.14, 376.0);
        //fitter.addObservedPoint(1.59, 0.0);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(74012);fitter.addObservedPoint(2.05, 163.0);
        //fitter.addObservedPoint(2.50, 0.0);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(74013);fitter.addObservedPoint(2.95, 49.0);
        //fitter.addObservedPoint(3.41, 0.0);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(74014);fitter.addObservedPoint(3.86, 16.0);
        //fitter.addObservedPoint(4.32, 0.0);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(74015);fitter.addObservedPoint(4.77, 1.0);

        __CLR4_4_11l2c1l2clb90pci1.R.inc(74016);final double[] p = fitter.fit();

        // Values are copied from a previous run of this test.
        __CLR4_4_11l2c1l2clb90pci1.R.inc(74017);Assert.assertEquals(420.8397296167364, p[0], 1e-12);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(74018);Assert.assertEquals(0.603770729862231, p[1], 1e-15);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(74019);Assert.assertEquals(1.0786447936766612, p[2], 1e-14);
    }finally{__CLR4_4_11l2c1l2clb90pci1.R.flushNeeded();}}
    
    /**
     * Adds the specified points to specified <code>GaussianFitter</code>
     * instance.
     *
     * @param points data points where first dimension is a point index and
     *        second dimension is an array of length two representing the point
     *        with the first value corresponding to X and the second value
     *        corresponding to Y
     * @param fitter fitter to which the points in <code>points</code> should be
     *        added as observed points
     */
    protected static void addDatasetToGaussianFitter(double[][] points,
                                                     GaussianFitter fitter) {try{__CLR4_4_11l2c1l2clb90pci1.R.inc(74020);
        __CLR4_4_11l2c1l2clb90pci1.R.inc(74021);for (int i = 0; (((i < points.length)&&(__CLR4_4_11l2c1l2clb90pci1.R.iget(74022)!=0|true))||(__CLR4_4_11l2c1l2clb90pci1.R.iget(74023)==0&false)); i++) {{
            __CLR4_4_11l2c1l2clb90pci1.R.inc(74024);fitter.addObservedPoint(points[i][0], points[i][1]);
        }
    }}finally{__CLR4_4_11l2c1l2clb90pci1.R.flushNeeded();}}
}
