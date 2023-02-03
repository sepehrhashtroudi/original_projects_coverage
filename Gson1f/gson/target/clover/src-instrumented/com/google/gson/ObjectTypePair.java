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

import java.lang.reflect.Type;

/**
 * A holder class for an object and its type
 *
 * @author Inderjeet Singh
 */
final class ObjectTypePair {public static class __CLR4_4_11p61p6lck0y8g6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,2297,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Object obj;
  final Type type;
  private final boolean preserveType;

  ObjectTypePair(Object obj, Type type, boolean preserveType) {try{__CLR4_4_11p61p6lck0y8g6.R.inc(2202);
    __CLR4_4_11p61p6lck0y8g6.R.inc(2203);this.obj = obj;
    __CLR4_4_11p61p6lck0y8g6.R.inc(2204);this.type = type;
    __CLR4_4_11p61p6lck0y8g6.R.inc(2205);this.preserveType = preserveType;
  }finally{__CLR4_4_11p61p6lck0y8g6.R.flushNeeded();}}

  Object getObject() {try{__CLR4_4_11p61p6lck0y8g6.R.inc(2206);
    __CLR4_4_11p61p6lck0y8g6.R.inc(2207);return obj;
  }finally{__CLR4_4_11p61p6lck0y8g6.R.flushNeeded();}}

  void setObject(Object obj) {try{__CLR4_4_11p61p6lck0y8g6.R.inc(2208);
    __CLR4_4_11p61p6lck0y8g6.R.inc(2209);this.obj = obj;
  }finally{__CLR4_4_11p61p6lck0y8g6.R.flushNeeded();}}

  Type getType() {try{__CLR4_4_11p61p6lck0y8g6.R.inc(2210);
    __CLR4_4_11p61p6lck0y8g6.R.inc(2211);return type;
  }finally{__CLR4_4_11p61p6lck0y8g6.R.flushNeeded();}}

  @Override
  public String toString() {try{__CLR4_4_11p61p6lck0y8g6.R.inc(2212);
    __CLR4_4_11p61p6lck0y8g6.R.inc(2213);return String.format("preserveType: %b, type: %s, obj: %s", preserveType, type, obj);
  }finally{__CLR4_4_11p61p6lck0y8g6.R.flushNeeded();}}

