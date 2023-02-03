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

package com.google.gson.metrics;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tests to measure performance for Gson. All tests in this file will be disabled in code. To run
 * them remove disabled_ prefix from the tests and run them.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PerformanceTest extends TestCase {static class __CLR4_4_16u36u3lck0y9dn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,9053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final int COLLECTION_SIZE = 5000;

  private static final int NUM_ITERATIONS = 100;

  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8859);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8860);super.setUp();
    __CLR4_4_16u36u3lck0y9dn.R.inc(8861);gson = new Gson();
  }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
  
  public void testDummy() {__CLR4_4_16u36u3lck0y9dn.R.globalSliceStart(getClass().getName(),8862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17qx0vx6u6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16u36u3lck0y9dn.R.rethrow($CLV_t2$);}finally{__CLR4_4_16u36u3lck0y9dn.R.globalSliceEnd(getClass().getName(),"com.google.gson.metrics.PerformanceTest.testDummy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17qx0vx6u6(){try{__CLR4_4_16u36u3lck0y9dn.R.inc(8862);    
    // This is here to prevent Junit for complaining when we disable all tests.
  }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}  

  public void disabled_testStringDeserialization() {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8863);    
    __CLR4_4_16u36u3lck0y9dn.R.inc(8864);StringBuilder sb = new StringBuilder(8096);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8865);sb.append("Error Yippie");

    __CLR4_4_16u36u3lck0y9dn.R.inc(8866);while (true) {{
      __CLR4_4_16u36u3lck0y9dn.R.inc(8867);try {
        __CLR4_4_16u36u3lck0y9dn.R.inc(8868);String stackTrace = sb.toString();
        __CLR4_4_16u36u3lck0y9dn.R.inc(8869);sb.append(stackTrace);
        __CLR4_4_16u36u3lck0y9dn.R.inc(8870);String json = "{\"message\":\"Error message.\"," + "\"stackTrace\":\"" + stackTrace + "\"}";
        __CLR4_4_16u36u3lck0y9dn.R.inc(8871);parseLongJson(json);
        __CLR4_4_16u36u3lck0y9dn.R.inc(8872);System.out.println("Gson could handle a string of size: " + stackTrace.length());
      } catch (JsonParseException expected) {
        __CLR4_4_16u36u3lck0y9dn.R.inc(8873);break;
      }
    }
  }}finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
  
  private void parseLongJson(String json) throws JsonParseException {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8874);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8875);ExceptionHolder target = gson.fromJson(json, ExceptionHolder.class);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8876);assertTrue(target.message.contains("Error"));
    __CLR4_4_16u36u3lck0y9dn.R.inc(8877);assertTrue(target.stackTrace.contains("Yippie"));
  }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}

  private static class ExceptionHolder {
    public final String message;
    public final String stackTrace;
    
    // For use by Gson
    @SuppressWarnings("unused")
    private ExceptionHolder() {
      this("", "");__CLR4_4_16u36u3lck0y9dn.R.inc(8879);try{__CLR4_4_16u36u3lck0y9dn.R.inc(8878);
    }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
    public ExceptionHolder(String message, String stackTrace) {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8880);
      __CLR4_4_16u36u3lck0y9dn.R.inc(8881);this.message = message;
      __CLR4_4_16u36u3lck0y9dn.R.inc(8882);this.stackTrace = stackTrace;
    }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
  }

  @SuppressWarnings("unused")
  private static class CollectionEntry {
    final String name;
    final String value;

    // For use by Gson
    private CollectionEntry() {
      this(null, null);__CLR4_4_16u36u3lck0y9dn.R.inc(8884);try{__CLR4_4_16u36u3lck0y9dn.R.inc(8883);
    }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}

    CollectionEntry(String name, String value) {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8885);
      __CLR4_4_16u36u3lck0y9dn.R.inc(8886);this.name = name;
      __CLR4_4_16u36u3lck0y9dn.R.inc(8887);this.value = value;
    }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
  }
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
   */
  public void disabled_testLargeCollectionSerialization() {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8888);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8889);int count = 1400000;
    __CLR4_4_16u36u3lck0y9dn.R.inc(8890);List<CollectionEntry> list = new ArrayList<CollectionEntry>(count);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8891);for (int i = 0; (((i < count)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(8892)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(8893)==0&false)); ++i) {{
      __CLR4_4_16u36u3lck0y9dn.R.inc(8894);list.add(new CollectionEntry("name"+i,"value"+i));
    }    
    }__CLR4_4_16u36u3lck0y9dn.R.inc(8895);gson.toJson(list);
  }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
   */
  public void disabled_testLargeCollectionDeserialization() {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8896);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8897);StringBuilder sb = new StringBuilder();
    __CLR4_4_16u36u3lck0y9dn.R.inc(8898);int count = 87000;
    __CLR4_4_16u36u3lck0y9dn.R.inc(8899);boolean first = true;
    __CLR4_4_16u36u3lck0y9dn.R.inc(8900);sb.append('[');
    __CLR4_4_16u36u3lck0y9dn.R.inc(8901);for (int i = 0; (((i < count)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(8902)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(8903)==0&false)); ++i) {{
      __CLR4_4_16u36u3lck0y9dn.R.inc(8904);if ((((first)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(8905)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(8906)==0&false))) {{
        __CLR4_4_16u36u3lck0y9dn.R.inc(8907);first = false;
      } }else {{
        __CLR4_4_16u36u3lck0y9dn.R.inc(8908);sb.append(',');
      }
      }__CLR4_4_16u36u3lck0y9dn.R.inc(8909);sb.append("{name:'name").append(i).append("',value:'value").append(i).append("'}");
    }    
    }__CLR4_4_16u36u3lck0y9dn.R.inc(8910);sb.append(']');
    __CLR4_4_16u36u3lck0y9dn.R.inc(8911);String json = sb.toString();
    __CLR4_4_16u36u3lck0y9dn.R.inc(8912);Type collectionType = new TypeToken<ArrayList<CollectionEntry>>(){}.getType();    
    __CLR4_4_16u36u3lck0y9dn.R.inc(8913);List<CollectionEntry> list = gson.fromJson(json, collectionType);       
    __CLR4_4_16u36u3lck0y9dn.R.inc(8914);assertEquals(count, list.size());
  }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}

  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
   */
  // Last I tested, Gson was able to serialize upto 14MB byte array
  public void disabled_testByteArraySerialization() {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8915);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8916);for (int size = 4145152; true; size += 1036288) {{
      __CLR4_4_16u36u3lck0y9dn.R.inc(8917);byte[] ba = new byte[size];
      __CLR4_4_16u36u3lck0y9dn.R.inc(8918);for (int i = 0; (((i < size)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(8919)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(8920)==0&false)); ++i) {{
        __CLR4_4_16u36u3lck0y9dn.R.inc(8921);ba[i] = 0x05;
      }
      }__CLR4_4_16u36u3lck0y9dn.R.inc(8922);gson.toJson(ba);
      __CLR4_4_16u36u3lck0y9dn.R.inc(8923);System.out.printf("Gson could serialize a byte array of size: %d\n", size);
    }
  }}finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
   */
  // Last I tested, Gson was able to deserialize a byte array of 11MB
  public void disable_testByteArrayDeserialization() {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8924);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8925);for (int numElements = 10639296; true; numElements += 16384) {{
      __CLR4_4_16u36u3lck0y9dn.R.inc(8926);StringBuilder sb = new StringBuilder(numElements*2);
      __CLR4_4_16u36u3lck0y9dn.R.inc(8927);sb.append("[");
      __CLR4_4_16u36u3lck0y9dn.R.inc(8928);boolean first = true;
      __CLR4_4_16u36u3lck0y9dn.R.inc(8929);for (int i = 0; (((i < numElements)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(8930)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(8931)==0&false)); ++i) {{
        __CLR4_4_16u36u3lck0y9dn.R.inc(8932);if ((((first)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(8933)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(8934)==0&false))) {{
          __CLR4_4_16u36u3lck0y9dn.R.inc(8935);first = false;
        } }else {{
          __CLR4_4_16u36u3lck0y9dn.R.inc(8936);sb.append(",");
        }
        }__CLR4_4_16u36u3lck0y9dn.R.inc(8937);sb.append("5");
      }
      }__CLR4_4_16u36u3lck0y9dn.R.inc(8938);sb.append("]");
      __CLR4_4_16u36u3lck0y9dn.R.inc(8939);String json = sb.toString();
      __CLR4_4_16u36u3lck0y9dn.R.inc(8940);byte[] ba = gson.fromJson(json, byte[].class);
      __CLR4_4_16u36u3lck0y9dn.R.inc(8941);System.out.printf("Gson could deserialize a byte array of size: %d\n", ba.length);
    }
  }}finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}

