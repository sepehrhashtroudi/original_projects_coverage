/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.apache.commons.math3.stat.descriptive;

import java.util.Locale;


import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.stat.descriptive.rank.Percentile;
import org.apache.commons.math3.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the DescriptiveStatistics class.
 *
 * @version $Id$
 *          2007) $
 */
public class DescriptiveStatisticsTest {static class __CLR4_4_12abp2abplb90pemi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,106887,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected DescriptiveStatistics createDescriptiveStatistics() {try{__CLR4_4_12abp2abplb90pemi.R.inc(106693);
        __CLR4_4_12abp2abplb90pemi.R.inc(106694);return new DescriptiveStatistics();
    }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}

    @Test
    public void testSetterInjection() {__CLR4_4_12abp2abplb90pemi.R.globalSliceStart(getClass().getName(),106695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vpyral2abr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12abp2abplb90pemi.R.rethrow($CLV_t2$);}finally{__CLR4_4_12abp2abplb90pemi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest.testSetterInjection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vpyral2abr(){try{__CLR4_4_12abp2abplb90pemi.R.inc(106695);
        __CLR4_4_12abp2abplb90pemi.R.inc(106696);DescriptiveStatistics stats = createDescriptiveStatistics();
        __CLR4_4_12abp2abplb90pemi.R.inc(106697);stats.addValue(1);
        __CLR4_4_12abp2abplb90pemi.R.inc(106698);stats.addValue(3);
        __CLR4_4_12abp2abplb90pemi.R.inc(106699);Assert.assertEquals(2, stats.getMean(), 1E-10);
        // Now lets try some new math
        __CLR4_4_12abp2abplb90pemi.R.inc(106700);stats.setMeanImpl(new deepMean());
        __CLR4_4_12abp2abplb90pemi.R.inc(106701);Assert.assertEquals(42, stats.getMean(), 1E-10);
    }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}

    @Test
    public void testCopy() {__CLR4_4_12abp2abplb90pemi.R.globalSliceStart(getClass().getName(),106702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukax6a2aby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12abp2abplb90pemi.R.rethrow($CLV_t2$);}finally{__CLR4_4_12abp2abplb90pemi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest.testCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukax6a2aby(){try{__CLR4_4_12abp2abplb90pemi.R.inc(106702);
        __CLR4_4_12abp2abplb90pemi.R.inc(106703);DescriptiveStatistics stats = createDescriptiveStatistics();
        __CLR4_4_12abp2abplb90pemi.R.inc(106704);stats.addValue(1);
        __CLR4_4_12abp2abplb90pemi.R.inc(106705);stats.addValue(3);
        __CLR4_4_12abp2abplb90pemi.R.inc(106706);DescriptiveStatistics copy = new DescriptiveStatistics(stats);
        __CLR4_4_12abp2abplb90pemi.R.inc(106707);Assert.assertEquals(2, copy.getMean(), 1E-10);
        // Now lets try some new math
        __CLR4_4_12abp2abplb90pemi.R.inc(106708);stats.setMeanImpl(new deepMean());
        __CLR4_4_12abp2abplb90pemi.R.inc(106709);copy = stats.copy();
        __CLR4_4_12abp2abplb90pemi.R.inc(106710);Assert.assertEquals(42, copy.getMean(), 1E-10);
    }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}

    @Test
    public void testWindowSize() {__CLR4_4_12abp2abplb90pemi.R.globalSliceStart(getClass().getName(),106711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbl7862ac7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12abp2abplb90pemi.R.rethrow($CLV_t2$);}finally{__CLR4_4_12abp2abplb90pemi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest.testWindowSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbl7862ac7(){try{__CLR4_4_12abp2abplb90pemi.R.inc(106711);
        __CLR4_4_12abp2abplb90pemi.R.inc(106712);DescriptiveStatistics stats = createDescriptiveStatistics();
        __CLR4_4_12abp2abplb90pemi.R.inc(106713);stats.setWindowSize(300);
        __CLR4_4_12abp2abplb90pemi.R.inc(106714);for (int i = 0; (((i < 100)&&(__CLR4_4_12abp2abplb90pemi.R.iget(106715)!=0|true))||(__CLR4_4_12abp2abplb90pemi.R.iget(106716)==0&false)); ++i) {{
            __CLR4_4_12abp2abplb90pemi.R.inc(106717);stats.addValue(i + 1);
        }
        }__CLR4_4_12abp2abplb90pemi.R.inc(106718);int refSum = (100 * 101) / 2;
        __CLR4_4_12abp2abplb90pemi.R.inc(106719);Assert.assertEquals(refSum / 100.0, stats.getMean(), 1E-10);
        __CLR4_4_12abp2abplb90pemi.R.inc(106720);Assert.assertEquals(300, stats.getWindowSize());
        __CLR4_4_12abp2abplb90pemi.R.inc(106721);try {
            __CLR4_4_12abp2abplb90pemi.R.inc(106722);stats.setWindowSize(-3);
            __CLR4_4_12abp2abplb90pemi.R.inc(106723);Assert.fail("an exception should have been thrown");
        } catch (IllegalArgumentException iae) {
            // expected
        }
        __CLR4_4_12abp2abplb90pemi.R.inc(106724);Assert.assertEquals(300, stats.getWindowSize());
        __CLR4_4_12abp2abplb90pemi.R.inc(106725);stats.setWindowSize(50);
        __CLR4_4_12abp2abplb90pemi.R.inc(106726);Assert.assertEquals(50, stats.getWindowSize());
        __CLR4_4_12abp2abplb90pemi.R.inc(106727);int refSum2 = refSum - (50 * 51) / 2;
        __CLR4_4_12abp2abplb90pemi.R.inc(106728);Assert.assertEquals(refSum2 / 50.0, stats.getMean(), 1E-10);
    }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}

    @Test
    public void testGetValues() {__CLR4_4_12abp2abplb90pemi.R.globalSliceStart(getClass().getName(),106729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduel2acp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12abp2abplb90pemi.R.rethrow($CLV_t2$);}finally{__CLR4_4_12abp2abplb90pemi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduel2acp(){try{__CLR4_4_12abp2abplb90pemi.R.inc(106729);
        __CLR4_4_12abp2abplb90pemi.R.inc(106730);DescriptiveStatistics stats = createDescriptiveStatistics();
        __CLR4_4_12abp2abplb90pemi.R.inc(106731);for (int i = 100; (((i > 0)&&(__CLR4_4_12abp2abplb90pemi.R.iget(106732)!=0|true))||(__CLR4_4_12abp2abplb90pemi.R.iget(106733)==0&false)); --i) {{
            __CLR4_4_12abp2abplb90pemi.R.inc(106734);stats.addValue(i);
        }
        }__CLR4_4_12abp2abplb90pemi.R.inc(106735);int refSum = (100 * 101) / 2;
        __CLR4_4_12abp2abplb90pemi.R.inc(106736);Assert.assertEquals(refSum / 100.0, stats.getMean(), 1E-10);
        __CLR4_4_12abp2abplb90pemi.R.inc(106737);double[] v = stats.getValues();
        __CLR4_4_12abp2abplb90pemi.R.inc(106738);for (int i = 0; (((i < v.length)&&(__CLR4_4_12abp2abplb90pemi.R.iget(106739)!=0|true))||(__CLR4_4_12abp2abplb90pemi.R.iget(106740)==0&false)); ++i) {{
            __CLR4_4_12abp2abplb90pemi.R.inc(106741);Assert.assertEquals(100.0 - i, v[i], 1.0e-10);
        }
        }__CLR4_4_12abp2abplb90pemi.R.inc(106742);double[] s = stats.getSortedValues();
        __CLR4_4_12abp2abplb90pemi.R.inc(106743);for (int i = 0; (((i < s.length)&&(__CLR4_4_12abp2abplb90pemi.R.iget(106744)!=0|true))||(__CLR4_4_12abp2abplb90pemi.R.iget(106745)==0&false)); ++i) {{
            __CLR4_4_12abp2abplb90pemi.R.inc(106746);Assert.assertEquals(i + 1.0, s[i], 1.0e-10);
        }
        }__CLR4_4_12abp2abplb90pemi.R.inc(106747);Assert.assertEquals(12.0, stats.getElement(88), 1.0e-10);
    }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_12abp2abplb90pemi.R.globalSliceStart(getClass().getName(),106748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid2ad8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12abp2abplb90pemi.R.rethrow($CLV_t2$);}finally{__CLR4_4_12abp2abplb90pemi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid2ad8(){try{__CLR4_4_12abp2abplb90pemi.R.inc(106748);
        __CLR4_4_12abp2abplb90pemi.R.inc(106749);DescriptiveStatistics stats = createDescriptiveStatistics();
        __CLR4_4_12abp2abplb90pemi.R.inc(106750);stats.addValue(1);
        __CLR4_4_12abp2abplb90pemi.R.inc(106751);stats.addValue(2);
        __CLR4_4_12abp2abplb90pemi.R.inc(106752);stats.addValue(3);
        __CLR4_4_12abp2abplb90pemi.R.inc(106753);Locale d = Locale.getDefault();
        __CLR4_4_12abp2abplb90pemi.R.inc(106754);Locale.setDefault(Locale.US);
        __CLR4_4_12abp2abplb90pemi.R.inc(106755);Assert.assertEquals("DescriptiveStatistics:\n" +
                     "n: 3\n" +
                     "min: 1.0\n" +
                     "max: 3.0\n" +
                     "mean: 2.0\n" +
                     "std dev: 1.0\n" +
                     "median: 2.0\n" +
                     "skewness: 0.0\n" +
                     "kurtosis: NaN\n",  stats.toString());
        __CLR4_4_12abp2abplb90pemi.R.inc(106756);Locale.setDefault(d);
    }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}

    @Test
    public void testShuffledStatistics() {__CLR4_4_12abp2abplb90pemi.R.globalSliceStart(getClass().getName(),106757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8oebr2adh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12abp2abplb90pemi.R.rethrow($CLV_t2$);}finally{__CLR4_4_12abp2abplb90pemi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest.testShuffledStatistics",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8oebr2adh(){try{__CLR4_4_12abp2abplb90pemi.R.inc(106757);
        // the purpose of this test is only to check the get/set methods
        // we are aware shuffling statistics like this is really not
        // something sensible to do in production ...
        __CLR4_4_12abp2abplb90pemi.R.inc(106758);DescriptiveStatistics reference = createDescriptiveStatistics();
        __CLR4_4_12abp2abplb90pemi.R.inc(106759);DescriptiveStatistics shuffled  = createDescriptiveStatistics();

        __CLR4_4_12abp2abplb90pemi.R.inc(106760);UnivariateStatistic tmp = shuffled.getGeometricMeanImpl();
        __CLR4_4_12abp2abplb90pemi.R.inc(106761);shuffled.setGeometricMeanImpl(shuffled.getMeanImpl());
        __CLR4_4_12abp2abplb90pemi.R.inc(106762);shuffled.setMeanImpl(shuffled.getKurtosisImpl());
        __CLR4_4_12abp2abplb90pemi.R.inc(106763);shuffled.setKurtosisImpl(shuffled.getSkewnessImpl());
        __CLR4_4_12abp2abplb90pemi.R.inc(106764);shuffled.setSkewnessImpl(shuffled.getVarianceImpl());
        __CLR4_4_12abp2abplb90pemi.R.inc(106765);shuffled.setVarianceImpl(shuffled.getMaxImpl());
        __CLR4_4_12abp2abplb90pemi.R.inc(106766);shuffled.setMaxImpl(shuffled.getMinImpl());
        __CLR4_4_12abp2abplb90pemi.R.inc(106767);shuffled.setMinImpl(shuffled.getSumImpl());
        __CLR4_4_12abp2abplb90pemi.R.inc(106768);shuffled.setSumImpl(shuffled.getSumsqImpl());
        __CLR4_4_12abp2abplb90pemi.R.inc(106769);shuffled.setSumsqImpl(tmp);

        __CLR4_4_12abp2abplb90pemi.R.inc(106770);for (int i = 100; (((i > 0)&&(__CLR4_4_12abp2abplb90pemi.R.iget(106771)!=0|true))||(__CLR4_4_12abp2abplb90pemi.R.iget(106772)==0&false)); --i) {{
            __CLR4_4_12abp2abplb90pemi.R.inc(106773);reference.addValue(i);
            __CLR4_4_12abp2abplb90pemi.R.inc(106774);shuffled.addValue(i);
        }

        }__CLR4_4_12abp2abplb90pemi.R.inc(106775);Assert.assertEquals(reference.getMean(),          shuffled.getGeometricMean(), 1.0e-10);
        __CLR4_4_12abp2abplb90pemi.R.inc(106776);Assert.assertEquals(reference.getKurtosis(),      shuffled.getMean(),          1.0e-10);
        __CLR4_4_12abp2abplb90pemi.R.inc(106777);Assert.assertEquals(reference.getSkewness(),      shuffled.getKurtosis(), 1.0e-10);
        __CLR4_4_12abp2abplb90pemi.R.inc(106778);Assert.assertEquals(reference.getVariance(),      shuffled.getSkewness(), 1.0e-10);
        __CLR4_4_12abp2abplb90pemi.R.inc(106779);Assert.assertEquals(reference.getMax(),           shuffled.getVariance(), 1.0e-10);
        __CLR4_4_12abp2abplb90pemi.R.inc(106780);Assert.assertEquals(reference.getMin(),           shuffled.getMax(), 1.0e-10);
        __CLR4_4_12abp2abplb90pemi.R.inc(106781);Assert.assertEquals(reference.getSum(),           shuffled.getMin(), 1.0e-10);
        __CLR4_4_12abp2abplb90pemi.R.inc(106782);Assert.assertEquals(reference.getSumsq(),         shuffled.getSum(), 1.0e-10);
        __CLR4_4_12abp2abplb90pemi.R.inc(106783);Assert.assertEquals(reference.getGeometricMean(), shuffled.getSumsq(), 1.0e-10);

    }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}

    @Test
    public void testPercentileSetter() {__CLR4_4_12abp2abplb90pemi.R.globalSliceStart(getClass().getName(),106784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1stgz852ae8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12abp2abplb90pemi.R.rethrow($CLV_t2$);}finally{__CLR4_4_12abp2abplb90pemi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest.testPercentileSetter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1stgz852ae8(){try{__CLR4_4_12abp2abplb90pemi.R.inc(106784);
        __CLR4_4_12abp2abplb90pemi.R.inc(106785);DescriptiveStatistics stats = createDescriptiveStatistics();
        __CLR4_4_12abp2abplb90pemi.R.inc(106786);stats.addValue(1);
        __CLR4_4_12abp2abplb90pemi.R.inc(106787);stats.addValue(2);
        __CLR4_4_12abp2abplb90pemi.R.inc(106788);stats.addValue(3);
        __CLR4_4_12abp2abplb90pemi.R.inc(106789);Assert.assertEquals(2, stats.getPercentile(50.0), 1E-10);

        // Inject wrapped Percentile impl
        __CLR4_4_12abp2abplb90pemi.R.inc(106790);stats.setPercentileImpl(new goodPercentile());
        __CLR4_4_12abp2abplb90pemi.R.inc(106791);Assert.assertEquals(2, stats.getPercentile(50.0), 1E-10);

        // Try "new math" impl
        __CLR4_4_12abp2abplb90pemi.R.inc(106792);stats.setPercentileImpl(new subPercentile());
        __CLR4_4_12abp2abplb90pemi.R.inc(106793);Assert.assertEquals(10.0, stats.getPercentile(10.0), 1E-10);

        // Try to set bad impl
        __CLR4_4_12abp2abplb90pemi.R.inc(106794);try {
            __CLR4_4_12abp2abplb90pemi.R.inc(106795);stats.setPercentileImpl(new badPercentile());
            __CLR4_4_12abp2abplb90pemi.R.inc(106796);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}

    @Test
    public void test20090720() {__CLR4_4_12abp2abplb90pemi.R.globalSliceStart(getClass().getName(),106797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgdc6d2ael();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12abp2abplb90pemi.R.rethrow($CLV_t2$);}finally{__CLR4_4_12abp2abplb90pemi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest.test20090720",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgdc6d2ael(){try{__CLR4_4_12abp2abplb90pemi.R.inc(106797);
        __CLR4_4_12abp2abplb90pemi.R.inc(106798);DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(100);
        __CLR4_4_12abp2abplb90pemi.R.inc(106799);for (int i = 0; (((i < 161)&&(__CLR4_4_12abp2abplb90pemi.R.iget(106800)!=0|true))||(__CLR4_4_12abp2abplb90pemi.R.iget(106801)==0&false)); i++) {{
            __CLR4_4_12abp2abplb90pemi.R.inc(106802);descriptiveStatistics.addValue(1.2);
        }
        }__CLR4_4_12abp2abplb90pemi.R.inc(106803);descriptiveStatistics.clear();
        __CLR4_4_12abp2abplb90pemi.R.inc(106804);descriptiveStatistics.addValue(1.2);
        __CLR4_4_12abp2abplb90pemi.R.inc(106805);Assert.assertEquals(1, descriptiveStatistics.getN());
    }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}

    @Test
    public void testRemoval() {__CLR4_4_12abp2abplb90pemi.R.globalSliceStart(getClass().getName(),106806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15frvnj2aeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12abp2abplb90pemi.R.rethrow($CLV_t2$);}finally{__CLR4_4_12abp2abplb90pemi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest.testRemoval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15frvnj2aeu(){try{__CLR4_4_12abp2abplb90pemi.R.inc(106806);

        __CLR4_4_12abp2abplb90pemi.R.inc(106807);final DescriptiveStatistics dstat = createDescriptiveStatistics();

        __CLR4_4_12abp2abplb90pemi.R.inc(106808);checkremoval(dstat, 1, 6.0, 0.0, Double.NaN);
        __CLR4_4_12abp2abplb90pemi.R.inc(106809);checkremoval(dstat, 3, 5.0, 3.0, 4.5);
        __CLR4_4_12abp2abplb90pemi.R.inc(106810);checkremoval(dstat, 6, 3.5, 2.5, 3.0);
        __CLR4_4_12abp2abplb90pemi.R.inc(106811);checkremoval(dstat, 9, 3.5, 2.5, 3.0);
        __CLR4_4_12abp2abplb90pemi.R.inc(106812);checkremoval(dstat, DescriptiveStatistics.INFINITE_WINDOW, 3.5, 2.5, 3.0);

    }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}
    
    @Test
    public void testSummaryConsistency() {__CLR4_4_12abp2abplb90pemi.R.globalSliceStart(getClass().getName(),106813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rljvjp2af1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12abp2abplb90pemi.R.rethrow($CLV_t2$);}finally{__CLR4_4_12abp2abplb90pemi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest.testSummaryConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rljvjp2af1(){try{__CLR4_4_12abp2abplb90pemi.R.inc(106813);
        __CLR4_4_12abp2abplb90pemi.R.inc(106814);final DescriptiveStatistics dstats = new DescriptiveStatistics();
        __CLR4_4_12abp2abplb90pemi.R.inc(106815);final SummaryStatistics sstats = new SummaryStatistics();
        __CLR4_4_12abp2abplb90pemi.R.inc(106816);final int windowSize = 5;
        __CLR4_4_12abp2abplb90pemi.R.inc(106817);dstats.setWindowSize(windowSize);
        __CLR4_4_12abp2abplb90pemi.R.inc(106818);final double tol = 1E-12;
        __CLR4_4_12abp2abplb90pemi.R.inc(106819);for (int i = 0; (((i < 20)&&(__CLR4_4_12abp2abplb90pemi.R.iget(106820)!=0|true))||(__CLR4_4_12abp2abplb90pemi.R.iget(106821)==0&false)); i++) {{
            __CLR4_4_12abp2abplb90pemi.R.inc(106822);dstats.addValue(i);
            __CLR4_4_12abp2abplb90pemi.R.inc(106823);sstats.clear();
            __CLR4_4_12abp2abplb90pemi.R.inc(106824);double[] values = dstats.getValues();
            __CLR4_4_12abp2abplb90pemi.R.inc(106825);for (int j = 0; (((j < values.length)&&(__CLR4_4_12abp2abplb90pemi.R.iget(106826)!=0|true))||(__CLR4_4_12abp2abplb90pemi.R.iget(106827)==0&false)); j++) {{
                __CLR4_4_12abp2abplb90pemi.R.inc(106828);sstats.addValue(values[j]);
            }
            }__CLR4_4_12abp2abplb90pemi.R.inc(106829);TestUtils.assertEquals(dstats.getMean(), sstats.getMean(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106830);TestUtils.assertEquals(new Mean().evaluate(values), dstats.getMean(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106831);TestUtils.assertEquals(dstats.getMax(), sstats.getMax(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106832);TestUtils.assertEquals(new Max().evaluate(values), dstats.getMax(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106833);TestUtils.assertEquals(dstats.getGeometricMean(), sstats.getGeometricMean(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106834);TestUtils.assertEquals(new GeometricMean().evaluate(values), dstats.getGeometricMean(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106835);TestUtils.assertEquals(dstats.getMin(), sstats.getMin(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106836);TestUtils.assertEquals(new Min().evaluate(values), dstats.getMin(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106837);TestUtils.assertEquals(dstats.getStandardDeviation(), sstats.getStandardDeviation(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106838);TestUtils.assertEquals(dstats.getVariance(), sstats.getVariance(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106839);TestUtils.assertEquals(new Variance().evaluate(values), dstats.getVariance(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106840);TestUtils.assertEquals(dstats.getSum(), sstats.getSum(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106841);TestUtils.assertEquals(new Sum().evaluate(values), dstats.getSum(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106842);TestUtils.assertEquals(dstats.getSumsq(), sstats.getSumsq(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106843);TestUtils.assertEquals(new SumOfSquares().evaluate(values), dstats.getSumsq(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106844);TestUtils.assertEquals(dstats.getPopulationVariance(), sstats.getPopulationVariance(), tol);
            __CLR4_4_12abp2abplb90pemi.R.inc(106845);TestUtils.assertEquals(new Variance(false).evaluate(values), dstats.getPopulationVariance(), tol);
        }
    }}finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}

    public void checkremoval(DescriptiveStatistics dstat, int wsize,
                             double mean1, double mean2, double mean3) {try{__CLR4_4_12abp2abplb90pemi.R.inc(106846);

        __CLR4_4_12abp2abplb90pemi.R.inc(106847);dstat.setWindowSize(wsize);
        __CLR4_4_12abp2abplb90pemi.R.inc(106848);dstat.clear();

        __CLR4_4_12abp2abplb90pemi.R.inc(106849);for (int i = 1 ; (((i <= 6 )&&(__CLR4_4_12abp2abplb90pemi.R.iget(106850)!=0|true))||(__CLR4_4_12abp2abplb90pemi.R.iget(106851)==0&false)); ++i) {{
            __CLR4_4_12abp2abplb90pemi.R.inc(106852);dstat.addValue(i);
        }

        }__CLR4_4_12abp2abplb90pemi.R.inc(106853);Assert.assertTrue(Precision.equalsIncludingNaN(mean1, dstat.getMean()));
        __CLR4_4_12abp2abplb90pemi.R.inc(106854);dstat.replaceMostRecentValue(0);
        __CLR4_4_12abp2abplb90pemi.R.inc(106855);Assert.assertTrue(Precision.equalsIncludingNaN(mean2, dstat.getMean()));
        __CLR4_4_12abp2abplb90pemi.R.inc(106856);dstat.removeMostRecentValue();
        __CLR4_4_12abp2abplb90pemi.R.inc(106857);Assert.assertTrue(Precision.equalsIncludingNaN(mean3, dstat.getMean()));

    }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}

    // Test UnivariateStatistics impls for setter injection tests

    /**
     * A new way to compute the mean
     */
    static class deepMean implements UnivariateStatistic {

        public double evaluate(double[] values, int begin, int length) {try{__CLR4_4_12abp2abplb90pemi.R.inc(106858);
            __CLR4_4_12abp2abplb90pemi.R.inc(106859);return 42;
        }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}

        public double evaluate(double[] values) {try{__CLR4_4_12abp2abplb90pemi.R.inc(106860);
            __CLR4_4_12abp2abplb90pemi.R.inc(106861);return 42;
        }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}
        public UnivariateStatistic copy() {try{__CLR4_4_12abp2abplb90pemi.R.inc(106862);
            __CLR4_4_12abp2abplb90pemi.R.inc(106863);return new deepMean();
        }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}
    }

    /**
     * Test percentile implementation - wraps a Percentile
     */
    static class goodPercentile implements UnivariateStatistic {
        private Percentile percentile = new Percentile();
        public void setQuantile(double quantile) {try{__CLR4_4_12abp2abplb90pemi.R.inc(106864);
            __CLR4_4_12abp2abplb90pemi.R.inc(106865);percentile.setQuantile(quantile);
        }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}
        public double evaluate(double[] values, int begin, int length) {try{__CLR4_4_12abp2abplb90pemi.R.inc(106866);
            __CLR4_4_12abp2abplb90pemi.R.inc(106867);return percentile.evaluate(values, begin, length);
        }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}
        public double evaluate(double[] values) {try{__CLR4_4_12abp2abplb90pemi.R.inc(106868);
            __CLR4_4_12abp2abplb90pemi.R.inc(106869);return percentile.evaluate(values);
        }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}
        public UnivariateStatistic copy() {try{__CLR4_4_12abp2abplb90pemi.R.inc(106870);
            __CLR4_4_12abp2abplb90pemi.R.inc(106871);goodPercentile result = new goodPercentile();
            __CLR4_4_12abp2abplb90pemi.R.inc(106872);result.setQuantile(percentile.getQuantile());
            __CLR4_4_12abp2abplb90pemi.R.inc(106873);return result;
        }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}
    }

    /**
     * Test percentile subclass - another "new math" impl
     * Always returns currently set quantile
     */
    static class subPercentile extends Percentile {
        @Override
        public double evaluate(double[] values, int begin, int length) {try{__CLR4_4_12abp2abplb90pemi.R.inc(106874);
            __CLR4_4_12abp2abplb90pemi.R.inc(106875);return getQuantile();
        }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}
        @Override
        public double evaluate(double[] values) {try{__CLR4_4_12abp2abplb90pemi.R.inc(106876);
            __CLR4_4_12abp2abplb90pemi.R.inc(106877);return getQuantile();
        }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}
        private static final long serialVersionUID = 8040701391045914979L;
        @Override
        public Percentile copy() {try{__CLR4_4_12abp2abplb90pemi.R.inc(106878);
            __CLR4_4_12abp2abplb90pemi.R.inc(106879);subPercentile result = new subPercentile();
            __CLR4_4_12abp2abplb90pemi.R.inc(106880);return result;
        }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}
    }

    /**
     * "Bad" test percentile implementation - no setQuantile
     */
    static class badPercentile implements UnivariateStatistic {
        private Percentile percentile = new Percentile();
        public double evaluate(double[] values, int begin, int length) {try{__CLR4_4_12abp2abplb90pemi.R.inc(106881);
            __CLR4_4_12abp2abplb90pemi.R.inc(106882);return percentile.evaluate(values, begin, length);
        }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}
        public double evaluate(double[] values) {try{__CLR4_4_12abp2abplb90pemi.R.inc(106883);
            __CLR4_4_12abp2abplb90pemi.R.inc(106884);return percentile.evaluate(values);
        }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}
        public UnivariateStatistic copy() {try{__CLR4_4_12abp2abplb90pemi.R.inc(106885);
            __CLR4_4_12abp2abplb90pemi.R.inc(106886);return new badPercentile();
        }finally{__CLR4_4_12abp2abplb90pemi.R.flushNeeded();}}
    }

}
