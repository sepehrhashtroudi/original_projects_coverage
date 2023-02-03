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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;

/**
 * Basic test harness.
 *
 * Requires test file to be downloaded separately.
 *
 */
@SuppressWarnings({"boxing","fallthrough"})
public class PerformanceTest {static class __CLR4_4_114h14hl6l8x0l8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906881L,8589935092L,1666,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String[] PROPS = {
        "java.version",                  // Java Runtime Environment version
        "java.vendor",                   // Java Runtime Environment vendor
//        "java.vm.specification.version", // Java Virtual Machine specification version
//        "java.vm.specification.vendor",  // Java Virtual Machine specification vendor
//        "java.vm.specification.name",    // Java Virtual Machine specification name
        "java.vm.version",               // Java Virtual Machine implementation version
//        "java.vm.vendor",                // Java Virtual Machine implementation vendor
        "java.vm.name",                  // Java Virtual Machine implementation name
//        "java.specification.version",    // Java Runtime Environment specification version
//        "java.specification.vendor",     // Java Runtime Environment specification vendor
//        "java.specification.name",       // Java Runtime Environment specification name

        "os.name",                       // Operating system name
        "os.arch",                       // Operating system architecture
        "os.version",                    // Operating system version

    };

    private static int max = 10;

    private static int num = 0; // number of elapsed times recorded
    private static long[] elapsedTimes = new long[max];

    private static final CSVFormat format = CSVFormat.EXCEL;

