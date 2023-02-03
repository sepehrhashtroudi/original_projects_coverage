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
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.ClassOverridingEquals;

import junit.framework.TestCase;

import java.lang.reflect.Type;

/**
 * Functional tests that do not fall neatly into any of the existing classification.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class UncategorizedTest extends TestCase {static class __CLR4_4_16qp6qplck0y9cx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,8779,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private Gson gson = null;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_16qp6qplck0y9cx.R.inc(8737);
    __CLR4_4_16qp6qplck0y9cx.R.inc(8738);super.setUp();
    __CLR4_4_16qp6qplck0y9cx.R.inc(8739);gson = new Gson();
  }finally{__CLR4_4_16qp6qplck0y9cx.R.flushNeeded();}}

  public void testInvalidJsonDeserializationFails() throws Exception {__CLR4_4_16qp6qplck0y9cx.R.globalSliceStart(getClass().getName(),8740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s2zj2y6qs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16qp6qplck0y9cx.R.rethrow($CLV_t2$);}finally{__CLR4_4_16qp6qplck0y9cx.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.UncategorizedTest.testInvalidJsonDeserializationFails",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s2zj2y6qs() throws Exception{try{__CLR4_4_16qp6qplck0y9cx.R.inc(8740);
    __CLR4_4_16qp6qplck0y9cx.R.inc(8741);try {
      __CLR4_4_16qp6qplck0y9cx.R.inc(8742);gson.fromJson("adfasdf1112,,,\":", BagOfPrimitives.class);
      __CLR4_4_16qp6qplck0y9cx.R.inc(8743);fail("Bad JSON should throw a ParseException");
    } catch (JsonParseException expected) { }

    __CLR4_4_16qp6qplck0y9cx.R.inc(8744);try {
      __CLR4_4_16qp6qplck0y9cx.R.inc(8745);gson.fromJson("{adfasdf1112,,,\":}", BagOfPrimitives.class);
      __CLR4_4_16qp6qplck0y9cx.R.inc(8746);fail("Bad JSON should throw a ParseException");
    } catch (JsonParseException expected) { }
  }finally{__CLR4_4_16qp6qplck0y9cx.R.flushNeeded();}}

  public void testObjectEqualButNotSameSerialization() throws Exception {__CLR4_4_16qp6qplck0y9cx.R.globalSliceStart(getClass().getName(),8747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pl4jms6qz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16qp6qplck0y9cx.R.rethrow($CLV_t2$);}finally{__CLR4_4_16qp6qplck0y9cx.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.UncategorizedTest.testObjectEqualButNotSameSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pl4jms6qz() throws Exception{try{__CLR4_4_16qp6qplck0y9cx.R.inc(8747);
    __CLR4_4_16qp6qplck0y9cx.R.inc(8748);ClassOverridingEquals objA = new ClassOverridingEquals();
    __CLR4_4_16qp6qplck0y9cx.R.inc(8749);ClassOverridingEquals objB = new ClassOverridingEquals();
    __CLR4_4_16qp6qplck0y9cx.R.inc(8750);objB.ref = objA;
    __CLR4_4_16qp6qplck0y9cx.R.inc(8751);String json = gson.toJson(objB);
    __CLR4_4_16qp6qplck0y9cx.R.inc(8752);assertEquals(objB.getExpectedJson(), json);
  }finally{__CLR4_4_16qp6qplck0y9cx.R.flushNeeded();}}

  public void testStaticFieldsAreNotSerialized() {__CLR4_4_16qp6qplck0y9cx.R.globalSliceStart(getClass().getName(),8753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x94kyr6r5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16qp6qplck0y9cx.R.rethrow($CLV_t2$);}finally{__CLR4_4_16qp6qplck0y9cx.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.UncategorizedTest.testStaticFieldsAreNotSerialized",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x94kyr6r5(){try{__CLR4_4_16qp6qplck0y9cx.R.inc(8753);
    __CLR4_4_16qp6qplck0y9cx.R.inc(8754);BagOfPrimitives target = new BagOfPrimitives();
    __CLR4_4_16qp6qplck0y9cx.R.inc(8755);assertFalse(gson.toJson(target).contains("DEFAULT_VALUE"));
  }finally{__CLR4_4_16qp6qplck0y9cx.R.flushNeeded();}}

  /**
   * This test ensures that a custom deserializer is able to return a derived class instance for a
   * base class object. For a motivation for this test, see Issue 37 and
   * http://groups.google.com/group/google-gson/browse_thread/thread/677d56e9976d7761
   */
  public void testReturningDerivedClassesDuringDeserialization() {__CLR4_4_16qp6qplck0y9cx.R.globalSliceStart(getClass().getName(),8756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bbiih86r8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16qp6qplck0y9cx.R.rethrow($CLV_t2$);}finally{__CLR4_4_16qp6qplck0y9cx.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.UncategorizedTest.testReturningDerivedClassesDuringDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bbiih86r8(){try{__CLR4_4_16qp6qplck0y9cx.R.inc(8756);
    __CLR4_4_16qp6qplck0y9cx.R.inc(8757);Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new BaseTypeAdapter()).create();
    __CLR4_4_16qp6qplck0y9cx.R.inc(8758);String json = "{\"opType\":\"OP1\"}";
    __CLR4_4_16qp6qplck0y9cx.R.inc(8759);Base base = gson.fromJson(json, Base.class);
    __CLR4_4_16qp6qplck0y9cx.R.inc(8760);assertTrue(base instanceof Derived1);
    __CLR4_4_16qp6qplck0y9cx.R.inc(8761);assertEquals(OperationType.OP1, base.opType);

    __CLR4_4_16qp6qplck0y9cx.R.inc(8762);json = "{\"opType\":\"OP2\"}";
    __CLR4_4_16qp6qplck0y9cx.R.inc(8763);base = gson.fromJson(json, Base.class);
    __CLR4_4_16qp6qplck0y9cx.R.inc(8764);assertTrue(base instanceof Derived2);
    __CLR4_4_16qp6qplck0y9cx.R.inc(8765);assertEquals(OperationType.OP2, base.opType);
  }finally{__CLR4_4_16qp6qplck0y9cx.R.flushNeeded();}}

  private enum OperationType { OP1, OP2 }
  private static class Base {
    OperationType opType;
  }
  private static class Derived1 extends Base {
    Derived1() {try{__CLR4_4_16qp6qplck0y9cx.R.inc(8766); __CLR4_4_16qp6qplck0y9cx.R.inc(8767);opType = OperationType.OP1; }finally{__CLR4_4_16qp6qplck0y9cx.R.flushNeeded();}}
  }
  private static class Derived2 extends Base {
    Derived2() {try{__CLR4_4_16qp6qplck0y9cx.R.inc(8768); __CLR4_4_16qp6qplck0y9cx.R.inc(8769);opType = OperationType.OP2; }finally{__CLR4_4_16qp6qplck0y9cx.R.flushNeeded();}}
  }
  private static class BaseTypeAdapter implements JsonDeserializer<Base> {
    public Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_16qp6qplck0y9cx.R.inc(8770);
      __CLR4_4_16qp6qplck0y9cx.R.inc(8771);String opTypeStr = json.getAsJsonObject().get("opType").getAsString();
      __CLR4_4_16qp6qplck0y9cx.R.inc(8772);OperationType opType = OperationType.valueOf(opTypeStr);
      boolean __CLB4_4_1_bool0=false;__CLR4_4_16qp6qplck0y9cx.R.inc(8773);switch (opType) {
      case OP1:if (!__CLB4_4_1_bool0) {__CLR4_4_16qp6qplck0y9cx.R.inc(8774);__CLB4_4_1_bool0=true;}
        __CLR4_4_16qp6qplck0y9cx.R.inc(8775);return new Derived1();
      case OP2:if (!__CLB4_4_1_bool0) {__CLR4_4_16qp6qplck0y9cx.R.inc(8776);__CLB4_4_1_bool0=true;}
        __CLR4_4_16qp6qplck0y9cx.R.inc(8777);return new Derived2();
      }
      __CLR4_4_16qp6qplck0y9cx.R.inc(8778);throw new JsonParseException("unknown type: " + json);
    }finally{__CLR4_4_16qp6qplck0y9cx.R.flushNeeded();}}
  }
}
