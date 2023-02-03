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

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

/**
 * AbstractPartialFieldProperty is a base class for binding a
 * ReadablePartial to a DateTimeField.
 * <p>
 * It allows the date and time manipulation code to be field based yet
 * still easy to use.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public abstract class AbstractPartialFieldProperty {public static class __CLR4_4_1a2qa2qlc8azt55{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,13141,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructor.
     */
    protected AbstractPartialFieldProperty() {
        super();__CLR4_4_1a2qa2qlc8azt55.R.inc(13059);try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13058);
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

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
    public DateTimeFieldType getFieldType() {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13060);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13061);return getField().getType();
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

    /**
     * Gets the name of the field.
     * 
     * @return the field name
     */
    public String getName() {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13062);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13063);return getField().getName();
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

    /**
     * Gets the partial instant being used.
     * 
     * @return the partial instant
     */
    protected abstract ReadablePartial getReadablePartial();

    //-----------------------------------------------------------------------
    /**
     * Gets the value of this property from the instant.
     * <p>
     * For example, the following two lines of code are equivalent:
     * <pre>
     * partial.getDayOfMonth();
     * partial.dayOfMonth().get();
     * </pre>
     * 
     * @return the current value
     */
    public abstract int get();

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
    public String getAsString() {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13064);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13065);return Integer.toString(get());
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

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
    public String getAsText() {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13066);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13067);return getAsText(null);
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

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
    public String getAsText(Locale locale) {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13068);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13069);return getField().getAsText(getReadablePartial(), get(), locale);
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

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
    public String getAsShortText() {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13070);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13071);return getAsShortText(null);
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

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
    public String getAsShortText(Locale locale) {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13072);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13073);return getField().getAsShortText(getReadablePartial(), get(), locale);
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the duration per unit value of this field. For example, if this
     * field represents "hour of day", then the duration is an hour.
     *
     * @return the duration of this field, or UnsupportedDurationField
     */
    public DurationField getDurationField() {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13074);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13075);return getField().getDurationField();
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

    /**
     * Returns the range duration of this field. For example, if this field
     * represents "hour of day", then the range duration is a day.
     *
     * @return the range duration of this field, or null if field has no range
     */
    public DurationField getRangeDurationField() {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13076);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13077);return getField().getRangeDurationField();
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the minimum value for the field ignoring the current time.
     * 
     * @return the minimum value
     * @see DateTimeField#getMinimumValue
     */
    public int getMinimumValueOverall() {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13078);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13079);return getField().getMinimumValue();
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

    /**
     * Gets the minimum value for this field given the current field values.
     * 
     * @return the minimum value
     * @see DateTimeField#getMinimumValue
     */
    public int getMinimumValue() {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13080);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13081);return getField().getMinimumValue(getReadablePartial());
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

    /**
     * Gets the maximum value for the field ignoring the current time.
     * 
     * @return the maximum value
     * @see DateTimeField#getMaximumValue
     */
    public int getMaximumValueOverall() {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13082);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13083);return getField().getMaximumValue();
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

    /**
     * Gets the maximum value for this field given the current field values.
     * 
     * @return the maximum value
     * @see DateTimeField#getMaximumValue
     */
    public int getMaximumValue() {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13084);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13085);return getField().getMaximumValue(getReadablePartial());
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the maximum text length for the field.
     * 
     * @param locale  optional locale to use for selecting a text symbol
     * @return the maximum length
     * @see DateTimeField#getMaximumTextLength
     */
    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13086);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13087);return getField().getMaximumTextLength(locale);
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

    /**
     * Gets the maximum short text length for the field.
     * 
     * @param locale  optional locale to use for selecting a text symbol
     * @return the maximum length
     * @see DateTimeField#getMaximumShortTextLength
     */
    public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13088);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13089);return getField().getMaximumShortTextLength(locale);
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

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
     * @throws IllegalArgumentException if the instant is null or the instant
     *  doesn't support the field of this property
     */
    public int compareTo(ReadableInstant instant) {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13090);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13091);if ((((instant == null)&&(__CLR4_4_1a2qa2qlc8azt55.R.iget(13092)!=0|true))||(__CLR4_4_1a2qa2qlc8azt55.R.iget(13093)==0&false))) {{
            __CLR4_4_1a2qa2qlc8azt55.R.inc(13094);throw new IllegalArgumentException("The instant must not be null");
        }
        }__CLR4_4_1a2qa2qlc8azt55.R.inc(13095);int thisValue = get();
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13096);int otherValue = instant.get(getFieldType());
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13097);if ((((thisValue < otherValue)&&(__CLR4_4_1a2qa2qlc8azt55.R.iget(13098)!=0|true))||(__CLR4_4_1a2qa2qlc8azt55.R.iget(13099)==0&false))) {{
            __CLR4_4_1a2qa2qlc8azt55.R.inc(13100);return -1;
        } }else {__CLR4_4_1a2qa2qlc8azt55.R.inc(13101);if ((((thisValue > otherValue)&&(__CLR4_4_1a2qa2qlc8azt55.R.iget(13102)!=0|true))||(__CLR4_4_1a2qa2qlc8azt55.R.iget(13103)==0&false))) {{
            __CLR4_4_1a2qa2qlc8azt55.R.inc(13104);return 1;
        } }else {{
            __CLR4_4_1a2qa2qlc8azt55.R.inc(13105);return 0;
        }
    }}}finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

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
     * @throws IllegalArgumentException if the instant is null
     * @throws IllegalArgumentException if the field of this property cannot be queried
     *  on the specified instant
     */
    public int compareTo(ReadablePartial partial) {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13106);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13107);if ((((partial == null)&&(__CLR4_4_1a2qa2qlc8azt55.R.iget(13108)!=0|true))||(__CLR4_4_1a2qa2qlc8azt55.R.iget(13109)==0&false))) {{
            __CLR4_4_1a2qa2qlc8azt55.R.inc(13110);throw new IllegalArgumentException("The instant must not be null");
        }
        }__CLR4_4_1a2qa2qlc8azt55.R.inc(13111);int thisValue = get();
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13112);int otherValue = partial.get(getFieldType());
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13113);if ((((thisValue < otherValue)&&(__CLR4_4_1a2qa2qlc8azt55.R.iget(13114)!=0|true))||(__CLR4_4_1a2qa2qlc8azt55.R.iget(13115)==0&false))) {{
            __CLR4_4_1a2qa2qlc8azt55.R.inc(13116);return -1;
        } }else {__CLR4_4_1a2qa2qlc8azt55.R.inc(13117);if ((((thisValue > otherValue)&&(__CLR4_4_1a2qa2qlc8azt55.R.iget(13118)!=0|true))||(__CLR4_4_1a2qa2qlc8azt55.R.iget(13119)==0&false))) {{
            __CLR4_4_1a2qa2qlc8azt55.R.inc(13120);return 1;
        } }else {{
            __CLR4_4_1a2qa2qlc8azt55.R.inc(13121);return 0;
        }
    }}}finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this property to another.
     * 
     * @param object  the object to compare to
     * @return true if equal
     */
    public boolean equals(Object object) {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13122);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13123);if ((((this == object)&&(__CLR4_4_1a2qa2qlc8azt55.R.iget(13124)!=0|true))||(__CLR4_4_1a2qa2qlc8azt55.R.iget(13125)==0&false))) {{
            __CLR4_4_1a2qa2qlc8azt55.R.inc(13126);return true;
        }
        }__CLR4_4_1a2qa2qlc8azt55.R.inc(13127);if ((((object instanceof AbstractPartialFieldProperty == false)&&(__CLR4_4_1a2qa2qlc8azt55.R.iget(13128)!=0|true))||(__CLR4_4_1a2qa2qlc8azt55.R.iget(13129)==0&false))) {{
            __CLR4_4_1a2qa2qlc8azt55.R.inc(13130);return false;
        }
        }__CLR4_4_1a2qa2qlc8azt55.R.inc(13131);AbstractPartialFieldProperty other = (AbstractPartialFieldProperty) object;
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13132);return
            get() == other.get() &&
            getFieldType() == other.getFieldType() &&
            FieldUtils.equals(getReadablePartial().getChronology(), other.getReadablePartial().getChronology());
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets a suitable hashcode for the object.
     * 
     * @return the hashcode
     * @since 1.3
     */
    public int hashCode() {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13133);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13134);int hash = 19;
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13135);hash = 13 * hash + get();
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13136);hash = 13 * hash + getFieldType().hashCode();
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13137);hash = 13 * hash + getReadablePartial().getChronology().hashCode();
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13138);return hash;
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Output a debugging string.
     * 
     * @return debugging string
     */
    public String toString() {try{__CLR4_4_1a2qa2qlc8azt55.R.inc(13139);
        __CLR4_4_1a2qa2qlc8azt55.R.inc(13140);return "Property[" + getName() + "]";
    }finally{__CLR4_4_1a2qa2qlc8azt55.R.flushNeeded();}}

}
