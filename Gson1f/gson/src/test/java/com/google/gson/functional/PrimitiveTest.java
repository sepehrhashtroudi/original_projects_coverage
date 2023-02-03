/*
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

package com.google.gson.functional;

import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.google.gson.*;
import junit.framework.TestCase;

import com.google.gson.common.TestTypes.CrazyLongTypeAdapter;

/**
 * Functional tests for Json primitive values: integers, and floating point numbers.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PrimitiveTest extends TestCase {
  private Gson gson;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new Gson();
  }


public void testBadValueForBigIntegerDeserialization108() { 
     try { 
         gson.fromJson("15.099", BigInteger.class); 
         fail("BigInteger can not be decimal values."); 
     } catch (JsonParseException expected) { 
     } 
 } 


public void testNumberSerialization109() { 
     Number expected = 1L; 
     String json = gson.toJson(expected); 
     assertEquals(expected.toString(), json); 
     json = gson.toJson(expected, Number.class); 
     assertEquals(expected.toString(), json); 
 } 


public void testNumberDeserialization110() { 
     String json = "1"; 
     Number expected = new Integer(json); 
     Number actual = gson.fromJson(json, Number.class); 
     assertEquals(expected.intValue(), actual.intValue()); 
     json = String.valueOf(Long.MAX_VALUE); 
     expected = new Long(json); 
     actual = gson.fromJson(json, Number.class); 
     assertEquals(expected.longValue(), actual.longValue()); 
 } 


public void testFloatInfinitySerialization112() { 
     Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create(); 
     float infinity = Float.POSITIVE_INFINITY; 
     assertEquals("Infinity", gson.toJson(infinity)); 
     assertEquals("Infinity", gson.toJson(Float.POSITIVE_INFINITY)); 
 } 


public void testFloatNaNSerializationNotSupportedByDefault113() { 
     try { 
         float nan = Float.NaN; 
         gson.toJson(nan); 
         fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
     try { 
         gson.toJson(Float.NaN); 
         fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
 } 


public void testDoubleNaNSerializationNotSupportedByDefault116() { 
     try { 
         double nan = Double.NaN; 
         gson.toJson(nan); 
         fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
     try { 
         gson.toJson(Double.NaN); 
         fail("Gson should not accept NaN for serialization"); 
     } catch (IllegalArgumentException expected) { 
     } 
 } 


public void testDoubleNoFractAsStringRepresentationDeserialization117() { 
     String doubleValue = "1E+5"; 
     Double expected = Double.valueOf(doubleValue); 
     Double actual = gson.fromJson(doubleValue, Double.class); 
     assertEquals(expected, actual); 
     double actual1 = gson.fromJson(doubleValue, double.class); 
     assertEquals(expected.doubleValue(), actual1); 
 } 


public void testBigDecimalInASingleElementArrayDeserialization134() { 
     BigDecimal expected = new BigDecimal("-122.08e-21"); 
     BigDecimal actual = gson.fromJson("[-122.08e-21]", BigDecimal.class); 
     assertEquals(expected, actual); 
 } 


public void testBigIntegerInASingleElementArrayDeserialization135() { 
     BigInteger expected = new BigInteger("34343434343424242423432323243243242"); 
     BigInteger actual = gson.fromJson("[34343434343424242423432323243243242]", BigInteger.class); 
     assertEquals(expected, actual); 
 } 


public void testPrimitiveBooleanAutoboxedInASingleElementArrayDeserialization136() { 
     assertEquals(Boolean.FALSE, gson.fromJson("[false]", Boolean.class)); 
     assertEquals(Boolean.TRUE, gson.fromJson("[true]", Boolean.class)); 
     boolean value = gson.fromJson("[false]", boolean.class); 
     assertEquals(false, value); 
     value = gson.fromJson("[true]", boolean.class); 
     assertEquals(true, value); 
 } 


public void testLongAsStringSerialization184() throws Exception { 
     gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create(); 
     String result = gson.toJson(15L); 
     assertEquals("\"15\"", result); 
     result = gson.toJson(2); 
     assertEquals("2", result); 
 } 


public void testReallyLongValuesDeserialization202() { 
     String json = "333961828784581"; 
     long value = gson.fromJson(json, Long.class); 
     assertEquals(333961828784581L, value); 
 } 


public void testBigDecimalNaNDeserializationNotSupported203() { 
     try { 
         gson.fromJson("NaN", BigDecimal.class); 
         fail("Gson should not accept NaN for deserialization by default."); 
     } catch (JsonParseException expected) { 
     } 
 } 

  

  

  

  

  

  

  

  

  

  

  

  

  

  
  
  
  
  

  

  

  
  
  
  
  

  

  

  

  

  

  

  

  
  
  
  
  

  
  
  

  

  

  

  

  

  

  
  
  

  private String extractElementFromArray(String json) {
    return json.substring(json.indexOf('[') + 1, json.indexOf(']'));
  }
  
  
    
  
  
  
  
  
  
  
  
  

  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
  
  
  
  
  
  

  
  
  private static class ClassWithIntegerField {
    Integer i;
  }
  
  
}
