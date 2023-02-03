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

import java.io.Serializable;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.Interval;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

/**
 * AbstractReadableInstantFieldProperty is a base class for binding a
 * ReadableInstant to a DateTimeField.
 * <p>
 * It allows the date and time manipulation code to be field based yet
 * still easy to use.
 * <p>
 * AbstractReadableInstantFieldProperty itself is thread-safe and immutable,
 * but the ReadableInstant being operated on may be mutable and not
 * thread-safe.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @author Mike Schrag
 * @since 1.0
 */
public abstract class AbstractReadableInstantFieldProperty implements Serializable {public static class __CLR4_4_1a51a51lc8azt5h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,13250,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version. */
    private static final long serialVersionUID = 1971226328211649661L;

    /**
     * Constructor.
     */
    public AbstractReadableInstantFieldProperty() {
        super();__CLR4_4_1a51a51lc8azt5h.R.inc(13142);try{__CLR4_4_1a51a51lc8azt5h.R.inc(13141);
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the field being used.
     * 
     * @return the field
     */
    public abstract DateTimeField getField();

    /**
     * Gets the field type being used.
     * 
     * @return the field type
     */
    public DateTimeFieldType getFieldType() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13143);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13144);return getField().getType();
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets the name of the field.
     * 
     * @return the field name
     */
    public String getName() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13145);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13146);return getField().getName();
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets the milliseconds of the datetime that this property is linked to.
     * 
     * @return the milliseconds
     */
    protected abstract long getMillis();

    /**
     * Gets the chronology of the datetime that this property is linked to.
     * <p>
     * This implementation throws UnsupportedOperationException, and must be
     * implemented by subclasses to enable the equals() and hashCode() methods.
     * 
     * @return the chronology
     * @since 1.4
     */
    protected Chronology getChronology() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13147);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13148);throw new UnsupportedOperationException(
                "The method getChronology() was added in v1.4 and needs " +
                "to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value of this property from the instant.
     * <p>
     * For example, the following two lines of code are equivalent:
     * <pre>
     * datetime.getDayOfMonth();
     * datetime.dayOfMonth().get();
     * </pre>
     * 
     * @return the current value
     * @see DateTimeField#get
     */
    public int get() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13149);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13150);return getField().get(getMillis());
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets the value of this property from the instant as a string.
     * <p>
     * This method returns the value converted to a <code>String</code>
     * using <code>Integer.toString</code>. This method does NOT return
     * textual descriptions such as 'Monday' or 'January'.
     * See {@link #getAsText()} and {@link #getAsShortText()} for those.
     * 
     * @return the current value
     * @see DateTimeField#get
     * @since 1.1
     */
    public String getAsString() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13151);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13152);return Integer.toString(get());
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets the textual value of this property from the instant as a
     * string in the default locale.
     * <p>
     * This method returns the value converted to a <code>String</code>
     * returning the appropriate textual description wherever possible.
     * Thus, a day of week of 1 would return 'Monday' in English.
     * 
     * @return the current text value
     * @see DateTimeField#getAsText
     */
    public String getAsText() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13153);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13154);return getAsText(null);
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets the textual value of this property from the instant as a
     * string in the specified locale.
     * <p>
     * This method returns the value converted to a <code>String</code>
     * returning the appropriate textual description wherever possible.
     * Thus, a day of week of 1 would return 'Monday' in English.
     * 
     * @param locale  locale to use for selecting a text symbol, null means default
     * @return the current text value
     * @see DateTimeField#getAsText
     */
    public String getAsText(Locale locale) {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13155);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13156);return getField().getAsText(getMillis(), locale);
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets the short textual value of this property from the instant as a
     * string in the default locale.
     * <p>
     * This method returns the value converted to a <code>String</code>
     * returning the appropriate textual description wherever possible.
     * Thus, a day of week of 1 would return 'Mon' in English.
     * 
     * @return the current text value
     * @see DateTimeField#getAsShortText
     */
    public String getAsShortText() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13157);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13158);return getAsShortText(null);
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets the short textual value of this property from the instant as a
     * string in the specified locale.
     * <p>
     * This method returns the value converted to a <code>String</code>
     * returning the appropriate textual description wherever possible.
     * Thus, a day of week of 1 would return 'Mon' in English.
     * 
     * @param locale  locale to use for selecting a text symbol, null means default
     * @return the current text value
     * @see DateTimeField#getAsShortText
     */
    public String getAsShortText(Locale locale) {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13159);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13160);return getField().getAsShortText(getMillis(), locale);
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the difference between this field property instant and the one
     * passed in, in the units of this field. The sign of the difference
     * matches that of compareTo. In other words, this field property's instant
     * is the minuend.
     *
     * @param instant  the subtrahend, null means now
     * @return the difference in the units of this field
     * @see DateTimeField#getDifference
     */
    public int getDifference(ReadableInstant instant) {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13161);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13162);if ((((instant == null)&&(__CLR4_4_1a51a51lc8azt5h.R.iget(13163)!=0|true))||(__CLR4_4_1a51a51lc8azt5h.R.iget(13164)==0&false))) {{
            __CLR4_4_1a51a51lc8azt5h.R.inc(13165);return getField().getDifference(getMillis(), DateTimeUtils.currentTimeMillis());
        }
        }__CLR4_4_1a51a51lc8azt5h.R.inc(13166);return getField().getDifference(getMillis(), instant.getMillis());
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Returns the difference between this field property instant and the one
     * passed in, in the units of this field. The sign of the difference
     * matches that of compareTo. In other words, this field property's instant
     * is the minuend.
     *
     * @param instant  the subtrahend, null means now
     * @return the difference in the units of this field
     * @see DateTimeField#getDifference
     */
    public long getDifferenceAsLong(ReadableInstant instant) {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13167);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13168);if ((((instant == null)&&(__CLR4_4_1a51a51lc8azt5h.R.iget(13169)!=0|true))||(__CLR4_4_1a51a51lc8azt5h.R.iget(13170)==0&false))) {{
            __CLR4_4_1a51a51lc8azt5h.R.inc(13171);return getField().getDifferenceAsLong(getMillis(), DateTimeUtils.currentTimeMillis());
        }
        }__CLR4_4_1a51a51lc8azt5h.R.inc(13172);return getField().getDifferenceAsLong(getMillis(), instant.getMillis());
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the duration per unit value of this field. For example, if this
     * field represents "hour of day", then the duration is an hour.
     *
     * @return the duration of this field, or UnsupportedDurationField
     */
    public DurationField getDurationField() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13173);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13174);return getField().getDurationField();
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Returns the range duration of this field. For example, if this field
     * represents "hour of day", then the range duration is a day.
     *
     * @return the range duration of this field, or null if field has no range
     */
    public DurationField getRangeDurationField() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13175);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13176);return getField().getRangeDurationField();
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets whether this field is leap.
     * 
     * @return true if a leap field
     * @see DateTimeField#isLeap
     */
    public boolean isLeap() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13177);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13178);return getField().isLeap(getMillis());
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets the amount by which this field is leap.
     * 
     * @return the amount by which the field is leap
     * @see DateTimeField#getLeapAmount
     */
    public int getLeapAmount() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13179);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13180);return getField().getLeapAmount(getMillis());
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * If this field were to leap, then it would be in units described by the
     * returned duration. If this field doesn't ever leap, null is returned.
     */
    public DurationField getLeapDurationField() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13181);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13182);return getField().getLeapDurationField();
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the minimum value for the field ignoring the current time.
     * 
     * @return the minimum value
     * @see DateTimeField#getMinimumValue
     */
    public int getMinimumValueOverall() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13183);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13184);return getField().getMinimumValue();
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets the minimum value for the field.
     * 
     * @return the minimum value
     * @see DateTimeField#getMinimumValue
     */
    public int getMinimumValue() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13185);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13186);return getField().getMinimumValue(getMillis());
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets the maximum value for the field ignoring the current time.
     * 
     * @return the maximum value
     * @see DateTimeField#getMaximumValue
     */
    public int getMaximumValueOverall() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13187);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13188);return getField().getMaximumValue();
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets the maximum value for the field.
     * 
     * @return the maximum value
     * @see DateTimeField#getMaximumValue
     */
    public int getMaximumValue() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13189);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13190);return getField().getMaximumValue(getMillis());
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets the maximum text length for the field.
     * 
     * @param locale  optional locale to use for selecting a text symbol
     * @return the maximum length
     * @see DateTimeField#getMaximumTextLength
     */
    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13191);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13192);return getField().getMaximumTextLength(locale);
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Gets the maximum short text length for the field.
     * 
     * @param locale  optional locale to use for selecting a text symbol
     * @return the maximum length
     * @see DateTimeField#getMaximumShortTextLength
     */
    public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13193);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13194);return getField().getMaximumShortTextLength(locale);
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}


    /**
     * Returns the fractional duration milliseconds of this field.
     *
     * @see DateTimeField#remainder
     * @return remainder duration, in milliseconds
     */
    public long remainder() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13195);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13196);return getField().remainder(getMillis());
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Returns the interval that represents the range of the minimum
     * and maximum values of this field.
     * <p>
     * For example, <code>datetime.monthOfYear().toInterval()</code>
     * will return an interval over the whole month.
     *
     * @return the interval of this field
     * @since 1.2
     */
    public Interval toInterval() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13197);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13198);DateTimeField field = getField();
        __CLR4_4_1a51a51lc8azt5h.R.inc(13199);long start = field.roundFloor(getMillis());
        __CLR4_4_1a51a51lc8azt5h.R.inc(13200);long end = field.add(start, 1);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13201);Interval interval = new Interval(start, end);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13202);return interval;
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compare this field to the same field on another instant.
     * <p>
     * The comparison is based on the value of the same field type, irrespective
     * of any difference in chronology. Thus, if this property represents the
     * hourOfDay field, then the hourOfDay field of the other instant will be queried
     * whether in the same chronology or not.
     * 
     * @param instant  the instant to compare to
     * @return negative value if this is less, 0 if equal, or positive value if greater
     * @throws IllegalArgumentException if the instant is null
     */
    public int compareTo(ReadableInstant instant) {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13203);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13204);if ((((instant == null)&&(__CLR4_4_1a51a51lc8azt5h.R.iget(13205)!=0|true))||(__CLR4_4_1a51a51lc8azt5h.R.iget(13206)==0&false))) {{
            __CLR4_4_1a51a51lc8azt5h.R.inc(13207);throw new IllegalArgumentException("The instant must not be null");
        }
        }__CLR4_4_1a51a51lc8azt5h.R.inc(13208);int thisValue = get();
        __CLR4_4_1a51a51lc8azt5h.R.inc(13209);int otherValue = instant.get(getFieldType());
        __CLR4_4_1a51a51lc8azt5h.R.inc(13210);if ((((thisValue < otherValue)&&(__CLR4_4_1a51a51lc8azt5h.R.iget(13211)!=0|true))||(__CLR4_4_1a51a51lc8azt5h.R.iget(13212)==0&false))) {{
            __CLR4_4_1a51a51lc8azt5h.R.inc(13213);return -1;
        } }else {__CLR4_4_1a51a51lc8azt5h.R.inc(13214);if ((((thisValue > otherValue)&&(__CLR4_4_1a51a51lc8azt5h.R.iget(13215)!=0|true))||(__CLR4_4_1a51a51lc8azt5h.R.iget(13216)==0&false))) {{
            __CLR4_4_1a51a51lc8azt5h.R.inc(13217);return 1;
        } }else {{
            __CLR4_4_1a51a51lc8azt5h.R.inc(13218);return 0;
        }
    }}}finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compare this field to the same field on another partial instant.
     * <p>
     * The comparison is based on the value of the same field type, irrespective
     * of any difference in chronology. Thus, if this property represents the
     * hourOfDay field, then the hourOfDay field of the other partial will be queried
     * whether in the same chronology or not.
     * 
     * @param partial  the partial to compare to
     * @return negative value if this is less, 0 if equal, or positive value if greater
     * @throws IllegalArgumentException if the partial is null
     * @throws IllegalArgumentException if the partial doesn't support this field
     */
    public int compareTo(ReadablePartial partial) {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13219);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13220);if ((((partial == null)&&(__CLR4_4_1a51a51lc8azt5h.R.iget(13221)!=0|true))||(__CLR4_4_1a51a51lc8azt5h.R.iget(13222)==0&false))) {{
            __CLR4_4_1a51a51lc8azt5h.R.inc(13223);throw new IllegalArgumentException("The partial must not be null");
        }
        }__CLR4_4_1a51a51lc8azt5h.R.inc(13224);int thisValue = get();
        __CLR4_4_1a51a51lc8azt5h.R.inc(13225);int otherValue = partial.get(getFieldType());
        __CLR4_4_1a51a51lc8azt5h.R.inc(13226);if ((((thisValue < otherValue)&&(__CLR4_4_1a51a51lc8azt5h.R.iget(13227)!=0|true))||(__CLR4_4_1a51a51lc8azt5h.R.iget(13228)==0&false))) {{
            __CLR4_4_1a51a51lc8azt5h.R.inc(13229);return -1;
        } }else {__CLR4_4_1a51a51lc8azt5h.R.inc(13230);if ((((thisValue > otherValue)&&(__CLR4_4_1a51a51lc8azt5h.R.iget(13231)!=0|true))||(__CLR4_4_1a51a51lc8azt5h.R.iget(13232)==0&false))) {{
            __CLR4_4_1a51a51lc8azt5h.R.inc(13233);return 1;
        } }else {{
            __CLR4_4_1a51a51lc8azt5h.R.inc(13234);return 0;
        }
    }}}finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this property to another.
     * 
     * @param object  the object to compare to
     * @return true if equal
     */
    public boolean equals(Object object) {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13235);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13236);if ((((this == object)&&(__CLR4_4_1a51a51lc8azt5h.R.iget(13237)!=0|true))||(__CLR4_4_1a51a51lc8azt5h.R.iget(13238)==0&false))) {{
            __CLR4_4_1a51a51lc8azt5h.R.inc(13239);return true;
        }
        }__CLR4_4_1a51a51lc8azt5h.R.inc(13240);if ((((object instanceof AbstractReadableInstantFieldProperty == false)&&(__CLR4_4_1a51a51lc8azt5h.R.iget(13241)!=0|true))||(__CLR4_4_1a51a51lc8azt5h.R.iget(13242)==0&false))) {{
            __CLR4_4_1a51a51lc8azt5h.R.inc(13243);return false;
        }
        }__CLR4_4_1a51a51lc8azt5h.R.inc(13244);AbstractReadableInstantFieldProperty other = (AbstractReadableInstantFieldProperty) object;
        __CLR4_4_1a51a51lc8azt5h.R.inc(13245);return 
            get() == other.get() &&
            getFieldType().equals(other.getFieldType()) &&
            FieldUtils.equals(getChronology(), other.getChronology());
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    /**
     * Returns a hashcode compatible with the equals method.
     * 
     * @return the hashcode
     */
    public int hashCode() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13246);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13247);return get() * 17 + getFieldType().hashCode() + getChronology().hashCode();
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Output a debugging string.
     * 
     * @return debugging string
     */
    public String toString() {try{__CLR4_4_1a51a51lc8azt5h.R.inc(13248);
        __CLR4_4_1a51a51lc8azt5h.R.inc(13249);return "Property[" + getName() + "]";
    }finally{__CLR4_4_1a51a51lc8azt5h.R.flushNeeded();}}

}
