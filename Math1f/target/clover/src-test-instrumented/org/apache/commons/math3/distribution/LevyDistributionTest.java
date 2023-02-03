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
package org.apache.commons.math3.distribution;

import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

public class LevyDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_11jxj1jxjlb90pce7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,72504,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testParameters() {__CLR4_4_11jxj1jxjlb90pce7.R.globalSliceStart(getClass().getName(),72487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv1jxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jxj1jxjlb90pce7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jxj1jxjlb90pce7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.LevyDistributionTest.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv1jxj(){try{__CLR4_4_11jxj1jxjlb90pce7.R.inc(72487);
        __CLR4_4_11jxj1jxjlb90pce7.R.inc(72488);LevyDistribution d = makeDistribution();
        __CLR4_4_11jxj1jxjlb90pce7.R.inc(72489);Assert.assertEquals(1.2, d.getLocation(), Precision.EPSILON);
        __CLR4_4_11jxj1jxjlb90pce7.R.inc(72490);Assert.assertEquals(0.4,   d.getScale(),  Precision.EPSILON);
    }finally{__CLR4_4_11jxj1jxjlb90pce7.R.flushNeeded();}}

    @Test
    public void testSupport() {__CLR4_4_11jxj1jxjlb90pce7.R.globalSliceStart(getClass().getName(),72491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwue7w1jxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jxj1jxjlb90pce7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jxj1jxjlb90pce7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.LevyDistributionTest.testSupport",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwue7w1jxn(){try{__CLR4_4_11jxj1jxjlb90pce7.R.inc(72491);
        __CLR4_4_11jxj1jxjlb90pce7.R.inc(72492);LevyDistribution d = makeDistribution();
        __CLR4_4_11jxj1jxjlb90pce7.R.inc(72493);Assert.assertEquals(d.getLocation(), d.getSupportLowerBound(), Precision.EPSILON);
        __CLR4_4_11jxj1jxjlb90pce7.R.inc(72494);Assert.assertTrue(Double.isInfinite(d.getSupportUpperBound()));
        __CLR4_4_11jxj1jxjlb90pce7.R.inc(72495);Assert.assertTrue(d.isSupportConnected());
    }finally{__CLR4_4_11jxj1jxjlb90pce7.R.flushNeeded();}}

    @Override
    public LevyDistribution makeDistribution() {try{__CLR4_4_11jxj1jxjlb90pce7.R.inc(72496);
        __CLR4_4_11jxj1jxjlb90pce7.R.inc(72497);return new LevyDistribution(new Well19937a(0xc5a5506bbb17e57al), 1.2, 0.4);
    }finally{__CLR4_4_11jxj1jxjlb90pce7.R.flushNeeded();}}

    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_11jxj1jxjlb90pce7.R.inc(72498);
        __CLR4_4_11jxj1jxjlb90pce7.R.inc(72499);return new double[] {
            1.2001, 1.21, 1.225, 1.25, 1.3, 1.9, 3.4, 5.6
        };
    }finally{__CLR4_4_11jxj1jxjlb90pce7.R.flushNeeded();}}

    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_11jxj1jxjlb90pce7.R.inc(72500);
        // values computed with R and function plevy from rmutil package
        __CLR4_4_11jxj1jxjlb90pce7.R.inc(72501);return new double[] {
            0, 2.53962850749e-10, 6.33424836662e-05, 0.00467773498105,
            0.0455002638964, 0.449691797969, 0.669815357599, 0.763024600553
        };
    }finally{__CLR4_4_11jxj1jxjlb90pce7.R.flushNeeded();}}

    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_11jxj1jxjlb90pce7.R.inc(72502);
        // values computed with R and function dlevy from rmutil package
        __CLR4_4_11jxj1jxjlb90pce7.R.inc(72503);return new double[] {
            0, 5.20056373765e-07, 0.0214128361224, 0.413339707082, 1.07981933026,
            0.323749319161, 0.0706032550094, 0.026122839884
        };
    }finally{__CLR4_4_11jxj1jxjlb90pce7.R.flushNeeded();}}

}
