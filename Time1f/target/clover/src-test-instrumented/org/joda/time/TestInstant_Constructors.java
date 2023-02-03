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
package org.joda.time;

import java.util.Date;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInstant_Constructors extends TestCase {static class __CLR4_4_1n24n24lc8azutp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,29945,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    // 1970-06-09
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 1970-04-05
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 1971-05-06
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1n24n24lc8azutp.R.inc(29884);
        __CLR4_4_1n24n24lc8azutp.R.inc(29885);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1n24n24lc8azutp.R.inc(29886);
        __CLR4_4_1n24n24lc8azutp.R.inc(29887);return new TestSuite(TestInstant_Constructors.class);
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    public TestInstant_Constructors(String name) {
        super(name);__CLR4_4_1n24n24lc8azutp.R.inc(29889);try{__CLR4_4_1n24n24lc8azutp.R.inc(29888);
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1n24n24lc8azutp.R.inc(29890);
        __CLR4_4_1n24n24lc8azutp.R.inc(29891);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1n24n24lc8azutp.R.inc(29892);zone = DateTimeZone.getDefault();
        __CLR4_4_1n24n24lc8azutp.R.inc(29893);locale = Locale.getDefault();
        __CLR4_4_1n24n24lc8azutp.R.inc(29894);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1n24n24lc8azutp.R.inc(29895);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1n24n24lc8azutp.R.inc(29896);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1n24n24lc8azutp.R.inc(29897);
        __CLR4_4_1n24n24lc8azutp.R.inc(29898);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1n24n24lc8azutp.R.inc(29899);DateTimeZone.setDefault(zone);
        __CLR4_4_1n24n24lc8azutp.R.inc(29900);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1n24n24lc8azutp.R.inc(29901);Locale.setDefault(locale);
        __CLR4_4_1n24n24lc8azutp.R.inc(29902);zone = null;
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test now ()
     */
    public void test_now() throws Throwable {__CLR4_4_1n24n24lc8azutp.R.globalSliceStart(getClass().getName(),29903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qxg0n2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n24n24lc8azutp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n24n24lc8azutp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.test_now",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qxg0n2n() throws Throwable{try{__CLR4_4_1n24n24lc8azutp.R.inc(29903);
        __CLR4_4_1n24n24lc8azutp.R.inc(29904);Instant test = Instant.now();
        __CLR4_4_1n24n24lc8azutp.R.inc(29905);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1n24n24lc8azutp.R.inc(29906);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1n24n24lc8azutp.R.globalSliceStart(getClass().getName(),29907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvin2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n24n24lc8azutp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n24n24lc8azutp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvin2r() throws Throwable{try{__CLR4_4_1n24n24lc8azutp.R.inc(29907);
        __CLR4_4_1n24n24lc8azutp.R.inc(29908);assertEquals(new DateTime(2010, 6, 30, 0, 20, ISOChronology.getInstance(LONDON)).toInstant(), Instant.parse("2010-06-30T01:20+02:00"));
        __CLR4_4_1n24n24lc8azutp.R.inc(29909);assertEquals(new DateTime(2010, 1, 2, 14, 50, ISOChronology.getInstance(LONDON)).toInstant(), Instant.parse("2010-002T14:50"));
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    public void testParse_formatter() throws Throwable {__CLR4_4_1n24n24lc8azutp.R.globalSliceStart(getClass().getName(),29910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxn2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n24n24lc8azutp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n24n24lc8azutp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxn2u() throws Throwable{try{__CLR4_4_1n24n24lc8azutp.R.inc(29910);
        __CLR4_4_1n24n24lc8azutp.R.inc(29911);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1n24n24lc8azutp.R.inc(29912);assertEquals(new DateTime(2010, 6, 30, 13, 0, ISOChronology.getInstance(PARIS)).toInstant(), Instant.parse("2010--30 06 13", f));
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    public void testConstructor() throws Throwable {__CLR4_4_1n24n24lc8azutp.R.globalSliceStart(getClass().getName(),29913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hn2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n24n24lc8azutp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n24n24lc8azutp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hn2x() throws Throwable{try{__CLR4_4_1n24n24lc8azutp.R.inc(29913);
        __CLR4_4_1n24n24lc8azutp.R.inc(29914);Instant test = new Instant();
        __CLR4_4_1n24n24lc8azutp.R.inc(29915);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1n24n24lc8azutp.R.inc(29916);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    public void testConstructor_long1() throws Throwable {__CLR4_4_1n24n24lc8azutp.R.globalSliceStart(getClass().getName(),29917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crn31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n24n24lc8azutp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n24n24lc8azutp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crn31() throws Throwable{try{__CLR4_4_1n24n24lc8azutp.R.inc(29917);
        __CLR4_4_1n24n24lc8azutp.R.inc(29918);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1n24n24lc8azutp.R.inc(29919);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1n24n24lc8azutp.R.inc(29920);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    public void testConstructor_long2() throws Throwable {__CLR4_4_1n24n24lc8azutp.R.globalSliceStart(getClass().getName(),29921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kan35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n24n24lc8azutp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n24n24lc8azutp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kan35() throws Throwable{try{__CLR4_4_1n24n24lc8azutp.R.inc(29921);
        __CLR4_4_1n24n24lc8azutp.R.inc(29922);Instant test = new Instant(TEST_TIME2);
        __CLR4_4_1n24n24lc8azutp.R.inc(29923);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1n24n24lc8azutp.R.inc(29924);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    public void testConstructor_Object() throws Throwable {__CLR4_4_1n24n24lc8azutp.R.globalSliceStart(getClass().getName(),29925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplcebn39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n24n24lc8azutp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n24n24lc8azutp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplcebn39() throws Throwable{try{__CLR4_4_1n24n24lc8azutp.R.inc(29925);
        __CLR4_4_1n24n24lc8azutp.R.inc(29926);Date date = new Date(TEST_TIME1);
        __CLR4_4_1n24n24lc8azutp.R.inc(29927);Instant test = new Instant(date);
        __CLR4_4_1n24n24lc8azutp.R.inc(29928);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1n24n24lc8azutp.R.inc(29929);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    /**
     * Test constructor (Object)
     */
    public void testConstructor_invalidObject() throws Throwable {__CLR4_4_1n24n24lc8azutp.R.globalSliceStart(getClass().getName(),29930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7unayn3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n24n24lc8azutp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n24n24lc8azutp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_invalidObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7unayn3e() throws Throwable{try{__CLR4_4_1n24n24lc8azutp.R.inc(29930);
        __CLR4_4_1n24n24lc8azutp.R.inc(29931);try {
            __CLR4_4_1n24n24lc8azutp.R.inc(29932);new Instant(new Object());
            __CLR4_4_1n24n24lc8azutp.R.inc(29933);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1n24n24lc8azutp.R.globalSliceStart(getClass().getName(),29934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59ukn3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n24n24lc8azutp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n24n24lc8azutp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59ukn3i() throws Throwable{try{__CLR4_4_1n24n24lc8azutp.R.inc(29934);
        __CLR4_4_1n24n24lc8azutp.R.inc(29935);Instant test = new Instant((Object) null);
        __CLR4_4_1n24n24lc8azutp.R.inc(29936);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1n24n24lc8azutp.R.inc(29937);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    public void testConstructor_badconverterObject() throws Throwable {__CLR4_4_1n24n24lc8azutp.R.globalSliceStart(getClass().getName(),29938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opptygn3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n24n24lc8azutp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n24n24lc8azutp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_badconverterObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opptygn3m() throws Throwable{try{__CLR4_4_1n24n24lc8azutp.R.inc(29938);
        __CLR4_4_1n24n24lc8azutp.R.inc(29939);try {
            __CLR4_4_1n24n24lc8azutp.R.inc(29940);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1n24n24lc8azutp.R.inc(29941);Instant test = new Instant(new Integer(0));
            __CLR4_4_1n24n24lc8azutp.R.inc(29942);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
            __CLR4_4_1n24n24lc8azutp.R.inc(29943);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1n24n24lc8azutp.R.inc(29944);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1n24n24lc8azutp.R.flushNeeded();}}

}
