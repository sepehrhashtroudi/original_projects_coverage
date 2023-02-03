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

package org.apache.commons.math3.linear;

import java.util.Iterator;

import org.apache.commons.math3.linear.RealVector.Entry;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests for {@link RealVector}.
 */
public class RealVectorTest extends RealVectorAbstractTest{static class __CLR4_4_11wgk1wgklb90pdc1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,88769,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public RealVector create(final double[] data) {try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88724);
        __CLR4_4_11wgk1wgklb90pdc1.R.inc(88725);return new RealVectorTestImpl(data);
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement append(RealVector).")
    @Override
    public void testAppendVector() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qori1i1wgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testAppendVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qori1i1wgm(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88726);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement append(double)")
    @Override
    public void testAppendScalar() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8ft0f1wgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testAppendScalar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8ft0f1wgn(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88727);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement getSubvector(int, int)")
    @Override
    public void testGetSubVector() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1v7ra1wgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testGetSubVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1v7ra1wgo(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88728);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement getSubvector(int, int)")
    @Override
    public void testGetSubVectorInvalidIndex1() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bdlbb61wgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testGetSubVectorInvalidIndex1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bdlbb61wgp(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88729);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement getSubvector(int, int)")
    @Override
    public void testGetSubVectorInvalidIndex2() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184lcip1wgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testGetSubVectorInvalidIndex2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184lcip1wgq(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88730);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement getSubvector(int, int)")
    @Override
    public void testGetSubVectorInvalidIndex3() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vldq81wgr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testGetSubVectorInvalidIndex3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vldq81wgr(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88731);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement getSubvector(int, int)")
    @Override
    public void testGetSubVectorInvalidIndex4() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mlexr1wgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testGetSubVectorInvalidIndex4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mlexr1wgs(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88732);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement setSubvector(int, RealVector)")
    @Override
    public void testSetSubVectorSameType() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1532qli1wgt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testSetSubVectorSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1532qli1wgt(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88733);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement setSubvector(int, RealVector)")
    @Override
    public void testSetSubVectorMixedType() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecu77b1wgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testSetSubVectorMixedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecu77b1wgu(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88734);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement setSubvector(int, RealVector)")
    @Override
    public void testSetSubVectorInvalidIndex1() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11svdo61wgv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testSetSubVectorInvalidIndex1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11svdo61wgv(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88735);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement setSubvector(int, RealVector)")
    @Override
    public void testSetSubVectorInvalidIndex2() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11g4l4b1wgw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testSetSubVectorInvalidIndex2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11g4l4b1wgw(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88736);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement setSubvector(int, RealVector)")
    @Override
    public void testSetSubVectorInvalidIndex3() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14p4jws1wgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testSetSubVectorInvalidIndex3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14p4jws1wgx(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88737);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement isNaN()")
    @Override
    public void testIsNaN() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z6qlqy1wgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testIsNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z6qlqy1wgy(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88738);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement isNaN()")
    @Override
    public void testIsInfinite() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1587wev1wgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testIsInfinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1587wev1wgz(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88739);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement ebeMultiply(RealVector)")
    @Override
    public void testEbeMultiplySameType() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ay6bmn1wh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testEbeMultiplySameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ay6bmn1wh0(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88740);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement ebeMultiply(RealVector)")
    @Override
    public void testEbeMultiplyMixedTypes() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11o22ox1wh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testEbeMultiplyMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11o22ox1wh1(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88741);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement ebeMultiply(RealVector)")
    @Override
    public void testEbeMultiplyDimensionMismatch() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15s0jpd1wh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testEbeMultiplyDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15s0jpd1wh2(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88742);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement ebeDivide(RealVector)")
    @Override
    public void testEbeDivideSameType() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16c3q5m1wh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testEbeDivideSameType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16c3q5m1wh3(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88743);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement ebeDivide(RealVector)")
    @Override
    public void testEbeDivideMixedTypes() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rm9qdw1wh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testEbeDivideMixedTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rm9qdw1wh4(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88744);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement ebeDivide(RealVector)")
    @Override
    public void testEbeDivideDimensionMismatch() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5d9v01wh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testEbeDivideDimensionMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5d9v01wh5(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88745);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement getL1Norm()")
    @Override
    public void testGetL1Norm() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghr6bw1wh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testGetL1Norm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghr6bw1wh6(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88746);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not implement getLInfNorm()")
    @Override
    public void testGetLInfNorm() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gnwys1wh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testGetLInfNorm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gnwys1wh7(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88747);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    public void testSparseIterator() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmkbmh1wh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testSparseIterator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmkbmh1wh8(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88748);
        /*
         * For non-default values, use x + 1, x + 2, etc... to make sure that
         * these values are really different from x.
         */
        __CLR4_4_11wgk1wgklb90pdc1.R.inc(88749);final double x = getPreferredEntryValue();
        __CLR4_4_11wgk1wgklb90pdc1.R.inc(88750);final double[] data = {
            x, x + 1d, x, x, x + 2d, x + 3d, x + 4d, x, x, x, x + 5d, x + 6d, x
        };

        __CLR4_4_11wgk1wgklb90pdc1.R.inc(88751);RealVector v = create(data);
        __CLR4_4_11wgk1wgklb90pdc1.R.inc(88752);Entry e;
        __CLR4_4_11wgk1wgklb90pdc1.R.inc(88753);int i = 0;
        __CLR4_4_11wgk1wgklb90pdc1.R.inc(88754);final double[] nonDefault = {
            x + 1d, x + 2d, x + 3d, x + 4d, x + 5d, x + 6d
        };
        __CLR4_4_11wgk1wgklb90pdc1.R.inc(88755);for (Iterator<Entry> it = v.sparseIterator(); (((it.hasNext())&&(__CLR4_4_11wgk1wgklb90pdc1.R.iget(88756)!=0|true))||(__CLR4_4_11wgk1wgklb90pdc1.R.iget(88757)==0&false)); i++) {{
            __CLR4_4_11wgk1wgklb90pdc1.R.inc(88758);e = it.next();
            __CLR4_4_11wgk1wgklb90pdc1.R.inc(88759);Assert.assertEquals(nonDefault[i], e.getValue(), 0);
        }
        }__CLR4_4_11wgk1wgklb90pdc1.R.inc(88760);double [] onlyOne = {x, x + 1d, x};
        __CLR4_4_11wgk1wgklb90pdc1.R.inc(88761);v = create(onlyOne);
        __CLR4_4_11wgk1wgklb90pdc1.R.inc(88762);for(Iterator<Entry> it = v.sparseIterator(); (((it.hasNext())&&(__CLR4_4_11wgk1wgklb90pdc1.R.iget(88763)!=0|true))||(__CLR4_4_11wgk1wgklb90pdc1.R.iget(88764)==0&false)); ) {{
            __CLR4_4_11wgk1wgklb90pdc1.R.inc(88765);e = it.next();
            __CLR4_4_11wgk1wgklb90pdc1.R.inc(88766);Assert.assertEquals(onlyOne[1], e.getValue(), 0);
        }
    }}finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector is not serializable.")
    @Override
    public void testSerial() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv1whr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv1whr(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88767);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}

    @Test
    @Ignore("Abstract class RealVector does not override equals(Object).")
    @Override
    public void testEquals() {__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceStart(getClass().getName(),88768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6081whs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wgk1wgklb90pdc1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wgk1wgklb90pdc1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RealVectorTest.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6081whs(){try{__CLR4_4_11wgk1wgklb90pdc1.R.inc(88768);
        // Do nothing
    }finally{__CLR4_4_11wgk1wgklb90pdc1.R.flushNeeded();}}
}
