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

import java.util.List;

import org.apache.commons.math3.geometry.euclidean.oned.Interval;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

public class IntervalsSetTest {static class __CLR4_4_11o9o1o9olb90pcpj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,78161,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testInterval() {__CLR4_4_11o9o1o9olb90pcpj.R.globalSliceStart(getClass().getName(),78108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p0y7tu1o9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o9o1o9olb90pcpj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o9o1o9olb90pcpj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.oned.IntervalsSetTest.testInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p0y7tu1o9o(){try{__CLR4_4_11o9o1o9olb90pcpj.R.inc(78108);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78109);IntervalsSet set = new IntervalsSet(2.3, 5.7);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78110);Assert.assertEquals(3.4, set.getSize(), 1.0e-10);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78111);Assert.assertEquals(4.0, ((Vector1D) set.getBarycenter()).getX(), 1.0e-10);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78112);Assert.assertEquals(Region.Location.BOUNDARY, set.checkPoint(new Vector1D(2.3)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78113);Assert.assertEquals(Region.Location.BOUNDARY, set.checkPoint(new Vector1D(5.7)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78114);Assert.assertEquals(Region.Location.OUTSIDE,  set.checkPoint(new Vector1D(1.2)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78115);Assert.assertEquals(Region.Location.OUTSIDE,  set.checkPoint(new Vector1D(8.7)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78116);Assert.assertEquals(Region.Location.INSIDE,   set.checkPoint(new Vector1D(3.0)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78117);Assert.assertEquals(2.3, set.getInf(), 1.0e-10);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78118);Assert.assertEquals(5.7, set.getSup(), 1.0e-10);
    }finally{__CLR4_4_11o9o1o9olb90pcpj.R.flushNeeded();}}

    @Test
    public void testInfinite() {__CLR4_4_11o9o1o9olb90pcpj.R.globalSliceStart(getClass().getName(),78119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1foyoc31o9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o9o1o9olb90pcpj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o9o1o9olb90pcpj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.oned.IntervalsSetTest.testInfinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1foyoc31o9z(){try{__CLR4_4_11o9o1o9olb90pcpj.R.inc(78119);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78120);IntervalsSet set = new IntervalsSet(9.0, Double.POSITIVE_INFINITY);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78121);Assert.assertEquals(Region.Location.BOUNDARY, set.checkPoint(new Vector1D(9.0)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78122);Assert.assertEquals(Region.Location.OUTSIDE,  set.checkPoint(new Vector1D(8.4)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78123);for (double e = 1.0; (((e <= 6.0)&&(__CLR4_4_11o9o1o9olb90pcpj.R.iget(78124)!=0|true))||(__CLR4_4_11o9o1o9olb90pcpj.R.iget(78125)==0&false)); e += 1.0) {{
            __CLR4_4_11o9o1o9olb90pcpj.R.inc(78126);Assert.assertEquals(Region.Location.INSIDE,
                                set.checkPoint(new Vector1D(FastMath.pow(10.0, e))));
        }
        }__CLR4_4_11o9o1o9olb90pcpj.R.inc(78127);Assert.assertTrue(Double.isInfinite(set.getSize()));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78128);Assert.assertEquals(9.0, set.getInf(), 1.0e-10);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78129);Assert.assertTrue(Double.isInfinite(set.getSup()));

        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78130);set = (IntervalsSet) new RegionFactory<Euclidean1D>().getComplement(set);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78131);Assert.assertEquals(9.0, set.getSup(), 1.0e-10);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78132);Assert.assertTrue(Double.isInfinite(set.getInf()));

    }finally{__CLR4_4_11o9o1o9olb90pcpj.R.flushNeeded();}}

    @Test
    public void testMultiple() {__CLR4_4_11o9o1o9olb90pcpj.R.globalSliceStart(getClass().getName(),78133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pj8bhz1oad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o9o1o9olb90pcpj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o9o1o9olb90pcpj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.oned.IntervalsSetTest.testMultiple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pj8bhz1oad(){try{__CLR4_4_11o9o1o9olb90pcpj.R.inc(78133);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78134);RegionFactory<Euclidean1D> factory = new RegionFactory<Euclidean1D>();
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78135);IntervalsSet set = (IntervalsSet)
        factory.intersection(factory.union(factory.difference(new IntervalsSet(1.0, 6.0),
                                                              new IntervalsSet(3.0, 5.0)),
                                                              new IntervalsSet(9.0, Double.POSITIVE_INFINITY)),
                                                              new IntervalsSet(Double.NEGATIVE_INFINITY, 11.0));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78136);Assert.assertEquals(5.0, set.getSize(), 1.0e-10);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78137);Assert.assertEquals(5.9, ((Vector1D) set.getBarycenter()).getX(), 1.0e-10);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78138);Assert.assertEquals(Region.Location.OUTSIDE,  set.checkPoint(new Vector1D(0.0)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78139);Assert.assertEquals(Region.Location.OUTSIDE,  set.checkPoint(new Vector1D(4.0)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78140);Assert.assertEquals(Region.Location.OUTSIDE,  set.checkPoint(new Vector1D(8.0)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78141);Assert.assertEquals(Region.Location.OUTSIDE,  set.checkPoint(new Vector1D(12.0)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78142);Assert.assertEquals(Region.Location.INSIDE,   set.checkPoint(new Vector1D(1.2)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78143);Assert.assertEquals(Region.Location.INSIDE,   set.checkPoint(new Vector1D(5.9)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78144);Assert.assertEquals(Region.Location.INSIDE,   set.checkPoint(new Vector1D(9.01)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78145);Assert.assertEquals(Region.Location.BOUNDARY, set.checkPoint(new Vector1D(5.0)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78146);Assert.assertEquals(Region.Location.BOUNDARY, set.checkPoint(new Vector1D(11.0)));
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78147);Assert.assertEquals( 1.0, set.getInf(), 1.0e-10);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78148);Assert.assertEquals(11.0, set.getSup(), 1.0e-10);

        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78149);List<Interval> list = set.asList();
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78150);Assert.assertEquals(3, list.size());
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78151);Assert.assertEquals( 1.0, list.get(0).getInf(), 1.0e-10);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78152);Assert.assertEquals( 3.0, list.get(0).getSup(), 1.0e-10);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78153);Assert.assertEquals( 5.0, list.get(1).getInf(), 1.0e-10);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78154);Assert.assertEquals( 6.0, list.get(1).getSup(), 1.0e-10);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78155);Assert.assertEquals( 9.0, list.get(2).getInf(), 1.0e-10);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78156);Assert.assertEquals(11.0, list.get(2).getSup(), 1.0e-10);

    }finally{__CLR4_4_11o9o1o9olb90pcpj.R.flushNeeded();}}

    @Test
    public void testSinglePoint() {__CLR4_4_11o9o1o9olb90pcpj.R.globalSliceStart(getClass().getName(),78157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fuy9tv1ob1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o9o1o9olb90pcpj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o9o1o9olb90pcpj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.oned.IntervalsSetTest.testSinglePoint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fuy9tv1ob1(){try{__CLR4_4_11o9o1o9olb90pcpj.R.inc(78157);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78158);IntervalsSet set = new IntervalsSet(1.0, 1.0);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78159);Assert.assertEquals(0.0, set.getSize(), Precision.SAFE_MIN);
        __CLR4_4_11o9o1o9olb90pcpj.R.inc(78160);Assert.assertEquals(1.0, ((Vector1D) set.getBarycenter()).getX(), Precision.EPSILON);
    }finally{__CLR4_4_11o9o1o9olb90pcpj.R.flushNeeded();}}

}
