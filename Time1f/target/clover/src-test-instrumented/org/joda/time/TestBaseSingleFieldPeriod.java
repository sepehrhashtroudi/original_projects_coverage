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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.BaseSingleFieldPeriod;

/**
 * This class is a Junit unit test for BaseSingleFieldPeriod.
 *
 * @author Stephen Colebourne
 */
public class TestBaseSingleFieldPeriod extends TestCase {static class __CLR4_4_1gvpgvplc8azu2u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,22047,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1gvpgvplc8azu2u.R.inc(21877);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21878);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1gvpgvplc8azu2u.R.inc(21879);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21880);return new TestSuite(TestBaseSingleFieldPeriod.class);
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    public TestBaseSingleFieldPeriod(String name) {
        super(name);__CLR4_4_1gvpgvplc8azu2u.R.inc(21882);try{__CLR4_4_1gvpgvplc8azu2u.R.inc(21881);
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1gvpgvplc8azu2u.R.inc(21883);
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1gvpgvplc8azu2u.R.inc(21884);
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_between_RInstant() {__CLR4_4_1gvpgvplc8azu2u.R.globalSliceStart(getClass().getName(),21885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vdthtggvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvpgvplc8azu2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvpgvplc8azu2u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testFactory_between_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vdthtggvx(){try{__CLR4_4_1gvpgvplc8azu2u.R.inc(21885);
        // test using Days
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21886);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21887);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21888);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS);
        
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21889);assertEquals(3, Single.between(start, end1, DurationFieldType.days()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21890);assertEquals(0, Single.between(start, start, DurationFieldType.days()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21891);assertEquals(0, Single.between(end1, end1, DurationFieldType.days()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21892);assertEquals(-3, Single.between(end1, start, DurationFieldType.days()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21893);assertEquals(6, Single.between(start, end2, DurationFieldType.days()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21894);try {
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21895);Single.between(start, (ReadableInstant) null, DurationFieldType.days());
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21896);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21897);try {
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21898);Single.between((ReadableInstant) null, end1, DurationFieldType.days());
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21899);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21900);try {
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21901);Single.between((ReadableInstant) null, (ReadableInstant) null, DurationFieldType.days());
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21902);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testFactory_between_RPartial() {__CLR4_4_1gvpgvplc8azu2u.R.globalSliceStart(getClass().getName(),21903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n66vosgwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvpgvplc8azu2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvpgvplc8azu2u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testFactory_between_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n66vosgwf(){try{__CLR4_4_1gvpgvplc8azu2u.R.inc(21903);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21904);LocalDate start = new LocalDate(2006, 6, 9);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21905);LocalDate end1 = new LocalDate(2006, 6, 12);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21906);YearMonthDay end2 = new YearMonthDay(2006, 6, 15);
        
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21907);Single zero = new Single(0);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21908);assertEquals(3, Single.between(start, end1, zero));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21909);assertEquals(0, Single.between(start, start, zero));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21910);assertEquals(0, Single.between(end1, end1, zero));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21911);assertEquals(-3, Single.between(end1, start, zero));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21912);assertEquals(6, Single.between(start, end2, zero));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21913);try {
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21914);Single.between(start, (ReadablePartial) null, zero);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21915);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21916);try {
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21917);Single.between((ReadablePartial) null, end1, zero);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21918);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21919);try {
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21920);Single.between((ReadablePartial) null, (ReadablePartial) null, zero);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21921);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21922);try {
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21923);Single.between(start, new LocalTime(), zero);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21924);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21925);try {
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21926);Single.between(new Partial(DateTimeFieldType.dayOfWeek(), 2), new Partial(DateTimeFieldType.dayOfMonth(), 3), zero);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21927);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21928);Partial p = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.hourOfDay()},
                new int[] {1, 2});
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21929);try {
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21930);Single.between(p, p, zero);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21931);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    public void testFactory_standardPeriodIn_RPeriod() {__CLR4_4_1gvpgvplc8azu2u.R.globalSliceStart(getClass().getName(),21932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dmo2clgx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvpgvplc8azu2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvpgvplc8azu2u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testFactory_standardPeriodIn_RPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dmo2clgx8(){try{__CLR4_4_1gvpgvplc8azu2u.R.inc(21932);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21933);assertEquals(0, Single.standardPeriodIn((ReadablePeriod) null, DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21934);assertEquals(0, Single.standardPeriodIn(Period.ZERO, DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21935);assertEquals(1, Single.standardPeriodIn(new Period(0, 0, 0, 1, 0, 0, 0, 0), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21936);assertEquals(123, Single.standardPeriodIn(Period.days(123), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21937);assertEquals(-987, Single.standardPeriodIn(Period.days(-987), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21938);assertEquals(1, Single.standardPeriodIn(Period.hours(47), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21939);assertEquals(2, Single.standardPeriodIn(Period.hours(48), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21940);assertEquals(2, Single.standardPeriodIn(Period.hours(49), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21941);assertEquals(14, Single.standardPeriodIn(Period.weeks(2), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21942);try {
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21943);Single.standardPeriodIn(Period.months(1), DateTimeConstants.MILLIS_PER_DAY);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21944);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testValueIndexMethods() {__CLR4_4_1gvpgvplc8azu2u.R.globalSliceStart(getClass().getName(),21945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4dda2gxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvpgvplc8azu2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvpgvplc8azu2u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testValueIndexMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4dda2gxl(){try{__CLR4_4_1gvpgvplc8azu2u.R.inc(21945);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21946);Single test = new Single(20);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21947);assertEquals(1, test.size());
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21948);assertEquals(20, test.getValue(0));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21949);try {
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21950);test.getValue(1);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21951);fail();
        } catch (IndexOutOfBoundsException ex) {
            // expected
        }
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    public void testFieldTypeIndexMethods() {__CLR4_4_1gvpgvplc8azu2u.R.globalSliceStart(getClass().getName(),21952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xc4i9jgxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvpgvplc8azu2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvpgvplc8azu2u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testFieldTypeIndexMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xc4i9jgxs(){try{__CLR4_4_1gvpgvplc8azu2u.R.inc(21952);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21953);Single test = new Single(20);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21954);assertEquals(1, test.size());
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21955);assertEquals(DurationFieldType.days(), test.getFieldType(0));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21956);try {
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21957);test.getFieldType(1);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(21958);fail();
        } catch (IndexOutOfBoundsException ex) {
            // expected
        }
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    public void testIsSupported() {__CLR4_4_1gvpgvplc8azu2u.R.globalSliceStart(getClass().getName(),21959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24ngxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvpgvplc8azu2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvpgvplc8azu2u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24ngxz(){try{__CLR4_4_1gvpgvplc8azu2u.R.inc(21959);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21960);Single test = new Single(20);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21961);assertEquals(false, test.isSupported(DurationFieldType.years()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21962);assertEquals(false, test.isSupported(DurationFieldType.months()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21963);assertEquals(false, test.isSupported(DurationFieldType.weeks()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21964);assertEquals(true, test.isSupported(DurationFieldType.days()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21965);assertEquals(false, test.isSupported(DurationFieldType.hours()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21966);assertEquals(false, test.isSupported(DurationFieldType.minutes()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21967);assertEquals(false, test.isSupported(DurationFieldType.seconds()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21968);assertEquals(false, test.isSupported(DurationFieldType.millis()));
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}        

    public void testGet() {__CLR4_4_1gvpgvplc8azu2u.R.globalSliceStart(getClass().getName(),21969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3vgy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvpgvplc8azu2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvpgvplc8azu2u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3vgy9(){try{__CLR4_4_1gvpgvplc8azu2u.R.inc(21969);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21970);Single test = new Single(20);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21971);assertEquals(0, test.get(DurationFieldType.years()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21972);assertEquals(0, test.get(DurationFieldType.months()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21973);assertEquals(0, test.get(DurationFieldType.weeks()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21974);assertEquals(20, test.get(DurationFieldType.days()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21975);assertEquals(0, test.get(DurationFieldType.hours()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21976);assertEquals(0, test.get(DurationFieldType.minutes()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21977);assertEquals(0, test.get(DurationFieldType.seconds()));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21978);assertEquals(0, test.get(DurationFieldType.millis()));
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEqualsHashCode() {__CLR4_4_1gvpgvplc8azu2u.R.globalSliceStart(getClass().getName(),21979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77gyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvpgvplc8azu2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvpgvplc8azu2u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77gyj(){try{__CLR4_4_1gvpgvplc8azu2u.R.inc(21979);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21980);Single testA = new Single(20);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21981);Single testB = new Single(20);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21982);assertEquals(true, testA.equals(testB));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21983);assertEquals(true, testB.equals(testA));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21984);assertEquals(true, testA.equals(testA));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21985);assertEquals(true, testB.equals(testB));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21986);assertEquals(true, testA.hashCode() == testB.hashCode());
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21987);assertEquals(true, testA.hashCode() == testA.hashCode());
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21988);assertEquals(true, testB.hashCode() == testB.hashCode());
        
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21989);Single testC = new Single(30);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21990);assertEquals(false, testA.equals(testC));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21991);assertEquals(false, testB.equals(testC));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21992);assertEquals(false, testC.equals(testA));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21993);assertEquals(false, testC.equals(testB));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21994);assertEquals(false, testA.hashCode() == testC.hashCode());
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21995);assertEquals(false, testB.hashCode() == testC.hashCode());
        
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21996);assertEquals(true, testA.equals(Days.days(20)));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21997);assertEquals(true, testA.equals(new Period(0, 0, 0, 20, 0, 0, 0, 0, PeriodType.days())));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21998);assertEquals(false, testA.equals(Period.days(2)));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(21999);assertEquals(false, testA.equals("Hello"));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22000);assertEquals(false, testA.equals(Hours.hours(2)));
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22001);assertEquals(false, testA.equals(null));
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    public void testCompareTo() {__CLR4_4_1gvpgvplc8azu2u.R.globalSliceStart(getClass().getName(),22002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvgz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvpgvplc8azu2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvpgvplc8azu2u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvgz6(){try{__CLR4_4_1gvpgvplc8azu2u.R.inc(22002);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22003);Single test1 = new Single(21);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22004);Single test2 = new Single(22);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22005);Single test3 = new Single(23);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22006);assertEquals(true, test1.compareTo(test1) == 0);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22007);assertEquals(true, test1.compareTo(test2) < 0);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22008);assertEquals(true, test1.compareTo(test3) < 0);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22009);assertEquals(true, test2.compareTo(test1) > 0);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22010);assertEquals(true, test2.compareTo(test2) == 0);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22011);assertEquals(true, test2.compareTo(test3) < 0);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22012);assertEquals(true, test3.compareTo(test1) > 0);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22013);assertEquals(true, test3.compareTo(test2) > 0);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22014);assertEquals(true, test3.compareTo(test3) == 0);
        
