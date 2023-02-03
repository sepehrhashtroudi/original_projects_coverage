/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.csv;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

import static org.apache.commons.csv.Token.Type.*;
import static org.junit.Assert.*;

public class CSVLexerTest {static class __CLR4_4_1oxoxl6l8x0hx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906881L,8589935092L,981,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private CSVLexer getLexer(String input, CSVFormat format) {try{__CLR4_4_1oxoxl6l8x0hx.R.inc(897);
        __CLR4_4_1oxoxl6l8x0hx.R.inc(898);return new CSVLexer(format, new ExtendedBufferedReader(new StringReader(input)));
    }finally{__CLR4_4_1oxoxl6l8x0hx.R.flushNeeded();}}

    private void assertTokenEquals(Token.Type expectedType, String expectedContent, Token token) {try{__CLR4_4_1oxoxl6l8x0hx.R.inc(899);
        __CLR4_4_1oxoxl6l8x0hx.R.inc(900);assertEquals("Token type", expectedType, token.type);
        __CLR4_4_1oxoxl6l8x0hx.R.inc(901);assertEquals("Token content", expectedContent, token.content.toString());
    }finally{__CLR4_4_1oxoxl6l8x0hx.R.flushNeeded();}}
    
    // Single line (without comment)
    @Test
    public void testNextToken1() throws IOException {__CLR4_4_1oxoxl6l8x0hx.R.globalSliceStart(getClass().getName(),902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h08ohop2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxoxl6l8x0hx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxoxl6l8x0hx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVLexerTest.testNextToken1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h08ohop2() throws IOException{try{__CLR4_4_1oxoxl6l8x0hx.R.inc(902);
        __CLR4_4_1oxoxl6l8x0hx.R.inc(903);String code = "abc,def, hijk,  lmnop,   qrst,uv ,wxy   ,z , ,";
        __CLR4_4_1oxoxl6l8x0hx.R.inc(904);CSVLexer parser = getLexer(code, CSVFormat.DEFAULT.withSurroundingSpacesIgnored(true));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(905);assertTokenEquals(TOKEN, "abc", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(906);assertTokenEquals(TOKEN, "def", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(907);assertTokenEquals(TOKEN, "hijk", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(908);assertTokenEquals(TOKEN, "lmnop", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(909);assertTokenEquals(TOKEN, "qrst", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(910);assertTokenEquals(TOKEN, "uv", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(911);assertTokenEquals(TOKEN, "wxy", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(912);assertTokenEquals(TOKEN, "z", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(913);assertTokenEquals(TOKEN, "", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(914);assertTokenEquals(EOF, "", parser.nextToken(new Token()));
    }finally{__CLR4_4_1oxoxl6l8x0hx.R.flushNeeded();}}

    // multiline including comments (and empty lines)
    @Test
    public void testNextToken2() throws IOException {__CLR4_4_1oxoxl6l8x0hx.R.globalSliceStart(getClass().getName(),915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dr8pp7pf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxoxl6l8x0hx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxoxl6l8x0hx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVLexerTest.testNextToken2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dr8pp7pf() throws IOException{try{__CLR4_4_1oxoxl6l8x0hx.R.inc(915);
        /*   file:   1,2,3,
        *           a,b x,c
        *
        *           # this is a comment
        *           d,e,
        *
        */
        __CLR4_4_1oxoxl6l8x0hx.R.inc(916);String code = "1,2,3,\na,b x,c\n#foo\n\nd,e,\n\n";
        __CLR4_4_1oxoxl6l8x0hx.R.inc(917);CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        
        __CLR4_4_1oxoxl6l8x0hx.R.inc(918);CSVLexer parser = getLexer(code, format);


        __CLR4_4_1oxoxl6l8x0hx.R.inc(919);assertTokenEquals(TOKEN, "1", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(920);assertTokenEquals(TOKEN, "2", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(921);assertTokenEquals(TOKEN, "3", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(922);assertTokenEquals(EORECORD, "", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(923);assertTokenEquals(TOKEN, "a", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(924);assertTokenEquals(TOKEN, "b x", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(925);assertTokenEquals(EORECORD, "c", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(926);assertTokenEquals(EORECORD, "", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(927);assertTokenEquals(TOKEN, "d", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(928);assertTokenEquals(TOKEN, "e", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(929);assertTokenEquals(EORECORD, "", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(930);assertTokenEquals(EOF, "", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(931);assertTokenEquals(EOF, "", parser.nextToken(new Token()));

    }finally{__CLR4_4_1oxoxl6l8x0hx.R.flushNeeded();}}

    // simple token with escaping
    @Test
    public void testNextToken3() throws IOException {__CLR4_4_1oxoxl6l8x0hx.R.globalSliceStart(getClass().getName(),932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ai8qwqpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxoxl6l8x0hx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxoxl6l8x0hx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVLexerTest.testNextToken3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ai8qwqpw() throws IOException{try{__CLR4_4_1oxoxl6l8x0hx.R.inc(932);
        /* file: a,\,,b
        *       \,,
        */
        __CLR4_4_1oxoxl6l8x0hx.R.inc(933);String code = "a,\\,,b\n\\,,";
        __CLR4_4_1oxoxl6l8x0hx.R.inc(934);CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        __CLR4_4_1oxoxl6l8x0hx.R.inc(935);CSVLexer parser = getLexer(code, format);

        __CLR4_4_1oxoxl6l8x0hx.R.inc(936);assertTokenEquals(TOKEN, "a", parser.nextToken(new Token()));
        // an unquoted single backslash is not an escape char
        __CLR4_4_1oxoxl6l8x0hx.R.inc(937);assertTokenEquals(TOKEN, "\\", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(938);assertTokenEquals(TOKEN, "", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(939);assertTokenEquals(EORECORD, "b", parser.nextToken(new Token()));
        // an unquoted single backslash is not an escape char
        __CLR4_4_1oxoxl6l8x0hx.R.inc(940);assertTokenEquals(TOKEN, "\\", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(941);assertTokenEquals(TOKEN, "", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(942);assertTokenEquals(EOF, "", parser.nextToken(new Token()));
    }finally{__CLR4_4_1oxoxl6l8x0hx.R.flushNeeded();}}

    // encapsulator tokenizer (sinle line)
    @Test
    public void testNextToken4() throws IOException {__CLR4_4_1oxoxl6l8x0hx.R.globalSliceStart(getClass().getName(),943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1798s49q7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxoxl6l8x0hx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxoxl6l8x0hx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVLexerTest.testNextToken4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1798s49q7() throws IOException{try{__CLR4_4_1oxoxl6l8x0hx.R.inc(943);
        /* file:  a,"foo",b
        *        a,   " foo",b
        *        a,"foo "   ,b     // whitespace after closing encapsulator
        *        a,  " foo " ,b
        */
        __CLR4_4_1oxoxl6l8x0hx.R.inc(944);String code = "a,\"foo\",b\na,   \" foo\",b\na,\"foo \"  ,b\na,  \" foo \"  ,b";
        __CLR4_4_1oxoxl6l8x0hx.R.inc(945);CSVLexer parser = getLexer(code, CSVFormat.DEFAULT.withSurroundingSpacesIgnored(true));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(946);assertTokenEquals(TOKEN, "a", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(947);assertTokenEquals(TOKEN, "foo", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(948);assertTokenEquals(EORECORD, "b", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(949);assertTokenEquals(TOKEN, "a", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(950);assertTokenEquals(TOKEN, " foo", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(951);assertTokenEquals(EORECORD, "b", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(952);assertTokenEquals(TOKEN, "a", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(953);assertTokenEquals(TOKEN, "foo ", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(954);assertTokenEquals(EORECORD, "b", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(955);assertTokenEquals(TOKEN, "a", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(956);assertTokenEquals(TOKEN, " foo ", parser.nextToken(new Token()));
//      assertTokenEquals(EORECORD, "b", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(957);assertTokenEquals(EOF, "b", parser.nextToken(new Token()));
    }finally{__CLR4_4_1oxoxl6l8x0hx.R.flushNeeded();}}

    // encapsulator tokenizer (multi line, delimiter in string)
    @Test
    public void testNextToken5() throws IOException {__CLR4_4_1oxoxl6l8x0hx.R.globalSliceStart(getClass().getName(),958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1408tbsqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxoxl6l8x0hx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxoxl6l8x0hx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVLexerTest.testNextToken5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1408tbsqm() throws IOException{try{__CLR4_4_1oxoxl6l8x0hx.R.inc(958);
        __CLR4_4_1oxoxl6l8x0hx.R.inc(959);String code = "a,\"foo\n\",b\n\"foo\n  baar ,,,\"\n\"\n\t \n\"";
        __CLR4_4_1oxoxl6l8x0hx.R.inc(960);CSVLexer parser = getLexer(code, CSVFormat.DEFAULT);
        __CLR4_4_1oxoxl6l8x0hx.R.inc(961);assertTokenEquals(TOKEN, "a", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(962);assertTokenEquals(TOKEN, "foo\n", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(963);assertTokenEquals(EORECORD, "b", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(964);assertTokenEquals(EORECORD, "foo\n  baar ,,,", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(965);assertTokenEquals(EOF, "\n\t \n", parser.nextToken(new Token()));

    }finally{__CLR4_4_1oxoxl6l8x0hx.R.flushNeeded();}}

    // change delimiters, comment, encapsulater
    @Test
    public void testNextToken6() throws IOException {__CLR4_4_1oxoxl6l8x0hx.R.globalSliceStart(getClass().getName(),966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r8ujbqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxoxl6l8x0hx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxoxl6l8x0hx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVLexerTest.testNextToken6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r8ujbqu() throws IOException{try{__CLR4_4_1oxoxl6l8x0hx.R.inc(966);
        /* file: a;'b and \' more
        *       '
        *       !comment;;;;
        *       ;;
        */
        __CLR4_4_1oxoxl6l8x0hx.R.inc(967);String code = "a;'b and '' more\n'\n!comment;;;;\n;;";
        __CLR4_4_1oxoxl6l8x0hx.R.inc(968);CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';').withEncapsulator('\'').withCommentStart('!');
        __CLR4_4_1oxoxl6l8x0hx.R.inc(969);CSVLexer parser = getLexer(code, format);
        __CLR4_4_1oxoxl6l8x0hx.R.inc(970);assertTokenEquals(TOKEN, "a", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(971);assertTokenEquals(EORECORD, "b and ' more\n", parser.nextToken(new Token()));
    }finally{__CLR4_4_1oxoxl6l8x0hx.R.flushNeeded();}}

    // From CSV-1
    @Test
    public void testDelimiterIsWhitespace() throws IOException {__CLR4_4_1oxoxl6l8x0hx.R.globalSliceStart(getClass().getName(),972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1syfq6br0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oxoxl6l8x0hx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oxoxl6l8x0hx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVLexerTest.testDelimiterIsWhitespace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1syfq6br0() throws IOException{try{__CLR4_4_1oxoxl6l8x0hx.R.inc(972);
        __CLR4_4_1oxoxl6l8x0hx.R.inc(973);String code = "one\ttwo\t\tfour \t five\t six";
        __CLR4_4_1oxoxl6l8x0hx.R.inc(974);CSVLexer parser = getLexer(code, CSVFormat.TDF);
        __CLR4_4_1oxoxl6l8x0hx.R.inc(975);assertTokenEquals(TOKEN, "one", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(976);assertTokenEquals(TOKEN, "two", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(977);assertTokenEquals(TOKEN, "", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(978);assertTokenEquals(TOKEN, "four", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(979);assertTokenEquals(TOKEN, "five", parser.nextToken(new Token()));
        __CLR4_4_1oxoxl6l8x0hx.R.inc(980);assertTokenEquals(EOF, "six", parser.nextToken(new Token()));
    }finally{__CLR4_4_1oxoxl6l8x0hx.R.flushNeeded();}}
}
