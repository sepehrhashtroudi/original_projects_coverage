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

import com.google.gson.common.TestTypes.Base;
import com.google.gson.common.TestTypes.Sub;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Unit tests for the {@link ParameterizedTypeHandlerMap} class.
 *
 * @author Joel Leitch
 */
public class ParameterizedTypeHandlerMapTest extends TestCase {static class __CLR4_4_13qh3qhlck0y8vc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4904,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private ParameterizedTypeHandlerMap<String> paramMap;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13qh3qhlck0y8vc.R.inc(4841);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4842);super.setUp();
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4843);paramMap = new ParameterizedTypeHandlerMap<String>();
  }finally{__CLR4_4_13qh3qhlck0y8vc.R.flushNeeded();}}

  public void testNullMap() throws Exception {__CLR4_4_13qh3qhlck0y8vc.R.globalSliceStart(getClass().getName(),4844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15d2dva3qk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qh3qhlck0y8vc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qh3qhlck0y8vc.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testNullMap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15d2dva3qk() throws Exception{try{__CLR4_4_13qh3qhlck0y8vc.R.inc(4844);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4845);assertFalse(paramMap.hasSpecificHandlerFor(String.class));
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4846);assertNull(paramMap.getHandlerFor(String.class));
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4847);assertNull(paramMap.getHandlerFor(String.class));
  }finally{__CLR4_4_13qh3qhlck0y8vc.R.flushNeeded();}}

  public void testHasGenericButNotSpecific() throws Exception {__CLR4_4_13qh3qhlck0y8vc.R.globalSliceStart(getClass().getName(),4848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afro063qo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qh3qhlck0y8vc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qh3qhlck0y8vc.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testHasGenericButNotSpecific",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afro063qo() throws Exception{try{__CLR4_4_13qh3qhlck0y8vc.R.inc(4848);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4849);Type specificType = new TypeToken<List<String>>() {}.getType();
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4850);String handler = "blah";
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4851);paramMap.register(List.class, handler);

    __CLR4_4_13qh3qhlck0y8vc.R.inc(4852);assertFalse(paramMap.hasSpecificHandlerFor(specificType));
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4853);assertTrue(paramMap.hasSpecificHandlerFor(List.class));
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4854);assertNotNull(paramMap.getHandlerFor(specificType));
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4855);assertNotNull(paramMap.getHandlerFor(List.class));
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4856);assertEquals(handler, paramMap.getHandlerFor(specificType));
  }finally{__CLR4_4_13qh3qhlck0y8vc.R.flushNeeded();}}

  public void testHasSpecificType() throws Exception {__CLR4_4_13qh3qhlck0y8vc.R.globalSliceStart(getClass().getName(),4857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1adskkb3qx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qh3qhlck0y8vc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qh3qhlck0y8vc.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testHasSpecificType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1adskkb3qx() throws Exception{try{__CLR4_4_13qh3qhlck0y8vc.R.inc(4857);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4858);Type specificType = new TypeToken<List<String>>() {}.getType();
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4859);String handler = "blah";
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4860);paramMap.register(specificType, handler);

    __CLR4_4_13qh3qhlck0y8vc.R.inc(4861);assertTrue(paramMap.hasSpecificHandlerFor(specificType));
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4862);assertFalse(paramMap.hasSpecificHandlerFor(List.class));
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4863);assertNotNull(paramMap.getHandlerFor(specificType));
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4864);assertNull(paramMap.getHandlerFor(List.class));
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4865);assertEquals(handler, paramMap.getHandlerFor(specificType));
  }finally{__CLR4_4_13qh3qhlck0y8vc.R.flushNeeded();}}

  public void testTypeOverridding() throws Exception {__CLR4_4_13qh3qhlck0y8vc.R.globalSliceStart(getClass().getName(),4866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j8wviq3r6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qh3qhlck0y8vc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qh3qhlck0y8vc.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testTypeOverridding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j8wviq3r6() throws Exception{try{__CLR4_4_13qh3qhlck0y8vc.R.inc(4866);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4867);String handler1 = "blah1";
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4868);String handler2 = "blah2";
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4869);paramMap.register(String.class, handler1);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4870);paramMap.register(String.class, handler2);

    __CLR4_4_13qh3qhlck0y8vc.R.inc(4871);assertTrue(paramMap.hasSpecificHandlerFor(String.class));
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4872);assertEquals(handler2, paramMap.getHandlerFor(String.class));
  }finally{__CLR4_4_13qh3qhlck0y8vc.R.flushNeeded();}}

  public void testMakeUnmodifiable() throws Exception {__CLR4_4_13qh3qhlck0y8vc.R.globalSliceStart(getClass().getName(),4873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13h7wzo3rd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qh3qhlck0y8vc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qh3qhlck0y8vc.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testMakeUnmodifiable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13h7wzo3rd() throws Exception{try{__CLR4_4_13qh3qhlck0y8vc.R.inc(4873);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4874);paramMap.makeUnmodifiable();
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4875);try {
     __CLR4_4_13qh3qhlck0y8vc.R.inc(4876);paramMap.register(String.class, "blah");
     __CLR4_4_13qh3qhlck0y8vc.R.inc(4877);fail("Can not register handlers when map is unmodifiable");
    } catch (IllegalStateException expected) { }
  }finally{__CLR4_4_13qh3qhlck0y8vc.R.flushNeeded();}}

  public void testTypeHierarchy() {__CLR4_4_13qh3qhlck0y8vc.R.globalSliceStart(getClass().getName(),4878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ldoysw3ri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qh3qhlck0y8vc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qh3qhlck0y8vc.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testTypeHierarchy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ldoysw3ri(){try{__CLR4_4_13qh3qhlck0y8vc.R.inc(4878);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4879);paramMap.registerForTypeHierarchy(Base.class, "baseHandler");
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4880);String handler = paramMap.getHandlerFor(Sub.class);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4881);assertEquals("baseHandler", handler);
  }finally{__CLR4_4_13qh3qhlck0y8vc.R.flushNeeded();}}

  public void testTypeHierarchyMultipleHandlers() {__CLR4_4_13qh3qhlck0y8vc.R.globalSliceStart(getClass().getName(),4882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z95sn3rm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qh3qhlck0y8vc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qh3qhlck0y8vc.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testTypeHierarchyMultipleHandlers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z95sn3rm(){try{__CLR4_4_13qh3qhlck0y8vc.R.inc(4882);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4883);paramMap.registerForTypeHierarchy(Base.class, "baseHandler");
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4884);paramMap.registerForTypeHierarchy(Sub.class, "subHandler");
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4885);String handler = paramMap.getHandlerFor(SubOfSub.class);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4886);assertEquals("subHandler", handler);
  }finally{__CLR4_4_13qh3qhlck0y8vc.R.flushNeeded();}}

  public void testTypeHierarchyRegisterIfAbsent() {__CLR4_4_13qh3qhlck0y8vc.R.globalSliceStart(getClass().getName(),4887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s525rr3rr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qh3qhlck0y8vc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qh3qhlck0y8vc.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testTypeHierarchyRegisterIfAbsent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s525rr3rr(){try{__CLR4_4_13qh3qhlck0y8vc.R.inc(4887);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4888);paramMap.registerForTypeHierarchy(Base.class, "baseHandler");
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4889);ParameterizedTypeHandlerMap<String> otherMap = new ParameterizedTypeHandlerMap<String>();
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4890);otherMap.registerForTypeHierarchy(Base.class, "baseHandler2");
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4891);paramMap.registerIfAbsent(otherMap);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4892);String handler = paramMap.getHandlerFor(Base.class);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4893);assertEquals("baseHandler", handler);
  }finally{__CLR4_4_13qh3qhlck0y8vc.R.flushNeeded();}}

  public void testReplaceExistingTypeHierarchyHandler() {__CLR4_4_13qh3qhlck0y8vc.R.globalSliceStart(getClass().getName(),4894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9blhf3ry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qh3qhlck0y8vc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qh3qhlck0y8vc.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testReplaceExistingTypeHierarchyHandler",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9blhf3ry(){try{__CLR4_4_13qh3qhlck0y8vc.R.inc(4894);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4895);paramMap.registerForTypeHierarchy(Base.class, "baseHandler");
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4896);paramMap.registerForTypeHierarchy(Base.class, "base2Handler");
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4897);String handler = paramMap.getHandlerFor(Base.class);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4898);assertEquals("base2Handler", handler);
  }finally{__CLR4_4_13qh3qhlck0y8vc.R.flushNeeded();}}

  public void testHidingExistingTypeHierarchyHandlerIsDisallowed() {__CLR4_4_13qh3qhlck0y8vc.R.globalSliceStart(getClass().getName(),4899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ub1ka3s3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qh3qhlck0y8vc.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qh3qhlck0y8vc.R.globalSliceEnd(getClass().getName(),"com.google.gson.ParameterizedTypeHandlerMapTest.testHidingExistingTypeHierarchyHandlerIsDisallowed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ub1ka3s3(){try{__CLR4_4_13qh3qhlck0y8vc.R.inc(4899);
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4900);paramMap.registerForTypeHierarchy(Sub.class, "subHandler");
    __CLR4_4_13qh3qhlck0y8vc.R.inc(4901);try {
      __CLR4_4_13qh3qhlck0y8vc.R.inc(4902);paramMap.registerForTypeHierarchy(Base.class, "baseHandler");
      __CLR4_4_13qh3qhlck0y8vc.R.inc(4903);fail("A handler that hides an existing type hierarchy handler is not allowed");
    } catch (IllegalArgumentException expected) {
    }
  }finally{__CLR4_4_13qh3qhlck0y8vc.R.flushNeeded();}}
  private static class SubOfSub extends Sub {
  }
}
