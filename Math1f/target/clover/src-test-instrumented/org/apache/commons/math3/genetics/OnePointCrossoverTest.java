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

public class OnePointCrossoverTest {static class __CLR4_4_11o1j1o1jlb90pcot{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,77839,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCrossover() {__CLR4_4_11o1j1o1jlb90pcot.R.globalSliceStart(getClass().getName(),77815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmxfmf1o1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o1j1o1jlb90pcot.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o1j1o1jlb90pcot.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.OnePointCrossoverTest.testCrossover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmxfmf1o1j(){try{__CLR4_4_11o1j1o1jlb90pcot.R.inc(77815);
        __CLR4_4_11o1j1o1jlb90pcot.R.inc(77816);@SuppressWarnings("boxing")
        Integer[] p1 = new Integer[] {1,0,1,0,0,1,0,1,1};
        __CLR4_4_11o1j1o1jlb90pcot.R.inc(77817);@SuppressWarnings("boxing")
        Integer[] p2 = new Integer[] {0,1,1,0,1,0,1,1,1};

        __CLR4_4_11o1j1o1jlb90pcot.R.inc(77818);BinaryChromosome p1c = new DummyBinaryChromosome(p1);
        __CLR4_4_11o1j1o1jlb90pcot.R.inc(77819);BinaryChromosome p2c = new DummyBinaryChromosome(p2);

        __CLR4_4_11o1j1o1jlb90pcot.R.inc(77820);OnePointCrossover<Integer> opc = new OnePointCrossover<Integer>();

        // how to test a stochastic method?
        __CLR4_4_11o1j1o1jlb90pcot.R.inc(77821);for (int i=0; (((i<20)&&(__CLR4_4_11o1j1o1jlb90pcot.R.iget(77822)!=0|true))||(__CLR4_4_11o1j1o1jlb90pcot.R.iget(77823)==0&false)); i++) {{
            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77824);ChromosomePair pair = opc.crossover(p1c,p2c);

            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77825);Integer[] c1 = new Integer[p1.length];
            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77826);Integer[] c2 = new Integer[p2.length];

            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77827);c1 = ((BinaryChromosome) pair.getFirst()).getRepresentation().toArray(c1);
            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77828);c2 = ((BinaryChromosome) pair.getSecond()).getRepresentation().toArray(c2);

            // first and last values will be the same
            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77829);Assert.assertEquals(p1[0],  c1[0]);
            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77830);Assert.assertEquals(p2[0], c2[0]);
            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77831);Assert.assertEquals(p1[p1.length-1], c1[c1.length-1]);
            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77832);Assert.assertEquals(p2[p2.length-1], c2[c2.length-1]);
            // moreover, in the above setting, the 2nd, 3rd and 7th values will be the same
            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77833);Assert.assertEquals(p1[2], c1[2]);
            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77834);Assert.assertEquals(p2[2], c2[2]);
            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77835);Assert.assertEquals(p1[3], c1[3]);
            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77836);Assert.assertEquals(p2[3], c2[3]);
            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77837);Assert.assertEquals(p1[7], c1[7]);
            __CLR4_4_11o1j1o1jlb90pcot.R.inc(77838);Assert.assertEquals(p2[7], c2[7]);
        }
    }}finally{__CLR4_4_11o1j1o1jlb90pcot.R.flushNeeded();}}

}
