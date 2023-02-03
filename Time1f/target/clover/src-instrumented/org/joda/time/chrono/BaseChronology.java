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
package org.joda.time.chrono;

import java.io.Serializable;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/**
 * BaseChronology provides a skeleton implementation for chronology
 * classes. Many utility methods are defined, but all fields are unsupported.
 * <p>
 * BaseChronology is thread-safe and immutable, and all subclasses must be
 * as well.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public abstract class BaseChronology
        extends Chronology
        implements Serializable {public static class __CLR4_4_16o56o5lc8azsri{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,8829,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version. */
    private static final long serialVersionUID = -7310865996721419676L;

    /**
     * Restricted constructor.
     */
    protected BaseChronology() {
        super();__CLR4_4_16o56o5lc8azsri.R.inc(8646);try{__CLR4_4_16o56o5lc8azsri.R.inc(8645);
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Returns the DateTimeZone that this Chronology operates in, or null if
     * unspecified.
     *
     * @return DateTimeZone null if unspecified
     */
    public abstract DateTimeZone getZone();

    /**
     * Returns an instance of this Chronology that operates in the UTC time
     * zone. Chronologies that do not operate in a time zone or are already
     * UTC must return themself.
     *
     * @return a version of this chronology that ignores time zones
     */
    public abstract Chronology withUTC();
    
    /**
     * Returns an instance of this Chronology that operates in any time zone.
     *
     * @return a version of this chronology with a specific time zone
     * @param zone to use, or default if null
     * @see org.joda.time.chrono.ZonedChronology
     */
    public abstract Chronology withZone(DateTimeZone zone);

    /**
     * Returns a datetime millisecond instant, formed from the given year,
     * month, day, and millisecond values. The set of given values must refer
     * to a valid datetime, or else an IllegalArgumentException is thrown.
     * <p>
     * The default implementation calls upon separate DateTimeFields to
     * determine the result. Subclasses are encouraged to provide a more
     * efficient implementation.
     *
     * @param year year to use
     * @param monthOfYear month to use
     * @param dayOfMonth day of month to use
     * @param millisOfDay millisecond to use
     * @return millisecond instant from 1970-01-01T00:00:00Z
     */
    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int millisOfDay)
        throws IllegalArgumentException
    {try{__CLR4_4_16o56o5lc8azsri.R.inc(8647);
        __CLR4_4_16o56o5lc8azsri.R.inc(8648);long instant = year().set(0, year);
        __CLR4_4_16o56o5lc8azsri.R.inc(8649);instant = monthOfYear().set(instant, monthOfYear);
        __CLR4_4_16o56o5lc8azsri.R.inc(8650);instant = dayOfMonth().set(instant, dayOfMonth);
        __CLR4_4_16o56o5lc8azsri.R.inc(8651);return millisOfDay().set(instant, millisOfDay);
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Returns a datetime millisecond instant, formed from the given year,
     * month, day, hour, minute, second, and millisecond values. The set of
     * given values must refer to a valid datetime, or else an
     * IllegalArgumentException is thrown.
     * <p>
     * The default implementation calls upon separate DateTimeFields to
     * determine the result. Subclasses are encouraged to provide a more
     * efficient implementation.
     *
     * @param year year to use
     * @param monthOfYear month to use
     * @param dayOfMonth day of month to use
     * @param hourOfDay hour to use
     * @param minuteOfHour minute to use
     * @param secondOfMinute second to use
     * @param millisOfSecond millisecond to use
     * @return millisecond instant from 1970-01-01T00:00:00Z
     */
    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
        throws IllegalArgumentException
    {try{__CLR4_4_16o56o5lc8azsri.R.inc(8652);
        __CLR4_4_16o56o5lc8azsri.R.inc(8653);long instant = year().set(0, year);
        __CLR4_4_16o56o5lc8azsri.R.inc(8654);instant = monthOfYear().set(instant, monthOfYear);
        __CLR4_4_16o56o5lc8azsri.R.inc(8655);instant = dayOfMonth().set(instant, dayOfMonth);
        __CLR4_4_16o56o5lc8azsri.R.inc(8656);instant = hourOfDay().set(instant, hourOfDay);
        __CLR4_4_16o56o5lc8azsri.R.inc(8657);instant = minuteOfHour().set(instant, minuteOfHour);
        __CLR4_4_16o56o5lc8azsri.R.inc(8658);instant = secondOfMinute().set(instant, secondOfMinute);
        __CLR4_4_16o56o5lc8azsri.R.inc(8659);return millisOfSecond().set(instant, millisOfSecond);
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Returns a datetime millisecond instant, from from the given instant,
     * hour, minute, second, and millisecond values. The set of given values
     * must refer to a valid datetime, or else an IllegalArgumentException is
     * thrown.
     * <p>
     * The default implementation calls upon separate DateTimeFields to
     * determine the result. Subclasses are encouraged to provide a more
     * efficient implementation.
     *
     * @param instant instant to start from
     * @param hourOfDay hour to use
     * @param minuteOfHour minute to use
     * @param secondOfMinute second to use
     * @param millisOfSecond millisecond to use
     * @return millisecond instant from 1970-01-01T00:00:00Z
     */
    public long getDateTimeMillis(long instant,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
        throws IllegalArgumentException
    {try{__CLR4_4_16o56o5lc8azsri.R.inc(8660);
        __CLR4_4_16o56o5lc8azsri.R.inc(8661);instant = hourOfDay().set(instant, hourOfDay);
        __CLR4_4_16o56o5lc8azsri.R.inc(8662);instant = minuteOfHour().set(instant, minuteOfHour);
        __CLR4_4_16o56o5lc8azsri.R.inc(8663);instant = secondOfMinute().set(instant, secondOfMinute);
        __CLR4_4_16o56o5lc8azsri.R.inc(8664);return millisOfSecond().set(instant, millisOfSecond);
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Validates whether the fields stored in a partial instant are valid.
     * <p>
     * This implementation uses {@link DateTimeField#getMinimumValue(ReadablePartial, int[])}
     * and {@link DateTimeField#getMaximumValue(ReadablePartial, int[])}.
     *
     * @param partial  the partial instant to validate
     * @param values  the values to validate, not null unless the partial is empty
     * @throws IllegalArgumentException if the instant is invalid
     */
    public void validate(ReadablePartial partial, int[] values) {try{__CLR4_4_16o56o5lc8azsri.R.inc(8665);
        // check values in standard range, catching really stupid cases like -1
        // this means that the second check will not hit trouble
        __CLR4_4_16o56o5lc8azsri.R.inc(8666);int size = partial.size();
        __CLR4_4_16o56o5lc8azsri.R.inc(8667);for (int i = 0; (((i < size)&&(__CLR4_4_16o56o5lc8azsri.R.iget(8668)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8669)==0&false)); i++) {{
            __CLR4_4_16o56o5lc8azsri.R.inc(8670);int value = values[i];
            __CLR4_4_16o56o5lc8azsri.R.inc(8671);DateTimeField field = partial.getField(i);
            __CLR4_4_16o56o5lc8azsri.R.inc(8672);if ((((value < field.getMinimumValue())&&(__CLR4_4_16o56o5lc8azsri.R.iget(8673)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8674)==0&false))) {{
                __CLR4_4_16o56o5lc8azsri.R.inc(8675);throw new IllegalFieldValueException
                    (field.getType(), Integer.valueOf(value),
                     Integer.valueOf(field.getMinimumValue()), null);
            }
            }__CLR4_4_16o56o5lc8azsri.R.inc(8676);if ((((value > field.getMaximumValue())&&(__CLR4_4_16o56o5lc8azsri.R.iget(8677)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8678)==0&false))) {{
                __CLR4_4_16o56o5lc8azsri.R.inc(8679);throw new IllegalFieldValueException
                    (field.getType(), Integer.valueOf(value),
                     null, Integer.valueOf(field.getMaximumValue()));
            }
        }}
        // check values in specific range, catching really odd cases like 30th Feb
        }__CLR4_4_16o56o5lc8azsri.R.inc(8680);for (int i = 0; (((i < size)&&(__CLR4_4_16o56o5lc8azsri.R.iget(8681)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8682)==0&false)); i++) {{
            __CLR4_4_16o56o5lc8azsri.R.inc(8683);int value = values[i];
            __CLR4_4_16o56o5lc8azsri.R.inc(8684);DateTimeField field = partial.getField(i);
            __CLR4_4_16o56o5lc8azsri.R.inc(8685);if ((((value < field.getMinimumValue(partial, values))&&(__CLR4_4_16o56o5lc8azsri.R.iget(8686)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8687)==0&false))) {{
                __CLR4_4_16o56o5lc8azsri.R.inc(8688);throw new IllegalFieldValueException
                    (field.getType(), Integer.valueOf(value),
                     Integer.valueOf(field.getMinimumValue(partial, values)), null);
            }
            }__CLR4_4_16o56o5lc8azsri.R.inc(8689);if ((((value > field.getMaximumValue(partial, values))&&(__CLR4_4_16o56o5lc8azsri.R.iget(8690)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8691)==0&false))) {{
                __CLR4_4_16o56o5lc8azsri.R.inc(8692);throw new IllegalFieldValueException
                    (field.getType(), Integer.valueOf(value),
                     null, Integer.valueOf(field.getMaximumValue(partial, values)));
            }
        }}
    }}finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Gets the values of a partial from an instant.
     *
     * @param partial  the partial instant to use
     * @param instant  the instant to query
     * @return the values of the partial extracted from the instant
     */
    public int[] get(ReadablePartial partial, long instant) {try{__CLR4_4_16o56o5lc8azsri.R.inc(8693);
        __CLR4_4_16o56o5lc8azsri.R.inc(8694);int size = partial.size();
        __CLR4_4_16o56o5lc8azsri.R.inc(8695);int[] values = new int[size];
        __CLR4_4_16o56o5lc8azsri.R.inc(8696);for (int i = 0; (((i < size)&&(__CLR4_4_16o56o5lc8azsri.R.iget(8697)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8698)==0&false)); i++) {{
            __CLR4_4_16o56o5lc8azsri.R.inc(8699);values[i] = partial.getFieldType(i).getField(this).get(instant);
        }
        }__CLR4_4_16o56o5lc8azsri.R.inc(8700);return values;
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Sets the partial into the instant.
     *
     * @param partial  the partial instant to use
     * @param instant  the instant to update
     * @return the updated instant
     */
    public long set(ReadablePartial partial, long instant) {try{__CLR4_4_16o56o5lc8azsri.R.inc(8701);
        __CLR4_4_16o56o5lc8azsri.R.inc(8702);for (int i = 0, isize = partial.size(); (((i < isize)&&(__CLR4_4_16o56o5lc8azsri.R.iget(8703)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8704)==0&false)); i++) {{
            __CLR4_4_16o56o5lc8azsri.R.inc(8705);instant = partial.getFieldType(i).getField(this).set(instant, partial.getValue(i));
        }
        }__CLR4_4_16o56o5lc8azsri.R.inc(8706);return instant;
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the values of a period from an interval.
     *
     * @param period  the period instant to use
     * @param startInstant  the start instant of an interval to query
     * @param endInstant  the start instant of an interval to query
     * @return the values of the period extracted from the interval
     */
    public int[] get(ReadablePeriod period, long startInstant, long endInstant) {try{__CLR4_4_16o56o5lc8azsri.R.inc(8707);
        __CLR4_4_16o56o5lc8azsri.R.inc(8708);int size = period.size();
        __CLR4_4_16o56o5lc8azsri.R.inc(8709);int[] values = new int[size];
        __CLR4_4_16o56o5lc8azsri.R.inc(8710);if ((((startInstant != endInstant)&&(__CLR4_4_16o56o5lc8azsri.R.iget(8711)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8712)==0&false))) {{
            __CLR4_4_16o56o5lc8azsri.R.inc(8713);for (int i = 0; (((i < size)&&(__CLR4_4_16o56o5lc8azsri.R.iget(8714)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8715)==0&false)); i++) {{
                __CLR4_4_16o56o5lc8azsri.R.inc(8716);DurationField field = period.getFieldType(i).getField(this);
                __CLR4_4_16o56o5lc8azsri.R.inc(8717);int value = field.getDifference(endInstant, startInstant);
                __CLR4_4_16o56o5lc8azsri.R.inc(8718);startInstant = field.add(startInstant, value);
                __CLR4_4_16o56o5lc8azsri.R.inc(8719);values[i] = value;
            }
        }}
        }__CLR4_4_16o56o5lc8azsri.R.inc(8720);return values;
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Gets the values of a period from an interval.
     *
     * @param period  the period instant to use
     * @param duration  the duration to query
     * @return the values of the period extracted from the duration
     */
    public int[] get(ReadablePeriod period, long duration) {try{__CLR4_4_16o56o5lc8azsri.R.inc(8721);
        __CLR4_4_16o56o5lc8azsri.R.inc(8722);int size = period.size();
        __CLR4_4_16o56o5lc8azsri.R.inc(8723);int[] values = new int[size];
        __CLR4_4_16o56o5lc8azsri.R.inc(8724);if ((((duration != 0)&&(__CLR4_4_16o56o5lc8azsri.R.iget(8725)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8726)==0&false))) {{
            __CLR4_4_16o56o5lc8azsri.R.inc(8727);long current = 0;
            __CLR4_4_16o56o5lc8azsri.R.inc(8728);for (int i = 0; (((i < size)&&(__CLR4_4_16o56o5lc8azsri.R.iget(8729)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8730)==0&false)); i++) {{
                __CLR4_4_16o56o5lc8azsri.R.inc(8731);DurationField field = period.getFieldType(i).getField(this);
                __CLR4_4_16o56o5lc8azsri.R.inc(8732);if ((((field.isPrecise())&&(__CLR4_4_16o56o5lc8azsri.R.iget(8733)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8734)==0&false))) {{
                    __CLR4_4_16o56o5lc8azsri.R.inc(8735);int value = field.getDifference(duration, current);
                    __CLR4_4_16o56o5lc8azsri.R.inc(8736);current = field.add(current, value);
                    __CLR4_4_16o56o5lc8azsri.R.inc(8737);values[i] = value;
                }
            }}
        }}
        }__CLR4_4_16o56o5lc8azsri.R.inc(8738);return values;
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Adds the period to the instant, specifying the number of times to add.
     *
     * @param period  the period to add, null means add nothing
     * @param instant  the instant to add to
     * @param scalar  the number of times to add
     * @return the updated instant
     */
    public long add(ReadablePeriod period, long instant, int scalar) {try{__CLR4_4_16o56o5lc8azsri.R.inc(8739);
        __CLR4_4_16o56o5lc8azsri.R.inc(8740);if ((((scalar != 0 && period != null)&&(__CLR4_4_16o56o5lc8azsri.R.iget(8741)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8742)==0&false))) {{
            __CLR4_4_16o56o5lc8azsri.R.inc(8743);for (int i = 0, isize = period.size(); (((i < isize)&&(__CLR4_4_16o56o5lc8azsri.R.iget(8744)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8745)==0&false)); i++) {{
                __CLR4_4_16o56o5lc8azsri.R.inc(8746);long value = period.getValue(i); // use long to allow for multiplication (fits OK)
                __CLR4_4_16o56o5lc8azsri.R.inc(8747);if ((((value != 0)&&(__CLR4_4_16o56o5lc8azsri.R.iget(8748)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8749)==0&false))) {{
                    __CLR4_4_16o56o5lc8azsri.R.inc(8750);instant = period.getFieldType(i).getField(this).add(instant, value * scalar);
                }
            }}
        }}
        }__CLR4_4_16o56o5lc8azsri.R.inc(8751);return instant;
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds the duration to the instant, specifying the number of times to add.
     *
     * @param instant  the instant to add to
     * @param duration  the duration to add
     * @param scalar  the number of times to add
     * @return the updated instant
     */
    public long add(long instant, long duration, int scalar) {try{__CLR4_4_16o56o5lc8azsri.R.inc(8752);
        __CLR4_4_16o56o5lc8azsri.R.inc(8753);if ((((duration == 0 || scalar == 0)&&(__CLR4_4_16o56o5lc8azsri.R.iget(8754)!=0|true))||(__CLR4_4_16o56o5lc8azsri.R.iget(8755)==0&false))) {{
            __CLR4_4_16o56o5lc8azsri.R.inc(8756);return instant;
        }
        }__CLR4_4_16o56o5lc8azsri.R.inc(8757);long add = FieldUtils.safeMultiply(duration, scalar);
        __CLR4_4_16o56o5lc8azsri.R.inc(8758);return FieldUtils.safeAdd(instant, add);
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    // Millis
    //-----------------------------------------------------------------------
    /**
     * Get the millis duration field for this chronology.
     * 
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField millis() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8759);
        __CLR4_4_16o56o5lc8azsri.R.inc(8760);return UnsupportedDurationField.getInstance(DurationFieldType.millis());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the millis of second field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField millisOfSecond() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8761);
        __CLR4_4_16o56o5lc8azsri.R.inc(8762);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfSecond(), millis());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the millis of day field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField millisOfDay() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8763);
        __CLR4_4_16o56o5lc8azsri.R.inc(8764);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfDay(), millis());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    // Second
    //-----------------------------------------------------------------------
    /**
     * Get the seconds duration field for this chronology.
     * 
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField seconds() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8765);
        __CLR4_4_16o56o5lc8azsri.R.inc(8766);return UnsupportedDurationField.getInstance(DurationFieldType.seconds());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the second of minute field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField secondOfMinute() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8767);
        __CLR4_4_16o56o5lc8azsri.R.inc(8768);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfMinute(), seconds());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the second of day field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField secondOfDay() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8769);
        __CLR4_4_16o56o5lc8azsri.R.inc(8770);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfDay(), seconds());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    // Minute
    //-----------------------------------------------------------------------
    /**
     * Get the minutes duration field for this chronology.
     * 
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField minutes() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8771);
        __CLR4_4_16o56o5lc8azsri.R.inc(8772);return UnsupportedDurationField.getInstance(DurationFieldType.minutes());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the minute of hour field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField minuteOfHour() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8773);
        __CLR4_4_16o56o5lc8azsri.R.inc(8774);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfHour(), minutes());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the minute of day field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField minuteOfDay() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8775);
        __CLR4_4_16o56o5lc8azsri.R.inc(8776);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfDay(), minutes());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    // Hour
    //-----------------------------------------------------------------------
    /**
     * Get the hours duration field for this chronology.
     * 
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField hours() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8777);
        __CLR4_4_16o56o5lc8azsri.R.inc(8778);return UnsupportedDurationField.getInstance(DurationFieldType.hours());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the hour of day (0-23) field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField hourOfDay() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8779);
        __CLR4_4_16o56o5lc8azsri.R.inc(8780);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfDay(), hours());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the hour of day (offset to 1-24) field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField clockhourOfDay() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8781);
        __CLR4_4_16o56o5lc8azsri.R.inc(8782);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfDay(), hours());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    // Halfday
    //-----------------------------------------------------------------------
    /**
     * Get the halfdays duration field for this chronology.
     * 
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField halfdays() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8783);
        __CLR4_4_16o56o5lc8azsri.R.inc(8784);return UnsupportedDurationField.getInstance(DurationFieldType.halfdays());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the hour of am/pm (0-11) field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField hourOfHalfday() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8785);
        __CLR4_4_16o56o5lc8azsri.R.inc(8786);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfHalfday(), hours());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the hour of am/pm (offset to 1-12) field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField clockhourOfHalfday() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8787);
        __CLR4_4_16o56o5lc8azsri.R.inc(8788);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfHalfday(), hours());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the AM(0) PM(1) field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField halfdayOfDay() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8789);
        __CLR4_4_16o56o5lc8azsri.R.inc(8790);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.halfdayOfDay(), halfdays());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    // Day
    //-----------------------------------------------------------------------
    /**
     * Get the days duration field for this chronology.
     * 
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField days() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8791);
        __CLR4_4_16o56o5lc8azsri.R.inc(8792);return UnsupportedDurationField.getInstance(DurationFieldType.days());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the day of week field for this chronology.
     *
     * <p>DayOfWeek values are defined in
     * {@link org.joda.time.DateTimeConstants DateTimeConstants}.
     * They use the ISO definitions, where 1 is Monday and 7 is Sunday.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField dayOfWeek() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8793);
        __CLR4_4_16o56o5lc8azsri.R.inc(8794);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfWeek(), days());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the day of month field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField dayOfMonth() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8795);
        __CLR4_4_16o56o5lc8azsri.R.inc(8796);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfMonth(), days());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the day of year field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField dayOfYear() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8797);
        __CLR4_4_16o56o5lc8azsri.R.inc(8798);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfYear(), days());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    // Week
    //-----------------------------------------------------------------------
    /**
     * Get the weeks duration field for this chronology.
     * 
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField weeks() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8799);
        __CLR4_4_16o56o5lc8azsri.R.inc(8800);return UnsupportedDurationField.getInstance(DurationFieldType.weeks());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the week of a week based year field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField weekOfWeekyear() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8801);
        __CLR4_4_16o56o5lc8azsri.R.inc(8802);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekOfWeekyear(), weeks());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    // Weekyear
    //-----------------------------------------------------------------------
    /**
     * Get the weekyears duration field for this chronology.
     * 
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField weekyears() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8803);
        __CLR4_4_16o56o5lc8azsri.R.inc(8804);return UnsupportedDurationField.getInstance(DurationFieldType.weekyears());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the year of a week based year field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField weekyear() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8805);
        __CLR4_4_16o56o5lc8azsri.R.inc(8806);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyear(), weekyears());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the year of a week based year in a century field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField weekyearOfCentury() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8807);
        __CLR4_4_16o56o5lc8azsri.R.inc(8808);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyearOfCentury(), weekyears());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    // Month
    //-----------------------------------------------------------------------
    /**
     * Get the months duration field for this chronology.
     * 
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField months() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8809);
        __CLR4_4_16o56o5lc8azsri.R.inc(8810);return UnsupportedDurationField.getInstance(DurationFieldType.months());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the month of year field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField monthOfYear() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8811);
        __CLR4_4_16o56o5lc8azsri.R.inc(8812);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.monthOfYear(), months());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    // Year
    //-----------------------------------------------------------------------
    /**
     * Get the years duration field for this chronology.
     * 
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField years() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8813);
        __CLR4_4_16o56o5lc8azsri.R.inc(8814);return UnsupportedDurationField.getInstance(DurationFieldType.years());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the year field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField year() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8815);
        __CLR4_4_16o56o5lc8azsri.R.inc(8816);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), years());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the year of era field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField yearOfEra() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8817);
        __CLR4_4_16o56o5lc8azsri.R.inc(8818);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfEra(), years());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the year of century field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField yearOfCentury() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8819);
        __CLR4_4_16o56o5lc8azsri.R.inc(8820);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfCentury(), years());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    // Century
    //-----------------------------------------------------------------------
    /**
     * Get the centuries duration field for this chronology.
     * 
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField centuries() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8821);
        __CLR4_4_16o56o5lc8azsri.R.inc(8822);return UnsupportedDurationField.getInstance(DurationFieldType.centuries());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the century of era field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField centuryOfEra() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8823);
        __CLR4_4_16o56o5lc8azsri.R.inc(8824);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.centuryOfEra(), centuries());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    // Era
    //-----------------------------------------------------------------------
    /**
     * Get the eras duration field for this chronology.
     * 
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField eras() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8825);
        __CLR4_4_16o56o5lc8azsri.R.inc(8826);return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    /**
     * Get the era field for this chronology.
     * 
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField era() {try{__CLR4_4_16o56o5lc8azsri.R.inc(8827);
        __CLR4_4_16o56o5lc8azsri.R.inc(8828);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.era(), eras());
    }finally{__CLR4_4_16o56o5lc8azsri.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets a debugging toString.
     * 
     * @return a debugging string
     */
    public abstract String toString();

}
