/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2009 Google Inc.
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

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * A data object that stores attributes of a field.
 *
 * <p>This class is immutable; therefore, it can be safely shared across threads.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 *
 * @since 1.4
 */
public final class FieldAttributes {public static class __CLR4_4_1h2h2lck0y82o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,671,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final String MAX_CACHE_PROPERTY_NAME =
      "com.google.gson.annotation_cache_size_hint";

  private static final Cache<Pair<Class<?>, String>, Collection<Annotation>> ANNOTATION_CACHE =
      new LruCache<Pair<Class<?>,String>, Collection<Annotation>>(getMaxCacheSize());

  private final Class<?> declaringClazz;
  private final Field field;
  private final Class<?> declaredType;
  private final boolean isSynthetic;
  private final int modifiers;
  private final String name;

  // Fields used for lazy initialization
  private Type genericType;
  private Collection<Annotation> annotations;

  /**
   * Constructs a Field Attributes object from the {@code f}.
   *
   * @param f the field to pull attributes from
   */
  FieldAttributes(final Class<?> declaringClazz, final Field f) {try{__CLR4_4_1h2h2lck0y82o.R.inc(614);
    __CLR4_4_1h2h2lck0y82o.R.inc(615);Preconditions.checkNotNull(declaringClazz);
    __CLR4_4_1h2h2lck0y82o.R.inc(616);this.declaringClazz = declaringClazz;
    __CLR4_4_1h2h2lck0y82o.R.inc(617);name = f.getName();
    __CLR4_4_1h2h2lck0y82o.R.inc(618);declaredType = f.getType();
    __CLR4_4_1h2h2lck0y82o.R.inc(619);isSynthetic = f.isSynthetic();
    __CLR4_4_1h2h2lck0y82o.R.inc(620);modifiers = f.getModifiers();
    __CLR4_4_1h2h2lck0y82o.R.inc(621);field = f;
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}

  private static int getMaxCacheSize() {try{__CLR4_4_1h2h2lck0y82o.R.inc(622);
    __CLR4_4_1h2h2lck0y82o.R.inc(623);final int defaultMaxCacheSize = 2000;
    __CLR4_4_1h2h2lck0y82o.R.inc(624);try {
      __CLR4_4_1h2h2lck0y82o.R.inc(625);String propertyValue = System.getProperty(
          MAX_CACHE_PROPERTY_NAME, String.valueOf(defaultMaxCacheSize));
      __CLR4_4_1h2h2lck0y82o.R.inc(626);return Integer.parseInt(propertyValue);
    } catch (NumberFormatException e) {
      __CLR4_4_1h2h2lck0y82o.R.inc(627);return defaultMaxCacheSize;
    }
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}

  /**
   * @return the declaring class that contains this field
   */
  public Class<?> getDeclaringClass() {try{__CLR4_4_1h2h2lck0y82o.R.inc(628);
    __CLR4_4_1h2h2lck0y82o.R.inc(629);return declaringClazz;
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}

  /**
   * @return the name of the field
   */
  public String getName() {try{__CLR4_4_1h2h2lck0y82o.R.inc(630);
    __CLR4_4_1h2h2lck0y82o.R.inc(631);return name;
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}

  /**
   * <p>For example, assume the following class definition:
   * <pre class="code">
   * public class Foo {
   *   private String bar;
   *   private List&lt;String&gt; red;
   * }
   *
   * Type listParmeterizedType = new TypeToken<List<String>>() {}.getType();
   * </pre>
   *
   * <p>This method would return {@code String.class} for the {@code bar} field and
   * {@code listParameterizedType} for the {@code red} field.
   *
   * @return the specific type declared for this field
   */
  public Type getDeclaredType() {try{__CLR4_4_1h2h2lck0y82o.R.inc(632);
    __CLR4_4_1h2h2lck0y82o.R.inc(633);if ((((genericType == null)&&(__CLR4_4_1h2h2lck0y82o.R.iget(634)!=0|true))||(__CLR4_4_1h2h2lck0y82o.R.iget(635)==0&false))) {{
      __CLR4_4_1h2h2lck0y82o.R.inc(636);genericType = field.getGenericType();
    }
    }__CLR4_4_1h2h2lck0y82o.R.inc(637);return genericType;
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}

  /**
   * Returns the {@code Class<?>} object that was declared for this field.
   *
   * <p>For example, assume the following class definition:
   * <pre class="code">
   * public class Foo {
   *   private String bar;
   *   private List&lt;String&gt; red;
   * }
   * </pre>
   *
   * <p>This method would return {@code String.class} for the {@code bar} field and
   * {@code List.class} for the {@code red} field.
   *
   * @return the specific class object that was declared for the field
   */
  public Class<?> getDeclaredClass() {try{__CLR4_4_1h2h2lck0y82o.R.inc(638);
    __CLR4_4_1h2h2lck0y82o.R.inc(639);return declaredType;
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}

  /**
   * Return the {@code T} annotation object from this field if it exist; otherwise returns
   * {@code null}.
   *
   * @param annotation the class of the annotation that will be retrieved
   * @return the annotation instance if it is bound to the field; otherwise {@code null}
   */
  public <T extends Annotation> T getAnnotation(Class<T> annotation) {try{__CLR4_4_1h2h2lck0y82o.R.inc(640);
    __CLR4_4_1h2h2lck0y82o.R.inc(641);return getAnnotationFromArray(getAnnotations(), annotation);
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}

  /**
   * Return the annotations that are present on this field.
   *
   * @return an array of all the annotations set on the field
   * @since 1.4
   */
  public Collection<Annotation> getAnnotations() {try{__CLR4_4_1h2h2lck0y82o.R.inc(642);
    __CLR4_4_1h2h2lck0y82o.R.inc(643);if ((((annotations == null)&&(__CLR4_4_1h2h2lck0y82o.R.iget(644)!=0|true))||(__CLR4_4_1h2h2lck0y82o.R.iget(645)==0&false))) {{
      __CLR4_4_1h2h2lck0y82o.R.inc(646);Pair<Class<?>, String> key = new Pair<Class<?>, String>(declaringClazz, name);
      __CLR4_4_1h2h2lck0y82o.R.inc(647);annotations = ANNOTATION_CACHE.getElement(key);
      __CLR4_4_1h2h2lck0y82o.R.inc(648);if ((((annotations == null)&&(__CLR4_4_1h2h2lck0y82o.R.iget(649)!=0|true))||(__CLR4_4_1h2h2lck0y82o.R.iget(650)==0&false))) {{
        __CLR4_4_1h2h2lck0y82o.R.inc(651);annotations = Collections.unmodifiableCollection(
            Arrays.asList(field.getAnnotations()));
        __CLR4_4_1h2h2lck0y82o.R.inc(652);ANNOTATION_CACHE.addElement(key, annotations);
      }
    }}
    }__CLR4_4_1h2h2lck0y82o.R.inc(653);return annotations;
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}

  /**
   * Returns {@code true} if the field is defined with the {@code modifier}.
   *
   * <p>This method is meant to be called as:
   * <pre class="code">
   * boolean hasPublicModifier = fieldAttribute.hasModifier(java.lang.reflect.Modifier.PUBLIC);
   * </pre>
   *
   * @see java.lang.reflect.Modifier
   */
  public boolean hasModifier(int modifier) {try{__CLR4_4_1h2h2lck0y82o.R.inc(654);
    __CLR4_4_1h2h2lck0y82o.R.inc(655);return (modifiers & modifier) != 0;
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}

  /**
   * This is exposed internally only for the removing synthetic fields from the JSON output.
   *
   * @return true if the field is synthetic; otherwise false
   * @throws IllegalAccessException
   * @throws IllegalArgumentException
   */
  void set(Object instance, Object value) throws IllegalAccessException {try{__CLR4_4_1h2h2lck0y82o.R.inc(656);
    __CLR4_4_1h2h2lck0y82o.R.inc(657);field.set(instance, value);
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}

  /**
   * This is exposed internally only for the removing synthetic fields from the JSON output.
   *
   * @return true if the field is synthetic; otherwise false
   * @throws IllegalAccessException
   * @throws IllegalArgumentException
   */
  Object get(Object instance) throws IllegalAccessException {try{__CLR4_4_1h2h2lck0y82o.R.inc(658);
    __CLR4_4_1h2h2lck0y82o.R.inc(659);return field.get(instance);
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}

  /**
   * This is exposed internally only for the removing synthetic fields from the JSON output.
   *
   * @return true if the field is synthetic; otherwise false
   */
  boolean isSynthetic() {try{__CLR4_4_1h2h2lck0y82o.R.inc(660);
    __CLR4_4_1h2h2lck0y82o.R.inc(661);return isSynthetic;
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}

  /**
   * @deprecated remove this when {@link FieldNamingStrategy} is deleted.
   */
  @Deprecated
  Field getFieldObject() {try{__CLR4_4_1h2h2lck0y82o.R.inc(662);
    __CLR4_4_1h2h2lck0y82o.R.inc(663);return field;
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}

  @SuppressWarnings("unchecked")
  private static <T extends Annotation> T getAnnotationFromArray(
      Collection<Annotation> annotations, Class<T> annotation) {try{__CLR4_4_1h2h2lck0y82o.R.inc(664);
    __CLR4_4_1h2h2lck0y82o.R.inc(665);for (Annotation a : annotations) {{
      __CLR4_4_1h2h2lck0y82o.R.inc(666);if ((((a.annotationType() == annotation)&&(__CLR4_4_1h2h2lck0y82o.R.iget(667)!=0|true))||(__CLR4_4_1h2h2lck0y82o.R.iget(668)==0&false))) {{
        __CLR4_4_1h2h2lck0y82o.R.inc(669);return (T) a;
      }
    }}
    }__CLR4_4_1h2h2lck0y82o.R.inc(670);return null;
  }finally{__CLR4_4_1h2h2lck0y82o.R.flushNeeded();}}
}
