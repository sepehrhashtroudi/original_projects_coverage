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
package org.joda.time.base;

import java.io.Serializable;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;

/**
 * BaseSingleFieldPeriod is an abstract implementation of ReadablePeriod that
 * manages a single duration field, such as days or minutes.
 * <p>
 * This class should generally not be used directly by API users.
 * The {@link ReadablePeriod} interface should be used when different 
 * kinds of period objects are to be referenced.
 * <p>
 * BaseSingleFieldPeriod subclasses may be mutable and not thread-safe.
 *
 * @author Stephen Colebourne
 * @since 1.4
 */
public abstract class BaseSingleFieldPeriod
        implements ReadablePeriod, Comparable<BaseSingleFieldPeriod>, Serializable {public static class __CLR4_4_16a26a2lc8azsq7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,8257,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version. */
    private static final long serialVersionUID = 9386874258972L;
    /** The start of 1972. */
    private static final long START_1972 = 2L * 365L * 86400L * 1000L;

    /** The period in the units of this period. */
    private volatile int iPeriod;

    //-----------------------------------------------------------------------
    /**
     * Calculates the number of whole units between the two specified datetimes.
     *
     * @param start  the start instant, validated to not be null
     * @param end  the end instant, validated to not be null
     * @param field  the field type to use, must not be null
     * @return the period
     * @throws IllegalArgumentException if the instants are null or invalid
     */
    protected static int between(ReadableInstant start, ReadableInstant end, DurationFieldType field) {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8138);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8139);if ((((start == null || end == null)&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8140)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8141)==0&false))) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8142);throw new IllegalArgumentException("ReadableInstant objects must not be null");
        }
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8143);Chronology chrono = DateTimeUtils.getInstantChronology(start);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8144);int amount = field.getField(chrono).getDifference(end.getMillis(), start.getMillis());
        __CLR4_4_16a26a2lc8azsq7.R.inc(8145);return amount;
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Calculates the number of whole units between the two specified partial datetimes.
     * <p>
     * The two partials must contain the same fields, for example you can specify
     * two <code>LocalDate</code> objects.
     *
     * @param start  the start partial date, validated to not be null
     * @param end  the end partial date, validated to not be null
     * @param zeroInstance  the zero instance constant, must not be null
     * @return the period
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    protected static int between(ReadablePartial start, ReadablePartial end, ReadablePeriod zeroInstance) {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8146);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8147);if ((((start == null || end == null)&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8148)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8149)==0&false))) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8150);throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8151);if ((((start.size() != end.size())&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8152)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8153)==0&false))) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8154);throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8155);for (int i = 0, isize = start.size(); (((i < isize)&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8156)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8157)==0&false)); i++) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8158);if ((((start.getFieldType(i) != end.getFieldType(i))&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8159)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8160)==0&false))) {{
                __CLR4_4_16a26a2lc8azsq7.R.inc(8161);throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
        }}
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8162);if ((((DateTimeUtils.isContiguous(start) == false)&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8163)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8164)==0&false))) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8165);throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
        }
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8166);Chronology chrono = DateTimeUtils.getChronology(start.getChronology()).withUTC();
        __CLR4_4_16a26a2lc8azsq7.R.inc(8167);int[] values = chrono.get(zeroInstance, chrono.set(start, START_1972), chrono.set(end, START_1972));
        __CLR4_4_16a26a2lc8azsq7.R.inc(8168);return values[0];
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    /**
     * Creates a new instance representing the number of complete standard length units
     * in the specified period.
     * <p>
     * This factory method converts all fields from the period to hours using standardised
     * durations for each field. Only those fields which have a precise duration in
     * the ISO UTC chronology can be converted.
     * <ul>
     * <li>One week consists of 7 days.
     * <li>One day consists of 24 hours.
     * <li>One hour consists of 60 minutes.
     * <li>One minute consists of 60 seconds.
     * <li>One second consists of 1000 milliseconds.
     * </ul>
     * Months and Years are imprecise and periods containing these values cannot be converted.
     *
     * @param period  the period to get the number of hours from, must not be null
     * @param millisPerUnit  the number of milliseconds in one standard unit of this period
     * @throws IllegalArgumentException if the period contains imprecise duration values
     */
    protected static int standardPeriodIn(ReadablePeriod period, long millisPerUnit) {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8169);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8170);if ((((period == null)&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8171)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8172)==0&false))) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8173);return 0;
        }
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8174);Chronology iso = ISOChronology.getInstanceUTC();
        __CLR4_4_16a26a2lc8azsq7.R.inc(8175);long duration = 0L;
        __CLR4_4_16a26a2lc8azsq7.R.inc(8176);for (int i = 0; (((i < period.size())&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8177)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8178)==0&false)); i++) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8179);int value = period.getValue(i);
            __CLR4_4_16a26a2lc8azsq7.R.inc(8180);if ((((value != 0)&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8181)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8182)==0&false))) {{
                __CLR4_4_16a26a2lc8azsq7.R.inc(8183);DurationField field = period.getFieldType(i).getField(iso);
                __CLR4_4_16a26a2lc8azsq7.R.inc(8184);if ((((field.isPrecise() == false)&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8185)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8186)==0&false))) {{
                    __CLR4_4_16a26a2lc8azsq7.R.inc(8187);throw new IllegalArgumentException(
                            "Cannot convert period to duration as " + field.getName() +
                            " is not precise in the period " + period);
                }
                }__CLR4_4_16a26a2lc8azsq7.R.inc(8188);duration = FieldUtils.safeAdd(duration, FieldUtils.safeMultiply(field.getUnitMillis(), value));
            }
        }}
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8189);return FieldUtils.safeToInt(duration / millisPerUnit);
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new instance representing the specified period.
     *
     * @param period  the period to represent
     */
    protected BaseSingleFieldPeriod(int period) {
        super();__CLR4_4_16a26a2lc8azsq7.R.inc(8191);try{__CLR4_4_16a26a2lc8azsq7.R.inc(8190);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8192);iPeriod = period;
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the amount of this period.
     *
     * @return the period value
     */
    protected int getValue() {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8193);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8194);return iPeriod;
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    /**
     * Sets the amount of this period.
     * To make a subclass immutable you must declare it final, or block this method.
     *
     * @param value  the period value
     */
    protected void setValue(int value) {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8195);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8196);iPeriod = value;
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the single duration field type.
     *
     * @return the duration field type, not null
     */
    public abstract DurationFieldType getFieldType();

    /**
     * Gets the period type which matches the duration field type.
     *
     * @return the period type, not null
     */
    public abstract PeriodType getPeriodType();

    //-----------------------------------------------------------------------
    /**
     * Gets the number of fields that this period supports, which is one.
     *
     * @return the number of fields supported, which is one
     */
    public int size() {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8197);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8198);return 1;
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    /**
     * Gets the field type at the specified index.
     * <p>
     * The only index supported by this period is zero which returns the
     * field type of this class.
     *
     * @param index  the index to retrieve, which must be zero
     * @return the field at the specified index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public DurationFieldType getFieldType(int index) {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8199);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8200);if ((((index != 0)&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8201)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8202)==0&false))) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8203);throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8204);return getFieldType();
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    /**
     * Gets the value at the specified index.
     * <p>
     * The only index supported by this period is zero.
     *
     * @param index  the index to retrieve, which must be zero
     * @return the value of the field at the specified index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public int getValue(int index) {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8205);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8206);if ((((index != 0)&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8207)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8208)==0&false))) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8209);throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8210);return getValue();
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    /**
     * Gets the value of a duration field represented by this period.
     * <p>
     * If the field type specified does not match the type used by this class
     * then zero is returned.
     *
     * @param type  the field type to query, null returns zero
     * @return the value of that field, zero if field not supported
     */
    public int get(DurationFieldType type) {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8211);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8212);if ((((type == getFieldType())&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8213)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8214)==0&false))) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8215);return getValue();
        }
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8216);return 0;
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    /**
     * Checks whether the duration field specified is supported by this period.
     *
     * @param type  the type to check, may be null which returns false
     * @return true if the field is supported
     */
    public boolean isSupported(DurationFieldType type) {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8217);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8218);return (type == getFieldType());
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get this period as an immutable <code>Period</code> object.
     * The period will use <code>PeriodType.standard()</code>.
     *
     * @return a <code>Period</code> representing the same number of days
     */
    public Period toPeriod() {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8219);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8220);return Period.ZERO.withFields(this);
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    /**
     * Get this object as a <code>MutablePeriod</code>.
     * <p>
     * This will always return a new <code>MutablePeriod</code> with the same fields.
     * The period will use <code>PeriodType.standard()</code>.
     * 
     * @return a MutablePeriod using the same field set and values
     */
    public MutablePeriod toMutablePeriod() {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8221);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8222);MutablePeriod period = new MutablePeriod();
        __CLR4_4_16a26a2lc8azsq7.R.inc(8223);period.add(this);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8224);return period;
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object with the specified object for equality based on the
     * value of each field. All ReadablePeriod instances are accepted, but only
     * those with a matching <code>PeriodType</code> can return true.
     *
     * @param period  a readable period to check against
     * @return true if all the field values are equal, false if
     *  not or the period is null or of an incorrect type
     */
    public boolean equals(Object period) {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8225);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8226);if ((((this == period)&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8227)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8228)==0&false))) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8229);return true;
        }
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8230);if ((((period instanceof ReadablePeriod == false)&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8231)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8232)==0&false))) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8233);return false;
        }
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8234);ReadablePeriod other = (ReadablePeriod) period;
        __CLR4_4_16a26a2lc8azsq7.R.inc(8235);return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    /**
     * Gets a hash code for the period as defined by ReadablePeriod.
     *
     * @return a hash code
     */
    public int hashCode() {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8236);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8237);int total = 17;
        __CLR4_4_16a26a2lc8azsq7.R.inc(8238);total = 27 * total + getValue();
        __CLR4_4_16a26a2lc8azsq7.R.inc(8239);total = 27 * total + getFieldType().hashCode();
        __CLR4_4_16a26a2lc8azsq7.R.inc(8240);return total;
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

    /**
     * Compares this period to another object of the same class.
     *
     * @param other  the other period, must not be null
     * @return zero if equal, positive if greater, negative if less
     * @throws NullPointerException if the other period is null
     * @throws ClassCastException if the other period is of a different type
     */
    public int compareTo(BaseSingleFieldPeriod other) {try{__CLR4_4_16a26a2lc8azsq7.R.inc(8241);
        __CLR4_4_16a26a2lc8azsq7.R.inc(8242);if ((((other.getClass() != getClass())&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8243)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8244)==0&false))) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8245);throw new ClassCastException(getClass() + " cannot be compared to " + other.getClass());
        }
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8246);int otherValue = other.getValue();
        __CLR4_4_16a26a2lc8azsq7.R.inc(8247);int thisValue = getValue();
        __CLR4_4_16a26a2lc8azsq7.R.inc(8248);if ((((thisValue > otherValue)&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8249)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8250)==0&false))) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8251);return 1;
        }
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8252);if ((((thisValue < otherValue)&&(__CLR4_4_16a26a2lc8azsq7.R.iget(8253)!=0|true))||(__CLR4_4_16a26a2lc8azsq7.R.iget(8254)==0&false))) {{
            __CLR4_4_16a26a2lc8azsq7.R.inc(8255);return -1;
        }
        }__CLR4_4_16a26a2lc8azsq7.R.inc(8256);return 0;
    }finally{__CLR4_4_16a26a2lc8azsq7.R.flushNeeded();}}

}
