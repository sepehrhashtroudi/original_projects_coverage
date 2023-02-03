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
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.format.FormatUtils;

/**
 * AbstractDuration provides the common behaviour for duration classes.
 * <p>
 * This class should generally not be used directly by API users. The 
 * {@link ReadableDuration} interface should be used when different 
 * kinds of durations are to be referenced.
 * <p>
 * AbstractDuration subclasses may be mutable and not thread-safe.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class AbstractDuration implements ReadableDuration {public static class __CLR4_4_15ik5iklc8azslv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,7219,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructor.
     */
    protected AbstractDuration() {
        super();__CLR4_4_15ik5iklc8azslv.R.inc(7149);try{__CLR4_4_15ik5iklc8azslv.R.inc(7148);
    }finally{__CLR4_4_15ik5iklc8azslv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get this duration as an immutable <code>Duration</code> object.
     * 
     * @return a Duration created using the millisecond duration from this instance
     */
    public Duration toDuration() {try{__CLR4_4_15ik5iklc8azslv.R.inc(7150);
        __CLR4_4_15ik5iklc8azslv.R.inc(7151);return new Duration(getMillis());
    }finally{__CLR4_4_15ik5iklc8azslv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts this duration to a Period instance using the standard period type
     * and the ISO chronology.
     * <p>
     * Only precise fields in the period type will be used. Thus, only the hour,
     * minute, second and millisecond fields on the period will be used.
     * The year, month, week and day fields will not be populated.
     * <p>
     * If the duration is small, less than one day, then this method will perform
     * as you might expect and split the fields evenly.
     * If the duration is larger than one day then all the remaining duration will
     * be stored in the largest available field, hours in this case.
     * <p>
     * For example, a duration effectively equal to (365 + 60 + 5) days will be
     * converted to ((365 + 60 + 5) * 24) hours by this constructor.
     * <p>
     * For more control over the conversion process, you must pair the duration with
     * an instant, see {@link Period#Period(ReadableInstant,ReadableDuration)}.
     * 
     * @return a Period created using the millisecond duration from this instance
     */
    public Period toPeriod() {try{__CLR4_4_15ik5iklc8azslv.R.inc(7152);
        __CLR4_4_15ik5iklc8azslv.R.inc(7153);return new Period(getMillis());
    }finally{__CLR4_4_15ik5iklc8azslv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this duration with the specified duration based on length.
     *
     * @param other  a duration to check against
     * @return negative value if this is less, 0 if equal, or positive value if greater
     * @throws NullPointerException if the object is null
     * @throws ClassCastException if the given object is not supported
     */
    public int compareTo(ReadableDuration other) {try{__CLR4_4_15ik5iklc8azslv.R.inc(7154);
        __CLR4_4_15ik5iklc8azslv.R.inc(7155);long thisMillis = this.getMillis();
        __CLR4_4_15ik5iklc8azslv.R.inc(7156);long otherMillis = other.getMillis();
        
        // cannot do (thisMillis - otherMillis) as it can overflow
        __CLR4_4_15ik5iklc8azslv.R.inc(7157);if ((((thisMillis < otherMillis)&&(__CLR4_4_15ik5iklc8azslv.R.iget(7158)!=0|true))||(__CLR4_4_15ik5iklc8azslv.R.iget(7159)==0&false))) {{
            __CLR4_4_15ik5iklc8azslv.R.inc(7160);return -1;
        }
        }__CLR4_4_15ik5iklc8azslv.R.inc(7161);if ((((thisMillis > otherMillis)&&(__CLR4_4_15ik5iklc8azslv.R.iget(7162)!=0|true))||(__CLR4_4_15ik5iklc8azslv.R.iget(7163)==0&false))) {{
            __CLR4_4_15ik5iklc8azslv.R.inc(7164);return 1;
        }
        }__CLR4_4_15ik5iklc8azslv.R.inc(7165);return 0;
    }finally{__CLR4_4_15ik5iklc8azslv.R.flushNeeded();}}

    /**
     * Is the length of this duration equal to the duration passed in.
     *
     * @param duration  another duration to compare to, null means zero milliseconds
     * @return true if this duration is equal to than the duration passed in
     */
    public boolean isEqual(ReadableDuration duration) {try{__CLR4_4_15ik5iklc8azslv.R.inc(7166);
        __CLR4_4_15ik5iklc8azslv.R.inc(7167);if ((((duration == null)&&(__CLR4_4_15ik5iklc8azslv.R.iget(7168)!=0|true))||(__CLR4_4_15ik5iklc8azslv.R.iget(7169)==0&false))) {{
            __CLR4_4_15ik5iklc8azslv.R.inc(7170);duration = Duration.ZERO;
        }
        }__CLR4_4_15ik5iklc8azslv.R.inc(7171);return compareTo(duration) == 0;
    }finally{__CLR4_4_15ik5iklc8azslv.R.flushNeeded();}}

    /**
     * Is the length of this duration longer than the duration passed in.
     *
     * @param duration  another duration to compare to, null means zero milliseconds
     * @return true if this duration is equal to than the duration passed in
     */
    public boolean isLongerThan(ReadableDuration duration) {try{__CLR4_4_15ik5iklc8azslv.R.inc(7172);
        __CLR4_4_15ik5iklc8azslv.R.inc(7173);if ((((duration == null)&&(__CLR4_4_15ik5iklc8azslv.R.iget(7174)!=0|true))||(__CLR4_4_15ik5iklc8azslv.R.iget(7175)==0&false))) {{
            __CLR4_4_15ik5iklc8azslv.R.inc(7176);duration = Duration.ZERO;
        }
        }__CLR4_4_15ik5iklc8azslv.R.inc(7177);return compareTo(duration) > 0;
    }finally{__CLR4_4_15ik5iklc8azslv.R.flushNeeded();}}

    /**
     * Is the length of this duration shorter than the duration passed in.
     *
     * @param duration  another duration to compare to, null means zero milliseconds
     * @return true if this duration is equal to than the duration passed in
     */
    public boolean isShorterThan(ReadableDuration duration) {try{__CLR4_4_15ik5iklc8azslv.R.inc(7178);
        __CLR4_4_15ik5iklc8azslv.R.inc(7179);if ((((duration == null)&&(__CLR4_4_15ik5iklc8azslv.R.iget(7180)!=0|true))||(__CLR4_4_15ik5iklc8azslv.R.iget(7181)==0&false))) {{
            __CLR4_4_15ik5iklc8azslv.R.inc(7182);duration = Duration.ZERO;
        }
        }__CLR4_4_15ik5iklc8azslv.R.inc(7183);return compareTo(duration) < 0;
    }finally{__CLR4_4_15ik5iklc8azslv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object with the specified object for equality based
     * on the millisecond length. All ReadableDuration instances are accepted.
     *
     * @param duration  a readable duration to check against
     * @return true if the length of the duration is equal
     */
    public boolean equals(Object duration) {try{__CLR4_4_15ik5iklc8azslv.R.inc(7184);
        __CLR4_4_15ik5iklc8azslv.R.inc(7185);if ((((this == duration)&&(__CLR4_4_15ik5iklc8azslv.R.iget(7186)!=0|true))||(__CLR4_4_15ik5iklc8azslv.R.iget(7187)==0&false))) {{
            __CLR4_4_15ik5iklc8azslv.R.inc(7188);return true;
        }
        }__CLR4_4_15ik5iklc8azslv.R.inc(7189);if ((((duration instanceof ReadableDuration == false)&&(__CLR4_4_15ik5iklc8azslv.R.iget(7190)!=0|true))||(__CLR4_4_15ik5iklc8azslv.R.iget(7191)==0&false))) {{
            __CLR4_4_15ik5iklc8azslv.R.inc(7192);return false;
        }
        }__CLR4_4_15ik5iklc8azslv.R.inc(7193);ReadableDuration other = (ReadableDuration) duration;
        __CLR4_4_15ik5iklc8azslv.R.inc(7194);return (getMillis() == other.getMillis());
    }finally{__CLR4_4_15ik5iklc8azslv.R.flushNeeded();}}

    /**
     * Gets a hash code for the duration that is compatible with the 
     * equals method.
     *
     * @return a hash code
     */
    public int hashCode() {try{__CLR4_4_15ik5iklc8azslv.R.inc(7195);
        __CLR4_4_15ik5iklc8azslv.R.inc(7196);long len = getMillis();
        __CLR4_4_15ik5iklc8azslv.R.inc(7197);return (int) (len ^ (len >>> 32));
    }finally{__CLR4_4_15ik5iklc8azslv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a String in the ISO8601 duration format including
     * only seconds and milliseconds.
     * <p>
     * For example, "PT72.345S" represents 1 minute, 12 seconds and 345 milliseconds.
     * <p>
     * For more control over the output, see
     * {@link org.joda.time.format.PeriodFormatterBuilder PeriodFormatterBuilder}.
     *
     * @return the value as an ISO8601 string
     */
    @ToString
    public String toString() {try{__CLR4_4_15ik5iklc8azslv.R.inc(7198);
        __CLR4_4_15ik5iklc8azslv.R.inc(7199);long millis = getMillis();
        __CLR4_4_15ik5iklc8azslv.R.inc(7200);StringBuffer buf = new StringBuffer();
        __CLR4_4_15ik5iklc8azslv.R.inc(7201);buf.append("PT");
        __CLR4_4_15ik5iklc8azslv.R.inc(7202);boolean negative = (millis < 0);
        __CLR4_4_15ik5iklc8azslv.R.inc(7203);FormatUtils.appendUnpaddedInteger(buf, millis);
        __CLR4_4_15ik5iklc8azslv.R.inc(7204);while ((((buf.length() < ((((negative )&&(__CLR4_4_15ik5iklc8azslv.R.iget(7205)!=0|true))||(__CLR4_4_15ik5iklc8azslv.R.iget(7206)==0&false))? 7 : 6))&&(__CLR4_4_15ik5iklc8azslv.R.iget(7207)!=0|true))||(__CLR4_4_15ik5iklc8azslv.R.iget(7208)==0&false))) {{
            __CLR4_4_15ik5iklc8azslv.R.inc(7209);buf.insert((((negative )&&(__CLR4_4_15ik5iklc8azslv.R.iget(7210)!=0|true))||(__CLR4_4_15ik5iklc8azslv.R.iget(7211)==0&false))? 3 : 2, "0");
        }
        }__CLR4_4_15ik5iklc8azslv.R.inc(7212);if (((((millis / 1000) * 1000 == millis)&&(__CLR4_4_15ik5iklc8azslv.R.iget(7213)!=0|true))||(__CLR4_4_15ik5iklc8azslv.R.iget(7214)==0&false))) {{
            __CLR4_4_15ik5iklc8azslv.R.inc(7215);buf.setLength(buf.length() - 3);
        } }else {{
            __CLR4_4_15ik5iklc8azslv.R.inc(7216);buf.insert(buf.length() - 3, ".");
        }
        }__CLR4_4_15ik5iklc8azslv.R.inc(7217);buf.append('S');
        __CLR4_4_15ik5iklc8azslv.R.inc(7218);return buf.toString();
    }finally{__CLR4_4_15ik5iklc8azslv.R.flushNeeded();}}

}
