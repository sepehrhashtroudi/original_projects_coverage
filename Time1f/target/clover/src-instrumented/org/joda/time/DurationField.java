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
package org.joda.time;

/**
 * Defines the calculation engine for duration fields.
 * The interface defines a set of methods that manipulate a millisecond duration
 * with regards to a single field, such as months or seconds.
 * <p>
 * This design is extensible so, if you wish, you can extract a different field from
 * the millisecond duration. A number of standard implementations are provided to assist.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public abstract class DurationField implements Comparable<DurationField> {public static class __CLR4_4_11h71h7lc8azrvn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,1927,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Get the type of the field.
     * 
     * @return field type
     */
    public abstract DurationFieldType getType();

    /**
     * Get the name of the field.
     * <p>
     * By convention, names are plural.
     * 
     * @return field name
     */
    public abstract String getName();

    /**
     * Returns true if this field is supported.
     * 
     * @return true if this field is supported
     */
    public abstract boolean isSupported();

    /**
     * Is this field precise. A precise field can calculate its value from
     * milliseconds without needing a reference date. Put another way, a
     * precise field's unit size is not variable.
     * 
     * @return true if precise
     * @see #getUnitMillis()
     */
    public abstract boolean isPrecise();
    
    /**
     * Returns the amount of milliseconds per unit value of this field. For
     * example, if this field represents "seconds", then this returns the
     * milliseconds in one second.
     * <p>
     * For imprecise fields, the unit size is variable, and so this method
     * returns a suitable average value.
     *
     * @return the unit size of this field, in milliseconds
     * @see #isPrecise()
     */
    public abstract long getUnitMillis();

    //------------------------------------------------------------------------
    /**
     * Get the value of this field from the milliseconds, which is approximate
     * if this field is imprecise.
     *
     * @param duration  the milliseconds to query, which may be negative
     * @return the value of the field, in the units of the field, which may be
     * negative
     * @throws ArithmeticException if the value is too large for an int
     */
    public abstract int getValue(long duration);

    /**
     * Get the value of this field from the milliseconds, which is approximate
     * if this field is imprecise.
     *
     * @param duration  the milliseconds to query, which may be negative
     * @return the value of the field, in the units of the field, which may be
     * negative
     */
    public abstract long getValueAsLong(long duration);

    /**
     * Get the value of this field from the milliseconds relative to an
     * instant. For precise fields this method produces the same result as for
     * the single argument get method.
     * <p>
     * If the millisecond duration is positive, then the instant is treated as a
     * "start instant". If negative, the instant is treated as an "end instant".
     * 
     * @param duration  the milliseconds to query, which may be negative
     * @param instant  the start instant to calculate relative to
     * @return the value of the field, in the units of the field, which may be
     * negative
     * @throws ArithmeticException if the value is too large for an int
     */
    public abstract int getValue(long duration, long instant);

    /**
     * Get the value of this field from the milliseconds relative to an
     * instant. For precise fields this method produces the same result as for
     * the single argument get method.
     * <p>
     * If the millisecond duration is positive, then the instant is treated as a
     * "start instant". If negative, the instant is treated as an "end instant".
     * 
     * @param duration  the milliseconds to query, which may be negative
     * @param instant  the start instant to calculate relative to
     * @return the value of the field, in the units of the field, which may be
     * negative
     */
    public abstract long getValueAsLong(long duration, long instant);

    //------------------------------------------------------------------------
    /**
     * Get the millisecond duration of this field from its value, which is
     * approximate if this field is imprecise.
     * 
     * @param value  the value of the field, which may be negative
     * @return the milliseconds that the field represents, which may be
     * negative
     */
    public abstract long getMillis(int value);

    /**
     * Get the millisecond duration of this field from its value, which is
     * approximate if this field is imprecise.
     * 
     * @param value  the value of the field, which may be negative
     * @return the milliseconds that the field represents, which may be
     * negative
     */
    public abstract long getMillis(long value);

    /**
     * Get the millisecond duration of this field from its value relative to an
     * instant. For precise fields this method produces the same result as for
     * the single argument getMillis method.
     * <p>
     * If the value is positive, then the instant is treated as a "start
     * instant". If negative, the instant is treated as an "end instant".
     *
     * @param value  the value of the field, which may be negative
     * @param instant  the instant to calculate relative to
     * @return the millisecond duration that the field represents, which may be
     * negative
     */
    public abstract long getMillis(int value, long instant);

    /**
     * Get the millisecond duration of this field from its value relative to an
     * instant. For precise fields this method produces the same result as for
     * the single argument getMillis method.
     * <p>
     * If the value is positive, then the instant is treated as a "start
     * instant". If negative, the instant is treated as an "end instant".
     *
     * @param value  the value of the field, which may be negative
     * @param instant  the instant to calculate relative to
     * @return the millisecond duration that the field represents, which may be
     * negative
     */
    public abstract long getMillis(long value, long instant);

    /**
     * Adds a duration value (which may be negative) to the instant.
     * 
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to add to
     * @param value  the value to add, in the units of the field
     * @return the updated milliseconds
     */
    public abstract long add(long instant, int value);

    /**
     * Adds a duration value (which may be negative) to the instant.
     * 
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to add to
     * @param value  the value to add, in the units of the field
     * @return the updated milliseconds
     */
    public abstract long add(long instant, long value);

    /**
     * Subtracts a duration value (which may be negative) from the instant.
     * 
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to subtract from
     * @param value  the value to subtract, in the units of the field
     * @return the updated milliseconds
     * @since 1.1
     */
    public long subtract(long instant, int value) {try{__CLR4_4_11h71h7lc8azrvn.R.inc(1915);
        __CLR4_4_11h71h7lc8azrvn.R.inc(1916);if ((((value == Integer.MIN_VALUE)&&(__CLR4_4_11h71h7lc8azrvn.R.iget(1917)!=0|true))||(__CLR4_4_11h71h7lc8azrvn.R.iget(1918)==0&false))) {{
            __CLR4_4_11h71h7lc8azrvn.R.inc(1919);return subtract(instant, (long) value);
        }
        }__CLR4_4_11h71h7lc8azrvn.R.inc(1920);return add(instant, -value);
    }finally{__CLR4_4_11h71h7lc8azrvn.R.flushNeeded();}}

    /**
     * Subtracts a duration value (which may be negative) from the instant.
     * 
     * @param instant  the milliseconds from 1970-01-01T00:00:00Z to subtract from
     * @param value  the value to subtract, in the units of the field
     * @return the updated milliseconds
     * @since 1.1
     */
    public long subtract(long instant, long value) {try{__CLR4_4_11h71h7lc8azrvn.R.inc(1921);
        __CLR4_4_11h71h7lc8azrvn.R.inc(1922);if ((((value == Long.MIN_VALUE)&&(__CLR4_4_11h71h7lc8azrvn.R.iget(1923)!=0|true))||(__CLR4_4_11h71h7lc8azrvn.R.iget(1924)==0&false))) {{
            __CLR4_4_11h71h7lc8azrvn.R.inc(1925);throw new ArithmeticException("Long.MIN_VALUE cannot be negated");
        }
        }__CLR4_4_11h71h7lc8azrvn.R.inc(1926);return add(instant, -value);
    }finally{__CLR4_4_11h71h7lc8azrvn.R.flushNeeded();}}

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
    public abstract int getDifference(long minuendInstant, long subtrahendInstant);

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
    public abstract long getDifferenceAsLong(long minuendInstant, long subtrahendInstant);

    // Adding this definition would be backwards incompatible with earlier subclasses
    // This definition of compareTo was present in previous versions, and still applies
