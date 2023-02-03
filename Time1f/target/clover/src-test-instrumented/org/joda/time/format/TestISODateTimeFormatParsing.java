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

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for ISODateTimeFormat parsing.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormatParsing extends TestCase {static class __CLR4_4_11a811a81lc8azxiv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,60520,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_11a811a81lc8azxiv.R.inc(59905);
        __CLR4_4_11a811a81lc8azxiv.R.inc(59906);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_11a811a81lc8azxiv.R.inc(59907);
        __CLR4_4_11a811a81lc8azxiv.R.inc(59908);return new TestSuite(TestISODateTimeFormatParsing.class);
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    public TestISODateTimeFormatParsing(String name) {
        super(name);__CLR4_4_11a811a81lc8azxiv.R.inc(59910);try{__CLR4_4_11a811a81lc8azxiv.R.inc(59909);
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_11a811a81lc8azxiv.R.inc(59911);
        __CLR4_4_11a811a81lc8azxiv.R.inc(59912);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11a811a81lc8azxiv.R.inc(59913);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11a811a81lc8azxiv.R.inc(59914);originalLocale = Locale.getDefault();
        __CLR4_4_11a811a81lc8azxiv.R.inc(59915);DateTimeZone.setDefault(DateTimeZone.forID("Europe/London"));
        __CLR4_4_11a811a81lc8azxiv.R.inc(59916);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11a811a81lc8azxiv.R.inc(59917);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_11a811a81lc8azxiv.R.inc(59918);
        __CLR4_4_11a811a81lc8azxiv.R.inc(59919);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11a811a81lc8azxiv.R.inc(59920);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11a811a81lc8azxiv.R.inc(59921);Locale.setDefault(originalLocale);
        __CLR4_4_11a811a81lc8azxiv.R.inc(59922);originalDateTimeZone = null;
        __CLR4_4_11a811a81lc8azxiv.R.inc(59923);originalTimeZone = null;
        __CLR4_4_11a811a81lc8azxiv.R.inc(59924);originalLocale = null;
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_dateParser() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),59925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t2fznl1a8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t2fznl1a8l(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(59925);
        __CLR4_4_11a811a81lc8azxiv.R.inc(59926);DateTimeFormatter parser = ISODateTimeFormat.dateParser();
        __CLR4_4_11a811a81lc8azxiv.R.inc(59927);assertParse(parser, true, "2006-06-09");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59928);assertParse(parser, true, "2006-W27-3");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59929);assertParse(parser, true, "2006-123");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59930);assertParse(parser, true, "2006-06-09T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59931);assertParse(parser, true, "2006-W27-3T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59932);assertParse(parser, true, "2006-123T+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(59933);assertParse(parser, false, "2006-06-09T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59934);assertParse(parser, false, "2006-W27-3T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59935);assertParse(parser, false, "2006-123T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59936);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59937);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59938);assertParse(parser, false, "2006-123T10:20:30.040+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(59939);assertParse(parser, false, "T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59940);assertParse(parser, false, "T10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59941);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59942);assertParse(parser, false, "T10.5+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(59943);assertParse(parser, false, "10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59944);assertParse(parser, false, "10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59945);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59946);assertParse(parser, false, "10.5+02:00");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_localDateParser() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),59947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lowiuq1a97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localDateParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lowiuq1a97(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(59947);
        __CLR4_4_11a811a81lc8azxiv.R.inc(59948);DateTimeFormatter parser = ISODateTimeFormat.localDateParser();
        __CLR4_4_11a811a81lc8azxiv.R.inc(59949);assertEquals(DateTimeZone.UTC, parser.getZone());
        __CLR4_4_11a811a81lc8azxiv.R.inc(59950);assertParse(parser, true, "2006-06-09");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59951);assertParse(parser, true, "2006-W27-3");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59952);assertParse(parser, true, "2006-123");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59953);assertParse(parser, false, "2006-06-09T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59954);assertParse(parser, false, "2006-W27-3T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59955);assertParse(parser, false, "2006-123T+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(59956);assertParse(parser, false, "2006-06-09T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59957);assertParse(parser, false, "2006-W27-3T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59958);assertParse(parser, false, "2006-123T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59959);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59960);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59961);assertParse(parser, false, "2006-123T10:20:30.040+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(59962);assertParse(parser, false, "T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59963);assertParse(parser, false, "T10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59964);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59965);assertParse(parser, false, "T10.5+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(59966);assertParse(parser, false, "10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59967);assertParse(parser, false, "10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59968);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59969);assertParse(parser, false, "10.5+02:00");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_dateElementParser() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),59970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttdd6v1a9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateElementParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttdd6v1a9u(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(59970);
        __CLR4_4_11a811a81lc8azxiv.R.inc(59971);DateTimeFormatter parser = ISODateTimeFormat.dateElementParser();
        __CLR4_4_11a811a81lc8azxiv.R.inc(59972);assertParse(parser, "2006-06-09", new DateTime(2006, 6, 9, 0, 0, 0, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(59973);assertParse(parser, "2006-06-9", new DateTime(2006, 6, 9, 0, 0, 0, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(59974);assertParse(parser, "2006-6-09", new DateTime(2006, 6, 9, 0, 0, 0, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(59975);assertParse(parser, "2006-6-9", new DateTime(2006, 6, 9, 0, 0, 0, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(59976);assertParse(parser, true, "2006-W27-3");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59977);assertParse(parser, true, "2006-123");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59978);assertParse(parser, false, "2006-06-09T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59979);assertParse(parser, false, "2006-W27-3T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59980);assertParse(parser, false, "2006-123T+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(59981);assertParse(parser, false, "2006-06-09T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59982);assertParse(parser, false, "2006-W27-3T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59983);assertParse(parser, false, "2006-123T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59984);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59985);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59986);assertParse(parser, false, "2006-123T10:20:30.040+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(59987);assertParse(parser, false, "T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59988);assertParse(parser, false, "T10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59989);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59990);assertParse(parser, false, "T10.5+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(59991);assertParse(parser, false, "10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59992);assertParse(parser, false, "10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59993);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59994);assertParse(parser, false, "10.5+02:00");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_timeParser() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),59995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r4werk1aaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_timeParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r4werk1aaj(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(59995);
        __CLR4_4_11a811a81lc8azxiv.R.inc(59996);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(59997);DateTimeFormatter parser = ISODateTimeFormat.timeParser();
        __CLR4_4_11a811a81lc8azxiv.R.inc(59998);assertParse(parser, false, "2006-06-09");
        __CLR4_4_11a811a81lc8azxiv.R.inc(59999);assertParse(parser, false, "2006-W27-3");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60000);assertParse(parser, false, "2006-123");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60001);assertParse(parser, false, "2006-06-09T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60002);assertParse(parser, false, "2006-W27-3T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60003);assertParse(parser, false, "2006-123T+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60004);assertParse(parser, false, "2006-06-09T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60005);assertParse(parser, false, "2006-W27-3T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60006);assertParse(parser, false, "2006-123T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60007);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60008);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60009);assertParse(parser, false, "2006-123T10:20:30.040+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60010);assertParse(parser, "T10:20:30.040000000", new DateTime(1970, 1, 1, 10, 20, 30, 40));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60011);assertParse(parser, "T10:20:30.004", new DateTime(1970, 1, 1, 10, 20, 30, 4));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60012);assertParse(parser, "T10:20:30.040", new DateTime(1970, 1, 1, 10, 20, 30, 40));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60013);assertParse(parser, "T10:20:30.400", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60014);assertParse(parser, "T10.5", new DateTime(1970, 1, 1, 10, 30, 0, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60015);assertParse(parser, "T10:20:30.040+02:00", new DateTime(1970, 1, 1, 8, 20, 30, 40));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60016);assertParse(parser, "T10.5+02:00", new DateTime(1970, 1, 1, 8, 30, 0, 0));
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60017);assertParse(parser, true, "10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60018);assertParse(parser, true, "10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60019);assertParse(parser, true, "10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60020);assertParse(parser, true, "10.5+02:00");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_localTimeParser() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yifvkf1ab9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localTimeParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yifvkf1ab9(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60021);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60022);DateTimeFormatter parser = ISODateTimeFormat.localTimeParser();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60023);assertEquals(DateTimeZone.UTC, parser.getZone());
        __CLR4_4_11a811a81lc8azxiv.R.inc(60024);assertParse(parser, false, "2006-06-09");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60025);assertParse(parser, false, "2006-W27-3");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60026);assertParse(parser, false, "2006-123");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60027);assertParse(parser, false, "2006-06-09T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60028);assertParse(parser, false, "2006-W27-3T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60029);assertParse(parser, false, "2006-123T+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60030);assertParse(parser, false, "2006-06-09T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60031);assertParse(parser, false, "2006-W27-3T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60032);assertParse(parser, false, "2006-123T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60033);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60034);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60035);assertParse(parser, false, "2006-123T10:20:30.040+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60036);assertParse(parser, true, "T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60037);assertParse(parser, true, "T10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60038);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60039);assertParse(parser, false, "T10.5+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60040);assertParse(parser, true, "10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60041);assertParse(parser, true, "10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60042);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60043);assertParse(parser, false, "10.5+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60044);assertParse(parser, true, "00:00:10.512345678");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60045);assertEquals(10512, parser.parseMillis("00:00:10.512345678"));
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_timeElementParser() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14jwhew1aby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_timeElementParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14jwhew1aby(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60046);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60047);DateTimeFormatter parser = ISODateTimeFormat.timeElementParser();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60048);assertParse(parser, false, "2006-06-09");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60049);assertParse(parser, false, "2006-W27-3");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60050);assertParse(parser, false, "2006-123");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60051);assertParse(parser, false, "2006-06-09T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60052);assertParse(parser, false, "2006-W27-3T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60053);assertParse(parser, false, "2006-123T+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60054);assertParse(parser, false, "2006-06-09T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60055);assertParse(parser, false, "2006-W27-3T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60056);assertParse(parser, false, "2006-123T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60057);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60058);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60059);assertParse(parser, false, "2006-123T10:20:30.040+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60060);assertParse(parser, false, "T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60061);assertParse(parser, false, "T10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60062);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60063);assertParse(parser, false, "T10.5+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60064);assertParse(parser, true, "10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60065);assertParse(parser, true, "10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60066);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60067);assertParse(parser, false, "10.5+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60068);assertParse(parser, true, "00:00:10.512345678");
        // result is offset by London DST in 1970-01-01
        __CLR4_4_11a811a81lc8azxiv.R.inc(60069);assertEquals(10512, parser.parseMillis("00:00:10.512345678") + DateTimeZone.getDefault().getOffset(0L));
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_dateTimeParser() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7ex821acm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateTimeParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7ex821acm(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60070);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60071);DateTimeFormatter parser = ISODateTimeFormat.dateTimeParser();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60072);assertParse(parser, true, "2006-06-09");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60073);assertParse(parser, true, "2006-W27-3");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60074);assertParse(parser, true, "2006-123");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60075);assertParse(parser, true, "2006-06-09T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60076);assertParse(parser, true, "2006-W27-3T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60077);assertParse(parser, true, "2006-123T+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60078);assertParse(parser, true, "2006-06-09T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60079);assertParse(parser, true, "2006-W27-3T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60080);assertParse(parser, true, "2006-123T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60081);assertParse(parser, true, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60082);assertParse(parser, true, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60083);assertParse(parser, true, "2006-123T10:20:30.040+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60084);assertParse(parser, true, "T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60085);assertParse(parser, true, "T10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60086);assertParse(parser, true, "T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60087);assertParse(parser, true, "T10.5+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60088);assertParse(parser, false, "10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60089);assertParse(parser, false, "10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60090);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60091);assertParse(parser, false, "10.5+02:00");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_dateOptionalTimeParser() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h01rke1ad8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateOptionalTimeParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h01rke1ad8(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60092);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60093);DateTimeFormatter parser = ISODateTimeFormat.dateOptionalTimeParser();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60094);assertParse(parser, true, "2006-06-09");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60095);assertParse(parser, true, "2006-W27-3");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60096);assertParse(parser, true, "2006-123");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60097);assertParse(parser, true, "2006-06-09T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60098);assertParse(parser, true, "2006-W27-3T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60099);assertParse(parser, true, "2006-123T+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60100);assertParse(parser, true, "2006-06-09T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60101);assertParse(parser, true, "2006-W27-3T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60102);assertParse(parser, true, "2006-123T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60103);assertParse(parser, true, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60104);assertParse(parser, true, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60105);assertParse(parser, true, "2006-123T10:20:30.040+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60106);assertParse(parser, false, "T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60107);assertParse(parser, false, "T10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60108);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60109);assertParse(parser, false, "T10.5+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60110);assertParse(parser, false, "10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60111);assertParse(parser, false, "10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60112);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60113);assertParse(parser, false, "10.5+02:00");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_localDateOptionalTimeParser() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qvwjl1adu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localDateOptionalTimeParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qvwjl1adu(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60114);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60115);DateTimeFormatter parser = ISODateTimeFormat.localDateOptionalTimeParser();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60116);assertEquals(DateTimeZone.UTC, parser.getZone());
        __CLR4_4_11a811a81lc8azxiv.R.inc(60117);assertParse(parser, true, "2006-06-09");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60118);assertParse(parser, true, "2006-W27-3");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60119);assertParse(parser, true, "2006-123");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60120);assertParse(parser, false, "2006-06-09T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60121);assertParse(parser, false, "2006-W27-3T+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60122);assertParse(parser, false, "2006-123T+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60123);assertParse(parser, true, "2006-06-09T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60124);assertParse(parser, true, "2006-W27-3T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60125);assertParse(parser, true, "2006-123T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60126);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60127);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60128);assertParse(parser, false, "2006-123T10:20:30.040+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60129);assertParse(parser, false, "T10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60130);assertParse(parser, false, "T10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60131);assertParse(parser, false, "T10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60132);assertParse(parser, false, "T10.5+02:00");
        
        __CLR4_4_11a811a81lc8azxiv.R.inc(60133);assertParse(parser, false, "10:20:30.040");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60134);assertParse(parser, false, "10.5");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60135);assertParse(parser, false, "10:20:30.040+02:00");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60136);assertParse(parser, false, "10.5+02:00");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    public void test_date() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi49um1aeh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_date",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi49um1aeh(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60137);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60138);DateTimeFormatter parser = ISODateTimeFormat.date();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60139);assertParse(parser, "2006-02-04", new DateTime(2006, 2, 4, 0, 0, 0, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60140);assertParse(parser, "2006-2-04", new DateTime(2006, 2, 4, 0, 0, 0, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60141);assertParse(parser, "2006-02-4", new DateTime(2006, 2, 4, 0, 0, 0, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60142);assertParse(parser, "2006-2-4", new DateTime(2006, 2, 4, 0, 0, 0, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60143);assertParse(parser, false, "2006-02-");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60144);assertParse(parser, false, "2006-02");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60145);assertParse(parser, false, "2006--4");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60146);assertParse(parser, false, "2006-1");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60147);assertParse(parser, false, "2006");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_time() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4ccpt1aes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_time",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4ccpt1aes(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60148);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60149);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60150);DateTimeFormatter parser = ISODateTimeFormat.time();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60151);assertParse(parser, "10:20:30.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60152);assertParse(parser, "10:20:30.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60153);assertParse(parser, "10:20:30.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60154);assertParse(parser, "10:20:30.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60155);assertParse(parser, "5:6:7.8Z", new DateTime(1970, 1, 1, 5, 6, 7, 800));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60156);assertParse(parser, false, "10:20.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60157);assertParse(parser, false, "10:2.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60158);assertParse(parser, false, "10.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60159);assertParse(parser, false, "1.400Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_timeNoMillis() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17nk7p41af4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_timeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17nk7p41af4(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60160);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60161);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60162);DateTimeFormatter parser = ISODateTimeFormat.timeNoMillis();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60163);assertParse(parser, "10:20:30Z", new DateTime(1970, 1, 1, 10, 20, 30, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60164);assertParse(parser, "5:6:7Z", new DateTime(1970, 1, 1, 5, 6, 7, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60165);assertParse(parser, false, "10:20Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60166);assertParse(parser, false, "10:2Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60167);assertParse(parser, false, "10Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60168);assertParse(parser, false, "1Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_tTime() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_183wy0r1afd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_tTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_183wy0r1afd(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60169);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60170);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60171);DateTimeFormatter parser = ISODateTimeFormat.tTime();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60172);assertParse(parser, "T10:20:30.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60173);assertParse(parser, "T10:20:30.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60174);assertParse(parser, "T10:20:30.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60175);assertParse(parser, "T10:20:30.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60176);assertParse(parser, "T5:6:7.8Z", new DateTime(1970, 1, 1, 5, 6, 7, 800));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60177);assertParse(parser, false, "T10:20.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60178);assertParse(parser, false, "T102.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60179);assertParse(parser, false, "T10.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60180);assertParse(parser, false, "T1.400Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_tTimeNoMillis() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcko2q1afp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_tTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcko2q1afp(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60181);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60182);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60183);DateTimeFormatter parser = ISODateTimeFormat.tTimeNoMillis();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60184);assertParse(parser, "T10:20:30Z", new DateTime(1970, 1, 1, 10, 20, 30, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60185);assertParse(parser, "T5:6:7Z", new DateTime(1970, 1, 1, 5, 6, 7, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60186);assertParse(parser, false, "T10:20Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60187);assertParse(parser, false, "T10:2Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60188);assertParse(parser, false, "T10Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60189);assertParse(parser, false, "T1Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_dateTime() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157joj31afy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157joj31afy(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60190);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60191);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60192);DateTimeFormatter parser = ISODateTimeFormat.dateTime();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60193);assertParse(parser, "2006-02-04T10:20:30.400999999Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60194);assertParse(parser, "2006-02-04T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60195);assertParse(parser, "2006-02-04T10:20:30.40Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60196);assertParse(parser, "2006-02-04T10:20:30.4Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60197);assertParse(parser, "2006-02-4T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60198);assertParse(parser, "2006-2-04T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60199);assertParse(parser, "2006-2-4T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60200);assertParse(parser, "2006-02-04T5:6:7.800Z", new DateTime(2006, 2, 4, 5, 6, 7, 800));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60201);assertParse(parser, false, "2006-02-T10:20:30.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60202);assertParse(parser, false, "2006-12T10:20:30.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60203);assertParse(parser, false, "2006-1T10:20:30.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60204);assertParse(parser, false, "2006T10:20:30.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60205);assertParse(parser, false, "200T10:20:30.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60206);assertParse(parser, false, "20T10:20:30.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60207);assertParse(parser, false, "2T10:20:30.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60208);assertParse(parser, false, "2006-02-04T10:20.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60209);assertParse(parser, false, "2006-02-04T10:2.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60210);assertParse(parser, false, "2006-02-04T10.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60211);assertParse(parser, false, "2006-02-04T1.400Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_dateTimeNoMillis() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ujii21agk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ujii21agk(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60212);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60213);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60214);DateTimeFormatter parser = ISODateTimeFormat.dateTimeNoMillis();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60215);assertParse(parser, "2006-02-04T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60216);assertParse(parser, "2006-02-4T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60217);assertParse(parser, "2006-2-04T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60218);assertParse(parser, "2006-2-4T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60219);assertParse(parser, "2006-02-04T5:6:7Z", new DateTime(2006, 2, 4, 5, 6, 7, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60220);assertParse(parser, false, "2006-02-T10:20:30Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60221);assertParse(parser, false, "2006-12T10:20:30Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60222);assertParse(parser, false, "2006-1T10:20:30Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60223);assertParse(parser, false, "2006T10:20:30Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60224);assertParse(parser, false, "200T10:20:30Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60225);assertParse(parser, false, "20T10:20:30Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60226);assertParse(parser, false, "2T10:20:30Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60227);assertParse(parser, false, "2006-02-04T10:20Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60228);assertParse(parser, false, "2006-02-04T10:2Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60229);assertParse(parser, false, "2006-02-04T10Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60230);assertParse(parser, false, "2006-02-04T1Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_ordinalDate() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pd8z1j1ah3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pd8z1j1ah3(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60231);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60232);DateTimeFormatter parser = ISODateTimeFormat.ordinalDate();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60233);assertParse(parser, "2006-123", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60234);assertParse(parser, "2006-12", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(12));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60235);assertParse(parser, "2006-1", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(1));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60236);assertParse(parser, false, "2006-");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60237);assertParse(parser, false, "2006");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_ordinalDateTime() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z9ufhi1aha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z9ufhi1aha(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60238);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60239);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60240);DateTimeFormatter parser = ISODateTimeFormat.ordinalDateTime();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60241);assertParse(parser, "2006-123T10:20:30.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60242);assertParse(parser, "2006-123T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60243);assertParse(parser, "2006-123T10:20:30.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60244);assertParse(parser, "2006-123T10:20:30.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60245);assertParse(parser, "2006-12T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(12));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60246);assertParse(parser, "2006-1T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(1));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60247);assertParse(parser, "2006-123T5:6:7.800Z", new DateTime(2006, 1, 1, 5, 6, 7, 800).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60248);assertParse(parser, false, "2006-T10:20:30.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60249);assertParse(parser, false, "2006T10:20:30.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60250);assertParse(parser, false, "2006-123T10:20.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60251);assertParse(parser, false, "2006-123T10:2.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60252);assertParse(parser, false, "2006-123T10.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60253);assertParse(parser, false, "2006-123T1.400Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_ordinalDateTimeNoMillis() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13uf7x1ahq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13uf7x1ahq(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60254);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60255);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60256);DateTimeFormatter parser = ISODateTimeFormat.ordinalDateTimeNoMillis();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60257);assertParse(parser, "2006-123T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60258);assertParse(parser, "2006-12T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(12));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60259);assertParse(parser, "2006-1T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(1));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60260);assertParse(parser, "2006-123T5:6:7Z", new DateTime(2006, 1, 1, 5, 6, 7, 0).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60261);assertParse(parser, false, "2006-T10:20:30Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60262);assertParse(parser, false, "2006T10:20:30Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60263);assertParse(parser, false, "2006-123T10:20Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60264);assertParse(parser, false, "2006-123T10:2Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60265);assertParse(parser, false, "2006-123T10Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60266);assertParse(parser, false, "2006-123T1Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_weekDate() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rqiy8a1ai3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_weekDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rqiy8a1ai3(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60267);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60268);DateTimeFormatter parser = ISODateTimeFormat.weekDate();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60269);assertParse(parser, "2006-W27-3", new DateTime(2006, 6, 1, 0, 0, 0, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60270);assertParse(parser, "2006-W2-3", new DateTime(2006, 6, 1, 0, 0, 0, 0).withWeekOfWeekyear(2).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60271);assertParse(parser, false, "2006-W-3");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60272);assertParse(parser, false, "2006-W27-");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60273);assertParse(parser, false, "2006-W27");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60274);assertParse(parser, false, "2006-W2");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60275);assertParse(parser, false, "2006-W");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_weekDateTime() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1euc591aic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_weekDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1euc591aic(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60276);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60277);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60278);DateTimeFormatter parser = ISODateTimeFormat.weekDateTime();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60279);assertParse(parser, "2006-W27-3T10:20:30.400999999Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60280);assertParse(parser, "2006-W27-3T10:20:30.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60281);assertParse(parser, "2006-W27-3T10:20:30.40Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60282);assertParse(parser, "2006-W27-3T10:20:30.4Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60283);assertParse(parser, "2006-W2-3T10:20:30.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(2).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60284);assertParse(parser, "2006-W27-3T5:6:7.800Z", new DateTime(2006, 6, 1, 5, 6, 7, 800).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60285);assertParse(parser, false, "2006-W27-T10:20:30.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60286);assertParse(parser, false, "2006-W27T10:20:30.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60287);assertParse(parser, false, "2006-W2T10:20:30.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60288);assertParse(parser, false, "2006-W-3T10:20:30.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60289);assertParse(parser, false, "2006-W27-3T10:20.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60290);assertParse(parser, false, "2006-W27-3T10:2.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60291);assertParse(parser, false, "2006-W27-3T10.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60292);assertParse(parser, false, "2006-W27-3T1.400Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_weekDateTimeNoMillis() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gabhm1ait();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_weekDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gabhm1ait(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60293);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60294);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60295);DateTimeFormatter parser = ISODateTimeFormat.weekDateTimeNoMillis();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60296);assertParse(parser, "2006-W27-3T10:20:30Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60297);assertParse(parser, "2006-W2-3T10:20:30Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(2).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60298);assertParse(parser, "2006-W27-3T5:6:7Z", new DateTime(2006, 6, 1, 5, 6, 7, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60299);assertParse(parser, false, "2006-W27-T10:20:30Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60300);assertParse(parser, false, "2006-W27T10:20:30Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60301);assertParse(parser, false, "2006-W2T10:20:30Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60302);assertParse(parser, false, "2006-W-3T10:20:30Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60303);assertParse(parser, false, "2006-W27-3T10:20Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60304);assertParse(parser, false, "2006-W27-3T10:2Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60305);assertParse(parser, false, "2006-W27-3T10Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60306);assertParse(parser, false, "2006-W27-3T1Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    public void test_basicDate() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vm22e1aj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vm22e1aj7(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60307);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60308);DateTimeFormatter parser = ISODateTimeFormat.basicDate();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60309);assertParse(parser, "20060204", new DateTime(2006, 2, 4, 0, 0, 0, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60310);assertParse(parser, false, "2006024");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60311);assertParse(parser, false, "200602");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60312);assertParse(parser, false, "20061");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60313);assertParse(parser, false, "2006");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_basicTime() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gymnp1aje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gymnp1aje(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60314);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60315);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60316);DateTimeFormatter parser = ISODateTimeFormat.basicTime();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60317);assertParse(parser, "102030.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60318);assertParse(parser, "102030.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60319);assertParse(parser, "102030.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60320);assertParse(parser, "102030.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60321);assertParse(parser, false, "10203.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60322);assertParse(parser, false, "1020.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60323);assertParse(parser, false, "102.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60324);assertParse(parser, false, "10.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60325);assertParse(parser, false, "1.400Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_basicTimeNoMillis() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14909gc1ajq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14909gc1ajq(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60326);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60327);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60328);DateTimeFormatter parser = ISODateTimeFormat.basicTimeNoMillis();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60329);assertParse(parser, "102030Z", new DateTime(1970, 1, 1, 10, 20, 30, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60330);assertParse(parser, false, "10203Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60331);assertParse(parser, false, "1020Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60332);assertParse(parser, false, "102Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60333);assertParse(parser, false, "10Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60334);assertParse(parser, false, "1Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_basicTTime() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rnju3d1ajz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rnju3d1ajz(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60335);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60336);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60337);DateTimeFormatter parser = ISODateTimeFormat.basicTTime();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60338);assertParse(parser, "T102030.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60339);assertParse(parser, "T102030.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60340);assertParse(parser, "T102030.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60341);assertParse(parser, "T102030.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60342);assertParse(parser, false, "T10203.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60343);assertParse(parser, false, "T1020.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60344);assertParse(parser, false, "T102.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60345);assertParse(parser, false, "T10.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60346);assertParse(parser, false, "T1.400Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_basicTTimeNoMillis() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psgw361akb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psgw361akb(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60347);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60348);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60349);DateTimeFormatter parser = ISODateTimeFormat.basicTTimeNoMillis();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60350);assertParse(parser, "T102030Z", new DateTime(1970, 1, 1, 10, 20, 30, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60351);assertParse(parser, false, "T10203Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60352);assertParse(parser, false, "T1020Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60353);assertParse(parser, false, "T102Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60354);assertParse(parser, false, "T10Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60355);assertParse(parser, false, "T1Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_basicDateTime() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7qlvh1akk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7qlvh1akk(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60356);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60357);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60358);DateTimeFormatter parser = ISODateTimeFormat.basicDateTime();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60359);assertParse(parser, "20061204T102030.400999999Z", new DateTime(2006, 12, 4, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60360);assertParse(parser, "20061204T102030.400Z", new DateTime(2006, 12, 4, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60361);assertParse(parser, "20061204T102030.40Z", new DateTime(2006, 12, 4, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60362);assertParse(parser, "20061204T102030.4Z", new DateTime(2006, 12, 4, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60363);assertParse(parser, false, "2006120T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60364);assertParse(parser, false, "200612T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60365);assertParse(parser, false, "20061T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60366);assertParse(parser, false, "2006T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60367);assertParse(parser, false, "200T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60368);assertParse(parser, false, "20T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60369);assertParse(parser, false, "2T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60370);assertParse(parser, false, "20061204T10203.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60371);assertParse(parser, false, "20061204T1020.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60372);assertParse(parser, false, "20061204T102.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60373);assertParse(parser, false, "20061204T10.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60374);assertParse(parser, false, "20061204T1.400Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_basicDateTimeNoMillis() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18o9hg61al3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18o9hg61al3(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60375);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60376);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60377);DateTimeFormatter parser = ISODateTimeFormat.basicDateTimeNoMillis();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60378);assertParse(parser, "20061204T102030Z", new DateTime(2006, 12, 4, 10, 20, 30, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60379);assertParse(parser, false, "2006120T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60380);assertParse(parser, false, "200612T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60381);assertParse(parser, false, "20061T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60382);assertParse(parser, false, "2006T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60383);assertParse(parser, false, "200T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60384);assertParse(parser, false, "20T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60385);assertParse(parser, false, "2T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60386);assertParse(parser, false, "20061204T10203Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60387);assertParse(parser, false, "20061204T1020Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60388);assertParse(parser, false, "20061204T102Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60389);assertParse(parser, false, "20061204T10Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60390);assertParse(parser, false, "20061204T1Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_basicOrdinalDate() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_122js1n1alj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicOrdinalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_122js1n1alj(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60391);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60392);DateTimeFormatter parser = ISODateTimeFormat.basicOrdinalDate();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60393);assertParse(parser, "2006123", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60394);assertParse(parser, false, "200612");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60395);assertParse(parser, false, "20061");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60396);assertParse(parser, false, "2006");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_basicOrdinalDateTime() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uj9l761alp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicOrdinalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uj9l761alp(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60397);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60398);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60399);DateTimeFormatter parser = ISODateTimeFormat.basicOrdinalDateTime();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60400);assertParse(parser, "2006123T102030.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60401);assertParse(parser, "2006123T102030.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60402);assertParse(parser, "2006123T102030.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60403);assertParse(parser, "2006123T102030.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60404);assertParse(parser, false, "200612T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60405);assertParse(parser, false, "20061T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60406);assertParse(parser, false, "2006T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60407);assertParse(parser, false, "200T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60408);assertParse(parser, false, "20T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60409);assertParse(parser, false, "2T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60410);assertParse(parser, false, "2006123T10203.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60411);assertParse(parser, false, "2006123T1020.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60412);assertParse(parser, false, "2006123T102.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60413);assertParse(parser, false, "2006123T10.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60414);assertParse(parser, false, "2006123T1.400Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_basicOrdinalDateTimeNoMillis() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jt5xaf1am7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicOrdinalDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jt5xaf1am7(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60415);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60416);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60417);DateTimeFormatter parser = ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60418);assertParse(parser, "2006123T102030Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(123));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60419);assertParse(parser, false, "200612T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60420);assertParse(parser, false, "20061T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60421);assertParse(parser, false, "2006T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60422);assertParse(parser, false, "200T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60423);assertParse(parser, false, "20T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60424);assertParse(parser, false, "2T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60425);assertParse(parser, false, "2006123T10203Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60426);assertParse(parser, false, "2006123T1020Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60427);assertParse(parser, false, "2006123T102Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60428);assertParse(parser, false, "2006123T10Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60429);assertParse(parser, false, "2006123T1Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_basicWeekDate() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lvatca1amm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicWeekDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lvatca1amm(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60430);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60431);DateTimeFormatter parser = ISODateTimeFormat.basicWeekDate();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60432);assertParse(parser, "2006W273", new DateTime(2006, 6, 1, 0, 0, 0, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60433);assertParse(parser, false, "2006W27");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60434);assertParse(parser, false, "2006W2");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60435);assertParse(parser, false, "2006W");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_basicWeekDateTime() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhq5071ams();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicWeekDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhq5071ams(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60436);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60437);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60438);DateTimeFormatter parser = ISODateTimeFormat.basicWeekDateTime();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60439);assertParse(parser, "2006W273T102030.400999999Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60440);assertParse(parser, "2006W273T102030.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60441);assertParse(parser, "2006W273T102030.40Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60442);assertParse(parser, "2006W273T102030.4Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60443);assertParse(parser, false, "2006W27T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60444);assertParse(parser, false, "2006W2T102030.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60445);assertParse(parser, false, "2006W273T10203.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60446);assertParse(parser, false, "2006W273T1020.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60447);assertParse(parser, false, "2006W273T102.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60448);assertParse(parser, false, "2006W273T10.400Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60449);assertParse(parser, false, "2006W273T1.400Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_basicWeekDateTimeNoMillis() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghq9oe1an6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicWeekDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghq9oe1an6(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60450);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60451);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60452);DateTimeFormatter parser = ISODateTimeFormat.basicWeekDateTimeNoMillis();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60453);assertParse(parser, "2006W273T102030Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(27).withDayOfWeek(3));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60454);assertParse(parser, false, "2006W27T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60455);assertParse(parser, false, "2006W2T102030Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60456);assertParse(parser, false, "2006W273T10203Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60457);assertParse(parser, false, "2006W273T1020Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60458);assertParse(parser, false, "2006W273T102Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60459);assertParse(parser, false, "2006W273T10Z");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60460);assertParse(parser, false, "2006W273T1Z");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    public void test_hourMinute() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ar3bg1anh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_hourMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ar3bg1anh(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60461);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60462);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60463);DateTimeFormatter parser = ISODateTimeFormat.hourMinute();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60464);assertParse(parser, "10:20", new DateTime(1970, 1, 1, 10, 20, 0, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60465);assertParse(parser, "5:6", new DateTime(1970, 1, 1, 5, 6, 0, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60466);assertParse(parser, false, "10:20:30.400999999");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60467);assertParse(parser, false, "10:20:30.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60468);assertParse(parser, false, "10:20:30");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60469);assertParse(parser, false, "10:20.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60470);assertParse(parser, false, "10:2.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60471);assertParse(parser, false, "10.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60472);assertParse(parser, false, "1.400");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_hourMinuteSecond() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du5nts1ant();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_hourMinuteSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du5nts1ant(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60473);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60474);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60475);DateTimeFormatter parser = ISODateTimeFormat.hourMinuteSecond();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60476);assertParse(parser, "10:20:30", new DateTime(1970, 1, 1, 10, 20, 30, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60477);assertParse(parser, "5:6:7", new DateTime(1970, 1, 1, 5, 6, 7, 0));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60478);assertParse(parser, false, "10:20:30.400999999");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60479);assertParse(parser, false, "10:20:30.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60480);assertParse(parser, false, "10:20:30.4");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60481);assertParse(parser, false, "10:20.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60482);assertParse(parser, false, "10:2.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60483);assertParse(parser, false, "10.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60484);assertParse(parser, false, "1.400");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_hourMinuteSecondMillis() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dm3p61ao5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_hourMinuteSecondMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dm3p61ao5(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60485);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60486);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60487);DateTimeFormatter parser = ISODateTimeFormat.hourMinuteSecondMillis();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60488);assertParse(parser, "10:20:30.400", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60489);assertParse(parser, "10:20:30.40", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60490);assertParse(parser, "10:20:30.4", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60491);assertParse(parser, "5:6:7.8", new DateTime(1970, 1, 1, 5, 6, 7, 800));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60492);assertParse(parser, false, "10:20:30.400999999");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60493);assertParse(parser, false, "10:20.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60494);assertParse(parser, false, "10:2.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60495);assertParse(parser, false, "10.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60496);assertParse(parser, false, "1.400");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_hourMinuteSecondFraction() {__CLR4_4_11a811a81lc8azxiv.R.globalSliceStart(getClass().getName(),60497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vgzb5q1aoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a811a81lc8azxiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a811a81lc8azxiv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_hourMinuteSecondFraction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vgzb5q1aoh(){try{__CLR4_4_11a811a81lc8azxiv.R.inc(60497);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60498);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60499);DateTimeFormatter parser = ISODateTimeFormat.hourMinuteSecondFraction();
        __CLR4_4_11a811a81lc8azxiv.R.inc(60500);assertParse(parser, "10:20:30.400999999", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60501);assertParse(parser, "10:20:30.400", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60502);assertParse(parser, "10:20:30.40", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60503);assertParse(parser, "10:20:30.4", new DateTime(1970, 1, 1, 10, 20, 30, 400));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60504);assertParse(parser, "5:6:7.8", new DateTime(1970, 1, 1, 5, 6, 7, 800));
        __CLR4_4_11a811a81lc8azxiv.R.inc(60505);assertParse(parser, false, "10:20.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60506);assertParse(parser, false, "10:2.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60507);assertParse(parser, false, "10.400");
        __CLR4_4_11a811a81lc8azxiv.R.inc(60508);assertParse(parser, false, "1.400");
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private void assertParse(DateTimeFormatter parser, boolean expected, String str) {try{__CLR4_4_11a811a81lc8azxiv.R.inc(60509);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60510);if ((((expected)&&(__CLR4_4_11a811a81lc8azxiv.R.iget(60511)!=0|true))||(__CLR4_4_11a811a81lc8azxiv.R.iget(60512)==0&false))) {{
            __CLR4_4_11a811a81lc8azxiv.R.inc(60513);parser.parseMillis(str);
        } }else {{
            __CLR4_4_11a811a81lc8azxiv.R.inc(60514);try {
                __CLR4_4_11a811a81lc8azxiv.R.inc(60515);parser.parseMillis(str);
                __CLR4_4_11a811a81lc8azxiv.R.inc(60516);fail();
            } catch (IllegalArgumentException ex) {
                // expected
            }
        }
    }}finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

    private void assertParse(DateTimeFormatter parser, String str, DateTime expected) {try{__CLR4_4_11a811a81lc8azxiv.R.inc(60517);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60518);DateTime dt = parser.parseDateTime(str);
        __CLR4_4_11a811a81lc8azxiv.R.inc(60519);assertEquals(expected, dt);
    }finally{__CLR4_4_11a811a81lc8azxiv.R.flushNeeded();}}

}
