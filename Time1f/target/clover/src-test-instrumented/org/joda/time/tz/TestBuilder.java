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
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

/**
 * Test cases for DateTimeZoneBuilder.
 *
 * @author Brian S O'Neill
 */
public class TestBuilder extends TestCase {static class __CLR4_4_11c4r1c4rlc8azxqg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,62476,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62379);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62380);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62381);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62382);return new TestSuite(TestBuilder.class);
    }finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    static final DateTimeFormatter OFFSET_FORMATTER = new DateTimeFormatterBuilder()
        .appendTimeZoneOffset(null, true, 2, 4)
        .toFormatter();

    // Each row is {transition, nameKey, standardOffset, offset}
    static final String[][] AMERICA_LOS_ANGELES_DATA = {
        {null,                            "LMT", "-07:52:58", "-07:52:58"},
        {"1883-11-18T19:52:58.000Z",      "PST", "-08:00", "-08:00"},
        {"1918-03-31T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1918-10-27T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1919-03-30T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1919-10-26T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1942-02-09T02:00:00.000-08:00", "PWT", "-08:00", "-07:00"},
        {"1945-08-14T23:00:00.000Z",      "PPT", "-08:00", "-07:00"},
        {"1945-09-30T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1948-03-14T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1949-01-01T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1950-04-30T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1950-09-24T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1951-04-29T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1951-09-30T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1952-04-27T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1952-09-28T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1953-04-26T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1953-09-27T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1954-04-25T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1954-09-26T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1955-04-24T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1955-09-25T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1956-04-29T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1956-09-30T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1957-04-28T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1957-09-29T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1958-04-27T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1958-09-28T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1959-04-26T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1959-09-27T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1960-04-24T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1960-09-25T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1961-04-30T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1961-09-24T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1962-04-29T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1962-10-28T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1963-04-28T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1963-10-27T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1964-04-26T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1964-10-25T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1965-04-25T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1965-10-31T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1966-04-24T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1966-10-30T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1967-04-30T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1967-10-29T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1968-04-28T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1968-10-27T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1969-04-27T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1969-10-26T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1970-04-26T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1970-10-25T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1971-04-25T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1971-10-31T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1972-04-30T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1972-10-29T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1973-04-29T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1973-10-28T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1974-01-06T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1974-10-27T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1975-02-23T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1975-10-26T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1976-04-25T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1976-10-31T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1977-04-24T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1977-10-30T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1978-04-30T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1978-10-29T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1979-04-29T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1979-10-28T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1980-04-27T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1980-10-26T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1981-04-26T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1981-10-25T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1982-04-25T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1982-10-31T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1983-04-24T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1983-10-30T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1984-04-29T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1984-10-28T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1985-04-28T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1985-10-27T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1986-04-27T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1986-10-26T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1987-04-05T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1987-10-25T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1988-04-03T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1988-10-30T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1989-04-02T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1989-10-29T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1990-04-01T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1990-10-28T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1991-04-07T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1991-10-27T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1992-04-05T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1992-10-25T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1993-04-04T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1993-10-31T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1994-04-03T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1994-10-30T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1995-04-02T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1995-10-29T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1996-04-07T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1996-10-27T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1997-04-06T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1997-10-26T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1998-04-05T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1998-10-25T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"1999-04-04T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"1999-10-31T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
        {"2000-04-02T02:00:00.000-08:00", "PDT", "-08:00", "-07:00"},
        {"2000-10-29T02:00:00.000-07:00", "PST", "-08:00", "-08:00"},
    };

    static DateTimeZoneBuilder buildAmericaLosAngelesBuilder() {try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62383);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62384);return new DateTimeZoneBuilder()
            .addCutover(-2147483648, 'w', 1, 1, 0, false, 0)
            .setStandardOffset(-28378000)
            .setFixedSavings("LMT", 0)
            .addCutover(1883, 'w', 11, 18, 0, false, 43200000)
            .setStandardOffset(-28800000)
            .addRecurringSavings("PDT", 3600000, 1918, 1919, 'w',  3, -1, 7, false, 7200000)
            .addRecurringSavings("PST",       0, 1918, 1919, 'w', 10, -1, 7, false, 7200000)
            .addRecurringSavings("PWT", 3600000, 1942, 1942, 'w',  2,  9, 0, false, 7200000)
            .addRecurringSavings("PPT", 3600000, 1945, 1945, 'u',  8, 14, 0, false, 82800000)
            .addRecurringSavings("PST",       0, 1945, 1945, 'w',  9, 30, 0, false, 7200000)
            .addRecurringSavings("PDT", 3600000, 1948, 1948, 'w',  3, 14, 0, false, 7200000)
            .addRecurringSavings("PST",       0, 1949, 1949, 'w',  1,  1, 0, false, 7200000)
            .addRecurringSavings("PDT", 3600000, 1950, 1966, 'w',  4, -1, 7, false, 7200000)
            .addRecurringSavings("PST",       0, 1950, 1961, 'w',  9, -1, 7, false, 7200000)
            .addRecurringSavings("PST",       0, 1962, 1966, 'w', 10, -1, 7, false, 7200000)
            .addRecurringSavings("PST",       0, 1967, 2147483647, 'w', 10, -1, 7, false, 7200000)
            .addRecurringSavings("PDT", 3600000, 1967, 1973, 'w', 4, -1,  7, false, 7200000)
            .addRecurringSavings("PDT", 3600000, 1974, 1974, 'w', 1,  6,  0, false, 7200000)
            .addRecurringSavings("PDT", 3600000, 1975, 1975, 'w', 2, 23,  0, false, 7200000)
            .addRecurringSavings("PDT", 3600000, 1976, 1986, 'w', 4, -1,  7, false, 7200000)
            .addRecurringSavings("PDT", 3600000, 1987, 2147483647, 'w', 4, 1, 7, true, 7200000);
    }finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    static DateTimeZone buildAmericaLosAngeles() {try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62385);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62386);return buildAmericaLosAngelesBuilder().toDateTimeZone("America/Los_Angeles", true);
    }finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    private DateTimeZone originalDateTimeZone = null;

    public TestBuilder(String name) {
        super(name);__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62388);try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62387);
    }finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62389);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62390);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62391);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62392);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62393);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    public void testID() {__CLR4_4_11c4r1c4rlc8azxqg.R.globalSliceStart(getClass().getName(),62394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rc0fys1c56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4r1c4rlc8azxqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4r1c4rlc8azxqg.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestBuilder.testID",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rc0fys1c56(){try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62394);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62395);DateTimeZone tz = buildAmericaLosAngeles();
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62396);assertEquals("America/Los_Angeles", tz.getID());
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62397);assertEquals(false, tz.isFixed());
    }finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    public void testForwardTransitions() {__CLR4_4_11c4r1c4rlc8azxqg.R.globalSliceStart(getClass().getName(),62398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1escb821c5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4r1c4rlc8azxqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4r1c4rlc8azxqg.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestBuilder.testForwardTransitions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1escb821c5a(){try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62398);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62399);DateTimeZone tz = buildAmericaLosAngeles();
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62400);testForwardTransitions(tz, AMERICA_LOS_ANGELES_DATA);
    }finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    static void testForwardTransitions(DateTimeZone tz, String[][] data) {try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62401);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62402);long instant = Long.MIN_VALUE;
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62403);for (int i=0; (((i<data.length)&&(__CLR4_4_11c4r1c4rlc8azxqg.R.iget(62404)!=0|true))||(__CLR4_4_11c4r1c4rlc8azxqg.R.iget(62405)==0&false)); i++) {{
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62406);String[] row = data[i];
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62407);long expectedInstant = instant;
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62408);if ((((row[0] != null)&&(__CLR4_4_11c4r1c4rlc8azxqg.R.iget(62409)!=0|true))||(__CLR4_4_11c4r1c4rlc8azxqg.R.iget(62410)==0&false))) {{
                __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62411);instant = tz.nextTransition(instant);
                __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62412);expectedInstant = new DateTime(row[0]).getMillis();
            }

            }__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62413);String expectedKey = row[1];
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62414);int expectedStandardOffset = -(int) OFFSET_FORMATTER.parseMillis(row[2]);
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62415);int expectedOffset = -(int) OFFSET_FORMATTER.parseMillis(row[3]);

            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62416);assertEquals(expectedInstant, instant);
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62417);assertEquals(expectedKey, tz.getNameKey(instant));
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62418);assertEquals(expectedStandardOffset, tz.getStandardOffset(instant));
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62419);assertEquals(expectedOffset, tz.getOffset(instant));

            // Sample a few instants between transitions.
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62420);if ((((i < data.length - 1)&&(__CLR4_4_11c4r1c4rlc8azxqg.R.iget(62421)!=0|true))||(__CLR4_4_11c4r1c4rlc8azxqg.R.iget(62422)==0&false))) {{
                __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62423);long nextInstant = new DateTime(data[i + 1][0]).getMillis();
                __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62424);long span = (nextInstant - instant) / 10;
                __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62425);for (int j=1; (((j<10)&&(__CLR4_4_11c4r1c4rlc8azxqg.R.iget(62426)!=0|true))||(__CLR4_4_11c4r1c4rlc8azxqg.R.iget(62427)==0&false)); j++) {{
                    __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62428);long between = instant + j * span;
                    __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62429);assertEquals(expectedKey, tz.getNameKey(between));
                    __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62430);assertEquals(expectedStandardOffset, tz.getStandardOffset(between));
                    __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62431);assertEquals(expectedOffset, tz.getOffset(between));
                }
            }}
        }}
    }}finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    public void testReverseTransitions() {__CLR4_4_11c4r1c4rlc8azxqg.R.globalSliceStart(getClass().getName(),62432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i20lor1c68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4r1c4rlc8azxqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4r1c4rlc8azxqg.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestBuilder.testReverseTransitions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i20lor1c68(){try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62432);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62433);DateTimeZone tz = buildAmericaLosAngeles();
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62434);testReverseTransitions(tz, AMERICA_LOS_ANGELES_DATA);
    }finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    static void testReverseTransitions(DateTimeZone tz, String[][] data) {try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62435);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62436);long instant = new DateTime(data[data.length - 1][0]).getMillis();
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62437);for (int i=data.length; (((--i>=1)&&(__CLR4_4_11c4r1c4rlc8azxqg.R.iget(62438)!=0|true))||(__CLR4_4_11c4r1c4rlc8azxqg.R.iget(62439)==0&false)); ) {{
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62440);String[] row = data[i];
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62441);String[] prevRow = data[i - 1];
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62442);instant = tz.previousTransition(instant);

            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62443);long expectedInstant = new DateTime(row[0]).getMillis() - 1;
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62444);String expectedKey = prevRow[1];
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62445);int expectedStandardOffset = -(int) OFFSET_FORMATTER.parseMillis(prevRow[2]);
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62446);int expectedOffset = -(int) OFFSET_FORMATTER.parseMillis(prevRow[3]);

            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62447);assertEquals(expectedInstant, instant);
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62448);assertEquals(expectedKey, tz.getNameKey(instant));
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62449);assertEquals(expectedStandardOffset, tz.getStandardOffset(instant));
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62450);assertEquals(expectedOffset, tz.getOffset(instant));
        }
    }}finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    public void testSerialization() throws IOException {__CLR4_4_11c4r1c4rlc8azxqg.R.globalSliceStart(getClass().getName(),62451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on91c6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4r1c4rlc8azxqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4r1c4rlc8azxqg.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestBuilder.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on91c6r() throws IOException{try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62451);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62452);DateTimeZone tz = testSerialization
            (buildAmericaLosAngelesBuilder(), "America/Los_Angeles");

        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62453);assertEquals(false, tz.isFixed());
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62454);testForwardTransitions(tz, AMERICA_LOS_ANGELES_DATA);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62455);testReverseTransitions(tz, AMERICA_LOS_ANGELES_DATA);
    }finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    static DateTimeZone testSerialization(DateTimeZoneBuilder builder, String id)
        throws IOException
    {try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62456);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62457);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62458);builder.writeTo("America/Los_Angeles", out);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62459);ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62460);DateTimeZone tz = DateTimeZoneBuilder.readFrom(in, id);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62461);assertEquals(id, tz.getID());
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62462);return tz;
    }finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}

    public void testFixed() throws IOException {__CLR4_4_11c4r1c4rlc8azxqg.R.globalSliceStart(getClass().getName(),62463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182yt4n1c73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c4r1c4rlc8azxqg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c4r1c4rlc8azxqg.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestBuilder.testFixed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182yt4n1c73() throws IOException{try{__CLR4_4_11c4r1c4rlc8azxqg.R.inc(62463);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62464);DateTimeZoneBuilder builder = new DateTimeZoneBuilder()
            .setStandardOffset(3600000)
            .setFixedSavings("LMT", 0);
        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62465);DateTimeZone tz = builder.toDateTimeZone("Test", true);

        __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62466);for (int i=0; (((i<2)&&(__CLR4_4_11c4r1c4rlc8azxqg.R.iget(62467)!=0|true))||(__CLR4_4_11c4r1c4rlc8azxqg.R.iget(62468)==0&false)); i++) {{
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62469);assertEquals("Test", tz.getID());
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62470);assertEquals(true, tz.isFixed());
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62471);assertEquals(3600000, tz.getOffset(0));
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62472);assertEquals(3600000, tz.getStandardOffset(0));
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62473);assertEquals(0, tz.nextTransition(0));
            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62474);assertEquals(0, tz.previousTransition(0));

            __CLR4_4_11c4r1c4rlc8azxqg.R.inc(62475);tz = testSerialization(builder, "Test");
        }
    }}finally{__CLR4_4_11c4r1c4rlc8azxqg.R.flushNeeded();}}
}
