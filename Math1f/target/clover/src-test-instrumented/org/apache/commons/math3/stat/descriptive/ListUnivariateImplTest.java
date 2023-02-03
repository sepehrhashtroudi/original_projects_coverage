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
import java.util.List;


import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link ListUnivariateImpl} class.
 *
 * @version $Id$
 */

public final class ListUnivariateImplTest {static class __CLR4_4_12aj12aj1lb90pemq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,107027,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    /** test stats */
    @Test
    public void testStats() {__CLR4_4_12aj12aj1lb90pemq.R.globalSliceStart(getClass().getName(),106957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cp4xt82aj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12aj12aj1lb90pemq.R.rethrow($CLV_t2$);}finally{__CLR4_4_12aj12aj1lb90pemq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest.testStats",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cp4xt82aj1(){try{__CLR4_4_12aj12aj1lb90pemq.R.inc(106957);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106958);List<Object> externalList = new ArrayList<Object>();

        __CLR4_4_12aj12aj1lb90pemq.R.inc(106959);DescriptiveStatistics u = new ListUnivariateImpl( externalList );

        __CLR4_4_12aj12aj1lb90pemq.R.inc(106960);Assert.assertEquals("total count",0,u.getN(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106961);u.addValue(one);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106962);u.addValue(two);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106963);u.addValue(two);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106964);u.addValue(three);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106965);Assert.assertEquals("N",n,u.getN(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106966);Assert.assertEquals("sum",sum,u.getSum(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106967);Assert.assertEquals("sumsq",sumSq,u.getSumsq(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106968);Assert.assertEquals("var",var,u.getVariance(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106969);Assert.assertEquals("std",std,u.getStandardDeviation(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106970);Assert.assertEquals("mean",mean,u.getMean(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106971);Assert.assertEquals("min",min,u.getMin(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106972);Assert.assertEquals("max",max,u.getMax(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106973);u.clear();
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106974);Assert.assertEquals("total count",0,u.getN(),tolerance);
    }finally{__CLR4_4_12aj12aj1lb90pemq.R.flushNeeded();}}

    @Test
    public void testN0andN1Conditions() {__CLR4_4_12aj12aj1lb90pemq.R.globalSliceStart(getClass().getName(),106975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161oc4l2ajj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12aj12aj1lb90pemq.R.rethrow($CLV_t2$);}finally{__CLR4_4_12aj12aj1lb90pemq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest.testN0andN1Conditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161oc4l2ajj(){try{__CLR4_4_12aj12aj1lb90pemq.R.inc(106975);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106976);List<Object> list = new ArrayList<Object>();

        __CLR4_4_12aj12aj1lb90pemq.R.inc(106977);DescriptiveStatistics u = new ListUnivariateImpl( list );

        __CLR4_4_12aj12aj1lb90pemq.R.inc(106978);Assert.assertTrue("Mean of n = 0 set should be NaN", Double.isNaN( u.getMean() ) );
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106979);Assert.assertTrue("Standard Deviation of n = 0 set should be NaN", Double.isNaN( u.getStandardDeviation() ) );
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106980);Assert.assertTrue("Variance of n = 0 set should be NaN", Double.isNaN(u.getVariance() ) );

        __CLR4_4_12aj12aj1lb90pemq.R.inc(106981);list.add( Double.valueOf(one));

        __CLR4_4_12aj12aj1lb90pemq.R.inc(106982);Assert.assertTrue( "Mean of n = 1 set should be value of single item n1", u.getMean() == one);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106983);Assert.assertTrue( "StdDev of n = 1 set should be zero, instead it is: " + u.getStandardDeviation(), u.getStandardDeviation() == 0);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106984);Assert.assertTrue( "Variance of n = 1 set should be zero", u.getVariance() == 0);
    }finally{__CLR4_4_12aj12aj1lb90pemq.R.flushNeeded();}}

    @Test
    public void testSkewAndKurtosis() {__CLR4_4_12aj12aj1lb90pemq.R.globalSliceStart(getClass().getName(),106985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1onpxfg2ajt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12aj12aj1lb90pemq.R.rethrow($CLV_t2$);}finally{__CLR4_4_12aj12aj1lb90pemq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest.testSkewAndKurtosis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1onpxfg2ajt(){try{__CLR4_4_12aj12aj1lb90pemq.R.inc(106985);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106986);DescriptiveStatistics u = new DescriptiveStatistics();

        __CLR4_4_12aj12aj1lb90pemq.R.inc(106987);double[] testArray = { 12.5, 12, 11.8, 14.2, 14.9, 14.5, 21, 8.2, 10.3, 11.3, 14.1,
                                             9.9, 12.2, 12, 12.1, 11, 19.8, 11, 10, 8.8, 9, 12.3 };
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106988);for( int i = 0; (((i < testArray.length)&&(__CLR4_4_12aj12aj1lb90pemq.R.iget(106989)!=0|true))||(__CLR4_4_12aj12aj1lb90pemq.R.iget(106990)==0&false)); i++) {{
            __CLR4_4_12aj12aj1lb90pemq.R.inc(106991);u.addValue( testArray[i]);
        }

        }__CLR4_4_12aj12aj1lb90pemq.R.inc(106992);Assert.assertEquals("mean", 12.40455, u.getMean(), 0.0001);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106993);Assert.assertEquals("variance", 10.00236, u.getVariance(), 0.0001);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106994);Assert.assertEquals("skewness", 1.437424, u.getSkewness(), 0.0001);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106995);Assert.assertEquals("kurtosis", 2.37719, u.getKurtosis(), 0.0001);
    }finally{__CLR4_4_12aj12aj1lb90pemq.R.flushNeeded();}}

    @Test
    public void testProductAndGeometricMean() {__CLR4_4_12aj12aj1lb90pemq.R.globalSliceStart(getClass().getName(),106996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14x6wab2ak4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12aj12aj1lb90pemq.R.rethrow($CLV_t2$);}finally{__CLR4_4_12aj12aj1lb90pemq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest.testProductAndGeometricMean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14x6wab2ak4(){try{__CLR4_4_12aj12aj1lb90pemq.R.inc(106996);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106997);ListUnivariateImpl u = new ListUnivariateImpl(new ArrayList<Object>());
        __CLR4_4_12aj12aj1lb90pemq.R.inc(106998);u.setWindowSize(10);

        __CLR4_4_12aj12aj1lb90pemq.R.inc(106999);u.addValue( 1.0 );
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107000);u.addValue( 2.0 );
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107001);u.addValue( 3.0 );
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107002);u.addValue( 4.0 );

        __CLR4_4_12aj12aj1lb90pemq.R.inc(107003);Assert.assertEquals( "Geometric mean not expected", 2.213364, u.getGeometricMean(), 0.00001 );

        // Now test rolling - StorelessDescriptiveStatistics should discount the contribution
        // of a discarded element
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107004);for( int i = 0; (((i < 10)&&(__CLR4_4_12aj12aj1lb90pemq.R.iget(107005)!=0|true))||(__CLR4_4_12aj12aj1lb90pemq.R.iget(107006)==0&false)); i++ ) {{
            __CLR4_4_12aj12aj1lb90pemq.R.inc(107007);u.addValue( i + 2 );
        }
        // Values should be (2,3,4,5,6,7,8,9,10,11)

        }__CLR4_4_12aj12aj1lb90pemq.R.inc(107008);Assert.assertEquals( "Geometric mean not expected", 5.755931, u.getGeometricMean(), 0.00001 );


    }finally{__CLR4_4_12aj12aj1lb90pemq.R.flushNeeded();}}

    /** test stats */
    @Test
    public void testSerialization() {__CLR4_4_12aj12aj1lb90pemq.R.globalSliceStart(getClass().getName(),107009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on92akh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12aj12aj1lb90pemq.R.rethrow($CLV_t2$);}finally{__CLR4_4_12aj12aj1lb90pemq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on92akh(){try{__CLR4_4_12aj12aj1lb90pemq.R.inc(107009);

        __CLR4_4_12aj12aj1lb90pemq.R.inc(107010);DescriptiveStatistics u = new ListUnivariateImpl();

        __CLR4_4_12aj12aj1lb90pemq.R.inc(107011);Assert.assertEquals("total count",0,u.getN(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107012);u.addValue(one);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107013);u.addValue(two);

        __CLR4_4_12aj12aj1lb90pemq.R.inc(107014);DescriptiveStatistics u2 = (DescriptiveStatistics)TestUtils.serializeAndRecover(u);

        __CLR4_4_12aj12aj1lb90pemq.R.inc(107015);u2.addValue(two);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107016);u2.addValue(three);

        __CLR4_4_12aj12aj1lb90pemq.R.inc(107017);Assert.assertEquals("N",n,u2.getN(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107018);Assert.assertEquals("sum",sum,u2.getSum(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107019);Assert.assertEquals("sumsq",sumSq,u2.getSumsq(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107020);Assert.assertEquals("var",var,u2.getVariance(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107021);Assert.assertEquals("std",std,u2.getStandardDeviation(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107022);Assert.assertEquals("mean",mean,u2.getMean(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107023);Assert.assertEquals("min",min,u2.getMin(),tolerance);
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107024);Assert.assertEquals("max",max,u2.getMax(),tolerance);

        __CLR4_4_12aj12aj1lb90pemq.R.inc(107025);u2.clear();
        __CLR4_4_12aj12aj1lb90pemq.R.inc(107026);Assert.assertEquals("total count",0,u2.getN(),tolerance);
    }finally{__CLR4_4_12aj12aj1lb90pemq.R.flushNeeded();}}
}

