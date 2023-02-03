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
import java.util.Arrays;

/**
 * An immutable implementation of the {@link ParameterizedType} interface.  This object allows
 * us to build a reflective {@link Type} objects on demand.  This object is used to support
 * serialization and deserialization of classes with an {@code ParameterizedType} field where
 * as least one of the actual type parameters is a {@code TypeVariable}.
 *
 * <p>Here's an example class:
 * <pre>
 * class Foo<T> {
 *   private List<T> someList;
 *
 *   Foo(List<T> list) {
 *     this.someList = list;
 *   }
 * }
 * </pre>
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
final class ParameterizedTypeImpl implements ParameterizedType {public static class __CLR4_4_11w41w4lck0y8gw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,2485,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private final Type rawType;
  private final Type[] actualTypeArguments;
  private final Type owner;

  public ParameterizedTypeImpl(Type rawType, Type[] actualTypeArguments, Type owner) {try{__CLR4_4_11w41w4lck0y8gw.R.inc(2452);
    __CLR4_4_11w41w4lck0y8gw.R.inc(2453);this.rawType = rawType;
    __CLR4_4_11w41w4lck0y8gw.R.inc(2454);this.actualTypeArguments = actualTypeArguments;
    __CLR4_4_11w41w4lck0y8gw.R.inc(2455);this.owner = owner;
  }finally{__CLR4_4_11w41w4lck0y8gw.R.flushNeeded();}}

  public Type getRawType() {try{__CLR4_4_11w41w4lck0y8gw.R.inc(2456);
    __CLR4_4_11w41w4lck0y8gw.R.inc(2457);return rawType;
  }finally{__CLR4_4_11w41w4lck0y8gw.R.flushNeeded();}}

  public Type[] getActualTypeArguments() {try{__CLR4_4_11w41w4lck0y8gw.R.inc(2458);
    __CLR4_4_11w41w4lck0y8gw.R.inc(2459);return actualTypeArguments;
  }finally{__CLR4_4_11w41w4lck0y8gw.R.flushNeeded();}}

  public Type getOwnerType() {try{__CLR4_4_11w41w4lck0y8gw.R.inc(2460);
    __CLR4_4_11w41w4lck0y8gw.R.inc(2461);return owner;
  }finally{__CLR4_4_11w41w4lck0y8gw.R.flushNeeded();}}

  @Override
  public boolean equals(Object o) {try{__CLR4_4_11w41w4lck0y8gw.R.inc(2462);
    __CLR4_4_11w41w4lck0y8gw.R.inc(2463);if ((((!(o instanceof  ParameterizedType))&&(__CLR4_4_11w41w4lck0y8gw.R.iget(2464)!=0|true))||(__CLR4_4_11w41w4lck0y8gw.R.iget(2465)==0&false))) {{
      __CLR4_4_11w41w4lck0y8gw.R.inc(2466);return false;
    }
    // Check that information is equivalent
    }__CLR4_4_11w41w4lck0y8gw.R.inc(2467);ParameterizedType that = (ParameterizedType) o;
    __CLR4_4_11w41w4lck0y8gw.R.inc(2468);if ((((this  == that)&&(__CLR4_4_11w41w4lck0y8gw.R.iget(2469)!=0|true))||(__CLR4_4_11w41w4lck0y8gw.R.iget(2470)==0&false))) {{
      __CLR4_4_11w41w4lck0y8gw.R.inc(2471);return true;
    }
    }__CLR4_4_11w41w4lck0y8gw.R.inc(2472);Type thatOwner = that.getOwnerType();
    __CLR4_4_11w41w4lck0y8gw.R.inc(2473);Type thatRawType = that.getRawType();

    __CLR4_4_11w41w4lck0y8gw.R.inc(2474);return ((((owner == null )&&(__CLR4_4_11w41w4lck0y8gw.R.iget(2475)!=0|true))||(__CLR4_4_11w41w4lck0y8gw.R.iget(2476)==0&false))? thatOwner == null : owner.equals(thatOwner))
      && ((((rawType == null )&&(__CLR4_4_11w41w4lck0y8gw.R.iget(2477)!=0|true))||(__CLR4_4_11w41w4lck0y8gw.R.iget(2478)==0&false))? thatRawType == null : rawType.equals(thatRawType))
      && Arrays.equals(actualTypeArguments, that.getActualTypeArguments());
  }finally{__CLR4_4_11w41w4lck0y8gw.R.flushNeeded();}}

  @Override
  public int hashCode() {try{__CLR4_4_11w41w4lck0y8gw.R.inc(2479);
    __CLR4_4_11w41w4lck0y8gw.R.inc(2480);return Arrays.hashCode(actualTypeArguments)
        ^ ((((owner == null )&&(__CLR4_4_11w41w4lck0y8gw.R.iget(2481)!=0|true))||(__CLR4_4_11w41w4lck0y8gw.R.iget(2482)==0&false))? 0 : owner.hashCode())
        ^ ((((rawType == null )&&(__CLR4_4_11w41w4lck0y8gw.R.iget(2483)!=0|true))||(__CLR4_4_11w41w4lck0y8gw.R.iget(2484)==0&false))? 0 : rawType.hashCode());
  }finally{__CLR4_4_11w41w4lck0y8gw.R.flushNeeded();}}
}
