/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson;

import junit.framework.TestCase;

/**
 * Unit test for the {@link LruCache} class.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class LruCacheTest extends TestCase {static class __CLR4_4_13jy3jylck0y8tz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4647,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public void testCacheHitAndMiss() throws Exception {__CLR4_4_13jy3jylck0y8tz.R.globalSliceStart(getClass().getName(),4606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybsonr3jy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jy3jylck0y8tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jy3jylck0y8tz.R.globalSliceEnd(getClass().getName(),"com.google.gson.LruCacheTest.testCacheHitAndMiss",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybsonr3jy() throws Exception{try{__CLR4_4_13jy3jylck0y8tz.R.inc(4606);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4607);Cache<String, Integer> cache = new LruCache<String, Integer>(3);
    
    __CLR4_4_13jy3jylck0y8tz.R.inc(4608);String key = "key1";
    __CLR4_4_13jy3jylck0y8tz.R.inc(4609);assertNull(cache.getElement(key));
    __CLR4_4_13jy3jylck0y8tz.R.inc(4610);cache.addElement(key, 1);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4611);assertEquals(1, cache.getElement(key).intValue());
    
    __CLR4_4_13jy3jylck0y8tz.R.inc(4612);String key2 = "key2";
    __CLR4_4_13jy3jylck0y8tz.R.inc(4613);cache.addElement(key2, 2);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4614);assertEquals(1, cache.getElement(key).intValue());
    __CLR4_4_13jy3jylck0y8tz.R.inc(4615);assertEquals(2, cache.getElement(key2).intValue());
  }finally{__CLR4_4_13jy3jylck0y8tz.R.flushNeeded();}}
  
  public void testCacheKeyOverwrite() throws Exception {__CLR4_4_13jy3jylck0y8tz.R.globalSliceStart(getClass().getName(),4616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1am2bz13k8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jy3jylck0y8tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jy3jylck0y8tz.R.globalSliceEnd(getClass().getName(),"com.google.gson.LruCacheTest.testCacheKeyOverwrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1am2bz13k8() throws Exception{try{__CLR4_4_13jy3jylck0y8tz.R.inc(4616);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4617);Cache<String, Integer> cache = new LruCache<String, Integer>(3);
    
    __CLR4_4_13jy3jylck0y8tz.R.inc(4618);String key = "key1";
    __CLR4_4_13jy3jylck0y8tz.R.inc(4619);assertNull(cache.getElement(key));
    __CLR4_4_13jy3jylck0y8tz.R.inc(4620);cache.addElement(key, 1);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4621);assertEquals(1, cache.getElement(key).intValue());
    
    __CLR4_4_13jy3jylck0y8tz.R.inc(4622);cache.addElement(key, 5);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4623);assertEquals(5, cache.getElement(key).intValue());
  }finally{__CLR4_4_13jy3jylck0y8tz.R.flushNeeded();}}
  
  public void testCacheEviction() throws Exception {__CLR4_4_13jy3jylck0y8tz.R.globalSliceStart(getClass().getName(),4624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12pglo63kg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13jy3jylck0y8tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13jy3jylck0y8tz.R.globalSliceEnd(getClass().getName(),"com.google.gson.LruCacheTest.testCacheEviction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12pglo63kg() throws Exception{try{__CLR4_4_13jy3jylck0y8tz.R.inc(4624);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4625);Cache<String, Integer> cache = new LruCache<String, Integer>(5);

    __CLR4_4_13jy3jylck0y8tz.R.inc(4626);cache.addElement("key1", 1);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4627);cache.addElement("key2", 2);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4628);cache.addElement("key3", 3);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4629);cache.addElement("key4", 4);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4630);cache.addElement("key5", 5);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4631);assertEquals(1, cache.getElement("key1").intValue());
    __CLR4_4_13jy3jylck0y8tz.R.inc(4632);assertEquals(2, cache.getElement("key2").intValue());
    __CLR4_4_13jy3jylck0y8tz.R.inc(4633);assertEquals(3, cache.getElement("key3").intValue());
    __CLR4_4_13jy3jylck0y8tz.R.inc(4634);assertEquals(4, cache.getElement("key4").intValue());
    __CLR4_4_13jy3jylck0y8tz.R.inc(4635);assertEquals(5, cache.getElement("key5").intValue());

    // Access key1 to show key2 will be evicted (shows not a FIFO cache)
    __CLR4_4_13jy3jylck0y8tz.R.inc(4636);cache.getElement("key1");
    __CLR4_4_13jy3jylck0y8tz.R.inc(4637);cache.getElement("key3");
    __CLR4_4_13jy3jylck0y8tz.R.inc(4638);cache.addElement("key6", 6);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4639);cache.addElement("key7", 7);
    __CLR4_4_13jy3jylck0y8tz.R.inc(4640);assertEquals(1, cache.getElement("key1").intValue());
    __CLR4_4_13jy3jylck0y8tz.R.inc(4641);assertNull(cache.getElement("key2"));
    __CLR4_4_13jy3jylck0y8tz.R.inc(4642);assertEquals(3, cache.getElement("key3").intValue());
    __CLR4_4_13jy3jylck0y8tz.R.inc(4643);assertNull(cache.getElement("key4"));
    __CLR4_4_13jy3jylck0y8tz.R.inc(4644);assertEquals(5, cache.getElement("key5").intValue());
    __CLR4_4_13jy3jylck0y8tz.R.inc(4645);assertEquals(6, cache.getElement("key6").intValue());
    __CLR4_4_13jy3jylck0y8tz.R.inc(4646);assertEquals(7, cache.getElement("key7").intValue());
  }finally{__CLR4_4_13jy3jylck0y8tz.R.flushNeeded();}}
}
