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

import java.lang.reflect.Field;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.common.TestTypes.ClassWithSerializedNameFields;
import com.google.gson.common.TestTypes.StringWrapper;

import junit.framework.TestCase;

/**
 * Functional tests for naming policies.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class NamingPolicyTest extends TestCase {static class __CLR4_4_15p85p8lck0y96v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,7459,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private GsonBuilder builder;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_15p85p8lck0y96v.R.inc(7388);
    __CLR4_4_15p85p8lck0y96v.R.inc(7389);super.setUp();
    __CLR4_4_15p85p8lck0y96v.R.inc(7390);builder = new GsonBuilder();
  }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}

  public void testGsonWithNonDefaultFieldNamingPolicySerialization() {__CLR4_4_15p85p8lck0y96v.R.globalSliceStart(getClass().getName(),7391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pg9vyy5pb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15p85p8lck0y96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_15p85p8lck0y96v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testGsonWithNonDefaultFieldNamingPolicySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pg9vyy5pb(){try{__CLR4_4_15p85p8lck0y96v.R.inc(7391);
    __CLR4_4_15p85p8lck0y96v.R.inc(7392);Gson gson = builder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
    __CLR4_4_15p85p8lck0y96v.R.inc(7393);StringWrapper target = new StringWrapper("blah");
    __CLR4_4_15p85p8lck0y96v.R.inc(7394);assertEquals("{\"SomeConstantStringInstanceField\":\""
        + target.someConstantStringInstanceField + "\"}", gson.toJson(target));
  }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}

  public void testGsonWithNonDefaultFieldNamingPolicyDeserialiation() {__CLR4_4_15p85p8lck0y96v.R.globalSliceStart(getClass().getName(),7395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvqx8l5pf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15p85p8lck0y96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_15p85p8lck0y96v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testGsonWithNonDefaultFieldNamingPolicyDeserialiation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvqx8l5pf(){try{__CLR4_4_15p85p8lck0y96v.R.inc(7395);
    __CLR4_4_15p85p8lck0y96v.R.inc(7396);Gson gson = builder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
    __CLR4_4_15p85p8lck0y96v.R.inc(7397);String target = "{\"SomeConstantStringInstanceField\":\"someValue\"}";
    __CLR4_4_15p85p8lck0y96v.R.inc(7398);StringWrapper deserializedObject = gson.fromJson(target, StringWrapper.class);
    __CLR4_4_15p85p8lck0y96v.R.inc(7399);assertEquals("someValue", deserializedObject.someConstantStringInstanceField);
  }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}
  
  public void testGsonWithLowerCaseDashPolicySerialization() {__CLR4_4_15p85p8lck0y96v.R.globalSliceStart(getClass().getName(),7400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kb1l0b5pk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15p85p8lck0y96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_15p85p8lck0y96v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testGsonWithLowerCaseDashPolicySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kb1l0b5pk(){try{__CLR4_4_15p85p8lck0y96v.R.inc(7400);
    __CLR4_4_15p85p8lck0y96v.R.inc(7401);Gson gson = builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES).create();
    __CLR4_4_15p85p8lck0y96v.R.inc(7402);StringWrapper target = new StringWrapper("blah");
    __CLR4_4_15p85p8lck0y96v.R.inc(7403);assertEquals("{\"some-constant-string-instance-field\":\""
        + target.someConstantStringInstanceField + "\"}", gson.toJson(target));
  }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}

  public void testGsonWithLowerCaseDashPolicyDeserialiation() {__CLR4_4_15p85p8lck0y96v.R.globalSliceStart(getClass().getName(),7404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ez4ee25po();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15p85p8lck0y96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_15p85p8lck0y96v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testGsonWithLowerCaseDashPolicyDeserialiation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ez4ee25po(){try{__CLR4_4_15p85p8lck0y96v.R.inc(7404);
    __CLR4_4_15p85p8lck0y96v.R.inc(7405);Gson gson = builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES).create();
    __CLR4_4_15p85p8lck0y96v.R.inc(7406);String target = "{\"some-constant-string-instance-field\":\"someValue\"}";
    __CLR4_4_15p85p8lck0y96v.R.inc(7407);StringWrapper deserializedObject = gson.fromJson(target, StringWrapper.class);
    __CLR4_4_15p85p8lck0y96v.R.inc(7408);assertEquals("someValue", deserializedObject.someConstantStringInstanceField);
  }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}
  
  public void testGsonWithLowerCaseUnderscorePolicySerialization() {__CLR4_4_15p85p8lck0y96v.R.globalSliceStart(getClass().getName(),7409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6bo035pt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15p85p8lck0y96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_15p85p8lck0y96v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testGsonWithLowerCaseUnderscorePolicySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6bo035pt(){try{__CLR4_4_15p85p8lck0y96v.R.inc(7409);
    __CLR4_4_15p85p8lck0y96v.R.inc(7410);Gson gson = builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .create();
    __CLR4_4_15p85p8lck0y96v.R.inc(7411);StringWrapper target = new StringWrapper("blah");
    __CLR4_4_15p85p8lck0y96v.R.inc(7412);assertEquals("{\"some_constant_string_instance_field\":\""
        + target.someConstantStringInstanceField + "\"}", gson.toJson(target));
  }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}

  public void testGsonWithLowerCaseUnderscorePolicyDeserialiation() {__CLR4_4_15p85p8lck0y96v.R.globalSliceStart(getClass().getName(),7413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x703gi5px();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15p85p8lck0y96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_15p85p8lck0y96v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testGsonWithLowerCaseUnderscorePolicyDeserialiation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x703gi5px(){try{__CLR4_4_15p85p8lck0y96v.R.inc(7413);
    __CLR4_4_15p85p8lck0y96v.R.inc(7414);Gson gson = builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .create();
    __CLR4_4_15p85p8lck0y96v.R.inc(7415);String target = "{\"some_constant_string_instance_field\":\"someValue\"}";
    __CLR4_4_15p85p8lck0y96v.R.inc(7416);StringWrapper deserializedObject = gson.fromJson(target, StringWrapper.class);
    __CLR4_4_15p85p8lck0y96v.R.inc(7417);assertEquals("someValue", deserializedObject.someConstantStringInstanceField);
  }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}

  public void testGsonWithSerializedNameFieldNamingPolicySerialization() {__CLR4_4_15p85p8lck0y96v.R.globalSliceStart(getClass().getName(),7418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ifvcl15q2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15p85p8lck0y96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_15p85p8lck0y96v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testGsonWithSerializedNameFieldNamingPolicySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ifvcl15q2(){try{__CLR4_4_15p85p8lck0y96v.R.inc(7418);
    __CLR4_4_15p85p8lck0y96v.R.inc(7419);Gson gson = builder.create();
    __CLR4_4_15p85p8lck0y96v.R.inc(7420);ClassWithSerializedNameFields expected = new ClassWithSerializedNameFields(5, 6);
    __CLR4_4_15p85p8lck0y96v.R.inc(7421);String actual = gson.toJson(expected);
    __CLR4_4_15p85p8lck0y96v.R.inc(7422);assertEquals(expected.getExpectedJson(), actual);
  }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}

  public void testGsonWithSerializedNameFieldNamingPolicyDeserialization() {__CLR4_4_15p85p8lck0y96v.R.globalSliceStart(getClass().getName(),7423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1xf045q7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15p85p8lck0y96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_15p85p8lck0y96v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testGsonWithSerializedNameFieldNamingPolicyDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1xf045q7(){try{__CLR4_4_15p85p8lck0y96v.R.inc(7423);
    __CLR4_4_15p85p8lck0y96v.R.inc(7424);Gson gson = builder.create();
    __CLR4_4_15p85p8lck0y96v.R.inc(7425);ClassWithSerializedNameFields expected = new ClassWithSerializedNameFields(5, 7);
    __CLR4_4_15p85p8lck0y96v.R.inc(7426);ClassWithSerializedNameFields actual =
        gson.fromJson(expected.getExpectedJson(), ClassWithSerializedNameFields.class);
    __CLR4_4_15p85p8lck0y96v.R.inc(7427);assertEquals(expected.f, actual.f);
  }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}
  
  public void testGsonDuplicateNameUsingSerializedNameFieldNamingPolicySerialization() {__CLR4_4_15p85p8lck0y96v.R.globalSliceStart(getClass().getName(),7428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zan57n5qc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15p85p8lck0y96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_15p85p8lck0y96v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testGsonDuplicateNameUsingSerializedNameFieldNamingPolicySerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zan57n5qc(){try{__CLR4_4_15p85p8lck0y96v.R.inc(7428);
    __CLR4_4_15p85p8lck0y96v.R.inc(7429);Gson gson = builder.create();
    __CLR4_4_15p85p8lck0y96v.R.inc(7430);ClassWithDuplicateFields target = new ClassWithDuplicateFields(10);
    __CLR4_4_15p85p8lck0y96v.R.inc(7431);String actual = gson.toJson(target);
    __CLR4_4_15p85p8lck0y96v.R.inc(7432);assertEquals("{\"a\":10}", actual);
    
    __CLR4_4_15p85p8lck0y96v.R.inc(7433);target = new ClassWithDuplicateFields(3.0D);
    __CLR4_4_15p85p8lck0y96v.R.inc(7434);actual = gson.toJson(target);
    __CLR4_4_15p85p8lck0y96v.R.inc(7435);assertEquals("{\"a\":3.0}", actual);
  }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}
  
  public void testGsonWithUpperCamelCaseSpacesPolicySerialiation() {__CLR4_4_15p85p8lck0y96v.R.globalSliceStart(getClass().getName(),7436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdu2r15qk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15p85p8lck0y96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_15p85p8lck0y96v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testGsonWithUpperCamelCaseSpacesPolicySerialiation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdu2r15qk(){try{__CLR4_4_15p85p8lck0y96v.R.inc(7436);
    __CLR4_4_15p85p8lck0y96v.R.inc(7437);Gson gson = builder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES)
        .create();
    __CLR4_4_15p85p8lck0y96v.R.inc(7438);StringWrapper target = new StringWrapper("blah");
    __CLR4_4_15p85p8lck0y96v.R.inc(7439);assertEquals("{\"Some Constant String Instance Field\":\""
        + target.someConstantStringInstanceField + "\"}", gson.toJson(target));
  }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}
  
  public void testGsonWithUpperCamelCaseSpacesPolicyDeserialiation() {__CLR4_4_15p85p8lck0y96v.R.globalSliceStart(getClass().getName(),7440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhgwfm5qo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15p85p8lck0y96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_15p85p8lck0y96v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testGsonWithUpperCamelCaseSpacesPolicyDeserialiation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhgwfm5qo(){try{__CLR4_4_15p85p8lck0y96v.R.inc(7440);
    __CLR4_4_15p85p8lck0y96v.R.inc(7441);Gson gson = builder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES)
        .create();
    __CLR4_4_15p85p8lck0y96v.R.inc(7442);String target = "{\"Some Constant String Instance Field\":\"someValue\"}";
    __CLR4_4_15p85p8lck0y96v.R.inc(7443);StringWrapper deserializedObject = gson.fromJson(target, StringWrapper.class);
    __CLR4_4_15p85p8lck0y96v.R.inc(7444);assertEquals("someValue", deserializedObject.someConstantStringInstanceField);
  }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}

  public void testDeprecatedNamingStrategy() throws Exception {__CLR4_4_15p85p8lck0y96v.R.globalSliceStart(getClass().getName(),7445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z0ebhj5qt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15p85p8lck0y96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_15p85p8lck0y96v.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.NamingPolicyTest.testDeprecatedNamingStrategy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z0ebhj5qt() throws Exception{try{__CLR4_4_15p85p8lck0y96v.R.inc(7445);
    __CLR4_4_15p85p8lck0y96v.R.inc(7446);Gson gson = builder.setFieldNamingStrategy(new UpperCaseNamingStrategy()).create();
    __CLR4_4_15p85p8lck0y96v.R.inc(7447);ClassWithDuplicateFields target = new ClassWithDuplicateFields(10);
    __CLR4_4_15p85p8lck0y96v.R.inc(7448);String actual = gson.toJson(target);
    __CLR4_4_15p85p8lck0y96v.R.inc(7449);assertEquals("{\"A\":10}", actual);
  }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}

  private static class UpperCaseNamingStrategy implements FieldNamingStrategy {
    public String translateName(Field f) {try{__CLR4_4_15p85p8lck0y96v.R.inc(7450);
      __CLR4_4_15p85p8lck0y96v.R.inc(7451);return f.getName().toUpperCase();
    }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}
  }

  @SuppressWarnings("unused")
  private static class ClassWithDuplicateFields {
    public Integer a;
    @SerializedName("a") public Double b;
    
    public ClassWithDuplicateFields(Integer a) {
      this(a, null);__CLR4_4_15p85p8lck0y96v.R.inc(7453);try{__CLR4_4_15p85p8lck0y96v.R.inc(7452);
    }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}
    
    public ClassWithDuplicateFields(Double b) {
      this(null, b);__CLR4_4_15p85p8lck0y96v.R.inc(7455);try{__CLR4_4_15p85p8lck0y96v.R.inc(7454);
    }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}
    
    public ClassWithDuplicateFields(Integer a, Double b) {try{__CLR4_4_15p85p8lck0y96v.R.inc(7456);
      __CLR4_4_15p85p8lck0y96v.R.inc(7457);this.a = a;
      __CLR4_4_15p85p8lck0y96v.R.inc(7458);this.b = b;
    }finally{__CLR4_4_15p85p8lck0y96v.R.flushNeeded();}}
  }
}
