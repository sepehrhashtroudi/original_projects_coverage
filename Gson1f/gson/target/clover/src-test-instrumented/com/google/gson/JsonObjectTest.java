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

package com.google.gson;

import junit.framework.TestCase;

/**
 * Unit test for the {@link JsonObject} class.
 *
 * @author Joel Leitch
 */
public class JsonObjectTest extends TestCase {static class __CLR4_4_13c03c0lck0y8sk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4385,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public void testAddingAndRemovingObjectProperties() throws Exception {__CLR4_4_13c03c0lck0y8sk.R.globalSliceStart(getClass().getName(),4320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tktpaa3c0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c03c0lck0y8sk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c03c0lck0y8sk.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonObjectTest.testAddingAndRemovingObjectProperties",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tktpaa3c0() throws Exception{try{__CLR4_4_13c03c0lck0y8sk.R.inc(4320);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4321);JsonObject jsonObj = new JsonObject();
    __CLR4_4_13c03c0lck0y8sk.R.inc(4322);String propertyName = "property";
    __CLR4_4_13c03c0lck0y8sk.R.inc(4323);assertFalse(jsonObj.has(propertyName));
    __CLR4_4_13c03c0lck0y8sk.R.inc(4324);assertNull(jsonObj.get(propertyName));

    __CLR4_4_13c03c0lck0y8sk.R.inc(4325);JsonPrimitive value = new JsonPrimitive("blah");
    __CLR4_4_13c03c0lck0y8sk.R.inc(4326);jsonObj.add(propertyName, value);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4327);assertEquals(value, jsonObj.get(propertyName));

