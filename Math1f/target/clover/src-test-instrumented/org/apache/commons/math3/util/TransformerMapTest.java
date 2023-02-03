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

package org.apache.commons.math3.util;

import org.apache.commons.math3.TestUtils;
import org.junit.Assert;
import org.junit.Test;


/**
 * @version $Id$
 */
public class TransformerMapTest {static class __CLR4_4_12hmy2hmylb90pf7h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,116216,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     *
     */
    @Test
    public void testPutTransformer(){__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceStart(getClass().getName(),116170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1javn992hmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hmy2hmylb90pf7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.TransformerMapTest.testPutTransformer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1javn992hmy(){try{__CLR4_4_12hmy2hmylb90pf7h.R.inc(116170);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116171);NumberTransformer expected = new DefaultTransformer();

        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116172);TransformerMap map = new TransformerMap();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116173);map.putTransformer(TransformerMapTest.class, expected);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116174);Assert.assertEquals(expected, map.getTransformer(TransformerMapTest.class));
    }finally{__CLR4_4_12hmy2hmylb90pf7h.R.flushNeeded();}}

    /**
     *
     */
    @Test
    public void testContainsClass(){__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceStart(getClass().getName(),116175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ahncz62hn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hmy2hmylb90pf7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.TransformerMapTest.testContainsClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ahncz62hn3(){try{__CLR4_4_12hmy2hmylb90pf7h.R.inc(116175);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116176);NumberTransformer expected = new DefaultTransformer();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116177);TransformerMap map = new TransformerMap();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116178);map.putTransformer(TransformerMapTest.class, expected);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116179);Assert.assertTrue(map.containsClass(TransformerMapTest.class));
    }finally{__CLR4_4_12hmy2hmylb90pf7h.R.flushNeeded();}}

    /**
     *
     */
    @Test
    public void testContainsTransformer(){__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceStart(getClass().getName(),116180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vi2z7z2hn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hmy2hmylb90pf7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.TransformerMapTest.testContainsTransformer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vi2z7z2hn8(){try{__CLR4_4_12hmy2hmylb90pf7h.R.inc(116180);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116181);NumberTransformer expected = new DefaultTransformer();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116182);TransformerMap map = new TransformerMap();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116183);map.putTransformer(TransformerMapTest.class, expected);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116184);Assert.assertTrue(map.containsTransformer(expected));
    }finally{__CLR4_4_12hmy2hmylb90pf7h.R.flushNeeded();}}

    /**
     *
     */
    @Test
    public void testRemoveTransformer(){__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceStart(getClass().getName(),116185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uiylbe2hnd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hmy2hmylb90pf7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.TransformerMapTest.testRemoveTransformer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uiylbe2hnd(){try{__CLR4_4_12hmy2hmylb90pf7h.R.inc(116185);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116186);NumberTransformer expected = new DefaultTransformer();

        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116187);TransformerMap map = new TransformerMap();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116188);map.putTransformer(TransformerMapTest.class, expected);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116189);Assert.assertTrue(map.containsClass(TransformerMapTest.class));
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116190);Assert.assertTrue(map.containsTransformer(expected));
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116191);map.removeTransformer(TransformerMapTest.class);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116192);Assert.assertFalse(map.containsClass(TransformerMapTest.class));
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116193);Assert.assertFalse(map.containsTransformer(expected));
    }finally{__CLR4_4_12hmy2hmylb90pf7h.R.flushNeeded();}}

    /**
     *
     */
    @Test
    public void testClear(){__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceStart(getClass().getName(),116194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jlyl6q2hnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hmy2hmylb90pf7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.TransformerMapTest.testClear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jlyl6q2hnm(){try{__CLR4_4_12hmy2hmylb90pf7h.R.inc(116194);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116195);NumberTransformer expected = new DefaultTransformer();

        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116196);TransformerMap map = new TransformerMap();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116197);map.putTransformer(TransformerMapTest.class, expected);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116198);Assert.assertTrue(map.containsClass(TransformerMapTest.class));
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116199);map.clear();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116200);Assert.assertFalse(map.containsClass(TransformerMapTest.class));
    }finally{__CLR4_4_12hmy2hmylb90pf7h.R.flushNeeded();}}

    /**
     *
     */
    @Test
    public void testClasses(){__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceStart(getClass().getName(),116201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qeygat2hnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hmy2hmylb90pf7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.TransformerMapTest.testClasses",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qeygat2hnt(){try{__CLR4_4_12hmy2hmylb90pf7h.R.inc(116201);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116202);NumberTransformer expected = new DefaultTransformer();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116203);TransformerMap map = new TransformerMap();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116204);map.putTransformer(TransformerMapTest.class, expected);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116205);Assert.assertTrue(map.classes().contains(TransformerMapTest.class));
    }finally{__CLR4_4_12hmy2hmylb90pf7h.R.flushNeeded();}}

    /**
     *
     */
    @Test
    public void testTransformers(){__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceStart(getClass().getName(),116206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qqx3pp2hny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hmy2hmylb90pf7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.TransformerMapTest.testTransformers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qqx3pp2hny(){try{__CLR4_4_12hmy2hmylb90pf7h.R.inc(116206);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116207);NumberTransformer expected = new DefaultTransformer();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116208);TransformerMap map = new TransformerMap();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116209);map.putTransformer(TransformerMapTest.class, expected);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116210);Assert.assertTrue(map.transformers().contains(expected));
    }finally{__CLR4_4_12hmy2hmylb90pf7h.R.flushNeeded();}}

    @Test
    public void testSerial(){__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceStart(getClass().getName(),116211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv2ho3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hmy2hmylb90pf7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hmy2hmylb90pf7h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.TransformerMapTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv2ho3(){try{__CLR4_4_12hmy2hmylb90pf7h.R.inc(116211);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116212);NumberTransformer expected = new DefaultTransformer();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116213);TransformerMap map = new TransformerMap();
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116214);map.putTransformer(TransformerMapTest.class, expected);
        __CLR4_4_12hmy2hmylb90pf7h.R.inc(116215);Assert.assertEquals(map, TestUtils.serializeAndRecover(map));
    }finally{__CLR4_4_12hmy2hmylb90pf7h.R.flushNeeded();}}

}
