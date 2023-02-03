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


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("boxing")
public class RandomKeyTest {static class __CLR4_4_11o3z1o3zlb90pcp5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,77989,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected=IllegalArgumentException.class)
    public void testConstructor1() {__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceStart(getClass().getName(),77903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kibo7k1o3z();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o3z1o3zlb90pcp5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.RandomKeyTest.testConstructor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kibo7k1o3z(){try{__CLR4_4_11o3z1o3zlb90pcp5.R.inc(77903);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77904);new DummyRandomKey(new Double[] {0.2, 0.3, 1.2});
    }finally{__CLR4_4_11o3z1o3zlb90pcp5.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testConstructor2() {__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceStart(getClass().getName(),77905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrbn011o41();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o3z1o3zlb90pcp5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.RandomKeyTest.testConstructor2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrbn011o41(){try{__CLR4_4_11o3z1o3zlb90pcp5.R.inc(77905);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77906);new DummyRandomKey(new Double[] {0.2, 0.3, -0.2});
    }finally{__CLR4_4_11o3z1o3zlb90pcp5.R.flushNeeded();}}

    @Test
    public void testIsSame() {__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceStart(getClass().getName(),77907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17rl0d31o43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o3z1o3zlb90pcp5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.RandomKeyTest.testIsSame",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17rl0d31o43(){try{__CLR4_4_11o3z1o3zlb90pcp5.R.inc(77907);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77908);DummyRandomKey drk1 = new DummyRandomKey(new Double[] {0.4, 0.1, 0.5, 0.8, 0.2});
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77909);DummyRandomKey drk2 = new DummyRandomKey(new Double[] {0.4, 0.1, 0.5, 0.8, 0.2});
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77910);DummyRandomKey drk3 = new DummyRandomKey(new Double[] {0.4, 0.15, 0.5, 0.8, 0.2});
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77911);DummyRandomKey drk4 = new DummyRandomKey(new Double[] {0.4, 0.25, 0.5, 0.8, 0.2});
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77912);DummyRandomKey drk5 = new DummyRandomKey(new Double[] {0.4, 0.25, 0.5, 0.8, 0.2, 0.5});

        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77913);Assert.assertTrue(drk1.isSame(drk2));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77914);Assert.assertTrue(drk2.isSame(drk3));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77915);Assert.assertFalse(drk3.isSame(drk4));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77916);Assert.assertFalse(drk4.isSame(drk5));
    }finally{__CLR4_4_11o3z1o3zlb90pcp5.R.flushNeeded();}}

    @Test
    public void testDecode() {__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceStart(getClass().getName(),77917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16s49eh1o4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o3z1o3zlb90pcp5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.RandomKeyTest.testDecode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16s49eh1o4d(){try{__CLR4_4_11o3z1o3zlb90pcp5.R.inc(77917);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77918);DummyRandomKey drk = new DummyRandomKey(new Double[] {0.4, 0.1, 0.5, 0.8, 0.2});
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77919);List<String> decoded = drk.decode(Arrays.asList(new String[] {"a", "b", "c", "d", "e"}));

        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77920);Assert.assertEquals("b", decoded.get(0));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77921);Assert.assertEquals("e", decoded.get(1));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77922);Assert.assertEquals("a", decoded.get(2));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77923);Assert.assertEquals("c", decoded.get(3));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77924);Assert.assertEquals("d", decoded.get(4));
    }finally{__CLR4_4_11o3z1o3zlb90pcp5.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void testInvalidRepresentation() {__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceStart(getClass().getName(),77925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ob7sjd1o4l();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,118,97,108,105,100,82,101,112,114,101,115,101,110,116,97,116,105,111,110,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o3z1o3zlb90pcp5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.RandomKeyTest.testInvalidRepresentation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ob7sjd1o4l(){try{__CLR4_4_11o3z1o3zlb90pcp5.R.inc(77925);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77926);new DummyRandomKey(new Double[] {0.1, 0.1, 2d, 0.8, 0.2});
    }finally{__CLR4_4_11o3z1o3zlb90pcp5.R.flushNeeded();}}

    @Test
    public void testRandomPermutation() {__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceStart(getClass().getName(),77927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h677aw1o4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o3z1o3zlb90pcp5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.RandomKeyTest.testRandomPermutation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h677aw1o4n(){try{__CLR4_4_11o3z1o3zlb90pcp5.R.inc(77927);
        // never generate an invalid one
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77928);for (int i=0; (((i<10)&&(__CLR4_4_11o3z1o3zlb90pcp5.R.iget(77929)!=0|true))||(__CLR4_4_11o3z1o3zlb90pcp5.R.iget(77930)==0&false)); i++) {{
            __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77931);DummyRandomKey drk = new DummyRandomKey(RandomKey.randomPermutation(20));
            __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77932);Assert.assertNotNull(drk);
        }
    }}finally{__CLR4_4_11o3z1o3zlb90pcp5.R.flushNeeded();}}

    @Test
    public void testIdentityPermutation() {__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceStart(getClass().getName(),77933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x8xqo31o4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o3z1o3zlb90pcp5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.RandomKeyTest.testIdentityPermutation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x8xqo31o4t(){try{__CLR4_4_11o3z1o3zlb90pcp5.R.inc(77933);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77934);DummyRandomKey drk = new DummyRandomKey(RandomKey.identityPermutation(5));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77935);List<String> decoded = drk.decode(Arrays.asList(new String[] {"a", "b", "c", "d", "e"}));

        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77936);Assert.assertEquals("a", decoded.get(0));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77937);Assert.assertEquals("b", decoded.get(1));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77938);Assert.assertEquals("c", decoded.get(2));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77939);Assert.assertEquals("d", decoded.get(3));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77940);Assert.assertEquals("e", decoded.get(4));
    }finally{__CLR4_4_11o3z1o3zlb90pcp5.R.flushNeeded();}}

    @Test
    public void testComparatorPermutation() {__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceStart(getClass().getName(),77941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4sjs51o51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o3z1o3zlb90pcp5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.RandomKeyTest.testComparatorPermutation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4sjs51o51(){try{__CLR4_4_11o3z1o3zlb90pcp5.R.inc(77941);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77942);List<String> data = Arrays.asList(new String[] {"x", "b", "c", "z", "b"});

        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77943);List<Double> permutation = RandomKey.comparatorPermutation(data, new Comparator<String>() {
            public int compare(String o1, String o2) {try{__CLR4_4_11o3z1o3zlb90pcp5.R.inc(77944);
                __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77945);return o1.compareTo(o2);
            }finally{__CLR4_4_11o3z1o3zlb90pcp5.R.flushNeeded();}}
        });
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77946);Double[] permArr = new Double[data.size()];
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77947);permArr = permutation.toArray(permArr);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77948);Assert.assertArrayEquals(new Double[] {0.6,0.0,0.4,0.8,0.2}, permArr);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77949);List<String> decodedData = new DummyRandomKey(permutation).decode(data);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77950);Assert.assertEquals("b", decodedData.get(0));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77951);Assert.assertEquals("b", decodedData.get(1));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77952);Assert.assertEquals("c", decodedData.get(2));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77953);Assert.assertEquals("x", decodedData.get(3));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77954);Assert.assertEquals("z", decodedData.get(4));

        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77955);permutation = RandomKey.comparatorPermutation(data, new Comparator<String>() {
            public int compare(String o1, String o2) {try{__CLR4_4_11o3z1o3zlb90pcp5.R.inc(77956);
                __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77957);return o2.compareTo(o1);
            }finally{__CLR4_4_11o3z1o3zlb90pcp5.R.flushNeeded();}}
        });
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77958);permArr = new Double[data.size()];
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77959);permArr = permutation.toArray(permArr);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77960);Assert.assertArrayEquals(new Double[] {0.2,0.6,0.4,0.0,0.8}, permArr);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77961);decodedData = new DummyRandomKey(permutation).decode(data);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77962);Assert.assertEquals("z", decodedData.get(0));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77963);Assert.assertEquals("x", decodedData.get(1));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77964);Assert.assertEquals("c", decodedData.get(2));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77965);Assert.assertEquals("b", decodedData.get(3));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77966);Assert.assertEquals("b", decodedData.get(4));
    }finally{__CLR4_4_11o3z1o3zlb90pcp5.R.flushNeeded();}}

    @Test
    public void testInducedPermutation() {__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceStart(getClass().getName(),77967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tv1a0d1o5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o3z1o3zlb90pcp5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.RandomKeyTest.testInducedPermutation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tv1a0d1o5r(){try{__CLR4_4_11o3z1o3zlb90pcp5.R.inc(77967);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77968);List<String> origData = Arrays.asList(new String[] {"a", "b", "c", "d", "d"});
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77969);List<String> permutedData = Arrays.asList(new String[] {"d", "b", "c", "a", "d"});

        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77970);DummyRandomKey drk = new DummyRandomKey(RandomKey.inducedPermutation(origData, permutedData));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77971);List<String> decoded = drk.decode(origData);

        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77972);Assert.assertEquals("d", decoded.get(0));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77973);Assert.assertEquals("b", decoded.get(1));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77974);Assert.assertEquals("c", decoded.get(2));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77975);Assert.assertEquals("a", decoded.get(3));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77976);Assert.assertEquals("d", decoded.get(4));

        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77977);try {
            __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77978);RandomKey.inducedPermutation(
                    Arrays.asList(new String[] {"a", "b", "c", "d", "d"}),
                    Arrays.asList(new String[] {"a", "b", "c", "d"})
            );
            __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77979);Assert.fail("Uncaught exception");
        } catch (IllegalArgumentException e) {
            // no-op
        }
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77980);try {
            __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77981);RandomKey.inducedPermutation(
                    Arrays.asList(new String[] {"a", "b", "c", "d", "d"}),
                    Arrays.asList(new String[] {"a", "b", "c", "d", "f"})
            );
            __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77982);Assert.fail("Uncaught exception");
        } catch (IllegalArgumentException e) {
            // no-op
        }
    }finally{__CLR4_4_11o3z1o3zlb90pcp5.R.flushNeeded();}}

    @Test
    public void testEqualRepr() {__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceStart(getClass().getName(),77983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p768g21o67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o3z1o3zlb90pcp5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o3z1o3zlb90pcp5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.RandomKeyTest.testEqualRepr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p768g21o67(){try{__CLR4_4_11o3z1o3zlb90pcp5.R.inc(77983);
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77984);DummyRandomKey drk = new DummyRandomKey(new Double[] {0.2, 0.2, 0.5});
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77985);List<String> decodedData = drk.decode(Arrays.asList(new String[] {"a", "b", "c"}));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77986);Assert.assertEquals("a", decodedData.get(0));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77987);Assert.assertEquals("b", decodedData.get(1));
        __CLR4_4_11o3z1o3zlb90pcp5.R.inc(77988);Assert.assertEquals("c", decodedData.get(2));
    }finally{__CLR4_4_11o3z1o3zlb90pcp5.R.flushNeeded();}}

}