    __CLR4_4_13c03c0lck0y8sk.R.inc(4328);JsonElement removedElement = jsonObj.remove(propertyName);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4329);assertEquals(value, removedElement);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4330);assertFalse(jsonObj.has(propertyName));
  }finally{__CLR4_4_13c03c0lck0y8sk.R.flushNeeded();}}

  public void testAddingNullPropertyValue() throws Exception {__CLR4_4_13c03c0lck0y8sk.R.globalSliceStart(getClass().getName(),4331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gheevd3cb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c03c0lck0y8sk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c03c0lck0y8sk.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonObjectTest.testAddingNullPropertyValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gheevd3cb() throws Exception{try{__CLR4_4_13c03c0lck0y8sk.R.inc(4331);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4332);String propertyName = "property";
    __CLR4_4_13c03c0lck0y8sk.R.inc(4333);JsonObject jsonObj = new JsonObject();
    __CLR4_4_13c03c0lck0y8sk.R.inc(4334);jsonObj.add(propertyName, null);

    __CLR4_4_13c03c0lck0y8sk.R.inc(4335);assertTrue(jsonObj.has(propertyName));

    __CLR4_4_13c03c0lck0y8sk.R.inc(4336);JsonElement jsonElement = jsonObj.get(propertyName);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4337);assertNotNull(jsonElement);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4338);assertTrue(jsonElement.isJsonNull());
  }finally{__CLR4_4_13c03c0lck0y8sk.R.flushNeeded();}}

  public void testAddingNullOrEmptyPropertyName() throws Exception {__CLR4_4_13c03c0lck0y8sk.R.globalSliceStart(getClass().getName(),4339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144jf3r3cj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c03c0lck0y8sk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c03c0lck0y8sk.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonObjectTest.testAddingNullOrEmptyPropertyName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144jf3r3cj() throws Exception{try{__CLR4_4_13c03c0lck0y8sk.R.inc(4339);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4340);JsonObject jsonObj = new JsonObject();
    __CLR4_4_13c03c0lck0y8sk.R.inc(4341);try {
      __CLR4_4_13c03c0lck0y8sk.R.inc(4342);jsonObj.add(null, JsonNull.createJsonNull());
      __CLR4_4_13c03c0lck0y8sk.R.inc(4343);fail("Should not allow null property names.");
    } catch (IllegalArgumentException expected) { }

    __CLR4_4_13c03c0lck0y8sk.R.inc(4344);jsonObj.add("", JsonNull.createJsonNull());
    __CLR4_4_13c03c0lck0y8sk.R.inc(4345);jsonObj.add("   \t", JsonNull.createJsonNull());
  }finally{__CLR4_4_13c03c0lck0y8sk.R.flushNeeded();}}

  public void testAddingBooleanProperties() throws Exception {__CLR4_4_13c03c0lck0y8sk.R.globalSliceStart(getClass().getName(),4346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116075b3cq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c03c0lck0y8sk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c03c0lck0y8sk.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonObjectTest.testAddingBooleanProperties",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116075b3cq() throws Exception{try{__CLR4_4_13c03c0lck0y8sk.R.inc(4346);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4347);String propertyName = "property";
    __CLR4_4_13c03c0lck0y8sk.R.inc(4348);JsonObject jsonObj = new JsonObject();
    __CLR4_4_13c03c0lck0y8sk.R.inc(4349);jsonObj.addProperty(propertyName, true);

    __CLR4_4_13c03c0lck0y8sk.R.inc(4350);assertTrue(jsonObj.has(propertyName));

    __CLR4_4_13c03c0lck0y8sk.R.inc(4351);JsonElement jsonElement = jsonObj.get(propertyName);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4352);assertNotNull(jsonElement);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4353);assertTrue(jsonElement.getAsBoolean());
  }finally{__CLR4_4_13c03c0lck0y8sk.R.flushNeeded();}}

  public void testAddingStringProperties() throws Exception {__CLR4_4_13c03c0lck0y8sk.R.globalSliceStart(getClass().getName(),4354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kpcry63cy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c03c0lck0y8sk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c03c0lck0y8sk.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonObjectTest.testAddingStringProperties",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kpcry63cy() throws Exception{try{__CLR4_4_13c03c0lck0y8sk.R.inc(4354);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4355);String propertyName = "property";
    __CLR4_4_13c03c0lck0y8sk.R.inc(4356);String value = "blah";

    __CLR4_4_13c03c0lck0y8sk.R.inc(4357);JsonObject jsonObj = new JsonObject();
    __CLR4_4_13c03c0lck0y8sk.R.inc(4358);jsonObj.addProperty(propertyName, value);

    __CLR4_4_13c03c0lck0y8sk.R.inc(4359);assertTrue(jsonObj.has(propertyName));

    __CLR4_4_13c03c0lck0y8sk.R.inc(4360);JsonElement jsonElement = jsonObj.get(propertyName);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4361);assertNotNull(jsonElement);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4362);assertEquals(value, jsonElement.getAsString());
  }finally{__CLR4_4_13c03c0lck0y8sk.R.flushNeeded();}}

  public void testAddingCharacterProperties() throws Exception {__CLR4_4_13c03c0lck0y8sk.R.globalSliceStart(getClass().getName(),4363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqaf003d7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c03c0lck0y8sk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c03c0lck0y8sk.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonObjectTest.testAddingCharacterProperties",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqaf003d7() throws Exception{try{__CLR4_4_13c03c0lck0y8sk.R.inc(4363);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4364);String propertyName = "property";
    __CLR4_4_13c03c0lck0y8sk.R.inc(4365);char value = 'a';

    __CLR4_4_13c03c0lck0y8sk.R.inc(4366);JsonObject jsonObj = new JsonObject();
    __CLR4_4_13c03c0lck0y8sk.R.inc(4367);jsonObj.addProperty(propertyName, value);

    __CLR4_4_13c03c0lck0y8sk.R.inc(4368);assertTrue(jsonObj.has(propertyName));

    __CLR4_4_13c03c0lck0y8sk.R.inc(4369);JsonElement jsonElement = jsonObj.get(propertyName);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4370);assertNotNull(jsonElement);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4371);assertEquals(String.valueOf(value), jsonElement.getAsString());
    __CLR4_4_13c03c0lck0y8sk.R.inc(4372);assertEquals(value, jsonElement.getAsCharacter());
  }finally{__CLR4_4_13c03c0lck0y8sk.R.flushNeeded();}}

  /**
   * From bug report http://code.google.com/p/google-gson/issues/detail?id=182
   */
  public void testPropertyWithQuotes() {__CLR4_4_13c03c0lck0y8sk.R.globalSliceStart(getClass().getName(),4373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osn4p73dh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c03c0lck0y8sk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c03c0lck0y8sk.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonObjectTest.testPropertyWithQuotes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osn4p73dh(){try{__CLR4_4_13c03c0lck0y8sk.R.inc(4373);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4374);JsonObject jsonObj = new JsonObject();
    __CLR4_4_13c03c0lck0y8sk.R.inc(4375);jsonObj.add("a\"b", new JsonPrimitive("c\"d"));
    __CLR4_4_13c03c0lck0y8sk.R.inc(4376);String json = new Gson().toJson(jsonObj);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4377);assertEquals("{\"a\\\"b\":\"c\\\"d\"}", json);
  }finally{__CLR4_4_13c03c0lck0y8sk.R.flushNeeded();}}

  /**
   * From issue 227.
   */
  public void testWritePropertyWithEmptyStringName() {__CLR4_4_13c03c0lck0y8sk.R.globalSliceStart(getClass().getName(),4378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131b1zs3dm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c03c0lck0y8sk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c03c0lck0y8sk.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonObjectTest.testWritePropertyWithEmptyStringName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131b1zs3dm(){try{__CLR4_4_13c03c0lck0y8sk.R.inc(4378);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4379);JsonObject jsonObj = new JsonObject();
    __CLR4_4_13c03c0lck0y8sk.R.inc(4380);jsonObj.add("", new JsonPrimitive(true));
    __CLR4_4_13c03c0lck0y8sk.R.inc(4381);assertEquals("{\"\":true}", new Gson().toJson(jsonObj));

  }finally{__CLR4_4_13c03c0lck0y8sk.R.flushNeeded();}}

  public void testReadPropertyWithEmptyStringName() {__CLR4_4_13c03c0lck0y8sk.R.globalSliceStart(getClass().getName(),4382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uoiq7n3dq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13c03c0lck0y8sk.R.rethrow($CLV_t2$);}finally{__CLR4_4_13c03c0lck0y8sk.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonObjectTest.testReadPropertyWithEmptyStringName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uoiq7n3dq(){try{__CLR4_4_13c03c0lck0y8sk.R.inc(4382);
    __CLR4_4_13c03c0lck0y8sk.R.inc(4383);JsonObject jsonObj = new JsonParser().parse("{\"\":true}").getAsJsonObject();
    __CLR4_4_13c03c0lck0y8sk.R.inc(4384);assertEquals(true, jsonObj.get("").getAsBoolean());

  }finally{__CLR4_4_13c03c0lck0y8sk.R.flushNeeded();}}
}
