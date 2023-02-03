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

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;

/**
 * A convenience object for retrieving the map type information.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
final class TypeInfoMap {public static class __CLR4_4_126a26alck0y8ip{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,2837,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private final Type keyType;
  private final Type valueType;
  
  public TypeInfoMap(Type mapType) {try{__CLR4_4_126a26alck0y8ip.R.inc(2818);
    __CLR4_4_126a26alck0y8ip.R.inc(2819);if ((((mapType instanceof Class<?> && Properties.class.isAssignableFrom((Class<?>) mapType))&&(__CLR4_4_126a26alck0y8ip.R.iget(2820)!=0|true))||(__CLR4_4_126a26alck0y8ip.R.iget(2821)==0&false))) {{
      __CLR4_4_126a26alck0y8ip.R.inc(2822);keyType = String.class;
      __CLR4_4_126a26alck0y8ip.R.inc(2823);valueType = String.class;
    } }else {__CLR4_4_126a26alck0y8ip.R.inc(2824);if ((((mapType instanceof ParameterizedType)&&(__CLR4_4_126a26alck0y8ip.R.iget(2825)!=0|true))||(__CLR4_4_126a26alck0y8ip.R.iget(2826)==0&false))) {{
      __CLR4_4_126a26alck0y8ip.R.inc(2827);TypeInfo rawType = new TypeInfo(mapType);
      __CLR4_4_126a26alck0y8ip.R.inc(2828);Preconditions.checkArgument(Map.class.isAssignableFrom(rawType.getRawClass()));
      __CLR4_4_126a26alck0y8ip.R.inc(2829);ParameterizedType paramType = (ParameterizedType) mapType;
      __CLR4_4_126a26alck0y8ip.R.inc(2830);keyType = paramType.getActualTypeArguments()[0];
      __CLR4_4_126a26alck0y8ip.R.inc(2831);valueType = paramType.getActualTypeArguments()[1];      
    } }else {{
      __CLR4_4_126a26alck0y8ip.R.inc(2832);throw new IllegalArgumentException(
          "Map objects need to be parameterized unless you use a custom serializer. "
              + "Use the com.google.gson.reflect.TypeToken to extract the ParameterizedType.");
    }
  }}}finally{__CLR4_4_126a26alck0y8ip.R.flushNeeded();}}

  public Type getKeyType() {try{__CLR4_4_126a26alck0y8ip.R.inc(2833);
    __CLR4_4_126a26alck0y8ip.R.inc(2834);return keyType;
  }finally{__CLR4_4_126a26alck0y8ip.R.flushNeeded();}}

  public Type getValueType() {try{__CLR4_4_126a26alck0y8ip.R.inc(2835);
    __CLR4_4_126a26alck0y8ip.R.inc(2836);return valueType;
  }finally{__CLR4_4_126a26alck0y8ip.R.flushNeeded();}}
}