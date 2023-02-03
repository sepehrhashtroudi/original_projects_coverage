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

public class RandomKeyMutationTest {static class __CLR4_4_11o3h1o3hlb90pcoy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,77903,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testMutate() {__CLR4_4_11o3h1o3hlb90pcoy.R.globalSliceStart(getClass().getName(),77885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qo56p1o3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o3h1o3hlb90pcoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o3h1o3hlb90pcoy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.RandomKeyMutationTest.testMutate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qo56p1o3h(){try{__CLR4_4_11o3h1o3hlb90pcoy.R.inc(77885);
        __CLR4_4_11o3h1o3hlb90pcoy.R.inc(77886);MutationPolicy mutation = new RandomKeyMutation();
        __CLR4_4_11o3h1o3hlb90pcoy.R.inc(77887);int l=10;
        __CLR4_4_11o3h1o3hlb90pcoy.R.inc(77888);for (int i=0; (((i<20)&&(__CLR4_4_11o3h1o3hlb90pcoy.R.iget(77889)!=0|true))||(__CLR4_4_11o3h1o3hlb90pcoy.R.iget(77890)==0&false)); i++) {{
            __CLR4_4_11o3h1o3hlb90pcoy.R.inc(77891);DummyRandomKey origRk = new DummyRandomKey(RandomKey.randomPermutation(l));
            __CLR4_4_11o3h1o3hlb90pcoy.R.inc(77892);Chromosome mutated = mutation.mutate(origRk);
            __CLR4_4_11o3h1o3hlb90pcoy.R.inc(77893);DummyRandomKey mutatedRk = (DummyRandomKey) mutated;

            __CLR4_4_11o3h1o3hlb90pcoy.R.inc(77894);int changes = 0;
            __CLR4_4_11o3h1o3hlb90pcoy.R.inc(77895);for (int j=0; (((j<origRk.getLength())&&(__CLR4_4_11o3h1o3hlb90pcoy.R.iget(77896)!=0|true))||(__CLR4_4_11o3h1o3hlb90pcoy.R.iget(77897)==0&false)); j++) {{
                __CLR4_4_11o3h1o3hlb90pcoy.R.inc(77898);if ((((origRk.getRepresentation().get(j) != mutatedRk.getRepresentation().get(j))&&(__CLR4_4_11o3h1o3hlb90pcoy.R.iget(77899)!=0|true))||(__CLR4_4_11o3h1o3hlb90pcoy.R.iget(77900)==0&false))) {{
                    __CLR4_4_11o3h1o3hlb90pcoy.R.inc(77901);changes++;
                }
            }}
            }__CLR4_4_11o3h1o3hlb90pcoy.R.inc(77902);Assert.assertEquals(1,changes);
        }
    }}finally{__CLR4_4_11o3h1o3hlb90pcoy.R.flushNeeded();}}

}
