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
package org.apache.commons.math3.random;

import org.junit.Assert;

import java.io.InputStream;

import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Before;
import org.junit.Test;

public class SobolSequenceGeneratorTest {static class __CLR4_4_128ks28kslb90peah{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,104463,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double[][] referenceValues = {
            { 0.0, 0.0, 0.0 },
            { 0.5, 0.5, 0.5 },
            { 0.75, 0.25, 0.25 },
            { 0.25, 0.75, 0.75 },
            { 0.375, 0.375, 0.625 },
            { 0.875, 0.875, 0.125 },
            { 0.625, 0.125, 0.875 },
            { 0.125, 0.625, 0.375 },
            { 0.1875, 0.3125, 0.9375 },
            { 0.6875, 0.8125, 0.4375 }
    };

    private SobolSequenceGenerator generator;

    @Before
    public void setUp() {try{__CLR4_4_128ks28kslb90peah.R.inc(104428);
        __CLR4_4_128ks28kslb90peah.R.inc(104429);generator = new SobolSequenceGenerator(3);
    }finally{__CLR4_4_128ks28kslb90peah.R.flushNeeded();}}

    @Test
    public void test3DReference() {__CLR4_4_128ks28kslb90peah.R.globalSliceStart(getClass().getName(),104430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hk36b528ku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128ks28kslb90peah.R.rethrow($CLV_t2$);}finally{__CLR4_4_128ks28kslb90peah.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.SobolSequenceGeneratorTest.test3DReference",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hk36b528ku(){try{__CLR4_4_128ks28kslb90peah.R.inc(104430);
        __CLR4_4_128ks28kslb90peah.R.inc(104431);for (int i = 0; (((i < referenceValues.length)&&(__CLR4_4_128ks28kslb90peah.R.iget(104432)!=0|true))||(__CLR4_4_128ks28kslb90peah.R.iget(104433)==0&false)); i++) {{
            __CLR4_4_128ks28kslb90peah.R.inc(104434);double[] result = generator.nextVector();
            __CLR4_4_128ks28kslb90peah.R.inc(104435);Assert.assertArrayEquals(referenceValues[i], result, 1e-6);
            __CLR4_4_128ks28kslb90peah.R.inc(104436);Assert.assertEquals(i + 1, generator.getNextIndex());
        }
    }}finally{__CLR4_4_128ks28kslb90peah.R.flushNeeded();}}
    
    @Test
    public void testConstructor() {__CLR4_4_128ks28kslb90peah.R.globalSliceStart(getClass().getName(),104437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h28l1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128ks28kslb90peah.R.rethrow($CLV_t2$);}finally{__CLR4_4_128ks28kslb90peah.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.SobolSequenceGeneratorTest.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h28l1(){try{__CLR4_4_128ks28kslb90peah.R.inc(104437);
        __CLR4_4_128ks28kslb90peah.R.inc(104438);try {
            __CLR4_4_128ks28kslb90peah.R.inc(104439);new SobolSequenceGenerator(0);
            __CLR4_4_128ks28kslb90peah.R.inc(104440);Assert.fail("an exception should have been thrown");
        } catch (OutOfRangeException e) {
            // expected
        }
        
        __CLR4_4_128ks28kslb90peah.R.inc(104441);try {
            __CLR4_4_128ks28kslb90peah.R.inc(104442);new SobolSequenceGenerator(1001);
            __CLR4_4_128ks28kslb90peah.R.inc(104443);Assert.fail("an exception should have been thrown");
        } catch (OutOfRangeException e) {
            // expected
        }
    }finally{__CLR4_4_128ks28kslb90peah.R.flushNeeded();}}

    @Test
    public void testConstructor2() throws Exception{__CLR4_4_128ks28kslb90peah.R.globalSliceStart(getClass().getName(),104444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrbn0128l8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128ks28kslb90peah.R.rethrow($CLV_t2$);}finally{__CLR4_4_128ks28kslb90peah.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.SobolSequenceGeneratorTest.testConstructor2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrbn0128l8() throws Exception{try{__CLR4_4_128ks28kslb90peah.R.inc(104444);
        __CLR4_4_128ks28kslb90peah.R.inc(104445);try {
            __CLR4_4_128ks28kslb90peah.R.inc(104446);final String RESOURCE_NAME = "/assets/org/apache/commons/math3/random/new-joe-kuo-6.1000";
            __CLR4_4_128ks28kslb90peah.R.inc(104447);final InputStream is = getClass().getResourceAsStream(RESOURCE_NAME);
            __CLR4_4_128ks28kslb90peah.R.inc(104448);new SobolSequenceGenerator(1001, is);
            __CLR4_4_128ks28kslb90peah.R.inc(104449);Assert.fail("an exception should have been thrown");
        } catch (OutOfRangeException e) {
            // expected
        }
        
        __CLR4_4_128ks28kslb90peah.R.inc(104450);try {
            __CLR4_4_128ks28kslb90peah.R.inc(104451);new SobolSequenceGenerator(1001);
            __CLR4_4_128ks28kslb90peah.R.inc(104452);Assert.fail("an exception should have been thrown");
        } catch (OutOfRangeException e) {
            // expected
        }
    }finally{__CLR4_4_128ks28kslb90peah.R.flushNeeded();}}

    @Test
    public void testSkip() {__CLR4_4_128ks28kslb90peah.R.globalSliceStart(getClass().getName(),104453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfeamw28lh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128ks28kslb90peah.R.rethrow($CLV_t2$);}finally{__CLR4_4_128ks28kslb90peah.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.SobolSequenceGeneratorTest.testSkip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfeamw28lh(){try{__CLR4_4_128ks28kslb90peah.R.inc(104453);
        __CLR4_4_128ks28kslb90peah.R.inc(104454);double[] result = generator.skipTo(5);
        __CLR4_4_128ks28kslb90peah.R.inc(104455);Assert.assertArrayEquals(referenceValues[5], result, 1e-6);
        __CLR4_4_128ks28kslb90peah.R.inc(104456);Assert.assertEquals(6, generator.getNextIndex());
        
        __CLR4_4_128ks28kslb90peah.R.inc(104457);for (int i = 6; (((i < referenceValues.length)&&(__CLR4_4_128ks28kslb90peah.R.iget(104458)!=0|true))||(__CLR4_4_128ks28kslb90peah.R.iget(104459)==0&false)); i++) {{
            __CLR4_4_128ks28kslb90peah.R.inc(104460);result = generator.nextVector();
            __CLR4_4_128ks28kslb90peah.R.inc(104461);Assert.assertArrayEquals(referenceValues[i], result, 1e-6);
            __CLR4_4_128ks28kslb90peah.R.inc(104462);Assert.assertEquals(i + 1, generator.getNextIndex());
        }
    }}finally{__CLR4_4_128ks28kslb90peah.R.flushNeeded();}}

}
