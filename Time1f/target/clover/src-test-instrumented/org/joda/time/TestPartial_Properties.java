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

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Properties extends TestCase {static class __CLR4_4_1x4xx4xlc8azw3k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,43154,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    
    private DateTimeZone zone = null;
    private static final DateTimeFieldType[] TYPES = new DateTimeFieldType[] {
        DateTimeFieldType.hourOfDay(),
        DateTimeFieldType.minuteOfHour(),
        DateTimeFieldType.secondOfMinute(),
        DateTimeFieldType.millisOfSecond()
    };
    private static final int[] VALUES = new int[] {10, 20, 30, 40};
    private static final int[] VALUES1 = new int[] {1, 2, 3, 4};
    private static final int[] VALUES2 = new int[] {5, 6, 7, 8};

//    private long TEST_TIME_NOW =
//        10L * DateTimeConstants.MILLIS_PER_HOUR
//        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
//        + 30L * DateTimeConstants.MILLIS_PER_SECOND
//        + 40L;
//        
    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    public static void main(String[] args) {try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(42945);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42946);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(42947);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42948);return new TestSuite(TestPartial_Properties.class);
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public TestPartial_Properties(String name) {
        super(name);__CLR4_4_1x4xx4xlc8azw3k.R.inc(42950);try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(42949);
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(42951);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42952);zone = DateTimeZone.getDefault();
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42953);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(42954);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42955);DateTimeZone.setDefault(zone);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42956);zone = null;
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetHour() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),42957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mry6kax59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyGetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mry6kax59(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(42957);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42958);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42959);assertSame(test.getChronology().hourOfDay(), test.property(DateTimeFieldType.hourOfDay()).getField());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42960);assertEquals("hourOfDay", test.property(DateTimeFieldType.hourOfDay()).getName());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42961);assertEquals("Property[hourOfDay]", test.property(DateTimeFieldType.hourOfDay()).toString());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42962);assertSame(test, test.property(DateTimeFieldType.hourOfDay()).getReadablePartial());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42963);assertSame(test, test.property(DateTimeFieldType.hourOfDay()).getPartial());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42964);assertEquals(10, test.property(DateTimeFieldType.hourOfDay()).get());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42965);assertEquals("10", test.property(DateTimeFieldType.hourOfDay()).getAsString());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42966);assertEquals("10", test.property(DateTimeFieldType.hourOfDay()).getAsText());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42967);assertEquals("10", test.property(DateTimeFieldType.hourOfDay()).getAsText(Locale.FRENCH));
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42968);assertEquals("10", test.property(DateTimeFieldType.hourOfDay()).getAsShortText());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42969);assertEquals("10", test.property(DateTimeFieldType.hourOfDay()).getAsShortText(Locale.FRENCH));
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42970);assertEquals(test.getChronology().hours(), test.property(DateTimeFieldType.hourOfDay()).getDurationField());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42971);assertEquals(test.getChronology().days(), test.property(DateTimeFieldType.hourOfDay()).getRangeDurationField());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42972);assertEquals(2, test.property(DateTimeFieldType.hourOfDay()).getMaximumTextLength(null));
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42973);assertEquals(2, test.property(DateTimeFieldType.hourOfDay()).getMaximumShortTextLength(null));
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesHour() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),42974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xi8wmx5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyGetMaxMinValuesHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xi8wmx5q(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(42974);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42975);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42976);assertEquals(0, test.property(DateTimeFieldType.hourOfDay()).getMinimumValue());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42977);assertEquals(0, test.property(DateTimeFieldType.hourOfDay()).getMinimumValueOverall());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42978);assertEquals(23, test.property(DateTimeFieldType.hourOfDay()).getMaximumValue());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42979);assertEquals(23, test.property(DateTimeFieldType.hourOfDay()).getMaximumValueOverall());
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

