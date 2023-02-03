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

package org.apache.commons.math3.stat.clustering;


import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class EuclideanIntegerPointTest {static class __CLR4_4_129rc29rclb90pek6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,105981,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testArrayIsReference() {__CLR4_4_129rc29rclb90pek6.R.globalSliceStart(getClass().getName(),105960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qqrk7z29rc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129rc29rclb90pek6.R.rethrow($CLV_t2$);}finally{__CLR4_4_129rc29rclb90pek6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.EuclideanIntegerPointTest.testArrayIsReference",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qqrk7z29rc(){try{__CLR4_4_129rc29rclb90pek6.R.inc(105960);
        __CLR4_4_129rc29rclb90pek6.R.inc(105961);int[] array = { -3, -2, -1, 0, 1 };
        __CLR4_4_129rc29rclb90pek6.R.inc(105962);Assert.assertTrue(array == new EuclideanIntegerPoint(array).getPoint());
    }finally{__CLR4_4_129rc29rclb90pek6.R.flushNeeded();}}

    @Test
    public void testDistance() {__CLR4_4_129rc29rclb90pek6.R.globalSliceStart(getClass().getName(),105963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o82ia629rf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129rc29rclb90pek6.R.rethrow($CLV_t2$);}finally{__CLR4_4_129rc29rclb90pek6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.EuclideanIntegerPointTest.testDistance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o82ia629rf(){try{__CLR4_4_129rc29rclb90pek6.R.inc(105963);
        __CLR4_4_129rc29rclb90pek6.R.inc(105964);EuclideanIntegerPoint e1 = new EuclideanIntegerPoint(new int[] { -3, -2, -1, 0, 1 });
        __CLR4_4_129rc29rclb90pek6.R.inc(105965);EuclideanIntegerPoint e2 = new EuclideanIntegerPoint(new int[] {  1,  0, -1, 1, 1 });
        __CLR4_4_129rc29rclb90pek6.R.inc(105966);Assert.assertEquals(FastMath.sqrt(21.0), e1.distanceFrom(e2), 1.0e-15);
        __CLR4_4_129rc29rclb90pek6.R.inc(105967);Assert.assertEquals(0.0, e1.distanceFrom(e1), 1.0e-15);
        __CLR4_4_129rc29rclb90pek6.R.inc(105968);Assert.assertEquals(0.0, e2.distanceFrom(e2), 1.0e-15);
    }finally{__CLR4_4_129rc29rclb90pek6.R.flushNeeded();}}

    @Test
    public void testCentroid() {__CLR4_4_129rc29rclb90pek6.R.globalSliceStart(getClass().getName(),105969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x9zpmv29rl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129rc29rclb90pek6.R.rethrow($CLV_t2$);}finally{__CLR4_4_129rc29rclb90pek6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.EuclideanIntegerPointTest.testCentroid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x9zpmv29rl(){try{__CLR4_4_129rc29rclb90pek6.R.inc(105969);
        __CLR4_4_129rc29rclb90pek6.R.inc(105970);List<EuclideanIntegerPoint> list = new ArrayList<EuclideanIntegerPoint>();
        __CLR4_4_129rc29rclb90pek6.R.inc(105971);list.add(new EuclideanIntegerPoint(new int[] {  1,  3 }));
        __CLR4_4_129rc29rclb90pek6.R.inc(105972);list.add(new EuclideanIntegerPoint(new int[] {  2,  2 }));
        __CLR4_4_129rc29rclb90pek6.R.inc(105973);list.add(new EuclideanIntegerPoint(new int[] {  3,  3 }));
        __CLR4_4_129rc29rclb90pek6.R.inc(105974);list.add(new EuclideanIntegerPoint(new int[] {  2,  4 }));
        __CLR4_4_129rc29rclb90pek6.R.inc(105975);EuclideanIntegerPoint c = list.get(0).centroidOf(list);
        __CLR4_4_129rc29rclb90pek6.R.inc(105976);Assert.assertEquals(2, c.getPoint()[0]);
        __CLR4_4_129rc29rclb90pek6.R.inc(105977);Assert.assertEquals(3, c.getPoint()[1]);
    }finally{__CLR4_4_129rc29rclb90pek6.R.flushNeeded();}}

    @Test
    public void testSerial() {__CLR4_4_129rc29rclb90pek6.R.globalSliceStart(getClass().getName(),105978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv29ru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129rc29rclb90pek6.R.rethrow($CLV_t2$);}finally{__CLR4_4_129rc29rclb90pek6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.EuclideanIntegerPointTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv29ru(){try{__CLR4_4_129rc29rclb90pek6.R.inc(105978);
        __CLR4_4_129rc29rclb90pek6.R.inc(105979);EuclideanIntegerPoint p = new EuclideanIntegerPoint(new int[] { -3, -2, -1, 0, 1 });
        __CLR4_4_129rc29rclb90pek6.R.inc(105980);Assert.assertEquals(p, TestUtils.serializeAndRecover(p));
    }finally{__CLR4_4_129rc29rclb90pek6.R.flushNeeded();}}

}
