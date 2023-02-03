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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.RemainderDateTimeField;

/**
 * Implements a chronology that follows the rules of the ISO8601 standard,
 * which is compatible with Gregorian for all modern dates.
 * When ISO does not define a field, but it can be determined (such as AM/PM)
 * it is included.
 * <p>
 * With the exception of century related fields, ISOChronology is exactly the
 * same as {@link GregorianChronology}. In this chronology, centuries and year
 * of century are zero based. For all years, the century is determined by
 * dropping the last two digits of the year, ignoring sign. The year of century
 * is the value of the last two year digits.
 * <p>
 * ISOChronology is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class ISOChronology extends AssembledChronology {public static class __CLR4_4_18i68i6lc8azsyw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,11103,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /** Serialization lock */
    private static final long serialVersionUID = -6212696554273812441L;

    /** Singleton instance of a UTC ISOChronology */
    private static final ISOChronology INSTANCE_UTC;
        
    private static final int FAST_CACHE_SIZE = 64;

    /** Fast cache of zone to chronology */
    private static final ISOChronology[] cFastCache;

    /** Cache of zone to chronology */
    private static final Map<DateTimeZone, ISOChronology> cCache = new HashMap<DateTimeZone, ISOChronology>();
    static {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11022);
        __CLR4_4_18i68i6lc8azsyw.R.inc(11023);cFastCache = new ISOChronology[FAST_CACHE_SIZE];
        __CLR4_4_18i68i6lc8azsyw.R.inc(11024);INSTANCE_UTC = new ISOChronology(GregorianChronology.getInstanceUTC());
        __CLR4_4_18i68i6lc8azsyw.R.inc(11025);cCache.put(DateTimeZone.UTC, INSTANCE_UTC);
    }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

    /**
     * Gets an instance of the ISOChronology.
     * The time zone of the returned instance is UTC.
     * 
     * @return a singleton UTC instance of the chronology
     */
    public static ISOChronology getInstanceUTC() {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11026);
        __CLR4_4_18i68i6lc8azsyw.R.inc(11027);return INSTANCE_UTC;
    }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

    /**
     * Gets an instance of the ISOChronology in the default time zone.
     * 
     * @return a chronology in the default time zone
     */
    public static ISOChronology getInstance() {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11028);
        __CLR4_4_18i68i6lc8azsyw.R.inc(11029);return getInstance(DateTimeZone.getDefault());
    }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

    /**
     * Gets an instance of the ISOChronology in the given time zone.
     * 
     * @param zone  the time zone to get the chronology in, null is default
     * @return a chronology in the specified time zone
     */
    public static ISOChronology getInstance(DateTimeZone zone) {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11030);
        __CLR4_4_18i68i6lc8azsyw.R.inc(11031);if ((((zone == null)&&(__CLR4_4_18i68i6lc8azsyw.R.iget(11032)!=0|true))||(__CLR4_4_18i68i6lc8azsyw.R.iget(11033)==0&false))) {{
            __CLR4_4_18i68i6lc8azsyw.R.inc(11034);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_18i68i6lc8azsyw.R.inc(11035);int index = System.identityHashCode(zone) & (FAST_CACHE_SIZE - 1);
        __CLR4_4_18i68i6lc8azsyw.R.inc(11036);ISOChronology chrono = cFastCache[index];
        __CLR4_4_18i68i6lc8azsyw.R.inc(11037);if ((((chrono != null && chrono.getZone() == zone)&&(__CLR4_4_18i68i6lc8azsyw.R.iget(11038)!=0|true))||(__CLR4_4_18i68i6lc8azsyw.R.iget(11039)==0&false))) {{
            __CLR4_4_18i68i6lc8azsyw.R.inc(11040);return chrono;
        }
        }__CLR4_4_18i68i6lc8azsyw.R.inc(11041);synchronized (cCache) {
            __CLR4_4_18i68i6lc8azsyw.R.inc(11042);chrono = cCache.get(zone);
            __CLR4_4_18i68i6lc8azsyw.R.inc(11043);if ((((chrono == null)&&(__CLR4_4_18i68i6lc8azsyw.R.iget(11044)!=0|true))||(__CLR4_4_18i68i6lc8azsyw.R.iget(11045)==0&false))) {{
                __CLR4_4_18i68i6lc8azsyw.R.inc(11046);chrono = new ISOChronology(ZonedChronology.getInstance(INSTANCE_UTC, zone));
                __CLR4_4_18i68i6lc8azsyw.R.inc(11047);cCache.put(zone, chrono);
            }
        }}
        __CLR4_4_18i68i6lc8azsyw.R.inc(11048);cFastCache[index] = chrono;
        __CLR4_4_18i68i6lc8azsyw.R.inc(11049);return chrono;
    }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

    // Constructors and instance variables
    //-----------------------------------------------------------------------

    /**
     * Restricted constructor
     */
    private ISOChronology(Chronology base) {
        super(base, null);__CLR4_4_18i68i6lc8azsyw.R.inc(11051);try{__CLR4_4_18i68i6lc8azsyw.R.inc(11050);
    }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------
    /**
     * Gets the Chronology in the UTC time zone.
     * 
     * @return the chronology in UTC
     */
    public Chronology withUTC() {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11052);
        __CLR4_4_18i68i6lc8azsyw.R.inc(11053);return INSTANCE_UTC;
    }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

    /**
     * Gets the Chronology in a specific time zone.
     * 
     * @param zone  the zone to get the chronology in, null is default
     * @return the chronology
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11054);
        __CLR4_4_18i68i6lc8azsyw.R.inc(11055);if ((((zone == null)&&(__CLR4_4_18i68i6lc8azsyw.R.iget(11056)!=0|true))||(__CLR4_4_18i68i6lc8azsyw.R.iget(11057)==0&false))) {{
            __CLR4_4_18i68i6lc8azsyw.R.inc(11058);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_18i68i6lc8azsyw.R.inc(11059);if ((((zone == getZone())&&(__CLR4_4_18i68i6lc8azsyw.R.iget(11060)!=0|true))||(__CLR4_4_18i68i6lc8azsyw.R.iget(11061)==0&false))) {{
            __CLR4_4_18i68i6lc8azsyw.R.inc(11062);return this;
        }
        }__CLR4_4_18i68i6lc8azsyw.R.inc(11063);return getInstance(zone);
    }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

    // Output
    //-----------------------------------------------------------------------
    /**
     * Gets a debugging toString.
     * 
     * @return a debugging string
     */
    public String toString() {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11064);
        __CLR4_4_18i68i6lc8azsyw.R.inc(11065);String str = "ISOChronology";
        __CLR4_4_18i68i6lc8azsyw.R.inc(11066);DateTimeZone zone = getZone();
        __CLR4_4_18i68i6lc8azsyw.R.inc(11067);if ((((zone != null)&&(__CLR4_4_18i68i6lc8azsyw.R.iget(11068)!=0|true))||(__CLR4_4_18i68i6lc8azsyw.R.iget(11069)==0&false))) {{
            __CLR4_4_18i68i6lc8azsyw.R.inc(11070);str = str + '[' + zone.getID() + ']';
        }
        }__CLR4_4_18i68i6lc8azsyw.R.inc(11071);return str;
    }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11072);
        __CLR4_4_18i68i6lc8azsyw.R.inc(11073);if ((((getBase().getZone() == DateTimeZone.UTC)&&(__CLR4_4_18i68i6lc8azsyw.R.iget(11074)!=0|true))||(__CLR4_4_18i68i6lc8azsyw.R.iget(11075)==0&false))) {{
            // Use zero based century and year of century.
            __CLR4_4_18i68i6lc8azsyw.R.inc(11076);fields.centuryOfEra = new DividedDateTimeField(
                ISOYearOfEraDateTimeField.INSTANCE, DateTimeFieldType.centuryOfEra(), 100);
            __CLR4_4_18i68i6lc8azsyw.R.inc(11077);fields.centuries = fields.centuryOfEra.getDurationField();
            
            __CLR4_4_18i68i6lc8azsyw.R.inc(11078);fields.yearOfCentury = new RemainderDateTimeField(
                (DividedDateTimeField) fields.centuryOfEra, DateTimeFieldType.yearOfCentury());
            __CLR4_4_18i68i6lc8azsyw.R.inc(11079);fields.weekyearOfCentury = new RemainderDateTimeField(
                (DividedDateTimeField) fields.centuryOfEra, fields.weekyears, DateTimeFieldType.weekyearOfCentury());
        }
    }}finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks if this chronology instance equals another.
     * 
     * @param obj  the object to compare to
     * @return true if equal
     * @since 1.6
     */
    public boolean equals(Object obj) {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11080);
        __CLR4_4_18i68i6lc8azsyw.R.inc(11081);if ((((this == obj)&&(__CLR4_4_18i68i6lc8azsyw.R.iget(11082)!=0|true))||(__CLR4_4_18i68i6lc8azsyw.R.iget(11083)==0&false))) {{
            __CLR4_4_18i68i6lc8azsyw.R.inc(11084);return true;
        }
        }__CLR4_4_18i68i6lc8azsyw.R.inc(11085);if ((((obj instanceof ISOChronology)&&(__CLR4_4_18i68i6lc8azsyw.R.iget(11086)!=0|true))||(__CLR4_4_18i68i6lc8azsyw.R.iget(11087)==0&false))) {{
            __CLR4_4_18i68i6lc8azsyw.R.inc(11088);ISOChronology chrono = (ISOChronology) obj;
            __CLR4_4_18i68i6lc8azsyw.R.inc(11089);return getZone().equals(chrono.getZone());
        }
        }__CLR4_4_18i68i6lc8azsyw.R.inc(11090);return false;
    }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

    /**
     * A suitable hash code for the chronology.
     * 
     * @return the hash code
     * @since 1.6
     */
    public int hashCode() {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11091);
        __CLR4_4_18i68i6lc8azsyw.R.inc(11092);return "ISO".hashCode() * 11 + getZone().hashCode();
    }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Serialize ISOChronology instances using a small stub. This reduces the
     * serialized size, and deserialized instances come from the cache.
     */
    private Object writeReplace() {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11093);
        __CLR4_4_18i68i6lc8azsyw.R.inc(11094);return new Stub(getZone());
    }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

    private static final class Stub implements Serializable {
        private static final long serialVersionUID = -6212696554273812441L;

        private transient DateTimeZone iZone;

        Stub(DateTimeZone zone) {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11095);
            __CLR4_4_18i68i6lc8azsyw.R.inc(11096);iZone = zone;
        }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

        private Object readResolve() {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11097);
            __CLR4_4_18i68i6lc8azsyw.R.inc(11098);return ISOChronology.getInstance(iZone);
        }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

        private void writeObject(ObjectOutputStream out) throws IOException {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11099);
            __CLR4_4_18i68i6lc8azsyw.R.inc(11100);out.writeObject(iZone);
        }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}

        private void readObject(ObjectInputStream in)
            throws IOException, ClassNotFoundException
        {try{__CLR4_4_18i68i6lc8azsyw.R.inc(11101);
            __CLR4_4_18i68i6lc8azsyw.R.inc(11102);iZone = (DateTimeZone)in.readObject();
        }finally{__CLR4_4_18i68i6lc8azsyw.R.flushNeeded();}}
    }

}
