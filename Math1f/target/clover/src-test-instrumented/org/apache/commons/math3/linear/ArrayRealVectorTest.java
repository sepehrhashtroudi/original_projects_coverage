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

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link ArrayRealVector} class.
 *
 * @version $Id$
 */
public class ArrayRealVectorTest extends RealVectorAbstractTest {static class __CLR4_4_11riy1riylb90pd04{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,82426,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    @Override
    public RealVector create(final double[] data) {try{__CLR4_4_11riy1riylb90pd04.R.inc(82330);
        __CLR4_4_11riy1riylb90pd04.R.inc(82331);return new ArrayRealVector(data, true);
    }finally{__CLR4_4_11riy1riylb90pd04.R.flushNeeded();}}

    @Test
    public void testConstructors() {__CLR4_4_11riy1riylb90pd04.R.globalSliceStart(getClass().getName(),82332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwxahe1rj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11riy1riylb90pd04.R.rethrow($CLV_t2$);}finally{__CLR4_4_11riy1riylb90pd04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ArrayRealVectorTest.testConstructors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwxahe1rj0(){try{__CLR4_4_11riy1riylb90pd04.R.inc(82332);
        __CLR4_4_11riy1riylb90pd04.R.inc(82333);final double[] vec1 = {1d, 2d, 3d};
        __CLR4_4_11riy1riylb90pd04.R.inc(82334);final double[] vec3 = {7d, 8d, 9d};
        __CLR4_4_11riy1riylb90pd04.R.inc(82335);final double[] vec4 = {1d, 2d, 3d, 4d, 5d, 6d, 7d, 8d, 9d};
        __CLR4_4_11riy1riylb90pd04.R.inc(82336);final Double[] dvec1 = {1d, 2d, 3d, 4d, 5d, 6d, 7d, 8d, 9d};

        __CLR4_4_11riy1riylb90pd04.R.inc(82337);ArrayRealVector v0 = new ArrayRealVector();
        __CLR4_4_11riy1riylb90pd04.R.inc(82338);Assert.assertEquals("testData len", 0, v0.getDimension());

        __CLR4_4_11riy1riylb90pd04.R.inc(82339);ArrayRealVector v1 = new ArrayRealVector(7);
        __CLR4_4_11riy1riylb90pd04.R.inc(82340);Assert.assertEquals("testData len", 7, v1.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82341);Assert.assertEquals("testData is 0.0 ", 0.0, v1.getEntry(6), 0);

        __CLR4_4_11riy1riylb90pd04.R.inc(82342);ArrayRealVector v2 = new ArrayRealVector(5, 1.23);
        __CLR4_4_11riy1riylb90pd04.R.inc(82343);Assert.assertEquals("testData len", 5, v2.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82344);Assert.assertEquals("testData is 1.23 ", 1.23, v2.getEntry(4), 0);

        __CLR4_4_11riy1riylb90pd04.R.inc(82345);ArrayRealVector v3 = new ArrayRealVector(vec1);
        __CLR4_4_11riy1riylb90pd04.R.inc(82346);Assert.assertEquals("testData len", 3, v3.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82347);Assert.assertEquals("testData is 2.0 ", 2.0, v3.getEntry(1), 0);

        __CLR4_4_11riy1riylb90pd04.R.inc(82348);ArrayRealVector v3_bis = new ArrayRealVector(vec1, true);
        __CLR4_4_11riy1riylb90pd04.R.inc(82349);Assert.assertEquals("testData len", 3, v3_bis.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82350);Assert.assertEquals("testData is 2.0 ", 2.0, v3_bis.getEntry(1), 0);
        __CLR4_4_11riy1riylb90pd04.R.inc(82351);Assert.assertNotSame(v3_bis.getDataRef(), vec1);
        __CLR4_4_11riy1riylb90pd04.R.inc(82352);Assert.assertNotSame(v3_bis.toArray(), vec1);

        __CLR4_4_11riy1riylb90pd04.R.inc(82353);ArrayRealVector v3_ter = new ArrayRealVector(vec1, false);
        __CLR4_4_11riy1riylb90pd04.R.inc(82354);Assert.assertEquals("testData len", 3, v3_ter.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82355);Assert.assertEquals("testData is 2.0 ", 2.0, v3_ter.getEntry(1), 0);
        __CLR4_4_11riy1riylb90pd04.R.inc(82356);Assert.assertSame(v3_ter.getDataRef(), vec1);
        __CLR4_4_11riy1riylb90pd04.R.inc(82357);Assert.assertNotSame(v3_ter.toArray(), vec1);

        __CLR4_4_11riy1riylb90pd04.R.inc(82358);ArrayRealVector v4 = new ArrayRealVector(vec4, 3, 2);
        __CLR4_4_11riy1riylb90pd04.R.inc(82359);Assert.assertEquals("testData len", 2, v4.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82360);Assert.assertEquals("testData is 4.0 ", 4.0, v4.getEntry(0), 0);
        __CLR4_4_11riy1riylb90pd04.R.inc(82361);try {
            __CLR4_4_11riy1riylb90pd04.R.inc(82362);new ArrayRealVector(vec4, 8, 3);
            __CLR4_4_11riy1riylb90pd04.R.inc(82363);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // expected behavior
        }

        __CLR4_4_11riy1riylb90pd04.R.inc(82364);RealVector v5_i = new ArrayRealVector(dvec1);
        __CLR4_4_11riy1riylb90pd04.R.inc(82365);Assert.assertEquals("testData len", 9, v5_i.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82366);Assert.assertEquals("testData is 9.0 ", 9.0, v5_i.getEntry(8), 0);

        __CLR4_4_11riy1riylb90pd04.R.inc(82367);ArrayRealVector v5 = new ArrayRealVector(dvec1);
        __CLR4_4_11riy1riylb90pd04.R.inc(82368);Assert.assertEquals("testData len", 9, v5.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82369);Assert.assertEquals("testData is 9.0 ", 9.0, v5.getEntry(8), 0);

        __CLR4_4_11riy1riylb90pd04.R.inc(82370);ArrayRealVector v6 = new ArrayRealVector(dvec1, 3, 2);
        __CLR4_4_11riy1riylb90pd04.R.inc(82371);Assert.assertEquals("testData len", 2, v6.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82372);Assert.assertEquals("testData is 4.0 ", 4.0, v6.getEntry(0), 0);
        __CLR4_4_11riy1riylb90pd04.R.inc(82373);try {
            __CLR4_4_11riy1riylb90pd04.R.inc(82374);new ArrayRealVector(dvec1, 8, 3);
            __CLR4_4_11riy1riylb90pd04.R.inc(82375);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // expected behavior
        }

        __CLR4_4_11riy1riylb90pd04.R.inc(82376);ArrayRealVector v7 = new ArrayRealVector(v1);
        __CLR4_4_11riy1riylb90pd04.R.inc(82377);Assert.assertEquals("testData len", 7, v7.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82378);Assert.assertEquals("testData is 0.0 ", 0.0, v7.getEntry(6), 0);

        __CLR4_4_11riy1riylb90pd04.R.inc(82379);RealVectorTestImpl v7_i = new RealVectorTestImpl(vec1);

        __CLR4_4_11riy1riylb90pd04.R.inc(82380);ArrayRealVector v7_2 = new ArrayRealVector(v7_i);
        __CLR4_4_11riy1riylb90pd04.R.inc(82381);Assert.assertEquals("testData len", 3, v7_2.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82382);Assert.assertEquals("testData is 0.0 ", 2.0d, v7_2.getEntry(1), 0);

        __CLR4_4_11riy1riylb90pd04.R.inc(82383);ArrayRealVector v8 = new ArrayRealVector(v1, true);
        __CLR4_4_11riy1riylb90pd04.R.inc(82384);Assert.assertEquals("testData len", 7, v8.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82385);Assert.assertEquals("testData is 0.0 ", 0.0, v8.getEntry(6), 0);
        __CLR4_4_11riy1riylb90pd04.R.inc(82386);Assert.assertNotSame("testData not same object ", v1.getDataRef(), v8.getDataRef());

        __CLR4_4_11riy1riylb90pd04.R.inc(82387);ArrayRealVector v8_2 = new ArrayRealVector(v1, false);
        __CLR4_4_11riy1riylb90pd04.R.inc(82388);Assert.assertEquals("testData len", 7, v8_2.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82389);Assert.assertEquals("testData is 0.0 ", 0.0, v8_2.getEntry(6), 0);
        __CLR4_4_11riy1riylb90pd04.R.inc(82390);Assert.assertEquals("testData same object ", v1.getDataRef(), v8_2.getDataRef());

        __CLR4_4_11riy1riylb90pd04.R.inc(82391);ArrayRealVector v9 = new ArrayRealVector(v1, v3);
        __CLR4_4_11riy1riylb90pd04.R.inc(82392);Assert.assertEquals("testData len", 10, v9.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82393);Assert.assertEquals("testData is 1.0 ", 1.0, v9.getEntry(7), 0);

        __CLR4_4_11riy1riylb90pd04.R.inc(82394);ArrayRealVector v10 = new ArrayRealVector(v2, new RealVectorTestImpl(vec3));
        __CLR4_4_11riy1riylb90pd04.R.inc(82395);Assert.assertEquals("testData len", 8, v10.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82396);Assert.assertEquals("testData is 1.23 ", 1.23, v10.getEntry(4), 0);
        __CLR4_4_11riy1riylb90pd04.R.inc(82397);Assert.assertEquals("testData is 7.0 ", 7.0, v10.getEntry(5), 0);

        __CLR4_4_11riy1riylb90pd04.R.inc(82398);ArrayRealVector v11 = new ArrayRealVector(new RealVectorTestImpl(vec3), v2);
        __CLR4_4_11riy1riylb90pd04.R.inc(82399);Assert.assertEquals("testData len", 8, v11.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82400);Assert.assertEquals("testData is 9.0 ", 9.0, v11.getEntry(2), 0);
        __CLR4_4_11riy1riylb90pd04.R.inc(82401);Assert.assertEquals("testData is 1.23 ", 1.23, v11.getEntry(3), 0);

        __CLR4_4_11riy1riylb90pd04.R.inc(82402);ArrayRealVector v12 = new ArrayRealVector(v2, vec3);
        __CLR4_4_11riy1riylb90pd04.R.inc(82403);Assert.assertEquals("testData len", 8, v12.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82404);Assert.assertEquals("testData is 1.23 ", 1.23, v12.getEntry(4), 0);
        __CLR4_4_11riy1riylb90pd04.R.inc(82405);Assert.assertEquals("testData is 7.0 ", 7.0, v12.getEntry(5), 0);

        __CLR4_4_11riy1riylb90pd04.R.inc(82406);ArrayRealVector v13 = new ArrayRealVector(vec3, v2);
        __CLR4_4_11riy1riylb90pd04.R.inc(82407);Assert.assertEquals("testData len", 8, v13.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82408);Assert.assertEquals("testData is 9.0 ", 9.0, v13.getEntry(2), 0);
        __CLR4_4_11riy1riylb90pd04.R.inc(82409);Assert.assertEquals("testData is 1.23 ", 1.23, v13.getEntry(3), 0);

        __CLR4_4_11riy1riylb90pd04.R.inc(82410);ArrayRealVector v14 = new ArrayRealVector(vec3, vec4);
        __CLR4_4_11riy1riylb90pd04.R.inc(82411);Assert.assertEquals("testData len", 12, v14.getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82412);Assert.assertEquals("testData is 9.0 ", 9.0, v14.getEntry(2), 0);
        __CLR4_4_11riy1riylb90pd04.R.inc(82413);Assert.assertEquals("testData is 1.0 ", 1.0, v14.getEntry(3), 0);

    }finally{__CLR4_4_11riy1riylb90pd04.R.flushNeeded();}}

    @Test
    public void testGetDataRef() {__CLR4_4_11riy1riylb90pd04.R.globalSliceStart(getClass().getName(),82414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yo8zbo1rla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11riy1riylb90pd04.R.rethrow($CLV_t2$);}finally{__CLR4_4_11riy1riylb90pd04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ArrayRealVectorTest.testGetDataRef",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yo8zbo1rla(){try{__CLR4_4_11riy1riylb90pd04.R.inc(82414);
        __CLR4_4_11riy1riylb90pd04.R.inc(82415);final double[] data = {1d, 2d, 3d, 4d};
        __CLR4_4_11riy1riylb90pd04.R.inc(82416);final ArrayRealVector v = new ArrayRealVector(data);
        __CLR4_4_11riy1riylb90pd04.R.inc(82417);v.getDataRef()[0] = 0d;
        __CLR4_4_11riy1riylb90pd04.R.inc(82418);Assert.assertEquals("", 0d, v.getEntry(0), 0);
    }finally{__CLR4_4_11riy1riylb90pd04.R.flushNeeded();}}

    @Test
    public void testPredicates() {__CLR4_4_11riy1riylb90pd04.R.globalSliceStart(getClass().getName(),82419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svs9ez1rlf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11riy1riylb90pd04.R.rethrow($CLV_t2$);}finally{__CLR4_4_11riy1riylb90pd04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ArrayRealVectorTest.testPredicates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svs9ez1rlf(){try{__CLR4_4_11riy1riylb90pd04.R.inc(82419);

        __CLR4_4_11riy1riylb90pd04.R.inc(82420);Assert.assertEquals(create(new double[] { Double.NaN, 1, 2 }).hashCode(),
                     create(new double[] { 0, Double.NaN, 2 }).hashCode());

        __CLR4_4_11riy1riylb90pd04.R.inc(82421);Assert.assertTrue(create(new double[] { Double.NaN, 1, 2 }).hashCode() !=
                   create(new double[] { 0, 1, 2 }).hashCode());
    }finally{__CLR4_4_11riy1riylb90pd04.R.flushNeeded();}}

    @Test
    public void testZeroVectors() {__CLR4_4_11riy1riylb90pd04.R.globalSliceStart(getClass().getName(),82422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xq6fdp1rli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11riy1riylb90pd04.R.rethrow($CLV_t2$);}finally{__CLR4_4_11riy1riylb90pd04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ArrayRealVectorTest.testZeroVectors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xq6fdp1rli(){try{__CLR4_4_11riy1riylb90pd04.R.inc(82422);
        __CLR4_4_11riy1riylb90pd04.R.inc(82423);Assert.assertEquals(0, new ArrayRealVector(new double[0]).getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82424);Assert.assertEquals(0, new ArrayRealVector(new double[0], true).getDimension());
        __CLR4_4_11riy1riylb90pd04.R.inc(82425);Assert.assertEquals(0, new ArrayRealVector(new double[0], false).getDimension());
    }finally{__CLR4_4_11riy1riylb90pd04.R.flushNeeded();}}
}
