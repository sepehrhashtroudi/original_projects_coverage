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

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.common.TestTypes.ClassOverridingEquals;

/**
 * Functional tests related to circular reference detection and error reporting.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CircularReferenceTest extends TestCase {static class __CLR4_4_14g14g1lck0y8zl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,5812,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14g14g1lck0y8zl.R.inc(5761);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5762);super.setUp();
    __CLR4_4_14g14g1lck0y8zl.R.inc(5763);gson = new Gson();
  }finally{__CLR4_4_14g14g1lck0y8zl.R.flushNeeded();}}

  public void testCircularSerialization() throws Exception {__CLR4_4_14g14g1lck0y8zl.R.globalSliceStart(getClass().getName(),5764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hic39i4g4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g14g1lck0y8zl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g14g1lck0y8zl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CircularReferenceTest.testCircularSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hic39i4g4() throws Exception{try{__CLR4_4_14g14g1lck0y8zl.R.inc(5764);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5765);ContainsReferenceToSelfType a = new ContainsReferenceToSelfType();
    __CLR4_4_14g14g1lck0y8zl.R.inc(5766);ContainsReferenceToSelfType b = new ContainsReferenceToSelfType();
    __CLR4_4_14g14g1lck0y8zl.R.inc(5767);a.children.add(b);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5768);b.children.add(a);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5769);try {
      __CLR4_4_14g14g1lck0y8zl.R.inc(5770);gson.toJson(a);
      __CLR4_4_14g14g1lck0y8zl.R.inc(5771);fail("Circular types should not get printed!");
    } catch (IllegalStateException expected) { 
      __CLR4_4_14g14g1lck0y8zl.R.inc(5772);assertTrue(expected.getMessage().contains("children"));      
    }
  }finally{__CLR4_4_14g14g1lck0y8zl.R.flushNeeded();}}

  public void testSelfReferenceSerialization() throws Exception {__CLR4_4_14g14g1lck0y8zl.R.globalSliceStart(getClass().getName(),5773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170zuom4gd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g14g1lck0y8zl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g14g1lck0y8zl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CircularReferenceTest.testSelfReferenceSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170zuom4gd() throws Exception{try{__CLR4_4_14g14g1lck0y8zl.R.inc(5773);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5774);ClassOverridingEquals objA = new ClassOverridingEquals();
    __CLR4_4_14g14g1lck0y8zl.R.inc(5775);objA.ref = objA;

    __CLR4_4_14g14g1lck0y8zl.R.inc(5776);try {
      __CLR4_4_14g14g1lck0y8zl.R.inc(5777);gson.toJson(objA);
      __CLR4_4_14g14g1lck0y8zl.R.inc(5778);fail("Circular reference to self can not be serialized!");
    } catch (IllegalStateException expected) { }
  }finally{__CLR4_4_14g14g1lck0y8zl.R.flushNeeded();}}

  public void testSelfReferenceArrayFieldSerialization() throws Exception {__CLR4_4_14g14g1lck0y8zl.R.globalSliceStart(getClass().getName(),5779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ioaco94gj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g14g1lck0y8zl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g14g1lck0y8zl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CircularReferenceTest.testSelfReferenceArrayFieldSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ioaco94gj() throws Exception{try{__CLR4_4_14g14g1lck0y8zl.R.inc(5779);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5780);ClassWithSelfReferenceArray objA = new ClassWithSelfReferenceArray();
    __CLR4_4_14g14g1lck0y8zl.R.inc(5781);objA.children = new ClassWithSelfReferenceArray[]{objA};

    __CLR4_4_14g14g1lck0y8zl.R.inc(5782);try {
      __CLR4_4_14g14g1lck0y8zl.R.inc(5783);gson.toJson(objA);
      __CLR4_4_14g14g1lck0y8zl.R.inc(5784);fail("Circular reference to self can not be serialized!");
    } catch (IllegalStateException expected) { 
      __CLR4_4_14g14g1lck0y8zl.R.inc(5785);assertTrue(expected.getMessage().contains("children"));
    }
  }finally{__CLR4_4_14g14g1lck0y8zl.R.flushNeeded();}}

  public void testSelfReferenceCustomHandlerSerialization() throws Exception {__CLR4_4_14g14g1lck0y8zl.R.globalSliceStart(getClass().getName(),5786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlu8ph4gq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g14g1lck0y8zl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g14g1lck0y8zl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CircularReferenceTest.testSelfReferenceCustomHandlerSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlu8ph4gq() throws Exception{try{__CLR4_4_14g14g1lck0y8zl.R.inc(5786);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5787);ClassWithSelfReference obj = new ClassWithSelfReference();
    __CLR4_4_14g14g1lck0y8zl.R.inc(5788);obj.child = obj;
    __CLR4_4_14g14g1lck0y8zl.R.inc(5789);Gson gson = new GsonBuilder().registerTypeAdapter(ClassWithSelfReference.class, new JsonSerializer<ClassWithSelfReference>() {
      public JsonElement serialize(ClassWithSelfReference src, Type typeOfSrc,
          JsonSerializationContext context) {try{__CLR4_4_14g14g1lck0y8zl.R.inc(5790);
        __CLR4_4_14g14g1lck0y8zl.R.inc(5791);JsonObject obj = new JsonObject();
        __CLR4_4_14g14g1lck0y8zl.R.inc(5792);obj.addProperty("property", "value");
        __CLR4_4_14g14g1lck0y8zl.R.inc(5793);obj.add("child", context.serialize(src.child));
        __CLR4_4_14g14g1lck0y8zl.R.inc(5794);return obj;
      }finally{__CLR4_4_14g14g1lck0y8zl.R.flushNeeded();}}      
    }).create();
    __CLR4_4_14g14g1lck0y8zl.R.inc(5795);try {
      __CLR4_4_14g14g1lck0y8zl.R.inc(5796);gson.toJson(obj);
      __CLR4_4_14g14g1lck0y8zl.R.inc(5797);fail("Circular reference to self can not be serialized!");
    } catch (IllegalStateException expected) { 
      __CLR4_4_14g14g1lck0y8zl.R.inc(5798);assertTrue(expected.getMessage().contains("Offending"));
    }
  }finally{__CLR4_4_14g14g1lck0y8zl.R.flushNeeded();}}

  public void testDirectedAcyclicGraphSerialization() throws Exception {__CLR4_4_14g14g1lck0y8zl.R.globalSliceStart(getClass().getName(),5799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177dsif4h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g14g1lck0y8zl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g14g1lck0y8zl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CircularReferenceTest.testDirectedAcyclicGraphSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177dsif4h3() throws Exception{try{__CLR4_4_14g14g1lck0y8zl.R.inc(5799);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5800);ContainsReferenceToSelfType a = new ContainsReferenceToSelfType();
    __CLR4_4_14g14g1lck0y8zl.R.inc(5801);ContainsReferenceToSelfType b = new ContainsReferenceToSelfType();
    __CLR4_4_14g14g1lck0y8zl.R.inc(5802);ContainsReferenceToSelfType c = new ContainsReferenceToSelfType();
    __CLR4_4_14g14g1lck0y8zl.R.inc(5803);a.children.add(b);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5804);a.children.add(c);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5805);b.children.add(c);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5806);assertNotNull(gson.toJson(a));
  }finally{__CLR4_4_14g14g1lck0y8zl.R.flushNeeded();}}

  public void testDirectedAcyclicGraphDeserialization() throws Exception {__CLR4_4_14g14g1lck0y8zl.R.globalSliceStart(getClass().getName(),5807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y0zfhk4hb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g14g1lck0y8zl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g14g1lck0y8zl.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CircularReferenceTest.testDirectedAcyclicGraphDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y0zfhk4hb() throws Exception{try{__CLR4_4_14g14g1lck0y8zl.R.inc(5807);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5808);String json = "{\"children\":[{\"children\":[{\"children\":[]}]},{\"children\":[]}]}";
    __CLR4_4_14g14g1lck0y8zl.R.inc(5809);ContainsReferenceToSelfType target = gson.fromJson(json, ContainsReferenceToSelfType.class);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5810);assertNotNull(target);
    __CLR4_4_14g14g1lck0y8zl.R.inc(5811);assertEquals(2, target.children.size());
  }finally{__CLR4_4_14g14g1lck0y8zl.R.flushNeeded();}}

  private static class ContainsReferenceToSelfType {
    Collection<ContainsReferenceToSelfType> children = new ArrayList<ContainsReferenceToSelfType>();
  }
  
  private static class ClassWithSelfReference {
    ClassWithSelfReference child;
  }

  private static class ClassWithSelfReferenceArray {
    @SuppressWarnings("unused")
    ClassWithSelfReferenceArray[] children;
  }
}
