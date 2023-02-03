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

import java.util.ArrayList;
import java.util.Collection;


import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.distribution.UniformRealDistribution;
import org.apache.commons.math3.distribution.IntegerDistribution;
import org.apache.commons.math3.distribution.UniformIntegerDistribution;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;


/**
 * Test cases for {@link AggregateSummaryStatistics}
 *
 */
public class AggregateSummaryStatisticsTest {static class __CLR4_4_12a742a74lb90pem6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,106693,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Tests the standard aggregation behavior
     */
    @Test
    public void testAggregation() {__CLR4_4_12a742a74lb90pem6.R.globalSliceStart(getClass().getName(),106528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xa37wp2a74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a742a74lb90pem6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a742a74lb90pem6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest.testAggregation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xa37wp2a74(){try{__CLR4_4_12a742a74lb90pem6.R.inc(106528);
        __CLR4_4_12a742a74lb90pem6.R.inc(106529);AggregateSummaryStatistics aggregate = new AggregateSummaryStatistics();
        __CLR4_4_12a742a74lb90pem6.R.inc(106530);SummaryStatistics setOneStats = aggregate.createContributingStatistics();
        __CLR4_4_12a742a74lb90pem6.R.inc(106531);SummaryStatistics setTwoStats = aggregate.createContributingStatistics();

        __CLR4_4_12a742a74lb90pem6.R.inc(106532);Assert.assertNotNull("The set one contributing stats are null", setOneStats);
        __CLR4_4_12a742a74lb90pem6.R.inc(106533);Assert.assertNotNull("The set two contributing stats are null", setTwoStats);
        __CLR4_4_12a742a74lb90pem6.R.inc(106534);Assert.assertNotSame("Contributing stats objects are the same", setOneStats, setTwoStats);

        __CLR4_4_12a742a74lb90pem6.R.inc(106535);setOneStats.addValue(2);
        __CLR4_4_12a742a74lb90pem6.R.inc(106536);setOneStats.addValue(3);
        __CLR4_4_12a742a74lb90pem6.R.inc(106537);setOneStats.addValue(5);
        __CLR4_4_12a742a74lb90pem6.R.inc(106538);setOneStats.addValue(7);
        __CLR4_4_12a742a74lb90pem6.R.inc(106539);setOneStats.addValue(11);
        __CLR4_4_12a742a74lb90pem6.R.inc(106540);Assert.assertEquals("Wrong number of set one values", 5, setOneStats.getN());
        __CLR4_4_12a742a74lb90pem6.R.inc(106541);Assert.assertTrue("Wrong sum of set one values", Precision.equals(28.0, setOneStats.getSum(), 1));

        __CLR4_4_12a742a74lb90pem6.R.inc(106542);setTwoStats.addValue(2);
        __CLR4_4_12a742a74lb90pem6.R.inc(106543);setTwoStats.addValue(4);
        __CLR4_4_12a742a74lb90pem6.R.inc(106544);setTwoStats.addValue(8);
        __CLR4_4_12a742a74lb90pem6.R.inc(106545);Assert.assertEquals("Wrong number of set two values", 3, setTwoStats.getN());
        __CLR4_4_12a742a74lb90pem6.R.inc(106546);Assert.assertTrue("Wrong sum of set two values", Precision.equals(14.0, setTwoStats.getSum(), 1));

        __CLR4_4_12a742a74lb90pem6.R.inc(106547);Assert.assertEquals("Wrong number of aggregate values", 8, aggregate.getN());
        __CLR4_4_12a742a74lb90pem6.R.inc(106548);Assert.assertTrue("Wrong aggregate sum", Precision.equals(42.0, aggregate.getSum(), 1));
    }finally{__CLR4_4_12a742a74lb90pem6.R.flushNeeded();}}

    /**
     * Verify that aggregating over a partition gives the same results
     * as direct computation.
     *
     *  1) Randomly generate a dataset of 10-100 values
     *     from [-100, 100]
     *  2) Divide the dataset it into 2-5 partitions
     *  3) Create an AggregateSummaryStatistic and ContributingStatistics
     *     for each partition
     *  4) Compare results from the AggregateSummaryStatistic with values
     *     returned by a single SummaryStatistics instance that is provided
     *     the full dataset
     */
    @Test
    public void testAggregationConsistency() {__CLR4_4_12a742a74lb90pem6.R.globalSliceStart(getClass().getName(),106549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drc69d2a7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a742a74lb90pem6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a742a74lb90pem6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest.testAggregationConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drc69d2a7p(){try{__CLR4_4_12a742a74lb90pem6.R.inc(106549);

        // Generate a random sample and random partition
        __CLR4_4_12a742a74lb90pem6.R.inc(106550);double[] totalSample = generateSample();
        __CLR4_4_12a742a74lb90pem6.R.inc(106551);double[][] subSamples = generatePartition(totalSample);
        __CLR4_4_12a742a74lb90pem6.R.inc(106552);int nSamples = subSamples.length;

        // Create aggregator and total stats for comparison
        __CLR4_4_12a742a74lb90pem6.R.inc(106553);AggregateSummaryStatistics aggregate = new AggregateSummaryStatistics();
        __CLR4_4_12a742a74lb90pem6.R.inc(106554);SummaryStatistics totalStats = new SummaryStatistics();

        // Create array of component stats
        __CLR4_4_12a742a74lb90pem6.R.inc(106555);SummaryStatistics componentStats[] = new SummaryStatistics[nSamples];

        __CLR4_4_12a742a74lb90pem6.R.inc(106556);for (int i = 0; (((i < nSamples)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106557)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106558)==0&false)); i++) {{

            // Make componentStats[i] a contributing statistic to aggregate
            __CLR4_4_12a742a74lb90pem6.R.inc(106559);componentStats[i] = aggregate.createContributingStatistics();

            // Add values from subsample
            __CLR4_4_12a742a74lb90pem6.R.inc(106560);for (int j = 0; (((j < subSamples[i].length)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106561)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106562)==0&false)); j++) {{
                __CLR4_4_12a742a74lb90pem6.R.inc(106563);componentStats[i].addValue(subSamples[i][j]);
            }
        }}

        // Compute totalStats directly
        }__CLR4_4_12a742a74lb90pem6.R.inc(106564);for (int i = 0; (((i < totalSample.length)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106565)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106566)==0&false)); i++) {{
            __CLR4_4_12a742a74lb90pem6.R.inc(106567);totalStats.addValue(totalSample[i]);
        }

        /*
         * Compare statistics in totalStats with aggregate.
         * Note that guaranteed success of this comparison depends on the
         * fact that <aggregate> gets values in exactly the same order
         * as <totalStats>.
         *
         */
        }__CLR4_4_12a742a74lb90pem6.R.inc(106568);Assert.assertEquals(totalStats.getSummary(), aggregate.getSummary());

    }finally{__CLR4_4_12a742a74lb90pem6.R.flushNeeded();}}

    /**
     * Test aggregate function by randomly generating a dataset of 10-100 values
     * from [-100, 100], dividing it into 2-5 partitions, computing stats for each
     * partition and comparing the result of aggregate(...) applied to the collection
     * of per-partition SummaryStatistics with a single SummaryStatistics computed
     * over the full sample.
     *
     */
    @Test
    public void testAggregate() {__CLR4_4_12a742a74lb90pem6.R.globalSliceStart(getClass().getName(),106569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_139d59w2a89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a742a74lb90pem6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a742a74lb90pem6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest.testAggregate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_139d59w2a89(){try{__CLR4_4_12a742a74lb90pem6.R.inc(106569);

        // Generate a random sample and random partition
        __CLR4_4_12a742a74lb90pem6.R.inc(106570);double[] totalSample = generateSample();
        __CLR4_4_12a742a74lb90pem6.R.inc(106571);double[][] subSamples = generatePartition(totalSample);
        __CLR4_4_12a742a74lb90pem6.R.inc(106572);int nSamples = subSamples.length;

        // Compute combined stats directly
        __CLR4_4_12a742a74lb90pem6.R.inc(106573);SummaryStatistics totalStats = new SummaryStatistics();
        __CLR4_4_12a742a74lb90pem6.R.inc(106574);for (int i = 0; (((i < totalSample.length)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106575)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106576)==0&false)); i++) {{
            __CLR4_4_12a742a74lb90pem6.R.inc(106577);totalStats.addValue(totalSample[i]);
        }

        // Now compute subsample stats individually and aggregate
        }__CLR4_4_12a742a74lb90pem6.R.inc(106578);SummaryStatistics[] subSampleStats = new SummaryStatistics[nSamples];
        __CLR4_4_12a742a74lb90pem6.R.inc(106579);for (int i = 0; (((i < nSamples)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106580)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106581)==0&false)); i++) {{
            __CLR4_4_12a742a74lb90pem6.R.inc(106582);subSampleStats[i] = new SummaryStatistics();
        }
        }__CLR4_4_12a742a74lb90pem6.R.inc(106583);Collection<SummaryStatistics> aggregate = new ArrayList<SummaryStatistics>();
        __CLR4_4_12a742a74lb90pem6.R.inc(106584);for (int i = 0; (((i < nSamples)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106585)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106586)==0&false)); i++) {{
            __CLR4_4_12a742a74lb90pem6.R.inc(106587);for (int j = 0; (((j < subSamples[i].length)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106588)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106589)==0&false)); j++) {{
                __CLR4_4_12a742a74lb90pem6.R.inc(106590);subSampleStats[i].addValue(subSamples[i][j]);
            }
            }__CLR4_4_12a742a74lb90pem6.R.inc(106591);aggregate.add(subSampleStats[i]);
        }

        // Compare values
        }__CLR4_4_12a742a74lb90pem6.R.inc(106592);StatisticalSummary aggregatedStats = AggregateSummaryStatistics.aggregate(aggregate);
        __CLR4_4_12a742a74lb90pem6.R.inc(106593);assertEquals(totalStats.getSummary(), aggregatedStats, 10E-12);
    }finally{__CLR4_4_12a742a74lb90pem6.R.flushNeeded();}}


    @Test
    public void testAggregateDegenerate() {__CLR4_4_12a742a74lb90pem6.R.globalSliceStart(getClass().getName(),106594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmo4ja2a8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a742a74lb90pem6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a742a74lb90pem6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest.testAggregateDegenerate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmo4ja2a8y(){try{__CLR4_4_12a742a74lb90pem6.R.inc(106594);
        __CLR4_4_12a742a74lb90pem6.R.inc(106595);double[] totalSample = {1, 2, 3, 4, 5};
        __CLR4_4_12a742a74lb90pem6.R.inc(106596);double[][] subSamples = {{1}, {2}, {3}, {4}, {5}};

        // Compute combined stats directly
        __CLR4_4_12a742a74lb90pem6.R.inc(106597);SummaryStatistics totalStats = new SummaryStatistics();
        __CLR4_4_12a742a74lb90pem6.R.inc(106598);for (int i = 0; (((i < totalSample.length)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106599)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106600)==0&false)); i++) {{
            __CLR4_4_12a742a74lb90pem6.R.inc(106601);totalStats.addValue(totalSample[i]);
        }

        // Now compute subsample stats individually and aggregate
        }__CLR4_4_12a742a74lb90pem6.R.inc(106602);SummaryStatistics[] subSampleStats = new SummaryStatistics[5];
        __CLR4_4_12a742a74lb90pem6.R.inc(106603);for (int i = 0; (((i < 5)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106604)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106605)==0&false)); i++) {{
            __CLR4_4_12a742a74lb90pem6.R.inc(106606);subSampleStats[i] = new SummaryStatistics();
        }
        }__CLR4_4_12a742a74lb90pem6.R.inc(106607);Collection<SummaryStatistics> aggregate = new ArrayList<SummaryStatistics>();
        __CLR4_4_12a742a74lb90pem6.R.inc(106608);for (int i = 0; (((i < 5)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106609)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106610)==0&false)); i++) {{
            __CLR4_4_12a742a74lb90pem6.R.inc(106611);for (int j = 0; (((j < subSamples[i].length)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106612)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106613)==0&false)); j++) {{
                __CLR4_4_12a742a74lb90pem6.R.inc(106614);subSampleStats[i].addValue(subSamples[i][j]);
            }
            }__CLR4_4_12a742a74lb90pem6.R.inc(106615);aggregate.add(subSampleStats[i]);
        }

        // Compare values
        }__CLR4_4_12a742a74lb90pem6.R.inc(106616);StatisticalSummaryValues aggregatedStats = AggregateSummaryStatistics.aggregate(aggregate);
        __CLR4_4_12a742a74lb90pem6.R.inc(106617);assertEquals(totalStats.getSummary(), aggregatedStats, 10E-12);
    }finally{__CLR4_4_12a742a74lb90pem6.R.flushNeeded();}}

    @Test
    public void testAggregateSpecialValues() {__CLR4_4_12a742a74lb90pem6.R.globalSliceStart(getClass().getName(),106618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xr9f92a9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a742a74lb90pem6.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a742a74lb90pem6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest.testAggregateSpecialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xr9f92a9m(){try{__CLR4_4_12a742a74lb90pem6.R.inc(106618);
        __CLR4_4_12a742a74lb90pem6.R.inc(106619);double[] totalSample = {Double.POSITIVE_INFINITY, 2, 3, Double.NaN, 5};
        __CLR4_4_12a742a74lb90pem6.R.inc(106620);double[][] subSamples = {{Double.POSITIVE_INFINITY, 2}, {3}, {Double.NaN}, {5}};

        // Compute combined stats directly
        __CLR4_4_12a742a74lb90pem6.R.inc(106621);SummaryStatistics totalStats = new SummaryStatistics();
        __CLR4_4_12a742a74lb90pem6.R.inc(106622);for (int i = 0; (((i < totalSample.length)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106623)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106624)==0&false)); i++) {{
            __CLR4_4_12a742a74lb90pem6.R.inc(106625);totalStats.addValue(totalSample[i]);
        }

        // Now compute subsample stats individually and aggregate
        }__CLR4_4_12a742a74lb90pem6.R.inc(106626);SummaryStatistics[] subSampleStats = new SummaryStatistics[5];
        __CLR4_4_12a742a74lb90pem6.R.inc(106627);for (int i = 0; (((i < 4)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106628)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106629)==0&false)); i++) {{
            __CLR4_4_12a742a74lb90pem6.R.inc(106630);subSampleStats[i] = new SummaryStatistics();
        }
        }__CLR4_4_12a742a74lb90pem6.R.inc(106631);Collection<SummaryStatistics> aggregate = new ArrayList<SummaryStatistics>();
        __CLR4_4_12a742a74lb90pem6.R.inc(106632);for (int i = 0; (((i < 4)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106633)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106634)==0&false)); i++) {{
            __CLR4_4_12a742a74lb90pem6.R.inc(106635);for (int j = 0; (((j < subSamples[i].length)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106636)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106637)==0&false)); j++) {{
                __CLR4_4_12a742a74lb90pem6.R.inc(106638);subSampleStats[i].addValue(subSamples[i][j]);
            }
            }__CLR4_4_12a742a74lb90pem6.R.inc(106639);aggregate.add(subSampleStats[i]);
        }

        // Compare values
        }__CLR4_4_12a742a74lb90pem6.R.inc(106640);StatisticalSummaryValues aggregatedStats = AggregateSummaryStatistics.aggregate(aggregate);
        __CLR4_4_12a742a74lb90pem6.R.inc(106641);assertEquals(totalStats.getSummary(), aggregatedStats, 10E-12);

    }finally{__CLR4_4_12a742a74lb90pem6.R.flushNeeded();}}

    /**
     * Verifies that a StatisticalSummary and a StatisticalSummaryValues are equal up
     * to delta, with NaNs, infinities returned in the same spots. For max, min, n, values
     * have to agree exactly, delta is used only for sum, mean, variance, std dev.
     */
    protected static void assertEquals(StatisticalSummary expected, StatisticalSummary observed, double delta) {try{__CLR4_4_12a742a74lb90pem6.R.inc(106642);
        __CLR4_4_12a742a74lb90pem6.R.inc(106643);TestUtils.assertEquals(expected.getMax(), observed.getMax(), 0);
        __CLR4_4_12a742a74lb90pem6.R.inc(106644);TestUtils.assertEquals(expected.getMin(), observed.getMin(), 0);
        __CLR4_4_12a742a74lb90pem6.R.inc(106645);Assert.assertEquals(expected.getN(), observed.getN());
        __CLR4_4_12a742a74lb90pem6.R.inc(106646);TestUtils.assertEquals(expected.getSum(), observed.getSum(), delta);
        __CLR4_4_12a742a74lb90pem6.R.inc(106647);TestUtils.assertEquals(expected.getMean(), observed.getMean(), delta);
        __CLR4_4_12a742a74lb90pem6.R.inc(106648);TestUtils.assertEquals(expected.getStandardDeviation(), observed.getStandardDeviation(), delta);
        __CLR4_4_12a742a74lb90pem6.R.inc(106649);TestUtils.assertEquals(expected.getVariance(), observed.getVariance(), delta);
    }finally{__CLR4_4_12a742a74lb90pem6.R.flushNeeded();}}


    /**
     * Generates a random sample of double values.
     * Sample size is random, between 10 and 100 and values are
     * uniformly distributed over [-100, 100].
     *
     * @return array of random double values
     */
    private double[] generateSample() {try{__CLR4_4_12a742a74lb90pem6.R.inc(106650);
        __CLR4_4_12a742a74lb90pem6.R.inc(106651);final IntegerDistribution size = new UniformIntegerDistribution(10, 100);
        __CLR4_4_12a742a74lb90pem6.R.inc(106652);final RealDistribution randomData = new UniformRealDistribution(-100, 100);
        __CLR4_4_12a742a74lb90pem6.R.inc(106653);final int sampleSize = size.sample();
        __CLR4_4_12a742a74lb90pem6.R.inc(106654);final double[] out = randomData.sample(sampleSize);
        __CLR4_4_12a742a74lb90pem6.R.inc(106655);return out;
    }finally{__CLR4_4_12a742a74lb90pem6.R.flushNeeded();}}

    /**
     * Generates a partition of <sample> into up to 5 sequentially selected
     * subsamples with randomly selected partition points.
     *
     * @param sample array to partition
     * @return rectangular array with rows = subsamples
     */
    private double[][] generatePartition(double[] sample) {try{__CLR4_4_12a742a74lb90pem6.R.inc(106656);
        __CLR4_4_12a742a74lb90pem6.R.inc(106657);final int length = sample.length;
        __CLR4_4_12a742a74lb90pem6.R.inc(106658);final double[][] out = new double[5][];
        __CLR4_4_12a742a74lb90pem6.R.inc(106659);int cur = 0;          // beginning of current partition segment
        __CLR4_4_12a742a74lb90pem6.R.inc(106660);int offset = 0;       // end of current partition segment
        __CLR4_4_12a742a74lb90pem6.R.inc(106661);int sampleCount = 0;  // number of segments defined 
        __CLR4_4_12a742a74lb90pem6.R.inc(106662);for (int i = 0; (((i < 5)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106663)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106664)==0&false)); i++) {{
            __CLR4_4_12a742a74lb90pem6.R.inc(106665);if ((((cur == length || offset == length)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106666)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106667)==0&false))) {{
                __CLR4_4_12a742a74lb90pem6.R.inc(106668);break;
            }
            }__CLR4_4_12a742a74lb90pem6.R.inc(106669);final int next;
            __CLR4_4_12a742a74lb90pem6.R.inc(106670);if ((((i == 4 || cur == length - 1)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106671)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106672)==0&false))) {{
                __CLR4_4_12a742a74lb90pem6.R.inc(106673);next = length - 1;
            } }else {{
                __CLR4_4_12a742a74lb90pem6.R.inc(106674);next = (new UniformIntegerDistribution(cur, length - 1)).sample();
            }
            }__CLR4_4_12a742a74lb90pem6.R.inc(106675);final int subLength = next - cur + 1;
            __CLR4_4_12a742a74lb90pem6.R.inc(106676);out[i] = new double[subLength];
            __CLR4_4_12a742a74lb90pem6.R.inc(106677);System.arraycopy(sample, offset, out[i], 0, subLength);
            __CLR4_4_12a742a74lb90pem6.R.inc(106678);cur = next + 1;
            __CLR4_4_12a742a74lb90pem6.R.inc(106679);sampleCount++;
            __CLR4_4_12a742a74lb90pem6.R.inc(106680);offset += subLength;
        }
        }__CLR4_4_12a742a74lb90pem6.R.inc(106681);if ((((sampleCount < 5)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106682)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106683)==0&false))) {{
            __CLR4_4_12a742a74lb90pem6.R.inc(106684);double[][] out2 = new double[sampleCount][];
            __CLR4_4_12a742a74lb90pem6.R.inc(106685);for (int j = 0; (((j < sampleCount)&&(__CLR4_4_12a742a74lb90pem6.R.iget(106686)!=0|true))||(__CLR4_4_12a742a74lb90pem6.R.iget(106687)==0&false)); j++) {{
                __CLR4_4_12a742a74lb90pem6.R.inc(106688);final int curSize = out[j].length;
                __CLR4_4_12a742a74lb90pem6.R.inc(106689);out2[j] = new double[curSize];
                __CLR4_4_12a742a74lb90pem6.R.inc(106690);System.arraycopy(out[j], 0, out2[j], 0, curSize);
            }
            }__CLR4_4_12a742a74lb90pem6.R.inc(106691);return out2;
        } }else {{
            __CLR4_4_12a742a74lb90pem6.R.inc(106692);return out;
        }
    }}finally{__CLR4_4_12a742a74lb90pem6.R.flushNeeded();}}

}
