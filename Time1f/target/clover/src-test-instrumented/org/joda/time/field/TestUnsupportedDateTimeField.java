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
package org.joda.time.field;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;

/**
 * This class is a JUnit test to test only the UnsupportedDateTimeField class.
 * This set of test cases exercises everything described in the Javadoc for this
 * class.
 * 
 * @author Jeremy R. Rickard
 */
public class TestUnsupportedDateTimeField extends TestCase {static class __CLR4_4_118gw18gwlc8azx9t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,57863,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DurationFieldType weeks;
    private DurationFieldType months;
    private DateTimeFieldType dateTimeFieldTypeOne;
    private ReadablePartial localTime;

    public static TestSuite suite() {try{__CLR4_4_118gw18gwlc8azx9t.R.inc(57632);
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57633);return new TestSuite(TestUnsupportedDateTimeField.class);
    }finally{__CLR4_4_118gw18gwlc8azx9t.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_118gw18gwlc8azx9t.R.inc(57634);
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57635);weeks = DurationFieldType.weeks();
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57636);months = DurationFieldType.months();
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57637);dateTimeFieldTypeOne = DateTimeFieldType.centuryOfEra();
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57638);localTime = new LocalTime();
    }finally{__CLR4_4_118gw18gwlc8azx9t.R.flushNeeded();}}

    /**
     * Passing null values into UnsupportedDateTimeField.getInstance() should
     * throw an IllegalArguementsException
     */
    public void testNullValuesToGetInstanceThrowsException() {__CLR4_4_118gw18gwlc8azx9t.R.globalSliceStart(getClass().getName(),57639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ax1k4s18h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118gw18gwlc8azx9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_118gw18gwlc8azx9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testNullValuesToGetInstanceThrowsException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ax1k4s18h3(){try{__CLR4_4_118gw18gwlc8azx9t.R.inc(57639);

        __CLR4_4_118gw18gwlc8azx9t.R.inc(57640);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57641);UnsupportedDateTimeField.getInstance(null, null);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57642);assertTrue(false);
        } catch (IllegalArgumentException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57643);assertTrue(true);
        }
    }finally{__CLR4_4_118gw18gwlc8azx9t.R.flushNeeded();}}

    /**
     * 
     * This test exercises the logic in UnsupportedDateTimeField.getInstance. If
     * getInstance() is invoked twice with: - the same DateTimeFieldType -
     * different duration fields
     * 
     * Then the field returned in the first invocation should not be equal to
     * the field returned by the second invocation. In otherwords, the generated
     * instance should be the same for a unique pairing of
     * DateTimeFieldType/DurationField
     */
    public void testDifferentDurationReturnDifferentObjects() {__CLR4_4_118gw18gwlc8azx9t.R.globalSliceStart(getClass().getName(),57644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6ymdp18h8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118gw18gwlc8azx9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_118gw18gwlc8azx9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testDifferentDurationReturnDifferentObjects",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6ymdp18h8(){try{__CLR4_4_118gw18gwlc8azx9t.R.inc(57644);

        /**
         * The fields returned by getInstance should be the same when the
         * duration is the same for both method calls.
         */
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57645);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57646);DateTimeField fieldTwo = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57647);assertSame(fieldOne, fieldTwo);

        /**
         * The fields returned by getInstance should NOT be the same when the
         * duration is the same for both method calls.
         */
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57648);DateTimeField fieldThree = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(months));
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57649);assertNotSame(fieldOne, fieldThree);
    }finally{__CLR4_4_118gw18gwlc8azx9t.R.flushNeeded();}}

    /**
     * The getName() method should return the same value as the getName() method
     * of the DateTimeFieldType that was used to create the instance.
     * 
     */
    public void testPublicGetNameMethod() {__CLR4_4_118gw18gwlc8azx9t.R.globalSliceStart(getClass().getName(),57650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cx2rbi18he();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118gw18gwlc8azx9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_118gw18gwlc8azx9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testPublicGetNameMethod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cx2rbi18he(){try{__CLR4_4_118gw18gwlc8azx9t.R.inc(57650);
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57651);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));

        __CLR4_4_118gw18gwlc8azx9t.R.inc(57652);assertSame(fieldOne.getName(), dateTimeFieldTypeOne.getName());
    }finally{__CLR4_4_118gw18gwlc8azx9t.R.flushNeeded();}}

    /**
     * As this is an unsupported date/time field, some normal methods will
     * always return false, as they are not supported. Verify that each method
     * correctly returns null.
     */
    public void testAlwaysFalseReturnTypes() {__CLR4_4_118gw18gwlc8azx9t.R.globalSliceStart(getClass().getName(),57653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16oc27m18hh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118gw18gwlc8azx9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_118gw18gwlc8azx9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testAlwaysFalseReturnTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16oc27m18hh(){try{__CLR4_4_118gw18gwlc8azx9t.R.inc(57653);
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57654);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57655);assertFalse(fieldOne.isLenient());
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57656);assertFalse(fieldOne.isSupported());
    }finally{__CLR4_4_118gw18gwlc8azx9t.R.flushNeeded();}}

    /**
     * According to the JavaDocs, there are two methods that should always
     * return null. * getRangeDurationField() * getLeapDurationField()
     * 
     * Ensure that these are in fact null.
     */

    public void testMethodsThatShouldAlwaysReturnNull() {__CLR4_4_118gw18gwlc8azx9t.R.globalSliceStart(getClass().getName(),57657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mixg3r18hl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118gw18gwlc8azx9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_118gw18gwlc8azx9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testMethodsThatShouldAlwaysReturnNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mixg3r18hl(){try{__CLR4_4_118gw18gwlc8azx9t.R.inc(57657);
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57658);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));

        __CLR4_4_118gw18gwlc8azx9t.R.inc(57659);assertNull(fieldOne.getLeapDurationField());
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57660);assertNull(fieldOne.getRangeDurationField());
    }finally{__CLR4_4_118gw18gwlc8azx9t.R.flushNeeded();}}

    /**
     * As this is an unsupported date/time field, many normal methods are
     * unsupported and throw an UnsupportedOperationException. Verify that each
     * method correctly throws this exception. * add(ReadablePartial instant,
     * int fieldIndex, int[] values, int valueToAdd) * addWrapField(long
     * instant, int value) * addWrapField(ReadablePartial instant, int
     * fieldIndex, int[] values, int valueToAdd) *
     * addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int
     * valueToAdd) * get(long instant) * getAsShortText(int fieldValue, Locale
     * locale) * getAsShortText(long instant) * getAsShortText(long instant,
     * Locale locale) * getAsShortText(ReadablePartial partial, int fieldValue,
     * Locale locale) * getAsShortText(ReadablePartial partial, Locale locale) *
     * getAsText(int fieldValue, Locale locale) * getAsText(long instant) *
     * getAsText(long instant, Locale locale) * getAsText(ReadablePartial
     * partial, int fieldValue, Locale locale) * getAsText(ReadablePartial
     * partial, Locale locale) * getLeapAmount(long instant) *
     * getMaximumShortTextLength(Locale locale) * getMaximumTextLength(Locale
     * locale) * getMaximumValue() * getMaximumValue(long instant) *
     * getMaximumValue(ReadablePartial instant) *
     * getMaximumValue(ReadablePartial instant, int[] values) *
     * getMinimumValue() * getMinimumValue(long instant) *
     * getMinimumValue(ReadablePartial instant) *
     * getMinimumValue(ReadablePartial instant, int[] values) * isLeap(long
     * instant) * remainder(long instant) * roundCeiling(long instant) *
     * roundFloor(long instant) * roundHalfCeiling(long instant) *
     * roundHalfEven(long instant) * roundHalfFloor(long instant) * set(long
     * instant, int value) * set(long instant, String text) * set(long instant,
     * String text, Locale locale) * set(ReadablePartial instant, int
     * fieldIndex, int[] values, int newValue) * set(ReadablePartial instant,
     * int fieldIndex, int[] values, String text, Locale locale)
     */
    public void testUnsupportedMethods() {__CLR4_4_118gw18gwlc8azx9t.R.globalSliceStart(getClass().getName(),57661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uwfdcm18hp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118gw18gwlc8azx9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_118gw18gwlc8azx9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testUnsupportedMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uwfdcm18hp(){try{__CLR4_4_118gw18gwlc8azx9t.R.inc(57661);
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57662);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));

        // add(ReadablePartial instant, int fieldIndex, int[] values, int
        // valueToAdd)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57663);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57664);fieldOne.add(localTime, 0, new int[] { 0, 100 }, 100);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57665);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57666);assertTrue(true);
        }
        // addWrapField(long instant, int value)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57667);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57668);fieldOne.addWrapField(100000L, 250);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57669);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57670);assertTrue(true);
        }
        // addWrapField(ReadablePartial instant, int fieldIndex, int[] values,
        // int valueToAdd)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57671);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57672);fieldOne.addWrapField(localTime, 0, new int[] { 0, 100 }, 100);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57673);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57674);assertTrue(true);
        }
        // addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values,
        // int valueToAdd)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57675);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57676);fieldOne.addWrapPartial(localTime, 0, new int[] { 0, 100 }, 100);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57677);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57678);assertTrue(true);
        }
        // UnsupportedDateTimeField.get(long instant)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57679);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57680);fieldOne.get(1000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57681);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57682);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsShortText(int fieldValue,
        // Locale locale)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57683);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57684);fieldOne.getAsShortText(0, Locale.getDefault());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57685);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57686);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsShortText(long instant)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57687);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57688);fieldOne.getAsShortText(100000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57689);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57690);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsShortText(long instant, Locale locale)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57691);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57692);fieldOne.getAsShortText(100000L, Locale.getDefault());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57693);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57694);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsShortText(ReadablePartial partial,
        // int fieldValue,
        // Locale locale)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57695);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57696);fieldOne.getAsShortText(localTime, 0, Locale.getDefault());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57697);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57698);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsShortText(ReadablePartial partial,
        // Locale locale)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57699);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57700);fieldOne.getAsShortText(localTime, Locale.getDefault());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57701);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57702);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsText(int fieldValue,
        // Locale locale)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57703);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57704);fieldOne.getAsText(0, Locale.getDefault());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57705);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57706);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsText(long instant)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57707);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57708);fieldOne.getAsText(1000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57709);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57710);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsText(long instant, Locale locale)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57711);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57712);fieldOne.getAsText(1000L, Locale.getDefault());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57713);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57714);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsText(ReadablePartial partial,
        // int fieldValue,
        // Locale locale)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57715);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57716);fieldOne.getAsText(localTime, 0, Locale.getDefault());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57717);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57718);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsText(ReadablePartial partial,
        // Locale locale)
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57719);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57720);fieldOne.getAsText(localTime, Locale.getDefault());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57721);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57722);assertTrue(true);
        }

        // UnsupportedDateTimeField.getLeapAmount(long instant) is unsupported
        // and should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57723);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57724);fieldOne.getLeapAmount(System.currentTimeMillis());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57725);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57726);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMaximumShortTextLength(Locale locale)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57727);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57728);fieldOne.getMaximumShortTextLength(Locale.getDefault());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57729);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57730);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMaximumTextLength(Locale locale)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57731);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57732);fieldOne.getMaximumTextLength(Locale.getDefault());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57733);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57734);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMaximumValue() is unsupported
        // and should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57735);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57736);fieldOne.getMaximumValue();
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57737);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57738);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMaximumValue(long instant)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57739);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57740);fieldOne.getMaximumValue(1000000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57741);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57742);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMaximumValue(ReadablePartial instant)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57743);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57744);fieldOne.getMaximumValue(localTime);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57745);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57746);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMaximumValue(ReadablePartial instant,
        // int[] values)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57747);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57748);fieldOne.getMaximumValue(localTime, new int[] { 0 });
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57749);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57750);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMinumumValue() is unsupported
        // and should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57751);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57752);fieldOne.getMinimumValue();
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57753);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57754);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMinumumValue(long instant) is unsupported
        // and should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57755);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57756);fieldOne.getMinimumValue(10000000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57757);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57758);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMinumumValue(ReadablePartial instant)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57759);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57760);fieldOne.getMinimumValue(localTime);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57761);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57762);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMinumumValue(ReadablePartial instant,
        // int[] values) is unsupported
        // and should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57763);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57764);fieldOne.getMinimumValue(localTime, new int[] { 0 });
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57765);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57766);assertTrue(true);
        }

        // UnsupportedDateTimeField.isLeap(long instant) is unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57767);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57768);fieldOne.isLeap(System.currentTimeMillis());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57769);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57770);assertTrue(true);
        }

        // UnsupportedDateTimeField.remainder(long instant) is unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57771);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57772);fieldOne.remainder(1000000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57773);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57774);assertTrue(true);
        }

        // UnsupportedDateTimeField.roundCeiling(long instant) is unsupported
        // and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57775);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57776);fieldOne.roundCeiling(1000000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57777);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57778);assertTrue(true);
        }

        // UnsupportedDateTimeField.roundFloor(long instant) is unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57779);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57780);fieldOne.roundFloor(1000000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57781);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57782);assertTrue(true);
        }

        // UnsupportedDateTimeField.roundHalfCeiling(long instant) is
        // unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57783);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57784);fieldOne.roundHalfCeiling(1000000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57785);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57786);assertTrue(true);
        }

        // UnsupportedDateTimeField.roundHalfEven(long instant) is unsupported
        // and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57787);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57788);fieldOne.roundHalfEven(1000000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57789);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57790);assertTrue(true);
        }

        // UnsupportedDateTimeField.roundHalfFloor(long instant) is unsupported
        // and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57791);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57792);fieldOne.roundHalfFloor(1000000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57793);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57794);assertTrue(true);
        }

        // UnsupportedDateTimeField.set(long instant, int value) is unsupported
        // and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57795);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57796);fieldOne.set(1000000L, 1000);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57797);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57798);assertTrue(true);
        }

        // UnsupportedDateTimeField.set(long instant, String test) is
        // unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57799);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57800);fieldOne.set(1000000L, "Unsupported Operation");
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57801);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57802);assertTrue(true);
        }

        // UnsupportedDateTimeField.set(long instant, String text, Locale
        // locale)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57803);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57804);fieldOne
                    .set(1000000L, "Unsupported Operation", Locale.getDefault());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57805);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57806);assertTrue(true);
        }

        // UnsupportedDateTimeField.set(ReadablePartial instant,
        // int fieldIndex,
        // int[] values,
        // int newValue) is unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57807);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57808);fieldOne.set(localTime, 0, new int[] { 0 }, 10000);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57809);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57810);assertTrue(true);
        }

        // UnsupportedDateTimeField.set(ReadablePartial instant,
        // int fieldIndex,
        // int[] values,
        // String text,
        // Locale locale) is unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57811);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57812);fieldOne.set(localTime, 0, new int[] { 0 },
                    "Unsupported Operation", Locale.getDefault());
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57813);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57814);assertTrue(true);
        }
    }finally{__CLR4_4_118gw18gwlc8azx9t.R.flushNeeded();}}

    /**
     * As this is an unsupported date/time field, many normal methods are
     * unsupported. Some delegate and can possibly throw an
     * UnsupportedOperationException or have a valid return. Verify that each
     * method correctly throws this exception when appropriate and delegates
     * correctly based on the Duration used to get the instance.
     */
    public void testDelegatedMethods() {__CLR4_4_118gw18gwlc8azx9t.R.globalSliceStart(getClass().getName(),57815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170zhqk18lz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118gw18gwlc8azx9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_118gw18gwlc8azx9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testDelegatedMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170zhqk18lz(){try{__CLR4_4_118gw18gwlc8azx9t.R.inc(57815);
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57816);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57817);PreciseDurationField hoursDuration = new PreciseDurationField(
                DurationFieldType.hours(), 10L);
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57818);DateTimeField fieldTwo = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, hoursDuration);

        // UnsupportedDateTimeField.add(long instant, int value) should
        // throw an UnsupportedOperationException when the duration does
        // not support the operation, otherwise it delegates to the duration.
        // First
        // try it with an UnsupportedDurationField, then a PreciseDurationField.
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57819);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57820);fieldOne.add(System.currentTimeMillis(), 100);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57821);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57822);assertTrue(true);
        }
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57823);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57824);long currentTime = System.currentTimeMillis();
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57825);long firstComputation = hoursDuration.add(currentTime, 100);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57826);long secondComputation = fieldTwo.add(currentTime,
                    100);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57827);assertEquals(firstComputation,secondComputation);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57828);assertTrue(false);
        }

        // UnsupportedDateTimeField.add(long instant, long value) should
        // throw an UnsupportedOperationException when the duration does
        // not support the operation, otherwise it delegates to the duration.
        // First
        // try it with an UnsupportedDurationField, then a PreciseDurationField.
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57829);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57830);fieldOne.add(System.currentTimeMillis(), 1000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57831);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57832);assertTrue(true);
        }

        __CLR4_4_118gw18gwlc8azx9t.R.inc(57833);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57834);long currentTime = System.currentTimeMillis();
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57835);long firstComputation = hoursDuration.add(currentTime, 1000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57836);long secondComputation = fieldTwo.add(currentTime,
                    1000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57837);assertTrue(firstComputation == secondComputation);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57838);assertEquals(firstComputation,secondComputation);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57839);assertTrue(false);
        }

        // UnsupportedDateTimeField.getDifference(long minuendInstant,
        // long subtrahendInstant)
        // should throw an UnsupportedOperationException when the duration does
        // not support the operation, otherwise return the result from the
        // delegated call.
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57840);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57841);fieldOne.getDifference(100000L, 1000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57842);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57843);assertTrue(true);
        }

        __CLR4_4_118gw18gwlc8azx9t.R.inc(57844);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57845);int firstDifference = hoursDuration.getDifference(100000L, 1000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57846);int secondDifference = fieldTwo.getDifference(100000L, 1000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57847);assertEquals(firstDifference,secondDifference);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57848);assertTrue(false);
        }

        // UnsupportedDateTimeField.getDifferenceAsLong(long minuendInstant,
        // long subtrahendInstant)
        // should throw an UnsupportedOperationException when the duration does
        // not support the operation, otherwise return the result from the
        // delegated call.
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57849);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57850);fieldOne.getDifferenceAsLong(100000L, 1000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57851);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57852);assertTrue(true);
        }

        __CLR4_4_118gw18gwlc8azx9t.R.inc(57853);try {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57854);long firstDifference = hoursDuration.getDifference(100000L, 1000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57855);long secondDifference = fieldTwo.getDifference(100000L, 1000L);
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57856);assertEquals(firstDifference,secondDifference);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_118gw18gwlc8azx9t.R.inc(57857);assertTrue(false);
        }
    }finally{__CLR4_4_118gw18gwlc8azx9t.R.flushNeeded();}}

    /**
    * The toString method should return a suitable debug message (not null).
    * Ensure that the toString method returns a string with length greater than
    * 0 (and not null)
    * 
    */
    public void testToString() {__CLR4_4_118gw18gwlc8azx9t.R.globalSliceStart(getClass().getName(),57858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid18n6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118gw18gwlc8azx9t.R.rethrow($CLV_t2$);}finally{__CLR4_4_118gw18gwlc8azx9t.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid18n6(){try{__CLR4_4_118gw18gwlc8azx9t.R.inc(57858);
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57859);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));

        __CLR4_4_118gw18gwlc8azx9t.R.inc(57860);String debugMessage = fieldOne.toString();
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57861);assertNotNull(debugMessage);
        __CLR4_4_118gw18gwlc8azx9t.R.inc(57862);assertTrue(debugMessage.length() > 0);
    }finally{__CLR4_4_118gw18gwlc8azx9t.R.flushNeeded();}}
}
