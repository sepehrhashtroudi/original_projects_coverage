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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a JUnit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestDuration_Constructors extends TestCase {static class __CLR4_4_1mbsmbslc8azuqs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,29051,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1mbsmbslc8azuqs.R.inc(28936);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28937);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mbsmbslc8azuqs.R.inc(28938);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28939);return new TestSuite(TestDuration_Constructors.class);
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    public TestDuration_Constructors(String name) {
        super(name);__CLR4_4_1mbsmbslc8azuqs.R.inc(28941);try{__CLR4_4_1mbsmbslc8azuqs.R.inc(28940);
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mbsmbslc8azuqs.R.inc(28942);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28943);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28944);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28945);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28946);originalLocale = Locale.getDefault();
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28947);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28948);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28949);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mbsmbslc8azuqs.R.inc(28950);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28951);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28952);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28953);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28954);Locale.setDefault(originalLocale);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28955);originalDateTimeZone = null;
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28956);originalTimeZone = null;
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28957);originalLocale = null;
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    public void testZERO() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),28958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14z44vzmce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testZERO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14z44vzmce() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(28958);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28959);Duration test = Duration.ZERO;
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28960);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),28961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvimch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvimch() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(28961);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28962);assertEquals(new Duration(3200), Duration.parse("PT3.2S"));
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28963);assertEquals(new Duration(6000), Duration.parse("PT6S"));
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_standardDays_long() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),28964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ypd0jrmck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_standardDays_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ypd0jrmck() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(28964);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28965);Duration test = Duration.standardDays(1);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28966);assertEquals(24L * 60L * 60L * 1000L, test.getMillis());
        
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28967);test = Duration.standardDays(2);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28968);assertEquals(2L * 24L * 60L * 60L * 1000L, test.getMillis());
        
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28969);test = Duration.standardDays(0);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28970);assertSame(Duration.ZERO, test);
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_standardHours_long() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),28971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5kw0nmcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_standardHours_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5kw0nmcr() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(28971);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28972);Duration test = Duration.standardHours(1);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28973);assertEquals(60L * 60L * 1000L, test.getMillis());
        
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28974);test = Duration.standardHours(2);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28975);assertEquals(2L * 60L * 60L * 1000L, test.getMillis());
        
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28976);test = Duration.standardHours(0);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28977);assertSame(Duration.ZERO, test);
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_standardMinutes_long() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),28978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1riuhmhmcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_standardMinutes_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1riuhmhmcy() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(28978);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28979);Duration test = Duration.standardMinutes(1);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28980);assertEquals(60L * 1000L, test.getMillis());
        
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28981);test = Duration.standardMinutes(2);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28982);assertEquals(2L * 60L * 1000L, test.getMillis());
        
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28983);test = Duration.standardMinutes(0);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28984);assertSame(Duration.ZERO, test);
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_standardSeconds_long() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),28985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1atxzmvmd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_standardSeconds_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1atxzmvmd5() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(28985);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28986);Duration test = Duration.standardSeconds(1);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28987);assertEquals(1000L, test.getMillis());
        
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28988);test = Duration.standardSeconds(2);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28989);assertEquals(2L * 1000L, test.getMillis());
        
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28990);test = Duration.standardSeconds(0);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28991);assertSame(Duration.ZERO, test);
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_millis_long() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),28992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sdwv2jmdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_millis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sdwv2jmdc() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(28992);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28993);Duration test = Duration.millis(1);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28994);assertEquals(1L, test.getMillis());
        
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28995);test = Duration.millis(2);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28996);assertEquals(2L, test.getMillis());
        
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28997);test = Duration.millis(0);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(28998);assertSame(Duration.ZERO, test);
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long1() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),28999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crmdj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crmdj() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(28999);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29000);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29001);Duration test = new Duration(length);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29002);assertEquals(length, test.getMillis());
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long1() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),29003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ifbf4mdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ifbf4mdn() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(29003);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29004);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29005);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29006);Duration test = new Duration(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29007);assertEquals(dt2.getMillis() - dt1.getMillis(), test.getMillis());
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RI1() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),29008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n7qodsmds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n7qodsmds() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(29008);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29009);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29010);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29011);Duration test = new Duration(dt1, dt2);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29012);assertEquals(dt2.getMillis() - dt1.getMillis(), test.getMillis());
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    public void testConstructor_RI_RI2() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),29013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyqplbmdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyqplbmdx() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(29013);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29014);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29015);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29016);Duration test = new Duration(dt1, dt2);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29017);assertEquals(dt2.getMillis() - TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    public void testConstructor_RI_RI3() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),29018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpqqsume2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpqqsume2() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(29018);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29019);DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29020);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29021);Duration test = new Duration(dt1, dt2);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29022);assertEquals(TEST_TIME_NOW - dt1.getMillis(), test.getMillis());
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    public void testConstructor_RI_RI4() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),29023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgqs0dme7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_RI_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgqs0dme7() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(29023);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29024);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29025);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29026);Duration test = new Duration(dt1, dt2);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29027);assertEquals(0L, test.getMillis());
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),29028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcymec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcymec() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(29028);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29029);Duration test = new Duration("PT72.345S");
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29030);assertEquals(72345, test.getMillis());
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    public void testConstructor_Object2() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),29031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5fmef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5fmef() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(29031);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29032);Duration test = new Duration((Object) null);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29033);assertEquals(0L, test.getMillis());
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    public void testConstructor_Object3() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),29034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6quxwmei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6quxwmei() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(29034);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29035);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29036);Long base = new Long(length);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29037);Duration test = new Duration(base);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29038);assertEquals(length, test.getMillis());
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    public void testConstructor_Object4() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),29039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfqtqdmen();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfqtqdmen() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(29039);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29040);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29041);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29042);Duration base = new Duration(dt1, dt2);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29043);Duration test = new Duration(base);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29044);assertEquals(dt2.getMillis() - dt1.getMillis(), test.getMillis());
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

    public void testConstructor_Object5() throws Throwable {__CLR4_4_1mbsmbslc8azuqs.R.globalSliceStart(getClass().getName(),29045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1moqsiumet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mbsmbslc8azuqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mbsmbslc8azuqs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Object5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1moqsiumet() throws Throwable{try{__CLR4_4_1mbsmbslc8azuqs.R.inc(29045);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29046);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29047);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29048);Interval base = new Interval(dt1, dt2);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29049);Duration test = new Duration(base);
        __CLR4_4_1mbsmbslc8azuqs.R.inc(29050);assertEquals(dt2.getMillis() - dt1.getMillis(), test.getMillis());
    }finally{__CLR4_4_1mbsmbslc8azuqs.R.flushNeeded();}}

}
