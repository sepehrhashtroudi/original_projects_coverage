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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class CycleCrossoverTest {static class __CLR4_4_11nom1nomlb90pcnz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,77427,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Test
    public void testCrossoverExample() {__CLR4_4_11nom1nomlb90pcnz.R.globalSliceStart(getClass().getName(),77350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xx529b1nom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nom1nomlb90pcnz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nom1nomlb90pcnz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.CycleCrossoverTest.testCrossoverExample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xx529b1nom(){try{__CLR4_4_11nom1nomlb90pcnz.R.inc(77350);
        // taken from http://www.rubicite.com/Tutorials/GeneticAlgorithms/CrossoverOperators/CycleCrossoverOperator.aspx
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77351);final Integer[] p1 = new Integer[] { 8, 4, 7, 3, 6, 2, 5, 1, 9, 0 };
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77352);final Integer[] p2 = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77353);final DummyListChromosome p1c = new DummyListChromosome(p1);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77354);final DummyListChromosome p2c = new DummyListChromosome(p2);

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77355);final CrossoverPolicy cp = new CycleCrossover<Integer>();
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77356);final ChromosomePair pair = cp.crossover(p1c, p2c);

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77357);final Integer[] c1 = ((DummyListChromosome) pair.getFirst()).getRepresentation().toArray(new Integer[p1.length]);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77358);final Integer[] c2 = ((DummyListChromosome) pair.getSecond()).getRepresentation().toArray(new Integer[p2.length]);

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77359);final Integer[] c1e = new Integer[] { 8, 1, 2, 3, 4, 5, 6, 7, 9, 0 };
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77360);final Integer[] c2e = new Integer[] { 0, 4, 7, 3, 6, 2, 5, 1, 8, 9 };

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77361);Assert.assertArrayEquals(c1e, c1);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77362);Assert.assertArrayEquals(c2e, c2);
    }finally{__CLR4_4_11nom1nomlb90pcnz.R.flushNeeded();}}

    @Test
    public void testCrossoverExample2() {__CLR4_4_11nom1nomlb90pcnz.R.globalSliceStart(getClass().getName(),77363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sv4d011noz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nom1nomlb90pcnz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nom1nomlb90pcnz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.CycleCrossoverTest.testCrossoverExample2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sv4d011noz(){try{__CLR4_4_11nom1nomlb90pcnz.R.inc(77363);
        // taken from http://www.scribd.com/doc/54206412/32/Cycle-crossover
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77364);final Integer[] p1 = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77365);final Integer[] p2 = new Integer[] { 9, 3, 7, 8, 2, 6, 5, 1, 4};
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77366);final DummyListChromosome p1c = new DummyListChromosome(p1);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77367);final DummyListChromosome p2c = new DummyListChromosome(p2);

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77368);final CrossoverPolicy cp = new CycleCrossover<Integer>();
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77369);final ChromosomePair pair = cp.crossover(p1c, p2c);

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77370);final Integer[] c1 = ((DummyListChromosome) pair.getFirst()).getRepresentation().toArray(new Integer[p1.length]);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77371);final Integer[] c2 = ((DummyListChromosome) pair.getSecond()).getRepresentation().toArray(new Integer[p2.length]);

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77372);final Integer[] c1e = new Integer[] { 1, 3, 7, 4, 2, 6, 5, 8, 9 };
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77373);final Integer[] c2e = new Integer[] { 9, 2, 3, 8, 5, 6, 7, 1, 4 };

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77374);Assert.assertArrayEquals(c1e, c1);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77375);Assert.assertArrayEquals(c2e, c2);
    }finally{__CLR4_4_11nom1nomlb90pcnz.R.flushNeeded();}}

    @Test
    public void testCrossover() {__CLR4_4_11nom1nomlb90pcnz.R.globalSliceStart(getClass().getName(),77376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmxfmf1npc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nom1nomlb90pcnz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nom1nomlb90pcnz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.CycleCrossoverTest.testCrossover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmxfmf1npc(){try{__CLR4_4_11nom1nomlb90pcnz.R.inc(77376);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77377);final Integer[] p1 = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77378);final Integer[] p2 = new Integer[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77379);final DummyListChromosome p1c = new DummyListChromosome(p1);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77380);final DummyListChromosome p2c = new DummyListChromosome(p2);

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77381);final CrossoverPolicy cp = new CycleCrossover<Integer>(true);

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77382);for (int i = 0; (((i < 20)&&(__CLR4_4_11nom1nomlb90pcnz.R.iget(77383)!=0|true))||(__CLR4_4_11nom1nomlb90pcnz.R.iget(77384)==0&false)); i++) {{
            __CLR4_4_11nom1nomlb90pcnz.R.inc(77385);final ChromosomePair pair = cp.crossover(p1c, p2c);

            __CLR4_4_11nom1nomlb90pcnz.R.inc(77386);final Integer[] c1 = ((DummyListChromosome) pair.getFirst()).getRepresentation().toArray(new Integer[p1.length]);
            __CLR4_4_11nom1nomlb90pcnz.R.inc(77387);final Integer[] c2 = ((DummyListChromosome) pair.getSecond()).getRepresentation().toArray(new Integer[p2.length]);

            __CLR4_4_11nom1nomlb90pcnz.R.inc(77388);int index = 0;
            // Determine if it is in the same spot as in the first parent, if 
            // not it comes from the second parent.
            __CLR4_4_11nom1nomlb90pcnz.R.inc(77389);for (final Integer j : c1) {{
                __CLR4_4_11nom1nomlb90pcnz.R.inc(77390);if ((((!p1[index].equals(j))&&(__CLR4_4_11nom1nomlb90pcnz.R.iget(77391)!=0|true))||(__CLR4_4_11nom1nomlb90pcnz.R.iget(77392)==0&false))) {{
                    __CLR4_4_11nom1nomlb90pcnz.R.inc(77393);Assert.assertEquals(j, p2[index]);
                } }else {{
                    __CLR4_4_11nom1nomlb90pcnz.R.inc(77394);Assert.assertEquals(j, p1[index]);
                }
                }__CLR4_4_11nom1nomlb90pcnz.R.inc(77395);index++;
            }

            // Same as above only for the second parent.
            }__CLR4_4_11nom1nomlb90pcnz.R.inc(77396);index = 0;
            __CLR4_4_11nom1nomlb90pcnz.R.inc(77397);for (final Integer k : c2) {{
                __CLR4_4_11nom1nomlb90pcnz.R.inc(77398);if ((((p2[index] != k)&&(__CLR4_4_11nom1nomlb90pcnz.R.iget(77399)!=0|true))||(__CLR4_4_11nom1nomlb90pcnz.R.iget(77400)==0&false))) {{
                    __CLR4_4_11nom1nomlb90pcnz.R.inc(77401);Assert.assertEquals(k, p1[index]);
                } }else {{
                    __CLR4_4_11nom1nomlb90pcnz.R.inc(77402);Assert.assertEquals(k, p2[index]);
                }
                }__CLR4_4_11nom1nomlb90pcnz.R.inc(77403);index++;
            }
        }}
    }}finally{__CLR4_4_11nom1nomlb90pcnz.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testCrossoverDimensionMismatchException() {__CLR4_4_11nom1nomlb90pcnz.R.globalSliceStart(getClass().getName(),77404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kb91h81nq4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,111,115,115,111,118,101,114,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nom1nomlb90pcnz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nom1nomlb90pcnz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.CycleCrossoverTest.testCrossoverDimensionMismatchException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kb91h81nq4(){try{__CLR4_4_11nom1nomlb90pcnz.R.inc(77404);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77405);final Integer[] p1 = new Integer[] { 1, 0, 1, 0, 0, 1, 0, 1, 1 };
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77406);final Integer[] p2 = new Integer[] { 0, 1, 1, 0, 1 };

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77407);final BinaryChromosome p1c = new DummyBinaryChromosome(p1);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77408);final BinaryChromosome p2c = new DummyBinaryChromosome(p2);

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77409);final CrossoverPolicy cp = new CycleCrossover<Integer>();
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77410);cp.crossover(p1c, p2c);
    }finally{__CLR4_4_11nom1nomlb90pcnz.R.flushNeeded();}}

    @Test(expected = MathIllegalArgumentException.class)
    public void testCrossoverInvalidFixedLengthChromosomeFirst() {__CLR4_4_11nom1nomlb90pcnz.R.globalSliceStart(getClass().getName(),77411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7qlmu1nqb();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,111,115,115,111,118,101,114,73,110,118,97,108,105,100,70,105,120,101,100,76,101,110,103,116,104,67,104,114,111,109,111,115,111,109,101,70,105,114,115,116,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nom1nomlb90pcnz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nom1nomlb90pcnz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.CycleCrossoverTest.testCrossoverInvalidFixedLengthChromosomeFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7qlmu1nqb(){try{__CLR4_4_11nom1nomlb90pcnz.R.inc(77411);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77412);final Integer[] p1 = new Integer[] { 1, 0, 1, 0, 0, 1, 0, 1, 1 };
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77413);final BinaryChromosome p1c = new DummyBinaryChromosome(p1);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77414);final Chromosome p2c = new Chromosome() {
            public double fitness() {try{__CLR4_4_11nom1nomlb90pcnz.R.inc(77415);
                // Not important
                __CLR4_4_11nom1nomlb90pcnz.R.inc(77416);return 0;
            }finally{__CLR4_4_11nom1nomlb90pcnz.R.flushNeeded();}}
        };

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77417);final CrossoverPolicy cp = new CycleCrossover<Integer>();
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77418);cp.crossover(p1c, p2c);
    }finally{__CLR4_4_11nom1nomlb90pcnz.R.flushNeeded();}}

    @Test(expected = MathIllegalArgumentException.class)
    public void testCrossoverInvalidFixedLengthChromosomeSecond() {__CLR4_4_11nom1nomlb90pcnz.R.globalSliceStart(getClass().getName(),77419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwpxnc1nqj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,111,115,115,111,118,101,114,73,110,118,97,108,105,100,70,105,120,101,100,76,101,110,103,116,104,67,104,114,111,109,111,115,111,109,101,83,101,99,111,110,100,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nom1nomlb90pcnz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nom1nomlb90pcnz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.CycleCrossoverTest.testCrossoverInvalidFixedLengthChromosomeSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwpxnc1nqj(){try{__CLR4_4_11nom1nomlb90pcnz.R.inc(77419);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77420);final Integer[] p1 = new Integer[] { 1, 0, 1, 0, 0, 1, 0, 1, 1 };
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77421);final BinaryChromosome p2c = new DummyBinaryChromosome(p1);
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77422);final Chromosome p1c = new Chromosome() {
            public double fitness() {try{__CLR4_4_11nom1nomlb90pcnz.R.inc(77423);
                // Not important
                __CLR4_4_11nom1nomlb90pcnz.R.inc(77424);return 0;
            }finally{__CLR4_4_11nom1nomlb90pcnz.R.flushNeeded();}}
        };

        __CLR4_4_11nom1nomlb90pcnz.R.inc(77425);final CrossoverPolicy cp = new CycleCrossover<Integer>();
        __CLR4_4_11nom1nomlb90pcnz.R.inc(77426);cp.crossover(p1c, p2c);
    }finally{__CLR4_4_11nom1nomlb90pcnz.R.flushNeeded();}}
}
