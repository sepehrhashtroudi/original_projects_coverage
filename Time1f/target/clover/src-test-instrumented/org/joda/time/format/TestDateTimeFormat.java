/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;

/**
 * This class is a Junit unit test for DateTime Formating.
 *
 * @author Stephen Colebourne
 * @author Fredrik Borgh
 */
public class TestDateTimeFormat extends TestCase {static class __CLR4_4_118nx18nxlc8azxbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,58536,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_118nx18nxlc8azxbu.R.inc(57885);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57886);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_118nx18nxlc8azxbu.R.inc(57887);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57888);return new TestSuite(TestDateTimeFormat.class);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public TestDateTimeFormat(String name) {
        super(name);__CLR4_4_118nx18nxlc8azxbu.R.inc(57890);try{__CLR4_4_118nx18nxlc8azxbu.R.inc(57889);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_118nx18nxlc8azxbu.R.inc(57891);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57892);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57893);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57894);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57895);originalLocale = Locale.getDefault();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57896);DateTimeZone.setDefault(LONDON);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57897);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57898);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_118nx18nxlc8azxbu.R.inc(57899);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57900);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57901);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57902);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57903);Locale.setDefault(originalLocale);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57904);originalDateTimeZone = null;
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57905);originalTimeZone = null;
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57906);originalLocale = null;
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSubclassableConstructor() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),57907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pm293x18oj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testSubclassableConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pm293x18oj(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(57907);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57908);DateTimeFormat f = new DateTimeFormat() {
            // test constructor is protected
        };
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57909);assertNotNull(f);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_era() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),57910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcpcmz18om();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_era",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcpcmz18om(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(57910);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57911);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57912);DateTimeFormatter f = DateTimeFormat.forPattern("G").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57913);assertEquals(dt.toString(), "AD", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57914);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57915);assertEquals(dt.toString(), "AD", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57916);dt = dt.withZone(PARIS);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57917);assertEquals(dt.toString(), "AD", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_centuryOfEra() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),57918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8a7uu18ou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_centuryOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8a7uu18ou(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(57918);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57919);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57920);DateTimeFormatter f = DateTimeFormat.forPattern("C").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57921);assertEquals(dt.toString(), "20", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57922);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57923);assertEquals(dt.toString(), "20", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57924);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57925);assertEquals(dt.toString(), "20", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57926);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57927);assertEquals(dt.toString(), "1", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_yearOfEra() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),57928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e97w3518p4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e97w3518p4(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(57928);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57929);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57930);DateTimeFormatter f = DateTimeFormat.forPattern("Y").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57931);assertEquals(dt.toString(), "2004", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57932);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57933);assertEquals(dt.toString(), "2004", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57934);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57935);assertEquals(dt.toString(), "2004", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57936);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57937);assertEquals(dt.toString(), "124", f.print(dt));  // 124th year of BCE
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}        

    public void testFormat_yearOfEra_twoDigit() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),57938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i612d918pe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEra_twoDigit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i612d918pe(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(57938);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57939);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57940);DateTimeFormatter f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57941);assertEquals(dt.toString(), "04", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57942);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57943);assertEquals(dt.toString(), "23", f.print(dt));
        
        // current time set to 2002-06-09
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57944);f = f.withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57945);DateTime expect = null;
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57946);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57947);assertEquals(expect, f.parseDateTime("04"));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57948);expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57949);assertEquals(expect, f.parseDateTime("22"));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57950);expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57951);assertEquals(expect, f.parseDateTime("21"));

        // Added tests to ensure single sign digit parse fails properly
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57952);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(57953);f.parseDateTime("-");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(57954);fail();
        } catch (IllegalArgumentException ex) {}

        __CLR4_4_118nx18nxlc8azxbu.R.inc(57955);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(57956);f.parseDateTime("+");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(57957);fail();
        } catch (IllegalArgumentException ex) {}

        // Added tests for pivot year setting
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57958);f = f.withPivotYear(new Integer(2050));
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57959);expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57960);assertEquals(expect, f.parseDateTime("00"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(57961);expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57962);assertEquals(expect, f.parseDateTime("99"));

        // Added tests to ensure two digit parsing is lenient for DateTimeFormat
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57963);f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57964);f = f.withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57965);f.parseDateTime("5");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57966);f.parseDateTime("005");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57967);f.parseDateTime("+50");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57968);f.parseDateTime("-50");
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormat_yearOfEraParse() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),57969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skt8a818q9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEraParse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skt8a818q9(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(57969);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57970);Chronology chrono = GJChronology.getInstanceUTC();

        __CLR4_4_118nx18nxlc8azxbu.R.inc(57971);DateTimeFormatter f = DateTimeFormat
            .forPattern("YYYY-MM GG")
            .withChronology(chrono)
            .withLocale(Locale.UK);

        __CLR4_4_118nx18nxlc8azxbu.R.inc(57972);DateTime dt = new DateTime(2005, 10, 1, 0, 0, 0, 0, chrono);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57973);assertEquals(dt, f.parseDateTime("2005-10 AD"));
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57974);assertEquals(dt, f.parseDateTime("2005-10 CE"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(57975);dt = new DateTime(-2005, 10, 1, 0, 0, 0, 0, chrono);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57976);assertEquals(dt, f.parseDateTime("2005-10 BC"));
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57977);assertEquals(dt, f.parseDateTime("2005-10 BCE"));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}        

    //-----------------------------------------------------------------------
    public void testFormat_year() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),57978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fu0epm18qi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fu0epm18qi(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(57978);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57979);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57980);DateTimeFormatter f = DateTimeFormat.forPattern("y").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57981);assertEquals(dt.toString(), "2004", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57982);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57983);assertEquals(dt.toString(), "2004", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57984);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57985);assertEquals(dt.toString(), "2004", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57986);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57987);assertEquals(dt.toString(), "-123", f.print(dt));

        // Added tests to ensure single sign digit parse fails properly
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57988);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(57989);f.parseDateTime("-");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(57990);fail();
        } catch (IllegalArgumentException ex) {}

        __CLR4_4_118nx18nxlc8azxbu.R.inc(57991);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(57992);f.parseDateTime("+");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(57993);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormat_year_twoDigit() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),57994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dsg0k18qy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year_twoDigit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dsg0k18qy(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(57994);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57995);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57996);DateTimeFormatter f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57997);assertEquals(dt.toString(), "04", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57998);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(57999);assertEquals(dt.toString(), "23", f.print(dt));
        
        // current time set to 2002-06-09
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58000);f = f.withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58001);DateTime expect = null;
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58002);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58003);assertEquals(expect, f.parseDateTime("04"));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58004);expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58005);assertEquals(expect, f.parseDateTime("22"));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58006);expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58007);assertEquals(expect, f.parseDateTime("21"));

        // Added tests to ensure single sign digit parse fails properly
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58008);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58009);f.parseDateTime("-");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58010);fail();
        } catch (IllegalArgumentException ex) {}

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58011);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58012);f.parseDateTime("+");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58013);fail();
        } catch (IllegalArgumentException ex) {}

        // Added tests for pivot year setting
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58014);f = f.withPivotYear(new Integer(2050));
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58015);expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58016);assertEquals(expect, f.parseDateTime("00"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58017);expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58018);assertEquals(expect, f.parseDateTime("99"));

        // Added tests to ensure two digit parsing is strict by default for
        // DateTimeFormatterBuilder
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58019);f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000).toFormatter();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58020);f = f.withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58021);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58022);f.parseDateTime("5");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58023);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58024);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58025);f.parseDateTime("005");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58026);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58027);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58028);f.parseDateTime("+50");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58029);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58030);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58031);f.parseDateTime("-50");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58032);fail();
        } catch (IllegalArgumentException ex) {}

        // Added tests to ensure two digit parsing is lenient for DateTimeFormat
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58033);f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58034);f = f.withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58035);f.parseDateTime("5");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58036);f.parseDateTime("005");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58037);f.parseDateTime("+50");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58038);f.parseDateTime("-50");

        // Added tests for lenient two digit parsing
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58039);f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000, true).toFormatter();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58040);f = f.withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58041);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58042);assertEquals(expect, f.parseDateTime("04"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58043);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58044);assertEquals(expect, f.parseDateTime("+04"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58045);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58046);assertEquals(expect, f.parseDateTime("-04"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58047);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58048);assertEquals(expect, f.parseDateTime("4"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58049);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58050);assertEquals(expect, f.parseDateTime("-4"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58051);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58052);assertEquals(expect, f.parseDateTime("004"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58053);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58054);assertEquals(expect, f.parseDateTime("+004"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58055);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58056);assertEquals(expect, f.parseDateTime("-004"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58057);expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58058);assertEquals(expect, f.parseDateTime("3004"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58059);expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58060);assertEquals(expect, f.parseDateTime("+3004"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58061);expect = new DateTime(-3004, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58062);assertEquals(expect, f.parseDateTime("-3004"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58063);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58064);f.parseDateTime("-");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58065);fail();
        } catch (IllegalArgumentException ex) {}

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58066);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58067);f.parseDateTime("+");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58068);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormat_year_long() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bvz1u918t1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bvz1u918t1(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58069);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58070);DateTime dt = new DateTime(278004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58071);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58072);assertEquals(dt.toString(), "278004", f.print(dt));
        
        // for coverage
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58073);f = DateTimeFormat.forPattern("yyyyMMdd");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58074);assertEquals(dt.toString(), "2780040609", f.print(dt));
        
        // for coverage
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58075);f = DateTimeFormat.forPattern("yyyyddMM");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58076);assertEquals(dt.toString(), "2780040906", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_weekyear() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcb9im18t9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcb9im18t9(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58077);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58078);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58079);DateTimeFormatter f = DateTimeFormat.forPattern("x").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58080);assertEquals(dt.toString(), "2004", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58081);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58082);assertEquals(dt.toString(), "2004", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58083);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58084);assertEquals(dt.toString(), "2004", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58085);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58086);assertEquals(dt.toString(), "-123", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormat_weekyearOfEra_twoDigit() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l21qhb18tj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekyearOfEra_twoDigit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l21qhb18tj(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58087);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58088);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58089);DateTimeFormatter f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58090);assertEquals(dt.toString(), "04", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58091);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58092);assertEquals(dt.toString(), "23", f.print(dt));
        
        // current time set to 2002-06-09
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58093);f = f.withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58094);DateTime expect = null;
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58095);expect = new DateTime(2003, 12, 29, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58096);assertEquals(expect, f.parseDateTime("04"));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58097);expect = new DateTime(1922, 1, 2, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58098);assertEquals(expect, f.parseDateTime("22"));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58099);expect = new DateTime(2021, 1, 4, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58100);assertEquals(expect, f.parseDateTime("21"));

        // Added tests to ensure single sign digit parse fails properly
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58101);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58102);f.parseDateTime("-");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58103);fail();
        } catch (IllegalArgumentException ex) {}

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58104);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58105);f.parseDateTime("+");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58106);fail();
        } catch (IllegalArgumentException ex) {}

        // Added tests for pivot year setting
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58107);f = f.withPivotYear(new Integer(2050));
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58108);expect = new DateTime(2000, 1, 3, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58109);assertEquals(expect, f.parseDateTime("00"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58110);expect = new DateTime(2098, 12, 29, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58111);assertEquals(expect, f.parseDateTime("99"));

        // Added tests to ensure two digit parsing is strict by default for
        // DateTimeFormatterBuilder
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58112);f = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000).toFormatter();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58113);f = f.withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58114);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58115);f.parseDateTime("5");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58116);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58117);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58118);f.parseDateTime("005");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58119);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58120);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58121);f.parseDateTime("+50");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58122);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58123);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58124);f.parseDateTime("-50");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58125);fail();
        } catch (IllegalArgumentException ex) {}

        // Added tests to ensure two digit parsing is lenient for DateTimeFormat
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58126);f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58127);f = f.withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58128);f.parseDateTime("5");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58129);f.parseDateTime("005");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58130);f.parseDateTime("+50");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58131);f.parseDateTime("-50");

        // Added tests for lenient two digit parsing
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58132);f = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000, true).toFormatter();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58133);f = f.withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58134);expect = new DateTime(2003, 12, 29, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58135);assertEquals(expect, f.parseDateTime("04"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58136);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58137);assertEquals(expect, f.parseDateTime("+04"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58138);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58139);assertEquals(expect, f.parseDateTime("-04"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58140);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58141);assertEquals(expect, f.parseDateTime("4"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58142);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58143);assertEquals(expect, f.parseDateTime("-4"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58144);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58145);assertEquals(expect, f.parseDateTime("004"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58146);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58147);assertEquals(expect, f.parseDateTime("+004"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58148);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58149);assertEquals(expect, f.parseDateTime("-004"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58150);expect = new DateTime(3004, 1, 2, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58151);assertEquals(expect, f.parseDateTime("3004"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58152);expect = new DateTime(3004, 1, 2, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58153);assertEquals(expect, f.parseDateTime("+3004"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58154);expect = new DateTime(-3004, 1, 4, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58155);assertEquals(expect, f.parseDateTime("-3004"));

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58156);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58157);f.parseDateTime("-");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58158);fail();
        } catch (IllegalArgumentException ex) {}

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58159);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58160);f.parseDateTime("+");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58161);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_weekOfWeekyear() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gbtgn18vm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gbtgn18vm(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58162);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58163);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58164);DateTimeFormatter f = DateTimeFormat.forPattern("w").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58165);assertEquals(dt.toString(), "24", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58166);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58167);assertEquals(dt.toString(), "24", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58168);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58169);assertEquals(dt.toString(), "24", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_dayOfWeek() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwsypk18vu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwsypk18vu(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58170);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58171);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58172);DateTimeFormatter f = DateTimeFormat.forPattern("e").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58173);assertEquals(dt.toString(), "3", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58174);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58175);assertEquals(dt.toString(), "3", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58176);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58177);assertEquals(dt.toString(), "3", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_dayOfWeekShortText() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12s7ekh18w2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeekShortText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12s7ekh18w2(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58178);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58179);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58180);DateTimeFormatter f = DateTimeFormat.forPattern("E").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58181);assertEquals(dt.toString(), "Wed", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58182);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58183);assertEquals(dt.toString(), "Wed", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58184);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58185);assertEquals(dt.toString(), "Wed", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58186);f = f.withLocale(Locale.FRENCH);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58187);assertEquals(dt.toString(), "mer.", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_dayOfWeekText() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iu5bs518wc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeekText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iu5bs518wc(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58188);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58189);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58190);DateTimeFormatter f = DateTimeFormat.forPattern("EEEE").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58191);assertEquals(dt.toString(), "Wednesday", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58192);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58193);assertEquals(dt.toString(), "Wednesday", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58194);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58195);assertEquals(dt.toString(), "Wednesday", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58196);f = f.withLocale(Locale.FRENCH);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58197);assertEquals(dt.toString(), "mercredi", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_dayOfYearText() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qbmnm18wm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfYearText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qbmnm18wm(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58198);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58199);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58200);DateTimeFormatter f = DateTimeFormat.forPattern("D").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58201);assertEquals(dt.toString(), "161", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58202);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58203);assertEquals(dt.toString(), "161", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58204);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58205);assertEquals(dt.toString(), "161", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_monthOfYear() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143xtc518wu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_monthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143xtc518wu(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58206);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58207);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58208);DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58209);assertEquals(dt.toString(), "6", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58210);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58211);assertEquals(dt.toString(), "6", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58212);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58213);assertEquals(dt.toString(), "6", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_monthOfYearShortText() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1goku8i18x2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_monthOfYearShortText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1goku8i18x2(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58214);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58215);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58216);DateTimeFormatter f = DateTimeFormat.forPattern("MMM").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58217);assertEquals(dt.toString(), "Jun", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58218);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58219);assertEquals(dt.toString(), "Jun", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58220);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58221);assertEquals(dt.toString(), "Jun", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58222);f = f.withLocale(Locale.FRENCH);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58223);assertEquals(dt.toString(), "juin", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_monthOfYearText() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pm61yq18xc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_monthOfYearText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pm61yq18xc(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58224);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58225);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58226);DateTimeFormatter f = DateTimeFormat.forPattern("MMMM").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58227);assertEquals(dt.toString(), "June", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58228);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58229);assertEquals(dt.toString(), "June", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58230);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58231);assertEquals(dt.toString(), "June", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58232);f = f.withLocale(Locale.FRENCH);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58233);assertEquals(dt.toString(), "juin", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_dayOfMonth() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v30tpm18xm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v30tpm18xm(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58234);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58235);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58236);DateTimeFormatter f = DateTimeFormat.forPattern("d").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58237);assertEquals(dt.toString(), "9", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58238);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58239);assertEquals(dt.toString(), "9", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58240);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58241);assertEquals(dt.toString(), "9", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_halfdayOfDay() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l06d9518xu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_halfdayOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l06d9518xu(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58242);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58243);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58244);DateTimeFormatter f = DateTimeFormat.forPattern("a").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58245);assertEquals(dt.toString(), "AM", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58246);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58247);assertEquals(dt.toString(), "AM", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58248);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58249);assertEquals(dt.toString(), "PM", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_hourOfHalfday() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aoip7l18y2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_hourOfHalfday",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aoip7l18y2(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58250);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58251);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58252);DateTimeFormatter f = DateTimeFormat.forPattern("K").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58253);assertEquals(dt.toString(), "10", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58254);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58255);assertEquals(dt.toString(), "6", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58256);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58257);assertEquals(dt.toString(), "7", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58258);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58259);assertEquals(dt.toString(), "0", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_clockhourOfHalfday() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v2d1oj18yc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_clockhourOfHalfday",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v2d1oj18yc(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58260);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58261);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58262);DateTimeFormatter f = DateTimeFormat.forPattern("h").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58263);assertEquals(dt.toString(), "10", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58264);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58265);assertEquals(dt.toString(), "6", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58266);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58267);assertEquals(dt.toString(), "7", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58268);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58269);assertEquals(dt.toString(), "12", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_hourOfDay() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z8vwnm18ym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_hourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z8vwnm18ym(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58270);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58271);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58272);DateTimeFormatter f = DateTimeFormat.forPattern("H").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58273);assertEquals(dt.toString(), "10", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58274);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58275);assertEquals(dt.toString(), "6", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58276);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58277);assertEquals(dt.toString(), "19", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58278);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58279);assertEquals(dt.toString(), "0", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_clockhourOfDay() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kwvm9c18yw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_clockhourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kwvm9c18yw(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58280);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58281);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58282);DateTimeFormatter f = DateTimeFormat.forPattern("k").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58283);assertEquals(dt.toString(), "10", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58284);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58285);assertEquals(dt.toString(), "6", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58286);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58287);assertEquals(dt.toString(), "19", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58288);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58289);assertEquals(dt.toString(), "24", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_minute() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15fbthr18z6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_minute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15fbthr18z6(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58290);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58291);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58292);DateTimeFormatter f = DateTimeFormat.forPattern("m").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58293);assertEquals(dt.toString(), "20", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58294);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58295);assertEquals(dt.toString(), "20", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58296);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58297);assertEquals(dt.toString(), "20", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_second() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1flg9jl18ze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_second",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1flg9jl18ze(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58298);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58299);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58300);DateTimeFormatter f = DateTimeFormat.forPattern("s").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58301);assertEquals(dt.toString(), "30", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58302);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58303);assertEquals(dt.toString(), "30", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58304);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58305);assertEquals(dt.toString(), "30", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_fractionOfSecond() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5pbq18zm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_fractionOfSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5pbq18zm(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58306);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58307);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58308);DateTimeFormatter f = DateTimeFormat.forPattern("SSS").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58309);assertEquals(dt.toString(), "040", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58310);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58311);assertEquals(dt.toString(), "040", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58312);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58313);assertEquals(dt.toString(), "040", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_fractionOfSecondLong() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1uexy18zu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_fractionOfSecondLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1uexy18zu(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58314);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58315);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58316);DateTimeFormatter f = DateTimeFormat.forPattern("SSSSSS").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58317);assertEquals(dt.toString(), "040000", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58318);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58319);assertEquals(dt.toString(), "040000", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58320);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58321);assertEquals(dt.toString(), "040000", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_zoneText() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jkb4ga1902();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jkb4ga1902(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58322);}finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testFormat_zoneText() {
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
//         DateTimeFormatter f = DateTimeFormat.forPattern("z").withLocale(Locale.UK);
//         assertEquals(dt.toString(), "UTC", f.print(dt));
//         
//         dt = dt.withZone(NEWYORK);
//         assertEquals(dt.toString(), "EDT", f.print(dt));
//         
//         dt = dt.withZone(TOKYO);
//         assertEquals(dt.toString(), "JST", f.print(dt));
//     }

    public void testFormat_zoneLongText() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srl0u1903();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneLongText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srl0u1903(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58323);}finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testFormat_zoneLongText() {
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
//         DateTimeFormatter f = DateTimeFormat.forPattern("zzzz").withLocale(Locale.UK);
//         assertEquals(dt.toString(), "Coordinated Universal Time", f.print(dt));
//         
//         dt = dt.withZone(NEWYORK);
//         assertEquals(dt.toString(), "Eastern Daylight Time", f.print(dt));
//         
//         dt = dt.withZone(TOKYO);
//         assertEquals(dt.toString(), "Japan Standard Time", f.print(dt));
//     }

    //-----------------------------------------------------------------------
    public void testFormat_zoneAmount() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1myuupr1904();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmount",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1myuupr1904(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58324);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58325);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58326);DateTimeFormatter f = DateTimeFormat.forPattern("Z").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58327);assertEquals(dt.toString(), "+0000", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58328);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58329);assertEquals(dt.toString(), "-0400", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58330);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58331);assertEquals(dt.toString(), "+0900", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormat_zoneAmountColon() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ff4lrg190c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmountColon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ff4lrg190c(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58332);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58333);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58334);DateTimeFormatter f = DateTimeFormat.forPattern("ZZ").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58335);assertEquals(dt.toString(), "+00:00", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58336);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58337);assertEquals(dt.toString(), "-04:00", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58338);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58339);assertEquals(dt.toString(), "+09:00", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormat_zoneAmountID() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11hsnus190k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmountID",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11hsnus190k(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58340);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58341);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58342);DateTimeFormatter f = DateTimeFormat.forPattern("ZZZ").withLocale(Locale.UK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58343);assertEquals(dt.toString(), "UTC", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58344);dt = dt.withZone(NEWYORK);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58345);assertEquals(dt.toString(), "America/New_York", f.print(dt));
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58346);dt = dt.withZone(TOKYO);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58347);assertEquals(dt.toString(), "Asia/Tokyo", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_other() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmn6v3190s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_other",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmn6v3190s(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58348);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58349);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58350);DateTimeFormatter f = DateTimeFormat.forPattern("'Hello' ''");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58351);assertEquals("Hello '", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormat_invalid() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fjuzug190w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_invalid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fjuzug190w(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58352);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58353);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58354);DateTimeFormat.forPattern(null);
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58355);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58356);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58357);DateTimeFormat.forPattern("");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58358);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58359);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58360);DateTimeFormat.forPattern("A");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58361);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58362);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58363);DateTimeFormat.forPattern("dd/mm/AA");
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58364);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormat_samples() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqqjae1919();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_samples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqqjae1919(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58365);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58366);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58367);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH.mm.ss");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58368);assertEquals("2004-06-09 10.20.30", f.print(dt));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormat_shortBasicParse() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fo0mlq191d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_shortBasicParse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fo0mlq191d(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58369);
        // Tests special two digit parse to make sure it properly switches
        // between lenient and strict parsing.

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58370);DateTime dt = new DateTime(2004, 3, 9, 0, 0, 0, 0);

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58371);DateTimeFormatter f = DateTimeFormat.forPattern("yyMMdd");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58372);assertEquals(dt, f.parseDateTime("040309"));
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58373);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58374);assertEquals(dt, f.parseDateTime("20040309"));
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58375);fail();
        } catch (IllegalArgumentException ex) {}

        __CLR4_4_118nx18nxlc8azxbu.R.inc(58376);f = DateTimeFormat.forPattern("yy/MM/dd");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58377);assertEquals(dt, f.parseDateTime("04/03/09"));
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58378);assertEquals(dt, f.parseDateTime("2004/03/09"));
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_pivotYear() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152yvrc191n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testParse_pivotYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152yvrc191n(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58379);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58380);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd.MM.yy").withPivotYear(2050).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58381);DateTime date = dateFormatter.parseDateTime("25.12.15");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58382);assertEquals(date.getYear(), 2015);
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58383);date = dateFormatter.parseDateTime("25.12.00");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58384);assertEquals(date.getYear(), 2000);
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58385);date = dateFormatter.parseDateTime("25.12.99");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58386);assertEquals(date.getYear(), 2099);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testParse_pivotYear_ignored4DigitYear() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duvqwh191v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testParse_pivotYear_ignored4DigitYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duvqwh191v(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58387);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58388);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd.MM.yyyy").withPivotYear(2050).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58389);DateTime date = dateFormatter.parseDateTime("25.12.15");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58390);assertEquals(date.getYear(), 15);
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58391);date = dateFormatter.parseDateTime("25.12.00");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58392);assertEquals(date.getYear(), 0);
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58393);date = dateFormatter.parseDateTime("25.12.99");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58394);assertEquals(date.getYear(), 99);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatParse_textMonthJanShort_UK() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtpmtj1923();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanShort_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtpmtj1923(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58395);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58396);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
            .withLocale(Locale.UK).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58397);String str = new DateTime(2007, 1, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58398);assertEquals(str, "23 Jan 2007");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58399);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58400);check(date, 2007, 1, 23);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textMonthJanShortLowerCase_UK() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_134fcwi1929();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanShortLowerCase_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_134fcwi1929(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58401);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58402);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
            .withLocale(Locale.UK).withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58403);DateTime date = dateFormatter.parseDateTime("23 jan 2007");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58404);check(date, 2007, 1, 23);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textMonthJanShortUpperCase_UK() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gh9oi5192d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanShortUpperCase_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gh9oi5192d(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58405);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58406);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
            .withLocale(Locale.UK).withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58407);DateTime date = dateFormatter.parseDateTime("23 JAN 2007");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58408);check(date, 2007, 1, 23);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testParse_textMonthJanLong_UK() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r2b3k2192h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testParse_textMonthJanLong_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r2b3k2192h(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58409);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58410);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
            .withLocale(Locale.UK).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58411);DateTime date = dateFormatter.parseDateTime("23 January 2007");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58412);check(date, 2007, 1, 23);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textMonthJanLongLowerCase_UK() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x5ppc0192l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanLongLowerCase_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x5ppc0192l(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58413);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58414);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
            .withLocale(Locale.UK).withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58415);DateTime date = dateFormatter.parseDateTime("23 january 2007");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58416);check(date, 2007, 1, 23);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textMonthJanLongUpperCase_UK() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9pb8h192p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanLongUpperCase_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9pb8h192p(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58417);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58418);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
            .withLocale(Locale.UK).withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58419);DateTime date = dateFormatter.parseDateTime("23 JANUARY 2007");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58420);check(date, 2007, 1, 23);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textMonthJanShort_France() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z1k8ji192t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanShort_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z1k8ji192t(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58421);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58422);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
            .withLocale(Locale.FRANCE).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58423);String str = new DateTime(2007, 1, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58424);assertEquals("23 janv. 2007", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58425);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58426);check(date, 2007, 1, 23);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textMonthJanLong_France() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19c05t8192z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanLong_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19c05t8192z(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58427);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58428);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
            .withLocale(Locale.FRANCE).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58429);DateTime date = dateFormatter.parseDateTime("23 janvier 2007");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58430);check(date, 2007, 1, 23);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textMonthApr_France() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16n76o41933();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthApr_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16n76o41933(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58431);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58432);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy")
            .withLocale(Locale.FRANCE).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58433);String str = new DateTime(2007, 2, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58434);assertEquals("23 f\u00e9vr. 2007", str);  // e acute
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58435);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58436);check(date, 2007, 2, 23);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textMonthAtEnd_France() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dz0xj1939();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthAtEnd_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dz0xj1939(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58437);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58438);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM")
            .withLocale(Locale.FRANCE).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58439);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58440);assertEquals("23 juin", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58441);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58442);check(date, 2000, 6, 23);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textMonthAtEnd_France_withSpecifiedDefault() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hy1ldf193f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthAtEnd_France_withSpecifiedDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hy1ldf193f(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58443);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58444);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM")
            .withLocale(Locale.FRANCE).withZoneUTC().withDefaultYear(1980);
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58445);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58446);assertEquals("23 juin", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58447);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58448);check(date, 1980, 6, 23);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textMonthApr_Korean() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dua117193l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthApr_Korean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dua117193l(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58449);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58450);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("EEEE, d MMMM yyyy HH:mm")
            .withLocale(Locale.KOREAN).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58451);String str = new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58452);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58453);assertEquals(new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC), date);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatParse_textHalfdayAM_UK() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dkhjwp193q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textHalfdayAM_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dkhjwp193q(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58454);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58455);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
            .appendLiteral('$')
            .appendClockhourOfHalfday(2)
            .appendLiteral('-')
            .appendHalfdayOfDayText()
            .appendLiteral('-')
            .appendYear(4, 4)
            .toFormatter()
            .withLocale(Locale.UK).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58456);String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58457);assertEquals("$06-PM-2007", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58458);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58459);check(date, 2007, 1, 1);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textHalfdayAM_France() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffgni193w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textHalfdayAM_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffgni193w(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58460);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58461);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
            .appendLiteral('$')
            .appendClockhourOfHalfday(2)
            .appendLiteral('-')
            .appendHalfdayOfDayText()
            .appendLiteral('-')
            .appendYear(4, 4)
            .toFormatter()
            .withLocale(Locale.FRANCE).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58462);String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58463);assertEquals("$06-PM-2007", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58464);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58465);check(date, 2007, 1, 1);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatParse_textEraAD_UK() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vdrksn1942();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraAD_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vdrksn1942(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58466);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58467);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
            .appendLiteral('$')
            .appendEraText()
            .appendYear(4, 4)
            .toFormatter()
            .withLocale(Locale.UK).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58468);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58469);assertEquals("$AD2007", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58470);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58471);check(date, 2007, 1, 1);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textEraAD_France() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mnb4dw1948();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraAD_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mnb4dw1948(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58472);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58473);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
            .appendLiteral('$')
            .appendEraText()
            .appendYear(4, 4)
            .toFormatter()
            .withLocale(Locale.FRANCE).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58474);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58475);assertEquals("$ap. J.-C.2007", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58476);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58477);check(date, 2007, 1, 1);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textEraBC_France() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g81q0e194e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraBC_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g81q0e194e(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58478);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58479);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
            .appendLiteral('$')
            .appendEraText()
            .appendYear(4, 4)
            .toFormatter()
            .withLocale(Locale.FRANCE).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58480);String str = new DateTime(-1, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58481);assertEquals("$BC-0001", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58482);DateTime date = dateFormatter.parseDateTime(str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58483);check(date, -1, 1, 1);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatParse_textYear_UK() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h09zyb194k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textYear_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h09zyb194k(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58484);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58485);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
            .appendLiteral('$')
            .appendText(DateTimeFieldType.year())
            .toFormatter()
            .withLocale(Locale.UK).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58486);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58487);assertEquals("$2007", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58488);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58489);dateFormatter.parseDateTime(str);
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58490);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textYear_France() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xxneq194r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textYear_France",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xxneq194r(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58491);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58492);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
            .appendLiteral('$')
            .appendText(DateTimeFieldType.year())
            .toFormatter()
            .withLocale(Locale.FRANCE).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58493);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58494);assertEquals("$2007", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58495);try {
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58496);dateFormatter.parseDateTime(str);
            __CLR4_4_118nx18nxlc8azxbu.R.inc(58497);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatParse_textAdjoiningHelloWorld_UK() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nu8b49194y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textAdjoiningHelloWorld_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nu8b49194y(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58498);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58499);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
            .appendLiteral('$')
            .appendDayOfMonth(2)
            .appendMonthOfYearShortText()
            .appendLiteral("HelloWorld")
            .toFormatter()
            .withLocale(Locale.UK).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58500);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58501);assertEquals("$23JunHelloWorld", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58502);dateFormatter.parseDateTime(str);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_textAdjoiningMonthDOW_UK() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4uhml1953();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textAdjoiningMonthDOW_UK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4uhml1953(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58503);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58504);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
            .appendLiteral('$')
            .appendDayOfMonth(2)
            .appendMonthOfYearShortText()
            .appendDayOfWeekShortText()
            .toFormatter()
            .withLocale(Locale.UK).withZoneUTC();
        
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58505);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58506);assertEquals("$23JunSat", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58507);dateFormatter.parseDateTime(str);
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatParse_zoneId_noColon() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oi26a1958();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_noColon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oi26a1958(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58508);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58509);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm Z").withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58510);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58511);assertEquals("01:02 +0000", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58512);DateTime parsed = dateFormatter.parseDateTime(str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58513);assertEquals(1, parsed.getHourOfDay());
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58514);assertEquals(2, parsed.getMinuteOfHour());
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_zoneId_noColon_parseZ() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yuy57y195f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_noColon_parseZ",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yuy57y195f(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58515);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58516);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm Z").withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58517);DateTime parsed = dateFormatter.parseDateTime("01:02 Z");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58518);assertEquals(1, parsed.getHourOfDay());
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58519);assertEquals(2, parsed.getMinuteOfHour());
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_zoneId_colon() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdj0mb195k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_colon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdj0mb195k(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58520);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58521);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm ZZ").withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58522);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58523);assertEquals("01:02 +00:00", str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58524);DateTime parsed = dateFormatter.parseDateTime(str);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58525);assertEquals(1, parsed.getHourOfDay());
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58526);assertEquals(2, parsed.getMinuteOfHour());
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    public void testFormatParse_zoneId_colon_parseZ() {__CLR4_4_118nx18nxlc8azxbu.R.globalSliceStart(getClass().getName(),58527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uydr4h195r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118nx18nxlc8azxbu.R.rethrow($CLV_t2$);}finally{__CLR4_4_118nx18nxlc8azxbu.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_colon_parseZ",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uydr4h195r(){try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58527);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58528);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm ZZ").withZoneUTC();
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58529);DateTime parsed = dateFormatter.parseDateTime("01:02 Z");
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58530);assertEquals(1, parsed.getHourOfDay());
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58531);assertEquals(2, parsed.getMinuteOfHour());
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(DateTime test, int hour, int min, int sec) {try{__CLR4_4_118nx18nxlc8azxbu.R.inc(58532);
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58533);assertEquals(hour, test.getYear());
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58534);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_118nx18nxlc8azxbu.R.inc(58535);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_118nx18nxlc8azxbu.R.flushNeeded();}}

}
