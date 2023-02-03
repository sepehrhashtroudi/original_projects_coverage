/*
 * Copyright (C) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson.stream;

import junit.framework.TestCase;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class JsonWriterTest extends TestCase {


public void testDeepNestingArrays14() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     for (int i = 0; i < 20; i++) { 
         jsonWriter.beginArray(); 
     } 
     for (int i = 0; i < 20; i++) { 
         jsonWriter.endArray(); 
     } 
     assertEquals("[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]]", stringWriter.toString()); 
 } 


public void testPrettyPrintArray15() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.setIndent("   "); 
     jsonWriter.beginArray(); 
     jsonWriter.value(true); 
     jsonWriter.value(false); 
     jsonWriter.value(5.0); 
     jsonWriter.nullValue(); 
     jsonWriter.beginObject(); 
     jsonWriter.name("a").value(6.0); 
     jsonWriter.name("b").value(7.0); 
     jsonWriter.endObject(); 
     jsonWriter.beginArray(); 
     jsonWriter.value(8.0); 
     jsonWriter.value(9.0); 
     jsonWriter.endArray(); 
     jsonWriter.endArray(); 
     String expected = "[\n" + "   true,\n" + "   false,\n" + "   5.0,\n" + "   null,\n" + "   {\n" + "      \"a\": 6.0,\n" + "      \"b\": 7.0\n" + "   },\n" + "   [\n" + "      8.0,\n" + "      9.0\n" + "   ]\n" + "]"; 
     assertEquals(expected, stringWriter.toString()); 
 } 


public void testEmptyObject17() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.beginObject(); 
     jsonWriter.endObject(); 
     assertEquals("{}", stringWriter.toString()); 
 } 


public void testBadNestingArray18() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.beginArray(); 
     jsonWriter.beginArray(); 
     try { 
         jsonWriter.endObject(); 
         fail(); 
     } catch (IllegalStateException expected) { 
     } 
 } 


public void testTwoNames19() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.beginObject(); 
     jsonWriter.name("a"); 
     try { 
         jsonWriter.name("a"); 
         fail(); 
     } catch (IllegalStateException expected) { 
     } 
 } 


public void testNullName20() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.beginObject(); 
     try { 
         jsonWriter.name(null); 
         fail(); 
     } catch (NullPointerException expected) { 
     } 
 } 


public void testWrongTopLevelType21() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     try { 
         jsonWriter.value("a"); 
         fail(); 
     } catch (IllegalStateException expected) { 
     } 
 } 


public void testDoubles22() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.beginArray(); 
     jsonWriter.value(-0.0); 
     jsonWriter.value(1.0); 
     jsonWriter.value(Double.MAX_VALUE); 
     jsonWriter.value(Double.MIN_VALUE); 
     jsonWriter.value(0.0); 
     jsonWriter.value(-0.5); 
     jsonWriter.value(2.2250738585072014E-308); 
     jsonWriter.value(Math.PI); 
     jsonWriter.value(Math.E); 
     jsonWriter.endArray(); 
     jsonWriter.close(); 
     assertEquals("[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]", stringWriter.toString()); 
 } 


public void testNumbers23() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.beginArray(); 
     jsonWriter.value(new BigInteger("0")); 
     jsonWriter.value(new BigInteger("9223372036854775808")); 
     jsonWriter.value(new BigInteger("-9223372036854775809")); 
     jsonWriter.value(new BigDecimal("3.141592653589793238462643383")); 
     jsonWriter.endArray(); 
     jsonWriter.close(); 
     assertEquals("[0," + "9223372036854775808," + "-9223372036854775809," + "3.141592653589793238462643383]", stringWriter.toString()); 
 } 


public void testMultipleTopLevelValues27() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.beginArray().endArray(); 
     try { 
         jsonWriter.beginArray(); 
         fail(); 
     } catch (IllegalStateException expected) { 
     } 
 } 


public void testValueWithoutName28() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.beginObject(); 
     try { 
         jsonWriter.value(true); 
         fail(); 
     } catch (IllegalStateException expected) { 
     } 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
