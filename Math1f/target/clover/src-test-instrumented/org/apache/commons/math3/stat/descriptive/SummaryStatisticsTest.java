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
package org.apache.commons.math3.stat.descriptive;


import org.apache.commons.math3.TestUtils;

import org.apache.commons.math3.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;
/**
 * Test cases for the {@link SummaryStatistics} class.
 *
 * @version $Id$
 */

public class SummaryStatisticsTest {static class __CLR4_4_12avs2avslb90penl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,107604,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double one = 1;
    private float twoF = 2;
    private long twoL = 2;
    private int three = 3;
    private double mean = 2;
    private double sumSq = 18;
    private double sum = 8;
    private double var = 0.666666666666666666667;
    private double popVar = 0.5;
    private double std = FastMath.sqrt(var);
    private double n = 4;
    private double min = 1;
    private double max = 3;
    private double tolerance = 10E-15;

    protected SummaryStatistics createSummaryStatistics() {try{__CLR4_4_12avs2avslb90penl.R.inc(107416);
        __CLR4_4_12avs2avslb90penl.R.inc(107417);return new SummaryStatistics();
    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}

    /** test stats */
    @Test
    public void testStats() {__CLR4_4_12avs2avslb90penl.R.globalSliceStart(getClass().getName(),107418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cp4xt82avu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12avs2avslb90penl.R.rethrow($CLV_t2$);}finally{__CLR4_4_12avs2avslb90penl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest.testStats",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cp4xt82avu(){try{__CLR4_4_12avs2avslb90penl.R.inc(107418);
        __CLR4_4_12avs2avslb90penl.R.inc(107419);SummaryStatistics u = createSummaryStatistics();
        __CLR4_4_12avs2avslb90penl.R.inc(107420);Assert.assertEquals("total count",0,u.getN(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107421);u.addValue(one);
        __CLR4_4_12avs2avslb90penl.R.inc(107422);u.addValue(twoF);
        __CLR4_4_12avs2avslb90penl.R.inc(107423);u.addValue(twoL);
        __CLR4_4_12avs2avslb90penl.R.inc(107424);u.addValue(three);
        __CLR4_4_12avs2avslb90penl.R.inc(107425);Assert.assertEquals("N",n,u.getN(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107426);Assert.assertEquals("sum",sum,u.getSum(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107427);Assert.assertEquals("sumsq",sumSq,u.getSumsq(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107428);Assert.assertEquals("var",var,u.getVariance(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107429);Assert.assertEquals("population var",popVar,u.getPopulationVariance(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107430);Assert.assertEquals("std",std,u.getStandardDeviation(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107431);Assert.assertEquals("mean",mean,u.getMean(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107432);Assert.assertEquals("min",min,u.getMin(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107433);Assert.assertEquals("max",max,u.getMax(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107434);u.clear();
        __CLR4_4_12avs2avslb90penl.R.inc(107435);Assert.assertEquals("total count",0,u.getN(),tolerance);
    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}

    @Test
    public void testN0andN1Conditions() {__CLR4_4_12avs2avslb90penl.R.globalSliceStart(getClass().getName(),107436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161oc4l2awc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12avs2avslb90penl.R.rethrow($CLV_t2$);}finally{__CLR4_4_12avs2avslb90penl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest.testN0andN1Conditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161oc4l2awc(){try{__CLR4_4_12avs2avslb90penl.R.inc(107436);
        __CLR4_4_12avs2avslb90penl.R.inc(107437);SummaryStatistics u = createSummaryStatistics();
        __CLR4_4_12avs2avslb90penl.R.inc(107438);Assert.assertTrue("Mean of n = 0 set should be NaN",
                Double.isNaN( u.getMean() ) );
        __CLR4_4_12avs2avslb90penl.R.inc(107439);Assert.assertTrue("Standard Deviation of n = 0 set should be NaN",
                Double.isNaN( u.getStandardDeviation() ) );
        __CLR4_4_12avs2avslb90penl.R.inc(107440);Assert.assertTrue("Variance of n = 0 set should be NaN",
                Double.isNaN(u.getVariance() ) );

        /* n=1 */
        __CLR4_4_12avs2avslb90penl.R.inc(107441);u.addValue(one);
        __CLR4_4_12avs2avslb90penl.R.inc(107442);Assert.assertTrue("mean should be one (n = 1)",
                u.getMean() == one);
        __CLR4_4_12avs2avslb90penl.R.inc(107443);Assert.assertTrue("geometric should be one (n = 1) instead it is " + u.getGeometricMean(),
                u.getGeometricMean() == one);
        __CLR4_4_12avs2avslb90penl.R.inc(107444);Assert.assertTrue("Std should be zero (n = 1)",
                u.getStandardDeviation() == 0.0);
        __CLR4_4_12avs2avslb90penl.R.inc(107445);Assert.assertTrue("variance should be zero (n = 1)",
                u.getVariance() == 0.0);

        /* n=2 */
        __CLR4_4_12avs2avslb90penl.R.inc(107446);u.addValue(twoF);
        __CLR4_4_12avs2avslb90penl.R.inc(107447);Assert.assertTrue("Std should not be zero (n = 2)",
                u.getStandardDeviation() != 0.0);
        __CLR4_4_12avs2avslb90penl.R.inc(107448);Assert.assertTrue("variance should not be zero (n = 2)",
                u.getVariance() != 0.0);

    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}

    @Test
    public void testProductAndGeometricMean() {__CLR4_4_12avs2avslb90penl.R.globalSliceStart(getClass().getName(),107449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14x6wab2awp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12avs2avslb90penl.R.rethrow($CLV_t2$);}finally{__CLR4_4_12avs2avslb90penl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest.testProductAndGeometricMean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14x6wab2awp(){try{__CLR4_4_12avs2avslb90penl.R.inc(107449);
        __CLR4_4_12avs2avslb90penl.R.inc(107450);SummaryStatistics u = createSummaryStatistics();
        __CLR4_4_12avs2avslb90penl.R.inc(107451);u.addValue( 1.0 );
        __CLR4_4_12avs2avslb90penl.R.inc(107452);u.addValue( 2.0 );
        __CLR4_4_12avs2avslb90penl.R.inc(107453);u.addValue( 3.0 );
        __CLR4_4_12avs2avslb90penl.R.inc(107454);u.addValue( 4.0 );

        __CLR4_4_12avs2avslb90penl.R.inc(107455);Assert.assertEquals( "Geometric mean not expected", 2.213364,
                u.getGeometricMean(), 0.00001 );
    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}

    @Test
    public void testNaNContracts() {__CLR4_4_12avs2avslb90penl.R.globalSliceStart(getClass().getName(),107456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18807vj2aww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12avs2avslb90penl.R.rethrow($CLV_t2$);}finally{__CLR4_4_12avs2avslb90penl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest.testNaNContracts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18807vj2aww(){try{__CLR4_4_12avs2avslb90penl.R.inc(107456);
        __CLR4_4_12avs2avslb90penl.R.inc(107457);SummaryStatistics u = createSummaryStatistics();
        __CLR4_4_12avs2avslb90penl.R.inc(107458);Assert.assertTrue("mean not NaN",Double.isNaN(u.getMean()));
        __CLR4_4_12avs2avslb90penl.R.inc(107459);Assert.assertTrue("min not NaN",Double.isNaN(u.getMin()));
        __CLR4_4_12avs2avslb90penl.R.inc(107460);Assert.assertTrue("std dev not NaN",Double.isNaN(u.getStandardDeviation()));
        __CLR4_4_12avs2avslb90penl.R.inc(107461);Assert.assertTrue("var not NaN",Double.isNaN(u.getVariance()));
        __CLR4_4_12avs2avslb90penl.R.inc(107462);Assert.assertTrue("geom mean not NaN",Double.isNaN(u.getGeometricMean()));

        __CLR4_4_12avs2avslb90penl.R.inc(107463);u.addValue(1.0);

        __CLR4_4_12avs2avslb90penl.R.inc(107464);Assert.assertEquals( "mean not expected", 1.0,
                u.getMean(), Double.MIN_VALUE);
        __CLR4_4_12avs2avslb90penl.R.inc(107465);Assert.assertEquals( "variance not expected", 0.0,
                u.getVariance(), Double.MIN_VALUE);
        __CLR4_4_12avs2avslb90penl.R.inc(107466);Assert.assertEquals( "geometric mean not expected", 1.0,
                u.getGeometricMean(), Double.MIN_VALUE);

        __CLR4_4_12avs2avslb90penl.R.inc(107467);u.addValue(-1.0);

        __CLR4_4_12avs2avslb90penl.R.inc(107468);Assert.assertTrue("geom mean not NaN",Double.isNaN(u.getGeometricMean()));

        __CLR4_4_12avs2avslb90penl.R.inc(107469);u.addValue(0.0);

        __CLR4_4_12avs2avslb90penl.R.inc(107470);Assert.assertTrue("geom mean not NaN",Double.isNaN(u.getGeometricMean()));

        //FiXME: test all other NaN contract specs
    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}

    @Test
    public void testGetSummary() {__CLR4_4_12avs2avslb90penl.R.globalSliceStart(getClass().getName(),107471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_193ktk92axb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12avs2avslb90penl.R.rethrow($CLV_t2$);}finally{__CLR4_4_12avs2avslb90penl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest.testGetSummary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_193ktk92axb(){try{__CLR4_4_12avs2avslb90penl.R.inc(107471);
        __CLR4_4_12avs2avslb90penl.R.inc(107472);SummaryStatistics u = createSummaryStatistics();
        __CLR4_4_12avs2avslb90penl.R.inc(107473);StatisticalSummary summary = u.getSummary();
        __CLR4_4_12avs2avslb90penl.R.inc(107474);verifySummary(u, summary);
        __CLR4_4_12avs2avslb90penl.R.inc(107475);u.addValue(1d);
        __CLR4_4_12avs2avslb90penl.R.inc(107476);summary = u.getSummary();
        __CLR4_4_12avs2avslb90penl.R.inc(107477);verifySummary(u, summary);
        __CLR4_4_12avs2avslb90penl.R.inc(107478);u.addValue(2d);
        __CLR4_4_12avs2avslb90penl.R.inc(107479);summary = u.getSummary();
        __CLR4_4_12avs2avslb90penl.R.inc(107480);verifySummary(u, summary);
        __CLR4_4_12avs2avslb90penl.R.inc(107481);u.addValue(2d);
        __CLR4_4_12avs2avslb90penl.R.inc(107482);summary = u.getSummary();
        __CLR4_4_12avs2avslb90penl.R.inc(107483);verifySummary(u, summary);
    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}

    @Test
    public void testSerialization() {__CLR4_4_12avs2avslb90penl.R.globalSliceStart(getClass().getName(),107484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on92axo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12avs2avslb90penl.R.rethrow($CLV_t2$);}finally{__CLR4_4_12avs2avslb90penl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on92axo(){try{__CLR4_4_12avs2avslb90penl.R.inc(107484);
        __CLR4_4_12avs2avslb90penl.R.inc(107485);SummaryStatistics u = createSummaryStatistics();
        // Empty test
        __CLR4_4_12avs2avslb90penl.R.inc(107486);TestUtils.checkSerializedEquality(u);
        __CLR4_4_12avs2avslb90penl.R.inc(107487);SummaryStatistics s = (SummaryStatistics) TestUtils.serializeAndRecover(u);
        __CLR4_4_12avs2avslb90penl.R.inc(107488);StatisticalSummary summary = s.getSummary();
        __CLR4_4_12avs2avslb90penl.R.inc(107489);verifySummary(u, summary);

        // Add some data
        __CLR4_4_12avs2avslb90penl.R.inc(107490);u.addValue(2d);
        __CLR4_4_12avs2avslb90penl.R.inc(107491);u.addValue(1d);
        __CLR4_4_12avs2avslb90penl.R.inc(107492);u.addValue(3d);
        __CLR4_4_12avs2avslb90penl.R.inc(107493);u.addValue(4d);
        __CLR4_4_12avs2avslb90penl.R.inc(107494);u.addValue(5d);

        // Test again
        __CLR4_4_12avs2avslb90penl.R.inc(107495);TestUtils.checkSerializedEquality(u);
        __CLR4_4_12avs2avslb90penl.R.inc(107496);s = (SummaryStatistics) TestUtils.serializeAndRecover(u);
        __CLR4_4_12avs2avslb90penl.R.inc(107497);summary = s.getSummary();
        __CLR4_4_12avs2avslb90penl.R.inc(107498);verifySummary(u, summary);

    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() {__CLR4_4_12avs2avslb90penl.R.globalSliceStart(getClass().getName(),107499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w82ay3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12avs2avslb90penl.R.rethrow($CLV_t2$);}finally{__CLR4_4_12avs2avslb90penl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w82ay3(){try{__CLR4_4_12avs2avslb90penl.R.inc(107499);
        __CLR4_4_12avs2avslb90penl.R.inc(107500);SummaryStatistics u = createSummaryStatistics();
        __CLR4_4_12avs2avslb90penl.R.inc(107501);SummaryStatistics t = null;
        __CLR4_4_12avs2avslb90penl.R.inc(107502);int emptyHash = u.hashCode();
        __CLR4_4_12avs2avslb90penl.R.inc(107503);Assert.assertTrue("reflexive", u.equals(u));
        __CLR4_4_12avs2avslb90penl.R.inc(107504);Assert.assertFalse("non-null compared to null", u.equals(t));
        __CLR4_4_12avs2avslb90penl.R.inc(107505);Assert.assertFalse("wrong type", u.equals(Double.valueOf(0)));
        __CLR4_4_12avs2avslb90penl.R.inc(107506);t = createSummaryStatistics();
        __CLR4_4_12avs2avslb90penl.R.inc(107507);Assert.assertTrue("empty instances should be equal", t.equals(u));
        __CLR4_4_12avs2avslb90penl.R.inc(107508);Assert.assertTrue("empty instances should be equal", u.equals(t));
        __CLR4_4_12avs2avslb90penl.R.inc(107509);Assert.assertEquals("empty hash code", emptyHash, t.hashCode());

        // Add some data to u
        __CLR4_4_12avs2avslb90penl.R.inc(107510);u.addValue(2d);
        __CLR4_4_12avs2avslb90penl.R.inc(107511);u.addValue(1d);
        __CLR4_4_12avs2avslb90penl.R.inc(107512);u.addValue(3d);
        __CLR4_4_12avs2avslb90penl.R.inc(107513);u.addValue(4d);
        __CLR4_4_12avs2avslb90penl.R.inc(107514);Assert.assertFalse("different n's should make instances not equal", t.equals(u));
        __CLR4_4_12avs2avslb90penl.R.inc(107515);Assert.assertFalse("different n's should make instances not equal", u.equals(t));
        __CLR4_4_12avs2avslb90penl.R.inc(107516);Assert.assertTrue("different n's should make hashcodes different",
                u.hashCode() != t.hashCode());

        //Add data in same order to t
        __CLR4_4_12avs2avslb90penl.R.inc(107517);t.addValue(2d);
        __CLR4_4_12avs2avslb90penl.R.inc(107518);t.addValue(1d);
        __CLR4_4_12avs2avslb90penl.R.inc(107519);t.addValue(3d);
        __CLR4_4_12avs2avslb90penl.R.inc(107520);t.addValue(4d);
        __CLR4_4_12avs2avslb90penl.R.inc(107521);Assert.assertTrue("summaries based on same data should be equal", t.equals(u));
        __CLR4_4_12avs2avslb90penl.R.inc(107522);Assert.assertTrue("summaries based on same data should be equal", u.equals(t));
        __CLR4_4_12avs2avslb90penl.R.inc(107523);Assert.assertEquals("summaries based on same data should have same hashcodes",
                u.hashCode(), t.hashCode());

        // Clear and make sure summaries are indistinguishable from empty summary
        __CLR4_4_12avs2avslb90penl.R.inc(107524);u.clear();
        __CLR4_4_12avs2avslb90penl.R.inc(107525);t.clear();
        __CLR4_4_12avs2avslb90penl.R.inc(107526);Assert.assertTrue("empty instances should be equal", t.equals(u));
        __CLR4_4_12avs2avslb90penl.R.inc(107527);Assert.assertTrue("empty instances should be equal", u.equals(t));
        __CLR4_4_12avs2avslb90penl.R.inc(107528);Assert.assertEquals("empty hash code", emptyHash, t.hashCode());
        __CLR4_4_12avs2avslb90penl.R.inc(107529);Assert.assertEquals("empty hash code", emptyHash, u.hashCode());
    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}

    @Test
    public void testCopy() {__CLR4_4_12avs2avslb90penl.R.globalSliceStart(getClass().getName(),107530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukax6a2ayy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12avs2avslb90penl.R.rethrow($CLV_t2$);}finally{__CLR4_4_12avs2avslb90penl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest.testCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukax6a2ayy(){try{__CLR4_4_12avs2avslb90penl.R.inc(107530);
        __CLR4_4_12avs2avslb90penl.R.inc(107531);SummaryStatistics u = createSummaryStatistics();
        __CLR4_4_12avs2avslb90penl.R.inc(107532);u.addValue(2d);
        __CLR4_4_12avs2avslb90penl.R.inc(107533);u.addValue(1d);
        __CLR4_4_12avs2avslb90penl.R.inc(107534);u.addValue(3d);
        __CLR4_4_12avs2avslb90penl.R.inc(107535);u.addValue(4d);
        __CLR4_4_12avs2avslb90penl.R.inc(107536);SummaryStatistics v = new SummaryStatistics(u);
        __CLR4_4_12avs2avslb90penl.R.inc(107537);Assert.assertEquals(u, v);
        __CLR4_4_12avs2avslb90penl.R.inc(107538);Assert.assertEquals(v, u);

        // Make sure both behave the same with additional values added
        __CLR4_4_12avs2avslb90penl.R.inc(107539);u.addValue(7d);
        __CLR4_4_12avs2avslb90penl.R.inc(107540);u.addValue(9d);
        __CLR4_4_12avs2avslb90penl.R.inc(107541);u.addValue(11d);
        __CLR4_4_12avs2avslb90penl.R.inc(107542);u.addValue(23d);
        __CLR4_4_12avs2avslb90penl.R.inc(107543);v.addValue(7d);
        __CLR4_4_12avs2avslb90penl.R.inc(107544);v.addValue(9d);
        __CLR4_4_12avs2avslb90penl.R.inc(107545);v.addValue(11d);
        __CLR4_4_12avs2avslb90penl.R.inc(107546);v.addValue(23d);
        __CLR4_4_12avs2avslb90penl.R.inc(107547);Assert.assertEquals(u, v);
        __CLR4_4_12avs2avslb90penl.R.inc(107548);Assert.assertEquals(v, u);

        // Check implementation pointers are preserved
        __CLR4_4_12avs2avslb90penl.R.inc(107549);u.clear();
        __CLR4_4_12avs2avslb90penl.R.inc(107550);u.setSumImpl(new Sum());
        __CLR4_4_12avs2avslb90penl.R.inc(107551);SummaryStatistics.copy(u,v);
        __CLR4_4_12avs2avslb90penl.R.inc(107552);Assert.assertEquals(u.getSumImpl(), v.getSumImpl());

    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}

    private void verifySummary(SummaryStatistics u, StatisticalSummary s) {try{__CLR4_4_12avs2avslb90penl.R.inc(107553);
        __CLR4_4_12avs2avslb90penl.R.inc(107554);Assert.assertEquals("N",s.getN(),u.getN());
        __CLR4_4_12avs2avslb90penl.R.inc(107555);TestUtils.assertEquals("sum",s.getSum(),u.getSum(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107556);TestUtils.assertEquals("var",s.getVariance(),u.getVariance(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107557);TestUtils.assertEquals("std",s.getStandardDeviation(),u.getStandardDeviation(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107558);TestUtils.assertEquals("mean",s.getMean(),u.getMean(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107559);TestUtils.assertEquals("min",s.getMin(),u.getMin(),tolerance);
        __CLR4_4_12avs2avslb90penl.R.inc(107560);TestUtils.assertEquals("max",s.getMax(),u.getMax(),tolerance);
    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}

    @Test
    public void testSetterInjection() {__CLR4_4_12avs2avslb90penl.R.globalSliceStart(getClass().getName(),107561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vpyral2azt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12avs2avslb90penl.R.rethrow($CLV_t2$);}finally{__CLR4_4_12avs2avslb90penl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest.testSetterInjection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vpyral2azt(){try{__CLR4_4_12avs2avslb90penl.R.inc(107561);
        __CLR4_4_12avs2avslb90penl.R.inc(107562);SummaryStatistics u = createSummaryStatistics();
        __CLR4_4_12avs2avslb90penl.R.inc(107563);u.setMeanImpl(new Sum());
        __CLR4_4_12avs2avslb90penl.R.inc(107564);u.setSumLogImpl(new Sum());
        __CLR4_4_12avs2avslb90penl.R.inc(107565);u.addValue(1);
        __CLR4_4_12avs2avslb90penl.R.inc(107566);u.addValue(3);
        __CLR4_4_12avs2avslb90penl.R.inc(107567);Assert.assertEquals(4, u.getMean(), 1E-14);
        __CLR4_4_12avs2avslb90penl.R.inc(107568);Assert.assertEquals(4, u.getSumOfLogs(), 1E-14);
        __CLR4_4_12avs2avslb90penl.R.inc(107569);Assert.assertEquals(FastMath.exp(2), u.getGeometricMean(), 1E-14);
        __CLR4_4_12avs2avslb90penl.R.inc(107570);u.clear();
        __CLR4_4_12avs2avslb90penl.R.inc(107571);u.addValue(1);
        __CLR4_4_12avs2avslb90penl.R.inc(107572);u.addValue(2);
        __CLR4_4_12avs2avslb90penl.R.inc(107573);Assert.assertEquals(3, u.getMean(), 1E-14);
        __CLR4_4_12avs2avslb90penl.R.inc(107574);u.clear();
        __CLR4_4_12avs2avslb90penl.R.inc(107575);u.setMeanImpl(new Mean()); // OK after clear
    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}

    @Test
    public void testSetterIllegalState() {__CLR4_4_12avs2avslb90penl.R.globalSliceStart(getClass().getName(),107576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwcmr12b08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12avs2avslb90penl.R.rethrow($CLV_t2$);}finally{__CLR4_4_12avs2avslb90penl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest.testSetterIllegalState",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwcmr12b08(){try{__CLR4_4_12avs2avslb90penl.R.inc(107576);
        __CLR4_4_12avs2avslb90penl.R.inc(107577);SummaryStatistics u = createSummaryStatistics();
        __CLR4_4_12avs2avslb90penl.R.inc(107578);u.addValue(1);
        __CLR4_4_12avs2avslb90penl.R.inc(107579);u.addValue(3);
        __CLR4_4_12avs2avslb90penl.R.inc(107580);try {
            __CLR4_4_12avs2avslb90penl.R.inc(107581);u.setMeanImpl(new Sum());
            __CLR4_4_12avs2avslb90penl.R.inc(107582);Assert.fail("Expecting IllegalStateException");
        } catch (IllegalStateException ex) {
            // expected
        }
    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}
    
    
    /**
     * JIRA: MATH-691
     */
    @Test
    public void testOverrideVarianceWithMathClass() {__CLR4_4_12avs2avslb90penl.R.globalSliceStart(getClass().getName(),107583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmegqq2b0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12avs2avslb90penl.R.rethrow($CLV_t2$);}finally{__CLR4_4_12avs2avslb90penl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest.testOverrideVarianceWithMathClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmegqq2b0f(){try{__CLR4_4_12avs2avslb90penl.R.inc(107583);
        __CLR4_4_12avs2avslb90penl.R.inc(107584);double[] scores = {1, 2, 3, 4};
        __CLR4_4_12avs2avslb90penl.R.inc(107585);SummaryStatistics stats = new SummaryStatistics();
        __CLR4_4_12avs2avslb90penl.R.inc(107586);stats.setVarianceImpl(new Variance(false)); //use "population variance"
        __CLR4_4_12avs2avslb90penl.R.inc(107587);for(double i : scores) {{
          __CLR4_4_12avs2avslb90penl.R.inc(107588);stats.addValue(i);
        }
        }__CLR4_4_12avs2avslb90penl.R.inc(107589);Assert.assertEquals((new Variance(false)).evaluate(scores),stats.getVariance(), 0); 
    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}
    
    @Test
    public void testOverrideMeanWithMathClass() {__CLR4_4_12avs2avslb90penl.R.globalSliceStart(getClass().getName(),107590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjeolu2b0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12avs2avslb90penl.R.rethrow($CLV_t2$);}finally{__CLR4_4_12avs2avslb90penl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest.testOverrideMeanWithMathClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjeolu2b0m(){try{__CLR4_4_12avs2avslb90penl.R.inc(107590);
        __CLR4_4_12avs2avslb90penl.R.inc(107591);double[] scores = {1, 2, 3, 4};
        __CLR4_4_12avs2avslb90penl.R.inc(107592);SummaryStatistics stats = new SummaryStatistics();
        __CLR4_4_12avs2avslb90penl.R.inc(107593);stats.setMeanImpl(new Mean()); 
        __CLR4_4_12avs2avslb90penl.R.inc(107594);for(double i : scores) {{
          __CLR4_4_12avs2avslb90penl.R.inc(107595);stats.addValue(i);
        }
        }__CLR4_4_12avs2avslb90penl.R.inc(107596);Assert.assertEquals((new Mean()).evaluate(scores),stats.getMean(), 0); 
    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}
    
    @Test
    public void testOverrideGeoMeanWithMathClass() {__CLR4_4_12avs2avslb90penl.R.globalSliceStart(getClass().getName(),107597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wrhozd2b0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12avs2avslb90penl.R.rethrow($CLV_t2$);}finally{__CLR4_4_12avs2avslb90penl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest.testOverrideGeoMeanWithMathClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wrhozd2b0t(){try{__CLR4_4_12avs2avslb90penl.R.inc(107597);
        __CLR4_4_12avs2avslb90penl.R.inc(107598);double[] scores = {1, 2, 3, 4};
        __CLR4_4_12avs2avslb90penl.R.inc(107599);SummaryStatistics stats = new SummaryStatistics();
        __CLR4_4_12avs2avslb90penl.R.inc(107600);stats.setGeoMeanImpl(new GeometricMean()); 
        __CLR4_4_12avs2avslb90penl.R.inc(107601);for(double i : scores) {{
          __CLR4_4_12avs2avslb90penl.R.inc(107602);stats.addValue(i);
        }
        }__CLR4_4_12avs2avslb90penl.R.inc(107603);Assert.assertEquals((new GeometricMean()).evaluate(scores),stats.getGeometricMean(), 0); 
    }finally{__CLR4_4_12avs2avslb90penl.R.flushNeeded();}}
}
