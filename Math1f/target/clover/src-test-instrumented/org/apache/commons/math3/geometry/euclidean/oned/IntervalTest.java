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
package org.apache.commons.math3.geometry.euclidean.oned;

import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

public class IntervalTest {static class __CLR4_4_11o8q1o8qlb90pcpe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,78108,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testInterval() {__CLR4_4_11o8q1o8qlb90pcpe.R.globalSliceStart(getClass().getName(),78074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p0y7tu1o8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o8q1o8qlb90pcpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o8q1o8qlb90pcpe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.oned.IntervalTest.testInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p0y7tu1o8q(){try{__CLR4_4_11o8q1o8qlb90pcpe.R.inc(78074);
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78075);Interval interval = new Interval(2.3, 5.7);
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78076);Assert.assertEquals(3.4, interval.getSize(), 1.0e-10);
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78077);Assert.assertEquals(4.0, interval.getBarycenter(), 1.0e-10);
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78078);Assert.assertEquals(Region.Location.BOUNDARY, interval.checkPoint(2.3, 1.0e-10));
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78079);Assert.assertEquals(Region.Location.BOUNDARY, interval.checkPoint(5.7, 1.0e-10));
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78080);Assert.assertEquals(Region.Location.OUTSIDE,  interval.checkPoint(1.2, 1.0e-10));
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78081);Assert.assertEquals(Region.Location.OUTSIDE,  interval.checkPoint(8.7, 1.0e-10));
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78082);Assert.assertEquals(Region.Location.INSIDE,   interval.checkPoint(3.0, 1.0e-10));
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78083);Assert.assertEquals(2.3, interval.getInf(), 1.0e-10);
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78084);Assert.assertEquals(5.7, interval.getSup(), 1.0e-10);
    }finally{__CLR4_4_11o8q1o8qlb90pcpe.R.flushNeeded();}}

    @Test
    public void testTolerance() {__CLR4_4_11o8q1o8qlb90pcpe.R.globalSliceStart(getClass().getName(),78085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kkck1q1o91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o8q1o8qlb90pcpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o8q1o8qlb90pcpe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.oned.IntervalTest.testTolerance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kkck1q1o91(){try{__CLR4_4_11o8q1o8qlb90pcpe.R.inc(78085);
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78086);Interval interval = new Interval(2.3, 5.7);
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78087);Assert.assertEquals(Region.Location.OUTSIDE,  interval.checkPoint(1.2, 1.0));
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78088);Assert.assertEquals(Region.Location.BOUNDARY, interval.checkPoint(1.2, 1.2));
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78089);Assert.assertEquals(Region.Location.OUTSIDE,  interval.checkPoint(8.7, 2.9));
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78090);Assert.assertEquals(Region.Location.BOUNDARY, interval.checkPoint(8.7, 3.1));
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78091);Assert.assertEquals(Region.Location.INSIDE,   interval.checkPoint(3.0, 0.6));
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78092);Assert.assertEquals(Region.Location.BOUNDARY, interval.checkPoint(3.0, 0.8));
    }finally{__CLR4_4_11o8q1o8qlb90pcpe.R.flushNeeded();}}

    @Test
    public void testInfinite() {__CLR4_4_11o8q1o8qlb90pcpe.R.globalSliceStart(getClass().getName(),78093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1foyoc31o99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o8q1o8qlb90pcpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o8q1o8qlb90pcpe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.oned.IntervalTest.testInfinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1foyoc31o99(){try{__CLR4_4_11o8q1o8qlb90pcpe.R.inc(78093);
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78094);Interval interval = new Interval(9.0, Double.POSITIVE_INFINITY);
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78095);Assert.assertEquals(Region.Location.BOUNDARY, interval.checkPoint(9.0, 1.0e-10));
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78096);Assert.assertEquals(Region.Location.OUTSIDE,  interval.checkPoint(8.4, 1.0e-10));
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78097);for (double e = 1.0; (((e <= 6.0)&&(__CLR4_4_11o8q1o8qlb90pcpe.R.iget(78098)!=0|true))||(__CLR4_4_11o8q1o8qlb90pcpe.R.iget(78099)==0&false)); e += 1.0) {{
            __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78100);Assert.assertEquals(Region.Location.INSIDE,
                                interval.checkPoint(FastMath.pow(10.0, e), 1.0e-10));
        }
        }__CLR4_4_11o8q1o8qlb90pcpe.R.inc(78101);Assert.assertTrue(Double.isInfinite(interval.getSize()));
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78102);Assert.assertEquals(9.0, interval.getInf(), 1.0e-10);
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78103);Assert.assertTrue(Double.isInfinite(interval.getSup()));

    }finally{__CLR4_4_11o8q1o8qlb90pcpe.R.flushNeeded();}}

    @Test
    public void testSinglePoint() {__CLR4_4_11o8q1o8qlb90pcpe.R.globalSliceStart(getClass().getName(),78104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fuy9tv1o9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o8q1o8qlb90pcpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o8q1o8qlb90pcpe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.oned.IntervalTest.testSinglePoint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fuy9tv1o9k(){try{__CLR4_4_11o8q1o8qlb90pcpe.R.inc(78104);
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78105);Interval interval = new Interval(1.0, 1.0);
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78106);Assert.assertEquals(0.0, interval.getSize(), Precision.SAFE_MIN);
        __CLR4_4_11o8q1o8qlb90pcpe.R.inc(78107);Assert.assertEquals(1.0, interval.getBarycenter(), Precision.EPSILON);
    }finally{__CLR4_4_11o8q1o8qlb90pcpe.R.flushNeeded();}}

}