// The tests to measure serialization and deserialization performance of Gson
// Based on the discussion at
// http://groups.google.com/group/google-gson/browse_thread/thread/7a50b17a390dfaeb
// Test results: 10/19/2009 
// Serialize classes avg time: 60 ms
// Deserialized classes avg time: 70 ms
// Serialize exposed classes avg time: 159 ms
// Deserialized exposed classes avg time: 173 ms
  
  public void disabled_testSerializeClasses() {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8942);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8943);ClassWithList c = new ClassWithList("str"); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(8944);for (int i = 0; (((i < COLLECTION_SIZE)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(8945)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(8946)==0&false)); ++i) {{ 
      __CLR4_4_16u36u3lck0y9dn.R.inc(8947);c.list.add(new ClassWithField("element-" + i)); 
    }
    }__CLR4_4_16u36u3lck0y9dn.R.inc(8948);StringWriter w = new StringWriter(); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(8949);long t1 = System.currentTimeMillis(); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(8950);for (int i = 0; (((i < NUM_ITERATIONS)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(8951)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(8952)==0&false)); ++i) {{ 
      __CLR4_4_16u36u3lck0y9dn.R.inc(8953);gson.toJson(c, w); 
    } 
    }__CLR4_4_16u36u3lck0y9dn.R.inc(8954);long t2 = System.currentTimeMillis(); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(8955);long avg = (t2 - t1) / NUM_ITERATIONS;
    __CLR4_4_16u36u3lck0y9dn.R.inc(8956);System.out.printf("Serialize classes avg time: %d ms\n", avg);     
  }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}

  public void disabled_testDeserializeClasses() {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8957);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8958);String json = buildJsonForClassWithList();
    __CLR4_4_16u36u3lck0y9dn.R.inc(8959);ClassWithList[] target = new ClassWithList[NUM_ITERATIONS];
    __CLR4_4_16u36u3lck0y9dn.R.inc(8960);long t1 = System.currentTimeMillis(); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(8961);for (int i = 0; (((i < NUM_ITERATIONS)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(8962)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(8963)==0&false)); ++i) {{
      __CLR4_4_16u36u3lck0y9dn.R.inc(8964);target[i] = gson.fromJson(json, ClassWithList.class);
    }
    }__CLR4_4_16u36u3lck0y9dn.R.inc(8965);long t2 = System.currentTimeMillis(); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(8966);long avg = (t2 - t1) / NUM_ITERATIONS;
    __CLR4_4_16u36u3lck0y9dn.R.inc(8967);System.out.printf("Deserialize classes avg time: %d ms\n", avg);     
  }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
  
  public void disable_testLargeObjectSerializationAndDeserialization() {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8968);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8969);Map<String, Long> largeObject = new HashMap<String, Long>();
    __CLR4_4_16u36u3lck0y9dn.R.inc(8970);for (long l = 0; (((l < 100000)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(8971)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(8972)==0&false)); l++) {{
      __CLR4_4_16u36u3lck0y9dn.R.inc(8973);largeObject.put("field" + l, l);
    }
    
    }__CLR4_4_16u36u3lck0y9dn.R.inc(8974);long t1 = System.currentTimeMillis(); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(8975);String json = gson.toJson(largeObject);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8976);long t2 = System.currentTimeMillis();
    __CLR4_4_16u36u3lck0y9dn.R.inc(8977);System.out.printf("Large object serialized in: %d ms\n", (t2 - t1));

    __CLR4_4_16u36u3lck0y9dn.R.inc(8978);t1 = System.currentTimeMillis(); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(8979);gson.fromJson(json, new TypeToken<Map<String, Long>>() {}.getType());
    __CLR4_4_16u36u3lck0y9dn.R.inc(8980);t2 = System.currentTimeMillis();
    __CLR4_4_16u36u3lck0y9dn.R.inc(8981);System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1));
    
  }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}

  public void disabled_testSerializeExposedClasses() {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8982);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8983);ClassWithListOfObjects c1 = new ClassWithListOfObjects("str"); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(8984);for (int i1 = 0; (((i1 < COLLECTION_SIZE)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(8985)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(8986)==0&false)); ++i1) {{ 
      __CLR4_4_16u36u3lck0y9dn.R.inc(8987);c1.list.add(new ClassWithExposedField("element-" + i1)); 
    }
    }__CLR4_4_16u36u3lck0y9dn.R.inc(8988);ClassWithListOfObjects c = c1; 
    __CLR4_4_16u36u3lck0y9dn.R.inc(8989);StringWriter w = new StringWriter(); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(8990);long t1 = System.currentTimeMillis(); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(8991);for (int i = 0; (((i < NUM_ITERATIONS)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(8992)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(8993)==0&false)); ++i) {{ 
      __CLR4_4_16u36u3lck0y9dn.R.inc(8994);gson.toJson(c, w); 
    } 
    }__CLR4_4_16u36u3lck0y9dn.R.inc(8995);long t2 = System.currentTimeMillis(); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(8996);long avg = (t2 - t1) / NUM_ITERATIONS;
    __CLR4_4_16u36u3lck0y9dn.R.inc(8997);System.out.printf("Serialize exposed classes avg time: %d ms\n", avg);     
  }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}

  public void disabled_testDeserializeExposedClasses() {try{__CLR4_4_16u36u3lck0y9dn.R.inc(8998);
    __CLR4_4_16u36u3lck0y9dn.R.inc(8999);String json = buildJsonForClassWithList();
    __CLR4_4_16u36u3lck0y9dn.R.inc(9000);ClassWithListOfObjects[] target = new ClassWithListOfObjects[NUM_ITERATIONS];
    __CLR4_4_16u36u3lck0y9dn.R.inc(9001);long t1 = System.currentTimeMillis(); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(9002);for (int i = 0; (((i < NUM_ITERATIONS)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(9003)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(9004)==0&false)); ++i) {{
      __CLR4_4_16u36u3lck0y9dn.R.inc(9005);target[i] = gson.fromJson(json, ClassWithListOfObjects.class);
    }
    }__CLR4_4_16u36u3lck0y9dn.R.inc(9006);long t2 = System.currentTimeMillis(); 
    __CLR4_4_16u36u3lck0y9dn.R.inc(9007);long avg = (t2 - t1) / NUM_ITERATIONS;
    __CLR4_4_16u36u3lck0y9dn.R.inc(9008);System.out.printf("Deserialize exposed classes avg time: %d ms\n", avg);     
  }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}

  public void disabled_testLargeGsonMapRoundTrip() throws Exception {try{__CLR4_4_16u36u3lck0y9dn.R.inc(9009);
    __CLR4_4_16u36u3lck0y9dn.R.inc(9010);Map<Long, Long> original = new HashMap<Long, Long>();
    __CLR4_4_16u36u3lck0y9dn.R.inc(9011);for (long i = 0; (((i < 1000000)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(9012)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(9013)==0&false)); i++) {{
      __CLR4_4_16u36u3lck0y9dn.R.inc(9014);original.put(i, i + 1);
    }

    }__CLR4_4_16u36u3lck0y9dn.R.inc(9015);Gson gson = new Gson();
    __CLR4_4_16u36u3lck0y9dn.R.inc(9016);String json = gson.toJson(original);
    __CLR4_4_16u36u3lck0y9dn.R.inc(9017);Type longToLong = new TypeToken<Map<Long, Long>>(){}.getType();
    __CLR4_4_16u36u3lck0y9dn.R.inc(9018);gson.fromJson(json, longToLong);
  }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}

  private String buildJsonForClassWithList() {try{__CLR4_4_16u36u3lck0y9dn.R.inc(9019);
    __CLR4_4_16u36u3lck0y9dn.R.inc(9020);StringBuilder sb = new StringBuilder("{");
    __CLR4_4_16u36u3lck0y9dn.R.inc(9021);sb.append("field:").append("'str',");
    __CLR4_4_16u36u3lck0y9dn.R.inc(9022);sb.append("list:[");
    __CLR4_4_16u36u3lck0y9dn.R.inc(9023);boolean first = true;
    __CLR4_4_16u36u3lck0y9dn.R.inc(9024);for (int i = 0; (((i < COLLECTION_SIZE)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(9025)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(9026)==0&false)); ++i) {{
      __CLR4_4_16u36u3lck0y9dn.R.inc(9027);if ((((first)&&(__CLR4_4_16u36u3lck0y9dn.R.iget(9028)!=0|true))||(__CLR4_4_16u36u3lck0y9dn.R.iget(9029)==0&false))) {{
        __CLR4_4_16u36u3lck0y9dn.R.inc(9030);first = false;
      } }else {{
        __CLR4_4_16u36u3lck0y9dn.R.inc(9031);sb.append(",");
      }
      }__CLR4_4_16u36u3lck0y9dn.R.inc(9032);sb.append("{field:'element-" + i + "'}");
    }
    }__CLR4_4_16u36u3lck0y9dn.R.inc(9033);sb.append("]");
    __CLR4_4_16u36u3lck0y9dn.R.inc(9034);sb.append("}");
    __CLR4_4_16u36u3lck0y9dn.R.inc(9035);String json = sb.toString();
    __CLR4_4_16u36u3lck0y9dn.R.inc(9036);return json;
  }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}

  @SuppressWarnings("unused")
  private static final class ClassWithList { 
    final String field; 
    final List<ClassWithField> list = new ArrayList<ClassWithField>(COLLECTION_SIZE);
    ClassWithList() {
      this(null);__CLR4_4_16u36u3lck0y9dn.R.inc(9038);try{__CLR4_4_16u36u3lck0y9dn.R.inc(9037);
    }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
    ClassWithList(String field) {try{__CLR4_4_16u36u3lck0y9dn.R.inc(9039);
      __CLR4_4_16u36u3lck0y9dn.R.inc(9040);this.field = field;
    }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
  } 

  @SuppressWarnings("unused")
  private static final class ClassWithField { 
    final String field;
    ClassWithField() {
      this("");__CLR4_4_16u36u3lck0y9dn.R.inc(9042);try{__CLR4_4_16u36u3lck0y9dn.R.inc(9041);
    }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
    public ClassWithField(String field) {try{__CLR4_4_16u36u3lck0y9dn.R.inc(9043); 
      __CLR4_4_16u36u3lck0y9dn.R.inc(9044);this.field = field; 
    }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}} 
  }

  @SuppressWarnings("unused")
  private static final class ClassWithListOfObjects { 
    @Expose 
    final String field; 
    @Expose 
    final List<ClassWithExposedField> list = new ArrayList<ClassWithExposedField>(COLLECTION_SIZE);
    ClassWithListOfObjects() {
      this(null);__CLR4_4_16u36u3lck0y9dn.R.inc(9046);try{__CLR4_4_16u36u3lck0y9dn.R.inc(9045);
    }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
    ClassWithListOfObjects(String field) {try{__CLR4_4_16u36u3lck0y9dn.R.inc(9047);
      __CLR4_4_16u36u3lck0y9dn.R.inc(9048);this.field = field;
    }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
  } 

  @SuppressWarnings("unused")
  private static final class ClassWithExposedField { 
    @Expose 
    final String field;
    ClassWithExposedField() {
      this("");__CLR4_4_16u36u3lck0y9dn.R.inc(9050);try{__CLR4_4_16u36u3lck0y9dn.R.inc(9049);
    }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}}
    ClassWithExposedField(String field) {try{__CLR4_4_16u36u3lck0y9dn.R.inc(9051); 
      __CLR4_4_16u36u3lck0y9dn.R.inc(9052);this.field = field; 
    }finally{__CLR4_4_16u36u3lck0y9dn.R.flushNeeded();}} 
  }
}
