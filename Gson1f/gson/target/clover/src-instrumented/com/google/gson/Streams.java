/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2010 Google Inc.
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
import com.google.gson.stream.MalformedJsonException;
import com.google.gson.stream.JsonWriter;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

/**
 * Reads and writes GSON parse trees over streams.
 */
@java.lang.SuppressWarnings({"fallthrough"}) final class Streams {public static class __CLR4_4_11yn1ynlck0y8hp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,2650,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /**
   * Takes a reader in any state and returns the next value as a JsonElement.
   */
  static JsonElement parse(JsonReader reader) throws JsonParseException {try{__CLR4_4_11yn1ynlck0y8hp.R.inc(2543);
    __CLR4_4_11yn1ynlck0y8hp.R.inc(2544);try {
      boolean __CLB4_4_1_bool0=false;__CLR4_4_11yn1ynlck0y8hp.R.inc(2545);switch (reader.peek()) {
      case STRING:if (!__CLB4_4_1_bool0) {__CLR4_4_11yn1ynlck0y8hp.R.inc(2546);__CLB4_4_1_bool0=true;}
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2547);return new JsonPrimitive(reader.nextString());
      case NUMBER:if (!__CLB4_4_1_bool0) {__CLR4_4_11yn1ynlck0y8hp.R.inc(2548);__CLB4_4_1_bool0=true;}
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2549);String number = reader.nextString();
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2550);return new JsonPrimitive(JsonPrimitive.stringToNumber(number));
      case BOOLEAN:if (!__CLB4_4_1_bool0) {__CLR4_4_11yn1ynlck0y8hp.R.inc(2551);__CLB4_4_1_bool0=true;}
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2552);return new JsonPrimitive(reader.nextBoolean());
      case NULL:if (!__CLB4_4_1_bool0) {__CLR4_4_11yn1ynlck0y8hp.R.inc(2553);__CLB4_4_1_bool0=true;}
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2554);reader.nextNull();
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2555);return JsonNull.createJsonNull();
      case BEGIN_ARRAY:if (!__CLB4_4_1_bool0) {__CLR4_4_11yn1ynlck0y8hp.R.inc(2556);__CLB4_4_1_bool0=true;}
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2557);JsonArray array = new JsonArray();
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2558);reader.beginArray();
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2559);while ((((reader.hasNext())&&(__CLR4_4_11yn1ynlck0y8hp.R.iget(2560)!=0|true))||(__CLR4_4_11yn1ynlck0y8hp.R.iget(2561)==0&false))) {{
          __CLR4_4_11yn1ynlck0y8hp.R.inc(2562);array.add(parse(reader));
        }
        }__CLR4_4_11yn1ynlck0y8hp.R.inc(2563);reader.endArray();
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2564);return array;
      case BEGIN_OBJECT:if (!__CLB4_4_1_bool0) {__CLR4_4_11yn1ynlck0y8hp.R.inc(2565);__CLB4_4_1_bool0=true;}
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2566);JsonObject object = new JsonObject();
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2567);reader.beginObject();
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2568);while ((((reader.hasNext())&&(__CLR4_4_11yn1ynlck0y8hp.R.iget(2569)!=0|true))||(__CLR4_4_11yn1ynlck0y8hp.R.iget(2570)==0&false))) {{
          __CLR4_4_11yn1ynlck0y8hp.R.inc(2571);object.add(reader.nextName(), parse(reader));
        }
        }__CLR4_4_11yn1ynlck0y8hp.R.inc(2572);reader.endObject();
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2573);return object;
      case END_DOCUMENT:if (!__CLB4_4_1_bool0) {__CLR4_4_11yn1ynlck0y8hp.R.inc(2574);__CLB4_4_1_bool0=true;}
      case NAME:if (!__CLB4_4_1_bool0) {__CLR4_4_11yn1ynlck0y8hp.R.inc(2575);__CLB4_4_1_bool0=true;}
      case END_OBJECT:if (!__CLB4_4_1_bool0) {__CLR4_4_11yn1ynlck0y8hp.R.inc(2576);__CLB4_4_1_bool0=true;}
      case END_ARRAY:if (!__CLB4_4_1_bool0) {__CLR4_4_11yn1ynlck0y8hp.R.inc(2577);__CLB4_4_1_bool0=true;}
      default:if (!__CLB4_4_1_bool0) {__CLR4_4_11yn1ynlck0y8hp.R.inc(2578);__CLB4_4_1_bool0=true;}
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2579);throw new IllegalArgumentException();
      }
    } catch (EOFException e) {
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2580);return JsonNull.createJsonNull();
    } catch (MalformedJsonException e) {
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2581);throw new JsonSyntaxException(e);
    } catch (IOException e) {
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2582);throw new JsonIOException(e);
    } catch (NumberFormatException e) {
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2583);throw new JsonSyntaxException(e);
    }
  }finally{__CLR4_4_11yn1ynlck0y8hp.R.flushNeeded();}}

  /**
   * Writes the JSON element to the writer, recursively.
   */
  static void write(JsonElement element, boolean serializeNulls, JsonWriter writer)
      throws IOException {try{__CLR4_4_11yn1ynlck0y8hp.R.inc(2584);
    __CLR4_4_11yn1ynlck0y8hp.R.inc(2585);if ((((element == null || element.isJsonNull())&&(__CLR4_4_11yn1ynlck0y8hp.R.iget(2586)!=0|true))||(__CLR4_4_11yn1ynlck0y8hp.R.iget(2587)==0&false))) {{
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2588);if ((((serializeNulls)&&(__CLR4_4_11yn1ynlck0y8hp.R.iget(2589)!=0|true))||(__CLR4_4_11yn1ynlck0y8hp.R.iget(2590)==0&false))) {{
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2591);writer.nullValue();
      }

    }} }else {__CLR4_4_11yn1ynlck0y8hp.R.inc(2592);if ((((element.isJsonPrimitive())&&(__CLR4_4_11yn1ynlck0y8hp.R.iget(2593)!=0|true))||(__CLR4_4_11yn1ynlck0y8hp.R.iget(2594)==0&false))) {{
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2595);JsonPrimitive primitive = element.getAsJsonPrimitive();
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2596);if ((((primitive.isNumber())&&(__CLR4_4_11yn1ynlck0y8hp.R.iget(2597)!=0|true))||(__CLR4_4_11yn1ynlck0y8hp.R.iget(2598)==0&false))) {{
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2599);writer.value(primitive.getAsNumber());
      } }else {__CLR4_4_11yn1ynlck0y8hp.R.inc(2600);if ((((primitive.isBoolean())&&(__CLR4_4_11yn1ynlck0y8hp.R.iget(2601)!=0|true))||(__CLR4_4_11yn1ynlck0y8hp.R.iget(2602)==0&false))) {{
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2603);writer.value(primitive.getAsBoolean());
      } }else {{
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2604);writer.value(primitive.getAsString());
      }

    }}} }else {__CLR4_4_11yn1ynlck0y8hp.R.inc(2605);if ((((element.isJsonArray())&&(__CLR4_4_11yn1ynlck0y8hp.R.iget(2606)!=0|true))||(__CLR4_4_11yn1ynlck0y8hp.R.iget(2607)==0&false))) {{
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2608);writer.beginArray();
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2609);for (JsonElement e : element.getAsJsonArray()) {{
        /* always print null when its parent element is an array! */
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2610);if ((((e.isJsonNull())&&(__CLR4_4_11yn1ynlck0y8hp.R.iget(2611)!=0|true))||(__CLR4_4_11yn1ynlck0y8hp.R.iget(2612)==0&false))) {{
          __CLR4_4_11yn1ynlck0y8hp.R.inc(2613);writer.nullValue();
          __CLR4_4_11yn1ynlck0y8hp.R.inc(2614);continue;
        }
        }__CLR4_4_11yn1ynlck0y8hp.R.inc(2615);write(e, serializeNulls, writer);
      }
      }__CLR4_4_11yn1ynlck0y8hp.R.inc(2616);writer.endArray();

    } }else {__CLR4_4_11yn1ynlck0y8hp.R.inc(2617);if ((((element.isJsonObject())&&(__CLR4_4_11yn1ynlck0y8hp.R.iget(2618)!=0|true))||(__CLR4_4_11yn1ynlck0y8hp.R.iget(2619)==0&false))) {{
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2620);writer.beginObject();
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2621);for (Map.Entry<String, JsonElement> e : element.getAsJsonObject().entrySet()) {{
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2622);JsonElement value = e.getValue();
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2623);if ((((!serializeNulls && value.isJsonNull())&&(__CLR4_4_11yn1ynlck0y8hp.R.iget(2624)!=0|true))||(__CLR4_4_11yn1ynlck0y8hp.R.iget(2625)==0&false))) {{
          __CLR4_4_11yn1ynlck0y8hp.R.inc(2626);continue;
        }
        }__CLR4_4_11yn1ynlck0y8hp.R.inc(2627);writer.name(e.getKey());
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2628);write(value, serializeNulls, writer);
      }
      }__CLR4_4_11yn1ynlck0y8hp.R.inc(2629);writer.endObject();

    } }else {{
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2630);throw new IllegalArgumentException("Couldn't write " + element.getClass());
    }
  }}}}}finally{__CLR4_4_11yn1ynlck0y8hp.R.flushNeeded();}}

  static Writer writerForAppendable(Appendable appendable) {try{__CLR4_4_11yn1ynlck0y8hp.R.inc(2631);
    __CLR4_4_11yn1ynlck0y8hp.R.inc(2632);return (((appendable instanceof Writer )&&(__CLR4_4_11yn1ynlck0y8hp.R.iget(2633)!=0|true))||(__CLR4_4_11yn1ynlck0y8hp.R.iget(2634)==0&false))? (Writer) appendable : new AppendableWriter(appendable);
  }finally{__CLR4_4_11yn1ynlck0y8hp.R.flushNeeded();}}

  /**
   * Adapts an {@link Appendable} so it can be passed anywhere a {@link Writer}
   * is used.
   */
  private static class AppendableWriter extends Writer {
    private final Appendable appendable;
    private final CurrentWrite currentWrite = new CurrentWrite();

    private AppendableWriter(Appendable appendable) {try{__CLR4_4_11yn1ynlck0y8hp.R.inc(2635);
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2636);this.appendable = appendable;
    }finally{__CLR4_4_11yn1ynlck0y8hp.R.flushNeeded();}}

    @Override public void write(char[] chars, int offset, int length) throws IOException {try{__CLR4_4_11yn1ynlck0y8hp.R.inc(2637);
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2638);currentWrite.chars = chars;
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2639);appendable.append(currentWrite, offset, offset + length);
    }finally{__CLR4_4_11yn1ynlck0y8hp.R.flushNeeded();}}

    @Override public void write(int i) throws IOException {try{__CLR4_4_11yn1ynlck0y8hp.R.inc(2640);
      __CLR4_4_11yn1ynlck0y8hp.R.inc(2641);appendable.append((char) i);
    }finally{__CLR4_4_11yn1ynlck0y8hp.R.flushNeeded();}}

    @Override public void flush() throws IOException {try{__CLR4_4_11yn1ynlck0y8hp.R.inc(2642);}finally{__CLR4_4_11yn1ynlck0y8hp.R.flushNeeded();}}
    @Override public void close() throws IOException {try{__CLR4_4_11yn1ynlck0y8hp.R.inc(2643);}finally{__CLR4_4_11yn1ynlck0y8hp.R.flushNeeded();}}

    /**
     * A mutable char sequence pointing at a single char[].
     */
    static class CurrentWrite implements CharSequence {
      char[] chars;
      public int length() {try{__CLR4_4_11yn1ynlck0y8hp.R.inc(2644);
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2645);return chars.length;
      }finally{__CLR4_4_11yn1ynlck0y8hp.R.flushNeeded();}}
      public char charAt(int i) {try{__CLR4_4_11yn1ynlck0y8hp.R.inc(2646);
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2647);return chars[i];
      }finally{__CLR4_4_11yn1ynlck0y8hp.R.flushNeeded();}}
      public CharSequence subSequence(int start, int end) {try{__CLR4_4_11yn1ynlck0y8hp.R.inc(2648);
        __CLR4_4_11yn1ynlck0y8hp.R.inc(2649);return new String(chars, start, end - start);
      }finally{__CLR4_4_11yn1ynlck0y8hp.R.flushNeeded();}}
    }
  }
}
