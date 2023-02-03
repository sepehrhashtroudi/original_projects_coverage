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


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ChromosomeTest {static class __CLR4_4_11nnd1nndlb90pcnu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,77350,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCompareTo() {__CLR4_4_11nnd1nndlb90pcnu.R.globalSliceStart(getClass().getName(),77305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfv1nnd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nnd1nndlb90pcnu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nnd1nndlb90pcnu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ChromosomeTest.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfv1nnd(){try{__CLR4_4_11nnd1nndlb90pcnu.R.inc(77305);
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77306);Chromosome c1 = new Chromosome() {
            public double fitness() {try{__CLR4_4_11nnd1nndlb90pcnu.R.inc(77307);
                __CLR4_4_11nnd1nndlb90pcnu.R.inc(77308);return 0;
            }finally{__CLR4_4_11nnd1nndlb90pcnu.R.flushNeeded();}}
        };
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77309);Chromosome c2 = new Chromosome() {
            public double fitness() {try{__CLR4_4_11nnd1nndlb90pcnu.R.inc(77310);
                __CLR4_4_11nnd1nndlb90pcnu.R.inc(77311);return 10;
            }finally{__CLR4_4_11nnd1nndlb90pcnu.R.flushNeeded();}}
        };
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77312);Chromosome c3 = new Chromosome() {
            public double fitness() {try{__CLR4_4_11nnd1nndlb90pcnu.R.inc(77313);
                __CLR4_4_11nnd1nndlb90pcnu.R.inc(77314);return 10;
            }finally{__CLR4_4_11nnd1nndlb90pcnu.R.flushNeeded();}}
        };

        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77315);Assert.assertTrue(c1.compareTo(c2) < 0);
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77316);Assert.assertTrue(c2.compareTo(c1) > 0);
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77317);Assert.assertEquals(0,c3.compareTo(c2));
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77318);Assert.assertEquals(0,c2.compareTo(c3));
    }finally{__CLR4_4_11nnd1nndlb90pcnu.R.flushNeeded();}}

    private abstract static class DummyChromosome extends Chromosome {
        private final int repr;

        public DummyChromosome(final int repr) {try{__CLR4_4_11nnd1nndlb90pcnu.R.inc(77319);
            __CLR4_4_11nnd1nndlb90pcnu.R.inc(77320);this.repr = repr;
        }finally{__CLR4_4_11nnd1nndlb90pcnu.R.flushNeeded();}}
        @Override
        protected boolean isSame(Chromosome another) {try{__CLR4_4_11nnd1nndlb90pcnu.R.inc(77321);
            __CLR4_4_11nnd1nndlb90pcnu.R.inc(77322);return ((DummyChromosome) another).repr == repr;
        }finally{__CLR4_4_11nnd1nndlb90pcnu.R.flushNeeded();}}
    }

    @Test
    public void testFindSameChromosome() {__CLR4_4_11nnd1nndlb90pcnu.R.globalSliceStart(getClass().getName(),77323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x41fjk1nnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nnd1nndlb90pcnu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nnd1nndlb90pcnu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ChromosomeTest.testFindSameChromosome",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x41fjk1nnv(){try{__CLR4_4_11nnd1nndlb90pcnu.R.inc(77323);
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77324);Chromosome c1 = new DummyChromosome(1) {
            public double fitness() {try{__CLR4_4_11nnd1nndlb90pcnu.R.inc(77325);
                __CLR4_4_11nnd1nndlb90pcnu.R.inc(77326);return 1;
            }finally{__CLR4_4_11nnd1nndlb90pcnu.R.flushNeeded();}}
        };
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77327);Chromosome c2 = new DummyChromosome(2) {
            public double fitness() {try{__CLR4_4_11nnd1nndlb90pcnu.R.inc(77328);
                __CLR4_4_11nnd1nndlb90pcnu.R.inc(77329);return 2;
            }finally{__CLR4_4_11nnd1nndlb90pcnu.R.flushNeeded();}}
        };
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77330);Chromosome c3 = new DummyChromosome(3) {
            public double fitness() {try{__CLR4_4_11nnd1nndlb90pcnu.R.inc(77331);
                __CLR4_4_11nnd1nndlb90pcnu.R.inc(77332);return 3;
            }finally{__CLR4_4_11nnd1nndlb90pcnu.R.flushNeeded();}}
        };
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77333);Chromosome c4 = new DummyChromosome(1) {
            public double fitness() {try{__CLR4_4_11nnd1nndlb90pcnu.R.inc(77334);
                __CLR4_4_11nnd1nndlb90pcnu.R.inc(77335);return 5;
            }finally{__CLR4_4_11nnd1nndlb90pcnu.R.flushNeeded();}}
        };
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77336);Chromosome c5 = new DummyChromosome(15) {
            public double fitness() {try{__CLR4_4_11nnd1nndlb90pcnu.R.inc(77337);
                __CLR4_4_11nnd1nndlb90pcnu.R.inc(77338);return 15;
            }finally{__CLR4_4_11nnd1nndlb90pcnu.R.flushNeeded();}}
        };

        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77339);List<Chromosome> popChr = new ArrayList<Chromosome>();
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77340);popChr.add(c1);
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77341);popChr.add(c2);
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77342);popChr.add(c3);
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77343);Population pop = new ListPopulation(popChr,3) {
            public Population nextGeneration() {try{__CLR4_4_11nnd1nndlb90pcnu.R.inc(77344);
                // not important
                __CLR4_4_11nnd1nndlb90pcnu.R.inc(77345);return null;
            }finally{__CLR4_4_11nnd1nndlb90pcnu.R.flushNeeded();}}
        };

        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77346);Assert.assertNull(c5.findSameChromosome(pop));
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77347);Assert.assertEquals(c1, c4.findSameChromosome(pop));

        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77348);c4.searchForFitnessUpdate(pop);
        __CLR4_4_11nnd1nndlb90pcnu.R.inc(77349);Assert.assertEquals(1, c4.getFitness(),0);
    }finally{__CLR4_4_11nnd1nndlb90pcnu.R.flushNeeded();}}

}

