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

import java.util.Locale;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;

/**
 * BaseDateTimeField provides the common behaviour for DateTimeField
 * implementations. 
 * <p>
 * This class should generally not be used directly by API users. The
 * DateTimeField class should be used when different kinds of DateTimeField
 * objects are to be referenced.
 * <p>
 * BaseDateTimeField is thread-safe and immutable, and its subclasses must
 * be as well.
 *
 * @author Brian S O'Neill
 * @since 1.0
 * @see DecoratedDateTimeField
 */
public abstract class BaseDateTimeField extends DateTimeField {public static class __CLR4_4_1a82a82lc8azt6b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,13532,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The field type. */
    private final DateTimeFieldType iType;

    /**
     * Constructor.
     */
    protected BaseDateTimeField(DateTimeFieldType type) {
        super();__CLR4_4_1a82a82lc8azt6b.R.inc(13251);try{__CLR4_4_1a82a82lc8azt6b.R.inc(13250);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13252);if ((((type == null)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13253)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13254)==0&false))) {{
            __CLR4_4_1a82a82lc8azt6b.R.inc(13255);throw new IllegalArgumentException("The type must not be null");
        }
        }__CLR4_4_1a82a82lc8azt6b.R.inc(13256);iType = type;
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}
    
    public final DateTimeFieldType getType() {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13257);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13258);return iType;
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    public final String getName() {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13259);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13260);return iType.getName();
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * @return true always
     */
    public final boolean isSupported() {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13261);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13262);return true;
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    // Main access API
    //------------------------------------------------------------------------
    /**
     * Get the value of this field from the milliseconds.
     * 
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the value of the field, in the units of the field
     */
    public abstract int get(long instant);

    //-----------------------------------------------------------------------
    /**
     * Get the human-readable, text value of this field from the milliseconds.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation returns getAsText(get(instant), locale).
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to query
     * @param locale the locale to use for selecting a text symbol, null means default
     * @return the text value of the field
     */
    public String getAsText(long instant, Locale locale) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13263);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13264);return getAsText(get(instant), locale);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the human-readable, text value of this field from the milliseconds.
     * <p>
     * The default implementation calls {@link #getAsText(long, Locale)}.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the text value of the field
     */
    public final String getAsText(long instant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13265);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13266);return getAsText(instant, null);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the human-readable, text value of this field from a partial instant.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation returns getAsText(fieldValue, locale).
     *
     * @param partial  the partial instant to query
     * @param fieldValue  the field value of this field, provided for performance
     * @param locale  the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public String getAsText(ReadablePartial partial, int fieldValue, Locale locale) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13267);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13268);return getAsText(fieldValue, locale);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the human-readable, text value of this field from a partial instant.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation calls {@link ReadablePartial#get(DateTimeFieldType)}
     * and {@link #getAsText(ReadablePartial, int, Locale)}.
     *
     * @param partial  the partial instant to query
     * @param locale  the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public final String getAsText(ReadablePartial partial, Locale locale) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13269);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13270);return getAsText(partial, partial.get(getType()), locale);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the human-readable, text value of this field from the field value.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation returns Integer.toString(get(instant)).
     * <p>
     * Note: subclasses that override this method should also override
     * getMaximumTextLength.
     *
     * @param fieldValue  the numeric value to convert to text
     * @param locale the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13271);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13272);return Integer.toString(fieldValue);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the human-readable, short text value of this field from the milliseconds.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation returns getAsShortText(get(instant), locale).
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to query
     * @param locale the locale to use for selecting a text symbol, null means default
     * @return the text value of the field
     */
    public String getAsShortText(long instant, Locale locale) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13273);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13274);return getAsShortText(get(instant), locale);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the human-readable, short text value of this field from the milliseconds.
     * <p>
     * The default implementation calls {@link #getAsShortText(long, Locale)}.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the text value of the field
     */
    public final String getAsShortText(long instant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13275);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13276);return getAsShortText(instant, null);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the human-readable, short text value of this field from a partial instant.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation returns getAsShortText(fieldValue, locale).
     *
     * @param partial  the partial instant to query
     * @param fieldValue  the field value of this field, provided for performance
     * @param locale  the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public String getAsShortText(ReadablePartial partial, int fieldValue, Locale locale) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13277);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13278);return getAsShortText(fieldValue, locale);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the human-readable, short text value of this field from a partial instant.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation calls {@link ReadablePartial#get(DateTimeFieldType)}
     * and {@link #getAsText(ReadablePartial, int, Locale)}.
     *
     * @param partial  the partial instant to query
     * @param locale  the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public final String getAsShortText(ReadablePartial partial, Locale locale) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13279);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13280);return getAsShortText(partial, partial.get(getType()), locale);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the human-readable, short text value of this field from the field value.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation returns getAsText(fieldValue, locale).
     * <p>
     * Note: subclasses that override this method should also override
     * getMaximumShortTextLength.
     *
     * @param fieldValue  the numeric value to convert to text
     * @param locale the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public String getAsShortText(int fieldValue, Locale locale) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13281);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13282);return getAsText(fieldValue, locale);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a value (which may be negative) to the instant value,
     * overflowing into larger fields if necessary.
     * <p>
     * The value will be added to this field. If the value is too large to be
     * added solely to this field, larger fields will increase as required.
     * Smaller fields should be unaffected, except where the result would be
     * an invalid value for a smaller field. In this case the smaller field is
     * adjusted to be in range.
     * <p>
     * For example, in the ISO chronology:<br>
     * 2000-08-20 add six months is 2001-02-20<br>
     * 2000-08-20 add twenty months is 2002-04-20<br>
     * 2000-08-20 add minus nine months is 1999-11-20<br>
     * 2001-01-31 add one month  is 2001-02-28<br>
     * 2001-01-31 add two months is 2001-03-31<br>
     * 
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to add to
     * @param value  the value to add, in the units of the field
     * @return the updated milliseconds
     */
    public long add(long instant, int value) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13283);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13284);return getDurationField().add(instant, value);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Adds a value (which may be negative) to the instant value,
     * overflowing into larger fields if necessary.
     * 
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to add to
     * @param value  the long value to add, in the units of the field
     * @return the updated milliseconds
     * @throws IllegalArgumentException if value is too large
     * @see #add(long,int)
     */
    public long add(long instant, long value) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13285);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13286);return getDurationField().add(instant, value);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Adds a value (which may be negative) to the partial instant,
     * throwing an exception if the maximum size of the instant is reached.
     * <p>
     * The value will be added to this field, overflowing into larger fields
     * if necessary. Smaller fields should be unaffected, except where the
     * result would be an invalid value for a smaller field. In this case the
     * smaller field is adjusted to be in range.
     * <p>
     * Partial instants only contain some fields. This may result in a maximum
     * possible value, such as TimeOfDay being limited to 23:59:59:999. If this
     * limit is breached by the add an exception is thrown.
     * <p>
     * For example, in the ISO chronology:<br>
     * 2000-08-20 add six months is 2000-02-20<br>
     * 2000-08-20 add twenty months is 2000-04-20<br>
     * 2000-08-20 add minus nine months is 2000-11-20<br>
     * 2001-01-31 add one month  is 2001-02-28<br>
     * 2001-01-31 add two months is 2001-03-31<br>
     * 
     * @param instant  the partial instant
     * @param fieldIndex  the index of this field in the partial
     * @param values  the values of the partial instant which should be updated
     * @param valueToAdd  the value to add, in the units of the field
     * @return the passed in values
     * @throws IllegalArgumentException if the value is invalid or the maximum instant is reached
     */
    public int[] add(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13287);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13288);if ((((valueToAdd == 0)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13289)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13290)==0&false))) {{
            __CLR4_4_1a82a82lc8azt6b.R.inc(13291);return values;
        }
        // there are more efficient algorithms than this (especially for time only fields)
        // trouble is when dealing with days and months, so we use this technique of
        // adding/removing one from the larger field at a time
        }__CLR4_4_1a82a82lc8azt6b.R.inc(13292);DateTimeField nextField = null;
        
        __CLR4_4_1a82a82lc8azt6b.R.inc(13293);while ((((valueToAdd > 0)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13294)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13295)==0&false))) {{
            __CLR4_4_1a82a82lc8azt6b.R.inc(13296);int max = getMaximumValue(instant, values);
            __CLR4_4_1a82a82lc8azt6b.R.inc(13297);long proposed = values[fieldIndex] + valueToAdd;
            __CLR4_4_1a82a82lc8azt6b.R.inc(13298);if ((((proposed <= max)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13299)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13300)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13301);values[fieldIndex] = (int) proposed;
                __CLR4_4_1a82a82lc8azt6b.R.inc(13302);break;
            }
            }__CLR4_4_1a82a82lc8azt6b.R.inc(13303);if ((((nextField == null)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13304)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13305)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13306);if ((((fieldIndex == 0)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13307)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13308)==0&false))) {{
                    __CLR4_4_1a82a82lc8azt6b.R.inc(13309);throw new IllegalArgumentException("Maximum value exceeded for add");
                }
                }__CLR4_4_1a82a82lc8azt6b.R.inc(13310);nextField = instant.getField(fieldIndex - 1);
                // test only works if this field is UTC (ie. local)
                __CLR4_4_1a82a82lc8azt6b.R.inc(13311);if ((((getRangeDurationField().getType() != nextField.getDurationField().getType())&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13312)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13313)==0&false))) {{
                    __CLR4_4_1a82a82lc8azt6b.R.inc(13314);throw new IllegalArgumentException("Fields invalid for add");
                }
            }}
            }__CLR4_4_1a82a82lc8azt6b.R.inc(13315);valueToAdd -= (max + 1) - values[fieldIndex];  // reduce the amount to add
            __CLR4_4_1a82a82lc8azt6b.R.inc(13316);values = nextField.add(instant, fieldIndex - 1, values, 1);  // add 1 to next bigger field
            __CLR4_4_1a82a82lc8azt6b.R.inc(13317);values[fieldIndex] = getMinimumValue(instant, values);  // reset this field to zero
        }
        }__CLR4_4_1a82a82lc8azt6b.R.inc(13318);while ((((valueToAdd < 0)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13319)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13320)==0&false))) {{
            __CLR4_4_1a82a82lc8azt6b.R.inc(13321);int min = getMinimumValue(instant, values);
            __CLR4_4_1a82a82lc8azt6b.R.inc(13322);long proposed = values[fieldIndex] + valueToAdd;
            __CLR4_4_1a82a82lc8azt6b.R.inc(13323);if ((((proposed >= min)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13324)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13325)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13326);values[fieldIndex] = (int) proposed;
                __CLR4_4_1a82a82lc8azt6b.R.inc(13327);break;
            }
            }__CLR4_4_1a82a82lc8azt6b.R.inc(13328);if ((((nextField == null)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13329)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13330)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13331);if ((((fieldIndex == 0)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13332)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13333)==0&false))) {{
                    __CLR4_4_1a82a82lc8azt6b.R.inc(13334);throw new IllegalArgumentException("Maximum value exceeded for add");
                }
                }__CLR4_4_1a82a82lc8azt6b.R.inc(13335);nextField = instant.getField(fieldIndex - 1);
                __CLR4_4_1a82a82lc8azt6b.R.inc(13336);if ((((getRangeDurationField().getType() != nextField.getDurationField().getType())&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13337)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13338)==0&false))) {{
                    __CLR4_4_1a82a82lc8azt6b.R.inc(13339);throw new IllegalArgumentException("Fields invalid for add");
                }
            }}
            }__CLR4_4_1a82a82lc8azt6b.R.inc(13340);valueToAdd -= (min - 1) - values[fieldIndex];  // reduce the amount to add
            __CLR4_4_1a82a82lc8azt6b.R.inc(13341);values = nextField.add(instant, fieldIndex - 1, values, -1);  // subtract 1 from next bigger field
            __CLR4_4_1a82a82lc8azt6b.R.inc(13342);values[fieldIndex] = getMaximumValue(instant, values);  // reset this field to max value
        }
        
        }__CLR4_4_1a82a82lc8azt6b.R.inc(13343);return set(instant, fieldIndex, values, values[fieldIndex]);  // adjusts smaller fields
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Adds a value (which may be negative) to the partial instant,
     * wrapping the whole partial if the maximum size of the partial is reached.
     * <p>
     * The value will be added to this field, overflowing into larger fields
     * if necessary. Smaller fields should be unaffected, except where the
     * result would be an invalid value for a smaller field. In this case the
     * smaller field is adjusted to be in range.
     * <p>
     * Partial instants only contain some fields. This may result in a maximum
     * possible value, such as TimeOfDay normally being limited to 23:59:59:999.
     * If ths limit is reached by the addition, this method will wrap back to
     * 00:00:00.000. In fact, you would generally only use this method for
     * classes that have a limitation such as this.
     * <p>
     * For example, in the ISO chronology:<br>
     * 10:20:30 add 20 minutes is 10:40:30<br>
     * 10:20:30 add 45 minutes is 11:05:30<br>
     * 10:20:30 add 16 hours is 02:20:30<br>
     * 
     * @param instant  the partial instant
     * @param fieldIndex  the index of this field in the partial
     * @param values  the values of the partial instant which should be updated
     * @param valueToAdd  the value to add, in the units of the field
     * @return the passed in values
     * @throws IllegalArgumentException if the value is invalid or the maximum instant is reached
     */
    public int[] addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13344);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13345);if ((((valueToAdd == 0)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13346)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13347)==0&false))) {{
            __CLR4_4_1a82a82lc8azt6b.R.inc(13348);return values;
        }
        // there are more efficient algorithms than this (especially for time only fields)
        // trouble is when dealing with days and months, so we use this technique of
        // adding/removing one from the larger field at a time
        }__CLR4_4_1a82a82lc8azt6b.R.inc(13349);DateTimeField nextField = null;
        
        __CLR4_4_1a82a82lc8azt6b.R.inc(13350);while ((((valueToAdd > 0)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13351)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13352)==0&false))) {{
            __CLR4_4_1a82a82lc8azt6b.R.inc(13353);int max = getMaximumValue(instant, values);
            __CLR4_4_1a82a82lc8azt6b.R.inc(13354);long proposed = values[fieldIndex] + valueToAdd;
            __CLR4_4_1a82a82lc8azt6b.R.inc(13355);if ((((proposed <= max)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13356)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13357)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13358);values[fieldIndex] = (int) proposed;
                __CLR4_4_1a82a82lc8azt6b.R.inc(13359);break;
            }
            }__CLR4_4_1a82a82lc8azt6b.R.inc(13360);if ((((nextField == null)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13361)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13362)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13363);if ((((fieldIndex == 0)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13364)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13365)==0&false))) {{
                    __CLR4_4_1a82a82lc8azt6b.R.inc(13366);valueToAdd -= (max + 1) - values[fieldIndex];
                    __CLR4_4_1a82a82lc8azt6b.R.inc(13367);values[fieldIndex] = getMinimumValue(instant, values);
                    __CLR4_4_1a82a82lc8azt6b.R.inc(13368);continue;
                }
                }__CLR4_4_1a82a82lc8azt6b.R.inc(13369);nextField = instant.getField(fieldIndex - 1);
                // test only works if this field is UTC (ie. local)
                __CLR4_4_1a82a82lc8azt6b.R.inc(13370);if ((((getRangeDurationField().getType() != nextField.getDurationField().getType())&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13371)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13372)==0&false))) {{
                    __CLR4_4_1a82a82lc8azt6b.R.inc(13373);throw new IllegalArgumentException("Fields invalid for add");
                }
            }}
            }__CLR4_4_1a82a82lc8azt6b.R.inc(13374);valueToAdd -= (max + 1) - values[fieldIndex];  // reduce the amount to add
            __CLR4_4_1a82a82lc8azt6b.R.inc(13375);values = nextField.addWrapPartial(instant, fieldIndex - 1, values, 1);  // add 1 to next bigger field
            __CLR4_4_1a82a82lc8azt6b.R.inc(13376);values[fieldIndex] = getMinimumValue(instant, values);  // reset this field to zero
        }
        }__CLR4_4_1a82a82lc8azt6b.R.inc(13377);while ((((valueToAdd < 0)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13378)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13379)==0&false))) {{
            __CLR4_4_1a82a82lc8azt6b.R.inc(13380);int min = getMinimumValue(instant, values);
            __CLR4_4_1a82a82lc8azt6b.R.inc(13381);long proposed = values[fieldIndex] + valueToAdd;
            __CLR4_4_1a82a82lc8azt6b.R.inc(13382);if ((((proposed >= min)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13383)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13384)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13385);values[fieldIndex] = (int) proposed;
                __CLR4_4_1a82a82lc8azt6b.R.inc(13386);break;
            }
            }__CLR4_4_1a82a82lc8azt6b.R.inc(13387);if ((((nextField == null)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13388)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13389)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13390);if ((((fieldIndex == 0)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13391)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13392)==0&false))) {{
                    __CLR4_4_1a82a82lc8azt6b.R.inc(13393);valueToAdd -= (min - 1) - values[fieldIndex];
                    __CLR4_4_1a82a82lc8azt6b.R.inc(13394);values[fieldIndex] = getMaximumValue(instant, values);
                    __CLR4_4_1a82a82lc8azt6b.R.inc(13395);continue;
                }
                }__CLR4_4_1a82a82lc8azt6b.R.inc(13396);nextField = instant.getField(fieldIndex - 1);
                __CLR4_4_1a82a82lc8azt6b.R.inc(13397);if ((((getRangeDurationField().getType() != nextField.getDurationField().getType())&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13398)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13399)==0&false))) {{
                    __CLR4_4_1a82a82lc8azt6b.R.inc(13400);throw new IllegalArgumentException("Fields invalid for add");
                }
            }}
            }__CLR4_4_1a82a82lc8azt6b.R.inc(13401);valueToAdd -= (min - 1) - values[fieldIndex];  // reduce the amount to add
            __CLR4_4_1a82a82lc8azt6b.R.inc(13402);values = nextField.addWrapPartial(instant, fieldIndex - 1, values, -1);  // subtract 1 from next bigger field
            __CLR4_4_1a82a82lc8azt6b.R.inc(13403);values[fieldIndex] = getMaximumValue(instant, values);  // reset this field to max value
        }
        
        }__CLR4_4_1a82a82lc8azt6b.R.inc(13404);return set(instant, fieldIndex, values, values[fieldIndex]);  // adjusts smaller fields
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Adds a value (which may be negative) to the instant value,
     * wrapping within this field.
     * <p>
     * The value will be added to this field. If the value is too large to be
     * added solely to this field then it wraps. Larger fields are always
     * unaffected. Smaller fields should be unaffected, except where the
     * result would be an invalid value for a smaller field. In this case the
     * smaller field is adjusted to be in range.
     * <p>
     * For example, in the ISO chronology:<br>
     * 2000-08-20 addWrapField six months is 2000-02-20<br>
     * 2000-08-20 addWrapField twenty months is 2000-04-20<br>
     * 2000-08-20 addWrapField minus nine months is 2000-11-20<br>
     * 2001-01-31 addWrapField one month  is 2001-02-28<br>
     * 2001-01-31 addWrapField two months is 2001-03-31<br>
     * <p>
     * The default implementation internally calls set. Subclasses are
     * encouraged to provide a more efficient implementation.
     * 
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to add to
     * @param value  the value to add, in the units of the field
     * @return the updated milliseconds
     */
    public long addWrapField(long instant, int value) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13405);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13406);int current = get(instant);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13407);int wrapped = FieldUtils.getWrappedValue
            (current, value, getMinimumValue(instant), getMaximumValue(instant));
        __CLR4_4_1a82a82lc8azt6b.R.inc(13408);return set(instant, wrapped);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Adds a value (which may be negative) to the partial instant,
     * wrapping within this field.
     * <p>
     * The value will be added to this field. If the value is too large to be
     * added solely to this field then it wraps. Larger fields are always
     * unaffected. Smaller fields should be unaffected, except where the
     * result would be an invalid value for a smaller field. In this case the
     * smaller field is adjusted to be in range.
     * <p>
     * For example, in the ISO chronology:<br>
     * 2000-08-20 addWrapField six months is 2000-02-20<br>
     * 2000-08-20 addWrapField twenty months is 2000-04-20<br>
     * 2000-08-20 addWrapField minus nine months is 2000-11-20<br>
     * 2001-01-31 addWrapField one month  is 2001-02-28<br>
     * 2001-01-31 addWrapField two months is 2001-03-31<br>
     * <p>
     * The default implementation internally calls set. Subclasses are
     * encouraged to provide a more efficient implementation.
     * 
     * @param instant  the partial instant
     * @param fieldIndex  the index of this field in the instant
     * @param values  the values of the partial instant which should be updated
     * @param valueToAdd  the value to add, in the units of the field
     * @return the passed in values
     * @throws IllegalArgumentException if the value is invalid
     */
    public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13409);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13410);int current = values[fieldIndex];
        __CLR4_4_1a82a82lc8azt6b.R.inc(13411);int wrapped = FieldUtils.getWrappedValue
            (current, valueToAdd, getMinimumValue(instant), getMaximumValue(instant));
        __CLR4_4_1a82a82lc8azt6b.R.inc(13412);return set(instant, fieldIndex, values, wrapped);  // adjusts smaller fields
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Computes the difference between two instants, as measured in the units
     * of this field. Any fractional units are dropped from the result. Calling
     * getDifference reverses the effect of calling add. In the following code:
     *
     * <pre>
     * long instant = ...
     * int v = ...
     * int age = getDifference(add(instant, v), instant);
     * </pre>
     *
     * The value 'age' is the same as the value 'v'.
     *
     * @param minuendInstant the milliseconds from 1970-01-01T00:00:00Z to
     * subtract from
     * @param subtrahendInstant the milliseconds from 1970-01-01T00:00:00Z to
     * subtract off the minuend
     * @return the difference in the units of this field
     */
    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13413);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13414);return getDurationField().getDifference(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Computes the difference between two instants, as measured in the units
     * of this field. Any fractional units are dropped from the result. Calling
     * getDifference reverses the effect of calling add. In the following code:
     *
     * <pre>
     * long instant = ...
     * long v = ...
     * long age = getDifferenceAsLong(add(instant, v), instant);
     * </pre>
     *
     * The value 'age' is the same as the value 'v'.
     *
     * @param minuendInstant the milliseconds from 1970-01-01T00:00:00Z to
     * subtract from
     * @param subtrahendInstant the milliseconds from 1970-01-01T00:00:00Z to
     * subtract off the minuend
     * @return the difference in the units of this field
     */
    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13415);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13416);return getDurationField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Sets a value in the milliseconds supplied.
     * <p>
     * The value of this field will be set.
     * If the value is invalid, an exception if thrown.
     * <p>
     * If setting this field would make other fields invalid, then those fields
     * may be changed. For example if the current date is the 31st January, and
     * the month is set to February, the day would be invalid. Instead, the day
     * would be changed to the closest value - the 28th/29th February as appropriate.
     * 
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to set in
     * @param value  the value to set, in the units of the field
     * @return the updated milliseconds
     * @throws IllegalArgumentException if the value is invalid
     */
    public abstract long set(long instant, int value);

    /**
     * Sets a value using the specified partial instant.
     * <p>
     * The value of this field (specified by the index) will be set.
     * If the value is invalid, an exception if thrown.
     * <p>
     * If setting this field would make other fields invalid, then those fields
     * may be changed. For example if the current date is the 31st January, and
     * the month is set to February, the day would be invalid. Instead, the day
     * would be changed to the closest value - the 28th/29th February as appropriate.
     * 
     * @param partial  the partial instant
     * @param fieldIndex  the index of this field in the instant
     * @param values  the values to update
     * @param newValue  the value to set, in the units of the field
     * @return the updated values
     * @throws IllegalArgumentException if the value is invalid
     */
    public int[] set(ReadablePartial partial, int fieldIndex, int[] values, int newValue) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13417);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13418);FieldUtils.verifyValueBounds(this, newValue, getMinimumValue(partial, values), getMaximumValue(partial, values));
        __CLR4_4_1a82a82lc8azt6b.R.inc(13419);values[fieldIndex] = newValue;
        
        // may need to adjust smaller fields
        __CLR4_4_1a82a82lc8azt6b.R.inc(13420);for (int i = fieldIndex + 1; (((i < partial.size())&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13421)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13422)==0&false)); i++) {{
            __CLR4_4_1a82a82lc8azt6b.R.inc(13423);DateTimeField field = partial.getField(i);
            __CLR4_4_1a82a82lc8azt6b.R.inc(13424);if ((((values[i] > field.getMaximumValue(partial, values))&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13425)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13426)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13427);values[i] = field.getMaximumValue(partial, values);
            }
            }__CLR4_4_1a82a82lc8azt6b.R.inc(13428);if ((((values[i] < field.getMinimumValue(partial, values))&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13429)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13430)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13431);values[i] = field.getMinimumValue(partial, values);
            }
        }}
        }__CLR4_4_1a82a82lc8azt6b.R.inc(13432);return values;
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Sets a value in the milliseconds supplied from a human-readable, text value.
     * If the specified locale is null, the default locale is used.
     * <p>
     * This implementation uses <code>convertText(String, Locale)</code> and
     * {@link #set(long, int)}.
     * <p>
     * Note: subclasses that override this method should also override
     * getAsText.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to set in
     * @param text  the text value to set
     * @param locale the locale to use for selecting a text symbol, null for default
     * @return the updated milliseconds
     * @throws IllegalArgumentException if the text value is invalid
     */
    public long set(long instant, String text, Locale locale) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13433);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13434);int value = convertText(text, locale);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13435);return set(instant, value);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Sets a value in the milliseconds supplied from a human-readable, text value.
     * <p>
     * This implementation uses {@link #set(long, String, Locale)}.
     * <p>
     * Note: subclasses that override this method should also override getAsText.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to set in
     * @param text  the text value to set
     * @return the updated milliseconds
     * @throws IllegalArgumentException if the text value is invalid
     */
    public final long set(long instant, String text) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13436);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13437);return set(instant, text, null);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Sets a value in the milliseconds supplied from a human-readable, text value.
     * If the specified locale is null, the default locale is used.
     * <p>
     * This implementation uses <code>convertText(String, Locale)</code> and
     * {@link #set(ReadablePartial, int, int[], int)}.
     *
     * @param instant  the partial instant
     * @param fieldIndex  the index of this field in the instant
     * @param values  the values of the partial instant which should be updated
     * @param text  the text value to set
     * @param locale the locale to use for selecting a text symbol, null for default
     * @return the passed in values
     * @throws IllegalArgumentException if the text value is invalid
     */
    public int[] set(ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13438);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13439);int value = convertText(text, locale);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13440);return set(instant, fieldIndex, values, value);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Convert the specified text and locale into a value.
     * 
     * @param text  the text to convert
     * @param locale  the locale to convert using
     * @return the value extracted from the text
     * @throws IllegalArgumentException if the text is invalid
     */
    protected int convertText(String text, Locale locale) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13441);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13442);try {
            __CLR4_4_1a82a82lc8azt6b.R.inc(13443);return Integer.parseInt(text);
        } catch (NumberFormatException ex) {
            __CLR4_4_1a82a82lc8azt6b.R.inc(13444);throw new IllegalFieldValueException(getType(), text);
        }
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    // Extra information API
    //------------------------------------------------------------------------
    /**
     * Returns the duration per unit value of this field. For example, if this
     * field represents "hour of day", then the unit duration is an hour.
     *
     * @return the duration of this field, or UnsupportedDurationField if field
     * has no duration
     */
    public abstract DurationField getDurationField();

    /**
     * Returns the range duration of this field. For example, if this field
     * represents "hour of day", then the range duration is a day.
     *
     * @return the range duration of this field, or null if field has no range
     */
    public abstract DurationField getRangeDurationField();

    /**
     * Returns whether this field is 'leap' for the specified instant.
     * <p>
     * For example, a leap year would return true, a non leap year would return
     * false.
     * <p>
     * This implementation returns false.
     * 
     * @return true if the field is 'leap'
     */
    public boolean isLeap(long instant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13445);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13446);return false;
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Gets the amount by which this field is 'leap' for the specified instant.
     * <p>
     * For example, a leap year would return one, a non leap year would return
     * zero.
     * <p>
     * This implementation returns zero.
     */
    public int getLeapAmount(long instant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13447);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13448);return 0;
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * If this field were to leap, then it would be in units described by the
     * returned duration. If this field doesn't ever leap, null is returned.
     * <p>
     * This implementation returns null.
     */
    public DurationField getLeapDurationField() {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13449);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13450);return null;
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the minimum allowable value for this field.
     * 
     * @return the minimum valid value for this field, in the units of the
     * field
     */
    public abstract int getMinimumValue();

    /**
     * Get the minimum value for this field evaluated at the specified time.
     * <p>
     * This implementation returns the same as {@link #getMinimumValue()}.
     * 
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the minimum value for this field, in the units of the field
     */
    public int getMinimumValue(long instant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13451);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13452);return getMinimumValue();
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the minimum value for this field evaluated at the specified instant.
     * <p>
     * This implementation returns the same as {@link #getMinimumValue()}.
     * 
     * @param instant  the partial instant to query
     * @return the minimum value for this field, in the units of the field
     */
    public int getMinimumValue(ReadablePartial instant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13453);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13454);return getMinimumValue();
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the minimum value for this field using the partial instant and
     * the specified values.
     * <p>
     * This implementation returns the same as {@link #getMinimumValue(ReadablePartial)}.
     * 
     * @param instant  the partial instant to query
     * @param values  the values to use
     * @return the minimum value for this field, in the units of the field
     */
    public int getMinimumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13455);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13456);return getMinimumValue(instant);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the maximum allowable value for this field.
     * 
     * @return the maximum valid value for this field, in the units of the
     * field
     */
    public abstract int getMaximumValue();

    /**
     * Get the maximum value for this field evaluated at the specified time.
     * <p>
     * This implementation returns the same as {@link #getMaximumValue()}.
     * 
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the maximum value for this field, in the units of the field
     */
    public int getMaximumValue(long instant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13457);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13458);return getMaximumValue();
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the maximum value for this field evaluated at the specified instant.
     * <p>
     * This implementation returns the same as {@link #getMaximumValue()}.
     * 
     * @param instant  the partial instant to query
     * @return the maximum value for this field, in the units of the field
     */
    public int getMaximumValue(ReadablePartial instant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13459);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13460);return getMaximumValue();
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the maximum value for this field using the partial instant and
     * the specified values.
     * <p>
     * This implementation returns the same as {@link #getMaximumValue(ReadablePartial)}.
     * 
     * @param instant  the partial instant to query
     * @param values  the values to use
     * @return the maximum value for this field, in the units of the field
     */
    public int getMaximumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13461);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13462);return getMaximumValue(instant);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the maximum text value for this field. The default implementation
     * returns the equivalent of Integer.toString(getMaximumValue()).length().
     * 
     * @param locale  the locale to use for selecting a text symbol
     * @return the maximum text length
     */
    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13463);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13464);int max = getMaximumValue();
        __CLR4_4_1a82a82lc8azt6b.R.inc(13465);if ((((max >= 0)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13466)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13467)==0&false))) {{
            __CLR4_4_1a82a82lc8azt6b.R.inc(13468);if ((((max < 10)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13469)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13470)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13471);return 1;
            } }else {__CLR4_4_1a82a82lc8azt6b.R.inc(13472);if ((((max < 100)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13473)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13474)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13475);return 2;
            } }else {__CLR4_4_1a82a82lc8azt6b.R.inc(13476);if ((((max < 1000)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13477)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13478)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13479);return 3;
            }
        }}}}
        }__CLR4_4_1a82a82lc8azt6b.R.inc(13480);return Integer.toString(max).length();
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get the maximum short text value for this field. The default
     * implementation returns getMaximumTextLength().
     * 
     * @param locale  the locale to use for selecting a text symbol
     * @return the maximum short text length
     */
    public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13481);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13482);return getMaximumTextLength(locale);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    // Calculation API
    //------------------------------------------------------------------------
    /**
     * Round to the lowest whole unit of this field. After rounding, the value
     * of this field and all fields of a higher magnitude are retained. The
     * fractional millis that cannot be expressed in whole increments of this
     * field are set to minimum.
     * <p>
     * For example, a datetime of 2002-11-02T23:34:56.789, rounded to the
     * lowest whole hour is 2002-11-02T23:00:00.000.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to round
     * @return rounded milliseconds
     */
    public abstract long roundFloor(long instant);

    /**
     * Round to the highest whole unit of this field. The value of this field
     * and all fields of a higher magnitude may be incremented in order to
     * achieve this result. The fractional millis that cannot be expressed in
     * whole increments of this field are set to minimum.
     * <p>
     * For example, a datetime of 2002-11-02T23:34:56.789, rounded to the
     * highest whole hour is 2002-11-03T00:00:00.000.
     * <p>
     * The default implementation calls roundFloor, and if the instant is
     * modified as a result, adds one field unit. Subclasses are encouraged to
     * provide a more efficient implementation.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to round
     * @return rounded milliseconds
     */
    public long roundCeiling(long instant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13483);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13484);long newInstant = roundFloor(instant);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13485);if ((((newInstant != instant)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13486)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13487)==0&false))) {{
            __CLR4_4_1a82a82lc8azt6b.R.inc(13488);instant = add(newInstant, 1);
        }
        }__CLR4_4_1a82a82lc8azt6b.R.inc(13489);return instant;
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Round to the nearest whole unit of this field. If the given millisecond
     * value is closer to the floor or is exactly halfway, this function
     * behaves like roundFloor. If the millisecond value is closer to the
     * ceiling, this function behaves like roundCeiling.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to round
     * @return rounded milliseconds
     */
    public long roundHalfFloor(long instant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13490);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13491);long floor = roundFloor(instant);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13492);long ceiling = roundCeiling(instant);

        __CLR4_4_1a82a82lc8azt6b.R.inc(13493);long diffFromFloor = instant - floor;
        __CLR4_4_1a82a82lc8azt6b.R.inc(13494);long diffToCeiling = ceiling - instant;

        __CLR4_4_1a82a82lc8azt6b.R.inc(13495);if ((((diffFromFloor <= diffToCeiling)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13496)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13497)==0&false))) {{
            // Closer to the floor, or halfway - round floor
            __CLR4_4_1a82a82lc8azt6b.R.inc(13498);return floor;
        } }else {{
            __CLR4_4_1a82a82lc8azt6b.R.inc(13499);return ceiling;
        }
    }}finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Round to the nearest whole unit of this field. If the given millisecond
     * value is closer to the floor, this function behaves like roundFloor. If
     * the millisecond value is closer to the ceiling or is exactly halfway,
     * this function behaves like roundCeiling.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to round
     * @return rounded milliseconds
     */
    public long roundHalfCeiling(long instant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13500);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13501);long floor = roundFloor(instant);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13502);long ceiling = roundCeiling(instant);

        __CLR4_4_1a82a82lc8azt6b.R.inc(13503);long diffFromFloor = instant - floor;
        __CLR4_4_1a82a82lc8azt6b.R.inc(13504);long diffToCeiling = ceiling - instant;

        __CLR4_4_1a82a82lc8azt6b.R.inc(13505);if ((((diffToCeiling <= diffFromFloor)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13506)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13507)==0&false))) {{
            // Closer to the ceiling, or halfway - round ceiling
            __CLR4_4_1a82a82lc8azt6b.R.inc(13508);return ceiling;
        } }else {{
            __CLR4_4_1a82a82lc8azt6b.R.inc(13509);return floor;
        }
    }}finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Round to the nearest whole unit of this field. If the given millisecond
     * value is closer to the floor, this function behaves like roundFloor. If
     * the millisecond value is closer to the ceiling, this function behaves
     * like roundCeiling.
     * <p>
     * If the millisecond value is exactly halfway between the floor and
     * ceiling, the ceiling is chosen over the floor only if it makes this
     * field's value even.
     *
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to round
     * @return rounded milliseconds
     */
    public long roundHalfEven(long instant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13510);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13511);long floor = roundFloor(instant);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13512);long ceiling = roundCeiling(instant);

        __CLR4_4_1a82a82lc8azt6b.R.inc(13513);long diffFromFloor = instant - floor;
        __CLR4_4_1a82a82lc8azt6b.R.inc(13514);long diffToCeiling = ceiling - instant;

        __CLR4_4_1a82a82lc8azt6b.R.inc(13515);if ((((diffFromFloor < diffToCeiling)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13516)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13517)==0&false))) {{
            // Closer to the floor - round floor
            __CLR4_4_1a82a82lc8azt6b.R.inc(13518);return floor;
        } }else {__CLR4_4_1a82a82lc8azt6b.R.inc(13519);if ((((diffToCeiling < diffFromFloor)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13520)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13521)==0&false))) {{
            // Closer to the ceiling - round ceiling
            __CLR4_4_1a82a82lc8azt6b.R.inc(13522);return ceiling;
        } }else {{
            // Round to the instant that makes this field even. If both values
            // make this field even (unlikely), favor the ceiling.
            __CLR4_4_1a82a82lc8azt6b.R.inc(13523);if (((((get(ceiling) & 1) == 0)&&(__CLR4_4_1a82a82lc8azt6b.R.iget(13524)!=0|true))||(__CLR4_4_1a82a82lc8azt6b.R.iget(13525)==0&false))) {{
                __CLR4_4_1a82a82lc8azt6b.R.inc(13526);return ceiling;
            }
            }__CLR4_4_1a82a82lc8azt6b.R.inc(13527);return floor;
        }
    }}}finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Returns the fractional duration milliseconds of this field. In other
     * words, calling remainder returns the duration that roundFloor would
     * subtract.
     * <p>
     * For example, on a datetime of 2002-11-02T23:34:56.789, the remainder by
     * hour is 34 minutes and 56.789 seconds.
     * <p>
     * The default implementation computes
     * <code>instant - roundFloor(instant)</code>. Subclasses are encouraged to
     * provide a more efficient implementation.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to get the
     * remainder
     * @return remainder duration, in milliseconds
     */
    public long remainder(long instant) {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13528);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13529);return instant - roundFloor(instant);
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

    /**
     * Get a suitable debug string.
     * 
     * @return debug string
     */
    public String toString() {try{__CLR4_4_1a82a82lc8azt6b.R.inc(13530);
        __CLR4_4_1a82a82lc8azt6b.R.inc(13531);return "DateTimeField[" + getName() + ']';
    }finally{__CLR4_4_1a82a82lc8azt6b.R.flushNeeded();}}

}
