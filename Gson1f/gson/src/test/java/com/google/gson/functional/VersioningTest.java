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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.common.TestTypes.BagOfPrimitives;

import junit.framework.TestCase;

/**
 * Functional tests for versioning support in Gson.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class VersioningTest extends TestCase {
  private static final int A = 0;
  private static final int B = 1;
  private static final int C = 2;
  private static final int D = 3;

  private GsonBuilder builder;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    builder = new GsonBuilder();
  }


public void testIgnoreLaterVersionClassSerialization130() { 
     Gson gson = builder.setVersion(1.0).create(); 
     assertEquals("", gson.toJson(new Version1_2())); 
 } 


public void testVersionedGsonWithUnversionedClassesDeserialization181() { 
     Gson gson = builder.setVersion(1.0).create(); 
     String json = "{\"longValue\":10,\"intValue\":20,\"booleanValue\":false}"; 
     BagOfPrimitives expected = new BagOfPrimitives(); 
     expected.longValue = 10; 
     expected.intValue = 20; 
     expected.booleanValue = false; 
     BagOfPrimitives actual = gson.fromJson(json, BagOfPrimitives.class); 
     assertEquals(expected, actual); 
 } 


public void testVersionedUntilSerialization189() { 
     Version1 target = new Version1(); 
     Gson gson = builder.setVersion(1.29).create(); 
     String json = gson.toJson(target); 
     assertTrue(json.contains("\"a\":" + A)); 
     gson = builder.setVersion(1.3).create(); 
     json = gson.toJson(target); 
     assertFalse(json.contains("\"a\":" + A)); 
 } 

  
  
  

  

  

  

  

  

  

  

  

  private static class Version1 {
    @Until(1.3) int a = A;
    @Since(1.0) int b = B;
  }

  private static class Version1_1 extends Version1 {
    @Since(1.1) int c = C;
  }

  @Since(1.2)
  private static class Version1_2 extends Version1_1 {
    int d = D;
  }
  
  private static class SinceUntilMixing {
    int a = A;
    
    @Since(1.1)
    @Until(1.3)
    int b = B;
  }
}
