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

import java.io.StringReader;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExtendedBufferedReaderTest {static class __CLR4_4_112s12sl6l8x0kj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906881L,8589935092L,1457,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testEmptyInput() throws Exception {__CLR4_4_112s12sl6l8x0kj.R.globalSliceStart(getClass().getName(),1396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ft8gdm12s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112s12sl6l8x0kj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112s12sl6l8x0kj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.ExtendedBufferedReaderTest.testEmptyInput",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ft8gdm12s() throws Exception{try{__CLR4_4_112s12sl6l8x0kj.R.inc(1396);
        __CLR4_4_112s12sl6l8x0kj.R.inc(1397);ExtendedBufferedReader br = getBufferedReader("");
        __CLR4_4_112s12sl6l8x0kj.R.inc(1398);assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.read());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1399);assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.lookAhead());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1400);assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.readAgain());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1401);assertNull(br.readLine());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1402);assertEquals(0, br.read(new char[10], 0, 0));
    }finally{__CLR4_4_112s12sl6l8x0kj.R.flushNeeded();}}

    @Test
    public void testReadLookahead1() {__CLR4_4_112s12sl6l8x0kj.R.globalSliceStart(getClass().getName(),1403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtgdoi12z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112s12sl6l8x0kj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112s12sl6l8x0kj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.ExtendedBufferedReaderTest.testReadLookahead1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtgdoi12z(){try{__CLR4_4_112s12sl6l8x0kj.R.inc(1403);}finally{__CLR4_4_112s12sl6l8x0kj.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testReadLookahead1() throws Exception {
//         ExtendedBufferedReader br = getBufferedReader("1\n2\r3\n");
//         assertEquals('1', br.lookAhead());
//         assertEquals(ExtendedBufferedReader.UNDEFINED, br.readAgain());
//         assertEquals('1', br.read());
//         assertEquals('1', br.readAgain());
// 
//         assertEquals(0, br.getLineNumber());
//         assertEquals('\n', br.lookAhead());
//         assertEquals(0, br.getLineNumber());
//         assertEquals('1', br.readAgain());
//         assertEquals('\n', br.read());
//         assertEquals(1, br.getLineNumber());
//         assertEquals('\n', br.readAgain());
//         assertEquals(1, br.getLineNumber());
// 
//         assertEquals('2', br.lookAhead());
//         assertEquals(1, br.getLineNumber());
//         assertEquals('\n', br.readAgain());
//         assertEquals(1, br.getLineNumber());
//         assertEquals('2', br.read());
//         assertEquals('2', br.readAgain());
// 
//         assertEquals('\r', br.lookAhead());
//         assertEquals('2', br.readAgain());
//         assertEquals('\r', br.read());
//         assertEquals('\r', br.readAgain());
// 
//         assertEquals('3', br.lookAhead());
//         assertEquals('\r', br.readAgain());
//         assertEquals('3', br.read());
//         assertEquals('3', br.readAgain());
// 
//         assertEquals('\n', br.lookAhead());
//         assertEquals(1, br.getLineNumber()); // will need fixing for CSV-75
//         assertEquals('3', br.readAgain());
//         assertEquals('\n', br.read());
//         assertEquals(2, br.getLineNumber()); // will need fixing for CSV-75
//         assertEquals('\n', br.readAgain());
//         assertEquals(2, br.getLineNumber()); // will need fixing for CSV-75
// 
//         assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.lookAhead());
//         assertEquals('\n', br.readAgain());
//         assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.read());
//         assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.readAgain());
//         assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.read());
//         assertEquals(ExtendedBufferedReader.END_OF_STREAM, br.lookAhead());
// 
//     }

    @Test
    public void testReadLookahead2() throws Exception {__CLR4_4_112s12sl6l8x0kj.R.globalSliceStart(getClass().getName(),1404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tkgew1130();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112s12sl6l8x0kj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112s12sl6l8x0kj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.ExtendedBufferedReaderTest.testReadLookahead2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tkgew1130() throws Exception{try{__CLR4_4_112s12sl6l8x0kj.R.inc(1404);
        __CLR4_4_112s12sl6l8x0kj.R.inc(1405);char[] ref = new char[5];
        __CLR4_4_112s12sl6l8x0kj.R.inc(1406);char[] res = new char[5];
        
        __CLR4_4_112s12sl6l8x0kj.R.inc(1407);ExtendedBufferedReader br = getBufferedReader("abcdefg");
        __CLR4_4_112s12sl6l8x0kj.R.inc(1408);ref[0] = 'a';
        __CLR4_4_112s12sl6l8x0kj.R.inc(1409);ref[1] = 'b';
        __CLR4_4_112s12sl6l8x0kj.R.inc(1410);ref[2] = 'c';
        __CLR4_4_112s12sl6l8x0kj.R.inc(1411);assertEquals(3, br.read(res, 0, 3));
        __CLR4_4_112s12sl6l8x0kj.R.inc(1412);assertArrayEquals(ref, res);
        __CLR4_4_112s12sl6l8x0kj.R.inc(1413);assertEquals('c', br.readAgain());

        __CLR4_4_112s12sl6l8x0kj.R.inc(1414);assertEquals('d', br.lookAhead());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1415);ref[4] = 'd';
        __CLR4_4_112s12sl6l8x0kj.R.inc(1416);assertEquals(1, br.read(res, 4, 1));
        __CLR4_4_112s12sl6l8x0kj.R.inc(1417);assertArrayEquals(ref, res);
        __CLR4_4_112s12sl6l8x0kj.R.inc(1418);assertEquals('d', br.readAgain());
    }finally{__CLR4_4_112s12sl6l8x0kj.R.flushNeeded();}}

    @Test
    public void testReadLine() throws Exception {__CLR4_4_112s12sl6l8x0kj.R.globalSliceStart(getClass().getName(),1419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ep5lb713f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112s12sl6l8x0kj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112s12sl6l8x0kj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.ExtendedBufferedReaderTest.testReadLine",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ep5lb713f() throws Exception{try{__CLR4_4_112s12sl6l8x0kj.R.inc(1419);
        __CLR4_4_112s12sl6l8x0kj.R.inc(1420);ExtendedBufferedReader br = getBufferedReader("");
        __CLR4_4_112s12sl6l8x0kj.R.inc(1421);assertNull(br.readLine());

        __CLR4_4_112s12sl6l8x0kj.R.inc(1422);br = getBufferedReader("\n");
        __CLR4_4_112s12sl6l8x0kj.R.inc(1423);assertEquals("",br.readLine());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1424);assertNull(br.readLine());

        __CLR4_4_112s12sl6l8x0kj.R.inc(1425);br = getBufferedReader("foo\n\nhello");
        __CLR4_4_112s12sl6l8x0kj.R.inc(1426);assertEquals(0, br.getLineNumber());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1427);assertEquals("foo",br.readLine());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1428);assertEquals(1, br.getLineNumber());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1429);assertEquals("",br.readLine());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1430);assertEquals(2, br.getLineNumber());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1431);assertEquals("hello",br.readLine());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1432);assertEquals(3, br.getLineNumber());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1433);assertNull(br.readLine());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1434);assertEquals(3, br.getLineNumber());

        __CLR4_4_112s12sl6l8x0kj.R.inc(1435);br = getBufferedReader("foo\n\nhello");
        __CLR4_4_112s12sl6l8x0kj.R.inc(1436);assertEquals('f', br.read());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1437);assertEquals('o', br.lookAhead());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1438);assertEquals("oo",br.readLine());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1439);assertEquals(1, br.getLineNumber());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1440);assertEquals('\n', br.lookAhead());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1441);assertEquals("",br.readLine());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1442);assertEquals(2, br.getLineNumber());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1443);assertEquals('h', br.lookAhead());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1444);assertEquals("hello",br.readLine());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1445);assertNull(br.readLine());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1446);assertEquals(3, br.getLineNumber());


        __CLR4_4_112s12sl6l8x0kj.R.inc(1447);br = getBufferedReader("foo\rbaar\r\nfoo");
        __CLR4_4_112s12sl6l8x0kj.R.inc(1448);assertEquals("foo",br.readLine());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1449);assertEquals('b', br.lookAhead());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1450);assertEquals("baar",br.readLine());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1451);assertEquals('f', br.lookAhead());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1452);assertEquals("foo",br.readLine());
        __CLR4_4_112s12sl6l8x0kj.R.inc(1453);assertNull(br.readLine());
    }finally{__CLR4_4_112s12sl6l8x0kj.R.flushNeeded();}}

    /*
     * Test to illustrate  https://issues.apache.org/jira/browse/CSV-75
     * 
     * TODO fix checks when code is fixed
     */
    @Test
    public void testReadChar() {__CLR4_4_112s12sl6l8x0kj.R.globalSliceStart(getClass().getName(),1454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1frrfln14e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112s12sl6l8x0kj.R.rethrow($CLV_t2$);}finally{__CLR4_4_112s12sl6l8x0kj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.ExtendedBufferedReaderTest.testReadChar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1frrfln14e(){try{__CLR4_4_112s12sl6l8x0kj.R.inc(1454);}finally{__CLR4_4_112s12sl6l8x0kj.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testReadChar() throws Exception {
//         String LF="\n"; String CR="\r"; String CRLF=CR+LF; String LFCR=LF+CR;// easier to read the string below
//         String test="a" + LF + "b" + CR + "c" + LF + LF + "d" + CR + CR + "e" + LFCR + "f "+ CRLF;
//         //                EOL        eol        EOL  EOL        eol  eol        EOL+CR        EOL
//         // EOL = current EOL behaviour with read() methods
//         // eol = additional behaviour with readLine()
//         final int EOLct=5;
//         final int EOLeolct=9;
//         ExtendedBufferedReader br;
//         
//         br = getBufferedReader(test);
//         assertEquals(0, br.getLineNumber());
//         while(br.readLine()!=null) {}
//         assertEquals(EOLeolct, br.getLineNumber());
// 
//         br = getBufferedReader(test);
//         assertEquals(0, br.getLineNumber());
//         while(br.read()!=-1) {}
//         assertEquals(EOLct, br.getLineNumber()); // will need fixing for CSV-75
// 
//         br = getBufferedReader(test);
//         assertEquals(0, br.getLineNumber());
//         char[] buff = new char[10];
//         while(br.read(buff ,0, 3)!=-1) {}
//         assertEquals(EOLct, br.getLineNumber()); // will need fixing for CSV-75
//     }

    private ExtendedBufferedReader getBufferedReader(String s) {try{__CLR4_4_112s12sl6l8x0kj.R.inc(1455);
        __CLR4_4_112s12sl6l8x0kj.R.inc(1456);return new ExtendedBufferedReader(new StringReader(s));
    }finally{__CLR4_4_112s12sl6l8x0kj.R.flushNeeded();}}
}
