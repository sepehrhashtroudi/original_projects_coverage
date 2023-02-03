/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Basics extends TestCase {static class __CLR4_4_1zp3zp3lc8azw8v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,46728,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final int OFFSET = 1;
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46263);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46264);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46265);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46266);return new TestSuite(TestTimeOfDay_Basics.class);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public TestTimeOfDay_Basics(String name) {
        super(name);__CLR4_4_1zp3zp3lc8azw8v.R.inc(46268);try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46267);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46269);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46270);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46271);zone = DateTimeZone.getDefault();
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46272);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46273);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46274);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46275);DateTimeZone.setDefault(zone);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46276);zone = null;
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGet() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3vzph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3vzph(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46277);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46278);TimeOfDay test = new TimeOfDay();
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46279);assertEquals(10 + OFFSET, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46280);assertEquals(20, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46281);assertEquals(30, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46282);assertEquals(40, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46283);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46284);test.get(null);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46285);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46286);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46287);test.get(DateTimeFieldType.dayOfMonth());
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46288);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testSize() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx122zpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx122zpt(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46289);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46290);TimeOfDay test = new TimeOfDay();
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46291);assertEquals(4, test.size());
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testGetFieldType() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvzpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvzpw(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46292);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46293);TimeOfDay test = new TimeOfDay(COPTIC_PARIS);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46294);assertSame(DateTimeFieldType.hourOfDay(), test.getFieldType(0));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46295);assertSame(DateTimeFieldType.minuteOfHour(), test.getFieldType(1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46296);assertSame(DateTimeFieldType.secondOfMinute(), test.getFieldType(2));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46297);assertSame(DateTimeFieldType.millisOfSecond(), test.getFieldType(3));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46298);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46299);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46300);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46301);test.getFieldType(5);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testGetFieldTypes() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvuzq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvuzq6(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46302);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46303);TimeOfDay test = new TimeOfDay(COPTIC_PARIS);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46304);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46305);assertSame(DateTimeFieldType.hourOfDay(), fields[0]);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46306);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46307);assertSame(DateTimeFieldType.secondOfMinute(), fields[2]);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46308);assertSame(DateTimeFieldType.millisOfSecond(), fields[3]);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46309);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testGetField() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lx8n7nzqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lx8n7nzqe(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46310);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46311);TimeOfDay test = new TimeOfDay(COPTIC_PARIS);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46312);assertSame(CopticChronology.getInstanceUTC().hourOfDay(), test.getField(0));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46313);assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), test.getField(1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46314);assertSame(CopticChronology.getInstanceUTC().secondOfMinute(), test.getField(2));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46315);assertSame(CopticChronology.getInstanceUTC().millisOfSecond(), test.getField(3));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46316);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46317);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46318);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46319);test.getField(5);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testGetFields() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeaszqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeaszqo(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46320);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46321);TimeOfDay test = new TimeOfDay(COPTIC_PARIS);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46322);DateTimeField[] fields = test.getFields();
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46323);assertSame(CopticChronology.getInstanceUTC().hourOfDay(), fields[0]);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46324);assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), fields[1]);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46325);assertSame(CopticChronology.getInstanceUTC().secondOfMinute(), fields[2]);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46326);assertSame(CopticChronology.getInstanceUTC().millisOfSecond(), fields[3]);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46327);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testGetValue() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmkzqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmkzqw(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46328);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46329);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46330);assertEquals(10, test.getValue(0));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46331);assertEquals(20, test.getValue(1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46332);assertEquals(30, test.getValue(2));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46333);assertEquals(40, test.getValue(3));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46334);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46335);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46336);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46337);test.getValue(5);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testGetValues() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduelzr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduelzr6(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46338);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46339);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46340);int[] values = test.getValues();
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46341);assertEquals(10, values[0]);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46342);assertEquals(20, values[1]);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46343);assertEquals(30, values[2]);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46344);assertEquals(40, values[3]);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46345);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testIsSupported() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24nzre();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24nzre(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46346);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46347);TimeOfDay test = new TimeOfDay(COPTIC_PARIS);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46348);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46349);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46350);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46351);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46352);assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth()));
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testEqualsHashCode() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77zrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77zrl(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46353);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46354);TimeOfDay test1 = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46355);TimeOfDay test2 = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46356);assertEquals(true, test1.equals(test2));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46357);assertEquals(true, test2.equals(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46358);assertEquals(true, test1.equals(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46359);assertEquals(true, test2.equals(test2));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46360);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46361);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46362);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46363);TimeOfDay test3 = new TimeOfDay(15, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46364);assertEquals(false, test1.equals(test3));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46365);assertEquals(false, test2.equals(test3));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46366);assertEquals(false, test3.equals(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46367);assertEquals(false, test3.equals(test2));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46368);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46369);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46370);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46371);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46372);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46373);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46374);return CopticChronology.getInstanceUTC();
        }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46375);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46376);return new DateTimeField[] {
                CopticChronology.getInstanceUTC().hourOfDay(),
                CopticChronology.getInstanceUTC().minuteOfHour(),
                CopticChronology.getInstanceUTC().secondOfMinute(),
                CopticChronology.getInstanceUTC().millisOfSecond(),
            };
        }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46377);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46378);return new int[] {10, 20, 30, 40};
        }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testCompareTo() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvzsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvzsb(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46379);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46380);TimeOfDay test1 = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46381);TimeOfDay test1a = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46382);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46383);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46384);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46385);assertEquals(0, test1a.compareTo(test1a));
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46386);TimeOfDay test2 = new TimeOfDay(10, 20, 35, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46387);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46388);assertEquals(+1, test2.compareTo(test1));
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46389);TimeOfDay test3 = new TimeOfDay(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46390);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46391);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46392);assertEquals(0, test3.compareTo(test2));
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46393);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.hourOfDay(),
            DateTimeFieldType.minuteOfHour(),
            DateTimeFieldType.secondOfMinute(),
            DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46394);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46395);Partial p = new Partial(types, values);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46396);assertEquals(0, test1.compareTo(p));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46397);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46398);test1.compareTo(null);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46399);fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsEqual_TOD() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iq9sq1zsw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testIsEqual_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iq9sq1zsw(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46400);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46401);TimeOfDay test1 = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46402);TimeOfDay test1a = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46403);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46404);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46405);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46406);assertEquals(true, test1a.isEqual(test1a));
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46407);TimeOfDay test2 = new TimeOfDay(10, 20, 35, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46408);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46409);assertEquals(false, test2.isEqual(test1));
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46410);TimeOfDay test3 = new TimeOfDay(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46411);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46412);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46413);assertEquals(true, test3.isEqual(test2));
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46414);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46415);new TimeOfDay(10, 20, 35, 40).isEqual(null);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46416);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsBefore_TOD() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqti8cztd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testIsBefore_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqti8cztd(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46417);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46418);TimeOfDay test1 = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46419);TimeOfDay test1a = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46420);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46421);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46422);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46423);assertEquals(false, test1a.isBefore(test1a));
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46424);TimeOfDay test2 = new TimeOfDay(10, 20, 35, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46425);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46426);assertEquals(false, test2.isBefore(test1));
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46427);TimeOfDay test3 = new TimeOfDay(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46428);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46429);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46430);assertEquals(false, test3.isBefore(test2));
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46431);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46432);new TimeOfDay(10, 20, 35, 40).isBefore(null);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46433);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsAfter_TOD() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113pdbjztu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testIsAfter_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113pdbjztu(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46434);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46435);TimeOfDay test1 = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46436);TimeOfDay test1a = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46437);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46438);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46439);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46440);assertEquals(false, test1a.isAfter(test1a));
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46441);TimeOfDay test2 = new TimeOfDay(10, 20, 35, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46442);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46443);assertEquals(true, test2.isAfter(test1));
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46444);TimeOfDay test3 = new TimeOfDay(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46445);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46446);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46447);assertEquals(false, test3.isAfter(test2));
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46448);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46449);new TimeOfDay(10, 20, 35, 40).isAfter(null);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46450);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testWithChronologyRetainFields_Chrono() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143gerpzub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143gerpzub(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46451);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46452);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46453);TimeOfDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46454);check(base, 10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46455);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46456);check(test, 10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46457);assertEquals(BUDDHIST_UTC, test.getChronology());
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testWithChronologyRetainFields_sameChrono() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15b1wdbzui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_sameChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15b1wdbzui(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46458);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46459);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46460);TimeOfDay test = base.withChronologyRetainFields(COPTIC_TOKYO);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46461);assertSame(base, test);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testWithChronologyRetainFields_nullChrono() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0ft9azum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithChronologyRetainFields_nullChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0ft9azum(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46462);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46463);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46464);TimeOfDay test = base.withChronologyRetainFields(null);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46465);check(base, 10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46466);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46467);check(test, 10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46468);assertEquals(ISO_UTC, test.getChronology());
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithField1() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lke16yzut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lke16yzut(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46469);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46470);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46471);TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 15);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46472);assertEquals(new TimeOfDay(10, 20, 30, 40), test);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46473);assertEquals(new TimeOfDay(15, 20, 30, 40), result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testWithField2() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibe2ehzuy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibe2ehzuy(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46474);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46475);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46476);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46477);test.withField(null, 6);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46478);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testWithField3() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2e3m0zv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2e3m0zv3(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46479);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46480);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46481);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46482);test.withField(DateTimeFieldType.dayOfMonth(), 6);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46483);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testWithField4() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bte4tjzv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithField4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bte4tjzv8(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46484);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46485);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46486);TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 10);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46487);assertSame(test, result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFieldAdded1() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rgt22zvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rgt22zvc(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46488);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46489);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46490);TimeOfDay result = test.withFieldAdded(DurationFieldType.hours(), 6);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46491);assertEquals(new TimeOfDay(10, 20, 30, 40), test);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46492);assertEquals(new TimeOfDay(16, 20, 30, 40), result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testWithFieldAdded2() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150grujzvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150grujzvh(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46493);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46494);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46495);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46496);test.withFieldAdded(null, 0);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46497);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testWithFieldAdded3() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189gqn0zvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189gqn0zvm(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46498);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46499);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46500);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46501);test.withFieldAdded(null, 6);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46502);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testWithFieldAdded4() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bigpfhzvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bigpfhzvr(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46503);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46504);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46505);TimeOfDay result = test.withFieldAdded(DurationFieldType.hours(), 0);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46506);assertSame(test, result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testWithFieldAdded5() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ergo7yzvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ergo7yzvv(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46507);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46508);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46509);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46510);test.withFieldAdded(DurationFieldType.days(), 6);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46511);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testWithFieldAdded6() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0gn0fzw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0gn0fzw0(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46512);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46513);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46514);TimeOfDay result = test.withFieldAdded(DurationFieldType.hours(), 16);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46515);assertEquals(new TimeOfDay(10, 20, 30, 40), test);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46516);assertEquals(new TimeOfDay(2, 20, 30, 40), result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testWithFieldAdded7() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9glswzw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9glswzw5(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46517);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46518);TimeOfDay test = new TimeOfDay(23, 59, 59, 999);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46519);TimeOfDay result = test.withFieldAdded(DurationFieldType.millis(), 1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46520);assertEquals(new TimeOfDay(0, 0, 0, 0), result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46521);test = new TimeOfDay(23, 59, 59, 999);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46522);result = test.withFieldAdded(DurationFieldType.seconds(), 1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46523);assertEquals(new TimeOfDay(0, 0, 0, 999), result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46524);test = new TimeOfDay(23, 59, 59, 999);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46525);result = test.withFieldAdded(DurationFieldType.minutes(), 1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46526);assertEquals(new TimeOfDay(0, 0, 59, 999), result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46527);test = new TimeOfDay(23, 59, 59, 999);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46528);result = test.withFieldAdded(DurationFieldType.hours(), 1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46529);assertEquals(new TimeOfDay(0, 59, 59, 999), result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testWithFieldAdded8() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oigkldzwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithFieldAdded8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oigkldzwi(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46530);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46531);TimeOfDay test = new TimeOfDay(0, 0, 0, 0);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46532);TimeOfDay result = test.withFieldAdded(DurationFieldType.millis(), -1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46533);assertEquals(new TimeOfDay(23, 59, 59, 999), result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46534);test = new TimeOfDay(0, 0, 0, 0);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46535);result = test.withFieldAdded(DurationFieldType.seconds(), -1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46536);assertEquals(new TimeOfDay(23, 59, 59, 0), result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46537);test = new TimeOfDay(0, 0, 0, 0);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46538);result = test.withFieldAdded(DurationFieldType.minutes(), -1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46539);assertEquals(new TimeOfDay(23, 59, 0, 0), result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46540);test = new TimeOfDay(0, 0, 0, 0);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46541);result = test.withFieldAdded(DurationFieldType.hours(), -1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46542);assertEquals(new TimeOfDay(23, 0, 0, 0), result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_RP() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83igzwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83igzwv(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46543);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46544);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46545);TimeOfDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46546);TimeOfDay expected = new TimeOfDay(15, 26, 37, 48, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46547);assertEquals(expected, result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46548);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46549);assertSame(test, result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testPlusHours_int() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s87b5yzx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s87b5yzx2(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46550);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46551);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46552);TimeOfDay result = test.plusHours(1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46553);TimeOfDay expected = new TimeOfDay(2, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46554);assertEquals(expected, result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46555);result = test.plusHours(0);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46556);assertSame(test, result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testPlusMinutes_int() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0mjquzx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0mjquzx9(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46557);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46558);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46559);TimeOfDay result = test.plusMinutes(1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46560);TimeOfDay expected = new TimeOfDay(1, 3, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46561);assertEquals(expected, result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46562);result = test.plusMinutes(0);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46563);assertSame(test, result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testPlusSeconds_int() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xx4lrezxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xx4lrezxg(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46564);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46565);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46566);TimeOfDay result = test.plusSeconds(1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46567);TimeOfDay expected = new TimeOfDay(1, 2, 4, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46568);assertEquals(expected, result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46569);result = test.plusSeconds(0);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46570);assertSame(test, result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testPlusMillis_int() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1blt447zxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testPlusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1blt447zxn(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46571);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46572);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46573);TimeOfDay result = test.plusMillis(1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46574);TimeOfDay expected = new TimeOfDay(1, 2, 3, 5, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46575);assertEquals(expected, result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46576);result = test.plusMillis(0);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46577);assertSame(test, result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMinus_RP() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmzxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmzxu(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46578);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46579);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46580);TimeOfDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46581);TimeOfDay expected = new TimeOfDay(9, 19, 29, 39, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46582);assertEquals(expected, result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46583);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46584);assertSame(test, result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testMinusHours_int() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svmid4zy1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svmid4zy1(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46585);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46586);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46587);TimeOfDay result = test.minusHours(1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46588);TimeOfDay expected = new TimeOfDay(0, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46589);assertEquals(expected, result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46590);result = test.minusHours(0);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46591);assertSame(test, result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testMinusMinutes_int() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zd8a0zy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zd8a0zy8(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46592);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46593);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46594);TimeOfDay result = test.minusMinutes(1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46595);TimeOfDay expected = new TimeOfDay(1, 1, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46596);assertEquals(expected, result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46597);result = test.minusMinutes(0);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46598);assertSame(test, result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testMinusSeconds_int() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2q4qwzyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2q4qwzyf(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46599);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46600);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46601);TimeOfDay result = test.minusSeconds(1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46602);TimeOfDay expected = new TimeOfDay(1, 2, 2, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46603);assertEquals(expected, result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46604);result = test.minusSeconds(0);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46605);assertSame(test, result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testMinusMillis_int() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrwbadzym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testMinusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrwbadzym(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46606);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46607);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46608);TimeOfDay result = test.minusMillis(1);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46609);TimeOfDay expected = new TimeOfDay(1, 2, 3, 3, BuddhistChronology.getInstance());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46610);assertEquals(expected, result);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46611);result = test.minusMillis(0);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46612);assertSame(test, result);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToLocalTime() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mn1c42zyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mn1c42zyt(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46613);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46614);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_UTC);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46615);LocalTime test = base.toLocalTime();
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46616);assertEquals(new LocalTime(10, 20, 30, 40, COPTIC_UTC), test);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTimeToday() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggeazkzyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggeazkzyx(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46617);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46618);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46619);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46620);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46621);DateTime test = base.toDateTimeToday();
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46622);check(base, 10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46623);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46624);expected = expected.hourOfDay().setCopy(10);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46625);expected = expected.minuteOfHour().setCopy(20);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46626);expected = expected.secondOfMinute().setCopy(30);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46627);expected = expected.millisOfSecond().setCopy(40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46628);assertEquals(expected, test);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTimeToday_Zone() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1junxpjzz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1junxpjzz9(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46629);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46630);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46631);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46632);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46633);DateTime test = base.toDateTimeToday(TOKYO);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46634);check(base, 10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46635);DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46636);expected = expected.hourOfDay().setCopy(10);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46637);expected = expected.minuteOfHour().setCopy(20);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46638);expected = expected.secondOfMinute().setCopy(30);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46639);expected = expected.millisOfSecond().setCopy(40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46640);assertEquals(expected, test);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testToDateTimeToday_nullZone() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pjvd1czzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTimeToday_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pjvd1czzl(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46641);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46642);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46643);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46644);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46645);DateTime test = base.toDateTimeToday((DateTimeZone) null);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46646);check(base, 10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46647);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46648);expected = expected.hourOfDay().setCopy(10);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46649);expected = expected.minuteOfHour().setCopy(20);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46650);expected = expected.secondOfMinute().setCopy(30);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46651);expected = expected.millisOfSecond().setCopy(40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46652);assertEquals(expected, test);
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    // Removed as too complex
//    /**
//     * Merges two partial together, taking account of the different chronologies.
//     *
//     * @param main  the main partial
//     * @param base  the partial to use as a base to merge on top of
//     * @param instant  the instant to start from and to use for missing fields
//     * @return the merged instant
//     */
//    public long merge(ReadablePartial main, ReadablePartial base, long instant) {
//        DateTimeZone zone = main.getChronology().getZone();
//        instant = base.getChronology().withZone(zone).set(base, instant);
//        return set(main, instant);
//    }
//
//    //-----------------------------------------------------------------------
//    /**
//     * Converts this object to a DateTime using a YearMonthDay to fill in the
//     * missing fields and using the default time zone.
//     * This instance is immutable and unaffected by this method call.
//     * <p>
//     * The resulting chronology is determined by the chronology of this
//     * TimeOfDay plus the time zone.
//     * <p>
//     * This method makes use of the chronology of the specified YearMonthDay
//     * in the calculation. This can be significant when mixing chronologies.
//     * If the YearMonthDay is in the same chronology as this instance the
//     * method will perform exactly as you might expect.
//     * <p>
//     * If the chronologies differ, then both this TimeOfDay and the YearMonthDay
//     * are converted to the destination chronology and then merged. As a result
//     * it may be the case that the year, monthOfYear and dayOfMonth fields on
//     * the result are different from the values returned by the methods on the
//     * YearMonthDay.
//     * <p>
//     * See {@link DateTime#withFields(ReadablePartial)} for an algorithm that
//     * ignores the chronology.
//     *
//     * @param date  the date to use, null means today
//     * @return the DateTime instance
//     */
//    public DateTime toDateTime(YearMonthDay date) {
//        return toDateTime(date, null);
//    }
//
//    /**
//     * Converts this object to a DateTime using a YearMonthDay to fill in the
//     * missing fields.
//     * This instance is immutable and unaffected by this method call.
//     * <p>
//     * The resulting chronology is determined by the chronology of this
//     * TimeOfDay plus the time zone.
//     * <p>
//     * This method makes use of the chronology of the specified YearMonthDay
//     * in the calculation. This can be significant when mixing chronologies.
//     * If the YearMonthDay is in the same chronology as this instance the
//     * method will perform exactly as you might expect.
//     * <p>
//     * If the chronologies differ, then both this TimeOfDay and the YearMonthDay
//     * are converted to the destination chronology and then merged. As a result
//     * it may be the case that the year, monthOfYear and dayOfMonth fields on
//     * the result are different from the values returned by the methods on the
//     * YearMonthDay.
//     * <p>
//     * See {@link DateTime#withFields(ReadablePartial)} for an algorithm that
//     * ignores the chronology and just assigns the fields.
//     *
//     * @param date  the date to use, null means today
//     * @param zone  the zone to get the DateTime in, null means default
//     * @return the DateTime instance
//     */
//    public DateTime toDateTime(YearMonthDay date, DateTimeZone zone) {
//        Chronology chrono = getChronology().withZone(zone);
//        if (date == null) {
//            DateTime dt = new DateTime(chrono);
//            return dt.withFields(this);
//        } else {
//            long millis = chrono.merge(this, date, DateTimeUtils.currentTimeMillis());
//            return new DateTime(millis, chrono);
//        }
//    }
//
//    //-----------------------------------------------------------------------
//    public void testToDateTime_YMD() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_TOKYO);
//        
//        DateTime test = base.toDateTime(ymd);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(LONDON), COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    public void testToDateTime_nullYMD() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        
//        DateTime test = base.toDateTime((YearMonthDay) null);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    //-----------------------------------------------------------------------
//    public void testToDateTime_YMD_Zone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_LONDON);
//        
//        DateTime test = base.toDateTime(ymd, TOKYO);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(TOKYO), COPTIC_TOKYO);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    public void testToDateTime_YMD_nullZone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_LONDON);
//        
//        DateTime test = base.toDateTime(ymd, null);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(LONDON), COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    public void testToDateTime_nullYMD_Zone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        
//        DateTime test = base.toDateTime((YearMonthDay) null, TOKYO);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(COPTIC_TOKYO);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }

    //-----------------------------------------------------------------------
    public void testToDateTime_RI() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmdzzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmdzzx(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46653);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46654);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46655);DateTime dt = new DateTime(0L); // LONDON zone
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46656);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46657);DateTime test = base.toDateTime(dt);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46658);check(base, 10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46659);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46660);assertEquals("1970-01-01T10:20:30.040+01:00", test.toString());
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    public void testToDateTime_nullRI() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns41005();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns41005(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46661);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46662);TimeOfDay base = new TimeOfDay(1, 2, 3, 4);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46663);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46664);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46665);check(base, 1, 2, 3, 4);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46666);assertEquals("1970-01-02T01:02:03.004+01:00", test.toString());
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithers() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzp100b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzp100b(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46667);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46668);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46669);check(test.withHourOfDay(6), 6, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46670);check(test.withMinuteOfHour(6), 10, 6, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46671);check(test.withSecondOfMinute(6), 10, 20, 6, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46672);check(test.withMillisOfSecond(6), 10, 20, 30, 6);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46673);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46674);test.withHourOfDay(-1);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46675);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46676);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46677);test.withHourOfDay(24);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46678);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testProperty() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoi100n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoi100n(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46679);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46680);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46681);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46682);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46683);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46684);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46685);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46686);test.property(DateTimeFieldType.millisOfDay());
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46687);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46688);try {
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46689);test.property(null);
            __CLR4_4_1zp3zp3lc8azw8v.R.inc(46690);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9100z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9100z() throws Exception{try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46691);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46692);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS);
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46693);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46694);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46695);oos.writeObject(test);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46696);byte[] bytes = baos.toByteArray();
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46697);oos.close();
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46698);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46699);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46700);TimeOfDay result = (TimeOfDay) ois.readObject();
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46701);ois.close();
        
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46702);assertEquals(test, result);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46703);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46704);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46705);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid101e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid101e(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46706);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46707);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46708);assertEquals("T10:20:30.040", test.toString());
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2x101h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2x101h(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46709);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46710);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46711);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH"));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46712);assertEquals("T10:20:30.040", test.toString((String) null));
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String_Locale() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64u101l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64u101l(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46713);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46714);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46715);assertEquals("10 20", test.toString("H m", Locale.ENGLISH));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46716);assertEquals("T10:20:30.040", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46717);assertEquals("10 20", test.toString("H m", null));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46718);assertEquals("T10:20:30.040", test.toString(null, null));
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_DTFormatter() {__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceStart(getClass().getName(),46719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkps101r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zp3zp3lc8azw8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zp3zp3lc8azw8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkps101r(){try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46719);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46720);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46721);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46722);assertEquals("T10:20:30.040", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1zp3zp3lc8azw8v.R.inc(46723);
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46724);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46725);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46726);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1zp3zp3lc8azw8v.R.inc(46727);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1zp3zp3lc8azw8v.R.flushNeeded();}}
}
