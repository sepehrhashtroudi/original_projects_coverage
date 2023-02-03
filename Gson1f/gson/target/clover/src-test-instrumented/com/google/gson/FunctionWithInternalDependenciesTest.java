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

import java.lang.reflect.Modifier;
import java.util.LinkedList;

import junit.framework.TestCase;

import com.google.gson.common.TestTypes;
import com.google.gson.common.TestTypes.ClassWithNoFields;

/**
 * Functional tests for Gson that depend on some internal package-protected elements of
 * com.google.gson package and hence must be placed in the same package. We should make every
 * attempt to migrate tests out of this class.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class FunctionWithInternalDependenciesTest extends TestCase {static class __CLR4_4_137a37alck0y8r9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4167,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public void testAnonymousLocalClassesSerialization() throws Exception {__CLR4_4_137a37alck0y8r9.R.globalSliceStart(getClass().getName(),4150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13cvvi737a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_137a37alck0y8r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_137a37alck0y8r9.R.globalSliceEnd(getClass().getName(),"com.google.gson.FunctionWithInternalDependenciesTest.testAnonymousLocalClassesSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13cvvi737a() throws Exception{try{__CLR4_4_137a37alck0y8r9.R.inc(4150);
    __CLR4_4_137a37alck0y8r9.R.inc(4151);LinkedList<ExclusionStrategy> strategies = new LinkedList<ExclusionStrategy>();
    __CLR4_4_137a37alck0y8r9.R.inc(4152);strategies.add(new SyntheticFieldExclusionStrategy(true));
    __CLR4_4_137a37alck0y8r9.R.inc(4153);strategies.add(new ModifierBasedExclusionStrategy(Modifier.TRANSIENT, Modifier.STATIC));
    __CLR4_4_137a37alck0y8r9.R.inc(4154);ExclusionStrategy exclusionStrategy = new DisjunctionExclusionStrategy(strategies);
    __CLR4_4_137a37alck0y8r9.R.inc(4155);Gson gson = new Gson(exclusionStrategy, exclusionStrategy, Gson.DEFAULT_NAMING_POLICY,
        new MappedObjectConstructor(DefaultTypeAdapters.getDefaultInstanceCreators()),
        false, DefaultTypeAdapters.getDefaultSerializers(),
        DefaultTypeAdapters.getDefaultDeserializers(), Gson.DEFAULT_JSON_NON_EXECUTABLE, true,
        false);
    __CLR4_4_137a37alck0y8r9.R.inc(4156);assertEquals("{}", gson.toJson(new ClassWithNoFields() {
      // empty anonymous class
    }));
  }finally{__CLR4_4_137a37alck0y8r9.R.flushNeeded();}}

  // TODO(Joel): Move this to some other functional test once exclusion policies are
  // available to the public
  public void testUserDefinedExclusionPolicies() throws Exception {__CLR4_4_137a37alck0y8r9.R.globalSliceStart(getClass().getName(),4157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlqq0737h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_137a37alck0y8r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_137a37alck0y8r9.R.globalSliceEnd(getClass().getName(),"com.google.gson.FunctionWithInternalDependenciesTest.testUserDefinedExclusionPolicies",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlqq0737h() throws Exception{try{__CLR4_4_137a37alck0y8r9.R.inc(4157);
    __CLR4_4_137a37alck0y8r9.R.inc(4158);Gson gson = new GsonBuilder()
        .setExclusionStrategies(new UserDefinedExclusionStrategy(String.class))
        .create();

    __CLR4_4_137a37alck0y8r9.R.inc(4159);String json = gson.toJson(new TestTypes.StringWrapper("someValue"));
    __CLR4_4_137a37alck0y8r9.R.inc(4160);assertEquals("{}", json);
  }finally{__CLR4_4_137a37alck0y8r9.R.flushNeeded();}}

  private static class UserDefinedExclusionStrategy implements ExclusionStrategy {
    private final Class<?> excludedThisClass;

    UserDefinedExclusionStrategy(Class<?> excludedThisClass) {try{__CLR4_4_137a37alck0y8r9.R.inc(4161);
      __CLR4_4_137a37alck0y8r9.R.inc(4162);this.excludedThisClass = excludedThisClass;
    }finally{__CLR4_4_137a37alck0y8r9.R.flushNeeded();}}

    public boolean shouldSkipClass(Class<?> clazz) {try{__CLR4_4_137a37alck0y8r9.R.inc(4163);
      __CLR4_4_137a37alck0y8r9.R.inc(4164);return excludedThisClass.equals(clazz);
    }finally{__CLR4_4_137a37alck0y8r9.R.flushNeeded();}}

    public boolean shouldSkipField(FieldAttributes f) {try{__CLR4_4_137a37alck0y8r9.R.inc(4165);
      __CLR4_4_137a37alck0y8r9.R.inc(4166);return excludedThisClass.equals(f.getDeclaredClass());
    }finally{__CLR4_4_137a37alck0y8r9.R.flushNeeded();}}

  }
}