//        try {
//            test1.compareTo("Hello");
//            fail();
//        } catch (ClassCastException ex) {
//            // expected
//        }
//        try {
//            test1.compareTo(new Period(0, 0, 0, 21, 0, 0, 0, 0, PeriodType.days()));
//            fail();
//        } catch (ClassCastException ex) {
//            // expected
//        }
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22015);try {
            __CLR4_4_1gvpgvplc8azu2u.R.inc(22016);test1.compareTo(null);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(22017);fail();
        } catch (NullPointerException ex) {
            // expected
        }
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriod() {__CLR4_4_1gvpgvplc8azu2u.R.globalSliceStart(getClass().getName(),22018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvhk17gzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvpgvplc8azu2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvpgvplc8azu2u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testToPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvhk17gzm(){try{__CLR4_4_1gvpgvplc8azu2u.R.inc(22018);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22019);Single test = new Single(20);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22020);Period expected = Period.days(20);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22021);assertEquals(expected, test.toPeriod());
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    public void testToMutablePeriod() {__CLR4_4_1gvpgvplc8azu2u.R.globalSliceStart(getClass().getName(),22022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13v2j33gzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvpgvplc8azu2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvpgvplc8azu2u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testToMutablePeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13v2j33gzq(){try{__CLR4_4_1gvpgvplc8azu2u.R.inc(22022);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22023);Single test = new Single(20);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22024);MutablePeriod expected = new MutablePeriod(0, 0, 0, 20, 0, 0, 0, 0);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22025);assertEquals(expected, test.toMutablePeriod());
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

//    public void testToDurationFrom() {
//        Period test = new Period(123L);
//        assertEquals(new Duration(123L), test.toDurationFrom(new Instant(0L)));
//    }
//
//    public void testToDurationTo() {
//        Period test = new Period(123L);
//        assertEquals(new Duration(123L), test.toDurationTo(new Instant(123L)));
//    }
//

    //-----------------------------------------------------------------------
    public void testGetSetValue() {__CLR4_4_1gvpgvplc8azu2u.R.globalSliceStart(getClass().getName(),22026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1op2p3ugzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gvpgvplc8azu2u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gvpgvplc8azu2u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testGetSetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1op2p3ugzu(){try{__CLR4_4_1gvpgvplc8azu2u.R.inc(22026);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22027);Single test = new Single(20);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22028);assertEquals(20, test.getValue());
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22029);test.setValue(10);
        __CLR4_4_1gvpgvplc8azu2u.R.inc(22030);assertEquals(10, test.getValue());
    }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /** Test class. */
    static class Single extends BaseSingleFieldPeriod {

        public Single(int period) {
            super(period);__CLR4_4_1gvpgvplc8azu2u.R.inc(22032);try{__CLR4_4_1gvpgvplc8azu2u.R.inc(22031);
        }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}
        
        public static int between(ReadableInstant start, ReadableInstant end, DurationFieldType field) {try{__CLR4_4_1gvpgvplc8azu2u.R.inc(22033);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(22034);return BaseSingleFieldPeriod.between(start, end, field);
        }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}
        
        public static int between(ReadablePartial start, ReadablePartial end, ReadablePeriod zeroInstance) {try{__CLR4_4_1gvpgvplc8azu2u.R.inc(22035);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(22036);return BaseSingleFieldPeriod.between(start, end, zeroInstance);
        }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}
        
        public static int standardPeriodIn(ReadablePeriod period, long millisPerUnit) {try{__CLR4_4_1gvpgvplc8azu2u.R.inc(22037);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(22038);return BaseSingleFieldPeriod.standardPeriodIn(period, millisPerUnit);
        }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}
        
        public DurationFieldType getFieldType() {try{__CLR4_4_1gvpgvplc8azu2u.R.inc(22039);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(22040);return DurationFieldType.days();
        }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}

        public PeriodType getPeriodType() {try{__CLR4_4_1gvpgvplc8azu2u.R.inc(22041);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(22042);return PeriodType.days();
        }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}
        
        public int getValue() {try{__CLR4_4_1gvpgvplc8azu2u.R.inc(22043);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(22044);return super.getValue();
        }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}
        
        public void setValue(int value) {try{__CLR4_4_1gvpgvplc8azu2u.R.inc(22045);
            __CLR4_4_1gvpgvplc8azu2u.R.inc(22046);super.setValue(value);
        }finally{__CLR4_4_1gvpgvplc8azu2u.R.flushNeeded();}}
    }

}
