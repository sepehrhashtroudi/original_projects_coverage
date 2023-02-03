/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;

/**
 * AbstractConverter simplifies the process of implementing a converter.
 *
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class AbstractConverter implements Converter {public static class __CLR4_4_19i59i5lc8azt2d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,12338,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Restricted constructor.
     */
    protected AbstractConverter() {
        super();__CLR4_4_19i59i5lc8azt2d.R.inc(12318);try{__CLR4_4_19i59i5lc8azt2d.R.inc(12317);
    }finally{__CLR4_4_19i59i5lc8azt2d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Extracts the millis from an object of this convertor's type.
     * <p>
     * This implementation returns the current time.
     * 
     * @param object  the object to convert
     * @param chrono  the chronology to use, which is always non-null
     * @return the millisecond value
     */
    public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_19i59i5lc8azt2d.R.inc(12319);
        __CLR4_4_19i59i5lc8azt2d.R.inc(12320);return DateTimeUtils.currentTimeMillis();
    }finally{__CLR4_4_19i59i5lc8azt2d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Extracts the chronology from an object of this convertor's type
     * where the time zone is specified.
     * <p>
     * This implementation returns the ISO chronology.
     * 
     * @param object  the object to convert
     * @param zone  the specified zone to use, null means default zone
     * @return the chronology, never null
     */
    public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_19i59i5lc8azt2d.R.inc(12321);
        __CLR4_4_19i59i5lc8azt2d.R.inc(12322);return ISOChronology.getInstance(zone);
    }finally{__CLR4_4_19i59i5lc8azt2d.R.flushNeeded();}}

    /**
     * Extracts the chronology from an object of this convertor's type
     * where the chronology is specified.
     * <p>
     * This implementation returns the chronology specified, or the
     * ISO chronology in the default zone if null passed in.
     * 
     * @param object  the object to convert
     * @param chrono  the chronology to use, null means ISO default
     * @return the chronology, never null
     */
    public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_19i59i5lc8azt2d.R.inc(12323);
        __CLR4_4_19i59i5lc8azt2d.R.inc(12324);return DateTimeUtils.getChronology(chrono);
    }finally{__CLR4_4_19i59i5lc8azt2d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Extracts the values of the partial from an object of this converter's type.
     * The chrono parameter is a hint to the converter, should it require a
     * chronology to aid in conversion.
     * <p>
     * This implementation calls {@link #getInstantMillis(Object, Chronology)}.
     * 
     * @param fieldSource  a partial that provides access to the fields.
     *  This partial may be incomplete and only getFieldType(int) should be used
     * @param object  the object to convert
     * @param chrono  the chronology to use, which is the non-null result of getChronology()
     * @return the array of field values that match the fieldSource, must be non-null valid
     * @throws ClassCastException if the object is invalid
     */
    public int[] getPartialValues(ReadablePartial fieldSource, Object object, Chronology chrono) {try{__CLR4_4_19i59i5lc8azt2d.R.inc(12325);
        __CLR4_4_19i59i5lc8azt2d.R.inc(12326);long instant = getInstantMillis(object, chrono);
        __CLR4_4_19i59i5lc8azt2d.R.inc(12327);return chrono.get(fieldSource, instant);
    }finally{__CLR4_4_19i59i5lc8azt2d.R.flushNeeded();}}

    /**
     * Extracts the values of the partial from an object of this converter's type.
     * The chrono parameter is a hint to the converter, should it require a
     * chronology to aid in conversion.
     * <p>
     * This implementation calls {@link #getPartialValues(ReadablePartial, Object, Chronology)}.
     * 
     * @param fieldSource  a partial that provides access to the fields.
     *  This partial may be incomplete and only getFieldType(int) should be used
     * @param object  the object to convert
     * @param chrono  the chronology to use, which is the non-null result of getChronology()
     * @param parser  if converting from a String, the given parser is preferred
     * @return the array of field values that match the fieldSource, must be non-null valid
     * @throws ClassCastException if the object is invalid
     * @since 1.3
     */
    public int[] getPartialValues(ReadablePartial fieldSource,
            Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_19i59i5lc8azt2d.R.inc(12328);
        __CLR4_4_19i59i5lc8azt2d.R.inc(12329);return getPartialValues(fieldSource, object, chrono);
    }finally{__CLR4_4_19i59i5lc8azt2d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Selects a suitable period type for the given object.
     *
     * @param object  the object to examine
     * @return the period type, never null
     */
    public PeriodType getPeriodType(Object object) {try{__CLR4_4_19i59i5lc8azt2d.R.inc(12330);
        __CLR4_4_19i59i5lc8azt2d.R.inc(12331);return PeriodType.standard();
    }finally{__CLR4_4_19i59i5lc8azt2d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks if the input is a ReadableInterval.
     * <p>
     * If it is, then the calling code should cast and copy the fields directly.
     *
     * @param object  the object to convert
     * @param chrono  the chronology to use, may be null
     * @return true if the input is a ReadableInterval
     */
    public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_19i59i5lc8azt2d.R.inc(12332);
        __CLR4_4_19i59i5lc8azt2d.R.inc(12333);return false;
    }finally{__CLR4_4_19i59i5lc8azt2d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets a debugging string version of this converter.
     * 
     * @return a debugging string
     */
    public String toString() {try{__CLR4_4_19i59i5lc8azt2d.R.inc(12334);
        __CLR4_4_19i59i5lc8azt2d.R.inc(12335);return "Converter[" + ((((getSupportedType() == null )&&(__CLR4_4_19i59i5lc8azt2d.R.iget(12336)!=0|true))||(__CLR4_4_19i59i5lc8azt2d.R.iget(12337)==0&false))? "null" : getSupportedType().getName()) + "]";
    }finally{__CLR4_4_19i59i5lc8azt2d.R.flushNeeded();}}

}
