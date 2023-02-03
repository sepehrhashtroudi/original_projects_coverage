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
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableInterval;

/**
 * Converts intervals into durations of any requested period type.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
class ReadableIntervalConverter extends AbstractConverter
        implements IntervalConverter, DurationConverter, PeriodConverter {public static class __CLR4_4_19x89x8lc8azt4b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,12888,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Singleton instance.
     */
    static final ReadableIntervalConverter INSTANCE = new ReadableIntervalConverter();

    /**
     * Restricted constructor.
     */
    protected ReadableIntervalConverter() {
        super();__CLR4_4_19x89x8lc8azt4b.R.inc(12861);try{__CLR4_4_19x89x8lc8azt4b.R.inc(12860);
    }finally{__CLR4_4_19x89x8lc8azt4b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the millisecond length of the interval.
     * 
     * @param object  the interval
     */
    public long getDurationMillis(Object object) {try{__CLR4_4_19x89x8lc8azt4b.R.inc(12862);
        __CLR4_4_19x89x8lc8azt4b.R.inc(12863);return (((ReadableInterval) object)).toDurationMillis();
    }finally{__CLR4_4_19x89x8lc8azt4b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the values of the mutable duration from the specified interval.
     * 
     * @param writablePeriod  the period to modify
     * @param object  the interval to set from
     * @param chrono  the chronology to use
     */
    public void setInto(ReadWritablePeriod writablePeriod, Object object, Chronology chrono) {try{__CLR4_4_19x89x8lc8azt4b.R.inc(12864);
        __CLR4_4_19x89x8lc8azt4b.R.inc(12865);ReadableInterval interval = (ReadableInterval) object;
        __CLR4_4_19x89x8lc8azt4b.R.inc(12866);chrono = ((((chrono != null )&&(__CLR4_4_19x89x8lc8azt4b.R.iget(12867)!=0|true))||(__CLR4_4_19x89x8lc8azt4b.R.iget(12868)==0&false))? chrono : DateTimeUtils.getIntervalChronology(interval));
        __CLR4_4_19x89x8lc8azt4b.R.inc(12869);long start = interval.getStartMillis();
        __CLR4_4_19x89x8lc8azt4b.R.inc(12870);long end = interval.getEndMillis();
        __CLR4_4_19x89x8lc8azt4b.R.inc(12871);int[] values = chrono.get(writablePeriod, start, end);
        __CLR4_4_19x89x8lc8azt4b.R.inc(12872);for (int i = 0; (((i < values.length)&&(__CLR4_4_19x89x8lc8azt4b.R.iget(12873)!=0|true))||(__CLR4_4_19x89x8lc8azt4b.R.iget(12874)==0&false)); i++) {{
            __CLR4_4_19x89x8lc8azt4b.R.inc(12875);writablePeriod.setValue(i, values[i]);
        }
    }}finally{__CLR4_4_19x89x8lc8azt4b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks if the input is a ReadableInterval.
     * <p>
     * If it is, then the calling code should cast and copy the fields directly.
     *
     * @param object  the object to convert, must not be null
     * @param chrono  the chronology to use, may be null
     * @return true if the input is a ReadableInterval
     * @throws ClassCastException if the object is invalid
     */
    public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_19x89x8lc8azt4b.R.inc(12876);
        __CLR4_4_19x89x8lc8azt4b.R.inc(12877);return true;
    }finally{__CLR4_4_19x89x8lc8azt4b.R.flushNeeded();}}

    /**
     * Extracts interval endpoint values from an object of this converter's
     * type, and sets them into the given ReadWritableInterval.
     *
     * @param writableInterval interval to get modified, not null
     * @param object  the object to convert, must not be null
     * @param chrono  the chronology to use, may be null
     * @throws ClassCastException if the object is invalid
     */
    public void setInto(ReadWritableInterval writableInterval, Object object, Chronology chrono) {try{__CLR4_4_19x89x8lc8azt4b.R.inc(12878);
        __CLR4_4_19x89x8lc8azt4b.R.inc(12879);ReadableInterval input = (ReadableInterval) object;
        __CLR4_4_19x89x8lc8azt4b.R.inc(12880);writableInterval.setInterval(input);
        __CLR4_4_19x89x8lc8azt4b.R.inc(12881);if ((((chrono != null)&&(__CLR4_4_19x89x8lc8azt4b.R.iget(12882)!=0|true))||(__CLR4_4_19x89x8lc8azt4b.R.iget(12883)==0&false))) {{
            __CLR4_4_19x89x8lc8azt4b.R.inc(12884);writableInterval.setChronology(chrono);
        } }else {{
            __CLR4_4_19x89x8lc8azt4b.R.inc(12885);writableInterval.setChronology(input.getChronology());
        }
    }}finally{__CLR4_4_19x89x8lc8azt4b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns ReadableInterval.class.
     */
    public Class<?> getSupportedType() {try{__CLR4_4_19x89x8lc8azt4b.R.inc(12886);
        __CLR4_4_19x89x8lc8azt4b.R.inc(12887);return ReadableInterval.class;
    }finally{__CLR4_4_19x89x8lc8azt4b.R.flushNeeded();}}

}
