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
import com.google.gson.JsonParseException;
import com.google.gson.common.MoreAsserts;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Functional tests for Json serialization and deserialization of collections.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CollectionTest extends TestCase {
  private Gson gson;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new Gson();
  }


public void testCollectionOfObjectWithNullSerialization96() { 
     List<Object> target = new ArrayList<Object>(); 
     target.add("Hello"); 
     target.add(null); 
     target.add("World"); 
     assertEquals("[\"Hello\",null,\"World\"]", gson.toJson(target)); 
     Type type = new TypeToken<List<Object>>() { 
     }.getType(); 
     assertEquals("[\"Hello\",null,\"World\"]", gson.toJson(target, type)); 
 } 


public void testNullsInListDeserialization98() { 
     List<String> expected = new ArrayList<String>(); 
     expected.add("foo"); 
     expected.add(null); 
     expected.add("bar"); 
     String json = "[\"foo\",null,\"bar\"]"; 
     Type expectedType = new TypeToken<List<String>>() { 
     }.getType(); 
     List<String> target = gson.fromJson(json, expectedType); 
     for (int i = 0; i < expected.size(); ++i) { 
         assertEquals(expected.get(i), target.get(i)); 
     } 
 } 


public void testQueueSerialization122() { 
     Queue<String> queue = new LinkedList<String>(); 
     queue.add("a1"); 
     queue.add("a2"); 
     Type queueType = new TypeToken<Queue<String>>() { 
     }.getType(); 
     String json = gson.toJson(queue, queueType); 
     assertTrue(json.contains("a1")); 
     assertTrue(json.contains("a2")); 
 } 


public void testSetDeserialization125() { 
     String json = "[{value:1},{value:2}]"; 
     Type type = new TypeToken<Set<Entry>>() { 
     }.getType(); 
     Set<Entry> set = gson.fromJson(json, type); 
     assertEquals(2, set.size()); 
     for (Entry entry : set) { 
         assertTrue(entry.value == 1 || entry.value == 2); 
     } 
 } 


@SuppressWarnings({ "unchecked", "rawtypes" }) 
 public void testRawCollectionOfBagOfPrimitivesNotAllowed215() { 
     try { 
         BagOfPrimitives bag = new BagOfPrimitives(10, 20, false, "stringValue"); 
         String json = '[' + bag.getExpectedJson() + ',' + bag.getExpectedJson() + ']'; 
         Collection target = gson.fromJson(json, Collection.class); 
         assertEquals(2, target.size()); 
         for (BagOfPrimitives bag1 : (Collection<BagOfPrimitives>) target) { 
             assertEquals(bag.getExpectedJson(), bag1.getExpectedJson()); 
         } 
         fail("Raw collection of objects should not work"); 
     } catch (JsonParseException expected) { 
     } 
 } 

  

  

  
  
  

  

  

  

  

  

  
  
  

  

  

  

  

  

  

  
  
  
  
  
  
  

  @SuppressWarnings({ "rawtypes" })
  private static int[] toIntArray(Collection collection) {
    int[] ints = new int[collection.size()];
    int i = 0;
    for (Iterator iterator = collection.iterator(); iterator.hasNext(); ++i) {
      Object obj = iterator.next();
      if (obj instanceof Integer) {
        ints[i] = ((Integer)obj).intValue();
      } else if (obj instanceof Long) {
        ints[i] = ((Long)obj).intValue();
      }
    }
    return ints;
  }

  private static class ObjectWithWildcardCollection {
    private final Collection<? extends BagOfPrimitives> collection;

    // For use by Gson
    @SuppressWarnings({ "unchecked", "unused" })
    public ObjectWithWildcardCollection() {
      this(Collections.EMPTY_LIST);
    }
    
    public ObjectWithWildcardCollection(Collection<? extends BagOfPrimitives> collection) {
      this.collection = collection;
    }
    
    public Collection<? extends BagOfPrimitives> getCollection() {
      return collection;
    }
  }
  
  private static class Entry {
    int value;
    // For use by Gson
    @SuppressWarnings("unused")
    private Entry() {
      this(10);
    }
    Entry(int value) {
      this.value = value;
    }
  }
  
  
}
