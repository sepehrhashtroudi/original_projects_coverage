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

import com.google.gson.annotations.SerializedName;

/**
 * Unit tests for the {@link SerializedNameAnnotationInterceptingNamingPolicy} class.
 *
 * @author Joel Leitch
 */
public class SerializedNameAnnotationInterceptingNamingPolicyTest extends TestCase {static class __CLR4_4_13w13w1lck0y8w3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,5053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final String ANNOTATED_FIELD_NAME = "annotatedFieldName";

  private SerializedNameAnnotationInterceptingNamingPolicy policy;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13w13w1lck0y8w3.R.inc(5041);
    __CLR4_4_13w13w1lck0y8w3.R.inc(5042);super.setUp();
    __CLR4_4_13w13w1lck0y8w3.R.inc(5043);policy = new SerializedNameAnnotationInterceptingNamingPolicy(new JavaFieldNamingPolicy());
  }finally{__CLR4_4_13w13w1lck0y8w3.R.flushNeeded();}}

  public void testFieldWithAnnotation() throws Exception {__CLR4_4_13w13w1lck0y8w3.R.globalSliceStart(getClass().getName(),5044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yt13bw3w4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13w13w1lck0y8w3.R.rethrow($CLV_t2$);}finally{__CLR4_4_13w13w1lck0y8w3.R.globalSliceEnd(getClass().getName(),"com.google.gson.SerializedNameAnnotationInterceptingNamingPolicyTest.testFieldWithAnnotation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5044,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yt13bw3w4() throws Exception{try{__CLR4_4_13w13w1lck0y8w3.R.inc(5044);
    __CLR4_4_13w13w1lck0y8w3.R.inc(5045);String fieldName = "fieldWithAnnotation";
    __CLR4_4_13w13w1lck0y8w3.R.inc(5046);FieldAttributes f = new FieldAttributes(
        SomeObject.class, SomeObject.class.getField(fieldName));

    __CLR4_4_13w13w1lck0y8w3.R.inc(5047);assertFalse(ANNOTATED_FIELD_NAME.equals(fieldName));
    __CLR4_4_13w13w1lck0y8w3.R.inc(5048);assertEquals(ANNOTATED_FIELD_NAME, policy.translateName(f));
  }finally{__CLR4_4_13w13w1lck0y8w3.R.flushNeeded();}}

  public void testFieldWithoutAnnotation() throws Exception {__CLR4_4_13w13w1lck0y8w3.R.globalSliceStart(getClass().getName(),5049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmjo6i3w9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13w13w1lck0y8w3.R.rethrow($CLV_t2$);}finally{__CLR4_4_13w13w1lck0y8w3.R.globalSliceEnd(getClass().getName(),"com.google.gson.SerializedNameAnnotationInterceptingNamingPolicyTest.testFieldWithoutAnnotation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmjo6i3w9() throws Exception{try{__CLR4_4_13w13w1lck0y8w3.R.inc(5049);
    __CLR4_4_13w13w1lck0y8w3.R.inc(5050);String fieldName = "fieldWithoutAnnotation";
    __CLR4_4_13w13w1lck0y8w3.R.inc(5051);FieldAttributes f = new FieldAttributes(
        SomeObject.class, SomeObject.class.getField(fieldName));

    __CLR4_4_13w13w1lck0y8w3.R.inc(5052);assertEquals(fieldName, policy.translateName(f));
  }finally{__CLR4_4_13w13w1lck0y8w3.R.flushNeeded();}}

  @SuppressWarnings("unused")
  private static class SomeObject {
    @SerializedName(ANNOTATED_FIELD_NAME) public final int fieldWithAnnotation = 1;
    public final int fieldWithoutAnnotation = 1;
  }
}
