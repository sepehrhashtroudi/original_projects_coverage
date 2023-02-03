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
import org.apache.commons.math3.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for {@link StorelessUnivariateStatistic} classes.
 * @version $Id$
 */
public abstract class StorelessUnivariateStatisticAbstractTest
    extends UnivariateStatisticAbstractTest {static class __CLR4_4_12at22at2lb90pend{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,107416,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Small sample arrays */
    protected double[][] smallSamples = {{}, {1}, {1,2}, {1,2,3}, {1,2,3,4}};

    /** Return a new instance of the statistic */
    @Override
    public abstract UnivariateStatistic getUnivariateStatistic();

    /**Expected value for  the testArray defined in UnivariateStatisticAbstractTest */
    @Override
    public abstract double expectedValue();

    /**
     *  Verifies that increment() and incrementAll work properly.
     */
    @Test
    public void testIncrementation() {__CLR4_4_12at22at2lb90pend.R.globalSliceStart(getClass().getName(),107318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kwubfj2at2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12at22at2lb90pend.R.rethrow($CLV_t2$);}finally{__CLR4_4_12at22at2lb90pend.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testIncrementation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kwubfj2at2(){try{__CLR4_4_12at22at2lb90pend.R.inc(107318);

        __CLR4_4_12at22at2lb90pend.R.inc(107319);StorelessUnivariateStatistic statistic =
            (StorelessUnivariateStatistic) getUnivariateStatistic();

        // Add testArray one value at a time and check result
        __CLR4_4_12at22at2lb90pend.R.inc(107320);for (int i = 0; (((i < testArray.length)&&(__CLR4_4_12at22at2lb90pend.R.iget(107321)!=0|true))||(__CLR4_4_12at22at2lb90pend.R.iget(107322)==0&false)); i++) {{
            __CLR4_4_12at22at2lb90pend.R.inc(107323);statistic.increment(testArray[i]);
        }

        }__CLR4_4_12at22at2lb90pend.R.inc(107324);Assert.assertEquals(expectedValue(), statistic.getResult(), getTolerance());
        __CLR4_4_12at22at2lb90pend.R.inc(107325);Assert.assertEquals(testArray.length, statistic.getN());

        __CLR4_4_12at22at2lb90pend.R.inc(107326);statistic.clear();

        // Add testArray all at once and check again
        __CLR4_4_12at22at2lb90pend.R.inc(107327);statistic.incrementAll(testArray);
        __CLR4_4_12at22at2lb90pend.R.inc(107328);Assert.assertEquals(expectedValue(), statistic.getResult(), getTolerance());
        __CLR4_4_12at22at2lb90pend.R.inc(107329);Assert.assertEquals(testArray.length, statistic.getN());

        __CLR4_4_12at22at2lb90pend.R.inc(107330);statistic.clear();

        // Cleared
        __CLR4_4_12at22at2lb90pend.R.inc(107331);checkClearValue(statistic);
        __CLR4_4_12at22at2lb90pend.R.inc(107332);Assert.assertEquals(0, statistic.getN());

    }finally{__CLR4_4_12at22at2lb90pend.R.flushNeeded();}}

    protected void checkClearValue(StorelessUnivariateStatistic statistic){try{__CLR4_4_12at22at2lb90pend.R.inc(107333);
        __CLR4_4_12at22at2lb90pend.R.inc(107334);Assert.assertTrue(Double.isNaN(statistic.getResult()));
    }finally{__CLR4_4_12at22at2lb90pend.R.flushNeeded();}}
    
    @Test
    public void testSerialization() {__CLR4_4_12at22at2lb90pend.R.globalSliceStart(getClass().getName(),107335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on92atj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12at22at2lb90pend.R.rethrow($CLV_t2$);}finally{__CLR4_4_12at22at2lb90pend.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on92atj(){try{__CLR4_4_12at22at2lb90pend.R.inc(107335);

        __CLR4_4_12at22at2lb90pend.R.inc(107336);StorelessUnivariateStatistic statistic =
            (StorelessUnivariateStatistic) getUnivariateStatistic();

        __CLR4_4_12at22at2lb90pend.R.inc(107337);TestUtils.checkSerializedEquality(statistic);

        __CLR4_4_12at22at2lb90pend.R.inc(107338);statistic.clear();

        __CLR4_4_12at22at2lb90pend.R.inc(107339);for (int i = 0; (((i < testArray.length)&&(__CLR4_4_12at22at2lb90pend.R.iget(107340)!=0|true))||(__CLR4_4_12at22at2lb90pend.R.iget(107341)==0&false)); i++) {{
            __CLR4_4_12at22at2lb90pend.R.inc(107342);statistic.increment(testArray[i]);
            __CLR4_4_12at22at2lb90pend.R.inc(107343);if((((i % 5 == 0)&&(__CLR4_4_12at22at2lb90pend.R.iget(107344)!=0|true))||(__CLR4_4_12at22at2lb90pend.R.iget(107345)==0&false)))
                {__CLR4_4_12at22at2lb90pend.R.inc(107346);statistic = (StorelessUnivariateStatistic)TestUtils.serializeAndRecover(statistic);
        }}

        }__CLR4_4_12at22at2lb90pend.R.inc(107347);TestUtils.checkSerializedEquality(statistic);

        __CLR4_4_12at22at2lb90pend.R.inc(107348);Assert.assertEquals(expectedValue(), statistic.getResult(), getTolerance());

        __CLR4_4_12at22at2lb90pend.R.inc(107349);statistic.clear();

        __CLR4_4_12at22at2lb90pend.R.inc(107350);checkClearValue(statistic);

    }finally{__CLR4_4_12at22at2lb90pend.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() {__CLR4_4_12at22at2lb90pend.R.globalSliceStart(getClass().getName(),107351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w82atz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12at22at2lb90pend.R.rethrow($CLV_t2$);}finally{__CLR4_4_12at22at2lb90pend.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w82atz(){try{__CLR4_4_12at22at2lb90pend.R.inc(107351);
        __CLR4_4_12at22at2lb90pend.R.inc(107352);StorelessUnivariateStatistic statistic =
            (StorelessUnivariateStatistic) getUnivariateStatistic();
        __CLR4_4_12at22at2lb90pend.R.inc(107353);StorelessUnivariateStatistic statistic2 = null;

        __CLR4_4_12at22at2lb90pend.R.inc(107354);Assert.assertTrue("non-null, compared to null", !statistic.equals(statistic2));
        __CLR4_4_12at22at2lb90pend.R.inc(107355);Assert.assertTrue("reflexive, non-null", statistic.equals(statistic));

        __CLR4_4_12at22at2lb90pend.R.inc(107356);int emptyHash = statistic.hashCode();
        __CLR4_4_12at22at2lb90pend.R.inc(107357);statistic2 = (StorelessUnivariateStatistic) getUnivariateStatistic();
        __CLR4_4_12at22at2lb90pend.R.inc(107358);Assert.assertTrue("empty stats should be equal", statistic.equals(statistic2));
        __CLR4_4_12at22at2lb90pend.R.inc(107359);Assert.assertEquals("empty stats should have the same hashcode",
                emptyHash, statistic2.hashCode());

        __CLR4_4_12at22at2lb90pend.R.inc(107360);statistic.increment(1d);
        __CLR4_4_12at22at2lb90pend.R.inc(107361);Assert.assertTrue("reflexive, non-empty", statistic.equals(statistic));
        __CLR4_4_12at22at2lb90pend.R.inc(107362);Assert.assertTrue("non-empty, compared to empty", !statistic.equals(statistic2));
        __CLR4_4_12at22at2lb90pend.R.inc(107363);Assert.assertTrue("non-empty, compared to empty", !statistic2.equals(statistic));
        __CLR4_4_12at22at2lb90pend.R.inc(107364);Assert.assertTrue("non-empty stat should have different hashcode from empty stat",
                statistic.hashCode() != emptyHash);

        __CLR4_4_12at22at2lb90pend.R.inc(107365);statistic2.increment(1d);
        __CLR4_4_12at22at2lb90pend.R.inc(107366);Assert.assertTrue("stats with same data should be equal", statistic.equals(statistic2));
        __CLR4_4_12at22at2lb90pend.R.inc(107367);Assert.assertEquals("stats with same data should have the same hashcode",
                statistic.hashCode(), statistic2.hashCode());

        __CLR4_4_12at22at2lb90pend.R.inc(107368);statistic.increment(Double.POSITIVE_INFINITY);
        __CLR4_4_12at22at2lb90pend.R.inc(107369);Assert.assertTrue("stats with different n's should not be equal", !statistic2.equals(statistic));
        __CLR4_4_12at22at2lb90pend.R.inc(107370);Assert.assertTrue("stats with different n's should have different hashcodes",
                statistic.hashCode() != statistic2.hashCode());

        __CLR4_4_12at22at2lb90pend.R.inc(107371);statistic2.increment(Double.POSITIVE_INFINITY);
        __CLR4_4_12at22at2lb90pend.R.inc(107372);Assert.assertTrue("stats with same data should be equal", statistic.equals(statistic2));
        __CLR4_4_12at22at2lb90pend.R.inc(107373);Assert.assertEquals("stats with same data should have the same hashcode",
                statistic.hashCode(), statistic2.hashCode());

        __CLR4_4_12at22at2lb90pend.R.inc(107374);statistic.clear();
        __CLR4_4_12at22at2lb90pend.R.inc(107375);statistic2.clear();
        __CLR4_4_12at22at2lb90pend.R.inc(107376);Assert.assertTrue("cleared stats should be equal", statistic.equals(statistic2));
        __CLR4_4_12at22at2lb90pend.R.inc(107377);Assert.assertEquals("cleared stats should have thashcode of empty stat",
                emptyHash, statistic2.hashCode());
        __CLR4_4_12at22at2lb90pend.R.inc(107378);Assert.assertEquals("cleared stats should have thashcode of empty stat",
                emptyHash, statistic.hashCode());

    }finally{__CLR4_4_12at22at2lb90pend.R.flushNeeded();}}

    @Test
    public void testMomentSmallSamples() {__CLR4_4_12at22at2lb90pend.R.globalSliceStart(getClass().getName(),107379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bneae32aur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12at22at2lb90pend.R.rethrow($CLV_t2$);}finally{__CLR4_4_12at22at2lb90pend.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testMomentSmallSamples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bneae32aur(){try{__CLR4_4_12at22at2lb90pend.R.inc(107379);
        __CLR4_4_12at22at2lb90pend.R.inc(107380);UnivariateStatistic stat = getUnivariateStatistic();
        __CLR4_4_12at22at2lb90pend.R.inc(107381);if ((((stat instanceof SecondMoment)&&(__CLR4_4_12at22at2lb90pend.R.iget(107382)!=0|true))||(__CLR4_4_12at22at2lb90pend.R.iget(107383)==0&false))) {{
            __CLR4_4_12at22at2lb90pend.R.inc(107384);SecondMoment moment = (SecondMoment) getUnivariateStatistic();
            __CLR4_4_12at22at2lb90pend.R.inc(107385);Assert.assertTrue(Double.isNaN(moment.getResult()));
            __CLR4_4_12at22at2lb90pend.R.inc(107386);moment.increment(1d);
            __CLR4_4_12at22at2lb90pend.R.inc(107387);Assert.assertEquals(0d, moment.getResult(), 0);
        }
    }}finally{__CLR4_4_12at22at2lb90pend.R.flushNeeded();}}

    /**
     * Make sure that evaluate(double[]) and inrementAll(double[]),
     * getResult() give same results.
     */
    @Test
    public void testConsistency() {__CLR4_4_12at22at2lb90pend.R.globalSliceStart(getClass().getName(),107388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tafanh2av0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12at22at2lb90pend.R.rethrow($CLV_t2$);}finally{__CLR4_4_12at22at2lb90pend.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tafanh2av0(){try{__CLR4_4_12at22at2lb90pend.R.inc(107388);
        __CLR4_4_12at22at2lb90pend.R.inc(107389);StorelessUnivariateStatistic stat = (StorelessUnivariateStatistic) getUnivariateStatistic();
        __CLR4_4_12at22at2lb90pend.R.inc(107390);stat.incrementAll(testArray);
        __CLR4_4_12at22at2lb90pend.R.inc(107391);Assert.assertEquals(stat.getResult(), stat.evaluate(testArray), getTolerance());
        __CLR4_4_12at22at2lb90pend.R.inc(107392);for (int i = 0; (((i < smallSamples.length)&&(__CLR4_4_12at22at2lb90pend.R.iget(107393)!=0|true))||(__CLR4_4_12at22at2lb90pend.R.iget(107394)==0&false)); i++) {{
            __CLR4_4_12at22at2lb90pend.R.inc(107395);stat.clear();
            __CLR4_4_12at22at2lb90pend.R.inc(107396);for (int j =0; (((j < smallSamples[i].length)&&(__CLR4_4_12at22at2lb90pend.R.iget(107397)!=0|true))||(__CLR4_4_12at22at2lb90pend.R.iget(107398)==0&false)); j++) {{
                __CLR4_4_12at22at2lb90pend.R.inc(107399);stat.increment(smallSamples[i][j]);
            }
            }__CLR4_4_12at22at2lb90pend.R.inc(107400);TestUtils.assertEquals(stat.getResult(), stat.evaluate(smallSamples[i]), getTolerance());
        }
    }}finally{__CLR4_4_12at22at2lb90pend.R.flushNeeded();}}

    /**
     * Verifies that copied statistics remain equal to originals when
     * incremented the same way.
     *
     */
    @Test
    public void testCopyConsistency() {__CLR4_4_12at22at2lb90pend.R.globalSliceStart(getClass().getName(),107401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3zsyw2avd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12at22at2lb90pend.R.rethrow($CLV_t2$);}finally{__CLR4_4_12at22at2lb90pend.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testCopyConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3zsyw2avd(){try{__CLR4_4_12at22at2lb90pend.R.inc(107401);

        __CLR4_4_12at22at2lb90pend.R.inc(107402);StorelessUnivariateStatistic master =
            (StorelessUnivariateStatistic) getUnivariateStatistic();

        __CLR4_4_12at22at2lb90pend.R.inc(107403);StorelessUnivariateStatistic replica = null;

        // Randomly select a portion of testArray to load first
        __CLR4_4_12at22at2lb90pend.R.inc(107404);long index = FastMath.round((FastMath.random()) * testArray.length);

        // Put first half in master and copy master to replica
        __CLR4_4_12at22at2lb90pend.R.inc(107405);master.incrementAll(testArray, 0, (int) index);
        __CLR4_4_12at22at2lb90pend.R.inc(107406);replica = master.copy();

        // Check same
        __CLR4_4_12at22at2lb90pend.R.inc(107407);Assert.assertTrue(replica.equals(master));
        __CLR4_4_12at22at2lb90pend.R.inc(107408);Assert.assertTrue(master.equals(replica));

        // Now add second part to both and check again
        __CLR4_4_12at22at2lb90pend.R.inc(107409);master.incrementAll(testArray,
                (int) index, (int) (testArray.length - index));
        __CLR4_4_12at22at2lb90pend.R.inc(107410);replica.incrementAll(testArray,
                (int) index, (int) (testArray.length - index));
        __CLR4_4_12at22at2lb90pend.R.inc(107411);Assert.assertTrue(replica.equals(master));
        __CLR4_4_12at22at2lb90pend.R.inc(107412);Assert.assertTrue(master.equals(replica));
    }finally{__CLR4_4_12at22at2lb90pend.R.flushNeeded();}}

    @Test
    public void testSerial() {__CLR4_4_12at22at2lb90pend.R.globalSliceStart(getClass().getName(),107413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv2avp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12at22at2lb90pend.R.rethrow($CLV_t2$);}finally{__CLR4_4_12at22at2lb90pend.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv2avp(){try{__CLR4_4_12at22at2lb90pend.R.inc(107413);
        __CLR4_4_12at22at2lb90pend.R.inc(107414);StorelessUnivariateStatistic s =
            (StorelessUnivariateStatistic) getUnivariateStatistic();
        __CLR4_4_12at22at2lb90pend.R.inc(107415);Assert.assertEquals(s, TestUtils.serializeAndRecover(s));
    }finally{__CLR4_4_12at22at2lb90pend.R.flushNeeded();}}
}
