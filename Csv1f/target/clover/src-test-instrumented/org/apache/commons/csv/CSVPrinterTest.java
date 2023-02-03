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
import java.io.StringWriter;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.*;

@java.lang.SuppressWarnings({"fallthrough"}) public class CSVPrinterTest {static class __CLR4_4_1xoxol6l8x0k2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906881L,8589935092L,1396,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    String lineSeparator = CSVFormat.DEFAULT.getLineSeparator();

    @Test
    public void testPrinter1() throws IOException {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177hfwwxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testPrinter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177hfwwxo() throws IOException{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1212);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1213);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1214);CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1215);printer.println("a", "b");
        __CLR4_4_1xoxol6l8x0k2.R.inc(1216);assertEquals("a,b" + lineSeparator, sw.toString());
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    @Test
    public void testPrinter2() throws IOException {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yhh4fxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testPrinter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yhh4fxt() throws IOException{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1217);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1218);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1219);CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1220);printer.println("a,b", "b");
        __CLR4_4_1xoxol6l8x0k2.R.inc(1221);assertEquals("\"a,b\",b" + lineSeparator, sw.toString());
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    @Test
    public void testPrinter3() throws IOException {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phibyxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testPrinter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phibyxy() throws IOException{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1222);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1223);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1224);CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1225);printer.println("a, b", "b ");
        __CLR4_4_1xoxol6l8x0k2.R.inc(1226);assertEquals("\"a, b\",\"b \"" + lineSeparator, sw.toString());
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    @Test
    public void testPrinter4() throws IOException {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jiggjy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testPrinter4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jiggjy3() throws IOException{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1227);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1228);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1229);CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1230);printer.println("a", "b\"c");
        __CLR4_4_1xoxol6l8x0k2.R.inc(1231);assertEquals("a,\"b\"\"c\"" + lineSeparator, sw.toString());
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    @Test
    public void testPrinter5() throws IOException {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15sif90y8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testPrinter5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15sif90y8() throws IOException{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1232);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1233);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1234);CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1235);printer.println("a", "b\nc");
        __CLR4_4_1xoxol6l8x0k2.R.inc(1236);assertEquals("a,\"b\nc\"" + lineSeparator, sw.toString());
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    @Test
    public void testPrinter6() throws IOException {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_191ie1hyd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testPrinter6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_191ie1hyd() throws IOException{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1237);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1238);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1239);CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1240);printer.println("a", "b\r\nc");
        __CLR4_4_1xoxol6l8x0k2.R.inc(1241);assertEquals("a,\"b\r\nc\"" + lineSeparator, sw.toString());
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    @Test
    public void testPrinter7() throws IOException {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1caictyyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testPrinter7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1caictyyi() throws IOException{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1242);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1243);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1244);CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1245);printer.println("a", "b\\c");
        __CLR4_4_1xoxol6l8x0k2.R.inc(1246);assertEquals("a,b\\c" + lineSeparator, sw.toString());
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    @Test
    public void testExcelPrinter1() throws IOException {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c79qilyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testExcelPrinter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c79qilyn() throws IOException{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1247);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1248);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1249);CSVPrinter printer = new CSVPrinter(sw, CSVFormat.EXCEL);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1250);printer.println("a", "b");
        __CLR4_4_1xoxol6l8x0k2.R.inc(1251);assertEquals("a,b" + lineSeparator, sw.toString());
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    @Test
    public void testExcelPrinter2() throws IOException {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18y9rq4ys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testExcelPrinter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18y9rq4ys() throws IOException{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1252);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1253);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1254);CSVPrinter printer = new CSVPrinter(sw, CSVFormat.EXCEL);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1255);printer.println("a,b", "b");
        __CLR4_4_1xoxol6l8x0k2.R.inc(1256);assertEquals("\"a,b\",b" + lineSeparator, sw.toString());
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    @Test
    public void testPrintNullValues() throws IOException {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt54h7yx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testPrintNullValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt54h7yx() throws IOException{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1257);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1258);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1259);CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1260);printer.println("a", null, "b");
        __CLR4_4_1xoxol6l8x0k2.R.inc(1261);assertEquals("a,,b" + lineSeparator, sw.toString());
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    @Test
    public void testDisabledComment() throws IOException {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9dkzcz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testDisabledComment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9dkzcz2() throws IOException{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1262);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1263);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1264);CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1265);printer.printComment("This is a comment");
        
        __CLR4_4_1xoxol6l8x0k2.R.inc(1266);assertEquals("", sw.toString());
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    @Test
    public void testSingleLineComment() throws IOException {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15d68dkz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testSingleLineComment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15d68dkz7() throws IOException{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1267);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1268);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1269);CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withCommentStart('#'));
        __CLR4_4_1xoxol6l8x0k2.R.inc(1270);printer.printComment("This is a comment");
        
        __CLR4_4_1xoxol6l8x0k2.R.inc(1271);assertEquals("# This is a comment" + lineSeparator, sw.toString());
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    @Test
    public void testMultiLineComment() throws IOException {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mkihf9zc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testMultiLineComment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mkihf9zc() throws IOException{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1272);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1273);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1274);CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withCommentStart('#'));
        __CLR4_4_1xoxol6l8x0k2.R.inc(1275);printer.printComment("This is a comment\non multiple lines");
        
        __CLR4_4_1xoxol6l8x0k2.R.inc(1276);assertEquals("# This is a comment" + lineSeparator + "# on multiple lines" + lineSeparator, sw.toString());
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    @Test
    public void testRandom() throws Exception {__CLR4_4_1xoxol6l8x0k2.R.globalSliceStart(getClass().getName(),1277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ujoeaszh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xoxol6l8x0k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xoxol6l8x0k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVPrinterTest.testRandom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ujoeaszh() throws Exception{try{__CLR4_4_1xoxol6l8x0k2.R.inc(1277);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1278);int iter = 10000;
        __CLR4_4_1xoxol6l8x0k2.R.inc(1279);doRandom(CSVFormat.DEFAULT, iter);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1280);doRandom(CSVFormat.EXCEL, iter);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1281);doRandom(CSVFormat.MYSQL, iter);
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    public void doRandom(CSVFormat format, int iter) throws Exception {try{__CLR4_4_1xoxol6l8x0k2.R.inc(1282);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1283);for (int i = 0; (((i < iter)&&(__CLR4_4_1xoxol6l8x0k2.R.iget(1284)!=0|true))||(__CLR4_4_1xoxol6l8x0k2.R.iget(1285)==0&false)); i++) {{
            __CLR4_4_1xoxol6l8x0k2.R.inc(1286);doOneRandom(format);
        }
    }}finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    public void doOneRandom(CSVFormat format) throws Exception {try{__CLR4_4_1xoxol6l8x0k2.R.inc(1287);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1288);Random r = new Random();
        
        __CLR4_4_1xoxol6l8x0k2.R.inc(1289);int nLines = r.nextInt(4) + 1;
        __CLR4_4_1xoxol6l8x0k2.R.inc(1290);int nCol = r.nextInt(3) + 1;
        // nLines=1;nCol=2;
        __CLR4_4_1xoxol6l8x0k2.R.inc(1291);String[][] lines = new String[nLines][];
        __CLR4_4_1xoxol6l8x0k2.R.inc(1292);for (int i = 0; (((i < nLines)&&(__CLR4_4_1xoxol6l8x0k2.R.iget(1293)!=0|true))||(__CLR4_4_1xoxol6l8x0k2.R.iget(1294)==0&false)); i++) {{
            __CLR4_4_1xoxol6l8x0k2.R.inc(1295);String[] line = new String[nCol];
            __CLR4_4_1xoxol6l8x0k2.R.inc(1296);lines[i] = line;
            __CLR4_4_1xoxol6l8x0k2.R.inc(1297);for (int j = 0; (((j < nCol)&&(__CLR4_4_1xoxol6l8x0k2.R.iget(1298)!=0|true))||(__CLR4_4_1xoxol6l8x0k2.R.iget(1299)==0&false)); j++) {{
                __CLR4_4_1xoxol6l8x0k2.R.inc(1300);line[j] = randStr();
            }
        }}

        }__CLR4_4_1xoxol6l8x0k2.R.inc(1301);StringWriter sw = new StringWriter();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1302);CSVPrinter printer = new CSVPrinter(sw, format);

        __CLR4_4_1xoxol6l8x0k2.R.inc(1303);for (int i = 0; (((i < nLines)&&(__CLR4_4_1xoxol6l8x0k2.R.iget(1304)!=0|true))||(__CLR4_4_1xoxol6l8x0k2.R.iget(1305)==0&false)); i++) {{
            // for (int j=0; j<lines[i].length; j++) System.out.println("### VALUE=:" + printable(lines[i][j]));
            __CLR4_4_1xoxol6l8x0k2.R.inc(1306);printer.println(lines[i]);
        }

        }__CLR4_4_1xoxol6l8x0k2.R.inc(1307);printer.flush();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1308);String result = sw.toString();
        // System.out.println("### :" + printable(result));

        __CLR4_4_1xoxol6l8x0k2.R.inc(1309);CSVParser parser = new CSVParser(result, format);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1310);List<CSVRecord> parseResult = parser.getRecords();

        __CLR4_4_1xoxol6l8x0k2.R.inc(1311);if ((((!equals(lines, parseResult))&&(__CLR4_4_1xoxol6l8x0k2.R.iget(1312)!=0|true))||(__CLR4_4_1xoxol6l8x0k2.R.iget(1313)==0&false))) {{
            __CLR4_4_1xoxol6l8x0k2.R.inc(1314);System.out.println("Printer output :" + printable(result));
            __CLR4_4_1xoxol6l8x0k2.R.inc(1315);assertTrue(false);
        }
    }}finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    public static boolean equals(String[][] a, List<CSVRecord> b) {try{__CLR4_4_1xoxol6l8x0k2.R.inc(1316);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1317);if ((((a.length != b.size())&&(__CLR4_4_1xoxol6l8x0k2.R.iget(1318)!=0|true))||(__CLR4_4_1xoxol6l8x0k2.R.iget(1319)==0&false))) {{
            __CLR4_4_1xoxol6l8x0k2.R.inc(1320);return false;
        }
        }__CLR4_4_1xoxol6l8x0k2.R.inc(1321);for (int i = 0; (((i < a.length)&&(__CLR4_4_1xoxol6l8x0k2.R.iget(1322)!=0|true))||(__CLR4_4_1xoxol6l8x0k2.R.iget(1323)==0&false)); i++) {{
            __CLR4_4_1xoxol6l8x0k2.R.inc(1324);String[] linea = a[i];
            __CLR4_4_1xoxol6l8x0k2.R.inc(1325);String[] lineb = b.get(i).values();
            __CLR4_4_1xoxol6l8x0k2.R.inc(1326);if ((((linea.length != lineb.length)&&(__CLR4_4_1xoxol6l8x0k2.R.iget(1327)!=0|true))||(__CLR4_4_1xoxol6l8x0k2.R.iget(1328)==0&false))) {{
                __CLR4_4_1xoxol6l8x0k2.R.inc(1329);return false;
            }
            }__CLR4_4_1xoxol6l8x0k2.R.inc(1330);for (int j = 0; (((j < linea.length)&&(__CLR4_4_1xoxol6l8x0k2.R.iget(1331)!=0|true))||(__CLR4_4_1xoxol6l8x0k2.R.iget(1332)==0&false)); j++) {{
                __CLR4_4_1xoxol6l8x0k2.R.inc(1333);String aval = linea[j];
                __CLR4_4_1xoxol6l8x0k2.R.inc(1334);String bval = lineb[j];
                __CLR4_4_1xoxol6l8x0k2.R.inc(1335);if ((((!aval.equals(bval))&&(__CLR4_4_1xoxol6l8x0k2.R.iget(1336)!=0|true))||(__CLR4_4_1xoxol6l8x0k2.R.iget(1337)==0&false))) {{
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1338);System.out.println("expected  :" + printable(aval));
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1339);System.out.println("got       :" + printable(bval));
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1340);return false;
                }
            }}
        }}
        }__CLR4_4_1xoxol6l8x0k2.R.inc(1341);return true;
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    public static String printable(String s) {try{__CLR4_4_1xoxol6l8x0k2.R.inc(1342);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1343);StringBuilder sb = new StringBuilder();
        __CLR4_4_1xoxol6l8x0k2.R.inc(1344);for (int i = 0; (((i < s.length())&&(__CLR4_4_1xoxol6l8x0k2.R.iget(1345)!=0|true))||(__CLR4_4_1xoxol6l8x0k2.R.iget(1346)==0&false)); i++) {{
            __CLR4_4_1xoxol6l8x0k2.R.inc(1347);char ch = s.charAt(i);
            __CLR4_4_1xoxol6l8x0k2.R.inc(1348);if ((((ch <= ' ' || ch >= 128)&&(__CLR4_4_1xoxol6l8x0k2.R.iget(1349)!=0|true))||(__CLR4_4_1xoxol6l8x0k2.R.iget(1350)==0&false))) {{
                __CLR4_4_1xoxol6l8x0k2.R.inc(1351);sb.append("(").append((int) ch).append(")");
            } }else {{
                __CLR4_4_1xoxol6l8x0k2.R.inc(1352);sb.append(ch);
            }
        }}
        }__CLR4_4_1xoxol6l8x0k2.R.inc(1353);return sb.toString();
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

    public String randStr() {try{__CLR4_4_1xoxol6l8x0k2.R.inc(1354);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1355);Random r = new Random();
        
        __CLR4_4_1xoxol6l8x0k2.R.inc(1356);int sz = r.nextInt(20);
        // sz = r.nextInt(3);
        __CLR4_4_1xoxol6l8x0k2.R.inc(1357);char[] buf = new char[sz];
        __CLR4_4_1xoxol6l8x0k2.R.inc(1358);for (int i = 0; (((i < sz)&&(__CLR4_4_1xoxol6l8x0k2.R.iget(1359)!=0|true))||(__CLR4_4_1xoxol6l8x0k2.R.iget(1360)==0&false)); i++) {{
            // stick in special chars with greater frequency
            __CLR4_4_1xoxol6l8x0k2.R.inc(1361);char ch;
            __CLR4_4_1xoxol6l8x0k2.R.inc(1362);int what = r.nextInt(20);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1xoxol6l8x0k2.R.inc(1363);switch (what) {
                case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1xoxol6l8x0k2.R.inc(1364);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1365);ch = '\r';
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1366);break;
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1xoxol6l8x0k2.R.inc(1367);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1368);ch = '\n';
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1369);break;
                case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_1xoxol6l8x0k2.R.inc(1370);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1371);ch = '\t';
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1372);break;
                case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_1xoxol6l8x0k2.R.inc(1373);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1374);ch = '\f';
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1375);break;
                case 4:if (!__CLB4_4_1_bool0) {__CLR4_4_1xoxol6l8x0k2.R.inc(1376);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1377);ch = ' ';
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1378);break;
                case 5:if (!__CLB4_4_1_bool0) {__CLR4_4_1xoxol6l8x0k2.R.inc(1379);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1380);ch = ',';
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1381);break;
                case 6:if (!__CLB4_4_1_bool0) {__CLR4_4_1xoxol6l8x0k2.R.inc(1382);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1383);ch = '"';
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1384);break;
                case 7:if (!__CLB4_4_1_bool0) {__CLR4_4_1xoxol6l8x0k2.R.inc(1385);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1386);ch = '\'';
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1387);break;
                case 8:if (!__CLB4_4_1_bool0) {__CLR4_4_1xoxol6l8x0k2.R.inc(1388);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1389);ch = '\\';
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1390);break;
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_1xoxol6l8x0k2.R.inc(1391);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1392);ch = (char) r.nextInt(300);
                    __CLR4_4_1xoxol6l8x0k2.R.inc(1393);break;
                // default: ch = 'a'; break;
            }
            __CLR4_4_1xoxol6l8x0k2.R.inc(1394);buf[i] = ch;
        }
        }__CLR4_4_1xoxol6l8x0k2.R.inc(1395);return new String(buf);
    }finally{__CLR4_4_1xoxol6l8x0k2.R.flushNeeded();}}

}
