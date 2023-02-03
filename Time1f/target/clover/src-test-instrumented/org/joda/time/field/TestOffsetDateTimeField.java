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
package org.joda.time.field;

import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PreciseDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestOffsetDateTimeField extends TestCase {static class __CLR4_4_117dd17ddlc8azx5y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,56537,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56209);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56210);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56211);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56212);return new TestSuite(TestOffsetDateTimeField.class);
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public TestOffsetDateTimeField(String name) {
        super(name);__CLR4_4_117dd17ddlc8azx5y.R.inc(56214);try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56213);
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56215);
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56216);
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_constructor1() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgdulx17dl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_constructor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgdulx17dl(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56217);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56218);OffsetDateTimeField field = new OffsetDateTimeField(
            ISOChronology.getInstance().secondOfMinute(), 3
        );
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56219);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType());
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56220);assertEquals(3, field.getOffset());
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56221);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56222);field = new OffsetDateTimeField(null, 3);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56223);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56224);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56225);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 0);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56226);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56227);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56228);field = new OffsetDateTimeField(UnsupportedDateTimeField.getInstance(
                DateTimeFieldType.secondOfMinute(), UnsupportedDurationField.getInstance(DurationFieldType.seconds())), 0);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56229);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_constructor2() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7dvtg17dy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_constructor2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7dvtg17dy(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56230);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56231);OffsetDateTimeField field = new OffsetDateTimeField(
            ISOChronology.getInstance().secondOfMinute(), DateTimeFieldType.secondOfDay(), 3
        );
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56232);assertEquals(DateTimeFieldType.secondOfDay(), field.getType());
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56233);assertEquals(3, field.getOffset());
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56234);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56235);field = new OffsetDateTimeField(null, DateTimeFieldType.secondOfDay(), 3);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56236);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56237);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56238);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), null, 3);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56239);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56240);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56241);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), DateTimeFieldType.secondOfDay(), 0);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56242);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getType() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di17eb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di17eb(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56243);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56244);OffsetDateTimeField field = new OffsetDateTimeField(
            ISOChronology.getInstance().secondOfMinute(), 3
        );
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56245);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType());
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getName() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k517ee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k517ee(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56246);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56247);OffsetDateTimeField field = new OffsetDateTimeField(
            ISOChronology.getInstance().secondOfMinute(), 3
        );
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56248);assertEquals("secondOfMinute", field.getName());
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_toString() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c017eh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c017eh(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56249);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56250);OffsetDateTimeField field = new OffsetDateTimeField(
            ISOChronology.getInstance().secondOfMinute(), 3
        );
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56251);assertEquals("DateTimeField[secondOfMinute]", field.toString());
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_isSupported() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe17ek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe17ek(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56252);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56253);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56254);assertEquals(true, field.isSupported());
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_isLenient() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ljx0zd17en();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_isLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ljx0zd17en(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56255);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56256);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56257);assertEquals(false, field.isLenient());
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getOffset() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3bual17eq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3bual17eq(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56258);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56259);OffsetDateTimeField field = new OffsetDateTimeField(
            ISOChronology.getInstance().secondOfMinute(), 5
        );
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56260);assertEquals(5, field.getOffset());
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_get() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oeyeo17et();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_get",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oeyeo17et(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56261);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56262);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56263);assertEquals(0 + 3, field.get(0));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56264);assertEquals(6 + 3, field.get(6000));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getAsText_long_Locale() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdirgz17ex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdirgz17ex(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56265);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56266);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56267);assertEquals("32", field.getAsText(1000L * 29, Locale.ENGLISH));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56268);assertEquals("32", field.getAsText(1000L * 29, null));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getAsText_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd3zd217f1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd3zd217f1(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56269);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56270);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56271);assertEquals("32", field.getAsText(1000L * 29));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getAsText_RP_int_Locale() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uuft1h17f4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uuft1h17f4(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56272);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56273);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56274);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56275);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getAsText_RP_Locale() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1ywid17f8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1ywid17f8(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56276);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56277);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56278);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56279);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getAsText_int_Locale() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd8ltk17fc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd8ltk17fc(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56280);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56281);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56282);assertEquals("80", field.getAsText(80, Locale.ENGLISH));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56283);assertEquals("80", field.getAsText(80, null));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getAsShortText_long_Locale() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1loiikt17fg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1loiikt17fg(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56284);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56285);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56286);assertEquals("32", field.getAsShortText(1000L * 29, Locale.ENGLISH));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56287);assertEquals("32", field.getAsShortText(1000L * 29, null));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getAsShortText_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121lqfg17fk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121lqfg17fk(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56288);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56289);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56290);assertEquals("32", field.getAsShortText(1000L * 29));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getAsShortText_RP_int_Locale() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qtetb17fn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qtetb17fn(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56291);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56292);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56293);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56294);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getAsShortText_RP_Locale() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxyb9r17fr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxyb9r17fr(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56295);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56296);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56297);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56298);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getAsShortText_int_Locale() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ntvlq17fv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ntvlq17fv(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56299);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56300);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56301);assertEquals("80", field.getAsShortText(80, Locale.ENGLISH));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56302);assertEquals("80", field.getAsShortText(80, null));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_add_long_int() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu17fz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu17fz(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56303);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56304);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56305);assertEquals(1001, field.add(1L, 1));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_add_long_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl17g2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl17g2(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56306);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56307);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56308);assertEquals(1001, field.add(1L, 1L));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_add_RP_int_intarray_int() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e06spl17g5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e06spl17g5(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56309);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56310);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56311);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56312);OffsetDateTimeField field = new MockStandardDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56313);int[] result = field.add(new TimeOfDay(), 2, values, 0);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56314);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56315);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56316);expected = new int[] {10, 20, 31, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56317);result = field.add(new TimeOfDay(), 2, values, 1);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56318);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56319);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56320);expected = new int[] {10, 20, 62, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56321);result = field.add(new TimeOfDay(), 2, values, 32);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56322);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56323);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56324);expected = new int[] {10, 21, 3, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56325);result = field.add(new TimeOfDay(), 2, values, 33);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56326);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56327);values = new int[] {23, 59, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56328);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56329);field.add(new TimeOfDay(), 2, values, 33);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56330);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56331);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56332);expected = new int[] {10, 20, 29, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56333);result = field.add(new TimeOfDay(), 2, values, -1);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56334);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56335);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56336);expected = new int[] {10, 19, 59, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56337);result = field.add(new TimeOfDay(), 2, values, -31);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56338);assertEquals(true, Arrays.equals(expected, result));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56339);values = new int[] {0, 0, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56340);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56341);field.add(new TimeOfDay(), 2, values, -31);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56342);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_addWrapField_long_int() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdicdy17h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_addWrapField_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdicdy17h3(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56343);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56344);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56345);assertEquals(29 * 1000L, field.addWrapField(1000L * 29, 0));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56346);assertEquals(59 * 1000L, field.addWrapField(1000L * 29, 30));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56347);assertEquals(0L, field.addWrapField(1000L * 29, 31));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_addWrapField_RP_int_intarray_int() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tdx7z17h8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_addWrapField_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tdx7z17h8(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56348);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56349);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56350);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56351);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56352);int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56353);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56354);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56355);expected = new int[] {10, 20, 59, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56356);result = field.addWrapField(new TimeOfDay(), 2, values, 29);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56357);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56358);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56359);expected = new int[] {10, 20, 3, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56360);result = field.addWrapField(new TimeOfDay(), 2, values, 33);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56361);assertEquals(true, Arrays.equals(result, expected));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getDifference_long_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fh4q517hm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getDifference_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fh4q517hm(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56362);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56363);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56364);assertEquals(-21, field.getDifference(20000L, 41000L));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getDifferenceAsLong_long_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m25717hp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m25717hp(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56365);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56366);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56367);assertEquals(-21L, field.getDifferenceAsLong(20000L, 41000L));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_set_long_int() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rinawz17hs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_set_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rinawz17hs(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56368);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56369);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56370);assertEquals(3120L, field.set(2120L, 6));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56371);assertEquals(26120L, field.set(120L, 29));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56372);assertEquals(57120L, field.set(2120L, 60));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_set_RP_int_intarray_int() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17c085k17hx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_set_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17c085k17hx(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56373);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56374);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56375);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56376);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56377);int[] result = field.set(new TimeOfDay(), 2, values, 30);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56378);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56379);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56380);expected = new int[] {10, 20, 29, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56381);result = field.set(new TimeOfDay(), 2, values, 29);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56382);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56383);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56384);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56385);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56386);field.set(new TimeOfDay(), 2, values, 63);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56387);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56388);assertEquals(true, Arrays.equals(values, expected));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56389);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56390);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56391);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56392);field.set(new TimeOfDay(), 2, values, 2);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56393);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56394);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_set_long_String_Locale() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1481lrq17ij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_set_long_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1481lrq17ij(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56395);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56396);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56397);assertEquals(3050L, field.set(50L, "6", null));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56398);assertEquals(26050L, field.set(50L, "29", Locale.ENGLISH));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_set_long_String() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15o1z6917in();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_set_long_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15o1z6917in(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56399);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56400);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56401);assertEquals(3050L, field.set(50L, "6"));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56402);assertEquals(26050L, field.set(50L, "29"));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_set_RP_int_intarray_String_Locale() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j885c117ir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_set_RP_int_intarray_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j885c117ir(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56403);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56404);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56405);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56406);int[] expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56407);int[] result = field.set(new TimeOfDay(), 2, values, "30", null);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56408);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56409);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56410);expected = new int[] {10, 20, 29, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56411);result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56412);assertEquals(true, Arrays.equals(result, expected));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56413);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56414);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56415);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56416);field.set(new TimeOfDay(), 2, values, "63", null);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56417);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56418);assertEquals(true, Arrays.equals(values, expected));
        
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56419);values = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56420);expected = new int[] {10, 20, 30, 40};
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56421);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56422);field.set(new TimeOfDay(), 2, values, "2", null);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56423);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56424);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_convertText() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qj2ptm17jd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_convertText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qj2ptm17jd(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56425);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56426);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56427);assertEquals(0, field.convertText("0", null));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56428);assertEquals(29, field.convertText("29", null));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56429);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56430);field.convertText("2A", null);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56431);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56432);try {
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56433);field.convertText(null, null);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56434);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    public void test_isLeap_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yu5r3x17jn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_isLeap_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yu5r3x17jn(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56435);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56436);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56437);assertEquals(false, field.isLeap(0L));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getLeapAmount_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4dic917jq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getLeapAmount_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4dic917jq(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56438);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56439);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56440);assertEquals(0, field.getLeapAmount(0L));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getLeapDurationField() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1geo417jt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getLeapDurationField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1geo417jt(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56441);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56442);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56443);assertEquals(null, field.getLeapDurationField());
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getMinimumValue() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f1f2p917jw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMinimumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f1f2p917jw(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56444);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56445);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56446);assertEquals(3, field.getMinimumValue());
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getMinimumValue_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16iyk617jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMinimumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16iyk617jz(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56447);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56448);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56449);assertEquals(3, field.getMinimumValue(0L));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getMinimumValue_RP() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tfeiw17k2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMinimumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tfeiw17k2(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56450);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56451);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56452);assertEquals(3, field.getMinimumValue(new TimeOfDay()));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getMinimumValue_RP_intarray() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz5kov17k5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMinimumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz5kov17k5(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56453);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56454);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56455);assertEquals(3, field.getMinimumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getMaximumValue() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzocf17k8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzocf17k8(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56456);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56457);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56458);assertEquals(62, field.getMaximumValue());
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getMaximumValue_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kk6lzc17kb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kk6lzc17kb(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56459);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56460);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56461);assertEquals(62, field.getMaximumValue(0L));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getMaximumValue_RP() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pndze17ke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pndze17ke(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56462);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56463);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56464);assertEquals(62, field.getMaximumValue(new TimeOfDay()));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getMaximumValue_RP_intarray() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19v2tg317kh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19v2tg317kh(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56465);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56466);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56467);assertEquals(62, field.getMaximumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_getMaximumTextLength_Locale() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th5m1617kk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th5m1617kk(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56468);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56469);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56470);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_getMaximumShortTextLength_Locale() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyw4ns17kn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumShortTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyw4ns17kn(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56471);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56472);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56473);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    //------------------------------------------------------------------------
    public void test_roundFloor_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rvn2v17kq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rvn2v17kq(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56474);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56475);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56476);assertEquals(-2000L, field.roundFloor(-1001L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56477);assertEquals(-1000L, field.roundFloor(-1000L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56478);assertEquals(-1000L, field.roundFloor(-999L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56479);assertEquals(-1000L, field.roundFloor(-1L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56480);assertEquals(0L, field.roundFloor(0L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56481);assertEquals(0L, field.roundFloor(1L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56482);assertEquals(0L, field.roundFloor(499L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56483);assertEquals(0L, field.roundFloor(500L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56484);assertEquals(0L, field.roundFloor(501L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56485);assertEquals(1000L, field.roundFloor(1000L));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_roundCeiling_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t61ifu17l2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t61ifu17l2(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56486);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56487);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56488);assertEquals(-1000L, field.roundCeiling(-1001L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56489);assertEquals(-1000L, field.roundCeiling(-1000L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56490);assertEquals(0L, field.roundCeiling(-999L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56491);assertEquals(0L, field.roundCeiling(-1L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56492);assertEquals(0L, field.roundCeiling(0L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56493);assertEquals(1000L, field.roundCeiling(1L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56494);assertEquals(1000L, field.roundCeiling(499L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56495);assertEquals(1000L, field.roundCeiling(500L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56496);assertEquals(1000L, field.roundCeiling(501L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56497);assertEquals(1000L, field.roundCeiling(1000L));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_roundHalfFloor_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3wvqu17le();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3wvqu17le(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56498);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56499);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56500);assertEquals(0L, field.roundHalfFloor(0L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56501);assertEquals(0L, field.roundHalfFloor(499L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56502);assertEquals(0L, field.roundHalfFloor(500L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56503);assertEquals(1000L, field.roundHalfFloor(501L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56504);assertEquals(1000L, field.roundHalfFloor(1000L));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_roundHalfCeiling_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182e0k917ll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182e0k917ll(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56505);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56506);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56507);assertEquals(0L, field.roundHalfCeiling(0L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56508);assertEquals(0L, field.roundHalfCeiling(499L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56509);assertEquals(1000L, field.roundHalfCeiling(500L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56510);assertEquals(1000L, field.roundHalfCeiling(501L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56511);assertEquals(1000L, field.roundHalfCeiling(1000L));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_roundHalfEven_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hd20a417ls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfEven_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hd20a417ls(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56512);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56513);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56514);assertEquals(0L, field.roundHalfEven(0L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56515);assertEquals(0L, field.roundHalfEven(499L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56516);assertEquals(0L, field.roundHalfEven(500L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56517);assertEquals(1000L, field.roundHalfEven(501L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56518);assertEquals(1000L, field.roundHalfEven(1000L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56519);assertEquals(1000L, field.roundHalfEven(1499L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56520);assertEquals(2000L, field.roundHalfEven(1500L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56521);assertEquals(2000L, field.roundHalfEven(1501L));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    public void test_remainder_long() {__CLR4_4_117dd17ddlc8azx5y.R.globalSliceStart(getClass().getName(),56522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6jwja17m2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_117dd17ddlc8azx5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_117dd17ddlc8azx5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_remainder_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6jwja17m2(){try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56522);
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56523);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56524);assertEquals(0L, field.remainder(0L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56525);assertEquals(499L, field.remainder(499L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56526);assertEquals(500L, field.remainder(500L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56527);assertEquals(501L, field.remainder(501L));
        __CLR4_4_117dd17ddlc8azx5y.R.inc(56528);assertEquals(0L, field.remainder(1000L));
    }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static class MockOffsetDateTimeField extends OffsetDateTimeField {
        protected MockOffsetDateTimeField() {
            super(ISOChronology.getInstance().secondOfMinute(), 3);__CLR4_4_117dd17ddlc8azx5y.R.inc(56530);try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56529);
        }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockOffsetDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_117dd17ddlc8azx5y.R.inc(56532);try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56531);
        }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56533);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56534);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_117dd17ddlc8azx5y.R.inc(56535);
            __CLR4_4_117dd17ddlc8azx5y.R.inc(56536);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_117dd17ddlc8azx5y.R.flushNeeded();}}
    }

}
