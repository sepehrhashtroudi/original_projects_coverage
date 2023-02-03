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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Contains static utility methods pertaining to primitive types and their
 * corresponding wrapper types.
 *
 * @author Kevin Bourrillion
 */
final class Primitives {public static class __CLR4_4_11xd1xdlck0y8h7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,2532,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Primitives() {try{__CLR4_4_11xd1xdlck0y8h7.R.inc(2497);}finally{__CLR4_4_11xd1xdlck0y8h7.R.flushNeeded();}}

  /** A map from primitive types to their corresponding wrapper types. */
  public static final Map<Class<?>, Class<?>> PRIMITIVE_TO_WRAPPER_TYPE;

  /** A map from wrapper types to their corresponding primitive types. */
  public static final Map<Class<?>, Class<?>> WRAPPER_TO_PRIMITIVE_TYPE;

  // Sad that we can't use a BiMap. :(
  
  static {try{__CLR4_4_11xd1xdlck0y8h7.R.inc(2498);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2499);Map<Class<?>, Class<?>> primToWrap = new HashMap<Class<?>, Class<?>>(16);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2500);Map<Class<?>, Class<?>> wrapToPrim = new HashMap<Class<?>, Class<?>>(16);

    __CLR4_4_11xd1xdlck0y8h7.R.inc(2501);add(primToWrap, wrapToPrim, boolean.class, Boolean.class);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2502);add(primToWrap, wrapToPrim, byte.class, Byte.class);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2503);add(primToWrap, wrapToPrim, char.class, Character.class);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2504);add(primToWrap, wrapToPrim, double.class, Double.class);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2505);add(primToWrap, wrapToPrim, float.class, Float.class);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2506);add(primToWrap, wrapToPrim, int.class, Integer.class);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2507);add(primToWrap, wrapToPrim, long.class, Long.class);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2508);add(primToWrap, wrapToPrim, short.class, Short.class);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2509);add(primToWrap, wrapToPrim, void.class, Void.class);

    __CLR4_4_11xd1xdlck0y8h7.R.inc(2510);PRIMITIVE_TO_WRAPPER_TYPE = Collections.unmodifiableMap(primToWrap);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2511);WRAPPER_TO_PRIMITIVE_TYPE = Collections.unmodifiableMap(wrapToPrim);
  }finally{__CLR4_4_11xd1xdlck0y8h7.R.flushNeeded();}}

  private static void add(Map<Class<?>, Class<?>> forward,
      Map<Class<?>, Class<?>> backward, Class<?> key, Class<?> value) {try{__CLR4_4_11xd1xdlck0y8h7.R.inc(2512);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2513);forward.put(key, value);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2514);backward.put(value, key);
  }finally{__CLR4_4_11xd1xdlck0y8h7.R.flushNeeded();}}

  /**
   * Returns {@code true} if {@code type} is one of the nine
   * primitive-wrapper types, such as {@link Integer}.
   *
   * @see Class#isPrimitive
   */
  public static boolean isWrapperType(Class<?> type) {try{__CLR4_4_11xd1xdlck0y8h7.R.inc(2515);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2516);return WRAPPER_TO_PRIMITIVE_TYPE.containsKey(checkNotNull(type));
  }finally{__CLR4_4_11xd1xdlck0y8h7.R.flushNeeded();}}

  private static Class<?> checkNotNull(Class<?> type) {try{__CLR4_4_11xd1xdlck0y8h7.R.inc(2517);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2518);Preconditions.checkNotNull(type);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2519);return type;
  }finally{__CLR4_4_11xd1xdlck0y8h7.R.flushNeeded();}}

  /**
   * Returns the corresponding wrapper type of {@code type} if it is a primitive
   * type; otherwise returns {@code type} itself. Idempotent.
   * <pre>
   *     wrap(int.class) == Integer.class
   *     wrap(Integer.class) == Integer.class
   *     wrap(String.class) == String.class
   * </pre>
   */
  public static <T> Class<T> wrap(Class<T> type) {try{__CLR4_4_11xd1xdlck0y8h7.R.inc(2520);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2521);checkNotNull(type);

    // cast is safe: long.class and Long.class are both of type Class<Long>
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2522);@SuppressWarnings("unchecked")
    Class<T> wrapped = (Class<T>) PRIMITIVE_TO_WRAPPER_TYPE.get(type);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2523);return ((((wrapped == null) )&&(__CLR4_4_11xd1xdlck0y8h7.R.iget(2524)!=0|true))||(__CLR4_4_11xd1xdlck0y8h7.R.iget(2525)==0&false))? type : wrapped;
  }finally{__CLR4_4_11xd1xdlck0y8h7.R.flushNeeded();}}

  /**
   * Returns the corresponding primitive type of {@code type} if it is a
   * wrapper type; otherwise returns {@code type} itself. Idempotent.
   * <pre>
   *     unwrap(Integer.class) == int.class
   *     unwrap(int.class) == int.class
   *     unwrap(String.class) == String.class
   * </pre>
   */
  public static <T> Class<T> unwrap(Class<T> type) {try{__CLR4_4_11xd1xdlck0y8h7.R.inc(2526);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2527);checkNotNull(type);

    // cast is safe: long.class and Long.class are both of type Class<Long>
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2528);@SuppressWarnings("unchecked")
    Class<T> unwrapped = (Class<T>) WRAPPER_TO_PRIMITIVE_TYPE.get(type);
    __CLR4_4_11xd1xdlck0y8h7.R.inc(2529);return ((((unwrapped == null) )&&(__CLR4_4_11xd1xdlck0y8h7.R.iget(2530)!=0|true))||(__CLR4_4_11xd1xdlck0y8h7.R.iget(2531)==0&false))? type : unwrapped;
  }finally{__CLR4_4_11xd1xdlck0y8h7.R.flushNeeded();}}  
}
