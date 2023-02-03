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
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class contains a mapping of all the application specific
 * {@link InstanceCreator} instances.  Registering an {@link InstanceCreator}
 * with this class will override the default object creation that is defined
 * by the ObjectConstructor that this class is wrapping.  Using this class
 * with the JSON framework provides the application with "pluggable" modules
 * to customize framework to suit the application's needs.
 *
 * @author Joel Leitch
 */
final class MappedObjectConstructor implements ObjectConstructor {public static class __CLR4_4_11jr1jrlck0y8ex{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,2048,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final Logger log = Logger.getLogger(MappedObjectConstructor.class.getName());

  private final ParameterizedTypeHandlerMap<InstanceCreator<?>> instanceCreatorMap;
  
  public MappedObjectConstructor(
      ParameterizedTypeHandlerMap<InstanceCreator<?>> instanceCreators) {try{__CLR4_4_11jr1jrlck0y8ex.R.inc(2007);
    __CLR4_4_11jr1jrlck0y8ex.R.inc(2008);instanceCreatorMap = instanceCreators;
  }finally{__CLR4_4_11jr1jrlck0y8ex.R.flushNeeded();}}

  @SuppressWarnings("unchecked")
  public <T> T construct(Type typeOfT) {try{__CLR4_4_11jr1jrlck0y8ex.R.inc(2009);
    __CLR4_4_11jr1jrlck0y8ex.R.inc(2010);InstanceCreator<T> creator = (InstanceCreator<T>) instanceCreatorMap.getHandlerFor(typeOfT);
    __CLR4_4_11jr1jrlck0y8ex.R.inc(2011);if ((((creator != null)&&(__CLR4_4_11jr1jrlck0y8ex.R.iget(2012)!=0|true))||(__CLR4_4_11jr1jrlck0y8ex.R.iget(2013)==0&false))) {{
      __CLR4_4_11jr1jrlck0y8ex.R.inc(2014);return creator.createInstance(typeOfT);
    }
    }__CLR4_4_11jr1jrlck0y8ex.R.inc(2015);return (T) constructWithNoArgConstructor(typeOfT);
  }finally{__CLR4_4_11jr1jrlck0y8ex.R.flushNeeded();}}

  public Object constructArray(Type type, int length) {try{__CLR4_4_11jr1jrlck0y8ex.R.inc(2016);
    __CLR4_4_11jr1jrlck0y8ex.R.inc(2017);return Array.newInstance(TypeUtils.toRawClass(type), length);
  }finally{__CLR4_4_11jr1jrlck0y8ex.R.flushNeeded();}}

  private <T> T constructWithNoArgConstructor(Type typeOfT) {try{__CLR4_4_11jr1jrlck0y8ex.R.inc(2018);
    __CLR4_4_11jr1jrlck0y8ex.R.inc(2019);try {
      __CLR4_4_11jr1jrlck0y8ex.R.inc(2020);Constructor<T> constructor = getNoArgsConstructor(typeOfT);
      __CLR4_4_11jr1jrlck0y8ex.R.inc(2021);if ((((constructor == null)&&(__CLR4_4_11jr1jrlck0y8ex.R.iget(2022)!=0|true))||(__CLR4_4_11jr1jrlck0y8ex.R.iget(2023)==0&false))) {{
        __CLR4_4_11jr1jrlck0y8ex.R.inc(2024);throw new RuntimeException(("No-args constructor for " + typeOfT + " does not exist. "
            + "Register an InstanceCreator with Gson for this type to fix this problem."));
      }
      }__CLR4_4_11jr1jrlck0y8ex.R.inc(2025);return constructor.newInstance();
    } catch (InstantiationException e) {
      __CLR4_4_11jr1jrlck0y8ex.R.inc(2026);throw new RuntimeException(("Unable to invoke no-args constructor for " + typeOfT + ". "
          + "Register an InstanceCreator with Gson for this type may fix this problem."), e);
    } catch (IllegalAccessException e) {
      __CLR4_4_11jr1jrlck0y8ex.R.inc(2027);throw new RuntimeException(("Unable to invoke no-args constructor for " + typeOfT + ". "
          + "Register an InstanceCreator with Gson for this type may fix this problem."), e);
    } catch (InvocationTargetException e) {
      __CLR4_4_11jr1jrlck0y8ex.R.inc(2028);throw new RuntimeException(("Unable to invoke no-args constructor for " + typeOfT + ". "
          + "Register an InstanceCreator with Gson for this type may fix this problem."), e);
    }
  }finally{__CLR4_4_11jr1jrlck0y8ex.R.flushNeeded();}}

