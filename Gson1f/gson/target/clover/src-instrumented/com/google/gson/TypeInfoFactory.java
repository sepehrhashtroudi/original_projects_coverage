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

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/**
 * A static factory class used to construct the "TypeInfo" objects.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
final class TypeInfoFactory {public static class __CLR4_4_1230230lck0y8ij{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,2818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private TypeInfoFactory() {try{__CLR4_4_1230230lck0y8ij.R.inc(2700);
    // Not instantiable since it provides factory methods only.
  }finally{__CLR4_4_1230230lck0y8ij.R.flushNeeded();}}

  public static TypeInfoArray getTypeInfoForArray(Type type) {try{__CLR4_4_1230230lck0y8ij.R.inc(2701);
    __CLR4_4_1230230lck0y8ij.R.inc(2702);Preconditions.checkArgument(TypeUtils.isArray(type));
    __CLR4_4_1230230lck0y8ij.R.inc(2703);return new TypeInfoArray(type);
  }finally{__CLR4_4_1230230lck0y8ij.R.flushNeeded();}}

  /**
   * Evaluates the "actual" type for the field.  If the field is a "TypeVariable" or has a
   * "TypeVariable" in a parameterized type then it evaluates the real type.
   *
   * @param f the actual field object to retrieve the type from
   * @param typeDefiningF the type that contains the field {@code f}
   * @return the type information for the field
   */
  public static TypeInfo getTypeInfoForField(Field f, Type typeDefiningF) {try{__CLR4_4_1230230lck0y8ij.R.inc(2704);
    __CLR4_4_1230230lck0y8ij.R.inc(2705);Class<?> classDefiningF = TypeUtils.toRawClass(typeDefiningF);
    __CLR4_4_1230230lck0y8ij.R.inc(2706);Type type = f.getGenericType();
    __CLR4_4_1230230lck0y8ij.R.inc(2707);Type actualType = getActualType(type, typeDefiningF, classDefiningF);
    __CLR4_4_1230230lck0y8ij.R.inc(2708);return new TypeInfo(actualType);
  }finally{__CLR4_4_1230230lck0y8ij.R.flushNeeded();}}

  private static Type getActualType(
      Type typeToEvaluate, Type parentType, Class<?> rawParentClass) {try{__CLR4_4_1230230lck0y8ij.R.inc(2709);
    __CLR4_4_1230230lck0y8ij.R.inc(2710);if ((((typeToEvaluate instanceof Class<?>)&&(__CLR4_4_1230230lck0y8ij.R.iget(2711)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2712)==0&false))) {{
      __CLR4_4_1230230lck0y8ij.R.inc(2713);return typeToEvaluate;
    } }else {__CLR4_4_1230230lck0y8ij.R.inc(2714);if ((((typeToEvaluate instanceof ParameterizedType)&&(__CLR4_4_1230230lck0y8ij.R.iget(2715)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2716)==0&false))) {{
      __CLR4_4_1230230lck0y8ij.R.inc(2717);ParameterizedType castedType = (ParameterizedType) typeToEvaluate;
      __CLR4_4_1230230lck0y8ij.R.inc(2718);Type owner = castedType.getOwnerType();
      __CLR4_4_1230230lck0y8ij.R.inc(2719);Type[] actualTypeParameters =
          extractRealTypes(castedType.getActualTypeArguments(), parentType, rawParentClass);
      __CLR4_4_1230230lck0y8ij.R.inc(2720);Type rawType = castedType.getRawType();
      __CLR4_4_1230230lck0y8ij.R.inc(2721);return new ParameterizedTypeImpl(rawType, actualTypeParameters, owner);
    } }else {__CLR4_4_1230230lck0y8ij.R.inc(2722);if ((((typeToEvaluate instanceof GenericArrayType)&&(__CLR4_4_1230230lck0y8ij.R.iget(2723)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2724)==0&false))) {{
      __CLR4_4_1230230lck0y8ij.R.inc(2725);GenericArrayType castedType = (GenericArrayType) typeToEvaluate;
      __CLR4_4_1230230lck0y8ij.R.inc(2726);Type componentType = castedType.getGenericComponentType();
      __CLR4_4_1230230lck0y8ij.R.inc(2727);Type actualType = getActualType(componentType, parentType, rawParentClass);
      __CLR4_4_1230230lck0y8ij.R.inc(2728);if ((((componentType.equals(actualType))&&(__CLR4_4_1230230lck0y8ij.R.iget(2729)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2730)==0&false))) {{
        __CLR4_4_1230230lck0y8ij.R.inc(2731);return castedType;
      }
      }__CLR4_4_1230230lck0y8ij.R.inc(2732);return (((actualType instanceof Class<?> )&&(__CLR4_4_1230230lck0y8ij.R.iget(2733)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2734)==0&false))?
          TypeUtils.wrapWithArray(TypeUtils.toRawClass(actualType))
          : new GenericArrayTypeImpl(actualType);
    } }else {__CLR4_4_1230230lck0y8ij.R.inc(2735);if ((((typeToEvaluate instanceof TypeVariable<?>)&&(__CLR4_4_1230230lck0y8ij.R.iget(2736)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2737)==0&false))) {{
      __CLR4_4_1230230lck0y8ij.R.inc(2738);if ((((parentType instanceof ParameterizedType)&&(__CLR4_4_1230230lck0y8ij.R.iget(2739)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2740)==0&false))) {{
        // The class definition has the actual types used for the type variables.
        // Find the matching actual type for the Type Variable used for the field.
        // For example, class Foo<A> { A a; }
        // new Foo<Integer>(); defines the actual type of A to be Integer.
        // So, to find the type of the field a, we will have to look at the class'
        // actual type arguments.
        __CLR4_4_1230230lck0y8ij.R.inc(2741);TypeVariable<?> fieldTypeVariable = (TypeVariable<?>) typeToEvaluate;
        __CLR4_4_1230230lck0y8ij.R.inc(2742);TypeVariable<?>[] classTypeVariables = rawParentClass.getTypeParameters();
        __CLR4_4_1230230lck0y8ij.R.inc(2743);ParameterizedType objParameterizedType = (ParameterizedType) parentType;
        __CLR4_4_1230230lck0y8ij.R.inc(2744);int indexOfActualTypeArgument = getIndex(classTypeVariables, fieldTypeVariable);
        __CLR4_4_1230230lck0y8ij.R.inc(2745);Type[] actualTypeArguments = objParameterizedType.getActualTypeArguments();
        __CLR4_4_1230230lck0y8ij.R.inc(2746);return actualTypeArguments[indexOfActualTypeArgument];
      } }else {__CLR4_4_1230230lck0y8ij.R.inc(2747);if ((((typeToEvaluate instanceof TypeVariable<?>)&&(__CLR4_4_1230230lck0y8ij.R.iget(2748)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2749)==0&false))) {{
        __CLR4_4_1230230lck0y8ij.R.inc(2750);Type theSearchedType = null;

        __CLR4_4_1230230lck0y8ij.R.inc(2751);do {{
          __CLR4_4_1230230lck0y8ij.R.inc(2752);theSearchedType = extractTypeForHierarchy(parentType, (TypeVariable<?>) typeToEvaluate);
        } }while (((((theSearchedType != null) && (theSearchedType instanceof TypeVariable<?>))&&(__CLR4_4_1230230lck0y8ij.R.iget(2753)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2754)==0&false)));

        __CLR4_4_1230230lck0y8ij.R.inc(2755);if ((((theSearchedType != null)&&(__CLR4_4_1230230lck0y8ij.R.iget(2756)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2757)==0&false))) {{
          __CLR4_4_1230230lck0y8ij.R.inc(2758);return theSearchedType;
        }
      }}

      }}__CLR4_4_1230230lck0y8ij.R.inc(2759);throw new UnsupportedOperationException("Expecting parameterized type, got " + parentType
          + ".\n Are you missing the use of TypeToken idiom?\n See "
          + "http://sites.google.com/site/gson/gson-user-guide#TOC-Serializing-and-Deserializing-Gener");
    } }else {__CLR4_4_1230230lck0y8ij.R.inc(2760);if ((((typeToEvaluate instanceof WildcardType)&&(__CLR4_4_1230230lck0y8ij.R.iget(2761)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2762)==0&false))) {{
      __CLR4_4_1230230lck0y8ij.R.inc(2763);WildcardType castedType = (WildcardType) typeToEvaluate;
      __CLR4_4_1230230lck0y8ij.R.inc(2764);return getActualType(castedType.getUpperBounds()[0], parentType, rawParentClass);
    } }else {{
      __CLR4_4_1230230lck0y8ij.R.inc(2765);throw new IllegalArgumentException("Type \'" + typeToEvaluate + "\' is not a Class, "
          + "ParameterizedType, GenericArrayType or TypeVariable. Can't extract type.");
    }
  }}}}}}finally{__CLR4_4_1230230lck0y8ij.R.flushNeeded();}}

  private static Type extractTypeForHierarchy(Type parentType, TypeVariable<?> typeToEvaluate) {try{__CLR4_4_1230230lck0y8ij.R.inc(2766);
    __CLR4_4_1230230lck0y8ij.R.inc(2767);Class<?> rawParentType = null;
    __CLR4_4_1230230lck0y8ij.R.inc(2768);if ((((parentType instanceof Class<?>)&&(__CLR4_4_1230230lck0y8ij.R.iget(2769)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2770)==0&false))) {{
      __CLR4_4_1230230lck0y8ij.R.inc(2771);rawParentType = (Class<?>) parentType;
    } }else {__CLR4_4_1230230lck0y8ij.R.inc(2772);if ((((parentType instanceof ParameterizedType)&&(__CLR4_4_1230230lck0y8ij.R.iget(2773)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2774)==0&false))) {{
      __CLR4_4_1230230lck0y8ij.R.inc(2775);ParameterizedType parentTypeAsPT = (ParameterizedType) parentType;
      __CLR4_4_1230230lck0y8ij.R.inc(2776);rawParentType = (Class<?>) parentTypeAsPT.getRawType();
    } }else {{
      __CLR4_4_1230230lck0y8ij.R.inc(2777);return null;
    }

    }}__CLR4_4_1230230lck0y8ij.R.inc(2778);Type superClass = rawParentType.getGenericSuperclass();
    __CLR4_4_1230230lck0y8ij.R.inc(2779);if ((((superClass instanceof ParameterizedType
        && ((ParameterizedType) superClass).getRawType() == typeToEvaluate.getGenericDeclaration())&&(__CLR4_4_1230230lck0y8ij.R.iget(2780)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2781)==0&false))) {{
      // Evaluate type on this type
      __CLR4_4_1230230lck0y8ij.R.inc(2782);TypeVariable<?>[] classTypeVariables =
          ((Class<?>) ((ParameterizedType) superClass).getRawType()).getTypeParameters();
      __CLR4_4_1230230lck0y8ij.R.inc(2783);int indexOfActualTypeArgument = getIndex(classTypeVariables, typeToEvaluate);

      __CLR4_4_1230230lck0y8ij.R.inc(2784);Type[] actualTypeArguments = null;
      __CLR4_4_1230230lck0y8ij.R.inc(2785);if ((((parentType instanceof Class<?>)&&(__CLR4_4_1230230lck0y8ij.R.iget(2786)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2787)==0&false))) {{
        __CLR4_4_1230230lck0y8ij.R.inc(2788);actualTypeArguments = ((ParameterizedType) superClass).getActualTypeArguments();
      } }else {__CLR4_4_1230230lck0y8ij.R.inc(2789);if ((((parentType instanceof ParameterizedType)&&(__CLR4_4_1230230lck0y8ij.R.iget(2790)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2791)==0&false))) {{
        __CLR4_4_1230230lck0y8ij.R.inc(2792);actualTypeArguments = ((ParameterizedType) parentType).getActualTypeArguments();
      } }else {{
        __CLR4_4_1230230lck0y8ij.R.inc(2793);return null;
      }

      }}__CLR4_4_1230230lck0y8ij.R.inc(2794);return actualTypeArguments[indexOfActualTypeArgument];
    }

    }__CLR4_4_1230230lck0y8ij.R.inc(2795);Type searchedType = null;
    __CLR4_4_1230230lck0y8ij.R.inc(2796);if ((((superClass != null)&&(__CLR4_4_1230230lck0y8ij.R.iget(2797)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2798)==0&false))) {{
      __CLR4_4_1230230lck0y8ij.R.inc(2799);searchedType = extractTypeForHierarchy(superClass, typeToEvaluate);
    }
    }__CLR4_4_1230230lck0y8ij.R.inc(2800);return searchedType;
  }finally{__CLR4_4_1230230lck0y8ij.R.flushNeeded();}}

  private static Type[] extractRealTypes(
      Type[] actualTypeArguments, Type parentType, Class<?> rawParentClass) {try{__CLR4_4_1230230lck0y8ij.R.inc(2801);
    __CLR4_4_1230230lck0y8ij.R.inc(2802);Preconditions.checkNotNull(actualTypeArguments);

    __CLR4_4_1230230lck0y8ij.R.inc(2803);Type[] retTypes = new Type[actualTypeArguments.length];
    __CLR4_4_1230230lck0y8ij.R.inc(2804);for (int i = 0; (((i < actualTypeArguments.length)&&(__CLR4_4_1230230lck0y8ij.R.iget(2805)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2806)==0&false)); ++i) {{
      __CLR4_4_1230230lck0y8ij.R.inc(2807);retTypes[i] = getActualType(actualTypeArguments[i], parentType, rawParentClass);
    }
    }__CLR4_4_1230230lck0y8ij.R.inc(2808);return retTypes;
  }finally{__CLR4_4_1230230lck0y8ij.R.flushNeeded();}}

  private static int getIndex(TypeVariable<?>[] types, TypeVariable<?> type) {try{__CLR4_4_1230230lck0y8ij.R.inc(2809);
    __CLR4_4_1230230lck0y8ij.R.inc(2810);for (int i = 0; (((i < types.length)&&(__CLR4_4_1230230lck0y8ij.R.iget(2811)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2812)==0&false)); ++i) {{
      __CLR4_4_1230230lck0y8ij.R.inc(2813);if ((((type.equals(types[i]))&&(__CLR4_4_1230230lck0y8ij.R.iget(2814)!=0|true))||(__CLR4_4_1230230lck0y8ij.R.iget(2815)==0&false))) {{
        __CLR4_4_1230230lck0y8ij.R.inc(2816);return i;
      }
    }}
    }__CLR4_4_1230230lck0y8ij.R.inc(2817);throw new IllegalStateException(
        "How can the type variable not be present in the class declaration!");
  }finally{__CLR4_4_1230230lck0y8ij.R.flushNeeded();}}
}
