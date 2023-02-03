/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2009 Google Inc.
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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.Base;
import com.google.gson.common.TestTypes.ClassWithBaseArrayField;
import com.google.gson.common.TestTypes.ClassWithBaseField;
import com.google.gson.common.TestTypes.Nested;
import com.google.gson.common.TestTypes.Sub;

import junit.framework.TestCase;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Functional tests for Json serialization and deserialization of classes with 
 * inheritance hierarchies.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class InheritanceTest extends TestCase {static class __CLR4_4_15by5bylck0y954{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,7062,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_15by5bylck0y954.R.inc(6910);
    __CLR4_4_15by5bylck0y954.R.inc(6911);super.setUp();
    __CLR4_4_15by5bylck0y954.R.inc(6912);gson = new Gson();
  }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

  public void testSubClassSerialization() throws Exception {__CLR4_4_15by5bylck0y954.R.globalSliceStart(getClass().getName(),6913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fl57f15c1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15by5bylck0y954.R.rethrow($CLV_t2$);}finally{__CLR4_4_15by5bylck0y954.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testSubClassSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fl57f15c1() throws Exception{try{__CLR4_4_15by5bylck0y954.R.inc(6913);
    __CLR4_4_15by5bylck0y954.R.inc(6914);SubTypeOfNested target = new SubTypeOfNested(new BagOfPrimitives(10, 20, false, "stringValue"),
        new BagOfPrimitives(30, 40, true, "stringValue"));
    __CLR4_4_15by5bylck0y954.R.inc(6915);assertEquals(target.getExpectedJson(), gson.toJson(target));
  }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

  public void testSubClassDeserialization() throws Exception {__CLR4_4_15by5bylck0y954.R.globalSliceStart(getClass().getName(),6916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azof3o5c4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15by5bylck0y954.R.rethrow($CLV_t2$);}finally{__CLR4_4_15by5bylck0y954.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testSubClassDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azof3o5c4() throws Exception{try{__CLR4_4_15by5bylck0y954.R.inc(6916);
    __CLR4_4_15by5bylck0y954.R.inc(6917);String json = "{\"value\":5,\"primitive1\":{\"longValue\":10,\"intValue\":20,"
        + "\"booleanValue\":false,\"stringValue\":\"stringValue\"},\"primitive2\":"
        + "{\"longValue\":30,\"intValue\":40,\"booleanValue\":true,"
        + "\"stringValue\":\"stringValue\"}}";
    __CLR4_4_15by5bylck0y954.R.inc(6918);SubTypeOfNested target = gson.fromJson(json, SubTypeOfNested.class);
    __CLR4_4_15by5bylck0y954.R.inc(6919);assertEquals(json, target.getExpectedJson());
  }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

  public void testClassWithBaseFieldSerialization() {__CLR4_4_15by5bylck0y954.R.globalSliceStart(getClass().getName(),6920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177kmuy5c8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15by5bylck0y954.R.rethrow($CLV_t2$);}finally{__CLR4_4_15by5bylck0y954.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testClassWithBaseFieldSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177kmuy5c8(){try{__CLR4_4_15by5bylck0y954.R.inc(6920);
    __CLR4_4_15by5bylck0y954.R.inc(6921);ClassWithBaseField sub = new ClassWithBaseField(new Sub());
    __CLR4_4_15by5bylck0y954.R.inc(6922);JsonObject json = (JsonObject) gson.toJsonTree(sub);
    __CLR4_4_15by5bylck0y954.R.inc(6923);JsonElement base = json.getAsJsonObject().get(ClassWithBaseField.FIELD_KEY);
    __CLR4_4_15by5bylck0y954.R.inc(6924);assertEquals(Sub.SUB_NAME, base.getAsJsonObject().get(Sub.SUB_FIELD_KEY).getAsString());
  }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

  public void testClassWithBaseArrayFieldSerialization() {__CLR4_4_15by5bylck0y954.R.globalSliceStart(getClass().getName(),6925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9zdxj5cd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15by5bylck0y954.R.rethrow($CLV_t2$);}finally{__CLR4_4_15by5bylck0y954.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testClassWithBaseArrayFieldSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9zdxj5cd(){try{__CLR4_4_15by5bylck0y954.R.inc(6925);
    __CLR4_4_15by5bylck0y954.R.inc(6926);Base[] baseClasses = new Base[]{ new Sub(), new Sub()};
    __CLR4_4_15by5bylck0y954.R.inc(6927);ClassWithBaseArrayField sub = new ClassWithBaseArrayField(baseClasses);
    __CLR4_4_15by5bylck0y954.R.inc(6928);JsonObject json = gson.toJsonTree(sub).getAsJsonObject();
    __CLR4_4_15by5bylck0y954.R.inc(6929);JsonArray bases = json.get(ClassWithBaseArrayField.FIELD_KEY).getAsJsonArray();
    __CLR4_4_15by5bylck0y954.R.inc(6930);for (JsonElement element : bases) {{ 
      __CLR4_4_15by5bylck0y954.R.inc(6931);assertEquals(Sub.SUB_NAME, element.getAsJsonObject().get(Sub.SUB_FIELD_KEY).getAsString());
    }
  }}finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

  public void testBaseSerializedAsSub() {__CLR4_4_15by5bylck0y954.R.globalSliceStart(getClass().getName(),6932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1931mge5ck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15by5bylck0y954.R.rethrow($CLV_t2$);}finally{__CLR4_4_15by5bylck0y954.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testBaseSerializedAsSub",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1931mge5ck(){try{__CLR4_4_15by5bylck0y954.R.inc(6932);
    __CLR4_4_15by5bylck0y954.R.inc(6933);Base base = new Sub();
    __CLR4_4_15by5bylck0y954.R.inc(6934);JsonObject json = gson.toJsonTree(base).getAsJsonObject();
    __CLR4_4_15by5bylck0y954.R.inc(6935);assertEquals(Sub.SUB_NAME, json.get(Sub.SUB_FIELD_KEY).getAsString());
  }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

  public void testBaseSerializedAsSubForToJsonMethod() {__CLR4_4_15by5bylck0y954.R.globalSliceStart(getClass().getName(),6936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtv9oz5co();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15by5bylck0y954.R.rethrow($CLV_t2$);}finally{__CLR4_4_15by5bylck0y954.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testBaseSerializedAsSubForToJsonMethod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtv9oz5co(){try{__CLR4_4_15by5bylck0y954.R.inc(6936);
    __CLR4_4_15by5bylck0y954.R.inc(6937);Base base = new Sub();
    __CLR4_4_15by5bylck0y954.R.inc(6938);String json = gson.toJson(base);
    __CLR4_4_15by5bylck0y954.R.inc(6939);assertTrue(json.contains(Sub.SUB_NAME));
  }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

  public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitType() {__CLR4_4_15by5bylck0y954.R.globalSliceStart(getClass().getName(),6940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lqcmop5cs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15by5bylck0y954.R.rethrow($CLV_t2$);}finally{__CLR4_4_15by5bylck0y954.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testBaseSerializedAsBaseWhenSpecifiedWithExplicitType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lqcmop5cs(){try{__CLR4_4_15by5bylck0y954.R.inc(6940);
    __CLR4_4_15by5bylck0y954.R.inc(6941);Base base = new Sub();
    __CLR4_4_15by5bylck0y954.R.inc(6942);JsonObject json = gson.toJsonTree(base, Base.class).getAsJsonObject();
    __CLR4_4_15by5bylck0y954.R.inc(6943);assertEquals(Base.BASE_NAME, json.get(Base.BASE_FIELD_KEY).getAsString());
    __CLR4_4_15by5bylck0y954.R.inc(6944);assertNull(json.get(Sub.SUB_FIELD_KEY));
  }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

  public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod() {__CLR4_4_15by5bylck0y954.R.globalSliceStart(getClass().getName(),6945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182ttt85cx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15by5bylck0y954.R.rethrow($CLV_t2$);}finally{__CLR4_4_15by5bylck0y954.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182ttt85cx(){try{__CLR4_4_15by5bylck0y954.R.inc(6945);
    __CLR4_4_15by5bylck0y954.R.inc(6946);Base base = new Sub();
    __CLR4_4_15by5bylck0y954.R.inc(6947);String json = gson.toJson(base, Base.class);
    __CLR4_4_15by5bylck0y954.R.inc(6948);assertTrue(json.contains(Base.BASE_NAME));
    __CLR4_4_15by5bylck0y954.R.inc(6949);assertFalse(json.contains(Sub.SUB_FIELD_KEY));
  }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

  public void testBaseSerializedAsSubWhenSpecifiedWithExplicitType() {__CLR4_4_15by5bylck0y954.R.globalSliceStart(getClass().getName(),6950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_138g98q5d2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15by5bylck0y954.R.rethrow($CLV_t2$);}finally{__CLR4_4_15by5bylck0y954.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testBaseSerializedAsSubWhenSpecifiedWithExplicitType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_138g98q5d2(){try{__CLR4_4_15by5bylck0y954.R.inc(6950);
    __CLR4_4_15by5bylck0y954.R.inc(6951);Base base = new Sub();
    __CLR4_4_15by5bylck0y954.R.inc(6952);JsonObject json = gson.toJsonTree(base, Sub.class).getAsJsonObject();
    __CLR4_4_15by5bylck0y954.R.inc(6953);assertEquals(Sub.SUB_NAME, json.get(Sub.SUB_FIELD_KEY).getAsString());
  }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

  public void testBaseSerializedAsSubWhenSpecifiedWithExplicitTypeForToJsonMethod() {__CLR4_4_15by5bylck0y954.R.globalSliceStart(getClass().getName(),6954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7v7wx5d6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15by5bylck0y954.R.rethrow($CLV_t2$);}finally{__CLR4_4_15by5bylck0y954.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testBaseSerializedAsSubWhenSpecifiedWithExplicitTypeForToJsonMethod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7v7wx5d6(){try{__CLR4_4_15by5bylck0y954.R.inc(6954);
    __CLR4_4_15by5bylck0y954.R.inc(6955);Base base = new Sub();
    __CLR4_4_15by5bylck0y954.R.inc(6956);String json = gson.toJson(base, Sub.class);
    __CLR4_4_15by5bylck0y954.R.inc(6957);assertTrue(json.contains(Sub.SUB_NAME));
  }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

  private static class SubTypeOfNested extends Nested {
    private final long value = 5;

    // Used by Gson
    @SuppressWarnings("unused")
    private SubTypeOfNested() {
      this(null, null);__CLR4_4_15by5bylck0y954.R.inc(6959);try{__CLR4_4_15by5bylck0y954.R.inc(6958);
    }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

    public SubTypeOfNested(BagOfPrimitives primitive1, BagOfPrimitives primitive2) {
      super(primitive1, primitive2);__CLR4_4_15by5bylck0y954.R.inc(6961);try{__CLR4_4_15by5bylck0y954.R.inc(6960);
    }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

    @Override
    public void appendFields(StringBuilder sb) {try{__CLR4_4_15by5bylck0y954.R.inc(6962);
      __CLR4_4_15by5bylck0y954.R.inc(6963);sb.append("\"value\":").append(value).append(",");
      __CLR4_4_15by5bylck0y954.R.inc(6964);super.appendFields(sb);
    }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}
  }

  public void testSubInterfacesOfCollectionSerialization() throws Exception {__CLR4_4_15by5bylck0y954.R.globalSliceStart(getClass().getName(),6965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffkorq5dh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15by5bylck0y954.R.rethrow($CLV_t2$);}finally{__CLR4_4_15by5bylck0y954.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testSubInterfacesOfCollectionSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffkorq5dh() throws Exception{try{__CLR4_4_15by5bylck0y954.R.inc(6965);
    __CLR4_4_15by5bylck0y954.R.inc(6966);List<Integer> list = new LinkedList<Integer>();
    __CLR4_4_15by5bylck0y954.R.inc(6967);list.add(0);
    __CLR4_4_15by5bylck0y954.R.inc(6968);list.add(1);
    __CLR4_4_15by5bylck0y954.R.inc(6969);list.add(2);
    __CLR4_4_15by5bylck0y954.R.inc(6970);list.add(3);
    __CLR4_4_15by5bylck0y954.R.inc(6971);Queue<Long> queue = new LinkedList<Long>();
    __CLR4_4_15by5bylck0y954.R.inc(6972);queue.add(0L);
    __CLR4_4_15by5bylck0y954.R.inc(6973);queue.add(1L);
    __CLR4_4_15by5bylck0y954.R.inc(6974);queue.add(2L);
    __CLR4_4_15by5bylck0y954.R.inc(6975);queue.add(3L);
    __CLR4_4_15by5bylck0y954.R.inc(6976);Set<Float> set = new TreeSet<Float>();
    __CLR4_4_15by5bylck0y954.R.inc(6977);set.add(0.1F);
    __CLR4_4_15by5bylck0y954.R.inc(6978);set.add(0.2F);
    __CLR4_4_15by5bylck0y954.R.inc(6979);set.add(0.3F);
    __CLR4_4_15by5bylck0y954.R.inc(6980);set.add(0.4F);
    __CLR4_4_15by5bylck0y954.R.inc(6981);SortedSet<Character> sortedSet = new TreeSet<Character>();
    __CLR4_4_15by5bylck0y954.R.inc(6982);sortedSet.add('a');
    __CLR4_4_15by5bylck0y954.R.inc(6983);sortedSet.add('b');
    __CLR4_4_15by5bylck0y954.R.inc(6984);sortedSet.add('c');
    __CLR4_4_15by5bylck0y954.R.inc(6985);sortedSet.add('d');
    __CLR4_4_15by5bylck0y954.R.inc(6986);ClassWithSubInterfacesOfCollection target =
        new ClassWithSubInterfacesOfCollection(list, queue, set, sortedSet);
    __CLR4_4_15by5bylck0y954.R.inc(6987);assertEquals(target.getExpectedJson(), gson.toJson(target));
  }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

  public void testSubInterfacesOfCollectionDeserialization() throws Exception {__CLR4_4_15by5bylck0y954.R.globalSliceStart(getClass().getName(),6988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bseec95e4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15by5bylck0y954.R.rethrow($CLV_t2$);}finally{__CLR4_4_15by5bylck0y954.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testSubInterfacesOfCollectionDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bseec95e4() throws Exception{try{__CLR4_4_15by5bylck0y954.R.inc(6988);
    __CLR4_4_15by5bylck0y954.R.inc(6989);String json = "{\"list\":[0,1,2,3],\"queue\":[0,1,2,3],\"set\":[0.1,0.2,0.3,0.4],"
        + "\"sortedSet\":[\"a\",\"b\",\"c\",\"d\"]"
        + "}";
    __CLR4_4_15by5bylck0y954.R.inc(6990);ClassWithSubInterfacesOfCollection target = 
      gson.fromJson(json, ClassWithSubInterfacesOfCollection.class);
    __CLR4_4_15by5bylck0y954.R.inc(6991);assertTrue(target.listContains(0, 1, 2, 3));
    __CLR4_4_15by5bylck0y954.R.inc(6992);assertTrue(target.queueContains(0, 1, 2, 3));
    __CLR4_4_15by5bylck0y954.R.inc(6993);assertTrue(target.setContains(0.1F, 0.2F, 0.3F, 0.4F));
    __CLR4_4_15by5bylck0y954.R.inc(6994);assertTrue(target.sortedSetContains('a', 'b', 'c', 'd'));
  }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}
  
  private static class ClassWithSubInterfacesOfCollection {
    private List<Integer> list;
    private Queue<Long> queue;
    private Set<Float> set;
    private SortedSet<Character> sortedSet;

    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithSubInterfacesOfCollection() {try{__CLR4_4_15by5bylck0y954.R.inc(6995);
    }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

    public ClassWithSubInterfacesOfCollection(List<Integer> list, Queue<Long> queue, Set<Float> set,
        SortedSet<Character> sortedSet) {try{__CLR4_4_15by5bylck0y954.R.inc(6996);
      __CLR4_4_15by5bylck0y954.R.inc(6997);this.list = list;
      __CLR4_4_15by5bylck0y954.R.inc(6998);this.queue = queue;
      __CLR4_4_15by5bylck0y954.R.inc(6999);this.set = set;
      __CLR4_4_15by5bylck0y954.R.inc(7000);this.sortedSet = sortedSet;
    }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

    boolean listContains(int... values) {try{__CLR4_4_15by5bylck0y954.R.inc(7001);
      __CLR4_4_15by5bylck0y954.R.inc(7002);for (int value : values) {{
        __CLR4_4_15by5bylck0y954.R.inc(7003);if ((((!list.contains(value))&&(__CLR4_4_15by5bylck0y954.R.iget(7004)!=0|true))||(__CLR4_4_15by5bylck0y954.R.iget(7005)==0&false))) {{
          __CLR4_4_15by5bylck0y954.R.inc(7006);return false;
        }
      }}
      }__CLR4_4_15by5bylck0y954.R.inc(7007);return true;
    }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}
    
    boolean queueContains(long... values) {try{__CLR4_4_15by5bylck0y954.R.inc(7008);
      __CLR4_4_15by5bylck0y954.R.inc(7009);for (long value : values) {{
        __CLR4_4_15by5bylck0y954.R.inc(7010);if ((((!queue.contains(value))&&(__CLR4_4_15by5bylck0y954.R.iget(7011)!=0|true))||(__CLR4_4_15by5bylck0y954.R.iget(7012)==0&false))) {{
          __CLR4_4_15by5bylck0y954.R.inc(7013);return false;
        }
      }}
      }__CLR4_4_15by5bylck0y954.R.inc(7014);return true;      
    }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}
    
    boolean setContains(float... values) {try{__CLR4_4_15by5bylck0y954.R.inc(7015);
      __CLR4_4_15by5bylck0y954.R.inc(7016);for (float value : values) {{
        __CLR4_4_15by5bylck0y954.R.inc(7017);if ((((!set.contains(value))&&(__CLR4_4_15by5bylck0y954.R.iget(7018)!=0|true))||(__CLR4_4_15by5bylck0y954.R.iget(7019)==0&false))) {{
          __CLR4_4_15by5bylck0y954.R.inc(7020);return false;
        }
      }}
      }__CLR4_4_15by5bylck0y954.R.inc(7021);return true;
    }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

    boolean sortedSetContains(char... values) {try{__CLR4_4_15by5bylck0y954.R.inc(7022);
      __CLR4_4_15by5bylck0y954.R.inc(7023);for (char value : values) {{
        __CLR4_4_15by5bylck0y954.R.inc(7024);if ((((!sortedSet.contains(value))&&(__CLR4_4_15by5bylck0y954.R.iget(7025)!=0|true))||(__CLR4_4_15by5bylck0y954.R.iget(7026)==0&false))) {{
          __CLR4_4_15by5bylck0y954.R.inc(7027);return false;
        }
      }}
      }__CLR4_4_15by5bylck0y954.R.inc(7028);return true;      
    }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}
    
    public String getExpectedJson() {try{__CLR4_4_15by5bylck0y954.R.inc(7029);
      __CLR4_4_15by5bylck0y954.R.inc(7030);StringBuilder sb = new StringBuilder();
      __CLR4_4_15by5bylck0y954.R.inc(7031);sb.append("{");
      __CLR4_4_15by5bylck0y954.R.inc(7032);sb.append("\"list\":");
      __CLR4_4_15by5bylck0y954.R.inc(7033);append(sb, list).append(",");
      __CLR4_4_15by5bylck0y954.R.inc(7034);sb.append("\"queue\":");
      __CLR4_4_15by5bylck0y954.R.inc(7035);append(sb, queue).append(",");
      __CLR4_4_15by5bylck0y954.R.inc(7036);sb.append("\"set\":");
      __CLR4_4_15by5bylck0y954.R.inc(7037);append(sb, set).append(",");
      __CLR4_4_15by5bylck0y954.R.inc(7038);sb.append("\"sortedSet\":");
      __CLR4_4_15by5bylck0y954.R.inc(7039);append(sb, sortedSet);
      __CLR4_4_15by5bylck0y954.R.inc(7040);sb.append("}");
      __CLR4_4_15by5bylck0y954.R.inc(7041);return sb.toString();
    }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}

    private StringBuilder append(StringBuilder sb, Collection<?> c) {try{__CLR4_4_15by5bylck0y954.R.inc(7042);
      __CLR4_4_15by5bylck0y954.R.inc(7043);sb.append("[");
      __CLR4_4_15by5bylck0y954.R.inc(7044);boolean first = true;
      __CLR4_4_15by5bylck0y954.R.inc(7045);for (Object o : c) {{
        __CLR4_4_15by5bylck0y954.R.inc(7046);if ((((!first)&&(__CLR4_4_15by5bylck0y954.R.iget(7047)!=0|true))||(__CLR4_4_15by5bylck0y954.R.iget(7048)==0&false))) {{
          __CLR4_4_15by5bylck0y954.R.inc(7049);sb.append(",");
        } }else {{
          __CLR4_4_15by5bylck0y954.R.inc(7050);first = false;
        }
        }__CLR4_4_15by5bylck0y954.R.inc(7051);if ((((o instanceof String || o instanceof Character)&&(__CLR4_4_15by5bylck0y954.R.iget(7052)!=0|true))||(__CLR4_4_15by5bylck0y954.R.iget(7053)==0&false))) {{
          __CLR4_4_15by5bylck0y954.R.inc(7054);sb.append('\"');
        }
        }__CLR4_4_15by5bylck0y954.R.inc(7055);sb.append(o.toString());
        __CLR4_4_15by5bylck0y954.R.inc(7056);if ((((o instanceof String || o instanceof Character)&&(__CLR4_4_15by5bylck0y954.R.iget(7057)!=0|true))||(__CLR4_4_15by5bylck0y954.R.iget(7058)==0&false))) {{
          __CLR4_4_15by5bylck0y954.R.inc(7059);sb.append('\"');
        }
      }}
      }__CLR4_4_15by5bylck0y954.R.inc(7060);sb.append("]");
      __CLR4_4_15by5bylck0y954.R.inc(7061);return sb;
    }finally{__CLR4_4_15by5bylck0y954.R.flushNeeded();}}
  }
}
