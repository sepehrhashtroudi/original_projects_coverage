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

package com.google.gson;

import junit.framework.TestCase;

/**
 * Unit test for the {@link JsonObject} class.
 *
 * @author Joel Leitch
 */
public class JsonObjectTest extends TestCase {


public void testAddingBooleanProperties213() throws Exception { 
     String propertyName = "property"; 
     JsonObject jsonObj = new JsonObject(); 
     jsonObj.addProperty(propertyName, true); 
     assertTrue(jsonObj.has(propertyName)); 
     JsonElement jsonElement = jsonObj.get(propertyName); 
     assertNotNull(jsonElement); 
     assertTrue(jsonElement.getAsBoolean()); 
 } 


public void testAddingCharacterProperties214() throws Exception { 
     String propertyName = "property"; 
     char value = 'a'; 
     JsonObject jsonObj = new JsonObject(); 
     jsonObj.addProperty(propertyName, value); 
     assertTrue(jsonObj.has(propertyName)); 
     JsonElement jsonElement = jsonObj.get(propertyName); 
     assertNotNull(jsonElement); 
     assertEquals(String.valueOf(value), jsonElement.getAsString()); 
     assertEquals(value, jsonElement.getAsCharacter()); 
 } 

  

  

  

  

  

  

  /**
   * From bug report http://code.google.com/p/google-gson/issues/detail?id=182
   */
  

  /**
   * From issue 227.
   */
  

  
}