    public static void main(String [] args) throws Exception {try{__CLR4_4_114h14hl6l8x0l8.R.inc(1457);
        __CLR4_4_114h14hl6l8x0l8.R.inc(1458);final int argc = args.length;
        __CLR4_4_114h14hl6l8x0l8.R.inc(1459);String tests[];
        __CLR4_4_114h14hl6l8x0l8.R.inc(1460);if ((((argc > 0)&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1461)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1462)==0&false))) {{
            __CLR4_4_114h14hl6l8x0l8.R.inc(1463);max=Integer.parseInt(args[0]);
        }
        }__CLR4_4_114h14hl6l8x0l8.R.inc(1464);if ((((argc > 1)&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1465)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1466)==0&false))) {{
            __CLR4_4_114h14hl6l8x0l8.R.inc(1467);tests = new String[argc-1];
            __CLR4_4_114h14hl6l8x0l8.R.inc(1468);for (int i = 1; (((i < argc)&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1469)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1470)==0&false)); i++) {{
                __CLR4_4_114h14hl6l8x0l8.R.inc(1471);tests[i-1]=args[i];
            }
        }} }else {{
            __CLR4_4_114h14hl6l8x0l8.R.inc(1472);tests=new String[]{"file", "split", "extb", "exts", "csv", "lexreset", "lexnew"};
        }
        }__CLR4_4_114h14hl6l8x0l8.R.inc(1473);for(String p : PROPS) {{
            __CLR4_4_114h14hl6l8x0l8.R.inc(1474);System.out.println(p+"="+System.getProperty(p));
        }
        }__CLR4_4_114h14hl6l8x0l8.R.inc(1475);System.out.println("Max count: "+max+"\n");

        __CLR4_4_114h14hl6l8x0l8.R.inc(1476);for(String test : tests) {{
            __CLR4_4_114h14hl6l8x0l8.R.inc(1477);if (((("file".equals(test))&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1478)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1479)==0&false))) {{
                __CLR4_4_114h14hl6l8x0l8.R.inc(1480);testReadBigFile(false);
            } }else {__CLR4_4_114h14hl6l8x0l8.R.inc(1481);if (((("split".equals(test))&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1482)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1483)==0&false))) {{
                __CLR4_4_114h14hl6l8x0l8.R.inc(1484);testReadBigFile(true);
            } }else {__CLR4_4_114h14hl6l8x0l8.R.inc(1485);if (((("csv".equals(test))&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1486)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1487)==0&false))) {{
                __CLR4_4_114h14hl6l8x0l8.R.inc(1488);testParseCommonsCSV();
            } }else {__CLR4_4_114h14hl6l8x0l8.R.inc(1489);if (((("lexreset".equals(test))&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1490)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1491)==0&false))) {{
                __CLR4_4_114h14hl6l8x0l8.R.inc(1492);testCSVLexer(false, test);
            } }else {__CLR4_4_114h14hl6l8x0l8.R.inc(1493);if (((("lexnew".equals(test))&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1494)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1495)==0&false))) {{
                __CLR4_4_114h14hl6l8x0l8.R.inc(1496);testCSVLexer(true, test);
            } }else {__CLR4_4_114h14hl6l8x0l8.R.inc(1497);if ((((test.startsWith("CSVLexer"))&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1498)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1499)==0&false))) {{
                __CLR4_4_114h14hl6l8x0l8.R.inc(1500);testCSVLexer(false, test);
            } }else {__CLR4_4_114h14hl6l8x0l8.R.inc(1501);if (((("extb".equals(test))&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1502)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1503)==0&false))) {{
                __CLR4_4_114h14hl6l8x0l8.R.inc(1504);testExtendedBuffer(false);
            } }else {__CLR4_4_114h14hl6l8x0l8.R.inc(1505);if (((("exts".equals(test))&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1506)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1507)==0&false))) {{
                __CLR4_4_114h14hl6l8x0l8.R.inc(1508);testExtendedBuffer(true);
            } }else {{
                __CLR4_4_114h14hl6l8x0l8.R.inc(1509);System.out.println("Invalid test name: "+test);
            }
        }}}}}}}}}
    }}finally{__CLR4_4_114h14hl6l8x0l8.R.flushNeeded();}}

    private static BufferedReader getReader() throws IOException {try{__CLR4_4_114h14hl6l8x0l8.R.inc(1510);
        __CLR4_4_114h14hl6l8x0l8.R.inc(1511);return new BufferedReader(new FileReader("worldcitiespop.txt"));
    }finally{__CLR4_4_114h14hl6l8x0l8.R.flushNeeded();}}

    // Container for basic statistics
    private static class Stats {
        final int count;
        final int fields;
        Stats(int c, int f) {try{__CLR4_4_114h14hl6l8x0l8.R.inc(1512);
            __CLR4_4_114h14hl6l8x0l8.R.inc(1513);count=c;
            __CLR4_4_114h14hl6l8x0l8.R.inc(1514);fields=f;
        }finally{__CLR4_4_114h14hl6l8x0l8.R.flushNeeded();}}
    }

    // Display end stats; store elapsed for average
    private static void show(String msg, Stats s, long start) {try{__CLR4_4_114h14hl6l8x0l8.R.inc(1515);
        __CLR4_4_114h14hl6l8x0l8.R.inc(1516);final long elapsed = System.currentTimeMillis() - start;
        __CLR4_4_114h14hl6l8x0l8.R.inc(1517);System.out.printf("%-20s: %5dms " + s.count + " lines "+ s.fields + " fields%n",msg,elapsed);
        __CLR4_4_114h14hl6l8x0l8.R.inc(1518);elapsedTimes[num++]=elapsed;
    }finally{__CLR4_4_114h14hl6l8x0l8.R.flushNeeded();}}

    // calculate and show average
    private static void show(){try{__CLR4_4_114h14hl6l8x0l8.R.inc(1519);
        __CLR4_4_114h14hl6l8x0l8.R.inc(1520);long tot = 0;
        __CLR4_4_114h14hl6l8x0l8.R.inc(1521);if ((((num > 1)&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1522)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1523)==0&false))) {{
            __CLR4_4_114h14hl6l8x0l8.R.inc(1524);for(int i=1; (((i < num)&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1525)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1526)==0&false)); i++) {{ // skip first test
                __CLR4_4_114h14hl6l8x0l8.R.inc(1527);tot += elapsedTimes[i];
            }
            }__CLR4_4_114h14hl6l8x0l8.R.inc(1528);System.out.printf("%-20s: %5dms%n%n", "Average(not first)", (tot/(num-1)));
        }
        }__CLR4_4_114h14hl6l8x0l8.R.inc(1529);num=0; // ready for next set
    }finally{__CLR4_4_114h14hl6l8x0l8.R.flushNeeded();}}

    private static void testReadBigFile(boolean split) throws Exception {try{__CLR4_4_114h14hl6l8x0l8.R.inc(1530);
       __CLR4_4_114h14hl6l8x0l8.R.inc(1531);for (int i = 0; (((i < max)&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1532)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1533)==0&false)); i++) {{
           __CLR4_4_114h14hl6l8x0l8.R.inc(1534);BufferedReader in = getReader();
           __CLR4_4_114h14hl6l8x0l8.R.inc(1535);long t0 = System.currentTimeMillis();
           __CLR4_4_114h14hl6l8x0l8.R.inc(1536);Stats s = readAll(in, split);
           __CLR4_4_114h14hl6l8x0l8.R.inc(1537);in.close();
           __CLR4_4_114h14hl6l8x0l8.R.inc(1538);show((((split)&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1539)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1540)==0&false))?"file+split":"file", s, t0);
       }
       }__CLR4_4_114h14hl6l8x0l8.R.inc(1541);show();
   }finally{__CLR4_4_114h14hl6l8x0l8.R.flushNeeded();}}

   private static Stats readAll(BufferedReader in, boolean split) throws IOException {try{__CLR4_4_114h14hl6l8x0l8.R.inc(1542);
       __CLR4_4_114h14hl6l8x0l8.R.inc(1543);int count = 0;
       __CLR4_4_114h14hl6l8x0l8.R.inc(1544);int fields = 0;
       __CLR4_4_114h14hl6l8x0l8.R.inc(1545);String record;
       __CLR4_4_114h14hl6l8x0l8.R.inc(1546);while ((record=in.readLine()) != null) {{
           __CLR4_4_114h14hl6l8x0l8.R.inc(1549);count++;
           __CLR4_4_114h14hl6l8x0l8.R.inc(1550);fields+= (((split )&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1551)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1552)==0&false))? record.split(",").length : 1;
       }
       }__CLR4_4_114h14hl6l8x0l8.R.inc(1553);return new Stats(count, fields);
   }finally{__CLR4_4_114h14hl6l8x0l8.R.flushNeeded();}}

   private static void testExtendedBuffer(boolean makeString) throws Exception {try{__CLR4_4_114h14hl6l8x0l8.R.inc(1554);
       __CLR4_4_114h14hl6l8x0l8.R.inc(1555);for (int i = 0; (((i < max)&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1556)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1557)==0&false)); i++) {{
           __CLR4_4_114h14hl6l8x0l8.R.inc(1558);ExtendedBufferedReader in = new ExtendedBufferedReader(getReader());
           __CLR4_4_114h14hl6l8x0l8.R.inc(1559);long t0 = System.currentTimeMillis();
           __CLR4_4_114h14hl6l8x0l8.R.inc(1560);int read;
           __CLR4_4_114h14hl6l8x0l8.R.inc(1561);int fields = 0;
           __CLR4_4_114h14hl6l8x0l8.R.inc(1562);int lines = 0;
           __CLR4_4_114h14hl6l8x0l8.R.inc(1563);if ((((makeString)&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1564)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1565)==0&false))) {{
               __CLR4_4_114h14hl6l8x0l8.R.inc(1566);StringBuilder sb = new StringBuilder();
               __CLR4_4_114h14hl6l8x0l8.R.inc(1567);while((read=in.read()) != -1) {{
                   __CLR4_4_114h14hl6l8x0l8.R.inc(1570);sb.append((char)read);
                   __CLR4_4_114h14hl6l8x0l8.R.inc(1571);if ((((read == ',')&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1572)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1573)==0&false))) {{ // count delimiters
                       __CLR4_4_114h14hl6l8x0l8.R.inc(1574);sb.toString();
                       __CLR4_4_114h14hl6l8x0l8.R.inc(1575);sb = new StringBuilder();
                       __CLR4_4_114h14hl6l8x0l8.R.inc(1576);fields++;
                   } }else {__CLR4_4_114h14hl6l8x0l8.R.inc(1577);if ((((read == '\n')&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1578)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1579)==0&false))) {{
                       __CLR4_4_114h14hl6l8x0l8.R.inc(1580);sb.toString();
                       __CLR4_4_114h14hl6l8x0l8.R.inc(1581);sb = new StringBuilder();
                       __CLR4_4_114h14hl6l8x0l8.R.inc(1582);lines++;
                   }
               }}}
           }} }else {{
               __CLR4_4_114h14hl6l8x0l8.R.inc(1583);while((read=in.read()) != -1) {{
                   __CLR4_4_114h14hl6l8x0l8.R.inc(1586);if ((((read == ',')&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1587)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1588)==0&false))) {{ // count delimiters
                       __CLR4_4_114h14hl6l8x0l8.R.inc(1589);fields++;
                   } }else {__CLR4_4_114h14hl6l8x0l8.R.inc(1590);if ((((read == '\n')&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1591)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1592)==0&false))) {{
                       __CLR4_4_114h14hl6l8x0l8.R.inc(1593);lines++;
                   }
               }}}
           }}
           }__CLR4_4_114h14hl6l8x0l8.R.inc(1594);fields += lines; // EOL is a delimiter too
           __CLR4_4_114h14hl6l8x0l8.R.inc(1595);in.close();
           __CLR4_4_114h14hl6l8x0l8.R.inc(1596);show("Extended"+((((makeString)&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1597)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1598)==0&false))?" toString":""), new Stats(lines, fields), t0);
       }
       }__CLR4_4_114h14hl6l8x0l8.R.inc(1599);show();
   }finally{__CLR4_4_114h14hl6l8x0l8.R.flushNeeded();}}

   private static void testParseCommonsCSV() throws Exception {try{__CLR4_4_114h14hl6l8x0l8.R.inc(1600);
       __CLR4_4_114h14hl6l8x0l8.R.inc(1601);for (int i = 0; (((i < max)&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1602)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1603)==0&false)); i++) {{
           __CLR4_4_114h14hl6l8x0l8.R.inc(1604);final BufferedReader reader = getReader();
           __CLR4_4_114h14hl6l8x0l8.R.inc(1605);CSVParser parser = new CSVParser(reader, format);
           __CLR4_4_114h14hl6l8x0l8.R.inc(1606);long t0 = System.currentTimeMillis();
           __CLR4_4_114h14hl6l8x0l8.R.inc(1607);Stats s = iterate(parser);
           __CLR4_4_114h14hl6l8x0l8.R.inc(1608);reader.close();
           __CLR4_4_114h14hl6l8x0l8.R.inc(1609);show("CSV", s, t0);
       }
       }__CLR4_4_114h14hl6l8x0l8.R.inc(1610);show();
   }finally{__CLR4_4_114h14hl6l8x0l8.R.flushNeeded();}}


   private static Constructor<Lexer> getLexerCtor(String clazz) throws Exception {try{__CLR4_4_114h14hl6l8x0l8.R.inc(1611);
       __CLR4_4_114h14hl6l8x0l8.R.inc(1612);@SuppressWarnings("unchecked")
       Class<Lexer> lexer = (Class<Lexer>) Class.forName("org.apache.commons.csv."+clazz);
       __CLR4_4_114h14hl6l8x0l8.R.inc(1613);Constructor<Lexer> ctor = lexer.getConstructor(new Class<?>[]{CSVFormat.class, ExtendedBufferedReader.class});
       __CLR4_4_114h14hl6l8x0l8.R.inc(1614);return ctor;
   }finally{__CLR4_4_114h14hl6l8x0l8.R.flushNeeded();}}

   private static void testCSVLexer(final boolean newToken, String test) throws Exception {try{__CLR4_4_114h14hl6l8x0l8.R.inc(1615);
       __CLR4_4_114h14hl6l8x0l8.R.inc(1616);Token token = new Token();
       __CLR4_4_114h14hl6l8x0l8.R.inc(1617);String dynamic = "";
       __CLR4_4_114h14hl6l8x0l8.R.inc(1618);for (int i = 0; (((i < max)&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1619)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1620)==0&false)); i++) {{
           __CLR4_4_114h14hl6l8x0l8.R.inc(1621);final ExtendedBufferedReader input = new ExtendedBufferedReader(getReader());
           __CLR4_4_114h14hl6l8x0l8.R.inc(1622);Lexer lexer = null;
           __CLR4_4_114h14hl6l8x0l8.R.inc(1623);if ((((test.startsWith("CSVLexer"))&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1624)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1625)==0&false))) {{
               __CLR4_4_114h14hl6l8x0l8.R.inc(1626);dynamic="!";
               __CLR4_4_114h14hl6l8x0l8.R.inc(1627);lexer = getLexerCtor(test).newInstance(new Object[]{format, input});
           } }else {{
               __CLR4_4_114h14hl6l8x0l8.R.inc(1628);lexer = new CSVLexer(format, input);
           }
           }__CLR4_4_114h14hl6l8x0l8.R.inc(1629);int count = 0;
           __CLR4_4_114h14hl6l8x0l8.R.inc(1630);int fields = 0;
           __CLR4_4_114h14hl6l8x0l8.R.inc(1631);long t0 = System.currentTimeMillis();
           __CLR4_4_114h14hl6l8x0l8.R.inc(1632);do {{
               __CLR4_4_114h14hl6l8x0l8.R.inc(1633);if ((((newToken)&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1634)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1635)==0&false))) {{
                   __CLR4_4_114h14hl6l8x0l8.R.inc(1636);token = new Token();
               } }else {{
                   __CLR4_4_114h14hl6l8x0l8.R.inc(1637);token.reset();
               }
               }__CLR4_4_114h14hl6l8x0l8.R.inc(1638);lexer.nextToken(token);
               boolean __CLB4_4_1_bool0=false;__CLR4_4_114h14hl6l8x0l8.R.inc(1639);switch(token.type) {
               case EOF:if (!__CLB4_4_1_bool0) {__CLR4_4_114h14hl6l8x0l8.R.inc(1640);__CLB4_4_1_bool0=true;}
                   __CLR4_4_114h14hl6l8x0l8.R.inc(1641);break;
               case EORECORD:if (!__CLB4_4_1_bool0) {__CLR4_4_114h14hl6l8x0l8.R.inc(1642);__CLB4_4_1_bool0=true;}
                   __CLR4_4_114h14hl6l8x0l8.R.inc(1643);fields++;
                   __CLR4_4_114h14hl6l8x0l8.R.inc(1644);count++;
                   __CLR4_4_114h14hl6l8x0l8.R.inc(1645);break;
               case INVALID:if (!__CLB4_4_1_bool0) {__CLR4_4_114h14hl6l8x0l8.R.inc(1646);__CLB4_4_1_bool0=true;}
                   __CLR4_4_114h14hl6l8x0l8.R.inc(1647);throw new IOException("invalid parse sequence");
               case TOKEN:if (!__CLB4_4_1_bool0) {__CLR4_4_114h14hl6l8x0l8.R.inc(1648);__CLB4_4_1_bool0=true;}
                   __CLR4_4_114h14hl6l8x0l8.R.inc(1649);fields++;
                   __CLR4_4_114h14hl6l8x0l8.R.inc(1650);break;
              }

           } }while ((((!token.type.equals(Token.Type.EOF))&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1651)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1652)==0&false)));
           __CLR4_4_114h14hl6l8x0l8.R.inc(1653);Stats s = new Stats(count, fields);
           __CLR4_4_114h14hl6l8x0l8.R.inc(1654);input.close();
           __CLR4_4_114h14hl6l8x0l8.R.inc(1655);show(lexer.getClass().getSimpleName()+dynamic+" "+((((newToken )&&(__CLR4_4_114h14hl6l8x0l8.R.iget(1656)!=0|true))||(__CLR4_4_114h14hl6l8x0l8.R.iget(1657)==0&false))? "new" : "reset"), s, t0);
       }
       }__CLR4_4_114h14hl6l8x0l8.R.inc(1658);show();
   }finally{__CLR4_4_114h14hl6l8x0l8.R.flushNeeded();}}

   private static Stats iterate(Iterable<CSVRecord> it) {try{__CLR4_4_114h14hl6l8x0l8.R.inc(1659);
       __CLR4_4_114h14hl6l8x0l8.R.inc(1660);int count = 0;
       __CLR4_4_114h14hl6l8x0l8.R.inc(1661);int fields = 0;
       __CLR4_4_114h14hl6l8x0l8.R.inc(1662);for (CSVRecord record : it) {{
           __CLR4_4_114h14hl6l8x0l8.R.inc(1663);count++;
           __CLR4_4_114h14hl6l8x0l8.R.inc(1664);fields+=record.size();
       }
       }__CLR4_4_114h14hl6l8x0l8.R.inc(1665);return new Stats(count, fields);
   }finally{__CLR4_4_114h14hl6l8x0l8.R.flushNeeded();}}

}