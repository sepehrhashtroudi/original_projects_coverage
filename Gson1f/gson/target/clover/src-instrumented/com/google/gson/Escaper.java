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
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * A utility class that is used to perform JSON escaping so that ", <, >, etc. characters are
 * properly encoded in the JSON string representation before returning to the client code.
 *
 * <p>This class contains a single method to escape a passed in string value:
 * <pre>
 *   String jsonStringValue = "beforeQuote\"afterQuote";
 *   String escapedValue = Escaper.escapeJsonString(jsonStringValue);
 * </pre></p>
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
@java.lang.SuppressWarnings({"fallthrough"}) final class Escaper {public static class __CLR4_4_1ebeblck0y81r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,596,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private static final char[] HEX_CHARS = {
    '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
  };

  private static final Set<Character> JS_ESCAPE_CHARS;
  private static final Set<Character> HTML_ESCAPE_CHARS;

  static {try{__CLR4_4_1ebeblck0y81r.R.inc(515);
    __CLR4_4_1ebeblck0y81r.R.inc(516);Set<Character> mandatoryEscapeSet = new HashSet<Character>();
    __CLR4_4_1ebeblck0y81r.R.inc(517);mandatoryEscapeSet.add('"');
    __CLR4_4_1ebeblck0y81r.R.inc(518);mandatoryEscapeSet.add('\\');
    __CLR4_4_1ebeblck0y81r.R.inc(519);JS_ESCAPE_CHARS = Collections.unmodifiableSet(mandatoryEscapeSet);

    __CLR4_4_1ebeblck0y81r.R.inc(520);Set<Character> htmlEscapeSet = new HashSet<Character>();
    __CLR4_4_1ebeblck0y81r.R.inc(521);htmlEscapeSet.add('<');
    __CLR4_4_1ebeblck0y81r.R.inc(522);htmlEscapeSet.add('>');
    __CLR4_4_1ebeblck0y81r.R.inc(523);htmlEscapeSet.add('&');
    __CLR4_4_1ebeblck0y81r.R.inc(524);htmlEscapeSet.add('=');
    __CLR4_4_1ebeblck0y81r.R.inc(525);htmlEscapeSet.add('\''); 
//    htmlEscapeSet.add('/');  -- Removing slash for now since it causes some incompatibilities
    __CLR4_4_1ebeblck0y81r.R.inc(526);HTML_ESCAPE_CHARS = Collections.unmodifiableSet(htmlEscapeSet);
  }finally{__CLR4_4_1ebeblck0y81r.R.flushNeeded();}}

  private final boolean escapeHtmlCharacters;
  
  Escaper(boolean escapeHtmlCharacters) {try{__CLR4_4_1ebeblck0y81r.R.inc(527);
    __CLR4_4_1ebeblck0y81r.R.inc(528);this.escapeHtmlCharacters = escapeHtmlCharacters;
  }finally{__CLR4_4_1ebeblck0y81r.R.flushNeeded();}}
  
  public String escapeJsonString(CharSequence plainText) {try{__CLR4_4_1ebeblck0y81r.R.inc(529);
    __CLR4_4_1ebeblck0y81r.R.inc(530);StringBuffer escapedString = new StringBuffer(plainText.length() + 20);
    __CLR4_4_1ebeblck0y81r.R.inc(531);try {
      __CLR4_4_1ebeblck0y81r.R.inc(532);escapeJsonString(plainText, escapedString);
    } catch (IOException e) {
      __CLR4_4_1ebeblck0y81r.R.inc(533);throw new RuntimeException(e);
    }
    __CLR4_4_1ebeblck0y81r.R.inc(534);return escapedString.toString();
  }finally{__CLR4_4_1ebeblck0y81r.R.flushNeeded();}}

  private void escapeJsonString(CharSequence plainText, StringBuffer out) throws IOException {try{__CLR4_4_1ebeblck0y81r.R.inc(535);
    __CLR4_4_1ebeblck0y81r.R.inc(536);int pos = 0;  // Index just past the last char in plainText written to out.
    __CLR4_4_1ebeblck0y81r.R.inc(537);int len = plainText.length();
    
    __CLR4_4_1ebeblck0y81r.R.inc(538);for (int charCount, i = 0; (((i < len)&&(__CLR4_4_1ebeblck0y81r.R.iget(539)!=0|true))||(__CLR4_4_1ebeblck0y81r.R.iget(540)==0&false)); i += charCount) {{
      __CLR4_4_1ebeblck0y81r.R.inc(541);int codePoint = Character.codePointAt(plainText, i);
      __CLR4_4_1ebeblck0y81r.R.inc(542);charCount = Character.charCount(codePoint);
      
       __CLR4_4_1ebeblck0y81r.R.inc(543);if ((((!isControlCharacter(codePoint) && !mustEscapeCharInJsString(codePoint))&&(__CLR4_4_1ebeblck0y81r.R.iget(544)!=0|true))||(__CLR4_4_1ebeblck0y81r.R.iget(545)==0&false))) {{
          __CLR4_4_1ebeblck0y81r.R.inc(546);continue;
       }

       }__CLR4_4_1ebeblck0y81r.R.inc(547);out.append(plainText, pos, i);
       __CLR4_4_1ebeblck0y81r.R.inc(548);pos = i + charCount;
       boolean __CLB4_4_1_bool0=false;__CLR4_4_1ebeblck0y81r.R.inc(549);switch (codePoint) {
         case '\b':if (!__CLB4_4_1_bool0) {__CLR4_4_1ebeblck0y81r.R.inc(550);__CLB4_4_1_bool0=true;}
           __CLR4_4_1ebeblck0y81r.R.inc(551);out.append("\\b");
           __CLR4_4_1ebeblck0y81r.R.inc(552);break;
         case '\t':if (!__CLB4_4_1_bool0) {__CLR4_4_1ebeblck0y81r.R.inc(553);__CLB4_4_1_bool0=true;}
           __CLR4_4_1ebeblck0y81r.R.inc(554);out.append("\\t");
           __CLR4_4_1ebeblck0y81r.R.inc(555);break;
         case '\n':if (!__CLB4_4_1_bool0) {__CLR4_4_1ebeblck0y81r.R.inc(556);__CLB4_4_1_bool0=true;}
           __CLR4_4_1ebeblck0y81r.R.inc(557);out.append("\\n");
           __CLR4_4_1ebeblck0y81r.R.inc(558);break;
         case '\f':if (!__CLB4_4_1_bool0) {__CLR4_4_1ebeblck0y81r.R.inc(559);__CLB4_4_1_bool0=true;}
           __CLR4_4_1ebeblck0y81r.R.inc(560);out.append("\\f");
           __CLR4_4_1ebeblck0y81r.R.inc(561);break;
         case '\r':if (!__CLB4_4_1_bool0) {__CLR4_4_1ebeblck0y81r.R.inc(562);__CLB4_4_1_bool0=true;}
           __CLR4_4_1ebeblck0y81r.R.inc(563);out.append("\\r");
           __CLR4_4_1ebeblck0y81r.R.inc(564);break;
         case '\\':if (!__CLB4_4_1_bool0) {__CLR4_4_1ebeblck0y81r.R.inc(565);__CLB4_4_1_bool0=true;}
           __CLR4_4_1ebeblck0y81r.R.inc(566);out.append("\\\\");
           __CLR4_4_1ebeblck0y81r.R.inc(567);break;
         case '/':if (!__CLB4_4_1_bool0) {__CLR4_4_1ebeblck0y81r.R.inc(568);__CLB4_4_1_bool0=true;}
           __CLR4_4_1ebeblck0y81r.R.inc(569);out.append("\\/");
           __CLR4_4_1ebeblck0y81r.R.inc(570);break;
         case '"':if (!__CLB4_4_1_bool0) {__CLR4_4_1ebeblck0y81r.R.inc(571);__CLB4_4_1_bool0=true;}
           __CLR4_4_1ebeblck0y81r.R.inc(572);out.append("\\\"");
           __CLR4_4_1ebeblck0y81r.R.inc(573);break;
         default:if (!__CLB4_4_1_bool0) {__CLR4_4_1ebeblck0y81r.R.inc(574);__CLB4_4_1_bool0=true;}
           __CLR4_4_1ebeblck0y81r.R.inc(575);appendHexJavaScriptRepresentation(codePoint, out);
           __CLR4_4_1ebeblck0y81r.R.inc(576);break;
       }
     }
     }__CLR4_4_1ebeblck0y81r.R.inc(577);out.append(plainText, pos, len);
  }finally{__CLR4_4_1ebeblck0y81r.R.flushNeeded();}}
  
  private boolean mustEscapeCharInJsString(int codepoint) {try{__CLR4_4_1ebeblck0y81r.R.inc(578);
    __CLR4_4_1ebeblck0y81r.R.inc(579);if ((((!Character.isSupplementaryCodePoint(codepoint))&&(__CLR4_4_1ebeblck0y81r.R.iget(580)!=0|true))||(__CLR4_4_1ebeblck0y81r.R.iget(581)==0&false))) {{
      __CLR4_4_1ebeblck0y81r.R.inc(582);char c = (char) codepoint;
      __CLR4_4_1ebeblck0y81r.R.inc(583);return JS_ESCAPE_CHARS.contains(c)
          || (escapeHtmlCharacters && HTML_ESCAPE_CHARS.contains(c));
    }
    }__CLR4_4_1ebeblck0y81r.R.inc(584);return false;
  }finally{__CLR4_4_1ebeblck0y81r.R.flushNeeded();}}

  private static boolean isControlCharacter(int codePoint) {try{__CLR4_4_1ebeblck0y81r.R.inc(585);
    // JSON spec defines these code points as control characters, so they must be escaped
    __CLR4_4_1ebeblck0y81r.R.inc(586);return codePoint < 0x20
        || codePoint == 0x2028  // Line separator
        || codePoint == 0x2029  // Paragraph separator
        || (codePoint >= 0x7f && codePoint <= 0x9f);
  }finally{__CLR4_4_1ebeblck0y81r.R.flushNeeded();}}

  private static void appendHexJavaScriptRepresentation(int codePoint, Appendable out)
      throws IOException {try{__CLR4_4_1ebeblck0y81r.R.inc(587);
    __CLR4_4_1ebeblck0y81r.R.inc(588);if ((((Character.isSupplementaryCodePoint(codePoint))&&(__CLR4_4_1ebeblck0y81r.R.iget(589)!=0|true))||(__CLR4_4_1ebeblck0y81r.R.iget(590)==0&false))) {{
      // Handle supplementary unicode values which are not representable in
      // javascript.  We deal with these by escaping them as two 4B sequences
      // so that they will round-trip properly when sent from java to javascript
      // and back.
      __CLR4_4_1ebeblck0y81r.R.inc(591);char[] surrogates = Character.toChars(codePoint);
      __CLR4_4_1ebeblck0y81r.R.inc(592);appendHexJavaScriptRepresentation(surrogates[0], out);
      __CLR4_4_1ebeblck0y81r.R.inc(593);appendHexJavaScriptRepresentation(surrogates[1], out);
      __CLR4_4_1ebeblck0y81r.R.inc(594);return;
    }
    }__CLR4_4_1ebeblck0y81r.R.inc(595);out.append("\\u")
        .append(HEX_CHARS[(codePoint >>> 12) & 0xf])
        .append(HEX_CHARS[(codePoint >>> 8) & 0xf])
        .append(HEX_CHARS[(codePoint >>> 4) & 0xf])
        .append(HEX_CHARS[codePoint & 0xf]);
  }finally{__CLR4_4_1ebeblck0y81r.R.flushNeeded();}}
}
