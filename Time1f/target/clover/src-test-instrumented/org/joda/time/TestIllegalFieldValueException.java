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

import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.SkipDateTimeField;

/**
 * Tests IllegalFieldValueException by triggering it from other methods.
 *
 * @author Brian S O'Neill
 */
public class TestIllegalFieldValueException extends TestCase {static class __CLR4_4_1mlcmlclc8azurw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,29513,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1mlcmlclc8azurw.R.inc(29280);
        __CLR4_4_1mlcmlclc8azurw.R.inc(29281);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mlcmlclc8azurw.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mlcmlclc8azurw.R.inc(29282);
        __CLR4_4_1mlcmlclc8azurw.R.inc(29283);return new TestSuite(TestIllegalFieldValueException.class);
    }finally{__CLR4_4_1mlcmlclc8azurw.R.flushNeeded();}}

    public TestIllegalFieldValueException(String name) {
        super(name);__CLR4_4_1mlcmlclc8azurw.R.inc(29285);try{__CLR4_4_1mlcmlclc8azurw.R.inc(29284);
    }finally{__CLR4_4_1mlcmlclc8azurw.R.flushNeeded();}}

    public void testVerifyValueBounds() {__CLR4_4_1mlcmlclc8azurw.R.globalSliceStart(getClass().getName(),29286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlroe6mli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mlcmlclc8azurw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mlcmlclc8azurw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testVerifyValueBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlroe6mli(){try{__CLR4_4_1mlcmlclc8azurw.R.inc(29286);
        __CLR4_4_1mlcmlclc8azurw.R.inc(29287);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29288);FieldUtils.verifyValueBounds(ISOChronology.getInstance().monthOfYear(), -5, 1, 31);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29289);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29290);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29291);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29292);assertEquals("monthOfYear", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29293);assertEquals(new Integer(-5), e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29294);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29295);assertEquals("-5", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29296);assertEquals(new Integer(1), e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29297);assertEquals(new Integer(31), e.getUpperBound());
        }

        __CLR4_4_1mlcmlclc8azurw.R.inc(29298);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29299);FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), 27, 0, 23);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29300);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29301);assertEquals(DateTimeFieldType.hourOfDay(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29302);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29303);assertEquals("hourOfDay", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29304);assertEquals(new Integer(27), e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29305);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29306);assertEquals("27", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29307);assertEquals(new Integer(0), e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29308);assertEquals(new Integer(23), e.getUpperBound());
        }

        __CLR4_4_1mlcmlclc8azurw.R.inc(29309);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29310);FieldUtils.verifyValueBounds("foo", 1, 2, 3);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29311);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29312);assertEquals(null, e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29313);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29314);assertEquals("foo", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29315);assertEquals(new Integer(1), e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29316);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29317);assertEquals("1", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29318);assertEquals(new Integer(2), e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29319);assertEquals(new Integer(3), e.getUpperBound());
        }
    }finally{__CLR4_4_1mlcmlclc8azurw.R.flushNeeded();}}

    public void testSkipDateTimeField() {__CLR4_4_1mlcmlclc8azurw.R.globalSliceStart(getClass().getName(),29320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fbtiphmmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mlcmlclc8azurw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mlcmlclc8azurw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testSkipDateTimeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fbtiphmmg(){try{__CLR4_4_1mlcmlclc8azurw.R.inc(29320);
        __CLR4_4_1mlcmlclc8azurw.R.inc(29321);DateTimeField field = new SkipDateTimeField
            (ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC().year(), 1970);
        __CLR4_4_1mlcmlclc8azurw.R.inc(29322);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29323);field.set(0, 1970);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29324);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29325);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29326);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29327);assertEquals("year", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29328);assertEquals(new Integer(1970), e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29329);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29330);assertEquals("1970", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29331);assertEquals(null, e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29332);assertEquals(null, e.getUpperBound());
        }
    }finally{__CLR4_4_1mlcmlclc8azurw.R.flushNeeded();}}

    public void testSetText() {__CLR4_4_1mlcmlclc8azurw.R.globalSliceStart(getClass().getName(),29333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xz7x5ommt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mlcmlclc8azurw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mlcmlclc8azurw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testSetText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xz7x5ommt(){try{__CLR4_4_1mlcmlclc8azurw.R.inc(29333);
        __CLR4_4_1mlcmlclc8azurw.R.inc(29334);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29335);ISOChronology.getInstanceUTC().year().set(0, null, java.util.Locale.US);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29336);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29337);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29338);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29339);assertEquals("year", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29340);assertEquals(null, e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29341);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29342);assertEquals("null", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29343);assertEquals(null, e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29344);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1mlcmlclc8azurw.R.inc(29345);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29346);ISOChronology.getInstanceUTC().year().set(0, "nineteen seventy", java.util.Locale.US);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29347);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29348);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29349);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29350);assertEquals("year", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29351);assertEquals(null, e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29352);assertEquals("nineteen seventy", e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29353);assertEquals("nineteen seventy", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29354);assertEquals(null, e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29355);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1mlcmlclc8azurw.R.inc(29356);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29357);ISOChronology.getInstanceUTC().era().set(0, "long ago", java.util.Locale.US);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29358);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29359);assertEquals(DateTimeFieldType.era(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29360);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29361);assertEquals("era", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29362);assertEquals(null, e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29363);assertEquals("long ago", e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29364);assertEquals("long ago", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29365);assertEquals(null, e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29366);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1mlcmlclc8azurw.R.inc(29367);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29368);ISOChronology.getInstanceUTC().monthOfYear().set(0, "spring", java.util.Locale.US);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29369);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29370);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29371);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29372);assertEquals("monthOfYear", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29373);assertEquals(null, e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29374);assertEquals("spring", e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29375);assertEquals("spring", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29376);assertEquals(null, e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29377);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1mlcmlclc8azurw.R.inc(29378);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29379);ISOChronology.getInstanceUTC().dayOfWeek().set(0, "yesterday", java.util.Locale.US);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29380);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29381);assertEquals(DateTimeFieldType.dayOfWeek(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29382);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29383);assertEquals("dayOfWeek", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29384);assertEquals(null, e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29385);assertEquals("yesterday", e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29386);assertEquals("yesterday", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29387);assertEquals(null, e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29388);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1mlcmlclc8azurw.R.inc(29389);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29390);ISOChronology.getInstanceUTC().halfdayOfDay().set(0, "morning", java.util.Locale.US);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29391);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29392);assertEquals(DateTimeFieldType.halfdayOfDay(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29393);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29394);assertEquals("halfdayOfDay", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29395);assertEquals(null, e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29396);assertEquals("morning", e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29397);assertEquals("morning", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29398);assertEquals(null, e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29399);assertEquals(null, e.getUpperBound());
        }
    }finally{__CLR4_4_1mlcmlclc8azurw.R.flushNeeded();}}

    public void testZoneTransition() {__CLR4_4_1mlcmlclc8azurw.R.globalSliceStart(getClass().getName(),29400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv6vjumoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mlcmlclc8azurw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mlcmlclc8azurw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testZoneTransition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv6vjumoo(){try{__CLR4_4_1mlcmlclc8azurw.R.inc(29400);
        __CLR4_4_1mlcmlclc8azurw.R.inc(29401);DateTime dt = new DateTime
            (2005, 4, 3, 1, 0, 0, 0, DateTimeZone.forID("America/Los_Angeles"));
        __CLR4_4_1mlcmlclc8azurw.R.inc(29402);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29403);dt.hourOfDay().setCopy(2);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29404);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29405);assertEquals(DateTimeFieldType.hourOfDay(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29406);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29407);assertEquals("hourOfDay", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29408);assertEquals(new Integer(2), e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29409);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29410);assertEquals("2", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29411);assertEquals(null, e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29412);assertEquals(null, e.getUpperBound());
        }
    }finally{__CLR4_4_1mlcmlclc8azurw.R.flushNeeded();}}

    public void testJulianYearZero() {__CLR4_4_1mlcmlclc8azurw.R.globalSliceStart(getClass().getName(),29413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zffcgjmp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mlcmlclc8azurw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mlcmlclc8azurw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testJulianYearZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zffcgjmp1(){try{__CLR4_4_1mlcmlclc8azurw.R.inc(29413);
        __CLR4_4_1mlcmlclc8azurw.R.inc(29414);DateTime dt = new DateTime(JulianChronology.getInstanceUTC());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29415);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29416);dt.year().setCopy(0);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29417);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29418);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29419);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29420);assertEquals("year", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29421);assertEquals(new Integer(0), e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29422);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29423);assertEquals("0", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29424);assertEquals(null, e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29425);assertEquals(null, e.getUpperBound());
        }
    }finally{__CLR4_4_1mlcmlclc8azurw.R.flushNeeded();}}

    public void testGJCutover() {__CLR4_4_1mlcmlclc8azurw.R.globalSliceStart(getClass().getName(),29426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hciwegmpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mlcmlclc8azurw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mlcmlclc8azurw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testGJCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hciwegmpe(){try{__CLR4_4_1mlcmlclc8azurw.R.inc(29426);
        __CLR4_4_1mlcmlclc8azurw.R.inc(29427);DateTime dt = new DateTime("1582-10-04", GJChronology.getInstanceUTC());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29428);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29429);dt.dayOfMonth().setCopy(5);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29430);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29431);assertEquals(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29432);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29433);assertEquals("dayOfMonth", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29434);assertEquals(new Integer(5), e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29435);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29436);assertEquals("5", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29437);assertEquals(null, e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29438);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1mlcmlclc8azurw.R.inc(29439);dt = new DateTime("1582-10-15", GJChronology.getInstanceUTC());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29440);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29441);dt.dayOfMonth().setCopy(14);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29442);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29443);assertEquals(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29444);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29445);assertEquals("dayOfMonth", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29446);assertEquals(new Integer(14), e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29447);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29448);assertEquals("14", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29449);assertEquals(null, e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29450);assertEquals(null, e.getUpperBound());
        }
    }finally{__CLR4_4_1mlcmlclc8azurw.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testReadablePartialValidate() {__CLR4_4_1mlcmlclc8azurw.R.globalSliceStart(getClass().getName(),29451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m8pxnomq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mlcmlclc8azurw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mlcmlclc8azurw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testReadablePartialValidate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m8pxnomq3(){try{__CLR4_4_1mlcmlclc8azurw.R.inc(29451);
        __CLR4_4_1mlcmlclc8azurw.R.inc(29452);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29453);new YearMonthDay(1970, -5, 1);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29454);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29455);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29456);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29457);assertEquals("monthOfYear", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29458);assertEquals(new Integer(-5), e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29459);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29460);assertEquals("-5", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29461);assertEquals(new Integer(1), e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29462);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1mlcmlclc8azurw.R.inc(29463);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29464);new YearMonthDay(1970, 500, 1);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29465);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29466);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29467);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29468);assertEquals("monthOfYear", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29469);assertEquals(new Integer(500), e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29470);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29471);assertEquals("500", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29472);assertEquals(null, e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29473);assertEquals(new Integer(12), e.getUpperBound());
        }

        __CLR4_4_1mlcmlclc8azurw.R.inc(29474);try {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29475);new YearMonthDay(1970, 2, 30);
            __CLR4_4_1mlcmlclc8azurw.R.inc(29476);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1mlcmlclc8azurw.R.inc(29477);assertEquals(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29478);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29479);assertEquals("dayOfMonth", e.getFieldName());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29480);assertEquals(new Integer(30), e.getIllegalNumberValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29481);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29482);assertEquals("30", e.getIllegalValueAsString());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29483);assertEquals(null, e.getLowerBound());
            __CLR4_4_1mlcmlclc8azurw.R.inc(29484);assertEquals(new Integer(28), e.getUpperBound());
        }
    }finally{__CLR4_4_1mlcmlclc8azurw.R.flushNeeded();}}

    // Test extra constructors not currently called by anything
    public void testOtherConstructors() {__CLR4_4_1mlcmlclc8azurw.R.globalSliceStart(getClass().getName(),29485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19s7v1amr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mlcmlclc8azurw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mlcmlclc8azurw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testOtherConstructors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19s7v1amr1(){try{__CLR4_4_1mlcmlclc8azurw.R.inc(29485);
        __CLR4_4_1mlcmlclc8azurw.R.inc(29486);IllegalFieldValueException e = new IllegalFieldValueException
            (DurationFieldType.days(), new Integer(1), new Integer(2), new Integer(3));
        __CLR4_4_1mlcmlclc8azurw.R.inc(29487);assertEquals(null, e.getDateTimeFieldType());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29488);assertEquals(DurationFieldType.days(), e.getDurationFieldType());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29489);assertEquals("days", e.getFieldName());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29490);assertEquals(new Integer(1), e.getIllegalNumberValue());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29491);assertEquals(null, e.getIllegalStringValue());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29492);assertEquals("1", e.getIllegalValueAsString());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29493);assertEquals(new Integer(2), e.getLowerBound());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29494);assertEquals(new Integer(3), e.getUpperBound());

        __CLR4_4_1mlcmlclc8azurw.R.inc(29495);e = new IllegalFieldValueException(DurationFieldType.months(), "five");
        __CLR4_4_1mlcmlclc8azurw.R.inc(29496);assertEquals(null, e.getDateTimeFieldType());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29497);assertEquals(DurationFieldType.months(), e.getDurationFieldType());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29498);assertEquals("months", e.getFieldName());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29499);assertEquals(null, e.getIllegalNumberValue());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29500);assertEquals("five", e.getIllegalStringValue());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29501);assertEquals("five", e.getIllegalValueAsString());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29502);assertEquals(null, e.getLowerBound());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29503);assertEquals(null, e.getUpperBound());

        __CLR4_4_1mlcmlclc8azurw.R.inc(29504);e = new IllegalFieldValueException("months", "five");
        __CLR4_4_1mlcmlclc8azurw.R.inc(29505);assertEquals(null, e.getDateTimeFieldType());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29506);assertEquals(null, e.getDurationFieldType());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29507);assertEquals("months", e.getFieldName());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29508);assertEquals(null, e.getIllegalNumberValue());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29509);assertEquals("five", e.getIllegalStringValue());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29510);assertEquals("five", e.getIllegalValueAsString());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29511);assertEquals(null, e.getLowerBound());
        __CLR4_4_1mlcmlclc8azurw.R.inc(29512);assertEquals(null, e.getUpperBound());
    }finally{__CLR4_4_1mlcmlclc8azurw.R.flushNeeded();}}
}
