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
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * CSVParserTest
 *
 * The test are organized in three different sections:
 * The 'setter/getter' section, the lexer section and finally the parser
 * section. In case a test fails, you should follow a top-down approach for
 * fixing a potential bug (its likely that the parser itself fails if the lexer
 * has problems...).
 */
public class CSVParserTest {static class __CLR4_4_1r9r9l6l8x0j6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906881L,8589935092L,1212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    String code = "a,b,c,d\n"
                    + " a , b , 1 2 \n"
                    + "\"foo baar\", b,\n"
                    // + "   \"foo\n,,\n\"\",,\n\\\"\",d,e\n";
                    + "   \"foo\n,,\n\"\",,\n\"\"\",d,e\n";   // changed to use standard CSV escaping
    String[][] res = {
            {"a", "b", "c", "d"},
            {"a", "b", "1 2"},
            {"foo baar", "b", ""},
            {"foo\n,,\n\",,\n\"", "d", "e"}
    };

    @Test
    public void testGetLine() throws IOException {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vde81tr9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testGetLine",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vde81tr9() throws IOException{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(981);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(982);CSVParser parser = new CSVParser(new StringReader(code), CSVFormat.DEFAULT.withSurroundingSpacesIgnored(true));
        __CLR4_4_1r9r9l6l8x0j6.R.inc(983);for (String[] re : res) {{
            __CLR4_4_1r9r9l6l8x0j6.R.inc(984);assertArrayEquals(re, parser.getRecord().values());
        }
        
        }__CLR4_4_1r9r9l6l8x0j6.R.inc(985);assertNull(parser.getRecord());
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testGetRecords() throws IOException {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144c6d7re();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testGetRecords",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144c6d7re() throws IOException{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(986);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(987);CSVParser parser = new CSVParser(new StringReader(code), CSVFormat.DEFAULT.withSurroundingSpacesIgnored(true));
        __CLR4_4_1r9r9l6l8x0j6.R.inc(988);List<CSVRecord> records = parser.getRecords();
        __CLR4_4_1r9r9l6l8x0j6.R.inc(989);assertEquals(res.length, records.size());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(990);assertTrue(records.size() > 0);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(991);for (int i = 0; (((i < res.length)&&(__CLR4_4_1r9r9l6l8x0j6.R.iget(992)!=0|true))||(__CLR4_4_1r9r9l6l8x0j6.R.iget(993)==0&false)); i++) {{
            __CLR4_4_1r9r9l6l8x0j6.R.inc(994);assertArrayEquals(res[i], records.get(i).values());
        }
    }}finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testExcelFormat1() throws IOException {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u53iv8rn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testExcelFormat1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u53iv8rn() throws IOException{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(995);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(996);String code =
                "value1,value2,value3,value4\r\na,b,c,d\r\n  x,,,"
                        + "\r\n\r\n\"\"\"hello\"\"\",\"  \"\"world\"\"\",\"abc\ndef\",\r\n";
        __CLR4_4_1r9r9l6l8x0j6.R.inc(997);String[][] res = {
                {"value1", "value2", "value3", "value4"},
                {"a", "b", "c", "d"},
                {"  x", "", "", ""},
                {""},
                {"\"hello\"", "  \"world\"", "abc\ndef", ""}
        };
        __CLR4_4_1r9r9l6l8x0j6.R.inc(998);CSVParser parser = new CSVParser(code, CSVFormat.EXCEL);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(999);List<CSVRecord> records = parser.getRecords();
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1000);assertEquals(res.length, records.size());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1001);assertTrue(records.size() > 0);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1002);for (int i = 0; (((i < res.length)&&(__CLR4_4_1r9r9l6l8x0j6.R.iget(1003)!=0|true))||(__CLR4_4_1r9r9l6l8x0j6.R.iget(1004)==0&false)); i++) {{
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1005);assertArrayEquals(res[i], records.get(i).values());
        }
    }}finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testExcelFormat2() throws Exception {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qw3k2rry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testExcelFormat2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qw3k2rry() throws Exception{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1006);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1007);String code = "foo,baar\r\n\r\nhello,\r\n\r\nworld,\r\n";
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1008);String[][] res = {
                {"foo", "baar"},
                {""},
                {"hello", ""},
                {""},
                {"world", ""}
        };
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1009);CSVParser parser = new CSVParser(code, CSVFormat.EXCEL);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1010);List<CSVRecord> records = parser.getRecords();
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1011);assertEquals(res.length, records.size());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1012);assertTrue(records.size() > 0);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1013);for (int i = 0; (((i < res.length)&&(__CLR4_4_1r9r9l6l8x0j6.R.iget(1014)!=0|true))||(__CLR4_4_1r9r9l6l8x0j6.R.iget(1015)==0&false)); i++) {{
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1016);assertArrayEquals(res[i], records.get(i).values());
        }
    }}finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testEndOfFileBehaviourExcel() throws Exception {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gnefxs9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviourExcel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gnefxs9() throws Exception{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1017);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1018);String[] codes = {
                "hello,\r\n\r\nworld,\r\n",
                "hello,\r\n\r\nworld,",
                "hello,\r\n\r\nworld,\"\"\r\n",
                "hello,\r\n\r\nworld,\"\"",
                "hello,\r\n\r\nworld,\n",
                "hello,\r\n\r\nworld,",
                "hello,\r\n\r\nworld,\"\"\n",
                "hello,\r\n\r\nworld,\"\""
        };
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1019);String[][] res = {
                {"hello", ""},
                {""},  // Excel format does not ignore empty lines
                {"world", ""}
        };
        
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1020);for (String code : codes) {{
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1021);CSVParser parser = new CSVParser(code, CSVFormat.EXCEL);
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1022);List<CSVRecord> records = parser.getRecords();
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1023);assertEquals(res.length, records.size());
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1024);assertTrue(records.size() > 0);
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1025);for (int i = 0; (((i < res.length)&&(__CLR4_4_1r9r9l6l8x0j6.R.iget(1026)!=0|true))||(__CLR4_4_1r9r9l6l8x0j6.R.iget(1027)==0&false)); i++) {{
                __CLR4_4_1r9r9l6l8x0j6.R.inc(1028);assertArrayEquals(res[i], records.get(i).values());
            }
        }}
    }}finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testEndOfFileBehaviorCSV() throws Exception {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3a2wxsl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviorCSV",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3a2wxsl() throws Exception{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1029);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1030);String[] codes = {
                "hello,\r\n\r\nworld,\r\n",
                "hello,\r\n\r\nworld,",
                "hello,\r\n\r\nworld,\"\"\r\n",
                "hello,\r\n\r\nworld,\"\"",
                "hello,\r\n\r\nworld,\n",
                "hello,\r\n\r\nworld,",
                "hello,\r\n\r\nworld,\"\"\n",
                "hello,\r\n\r\nworld,\"\""
        };
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1031);String[][] res = {
                {"hello", ""},  // CSV format ignores empty lines
                {"world", ""}
        };
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1032);for (String code : codes) {{
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1033);CSVParser parser = new CSVParser(new StringReader(code));
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1034);List<CSVRecord> records = parser.getRecords();
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1035);assertEquals(res.length, records.size());
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1036);assertTrue(records.size() > 0);
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1037);for (int i = 0; (((i < res.length)&&(__CLR4_4_1r9r9l6l8x0j6.R.iget(1038)!=0|true))||(__CLR4_4_1r9r9l6l8x0j6.R.iget(1039)==0&false)); i++) {{
                __CLR4_4_1r9r9l6l8x0j6.R.inc(1040);assertArrayEquals(res[i], records.get(i).values());
            }
        }}
    }}finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testEmptyLineBehaviourExcel() throws Exception {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12m34i8sx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourExcel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12m34i8sx() throws Exception{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1041);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1042);String[] codes = {
                "hello,\r\n\r\n\r\n",
                "hello,\n\n\n",
                "hello,\"\"\r\n\r\n\r\n",
                "hello,\"\"\n\n\n"
        };
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1043);String[][] res = {
                {"hello", ""},
                {""},  // Excel format does not ignore empty lines
                {""}
        };
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1044);for (String code : codes) {{
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1045);CSVParser parser = new CSVParser(code, CSVFormat.EXCEL);
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1046);List<CSVRecord> records = parser.getRecords();
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1047);assertEquals(res.length, records.size());
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1048);assertTrue(records.size() > 0);
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1049);for (int i = 0; (((i < res.length)&&(__CLR4_4_1r9r9l6l8x0j6.R.iget(1050)!=0|true))||(__CLR4_4_1r9r9l6l8x0j6.R.iget(1051)==0&false)); i++) {{
                __CLR4_4_1r9r9l6l8x0j6.R.inc(1052);assertArrayEquals(res[i], records.get(i).values());
            }
        }}
    }}finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testEmptyLineBehaviourCSV() throws Exception {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxwckht9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourCSV",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxwckht9() throws Exception{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1053);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1054);String[] codes = {
                "hello,\r\n\r\n\r\n",
                "hello,\n\n\n",
                "hello,\"\"\r\n\r\n\r\n",
                "hello,\"\"\n\n\n"
        };
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1055);String[][] res = {
                {"hello", ""}  // CSV format ignores empty lines
        };
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1056);for (String code : codes) {{
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1057);CSVParser parser = new CSVParser(new StringReader(code));
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1058);List<CSVRecord> records = parser.getRecords();
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1059);assertEquals(res.length, records.size());
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1060);assertTrue(records.size() > 0);
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1061);for (int i = 0; (((i < res.length)&&(__CLR4_4_1r9r9l6l8x0j6.R.iget(1062)!=0|true))||(__CLR4_4_1r9r9l6l8x0j6.R.iget(1063)==0&false)); i++) {{
                __CLR4_4_1r9r9l6l8x0j6.R.inc(1064);assertArrayEquals(res[i], records.get(i).values());
            }
        }}
    }}finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testEmptyFile() throws Exception {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jugtetl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testEmptyFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jugtetl() throws Exception{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1065);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1066);CSVParser parser = new CSVParser("", CSVFormat.DEFAULT);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1067);assertNull(parser.getRecord());
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    @Ignore
    public void testBackslashEscapingOld() throws IOException {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ztfecto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testBackslashEscapingOld",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ztfecto() throws IOException{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1068);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1069);String code =
                "one,two,three\n"
                        + "on\\\"e,two\n"
                        + "on\"e,two\n"
                        + "one,\"tw\\\"o\"\n"
                        + "one,\"t\\,wo\"\n"
                        + "one,two,\"th,ree\"\n"
                        + "\"a\\\\\"\n"
                        + "a\\,b\n"
                        + "\"a\\\\,b\"";
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1070);String[][] res = {
                {"one", "two", "three"},
                {"on\\\"e", "two"},
                {"on\"e", "two"},
                {"one", "tw\"o"},
                {"one", "t\\,wo"},  // backslash in quotes only escapes a delimiter (",")
                {"one", "two", "th,ree"},
                {"a\\\\"},     // backslash in quotes only escapes a delimiter (",")
                {"a\\", "b"},  // a backslash must be returnd
                {"a\\\\,b"}    // backslash in quotes only escapes a delimiter (",")
        };
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1071);CSVParser parser = new CSVParser(new StringReader(code));
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1072);List<CSVRecord> records = parser.getRecords();
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1073);assertEquals(res.length, records.size());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1074);assertTrue(records.size() > 0);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1075);for (int i = 0; (((i < res.length)&&(__CLR4_4_1r9r9l6l8x0j6.R.iget(1076)!=0|true))||(__CLR4_4_1r9r9l6l8x0j6.R.iget(1077)==0&false)); i++) {{
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1078);assertArrayEquals(res[i], records.get(i).values());
        }
    }}finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testBackslashEscaping() throws IOException {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xpvxrdtz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testBackslashEscaping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xpvxrdtz() throws IOException{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1079);

        // To avoid confusion over the need for escaping chars in java code,
        // We will test with a forward slash as the escape char, and a single
        // quote as the encapsulator.

        __CLR4_4_1r9r9l6l8x0j6.R.inc(1080);String code =
                "one,two,three\n" // 0
                        + "'',''\n"       // 1) empty encapsulators
                        + "/',/'\n"       // 2) single encapsulators
                        + "'/'','/''\n"   // 3) single encapsulators encapsulated via escape
                        + "'''',''''\n"   // 4) single encapsulators encapsulated via doubling
                        + "/,,/,\n"       // 5) separator escaped
                        + "//,//\n"       // 6) escape escaped
                        + "'//','//'\n"   // 7) escape escaped in encapsulation
                        + "   8   ,   \"quoted \"\" /\" // string\"   \n"     // don't eat spaces
                        + "9,   /\n   \n"  // escaped newline
                        + "";
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1081);String[][] res = {
                {"one", "two", "three"}, // 0
                {"", ""},                // 1
                {"'", "'"},              // 2
                {"'", "'"},              // 3
                {"'", "'"},              // 4
                {",", ","},              // 5
                {"/", "/"},              // 6
                {"/", "/"},              // 7
                {"   8   ", "   \"quoted \"\" \" / string\"   "},
                {"9", "   \n   "},
        };


        __CLR4_4_1r9r9l6l8x0j6.R.inc(1082);CSVFormat format = new CSVFormat(',', '\'', CSVFormat.DISABLED, '/', false, true, "\r\n", null);

        __CLR4_4_1r9r9l6l8x0j6.R.inc(1083);CSVParser parser = new CSVParser(code, format);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1084);List<CSVRecord> records = parser.getRecords();
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1085);assertTrue(records.size() > 0);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1086);for (int i = 0; (((i < res.length)&&(__CLR4_4_1r9r9l6l8x0j6.R.iget(1087)!=0|true))||(__CLR4_4_1r9r9l6l8x0j6.R.iget(1088)==0&false)); i++) {{
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1089);assertArrayEquals(res[i], records.get(i).values());
        }
    }}finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testBackslashEscaping2() throws IOException {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mm9hjrua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testBackslashEscaping2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mm9hjrua() throws IOException{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1090);

        // To avoid confusion over the need for escaping chars in java code,
        // We will test with a forward slash as the escape char, and a single
        // quote as the encapsulator.

        __CLR4_4_1r9r9l6l8x0j6.R.inc(1091);String code = ""
                + " , , \n"           // 1)
                + " \t ,  , \n"       // 2)
                + " // , /, , /,\n"   // 3)
                + "";
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1092);String[][] res = {
                {" ", " ", " "},         // 1
                {" \t ", "  ", " "},     // 2
                {" / ", " , ", " ,"},    // 3
        };


        __CLR4_4_1r9r9l6l8x0j6.R.inc(1093);CSVFormat format = new CSVFormat(',',  CSVFormat.DISABLED,  CSVFormat.DISABLED, '/', false, true, "\r\n", null);

        __CLR4_4_1r9r9l6l8x0j6.R.inc(1094);CSVParser parser = new CSVParser(code, format);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1095);List<CSVRecord> records = parser.getRecords();
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1096);assertTrue(records.size() > 0);

        __CLR4_4_1r9r9l6l8x0j6.R.inc(1097);assertTrue(CSVPrinterTest.equals(res, records));
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testDefaultFormat() throws IOException {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j92uului();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testDefaultFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j92uului() throws IOException{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1098);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1099);String code = ""
                + "a,b\n"            // 1)
                + "\"\n\",\" \"\n"   // 2)
                + "\"\",#\n"   // 2)
                ;
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1100);String[][] res = {
                {"a", "b"},
                {"\n", " "},
                {"", "#"},
        };

        __CLR4_4_1r9r9l6l8x0j6.R.inc(1101);CSVFormat format = CSVFormat.DEFAULT;
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1102);assertEquals(CSVFormat.DISABLED, format.getCommentStart());

        __CLR4_4_1r9r9l6l8x0j6.R.inc(1103);CSVParser parser = new CSVParser(code, format);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1104);List<CSVRecord> records = parser.getRecords();
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1105);assertTrue(records.size() > 0);

        __CLR4_4_1r9r9l6l8x0j6.R.inc(1106);assertTrue(CSVPrinterTest.equals(res, records));

        __CLR4_4_1r9r9l6l8x0j6.R.inc(1107);String[][] res_comments = {
                {"a", "b"},
                {"\n", " "},
                {""},
        };

        __CLR4_4_1r9r9l6l8x0j6.R.inc(1108);format = CSVFormat.DEFAULT.withCommentStart('#');
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1109);parser = new CSVParser(code, format);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1110);records = parser.getRecords();
        
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1111);assertTrue(CSVPrinterTest.equals(res_comments, records));
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testCarriageReturnLineFeedEndings() throws IOException {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv1yejuw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testCarriageReturnLineFeedEndings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv1yejuw() throws IOException{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1112);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1113);String code = "foo\r\nbaar,\r\nhello,world\r\n,kanu";
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1114);CSVParser parser = new CSVParser(new StringReader(code));
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1115);List<CSVRecord> records = parser.getRecords();
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1116);assertEquals(4, records.size());
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testCarriageReturnEndings() throws IOException {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzwenxv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testCarriageReturnEndings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzwenxv1() throws IOException{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1117);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1118);String code = "foo\rbaar,\rhello,world\r,kanu";
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1119);CSVParser parser = new CSVParser(new StringReader(code));
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1120);List<CSVRecord> records = parser.getRecords();
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1121);assertEquals(4, records.size());
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testLineFeedEndings() throws IOException {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hhcmflv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testLineFeedEndings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hhcmflv6() throws IOException{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1122);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1123);String code = "foo\nbaar,\nhello,world\n,kanu";
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1124);CSVParser parser = new CSVParser(new StringReader(code));
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1125);List<CSVRecord> records = parser.getRecords();
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1126);assertEquals(4, records.size());
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testIgnoreEmptyLines() throws IOException {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbh5ervb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testIgnoreEmptyLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbh5ervb() throws IOException{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1127);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1128);String code = "\nfoo,baar\n\r\n,\n\n,world\r\n\n";
        //String code = "world\r\n\n";
        //String code = "foo;baar\r\n\r\nhello;\r\n\r\nworld;\r\n";
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1129);CSVParser parser = new CSVParser(new StringReader(code));
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1130);List<CSVRecord> records = parser.getRecords();
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1131);assertEquals(3, records.size());
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testForEach() throws Exception {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mbpdtvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testForEach",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mbpdtvg() throws Exception{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1132);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1133);List<CSVRecord> records = new ArrayList<CSVRecord>();
        
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1134);Reader in = new StringReader("a,b,c\n1,2,3\nx,y,z");
        
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1135);for (CSVRecord record : CSVFormat.DEFAULT.parse(in)) {{
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1136);records.add(record);
        }
        
        }__CLR4_4_1r9r9l6l8x0j6.R.inc(1137);assertEquals(3, records.size());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1138);assertArrayEquals(new String[]{"a", "b", "c"}, records.get(0).values());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1139);assertArrayEquals(new String[]{"1", "2", "3"}, records.get(1).values());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1140);assertArrayEquals(new String[]{"x", "y", "z"}, records.get(2).values());
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testIterator() throws Exception {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9uicnvp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testIterator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9uicnvp() throws Exception{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1141);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1142);Reader in = new StringReader("a,b,c\n1,2,3\nx,y,z");
        
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1143);Iterator<CSVRecord> iterator = CSVFormat.DEFAULT.parse(in).iterator();
        
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1144);assertTrue(iterator.hasNext());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1145);try {
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1146);iterator.remove();
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1147);fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1148);assertArrayEquals(new String[]{"a", "b", "c"}, iterator.next().values());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1149);assertArrayEquals(new String[]{"1", "2", "3"}, iterator.next().values());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1150);assertTrue(iterator.hasNext());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1151);assertTrue(iterator.hasNext());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1152);assertTrue(iterator.hasNext());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1153);assertArrayEquals(new String[]{"x", "y", "z"}, iterator.next().values());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1154);assertFalse(iterator.hasNext());
        
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1155);try {
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1156);iterator.next();
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1157);fail("NoSuchElementException expected");
        } catch (NoSuchElementException e) {
            // expected
        }
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}
    
    @Test
    public void testHeader() throws Exception {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1krhr6iw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testHeader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1krhr6iw6() throws Exception{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1158);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1159);Reader in = new StringReader("a,b,c\n1,2,3\nx,y,z");

        __CLR4_4_1r9r9l6l8x0j6.R.inc(1160);Iterator<CSVRecord> records = CSVFormat.DEFAULT.withHeader().parse(in).iterator();
        
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1161);for (int i = 0; (((i < 2)&&(__CLR4_4_1r9r9l6l8x0j6.R.iget(1162)!=0|true))||(__CLR4_4_1r9r9l6l8x0j6.R.iget(1163)==0&false)); i++) {{
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1164);assertTrue(records.hasNext());
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1165);CSVRecord record = records.next();
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1166);assertEquals(record.get(0), record.get("a"));
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1167);assertEquals(record.get(1), record.get("b"));
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1168);assertEquals(record.get(2), record.get("c"));
        }
        
        }__CLR4_4_1r9r9l6l8x0j6.R.inc(1169);assertFalse(records.hasNext());
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testProvidedHeader() throws Exception {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9hy15wi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testProvidedHeader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9hy15wi() throws Exception{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1170);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1171);Reader in = new StringReader("a,b,c\n1,2,3\nx,y,z");

        __CLR4_4_1r9r9l6l8x0j6.R.inc(1172);Iterator<CSVRecord> records = CSVFormat.DEFAULT.withHeader("A", "B", "C").parse(in).iterator();

        __CLR4_4_1r9r9l6l8x0j6.R.inc(1173);for (int i = 0; (((i < 3)&&(__CLR4_4_1r9r9l6l8x0j6.R.iget(1174)!=0|true))||(__CLR4_4_1r9r9l6l8x0j6.R.iget(1175)==0&false)); i++) {{
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1176);assertTrue(records.hasNext());
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1177);CSVRecord record = records.next();
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1178);assertEquals(record.get(0), record.get("A"));
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1179);assertEquals(record.get(1), record.get("B"));
            __CLR4_4_1r9r9l6l8x0j6.R.inc(1180);assertEquals(record.get(2), record.get("C"));
        }

        }__CLR4_4_1r9r9l6l8x0j6.R.inc(1181);assertFalse(records.hasNext());
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testGetLineNumberWithLF() throws Exception {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gt2yw8wu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testGetLineNumberWithLF",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gt2yw8wu() throws Exception{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1182);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1183);CSVParser parser = new CSVParser("a\nb\nc", CSVFormat.DEFAULT.withLineSeparator("\n"));
        
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1184);assertEquals(0, parser.getLineNumber());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1185);assertNotNull(parser.getRecord());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1186);assertEquals(1, parser.getLineNumber());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1187);assertNotNull(parser.getRecord());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1188);assertEquals(2, parser.getLineNumber());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1189);assertNotNull(parser.getRecord());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1190);assertEquals(2, parser.getLineNumber());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1191);assertNull(parser.getRecord());
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testGetLineNumberWithCRLF() throws Exception {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z2nsxjx4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCRLF",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z2nsxjx4() throws Exception{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1192);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1193);CSVParser parser = new CSVParser("a\r\nb\r\nc", CSVFormat.DEFAULT.withLineSeparator("\r\n"));
        
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1194);assertEquals(0, parser.getLineNumber());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1195);assertNotNull(parser.getRecord());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1196);assertEquals(1, parser.getLineNumber());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1197);assertNotNull(parser.getRecord());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1198);assertEquals(2, parser.getLineNumber());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1199);assertNotNull(parser.getRecord());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1200);assertEquals(2, parser.getLineNumber());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1201);assertNull(parser.getRecord());
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}

    @Test
    public void testGetLineNumberWithCR() throws Exception {__CLR4_4_1r9r9l6l8x0j6.R.globalSliceStart(getClass().getName(),1202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11folfhxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9r9l6l8x0j6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9r9l6l8x0j6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCR",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11folfhxe() throws Exception{try{__CLR4_4_1r9r9l6l8x0j6.R.inc(1202);
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1203);CSVParser parser = new CSVParser("a\rb\rc", CSVFormat.DEFAULT.withLineSeparator("\r"));
        
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1204);assertEquals(0, parser.getLineNumber());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1205);assertNotNull(parser.getRecord());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1206);assertEquals(1, parser.getLineNumber());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1207);assertNotNull(parser.getRecord());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1208);assertEquals(2, parser.getLineNumber());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1209);assertNotNull(parser.getRecord());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1210);assertEquals(2, parser.getLineNumber());
        __CLR4_4_1r9r9l6l8x0j6.R.inc(1211);assertNull(parser.getRecord());
    }finally{__CLR4_4_1r9r9l6l8x0j6.R.flushNeeded();}}
}
