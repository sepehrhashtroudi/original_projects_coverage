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

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/**
 * Provides ability to apply a visitor to an object and all of its fields
 * recursively.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
final class ObjectNavigator {public static class __CLR4_4_11n01n0lck0y8ft{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,2192,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public interface Visitor {
    public void start(ObjectTypePair node);

    public void end(ObjectTypePair node);

    /**
     * This is called before the object navigator starts visiting the current
     * object
     */
    void startVisitingObject(Object node);

    /**
     * This is called to visit the current object if it is an array
     */
    void visitArray(Object array, Type componentType);

    /**
     * This is called to visit an object field of the current object
     */
    void visitObjectField(FieldAttributes f, Type typeOfF, Object obj);

    /**
     * This is called to visit an array field of the current object
     */
    void visitArrayField(FieldAttributes f, Type typeOfF, Object obj);

    /**
     * This is called to visit an object using a custom handler
     * 
     * @return true if a custom handler exists, false otherwise
     */
    public boolean visitUsingCustomHandler(ObjectTypePair objTypePair);

    /**
     * This is called to visit a field of the current object using a custom
     * handler
     */
    public boolean visitFieldUsingCustomHandler(FieldAttributes f, Type actualTypeOfField,
        Object parent);

    /**
     * Retrieve the current target
     */
    Object getTarget();

    void visitPrimitive(Object primitive);
  }

  private final ExclusionStrategy exclusionStrategy;
  private final ObjectTypePair objTypePair;

  /**
   * @param objTypePair
   *          The object,type (fully genericized) being navigated
   * @param exclusionStrategy
   *          the concrete strategy object to be used to filter out fields of an
   *          object.
   */
  ObjectNavigator(ObjectTypePair objTypePair, ExclusionStrategy exclusionStrategy) {try{__CLR4_4_11n01n0lck0y8ft.R.inc(2124);
    __CLR4_4_11n01n0lck0y8ft.R.inc(2125);Preconditions.checkNotNull(exclusionStrategy);

    __CLR4_4_11n01n0lck0y8ft.R.inc(2126);this.objTypePair = objTypePair;
    __CLR4_4_11n01n0lck0y8ft.R.inc(2127);this.exclusionStrategy = exclusionStrategy;
  }finally{__CLR4_4_11n01n0lck0y8ft.R.flushNeeded();}}

  /**
   * Navigate all the fields of the specified object. If a field is null, it
   * does not get visited.
   */
  public void accept(Visitor visitor) {try{__CLR4_4_11n01n0lck0y8ft.R.inc(2128);
    __CLR4_4_11n01n0lck0y8ft.R.inc(2129);TypeInfo objTypeInfo = new TypeInfo(objTypePair.type);
    __CLR4_4_11n01n0lck0y8ft.R.inc(2130);if ((((exclusionStrategy.shouldSkipClass(objTypeInfo.getRawClass()))&&(__CLR4_4_11n01n0lck0y8ft.R.iget(2131)!=0|true))||(__CLR4_4_11n01n0lck0y8ft.R.iget(2132)==0&false))) {{
      __CLR4_4_11n01n0lck0y8ft.R.inc(2133);return;
    }
    }__CLR4_4_11n01n0lck0y8ft.R.inc(2134);boolean visitedWithCustomHandler = visitor.visitUsingCustomHandler(objTypePair);
    __CLR4_4_11n01n0lck0y8ft.R.inc(2135);if ((((!visitedWithCustomHandler)&&(__CLR4_4_11n01n0lck0y8ft.R.iget(2136)!=0|true))||(__CLR4_4_11n01n0lck0y8ft.R.iget(2137)==0&false))) {{
      __CLR4_4_11n01n0lck0y8ft.R.inc(2138);Object obj = objTypePair.getObject();
      __CLR4_4_11n01n0lck0y8ft.R.inc(2139);Object objectToVisit = ((((obj == null) )&&(__CLR4_4_11n01n0lck0y8ft.R.iget(2140)!=0|true))||(__CLR4_4_11n01n0lck0y8ft.R.iget(2141)==0&false))? visitor.getTarget() : obj;
      __CLR4_4_11n01n0lck0y8ft.R.inc(2142);if ((((objectToVisit == null)&&(__CLR4_4_11n01n0lck0y8ft.R.iget(2143)!=0|true))||(__CLR4_4_11n01n0lck0y8ft.R.iget(2144)==0&false))) {{
        __CLR4_4_11n01n0lck0y8ft.R.inc(2145);return;
      }
      }__CLR4_4_11n01n0lck0y8ft.R.inc(2146);objTypePair.setObject(objectToVisit);
      __CLR4_4_11n01n0lck0y8ft.R.inc(2147);visitor.start(objTypePair);
      __CLR4_4_11n01n0lck0y8ft.R.inc(2148);try {
        __CLR4_4_11n01n0lck0y8ft.R.inc(2149);if ((((objTypeInfo.isArray())&&(__CLR4_4_11n01n0lck0y8ft.R.iget(2150)!=0|true))||(__CLR4_4_11n01n0lck0y8ft.R.iget(2151)==0&false))) {{
          __CLR4_4_11n01n0lck0y8ft.R.inc(2152);visitor.visitArray(objectToVisit, objTypePair.type);
        } }else {__CLR4_4_11n01n0lck0y8ft.R.inc(2153);if ((((objTypeInfo.getActualType() == Object.class
            && isPrimitiveOrString(objectToVisit))&&(__CLR4_4_11n01n0lck0y8ft.R.iget(2154)!=0|true))||(__CLR4_4_11n01n0lck0y8ft.R.iget(2155)==0&false))) {{
          // TODO(Joel): this is only used for deserialization of "primitives"
          // we should rethink this!!!
          __CLR4_4_11n01n0lck0y8ft.R.inc(2156);visitor.visitPrimitive(objectToVisit);
          __CLR4_4_11n01n0lck0y8ft.R.inc(2157);objectToVisit = visitor.getTarget();
        } }else {{
          __CLR4_4_11n01n0lck0y8ft.R.inc(2158);visitor.startVisitingObject(objectToVisit);
          __CLR4_4_11n01n0lck0y8ft.R.inc(2159);ObjectTypePair currObjTypePair = objTypePair.toMoreSpecificType();
          __CLR4_4_11n01n0lck0y8ft.R.inc(2160);Class<?> topLevelClass = new TypeInfo(currObjTypePair.type).getRawClass();
          __CLR4_4_11n01n0lck0y8ft.R.inc(2161);for (Class<?> curr = topLevelClass; (((curr != null && !curr.equals(Object.class))&&(__CLR4_4_11n01n0lck0y8ft.R.iget(2162)!=0|true))||(__CLR4_4_11n01n0lck0y8ft.R.iget(2163)==0&false)); curr =
              curr.getSuperclass()) {{
            __CLR4_4_11n01n0lck0y8ft.R.inc(2164);if ((((!curr.isSynthetic())&&(__CLR4_4_11n01n0lck0y8ft.R.iget(2165)!=0|true))||(__CLR4_4_11n01n0lck0y8ft.R.iget(2166)==0&false))) {{
              __CLR4_4_11n01n0lck0y8ft.R.inc(2167);navigateClassFields(objectToVisit, curr, visitor);
            }
          }}
        }}
      }}} finally {
        __CLR4_4_11n01n0lck0y8ft.R.inc(2168);visitor.end(objTypePair);
      }
    }
  }}finally{__CLR4_4_11n01n0lck0y8ft.R.flushNeeded();}}

  private boolean isPrimitiveOrString(Object objectToVisit) {try{__CLR4_4_11n01n0lck0y8ft.R.inc(2169);
    __CLR4_4_11n01n0lck0y8ft.R.inc(2170);Class<?> realClazz = objectToVisit.getClass();
    __CLR4_4_11n01n0lck0y8ft.R.inc(2171);return realClazz == Object.class || realClazz == String.class
        || Primitives.unwrap(realClazz).isPrimitive();
  }finally{__CLR4_4_11n01n0lck0y8ft.R.flushNeeded();}}

  private void navigateClassFields(Object obj, Class<?> clazz, Visitor visitor) {try{__CLR4_4_11n01n0lck0y8ft.R.inc(2172);
    __CLR4_4_11n01n0lck0y8ft.R.inc(2173);Field[] fields = clazz.getDeclaredFields();
    __CLR4_4_11n01n0lck0y8ft.R.inc(2174);AccessibleObject.setAccessible(fields, true);
    __CLR4_4_11n01n0lck0y8ft.R.inc(2175);for (Field f : fields) {{
      __CLR4_4_11n01n0lck0y8ft.R.inc(2176);FieldAttributes fieldAttributes = new FieldAttributes(clazz, f);
      __CLR4_4_11n01n0lck0y8ft.R.inc(2177);if ((((exclusionStrategy.shouldSkipField(fieldAttributes)
          || exclusionStrategy.shouldSkipClass(fieldAttributes.getDeclaredClass()))&&(__CLR4_4_11n01n0lck0y8ft.R.iget(2178)!=0|true))||(__CLR4_4_11n01n0lck0y8ft.R.iget(2179)==0&false))) {{
        __CLR4_4_11n01n0lck0y8ft.R.inc(2180);continue; // skip
      }
      }__CLR4_4_11n01n0lck0y8ft.R.inc(2181);TypeInfo fieldTypeInfo = TypeInfoFactory.getTypeInfoForField(f, objTypePair.type);
      __CLR4_4_11n01n0lck0y8ft.R.inc(2182);Type declaredTypeOfField = fieldTypeInfo.getActualType();
      __CLR4_4_11n01n0lck0y8ft.R.inc(2183);boolean visitedWithCustomHandler =
        visitor.visitFieldUsingCustomHandler(fieldAttributes, declaredTypeOfField, obj);
      __CLR4_4_11n01n0lck0y8ft.R.inc(2184);if ((((!visitedWithCustomHandler)&&(__CLR4_4_11n01n0lck0y8ft.R.iget(2185)!=0|true))||(__CLR4_4_11n01n0lck0y8ft.R.iget(2186)==0&false))) {{
        __CLR4_4_11n01n0lck0y8ft.R.inc(2187);if ((((fieldTypeInfo.isArray())&&(__CLR4_4_11n01n0lck0y8ft.R.iget(2188)!=0|true))||(__CLR4_4_11n01n0lck0y8ft.R.iget(2189)==0&false))) {{
          __CLR4_4_11n01n0lck0y8ft.R.inc(2190);visitor.visitArrayField(fieldAttributes, declaredTypeOfField, obj);
        } }else {{
          __CLR4_4_11n01n0lck0y8ft.R.inc(2191);visitor.visitObjectField(fieldAttributes, declaredTypeOfField, obj);
        }
      }}
    }}
  }}finally{__CLR4_4_11n01n0lck0y8ft.R.flushNeeded();}}
}
