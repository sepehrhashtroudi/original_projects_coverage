/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

import org.joda.convert.ToString;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * AbstractPeriod provides the common behaviour for period classes.
 * <p>
 * This class should generally not be used directly by API users. The 
 * {@link ReadablePeriod} interface should be used when different 
 * kinds of periods are to be referenced.
 * <p>
 * AbstractPeriod subclasses may be mutable and not thread-safe.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class AbstractPeriod implements ReadablePeriod {public static class __CLR4_4_15v25v2lc8azsni{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,7671,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructor.
     */
    protected AbstractPeriod() {
        super();__CLR4_4_15v25v2lc8azsni.R.inc(7599);try{__CLR4_4_15v25v2lc8azsni.R.inc(7598);
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the number of fields that this period supports.
     *
     * @return the number of fields supported
     * @since 2.0 (previously on BasePeriod)
     */
    public int size() {try{__CLR4_4_15v25v2lc8azsni.R.inc(7600);
        __CLR4_4_15v25v2lc8azsni.R.inc(7601);return getPeriodType().size();
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

    /**
     * Gets the field type at the specified index.
     *
     * @param index  the index to retrieve
     * @return the field at the specified index
     * @throws IndexOutOfBoundsException if the index is invalid
     * @since 2.0 (previously on BasePeriod)
     */
    public DurationFieldType getFieldType(int index) {try{__CLR4_4_15v25v2lc8azsni.R.inc(7602);
        __CLR4_4_15v25v2lc8azsni.R.inc(7603);return getPeriodType().getFieldType(index);
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

    /**
     * Gets an array of the field types that this period supports.
     * <p>
     * The fields are returned largest to smallest, for example Hours, Minutes, Seconds.
     *
     * @return the fields supported in an array that may be altered, largest to smallest
     */
    public DurationFieldType[] getFieldTypes() {try{__CLR4_4_15v25v2lc8azsni.R.inc(7604);
        __CLR4_4_15v25v2lc8azsni.R.inc(7605);DurationFieldType[] result = new DurationFieldType[size()];
        __CLR4_4_15v25v2lc8azsni.R.inc(7606);for (int i = 0; (((i < result.length)&&(__CLR4_4_15v25v2lc8azsni.R.iget(7607)!=0|true))||(__CLR4_4_15v25v2lc8azsni.R.iget(7608)==0&false)); i++) {{
            __CLR4_4_15v25v2lc8azsni.R.inc(7609);result[i] = getFieldType(i);
        }
        }__CLR4_4_15v25v2lc8azsni.R.inc(7610);return result;
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

    /**
     * Gets an array of the value of each of the fields that this period supports.
     * <p>
     * The fields are returned largest to smallest, for example Hours, Minutes, Seconds.
     * Each value corresponds to the same array index as <code>getFields()</code>
     *
     * @return the current values of each field in an array that may be altered, largest to smallest
     */
    public int[] getValues() {try{__CLR4_4_15v25v2lc8azsni.R.inc(7611);
        __CLR4_4_15v25v2lc8azsni.R.inc(7612);int[] result = new int[size()];
        __CLR4_4_15v25v2lc8azsni.R.inc(7613);for (int i = 0; (((i < result.length)&&(__CLR4_4_15v25v2lc8azsni.R.iget(7614)!=0|true))||(__CLR4_4_15v25v2lc8azsni.R.iget(7615)==0&false)); i++) {{
            __CLR4_4_15v25v2lc8azsni.R.inc(7616);result[i] = getValue(i);
        }
        }__CLR4_4_15v25v2lc8azsni.R.inc(7617);return result;
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value of one of the fields.
     * <p>
     * If the field type specified is not supported by the period then zero
     * is returned.
     *
     * @param type  the field type to query, null returns zero
     * @return the value of that field, zero if field not supported
     */
    public int get(DurationFieldType type) {try{__CLR4_4_15v25v2lc8azsni.R.inc(7618);
        __CLR4_4_15v25v2lc8azsni.R.inc(7619);int index = indexOf(type);
        __CLR4_4_15v25v2lc8azsni.R.inc(7620);if ((((index == -1)&&(__CLR4_4_15v25v2lc8azsni.R.iget(7621)!=0|true))||(__CLR4_4_15v25v2lc8azsni.R.iget(7622)==0&false))) {{
            __CLR4_4_15v25v2lc8azsni.R.inc(7623);return 0;
        }
        }__CLR4_4_15v25v2lc8azsni.R.inc(7624);return getValue(index);
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

    /**
     * Checks whether the field specified is supported by this period.
     *
     * @param type  the type to check, may be null which returns false
     * @return true if the field is supported
     */
    public boolean isSupported(DurationFieldType type) {try{__CLR4_4_15v25v2lc8azsni.R.inc(7625);
        __CLR4_4_15v25v2lc8azsni.R.inc(7626);return getPeriodType().isSupported(type);
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

    /**
     * Gets the index of the field in this period.
     *
     * @param type  the type to check, may be null which returns -1
     * @return the index of -1 if not supported
     */
    public int indexOf(DurationFieldType type) {try{__CLR4_4_15v25v2lc8azsni.R.inc(7627);
        __CLR4_4_15v25v2lc8azsni.R.inc(7628);return getPeriodType().indexOf(type);
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get this period as an immutable <code>Period</code> object.
     * 
     * @return a Period using the same field set and values
     */
    public Period toPeriod() {try{__CLR4_4_15v25v2lc8azsni.R.inc(7629);
        __CLR4_4_15v25v2lc8azsni.R.inc(7630);return new Period(this);
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

    /**
     * Get this object as a <code>MutablePeriod</code>.
     * <p>
     * This will always return a new <code>MutablePeriod</code> with the same fields.
     * 
     * @return a MutablePeriod using the same field set and values
     */
    public MutablePeriod toMutablePeriod() {try{__CLR4_4_15v25v2lc8azsni.R.inc(7631);
        __CLR4_4_15v25v2lc8azsni.R.inc(7632);return new MutablePeriod(this);
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object with the specified object for equality based
     * on the value of each field. All ReadablePeriod instances are accepted.
     * <p>
     * Note that a period of 1 day is not equal to a period of 24 hours,
     * nor is 1 hour equal to 60 minutes. Only periods with the same amount
     * in each field are equal.
     * <p>
     * This is because periods represent an abstracted definition of a time
     * period (eg. a day may not actually be 24 hours, it might be 23 or 25
     * at daylight savings boundary).
     * <p>
     * To compare the actual duration of two periods, convert both to
     * {@link org.joda.time.Duration Duration}s, an operation that emphasises
     * that the result may differ according to the date you choose.
     *
     * @param period  a readable period to check against
     * @return true if all the field values are equal, false if
     *  not or the period is null or of an incorrect type
     */
    public boolean equals(Object period) {try{__CLR4_4_15v25v2lc8azsni.R.inc(7633);
        __CLR4_4_15v25v2lc8azsni.R.inc(7634);if ((((this == period)&&(__CLR4_4_15v25v2lc8azsni.R.iget(7635)!=0|true))||(__CLR4_4_15v25v2lc8azsni.R.iget(7636)==0&false))) {{
            __CLR4_4_15v25v2lc8azsni.R.inc(7637);return true;
        }
        }__CLR4_4_15v25v2lc8azsni.R.inc(7638);if ((((period instanceof ReadablePeriod == false)&&(__CLR4_4_15v25v2lc8azsni.R.iget(7639)!=0|true))||(__CLR4_4_15v25v2lc8azsni.R.iget(7640)==0&false))) {{
            __CLR4_4_15v25v2lc8azsni.R.inc(7641);return false;
        }
        }__CLR4_4_15v25v2lc8azsni.R.inc(7642);ReadablePeriod other = (ReadablePeriod) period;
        __CLR4_4_15v25v2lc8azsni.R.inc(7643);if ((((size() != other.size())&&(__CLR4_4_15v25v2lc8azsni.R.iget(7644)!=0|true))||(__CLR4_4_15v25v2lc8azsni.R.iget(7645)==0&false))) {{
            __CLR4_4_15v25v2lc8azsni.R.inc(7646);return false;
        }
        }__CLR4_4_15v25v2lc8azsni.R.inc(7647);for (int i = 0, isize = size(); (((i < isize)&&(__CLR4_4_15v25v2lc8azsni.R.iget(7648)!=0|true))||(__CLR4_4_15v25v2lc8azsni.R.iget(7649)==0&false)); i++) {{
            __CLR4_4_15v25v2lc8azsni.R.inc(7650);if ((((getValue(i) != other.getValue(i) || getFieldType(i) != other.getFieldType(i))&&(__CLR4_4_15v25v2lc8azsni.R.iget(7651)!=0|true))||(__CLR4_4_15v25v2lc8azsni.R.iget(7652)==0&false))) {{
                __CLR4_4_15v25v2lc8azsni.R.inc(7653);return false;
            }
        }}
        }__CLR4_4_15v25v2lc8azsni.R.inc(7654);return true;
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

    /**
     * Gets a hash code for the period as defined by ReadablePeriod.
     *
     * @return a hash code
     */
    public int hashCode() {try{__CLR4_4_15v25v2lc8azsni.R.inc(7655);
        __CLR4_4_15v25v2lc8azsni.R.inc(7656);int total = 17;
        __CLR4_4_15v25v2lc8azsni.R.inc(7657);for (int i = 0, isize = size(); (((i < isize)&&(__CLR4_4_15v25v2lc8azsni.R.iget(7658)!=0|true))||(__CLR4_4_15v25v2lc8azsni.R.iget(7659)==0&false)); i++) {{
            __CLR4_4_15v25v2lc8azsni.R.inc(7660);total = 27 * total + getValue(i);
            __CLR4_4_15v25v2lc8azsni.R.inc(7661);total = 27 * total + getFieldType(i).hashCode();
        }
        }__CLR4_4_15v25v2lc8azsni.R.inc(7662);return total;
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a String in the ISO8601 duration format.
     * <p>
     * For example, "PT6H3M7S" represents 6 hours, 3 minutes, 7 seconds.
     * <p>
     * For more control over the output, see
     * {@link org.joda.time.format.PeriodFormatterBuilder PeriodFormatterBuilder}.
     *
     * @return the value as an ISO8601 string
     */
    @ToString
    public String toString() {try{__CLR4_4_15v25v2lc8azsni.R.inc(7663);
        __CLR4_4_15v25v2lc8azsni.R.inc(7664);return ISOPeriodFormat.standard().print(this);
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Uses the specified formatter to convert this period to a String.
     *
     * @param formatter  the formatter to use, null means use <code>toString()</code>.
     * @return the formatted string
     * @since 1.5
     */
    public String toString(PeriodFormatter formatter) {try{__CLR4_4_15v25v2lc8azsni.R.inc(7665);
        __CLR4_4_15v25v2lc8azsni.R.inc(7666);if ((((formatter == null)&&(__CLR4_4_15v25v2lc8azsni.R.iget(7667)!=0|true))||(__CLR4_4_15v25v2lc8azsni.R.iget(7668)==0&false))) {{
            __CLR4_4_15v25v2lc8azsni.R.inc(7669);return toString();
        }
        }__CLR4_4_15v25v2lc8azsni.R.inc(7670);return formatter.print(this);
    }finally{__CLR4_4_15v25v2lc8azsni.R.flushNeeded();}}

}
