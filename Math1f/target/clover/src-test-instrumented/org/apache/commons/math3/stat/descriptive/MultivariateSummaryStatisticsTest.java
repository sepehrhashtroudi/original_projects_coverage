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


import java.util.Locale;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.util.FastMath;

import org.junit.Test;
import org.junit.Assert;

/**
 * Test cases for the {@link MultivariateSummaryStatistics} class.
 *
 * @version $Id$
 */

public class MultivariateSummaryStatisticsTest {static class __CLR4_4_12an72an7lb90pen4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,107287,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected MultivariateSummaryStatistics createMultivariateSummaryStatistics(int k, boolean isCovarianceBiasCorrected) {try{__CLR4_4_12an72an7lb90pen4.R.inc(107107);
        __CLR4_4_12an72an7lb90pen4.R.inc(107108);return new MultivariateSummaryStatistics(k, isCovarianceBiasCorrected);
    }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}

    @Test
    public void testSetterInjection() {__CLR4_4_12an72an7lb90pen4.R.globalSliceStart(getClass().getName(),107109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vpyral2an9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12an72an7lb90pen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12an72an7lb90pen4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest.testSetterInjection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vpyral2an9(){try{__CLR4_4_12an72an7lb90pen4.R.inc(107109);
        __CLR4_4_12an72an7lb90pen4.R.inc(107110);MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(2, true);
        __CLR4_4_12an72an7lb90pen4.R.inc(107111);u.setMeanImpl(new StorelessUnivariateStatistic[] {
                        new sumMean(), new sumMean()
                      });
        __CLR4_4_12an72an7lb90pen4.R.inc(107112);u.addValue(new double[] { 1, 2 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107113);u.addValue(new double[] { 3, 4 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107114);Assert.assertEquals(4, u.getMean()[0], 1E-14);
        __CLR4_4_12an72an7lb90pen4.R.inc(107115);Assert.assertEquals(6, u.getMean()[1], 1E-14);
        __CLR4_4_12an72an7lb90pen4.R.inc(107116);u.clear();
        __CLR4_4_12an72an7lb90pen4.R.inc(107117);u.addValue(new double[] { 1, 2 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107118);u.addValue(new double[] { 3, 4 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107119);Assert.assertEquals(4, u.getMean()[0], 1E-14);
        __CLR4_4_12an72an7lb90pen4.R.inc(107120);Assert.assertEquals(6, u.getMean()[1], 1E-14);
        __CLR4_4_12an72an7lb90pen4.R.inc(107121);u.clear();
        __CLR4_4_12an72an7lb90pen4.R.inc(107122);u.setMeanImpl(new StorelessUnivariateStatistic[] {
                        new Mean(), new Mean()
                      }); // OK after clear
        __CLR4_4_12an72an7lb90pen4.R.inc(107123);u.addValue(new double[] { 1, 2 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107124);u.addValue(new double[] { 3, 4 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107125);Assert.assertEquals(2, u.getMean()[0], 1E-14);
        __CLR4_4_12an72an7lb90pen4.R.inc(107126);Assert.assertEquals(3, u.getMean()[1], 1E-14);
        __CLR4_4_12an72an7lb90pen4.R.inc(107127);Assert.assertEquals(2, u.getDimension());
    }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}

    @Test
    public void testSetterIllegalState() {__CLR4_4_12an72an7lb90pen4.R.globalSliceStart(getClass().getName(),107128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwcmr12ans();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12an72an7lb90pen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12an72an7lb90pen4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest.testSetterIllegalState",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwcmr12ans(){try{__CLR4_4_12an72an7lb90pen4.R.inc(107128);
        __CLR4_4_12an72an7lb90pen4.R.inc(107129);MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(2, true);
        __CLR4_4_12an72an7lb90pen4.R.inc(107130);u.addValue(new double[] { 1, 2 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107131);u.addValue(new double[] { 3, 4 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107132);try {
            __CLR4_4_12an72an7lb90pen4.R.inc(107133);u.setMeanImpl(new StorelessUnivariateStatistic[] {
                            new sumMean(), new sumMean()
                          });
            __CLR4_4_12an72an7lb90pen4.R.inc(107134);Assert.fail("Expecting IllegalStateException");
        } catch (IllegalStateException ex) {
            // expected
        }
    }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_12an72an7lb90pen4.R.globalSliceStart(getClass().getName(),107135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid2anz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12an72an7lb90pen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12an72an7lb90pen4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid2anz(){try{__CLR4_4_12an72an7lb90pen4.R.inc(107135);
        __CLR4_4_12an72an7lb90pen4.R.inc(107136);MultivariateSummaryStatistics stats = createMultivariateSummaryStatistics(2, true);
        __CLR4_4_12an72an7lb90pen4.R.inc(107137);stats.addValue(new double[] {1, 3});
        __CLR4_4_12an72an7lb90pen4.R.inc(107138);stats.addValue(new double[] {2, 2});
        __CLR4_4_12an72an7lb90pen4.R.inc(107139);stats.addValue(new double[] {3, 1});
        __CLR4_4_12an72an7lb90pen4.R.inc(107140);Locale d = Locale.getDefault();
        __CLR4_4_12an72an7lb90pen4.R.inc(107141);Locale.setDefault(Locale.US);
        __CLR4_4_12an72an7lb90pen4.R.inc(107142);final String suffix = System.getProperty("line.separator");
        __CLR4_4_12an72an7lb90pen4.R.inc(107143);Assert.assertEquals("MultivariateSummaryStatistics:" + suffix+
                     "n: 3" +suffix+
                     "min: 1.0, 1.0" +suffix+
                     "max: 3.0, 3.0" +suffix+
                     "mean: 2.0, 2.0" +suffix+
                     "geometric mean: 1.817..., 1.817..." +suffix+
                     "sum of squares: 14.0, 14.0" +suffix+
                     "sum of logarithms: 1.791..., 1.791..." +suffix+
                     "standard deviation: 1.0, 1.0" +suffix+
                     "covariance: Array2DRowRealMatrix{{1.0,-1.0},{-1.0,1.0}}" +suffix,
                     stats.toString().replaceAll("([0-9]+\\.[0-9][0-9][0-9])[0-9]+", "$1..."));
        __CLR4_4_12an72an7lb90pen4.R.inc(107144);Locale.setDefault(d);
    }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}

    @Test
    public void testShuffledStatistics() {__CLR4_4_12an72an7lb90pen4.R.globalSliceStart(getClass().getName(),107145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8oebr2ao9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12an72an7lb90pen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12an72an7lb90pen4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest.testShuffledStatistics",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8oebr2ao9(){try{__CLR4_4_12an72an7lb90pen4.R.inc(107145);
        // the purpose of this test is only to check the get/set methods
        // we are aware shuffling statistics like this is really not
        // something sensible to do in production ...
        __CLR4_4_12an72an7lb90pen4.R.inc(107146);MultivariateSummaryStatistics reference = createMultivariateSummaryStatistics(2, true);
        __CLR4_4_12an72an7lb90pen4.R.inc(107147);MultivariateSummaryStatistics shuffled  = createMultivariateSummaryStatistics(2, true);

        __CLR4_4_12an72an7lb90pen4.R.inc(107148);StorelessUnivariateStatistic[] tmp = shuffled.getGeoMeanImpl();
        __CLR4_4_12an72an7lb90pen4.R.inc(107149);shuffled.setGeoMeanImpl(shuffled.getMeanImpl());
        __CLR4_4_12an72an7lb90pen4.R.inc(107150);shuffled.setMeanImpl(shuffled.getMaxImpl());
        __CLR4_4_12an72an7lb90pen4.R.inc(107151);shuffled.setMaxImpl(shuffled.getMinImpl());
        __CLR4_4_12an72an7lb90pen4.R.inc(107152);shuffled.setMinImpl(shuffled.getSumImpl());
        __CLR4_4_12an72an7lb90pen4.R.inc(107153);shuffled.setSumImpl(shuffled.getSumsqImpl());
        __CLR4_4_12an72an7lb90pen4.R.inc(107154);shuffled.setSumsqImpl(shuffled.getSumLogImpl());
        __CLR4_4_12an72an7lb90pen4.R.inc(107155);shuffled.setSumLogImpl(tmp);

        __CLR4_4_12an72an7lb90pen4.R.inc(107156);for (int i = 100; (((i > 0)&&(__CLR4_4_12an72an7lb90pen4.R.iget(107157)!=0|true))||(__CLR4_4_12an72an7lb90pen4.R.iget(107158)==0&false)); --i) {{
            __CLR4_4_12an72an7lb90pen4.R.inc(107159);reference.addValue(new double[] {i, i});
            __CLR4_4_12an72an7lb90pen4.R.inc(107160);shuffled.addValue(new double[] {i, i});
        }

        }__CLR4_4_12an72an7lb90pen4.R.inc(107161);TestUtils.assertEquals(reference.getMean(),          shuffled.getGeometricMean(), 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107162);TestUtils.assertEquals(reference.getMax(),           shuffled.getMean(),          1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107163);TestUtils.assertEquals(reference.getMin(),           shuffled.getMax(),           1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107164);TestUtils.assertEquals(reference.getSum(),           shuffled.getMin(),           1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107165);TestUtils.assertEquals(reference.getSumSq(),         shuffled.getSum(),           1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107166);TestUtils.assertEquals(reference.getSumLog(),        shuffled.getSumSq(),         1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107167);TestUtils.assertEquals(reference.getGeometricMean(), shuffled.getSumLog(),        1.0e-10);

    }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}

    /**
     * Bogus mean implementation to test setter injection.
     * Returns the sum instead of the mean.
     */
    static class sumMean implements StorelessUnivariateStatistic {
        private double sum = 0;
        private long n = 0;
        public double evaluate(double[] values, int begin, int length) {try{__CLR4_4_12an72an7lb90pen4.R.inc(107168);
            __CLR4_4_12an72an7lb90pen4.R.inc(107169);return 0;
        }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}
        public double evaluate(double[] values) {try{__CLR4_4_12an72an7lb90pen4.R.inc(107170);
            __CLR4_4_12an72an7lb90pen4.R.inc(107171);return 0;
        }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}
        public void clear() {try{__CLR4_4_12an72an7lb90pen4.R.inc(107172);
          __CLR4_4_12an72an7lb90pen4.R.inc(107173);sum = 0;
          __CLR4_4_12an72an7lb90pen4.R.inc(107174);n = 0;
        }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}
        public long getN() {try{__CLR4_4_12an72an7lb90pen4.R.inc(107175);
            __CLR4_4_12an72an7lb90pen4.R.inc(107176);return n;
        }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}
        public double getResult() {try{__CLR4_4_12an72an7lb90pen4.R.inc(107177);
            __CLR4_4_12an72an7lb90pen4.R.inc(107178);return sum;
        }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}
        public void increment(double d) {try{__CLR4_4_12an72an7lb90pen4.R.inc(107179);
            __CLR4_4_12an72an7lb90pen4.R.inc(107180);sum += d;
            __CLR4_4_12an72an7lb90pen4.R.inc(107181);n++;
        }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}
        public void incrementAll(double[] values, int start, int length) {try{__CLR4_4_12an72an7lb90pen4.R.inc(107182);
        }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}
        public void incrementAll(double[] values) {try{__CLR4_4_12an72an7lb90pen4.R.inc(107183);
        }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}
        public StorelessUnivariateStatistic copy() {try{__CLR4_4_12an72an7lb90pen4.R.inc(107184);
            __CLR4_4_12an72an7lb90pen4.R.inc(107185);return new sumMean();
        }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}
    }

    @Test
    public void testDimension() {__CLR4_4_12an72an7lb90pen4.R.globalSliceStart(getClass().getName(),107186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1onb1rv2ape();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12an72an7lb90pen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12an72an7lb90pen4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest.testDimension",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1onb1rv2ape(){try{__CLR4_4_12an72an7lb90pen4.R.inc(107186);
        __CLR4_4_12an72an7lb90pen4.R.inc(107187);try {
            __CLR4_4_12an72an7lb90pen4.R.inc(107188);createMultivariateSummaryStatistics(2, true).addValue(new double[3]);
            __CLR4_4_12an72an7lb90pen4.R.inc(107189);Assert.fail("Expecting DimensionMismatchException");
        } catch (DimensionMismatchException dme) {
            // expected behavior
        }
    }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}

    /** test stats */
    @Test
    public void testStats() {__CLR4_4_12an72an7lb90pen4.R.globalSliceStart(getClass().getName(),107190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cp4xt82api();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12an72an7lb90pen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12an72an7lb90pen4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest.testStats",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cp4xt82api(){try{__CLR4_4_12an72an7lb90pen4.R.inc(107190);
        __CLR4_4_12an72an7lb90pen4.R.inc(107191);MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(2, true);
        __CLR4_4_12an72an7lb90pen4.R.inc(107192);Assert.assertEquals(0, u.getN());
        __CLR4_4_12an72an7lb90pen4.R.inc(107193);u.addValue(new double[] { 1, 2 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107194);u.addValue(new double[] { 2, 3 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107195);u.addValue(new double[] { 2, 3 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107196);u.addValue(new double[] { 3, 4 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107197);Assert.assertEquals( 4, u.getN());
        __CLR4_4_12an72an7lb90pen4.R.inc(107198);Assert.assertEquals( 8, u.getSum()[0], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107199);Assert.assertEquals(12, u.getSum()[1], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107200);Assert.assertEquals(18, u.getSumSq()[0], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107201);Assert.assertEquals(38, u.getSumSq()[1], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107202);Assert.assertEquals( 1, u.getMin()[0], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107203);Assert.assertEquals( 2, u.getMin()[1], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107204);Assert.assertEquals( 3, u.getMax()[0], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107205);Assert.assertEquals( 4, u.getMax()[1], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107206);Assert.assertEquals(2.4849066497880003102, u.getSumLog()[0], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107207);Assert.assertEquals( 4.276666119016055311, u.getSumLog()[1], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107208);Assert.assertEquals( 1.8612097182041991979, u.getGeometricMean()[0], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107209);Assert.assertEquals( 2.9129506302439405217, u.getGeometricMean()[1], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107210);Assert.assertEquals( 2, u.getMean()[0], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107211);Assert.assertEquals( 3, u.getMean()[1], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107212);Assert.assertEquals(FastMath.sqrt(2.0 / 3.0), u.getStandardDeviation()[0], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107213);Assert.assertEquals(FastMath.sqrt(2.0 / 3.0), u.getStandardDeviation()[1], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107214);Assert.assertEquals(2.0 / 3.0, u.getCovariance().getEntry(0, 0), 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107215);Assert.assertEquals(2.0 / 3.0, u.getCovariance().getEntry(0, 1), 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107216);Assert.assertEquals(2.0 / 3.0, u.getCovariance().getEntry(1, 0), 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107217);Assert.assertEquals(2.0 / 3.0, u.getCovariance().getEntry(1, 1), 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107218);u.clear();
        __CLR4_4_12an72an7lb90pen4.R.inc(107219);Assert.assertEquals(0, u.getN());
    }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}

    @Test
    public void testN0andN1Conditions() {__CLR4_4_12an72an7lb90pen4.R.globalSliceStart(getClass().getName(),107220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161oc4l2aqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12an72an7lb90pen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12an72an7lb90pen4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest.testN0andN1Conditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161oc4l2aqc(){try{__CLR4_4_12an72an7lb90pen4.R.inc(107220);
        __CLR4_4_12an72an7lb90pen4.R.inc(107221);MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(1, true);
        __CLR4_4_12an72an7lb90pen4.R.inc(107222);Assert.assertTrue(Double.isNaN(u.getMean()[0]));
        __CLR4_4_12an72an7lb90pen4.R.inc(107223);Assert.assertTrue(Double.isNaN(u.getStandardDeviation()[0]));

        /* n=1 */
        __CLR4_4_12an72an7lb90pen4.R.inc(107224);u.addValue(new double[] { 1 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107225);Assert.assertEquals(1.0, u.getMean()[0], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107226);Assert.assertEquals(1.0, u.getGeometricMean()[0], 1.0e-10);
        __CLR4_4_12an72an7lb90pen4.R.inc(107227);Assert.assertEquals(0.0, u.getStandardDeviation()[0], 1.0e-10);

        /* n=2 */
        __CLR4_4_12an72an7lb90pen4.R.inc(107228);u.addValue(new double[] { 2 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107229);Assert.assertTrue(u.getStandardDeviation()[0] > 0);

    }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}

    @Test
    public void testNaNContracts() {__CLR4_4_12an72an7lb90pen4.R.globalSliceStart(getClass().getName(),107230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18807vj2aqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12an72an7lb90pen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12an72an7lb90pen4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest.testNaNContracts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18807vj2aqm(){try{__CLR4_4_12an72an7lb90pen4.R.inc(107230);
        __CLR4_4_12an72an7lb90pen4.R.inc(107231);MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(1, true);
        __CLR4_4_12an72an7lb90pen4.R.inc(107232);Assert.assertTrue(Double.isNaN(u.getMean()[0]));
        __CLR4_4_12an72an7lb90pen4.R.inc(107233);Assert.assertTrue(Double.isNaN(u.getMin()[0]));
        __CLR4_4_12an72an7lb90pen4.R.inc(107234);Assert.assertTrue(Double.isNaN(u.getStandardDeviation()[0]));
        __CLR4_4_12an72an7lb90pen4.R.inc(107235);Assert.assertTrue(Double.isNaN(u.getGeometricMean()[0]));

        __CLR4_4_12an72an7lb90pen4.R.inc(107236);u.addValue(new double[] { 1.0 });
        __CLR4_4_12an72an7lb90pen4.R.inc(107237);Assert.assertFalse(Double.isNaN(u.getMean()[0]));
        __CLR4_4_12an72an7lb90pen4.R.inc(107238);Assert.assertFalse(Double.isNaN(u.getMin()[0]));
        __CLR4_4_12an72an7lb90pen4.R.inc(107239);Assert.assertFalse(Double.isNaN(u.getStandardDeviation()[0]));
        __CLR4_4_12an72an7lb90pen4.R.inc(107240);Assert.assertFalse(Double.isNaN(u.getGeometricMean()[0]));

    }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}

    @Test
    public void testSerialization() {__CLR4_4_12an72an7lb90pen4.R.globalSliceStart(getClass().getName(),107241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on92aqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12an72an7lb90pen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12an72an7lb90pen4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on92aqx(){try{__CLR4_4_12an72an7lb90pen4.R.inc(107241);
        __CLR4_4_12an72an7lb90pen4.R.inc(107242);MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(2, true);
        // Empty test
        __CLR4_4_12an72an7lb90pen4.R.inc(107243);TestUtils.checkSerializedEquality(u);
        __CLR4_4_12an72an7lb90pen4.R.inc(107244);MultivariateSummaryStatistics s = (MultivariateSummaryStatistics) TestUtils.serializeAndRecover(u);
        __CLR4_4_12an72an7lb90pen4.R.inc(107245);Assert.assertEquals(u, s);

        // Add some data
        __CLR4_4_12an72an7lb90pen4.R.inc(107246);u.addValue(new double[] { 2d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107247);u.addValue(new double[] { 1d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107248);u.addValue(new double[] { 3d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107249);u.addValue(new double[] { 4d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107250);u.addValue(new double[] { 5d, 1d });

        // Test again
        __CLR4_4_12an72an7lb90pen4.R.inc(107251);TestUtils.checkSerializedEquality(u);
        __CLR4_4_12an72an7lb90pen4.R.inc(107252);s = (MultivariateSummaryStatistics) TestUtils.serializeAndRecover(u);
        __CLR4_4_12an72an7lb90pen4.R.inc(107253);Assert.assertEquals(u, s);

    }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() {__CLR4_4_12an72an7lb90pen4.R.globalSliceStart(getClass().getName(),107254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w82ara();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12an72an7lb90pen4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12an72an7lb90pen4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w82ara(){try{__CLR4_4_12an72an7lb90pen4.R.inc(107254);
        __CLR4_4_12an72an7lb90pen4.R.inc(107255);MultivariateSummaryStatistics u = createMultivariateSummaryStatistics(2, true);
        __CLR4_4_12an72an7lb90pen4.R.inc(107256);MultivariateSummaryStatistics t = null;
        __CLR4_4_12an72an7lb90pen4.R.inc(107257);int emptyHash = u.hashCode();
        __CLR4_4_12an72an7lb90pen4.R.inc(107258);Assert.assertTrue(u.equals(u));
        __CLR4_4_12an72an7lb90pen4.R.inc(107259);Assert.assertFalse(u.equals(t));
        __CLR4_4_12an72an7lb90pen4.R.inc(107260);Assert.assertFalse(u.equals(Double.valueOf(0)));
        __CLR4_4_12an72an7lb90pen4.R.inc(107261);t = createMultivariateSummaryStatistics(2, true);
        __CLR4_4_12an72an7lb90pen4.R.inc(107262);Assert.assertTrue(t.equals(u));
        __CLR4_4_12an72an7lb90pen4.R.inc(107263);Assert.assertTrue(u.equals(t));
        __CLR4_4_12an72an7lb90pen4.R.inc(107264);Assert.assertEquals(emptyHash, t.hashCode());

        // Add some data to u
        __CLR4_4_12an72an7lb90pen4.R.inc(107265);u.addValue(new double[] { 2d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107266);u.addValue(new double[] { 1d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107267);u.addValue(new double[] { 3d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107268);u.addValue(new double[] { 4d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107269);u.addValue(new double[] { 5d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107270);Assert.assertFalse(t.equals(u));
        __CLR4_4_12an72an7lb90pen4.R.inc(107271);Assert.assertFalse(u.equals(t));
        __CLR4_4_12an72an7lb90pen4.R.inc(107272);Assert.assertTrue(u.hashCode() != t.hashCode());

        //Add data in same order to t
        __CLR4_4_12an72an7lb90pen4.R.inc(107273);t.addValue(new double[] { 2d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107274);t.addValue(new double[] { 1d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107275);t.addValue(new double[] { 3d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107276);t.addValue(new double[] { 4d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107277);t.addValue(new double[] { 5d, 1d });
        __CLR4_4_12an72an7lb90pen4.R.inc(107278);Assert.assertTrue(t.equals(u));
        __CLR4_4_12an72an7lb90pen4.R.inc(107279);Assert.assertTrue(u.equals(t));
        __CLR4_4_12an72an7lb90pen4.R.inc(107280);Assert.assertEquals(u.hashCode(), t.hashCode());

        // Clear and make sure summaries are indistinguishable from empty summary
        __CLR4_4_12an72an7lb90pen4.R.inc(107281);u.clear();
        __CLR4_4_12an72an7lb90pen4.R.inc(107282);t.clear();
        __CLR4_4_12an72an7lb90pen4.R.inc(107283);Assert.assertTrue(t.equals(u));
        __CLR4_4_12an72an7lb90pen4.R.inc(107284);Assert.assertTrue(u.equals(t));
        __CLR4_4_12an72an7lb90pen4.R.inc(107285);Assert.assertEquals(emptyHash, t.hashCode());
        __CLR4_4_12an72an7lb90pen4.R.inc(107286);Assert.assertEquals(emptyHash, u.hashCode());
    }finally{__CLR4_4_12an72an7lb90pen4.R.flushNeeded();}}
}
