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

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import junit.framework.TestCase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Performs some functional tests when Gson is instantiated with some common user defined
 * {@link ExclusionStrategy} objects.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ExclusionStrategyFunctionalTest extends TestCase {static class __CLR4_4_158e58elck0y948{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,6811,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private SampleObjectForTest src;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_158e58elck0y948.R.inc(6782);
    __CLR4_4_158e58elck0y948.R.inc(6783);super.setUp();
    __CLR4_4_158e58elck0y948.R.inc(6784);gson = new GsonBuilder()
        .setExclusionStrategies(new MyExclusionStrategy(String.class))
        .serializeNulls()
        .create();
    __CLR4_4_158e58elck0y948.R.inc(6785);src = new SampleObjectForTest();
  }finally{__CLR4_4_158e58elck0y948.R.flushNeeded();}}

  public void testExclusionStrategySerialization() throws Exception {__CLR4_4_158e58elck0y948.R.globalSliceStart(getClass().getName(),6786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uxcrko58i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_158e58elck0y948.R.rethrow($CLV_t2$);}finally{__CLR4_4_158e58elck0y948.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ExclusionStrategyFunctionalTest.testExclusionStrategySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uxcrko58i() throws Exception{try{__CLR4_4_158e58elck0y948.R.inc(6786);
    __CLR4_4_158e58elck0y948.R.inc(6787);String json = gson.toJson(src);
    __CLR4_4_158e58elck0y948.R.inc(6788);assertFalse(json.contains("\"stringField\""));
    __CLR4_4_158e58elck0y948.R.inc(6789);assertFalse(json.contains("\"annotatedField\""));
    __CLR4_4_158e58elck0y948.R.inc(6790);assertTrue(json.contains("\"longField\""));
  }finally{__CLR4_4_158e58elck0y948.R.flushNeeded();}}

  public void testExclusionStrategyDeserialization() throws Exception {__CLR4_4_158e58elck0y948.R.globalSliceStart(getClass().getName(),6791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdkzh558n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_158e58elck0y948.R.rethrow($CLV_t2$);}finally{__CLR4_4_158e58elck0y948.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ExclusionStrategyFunctionalTest.testExclusionStrategyDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdkzh558n() throws Exception{try{__CLR4_4_158e58elck0y948.R.inc(6791);
    __CLR4_4_158e58elck0y948.R.inc(6792);JsonObject json = new JsonObject();
    __CLR4_4_158e58elck0y948.R.inc(6793);json.add("annotatedField", new JsonPrimitive(src.annotatedField + 5));
    __CLR4_4_158e58elck0y948.R.inc(6794);json.add("stringField", new JsonPrimitive(src.stringField + "blah,blah"));
    __CLR4_4_158e58elck0y948.R.inc(6795);json.add("longField", new JsonPrimitive(1212311L));

    __CLR4_4_158e58elck0y948.R.inc(6796);SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
    __CLR4_4_158e58elck0y948.R.inc(6797);assertEquals(1212311L, target.longField);

    // assert excluded fields are set to the defaults
    __CLR4_4_158e58elck0y948.R.inc(6798);assertEquals(src.annotatedField, target.annotatedField);
    __CLR4_4_158e58elck0y948.R.inc(6799);assertEquals(src.stringField, target.stringField);
  }finally{__CLR4_4_158e58elck0y948.R.flushNeeded();}}

  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.FIELD})
  private static @interface Foo {
    // Field tag only annotation
  }

  @SuppressWarnings("unused")
  private static class SampleObjectForTest {
    @Foo
    private final int annotatedField;
    private final String stringField;
    private final long longField;
    private final Class<?> clazzField;

    public SampleObjectForTest() {try{__CLR4_4_158e58elck0y948.R.inc(6800);
      __CLR4_4_158e58elck0y948.R.inc(6801);annotatedField = 5;
      __CLR4_4_158e58elck0y948.R.inc(6802);stringField = "someDefaultValue";
      __CLR4_4_158e58elck0y948.R.inc(6803);longField = 1234;
      __CLR4_4_158e58elck0y948.R.inc(6804);clazzField = String.class;
    }finally{__CLR4_4_158e58elck0y948.R.flushNeeded();}}
  }

  private static class MyExclusionStrategy implements ExclusionStrategy {
    private final Class<?> typeToSkip;

    private MyExclusionStrategy(Class<?> typeToSkip) {try{__CLR4_4_158e58elck0y948.R.inc(6805);
      __CLR4_4_158e58elck0y948.R.inc(6806);this.typeToSkip = typeToSkip;
    }finally{__CLR4_4_158e58elck0y948.R.flushNeeded();}}

    public boolean shouldSkipClass(Class<?> clazz) {try{__CLR4_4_158e58elck0y948.R.inc(6807);
      __CLR4_4_158e58elck0y948.R.inc(6808);return (clazz == typeToSkip);
    }finally{__CLR4_4_158e58elck0y948.R.flushNeeded();}}

    public boolean shouldSkipField(FieldAttributes f) {try{__CLR4_4_158e58elck0y948.R.inc(6809);
      __CLR4_4_158e58elck0y948.R.inc(6810);return f.getAnnotation(Foo.class) != null;
    }finally{__CLR4_4_158e58elck0y948.R.flushNeeded();}}
  }
}
