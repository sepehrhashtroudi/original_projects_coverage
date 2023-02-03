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

import java.util.Locale;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.PreciseDurationDateTimeField;

/**
 * GJDayOfWeekDateTimeField provides time calculations for the
 * day of the week component of time.
 *
 * @since 1.0
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 */
final class GJDayOfWeekDateTimeField extends PreciseDurationDateTimeField {public static class __CLR4_4_187q87qlc8azsxn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,10669,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /** Serialization version */
    @SuppressWarnings("unused")
    private static final long serialVersionUID = -3857947176719041436L;

    private final BasicChronology iChronology;

    /**
     * Restricted constructor.
     */
    GJDayOfWeekDateTimeField(BasicChronology chronology, DurationField days) {
        super(DateTimeFieldType.dayOfWeek(), days);__CLR4_4_187q87qlc8azsxn.R.inc(10647);try{__CLR4_4_187q87qlc8azsxn.R.inc(10646);
        __CLR4_4_187q87qlc8azsxn.R.inc(10648);iChronology = chronology;
    }finally{__CLR4_4_187q87qlc8azsxn.R.flushNeeded();}}

    /**
     * Get the value of the specified time instant.
     * 
     * @param instant  the time instant in millis to query
     * @return the day of the week extracted from the input
     */
    public int get(long instant) {try{__CLR4_4_187q87qlc8azsxn.R.inc(10649);
        __CLR4_4_187q87qlc8azsxn.R.inc(10650);return iChronology.getDayOfWeek(instant);
    }finally{__CLR4_4_187q87qlc8azsxn.R.flushNeeded();}}

    /**
     * Get the textual value of the specified time instant.
     * 
     * @param fieldValue  the field value to query
     * @param locale  the locale to use
     * @return the day of the week, such as 'Monday'
     */
    public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_187q87qlc8azsxn.R.inc(10651);
        __CLR4_4_187q87qlc8azsxn.R.inc(10652);return GJLocaleSymbols.forLocale(locale).dayOfWeekValueToText(fieldValue);
    }finally{__CLR4_4_187q87qlc8azsxn.R.flushNeeded();}}

    /**
     * Get the abbreviated textual value of the specified time instant.
     * 
     * @param fieldValue  the field value to query
     * @param locale  the locale to use
     * @return the day of the week, such as 'Mon'
     */
    public String getAsShortText(int fieldValue, Locale locale) {try{__CLR4_4_187q87qlc8azsxn.R.inc(10653);
        __CLR4_4_187q87qlc8azsxn.R.inc(10654);return GJLocaleSymbols.forLocale(locale).dayOfWeekValueToShortText(fieldValue);
    }finally{__CLR4_4_187q87qlc8azsxn.R.flushNeeded();}}

    /**
     * Convert the specified text and locale into a value.
     * 
     * @param text  the text to convert
     * @param locale  the locale to convert using
     * @return the value extracted from the text
     * @throws IllegalArgumentException if the text is invalid
     */
    protected int convertText(String text, Locale locale) {try{__CLR4_4_187q87qlc8azsxn.R.inc(10655);
        __CLR4_4_187q87qlc8azsxn.R.inc(10656);return GJLocaleSymbols.forLocale(locale).dayOfWeekTextToValue(text);
    }finally{__CLR4_4_187q87qlc8azsxn.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_187q87qlc8azsxn.R.inc(10657);
        __CLR4_4_187q87qlc8azsxn.R.inc(10658);return iChronology.weeks();
    }finally{__CLR4_4_187q87qlc8azsxn.R.flushNeeded();}}

    /**
     * Get the minimum value that this field can have.
     * 
     * @return the field's minimum value
     */
    public int getMinimumValue() {try{__CLR4_4_187q87qlc8azsxn.R.inc(10659);
        __CLR4_4_187q87qlc8azsxn.R.inc(10660);return DateTimeConstants.MONDAY;
    }finally{__CLR4_4_187q87qlc8azsxn.R.flushNeeded();}}

    /**
     * Get the maximum value that this field can have.
     * 
     * @return the field's maximum value
     */
    public int getMaximumValue() {try{__CLR4_4_187q87qlc8azsxn.R.inc(10661);
        __CLR4_4_187q87qlc8azsxn.R.inc(10662);return DateTimeConstants.SUNDAY;
    }finally{__CLR4_4_187q87qlc8azsxn.R.flushNeeded();}}

    /**
     * Get the maximum length of the text returned by this field.
     * 
     * @param locale  the locale to use
     * @return the maximum textual length
     */
    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_187q87qlc8azsxn.R.inc(10663);
        __CLR4_4_187q87qlc8azsxn.R.inc(10664);return GJLocaleSymbols.forLocale(locale).getDayOfWeekMaxTextLength();
    }finally{__CLR4_4_187q87qlc8azsxn.R.flushNeeded();}}

    /**
     * Get the maximum length of the abbreviated text returned by this field.
     * 
     * @param locale  the locale to use
     * @return the maximum abbreviated textual length
     */
    public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_187q87qlc8azsxn.R.inc(10665);
        __CLR4_4_187q87qlc8azsxn.R.inc(10666);return GJLocaleSymbols.forLocale(locale).getDayOfWeekMaxShortTextLength();
    }finally{__CLR4_4_187q87qlc8azsxn.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_187q87qlc8azsxn.R.inc(10667);
        __CLR4_4_187q87qlc8azsxn.R.inc(10668);return iChronology.dayOfWeek();
    }finally{__CLR4_4_187q87qlc8azsxn.R.flushNeeded();}}
}
