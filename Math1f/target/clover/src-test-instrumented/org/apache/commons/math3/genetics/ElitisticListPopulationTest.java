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


import java.util.Collections;
import java.util.List;

import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Test;

public class ElitisticListPopulationTest {static class __CLR4_4_11nsb1nsblb90pco7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,77523,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static int counter = 0;

    @Test
    public void testNextGeneration() {__CLR4_4_11nsb1nsblb90pco7.R.globalSliceStart(getClass().getName(),77483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6hcqk1nsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nsb1nsblb90pco7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nsb1nsblb90pco7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ElitisticListPopulationTest.testNextGeneration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6hcqk1nsb(){try{__CLR4_4_11nsb1nsblb90pco7.R.inc(77483);
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77484);ElitisticListPopulation pop = new ElitisticListPopulation(100, 0.203);

        __CLR4_4_11nsb1nsblb90pco7.R.inc(77485);for (int i=0; (((i<pop.getPopulationLimit())&&(__CLR4_4_11nsb1nsblb90pco7.R.iget(77486)!=0|true))||(__CLR4_4_11nsb1nsblb90pco7.R.iget(77487)==0&false)); i++) {{
            __CLR4_4_11nsb1nsblb90pco7.R.inc(77488);pop.addChromosome(new DummyChromosome());
        }

        }__CLR4_4_11nsb1nsblb90pco7.R.inc(77489);Population nextGeneration = pop.nextGeneration();

        __CLR4_4_11nsb1nsblb90pco7.R.inc(77490);Assert.assertEquals(20, nextGeneration.getPopulationSize());
    }finally{__CLR4_4_11nsb1nsblb90pco7.R.flushNeeded();}}
    
    @Test
    public void testSetElitismRate() {__CLR4_4_11nsb1nsblb90pco7.R.globalSliceStart(getClass().getName(),77491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z39ljc1nsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nsb1nsblb90pco7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nsb1nsblb90pco7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ElitisticListPopulationTest.testSetElitismRate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z39ljc1nsj(){try{__CLR4_4_11nsb1nsblb90pco7.R.inc(77491);
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77492);final double rate = 0.25;
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77493);final ElitisticListPopulation pop = new ElitisticListPopulation(100, 0.203);
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77494);pop.setElitismRate(rate);
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77495);Assert.assertEquals(rate, pop.getElitismRate(), 1e-6);
    }finally{__CLR4_4_11nsb1nsblb90pco7.R.flushNeeded();}}
    
    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRateTooLow() {__CLR4_4_11nsb1nsblb90pco7.R.globalSliceStart(getClass().getName(),77496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y5pz3s1nso();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,69,108,105,116,105,115,109,82,97,116,101,84,111,111,76,111,119,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nsb1nsblb90pco7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nsb1nsblb90pco7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ElitisticListPopulationTest.testSetElitismRateTooLow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y5pz3s1nso(){try{__CLR4_4_11nsb1nsblb90pco7.R.inc(77496);
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77497);final double rate = -0.25;
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77498);final ElitisticListPopulation pop = new ElitisticListPopulation(100, 0.203);
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77499);pop.setElitismRate(rate);
    }finally{__CLR4_4_11nsb1nsblb90pco7.R.flushNeeded();}}
    
    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRateTooHigh() {__CLR4_4_11nsb1nsblb90pco7.R.globalSliceStart(getClass().getName(),77500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qutc9o1nss();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,69,108,105,116,105,115,109,82,97,116,101,84,111,111,72,105,103,104,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nsb1nsblb90pco7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nsb1nsblb90pco7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ElitisticListPopulationTest.testSetElitismRateTooHigh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qutc9o1nss(){try{__CLR4_4_11nsb1nsblb90pco7.R.inc(77500);
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77501);final double rate = 1.25;
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77502);final ElitisticListPopulation pop = new ElitisticListPopulation(100, 0.203);
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77503);pop.setElitismRate(rate);
    }finally{__CLR4_4_11nsb1nsblb90pco7.R.flushNeeded();}}
    
    @Test(expected = OutOfRangeException.class)
    public void testConstructorTooLow() {__CLR4_4_11nsb1nsblb90pco7.R.globalSliceStart(getClass().getName(),77504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbn1731nsw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,84,111,111,76,111,119,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nsb1nsblb90pco7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nsb1nsblb90pco7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ElitisticListPopulationTest.testConstructorTooLow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbn1731nsw(){try{__CLR4_4_11nsb1nsblb90pco7.R.inc(77504);
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77505);final double rate = -0.25;
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77506);new ElitisticListPopulation(100, rate);
    }finally{__CLR4_4_11nsb1nsblb90pco7.R.flushNeeded();}}
    
    @Test(expected = OutOfRangeException.class)
    public void testConstructorTooHigh() {__CLR4_4_11nsb1nsblb90pco7.R.globalSliceStart(getClass().getName(),77507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x1788l1nsz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,84,111,111,72,105,103,104,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nsb1nsblb90pco7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nsb1nsblb90pco7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ElitisticListPopulationTest.testConstructorTooHigh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x1788l1nsz(){try{__CLR4_4_11nsb1nsblb90pco7.R.inc(77507);
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77508);final double rate = 1.25;
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77509);new ElitisticListPopulation(100, rate);
    }finally{__CLR4_4_11nsb1nsblb90pco7.R.flushNeeded();}}

    @Test(expected = OutOfRangeException.class)
    public void testChromosomeListConstructorTooLow() {__CLR4_4_11nsb1nsblb90pco7.R.globalSliceStart(getClass().getName(),77510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmfvy11nt2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,104,114,111,109,111,115,111,109,101,76,105,115,116,67,111,110,115,116,114,117,99,116,111,114,84,111,111,76,111,119,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nsb1nsblb90pco7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nsb1nsblb90pco7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ElitisticListPopulationTest.testChromosomeListConstructorTooLow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmfvy11nt2(){try{__CLR4_4_11nsb1nsblb90pco7.R.inc(77510);
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77511);final List<Chromosome> chromosomes = Collections.emptyList();
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77512);final double rate = -0.25;
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77513);new ElitisticListPopulation(chromosomes, 100, rate);
    }finally{__CLR4_4_11nsb1nsblb90pco7.R.flushNeeded();}}

    @Test(expected = OutOfRangeException.class)
    public void testChromosomeListConstructorTooHigh() {__CLR4_4_11nsb1nsblb90pco7.R.globalSliceStart(getClass().getName(),77514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jnyak51nt6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,104,114,111,109,111,115,111,109,101,76,105,115,116,67,111,110,115,116,114,117,99,116,111,114,84,111,111,72,105,103,104,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nsb1nsblb90pco7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nsb1nsblb90pco7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.ElitisticListPopulationTest.testChromosomeListConstructorTooHigh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jnyak51nt6(){try{__CLR4_4_11nsb1nsblb90pco7.R.inc(77514);
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77515);final List<Chromosome> chromosomes = Collections.emptyList();
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77516);final double rate = 1.25;
        __CLR4_4_11nsb1nsblb90pco7.R.inc(77517);new ElitisticListPopulation(chromosomes, 100, rate);
    }finally{__CLR4_4_11nsb1nsblb90pco7.R.flushNeeded();}}

    private static class DummyChromosome extends Chromosome {
        private final int fitness;

        public DummyChromosome() {try{__CLR4_4_11nsb1nsblb90pco7.R.inc(77518);
            __CLR4_4_11nsb1nsblb90pco7.R.inc(77519);this.fitness = counter;
            __CLR4_4_11nsb1nsblb90pco7.R.inc(77520);counter++;
        }finally{__CLR4_4_11nsb1nsblb90pco7.R.flushNeeded();}}

        public double fitness() {try{__CLR4_4_11nsb1nsblb90pco7.R.inc(77521);
            __CLR4_4_11nsb1nsblb90pco7.R.inc(77522);return this.fitness;
        }finally{__CLR4_4_11nsb1nsblb90pco7.R.flushNeeded();}}
    }

}
