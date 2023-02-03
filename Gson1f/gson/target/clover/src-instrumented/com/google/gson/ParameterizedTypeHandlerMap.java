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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A map that provides ability to associate handlers for a specific type or all
 * of its sub-types
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 * 
 * @param <T> The handler that will be looked up by type
 */
final class ParameterizedTypeHandlerMap<T> {public static class __CLR4_4_11sd1sdlck0y8gq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,2452,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final Logger logger =
      Logger.getLogger(ParameterizedTypeHandlerMap.class.getName());
  private final Map<Type, T> map = new HashMap<Type, T>();
  private final List<Pair<Class<?>, T>> typeHierarchyList = new ArrayList<Pair<Class<?>, T>>();
  private boolean modifiable = true;

  public synchronized void registerForTypeHierarchy(Class<?> typeOfT, T value) {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2317);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2318);Pair<Class<?>, T> pair = new Pair<Class<?>, T>(typeOfT, value);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2319);registerForTypeHierarchy(pair);
  }finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}

  public synchronized void registerForTypeHierarchy(Pair<Class<?>, T> pair) {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2320);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2321);if ((((!modifiable)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2322)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2323)==0&false))) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2324);throw new IllegalStateException("Attempted to modify an unmodifiable map.");
    }
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2325);int index = getIndexOfSpecificHandlerForTypeHierarchy(pair.first);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2326);if ((((index >= 0)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2327)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2328)==0&false))) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2329);logger.log(Level.WARNING, "Overriding the existing type handler for {0}", pair.first);
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2330);typeHierarchyList.remove(index);
    }
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2331);index = getIndexOfAnOverriddenHandler(pair.first);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2332);if ((((index >= 0)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2333)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2334)==0&false))) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2335);throw new IllegalArgumentException("The specified type handler for type " + pair.first
          + " hides the previously registered type hierarchy handler for "
          + typeHierarchyList.get(index).first + ". Gson does not allow this.");
    }
    // We want stack behavior for adding to this list. A type adapter added subsequently should
    // override a previously registered one.
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2336);typeHierarchyList.add(0, pair);
  }finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}

  private int getIndexOfAnOverriddenHandler(Class<?> type) {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2337);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2338);for (int i = typeHierarchyList.size()-1; (((i >= 0)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2339)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2340)==0&false)); --i) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2341);Pair<Class<?>, T> entry = typeHierarchyList.get(i);
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2342);if ((((type.isAssignableFrom(entry.first))&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2343)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2344)==0&false))) {{
        __CLR4_4_11sd1sdlck0y8gq.R.inc(2345);return i;
      }
    }}
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2346);return -1;
  }finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}

  public synchronized void register(Type typeOfT, T value) {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2347);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2348);if ((((!modifiable)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2349)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2350)==0&false))) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2351);throw new IllegalStateException("Attempted to modify an unmodifiable map.");
    }
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2352);if ((((hasSpecificHandlerFor(typeOfT))&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2353)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2354)==0&false))) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2355);logger.log(Level.WARNING, "Overriding the existing type handler for {0}", typeOfT);
    }
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2356);map.put(typeOfT, value);
  }finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}

  public synchronized void registerIfAbsent(ParameterizedTypeHandlerMap<T> other) {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2357);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2358);if ((((!modifiable)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2359)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2360)==0&false))) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2361);throw new IllegalStateException("Attempted to modify an unmodifiable map.");
    }
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2362);for (Map.Entry<Type, T> entry : other.map.entrySet()) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2363);if ((((!map.containsKey(entry.getKey()))&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2364)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2365)==0&false))) {{
        __CLR4_4_11sd1sdlck0y8gq.R.inc(2366);register(entry.getKey(), entry.getValue());
      }
    }}
    // Quite important to traverse the typeHierarchyList from stack bottom first since
    // we want to register the handlers in the same order to preserve priority order
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2367);for (int i = other.typeHierarchyList.size()-1; (((i >= 0)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2368)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2369)==0&false)); --i) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2370);Pair<Class<?>, T> entry = other.typeHierarchyList.get(i);
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2371);int index = getIndexOfSpecificHandlerForTypeHierarchy(entry.first);
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2372);if ((((index < 0)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2373)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2374)==0&false))) {{
        __CLR4_4_11sd1sdlck0y8gq.R.inc(2375);registerForTypeHierarchy(entry);
      }
    }}
  }}finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}

  public synchronized void registerIfAbsent(Type typeOfT, T value) {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2376);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2377);if ((((!modifiable)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2378)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2379)==0&false))) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2380);throw new IllegalStateException("Attempted to modify an unmodifiable map.");
    }
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2381);if ((((!map.containsKey(typeOfT))&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2382)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2383)==0&false))) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2384);register(typeOfT, value);
    }
  }}finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}

  public synchronized void makeUnmodifiable() {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2385);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2386);modifiable = false;
  }finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}

  public synchronized T getHandlerFor(Type type) {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2387);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2388);T handler = map.get(type);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2389);if ((((handler == null)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2390)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2391)==0&false))) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2392);Class<?> rawClass = TypeUtils.toRawClass(type);
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2393);if ((((rawClass != type)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2394)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2395)==0&false))) {{
        __CLR4_4_11sd1sdlck0y8gq.R.inc(2396);handler = getHandlerFor(rawClass);
      }
      }__CLR4_4_11sd1sdlck0y8gq.R.inc(2397);if ((((handler == null)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2398)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2399)==0&false))) {{
        // check if something registered for type hierarchy
        __CLR4_4_11sd1sdlck0y8gq.R.inc(2400);handler = getHandlerForTypeHierarchy(rawClass);
      }
    }}
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2401);return handler;
  }finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}

  private T getHandlerForTypeHierarchy(Class<?> type) {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2402);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2403);for (Pair<Class<?>, T> entry : typeHierarchyList) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2404);if ((((entry.first.isAssignableFrom(type))&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2405)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2406)==0&false))) {{
        __CLR4_4_11sd1sdlck0y8gq.R.inc(2407);return entry.second;
      }
    }}
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2408);return null;
  }finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}

  public synchronized boolean hasSpecificHandlerFor(Type type) {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2409);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2410);return map.containsKey(type);
  }finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}

  private synchronized int getIndexOfSpecificHandlerForTypeHierarchy(Class<?> type) {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2411);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2412);for (int i = typeHierarchyList.size()-1; (((i >= 0)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2413)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2414)==0&false)); --i) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2415);if ((((type.equals(typeHierarchyList.get(i).first))&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2416)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2417)==0&false))) {{
        __CLR4_4_11sd1sdlck0y8gq.R.inc(2418);return i;
      }
    }}
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2419);return -1;
  }finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}

  public synchronized ParameterizedTypeHandlerMap<T> copyOf() {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2420);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2421);ParameterizedTypeHandlerMap<T> copy = new ParameterizedTypeHandlerMap<T>();
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2422);for (Map.Entry<Type, T> entry : map.entrySet()) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2423);copy.register(entry.getKey(), entry.getValue());
    }
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2424);for (Pair<Class<?>, T> entry : typeHierarchyList) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2425);copy.registerForTypeHierarchy(entry);
    }
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2426);return copy;
  }finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}

  @Override
  public String toString() {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2427);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2428);StringBuilder sb = new StringBuilder("{mapForTypeHierarchy:{");
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2429);boolean first = true;
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2430);for (Pair<Class<?>, T> entry : typeHierarchyList) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2431);if ((((first)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2432)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2433)==0&false))) {{
        __CLR4_4_11sd1sdlck0y8gq.R.inc(2434);first = false;
      } }else {{
        __CLR4_4_11sd1sdlck0y8gq.R.inc(2435);sb.append(',');
      }
      }__CLR4_4_11sd1sdlck0y8gq.R.inc(2436);sb.append(typeToString(entry.first)).append(':');
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2437);sb.append(entry.second);
    }
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2438);sb.append("},map:{");
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2439);first = true;
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2440);for (Map.Entry<Type, T> entry : map.entrySet()) {{
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2441);if ((((first)&&(__CLR4_4_11sd1sdlck0y8gq.R.iget(2442)!=0|true))||(__CLR4_4_11sd1sdlck0y8gq.R.iget(2443)==0&false))) {{
        __CLR4_4_11sd1sdlck0y8gq.R.inc(2444);first = false;
      } }else {{
        __CLR4_4_11sd1sdlck0y8gq.R.inc(2445);sb.append(',');
      }
      }__CLR4_4_11sd1sdlck0y8gq.R.inc(2446);sb.append(typeToString(entry.getKey())).append(':');
      __CLR4_4_11sd1sdlck0y8gq.R.inc(2447);sb.append(entry.getValue());
    }
    }__CLR4_4_11sd1sdlck0y8gq.R.inc(2448);sb.append("}");
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2449);return sb.toString();
  }finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}

  private String typeToString(Type type) {try{__CLR4_4_11sd1sdlck0y8gq.R.inc(2450);
    __CLR4_4_11sd1sdlck0y8gq.R.inc(2451);return TypeUtils.toRawClass(type).getSimpleName();
  }finally{__CLR4_4_11sd1sdlck0y8gq.R.flushNeeded();}}
}