  @SuppressWarnings({"unchecked", "cast"})
  private <T> Constructor<T> getNoArgsConstructor(Type typeOfT) {try{__CLR4_4_11jr1jrlck0y8ex.R.inc(2029);
    __CLR4_4_11jr1jrlck0y8ex.R.inc(2030);TypeInfo typeInfo = new TypeInfo(typeOfT);
    __CLR4_4_11jr1jrlck0y8ex.R.inc(2031);Class<T> clazz = (Class<T>) typeInfo.getRawClass();
    __CLR4_4_11jr1jrlck0y8ex.R.inc(2032);Constructor<T>[] declaredConstructors = (Constructor<T>[]) clazz.getDeclaredConstructors();
    __CLR4_4_11jr1jrlck0y8ex.R.inc(2033);AccessibleObject.setAccessible(declaredConstructors, true);
    __CLR4_4_11jr1jrlck0y8ex.R.inc(2034);for (Constructor<T> constructor : declaredConstructors) {{
      __CLR4_4_11jr1jrlck0y8ex.R.inc(2035);if ((((constructor.getParameterTypes().length == 0)&&(__CLR4_4_11jr1jrlck0y8ex.R.iget(2036)!=0|true))||(__CLR4_4_11jr1jrlck0y8ex.R.iget(2037)==0&false))) {{
        __CLR4_4_11jr1jrlck0y8ex.R.inc(2038);return constructor;
      }
    }}
    }__CLR4_4_11jr1jrlck0y8ex.R.inc(2039);return null;
  }finally{__CLR4_4_11jr1jrlck0y8ex.R.flushNeeded();}}

  /**
   * Use this methods to register an {@link InstanceCreator} for a new type.
   *
   * @param <T> the type of class to be mapped with its "creator"
   * @param typeOfT the instance type that will be created
   * @param creator the {@link InstanceCreator} instance to register
   */
  <T> void register(Type typeOfT, InstanceCreator<? extends T> creator) {try{__CLR4_4_11jr1jrlck0y8ex.R.inc(2040);
    __CLR4_4_11jr1jrlck0y8ex.R.inc(2041);if ((((instanceCreatorMap.hasSpecificHandlerFor(typeOfT))&&(__CLR4_4_11jr1jrlck0y8ex.R.iget(2042)!=0|true))||(__CLR4_4_11jr1jrlck0y8ex.R.iget(2043)==0&false))) {{
      __CLR4_4_11jr1jrlck0y8ex.R.inc(2044);log.log(Level.WARNING, "Overriding the existing InstanceCreator for {0}", typeOfT);
    }
    }__CLR4_4_11jr1jrlck0y8ex.R.inc(2045);instanceCreatorMap.register(typeOfT, creator);
  }finally{__CLR4_4_11jr1jrlck0y8ex.R.flushNeeded();}}
  
  @Override
  public String toString() {try{__CLR4_4_11jr1jrlck0y8ex.R.inc(2046);
    __CLR4_4_11jr1jrlck0y8ex.R.inc(2047);return instanceCreatorMap.toString();
  }finally{__CLR4_4_11jr1jrlck0y8ex.R.flushNeeded();}}
}
