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
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;

/**
 * Provides time calculations for the day of the month component of time.
 *
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.1, refactored from GJDayOfMonthDateTimeField
 */
final class BasicDayOfMonthDateTimeField extends PreciseDurationDateTimeField {public static class __CLR4_4_1713713lc8azssn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,9159,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = -4677223814028011723L;

    private final BasicChronology iChronology;

    /**
     * Restricted constructor.
     */
    BasicDayOfMonthDateTimeField(BasicChronology chronology, DurationField days) {
        super(DateTimeFieldType.dayOfMonth(), days);__CLR4_4_1713713lc8azssn.R.inc(9112);try{__CLR4_4_1713713lc8azssn.R.inc(9111);
        __CLR4_4_1713713lc8azssn.R.inc(9113);iChronology = chronology;
    }finally{__CLR4_4_1713713lc8azssn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public int get(long instant) {try{__CLR4_4_1713713lc8azssn.R.inc(9114);
        __CLR4_4_1713713lc8azssn.R.inc(9115);return iChronology.getDayOfMonth(instant);
    }finally{__CLR4_4_1713713lc8azssn.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_1713713lc8azssn.R.inc(9116);
        __CLR4_4_1713713lc8azssn.R.inc(9117);return iChronology.months();
    }finally{__CLR4_4_1713713lc8azssn.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_1713713lc8azssn.R.inc(9118);
        __CLR4_4_1713713lc8azssn.R.inc(9119);return 1;
    }finally{__CLR4_4_1713713lc8azssn.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_1713713lc8azssn.R.inc(9120);
        __CLR4_4_1713713lc8azssn.R.inc(9121);return iChronology.getDaysInMonthMax();
    }finally{__CLR4_4_1713713lc8azssn.R.flushNeeded();}}

    public int getMaximumValue(long instant) {try{__CLR4_4_1713713lc8azssn.R.inc(9122);
        __CLR4_4_1713713lc8azssn.R.inc(9123);return iChronology.getDaysInMonthMax(instant);
    }finally{__CLR4_4_1713713lc8azssn.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial partial) {try{__CLR4_4_1713713lc8azssn.R.inc(9124);
        __CLR4_4_1713713lc8azssn.R.inc(9125);if ((((partial.isSupported(DateTimeFieldType.monthOfYear()))&&(__CLR4_4_1713713lc8azssn.R.iget(9126)!=0|true))||(__CLR4_4_1713713lc8azssn.R.iget(9127)==0&false))) {{
            __CLR4_4_1713713lc8azssn.R.inc(9128);int month = partial.get(DateTimeFieldType.monthOfYear());
            __CLR4_4_1713713lc8azssn.R.inc(9129);if ((((partial.isSupported(DateTimeFieldType.year()))&&(__CLR4_4_1713713lc8azssn.R.iget(9130)!=0|true))||(__CLR4_4_1713713lc8azssn.R.iget(9131)==0&false))) {{
                __CLR4_4_1713713lc8azssn.R.inc(9132);int year = partial.get(DateTimeFieldType.year());
                __CLR4_4_1713713lc8azssn.R.inc(9133);return iChronology.getDaysInYearMonth(year, month);
            }
            }__CLR4_4_1713713lc8azssn.R.inc(9134);return iChronology.getDaysInMonthMax(month);
        }
        }__CLR4_4_1713713lc8azssn.R.inc(9135);return getMaximumValue();
    }finally{__CLR4_4_1713713lc8azssn.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial partial, int[] values) {try{__CLR4_4_1713713lc8azssn.R.inc(9136);
        __CLR4_4_1713713lc8azssn.R.inc(9137);int size = partial.size();
        __CLR4_4_1713713lc8azssn.R.inc(9138);for (int i = 0; (((i < size)&&(__CLR4_4_1713713lc8azssn.R.iget(9139)!=0|true))||(__CLR4_4_1713713lc8azssn.R.iget(9140)==0&false)); i++) {{
            __CLR4_4_1713713lc8azssn.R.inc(9141);if ((((partial.getFieldType(i) == DateTimeFieldType.monthOfYear())&&(__CLR4_4_1713713lc8azssn.R.iget(9142)!=0|true))||(__CLR4_4_1713713lc8azssn.R.iget(9143)==0&false))) {{
                __CLR4_4_1713713lc8azssn.R.inc(9144);int month = values[i];
                __CLR4_4_1713713lc8azssn.R.inc(9145);for (int j = 0; (((j < size)&&(__CLR4_4_1713713lc8azssn.R.iget(9146)!=0|true))||(__CLR4_4_1713713lc8azssn.R.iget(9147)==0&false)); j++) {{
                    __CLR4_4_1713713lc8azssn.R.inc(9148);if ((((partial.getFieldType(j) == DateTimeFieldType.year())&&(__CLR4_4_1713713lc8azssn.R.iget(9149)!=0|true))||(__CLR4_4_1713713lc8azssn.R.iget(9150)==0&false))) {{
                        __CLR4_4_1713713lc8azssn.R.inc(9151);int year = values[j];
                        __CLR4_4_1713713lc8azssn.R.inc(9152);return iChronology.getDaysInYearMonth(year, month);
                    }
                }}
                }__CLR4_4_1713713lc8azssn.R.inc(9153);return iChronology.getDaysInMonthMax(month);
            }
        }}
        }__CLR4_4_1713713lc8azssn.R.inc(9154);return getMaximumValue();
    }finally{__CLR4_4_1713713lc8azssn.R.flushNeeded();}}

    protected int getMaximumValueForSet(long instant, int value) {try{__CLR4_4_1713713lc8azssn.R.inc(9155);
        __CLR4_4_1713713lc8azssn.R.inc(9156);return iChronology.getDaysInMonthMaxForSet(instant, value);
    }finally{__CLR4_4_1713713lc8azssn.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_1713713lc8azssn.R.inc(9157);
        __CLR4_4_1713713lc8azssn.R.inc(9158);return iChronology.dayOfMonth();
    }finally{__CLR4_4_1713713lc8azssn.R.flushNeeded();}}
}