//    /**
//     * Compares this duration field with another duration field for ascending
//     * unit millisecond order. This ordering is inconsistent with equals, as it
//     * ignores name and precision.
//     *
//     * @param durationField  a duration field to check against
//     * @return negative value if this is less, 0 if equal, or positive value if greater
//     * @throws NullPointerException if the object is null
//     * @throws ClassCastException if the object type is not supported
//     */
//    public abstract int compareTo(DurationField durationField);

    /**
     * Returns a localized unit name of this field, using the given value as an
     * aid. For example, the unit name may differ if it is plural.
     *
     * @param value the duration value to use for selecting a unit name
     * @param locale the locale to use for selecting a name, null for default
     */
    //String getUnitName(long value, Locale locale);

    /**
     * Returns a localized unit name of this field, using the given value as an
     * aid. For example, the unit name may differ if it is plural.
     *
     * @param value the duration value to use for selecting a unit name
     */
    //String getUnitName(long value);

    /**
     * Get the maximum length string returned by getUnitName.
     * 
     * @param locale the locale to use for selecting a unit name, null for
     * default
     * @return the maximum name length
     */
    //int getMaximumUnitNameLength(Locale locale);

    //------------------------------------------------------------------------
    /**
     * Get a suitable debug string.
     * 
     * @return debug string
     */
    public abstract String toString();
    
}
