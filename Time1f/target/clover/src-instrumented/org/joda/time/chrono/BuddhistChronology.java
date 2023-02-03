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

import java.util.HashMap;
import java.util.Map;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/**
 * A chronology that matches the BuddhistCalendar class supplied by Sun.
 * <p>
 * The chronology is identical to the Gregorian/Julian, except that the
 * year is offset by +543 and the era is named 'BE' for Buddhist Era.
 * <p>
 * This class was intended by Sun to model the calendar used in Thailand.
 * However, the actual rules for Thailand are much more involved than
 * this class covers. (This class is accurate after 1941-01-01 ISO).
 * <p>
 * This chronlogy is being retained for those who want a same effect
 * replacement for the Sun class. It is hoped that community support will
 * enable a more accurate chronology for Thailand, to be developed.
 * <p>
 * BuddhistChronology is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class BuddhistChronology extends AssembledChronology {public static class __CLR4_4_17k57k5lc8azsvn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,9876,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /** Serialization lock */
    private static final long serialVersionUID = -3474595157769370126L;

    /**
     * Constant value for 'Buddhist Era', equivalent to the value returned
     * for AD/CE. Note that this differs from the constant in BuddhistCalendar.
     */
    public static final int BE = DateTimeConstants.CE;

    /** A singleton era field. */
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("BE");

    /** Number of years difference in calendars. */
    private static final int BUDDHIST_OFFSET = 543;

    /** Cache of zone to chronology */
    private static final Map<DateTimeZone, BuddhistChronology> cCache = new HashMap<DateTimeZone, BuddhistChronology>();

    /** UTC instance of the chronology */
    private static final BuddhistChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    /**
     * Standard instance of a Buddhist Chronology, that matches
     * Sun's BuddhistCalendar class. This means that it follows the
     * GregorianJulian calendar rules with a cutover date.
     * <p>
     * The time zone of the returned instance is UTC.
     */
    public static BuddhistChronology getInstanceUTC() {try{__CLR4_4_17k57k5lc8azsvn.R.inc(9797);
        __CLR4_4_17k57k5lc8azsvn.R.inc(9798);return INSTANCE_UTC;
    }finally{__CLR4_4_17k57k5lc8azsvn.R.flushNeeded();}}

    /**
     * Standard instance of a Buddhist Chronology, that matches
     * Sun's BuddhistCalendar class. This means that it follows the
     * GregorianJulian calendar rules with a cutover date.
     */
    public static BuddhistChronology getInstance() {try{__CLR4_4_17k57k5lc8azsvn.R.inc(9799);
        __CLR4_4_17k57k5lc8azsvn.R.inc(9800);return getInstance(DateTimeZone.getDefault());
    }finally{__CLR4_4_17k57k5lc8azsvn.R.flushNeeded();}}

    /**
     * Standard instance of a Buddhist Chronology, that matches
     * Sun's BuddhistCalendar class. This means that it follows the
     * GregorianJulian calendar rules with a cutover date.
     *
     * @param zone  the time zone to use, null is default
     */
    public static synchronized BuddhistChronology getInstance(DateTimeZone zone) {try{__CLR4_4_17k57k5lc8azsvn.R.inc(9801);
        __CLR4_4_17k57k5lc8azsvn.R.inc(9802);if ((((zone == null)&&(__CLR4_4_17k57k5lc8azsvn.R.iget(9803)!=0|true))||(__CLR4_4_17k57k5lc8azsvn.R.iget(9804)==0&false))) {{
            __CLR4_4_17k57k5lc8azsvn.R.inc(9805);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_17k57k5lc8azsvn.R.inc(9806);BuddhistChronology chrono;
        __CLR4_4_17k57k5lc8azsvn.R.inc(9807);synchronized (cCache) {
            __CLR4_4_17k57k5lc8azsvn.R.inc(9808);chrono = cCache.get(zone);
            __CLR4_4_17k57k5lc8azsvn.R.inc(9809);if ((((chrono == null)&&(__CLR4_4_17k57k5lc8azsvn.R.iget(9810)!=0|true))||(__CLR4_4_17k57k5lc8azsvn.R.iget(9811)==0&false))) {{
                // First create without a lower limit.
                __CLR4_4_17k57k5lc8azsvn.R.inc(9812);chrono = new BuddhistChronology(GJChronology.getInstance(zone, null), null);
                // Impose lower limit and make another BuddhistChronology.
                __CLR4_4_17k57k5lc8azsvn.R.inc(9813);DateTime lowerLimit = new DateTime(1, 1, 1, 0, 0, 0, 0, chrono);
                __CLR4_4_17k57k5lc8azsvn.R.inc(9814);chrono = new BuddhistChronology(LimitChronology.getInstance(chrono, lowerLimit, null), "");
                __CLR4_4_17k57k5lc8azsvn.R.inc(9815);cCache.put(zone, chrono);
            }
        }}
        __CLR4_4_17k57k5lc8azsvn.R.inc(9816);return chrono;
    }finally{__CLR4_4_17k57k5lc8azsvn.R.flushNeeded();}}

    // Constructors and instance variables
    //-----------------------------------------------------------------------
    
    /**
     * Restricted constructor.
     *
     * @param param if non-null, then don't change the field set
     */
    private BuddhistChronology(Chronology base, Object param) {
        super(base, param);__CLR4_4_17k57k5lc8azsvn.R.inc(9818);try{__CLR4_4_17k57k5lc8azsvn.R.inc(9817);
    }finally{__CLR4_4_17k57k5lc8azsvn.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_17k57k5lc8azsvn.R.inc(9819);
        __CLR4_4_17k57k5lc8azsvn.R.inc(9820);Chronology base = getBase();
        __CLR4_4_17k57k5lc8azsvn.R.inc(9821);return (((base == null )&&(__CLR4_4_17k57k5lc8azsvn.R.iget(9822)!=0|true))||(__CLR4_4_17k57k5lc8azsvn.R.iget(9823)==0&false))? getInstanceUTC() : getInstance(base.getZone());
    }finally{__CLR4_4_17k57k5lc8azsvn.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------
    /**
     * Gets the Chronology in the UTC time zone.
     * 
     * @return the chronology in UTC
     */
    public Chronology withUTC() {try{__CLR4_4_17k57k5lc8azsvn.R.inc(9824);
        __CLR4_4_17k57k5lc8azsvn.R.inc(9825);return INSTANCE_UTC;
    }finally{__CLR4_4_17k57k5lc8azsvn.R.flushNeeded();}}

    /**
     * Gets the Chronology in a specific time zone.
     * 
     * @param zone  the zone to get the chronology in, null is default
     * @return the chronology
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_17k57k5lc8azsvn.R.inc(9826);
        __CLR4_4_17k57k5lc8azsvn.R.inc(9827);if ((((zone == null)&&(__CLR4_4_17k57k5lc8azsvn.R.iget(9828)!=0|true))||(__CLR4_4_17k57k5lc8azsvn.R.iget(9829)==0&false))) {{
            __CLR4_4_17k57k5lc8azsvn.R.inc(9830);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_17k57k5lc8azsvn.R.inc(9831);if ((((zone == getZone())&&(__CLR4_4_17k57k5lc8azsvn.R.iget(9832)!=0|true))||(__CLR4_4_17k57k5lc8azsvn.R.iget(9833)==0&false))) {{
            __CLR4_4_17k57k5lc8azsvn.R.inc(9834);return this;
        }
        }__CLR4_4_17k57k5lc8azsvn.R.inc(9835);return getInstance(zone);
    }finally{__CLR4_4_17k57k5lc8azsvn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks if this chronology instance equals another.
     * 
     * @param obj  the object to compare to
     * @return true if equal
     * @since 1.6
     */
    public boolean equals(Object obj) {try{__CLR4_4_17k57k5lc8azsvn.R.inc(9836);
        __CLR4_4_17k57k5lc8azsvn.R.inc(9837);if ((((this == obj)&&(__CLR4_4_17k57k5lc8azsvn.R.iget(9838)!=0|true))||(__CLR4_4_17k57k5lc8azsvn.R.iget(9839)==0&false))) {{
            __CLR4_4_17k57k5lc8azsvn.R.inc(9840);return true;
        }
        }__CLR4_4_17k57k5lc8azsvn.R.inc(9841);if ((((obj instanceof BuddhistChronology)&&(__CLR4_4_17k57k5lc8azsvn.R.iget(9842)!=0|true))||(__CLR4_4_17k57k5lc8azsvn.R.iget(9843)==0&false))) {{
            __CLR4_4_17k57k5lc8azsvn.R.inc(9844);BuddhistChronology chrono = (BuddhistChronology) obj;
            __CLR4_4_17k57k5lc8azsvn.R.inc(9845);return getZone().equals(chrono.getZone());
        }
        }__CLR4_4_17k57k5lc8azsvn.R.inc(9846);return false;
    }finally{__CLR4_4_17k57k5lc8azsvn.R.flushNeeded();}}

    /**
     * A suitable hash code for the chronology.
     * 
     * @return the hash code
     * @since 1.6
     */
    public int hashCode() {try{__CLR4_4_17k57k5lc8azsvn.R.inc(9847);
        __CLR4_4_17k57k5lc8azsvn.R.inc(9848);return "Buddhist".hashCode() * 11 + getZone().hashCode();
    }finally{__CLR4_4_17k57k5lc8azsvn.R.flushNeeded();}}

    // Output
    //-----------------------------------------------------------------------
    /**
     * Gets a debugging toString.
     * 
     * @return a debugging string
     */
    public String toString() {try{__CLR4_4_17k57k5lc8azsvn.R.inc(9849);
        __CLR4_4_17k57k5lc8azsvn.R.inc(9850);String str = "BuddhistChronology";
        __CLR4_4_17k57k5lc8azsvn.R.inc(9851);DateTimeZone zone = getZone();
        __CLR4_4_17k57k5lc8azsvn.R.inc(9852);if ((((zone != null)&&(__CLR4_4_17k57k5lc8azsvn.R.iget(9853)!=0|true))||(__CLR4_4_17k57k5lc8azsvn.R.iget(9854)==0&false))) {{
            __CLR4_4_17k57k5lc8azsvn.R.inc(9855);str = str + '[' + zone.getID() + ']';
        }
        }__CLR4_4_17k57k5lc8azsvn.R.inc(9856);return str;
    }finally{__CLR4_4_17k57k5lc8azsvn.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_17k57k5lc8azsvn.R.inc(9857);
        __CLR4_4_17k57k5lc8azsvn.R.inc(9858);if ((((getParam() == null)&&(__CLR4_4_17k57k5lc8azsvn.R.iget(9859)!=0|true))||(__CLR4_4_17k57k5lc8azsvn.R.iget(9860)==0&false))) {{
            // force init as used below
            __CLR4_4_17k57k5lc8azsvn.R.inc(9861);fields.eras = UnsupportedDurationField.getInstance(DurationFieldType.eras());
            
            // julian chrono removed zero, but we need to put it back
            __CLR4_4_17k57k5lc8azsvn.R.inc(9862);DateTimeField field = fields.year;
            __CLR4_4_17k57k5lc8azsvn.R.inc(9863);fields.year = new OffsetDateTimeField(
                    new SkipUndoDateTimeField(this, field), BUDDHIST_OFFSET);
            
            // one era, so yearOfEra is the same
            __CLR4_4_17k57k5lc8azsvn.R.inc(9864);field = fields.yearOfEra;
            __CLR4_4_17k57k5lc8azsvn.R.inc(9865);fields.yearOfEra = new DelegatedDateTimeField(
                fields.year, fields.eras, DateTimeFieldType.yearOfEra());
            
            // julian chrono removed zero, but we need to put it back
            __CLR4_4_17k57k5lc8azsvn.R.inc(9866);field = fields.weekyear;
            __CLR4_4_17k57k5lc8azsvn.R.inc(9867);fields.weekyear = new OffsetDateTimeField(
                    new SkipUndoDateTimeField(this, field), BUDDHIST_OFFSET);
            
            __CLR4_4_17k57k5lc8azsvn.R.inc(9868);field = new OffsetDateTimeField(fields.yearOfEra, 99);
            __CLR4_4_17k57k5lc8azsvn.R.inc(9869);fields.centuryOfEra = new DividedDateTimeField(
                field, fields.eras, DateTimeFieldType.centuryOfEra(), 100);
            __CLR4_4_17k57k5lc8azsvn.R.inc(9870);fields.centuries = fields.centuryOfEra.getDurationField();
            
            __CLR4_4_17k57k5lc8azsvn.R.inc(9871);field = new RemainderDateTimeField(
                (DividedDateTimeField) fields.centuryOfEra);
            __CLR4_4_17k57k5lc8azsvn.R.inc(9872);fields.yearOfCentury = new OffsetDateTimeField(
                field, DateTimeFieldType.yearOfCentury(), 1);
            
            __CLR4_4_17k57k5lc8azsvn.R.inc(9873);field = new RemainderDateTimeField(
                fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100);
            __CLR4_4_17k57k5lc8azsvn.R.inc(9874);fields.weekyearOfCentury = new OffsetDateTimeField(
                field, DateTimeFieldType.weekyearOfCentury(), 1);
            
            __CLR4_4_17k57k5lc8azsvn.R.inc(9875);fields.era = ERA_FIELD;
        }
    }}finally{__CLR4_4_17k57k5lc8azsvn.R.flushNeeded();}}
   
}
