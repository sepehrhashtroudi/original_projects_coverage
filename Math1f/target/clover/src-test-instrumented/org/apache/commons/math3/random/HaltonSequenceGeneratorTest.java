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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Before;
import org.junit.Test;

public class HaltonSequenceGeneratorTest {static class __CLR4_4_127jt27jtlb90pe6q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,103141,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double[][] referenceValues = {
            { 0.0,    0.0,    0.0  },
            { 0.5,    0.6667, 0.6  },
            { 0.25,   0.3333, 0.2  },
            { 0.75,   0.2223, 0.8  },
            { 0.125,  0.8888, 0.4  },
            { 0.625,  0.5555, 0.12 },
            { 0.375,  0.1111, 0.72 },
            { 0.875,  0.7777, 0.32 },
            { 0.0625, 0.4444, 0.92 },
            { 0.5625, 0.0740, 0.52 }
    };

    private double[][] referenceValuesUnscrambled = {
            { 0.0,    0.0    },
            { 0.5,    0.3333 },
            { 0.25,   0.6666 },
            { 0.75,   0.1111 },
            { 0.125,  0.4444 },
            { 0.625,  0.7777 },
            { 0.375,  0.2222 },
            { 0.875,  0.5555 },
            { 0.0625, 0.8888 },
            { 0.5625, 0.0370 }
    };

    private HaltonSequenceGenerator generator;

    @Before
    public void setUp() {try{__CLR4_4_127jt27jtlb90pe6q.R.inc(103097);
        __CLR4_4_127jt27jtlb90pe6q.R.inc(103098);generator = new HaltonSequenceGenerator(3);
    }finally{__CLR4_4_127jt27jtlb90pe6q.R.flushNeeded();}}

