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

package com.google.gson.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents a generic type {@code T}.
 *
 * You can use this class to get the generic type for a class. For example,
 * to get the generic type for <code>Collection&lt;Foo&gt;</code>, you can use:
 * <p>
 * <code>Type typeOfCollectionOfFoo = new TypeToken&lt;Collection&lt;Foo&gt;&gt;(){}.getType()
 * </code>
 * 
 * <p>Assumes {@code Type} implements {@code equals()} and {@code hashCode()}
 * as a value (as opposed to identity) comparison.
 *
 * Also implements {@link #isAssignableFrom(Type)} to check type-safe
 * assignability.
 *
 * @author Bob Lee
 * @author Sven Mawson
 */
public abstract class TypeToken<T> {public static class __CLR4_4_1294294lck0y8k0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,3114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  final Class<? super T> rawType;
  final Type type;

  /**
   * Constructs a new type token. Derives represented class from type
   * parameter.
   *
   * <p>Clients create an empty anonymous subclass. Doing so embeds the type
   * parameter in the anonymous class's type hierarchy so we can reconstitute
   * it at runtime despite erasure.
   *
   * <p>For example:
   * <code>
   * {@literal TypeToken<List<String>> t = new TypeToken<List<String>>}(){}
   * </code>
   */
  @SuppressWarnings("unchecked")
  protected TypeToken() {try{__CLR4_4_1294294lck0y8k0.R.inc(2920);
    __CLR4_4_1294294lck0y8k0.R.inc(2921);this.type = getSuperclassTypeParameter(getClass());
    __CLR4_4_1294294lck0y8k0.R.inc(2922);this.rawType = (Class<? super T>) getRawType(type);
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Unsafe. Constructs a type token manually.
   */
  @SuppressWarnings({"unchecked"})
  private TypeToken(Type type) {try{__CLR4_4_1294294lck0y8k0.R.inc(2923);
    __CLR4_4_1294294lck0y8k0.R.inc(2924);this.rawType = (Class<? super T>) getRawType(nonNull(type, "type"));
    __CLR4_4_1294294lck0y8k0.R.inc(2925);this.type = type;
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  private static <T> T nonNull(T o, String message) {try{__CLR4_4_1294294lck0y8k0.R.inc(2926);
    __CLR4_4_1294294lck0y8k0.R.inc(2927);if ((((o == null)&&(__CLR4_4_1294294lck0y8k0.R.iget(2928)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(2929)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(2930);throw new NullPointerException(message);
    }
    }__CLR4_4_1294294lck0y8k0.R.inc(2931);return o;
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}
  
  /**
   * Gets type from super class's type parameter.
   */
  static Type getSuperclassTypeParameter(Class<?> subclass) {try{__CLR4_4_1294294lck0y8k0.R.inc(2932);
    __CLR4_4_1294294lck0y8k0.R.inc(2933);Type superclass = subclass.getGenericSuperclass();
    __CLR4_4_1294294lck0y8k0.R.inc(2934);if ((((superclass instanceof Class<?>)&&(__CLR4_4_1294294lck0y8k0.R.iget(2935)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(2936)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(2937);throw new RuntimeException("Missing type parameter.");
    }
    }__CLR4_4_1294294lck0y8k0.R.inc(2938);return ((ParameterizedType) superclass).getActualTypeArguments()[0];
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Gets type token from super class's type parameter.
   */
  static TypeToken<?> fromSuperclassTypeParameter(Class<?> subclass) {try{__CLR4_4_1294294lck0y8k0.R.inc(2939);
    __CLR4_4_1294294lck0y8k0.R.inc(2940);return new SimpleTypeToken<Object>(subclass);
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  private static Class<?> getRawType(Type type) {try{__CLR4_4_1294294lck0y8k0.R.inc(2941);
    __CLR4_4_1294294lck0y8k0.R.inc(2942);if ((((type instanceof Class<?>)&&(__CLR4_4_1294294lck0y8k0.R.iget(2943)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(2944)==0&false))) {{
      // type is a normal class.
      __CLR4_4_1294294lck0y8k0.R.inc(2945);return (Class<?>) type;
    } }else {__CLR4_4_1294294lck0y8k0.R.inc(2946);if ((((type instanceof ParameterizedType)&&(__CLR4_4_1294294lck0y8k0.R.iget(2947)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(2948)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(2949);ParameterizedType parameterizedType = (ParameterizedType) type;

      // I'm not exactly sure why getRawType() returns Type instead of Class.
      // Neal isn't either but suspects some pathological case related
      // to nested classes exists.
      __CLR4_4_1294294lck0y8k0.R.inc(2950);Type rawType = parameterizedType.getRawType();
      __CLR4_4_1294294lck0y8k0.R.inc(2951);if ((((rawType instanceof Class<?>)&&(__CLR4_4_1294294lck0y8k0.R.iget(2952)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(2953)==0&false))) {{
        __CLR4_4_1294294lck0y8k0.R.inc(2954);return (Class<?>) rawType;
      }
      }__CLR4_4_1294294lck0y8k0.R.inc(2955);throw buildUnexpectedTypeError(rawType, Class.class);
    } }else {__CLR4_4_1294294lck0y8k0.R.inc(2956);if ((((type instanceof GenericArrayType)&&(__CLR4_4_1294294lck0y8k0.R.iget(2957)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(2958)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(2959);GenericArrayType genericArrayType = (GenericArrayType) type;

      // TODO(jleitch): This is not the most efficient way to handle generic
      // arrays, but is there another way to extract the array class in a
      // non-hacky way (i.e. using String value class names- "[L...")?
      __CLR4_4_1294294lck0y8k0.R.inc(2960);Object rawArrayType = Array.newInstance(
          getRawType(genericArrayType.getGenericComponentType()), 0);
      __CLR4_4_1294294lck0y8k0.R.inc(2961);return rawArrayType.getClass();
    } }else {{
      __CLR4_4_1294294lck0y8k0.R.inc(2962);throw buildUnexpectedTypeError(
          type, ParameterizedType.class, GenericArrayType.class);
    }
  }}}}finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Gets the raw type.
   */
  public Class<? super T> getRawType() {try{__CLR4_4_1294294lck0y8k0.R.inc(2963);
    __CLR4_4_1294294lck0y8k0.R.inc(2964);return rawType;
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Gets underlying {@code Type} instance.
   */
  public Type getType() {try{__CLR4_4_1294294lck0y8k0.R.inc(2965);
    __CLR4_4_1294294lck0y8k0.R.inc(2966);return type;
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Check if this type is assignable from the given class object.
   */
  public boolean isAssignableFrom(Class<?> cls) {try{__CLR4_4_1294294lck0y8k0.R.inc(2967);
    __CLR4_4_1294294lck0y8k0.R.inc(2968);return isAssignableFrom((Type) cls);
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Check if this type is assignable from the given Type.
   */
  public boolean isAssignableFrom(Type from) {try{__CLR4_4_1294294lck0y8k0.R.inc(2969);
    __CLR4_4_1294294lck0y8k0.R.inc(2970);if ((((from == null)&&(__CLR4_4_1294294lck0y8k0.R.iget(2971)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(2972)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(2973);return false;
    }

    }__CLR4_4_1294294lck0y8k0.R.inc(2974);if ((((type.equals(from))&&(__CLR4_4_1294294lck0y8k0.R.iget(2975)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(2976)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(2977);return true;
    }

    }__CLR4_4_1294294lck0y8k0.R.inc(2978);if ((((type instanceof Class<?>)&&(__CLR4_4_1294294lck0y8k0.R.iget(2979)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(2980)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(2981);return rawType.isAssignableFrom(getRawType(from));
    } }else {__CLR4_4_1294294lck0y8k0.R.inc(2982);if ((((type instanceof ParameterizedType)&&(__CLR4_4_1294294lck0y8k0.R.iget(2983)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(2984)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(2985);return isAssignableFrom(from, (ParameterizedType) type,
          new HashMap<String, Type>());
    } }else {__CLR4_4_1294294lck0y8k0.R.inc(2986);if ((((type instanceof GenericArrayType)&&(__CLR4_4_1294294lck0y8k0.R.iget(2987)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(2988)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(2989);return rawType.isAssignableFrom(getRawType(from))
          && isAssignableFrom(from, (GenericArrayType) type);
    } }else {{
      __CLR4_4_1294294lck0y8k0.R.inc(2990);throw buildUnexpectedTypeError(
          type, Class.class, ParameterizedType.class, GenericArrayType.class);
    }
  }}}}finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Check if this type is assignable from the given type token.
   */
  public boolean isAssignableFrom(TypeToken<?> token) {try{__CLR4_4_1294294lck0y8k0.R.inc(2991);
    __CLR4_4_1294294lck0y8k0.R.inc(2992);return isAssignableFrom(token.getType());
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Private helper function that performs some assignability checks for
   * the provided GenericArrayType.
   */
  private static boolean isAssignableFrom(Type from, GenericArrayType to) {try{__CLR4_4_1294294lck0y8k0.R.inc(2993);
    __CLR4_4_1294294lck0y8k0.R.inc(2994);Type toGenericComponentType = to.getGenericComponentType();
    __CLR4_4_1294294lck0y8k0.R.inc(2995);if ((((toGenericComponentType instanceof ParameterizedType)&&(__CLR4_4_1294294lck0y8k0.R.iget(2996)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(2997)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(2998);Type t = from;
      __CLR4_4_1294294lck0y8k0.R.inc(2999);if ((((from instanceof GenericArrayType)&&(__CLR4_4_1294294lck0y8k0.R.iget(3000)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3001)==0&false))) {{
        __CLR4_4_1294294lck0y8k0.R.inc(3002);t = ((GenericArrayType) from).getGenericComponentType();
      } }else {__CLR4_4_1294294lck0y8k0.R.inc(3003);if ((((from instanceof Class<?>)&&(__CLR4_4_1294294lck0y8k0.R.iget(3004)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3005)==0&false))) {{
        __CLR4_4_1294294lck0y8k0.R.inc(3006);Class<?> classType = (Class<?>) from;
        __CLR4_4_1294294lck0y8k0.R.inc(3007);while ((((classType.isArray())&&(__CLR4_4_1294294lck0y8k0.R.iget(3008)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3009)==0&false))) {{
          __CLR4_4_1294294lck0y8k0.R.inc(3010);classType = classType.getComponentType();
        }
        }__CLR4_4_1294294lck0y8k0.R.inc(3011);t = classType;
      }
      }}__CLR4_4_1294294lck0y8k0.R.inc(3012);return isAssignableFrom(t, (ParameterizedType) toGenericComponentType,
          new HashMap<String, Type>());
    }
    // No generic defined on "to"; therefore, return true and let other
    // checks determine assignability
    }__CLR4_4_1294294lck0y8k0.R.inc(3013);return true;
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Private recursive helper function to actually do the type-safe checking
   * of assignability.
   */
  private static boolean isAssignableFrom(Type from, ParameterizedType to,
      Map<String, Type> typeVarMap) {try{__CLR4_4_1294294lck0y8k0.R.inc(3014);

    __CLR4_4_1294294lck0y8k0.R.inc(3015);if ((((from == null)&&(__CLR4_4_1294294lck0y8k0.R.iget(3016)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3017)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(3018);return false;
    }

    }__CLR4_4_1294294lck0y8k0.R.inc(3019);if ((((to.equals(from))&&(__CLR4_4_1294294lck0y8k0.R.iget(3020)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3021)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(3022);return true;
    }

    // First figure out the class and any type information.
    }__CLR4_4_1294294lck0y8k0.R.inc(3023);Class<?> clazz = getRawType(from);
    __CLR4_4_1294294lck0y8k0.R.inc(3024);ParameterizedType ptype = null;
    __CLR4_4_1294294lck0y8k0.R.inc(3025);if ((((from instanceof ParameterizedType)&&(__CLR4_4_1294294lck0y8k0.R.iget(3026)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3027)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(3028);ptype = (ParameterizedType) from;
    }

    // Load up parameterized variable info if it was parameterized.
    }__CLR4_4_1294294lck0y8k0.R.inc(3029);if ((((ptype != null)&&(__CLR4_4_1294294lck0y8k0.R.iget(3030)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3031)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(3032);Type[] tArgs = ptype.getActualTypeArguments();
      __CLR4_4_1294294lck0y8k0.R.inc(3033);TypeVariable<?>[] tParams = clazz.getTypeParameters();
      __CLR4_4_1294294lck0y8k0.R.inc(3034);for (int i = 0; (((i < tArgs.length)&&(__CLR4_4_1294294lck0y8k0.R.iget(3035)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3036)==0&false)); i++) {{
        __CLR4_4_1294294lck0y8k0.R.inc(3037);Type arg = tArgs[i];
        __CLR4_4_1294294lck0y8k0.R.inc(3038);TypeVariable<?> var = tParams[i];
        __CLR4_4_1294294lck0y8k0.R.inc(3039);while ((((arg instanceof TypeVariable<?>)&&(__CLR4_4_1294294lck0y8k0.R.iget(3040)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3041)==0&false))) {{
          __CLR4_4_1294294lck0y8k0.R.inc(3042);TypeVariable<?> v = (TypeVariable<?>) arg;
          __CLR4_4_1294294lck0y8k0.R.inc(3043);arg = typeVarMap.get(v.getName());
        }
        }__CLR4_4_1294294lck0y8k0.R.inc(3044);typeVarMap.put(var.getName(), arg);
      }

      // check if they are equivalent under our current mapping.
      }__CLR4_4_1294294lck0y8k0.R.inc(3045);if ((((typeEquals(ptype, to, typeVarMap))&&(__CLR4_4_1294294lck0y8k0.R.iget(3046)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3047)==0&false))) {{
        __CLR4_4_1294294lck0y8k0.R.inc(3048);return true;
      }
    }}

    }__CLR4_4_1294294lck0y8k0.R.inc(3049);for (Type itype : clazz.getGenericInterfaces()) {{
      __CLR4_4_1294294lck0y8k0.R.inc(3050);if ((((isAssignableFrom(itype, to, new HashMap<String, Type>(typeVarMap)))&&(__CLR4_4_1294294lck0y8k0.R.iget(3051)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3052)==0&false))) {{
        __CLR4_4_1294294lck0y8k0.R.inc(3053);return true;
      }
    }}

    // Interfaces didn't work, try the superclass.
    }__CLR4_4_1294294lck0y8k0.R.inc(3054);Type sType = clazz.getGenericSuperclass();
    __CLR4_4_1294294lck0y8k0.R.inc(3055);if ((((isAssignableFrom(sType, to, new HashMap<String, Type>(typeVarMap)))&&(__CLR4_4_1294294lck0y8k0.R.iget(3056)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3057)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(3058);return true;
    }

    }__CLR4_4_1294294lck0y8k0.R.inc(3059);return false;
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Checks if two parameterized types are exactly equal, under the variable
   * replacement described in the typeVarMap.
   */
  private static boolean typeEquals(ParameterizedType from,
      ParameterizedType to, Map<String, Type> typeVarMap) {try{__CLR4_4_1294294lck0y8k0.R.inc(3060);
    __CLR4_4_1294294lck0y8k0.R.inc(3061);if ((((from.getRawType().equals(to.getRawType()))&&(__CLR4_4_1294294lck0y8k0.R.iget(3062)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3063)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(3064);Type[] fromArgs = from.getActualTypeArguments();
      __CLR4_4_1294294lck0y8k0.R.inc(3065);Type[] toArgs = to.getActualTypeArguments();
      __CLR4_4_1294294lck0y8k0.R.inc(3066);for (int i = 0; (((i < fromArgs.length)&&(__CLR4_4_1294294lck0y8k0.R.iget(3067)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3068)==0&false)); i++) {{
        __CLR4_4_1294294lck0y8k0.R.inc(3069);if ((((!matches(fromArgs[i], toArgs[i], typeVarMap))&&(__CLR4_4_1294294lck0y8k0.R.iget(3070)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3071)==0&false))) {{
          __CLR4_4_1294294lck0y8k0.R.inc(3072);return false;
        }
      }}
      }__CLR4_4_1294294lck0y8k0.R.inc(3073);return true;
    }
    }__CLR4_4_1294294lck0y8k0.R.inc(3074);return false;
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Checks if two types are the same or are equivalent under a variable mapping
   * given in the type map that was provided.
   */
  private static boolean matches(Type from, Type to,
      Map<String, Type> typeMap) {try{__CLR4_4_1294294lck0y8k0.R.inc(3075);
    __CLR4_4_1294294lck0y8k0.R.inc(3076);if ((((to.equals(from))&&(__CLR4_4_1294294lck0y8k0.R.iget(3077)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3078)==0&false))) {__CLR4_4_1294294lck0y8k0.R.inc(3079);return true;

    }__CLR4_4_1294294lck0y8k0.R.inc(3080);if ((((from instanceof TypeVariable<?>)&&(__CLR4_4_1294294lck0y8k0.R.iget(3081)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3082)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(3083);return to.equals(typeMap.get(((TypeVariable<?>)from).getName()));
    }

    }__CLR4_4_1294294lck0y8k0.R.inc(3084);return false;
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Hashcode for this object.
   * @return hashcode for this object.
   */
  @Override public int hashCode() {try{__CLR4_4_1294294lck0y8k0.R.inc(3085);
    __CLR4_4_1294294lck0y8k0.R.inc(3086);return type.hashCode();
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Method to test equality. 
   * 
   * @return true if this object is logically equal to the specified object, false otherwise.
   */
  @Override public boolean equals(Object o) {try{__CLR4_4_1294294lck0y8k0.R.inc(3087);
    __CLR4_4_1294294lck0y8k0.R.inc(3088);if ((((o == this)&&(__CLR4_4_1294294lck0y8k0.R.iget(3089)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3090)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(3091);return true;
    }
    }__CLR4_4_1294294lck0y8k0.R.inc(3092);if ((((!(o instanceof TypeToken<?>))&&(__CLR4_4_1294294lck0y8k0.R.iget(3093)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3094)==0&false))) {{
      __CLR4_4_1294294lck0y8k0.R.inc(3095);return false;
    }
    }__CLR4_4_1294294lck0y8k0.R.inc(3096);TypeToken<?> t = (TypeToken<?>) o;
    __CLR4_4_1294294lck0y8k0.R.inc(3097);return type.equals(t.type);
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Returns a string representation of this object.
   * @return a string representation of this object.
   */
  @Override public String toString() {try{__CLR4_4_1294294lck0y8k0.R.inc(3098);
    __CLR4_4_1294294lck0y8k0.R.inc(3099);return (((type instanceof Class<?>
        )&&(__CLR4_4_1294294lck0y8k0.R.iget(3100)!=0|true))||(__CLR4_4_1294294lck0y8k0.R.iget(3101)==0&false))? ((Class<?>) type).getName()
        : type.toString();
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  private static AssertionError buildUnexpectedTypeError(
      Type token, Class<?>... expected) {try{__CLR4_4_1294294lck0y8k0.R.inc(3102);

    // Build exception message
    __CLR4_4_1294294lck0y8k0.R.inc(3103);StringBuilder exceptionMessage =
        new StringBuilder("Unexpected type. Expected one of: ");
    __CLR4_4_1294294lck0y8k0.R.inc(3104);for (Class<?> clazz : expected) {{
      __CLR4_4_1294294lck0y8k0.R.inc(3105);exceptionMessage.append(clazz.getName()).append(", ");
    }
    }__CLR4_4_1294294lck0y8k0.R.inc(3106);exceptionMessage.append("but got: ").append(token.getClass().getName())
        .append(", for type token: ").append(token.toString()).append('.');

    __CLR4_4_1294294lck0y8k0.R.inc(3107);return new AssertionError(exceptionMessage.toString());
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Gets type token for the given {@code Type} instance.
   */
  public static TypeToken<?> get(Type type) {try{__CLR4_4_1294294lck0y8k0.R.inc(3108);
    __CLR4_4_1294294lck0y8k0.R.inc(3109);return new SimpleTypeToken<Object>(type);
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Gets type token for the given {@code Class} instance.
   */
  public static <T> TypeToken<T> get(Class<T> type) {try{__CLR4_4_1294294lck0y8k0.R.inc(3110);
    __CLR4_4_1294294lck0y8k0.R.inc(3111);return new SimpleTypeToken<T>(type);
  }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}

  /**
   * Private static class to not create more anonymous classes than
   * necessary.
   */
  private static class SimpleTypeToken<T> extends TypeToken<T> {
    public SimpleTypeToken(Type type) {
      super(type);__CLR4_4_1294294lck0y8k0.R.inc(3113);try{__CLR4_4_1294294lck0y8k0.R.inc(3112);
    }finally{__CLR4_4_1294294lck0y8k0.R.flushNeeded();}}
  }
}
