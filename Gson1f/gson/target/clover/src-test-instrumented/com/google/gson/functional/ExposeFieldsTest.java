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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.google.gson.annotations.Expose;

import junit.framework.TestCase;

/**
 * Unit tests for the regarding functional "@Expose" type tests.
 *
 * @author Joel Leitch
 */
public class ExposeFieldsTest extends TestCase {static class __CLR4_4_1597597lck0y94i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,6878,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_1597597lck0y94i.R.inc(6811);
    __CLR4_4_1597597lck0y94i.R.inc(6812);super.setUp();
    __CLR4_4_1597597lck0y94i.R.inc(6813);gson = new GsonBuilder()
        .excludeFieldsWithoutExposeAnnotation()
        .registerTypeAdapter(SomeInterface.class, new SomeInterfaceInstanceCreator())
        .create();
  }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}

  public void testNullExposeFieldSerialization() throws Exception {__CLR4_4_1597597lck0y94i.R.globalSliceStart(getClass().getName(),6814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yggqpm59a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1597597lck0y94i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1597597lck0y94i.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ExposeFieldsTest.testNullExposeFieldSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yggqpm59a() throws Exception{try{__CLR4_4_1597597lck0y94i.R.inc(6814);
    __CLR4_4_1597597lck0y94i.R.inc(6815);ClassWithExposedFields object = new ClassWithExposedFields(null, 1);
    __CLR4_4_1597597lck0y94i.R.inc(6816);String json = gson.toJson(object);

    __CLR4_4_1597597lck0y94i.R.inc(6817);assertEquals(object.getExpectedJson(), json);
  }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}

  public void testArrayWithOneNullExposeFieldObjectSerialization() throws Exception {__CLR4_4_1597597lck0y94i.R.globalSliceStart(getClass().getName(),6818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1357ybi59e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1597597lck0y94i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1597597lck0y94i.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ExposeFieldsTest.testArrayWithOneNullExposeFieldObjectSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1357ybi59e() throws Exception{try{__CLR4_4_1597597lck0y94i.R.inc(6818);
    __CLR4_4_1597597lck0y94i.R.inc(6819);ClassWithExposedFields object1 = new ClassWithExposedFields(1, 1);
    __CLR4_4_1597597lck0y94i.R.inc(6820);ClassWithExposedFields object2 = new ClassWithExposedFields(null, 1);
    __CLR4_4_1597597lck0y94i.R.inc(6821);ClassWithExposedFields object3 = new ClassWithExposedFields(2, 2);
    __CLR4_4_1597597lck0y94i.R.inc(6822);ClassWithExposedFields[] objects = { object1, object2, object3 };

    __CLR4_4_1597597lck0y94i.R.inc(6823);String json = gson.toJson(objects);
    __CLR4_4_1597597lck0y94i.R.inc(6824);String expected = new StringBuilder()
        .append('[').append(object1.getExpectedJson()).append(',')
        .append(object2.getExpectedJson()).append(',')
        .append(object3.getExpectedJson()).append(']')
        .toString();

    __CLR4_4_1597597lck0y94i.R.inc(6825);assertEquals(expected, json);
  }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}

  public void testExposeAnnotationSerialization() throws Exception {__CLR4_4_1597597lck0y94i.R.globalSliceStart(getClass().getName(),6826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13k3j0y59m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1597597lck0y94i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1597597lck0y94i.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ExposeFieldsTest.testExposeAnnotationSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13k3j0y59m() throws Exception{try{__CLR4_4_1597597lck0y94i.R.inc(6826);
    __CLR4_4_1597597lck0y94i.R.inc(6827);ClassWithExposedFields target = new ClassWithExposedFields(1, 2);
    __CLR4_4_1597597lck0y94i.R.inc(6828);assertEquals(target.getExpectedJson(), gson.toJson(target));
  }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}

  public void testExposeAnnotationDeserialization() throws Exception {__CLR4_4_1597597lck0y94i.R.globalSliceStart(getClass().getName(),6829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_173wexd59p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1597597lck0y94i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1597597lck0y94i.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ExposeFieldsTest.testExposeAnnotationDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_173wexd59p() throws Exception{try{__CLR4_4_1597597lck0y94i.R.inc(6829);
    __CLR4_4_1597597lck0y94i.R.inc(6830);String json = "{a:3,b:4,d:20.0}";
    __CLR4_4_1597597lck0y94i.R.inc(6831);ClassWithExposedFields target = gson.fromJson(json, ClassWithExposedFields.class);

    __CLR4_4_1597597lck0y94i.R.inc(6832);assertEquals(3, (int) target.a);
    __CLR4_4_1597597lck0y94i.R.inc(6833);assertNull(target.b);
    __CLR4_4_1597597lck0y94i.R.inc(6834);assertFalse(target.d == 20);
  }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}

  public void testNoExposedFieldSerialization() throws Exception {__CLR4_4_1597597lck0y94i.R.globalSliceStart(getClass().getName(),6835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c47rzq59v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1597597lck0y94i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1597597lck0y94i.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ExposeFieldsTest.testNoExposedFieldSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c47rzq59v() throws Exception{try{__CLR4_4_1597597lck0y94i.R.inc(6835);
    __CLR4_4_1597597lck0y94i.R.inc(6836);ClassWithNoExposedFields obj = new ClassWithNoExposedFields();
    __CLR4_4_1597597lck0y94i.R.inc(6837);String json = gson.toJson(obj);

    __CLR4_4_1597597lck0y94i.R.inc(6838);assertEquals("{}", json);
  }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}

  public void testNoExposedFieldDeserialization() throws Exception {__CLR4_4_1597597lck0y94i.R.globalSliceStart(getClass().getName(),6839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11lyww959z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1597597lck0y94i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1597597lck0y94i.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ExposeFieldsTest.testNoExposedFieldDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11lyww959z() throws Exception{try{__CLR4_4_1597597lck0y94i.R.inc(6839);
    __CLR4_4_1597597lck0y94i.R.inc(6840);String json = "{a:4,b:5}";
    __CLR4_4_1597597lck0y94i.R.inc(6841);ClassWithNoExposedFields obj = gson.fromJson(json, ClassWithNoExposedFields.class);

    __CLR4_4_1597597lck0y94i.R.inc(6842);assertEquals(0, obj.a);
    __CLR4_4_1597597lck0y94i.R.inc(6843);assertEquals(1, obj.b);
  }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}
  
  public void testExposedInterfaceFieldSerialization() throws Exception {__CLR4_4_1597597lck0y94i.R.globalSliceStart(getClass().getName(),6844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iqxjc5a4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1597597lck0y94i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1597597lck0y94i.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ExposeFieldsTest.testExposedInterfaceFieldSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iqxjc5a4() throws Exception{try{__CLR4_4_1597597lck0y94i.R.inc(6844);
    __CLR4_4_1597597lck0y94i.R.inc(6845);String expected = "{\"interfaceField\":{}}";
    __CLR4_4_1597597lck0y94i.R.inc(6846);ClassWithInterfaceField target = new ClassWithInterfaceField(new SomeObject());
    __CLR4_4_1597597lck0y94i.R.inc(6847);String actual = gson.toJson(target);
    
    __CLR4_4_1597597lck0y94i.R.inc(6848);assertEquals(expected, actual);
  }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}
  
  public void testExposedInterfaceFieldDeserialization() throws Exception {__CLR4_4_1597597lck0y94i.R.globalSliceStart(getClass().getName(),6849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c90sn5a9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1597597lck0y94i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1597597lck0y94i.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ExposeFieldsTest.testExposedInterfaceFieldDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c90sn5a9() throws Exception{try{__CLR4_4_1597597lck0y94i.R.inc(6849);
    __CLR4_4_1597597lck0y94i.R.inc(6850);String json = "{\"interfaceField\":{}}";
    __CLR4_4_1597597lck0y94i.R.inc(6851);ClassWithInterfaceField obj = gson.fromJson(json, ClassWithInterfaceField.class);

    __CLR4_4_1597597lck0y94i.R.inc(6852);assertNotNull(obj.interfaceField);
  }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}

  @SuppressWarnings("unused")
  private static class ClassWithExposedFields {
    @Expose private final Integer a;
    private final Integer b;
    @Expose(serialize = false) final long c;
    @Expose(deserialize = false) final double d;
    @Expose(serialize = false, deserialize = false) final char e;

    // For use by Gson
    private ClassWithExposedFields() {
      this(null, null);__CLR4_4_1597597lck0y94i.R.inc(6854);try{__CLR4_4_1597597lck0y94i.R.inc(6853);
    }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}

    public ClassWithExposedFields(Integer a, Integer b) {
      this(a, b, 1L, 2.0, 'a');__CLR4_4_1597597lck0y94i.R.inc(6856);try{__CLR4_4_1597597lck0y94i.R.inc(6855);
    }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}
    public ClassWithExposedFields(Integer a, Integer b, long c, double d, char e) {try{__CLR4_4_1597597lck0y94i.R.inc(6857);
      __CLR4_4_1597597lck0y94i.R.inc(6858);this.a = a;
      __CLR4_4_1597597lck0y94i.R.inc(6859);this.b = b;
      __CLR4_4_1597597lck0y94i.R.inc(6860);this.c = c;
      __CLR4_4_1597597lck0y94i.R.inc(6861);this.d = d;
      __CLR4_4_1597597lck0y94i.R.inc(6862);this.e = e;
    }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_1597597lck0y94i.R.inc(6863);
      __CLR4_4_1597597lck0y94i.R.inc(6864);StringBuilder sb = new StringBuilder("{");
      __CLR4_4_1597597lck0y94i.R.inc(6865);if ((((a != null)&&(__CLR4_4_1597597lck0y94i.R.iget(6866)!=0|true))||(__CLR4_4_1597597lck0y94i.R.iget(6867)==0&false))) {{
        __CLR4_4_1597597lck0y94i.R.inc(6868);sb.append("\"a\":").append(a).append(",");
      }
      }__CLR4_4_1597597lck0y94i.R.inc(6869);sb.append("\"d\":").append(d);
      __CLR4_4_1597597lck0y94i.R.inc(6870);sb.append("}");
      __CLR4_4_1597597lck0y94i.R.inc(6871);return sb.toString();
    }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}
  }

  private static class ClassWithNoExposedFields {
    private final int a = 0;
    private final int b = 1;
  }
  
  private static interface SomeInterface {
    // Empty interface
  }
  
  private static class SomeObject implements SomeInterface {
    // Do nothing
  }
  
  private static class SomeInterfaceInstanceCreator implements InstanceCreator<SomeInterface> {
    public SomeInterface createInstance(Type type) {try{__CLR4_4_1597597lck0y94i.R.inc(6872);
      __CLR4_4_1597597lck0y94i.R.inc(6873);return new SomeObject();
    }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}
  }
  
  private static class ClassWithInterfaceField {
    @Expose
    private final SomeInterface interfaceField;

    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithInterfaceField() {
      this(null);__CLR4_4_1597597lck0y94i.R.inc(6875);try{__CLR4_4_1597597lck0y94i.R.inc(6874);
    }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}

    public ClassWithInterfaceField(SomeInterface interfaceField) {try{__CLR4_4_1597597lck0y94i.R.inc(6876);
      __CLR4_4_1597597lck0y94i.R.inc(6877);this.interfaceField = interfaceField;
    }finally{__CLR4_4_1597597lck0y94i.R.flushNeeded();}}
  }  
}
