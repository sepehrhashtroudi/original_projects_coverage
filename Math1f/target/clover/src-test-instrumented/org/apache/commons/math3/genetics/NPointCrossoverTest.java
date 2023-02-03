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

import java.util.List;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.junit.Assert;
import org.junit.Test;

public class NPointCrossoverTest {static class __CLR4_4_11nzq1nzqlb90pcor{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,77815,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected = DimensionMismatchException.class)
    public void testCrossoverDimensionMismatchException() {__CLR4_4_11nzq1nzqlb90pcor.R.globalSliceStart(getClass().getName(),77750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kb91h81nzq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,111,115,115,111,118,101,114,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nzq1nzqlb90pcor.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nzq1nzqlb90pcor.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.NPointCrossoverTest.testCrossoverDimensionMismatchException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kb91h81nzq(){try{__CLR4_4_11nzq1nzqlb90pcor.R.inc(77750);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77751);final Integer[] p1 = new Integer[] {1,0,1,0,0,1,0,1,1};
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77752);final Integer[] p2 = new Integer[] {0,1,1,0,1};

        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77753);final BinaryChromosome p1c = new DummyBinaryChromosome(p1);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77754);final BinaryChromosome p2c = new DummyBinaryChromosome(p2);

        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77755);final CrossoverPolicy cp = new NPointCrossover<Integer>(1);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77756);cp.crossover(p1c,p2c);
    }finally{__CLR4_4_11nzq1nzqlb90pcor.R.flushNeeded();}}
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testNumberIsTooLargeException() {__CLR4_4_11nzq1nzqlb90pcor.R.globalSliceStart(getClass().getName(),77757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18av9yi1nzx();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nzq1nzqlb90pcor.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nzq1nzqlb90pcor.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.NPointCrossoverTest.testNumberIsTooLargeException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18av9yi1nzx(){try{__CLR4_4_11nzq1nzqlb90pcor.R.inc(77757);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77758);final Integer[] p1 = new Integer[] {1,0,1,0,0,1,0,1,1};
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77759);final Integer[] p2 = new Integer[] {0,1,1,0,1,0,1,1,1};

        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77760);final BinaryChromosome p1c = new DummyBinaryChromosome(p1);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77761);final BinaryChromosome p2c = new DummyBinaryChromosome(p2);

        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77762);final CrossoverPolicy cp = new NPointCrossover<Integer>(15);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77763);cp.crossover(p1c,p2c);
    }finally{__CLR4_4_11nzq1nzqlb90pcor.R.flushNeeded();}}
    
    @Test(expected = MathIllegalArgumentException.class)
    public void testCrossoverInvalidFixedLengthChromosomeFirst() {__CLR4_4_11nzq1nzqlb90pcor.R.globalSliceStart(getClass().getName(),77764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7qlmu1o04();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,111,115,115,111,118,101,114,73,110,118,97,108,105,100,70,105,120,101,100,76,101,110,103,116,104,67,104,114,111,109,111,115,111,109,101,70,105,114,115,116,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nzq1nzqlb90pcor.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nzq1nzqlb90pcor.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.NPointCrossoverTest.testCrossoverInvalidFixedLengthChromosomeFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7qlmu1o04(){try{__CLR4_4_11nzq1nzqlb90pcor.R.inc(77764);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77765);final Integer[] p1 = new Integer[] {1,0,1,0,0,1,0,1,1};
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77766);final BinaryChromosome p1c = new DummyBinaryChromosome(p1);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77767);final Chromosome p2c = new Chromosome() {
            public double fitness() {try{__CLR4_4_11nzq1nzqlb90pcor.R.inc(77768);
                // Not important
                __CLR4_4_11nzq1nzqlb90pcor.R.inc(77769);return 0;
            }finally{__CLR4_4_11nzq1nzqlb90pcor.R.flushNeeded();}}
        };

        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77770);final CrossoverPolicy cp = new NPointCrossover<Integer>(1);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77771);cp.crossover(p1c,p2c);
    }finally{__CLR4_4_11nzq1nzqlb90pcor.R.flushNeeded();}}
    
    @Test(expected = MathIllegalArgumentException.class)
    public void testCrossoverInvalidFixedLengthChromosomeSecond() {__CLR4_4_11nzq1nzqlb90pcor.R.globalSliceStart(getClass().getName(),77772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwpxnc1o0c();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,111,115,115,111,118,101,114,73,110,118,97,108,105,100,70,105,120,101,100,76,101,110,103,116,104,67,104,114,111,109,111,115,111,109,101,83,101,99,111,110,100,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nzq1nzqlb90pcor.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nzq1nzqlb90pcor.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.NPointCrossoverTest.testCrossoverInvalidFixedLengthChromosomeSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwpxnc1o0c(){try{__CLR4_4_11nzq1nzqlb90pcor.R.inc(77772);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77773);final Integer[] p1 = new Integer[] {1,0,1,0,0,1,0,1,1};
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77774);final BinaryChromosome p2c = new DummyBinaryChromosome(p1);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77775);final Chromosome p1c = new Chromosome() {
            public double fitness() {try{__CLR4_4_11nzq1nzqlb90pcor.R.inc(77776);
                // Not important
                __CLR4_4_11nzq1nzqlb90pcor.R.inc(77777);return 0;
            }finally{__CLR4_4_11nzq1nzqlb90pcor.R.flushNeeded();}}
        };

        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77778);final CrossoverPolicy cp = new NPointCrossover<Integer>(1);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77779);cp.crossover(p1c,p2c);
    }finally{__CLR4_4_11nzq1nzqlb90pcor.R.flushNeeded();}}
    
    @Test
    public void testCrossover() {__CLR4_4_11nzq1nzqlb90pcor.R.globalSliceStart(getClass().getName(),77780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmxfmf1o0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nzq1nzqlb90pcor.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nzq1nzqlb90pcor.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.NPointCrossoverTest.testCrossover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmxfmf1o0k(){try{__CLR4_4_11nzq1nzqlb90pcor.R.inc(77780);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77781);Integer[] p1 = new Integer[] {1,0,1,0,1,0,1,0,1};
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77782);Integer[] p2 = new Integer[] {0,1,0,1,0,1,0,1,0};

        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77783);BinaryChromosome p1c = new DummyBinaryChromosome(p1);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77784);BinaryChromosome p2c = new DummyBinaryChromosome(p2);

        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77785);final int order = 3;
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77786);NPointCrossover<Integer> npc = new NPointCrossover<Integer>(order);

        // the two parent chromosomes are different at each position, so it is easy to detect
        // the number of crossovers that happened for each child
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77787);for (int i=0; (((i<20)&&(__CLR4_4_11nzq1nzqlb90pcor.R.iget(77788)!=0|true))||(__CLR4_4_11nzq1nzqlb90pcor.R.iget(77789)==0&false)); i++) {{
            __CLR4_4_11nzq1nzqlb90pcor.R.inc(77790);ChromosomePair pair = npc.crossover(p1c,p2c);

            __CLR4_4_11nzq1nzqlb90pcor.R.inc(77791);Integer[] c1 = new Integer[p1.length];
            __CLR4_4_11nzq1nzqlb90pcor.R.inc(77792);Integer[] c2 = new Integer[p2.length];

            __CLR4_4_11nzq1nzqlb90pcor.R.inc(77793);c1 = ((BinaryChromosome) pair.getFirst()).getRepresentation().toArray(c1);
            __CLR4_4_11nzq1nzqlb90pcor.R.inc(77794);c2 = ((BinaryChromosome) pair.getSecond()).getRepresentation().toArray(c2);

            __CLR4_4_11nzq1nzqlb90pcor.R.inc(77795);Assert.assertEquals(order, detectCrossoverPoints(p1c, p2c, (BinaryChromosome) pair.getFirst()));
            __CLR4_4_11nzq1nzqlb90pcor.R.inc(77796);Assert.assertEquals(order, detectCrossoverPoints(p2c, p1c, (BinaryChromosome) pair.getSecond()));            
        }
    }}finally{__CLR4_4_11nzq1nzqlb90pcor.R.flushNeeded();}}
    
    private int detectCrossoverPoints(BinaryChromosome p1, BinaryChromosome p2, BinaryChromosome c) {try{__CLR4_4_11nzq1nzqlb90pcor.R.inc(77797);
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77798);int crossovers = 0;
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77799);final int length = p1.getLength();

        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77800);final List<Integer> p1Rep = p1.getRepresentation();
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77801);final List<Integer> p2Rep = p2.getRepresentation();
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77802);final List<Integer> cRep = c.getRepresentation();
        
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77803);List<Integer> rep = p1Rep;
        __CLR4_4_11nzq1nzqlb90pcor.R.inc(77804);for (int i = 0; (((i < length)&&(__CLR4_4_11nzq1nzqlb90pcor.R.iget(77805)!=0|true))||(__CLR4_4_11nzq1nzqlb90pcor.R.iget(77806)==0&false)); i++) {{
            __CLR4_4_11nzq1nzqlb90pcor.R.inc(77807);if ((((rep.get(i) != cRep.get(i))&&(__CLR4_4_11nzq1nzqlb90pcor.R.iget(77808)!=0|true))||(__CLR4_4_11nzq1nzqlb90pcor.R.iget(77809)==0&false))) {{
                __CLR4_4_11nzq1nzqlb90pcor.R.inc(77810);crossovers++;
                __CLR4_4_11nzq1nzqlb90pcor.R.inc(77811);rep = (((rep == p1Rep )&&(__CLR4_4_11nzq1nzqlb90pcor.R.iget(77812)!=0|true))||(__CLR4_4_11nzq1nzqlb90pcor.R.iget(77813)==0&false))? p2Rep : p1Rep;
            }
        }}
        
        }__CLR4_4_11nzq1nzqlb90pcor.R.inc(77814);return crossovers;
    }finally{__CLR4_4_11nzq1nzqlb90pcor.R.flushNeeded();}}

}
