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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * This class is a Junit unit test for ISOPeriodFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISOPeriodFormat extends TestCase {static class __CLR4_4_11b971b97lc8azxm1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,61346,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final Period PERIOD = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    private static final Period EMPTY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0);
    private static final Period YEAR_DAY_PERIOD = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
    private static final Period EMPTY_YEAR_DAY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime());
    private static final Period TIME_PERIOD = new Period(0, 0, 0, 0, 5, 6, 7, 8);
    private static final Period DATE_PERIOD = new Period(1, 2, 3, 4, 0, 0, 0, 0);

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

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

    public static void main(String[] args) {try{__CLR4_4_11b971b97lc8azxm1.R.inc(61243);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61244);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_11b971b97lc8azxm1.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_11b971b97lc8azxm1.R.inc(61245);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61246);return new TestSuite(TestISOPeriodFormat.class);
    }finally{__CLR4_4_11b971b97lc8azxm1.R.flushNeeded();}}

    public TestISOPeriodFormat(String name) {
        super(name);__CLR4_4_11b971b97lc8azxm1.R.inc(61248);try{__CLR4_4_11b971b97lc8azxm1.R.inc(61247);
    }finally{__CLR4_4_11b971b97lc8azxm1.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_11b971b97lc8azxm1.R.inc(61249);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61250);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61251);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11b971b97lc8azxm1.R.inc(61252);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11b971b97lc8azxm1.R.inc(61253);originalLocale = Locale.getDefault();
        __CLR4_4_11b971b97lc8azxm1.R.inc(61254);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61255);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61256);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11b971b97lc8azxm1.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_11b971b97lc8azxm1.R.inc(61257);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61258);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11b971b97lc8azxm1.R.inc(61259);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61260);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61261);Locale.setDefault(originalLocale);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61262);originalDateTimeZone = null;
        __CLR4_4_11b971b97lc8azxm1.R.inc(61263);originalTimeZone = null;
        __CLR4_4_11b971b97lc8azxm1.R.inc(61264);originalLocale = null;
    }finally{__CLR4_4_11b971b97lc8azxm1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSubclassableConstructor() {__CLR4_4_11b971b97lc8azxm1.R.globalSliceStart(getClass().getName(),61265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pm293x1b9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b971b97lc8azxm1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b971b97lc8azxm1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testSubclassableConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pm293x1b9t(){try{__CLR4_4_11b971b97lc8azxm1.R.inc(61265);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61266);ISOPeriodFormat f = new ISOPeriodFormat() {
            // test constructor is protected
        };
        __CLR4_4_11b971b97lc8azxm1.R.inc(61267);assertNotNull(f);
    }finally{__CLR4_4_11b971b97lc8azxm1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatStandard() {__CLR4_4_11b971b97lc8azxm1.R.globalSliceStart(getClass().getName(),61268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ermzcj1b9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b971b97lc8azxm1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b971b97lc8azxm1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ermzcj1b9w(){try{__CLR4_4_11b971b97lc8azxm1.R.inc(61268);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61269);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61270);assertEquals("P1Y2M3W4DT5H6M7.008S", ISOPeriodFormat.standard().print(p));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61271);p = new Period(1, 2, 3, 4, 5, 6 ,7, 0);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61272);assertEquals("P1Y2M3W4DT5H6M7S", ISOPeriodFormat.standard().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61273);p = new Period(0);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61274);assertEquals("PT0S", ISOPeriodFormat.standard().print(p));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61275);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved());
        __CLR4_4_11b971b97lc8azxm1.R.inc(61276);assertEquals("PT0M", ISOPeriodFormat.standard().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61277);assertEquals("P1Y4DT5H6M7.008S", ISOPeriodFormat.standard().print(YEAR_DAY_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61278);assertEquals("PT0S", ISOPeriodFormat.standard().print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61279);assertEquals("P1Y2M3W4D", ISOPeriodFormat.standard().print(DATE_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61280);assertEquals("PT5H6M7.008S", ISOPeriodFormat.standard().print(TIME_PERIOD));
    }finally{__CLR4_4_11b971b97lc8azxm1.R.flushNeeded();}}

    public void testFormatStandard_negative() {__CLR4_4_11b971b97lc8azxm1.R.globalSliceStart(getClass().getName(),61281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1einy231ba9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b971b97lc8azxm1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b971b97lc8azxm1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatStandard_negative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1einy231ba9(){try{__CLR4_4_11b971b97lc8azxm1.R.inc(61281);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61282);Period p = new Period(-1, -2, -3, -4, -5, -6, -7, -8);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61283);assertEquals("P-1Y-2M-3W-4DT-5H-6M-7.008S", ISOPeriodFormat.standard().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61284);p = Period.years(-54);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61285);assertEquals("P-54Y", ISOPeriodFormat.standard().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61286);p = Period.seconds(4).withMillis(-8);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61287);assertEquals("PT3.992S", ISOPeriodFormat.standard().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61288);p = Period.seconds(-4).withMillis(8);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61289);assertEquals("PT-3.992S", ISOPeriodFormat.standard().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61290);p = Period.seconds(-23);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61291);assertEquals("PT-23S", ISOPeriodFormat.standard().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61292);p = Period.millis(-8);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61293);assertEquals("PT-0.008S", ISOPeriodFormat.standard().print(p));
    }finally{__CLR4_4_11b971b97lc8azxm1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatAlternate() {__CLR4_4_11b971b97lc8azxm1.R.globalSliceStart(getClass().getName(),61294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lr4p41bam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b971b97lc8azxm1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b971b97lc8azxm1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lr4p41bam(){try{__CLR4_4_11b971b97lc8azxm1.R.inc(61294);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61295);Period p = new Period(1, 2, 3, 4, 5, 6 ,7, 8);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61296);assertEquals("P00010204T050607.008", ISOPeriodFormat.alternate().print(p));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61297);p = new Period(1, 2, 3, 4, 5, 6 ,7, 0);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61298);assertEquals("P00010204T050607", ISOPeriodFormat.alternate().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61299);p = new Period(0);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61300);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(p));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61301);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved());
        __CLR4_4_11b971b97lc8azxm1.R.inc(61302);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61303);assertEquals("P00010004T050607.008", ISOPeriodFormat.alternate().print(YEAR_DAY_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61304);assertEquals("P00000000T000000", ISOPeriodFormat.alternate().print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61305);assertEquals("P00010204T000000", ISOPeriodFormat.alternate().print(DATE_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61306);assertEquals("P00000000T050607.008", ISOPeriodFormat.alternate().print(TIME_PERIOD));
    }finally{__CLR4_4_11b971b97lc8azxm1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatAlternateExtended() {__CLR4_4_11b971b97lc8azxm1.R.globalSliceStart(getClass().getName(),61307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrxt8v1baz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b971b97lc8azxm1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b971b97lc8azxm1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateExtended",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrxt8v1baz(){try{__CLR4_4_11b971b97lc8azxm1.R.inc(61307);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61308);Period p = new Period(1, 2, 3, 4, 5, 6 ,7, 8);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61309);assertEquals("P0001-02-04T05:06:07.008", ISOPeriodFormat.alternateExtended().print(p));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61310);p = new Period(1, 2, 3, 4, 5, 6 ,7, 0);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61311);assertEquals("P0001-02-04T05:06:07", ISOPeriodFormat.alternateExtended().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61312);p = new Period(0);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61313);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(p));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61314);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved());
        __CLR4_4_11b971b97lc8azxm1.R.inc(61315);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61316);assertEquals("P0001-00-04T05:06:07.008", ISOPeriodFormat.alternateExtended().print(YEAR_DAY_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61317);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtended().print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61318);assertEquals("P0001-02-04T00:00:00", ISOPeriodFormat.alternateExtended().print(DATE_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61319);assertEquals("P0000-00-00T05:06:07.008", ISOPeriodFormat.alternateExtended().print(TIME_PERIOD));
    }finally{__CLR4_4_11b971b97lc8azxm1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatAlternateWithWeeks() {__CLR4_4_11b971b97lc8azxm1.R.globalSliceStart(getClass().getName(),61320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1an5kc11bbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b971b97lc8azxm1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b971b97lc8azxm1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateWithWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1an5kc11bbc(){try{__CLR4_4_11b971b97lc8azxm1.R.inc(61320);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61321);Period p = new Period(1, 2, 3, 4, 5, 6 ,7, 8);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61322);assertEquals("P0001W0304T050607.008", ISOPeriodFormat.alternateWithWeeks().print(p));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61323);p = new Period(1, 2, 3, 4, 5, 6 ,7, 0);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61324);assertEquals("P0001W0304T050607", ISOPeriodFormat.alternateWithWeeks().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61325);p = new Period(0);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61326);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(p));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61327);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved());
        __CLR4_4_11b971b97lc8azxm1.R.inc(61328);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61329);assertEquals("P0001W0004T050607.008", ISOPeriodFormat.alternateWithWeeks().print(YEAR_DAY_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61330);assertEquals("P0000W0000T000000", ISOPeriodFormat.alternateWithWeeks().print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61331);assertEquals("P0001W0304T000000", ISOPeriodFormat.alternateWithWeeks().print(DATE_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61332);assertEquals("P0000W0000T050607.008", ISOPeriodFormat.alternateWithWeeks().print(TIME_PERIOD));
    }finally{__CLR4_4_11b971b97lc8azxm1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormatAlternateExtendedWithWeeks() {__CLR4_4_11b971b97lc8azxm1.R.globalSliceStart(getClass().getName(),61333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17j6rau1bbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b971b97lc8azxm1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b971b97lc8azxm1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateExtendedWithWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17j6rau1bbp(){try{__CLR4_4_11b971b97lc8azxm1.R.inc(61333);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61334);Period p = new Period(1, 2, 3, 4, 5, 6 ,7, 8);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61335);assertEquals("P0001-W03-04T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(p));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61336);p = new Period(1, 2, 3, 4, 5, 6 ,7, 0);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61337);assertEquals("P0001-W03-04T05:06:07", ISOPeriodFormat.alternateExtendedWithWeeks().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61338);p = new Period(0);
        __CLR4_4_11b971b97lc8azxm1.R.inc(61339);assertEquals("P0000-W00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(p));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61340);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved());
        __CLR4_4_11b971b97lc8azxm1.R.inc(61341);assertEquals("P0000-W00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(p));
        
        __CLR4_4_11b971b97lc8azxm1.R.inc(61342);assertEquals("P0001-W00-04T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(YEAR_DAY_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61343);assertEquals("P0000-W00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(EMPTY_YEAR_DAY_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61344);assertEquals("P0001-W03-04T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(DATE_PERIOD));
        __CLR4_4_11b971b97lc8azxm1.R.inc(61345);assertEquals("P0000-W00-00T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(TIME_PERIOD));
    }finally{__CLR4_4_11b971b97lc8azxm1.R.flushNeeded();}}

}
