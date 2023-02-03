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
package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;

/**
 * <code>DelegatedDateTimeField</code> delegates each method call to the
 * date time field it wraps.
 * <p>
 * DelegatedDateTimeField is thread-safe and immutable, and its subclasses must
 * be as well.
 *
 * @author Brian S O'Neill
 * @since 1.0
 * @see DecoratedDateTimeField
 */
public class DelegatedDateTimeField extends DateTimeField implements Serializable {public static class __CLR4_4_1ailaillc8azt71{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,13750,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    private static final long serialVersionUID = -4730164440214502503L;

    /** The DateTimeField being wrapped. */
    private final DateTimeField iField;
    /** The range duration. */
    private final DurationField iRangeDurationField;
    /** The override field type. */
    private final DateTimeFieldType iType;

    /**
     * Constructor.
     * 
     * @param field  the field being decorated
     */
    public DelegatedDateTimeField(DateTimeField field) {
        this(field, null);__CLR4_4_1ailaillc8azt71.R.inc(13630);try{__CLR4_4_1ailaillc8azt71.R.inc(13629);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param field  the field being decorated
     * @param type  the field type override
     */
    public DelegatedDateTimeField(DateTimeField field, DateTimeFieldType type) {
        this(field, null, type);__CLR4_4_1ailaillc8azt71.R.inc(13632);try{__CLR4_4_1ailaillc8azt71.R.inc(13631);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param field  the field being decorated
     * @param rangeField  the range field, null to derive
     * @param type  the field type override
     */
    public DelegatedDateTimeField(DateTimeField field, DurationField rangeField, DateTimeFieldType type) {
        super();__CLR4_4_1ailaillc8azt71.R.inc(13634);try{__CLR4_4_1ailaillc8azt71.R.inc(13633);
        __CLR4_4_1ailaillc8azt71.R.inc(13635);if ((((field == null)&&(__CLR4_4_1ailaillc8azt71.R.iget(13636)!=0|true))||(__CLR4_4_1ailaillc8azt71.R.iget(13637)==0&false))) {{
            __CLR4_4_1ailaillc8azt71.R.inc(13638);throw new IllegalArgumentException("The field must not be null");
        }
        }__CLR4_4_1ailaillc8azt71.R.inc(13639);iField = field;
        __CLR4_4_1ailaillc8azt71.R.inc(13640);iRangeDurationField = rangeField;
        __CLR4_4_1ailaillc8azt71.R.inc(13641);iType = ((((type == null )&&(__CLR4_4_1ailaillc8azt71.R.iget(13642)!=0|true))||(__CLR4_4_1ailaillc8azt71.R.iget(13643)==0&false))? field.getType() : type);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    /**
     * Gets the wrapped date time field.
     * 
     * @return the wrapped DateTimeField
     */
    public final DateTimeField getWrappedField() {try{__CLR4_4_1ailaillc8azt71.R.inc(13644);
        __CLR4_4_1ailaillc8azt71.R.inc(13645);return iField;
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public DateTimeFieldType getType() {try{__CLR4_4_1ailaillc8azt71.R.inc(13646);
        __CLR4_4_1ailaillc8azt71.R.inc(13647);return iType;
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_1ailaillc8azt71.R.inc(13648);
        __CLR4_4_1ailaillc8azt71.R.inc(13649);return iType.getName();
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public boolean isSupported() {try{__CLR4_4_1ailaillc8azt71.R.inc(13650);
        __CLR4_4_1ailaillc8azt71.R.inc(13651);return iField.isSupported();
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public boolean isLenient() {try{__CLR4_4_1ailaillc8azt71.R.inc(13652);
        __CLR4_4_1ailaillc8azt71.R.inc(13653);return iField.isLenient();
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int get(long instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13654);
        __CLR4_4_1ailaillc8azt71.R.inc(13655);return iField.get(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public String getAsText(long instant, Locale locale) {try{__CLR4_4_1ailaillc8azt71.R.inc(13656);
        __CLR4_4_1ailaillc8azt71.R.inc(13657);return iField.getAsText(instant, locale);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public String getAsText(long instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13658);
        __CLR4_4_1ailaillc8azt71.R.inc(13659);return iField.getAsText(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public String getAsText(ReadablePartial partial, int fieldValue, Locale locale) {try{__CLR4_4_1ailaillc8azt71.R.inc(13660);
        __CLR4_4_1ailaillc8azt71.R.inc(13661);return iField.getAsText(partial, fieldValue, locale);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public String getAsText(ReadablePartial partial, Locale locale) {try{__CLR4_4_1ailaillc8azt71.R.inc(13662);
        __CLR4_4_1ailaillc8azt71.R.inc(13663);return iField.getAsText(partial, locale);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_1ailaillc8azt71.R.inc(13664);
        __CLR4_4_1ailaillc8azt71.R.inc(13665);return iField.getAsText(fieldValue, locale);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public String getAsShortText(long instant, Locale locale) {try{__CLR4_4_1ailaillc8azt71.R.inc(13666);
        __CLR4_4_1ailaillc8azt71.R.inc(13667);return iField.getAsShortText(instant, locale);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public String getAsShortText(long instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13668);
        __CLR4_4_1ailaillc8azt71.R.inc(13669);return iField.getAsShortText(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public String getAsShortText(ReadablePartial partial, int fieldValue, Locale locale) {try{__CLR4_4_1ailaillc8azt71.R.inc(13670);
        __CLR4_4_1ailaillc8azt71.R.inc(13671);return iField.getAsShortText(partial, fieldValue, locale);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public String getAsShortText(ReadablePartial partial, Locale locale) {try{__CLR4_4_1ailaillc8azt71.R.inc(13672);
        __CLR4_4_1ailaillc8azt71.R.inc(13673);return iField.getAsShortText(partial, locale);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public String getAsShortText(int fieldValue, Locale locale) {try{__CLR4_4_1ailaillc8azt71.R.inc(13674);
        __CLR4_4_1ailaillc8azt71.R.inc(13675);return iField.getAsShortText(fieldValue, locale);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public long add(long instant, int value) {try{__CLR4_4_1ailaillc8azt71.R.inc(13676);
        __CLR4_4_1ailaillc8azt71.R.inc(13677);return iField.add(instant, value);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public long add(long instant, long value) {try{__CLR4_4_1ailaillc8azt71.R.inc(13678);
        __CLR4_4_1ailaillc8azt71.R.inc(13679);return iField.add(instant, value);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int[] add(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1ailaillc8azt71.R.inc(13680);
        __CLR4_4_1ailaillc8azt71.R.inc(13681);return iField.add(instant, fieldIndex, values, valueToAdd);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int[] addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1ailaillc8azt71.R.inc(13682);
        __CLR4_4_1ailaillc8azt71.R.inc(13683);return iField.addWrapPartial(instant, fieldIndex, values, valueToAdd);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public long addWrapField(long instant, int value) {try{__CLR4_4_1ailaillc8azt71.R.inc(13684);
        __CLR4_4_1ailaillc8azt71.R.inc(13685);return iField.addWrapField(instant, value);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1ailaillc8azt71.R.inc(13686);
        __CLR4_4_1ailaillc8azt71.R.inc(13687);return iField.addWrapField(instant, fieldIndex, values, valueToAdd);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13688);
        __CLR4_4_1ailaillc8azt71.R.inc(13689);return iField.getDifference(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13690);
        __CLR4_4_1ailaillc8azt71.R.inc(13691);return iField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public long set(long instant, int value) {try{__CLR4_4_1ailaillc8azt71.R.inc(13692);
        __CLR4_4_1ailaillc8azt71.R.inc(13693);return iField.set(instant, value);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public long set(long instant, String text, Locale locale) {try{__CLR4_4_1ailaillc8azt71.R.inc(13694);
        __CLR4_4_1ailaillc8azt71.R.inc(13695);return iField.set(instant, text, locale);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public long set(long instant, String text) {try{__CLR4_4_1ailaillc8azt71.R.inc(13696);
        __CLR4_4_1ailaillc8azt71.R.inc(13697);return iField.set(instant, text);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int[] set(ReadablePartial instant, int fieldIndex, int[] values, int newValue) {try{__CLR4_4_1ailaillc8azt71.R.inc(13698);
        __CLR4_4_1ailaillc8azt71.R.inc(13699);return iField.set(instant, fieldIndex, values, newValue);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int[] set(ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale) {try{__CLR4_4_1ailaillc8azt71.R.inc(13700);
        __CLR4_4_1ailaillc8azt71.R.inc(13701);return iField.set(instant, fieldIndex, values, text, locale);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public DurationField getDurationField() {try{__CLR4_4_1ailaillc8azt71.R.inc(13702);
        __CLR4_4_1ailaillc8azt71.R.inc(13703);return iField.getDurationField();
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_1ailaillc8azt71.R.inc(13704);
        __CLR4_4_1ailaillc8azt71.R.inc(13705);if ((((iRangeDurationField != null)&&(__CLR4_4_1ailaillc8azt71.R.iget(13706)!=0|true))||(__CLR4_4_1ailaillc8azt71.R.iget(13707)==0&false))) {{
            __CLR4_4_1ailaillc8azt71.R.inc(13708);return iRangeDurationField;
        }
        }__CLR4_4_1ailaillc8azt71.R.inc(13709);return iField.getRangeDurationField();
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public boolean isLeap(long instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13710);
        __CLR4_4_1ailaillc8azt71.R.inc(13711);return iField.isLeap(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int getLeapAmount(long instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13712);
        __CLR4_4_1ailaillc8azt71.R.inc(13713);return iField.getLeapAmount(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public DurationField getLeapDurationField() {try{__CLR4_4_1ailaillc8azt71.R.inc(13714);
        __CLR4_4_1ailaillc8azt71.R.inc(13715);return iField.getLeapDurationField();
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_1ailaillc8azt71.R.inc(13716);
        __CLR4_4_1ailaillc8azt71.R.inc(13717);return iField.getMinimumValue();
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int getMinimumValue(long instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13718);
        __CLR4_4_1ailaillc8azt71.R.inc(13719);return iField.getMinimumValue(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int getMinimumValue(ReadablePartial instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13720);
        __CLR4_4_1ailaillc8azt71.R.inc(13721);return iField.getMinimumValue(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int getMinimumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1ailaillc8azt71.R.inc(13722);
        __CLR4_4_1ailaillc8azt71.R.inc(13723);return iField.getMinimumValue(instant, values);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_1ailaillc8azt71.R.inc(13724);
        __CLR4_4_1ailaillc8azt71.R.inc(13725);return iField.getMaximumValue();
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int getMaximumValue(long instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13726);
        __CLR4_4_1ailaillc8azt71.R.inc(13727);return iField.getMaximumValue(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13728);
        __CLR4_4_1ailaillc8azt71.R.inc(13729);return iField.getMaximumValue(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1ailaillc8azt71.R.inc(13730);
        __CLR4_4_1ailaillc8azt71.R.inc(13731);return iField.getMaximumValue(instant, values);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_1ailaillc8azt71.R.inc(13732);
        __CLR4_4_1ailaillc8azt71.R.inc(13733);return iField.getMaximumTextLength(locale);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1ailaillc8azt71.R.inc(13734);
        __CLR4_4_1ailaillc8azt71.R.inc(13735);return iField.getMaximumShortTextLength(locale);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13736);
        __CLR4_4_1ailaillc8azt71.R.inc(13737);return iField.roundFloor(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public long roundCeiling(long instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13738);
        __CLR4_4_1ailaillc8azt71.R.inc(13739);return iField.roundCeiling(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public long roundHalfFloor(long instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13740);
        __CLR4_4_1ailaillc8azt71.R.inc(13741);return iField.roundHalfFloor(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public long roundHalfCeiling(long instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13742);
        __CLR4_4_1ailaillc8azt71.R.inc(13743);return iField.roundHalfCeiling(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public long roundHalfEven(long instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13744);
        __CLR4_4_1ailaillc8azt71.R.inc(13745);return iField.roundHalfEven(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_1ailaillc8azt71.R.inc(13746);
        __CLR4_4_1ailaillc8azt71.R.inc(13747);return iField.remainder(instant);
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

    public String toString() {try{__CLR4_4_1ailaillc8azt71.R.inc(13748);
        __CLR4_4_1ailaillc8azt71.R.inc(13749);return ("DateTimeField[" + getName() + ']');
    }finally{__CLR4_4_1ailaillc8azt71.R.flushNeeded();}}

}
