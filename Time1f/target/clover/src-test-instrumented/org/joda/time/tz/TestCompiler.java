/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.tz;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear;

/**
 * Test cases for ZoneInfoCompiler.
 *
 * @author Brian S O'Neill
 */
public class TestCompiler extends TestCase {static class __CLR4_4_11c871c87lc8azxqv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,62605,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_11c871c87lc8azxqv.R.inc(62503);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62504);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_11c871c87lc8azxqv.R.inc(62505);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62506);return new TestSuite(TestCompiler.class);
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    static final String AMERICA_LOS_ANGELES_FILE =
        "# Rules for building just America/Los_Angeles time zone.\n" + 
        "\n" + 
        "Rule    US  1918    1919    -   Mar lastSun 2:00    1:00    D\n" + 
        "Rule    US  1918    1919    -   Oct lastSun 2:00    0   S\n" + 
        "Rule    US  1942    only    -   Feb 9   2:00    1:00    W # War\n" + 
        "Rule    US  1945    only    -   Aug 14  23:00u  1:00    P # Peace\n" + 
        "Rule    US  1945    only    -   Sep 30  2:00    0   S\n" + 
        "Rule    US  1967    max -   Oct lastSun 2:00    0   S\n" + 
        "Rule    US  1967    1973    -   Apr lastSun 2:00    1:00    D\n" + 
        "Rule    US  1974    only    -   Jan 6   2:00    1:00    D\n" + 
        "Rule    US  1975    only    -   Feb 23  2:00    1:00    D\n" + 
        "Rule    US  1976    1986    -   Apr lastSun 2:00    1:00    D\n" + 
        "Rule    US  1987    max -   Apr Sun>=1  2:00    1:00    D\n" + 
        "\n" + 
        "Rule    CA  1948    only    -   Mar 14  2:00    1:00    D\n" + 
        "Rule    CA  1949    only    -   Jan  1  2:00    0   S\n" + 
        "Rule    CA  1950    1966    -   Apr lastSun 2:00    1:00    D\n" + 
        "Rule    CA  1950    1961    -   Sep lastSun 2:00    0   S\n" + 
        "Rule    CA  1962    1966    -   Oct lastSun 2:00    0   S\n" + 
        "\n" + 
        "Zone America/Los_Angeles -7:52:58 - LMT 1883 Nov 18 12:00\n" + 
        "            -8:00   US  P%sT    1946\n" + 
        "            -8:00   CA  P%sT    1967\n" + 
        "            -8:00   US  P%sT";

    private DateTimeZone originalDateTimeZone = null;

    public TestCompiler(String name) {
        super(name);__CLR4_4_11c871c87lc8azxqv.R.inc(62508);try{__CLR4_4_11c871c87lc8azxqv.R.inc(62507);
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_11c871c87lc8azxqv.R.inc(62509);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62510);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11c871c87lc8azxqv.R.inc(62511);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_11c871c87lc8azxqv.R.inc(62512);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62513);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testDateTimeZoneBuilder() throws Exception {__CLR4_4_11c871c87lc8azxqv.R.globalSliceStart(getClass().getName(),62514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1htaeo91c8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c871c87lc8azxqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c871c87lc8azxqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.testDateTimeZoneBuilder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1htaeo91c8i() throws Exception{try{__CLR4_4_11c871c87lc8azxqv.R.inc(62514);
        // test multithreading, issue #18
        __CLR4_4_11c871c87lc8azxqv.R.inc(62515);getTestDataTimeZoneBuilder().toDateTimeZone("TestDTZ1", true);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62516);final DateTimeZone[] zone = new DateTimeZone[1];
        __CLR4_4_11c871c87lc8azxqv.R.inc(62517);Thread t = new Thread(new Runnable() {
            public void run() {try{__CLR4_4_11c871c87lc8azxqv.R.inc(62518);
                __CLR4_4_11c871c87lc8azxqv.R.inc(62519);zone[0] = getTestDataTimeZoneBuilder().toDateTimeZone("TestDTZ2", true);
            }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}
        });
        __CLR4_4_11c871c87lc8azxqv.R.inc(62520);t.start();
        __CLR4_4_11c871c87lc8azxqv.R.inc(62521);t.join();
        __CLR4_4_11c871c87lc8azxqv.R.inc(62522);assertNotNull(zone[0]);
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    private DateTimeZoneBuilder getTestDataTimeZoneBuilder() {try{__CLR4_4_11c871c87lc8azxqv.R.inc(62523);
         __CLR4_4_11c871c87lc8azxqv.R.inc(62524);return new DateTimeZoneBuilder()
             .addCutover(1601, 'w', 1, 1, 1, false, 7200000)
             .setStandardOffset(3600000)
             .addRecurringSavings("", 3600000, 1601, Integer.MAX_VALUE, 'w', 3, -1, 1, false, 7200000)
             .addRecurringSavings("", 0, 1601, Integer.MAX_VALUE, 'w', 10, -1, 1, false, 10800000);
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}    

    //-----------------------------------------------------------------------
    public void testCompile() throws Exception {__CLR4_4_11c871c87lc8azxqv.R.globalSliceStart(getClass().getName(),62525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdlilk1c8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c871c87lc8azxqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c871c87lc8azxqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.testCompile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdlilk1c8t() throws Exception{try{__CLR4_4_11c871c87lc8azxqv.R.inc(62525);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62526);Provider provider = compileAndLoad(AMERICA_LOS_ANGELES_FILE);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62527);DateTimeZone tz = provider.getZone("America/Los_Angeles");

        __CLR4_4_11c871c87lc8azxqv.R.inc(62528);assertEquals("America/Los_Angeles", tz.getID());
        __CLR4_4_11c871c87lc8azxqv.R.inc(62529);assertEquals(false, tz.isFixed());
        __CLR4_4_11c871c87lc8azxqv.R.inc(62530);TestBuilder.testForwardTransitions(tz, TestBuilder.AMERICA_LOS_ANGELES_DATA);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62531);TestBuilder.testReverseTransitions(tz, TestBuilder.AMERICA_LOS_ANGELES_DATA);
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    private Provider compileAndLoad(String data) throws Exception {try{__CLR4_4_11c871c87lc8azxqv.R.inc(62532);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62533);File tempDir = createDataFile(data);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62534);File destDir = makeTempDir();

        __CLR4_4_11c871c87lc8azxqv.R.inc(62535);ZoneInfoCompiler.main(new String[] {
            "-src", tempDir.getAbsolutePath(),
            "-dst", destDir.getAbsolutePath(),
            "tzdata"
        });

        // Mark all files to be deleted on exit.
        __CLR4_4_11c871c87lc8azxqv.R.inc(62536);deleteOnExit(destDir);

        __CLR4_4_11c871c87lc8azxqv.R.inc(62537);return new ZoneInfoProvider(destDir);
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    private File createDataFile(String data) throws IOException {try{__CLR4_4_11c871c87lc8azxqv.R.inc(62538);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62539);File tempDir = makeTempDir();

        __CLR4_4_11c871c87lc8azxqv.R.inc(62540);File tempFile = new File(tempDir, "tzdata");
        __CLR4_4_11c871c87lc8azxqv.R.inc(62541);tempFile.deleteOnExit();

        __CLR4_4_11c871c87lc8azxqv.R.inc(62542);InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));

        __CLR4_4_11c871c87lc8azxqv.R.inc(62543);FileOutputStream out = new FileOutputStream(tempFile);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62544);byte[] buf = new byte[1000];
        __CLR4_4_11c871c87lc8azxqv.R.inc(62545);int amt;
        __CLR4_4_11c871c87lc8azxqv.R.inc(62546);while ((amt = in.read(buf)) > 0) {{
            __CLR4_4_11c871c87lc8azxqv.R.inc(62549);out.write(buf, 0, amt);
        }
        }__CLR4_4_11c871c87lc8azxqv.R.inc(62550);out.close();
        __CLR4_4_11c871c87lc8azxqv.R.inc(62551);in.close();

        __CLR4_4_11c871c87lc8azxqv.R.inc(62552);return tempDir;
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    private File makeTempDir() {try{__CLR4_4_11c871c87lc8azxqv.R.inc(62553);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62554);File tempDir = new File(System.getProperty("java.io.tmpdir"));
        __CLR4_4_11c871c87lc8azxqv.R.inc(62555);tempDir = new File(tempDir, "joda-test-" + (new java.util.Random().nextInt() & 0xffffff));
        __CLR4_4_11c871c87lc8azxqv.R.inc(62556);tempDir.mkdirs();
        __CLR4_4_11c871c87lc8azxqv.R.inc(62557);tempDir.deleteOnExit();
        __CLR4_4_11c871c87lc8azxqv.R.inc(62558);return tempDir;
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    private void deleteOnExit(File tempFile) {try{__CLR4_4_11c871c87lc8azxqv.R.inc(62559);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62560);tempFile.deleteOnExit();
        __CLR4_4_11c871c87lc8azxqv.R.inc(62561);if ((((tempFile.isDirectory())&&(__CLR4_4_11c871c87lc8azxqv.R.iget(62562)!=0|true))||(__CLR4_4_11c871c87lc8azxqv.R.iget(62563)==0&false))) {{
            __CLR4_4_11c871c87lc8azxqv.R.inc(62564);File[] files = tempFile.listFiles();
            __CLR4_4_11c871c87lc8azxqv.R.inc(62565);for (int i=0; (((i<files.length)&&(__CLR4_4_11c871c87lc8azxqv.R.iget(62566)!=0|true))||(__CLR4_4_11c871c87lc8azxqv.R.iget(62567)==0&false)); i++) {{
                __CLR4_4_11c871c87lc8azxqv.R.inc(62568);deleteOnExit(files[i]);
            }
        }}
    }}finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_2400_fromDay() {__CLR4_4_11c871c87lc8azxqv.R.globalSliceStart(getClass().getName(),62569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kgsi3t1ca1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c871c87lc8azxqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c871c87lc8azxqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_2400_fromDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kgsi3t1ca1(){try{__CLR4_4_11c871c87lc8azxqv.R.inc(62569);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62570);StringTokenizer st = new StringTokenizer("Apr Sun>=1  24:00");
        __CLR4_4_11c871c87lc8azxqv.R.inc(62571);DateTimeOfYear test = new DateTimeOfYear(st);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62572);assertEquals(4, test.iMonthOfYear);  // Apr
        __CLR4_4_11c871c87lc8azxqv.R.inc(62573);assertEquals(2, test.iDayOfMonth);   // 2nd
        __CLR4_4_11c871c87lc8azxqv.R.inc(62574);assertEquals(1, test.iDayOfWeek);    // Mon
        __CLR4_4_11c871c87lc8azxqv.R.inc(62575);assertEquals(0, test.iMillisOfDay);  // 00:00
        __CLR4_4_11c871c87lc8azxqv.R.inc(62576);assertEquals(true, test.iAdvanceDayOfWeek);
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    public void test_2400_last() {__CLR4_4_11c871c87lc8azxqv.R.globalSliceStart(getClass().getName(),62577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kx01yr1ca9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c871c87lc8azxqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c871c87lc8azxqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_2400_last",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kx01yr1ca9(){try{__CLR4_4_11c871c87lc8azxqv.R.inc(62577);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62578);StringTokenizer st = new StringTokenizer("Mar lastSun 24:00");
        __CLR4_4_11c871c87lc8azxqv.R.inc(62579);DateTimeOfYear test = new DateTimeOfYear(st);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62580);assertEquals(4, test.iMonthOfYear);  // Apr
        __CLR4_4_11c871c87lc8azxqv.R.inc(62581);assertEquals(1, test.iDayOfMonth);   // 1st
        __CLR4_4_11c871c87lc8azxqv.R.inc(62582);assertEquals(1, test.iDayOfWeek);    // Mon
        __CLR4_4_11c871c87lc8azxqv.R.inc(62583);assertEquals(0, test.iMillisOfDay);  // 00:00
        __CLR4_4_11c871c87lc8azxqv.R.inc(62584);assertEquals(false, test.iAdvanceDayOfWeek);
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    public void test_Amman_2003() {__CLR4_4_11c871c87lc8azxqv.R.globalSliceStart(getClass().getName(),62585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19r9mnu1cah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c871c87lc8azxqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c871c87lc8azxqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_Amman_2003",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19r9mnu1cah(){try{__CLR4_4_11c871c87lc8azxqv.R.inc(62585);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62586);DateTimeZone zone = DateTimeZone.forID("Asia/Amman");
        __CLR4_4_11c871c87lc8azxqv.R.inc(62587);DateTime dt = new DateTime(2003, 3, 1, 0, 0, zone);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62588);long next = zone.nextTransition(dt.getMillis());
        __CLR4_4_11c871c87lc8azxqv.R.inc(62589);assertEquals(next, new DateTime(2003, 3, 28, 0, 0, DateTimeZone.forOffsetHours(2)).getMillis());
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    public void test_Amman_2004() {__CLR4_4_11c871c87lc8azxqv.R.globalSliceStart(getClass().getName(),62590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16i9nvd1cam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c871c87lc8azxqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c871c87lc8azxqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_Amman_2004",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16i9nvd1cam(){try{__CLR4_4_11c871c87lc8azxqv.R.inc(62590);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62591);DateTimeZone zone = DateTimeZone.forID("Asia/Amman");
        __CLR4_4_11c871c87lc8azxqv.R.inc(62592);DateTime dt = new DateTime(2004, 3, 1, 0, 0, zone);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62593);long next = zone.nextTransition(dt.getMillis());
        __CLR4_4_11c871c87lc8azxqv.R.inc(62594);assertEquals(next, new DateTime(2004, 3, 26, 0, 0, DateTimeZone.forOffsetHours(2)).getMillis());
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    public void test_Amman_2005() {__CLR4_4_11c871c87lc8azxqv.R.globalSliceStart(getClass().getName(),62595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1399p2w1car();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c871c87lc8azxqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c871c87lc8azxqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_Amman_2005",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1399p2w1car(){try{__CLR4_4_11c871c87lc8azxqv.R.inc(62595);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62596);DateTimeZone zone = DateTimeZone.forID("Asia/Amman");
        __CLR4_4_11c871c87lc8azxqv.R.inc(62597);DateTime dt = new DateTime(2005, 3, 1, 0, 0, zone);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62598);long next = zone.nextTransition(dt.getMillis());
        __CLR4_4_11c871c87lc8azxqv.R.inc(62599);assertEquals(next, new DateTime(2005, 4, 1, 0, 0, DateTimeZone.forOffsetHours(2)).getMillis());
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

    public void test_Amman_2006() {__CLR4_4_11c871c87lc8azxqv.R.globalSliceStart(getClass().getName(),62600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qaf1caw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c871c87lc8azxqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c871c87lc8azxqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_Amman_2006",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qaf1caw(){try{__CLR4_4_11c871c87lc8azxqv.R.inc(62600);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62601);DateTimeZone zone = DateTimeZone.forID("Asia/Amman");
        __CLR4_4_11c871c87lc8azxqv.R.inc(62602);DateTime dt = new DateTime(2006, 3, 1, 0, 0, zone);
        __CLR4_4_11c871c87lc8azxqv.R.inc(62603);long next = zone.nextTransition(dt.getMillis());
        __CLR4_4_11c871c87lc8azxqv.R.inc(62604);assertEquals(next, new DateTime(2006, 3, 31, 0, 0, DateTimeZone.forOffsetHours(2)).getMillis());
    }finally{__CLR4_4_11c871c87lc8azxqv.R.flushNeeded();}}

}
