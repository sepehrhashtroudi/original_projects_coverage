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

import com.google.gson.DefaultTypeAdapters.DefaultDateTypeAdapter;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Date;

/**
 * Simple unit tests for the {@link JsonDeserializerExceptionWrapper} class.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class JsonDeserializerExceptionWrapperTest extends TestCase {static class __CLR4_4_139z39zlck0y8s2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4272,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private static final String DATE_STRING =
      DateFormat.getDateInstance(DateFormat.LONG).format(new Date());
  private static final JsonPrimitive PRIMITIVE_ELEMENT = new JsonPrimitive(DATE_STRING);

  public void testRethrowJsonParseException() throws Exception {__CLR4_4_139z39zlck0y8s2.R.globalSliceStart(getClass().getName(),4247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1638e0k39z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_139z39zlck0y8s2.R.rethrow($CLV_t2$);}finally{__CLR4_4_139z39zlck0y8s2.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonDeserializerExceptionWrapperTest.testRethrowJsonParseException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1638e0k39z() throws Exception{try{__CLR4_4_139z39zlck0y8s2.R.inc(4247);
    __CLR4_4_139z39zlck0y8s2.R.inc(4248);String errorMsg = "please rethrow me";
    __CLR4_4_139z39zlck0y8s2.R.inc(4249);JsonDeserializerExceptionWrapper<String> wrappedJsonSerializer =
        new JsonDeserializerExceptionWrapper<String>(
            new ExceptionJsonDeserializer(new JsonParseException(errorMsg)));

    __CLR4_4_139z39zlck0y8s2.R.inc(4250);try {
      __CLR4_4_139z39zlck0y8s2.R.inc(4251);wrappedJsonSerializer.deserialize(PRIMITIVE_ELEMENT, String.class, null);
      __CLR4_4_139z39zlck0y8s2.R.inc(4252);fail("JsonParseException should have been thrown");
    } catch (JsonParseException expected) {
      __CLR4_4_139z39zlck0y8s2.R.inc(4253);assertNull(expected.getCause());
      __CLR4_4_139z39zlck0y8s2.R.inc(4254);assertEquals(errorMsg, expected.getMessage());
    }
  }finally{__CLR4_4_139z39zlck0y8s2.R.flushNeeded();}}

  public void testWrappedExceptionPropagation() throws Exception {__CLR4_4_139z39zlck0y8s2.R.globalSliceStart(getClass().getName(),4255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rvk1vt3a7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_139z39zlck0y8s2.R.rethrow($CLV_t2$);}finally{__CLR4_4_139z39zlck0y8s2.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonDeserializerExceptionWrapperTest.testWrappedExceptionPropagation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rvk1vt3a7() throws Exception{try{__CLR4_4_139z39zlck0y8s2.R.inc(4255);
    __CLR4_4_139z39zlck0y8s2.R.inc(4256);IllegalArgumentException exceptionToThrow = new IllegalArgumentException();
    __CLR4_4_139z39zlck0y8s2.R.inc(4257);JsonDeserializerExceptionWrapper<String> wrappedJsonSerializer =
        new JsonDeserializerExceptionWrapper<String>(
            new ExceptionJsonDeserializer(exceptionToThrow));

    __CLR4_4_139z39zlck0y8s2.R.inc(4258);try {
      __CLR4_4_139z39zlck0y8s2.R.inc(4259);wrappedJsonSerializer.deserialize(PRIMITIVE_ELEMENT, String.class, null);
      __CLR4_4_139z39zlck0y8s2.R.inc(4260);fail("JsonParseException should have been thrown");
    } catch (JsonParseException expected) {
      __CLR4_4_139z39zlck0y8s2.R.inc(4261);assertEquals(exceptionToThrow, expected.getCause());
    }
  }finally{__CLR4_4_139z39zlck0y8s2.R.flushNeeded();}}

  public void testProperSerialization() throws Exception {__CLR4_4_139z39zlck0y8s2.R.globalSliceStart(getClass().getName(),4262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ho7x13ae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_139z39zlck0y8s2.R.rethrow($CLV_t2$);}finally{__CLR4_4_139z39zlck0y8s2.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonDeserializerExceptionWrapperTest.testProperSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ho7x13ae() throws Exception{try{__CLR4_4_139z39zlck0y8s2.R.inc(4262);
    __CLR4_4_139z39zlck0y8s2.R.inc(4263);DefaultDateTypeAdapter dateSerializer = new DefaultDateTypeAdapter(DateFormat.LONG);
    __CLR4_4_139z39zlck0y8s2.R.inc(4264);JsonDeserializerExceptionWrapper<Date> wrappedJsonSerializer =
        new JsonDeserializerExceptionWrapper<Date>(dateSerializer);

    __CLR4_4_139z39zlck0y8s2.R.inc(4265);Date expected = dateSerializer.deserialize(PRIMITIVE_ELEMENT, Date.class, null);
    __CLR4_4_139z39zlck0y8s2.R.inc(4266);Date actual = wrappedJsonSerializer.deserialize(PRIMITIVE_ELEMENT, Date.class, null);
    __CLR4_4_139z39zlck0y8s2.R.inc(4267);assertEquals(expected, actual);
  }finally{__CLR4_4_139z39zlck0y8s2.R.flushNeeded();}}

  private static class ExceptionJsonDeserializer implements JsonDeserializer<String> {
    private final RuntimeException exceptionToThrow;

    public ExceptionJsonDeserializer(RuntimeException exceptionToThrow) {try{__CLR4_4_139z39zlck0y8s2.R.inc(4268);
      __CLR4_4_139z39zlck0y8s2.R.inc(4269);this.exceptionToThrow = exceptionToThrow;
    }finally{__CLR4_4_139z39zlck0y8s2.R.flushNeeded();}}

    public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_139z39zlck0y8s2.R.inc(4270);
      __CLR4_4_139z39zlck0y8s2.R.inc(4271);throw exceptionToThrow;
    }finally{__CLR4_4_139z39zlck0y8s2.R.flushNeeded();}}
  }
}