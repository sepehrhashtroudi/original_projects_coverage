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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.common.MoreAsserts;
import com.google.gson.reflect.TypeToken;

/**
 * Functional tests for Java 5.0 enums.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class EnumTest extends TestCase {static class __CLR4_4_155y55ylck0y93v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,6747,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  
  private Gson gson;
  
  @Override
  protected void setUp() throws Exception {try{__CLR4_4_155y55ylck0y93v.R.inc(6694);
    __CLR4_4_155y55ylck0y93v.R.inc(6695);super.setUp();
    __CLR4_4_155y55ylck0y93v.R.inc(6696);gson = new Gson();
  }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}
  
  public void testTopLevelEnumSerialization() throws Exception {__CLR4_4_155y55ylck0y93v.R.globalSliceStart(getClass().getName(),6697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ieftw5561();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_155y55ylck0y93v.R.rethrow($CLV_t2$);}finally{__CLR4_4_155y55ylck0y93v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.EnumTest.testTopLevelEnumSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ieftw5561() throws Exception{try{__CLR4_4_155y55ylck0y93v.R.inc(6697);
    __CLR4_4_155y55ylck0y93v.R.inc(6698);String result = gson.toJson(MyEnum.VALUE1);
    __CLR4_4_155y55ylck0y93v.R.inc(6699);assertEquals('"' + MyEnum.VALUE1.toString() + '"', result);
  }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}
  
  public void testTopLevelEnumDeserialization() throws Exception {__CLR4_4_155y55ylck0y93v.R.globalSliceStart(getClass().getName(),6700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_165cje4564();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_155y55ylck0y93v.R.rethrow($CLV_t2$);}finally{__CLR4_4_155y55ylck0y93v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.EnumTest.testTopLevelEnumDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_165cje4564() throws Exception{try{__CLR4_4_155y55ylck0y93v.R.inc(6700);
    __CLR4_4_155y55ylck0y93v.R.inc(6701);MyEnum result = gson.fromJson('"' + MyEnum.VALUE1.toString() + '"', MyEnum.class);
    __CLR4_4_155y55ylck0y93v.R.inc(6702);assertEquals(MyEnum.VALUE1, result);
  }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}
  
  public void testTopLevelEnumInASingleElementArrayDeserialization() {__CLR4_4_155y55ylck0y93v.R.globalSliceStart(getClass().getName(),6703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vbjjr567();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_155y55ylck0y93v.R.rethrow($CLV_t2$);}finally{__CLR4_4_155y55ylck0y93v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.EnumTest.testTopLevelEnumInASingleElementArrayDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vbjjr567(){try{__CLR4_4_155y55ylck0y93v.R.inc(6703);
    __CLR4_4_155y55ylck0y93v.R.inc(6704);String json = "[" + MyEnum.VALUE1.getExpectedJson() + "]";
    __CLR4_4_155y55ylck0y93v.R.inc(6705);MyEnum target = gson.fromJson(json, MyEnum.class);
    __CLR4_4_155y55ylck0y93v.R.inc(6706);assertEquals(json, "[" + target.getExpectedJson() + "]");
  }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}

  public void testCollectionOfEnumsSerialization() {__CLR4_4_155y55ylck0y93v.R.globalSliceStart(getClass().getName(),6707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zbir856b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_155y55ylck0y93v.R.rethrow($CLV_t2$);}finally{__CLR4_4_155y55ylck0y93v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.EnumTest.testCollectionOfEnumsSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zbir856b(){try{__CLR4_4_155y55ylck0y93v.R.inc(6707);
    __CLR4_4_155y55ylck0y93v.R.inc(6708);Type type = new TypeToken<Collection<MyEnum>>() {}.getType();
    __CLR4_4_155y55ylck0y93v.R.inc(6709);Collection<MyEnum> target = new ArrayList<MyEnum>();
    __CLR4_4_155y55ylck0y93v.R.inc(6710);target.add(MyEnum.VALUE1);
    __CLR4_4_155y55ylck0y93v.R.inc(6711);target.add(MyEnum.VALUE2);
    __CLR4_4_155y55ylck0y93v.R.inc(6712);String expectedJson = "[\"VALUE1\",\"VALUE2\"]";
    __CLR4_4_155y55ylck0y93v.R.inc(6713);String actualJson = gson.toJson(target);
    __CLR4_4_155y55ylck0y93v.R.inc(6714);assertEquals(expectedJson, actualJson);
    __CLR4_4_155y55ylck0y93v.R.inc(6715);actualJson = gson.toJson(target, type);
    __CLR4_4_155y55ylck0y93v.R.inc(6716);assertEquals(expectedJson, actualJson);
  }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}

  public void testCollectionOfEnumsDeserialization() {__CLR4_4_155y55ylck0y93v.R.globalSliceStart(getClass().getName(),6717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11f9lth56l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_155y55ylck0y93v.R.rethrow($CLV_t2$);}finally{__CLR4_4_155y55ylck0y93v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.EnumTest.testCollectionOfEnumsDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11f9lth56l(){try{__CLR4_4_155y55ylck0y93v.R.inc(6717);
    __CLR4_4_155y55ylck0y93v.R.inc(6718);Type type = new TypeToken<Collection<MyEnum>>() {}.getType();
    __CLR4_4_155y55ylck0y93v.R.inc(6719);String json = "[\"VALUE1\",\"VALUE2\"]";
    __CLR4_4_155y55ylck0y93v.R.inc(6720);Collection<MyEnum> target = gson.fromJson(json, type);
    __CLR4_4_155y55ylck0y93v.R.inc(6721);MoreAsserts.assertContains(target, MyEnum.VALUE1);
    __CLR4_4_155y55ylck0y93v.R.inc(6722);MoreAsserts.assertContains(target, MyEnum.VALUE2);
  }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}

  public void testClassWithEnumFieldSerialization() throws Exception {__CLR4_4_155y55ylck0y93v.R.globalSliceStart(getClass().getName(),6723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ul25256r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_155y55ylck0y93v.R.rethrow($CLV_t2$);}finally{__CLR4_4_155y55ylck0y93v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.EnumTest.testClassWithEnumFieldSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ul25256r() throws Exception{try{__CLR4_4_155y55ylck0y93v.R.inc(6723);
    __CLR4_4_155y55ylck0y93v.R.inc(6724);ClassWithEnumFields target = new ClassWithEnumFields();
    __CLR4_4_155y55ylck0y93v.R.inc(6725);assertEquals(target.getExpectedJson(), gson.toJson(target));
  }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}

  public void testClassWithEnumFieldDeserialization() throws Exception {__CLR4_4_155y55ylck0y93v.R.globalSliceStart(getClass().getName(),6726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l8m1j56u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_155y55ylck0y93v.R.rethrow($CLV_t2$);}finally{__CLR4_4_155y55ylck0y93v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.EnumTest.testClassWithEnumFieldDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l8m1j56u() throws Exception{try{__CLR4_4_155y55ylck0y93v.R.inc(6726);
    __CLR4_4_155y55ylck0y93v.R.inc(6727);String json = "{value1:'VALUE1',value2:'VALUE2'}";
    __CLR4_4_155y55ylck0y93v.R.inc(6728);ClassWithEnumFields target = gson.fromJson(json, ClassWithEnumFields.class);
    __CLR4_4_155y55ylck0y93v.R.inc(6729);assertEquals(MyEnum.VALUE1,target.value1);
    __CLR4_4_155y55ylck0y93v.R.inc(6730);assertEquals(MyEnum.VALUE2,target.value2);
  }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}
  
  private static enum MyEnum {
    VALUE1, VALUE2;

    public String getExpectedJson() {try{__CLR4_4_155y55ylck0y93v.R.inc(6731);
      __CLR4_4_155y55ylck0y93v.R.inc(6732);return "\"" + toString() + "\"";
    }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}
  }

  private static class ClassWithEnumFields {
    private final MyEnum value1 = MyEnum.VALUE1;
    private final MyEnum value2 = MyEnum.VALUE2;
    public String getExpectedJson() {try{__CLR4_4_155y55ylck0y93v.R.inc(6733);
      __CLR4_4_155y55ylck0y93v.R.inc(6734);return "{\"value1\":\"" + value1 + "\",\"value2\":\"" + value2 + "\"}";
    }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}
  }

  /**
   * Test for issue 226.
   */
  public void testEnumSubclass() {__CLR4_4_155y55ylck0y93v.R.globalSliceStart(getClass().getName(),6735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d5sg0e573();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_155y55ylck0y93v.R.rethrow($CLV_t2$);}finally{__CLR4_4_155y55ylck0y93v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.EnumTest.testEnumSubclass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d5sg0e573(){try{__CLR4_4_155y55ylck0y93v.R.inc(6735);
    __CLR4_4_155y55ylck0y93v.R.inc(6736);assertFalse(Roshambo.class == Roshambo.ROCK.getClass());
    __CLR4_4_155y55ylck0y93v.R.inc(6737);assertEquals("\"ROCK\"", gson.toJson(Roshambo.ROCK));
    __CLR4_4_155y55ylck0y93v.R.inc(6738);assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(EnumSet.allOf(Roshambo.class)));
    __CLR4_4_155y55ylck0y93v.R.inc(6739);assertEquals(Roshambo.ROCK, gson.fromJson("\"ROCK\"", Roshambo.class));
    __CLR4_4_155y55ylck0y93v.R.inc(6740);assertEquals(EnumSet.allOf(Roshambo.class),
        gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new TypeToken<Set<Roshambo>>() {}.getType()));
  }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}

  private enum Roshambo {
    ROCK {
      @Override Roshambo defeats() {try{__CLR4_4_155y55ylck0y93v.R.inc(6741);
        __CLR4_4_155y55ylck0y93v.R.inc(6742);return SCISSORS;
      }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}
    },
    PAPER {
      @Override Roshambo defeats() {try{__CLR4_4_155y55ylck0y93v.R.inc(6743);
        __CLR4_4_155y55ylck0y93v.R.inc(6744);return ROCK;
      }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}
    },
    SCISSORS {
      @Override Roshambo defeats() {try{__CLR4_4_155y55ylck0y93v.R.inc(6745);
        __CLR4_4_155y55ylck0y93v.R.inc(6746);return PAPER;
      }finally{__CLR4_4_155y55ylck0y93v.R.flushNeeded();}}
    };

    abstract Roshambo defeats();
  }
}