//    public void testPropertyAddHour() {
//        Partial test = new Partial(TYPES, VALUES);
//        Partial copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(9);
//        check(test, 10, 20, 30, 40);
//        check(copy, 19, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(0);
//        check(copy, 10, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(13);
//        check(copy, 23, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(14);
//        check(copy, 0, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(-10);
//        check(copy, 0, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(-11);
//        check(copy, 23, 20, 30, 40);
//    }
//
    public void testPropertyAddHour() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),42980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15c189xx5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyAddHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15c189xx5w(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(42980);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42981);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42982);Partial copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(9);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42983);check(test, 10, 20, 30, 40);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42984);check(copy, 19, 20, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42985);copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42986);check(copy, 10, 20, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42987);copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(13);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42988);check(copy, 23, 20, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42989);try {
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(42990);test.property(DateTimeFieldType.hourOfDay()).addToCopy(14);
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(42991);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42992);check(test, 10, 20, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42993);copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(-10);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42994);check(copy, 0, 20, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42995);try {
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(42996);test.property(DateTimeFieldType.hourOfDay()).addToCopy(-11);
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(42997);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(42998);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public void testPropertyAddWrapFieldHour() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),42999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x88om7x6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyAddWrapFieldHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x88om7x6f(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(42999);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43000);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43001);Partial copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(9);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43002);check(test, 10, 20, 30, 40);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43003);check(copy, 19, 20, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43004);copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43005);check(copy, 10, 20, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43006);copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(18);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43007);check(copy, 4, 20, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43008);copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(-15);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43009);check(copy, 19, 20, 30, 40);
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public void testPropertySetHour() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),43010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyrp2yx6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertySetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyrp2yx6q(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(43010);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43011);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43012);Partial copy = test.property(DateTimeFieldType.hourOfDay()).setCopy(12);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43013);check(test, 10, 20, 30, 40);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43014);check(copy, 12, 20, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43015);try {
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43016);test.property(DateTimeFieldType.hourOfDay()).setCopy(24);
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43017);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43018);try {
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43019);test.property(DateTimeFieldType.hourOfDay()).setCopy(-1);
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43020);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public void testPropertySetTextHour() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),43021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yha19x71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertySetTextHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yha19x71(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(43021);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43022);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43023);Partial copy = test.property(DateTimeFieldType.hourOfDay()).setCopy("12");
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43024);check(test, 10, 20, 30, 40);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43025);check(copy, 12, 20, 30, 40);
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public void testPropertyWithMaximumValueHour() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),43026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otnz93x76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyWithMaximumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otnz93x76(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(43026);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43027);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43028);Partial copy = test.property(DateTimeFieldType.hourOfDay()).withMaximumValue();
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43029);check(test, 10, 20, 30, 40);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43030);check(copy, 23, 20, 30, 40);
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public void testPropertyWithMinimumValueHour() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),43031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6uf1hx7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyWithMinimumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6uf1hx7b(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(43031);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43032);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43033);Partial copy = test.property(DateTimeFieldType.hourOfDay()).withMinimumValue();
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43034);check(test, 10, 20, 30, 40);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43035);check(copy, 0, 20, 30, 40);
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public void testPropertyCompareToHour() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),43036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174ldgcx7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyCompareToHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174ldgcx7g(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(43036);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43037);Partial test1 = new Partial(TYPES, VALUES1);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43038);Partial test2 = new Partial(TYPES, VALUES2);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43039);assertEquals(true, test1.property(DateTimeFieldType.hourOfDay()).compareTo(test2) < 0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43040);assertEquals(true, test2.property(DateTimeFieldType.hourOfDay()).compareTo(test1) > 0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43041);assertEquals(true, test1.property(DateTimeFieldType.hourOfDay()).compareTo(test1) == 0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43042);try {
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43043);test1.property(DateTimeFieldType.hourOfDay()).compareTo((ReadablePartial) null);
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43044);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43045);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43046);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43047);assertEquals(true, test1.property(DateTimeFieldType.hourOfDay()).compareTo(dt2) < 0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43048);assertEquals(true, test2.property(DateTimeFieldType.hourOfDay()).compareTo(dt1) > 0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43049);assertEquals(true, test1.property(DateTimeFieldType.hourOfDay()).compareTo(dt1) == 0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43050);try {
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43051);test1.property(DateTimeFieldType.hourOfDay()).compareTo((ReadableInstant) null);
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43052);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMinute() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),43053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oej7l6x7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyGetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oej7l6x7x(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(43053);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43054);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43055);assertSame(test.getChronology().minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour()).getField());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43056);assertEquals("minuteOfHour", test.property(DateTimeFieldType.minuteOfHour()).getName());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43057);assertEquals("Property[minuteOfHour]", test.property(DateTimeFieldType.minuteOfHour()).toString());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43058);assertSame(test, test.property(DateTimeFieldType.minuteOfHour()).getReadablePartial());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43059);assertSame(test, test.property(DateTimeFieldType.minuteOfHour()).getPartial());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43060);assertEquals(20, test.property(DateTimeFieldType.minuteOfHour()).get());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43061);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsString());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43062);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsText());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43063);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsText(Locale.FRENCH));
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43064);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsShortText());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43065);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsShortText(Locale.FRENCH));
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43066);assertEquals(test.getChronology().minutes(), test.property(DateTimeFieldType.minuteOfHour()).getDurationField());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43067);assertEquals(test.getChronology().hours(), test.property(DateTimeFieldType.minuteOfHour()).getRangeDurationField());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43068);assertEquals(2, test.property(DateTimeFieldType.minuteOfHour()).getMaximumTextLength(null));
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43069);assertEquals(2, test.property(DateTimeFieldType.minuteOfHour()).getMaximumShortTextLength(null));
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesMinute() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),43070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110m2u2x8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyGetMaxMinValuesMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110m2u2x8e(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(43070);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43071);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43072);assertEquals(0, test.property(DateTimeFieldType.minuteOfHour()).getMinimumValue());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43073);assertEquals(0, test.property(DateTimeFieldType.minuteOfHour()).getMinimumValueOverall());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43074);assertEquals(59, test.property(DateTimeFieldType.minuteOfHour()).getMaximumValue());
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43075);assertEquals(59, test.property(DateTimeFieldType.minuteOfHour()).getMaximumValueOverall());
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

