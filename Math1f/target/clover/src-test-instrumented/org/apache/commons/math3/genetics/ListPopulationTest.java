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
import java.util.Iterator;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.junit.Assert;
import org.junit.Test;

public class ListPopulationTest {static class __CLR4_4_11nx31nx3lb90pcon{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,77750,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testGetFittestChromosome() {__CLR4_4_11nx31nx3lb90pcon.R.globalSliceStart(getClass().getName(),77655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fgz3oe1nx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nx31nx3lb90pcon.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nx31nx3lb90pcon.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ListPopulationTest.testGetFittestChromosome",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fgz3oe1nx3(){try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77655);
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77656);Chromosome c1 = new Chromosome() {
            public double fitness() {try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77657);
                __CLR4_4_11nx31nx3lb90pcon.R.inc(77658);return 0;
            }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
        };
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77659);Chromosome c2 = new Chromosome() {
            public double fitness() {try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77660);
                __CLR4_4_11nx31nx3lb90pcon.R.inc(77661);return 10;
            }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
        };
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77662);Chromosome c3 = new Chromosome() {
            public double fitness() {try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77663);
                __CLR4_4_11nx31nx3lb90pcon.R.inc(77664);return 15;
            }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
        };

        __CLR4_4_11nx31nx3lb90pcon.R.inc(77665);ArrayList<Chromosome> chromosomes = new ArrayList<Chromosome> ();
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77666);chromosomes.add(c1);
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77667);chromosomes.add(c2);
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77668);chromosomes.add(c3);

        __CLR4_4_11nx31nx3lb90pcon.R.inc(77669);ListPopulation population = new ListPopulation(chromosomes, 10) {
            public Population nextGeneration() {try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77670);
                // not important
                __CLR4_4_11nx31nx3lb90pcon.R.inc(77671);return null;
            }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
        };

        __CLR4_4_11nx31nx3lb90pcon.R.inc(77672);Assert.assertEquals(c3, population.getFittestChromosome());
    }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
    
    @Test
    public void testChromosomes() {__CLR4_4_11nx31nx3lb90pcon.R.globalSliceStart(getClass().getName(),77673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1imgbw01nxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nx31nx3lb90pcon.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nx31nx3lb90pcon.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ListPopulationTest.testChromosomes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1imgbw01nxl(){try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77673);
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77674);final ArrayList<Chromosome> chromosomes = new ArrayList<Chromosome> ();
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77675);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77676);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77677);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));        

        __CLR4_4_11nx31nx3lb90pcon.R.inc(77678);final ListPopulation population = new ListPopulation(10) {
            public Population nextGeneration() {try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77679);
                // not important
                __CLR4_4_11nx31nx3lb90pcon.R.inc(77680);return null;
            }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
        };
        
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77681);population.addChromosomes(chromosomes);

        __CLR4_4_11nx31nx3lb90pcon.R.inc(77682);Assert.assertEquals(chromosomes, population.getChromosomes());
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77683);Assert.assertEquals(chromosomes.toString(), population.toString());
        
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77684);population.setPopulationLimit(50);
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77685);Assert.assertEquals(50, population.getPopulationLimit());
    }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
    
    @Test(expected = NotPositiveException.class)
    public void testSetPopulationLimit() {__CLR4_4_11nx31nx3lb90pcon.R.globalSliceStart(getClass().getName(),77686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17w6d231nxy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,80,111,112,117,108,97,116,105,111,110,76,105,109,105,116,58,32,91,78,111,116,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nx31nx3lb90pcon.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nx31nx3lb90pcon.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ListPopulationTest.testSetPopulationLimit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17w6d231nxy(){try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77686);
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77687);final ListPopulation population = new ListPopulation(10) {
            public Population nextGeneration() {try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77688);
                // not important
                __CLR4_4_11nx31nx3lb90pcon.R.inc(77689);return null;
            }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
        };
        
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77690);population.setPopulationLimit(-50);
    }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}

    @Test(expected = NotPositiveException.class)
    public void testConstructorPopulationLimitNotPositive() {__CLR4_4_11nx31nx3lb90pcon.R.globalSliceStart(getClass().getName(),77691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18p11e51ny3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,80,111,112,117,108,97,116,105,111,110,76,105,109,105,116,78,111,116,80,111,115,105,116,105,118,101,58,32,91,78,111,116,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nx31nx3lb90pcon.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nx31nx3lb90pcon.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ListPopulationTest.testConstructorPopulationLimitNotPositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18p11e51ny3(){try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77691);
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77692);new ListPopulation(-10) {
            public Population nextGeneration() {try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77693);
                // not important
                __CLR4_4_11nx31nx3lb90pcon.R.inc(77694);return null;
            }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
        };
    }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}

    @Test(expected = NotPositiveException.class)
    public void testChromosomeListConstructorPopulationLimitNotPositive() {__CLR4_4_11nx31nx3lb90pcon.R.globalSliceStart(getClass().getName(),77695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x635rr1ny7();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,104,114,111,109,111,115,111,109,101,76,105,115,116,67,111,110,115,116,114,117,99,116,111,114,80,111,112,117,108,97,116,105,111,110,76,105,109,105,116,78,111,116,80,111,115,105,116,105,118,101,58,32,91,78,111,116,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nx31nx3lb90pcon.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nx31nx3lb90pcon.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ListPopulationTest.testChromosomeListConstructorPopulationLimitNotPositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x635rr1ny7(){try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77695);
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77696);final ArrayList<Chromosome> chromosomes = new ArrayList<Chromosome> ();
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77697);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77698);new ListPopulation(chromosomes, -10) {
            public Population nextGeneration() {try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77699);
                // not important
                __CLR4_4_11nx31nx3lb90pcon.R.inc(77700);return null;
            }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
        };
    }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorListOfChromosomesBiggerThanPopulationSize() {__CLR4_4_11nx31nx3lb90pcon.R.globalSliceStart(getClass().getName(),77701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1smeleg1nyd();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,76,105,115,116,79,102,67,104,114,111,109,111,115,111,109,101,115,66,105,103,103,101,114,84,104,97,110,80,111,112,117,108,97,116,105,111,110,83,105,122,101,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nx31nx3lb90pcon.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nx31nx3lb90pcon.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ListPopulationTest.testConstructorListOfChromosomesBiggerThanPopulationSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1smeleg1nyd(){try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77701);
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77702);final ArrayList<Chromosome> chromosomes = new ArrayList<Chromosome> ();
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77703);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77704);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77705);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));        
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77706);new ListPopulation(chromosomes, 1) {
            public Population nextGeneration() {try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77707);
                // not important
                __CLR4_4_11nx31nx3lb90pcon.R.inc(77708);return null;
            }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
        };
    }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
    
    @Test(expected=NumberIsTooLargeException.class)
    public void testAddTooManyChromosomes() {__CLR4_4_11nx31nx3lb90pcon.R.globalSliceStart(getClass().getName(),77709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17lhg0y1nyl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,84,111,111,77,97,110,121,67,104,114,111,109,111,115,111,109,101,115,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nx31nx3lb90pcon.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nx31nx3lb90pcon.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ListPopulationTest.testAddTooManyChromosomes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17lhg0y1nyl(){try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77709);
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77710);final ArrayList<Chromosome> chromosomes = new ArrayList<Chromosome> ();
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77711);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77712);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77713);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));

        __CLR4_4_11nx31nx3lb90pcon.R.inc(77714);final ListPopulation population = new ListPopulation(2) {
            public Population nextGeneration() {try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77715);
                // not important
                __CLR4_4_11nx31nx3lb90pcon.R.inc(77716);return null;
            }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
        };
        
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77717);population.addChromosomes(chromosomes);
    }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
    
    @Test(expected=NumberIsTooLargeException.class)
    public void testAddTooManyChromosomesSingleCall() {__CLR4_4_11nx31nx3lb90pcon.R.globalSliceStart(getClass().getName(),77718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11h8jr81nyu();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,84,111,111,77,97,110,121,67,104,114,111,109,111,115,111,109,101,115,83,105,110,103,108,101,67,97,108,108,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nx31nx3lb90pcon.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nx31nx3lb90pcon.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ListPopulationTest.testAddTooManyChromosomesSingleCall",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11h8jr81nyu(){try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77718);

        __CLR4_4_11nx31nx3lb90pcon.R.inc(77719);final ListPopulation population = new ListPopulation(2) {
            public Population nextGeneration() {try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77720);
                // not important
                __CLR4_4_11nx31nx3lb90pcon.R.inc(77721);return null;
            }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
        };

        __CLR4_4_11nx31nx3lb90pcon.R.inc(77722);for (int i = 0; (((i <= population.getPopulationLimit())&&(__CLR4_4_11nx31nx3lb90pcon.R.iget(77723)!=0|true))||(__CLR4_4_11nx31nx3lb90pcon.R.iget(77724)==0&false)); i++) {{
            __CLR4_4_11nx31nx3lb90pcon.R.inc(77725);population.addChromosome(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));
        }
    }}finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
    
    @Test(expected = UnsupportedOperationException.class)
    public void testIterator() {__CLR4_4_11nx31nx3lb90pcon.R.globalSliceStart(getClass().getName(),77726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9uicn1nz2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,116,101,114,97,116,111,114,58,32,91,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof UnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nx31nx3lb90pcon.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nx31nx3lb90pcon.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ListPopulationTest.testIterator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9uicn1nz2(){try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77726);
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77727);final ArrayList<Chromosome> chromosomes = new ArrayList<Chromosome>();
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77728);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77729);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77730);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));

        __CLR4_4_11nx31nx3lb90pcon.R.inc(77731);final ListPopulation population = new ListPopulation(10) {
            public Population nextGeneration() {try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77732);
                // not important
                __CLR4_4_11nx31nx3lb90pcon.R.inc(77733);return null;
            }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
        };

        __CLR4_4_11nx31nx3lb90pcon.R.inc(77734);population.addChromosomes(chromosomes);

        __CLR4_4_11nx31nx3lb90pcon.R.inc(77735);final Iterator<Chromosome> iter = population.iterator();
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77736);while ((((iter.hasNext())&&(__CLR4_4_11nx31nx3lb90pcon.R.iget(77737)!=0|true))||(__CLR4_4_11nx31nx3lb90pcon.R.iget(77738)==0&false))) {{
            __CLR4_4_11nx31nx3lb90pcon.R.inc(77739);iter.next();
            __CLR4_4_11nx31nx3lb90pcon.R.inc(77740);iter.remove();
        }
    }}finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
    
    @Test(expected=NumberIsTooSmallException.class)
    public void testSetPopulationLimitTooSmall() {__CLR4_4_11nx31nx3lb90pcon.R.globalSliceStart(getClass().getName(),77741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtvwvs1nzh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,80,111,112,117,108,97,116,105,111,110,76,105,109,105,116,84,111,111,83,109,97,108,108,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nx31nx3lb90pcon.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nx31nx3lb90pcon.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ListPopulationTest.testSetPopulationLimitTooSmall",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtvwvs1nzh(){try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77741);
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77742);final ArrayList<Chromosome> chromosomes = new ArrayList<Chromosome> ();
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77743);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77744);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));
        __CLR4_4_11nx31nx3lb90pcon.R.inc(77745);chromosomes.add(new DummyBinaryChromosome(BinaryChromosome.randomBinaryRepresentation(3)));

        __CLR4_4_11nx31nx3lb90pcon.R.inc(77746);final ListPopulation population = new ListPopulation(chromosomes, 3) {
            public Population nextGeneration() {try{__CLR4_4_11nx31nx3lb90pcon.R.inc(77747);
                // not important
                __CLR4_4_11nx31nx3lb90pcon.R.inc(77748);return null;
            }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
        };

        __CLR4_4_11nx31nx3lb90pcon.R.inc(77749);population.setPopulationLimit(2);
    }finally{__CLR4_4_11nx31nx3lb90pcon.R.flushNeeded();}}
    
}
