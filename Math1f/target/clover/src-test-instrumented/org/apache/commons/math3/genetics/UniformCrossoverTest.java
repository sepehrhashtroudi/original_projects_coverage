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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.BeforeClass;
import org.junit.Test;

public class UniformCrossoverTest {static class __CLR4_4_11o6v1o6vlb90pcpb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,78074,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int LEN = 10000;
    private static final List<Integer> p1 = new ArrayList<Integer>(LEN);
    private static final List<Integer> p2 = new ArrayList<Integer>(LEN);

    @SuppressWarnings("boxing")
    @BeforeClass
    public static void setUpBeforeClass() {try{__CLR4_4_11o6v1o6vlb90pcpb.R.inc(78007);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78008);for (int i = 0; (((i < LEN)&&(__CLR4_4_11o6v1o6vlb90pcpb.R.iget(78009)!=0|true))||(__CLR4_4_11o6v1o6vlb90pcpb.R.iget(78010)==0&false)); i++) {{
            __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78011);p1.add(0);
            __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78012);p2.add(1);
        }
    }}finally{__CLR4_4_11o6v1o6vlb90pcpb.R.flushNeeded();}}

    @Test(expected = OutOfRangeException.class)
    public void testRatioTooLow() {__CLR4_4_11o6v1o6vlb90pcpb.R.globalSliceStart(getClass().getName(),78013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j9gps01o71();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,97,116,105,111,84,111,111,76,111,119,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o6v1o6vlb90pcpb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o6v1o6vlb90pcpb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.UniformCrossoverTest.testRatioTooLow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j9gps01o71(){try{__CLR4_4_11o6v1o6vlb90pcpb.R.inc(78013);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78014);new UniformCrossover<Integer>(-0.5d);
    }finally{__CLR4_4_11o6v1o6vlb90pcpb.R.flushNeeded();}}
    
    @Test(expected = OutOfRangeException.class)
    public void testRatioTooHigh() {__CLR4_4_11o6v1o6vlb90pcpb.R.globalSliceStart(getClass().getName(),78015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt4jrw1o73();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,97,116,105,111,84,111,111,72,105,103,104,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o6v1o6vlb90pcpb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o6v1o6vlb90pcpb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.UniformCrossoverTest.testRatioTooHigh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt4jrw1o73(){try{__CLR4_4_11o6v1o6vlb90pcpb.R.inc(78015);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78016);new UniformCrossover<Integer>(1.5d);
    }finally{__CLR4_4_11o6v1o6vlb90pcpb.R.flushNeeded();}}
    
    @Test
    public void testCrossover() {__CLR4_4_11o6v1o6vlb90pcpb.R.globalSliceStart(getClass().getName(),78017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmxfmf1o75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o6v1o6vlb90pcpb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o6v1o6vlb90pcpb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.UniformCrossoverTest.testCrossover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmxfmf1o75(){try{__CLR4_4_11o6v1o6vlb90pcpb.R.inc(78017);
        // test crossover with different ratios
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78018);performCrossover(0.5);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78019);performCrossover(0.7);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78020);performCrossover(0.2);        
    }finally{__CLR4_4_11o6v1o6vlb90pcpb.R.flushNeeded();}}
    
    private void performCrossover(double ratio) {try{__CLR4_4_11o6v1o6vlb90pcpb.R.inc(78021);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78022);final DummyBinaryChromosome p1c = new DummyBinaryChromosome(p1);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78023);final DummyBinaryChromosome p2c = new DummyBinaryChromosome(p2);

        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78024);final CrossoverPolicy cp = new UniformCrossover<Integer>(ratio);

        // make a number of rounds
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78025);for (int i = 0; (((i < 20)&&(__CLR4_4_11o6v1o6vlb90pcpb.R.iget(78026)!=0|true))||(__CLR4_4_11o6v1o6vlb90pcpb.R.iget(78027)==0&false)); i++) {{
            __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78028);final ChromosomePair pair = cp.crossover(p1c, p2c);

            __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78029);final List<Integer> c1 = ((DummyBinaryChromosome) pair.getFirst()).getRepresentation();
            __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78030);final List<Integer> c2 = ((DummyBinaryChromosome) pair.getSecond()).getRepresentation();

            __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78031);int from1 = 0;
            __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78032);int from2 = 0;

            // check first child
            __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78033);for (int val : c1) {{
                __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78034);if ((((val == 0)&&(__CLR4_4_11o6v1o6vlb90pcpb.R.iget(78035)!=0|true))||(__CLR4_4_11o6v1o6vlb90pcpb.R.iget(78036)==0&false))) {{
                    __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78037);from1++;
                } }else {{
                    __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78038);from2++;
                }
            }}

            }__CLR4_4_11o6v1o6vlb90pcpb.R.inc(78039);Assert.assertEquals(1.0 - ratio, (double) from1 / LEN, 0.1);
            __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78040);Assert.assertEquals(ratio, (double) from2 / LEN, 0.1);

            __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78041);from1 = 0;
            __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78042);from2 = 0;

            // check second child
            __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78043);for (int val : c2) {{
                __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78044);if ((((val == 0)&&(__CLR4_4_11o6v1o6vlb90pcpb.R.iget(78045)!=0|true))||(__CLR4_4_11o6v1o6vlb90pcpb.R.iget(78046)==0&false))) {{
                    __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78047);from1++;
                } }else {{
                    __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78048);from2++;
                }
            }}

            }__CLR4_4_11o6v1o6vlb90pcpb.R.inc(78049);Assert.assertEquals(ratio, (double) from1 / LEN, 0.1);
            __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78050);Assert.assertEquals(1.0 - ratio, (double) from2 / LEN, 0.1);
        }
    }}finally{__CLR4_4_11o6v1o6vlb90pcpb.R.flushNeeded();}}
    
    @Test(expected = DimensionMismatchException.class)
    public void testCrossoverDimensionMismatchException(){__CLR4_4_11o6v1o6vlb90pcpb.R.globalSliceStart(getClass().getName(),78051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kb91h81o83();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,111,115,115,111,118,101,114,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o6v1o6vlb90pcpb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o6v1o6vlb90pcpb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.UniformCrossoverTest.testCrossoverDimensionMismatchException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78051,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kb91h81o83(){try{__CLR4_4_11o6v1o6vlb90pcpb.R.inc(78051);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78052);@SuppressWarnings("boxing")
        final Integer[] p1 = new Integer[] {1,0,1,0,0,1,0,1,1};
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78053);@SuppressWarnings("boxing")
        final Integer[] p2 = new Integer[] {0,1,1,0,1};

        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78054);final BinaryChromosome p1c = new DummyBinaryChromosome(p1);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78055);final BinaryChromosome p2c = new DummyBinaryChromosome(p2);

        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78056);final CrossoverPolicy cp = new UniformCrossover<Integer>(0.5d);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78057);cp.crossover(p1c, p2c);
    }finally{__CLR4_4_11o6v1o6vlb90pcpb.R.flushNeeded();}}
    
    @Test(expected = MathIllegalArgumentException.class)
    public void testCrossoverInvalidFixedLengthChromosomeFirst() {__CLR4_4_11o6v1o6vlb90pcpb.R.globalSliceStart(getClass().getName(),78058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7qlmu1o8a();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,111,115,115,111,118,101,114,73,110,118,97,108,105,100,70,105,120,101,100,76,101,110,103,116,104,67,104,114,111,109,111,115,111,109,101,70,105,114,115,116,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o6v1o6vlb90pcpb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o6v1o6vlb90pcpb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.UniformCrossoverTest.testCrossoverInvalidFixedLengthChromosomeFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7qlmu1o8a(){try{__CLR4_4_11o6v1o6vlb90pcpb.R.inc(78058);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78059);@SuppressWarnings("boxing")
        final Integer[] p1 = new Integer[] {1,0,1,0,0,1,0,1,1};
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78060);final BinaryChromosome p1c = new DummyBinaryChromosome(p1);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78061);final Chromosome p2c = new Chromosome() {
            public double fitness() {try{__CLR4_4_11o6v1o6vlb90pcpb.R.inc(78062);
                // Not important
                __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78063);return 0;
            }finally{__CLR4_4_11o6v1o6vlb90pcpb.R.flushNeeded();}}
        };

        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78064);final CrossoverPolicy cp = new UniformCrossover<Integer>(0.5d);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78065);cp.crossover(p1c, p2c);
    }finally{__CLR4_4_11o6v1o6vlb90pcpb.R.flushNeeded();}}
    
    @Test(expected = MathIllegalArgumentException.class)
    public void testCrossoverInvalidFixedLengthChromosomeSecond() {__CLR4_4_11o6v1o6vlb90pcpb.R.globalSliceStart(getClass().getName(),78066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwpxnc1o8i();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,111,115,115,111,118,101,114,73,110,118,97,108,105,100,70,105,120,101,100,76,101,110,103,116,104,67,104,114,111,109,111,115,111,109,101,83,101,99,111,110,100,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o6v1o6vlb90pcpb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o6v1o6vlb90pcpb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.UniformCrossoverTest.testCrossoverInvalidFixedLengthChromosomeSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwpxnc1o8i(){try{__CLR4_4_11o6v1o6vlb90pcpb.R.inc(78066);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78067);@SuppressWarnings("boxing")
        final Integer[] p1 = new Integer[] {1,0,1,0,0,1,0,1,1};
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78068);final BinaryChromosome p2c = new DummyBinaryChromosome(p1);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78069);final Chromosome p1c = new Chromosome() {
            public double fitness() {try{__CLR4_4_11o6v1o6vlb90pcpb.R.inc(78070);
                // Not important
                __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78071);return 0;
            }finally{__CLR4_4_11o6v1o6vlb90pcpb.R.flushNeeded();}}
        };

        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78072);final CrossoverPolicy cp = new UniformCrossover<Integer>(0.5d);
        __CLR4_4_11o6v1o6vlb90pcpb.R.inc(78073);cp.crossover(p1c, p2c);
    }finally{__CLR4_4_11o6v1o6vlb90pcpb.R.flushNeeded();}}
}
