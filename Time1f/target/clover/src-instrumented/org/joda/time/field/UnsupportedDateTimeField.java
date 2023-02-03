/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;

/**
 * A placeholder implementation to use when a datetime field is not supported.
 * <p>
 * UnsupportedDateTimeField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class UnsupportedDateTimeField extends DateTimeField implements Serializable {public static class __CLR4_4_1b8tb8tlc8aztar{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,14702,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialilzation version */
    private static final long serialVersionUID = -1934618396111902255L;

    /** The cache of unsupported datetime field instances */
    private static HashMap<DateTimeFieldType, UnsupportedDateTimeField> cCache;

    /**
     * Gets an instance of UnsupportedDateTimeField for a specific named field.
     * Names should be of standard format, such as 'monthOfYear' or 'hourOfDay'.
     * The returned instance is cached.
     * 
     * @param type  the type to obtain
     * @return the instance
     * @throws IllegalArgumentException if durationField is null
     */
    public static synchronized UnsupportedDateTimeField getInstance(
            DateTimeFieldType type, DurationField durationField) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14573);

        __CLR4_4_1b8tb8tlc8aztar.R.inc(14574);UnsupportedDateTimeField field;
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14575);if ((((cCache == null)&&(__CLR4_4_1b8tb8tlc8aztar.R.iget(14576)!=0|true))||(__CLR4_4_1b8tb8tlc8aztar.R.iget(14577)==0&false))) {{
            __CLR4_4_1b8tb8tlc8aztar.R.inc(14578);cCache = new HashMap<DateTimeFieldType, UnsupportedDateTimeField>(7);
            __CLR4_4_1b8tb8tlc8aztar.R.inc(14579);field = null;
        } }else {{
            __CLR4_4_1b8tb8tlc8aztar.R.inc(14580);field = cCache.get(type);
            __CLR4_4_1b8tb8tlc8aztar.R.inc(14581);if ((((field != null && field.getDurationField() != durationField)&&(__CLR4_4_1b8tb8tlc8aztar.R.iget(14582)!=0|true))||(__CLR4_4_1b8tb8tlc8aztar.R.iget(14583)==0&false))) {{
                __CLR4_4_1b8tb8tlc8aztar.R.inc(14584);field = null;
            }
        }}
        }__CLR4_4_1b8tb8tlc8aztar.R.inc(14585);if ((((field == null)&&(__CLR4_4_1b8tb8tlc8aztar.R.iget(14586)!=0|true))||(__CLR4_4_1b8tb8tlc8aztar.R.iget(14587)==0&false))) {{
            __CLR4_4_1b8tb8tlc8aztar.R.inc(14588);field = new UnsupportedDateTimeField(type, durationField);
            __CLR4_4_1b8tb8tlc8aztar.R.inc(14589);cCache.put(type, field);
        }
        }__CLR4_4_1b8tb8tlc8aztar.R.inc(14590);return field;
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /** The field type */
    private final DateTimeFieldType iType;
    /** The duration of the datetime field */
    private final DurationField iDurationField;

    /**
     * Constructor.
     * 
     * @param type  the field type
     * @param durationField  the duration to use
     */
    private UnsupportedDateTimeField(DateTimeFieldType type, DurationField durationField) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14591);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14592);if ((((type == null || durationField == null)&&(__CLR4_4_1b8tb8tlc8aztar.R.iget(14593)!=0|true))||(__CLR4_4_1b8tb8tlc8aztar.R.iget(14594)==0&false))) {{
            __CLR4_4_1b8tb8tlc8aztar.R.inc(14595);throw new IllegalArgumentException();
        }
        }__CLR4_4_1b8tb8tlc8aztar.R.inc(14596);iType = type;
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14597);iDurationField = durationField;
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // Design note: Simple accessors return a suitable value, but methods
    // intended to perform calculations throw an UnsupportedOperationException.

    public DateTimeFieldType getType() {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14598);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14599);return iType;
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14600);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14601);return iType.getName();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * This field is not supported.
     *
     * @return false always
     */
    public boolean isSupported() {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14602);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14603);return false;
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * This field is not lenient.
     *
     * @return false always
     */
    public boolean isLenient() {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14604);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14605);return false;
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int get(long instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14606);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14607);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsText(long instant, Locale locale) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14608);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14609);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsText(long instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14610);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14611);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsText(ReadablePartial partial, int fieldValue, Locale locale) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14612);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14613);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsText(ReadablePartial partial, Locale locale) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14614);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14615);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14616);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14617);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsShortText(long instant, Locale locale) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14618);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14619);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsShortText(long instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14620);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14621);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsShortText(ReadablePartial partial, int fieldValue, Locale locale) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14622);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14623);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsShortText(ReadablePartial partial, Locale locale) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14624);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14625);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public String getAsShortText(int fieldValue, Locale locale) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14626);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14627);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Delegates to the duration field.
     *
     * @throws UnsupportedOperationException if the duration is unsupported
     */
    public long add(long instant, int value) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14628);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14629);return getDurationField().add(instant, value);
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Delegates to the duration field.
     *
     * @throws UnsupportedOperationException if the duration is unsupported
     */
    public long add(long instant, long value) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14630);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14631);return getDurationField().add(instant, value);
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int[] add(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14632);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14633);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int[] addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14634);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14635);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long addWrapField(long instant, int value) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14636);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14637);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14638);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14639);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Delegates to the duration field.
     *
     * @throws UnsupportedOperationException if the duration is unsupported
     */
    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14640);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14641);return getDurationField().getDifference(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Delegates to the duration field.
     *
     * @throws UnsupportedOperationException if the duration is unsupported
     */
    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14642);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14643);return getDurationField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long set(long instant, int value) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14644);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14645);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int[] set(ReadablePartial instant, int fieldIndex, int[] values, int newValue) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14646);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14647);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long set(long instant, String text, Locale locale) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14648);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14649);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long set(long instant, String text) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14650);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14651);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int[] set(ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14652);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14653);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Even though this DateTimeField is unsupported, the duration field might
     * be supported.
     *
     * @return a possibly supported DurationField
     */
    public DurationField getDurationField() {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14654);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14655);return iDurationField;
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always returns null.
     *
     * @return null always
     */
    public DurationField getRangeDurationField() {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14656);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14657);return null;
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public boolean isLeap(long instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14658);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14659);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getLeapAmount(long instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14660);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14661);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always returns null.
     *
     * @return null always
     */
    public DurationField getLeapDurationField() {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14662);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14663);return null;
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMinimumValue() {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14664);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14665);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMinimumValue(long instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14666);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14667);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMinimumValue(ReadablePartial instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14668);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14669);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMinimumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14670);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14671);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMaximumValue() {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14672);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14673);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMaximumValue(long instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14674);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14675);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMaximumValue(ReadablePartial instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14676);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14677);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMaximumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14678);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14679);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14680);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14681);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14682);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14683);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long roundFloor(long instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14684);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14685);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long roundCeiling(long instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14686);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14687);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long roundHalfFloor(long instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14688);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14689);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long roundHalfCeiling(long instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14690);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14691);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long roundHalfEven(long instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14692);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14693);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long remainder(long instant) {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14694);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14695);throw unsupported();
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    //------------------------------------------------------------------------
    /**
     * Get a suitable debug string.
     * 
     * @return debug string
     */
    public String toString() {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14696);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14697);return "UnsupportedDateTimeField";
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    /**
     * Ensure proper singleton serialization
     */
    private Object readResolve() {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14698);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14699);return getInstance(iType, iDurationField);
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

    private UnsupportedOperationException unsupported() {try{__CLR4_4_1b8tb8tlc8aztar.R.inc(14700);
        __CLR4_4_1b8tb8tlc8aztar.R.inc(14701);return new UnsupportedOperationException(iType + " field is unsupported");
    }finally{__CLR4_4_1b8tb8tlc8aztar.R.flushNeeded();}}

}
