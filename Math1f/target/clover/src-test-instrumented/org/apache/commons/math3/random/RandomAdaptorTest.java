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

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the RandomAdaptor class
 *
 * @version $Id$
 */

public class RandomAdaptorTest {static class __CLR4_4_127m127m1lb90pe9b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,103218,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testAdaptor() {__CLR4_4_127m127m1lb90pe9b.R.globalSliceStart(getClass().getName(),103177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177l5yy27m1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127m127m1lb90pe9b.R.rethrow($CLV_t2$);}finally{__CLR4_4_127m127m1lb90pe9b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomAdaptorTest.testAdaptor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177l5yy27m1(){try{__CLR4_4_127m127m1lb90pe9b.R.inc(103177);
        __CLR4_4_127m127m1lb90pe9b.R.inc(103178);ConstantGenerator generator = new ConstantGenerator();
        __CLR4_4_127m127m1lb90pe9b.R.inc(103179);Random random = RandomAdaptor.createAdaptor(generator);
        __CLR4_4_127m127m1lb90pe9b.R.inc(103180);checkConstant(random);
        __CLR4_4_127m127m1lb90pe9b.R.inc(103181);RandomAdaptor randomAdaptor = new RandomAdaptor(generator);
        __CLR4_4_127m127m1lb90pe9b.R.inc(103182);checkConstant(randomAdaptor);
    }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

    private void checkConstant(Random random) {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103183);
        __CLR4_4_127m127m1lb90pe9b.R.inc(103184);byte[] bytes = new byte[] {0};
        __CLR4_4_127m127m1lb90pe9b.R.inc(103185);random.nextBytes(bytes);
        __CLR4_4_127m127m1lb90pe9b.R.inc(103186);Assert.assertEquals(0, bytes[0]);
        __CLR4_4_127m127m1lb90pe9b.R.inc(103187);Assert.assertFalse(random.nextBoolean());
        __CLR4_4_127m127m1lb90pe9b.R.inc(103188);Assert.assertEquals(0, random.nextDouble(), 0);
        __CLR4_4_127m127m1lb90pe9b.R.inc(103189);Assert.assertEquals(0, random.nextFloat(), 0);
        __CLR4_4_127m127m1lb90pe9b.R.inc(103190);Assert.assertEquals(0, random.nextGaussian(), 0);
        __CLR4_4_127m127m1lb90pe9b.R.inc(103191);Assert.assertEquals(0, random.nextInt());
        __CLR4_4_127m127m1lb90pe9b.R.inc(103192);Assert.assertEquals(0, random.nextInt(1));
        __CLR4_4_127m127m1lb90pe9b.R.inc(103193);Assert.assertEquals(0, random.nextLong());
        __CLR4_4_127m127m1lb90pe9b.R.inc(103194);random.setSeed(100);
        __CLR4_4_127m127m1lb90pe9b.R.inc(103195);Assert.assertEquals(0, random.nextDouble(), 0);
    }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

    /*
     * "Constant" generator to test Adaptor delegation.
     * "Powered by Eclipse ;-)"
     *
     */
    public static class ConstantGenerator implements RandomGenerator {
        
        private final double value;
        
        public ConstantGenerator() {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103196);
            __CLR4_4_127m127m1lb90pe9b.R.inc(103197);value = 0;
        }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}
        
        public ConstantGenerator(double value) {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103198);
            __CLR4_4_127m127m1lb90pe9b.R.inc(103199);this.value = value;
        }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

        public boolean nextBoolean() {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103200);
            __CLR4_4_127m127m1lb90pe9b.R.inc(103201);return false;
        }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

        public void nextBytes(byte[] bytes) {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103202);
        }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

        public double nextDouble() {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103203);
            __CLR4_4_127m127m1lb90pe9b.R.inc(103204);return value;
        }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

        public float nextFloat() {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103205);
            __CLR4_4_127m127m1lb90pe9b.R.inc(103206);return (float) value;
        }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

        public double nextGaussian() {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103207);
            __CLR4_4_127m127m1lb90pe9b.R.inc(103208);return value;
        }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

        public int nextInt() {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103209);
            __CLR4_4_127m127m1lb90pe9b.R.inc(103210);return (int) value;
        }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

        public int nextInt(int n) {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103211);
            __CLR4_4_127m127m1lb90pe9b.R.inc(103212);return (int) value;
        }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

        public long nextLong() {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103213);
            __CLR4_4_127m127m1lb90pe9b.R.inc(103214);return (int) value;
        }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

        public void setSeed(int seed) {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103215);
        }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

        public void setSeed(int[] seed) {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103216);
        }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

        public void setSeed(long seed) {try{__CLR4_4_127m127m1lb90pe9b.R.inc(103217);
        }finally{__CLR4_4_127m127m1lb90pe9b.R.flushNeeded();}}

    }
}
