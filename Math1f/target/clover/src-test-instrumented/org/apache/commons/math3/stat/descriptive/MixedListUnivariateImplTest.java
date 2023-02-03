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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.NumberTransformer;
import org.apache.commons.math3.util.TransformerMap;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link ListUnivariateImpl} class.
 *
 * @version $Id$
 */

public final class MixedListUnivariateImplTest {static class __CLR4_4_12akz2akzlb90pemv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,107107,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private double one = 1;
    private float two = 2;
    private int three = 3;

    private double mean = 2;
    private double sumSq = 18;
    private double sum = 8;
    private double var = 0.666666666666666666667;
    private double std = FastMath.sqrt(var);
    private double n = 4;
    private double min = 1;
    private double max = 3;
    private double tolerance = 10E-15;

    private TransformerMap transformers = new TransformerMap();

    public MixedListUnivariateImplTest() {try{__CLR4_4_12akz2akzlb90pemv.R.inc(107027);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107028);transformers = new TransformerMap();

        __CLR4_4_12akz2akzlb90pemv.R.inc(107029);transformers.putTransformer(Foo.class, new FooTransformer());

        __CLR4_4_12akz2akzlb90pemv.R.inc(107030);transformers.putTransformer(Bar.class, new BarTransformer());

    }finally{__CLR4_4_12akz2akzlb90pemv.R.flushNeeded();}}

    /** test stats */
    @Test
    public void testStats() {__CLR4_4_12akz2akzlb90pemv.R.globalSliceStart(getClass().getName(),107031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cp4xt82al3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12akz2akzlb90pemv.R.rethrow($CLV_t2$);}finally{__CLR4_4_12akz2akzlb90pemv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MixedListUnivariateImplTest.testStats",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cp4xt82al3(){try{__CLR4_4_12akz2akzlb90pemv.R.inc(107031);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107032);List<Object> externalList = new ArrayList<Object>();

        __CLR4_4_12akz2akzlb90pemv.R.inc(107033);DescriptiveStatistics u = new ListUnivariateImpl(externalList,transformers);

        __CLR4_4_12akz2akzlb90pemv.R.inc(107034);Assert.assertEquals("total count", 0, u.getN(), tolerance);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107035);u.addValue(one);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107036);u.addValue(two);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107037);u.addValue(two);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107038);u.addValue(three);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107039);Assert.assertEquals("N", n, u.getN(), tolerance);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107040);Assert.assertEquals("sum", sum, u.getSum(), tolerance);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107041);Assert.assertEquals("sumsq", sumSq, u.getSumsq(), tolerance);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107042);Assert.assertEquals("var", var, u.getVariance(), tolerance);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107043);Assert.assertEquals("std", std, u.getStandardDeviation(), tolerance);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107044);Assert.assertEquals("mean", mean, u.getMean(), tolerance);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107045);Assert.assertEquals("min", min, u.getMin(), tolerance);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107046);Assert.assertEquals("max", max, u.getMax(), tolerance);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107047);u.clear();
        __CLR4_4_12akz2akzlb90pemv.R.inc(107048);Assert.assertEquals("total count", 0, u.getN(), tolerance);
    }finally{__CLR4_4_12akz2akzlb90pemv.R.flushNeeded();}}

    @Test
    public void testN0andN1Conditions() {__CLR4_4_12akz2akzlb90pemv.R.globalSliceStart(getClass().getName(),107049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161oc4l2all();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12akz2akzlb90pemv.R.rethrow($CLV_t2$);}finally{__CLR4_4_12akz2akzlb90pemv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MixedListUnivariateImplTest.testN0andN1Conditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161oc4l2all(){try{__CLR4_4_12akz2akzlb90pemv.R.inc(107049);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107050);DescriptiveStatistics u = new ListUnivariateImpl(new ArrayList<Object>(),transformers);

        __CLR4_4_12akz2akzlb90pemv.R.inc(107051);Assert.assertTrue(
            "Mean of n = 0 set should be NaN",
            Double.isNaN(u.getMean()));
        __CLR4_4_12akz2akzlb90pemv.R.inc(107052);Assert.assertTrue(
            "Standard Deviation of n = 0 set should be NaN",
            Double.isNaN(u.getStandardDeviation()));
        __CLR4_4_12akz2akzlb90pemv.R.inc(107053);Assert.assertTrue(
            "Variance of n = 0 set should be NaN",
            Double.isNaN(u.getVariance()));

        __CLR4_4_12akz2akzlb90pemv.R.inc(107054);u.addValue(one);

        __CLR4_4_12akz2akzlb90pemv.R.inc(107055);Assert.assertTrue(
            "Mean of n = 1 set should be value of single item n1, instead it is " + u.getMean() ,
            u.getMean() == one);

        __CLR4_4_12akz2akzlb90pemv.R.inc(107056);Assert.assertTrue(
            "StdDev of n = 1 set should be zero, instead it is: "
                + u.getStandardDeviation(),
            u.getStandardDeviation() == 0);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107057);Assert.assertTrue(
            "Variance of n = 1 set should be zero",
            u.getVariance() == 0);
    }finally{__CLR4_4_12akz2akzlb90pemv.R.flushNeeded();}}

    @Test
    public void testSkewAndKurtosis() {__CLR4_4_12akz2akzlb90pemv.R.globalSliceStart(getClass().getName(),107058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1onpxfg2alu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12akz2akzlb90pemv.R.rethrow($CLV_t2$);}finally{__CLR4_4_12akz2akzlb90pemv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MixedListUnivariateImplTest.testSkewAndKurtosis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1onpxfg2alu(){try{__CLR4_4_12akz2akzlb90pemv.R.inc(107058);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107059);ListUnivariateImpl u =
            new ListUnivariateImpl(new ArrayList<Object>(), transformers);

        __CLR4_4_12akz2akzlb90pemv.R.inc(107060);u.addObject("12.5");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107061);u.addObject(Integer.valueOf(12));
        __CLR4_4_12akz2akzlb90pemv.R.inc(107062);u.addObject("11.8");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107063);u.addObject("14.2");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107064);u.addObject(new Foo());
        __CLR4_4_12akz2akzlb90pemv.R.inc(107065);u.addObject("14.5");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107066);u.addObject(Long.valueOf(21));
        __CLR4_4_12akz2akzlb90pemv.R.inc(107067);u.addObject("8.2");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107068);u.addObject("10.3");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107069);u.addObject("11.3");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107070);u.addObject(Float.valueOf(14.1f));
        __CLR4_4_12akz2akzlb90pemv.R.inc(107071);u.addObject("9.9");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107072);u.addObject("12.2");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107073);u.addObject(new Bar());
        __CLR4_4_12akz2akzlb90pemv.R.inc(107074);u.addObject("12.1");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107075);u.addObject("11");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107076);u.addObject(Double.valueOf(19.8));
        __CLR4_4_12akz2akzlb90pemv.R.inc(107077);u.addObject("11");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107078);u.addObject("10");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107079);u.addObject("8.8");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107080);u.addObject("9");
        __CLR4_4_12akz2akzlb90pemv.R.inc(107081);u.addObject("12.3");


        __CLR4_4_12akz2akzlb90pemv.R.inc(107082);Assert.assertEquals("mean", 12.40455, u.getMean(), 0.0001);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107083);Assert.assertEquals("variance", 10.00236, u.getVariance(), 0.0001);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107084);Assert.assertEquals("skewness", 1.437424, u.getSkewness(), 0.0001);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107085);Assert.assertEquals("kurtosis", 2.37719, u.getKurtosis(), 0.0001);
    }finally{__CLR4_4_12akz2akzlb90pemv.R.flushNeeded();}}

    @Test
    public void testProductAndGeometricMean() {__CLR4_4_12akz2akzlb90pemv.R.globalSliceStart(getClass().getName(),107086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14x6wab2amm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12akz2akzlb90pemv.R.rethrow($CLV_t2$);}finally{__CLR4_4_12akz2akzlb90pemv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.MixedListUnivariateImplTest.testProductAndGeometricMean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14x6wab2amm(){try{__CLR4_4_12akz2akzlb90pemv.R.inc(107086);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107087);ListUnivariateImpl u = new ListUnivariateImpl(new ArrayList<Object>(),transformers);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107088);u.setWindowSize(10);

        __CLR4_4_12akz2akzlb90pemv.R.inc(107089);u.addValue(1.0);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107090);u.addValue(2.0);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107091);u.addValue(3.0);
        __CLR4_4_12akz2akzlb90pemv.R.inc(107092);u.addValue(4.0);

        __CLR4_4_12akz2akzlb90pemv.R.inc(107093);Assert.assertEquals(
            "Geometric mean not expected",
            2.213364,
            u.getGeometricMean(),
            0.00001);

        // Now test rolling - StorelessDescriptiveStatistics should discount the contribution
        // of a discarded element
        __CLR4_4_12akz2akzlb90pemv.R.inc(107094);for (int i = 0; (((i < 10)&&(__CLR4_4_12akz2akzlb90pemv.R.iget(107095)!=0|true))||(__CLR4_4_12akz2akzlb90pemv.R.iget(107096)==0&false)); i++) {{
            __CLR4_4_12akz2akzlb90pemv.R.inc(107097);u.addValue(i + 2);
        }
        // Values should be (2,3,4,5,6,7,8,9,10,11)
        }__CLR4_4_12akz2akzlb90pemv.R.inc(107098);Assert.assertEquals(
            "Geometric mean not expected",
            5.755931,
            u.getGeometricMean(),
            0.00001);

    }finally{__CLR4_4_12akz2akzlb90pemv.R.flushNeeded();}}

    public static final class Foo {
        public String heresFoo() {try{__CLR4_4_12akz2akzlb90pemv.R.inc(107099);
            __CLR4_4_12akz2akzlb90pemv.R.inc(107100);return "14.9";
        }finally{__CLR4_4_12akz2akzlb90pemv.R.flushNeeded();}}
    }

    public static final class FooTransformer implements NumberTransformer, Serializable {
        private static final long serialVersionUID = -4252248129291326127L;
        public double transform(Object o) {try{__CLR4_4_12akz2akzlb90pemv.R.inc(107101);
            __CLR4_4_12akz2akzlb90pemv.R.inc(107102);return Double.parseDouble(((Foo) o).heresFoo());
        }finally{__CLR4_4_12akz2akzlb90pemv.R.flushNeeded();}}
    }

    public static final class Bar {
        public String heresBar() {try{__CLR4_4_12akz2akzlb90pemv.R.inc(107103);
            __CLR4_4_12akz2akzlb90pemv.R.inc(107104);return "12.0";
        }finally{__CLR4_4_12akz2akzlb90pemv.R.flushNeeded();}}
    }

    public static final class BarTransformer implements NumberTransformer, Serializable {
        private static final long serialVersionUID = -1768345377764262043L;
        public double transform(Object o) {try{__CLR4_4_12akz2akzlb90pemv.R.inc(107105);
            __CLR4_4_12akz2akzlb90pemv.R.inc(107106);return Double.parseDouble(((Bar) o).heresBar());
        }finally{__CLR4_4_12akz2akzlb90pemv.R.flushNeeded();}}
    }

}
