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

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/**
 * Class to extract information about types used to define a generic array.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
final class TypeInfoArray extends TypeInfo {public static class __CLR4_4_1229229lck0y8i2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,2690,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private final Class<?> componentRawType;
  private final Type secondLevel;

  TypeInfoArray(Type type) {
    super(type);__CLR4_4_1229229lck0y8i2.R.inc(2674);try{__CLR4_4_1229229lck0y8i2.R.inc(2673);
    __CLR4_4_1229229lck0y8i2.R.inc(2675);Class<?> rootComponentType = rawClass;
    __CLR4_4_1229229lck0y8i2.R.inc(2676);while ((((rootComponentType.isArray())&&(__CLR4_4_1229229lck0y8i2.R.iget(2677)!=0|true))||(__CLR4_4_1229229lck0y8i2.R.iget(2678)==0&false))) {{
      __CLR4_4_1229229lck0y8i2.R.inc(2679);rootComponentType = rootComponentType.getComponentType();
    }
    }__CLR4_4_1229229lck0y8i2.R.inc(2680);this.componentRawType = rootComponentType;
    __CLR4_4_1229229lck0y8i2.R.inc(2681);this.secondLevel = extractSecondLevelType(actualType, rawClass);
  }finally{__CLR4_4_1229229lck0y8i2.R.flushNeeded();}}

  private static Type extractSecondLevelType(Type actualType, Class<?> rawClass) {try{__CLR4_4_1229229lck0y8i2.R.inc(2682);
    __CLR4_4_1229229lck0y8i2.R.inc(2683);return (((actualType instanceof GenericArrayType )&&(__CLR4_4_1229229lck0y8i2.R.iget(2684)!=0|true))||(__CLR4_4_1229229lck0y8i2.R.iget(2685)==0&false))?
        ((GenericArrayType) actualType).getGenericComponentType() : rawClass.getComponentType();
  }finally{__CLR4_4_1229229lck0y8i2.R.flushNeeded();}}

  /**
   * @return the raw type unwrapped of the second level of array.
   * If the object is (single-dimensional or multi-dimensional) array, it is the class of the
   * elements of the array. For example, this method returns Foo.class for Foo[].
   * It will return Foo[].class for Foo[][].  For Foo&lt;String&gt;[][] types, it will return the 
   * type representing Foo&lt;String&gt;[] 
   * (i.e. <code>new TypeToken<Foo<String>[]>() {}.getType()</code>).
   */
  public Type getSecondLevelType() {try{__CLR4_4_1229229lck0y8i2.R.inc(2686);
    __CLR4_4_1229229lck0y8i2.R.inc(2687);return secondLevel;
  }finally{__CLR4_4_1229229lck0y8i2.R.flushNeeded();}}

  /**
   * @return the raw type of the root component.
   * If the object is a single-dimensional array then the component type is the class of an
   * element of the array.
   * If the object is a multi-dimensional array then the component type is the class of the
   * inner-most array element. For example, the This method will return Foo.class for Foo[][][].
   */
  public Class<?> getComponentRawType() {try{__CLR4_4_1229229lck0y8i2.R.inc(2688);
    __CLR4_4_1229229lck0y8i2.R.inc(2689);return componentRawType;
  }finally{__CLR4_4_1229229lck0y8i2.R.flushNeeded();}}
}
