/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2010 Google Inc.
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

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Functional test for Gson serialization and deserialization of
 * @author Joel Leitch
 */
public class TypeVariableTest extends TestCase {static class __CLR4_4_16pz6pzlck0y9ct{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,8737,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public void testSingle() throws Exception {__CLR4_4_16pz6pzlck0y9ct.R.globalSliceStart(getClass().getName(),8711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vwu4xt6pz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16pz6pzlck0y9ct.R.rethrow($CLV_t2$);}finally{__CLR4_4_16pz6pzlck0y9ct.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.TypeVariableTest.testSingle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vwu4xt6pz() throws Exception{try{__CLR4_4_16pz6pzlck0y9ct.R.inc(8711);
    __CLR4_4_16pz6pzlck0y9ct.R.inc(8712);Gson gson = new Gson();
    __CLR4_4_16pz6pzlck0y9ct.R.inc(8713);Bar bar1 = new Bar("someString", 1);
    __CLR4_4_16pz6pzlck0y9ct.R.inc(8714);ArrayList<Integer> arrayList = new ArrayList<Integer>();
    __CLR4_4_16pz6pzlck0y9ct.R.inc(8715);arrayList.add(1);
    __CLR4_4_16pz6pzlck0y9ct.R.inc(8716);arrayList.add(2);
    __CLR4_4_16pz6pzlck0y9ct.R.inc(8717);bar1.map.put("key1", arrayList);
    __CLR4_4_16pz6pzlck0y9ct.R.inc(8718);bar1.map.put("key2", new ArrayList<Integer>());
    __CLR4_4_16pz6pzlck0y9ct.R.inc(8719);String json = gson.toJson(bar1);
    __CLR4_4_16pz6pzlck0y9ct.R.inc(8720);System.out.println(json);

    __CLR4_4_16pz6pzlck0y9ct.R.inc(8721);Bar bar2 = gson.fromJson(json, Bar.class);
    __CLR4_4_16pz6pzlck0y9ct.R.inc(8722);assertEquals(bar1, bar2);
  }finally{__CLR4_4_16pz6pzlck0y9ct.R.flushNeeded();}}

  public static class Foo<S, T> {
    private final S someSField;
    private final T someTField;
    public final Map<S, List<T>> map = new HashMap<S, List<T>>();

    public Foo(S sValue, T tValue) {try{__CLR4_4_16pz6pzlck0y9ct.R.inc(8723);
      __CLR4_4_16pz6pzlck0y9ct.R.inc(8724);this.someSField = sValue;
      __CLR4_4_16pz6pzlck0y9ct.R.inc(8725);this.someTField = tValue;
    }finally{__CLR4_4_16pz6pzlck0y9ct.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_4_16pz6pzlck0y9ct.R.inc(8726);
      __CLR4_4_16pz6pzlck0y9ct.R.inc(8727);if ((((!(o instanceof Foo))&&(__CLR4_4_16pz6pzlck0y9ct.R.iget(8728)!=0|true))||(__CLR4_4_16pz6pzlck0y9ct.R.iget(8729)==0&false))) {{
        __CLR4_4_16pz6pzlck0y9ct.R.inc(8730);return false;
      } }else {{
        __CLR4_4_16pz6pzlck0y9ct.R.inc(8731);Foo<S, T> realFoo = (Foo<S, T>) o;
        __CLR4_4_16pz6pzlck0y9ct.R.inc(8732);return someTField.equals(realFoo.someTField)
          && someSField.equals(realFoo.someSField)
          && map.equals(realFoo.map);
      }
    }}finally{__CLR4_4_16pz6pzlck0y9ct.R.flushNeeded();}}
  }

  public static class Bar extends Foo<String, Integer> {
    public Bar() {
      this("", 0);__CLR4_4_16pz6pzlck0y9ct.R.inc(8734);try{__CLR4_4_16pz6pzlck0y9ct.R.inc(8733);
    }finally{__CLR4_4_16pz6pzlck0y9ct.R.flushNeeded();}}

    public Bar(String s, Integer i) {
      super(s, i);__CLR4_4_16pz6pzlck0y9ct.R.inc(8736);try{__CLR4_4_16pz6pzlck0y9ct.R.inc(8735);
    }finally{__CLR4_4_16pz6pzlck0y9ct.R.flushNeeded();}}
  }
}
