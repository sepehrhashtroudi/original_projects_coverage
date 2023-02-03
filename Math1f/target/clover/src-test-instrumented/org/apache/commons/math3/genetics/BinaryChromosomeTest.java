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
package org.apache.commons.math3.genetics;


import org.junit.Assert;
import org.junit.Test;

public class BinaryChromosomeTest {static class __CLR4_4_11nma1nmalb90pcnq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,77289,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testInvalidConstructor() {__CLR4_4_11nma1nmalb90pcnq.R.globalSliceStart(getClass().getName(),77266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5ddpg1nma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nma1nmalb90pcnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nma1nmalb90pcnq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.BinaryChromosomeTest.testInvalidConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5ddpg1nma(){try{__CLR4_4_11nma1nmalb90pcnq.R.inc(77266);
        __CLR4_4_11nma1nmalb90pcnq.R.inc(77267);Integer[][] reprs = new Integer[][] {
                new Integer[] {0,1,0,1,2},
                new Integer[] {0,1,0,1,-1}
        };

        __CLR4_4_11nma1nmalb90pcnq.R.inc(77268);for (Integer[] repr : reprs) {{
            __CLR4_4_11nma1nmalb90pcnq.R.inc(77269);try {
                __CLR4_4_11nma1nmalb90pcnq.R.inc(77270);new DummyBinaryChromosome(repr);
                __CLR4_4_11nma1nmalb90pcnq.R.inc(77271);Assert.fail("Exception not caught");
            } catch (IllegalArgumentException e) {
                // Expected
            }
        }
    }}finally{__CLR4_4_11nma1nmalb90pcnq.R.flushNeeded();}}

    @Test
    public void testRandomConstructor() {__CLR4_4_11nma1nmalb90pcnq.R.globalSliceStart(getClass().getName(),77272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fn34wk1nmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nma1nmalb90pcnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nma1nmalb90pcnq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.BinaryChromosomeTest.testRandomConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fn34wk1nmg(){try{__CLR4_4_11nma1nmalb90pcnq.R.inc(77272);
        __CLR4_4_11nma1nmalb90pcnq.R.inc(77273);for (int i=0; (((i<20)&&(__CLR4_4_11nma1nmalb90pcnq.R.iget(77274)!=0|true))||(__CLR4_4_11nma1nmalb90pcnq.R.iget(77275)==0&false)); i++) {{
            __CLR4_4_11nma1nmalb90pcnq.R.inc(77276);new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(10));
        }
    }}finally{__CLR4_4_11nma1nmalb90pcnq.R.flushNeeded();}}

    @Test
    public void testIsSame() {__CLR4_4_11nma1nmalb90pcnq.R.globalSliceStart(getClass().getName(),77277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17rl0d31nml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nma1nmalb90pcnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nma1nmalb90pcnq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.BinaryChromosomeTest.testIsSame",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17rl0d31nml(){try{__CLR4_4_11nma1nmalb90pcnq.R.inc(77277);
        __CLR4_4_11nma1nmalb90pcnq.R.inc(77278);Chromosome c1 = new DummyBinaryChromosome(new Integer[] {0,1,0,1,0,1});
        __CLR4_4_11nma1nmalb90pcnq.R.inc(77279);Chromosome c2 = new DummyBinaryChromosome(new Integer[] {0,1,1,0,1});
        __CLR4_4_11nma1nmalb90pcnq.R.inc(77280);Chromosome c3 = new DummyBinaryChromosome(new Integer[] {0,1,0,1,0,1,1});
        __CLR4_4_11nma1nmalb90pcnq.R.inc(77281);Chromosome c4 = new DummyBinaryChromosome(new Integer[] {1,1,0,1,0,1});
        __CLR4_4_11nma1nmalb90pcnq.R.inc(77282);Chromosome c5 = new DummyBinaryChromosome(new Integer[] {0,1,0,1,0,0});
        __CLR4_4_11nma1nmalb90pcnq.R.inc(77283);Chromosome c6 = new DummyBinaryChromosome(new Integer[] {0,1,0,1,0,1});

        __CLR4_4_11nma1nmalb90pcnq.R.inc(77284);Assert.assertFalse(c1.isSame(c2));
        __CLR4_4_11nma1nmalb90pcnq.R.inc(77285);Assert.assertFalse(c1.isSame(c3));
        __CLR4_4_11nma1nmalb90pcnq.R.inc(77286);Assert.assertFalse(c1.isSame(c4));
        __CLR4_4_11nma1nmalb90pcnq.R.inc(77287);Assert.assertFalse(c1.isSame(c5));
        __CLR4_4_11nma1nmalb90pcnq.R.inc(77288);Assert.assertTrue(c1.isSame(c6));
    }finally{__CLR4_4_11nma1nmalb90pcnq.R.flushNeeded();}}

}
