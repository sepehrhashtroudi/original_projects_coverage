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
package org.apache.commons.math3.stat.ranking;

import org.junit.Assert;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.exception.NotANumberException;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Test;


/**
 * Test cases for NaturalRanking class
 *
 * @since 2.0
 * @version $Id$
 */
public class NaturalRankingTest {static class __CLR4_4_12c2n2c2nlb90peqr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,109101,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final double[] exampleData = { 20, 17, 30, 42.3, 17, 50,
            Double.NaN, Double.NEGATIVE_INFINITY, 17 };
    private final double[] tiesFirst = { 0, 0, 2, 1, 4 };
    private final double[] tiesLast = { 4, 4, 1, 0 };
    private final double[] multipleNaNs = { 0, 1, Double.NaN, Double.NaN };
    private final double[] multipleTies = { 3, 2, 5, 5, 6, 6, 1 };
    private final double[] allSame = { 0, 0, 0, 0 };

    @Test
    public void testDefault() {__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceStart(getClass().getName(),108959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xwf06u2c2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c2n2c2nlb90peqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.ranking.NaturalRankingTest.testDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xwf06u2c2n(){try{__CLR4_4_12c2n2c2nlb90peqr.R.inc(108959); // Ties averaged, NaNs failed
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108960);NaturalRanking ranking = new NaturalRanking();
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108961);double[] ranks;
        
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108962);try {
            __CLR4_4_12c2n2c2nlb90peqr.R.inc(108963);ranks = ranking.rank(exampleData);
            __CLR4_4_12c2n2c2nlb90peqr.R.inc(108964);Assert.fail("expected NotANumberException due to NaNStrategy.FAILED");
        } catch (NotANumberException e) {
            // expected
        }
        
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108965);ranks = ranking.rank(tiesFirst);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108966);double[] correctRanks = new double[] { 1.5, 1.5, 4, 3, 5 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108967);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108968);ranks = ranking.rank(tiesLast);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108969);correctRanks = new double[] { 3.5, 3.5, 2, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108970);TestUtils.assertEquals(correctRanks, ranks, 0d);
        
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108971);try {
            __CLR4_4_12c2n2c2nlb90peqr.R.inc(108972);ranks = ranking.rank(multipleNaNs);
            __CLR4_4_12c2n2c2nlb90peqr.R.inc(108973);Assert.fail("expected NotANumberException due to NaNStrategy.FAILED");
        } catch (NotANumberException e) {
            // expected
        }
        
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108974);ranks = ranking.rank(multipleTies);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108975);correctRanks = new double[] { 3, 2, 4.5, 4.5, 6.5, 6.5, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108976);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108977);ranks = ranking.rank(allSame);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108978);correctRanks = new double[] { 2.5, 2.5, 2.5, 2.5 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108979);TestUtils.assertEquals(correctRanks, ranks, 0d);
    }finally{__CLR4_4_12c2n2c2nlb90peqr.R.flushNeeded();}}

    @Test
    public void testNaNsMaximalTiesMinimum() {__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceStart(getClass().getName(),108980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qe3hef2c38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c2n2c2nlb90peqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.ranking.NaturalRankingTest.testNaNsMaximalTiesMinimum",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qe3hef2c38(){try{__CLR4_4_12c2n2c2nlb90peqr.R.inc(108980);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108981);NaturalRanking ranking = new NaturalRanking(NaNStrategy.MAXIMAL, TiesStrategy.MINIMUM);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108982);double[] ranks = ranking.rank(exampleData);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108983);double[] correctRanks = { 5, 2, 6, 7, 2, 8, 9, 1, 2 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108984);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108985);ranks = ranking.rank(tiesFirst);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108986);correctRanks = new double[] { 1, 1, 4, 3, 5 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108987);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108988);ranks = ranking.rank(tiesLast);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108989);correctRanks = new double[] { 3, 3, 2, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108990);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108991);ranks = ranking.rank(multipleNaNs);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108992);correctRanks = new double[] { 1, 2, 3, 3 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108993);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108994);ranks = ranking.rank(multipleTies);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108995);correctRanks = new double[] { 3, 2, 4, 4, 6, 6, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108996);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108997);ranks = ranking.rank(allSame);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108998);correctRanks = new double[] { 1, 1, 1, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(108999);TestUtils.assertEquals(correctRanks, ranks, 0d);
    }finally{__CLR4_4_12c2n2c2nlb90peqr.R.flushNeeded();}}

    @Test
    public void testNaNsRemovedTiesSequential() {__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceStart(getClass().getName(),109000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kd3nhb2c3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c2n2c2nlb90peqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.ranking.NaturalRankingTest.testNaNsRemovedTiesSequential",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kd3nhb2c3s(){try{__CLR4_4_12c2n2c2nlb90peqr.R.inc(109000);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109001);NaturalRanking ranking = new NaturalRanking(NaNStrategy.REMOVED,
                TiesStrategy.SEQUENTIAL);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109002);double[] ranks = ranking.rank(exampleData);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109003);double[] correctRanks = { 5, 2, 6, 7, 3, 8, 1, 4 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109004);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109005);ranks = ranking.rank(tiesFirst);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109006);correctRanks = new double[] { 1, 2, 4, 3, 5 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109007);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109008);ranks = ranking.rank(tiesLast);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109009);correctRanks = new double[] { 3, 4, 2, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109010);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109011);ranks = ranking.rank(multipleNaNs);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109012);correctRanks = new double[] { 1, 2 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109013);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109014);ranks = ranking.rank(multipleTies);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109015);correctRanks = new double[] { 3, 2, 4, 5, 6, 7, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109016);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109017);ranks = ranking.rank(allSame);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109018);correctRanks = new double[] { 1, 2, 3, 4 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109019);TestUtils.assertEquals(correctRanks, ranks, 0d);
    }finally{__CLR4_4_12c2n2c2nlb90peqr.R.flushNeeded();}}

    @Test
    public void testNaNsMinimalTiesMaximum() {__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceStart(getClass().getName(),109020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxh2wj2c4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c2n2c2nlb90peqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.ranking.NaturalRankingTest.testNaNsMinimalTiesMaximum",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxh2wj2c4c(){try{__CLR4_4_12c2n2c2nlb90peqr.R.inc(109020);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109021);NaturalRanking ranking = new NaturalRanking(NaNStrategy.MINIMAL,
                TiesStrategy.MAXIMUM);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109022);double[] ranks = ranking.rank(exampleData);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109023);double[] correctRanks = { 6, 5, 7, 8, 5, 9, 2, 2, 5 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109024);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109025);ranks = ranking.rank(tiesFirst);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109026);correctRanks = new double[] { 2, 2, 4, 3, 5 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109027);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109028);ranks = ranking.rank(tiesLast);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109029);correctRanks = new double[] { 4, 4, 2, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109030);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109031);ranks = ranking.rank(multipleNaNs);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109032);correctRanks = new double[] { 3, 4, 2, 2 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109033);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109034);ranks = ranking.rank(multipleTies);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109035);correctRanks = new double[] { 3, 2, 5, 5, 7, 7, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109036);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109037);ranks = ranking.rank(allSame);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109038);correctRanks = new double[] { 4, 4, 4, 4 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109039);TestUtils.assertEquals(correctRanks, ranks, 0d);
    }finally{__CLR4_4_12c2n2c2nlb90peqr.R.flushNeeded();}}

    @Test
    public void testNaNsMinimalTiesAverage() {__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceStart(getClass().getName(),109040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v2o9re2c4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c2n2c2nlb90peqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.ranking.NaturalRankingTest.testNaNsMinimalTiesAverage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v2o9re2c4w(){try{__CLR4_4_12c2n2c2nlb90peqr.R.inc(109040);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109041);NaturalRanking ranking = new NaturalRanking(NaNStrategy.MINIMAL);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109042);double[] ranks = ranking.rank(exampleData);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109043);double[] correctRanks = { 6, 4, 7, 8, 4, 9, 1.5, 1.5, 4 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109044);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109045);ranks = ranking.rank(tiesFirst);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109046);correctRanks = new double[] { 1.5, 1.5, 4, 3, 5 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109047);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109048);ranks = ranking.rank(tiesLast);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109049);correctRanks = new double[] { 3.5, 3.5, 2, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109050);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109051);ranks = ranking.rank(multipleNaNs);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109052);correctRanks = new double[] { 3, 4, 1.5, 1.5 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109053);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109054);ranks = ranking.rank(multipleTies);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109055);correctRanks = new double[] { 3, 2, 4.5, 4.5, 6.5, 6.5, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109056);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109057);ranks = ranking.rank(allSame);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109058);correctRanks = new double[] { 2.5, 2.5, 2.5, 2.5 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109059);TestUtils.assertEquals(correctRanks, ranks, 0d);
    }finally{__CLR4_4_12c2n2c2nlb90peqr.R.flushNeeded();}}

    @Test
    public void testNaNsFixedTiesRandom() {__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceStart(getClass().getName(),109060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q366bt2c5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c2n2c2nlb90peqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.ranking.NaturalRankingTest.testNaNsFixedTiesRandom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q366bt2c5g(){try{__CLR4_4_12c2n2c2nlb90peqr.R.inc(109060);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109061);RandomGenerator randomGenerator = new JDKRandomGenerator();
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109062);randomGenerator.setSeed(1000);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109063);NaturalRanking ranking = new NaturalRanking(NaNStrategy.FIXED,
                randomGenerator);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109064);double[] ranks = ranking.rank(exampleData);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109065);double[] correctRanks = { 5, 3, 6, 7, 3, 8, Double.NaN, 1, 2 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109066);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109067);ranks = ranking.rank(tiesFirst);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109068);correctRanks = new double[] { 1, 2, 4, 3, 5 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109069);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109070);ranks = ranking.rank(tiesLast);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109071);correctRanks = new double[] { 3, 3, 2, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109072);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109073);ranks = ranking.rank(multipleNaNs);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109074);correctRanks = new double[] { 1, 2, Double.NaN, Double.NaN };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109075);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109076);ranks = ranking.rank(multipleTies);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109077);correctRanks = new double[] { 3, 2, 4, 4, 6, 7, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109078);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109079);ranks = ranking.rank(allSame);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109080);correctRanks = new double[] { 2, 3, 3, 3 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109081);TestUtils.assertEquals(correctRanks, ranks, 0d);
    }finally{__CLR4_4_12c2n2c2nlb90peqr.R.flushNeeded();}}

    @Test
    public void testNaNsAndInfs() {__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceStart(getClass().getName(),109082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvdq5i2c62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c2n2c2nlb90peqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.ranking.NaturalRankingTest.testNaNsAndInfs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvdq5i2c62(){try{__CLR4_4_12c2n2c2nlb90peqr.R.inc(109082);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109083);double[] data = { 0, Double.POSITIVE_INFINITY, Double.NaN,
                Double.NEGATIVE_INFINITY };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109084);NaturalRanking ranking = new NaturalRanking(NaNStrategy.MAXIMAL);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109085);double[] ranks = ranking.rank(data);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109086);double[] correctRanks = new double[] { 2, 3.5, 3.5, 1 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109087);TestUtils.assertEquals(correctRanks, ranks, 0d);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109088);ranking = new NaturalRanking(NaNStrategy.MINIMAL);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109089);ranks = ranking.rank(data);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109090);correctRanks = new double[] { 3, 4, 1.5, 1.5 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109091);TestUtils.assertEquals(correctRanks, ranks, 0d);
    }finally{__CLR4_4_12c2n2c2nlb90peqr.R.flushNeeded();}}
    
    @Test(expected=NotANumberException.class)
    public void testNaNsFailed() {__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceStart(getClass().getName(),109092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uu13gu2c6c();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,97,78,115,70,97,105,108,101,100,58,32,91,78,111,116,65,78,117,109,98,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotANumberException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c2n2c2nlb90peqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.ranking.NaturalRankingTest.testNaNsFailed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uu13gu2c6c(){try{__CLR4_4_12c2n2c2nlb90peqr.R.inc(109092);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109093);double[] data = { 0, Double.POSITIVE_INFINITY, Double.NaN, Double.NEGATIVE_INFINITY };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109094);NaturalRanking ranking = new NaturalRanking(NaNStrategy.FAILED);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109095);ranking.rank(data);
    }finally{__CLR4_4_12c2n2c2nlb90peqr.R.flushNeeded();}}
    
    @Test
    public void testNoNaNsFailed() {__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceStart(getClass().getName(),109096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19n2khd2c6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c2n2c2nlb90peqr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c2n2c2nlb90peqr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.ranking.NaturalRankingTest.testNoNaNsFailed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19n2khd2c6g(){try{__CLR4_4_12c2n2c2nlb90peqr.R.inc(109096);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109097);double[] data = { 1, 2, 3, 4 };
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109098);NaturalRanking ranking = new NaturalRanking(NaNStrategy.FAILED);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109099);double[] ranks = ranking.rank(data);
        __CLR4_4_12c2n2c2nlb90peqr.R.inc(109100);TestUtils.assertEquals(data, ranks, 0d);
    }finally{__CLR4_4_12c2n2c2nlb90peqr.R.flushNeeded();}}
    
}
