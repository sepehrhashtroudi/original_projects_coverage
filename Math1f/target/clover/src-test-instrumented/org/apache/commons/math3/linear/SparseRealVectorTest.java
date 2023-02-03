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

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test cases for the {@link OpenMapRealVector} class.
 *
 * @version $Id$
 */
public class SparseRealVectorTest extends RealVectorAbstractTest {static class __CLR4_4_11xc91xc9lb90pdeh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,89907,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public RealVector create(double[] data) {try{__CLR4_4_11xc91xc9lb90pdeh.R.inc(89865);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89866);return new OpenMapRealVector(data);
    }finally{__CLR4_4_11xc91xc9lb90pdeh.R.flushNeeded();}}

    @Test
    public void testConstructors() {__CLR4_4_11xc91xc9lb90pdeh.R.globalSliceStart(getClass().getName(),89867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwxahe1xcb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xc91xc9lb90pdeh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xc91xc9lb90pdeh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealVectorTest.testConstructors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwxahe1xcb(){try{__CLR4_4_11xc91xc9lb90pdeh.R.inc(89867);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89868);final double[] vec1 = {1d, 2d, 3d};
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89869);final Double[] dvec1 = {1d, 2d, 3d, 4d, 5d, 6d, 7d, 8d, 9d};

        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89870);OpenMapRealVector v0 = new OpenMapRealVector();
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89871);Assert.assertEquals("testData len", 0, v0.getDimension());

        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89872);OpenMapRealVector v1 = new OpenMapRealVector(7);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89873);Assert.assertEquals("testData len", 7, v1.getDimension());
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89874);Assert.assertEquals("testData is 0.0 ", 0.0, v1.getEntry(6), 0);

        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89875);OpenMapRealVector v3 = new OpenMapRealVector(vec1);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89876);Assert.assertEquals("testData len", 3, v3.getDimension());
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89877);Assert.assertEquals("testData is 2.0 ", 2.0, v3.getEntry(1), 0);

        //SparseRealVector v4 = new SparseRealVector(vec4, 3, 2);
        //Assert.assertEquals("testData len", 2, v4.getDimension());
        //Assert.assertEquals("testData is 4.0 ", 4.0, v4.getEntry(0));
        //try {
        //    new SparseRealVector(vec4, 8, 3);
        //    Assert.fail("MathIllegalArgumentException expected");
        //} catch (MathIllegalArgumentException ex) {
            // expected behavior
        //}

        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89878);RealVector v5_i = new OpenMapRealVector(dvec1);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89879);Assert.assertEquals("testData len", 9, v5_i.getDimension());
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89880);Assert.assertEquals("testData is 9.0 ", 9.0, v5_i.getEntry(8), 0);

        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89881);OpenMapRealVector v5 = new OpenMapRealVector(dvec1);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89882);Assert.assertEquals("testData len", 9, v5.getDimension());
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89883);Assert.assertEquals("testData is 9.0 ", 9.0, v5.getEntry(8), 0);

        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89884);OpenMapRealVector v7 = new OpenMapRealVector(v1);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89885);Assert.assertEquals("testData len", 7, v7.getDimension());
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89886);Assert.assertEquals("testData is 0.0 ", 0.0, v7.getEntry(6), 0);

        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89887);RealVectorTestImpl v7_i = new RealVectorTestImpl(vec1);

        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89888);OpenMapRealVector v7_2 = new OpenMapRealVector(v7_i);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89889);Assert.assertEquals("testData len", 3, v7_2.getDimension());
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89890);Assert.assertEquals("testData is 0.0 ", 2.0d, v7_2.getEntry(1), 0);

        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89891);OpenMapRealVector v8 = new OpenMapRealVector(v1);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89892);Assert.assertEquals("testData len", 7, v8.getDimension());
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89893);Assert.assertEquals("testData is 0.0 ", 0.0, v8.getEntry(6), 0);

    }finally{__CLR4_4_11xc91xc9lb90pdeh.R.flushNeeded();}}

    /* Check that the operations do not throw an exception (cf. MATH-645). */
    @Test
    public void testConcurrentModification() {__CLR4_4_11xc91xc9lb90pdeh.R.globalSliceStart(getClass().getName(),89894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yw09bo1xd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xc91xc9lb90pdeh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xc91xc9lb90pdeh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealVectorTest.testConcurrentModification",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yw09bo1xd2(){try{__CLR4_4_11xc91xc9lb90pdeh.R.inc(89894);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89895);final RealVector u = new OpenMapRealVector(3, 1e-6);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89896);u.setEntry(0, 1);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89897);u.setEntry(1, 0);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89898);u.setEntry(2, 2);

        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89899);final RealVector v1 = new OpenMapRealVector(3, 1e-6);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89900);v1.setEntry(0, 0);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89901);v1.setEntry(1, 3);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89902);v1.setEntry(2, 0);

        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89903);u.ebeMultiply(v1);
        __CLR4_4_11xc91xc9lb90pdeh.R.inc(89904);u.ebeDivide(v1);
    }finally{__CLR4_4_11xc91xc9lb90pdeh.R.flushNeeded();}}

    /**
     * XXX This test is disabled because it currently fails.
     * The bug must still be fixed in the sparse vector implementation.
     * When this is done, this override should be deleted.
     */
    @Test
    @Override
    @Ignore("This test is skipped until MATH-821 is fixed")
    public void testMap() {__CLR4_4_11xc91xc9lb90pdeh.R.globalSliceStart(getClass().getName(),89905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r37vjl1xdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xc91xc9lb90pdeh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xc91xc9lb90pdeh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealVectorTest.testMap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r37vjl1xdd(){try{__CLR4_4_11xc91xc9lb90pdeh.R.inc(89905);}finally{__CLR4_4_11xc91xc9lb90pdeh.R.flushNeeded();}}

    /**
     * XXX This test is disabled because it currently fails.
     * The bug must still be fixed in the sparse vector implementation.
     * When this is done, this override should be deleted.
     */
    @Test
    @Override
    @Ignore("This test is skipped until MATH-821 is fixed")
    public void testMapToSelf() {__CLR4_4_11xc91xc9lb90pdeh.R.globalSliceStart(getClass().getName(),89906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1khtnc81xde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xc91xc9lb90pdeh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xc91xc9lb90pdeh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealVectorTest.testMapToSelf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1khtnc81xde(){try{__CLR4_4_11xc91xc9lb90pdeh.R.inc(89906);}finally{__CLR4_4_11xc91xc9lb90pdeh.R.flushNeeded();}}
}
