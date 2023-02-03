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


import org.apache.commons.math3.TestUtils;
import org.junit.Assert;
import org.junit.Test;
/**
 * Test cases for the {@link StatisticalSummaryValues} class.
 *
 * @version $Id$
 */

public final class StatisticalSummaryValuesTest {static class __CLR4_4_12as72as7lb90pen7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,107318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testSerialization() {__CLR4_4_12as72as7lb90pen7.R.globalSliceStart(getClass().getName(),107287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on92as7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12as72as7lb90pen7.R.rethrow($CLV_t2$);}finally{__CLR4_4_12as72as7lb90pen7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.StatisticalSummaryValuesTest.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on92as7(){try{__CLR4_4_12as72as7lb90pen7.R.inc(107287);
        __CLR4_4_12as72as7lb90pen7.R.inc(107288);StatisticalSummaryValues u = new StatisticalSummaryValues(1, 2, 3, 4, 5, 6);
        __CLR4_4_12as72as7lb90pen7.R.inc(107289);TestUtils.checkSerializedEquality(u);
        __CLR4_4_12as72as7lb90pen7.R.inc(107290);StatisticalSummaryValues t = (StatisticalSummaryValues) TestUtils.serializeAndRecover(u);
        __CLR4_4_12as72as7lb90pen7.R.inc(107291);verifyEquality(u, t);
    }finally{__CLR4_4_12as72as7lb90pen7.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() {__CLR4_4_12as72as7lb90pen7.R.globalSliceStart(getClass().getName(),107292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w82asc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12as72as7lb90pen7.R.rethrow($CLV_t2$);}finally{__CLR4_4_12as72as7lb90pen7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.StatisticalSummaryValuesTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w82asc(){try{__CLR4_4_12as72as7lb90pen7.R.inc(107292);
        __CLR4_4_12as72as7lb90pen7.R.inc(107293);StatisticalSummaryValues u  = new StatisticalSummaryValues(1, 2, 3, 4, 5, 6);
        __CLR4_4_12as72as7lb90pen7.R.inc(107294);StatisticalSummaryValues t = null;
        __CLR4_4_12as72as7lb90pen7.R.inc(107295);Assert.assertTrue("reflexive", u.equals(u));
        __CLR4_4_12as72as7lb90pen7.R.inc(107296);Assert.assertFalse("non-null compared to null", u.equals(t));
        __CLR4_4_12as72as7lb90pen7.R.inc(107297);Assert.assertFalse("wrong type", u.equals(Double.valueOf(0)));
        __CLR4_4_12as72as7lb90pen7.R.inc(107298);t = new StatisticalSummaryValues(1, 2, 3, 4, 5, 6);
        __CLR4_4_12as72as7lb90pen7.R.inc(107299);Assert.assertTrue("instances with same data should be equal", t.equals(u));
        __CLR4_4_12as72as7lb90pen7.R.inc(107300);Assert.assertEquals("hash code", u.hashCode(), t.hashCode());

        __CLR4_4_12as72as7lb90pen7.R.inc(107301);u = new StatisticalSummaryValues(Double.NaN, 2, 3, 4, 5, 6);
        __CLR4_4_12as72as7lb90pen7.R.inc(107302);t = new StatisticalSummaryValues(1, Double.NaN, 3, 4, 5, 6);
        __CLR4_4_12as72as7lb90pen7.R.inc(107303);Assert.assertFalse("instances based on different data should be different",
                (u.equals(t) ||t.equals(u)));
    }finally{__CLR4_4_12as72as7lb90pen7.R.flushNeeded();}}

    private void verifyEquality(StatisticalSummaryValues s, StatisticalSummaryValues u) {try{__CLR4_4_12as72as7lb90pen7.R.inc(107304);
        __CLR4_4_12as72as7lb90pen7.R.inc(107305);Assert.assertEquals("N",s.getN(),u.getN());
        __CLR4_4_12as72as7lb90pen7.R.inc(107306);TestUtils.assertEquals("sum",s.getSum(),u.getSum(), 0);
        __CLR4_4_12as72as7lb90pen7.R.inc(107307);TestUtils.assertEquals("var",s.getVariance(),u.getVariance(), 0);
        __CLR4_4_12as72as7lb90pen7.R.inc(107308);TestUtils.assertEquals("std",s.getStandardDeviation(),u.getStandardDeviation(), 0);
        __CLR4_4_12as72as7lb90pen7.R.inc(107309);TestUtils.assertEquals("mean",s.getMean(),u.getMean(), 0);
        __CLR4_4_12as72as7lb90pen7.R.inc(107310);TestUtils.assertEquals("min",s.getMin(),u.getMin(), 0);
        __CLR4_4_12as72as7lb90pen7.R.inc(107311);TestUtils.assertEquals("max",s.getMax(),u.getMax(), 0);
    }finally{__CLR4_4_12as72as7lb90pen7.R.flushNeeded();}}
    
    @Test
    public void testToString() {__CLR4_4_12as72as7lb90pen7.R.globalSliceStart(getClass().getName(),107312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid2asw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12as72as7lb90pen7.R.rethrow($CLV_t2$);}finally{__CLR4_4_12as72as7lb90pen7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.StatisticalSummaryValuesTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid2asw(){try{__CLR4_4_12as72as7lb90pen7.R.inc(107312);
        __CLR4_4_12as72as7lb90pen7.R.inc(107313);StatisticalSummaryValues u  = new StatisticalSummaryValues(4.5, 16, 10, 5, 4, 45);
        __CLR4_4_12as72as7lb90pen7.R.inc(107314);Locale d = Locale.getDefault();
        __CLR4_4_12as72as7lb90pen7.R.inc(107315);Locale.setDefault(Locale.US);
        __CLR4_4_12as72as7lb90pen7.R.inc(107316);Assert.assertEquals("StatisticalSummaryValues:\n" +
                     "n: 10\n" +
                     "min: 4.0\n" +
                     "max: 5.0\n" +
                     "mean: 4.5\n" +
                     "std dev: 4.0\n" +
                     "variance: 16.0\n" +
                     "sum: 45.0\n",  u.toString());
        __CLR4_4_12as72as7lb90pen7.R.inc(107317);Locale.setDefault(d);
    }finally{__CLR4_4_12as72as7lb90pen7.R.flushNeeded();}}
}
