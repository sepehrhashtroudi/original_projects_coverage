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

import com.google.gson.stream.JsonReader;
import java.io.EOFException;
import java.io.Reader;
import java.io.StringReader;

/**
 * A parser to parse Json into a parse tree of {@link JsonElement}s
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 * @since 1.3
 */
public final class JsonParser {public static class __CLR4_4_115x15xlck0y8c4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,1526,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  
  /**
   * Parses the specified JSON string into a parse tree
   * 
   * @param json JSON text
   * @return a parse tree of {@link JsonElement}s corresponding to the specified JSON 
   * @throws JsonParseException if the specified text is not valid JSON
   * @since 1.3
   */
  public JsonElement parse(String json) throws JsonParseException {try{__CLR4_4_115x15xlck0y8c4.R.inc(1509);
    __CLR4_4_115x15xlck0y8c4.R.inc(1510);return parse(new StringReader(json));
  }finally{__CLR4_4_115x15xlck0y8c4.R.flushNeeded();}}
  
  /**
   * Parses the specified JSON string into a parse tree
   * 
   * @param json JSON text
   * @return a parse tree of {@link JsonElement}s corresponding to the specified JSON 
   * @throws JsonParseException if the specified text is not valid JSON
   * @since 1.3
   */
  public JsonElement parse(Reader json) throws JsonParseException {try{__CLR4_4_115x15xlck0y8c4.R.inc(1511);
    __CLR4_4_115x15xlck0y8c4.R.inc(1512);return parse(new JsonReader(json));
  }finally{__CLR4_4_115x15xlck0y8c4.R.flushNeeded();}}

  /**
   * Returns the next value from the JSON stream as a parse tree.
   *
   * @throws JsonParseException if there is an IOException or if the specified
   *     text is not valid JSON
   */
  public JsonElement parse(JsonReader json) throws JsonParseException {try{__CLR4_4_115x15xlck0y8c4.R.inc(1513);
    __CLR4_4_115x15xlck0y8c4.R.inc(1514);boolean lenient = json.isLenient();
    __CLR4_4_115x15xlck0y8c4.R.inc(1515);json.setLenient(true);
    __CLR4_4_115x15xlck0y8c4.R.inc(1516);try {
      __CLR4_4_115x15xlck0y8c4.R.inc(1517);return Streams.parse(json);
    } catch (StackOverflowError e) {
      __CLR4_4_115x15xlck0y8c4.R.inc(1518);throw new JsonParseException("Failed parsing JSON source: " + json + " to Json", e);
    } catch (OutOfMemoryError e) {
      __CLR4_4_115x15xlck0y8c4.R.inc(1519);throw new JsonParseException("Failed parsing JSON source: " + json + " to Json", e);
    } catch (JsonParseException e) {
      __CLR4_4_115x15xlck0y8c4.R.inc(1520);if ((((e.getCause() instanceof EOFException)&&(__CLR4_4_115x15xlck0y8c4.R.iget(1521)!=0|true))||(__CLR4_4_115x15xlck0y8c4.R.iget(1522)==0&false))) {{
        __CLR4_4_115x15xlck0y8c4.R.inc(1523);return JsonNull.createJsonNull();
      }
      }__CLR4_4_115x15xlck0y8c4.R.inc(1524);throw e;
    } finally {
      __CLR4_4_115x15xlck0y8c4.R.inc(1525);json.setLenient(lenient);
    }
  }finally{__CLR4_4_115x15xlck0y8c4.R.flushNeeded();}}
}
