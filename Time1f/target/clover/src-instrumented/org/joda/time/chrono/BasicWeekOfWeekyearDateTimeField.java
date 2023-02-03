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

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;

/**
 * Provides time calculations for the week of a week based year component of time.
 *
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.1, refactored from GJWeekOfWeekyearDateTimeField
 */
final class BasicWeekOfWeekyearDateTimeField extends PreciseDurationDateTimeField {public static class __CLR4_4_17ek7eklc8azsuu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,9640,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = -1587436826395135328L;

    private final BasicChronology iChronology;

    /**
     * Restricted constructor
     */
    BasicWeekOfWeekyearDateTimeField(BasicChronology chronology, DurationField weeks) {
        super(DateTimeFieldType.weekOfWeekyear(), weeks);__CLR4_4_17ek7eklc8azsuu.R.inc(9597);try{__CLR4_4_17ek7eklc8azsuu.R.inc(9596);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9598);iChronology = chronology;
    }finally{__CLR4_4_17ek7eklc8azsuu.R.flushNeeded();}}

    /**
     * Get the week of a week based year component of the specified time instant.
     * 
     * @see org.joda.time.DateTimeField#get(long)
     * @param instant  the time instant in millis to query.
     * @return the week of the year extracted from the input.
     */
    public int get(long instant) {try{__CLR4_4_17ek7eklc8azsuu.R.inc(9599);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9600);return iChronology.getWeekOfWeekyear(instant);
    }finally{__CLR4_4_17ek7eklc8azsuu.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_17ek7eklc8azsuu.R.inc(9601);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9602);return iChronology.weekyears();
    }finally{__CLR4_4_17ek7eklc8azsuu.R.flushNeeded();}}

    // 1970-01-01 is day of week 4, Thursday. The rounding methods need to
    // apply a corrective alignment since weeks begin on day of week 1, Monday.

    public long roundFloor(long instant) {try{__CLR4_4_17ek7eklc8azsuu.R.inc(9603);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9604);return super.roundFloor(instant + 3 * DateTimeConstants.MILLIS_PER_DAY)
            - 3 * DateTimeConstants.MILLIS_PER_DAY;
    }finally{__CLR4_4_17ek7eklc8azsuu.R.flushNeeded();}}

    public long roundCeiling(long instant) {try{__CLR4_4_17ek7eklc8azsuu.R.inc(9605);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9606);return super.roundCeiling(instant + 3 * DateTimeConstants.MILLIS_PER_DAY)
            - 3 * DateTimeConstants.MILLIS_PER_DAY;
    }finally{__CLR4_4_17ek7eklc8azsuu.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_17ek7eklc8azsuu.R.inc(9607);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9608);return super.remainder(instant + 3 * DateTimeConstants.MILLIS_PER_DAY);
    }finally{__CLR4_4_17ek7eklc8azsuu.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_17ek7eklc8azsuu.R.inc(9609);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9610);return 1;
    }finally{__CLR4_4_17ek7eklc8azsuu.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_17ek7eklc8azsuu.R.inc(9611);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9612);return 53;
    }finally{__CLR4_4_17ek7eklc8azsuu.R.flushNeeded();}}

    public int getMaximumValue(long instant) {try{__CLR4_4_17ek7eklc8azsuu.R.inc(9613);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9614);int weekyear = iChronology.getWeekyear(instant);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9615);return iChronology.getWeeksInYear(weekyear);
    }finally{__CLR4_4_17ek7eklc8azsuu.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial partial) {try{__CLR4_4_17ek7eklc8azsuu.R.inc(9616);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9617);if ((((partial.isSupported(DateTimeFieldType.weekyear()))&&(__CLR4_4_17ek7eklc8azsuu.R.iget(9618)!=0|true))||(__CLR4_4_17ek7eklc8azsuu.R.iget(9619)==0&false))) {{
            __CLR4_4_17ek7eklc8azsuu.R.inc(9620);int weekyear = partial.get(DateTimeFieldType.weekyear());
            __CLR4_4_17ek7eklc8azsuu.R.inc(9621);return iChronology.getWeeksInYear(weekyear);
        }
        }__CLR4_4_17ek7eklc8azsuu.R.inc(9622);return 53;
    }finally{__CLR4_4_17ek7eklc8azsuu.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial partial, int[] values) {try{__CLR4_4_17ek7eklc8azsuu.R.inc(9623);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9624);int size = partial.size();
        __CLR4_4_17ek7eklc8azsuu.R.inc(9625);for (int i = 0; (((i < size)&&(__CLR4_4_17ek7eklc8azsuu.R.iget(9626)!=0|true))||(__CLR4_4_17ek7eklc8azsuu.R.iget(9627)==0&false)); i++) {{
            __CLR4_4_17ek7eklc8azsuu.R.inc(9628);if ((((partial.getFieldType(i) == DateTimeFieldType.weekyear())&&(__CLR4_4_17ek7eklc8azsuu.R.iget(9629)!=0|true))||(__CLR4_4_17ek7eklc8azsuu.R.iget(9630)==0&false))) {{
                __CLR4_4_17ek7eklc8azsuu.R.inc(9631);int weekyear = values[i];
                __CLR4_4_17ek7eklc8azsuu.R.inc(9632);return iChronology.getWeeksInYear(weekyear);
            }
        }}
        }__CLR4_4_17ek7eklc8azsuu.R.inc(9633);return 53;
    }finally{__CLR4_4_17ek7eklc8azsuu.R.flushNeeded();}}

    protected int getMaximumValueForSet(long instant, int value) {try{__CLR4_4_17ek7eklc8azsuu.R.inc(9634);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9635);return (((value > 52 )&&(__CLR4_4_17ek7eklc8azsuu.R.iget(9636)!=0|true))||(__CLR4_4_17ek7eklc8azsuu.R.iget(9637)==0&false))? getMaximumValue(instant) : 52;
    }finally{__CLR4_4_17ek7eklc8azsuu.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_17ek7eklc8azsuu.R.inc(9638);
        __CLR4_4_17ek7eklc8azsuu.R.inc(9639);return iChronology.weekOfWeekyear();
    }finally{__CLR4_4_17ek7eklc8azsuu.R.flushNeeded();}}
}
