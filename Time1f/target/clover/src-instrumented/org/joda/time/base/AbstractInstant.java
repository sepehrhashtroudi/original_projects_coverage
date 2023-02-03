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

import java.util.Date;

import org.joda.convert.ToString;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * AbstractInstant provides the common behaviour for instant classes.
 * <p>
 * This class has no concept of a chronology, all methods work on the
 * millisecond instant.
 * <p>
 * This class should generally not be used directly by API users. The 
 * {@link ReadableInstant} interface should be used when different 
 * kinds of date/time objects are to be referenced.
 * <p>
 * Whenever you want to implement <code>ReadableInstant</code> you should
 * extend this class.
 * <p>
 * AbstractInstant itself is thread-safe and immutable, but subclasses may be
 * mutable and not thread-safe.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public abstract class AbstractInstant implements ReadableInstant {public static class __CLR4_4_15kj5kjlc8azsm9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,7323,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructor.
     */
    protected AbstractInstant() {
        super();__CLR4_4_15kj5kjlc8azsm9.R.inc(7220);try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7219);
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the time zone of the instant from the chronology.
     * 
     * @return the DateTimeZone that the instant is using, never null
     */
    public DateTimeZone getZone() {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7221);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7222);return getChronology().getZone();
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Get the value of one of the fields of a datetime using the chronology of the instant.
     * <p>
     * This method uses the chronology of the instant to obtain the value.
     * For example:
     * <pre>
     * DateTime dt = new DateTime();
     * int year = dt.get(DateTimeFieldType.year());
     * </pre>
     *
     * @param type  a field type, usually obtained from DateTimeFieldType, not null
     * @return the value of that field
     * @throws IllegalArgumentException if the field type is null
     */
    public int get(DateTimeFieldType type) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7223);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7224);if ((((type == null)&&(__CLR4_4_15kj5kjlc8azsm9.R.iget(7225)!=0|true))||(__CLR4_4_15kj5kjlc8azsm9.R.iget(7226)==0&false))) {{
            __CLR4_4_15kj5kjlc8azsm9.R.inc(7227);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_15kj5kjlc8azsm9.R.inc(7228);return type.getField(getChronology()).get(getMillis());
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Checks if the field type specified is supported by this instant and chronology.
     * This can be used to avoid exceptions in {@link #get(DateTimeFieldType)}.
     *
     * @param type  a field type, usually obtained from DateTimeFieldType
     * @return true if the field type is supported
     */
    public boolean isSupported(DateTimeFieldType type) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7229);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7230);if ((((type == null)&&(__CLR4_4_15kj5kjlc8azsm9.R.iget(7231)!=0|true))||(__CLR4_4_15kj5kjlc8azsm9.R.iget(7232)==0&false))) {{
            __CLR4_4_15kj5kjlc8azsm9.R.inc(7233);return false;
        }
        }__CLR4_4_15kj5kjlc8azsm9.R.inc(7234);return type.getField(getChronology()).isSupported();
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Get the value of one of the fields of a datetime.
     * <p>
     * This could be used to get a field using a different Chronology.
     * For example:
     * <pre>
     * Instant dt = new Instant();
     * int gjYear = dt.get(Chronology.getCoptic().year());
     * </pre>
     * 
     * @param field  the DateTimeField to use, not null
     * @return the value
     * @throws IllegalArgumentException if the field is null
     */
    public int get(DateTimeField field) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7235);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7236);if ((((field == null)&&(__CLR4_4_15kj5kjlc8azsm9.R.iget(7237)!=0|true))||(__CLR4_4_15kj5kjlc8azsm9.R.iget(7238)==0&false))) {{
            __CLR4_4_15kj5kjlc8azsm9.R.inc(7239);throw new IllegalArgumentException("The DateTimeField must not be null");
        }
        }__CLR4_4_15kj5kjlc8azsm9.R.inc(7240);return field.get(getMillis());
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get this object as an Instant.
     * 
     * @return an Instant using the same millis
     */
    public Instant toInstant() {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7241);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7242);return new Instant(getMillis());
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Get this object as a DateTime in the same zone.
     *
     * @return a DateTime using the same millis
     */
    public DateTime toDateTime() {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7243);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7244);return new DateTime(getMillis(), getZone());
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Get this object as a DateTime using ISOChronology in the same zone.
     *
     * @return a DateTime using the same millis with ISOChronology
     */
    public DateTime toDateTimeISO() {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7245);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7246);return new DateTime(getMillis(), ISOChronology.getInstance(getZone()));
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Get this object as a DateTime using the same chronology but a different zone.
     * 
     * @param zone time zone to apply, or default if null
     * @return a DateTime using the same millis
     */
    public DateTime toDateTime(DateTimeZone zone) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7247);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7248);Chronology chrono = DateTimeUtils.getChronology(getChronology());
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7249);chrono = chrono.withZone(zone);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7250);return new DateTime(getMillis(), chrono);
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Get this object as a DateTime using the given chronology and its zone.
     * 
     * @param chronology chronology to apply, or ISOChronology if null
     * @return a DateTime using the same millis
     */
    public DateTime toDateTime(Chronology chronology) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7251);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7252);return new DateTime(getMillis(), chronology);
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    // NOTE: Although the toMutableDateTime methods could check to see if this
    // is already a MutableDateTime and return this casted, it makes it too
    // easy to mistakenly modify ReadableDateTime input parameters. Always
    // returning a copy prevents this.

    /**
     * Get this object as a MutableDateTime in the same zone.
     *
     * @return a MutableDateTime using the same millis
     */
    public MutableDateTime toMutableDateTime() {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7253);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7254);return new MutableDateTime(getMillis(), getZone());
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Get this object as a MutableDateTime using ISOChronology in the same zone.
     *
     * @return a MutableDateTime using the same millis with ISOChronology
     */
    public MutableDateTime toMutableDateTimeISO() {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7255);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7256);return new MutableDateTime(getMillis(), ISOChronology.getInstance(getZone()));
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Get this object as a MutableDateTime using the same chronology but a different zone.
     * 
     * @param zone time zone to apply, or default if null
     * @return a MutableDateTime using the same millis
     */
    public MutableDateTime toMutableDateTime(DateTimeZone zone) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7257);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7258);Chronology chrono = DateTimeUtils.getChronology(getChronology());
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7259);chrono = chrono.withZone(zone);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7260);return new MutableDateTime(getMillis(), chrono);
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Get this object as a MutableDateTime using the given chronology and its zone.
     * 
     * @param chronology chronology to apply, or ISOChronology if null
     * @return a MutableDateTime using the same millis
     */
    public MutableDateTime toMutableDateTime(Chronology chronology) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7261);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7262);return new MutableDateTime(getMillis(), chronology);
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the date time as a <code>java.util.Date</code>.
     * <p>
     * The <code>Date</code> object created has exactly the same millisecond
     * instant as this object.
     *
     * @return a Date initialised with this datetime
     */
    public Date toDate() {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7263);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7264);return new Date(getMillis());
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object with the specified object for equality based
     * on the millisecond instant, chronology and time zone.
     * <p>
     * Two objects which represent the same instant in time, but are in
     * different time zones (based on time zone id), will be considered to
     * be different. Only two objects with the same {@link DateTimeZone},
     * {@link Chronology} and instant are equal.
     * <p>
     * See {@link #isEqual(ReadableInstant)} for an equals method that
     * ignores the Chronology and time zone.
     * <p>
     * All ReadableInstant instances are accepted.
     *
     * @param readableInstant  a readable instant to check against
     * @return true if millisecond and chronology are equal, false if
     *  not or the instant is null or of an incorrect type
     */
    public boolean equals(Object readableInstant) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7265);
        // must be to fulfil ReadableInstant contract
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7266);if ((((this == readableInstant)&&(__CLR4_4_15kj5kjlc8azsm9.R.iget(7267)!=0|true))||(__CLR4_4_15kj5kjlc8azsm9.R.iget(7268)==0&false))) {{
            __CLR4_4_15kj5kjlc8azsm9.R.inc(7269);return true;
        }
        }__CLR4_4_15kj5kjlc8azsm9.R.inc(7270);if ((((readableInstant instanceof ReadableInstant == false)&&(__CLR4_4_15kj5kjlc8azsm9.R.iget(7271)!=0|true))||(__CLR4_4_15kj5kjlc8azsm9.R.iget(7272)==0&false))) {{
            __CLR4_4_15kj5kjlc8azsm9.R.inc(7273);return false;
        }
        }__CLR4_4_15kj5kjlc8azsm9.R.inc(7274);ReadableInstant otherInstant = (ReadableInstant) readableInstant;
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7275);return
            getMillis() == otherInstant.getMillis() &&
            FieldUtils.equals(getChronology(), otherInstant.getChronology());
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Gets a hash code for the instant as defined in <code>ReadableInstant</code>.
     *
     * @return a suitable hash code
     */
    public int hashCode() {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7276);
        // must be to fulfil ReadableInstant contract
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7277);return
            ((int) (getMillis() ^ (getMillis() >>> 32))) +
            (getChronology().hashCode());
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Compares this object with the specified object for ascending
     * millisecond instant order. This ordering is inconsistent with
     * equals, as it ignores the Chronology.
     * <p>
     * All ReadableInstant instances are accepted.
     *
     * @param other  a readable instant to check against
     * @return negative value if this is less, 0 if equal, or positive value if greater
     * @throws NullPointerException if the object is null
     * @throws ClassCastException if the object type is not supported
     */
    public int compareTo(ReadableInstant other) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7278);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7279);if ((((this == other)&&(__CLR4_4_15kj5kjlc8azsm9.R.iget(7280)!=0|true))||(__CLR4_4_15kj5kjlc8azsm9.R.iget(7281)==0&false))) {{
            __CLR4_4_15kj5kjlc8azsm9.R.inc(7282);return 0;
        }
        
        }__CLR4_4_15kj5kjlc8azsm9.R.inc(7283);long otherMillis = other.getMillis();
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7284);long thisMillis = getMillis();
        
        // cannot do (thisMillis - otherMillis) as can overflow
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7285);if ((((thisMillis == otherMillis)&&(__CLR4_4_15kj5kjlc8azsm9.R.iget(7286)!=0|true))||(__CLR4_4_15kj5kjlc8azsm9.R.iget(7287)==0&false))) {{
            __CLR4_4_15kj5kjlc8azsm9.R.inc(7288);return 0;
        }
        }__CLR4_4_15kj5kjlc8azsm9.R.inc(7289);if ((((thisMillis < otherMillis)&&(__CLR4_4_15kj5kjlc8azsm9.R.iget(7290)!=0|true))||(__CLR4_4_15kj5kjlc8azsm9.R.iget(7291)==0&false))) {{
            __CLR4_4_15kj5kjlc8azsm9.R.inc(7292);return -1;
        } }else {{
            __CLR4_4_15kj5kjlc8azsm9.R.inc(7293);return 1;
        }
    }}finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Is this instant after the millisecond instant passed in
     * comparing solely by millisecond.
     *
     * @param instant  a millisecond instant to check against
     * @return true if this instant is after the instant passed in
     */
    public boolean isAfter(long instant) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7294);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7295);return (getMillis() > instant);
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Is this instant after the current instant
     * comparing solely by millisecond.
     * 
     * @return true if this instant is after the current instant
     */
    public boolean isAfterNow() {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7296);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7297);return isAfter(DateTimeUtils.currentTimeMillis());
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Is this instant after the instant passed in
     * comparing solely by millisecond.
     *
     * @param instant  an instant to check against, null means now
     * @return true if the instant is after the instant passed in
     */
    public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7298);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7299);long instantMillis = DateTimeUtils.getInstantMillis(instant);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7300);return isAfter(instantMillis);
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Is this instant before the millisecond instant passed in
     * comparing solely by millisecond.
     *
     * @param instant  a millisecond instant to check against
     * @return true if this instant is before the instant passed in
     */
    public boolean isBefore(long instant) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7301);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7302);return (getMillis() < instant);
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Is this instant before the current instant
     * comparing solely by millisecond.
     * 
     * @return true if this instant is before the current instant
     */
    public boolean isBeforeNow() {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7303);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7304);return isBefore(DateTimeUtils.currentTimeMillis());
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Is this instant before the instant passed in
     * comparing solely by millisecond.
     *
     * @param instant  an instant to check against, null means now
     * @return true if the instant is before the instant passed in
     */
    public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7305);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7306);long instantMillis = DateTimeUtils.getInstantMillis(instant);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7307);return isBefore(instantMillis);
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Is this instant equal to the millisecond instant passed in
     * comparing solely by millisecond.
     *
     * @param instant  a millisecond instant to check against
     * @return true if this instant is before the instant passed in
     */
    public boolean isEqual(long instant) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7308);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7309);return (getMillis() == instant);
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Is this instant equal to the current instant
     * comparing solely by millisecond.
     * 
     * @return true if this instant is before the current instant
     */
    public boolean isEqualNow() {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7310);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7311);return isEqual(DateTimeUtils.currentTimeMillis());
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    /**
     * Is this instant equal to the instant passed in
     * comparing solely by millisecond.
     *
     * @param instant  an instant to check against, null means now
     * @return true if the instant is equal to the instant passed in
     */
    public boolean isEqual(ReadableInstant instant) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7312);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7313);long instantMillis = DateTimeUtils.getInstantMillis(instant);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7314);return isEqual(instantMillis);
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Output the date time in ISO8601 format (yyyy-MM-ddTHH:mm:ss.SSSZZ).
     * 
     * @return ISO8601 time formatted string.
     */
    @ToString
    public String toString() {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7315);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7316);return ISODateTimeFormat.dateTime().print(this);
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Uses the specified formatter to convert this partial to a String.
     *
     * @param formatter  the formatter to use, null means use <code>toString()</code>.
     * @return the formatted string
     * @since 1.1
     */
    public String toString(DateTimeFormatter formatter) {try{__CLR4_4_15kj5kjlc8azsm9.R.inc(7317);
        __CLR4_4_15kj5kjlc8azsm9.R.inc(7318);if ((((formatter == null)&&(__CLR4_4_15kj5kjlc8azsm9.R.iget(7319)!=0|true))||(__CLR4_4_15kj5kjlc8azsm9.R.iget(7320)==0&false))) {{
            __CLR4_4_15kj5kjlc8azsm9.R.inc(7321);return toString();
        }
        }__CLR4_4_15kj5kjlc8azsm9.R.inc(7322);return formatter.print(this);
    }finally{__CLR4_4_15kj5kjlc8azsm9.R.flushNeeded();}}

}
