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
import org.joda.time.DurationFieldType;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDurationField;

/**
 * Provides time calculations for the era component of time.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
final class GJEraDateTimeField extends BaseDateTimeField {public static class __CLR4_4_188d88dlc8azsxt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,10723,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /** Serialization version */
    @SuppressWarnings("unused")
    private static final long serialVersionUID = 4240986525305515528L;

    private final BasicChronology iChronology;

    /**
     * Restricted constructor
     */
    GJEraDateTimeField(BasicChronology chronology) {
        super(DateTimeFieldType.era());__CLR4_4_188d88dlc8azsxt.R.inc(10670);try{__CLR4_4_188d88dlc8azsxt.R.inc(10669);
        __CLR4_4_188d88dlc8azsxt.R.inc(10671);iChronology = chronology;
    }finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    public boolean isLenient() {try{__CLR4_4_188d88dlc8azsxt.R.inc(10672);
        __CLR4_4_188d88dlc8azsxt.R.inc(10673);return false;
    }finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    /**
     * Get the Era component of the specified time instant.
     * 
     * @param instant  the time instant in millis to query.
     */
    public int get(long instant) {try{__CLR4_4_188d88dlc8azsxt.R.inc(10674);
        __CLR4_4_188d88dlc8azsxt.R.inc(10675);if ((((iChronology.getYear(instant) <= 0)&&(__CLR4_4_188d88dlc8azsxt.R.iget(10676)!=0|true))||(__CLR4_4_188d88dlc8azsxt.R.iget(10677)==0&false))) {{
            __CLR4_4_188d88dlc8azsxt.R.inc(10678);return DateTimeConstants.BCE;
        } }else {{
            __CLR4_4_188d88dlc8azsxt.R.inc(10679);return DateTimeConstants.CE;
        }
    }}finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_188d88dlc8azsxt.R.inc(10680);
        __CLR4_4_188d88dlc8azsxt.R.inc(10681);return GJLocaleSymbols.forLocale(locale).eraValueToText(fieldValue);
    }finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    /**
     * Set the Era component of the specified time instant.
     * 
     * @param instant  the time instant in millis to update.
     * @param era  the era to update the time to.
     * @return the updated time instant.
     * @throws IllegalArgumentException  if era is invalid.
     */
    public long set(long instant, int era) {try{__CLR4_4_188d88dlc8azsxt.R.inc(10682);
        __CLR4_4_188d88dlc8azsxt.R.inc(10683);FieldUtils.verifyValueBounds(this, era, DateTimeConstants.BCE, DateTimeConstants.CE);
            
        __CLR4_4_188d88dlc8azsxt.R.inc(10684);int oldEra = get(instant);
        __CLR4_4_188d88dlc8azsxt.R.inc(10685);if ((((oldEra != era)&&(__CLR4_4_188d88dlc8azsxt.R.iget(10686)!=0|true))||(__CLR4_4_188d88dlc8azsxt.R.iget(10687)==0&false))) {{
            __CLR4_4_188d88dlc8azsxt.R.inc(10688);int year = iChronology.getYear(instant);
            __CLR4_4_188d88dlc8azsxt.R.inc(10689);return iChronology.setYear(instant, -year);
        } }else {{
            __CLR4_4_188d88dlc8azsxt.R.inc(10690);return instant;
        }
    }}finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    public long set(long instant, String text, Locale locale) {try{__CLR4_4_188d88dlc8azsxt.R.inc(10691);
        __CLR4_4_188d88dlc8azsxt.R.inc(10692);return set(instant, GJLocaleSymbols.forLocale(locale).eraTextToValue(text));
    }finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_188d88dlc8azsxt.R.inc(10693);
        __CLR4_4_188d88dlc8azsxt.R.inc(10694);if ((((get(instant) == DateTimeConstants.CE)&&(__CLR4_4_188d88dlc8azsxt.R.iget(10695)!=0|true))||(__CLR4_4_188d88dlc8azsxt.R.iget(10696)==0&false))) {{
            __CLR4_4_188d88dlc8azsxt.R.inc(10697);return iChronology.setYear(0, 1);
        } }else {{
            __CLR4_4_188d88dlc8azsxt.R.inc(10698);return Long.MIN_VALUE;
        }
    }}finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    public long roundCeiling(long instant) {try{__CLR4_4_188d88dlc8azsxt.R.inc(10699);
        __CLR4_4_188d88dlc8azsxt.R.inc(10700);if ((((get(instant) == DateTimeConstants.BCE)&&(__CLR4_4_188d88dlc8azsxt.R.iget(10701)!=0|true))||(__CLR4_4_188d88dlc8azsxt.R.iget(10702)==0&false))) {{
            __CLR4_4_188d88dlc8azsxt.R.inc(10703);return iChronology.setYear(0, 1);
        } }else {{
            __CLR4_4_188d88dlc8azsxt.R.inc(10704);return Long.MAX_VALUE;
        }
    }}finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    public long roundHalfFloor(long instant) {try{__CLR4_4_188d88dlc8azsxt.R.inc(10705);
        // In reality, the era is infinite, so there is no halfway point.
        __CLR4_4_188d88dlc8azsxt.R.inc(10706);return roundFloor(instant);
    }finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    public long roundHalfCeiling(long instant) {try{__CLR4_4_188d88dlc8azsxt.R.inc(10707);
        // In reality, the era is infinite, so there is no halfway point.
        __CLR4_4_188d88dlc8azsxt.R.inc(10708);return roundFloor(instant);
    }finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    public long roundHalfEven(long instant) {try{__CLR4_4_188d88dlc8azsxt.R.inc(10709);
        // In reality, the era is infinite, so there is no halfway point.
        __CLR4_4_188d88dlc8azsxt.R.inc(10710);return roundFloor(instant);
    }finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    public DurationField getDurationField() {try{__CLR4_4_188d88dlc8azsxt.R.inc(10711);
        __CLR4_4_188d88dlc8azsxt.R.inc(10712);return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_188d88dlc8azsxt.R.inc(10713);
        __CLR4_4_188d88dlc8azsxt.R.inc(10714);return null;
    }finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_188d88dlc8azsxt.R.inc(10715);
        __CLR4_4_188d88dlc8azsxt.R.inc(10716);return DateTimeConstants.BCE;
    }finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_188d88dlc8azsxt.R.inc(10717);
        __CLR4_4_188d88dlc8azsxt.R.inc(10718);return DateTimeConstants.CE;
    }finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_188d88dlc8azsxt.R.inc(10719);
        __CLR4_4_188d88dlc8azsxt.R.inc(10720);return GJLocaleSymbols.forLocale(locale).getEraMaxTextLength();
    }finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_188d88dlc8azsxt.R.inc(10721);
        __CLR4_4_188d88dlc8azsxt.R.inc(10722);return iChronology.era();
    }finally{__CLR4_4_188d88dlc8azsxt.R.flushNeeded();}}
}
