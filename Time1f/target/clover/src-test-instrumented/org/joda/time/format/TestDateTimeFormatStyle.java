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
package org.joda.time.format;

import java.text.DateFormat;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for DateTimeFormat styles.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFormatStyle extends TestCase {static class __CLR4_4_119601960lc8azxcq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,58704,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Locale UK = Locale.UK;
    private static final Locale US = Locale.US;
    private static final Locale FRANCE = Locale.FRANCE;
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

    public static void main(String[] args) {try{__CLR4_4_119601960lc8azxcq.R.inc(58536);
        __CLR4_4_119601960lc8azxcq.R.inc(58537);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_119601960lc8azxcq.R.inc(58538);
        __CLR4_4_119601960lc8azxcq.R.inc(58539);return new TestSuite(TestDateTimeFormatStyle.class);
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    public TestDateTimeFormatStyle(String name) {
        super(name);__CLR4_4_119601960lc8azxcq.R.inc(58541);try{__CLR4_4_119601960lc8azxcq.R.inc(58540);
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_119601960lc8azxcq.R.inc(58542);
        __CLR4_4_119601960lc8azxcq.R.inc(58543);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_119601960lc8azxcq.R.inc(58544);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_119601960lc8azxcq.R.inc(58545);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_119601960lc8azxcq.R.inc(58546);originalLocale = Locale.getDefault();
        __CLR4_4_119601960lc8azxcq.R.inc(58547);DateTimeZone.setDefault(LONDON);
        __CLR4_4_119601960lc8azxcq.R.inc(58548);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_119601960lc8azxcq.R.inc(58549);Locale.setDefault(UK);
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_119601960lc8azxcq.R.inc(58550);
        __CLR4_4_119601960lc8azxcq.R.inc(58551);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_119601960lc8azxcq.R.inc(58552);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_119601960lc8azxcq.R.inc(58553);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_119601960lc8azxcq.R.inc(58554);Locale.setDefault(originalLocale);
        __CLR4_4_119601960lc8azxcq.R.inc(58555);originalDateTimeZone = null;
        __CLR4_4_119601960lc8azxcq.R.inc(58556);originalTimeZone = null;
        __CLR4_4_119601960lc8azxcq.R.inc(58557);originalLocale = null;
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForStyle_stringLengths() {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xgww72196m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_stringLengths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xgww72196m(){try{__CLR4_4_119601960lc8azxcq.R.inc(58558);
        __CLR4_4_119601960lc8azxcq.R.inc(58559);try {
            __CLR4_4_119601960lc8azxcq.R.inc(58560);DateTimeFormat.forStyle(null);
            __CLR4_4_119601960lc8azxcq.R.inc(58561);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_119601960lc8azxcq.R.inc(58562);try {
            __CLR4_4_119601960lc8azxcq.R.inc(58563);DateTimeFormat.forStyle("");
            __CLR4_4_119601960lc8azxcq.R.inc(58564);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_119601960lc8azxcq.R.inc(58565);try {
            __CLR4_4_119601960lc8azxcq.R.inc(58566);DateTimeFormat.forStyle("S");
            __CLR4_4_119601960lc8azxcq.R.inc(58567);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_119601960lc8azxcq.R.inc(58568);try {
            __CLR4_4_119601960lc8azxcq.R.inc(58569);DateTimeFormat.forStyle("SSS");
            __CLR4_4_119601960lc8azxcq.R.inc(58570);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    public void testForStyle_invalidStrings() {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18doind196z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_invalidStrings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18doind196z(){try{__CLR4_4_119601960lc8azxcq.R.inc(58571);
        __CLR4_4_119601960lc8azxcq.R.inc(58572);try {
            __CLR4_4_119601960lc8azxcq.R.inc(58573);DateTimeFormat.forStyle("AA");
            __CLR4_4_119601960lc8azxcq.R.inc(58574);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_119601960lc8azxcq.R.inc(58575);try {
            __CLR4_4_119601960lc8azxcq.R.inc(58576);DateTimeFormat.forStyle("--");
            __CLR4_4_119601960lc8azxcq.R.inc(58577);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_119601960lc8azxcq.R.inc(58578);try {
            __CLR4_4_119601960lc8azxcq.R.inc(58579);DateTimeFormat.forStyle("ss");
            __CLR4_4_119601960lc8azxcq.R.inc(58580);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForStyle_shortDate() throws Exception {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aihouk1979();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aihouk1979() throws Exception{try{__CLR4_4_119601960lc8azxcq.R.inc(58581);
        __CLR4_4_119601960lc8azxcq.R.inc(58582);DateTimeFormatter f = DateTimeFormat.shortDate();
        __CLR4_4_119601960lc8azxcq.R.inc(58583);DateTimeFormatter g = DateTimeFormat.forStyle("S-");
        __CLR4_4_119601960lc8azxcq.R.inc(58584);assertSame(g, f);
        __CLR4_4_119601960lc8azxcq.R.inc(58585);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_119601960lc8azxcq.R.inc(58586);String expect = DateFormat.getDateInstance(DateFormat.SHORT, UK).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58587);assertEquals(expect, f.print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58588);expect = DateFormat.getDateInstance(DateFormat.SHORT, US).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58589);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58590);expect = DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58591);assertEquals(expect, f.withLocale(FRANCE).print(dt));
        
        __CLR4_4_119601960lc8azxcq.R.inc(58592);DateTime date = new DateTime(
                DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).parse(expect));
        __CLR4_4_119601960lc8azxcq.R.inc(58593);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect));
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    public void testForStyle_shortTime() throws Exception {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_153u9fv197m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_153u9fv197m() throws Exception{try{__CLR4_4_119601960lc8azxcq.R.inc(58594);
        __CLR4_4_119601960lc8azxcq.R.inc(58595);DateTimeFormatter f = DateTimeFormat.shortTime();
        __CLR4_4_119601960lc8azxcq.R.inc(58596);DateTimeFormatter g = DateTimeFormat.forStyle("-S");
        __CLR4_4_119601960lc8azxcq.R.inc(58597);assertSame(g, f);
        __CLR4_4_119601960lc8azxcq.R.inc(58598);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_119601960lc8azxcq.R.inc(58599);String expect = DateFormat.getTimeInstance(DateFormat.SHORT, UK).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58600);assertEquals(expect, f.print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58601);expect = DateFormat.getTimeInstance(DateFormat.SHORT, US).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58602);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58603);expect = DateFormat.getTimeInstance(DateFormat.SHORT, FRANCE).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58604);assertEquals(expect, f.withLocale(FRANCE).print(dt));
        
        __CLR4_4_119601960lc8azxcq.R.inc(58605);if ((((TimeZone.getDefault() instanceof SimpleTimeZone)&&(__CLR4_4_119601960lc8azxcq.R.iget(58606)!=0|true))||(__CLR4_4_119601960lc8azxcq.R.iget(58607)==0&false))) {{
            // skip test, as it needs historical time zone info
        } }else {{
            __CLR4_4_119601960lc8azxcq.R.inc(58608);DateTime date = new DateTime(
                DateFormat.getTimeInstance(DateFormat.SHORT, FRANCE).parse(expect));
            __CLR4_4_119601960lc8azxcq.R.inc(58609);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect));
        }
    }}finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    public void testForStyle_shortDateTime() throws Exception {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qszv3b1982();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qszv3b1982() throws Exception{try{__CLR4_4_119601960lc8azxcq.R.inc(58610);
        __CLR4_4_119601960lc8azxcq.R.inc(58611);DateTimeFormatter f = DateTimeFormat.shortDateTime();
        __CLR4_4_119601960lc8azxcq.R.inc(58612);DateTimeFormatter g = DateTimeFormat.forStyle("SS");
        __CLR4_4_119601960lc8azxcq.R.inc(58613);assertSame(g, f);
        __CLR4_4_119601960lc8azxcq.R.inc(58614);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_119601960lc8azxcq.R.inc(58615);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, UK).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58616);assertEquals(expect, f.print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58617);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, US).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58618);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58619);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, FRANCE).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58620);assertEquals(expect, f.withLocale(FRANCE).print(dt));
        
        __CLR4_4_119601960lc8azxcq.R.inc(58621);DateTime date = new DateTime(
            DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, FRANCE).parse(expect));
        __CLR4_4_119601960lc8azxcq.R.inc(58622);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect));
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForStyle_mediumDate() throws Exception {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rd1kcv198f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rd1kcv198f() throws Exception{try{__CLR4_4_119601960lc8azxcq.R.inc(58623);
        __CLR4_4_119601960lc8azxcq.R.inc(58624);DateTimeFormatter f = DateTimeFormat.mediumDate();
        __CLR4_4_119601960lc8azxcq.R.inc(58625);DateTimeFormatter g = DateTimeFormat.forStyle("M-");
        __CLR4_4_119601960lc8azxcq.R.inc(58626);assertSame(g, f);
        __CLR4_4_119601960lc8azxcq.R.inc(58627);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_119601960lc8azxcq.R.inc(58628);String expect = DateFormat.getDateInstance(DateFormat.MEDIUM, UK).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58629);assertEquals(expect, f.print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58630);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, US).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58631);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58632);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58633);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    public void testForStyle_mediumTime() throws Exception {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lye4y6198q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lye4y6198q() throws Exception{try{__CLR4_4_119601960lc8azxcq.R.inc(58634);
        __CLR4_4_119601960lc8azxcq.R.inc(58635);DateTimeFormatter f = DateTimeFormat.mediumTime();
        __CLR4_4_119601960lc8azxcq.R.inc(58636);DateTimeFormatter g = DateTimeFormat.forStyle("-M");
        __CLR4_4_119601960lc8azxcq.R.inc(58637);assertSame(g, f);
        __CLR4_4_119601960lc8azxcq.R.inc(58638);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_119601960lc8azxcq.R.inc(58639);String expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, UK).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58640);assertEquals(expect, f.print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58641);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, US).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58642);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58643);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58644);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    public void testForStyle_mediumDateTime() throws Exception {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfe25g1991();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfe25g1991() throws Exception{try{__CLR4_4_119601960lc8azxcq.R.inc(58645);
        __CLR4_4_119601960lc8azxcq.R.inc(58646);DateTimeFormatter f = DateTimeFormat.mediumDateTime();
        __CLR4_4_119601960lc8azxcq.R.inc(58647);DateTimeFormatter g = DateTimeFormat.forStyle("MM");
        __CLR4_4_119601960lc8azxcq.R.inc(58648);assertSame(g, f);
        __CLR4_4_119601960lc8azxcq.R.inc(58649);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_119601960lc8azxcq.R.inc(58650);String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, UK).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58651);assertEquals(expect, f.print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58652);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, US).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58653);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58654);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, FRANCE).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58655);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForStyle_longDate() throws Exception {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cukq46199c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_longDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cukq46199c() throws Exception{try{__CLR4_4_119601960lc8azxcq.R.inc(58656);
        __CLR4_4_119601960lc8azxcq.R.inc(58657);DateTimeFormatter f = DateTimeFormat.longDate();
        __CLR4_4_119601960lc8azxcq.R.inc(58658);DateTimeFormatter g = DateTimeFormat.forStyle("L-");
        __CLR4_4_119601960lc8azxcq.R.inc(58659);assertSame(g, f);
        __CLR4_4_119601960lc8azxcq.R.inc(58660);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_119601960lc8azxcq.R.inc(58661);String expect = DateFormat.getDateInstance(DateFormat.LONG, UK).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58662);assertEquals(expect, f.print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58663);expect = DateFormat.getDateInstance(DateFormat.LONG, US).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58664);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58665);expect = DateFormat.getDateInstance(DateFormat.LONG, FRANCE).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58666);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    public void testForStyle_longTime() {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fxaph199n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_longTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fxaph199n(){try{__CLR4_4_119601960lc8azxcq.R.inc(58667);}finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testForStyle_longTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.longTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("-L");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getTimeInstance(DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    public void testForStyle_longDateTime() {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1muj30j199o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_longDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1muj30j199o(){try{__CLR4_4_119601960lc8azxcq.R.inc(58668);}finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testForStyle_longDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.longDateTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("LL");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    public void testForStyle_fullDate() throws Exception {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15cbvjd199p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_fullDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15cbvjd199p() throws Exception{try{__CLR4_4_119601960lc8azxcq.R.inc(58669);
        __CLR4_4_119601960lc8azxcq.R.inc(58670);DateTimeFormatter f = DateTimeFormat.fullDate();
        __CLR4_4_119601960lc8azxcq.R.inc(58671);DateTimeFormatter g = DateTimeFormat.forStyle("F-");
        __CLR4_4_119601960lc8azxcq.R.inc(58672);assertSame(g, f);
        __CLR4_4_119601960lc8azxcq.R.inc(58673);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_119601960lc8azxcq.R.inc(58674);String expect = DateFormat.getDateInstance(DateFormat.FULL, UK).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58675);assertEquals(expect, f.print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58676);expect = DateFormat.getDateInstance(DateFormat.FULL, US).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58677);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58678);expect = DateFormat.getDateInstance(DateFormat.FULL, FRANCE).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58679);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    public void testForStyle_fullTime() {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12bjvc19a0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_fullTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12bjvc19a0(){try{__CLR4_4_119601960lc8azxcq.R.inc(58680);}finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testForStyle_fullTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.fullTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("-F");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getTimeInstance(DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    public void testForStyle_fullDateTime() {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135obbe19a1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_fullDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135obbe19a1(){try{__CLR4_4_119601960lc8azxcq.R.inc(58681);}finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testForStyle_fullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.fullDateTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("FF");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    public void testForStyle_shortMediumDateTime() throws Exception {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1d0ni19a2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortMediumDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1d0ni19a2() throws Exception{try{__CLR4_4_119601960lc8azxcq.R.inc(58682);
        __CLR4_4_119601960lc8azxcq.R.inc(58683);DateTimeFormatter f = DateTimeFormat.forStyle("SM");
        __CLR4_4_119601960lc8azxcq.R.inc(58684);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_119601960lc8azxcq.R.inc(58685);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, UK).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58686);assertEquals(expect, f.print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58687);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, US).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58688);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58689);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, FRANCE).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58690);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    public void testForStyle_shortLongDateTime() {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wje7ij19ab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortLongDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wje7ij19ab(){try{__CLR4_4_119601960lc8azxcq.R.inc(58691);}finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testForStyle_shortLongDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("SL");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    public void testForStyle_shortFullDateTime() {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1chig4o19ac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortFullDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1chig4o19ac(){try{__CLR4_4_119601960lc8azxcq.R.inc(58692);}finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testForStyle_shortFullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("SF");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    public void testForStyle_mediumShortDateTime() throws Exception {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16okc3g19ad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumShortDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16okc3g19ad() throws Exception{try{__CLR4_4_119601960lc8azxcq.R.inc(58693);
        __CLR4_4_119601960lc8azxcq.R.inc(58694);DateTimeFormatter f = DateTimeFormat.forStyle("MS");
        __CLR4_4_119601960lc8azxcq.R.inc(58695);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_119601960lc8azxcq.R.inc(58696);String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, UK).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58697);assertEquals(expect, f.print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58698);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, US).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58699);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_119601960lc8azxcq.R.inc(58700);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, FRANCE).format(dt.toDate());
        __CLR4_4_119601960lc8azxcq.R.inc(58701);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}

    public void testForStyle_mediumLongDateTime() {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11pgoy019am();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumLongDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11pgoy019am(){try{__CLR4_4_119601960lc8azxcq.R.inc(58702);}finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testForStyle_mediumLongDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("ML");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    public void testForStyle_mediumFullDateTime() {__CLR4_4_119601960lc8azxcq.R.globalSliceStart(getClass().getName(),58703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rpo39x19an();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119601960lc8azxcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_119601960lc8azxcq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumFullDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rpo39x19an(){try{__CLR4_4_119601960lc8azxcq.R.inc(58703);}finally{__CLR4_4_119601960lc8azxcq.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testForStyle_mediumFullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("MF");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

}
