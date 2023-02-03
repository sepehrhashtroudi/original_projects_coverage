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

import java.io.IOException;
import java.util.Map;

/**
 * A navigator to navigate a tree of JsonElement nodes in Depth-first order
 * 
 * @author Inderjeet Singh
 */
final class JsonTreeNavigator {public static class __CLR4_4_11gu1gulck0y8e5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,1980,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private final JsonElementVisitor visitor;
  private final boolean visitNulls;

  JsonTreeNavigator(JsonElementVisitor visitor, boolean visitNulls) {try{__CLR4_4_11gu1gulck0y8e5.R.inc(1902);
    __CLR4_4_11gu1gulck0y8e5.R.inc(1903);this.visitor = visitor;
    __CLR4_4_11gu1gulck0y8e5.R.inc(1904);this.visitNulls = visitNulls;
  }finally{__CLR4_4_11gu1gulck0y8e5.R.flushNeeded();}}
  
  public void navigate(JsonElement element) throws IOException {try{__CLR4_4_11gu1gulck0y8e5.R.inc(1905);
    __CLR4_4_11gu1gulck0y8e5.R.inc(1906);if ((((element.isJsonNull())&&(__CLR4_4_11gu1gulck0y8e5.R.iget(1907)!=0|true))||(__CLR4_4_11gu1gulck0y8e5.R.iget(1908)==0&false))) {{
      __CLR4_4_11gu1gulck0y8e5.R.inc(1909);visitor.visitNull();
    } }else {__CLR4_4_11gu1gulck0y8e5.R.inc(1910);if ((((element.isJsonArray())&&(__CLR4_4_11gu1gulck0y8e5.R.iget(1911)!=0|true))||(__CLR4_4_11gu1gulck0y8e5.R.iget(1912)==0&false))) {{
      __CLR4_4_11gu1gulck0y8e5.R.inc(1913);JsonArray array = element.getAsJsonArray();
      __CLR4_4_11gu1gulck0y8e5.R.inc(1914);visitor.startArray(array);
      __CLR4_4_11gu1gulck0y8e5.R.inc(1915);boolean isFirst = true;
      __CLR4_4_11gu1gulck0y8e5.R.inc(1916);for (JsonElement child : array) {{
        __CLR4_4_11gu1gulck0y8e5.R.inc(1917);visitChild(array, child, isFirst);
        __CLR4_4_11gu1gulck0y8e5.R.inc(1918);if ((((isFirst)&&(__CLR4_4_11gu1gulck0y8e5.R.iget(1919)!=0|true))||(__CLR4_4_11gu1gulck0y8e5.R.iget(1920)==0&false))) {{
          __CLR4_4_11gu1gulck0y8e5.R.inc(1921);isFirst = false;
        }
      }}
      }__CLR4_4_11gu1gulck0y8e5.R.inc(1922);visitor.endArray(array);
    } }else {__CLR4_4_11gu1gulck0y8e5.R.inc(1923);if ((((element.isJsonObject())&&(__CLR4_4_11gu1gulck0y8e5.R.iget(1924)!=0|true))||(__CLR4_4_11gu1gulck0y8e5.R.iget(1925)==0&false))) {{
      __CLR4_4_11gu1gulck0y8e5.R.inc(1926);JsonObject object = element.getAsJsonObject();
      __CLR4_4_11gu1gulck0y8e5.R.inc(1927);visitor.startObject(object);
      __CLR4_4_11gu1gulck0y8e5.R.inc(1928);boolean isFirst = true;
      __CLR4_4_11gu1gulck0y8e5.R.inc(1929);for (Map.Entry<String, JsonElement> member : object.entrySet()) {{
        __CLR4_4_11gu1gulck0y8e5.R.inc(1930);boolean visited = visitChild(object, member.getKey(), member.getValue(), isFirst);
        __CLR4_4_11gu1gulck0y8e5.R.inc(1931);if ((((visited && isFirst)&&(__CLR4_4_11gu1gulck0y8e5.R.iget(1932)!=0|true))||(__CLR4_4_11gu1gulck0y8e5.R.iget(1933)==0&false))) {{
          __CLR4_4_11gu1gulck0y8e5.R.inc(1934);isFirst = false;
        }
      }}
      }__CLR4_4_11gu1gulck0y8e5.R.inc(1935);visitor.endObject(object);
    } }else {{ // must be JsonPrimitive
      __CLR4_4_11gu1gulck0y8e5.R.inc(1936);visitor.visitPrimitive(element.getAsJsonPrimitive());
    }    
  }}}}finally{__CLR4_4_11gu1gulck0y8e5.R.flushNeeded();}}

