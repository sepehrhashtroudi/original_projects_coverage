/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationFieldType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;

/**
 * AbstractPartial provides a standard base implementation of most methods
 * in the ReadablePartial interface.
 * <p>
 * Calculations on are performed using a {@link Chronology}.
 * This chronology is set to be in the UTC time zone for all calculations.
 * <p>
 * The methods on this class use {@link ReadablePartial#size()},
 * {@link AbstractPartial#getField(int, Chronology)} and
 * {@link ReadablePartial#getValue(int)} to calculate their results.
 * Subclasses may have a better implementation.
 * <p>
 * AbstractPartial allows subclasses may be mutable and not thread-safe.
 *
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class AbstractPartial
        implements ReadablePartial, Comparable<ReadablePartial> {public static class __CLR4_4_15qv5qvlc8azsn7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,7598,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    /**
     * Constructor.
     */
    protected AbstractPartial() {
        super();__CLR4_4_15qv5qvlc8azsn7.R.inc(7448);try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7447);
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the field for a specific index in the chronology specified.
     * <p>
     * This method must not use any instance variables.
     * 
     * @param index  the index to retrieve
     * @param chrono  the chronology to use
     * @return the field
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    protected abstract DateTimeField getField(int index, Chronology chrono);

    //-----------------------------------------------------------------------
    /**
     * Gets the field type at the specifed index.
     * 
     * @param index  the index
     * @return the field type
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public DateTimeFieldType getFieldType(int index) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7449);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7450);return getField(index, getChronology()).getType();
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    /**
     * Gets an array of the field types that this partial supports.
     * <p>
     * The fields are returned largest to smallest, for example Hour, Minute, Second.
     *
     * @return the fields supported in an array that may be altered, largest to smallest
     */
    public DateTimeFieldType[] getFieldTypes() {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7451);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7452);DateTimeFieldType[] result = new DateTimeFieldType[size()];
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7453);for (int i = 0; (((i < result.length)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7454)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7455)==0&false)); i++) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7456);result[i] = getFieldType(i);
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7457);return result;
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    /**
     * Gets the field at the specifed index.
     * 
     * @param index  the index
     * @return the field
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public DateTimeField getField(int index) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7458);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7459);return getField(index, getChronology());
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    /**
     * Gets an array of the fields that this partial supports.
     * <p>
     * The fields are returned largest to smallest, for example Hour, Minute, Second.
     *
     * @return the fields supported in an array that may be altered, largest to smallest
     */
    public DateTimeField[] getFields() {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7460);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7461);DateTimeField[] result = new DateTimeField[size()];
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7462);for (int i = 0; (((i < result.length)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7463)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7464)==0&false)); i++) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7465);result[i] = getField(i);
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7466);return result;
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    /**
     * Gets an array of the value of each of the fields that this partial supports.
     * <p>
     * The fields are returned largest to smallest, for example Hour, Minute, Second.
     * Each value corresponds to the same array index as <code>getFields()</code>
     *
     * @return the current values of each field in an array that may be altered, largest to smallest
     */
    public int[] getValues() {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7467);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7468);int[] result = new int[size()];
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7469);for (int i = 0; (((i < result.length)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7470)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7471)==0&false)); i++) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7472);result[i] = getValue(i);
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7473);return result;
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the value of one of the fields of a datetime.
     * <p>
     * The field specified must be one of those that is supported by the partial.
     *
     * @param type  a DateTimeFieldType instance that is supported by this partial
     * @return the value of that field
     * @throws IllegalArgumentException if the field is null or not supported
     */
    public int get(DateTimeFieldType type) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7474);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7475);return getValue(indexOfSupported(type));
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    /**
     * Checks whether the field specified is supported by this partial.
     *
     * @param type  the type to check, may be null which returns false
     * @return true if the field is supported
     */
    public boolean isSupported(DateTimeFieldType type) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7476);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7477);return (indexOf(type) != -1);
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    /**
     * Gets the index of the specified field, or -1 if the field is unsupported.
     *
     * @param type  the type to check, may be null which returns -1
     * @return the index of the field, -1 if unsupported
     */
    public int indexOf(DateTimeFieldType type) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7478);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7479);for (int i = 0, isize = size(); (((i < isize)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7480)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7481)==0&false)); i++) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7482);if ((((getFieldType(i) == type)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7483)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7484)==0&false))) {{
                __CLR4_4_15qv5qvlc8azsn7.R.inc(7485);return i;
            }
        }}
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7486);return -1;
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    /**
     * Gets the index of the specified field, throwing an exception if the
     * field is unsupported.
     *
     * @param type  the type to check, not null
     * @return the index of the field
     * @throws IllegalArgumentException if the field is null or not supported
     */
    protected int indexOfSupported(DateTimeFieldType type) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7487);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7488);int index = indexOf(type);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7489);if ((((index == -1)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7490)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7491)==0&false))) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7492);throw new IllegalArgumentException("Field '" + type + "' is not supported");
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7493);return index;
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    /**
     * Gets the index of the first fields to have the specified duration,
     * or -1 if the field is unsupported.
     *
     * @param type  the type to check, may be null which returns -1
     * @return the index of the field, -1 if unsupported
     */
    protected int indexOf(DurationFieldType type) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7494);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7495);for (int i = 0, isize = size(); (((i < isize)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7496)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7497)==0&false)); i++) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7498);if ((((getFieldType(i).getDurationType() == type)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7499)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7500)==0&false))) {{
                __CLR4_4_15qv5qvlc8azsn7.R.inc(7501);return i;
            }
        }}
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7502);return -1;
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    /**
     * Gets the index of the first fields to have the specified duration,
     * throwing an exception if the field is unsupported.
     *
     * @param type  the type to check, not null
     * @return the index of the field
     * @throws IllegalArgumentException if the field is null or not supported
     */
    protected int indexOfSupported(DurationFieldType type) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7503);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7504);int index = indexOf(type);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7505);if ((((index == -1)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7506)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7507)==0&false))) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7508);throw new IllegalArgumentException("Field '" + type + "' is not supported");
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7509);return index;
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Resolves this partial against another complete instant to create a new
     * full instant. The combination is performed using the chronology of the
     * specified instant.
     * <p>
     * For example, if this partial represents a time, then the result of this
     * method will be the datetime from the specified base instant plus the
     * time from this partial.
     *
     * @param baseInstant  the instant that provides the missing fields, null means now
     * @return the combined datetime
     */
    public DateTime toDateTime(ReadableInstant baseInstant) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7510);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7511);Chronology chrono = DateTimeUtils.getInstantChronology(baseInstant);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7512);long instantMillis = DateTimeUtils.getInstantMillis(baseInstant);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7513);long resolved = chrono.set(this, instantMillis);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7514);return new DateTime(resolved, chrono);
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this ReadablePartial with another returning true if the chronology,
     * field types and values are equal.
     *
     * @param partial  an object to check against
     * @return true if fields and values are equal
     */
    public boolean equals(Object partial) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7515);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7516);if ((((this == partial)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7517)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7518)==0&false))) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7519);return true;
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7520);if ((((partial instanceof ReadablePartial == false)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7521)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7522)==0&false))) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7523);return false;
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7524);ReadablePartial other = (ReadablePartial) partial;
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7525);if ((((size() != other.size())&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7526)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7527)==0&false))) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7528);return false;
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7529);for (int i = 0, isize = size(); (((i < isize)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7530)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7531)==0&false)); i++) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7532);if ((((getValue(i) != other.getValue(i) || getFieldType(i) != other.getFieldType(i))&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7533)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7534)==0&false))) {{
                __CLR4_4_15qv5qvlc8azsn7.R.inc(7535);return false;
            }
        }}
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7536);return FieldUtils.equals(getChronology(), other.getChronology());
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    /**
     * Gets a hash code for the ReadablePartial that is compatible with the 
     * equals method.
     *
     * @return a suitable hash code
     */
    public int hashCode() {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7537);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7538);int total = 157;
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7539);for (int i = 0, isize = size(); (((i < isize)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7540)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7541)==0&false)); i++) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7542);total = 23 * total + getValue(i);
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7543);total = 23 * total + getFieldType(i).hashCode();
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7544);total += getChronology().hashCode();
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7545);return total;
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this partial with another returning an integer
     * indicating the order.
     * <p>
     * The fields are compared in order, from largest to smallest.
     * The first field that is non-equal is used to determine the result.
     * <p>
     * The specified object must be a partial instance whose field types
     * match those of this partial.
     * <p>
     * NOTE: Prior to v2.0, the {@code Comparable} interface was only implemented
     * in this class and not in the {@code ReadablePartial} interface.
     *
     * @param other  an object to check against
     * @return negative if this is less, zero if equal, positive if greater
     * @throws ClassCastException if the partial is the wrong class
     *  or if it has field types that don't match
     * @throws NullPointerException if the partial is null
     * @since 1.1
     */
    public int compareTo(ReadablePartial other) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7546);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7547);if ((((this == other)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7548)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7549)==0&false))) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7550);return 0;
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7551);if ((((size() != other.size())&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7552)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7553)==0&false))) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7554);throw new ClassCastException("ReadablePartial objects must have matching field types");
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7555);for (int i = 0, isize = size(); (((i < isize)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7556)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7557)==0&false)); i++) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7558);if ((((getFieldType(i) != other.getFieldType(i))&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7559)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7560)==0&false))) {{
                __CLR4_4_15qv5qvlc8azsn7.R.inc(7561);throw new ClassCastException("ReadablePartial objects must have matching field types");
            }
        }}
        // fields are ordered largest first
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7562);for (int i = 0, isize = size(); (((i < isize)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7563)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7564)==0&false)); i++) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7565);if ((((getValue(i) > other.getValue(i))&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7566)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7567)==0&false))) {{
                __CLR4_4_15qv5qvlc8azsn7.R.inc(7568);return 1;
            }
            }__CLR4_4_15qv5qvlc8azsn7.R.inc(7569);if ((((getValue(i) < other.getValue(i))&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7570)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7571)==0&false))) {{
                __CLR4_4_15qv5qvlc8azsn7.R.inc(7572);return -1;
            }
        }}
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7573);return 0;
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    /**
     * Is this partial later than the specified partial.
     * <p>
     * The fields are compared in order, from largest to smallest.
     * The first field that is non-equal is used to determine the result.
     * <p>
     * You may not pass null into this method. This is because you need
     * a time zone to accurately determine the current date.
     *
     * @param partial  a partial to check against, must not be null
     * @return true if this date is after the date passed in
     * @throws IllegalArgumentException if the specified partial is null
     * @throws ClassCastException if the partial has field types that don't match
     * @since 1.1
     */
    public boolean isAfter(ReadablePartial partial) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7574);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7575);if ((((partial == null)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7576)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7577)==0&false))) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7578);throw new IllegalArgumentException("Partial cannot be null");
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7579);return compareTo(partial) > 0;
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    /**
     * Is this partial earlier than the specified partial.
     * <p>
     * The fields are compared in order, from largest to smallest.
     * The first field that is non-equal is used to determine the result.
     * <p>
     * You may not pass null into this method. This is because you need
     * a time zone to accurately determine the current date.
     *
     * @param partial  a partial to check against, must not be null
     * @return true if this date is before the date passed in
     * @throws IllegalArgumentException if the specified partial is null
     * @throws ClassCastException if the partial has field types that don't match
     * @since 1.1
     */
    public boolean isBefore(ReadablePartial partial) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7580);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7581);if ((((partial == null)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7582)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7583)==0&false))) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7584);throw new IllegalArgumentException("Partial cannot be null");
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7585);return compareTo(partial) < 0;
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    /**
     * Is this partial the same as the specified partial.
     * <p>
     * The fields are compared in order, from largest to smallest.
     * If all fields are equal, the result is true.
     * <p>
     * You may not pass null into this method. This is because you need
     * a time zone to accurately determine the current date.
     *
     * @param partial  a partial to check against, must not be null
     * @return true if this date is the same as the date passed in
     * @throws IllegalArgumentException if the specified partial is null
     * @throws ClassCastException if the partial has field types that don't match
     * @since 1.1
     */
    public boolean isEqual(ReadablePartial partial) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7586);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7587);if ((((partial == null)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7588)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7589)==0&false))) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7590);throw new IllegalArgumentException("Partial cannot be null");
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7591);return compareTo(partial) == 0;
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Uses the specified formatter to convert this partial to a String.
     *
     * @param formatter  the formatter to use, null means use <code>toString()</code>.
     * @return the formatted string
     * @since 1.1
     */
    public String toString(DateTimeFormatter formatter) {try{__CLR4_4_15qv5qvlc8azsn7.R.inc(7592);
        __CLR4_4_15qv5qvlc8azsn7.R.inc(7593);if ((((formatter == null)&&(__CLR4_4_15qv5qvlc8azsn7.R.iget(7594)!=0|true))||(__CLR4_4_15qv5qvlc8azsn7.R.iget(7595)==0&false))) {{
            __CLR4_4_15qv5qvlc8azsn7.R.inc(7596);return toString();
        }
        }__CLR4_4_15qv5qvlc8azsn7.R.inc(7597);return formatter.print(this);
    }finally{__CLR4_4_15qv5qvlc8azsn7.R.flushNeeded();}}

}
