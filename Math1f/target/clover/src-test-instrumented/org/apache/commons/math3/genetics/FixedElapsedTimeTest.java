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

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class FixedElapsedTimeTest {static class __CLR4_4_11ntz1ntzlb90pcoc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,77568,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testIsSatisfied() {__CLR4_4_11ntz1ntzlb90pcoc.R.globalSliceStart(getClass().getName(),77543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129w66b1ntz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ntz1ntzlb90pcoc.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ntz1ntzlb90pcoc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.FixedElapsedTimeTest.testIsSatisfied",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129w66b1ntz(){try{__CLR4_4_11ntz1ntzlb90pcoc.R.inc(77543);
        __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77544);final Population pop = new Population() {
            public void addChromosome(final Chromosome chromosome) {try{__CLR4_4_11ntz1ntzlb90pcoc.R.inc(77545);
                // unimportant
            }finally{__CLR4_4_11ntz1ntzlb90pcoc.R.flushNeeded();}}
            public Chromosome getFittestChromosome() {try{__CLR4_4_11ntz1ntzlb90pcoc.R.inc(77546);
                // unimportant
                __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77547);return null;
            }finally{__CLR4_4_11ntz1ntzlb90pcoc.R.flushNeeded();}}
            public int getPopulationLimit() {try{__CLR4_4_11ntz1ntzlb90pcoc.R.inc(77548);
                // unimportant
                __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77549);return 0;
            }finally{__CLR4_4_11ntz1ntzlb90pcoc.R.flushNeeded();}}
            public int getPopulationSize() {try{__CLR4_4_11ntz1ntzlb90pcoc.R.inc(77550);
                // unimportant
                __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77551);return 0;
            }finally{__CLR4_4_11ntz1ntzlb90pcoc.R.flushNeeded();}}
            public Population nextGeneration() {try{__CLR4_4_11ntz1ntzlb90pcoc.R.inc(77552);
                // unimportant
                __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77553);return null;
            }finally{__CLR4_4_11ntz1ntzlb90pcoc.R.flushNeeded();}}
            public Iterator<Chromosome> iterator() {try{__CLR4_4_11ntz1ntzlb90pcoc.R.inc(77554);
                // unimportant
                __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77555);return null;
            }finally{__CLR4_4_11ntz1ntzlb90pcoc.R.flushNeeded();}}
        };

        __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77556);final long start = System.nanoTime();
        __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77557);final long duration = 3;
        __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77558);final FixedElapsedTime tec = new FixedElapsedTime(duration, TimeUnit.SECONDS);

        __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77559);while ((((!tec.isSatisfied(pop))&&(__CLR4_4_11ntz1ntzlb90pcoc.R.iget(77560)!=0|true))||(__CLR4_4_11ntz1ntzlb90pcoc.R.iget(77561)==0&false))) {{
            __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77562);try {
                __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77563);Thread.sleep(50);
            } catch (InterruptedException e) {
                // ignore
            }
        }

        }__CLR4_4_11ntz1ntzlb90pcoc.R.inc(77564);final long end = System.nanoTime();
        __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77565);final long elapsedTime = end - start;
        __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77566);final long diff = FastMath.abs(elapsedTime - TimeUnit.SECONDS.toNanos(duration));

        __CLR4_4_11ntz1ntzlb90pcoc.R.inc(77567);Assert.assertTrue(diff < TimeUnit.MILLISECONDS.toNanos(100));
    }finally{__CLR4_4_11ntz1ntzlb90pcoc.R.flushNeeded();}}
}
