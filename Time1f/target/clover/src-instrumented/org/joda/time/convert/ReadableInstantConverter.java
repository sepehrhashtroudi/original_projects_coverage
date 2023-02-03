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
package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.ISOChronology;

/**
 * ReadableInstantConverter extracts milliseconds and chronology from a ReadableInstant.
 *
 * @author Stephen Colebourne
 * @since 1.0
 */
class ReadableInstantConverter extends AbstractConverter
        implements InstantConverter, PartialConverter {public static class __CLR4_4_19wf9wflc8azt46{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,12860,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Singleton instance.
     */
    static final ReadableInstantConverter INSTANCE = new ReadableInstantConverter();

    /**
     * Restricted constructor.
     */
    protected ReadableInstantConverter() {
        super();__CLR4_4_19wf9wflc8azt46.R.inc(12832);try{__CLR4_4_19wf9wflc8azt46.R.inc(12831);
    }finally{__CLR4_4_19wf9wflc8azt46.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the chronology, which is taken from the ReadableInstant.
     * If the chronology on the instant is null, the ISOChronology in the
     * specified time zone is used.
     * If the chronology on the instant is not in the specified zone, it is
     * adapted.
     * 
     * @param object  the ReadableInstant to convert, must not be null
     * @param zone  the specified zone to use, null means default zone
     * @return the chronology, never null
     */
    public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_19wf9wflc8azt46.R.inc(12833);
        __CLR4_4_19wf9wflc8azt46.R.inc(12834);Chronology chrono = ((ReadableInstant) object).getChronology();
        __CLR4_4_19wf9wflc8azt46.R.inc(12835);if ((((chrono == null)&&(__CLR4_4_19wf9wflc8azt46.R.iget(12836)!=0|true))||(__CLR4_4_19wf9wflc8azt46.R.iget(12837)==0&false))) {{
            __CLR4_4_19wf9wflc8azt46.R.inc(12838);return ISOChronology.getInstance(zone);
        }
        }__CLR4_4_19wf9wflc8azt46.R.inc(12839);DateTimeZone chronoZone = chrono.getZone();
        __CLR4_4_19wf9wflc8azt46.R.inc(12840);if ((((chronoZone != zone)&&(__CLR4_4_19wf9wflc8azt46.R.iget(12841)!=0|true))||(__CLR4_4_19wf9wflc8azt46.R.iget(12842)==0&false))) {{
            __CLR4_4_19wf9wflc8azt46.R.inc(12843);chrono = chrono.withZone(zone);
            __CLR4_4_19wf9wflc8azt46.R.inc(12844);if ((((chrono == null)&&(__CLR4_4_19wf9wflc8azt46.R.iget(12845)!=0|true))||(__CLR4_4_19wf9wflc8azt46.R.iget(12846)==0&false))) {{
                __CLR4_4_19wf9wflc8azt46.R.inc(12847);return ISOChronology.getInstance(zone);
            }
        }}
        }__CLR4_4_19wf9wflc8azt46.R.inc(12848);return chrono;
    }finally{__CLR4_4_19wf9wflc8azt46.R.flushNeeded();}}

    /**
     * Gets the chronology, which is taken from the ReadableInstant.
     * <p>
     * If the passed in chronology is non-null, it is used.
     * Otherwise the chronology from the instant is used.
     * 
     * @param object  the ReadableInstant to convert, must not be null
     * @param chrono  the chronology to use, null means use that from object
     * @return the chronology, never null
     */
    public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_19wf9wflc8azt46.R.inc(12849);
        __CLR4_4_19wf9wflc8azt46.R.inc(12850);if ((((chrono == null)&&(__CLR4_4_19wf9wflc8azt46.R.iget(12851)!=0|true))||(__CLR4_4_19wf9wflc8azt46.R.iget(12852)==0&false))) {{
            __CLR4_4_19wf9wflc8azt46.R.inc(12853);chrono = ((ReadableInstant) object).getChronology();
            __CLR4_4_19wf9wflc8azt46.R.inc(12854);chrono = DateTimeUtils.getChronology(chrono);
        }
        }__CLR4_4_19wf9wflc8azt46.R.inc(12855);return chrono;
    }finally{__CLR4_4_19wf9wflc8azt46.R.flushNeeded();}}

    /**
     * Extracts the millis from an object of this convertor's type.
     * 
     * @param object  the ReadableInstant to convert, must not be null
     * @param chrono  the non-null result of getChronology
     * @return the millisecond value
     * @throws NullPointerException if the object is null
     * @throws ClassCastException if the object is an invalid type
     */
    public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_19wf9wflc8azt46.R.inc(12856);
        __CLR4_4_19wf9wflc8azt46.R.inc(12857);return ((ReadableInstant) object).getMillis();
    }finally{__CLR4_4_19wf9wflc8azt46.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns ReadableInstant.class.
     * 
     * @return ReadableInstant.class
     */
    public Class<?> getSupportedType() {try{__CLR4_4_19wf9wflc8azt46.R.inc(12858);
        __CLR4_4_19wf9wflc8azt46.R.inc(12859);return ReadableInstant.class;
    }finally{__CLR4_4_19wf9wflc8azt46.R.flushNeeded();}}

}