//    public void testPropertyAddMinute() {
//        Partial test = new Partial(TYPES, VALUES);
//        Partial copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(9);
//        check(test, 10, 20, 30, 40);
//        check(copy, 10, 29, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(39);
//        check(copy, 10, 59, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(40);
//        check(copy, 11, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(1 * 60 + 45);
//        check(copy, 12, 5, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 39);
//        check(copy, 23, 59, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 40);
//        check(copy, 0, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-9);
//        check(copy, 10, 11, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-19);
//        check(copy, 10, 1, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-20);
//        check(copy, 10, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-21);
//        check(copy, 9, 59, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 20));
//        check(copy, 0, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 21));
//        check(copy, 23, 59, 30, 40);
//    }

    public void testPropertyAddMinute() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),43076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pugv6dx8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyAddMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pugv6dx8k(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(43076);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43077);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43078);Partial copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(9);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43079);check(test, 10, 20, 30, 40);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43080);check(copy, 10, 29, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43081);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(39);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43082);check(copy, 10, 59, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43083);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(40);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43084);check(copy, 11, 0, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43085);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(1 * 60 + 45);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43086);check(copy, 12, 5, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43087);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 39);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43088);check(copy, 23, 59, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43089);try {
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43090);test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 40);
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43091);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43092);check(test, 10, 20, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43093);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-9);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43094);check(copy, 10, 11, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43095);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-19);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43096);check(copy, 10, 1, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43097);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-20);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43098);check(copy, 10, 0, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43099);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-21);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43100);check(copy, 9, 59, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43101);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 20));
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43102);check(copy, 0, 0, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43103);try {
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43104);test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 21));
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43105);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43106);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public void testPropertyAddWrapFieldMinute() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),43107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qahkvjx9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyAddWrapFieldMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qahkvjx9f(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(43107);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43108);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43109);Partial copy = test.property(DateTimeFieldType.minuteOfHour()).addWrapFieldToCopy(9);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43110);check(test, 10, 20, 30, 40);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43111);check(copy, 10, 29, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43112);copy = test.property(DateTimeFieldType.minuteOfHour()).addWrapFieldToCopy(49);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43113);check(copy, 10, 9, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43114);copy = test.property(DateTimeFieldType.minuteOfHour()).addWrapFieldToCopy(-47);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43115);check(copy, 10, 33, 30, 40);
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public void testPropertySetMinute() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),43116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196rp2ux9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertySetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196rp2ux9o(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(43116);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43117);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43118);Partial copy = test.property(DateTimeFieldType.minuteOfHour()).setCopy(12);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43119);check(test, 10, 20, 30, 40);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43120);check(copy, 10, 12, 30, 40);
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43121);try {
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43122);test.property(DateTimeFieldType.minuteOfHour()).setCopy(60);
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43123);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43124);try {
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43125);test.property(DateTimeFieldType.minuteOfHour()).setCopy(-1);
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43126);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public void testPropertySetTextMinute() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),43127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18h1pnnx9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertySetTextMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18h1pnnx9z(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(43127);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43128);Partial test = new Partial(TYPES, VALUES);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43129);Partial copy = test.property(DateTimeFieldType.minuteOfHour()).setCopy("12");
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43130);check(test, 10, 20, 30, 40);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43131);check(copy, 10, 12, 30, 40);
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    public void testPropertyCompareToMinute() {__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceStart(getClass().getName(),43132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtzyp8xa4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x4xx4xlc8azw3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x4xx4xlc8azw3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyCompareToMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtzyp8xa4(){try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(43132);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43133);Partial test1 = new Partial(TYPES, VALUES1);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43134);Partial test2 = new Partial(TYPES, VALUES2);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43135);assertEquals(true, test1.property(DateTimeFieldType.minuteOfHour()).compareTo(test2) < 0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43136);assertEquals(true, test2.property(DateTimeFieldType.minuteOfHour()).compareTo(test1) > 0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43137);assertEquals(true, test1.property(DateTimeFieldType.minuteOfHour()).compareTo(test1) == 0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43138);try {
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43139);test1.property(DateTimeFieldType.minuteOfHour()).compareTo((ReadablePartial) null);
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43140);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43141);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43142);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43143);assertEquals(true, test1.property(DateTimeFieldType.minuteOfHour()).compareTo(dt2) < 0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43144);assertEquals(true, test2.property(DateTimeFieldType.minuteOfHour()).compareTo(dt1) > 0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43145);assertEquals(true, test1.property(DateTimeFieldType.minuteOfHour()).compareTo(dt1) == 0);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43146);try {
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43147);test1.property(DateTimeFieldType.minuteOfHour()).compareTo((ReadableInstant) null);
            __CLR4_4_1x4xx4xlc8azw3k.R.inc(43148);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(Partial test, int hour, int min, int sec, int milli) {try{__CLR4_4_1x4xx4xlc8azw3k.R.inc(43149);
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43150);assertEquals(hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43151);assertEquals(min, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43152);assertEquals(sec, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1x4xx4xlc8azw3k.R.inc(43153);assertEquals(milli, test.get(DateTimeFieldType.millisOfSecond()));
    }finally{__CLR4_4_1x4xx4xlc8azw3k.R.flushNeeded();}}
}
