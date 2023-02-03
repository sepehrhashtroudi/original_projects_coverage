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

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/**
 * Utility class containing some methods for obtaining information on types.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
final class TypeUtils {public static class __CLR4_4_126t26tlck0y8iw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,2886,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /**
   * Returns the actual type matching up with the first type variable.
   * So, for a {@code typeInfo} instance defined as:
   * <pre>
   *   class Foo<A, B> {
   *   }
   *   Type fooType = new TypeToken<Foo<Integer, String>>() {}.getType();
   * </pre>
   * <code>TypeUtils.getActualTypeForFirstTypeVariable(fooType)</code> will return Integer.class.
   */
  static Type getActualTypeForFirstTypeVariable(Type type) {try{__CLR4_4_126t26tlck0y8iw.R.inc(2837);
    __CLR4_4_126t26tlck0y8iw.R.inc(2838);if ((((type instanceof Class<?>)&&(__CLR4_4_126t26tlck0y8iw.R.iget(2839)!=0|true))||(__CLR4_4_126t26tlck0y8iw.R.iget(2840)==0&false))) {{
      __CLR4_4_126t26tlck0y8iw.R.inc(2841);return Object.class;
    } }else {__CLR4_4_126t26tlck0y8iw.R.inc(2842);if ((((type instanceof ParameterizedType)&&(__CLR4_4_126t26tlck0y8iw.R.iget(2843)!=0|true))||(__CLR4_4_126t26tlck0y8iw.R.iget(2844)==0&false))) {{
      __CLR4_4_126t26tlck0y8iw.R.inc(2845);return ((ParameterizedType)type).getActualTypeArguments()[0];
    } }else {__CLR4_4_126t26tlck0y8iw.R.inc(2846);if ((((type instanceof GenericArrayType)&&(__CLR4_4_126t26tlck0y8iw.R.iget(2847)!=0|true))||(__CLR4_4_126t26tlck0y8iw.R.iget(2848)==0&false))) {{
      __CLR4_4_126t26tlck0y8iw.R.inc(2849);return getActualTypeForFirstTypeVariable(((GenericArrayType)type).getGenericComponentType());
    } }else {{
      __CLR4_4_126t26tlck0y8iw.R.inc(2850);throw new IllegalArgumentException("Type \'" + type + "\' is not a Class, "
          + "ParameterizedType, or GenericArrayType. Can't extract class.");
    }
  }}}}finally{__CLR4_4_126t26tlck0y8iw.R.flushNeeded();}}

  static boolean isArray(Type type) {try{__CLR4_4_126t26tlck0y8iw.R.inc(2851);
    __CLR4_4_126t26tlck0y8iw.R.inc(2852);if ((((type instanceof Class<?>)&&(__CLR4_4_126t26tlck0y8iw.R.iget(2853)!=0|true))||(__CLR4_4_126t26tlck0y8iw.R.iget(2854)==0&false))) {{
      __CLR4_4_126t26tlck0y8iw.R.inc(2855);return ((Class<?>)type).isArray();
    } }else {__CLR4_4_126t26tlck0y8iw.R.inc(2856);if ((((type instanceof GenericArrayType)&&(__CLR4_4_126t26tlck0y8iw.R.iget(2857)!=0|true))||(__CLR4_4_126t26tlck0y8iw.R.iget(2858)==0&false))) {{
      __CLR4_4_126t26tlck0y8iw.R.inc(2859);return true;
    } }else {{
      __CLR4_4_126t26tlck0y8iw.R.inc(2860);return false;
    }
  }}}finally{__CLR4_4_126t26tlck0y8iw.R.flushNeeded();}}

  /**
   * This method returns the actual raw class associated with the specified type.
   */
  static Class<?> toRawClass(Type type) {try{__CLR4_4_126t26tlck0y8iw.R.inc(2861);
    __CLR4_4_126t26tlck0y8iw.R.inc(2862);if ((((type instanceof Class<?>)&&(__CLR4_4_126t26tlck0y8iw.R.iget(2863)!=0|true))||(__CLR4_4_126t26tlck0y8iw.R.iget(2864)==0&false))) {{
      __CLR4_4_126t26tlck0y8iw.R.inc(2865);return (Class<?>) type;
    } }else {__CLR4_4_126t26tlck0y8iw.R.inc(2866);if ((((type instanceof ParameterizedType)&&(__CLR4_4_126t26tlck0y8iw.R.iget(2867)!=0|true))||(__CLR4_4_126t26tlck0y8iw.R.iget(2868)==0&false))) {{
      __CLR4_4_126t26tlck0y8iw.R.inc(2869);ParameterizedType actualType = (ParameterizedType)type;
      __CLR4_4_126t26tlck0y8iw.R.inc(2870);return toRawClass(actualType.getRawType());
    } }else {__CLR4_4_126t26tlck0y8iw.R.inc(2871);if ((((type instanceof GenericArrayType)&&(__CLR4_4_126t26tlck0y8iw.R.iget(2872)!=0|true))||(__CLR4_4_126t26tlck0y8iw.R.iget(2873)==0&false))) {{
      __CLR4_4_126t26tlck0y8iw.R.inc(2874);GenericArrayType actualType = (GenericArrayType) type;
      __CLR4_4_126t26tlck0y8iw.R.inc(2875);Class<?> rawClass = toRawClass(actualType.getGenericComponentType());
      __CLR4_4_126t26tlck0y8iw.R.inc(2876);return wrapWithArray(rawClass);
    } }else {__CLR4_4_126t26tlck0y8iw.R.inc(2877);if ((((type instanceof WildcardType)&&(__CLR4_4_126t26tlck0y8iw.R.iget(2878)!=0|true))||(__CLR4_4_126t26tlck0y8iw.R.iget(2879)==0&false))) {{
      __CLR4_4_126t26tlck0y8iw.R.inc(2880);WildcardType castedType = (WildcardType) type;
      __CLR4_4_126t26tlck0y8iw.R.inc(2881);return toRawClass(castedType.getUpperBounds()[0]);
    } }else {{
      __CLR4_4_126t26tlck0y8iw.R.inc(2882);throw new IllegalArgumentException("Type \'" + type + "\' is not a Class, "
          + "ParameterizedType, or GenericArrayType. Can't extract class.");
    }
  }}}}}finally{__CLR4_4_126t26tlck0y8iw.R.flushNeeded();}}

  static Class<?> wrapWithArray(Class<?> rawClass) {try{__CLR4_4_126t26tlck0y8iw.R.inc(2883);
    __CLR4_4_126t26tlck0y8iw.R.inc(2884);return Array.newInstance(rawClass, 0).getClass();
  }finally{__CLR4_4_126t26tlck0y8iw.R.flushNeeded();}}

  private TypeUtils() {try{__CLR4_4_126t26tlck0y8iw.R.inc(2885);
    // Class with just some static utility methods, should not be instantiated
  }finally{__CLR4_4_126t26tlck0y8iw.R.flushNeeded();}}
}
