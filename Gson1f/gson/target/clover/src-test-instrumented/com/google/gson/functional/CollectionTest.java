/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2008 Google Inc.
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

package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.common.MoreAsserts;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Functional tests for Json serialization and deserialization of collections.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CollectionTest extends TestCase {static class __CLR4_4_14hg4hglck0y90e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,6025,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14hg4hglck0y90e.R.inc(5812);
    __CLR4_4_14hg4hglck0y90e.R.inc(5813);super.setUp();
    __CLR4_4_14hg4hglck0y90e.R.inc(5814);gson = new Gson();
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testTopLevelCollectionOfIntegersSerialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtzm3w4hj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testTopLevelCollectionOfIntegersSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtzm3w4hj(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5815);
    __CLR4_4_14hg4hglck0y90e.R.inc(5816);Collection<Integer> target = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    __CLR4_4_14hg4hglck0y90e.R.inc(5817);Type targetType = new TypeToken<Collection<Integer>>() {}.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5818);String json = gson.toJson(target, targetType);
    __CLR4_4_14hg4hglck0y90e.R.inc(5819);assertEquals("[1,2,3,4,5,6,7,8,9]", json);
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testTopLevelCollectionOfIntegersDeserialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bwsyaz4ho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testTopLevelCollectionOfIntegersDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bwsyaz4ho(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5820);
    __CLR4_4_14hg4hglck0y90e.R.inc(5821);String json = "[0,1,2,3,4,5,6,7,8,9]";
    __CLR4_4_14hg4hglck0y90e.R.inc(5822);Type collectionType = new TypeToken<Collection<Integer>>() { }.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5823);Collection<Integer> target = gson.fromJson(json, collectionType);
    __CLR4_4_14hg4hglck0y90e.R.inc(5824);int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    __CLR4_4_14hg4hglck0y90e.R.inc(5825);MoreAsserts.assertEquals(expected, toIntArray(target));
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testTopLevelListOfIntegerCollectionsDeserialization() throws Exception {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n3k0n4hu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testTopLevelListOfIntegerCollectionsDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n3k0n4hu() throws Exception{try{__CLR4_4_14hg4hglck0y90e.R.inc(5826);
    __CLR4_4_14hg4hglck0y90e.R.inc(5827);String json = "[[1,2,3],[4,5,6],[7,8,9]]";
    __CLR4_4_14hg4hglck0y90e.R.inc(5828);Type collectionType = new TypeToken<Collection<Collection<Integer>>>() {}.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5829);List<Collection<Integer>> target = gson.fromJson(json, collectionType);
    __CLR4_4_14hg4hglck0y90e.R.inc(5830);int[][] expected = new int[3][3];
    __CLR4_4_14hg4hglck0y90e.R.inc(5831);for (int i = 0; (((i < 3)&&(__CLR4_4_14hg4hglck0y90e.R.iget(5832)!=0|true))||(__CLR4_4_14hg4hglck0y90e.R.iget(5833)==0&false)); ++i) {{
      __CLR4_4_14hg4hglck0y90e.R.inc(5834);int start = (3 * i) + 1;
      __CLR4_4_14hg4hglck0y90e.R.inc(5835);for (int j = 0; (((j < 3)&&(__CLR4_4_14hg4hglck0y90e.R.iget(5836)!=0|true))||(__CLR4_4_14hg4hglck0y90e.R.iget(5837)==0&false)); ++j) {{
        __CLR4_4_14hg4hglck0y90e.R.inc(5838);expected[i][j] = start + j;
      }
    }}

    }__CLR4_4_14hg4hglck0y90e.R.inc(5839);for (int i = 0; (((i < 3)&&(__CLR4_4_14hg4hglck0y90e.R.iget(5840)!=0|true))||(__CLR4_4_14hg4hglck0y90e.R.iget(5841)==0&false)); i++) {{
      __CLR4_4_14hg4hglck0y90e.R.inc(5842);MoreAsserts.assertEquals(expected[i], toIntArray(target.get(i)));
    }
  }}finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}
  
  public void testLinkedListSerialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qtnhyq4ib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testLinkedListSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qtnhyq4ib(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5843);
    __CLR4_4_14hg4hglck0y90e.R.inc(5844);List<String> list = new LinkedList<String>();
    __CLR4_4_14hg4hglck0y90e.R.inc(5845);list.add("a1");
    __CLR4_4_14hg4hglck0y90e.R.inc(5846);list.add("a2");
    __CLR4_4_14hg4hglck0y90e.R.inc(5847);Type linkedListType = new TypeToken<LinkedList<String>>() {}.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5848);String json = gson.toJson(list, linkedListType);
    __CLR4_4_14hg4hglck0y90e.R.inc(5849);assertTrue(json.contains("a1"));
    __CLR4_4_14hg4hglck0y90e.R.inc(5850);assertTrue(json.contains("a2"));
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testLinkedListDeserialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13qpiod4ij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testLinkedListDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13qpiod4ij(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5851);
    __CLR4_4_14hg4hglck0y90e.R.inc(5852);String json = "['a1','a2']";
    __CLR4_4_14hg4hglck0y90e.R.inc(5853);Type linkedListType = new TypeToken<LinkedList<String>>() {}.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5854);List<String> list = gson.fromJson(json, linkedListType);
    __CLR4_4_14hg4hglck0y90e.R.inc(5855);assertEquals("a1", list.get(0));
    __CLR4_4_14hg4hglck0y90e.R.inc(5856);assertEquals("a2", list.get(1));
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testQueueSerialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dk37s4ip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testQueueSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dk37s4ip(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5857);
    __CLR4_4_14hg4hglck0y90e.R.inc(5858);Queue<String> queue = new LinkedList<String>();
    __CLR4_4_14hg4hglck0y90e.R.inc(5859);queue.add("a1");
    __CLR4_4_14hg4hglck0y90e.R.inc(5860);queue.add("a2");
    __CLR4_4_14hg4hglck0y90e.R.inc(5861);Type queueType = new TypeToken<Queue<String>>() {}.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5862);String json = gson.toJson(queue, queueType);
    __CLR4_4_14hg4hglck0y90e.R.inc(5863);assertTrue(json.contains("a1"));
    __CLR4_4_14hg4hglck0y90e.R.inc(5864);assertTrue(json.contains("a2"));
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testQueueDeserialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6gz7t4ix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testQueueDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6gz7t4ix(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5865);
    __CLR4_4_14hg4hglck0y90e.R.inc(5866);String json = "['a1','a2']";
    __CLR4_4_14hg4hglck0y90e.R.inc(5867);Type queueType = new TypeToken<Queue<String>>() {}.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5868);Queue<String> queue = gson.fromJson(json, queueType);
    __CLR4_4_14hg4hglck0y90e.R.inc(5869);assertEquals("a1", queue.element()); 
    __CLR4_4_14hg4hglck0y90e.R.inc(5870);queue.remove();
    __CLR4_4_14hg4hglck0y90e.R.inc(5871);assertEquals("a2", queue.element());
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testNullsInListSerialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178xda24j4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testNullsInListSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178xda24j4(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5872);
    __CLR4_4_14hg4hglck0y90e.R.inc(5873);List<String> list = new ArrayList<String>();
    __CLR4_4_14hg4hglck0y90e.R.inc(5874);list.add("foo");
    __CLR4_4_14hg4hglck0y90e.R.inc(5875);list.add(null);
    __CLR4_4_14hg4hglck0y90e.R.inc(5876);list.add("bar");
    __CLR4_4_14hg4hglck0y90e.R.inc(5877);String expected = "[\"foo\",null,\"bar\"]";
    __CLR4_4_14hg4hglck0y90e.R.inc(5878);Type typeOfList = new TypeToken<List<String>>() {}.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5879);String json = gson.toJson(list, typeOfList);
    __CLR4_4_14hg4hglck0y90e.R.inc(5880);assertEquals(expected, json);
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testNullsInListDeserialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11cu9dl4jd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testNullsInListDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11cu9dl4jd(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5881);
    __CLR4_4_14hg4hglck0y90e.R.inc(5882);List<String> expected = new ArrayList<String>();
    __CLR4_4_14hg4hglck0y90e.R.inc(5883);expected.add("foo");
    __CLR4_4_14hg4hglck0y90e.R.inc(5884);expected.add(null);
    __CLR4_4_14hg4hglck0y90e.R.inc(5885);expected.add("bar");
    __CLR4_4_14hg4hglck0y90e.R.inc(5886);String json = "[\"foo\",null,\"bar\"]";
    __CLR4_4_14hg4hglck0y90e.R.inc(5887);Type expectedType = new TypeToken<List<String>>() {}.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5888);List<String> target = gson.fromJson(json, expectedType);
    __CLR4_4_14hg4hglck0y90e.R.inc(5889);for (int i = 0; (((i < expected.size())&&(__CLR4_4_14hg4hglck0y90e.R.iget(5890)!=0|true))||(__CLR4_4_14hg4hglck0y90e.R.iget(5891)==0&false)); ++i) {{
      __CLR4_4_14hg4hglck0y90e.R.inc(5892);assertEquals(expected.get(i), target.get(i));
    }
  }}finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testCollectionOfObjectSerialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ysevj4jp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testCollectionOfObjectSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ysevj4jp(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5893);
    __CLR4_4_14hg4hglck0y90e.R.inc(5894);List<Object> target = new ArrayList<Object>();
    __CLR4_4_14hg4hglck0y90e.R.inc(5895);target.add("Hello");
    __CLR4_4_14hg4hglck0y90e.R.inc(5896);target.add("World");
    __CLR4_4_14hg4hglck0y90e.R.inc(5897);assertEquals("[\"Hello\",\"World\"]", gson.toJson(target));
    
    __CLR4_4_14hg4hglck0y90e.R.inc(5898);Type type = new TypeToken<List<Object>>() {}.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5899);assertEquals("[\"Hello\",\"World\"]", gson.toJson(target, type));
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}
  
  public void testCollectionOfObjectWithNullSerialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ye0mw44jw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testCollectionOfObjectWithNullSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ye0mw44jw(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5900);
    __CLR4_4_14hg4hglck0y90e.R.inc(5901);List<Object> target = new ArrayList<Object>();
    __CLR4_4_14hg4hglck0y90e.R.inc(5902);target.add("Hello");
    __CLR4_4_14hg4hglck0y90e.R.inc(5903);target.add(null);
    __CLR4_4_14hg4hglck0y90e.R.inc(5904);target.add("World");
    __CLR4_4_14hg4hglck0y90e.R.inc(5905);assertEquals("[\"Hello\",null,\"World\"]", gson.toJson(target));
    
    __CLR4_4_14hg4hglck0y90e.R.inc(5906);Type type = new TypeToken<List<Object>>() {}.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5907);assertEquals("[\"Hello\",null,\"World\"]", gson.toJson(target, type));
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testCollectionOfStringsSerialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ny8i1w4k4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testCollectionOfStringsSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ny8i1w4k4(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5908);
    __CLR4_4_14hg4hglck0y90e.R.inc(5909);List<String> target = new ArrayList<String>();
    __CLR4_4_14hg4hglck0y90e.R.inc(5910);target.add("Hello");
    __CLR4_4_14hg4hglck0y90e.R.inc(5911);target.add("World");
    __CLR4_4_14hg4hglck0y90e.R.inc(5912);assertEquals("[\"Hello\",\"World\"]", gson.toJson(target));
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testCollectionOfBagOfPrimitivesSerialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lp8ftf4k9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testCollectionOfBagOfPrimitivesSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lp8ftf4k9(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5913);
    __CLR4_4_14hg4hglck0y90e.R.inc(5914);List<BagOfPrimitives> target = new ArrayList<BagOfPrimitives>();
    __CLR4_4_14hg4hglck0y90e.R.inc(5915);BagOfPrimitives objA = new BagOfPrimitives(3L, 1, true, "blah");
    __CLR4_4_14hg4hglck0y90e.R.inc(5916);BagOfPrimitives objB = new BagOfPrimitives(2L, 6, false, "blahB");
    __CLR4_4_14hg4hglck0y90e.R.inc(5917);target.add(objA);
    __CLR4_4_14hg4hglck0y90e.R.inc(5918);target.add(objB);

    __CLR4_4_14hg4hglck0y90e.R.inc(5919);String result = gson.toJson(target);
    __CLR4_4_14hg4hglck0y90e.R.inc(5920);assertTrue(result.startsWith("["));
    __CLR4_4_14hg4hglck0y90e.R.inc(5921);assertTrue(result.endsWith("]"));
    __CLR4_4_14hg4hglck0y90e.R.inc(5922);for (BagOfPrimitives obj : target) {{
      __CLR4_4_14hg4hglck0y90e.R.inc(5923);assertTrue(result.contains(obj.getExpectedJson()));
    }
  }}finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testCollectionOfStringsDeserialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15tbyw54kk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testCollectionOfStringsDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15tbyw54kk(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5924);
    __CLR4_4_14hg4hglck0y90e.R.inc(5925);String json = "[\"Hello\",\"World\"]";
    __CLR4_4_14hg4hglck0y90e.R.inc(5926);Type collectionType = new TypeToken<Collection<String>>() { }.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5927);Collection<String> target = gson.fromJson(json, collectionType);

    __CLR4_4_14hg4hglck0y90e.R.inc(5928);assertTrue(target.contains("Hello"));
    __CLR4_4_14hg4hglck0y90e.R.inc(5929);assertTrue(target.contains("World"));
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testRawCollectionOfIntegersSerialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfysuv4kq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testRawCollectionOfIntegersSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfysuv4kq(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5930);
    __CLR4_4_14hg4hglck0y90e.R.inc(5931);Collection<Integer> target = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    __CLR4_4_14hg4hglck0y90e.R.inc(5932);assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target));
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  @SuppressWarnings({ "rawtypes" })
  public void testRawCollectionSerialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xpfa714kt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testRawCollectionSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xpfa714kt(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5933);
    __CLR4_4_14hg4hglck0y90e.R.inc(5934);BagOfPrimitives bag1 = new BagOfPrimitives();
    __CLR4_4_14hg4hglck0y90e.R.inc(5935);Collection target = Arrays.asList(bag1, bag1);
    __CLR4_4_14hg4hglck0y90e.R.inc(5936);String json = gson.toJson(target);
    __CLR4_4_14hg4hglck0y90e.R.inc(5937);assertTrue(json.contains(bag1.getExpectedJson()));
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  public void testRawCollectionDeserializationNotAlllowed() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xury1b4ky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testRawCollectionDeserializationNotAlllowed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xury1b4ky(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5938);
    __CLR4_4_14hg4hglck0y90e.R.inc(5939);String json = "[0,1,2,3,4,5,6,7,8,9]";
    __CLR4_4_14hg4hglck0y90e.R.inc(5940);try {
        __CLR4_4_14hg4hglck0y90e.R.inc(5941);gson.fromJson(json, Collection.class);
        __CLR4_4_14hg4hglck0y90e.R.inc(5942);fail("Can not deserialize a non-genericized collection.");
    } catch (JsonParseException expected) { }

    __CLR4_4_14hg4hglck0y90e.R.inc(5943);json = "[\"Hello\", \"World\"]";
    __CLR4_4_14hg4hglck0y90e.R.inc(5944);try {
      __CLR4_4_14hg4hglck0y90e.R.inc(5945);gson.fromJson(json, Collection.class);
      __CLR4_4_14hg4hglck0y90e.R.inc(5946);fail("Can not deserialize a non-genericized collection.");
    } catch (JsonParseException expected) { }
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  @SuppressWarnings({ "unchecked", "rawtypes" })
  public void testRawCollectionOfBagOfPrimitivesNotAllowed() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lsb3ek4l7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testRawCollectionOfBagOfPrimitivesNotAllowed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lsb3ek4l7(){try{__CLR4_4_14hg4hglck0y90e.R.inc(5947);
    __CLR4_4_14hg4hglck0y90e.R.inc(5948);try {
      __CLR4_4_14hg4hglck0y90e.R.inc(5949);BagOfPrimitives bag = new BagOfPrimitives(10, 20, false, "stringValue");
      __CLR4_4_14hg4hglck0y90e.R.inc(5950);String json = '[' + bag.getExpectedJson() + ',' + bag.getExpectedJson() + ']';
      __CLR4_4_14hg4hglck0y90e.R.inc(5951);Collection target = gson.fromJson(json, Collection.class);
      __CLR4_4_14hg4hglck0y90e.R.inc(5952);assertEquals(2, target.size());
      __CLR4_4_14hg4hglck0y90e.R.inc(5953);for (BagOfPrimitives bag1 : (Collection<BagOfPrimitives>) target) {{
        __CLR4_4_14hg4hglck0y90e.R.inc(5954);assertEquals(bag.getExpectedJson(), bag1.getExpectedJson());
      }
      }__CLR4_4_14hg4hglck0y90e.R.inc(5955);fail("Raw collection of objects should not work");
    } catch (JsonParseException expected) {
    }
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}
  
  public void testWildcardPrimitiveCollectionSerilaization() throws Exception {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5p7ho4lg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testWildcardPrimitiveCollectionSerilaization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5p7ho4lg() throws Exception{try{__CLR4_4_14hg4hglck0y90e.R.inc(5956);
    __CLR4_4_14hg4hglck0y90e.R.inc(5957);Collection<? extends Integer> target = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    __CLR4_4_14hg4hglck0y90e.R.inc(5958);Type collectionType = new TypeToken<Collection<? extends Integer>>() { }.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5959);String json = gson.toJson(target, collectionType);
    __CLR4_4_14hg4hglck0y90e.R.inc(5960);assertEquals("[1,2,3,4,5,6,7,8,9]", json);
    
    __CLR4_4_14hg4hglck0y90e.R.inc(5961);json = gson.toJson(target);
    __CLR4_4_14hg4hglck0y90e.R.inc(5962);assertEquals("[1,2,3,4,5,6,7,8,9]", json);
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}
  
  public void testWildcardPrimitiveCollectionDeserilaization() throws Exception {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jy9eb14ln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testWildcardPrimitiveCollectionDeserilaization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jy9eb14ln() throws Exception{try{__CLR4_4_14hg4hglck0y90e.R.inc(5963);
    __CLR4_4_14hg4hglck0y90e.R.inc(5964);String json = "[1,2,3,4,5,6,7,8,9]";
    __CLR4_4_14hg4hglck0y90e.R.inc(5965);Type collectionType = new TypeToken<Collection<? extends Integer>>() { }.getType();
    __CLR4_4_14hg4hglck0y90e.R.inc(5966);Collection<? extends Integer> target = gson.fromJson(json, collectionType);
    __CLR4_4_14hg4hglck0y90e.R.inc(5967);assertEquals(9, target.size());
    __CLR4_4_14hg4hglck0y90e.R.inc(5968);assertTrue(target.contains(1));
    __CLR4_4_14hg4hglck0y90e.R.inc(5969);assertTrue(target.contains(9));
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}
  
  public void testWildcardCollectionField() throws Exception {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),5970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n7njtj4lu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testWildcardCollectionField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n7njtj4lu() throws Exception{try{__CLR4_4_14hg4hglck0y90e.R.inc(5970);
    __CLR4_4_14hg4hglck0y90e.R.inc(5971);Collection<BagOfPrimitives> collection = new ArrayList<BagOfPrimitives>();
    __CLR4_4_14hg4hglck0y90e.R.inc(5972);BagOfPrimitives objA = new BagOfPrimitives(3L, 1, true, "blah");
    __CLR4_4_14hg4hglck0y90e.R.inc(5973);BagOfPrimitives objB = new BagOfPrimitives(2L, 6, false, "blahB");
    __CLR4_4_14hg4hglck0y90e.R.inc(5974);collection.add(objA);
    __CLR4_4_14hg4hglck0y90e.R.inc(5975);collection.add(objB);
    
    __CLR4_4_14hg4hglck0y90e.R.inc(5976);ObjectWithWildcardCollection target = new ObjectWithWildcardCollection(collection);
    __CLR4_4_14hg4hglck0y90e.R.inc(5977);String json = gson.toJson(target);
    __CLR4_4_14hg4hglck0y90e.R.inc(5978);assertTrue(json.contains(objA.getExpectedJson()));
    __CLR4_4_14hg4hglck0y90e.R.inc(5979);assertTrue(json.contains(objB.getExpectedJson()));
    
    __CLR4_4_14hg4hglck0y90e.R.inc(5980);target = gson.fromJson(json, ObjectWithWildcardCollection.class);
    __CLR4_4_14hg4hglck0y90e.R.inc(5981);Collection<? extends BagOfPrimitives> deserializedCollection = target.getCollection();
    __CLR4_4_14hg4hglck0y90e.R.inc(5982);assertEquals(2, deserializedCollection.size());
    __CLR4_4_14hg4hglck0y90e.R.inc(5983);assertTrue(deserializedCollection.contains(objA));
    __CLR4_4_14hg4hglck0y90e.R.inc(5984);assertTrue(deserializedCollection.contains(objB));
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  @SuppressWarnings({ "rawtypes" })
  private static int[] toIntArray(Collection collection) {try{__CLR4_4_14hg4hglck0y90e.R.inc(5985);
    __CLR4_4_14hg4hglck0y90e.R.inc(5986);int[] ints = new int[collection.size()];
    __CLR4_4_14hg4hglck0y90e.R.inc(5987);int i = 0;
    __CLR4_4_14hg4hglck0y90e.R.inc(5988);for (Iterator iterator = collection.iterator(); (((iterator.hasNext())&&(__CLR4_4_14hg4hglck0y90e.R.iget(5989)!=0|true))||(__CLR4_4_14hg4hglck0y90e.R.iget(5990)==0&false)); ++i) {{
      __CLR4_4_14hg4hglck0y90e.R.inc(5991);Object obj = iterator.next();
      __CLR4_4_14hg4hglck0y90e.R.inc(5992);if ((((obj instanceof Integer)&&(__CLR4_4_14hg4hglck0y90e.R.iget(5993)!=0|true))||(__CLR4_4_14hg4hglck0y90e.R.iget(5994)==0&false))) {{
        __CLR4_4_14hg4hglck0y90e.R.inc(5995);ints[i] = ((Integer)obj).intValue();
      } }else {__CLR4_4_14hg4hglck0y90e.R.inc(5996);if ((((obj instanceof Long)&&(__CLR4_4_14hg4hglck0y90e.R.iget(5997)!=0|true))||(__CLR4_4_14hg4hglck0y90e.R.iget(5998)==0&false))) {{
        __CLR4_4_14hg4hglck0y90e.R.inc(5999);ints[i] = ((Long)obj).intValue();
      }
    }}}
    }__CLR4_4_14hg4hglck0y90e.R.inc(6000);return ints;
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}

  private static class ObjectWithWildcardCollection {
    private final Collection<? extends BagOfPrimitives> collection;

    // For use by Gson
    @SuppressWarnings({ "unchecked", "unused" })
    public ObjectWithWildcardCollection() {
      this(Collections.EMPTY_LIST);__CLR4_4_14hg4hglck0y90e.R.inc(6002);try{__CLR4_4_14hg4hglck0y90e.R.inc(6001);
    }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}
    
    public ObjectWithWildcardCollection(Collection<? extends BagOfPrimitives> collection) {try{__CLR4_4_14hg4hglck0y90e.R.inc(6003);
      __CLR4_4_14hg4hglck0y90e.R.inc(6004);this.collection = collection;
    }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}
    
    public Collection<? extends BagOfPrimitives> getCollection() {try{__CLR4_4_14hg4hglck0y90e.R.inc(6005);
      __CLR4_4_14hg4hglck0y90e.R.inc(6006);return collection;
    }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}
  }
  
  private static class Entry {
    int value;
    // For use by Gson
    @SuppressWarnings("unused")
    private Entry() {
      this(10);__CLR4_4_14hg4hglck0y90e.R.inc(6008);try{__CLR4_4_14hg4hglck0y90e.R.inc(6007);
    }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}
    Entry(int value) {try{__CLR4_4_14hg4hglck0y90e.R.inc(6009);
      __CLR4_4_14hg4hglck0y90e.R.inc(6010);this.value = value;
    }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}
  }
  public void testSetSerialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),6011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1luu9nd4mz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testSetSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1luu9nd4mz(){try{__CLR4_4_14hg4hglck0y90e.R.inc(6011);
    __CLR4_4_14hg4hglck0y90e.R.inc(6012);Set<Entry> set = new HashSet<Entry>(); 
    __CLR4_4_14hg4hglck0y90e.R.inc(6013);set.add(new Entry(1));
    __CLR4_4_14hg4hglck0y90e.R.inc(6014);set.add(new Entry(2));    
    __CLR4_4_14hg4hglck0y90e.R.inc(6015);String json = gson.toJson(set);
    __CLR4_4_14hg4hglck0y90e.R.inc(6016);assertTrue(json.contains("1"));
    __CLR4_4_14hg4hglck0y90e.R.inc(6017);assertTrue(json.contains("2"));
  }finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}
  public void testSetDeserialization() {__CLR4_4_14hg4hglck0y90e.R.globalSliceStart(getClass().getName(),6018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hygtly4n6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hg4hglck0y90e.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hg4hglck0y90e.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testSetDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hygtly4n6(){try{__CLR4_4_14hg4hglck0y90e.R.inc(6018);
    __CLR4_4_14hg4hglck0y90e.R.inc(6019);String json = "[{value:1},{value:2}]";
    __CLR4_4_14hg4hglck0y90e.R.inc(6020);Type type = new TypeToken<Set<Entry>>() {}.getType();        
    __CLR4_4_14hg4hglck0y90e.R.inc(6021);Set<Entry> set = gson.fromJson(json, type);
    __CLR4_4_14hg4hglck0y90e.R.inc(6022);assertEquals(2, set.size());
    __CLR4_4_14hg4hglck0y90e.R.inc(6023);for (Entry entry : set) {{
      __CLR4_4_14hg4hglck0y90e.R.inc(6024);assertTrue(entry.value == 1 || entry.value == 2);
    }
  }}finally{__CLR4_4_14hg4hglck0y90e.R.flushNeeded();}}
}