  <HANDLER> Pair<HANDLER, ObjectTypePair> getMatchingHandler(
      ParameterizedTypeHandlerMap<HANDLER> handlers) {try{__CLR4_4_11p61p6lck0y8g6.R.inc(2214);
    __CLR4_4_11p61p6lck0y8g6.R.inc(2215);HANDLER handler = null;
    __CLR4_4_11p61p6lck0y8g6.R.inc(2216);if ((((!preserveType && obj != null)&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2217)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2218)==0&false))) {{
      // First try looking up the handler for the actual type
      __CLR4_4_11p61p6lck0y8g6.R.inc(2219);ObjectTypePair moreSpecificType = toMoreSpecificType();    
      __CLR4_4_11p61p6lck0y8g6.R.inc(2220);handler = handlers.getHandlerFor(moreSpecificType.type);
      __CLR4_4_11p61p6lck0y8g6.R.inc(2221);if ((((handler != null)&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2222)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2223)==0&false))) {{
        __CLR4_4_11p61p6lck0y8g6.R.inc(2224);return new Pair<HANDLER, ObjectTypePair>(handler, moreSpecificType);
      }
    }}
    // Try the specified type
    }__CLR4_4_11p61p6lck0y8g6.R.inc(2225);handler = handlers.getHandlerFor(type);
    __CLR4_4_11p61p6lck0y8g6.R.inc(2226);return (((handler == null )&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2227)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2228)==0&false))? null : new Pair<HANDLER, ObjectTypePair>(handler, this);
  }finally{__CLR4_4_11p61p6lck0y8g6.R.flushNeeded();}}

  ObjectTypePair toMoreSpecificType() {try{__CLR4_4_11p61p6lck0y8g6.R.inc(2229);    
    __CLR4_4_11p61p6lck0y8g6.R.inc(2230);if ((((preserveType || obj == null)&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2231)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2232)==0&false))) {{
      __CLR4_4_11p61p6lck0y8g6.R.inc(2233);return this;
    }
    }__CLR4_4_11p61p6lck0y8g6.R.inc(2234);Type actualType = getActualTypeIfMoreSpecific(type, obj.getClass());
    __CLR4_4_11p61p6lck0y8g6.R.inc(2235);if ((((actualType == type)&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2236)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2237)==0&false))) {{
      __CLR4_4_11p61p6lck0y8g6.R.inc(2238);return this;
    }
    }__CLR4_4_11p61p6lck0y8g6.R.inc(2239);return new ObjectTypePair(obj, actualType, preserveType);
  }finally{__CLR4_4_11p61p6lck0y8g6.R.flushNeeded();}}

  // This takes care of situations where the field was declared as an Object, but the
  // actual value contains something more specific. See Issue 54.
  // TODO (inder): This solution will not work if the field is of a generic type, but 
  // the actual object is of a raw type (which is a sub-class of the generic type).
  static Type getActualTypeIfMoreSpecific(Type type, Class<?> actualClass) {try{__CLR4_4_11p61p6lck0y8g6.R.inc(2240);
    __CLR4_4_11p61p6lck0y8g6.R.inc(2241);if ((((type instanceof Class<?>)&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2242)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2243)==0&false))) {{
      __CLR4_4_11p61p6lck0y8g6.R.inc(2244);Class<?> typeAsClass = (Class<?>) type;
      __CLR4_4_11p61p6lck0y8g6.R.inc(2245);if ((((typeAsClass.isAssignableFrom(actualClass))&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2246)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2247)==0&false))) {{
        __CLR4_4_11p61p6lck0y8g6.R.inc(2248);type = actualClass;
      }
      }__CLR4_4_11p61p6lck0y8g6.R.inc(2249);if ((((type == Object.class)&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2250)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2251)==0&false))) {{
        __CLR4_4_11p61p6lck0y8g6.R.inc(2252);type = actualClass;
      } 
    }}
    }__CLR4_4_11p61p6lck0y8g6.R.inc(2253);return type;
  }finally{__CLR4_4_11p61p6lck0y8g6.R.flushNeeded();}}

  @Override
  public int hashCode() {try{__CLR4_4_11p61p6lck0y8g6.R.inc(2254);
    // Not using type.hashCode() since I am not sure if the subclasses of type reimplement
    // hashCode() to be equal for equal types
    __CLR4_4_11p61p6lck0y8g6.R.inc(2255);return (((((obj == null) )&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2256)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2257)==0&false))? 31 : obj.hashCode());
  }finally{__CLR4_4_11p61p6lck0y8g6.R.flushNeeded();}}

  @Override
  public boolean equals(Object obj) {try{__CLR4_4_11p61p6lck0y8g6.R.inc(2258);
    __CLR4_4_11p61p6lck0y8g6.R.inc(2259);if ((((this == obj)&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2260)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2261)==0&false))) {{
      __CLR4_4_11p61p6lck0y8g6.R.inc(2262);return true;
    }
    }__CLR4_4_11p61p6lck0y8g6.R.inc(2263);if ((((obj == null)&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2264)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2265)==0&false))) {{
      __CLR4_4_11p61p6lck0y8g6.R.inc(2266);return false;
    }
    }__CLR4_4_11p61p6lck0y8g6.R.inc(2267);if ((((getClass() != obj.getClass())&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2268)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2269)==0&false))) {{
      __CLR4_4_11p61p6lck0y8g6.R.inc(2270);return false;
    }
    }__CLR4_4_11p61p6lck0y8g6.R.inc(2271);ObjectTypePair other = (ObjectTypePair) obj;
    __CLR4_4_11p61p6lck0y8g6.R.inc(2272);if ((((this.obj == null)&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2273)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2274)==0&false))) {{
      __CLR4_4_11p61p6lck0y8g6.R.inc(2275);if ((((other.obj != null)&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2276)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2277)==0&false))) {{
        __CLR4_4_11p61p6lck0y8g6.R.inc(2278);return false;
      }
    }} }else {__CLR4_4_11p61p6lck0y8g6.R.inc(2279);if ((((this.obj != other.obj)&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2280)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2281)==0&false))) {{ // Checking for reference equality
      __CLR4_4_11p61p6lck0y8g6.R.inc(2282);return false;
    }
    }}__CLR4_4_11p61p6lck0y8g6.R.inc(2283);if ((((type == null)&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2284)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2285)==0&false))) {{
      __CLR4_4_11p61p6lck0y8g6.R.inc(2286);if ((((other.type != null)&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2287)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2288)==0&false))) {{
        __CLR4_4_11p61p6lck0y8g6.R.inc(2289);return false;
      }
    }} }else {__CLR4_4_11p61p6lck0y8g6.R.inc(2290);if ((((!type.equals(other.type))&&(__CLR4_4_11p61p6lck0y8g6.R.iget(2291)!=0|true))||(__CLR4_4_11p61p6lck0y8g6.R.iget(2292)==0&false))) {{
      __CLR4_4_11p61p6lck0y8g6.R.inc(2293);return false;
    }
    }}__CLR4_4_11p61p6lck0y8g6.R.inc(2294);return preserveType == other.preserveType;
  }finally{__CLR4_4_11p61p6lck0y8g6.R.flushNeeded();}}

  public boolean isPreserveType() {try{__CLR4_4_11p61p6lck0y8g6.R.inc(2295);
    __CLR4_4_11p61p6lck0y8g6.R.inc(2296);return preserveType;
  }finally{__CLR4_4_11p61p6lck0y8g6.R.flushNeeded();}}
}
