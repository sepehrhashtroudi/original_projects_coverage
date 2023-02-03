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

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/**
 * A year field suitable for many calendars.
 *
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.1, refactored from GJYearDateTimeField
 */
class BasicYearDateTimeField extends ImpreciseDateTimeField {public static class __CLR4_4_17id7idlc8azsvc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,9797,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version. */
    @SuppressWarnings("unused")
    private static final long serialVersionUID = -98628754872287L;

    /** The underlying basic chronology. */
    protected final BasicChronology iChronology;

    /**
     * Restricted constructor.
     * 
     * @param chronology  the chronology this field belogs to
     */
    BasicYearDateTimeField(BasicChronology chronology) {
        super(DateTimeFieldType.year(), chronology.getAverageMillisPerYear());__CLR4_4_17id7idlc8azsvc.R.inc(9734);try{__CLR4_4_17id7idlc8azsvc.R.inc(9733);
        __CLR4_4_17id7idlc8azsvc.R.inc(9735);iChronology = chronology;
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public boolean isLenient() {try{__CLR4_4_17id7idlc8azsvc.R.inc(9736);
        __CLR4_4_17id7idlc8azsvc.R.inc(9737);return false;
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public int get(long instant) {try{__CLR4_4_17id7idlc8azsvc.R.inc(9738);
        __CLR4_4_17id7idlc8azsvc.R.inc(9739);return iChronology.getYear(instant);
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public long add(long instant, int years) {try{__CLR4_4_17id7idlc8azsvc.R.inc(9740);
        __CLR4_4_17id7idlc8azsvc.R.inc(9741);if ((((years == 0)&&(__CLR4_4_17id7idlc8azsvc.R.iget(9742)!=0|true))||(__CLR4_4_17id7idlc8azsvc.R.iget(9743)==0&false))) {{
            __CLR4_4_17id7idlc8azsvc.R.inc(9744);return instant;
        }
        }__CLR4_4_17id7idlc8azsvc.R.inc(9745);int thisYear = get(instant);
        __CLR4_4_17id7idlc8azsvc.R.inc(9746);int newYear = FieldUtils.safeAdd(thisYear, years);
        __CLR4_4_17id7idlc8azsvc.R.inc(9747);return set(instant, newYear);
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public long add(long instant, long years) {try{__CLR4_4_17id7idlc8azsvc.R.inc(9748);
        __CLR4_4_17id7idlc8azsvc.R.inc(9749);return add(instant, FieldUtils.safeToInt(years));
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public long addWrapField(long instant, int years) {try{__CLR4_4_17id7idlc8azsvc.R.inc(9750);
        __CLR4_4_17id7idlc8azsvc.R.inc(9751);if ((((years == 0)&&(__CLR4_4_17id7idlc8azsvc.R.iget(9752)!=0|true))||(__CLR4_4_17id7idlc8azsvc.R.iget(9753)==0&false))) {{
            __CLR4_4_17id7idlc8azsvc.R.inc(9754);return instant;
        }
        // Return newly calculated millis value
        }__CLR4_4_17id7idlc8azsvc.R.inc(9755);int thisYear = iChronology.getYear(instant);
        __CLR4_4_17id7idlc8azsvc.R.inc(9756);int wrappedYear = FieldUtils.getWrappedValue
            (thisYear, years, iChronology.getMinYear(), iChronology.getMaxYear());
        __CLR4_4_17id7idlc8azsvc.R.inc(9757);return set(instant, wrappedYear);
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public long set(long instant, int year) {try{__CLR4_4_17id7idlc8azsvc.R.inc(9758);
        __CLR4_4_17id7idlc8azsvc.R.inc(9759);FieldUtils.verifyValueBounds
            (this, year, iChronology.getMinYear(), iChronology.getMaxYear());
        __CLR4_4_17id7idlc8azsvc.R.inc(9760);return iChronology.setYear(instant, year);
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17id7idlc8azsvc.R.inc(9761);
        __CLR4_4_17id7idlc8azsvc.R.inc(9762);if ((((minuendInstant < subtrahendInstant)&&(__CLR4_4_17id7idlc8azsvc.R.iget(9763)!=0|true))||(__CLR4_4_17id7idlc8azsvc.R.iget(9764)==0&false))) {{
            __CLR4_4_17id7idlc8azsvc.R.inc(9765);return -iChronology.getYearDifference(subtrahendInstant, minuendInstant);
        }
        }__CLR4_4_17id7idlc8azsvc.R.inc(9766);return iChronology.getYearDifference(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_17id7idlc8azsvc.R.inc(9767);
        __CLR4_4_17id7idlc8azsvc.R.inc(9768);return null;
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public boolean isLeap(long instant) {try{__CLR4_4_17id7idlc8azsvc.R.inc(9769);
        __CLR4_4_17id7idlc8azsvc.R.inc(9770);return iChronology.isLeapYear(get(instant));
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public int getLeapAmount(long instant) {try{__CLR4_4_17id7idlc8azsvc.R.inc(9771);
        __CLR4_4_17id7idlc8azsvc.R.inc(9772);if ((((iChronology.isLeapYear(get(instant)))&&(__CLR4_4_17id7idlc8azsvc.R.iget(9773)!=0|true))||(__CLR4_4_17id7idlc8azsvc.R.iget(9774)==0&false))) {{
            __CLR4_4_17id7idlc8azsvc.R.inc(9775);return 1;
        } }else {{
            __CLR4_4_17id7idlc8azsvc.R.inc(9776);return 0;
        }
    }}finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public DurationField getLeapDurationField() {try{__CLR4_4_17id7idlc8azsvc.R.inc(9777);
        __CLR4_4_17id7idlc8azsvc.R.inc(9778);return iChronology.days();
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_17id7idlc8azsvc.R.inc(9779);
        __CLR4_4_17id7idlc8azsvc.R.inc(9780);return iChronology.getMinYear();
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_17id7idlc8azsvc.R.inc(9781);
        __CLR4_4_17id7idlc8azsvc.R.inc(9782);return iChronology.getMaxYear();
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_17id7idlc8azsvc.R.inc(9783);
        __CLR4_4_17id7idlc8azsvc.R.inc(9784);return iChronology.getYearMillis(get(instant));
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public long roundCeiling(long instant) {try{__CLR4_4_17id7idlc8azsvc.R.inc(9785);
        __CLR4_4_17id7idlc8azsvc.R.inc(9786);int year = get(instant);
        __CLR4_4_17id7idlc8azsvc.R.inc(9787);long yearStartMillis = iChronology.getYearMillis(year);
        __CLR4_4_17id7idlc8azsvc.R.inc(9788);if ((((instant != yearStartMillis)&&(__CLR4_4_17id7idlc8azsvc.R.iget(9789)!=0|true))||(__CLR4_4_17id7idlc8azsvc.R.iget(9790)==0&false))) {{
            // Bump up to start of next year.
            __CLR4_4_17id7idlc8azsvc.R.inc(9791);instant = iChronology.getYearMillis(year + 1);
        }
        }__CLR4_4_17id7idlc8azsvc.R.inc(9792);return instant;
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_17id7idlc8azsvc.R.inc(9793);
        __CLR4_4_17id7idlc8azsvc.R.inc(9794);return instant - roundFloor(instant);
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_17id7idlc8azsvc.R.inc(9795);
        __CLR4_4_17id7idlc8azsvc.R.inc(9796);return iChronology.year();
    }finally{__CLR4_4_17id7idlc8azsvc.R.flushNeeded();}}
}
