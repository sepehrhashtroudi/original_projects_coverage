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
 * Performs some unit testing for the {@link Escaper} class.
 *
 * @author Joel Leitch
 */
public class EscaperTest extends TestCase {

  private Escaper escapeHtmlChar;
  private Escaper noEscapeHtmlChar;
  
  @Override
  protected void setUp() throws Exception {
    super.setUp();
    escapeHtmlChar = new Escaper(true);
    noEscapeHtmlChar = new Escaper(false);
  }


public void testUnicodeCharacterStringNoEscaping34() throws Exception { 
     String unicodeString = "\u0065\u0066"; 
     String escapedString = escapeHtmlChar.escapeJsonString(unicodeString); 
     assertEquals(unicodeString, escapedString); 
 } 


public void testRequiredEscapingUnicodeCharacter35() throws Exception { 
     char unicodeChar = '\u2028'; 
     String unicodeString = "Testing" + unicodeChar; 
     String escapedString = escapeHtmlChar.escapeJsonString(unicodeString); 
     assertFalse(unicodeString.equals(escapedString)); 
     assertEquals("Testing\\u2028", escapedString); 
 } 


public void testTabEscaping36() throws Exception { 
     String containsTab = "123\t456"; 
     String escapedString = escapeHtmlChar.escapeJsonString(containsTab); 
     assertEquals("123\\t456", escapedString); 
 } 


public void testNewlineEscaping37() throws Exception { 
     String containsNewline = "123\n456"; 
     String escapedString = escapeHtmlChar.escapeJsonString(containsNewline); 
     assertEquals("123\\n456", escapedString); 
 } 


public void testSlashEscaping38() throws Exception { 
     String containsSlash = "123\\456"; 
     String escapedString = escapeHtmlChar.escapeJsonString(containsSlash); 
     assertEquals("123\\\\456", escapedString); 
 } 


public void testDoubleQuoteEscaping39() throws Exception { 
     String containsQuote = "123\"456"; 
     String escapedString = escapeHtmlChar.escapeJsonString(containsQuote); 
     assertEquals("123\\\"456", escapedString); 
 } 

  

  

  

  

  
  
  

  

  

  

  

  

  

  

  

  

  

  /*
  public void testChineseCharacterEscaping() throws Exception {
    String unicodeString = "\u597d\u597d\u597d";
    String chineseString = "好好好";
    assertEquals(unicodeString, chineseString);

    String expectedEscapedString = "\\u597d\\u597d\\u597d";
    String escapedString = Escaper.escapeJsonString(chineseString);
    assertEquals(expectedEscapedString, escapedString);
  }
   */

  private String convertToUnicodeString(int codepoint) {
    String hexValue = Integer.toHexString(codepoint);
    StringBuilder sb = new StringBuilder("\\u");
    for (int i = 0; i < 4 - hexValue.length(); i++) {
      sb.append(0);
    }
    sb.append(hexValue);

    return sb.toString().toLowerCase();
  }
}