  /**
   * Returns true if the child was visited, false if it was skipped.
   */
  private boolean visitChild(JsonObject parent, String childName, JsonElement child, 
      boolean isFirst) throws IOException {try{__CLR4_4_11gu1gulck0y8e5.R.inc(1937);
    __CLR4_4_11gu1gulck0y8e5.R.inc(1938);if ((((child.isJsonNull())&&(__CLR4_4_11gu1gulck0y8e5.R.iget(1939)!=0|true))||(__CLR4_4_11gu1gulck0y8e5.R.iget(1940)==0&false))) {{
      __CLR4_4_11gu1gulck0y8e5.R.inc(1941);if ((((visitNulls)&&(__CLR4_4_11gu1gulck0y8e5.R.iget(1942)!=0|true))||(__CLR4_4_11gu1gulck0y8e5.R.iget(1943)==0&false))) {{
        __CLR4_4_11gu1gulck0y8e5.R.inc(1944);visitor.visitNullObjectMember(parent, childName, isFirst);
        __CLR4_4_11gu1gulck0y8e5.R.inc(1945);navigate(child.getAsJsonNull());
      } }else {{ // Null value is being skipped.
        __CLR4_4_11gu1gulck0y8e5.R.inc(1946);return false;
      }
    }} }else {__CLR4_4_11gu1gulck0y8e5.R.inc(1947);if ((((child.isJsonArray())&&(__CLR4_4_11gu1gulck0y8e5.R.iget(1948)!=0|true))||(__CLR4_4_11gu1gulck0y8e5.R.iget(1949)==0&false))) {{
      __CLR4_4_11gu1gulck0y8e5.R.inc(1950);JsonArray childAsArray = child.getAsJsonArray();
      __CLR4_4_11gu1gulck0y8e5.R.inc(1951);visitor.visitObjectMember(parent, childName, childAsArray, isFirst);
      __CLR4_4_11gu1gulck0y8e5.R.inc(1952);navigate(childAsArray);
    } }else {__CLR4_4_11gu1gulck0y8e5.R.inc(1953);if ((((child.isJsonObject())&&(__CLR4_4_11gu1gulck0y8e5.R.iget(1954)!=0|true))||(__CLR4_4_11gu1gulck0y8e5.R.iget(1955)==0&false))) {{
      __CLR4_4_11gu1gulck0y8e5.R.inc(1956);JsonObject childAsObject = child.getAsJsonObject();
      __CLR4_4_11gu1gulck0y8e5.R.inc(1957);visitor.visitObjectMember(parent, childName, childAsObject, isFirst);
      __CLR4_4_11gu1gulck0y8e5.R.inc(1958);navigate(childAsObject);
    } }else {{ // is a JsonPrimitive
      __CLR4_4_11gu1gulck0y8e5.R.inc(1959);visitor.visitObjectMember(parent, childName, child.getAsJsonPrimitive(), isFirst);          
    }
    }}}__CLR4_4_11gu1gulck0y8e5.R.inc(1960);return true;
  }finally{__CLR4_4_11gu1gulck0y8e5.R.flushNeeded();}}

  /**
   * Returns true if the child was visited, false if it was skipped.
   */
  private void visitChild(JsonArray parent, JsonElement child, boolean isFirst) throws IOException {try{__CLR4_4_11gu1gulck0y8e5.R.inc(1961);
    __CLR4_4_11gu1gulck0y8e5.R.inc(1962);if ((((child.isJsonNull())&&(__CLR4_4_11gu1gulck0y8e5.R.iget(1963)!=0|true))||(__CLR4_4_11gu1gulck0y8e5.R.iget(1964)==0&false))) {{
      __CLR4_4_11gu1gulck0y8e5.R.inc(1965);visitor.visitNullArrayMember(parent, isFirst);
      __CLR4_4_11gu1gulck0y8e5.R.inc(1966);navigate(child);
	  } }else {__CLR4_4_11gu1gulck0y8e5.R.inc(1967);if ((((child.isJsonArray())&&(__CLR4_4_11gu1gulck0y8e5.R.iget(1968)!=0|true))||(__CLR4_4_11gu1gulck0y8e5.R.iget(1969)==0&false))) {{
      __CLR4_4_11gu1gulck0y8e5.R.inc(1970);JsonArray childAsArray = child.getAsJsonArray();
      __CLR4_4_11gu1gulck0y8e5.R.inc(1971);visitor.visitArrayMember(parent, childAsArray, isFirst);
      __CLR4_4_11gu1gulck0y8e5.R.inc(1972);navigate(childAsArray);
    } }else {__CLR4_4_11gu1gulck0y8e5.R.inc(1973);if ((((child.isJsonObject())&&(__CLR4_4_11gu1gulck0y8e5.R.iget(1974)!=0|true))||(__CLR4_4_11gu1gulck0y8e5.R.iget(1975)==0&false))) {{
      __CLR4_4_11gu1gulck0y8e5.R.inc(1976);JsonObject childAsObject = child.getAsJsonObject();
      __CLR4_4_11gu1gulck0y8e5.R.inc(1977);visitor.visitArrayMember(parent, childAsObject, isFirst);
      __CLR4_4_11gu1gulck0y8e5.R.inc(1978);navigate(childAsObject);
    } }else {{ // is a JsonPrimitive
      __CLR4_4_11gu1gulck0y8e5.R.inc(1979);visitor.visitArrayMember(parent, child.getAsJsonPrimitive(), isFirst);          
    }
  }}}}finally{__CLR4_4_11gu1gulck0y8e5.R.flushNeeded();}}
}