    @Test
    public void test3DReference() {__CLR4_4_127jt27jtlb90pe6q.R.globalSliceStart(getClass().getName(),103099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hk36b527jv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127jt27jtlb90pe6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_127jt27jtlb90pe6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.HaltonSequenceGeneratorTest.test3DReference",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hk36b527jv(){try{__CLR4_4_127jt27jtlb90pe6q.R.inc(103099);
        __CLR4_4_127jt27jtlb90pe6q.R.inc(103100);for (int i = 0; (((i < referenceValues.length)&&(__CLR4_4_127jt27jtlb90pe6q.R.iget(103101)!=0|true))||(__CLR4_4_127jt27jtlb90pe6q.R.iget(103102)==0&false)); i++) {{
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103103);double[] result = generator.nextVector();
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103104);Assert.assertArrayEquals(referenceValues[i], result, 1e-3);
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103105);Assert.assertEquals(i + 1, generator.getNextIndex());
        }
    }}finally{__CLR4_4_127jt27jtlb90pe6q.R.flushNeeded();}}

    @Test
    public void test2DUnscrambledReference() {__CLR4_4_127jt27jtlb90pe6q.R.globalSliceStart(getClass().getName(),103106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4ltew27k2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127jt27jtlb90pe6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_127jt27jtlb90pe6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.HaltonSequenceGeneratorTest.test2DUnscrambledReference",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4ltew27k2(){try{__CLR4_4_127jt27jtlb90pe6q.R.inc(103106);
        __CLR4_4_127jt27jtlb90pe6q.R.inc(103107);generator = new HaltonSequenceGenerator(2, new int[] {2, 3}, null);
        __CLR4_4_127jt27jtlb90pe6q.R.inc(103108);for (int i = 0; (((i < referenceValuesUnscrambled.length)&&(__CLR4_4_127jt27jtlb90pe6q.R.iget(103109)!=0|true))||(__CLR4_4_127jt27jtlb90pe6q.R.iget(103110)==0&false)); i++) {{
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103111);double[] result = generator.nextVector();
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103112);Assert.assertArrayEquals(referenceValuesUnscrambled[i], result, 1e-3);
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103113);Assert.assertEquals(i + 1, generator.getNextIndex());
        }
    }}finally{__CLR4_4_127jt27jtlb90pe6q.R.flushNeeded();}}

    @Test
    public void testConstructor() {__CLR4_4_127jt27jtlb90pe6q.R.globalSliceStart(getClass().getName(),103114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h27ka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127jt27jtlb90pe6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_127jt27jtlb90pe6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.HaltonSequenceGeneratorTest.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h27ka(){try{__CLR4_4_127jt27jtlb90pe6q.R.inc(103114);
        __CLR4_4_127jt27jtlb90pe6q.R.inc(103115);try {
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103116);new HaltonSequenceGenerator(0);
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103117);Assert.fail("an exception should have been thrown");
        } catch (OutOfRangeException e) {
            // expected
        }
        
        __CLR4_4_127jt27jtlb90pe6q.R.inc(103118);try {
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103119);new HaltonSequenceGenerator(41);
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103120);Assert.fail("an exception should have been thrown");
        } catch (OutOfRangeException e) {
            // expected
        }
    }finally{__CLR4_4_127jt27jtlb90pe6q.R.flushNeeded();}}

    @Test
    public void testConstructor2() throws Exception{__CLR4_4_127jt27jtlb90pe6q.R.globalSliceStart(getClass().getName(),103121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrbn0127kh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127jt27jtlb90pe6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_127jt27jtlb90pe6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.HaltonSequenceGeneratorTest.testConstructor2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrbn0127kh() throws Exception{try{__CLR4_4_127jt27jtlb90pe6q.R.inc(103121);
        __CLR4_4_127jt27jtlb90pe6q.R.inc(103122);try {
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103123);new HaltonSequenceGenerator(2, new int[] { 1 }, null);
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103124);Assert.fail("an exception should have been thrown");
        } catch (OutOfRangeException e) {
            // expected
        }

        __CLR4_4_127jt27jtlb90pe6q.R.inc(103125);try {
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103126);new HaltonSequenceGenerator(2, null, null);
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103127);Assert.fail("an exception should have been thrown");
        } catch (NullArgumentException e) {
            // expected
        }

        __CLR4_4_127jt27jtlb90pe6q.R.inc(103128);try {
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103129);new HaltonSequenceGenerator(2, new int[] { 1, 1 }, new int[] { 1 });
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103130);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // expected
        }
    }finally{__CLR4_4_127jt27jtlb90pe6q.R.flushNeeded();}}

    @Test
    public void testSkip() {__CLR4_4_127jt27jtlb90pe6q.R.globalSliceStart(getClass().getName(),103131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfeamw27kr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127jt27jtlb90pe6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_127jt27jtlb90pe6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.HaltonSequenceGeneratorTest.testSkip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfeamw27kr(){try{__CLR4_4_127jt27jtlb90pe6q.R.inc(103131);
        __CLR4_4_127jt27jtlb90pe6q.R.inc(103132);double[] result = generator.skipTo(5);
        __CLR4_4_127jt27jtlb90pe6q.R.inc(103133);Assert.assertArrayEquals(referenceValues[5], result, 1e-3);
        __CLR4_4_127jt27jtlb90pe6q.R.inc(103134);Assert.assertEquals(6, generator.getNextIndex());
        
        __CLR4_4_127jt27jtlb90pe6q.R.inc(103135);for (int i = 6; (((i < referenceValues.length)&&(__CLR4_4_127jt27jtlb90pe6q.R.iget(103136)!=0|true))||(__CLR4_4_127jt27jtlb90pe6q.R.iget(103137)==0&false)); i++) {{
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103138);result = generator.nextVector();
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103139);Assert.assertArrayEquals(referenceValues[i], result, 1e-3);
            __CLR4_4_127jt27jtlb90pe6q.R.inc(103140);Assert.assertEquals(i + 1, generator.getNextIndex());
        }
    }}finally{__CLR4_4_127jt27jtlb90pe6q.R.flushNeeded();}}

}
