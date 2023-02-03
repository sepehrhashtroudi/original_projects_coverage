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
package org.joda.time.field;

import java.io.Serializable;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/**
 * Duration field class representing a field with a fixed unit length of one
 * millisecond.
 * <p>
 * MillisDurationField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class MillisDurationField extends DurationField implements Serializable {public static class __CLR4_4_1aw0aw0lc8azt8f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,14172,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock. */
    private static final long serialVersionUID = 2656707858124633367L;

    /** Singleton instance. */
    public static final DurationField INSTANCE = new MillisDurationField();

    /**
     * Restricted constructor.
     */
    private MillisDurationField() {
        super();__CLR4_4_1aw0aw0lc8azt8f.R.inc(14113);try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14112);
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}
    
    //------------------------------------------------------------------------
    public DurationFieldType getType() {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14114);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14115);return DurationFieldType.millis();
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14116);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14117);return "millis";
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    /**
     * Returns true as this field is supported.
     * 
     * @return true always
     */
    public boolean isSupported() {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14118);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14119);return true;
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    /**
     * Returns true as this field is precise.
     * 
     * @return true always
     */
    public final boolean isPrecise() {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14120);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14121);return true;
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    /**
     * Returns the amount of milliseconds per unit value of this field.
     *
     * @return one always
     */
    public final long getUnitMillis() {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14122);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14123);return 1;
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    //------------------------------------------------------------------------
    public int getValue(long duration) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14124);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14125);return FieldUtils.safeToInt(duration);
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public long getValueAsLong(long duration) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14126);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14127);return duration;
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public int getValue(long duration, long instant) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14128);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14129);return FieldUtils.safeToInt(duration);
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14130);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14131);return duration;
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public long getMillis(int value) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14132);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14133);return value;
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public long getMillis(long value) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14134);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14135);return value;
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public long getMillis(int value, long instant) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14136);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14137);return value;
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public long getMillis(long value, long instant) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14138);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14139);return value;
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public long add(long instant, int value) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14140);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14141);return FieldUtils.safeAdd(instant, value);
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public long add(long instant, long value) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14142);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14143);return FieldUtils.safeAdd(instant, value);
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14144);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14145);return FieldUtils.safeToInt(FieldUtils.safeSubtract(minuendInstant, subtrahendInstant));
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14146);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14147);return FieldUtils.safeSubtract(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    //------------------------------------------------------------------------
    public int compareTo(DurationField otherField) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14148);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14149);long otherMillis = otherField.getUnitMillis();
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14150);long thisMillis = getUnitMillis();
        // cannot do (thisMillis - otherMillis) as can overflow
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14151);if ((((thisMillis == otherMillis)&&(__CLR4_4_1aw0aw0lc8azt8f.R.iget(14152)!=0|true))||(__CLR4_4_1aw0aw0lc8azt8f.R.iget(14153)==0&false))) {{
            __CLR4_4_1aw0aw0lc8azt8f.R.inc(14154);return 0;
        }
        }__CLR4_4_1aw0aw0lc8azt8f.R.inc(14155);if ((((thisMillis < otherMillis)&&(__CLR4_4_1aw0aw0lc8azt8f.R.iget(14156)!=0|true))||(__CLR4_4_1aw0aw0lc8azt8f.R.iget(14157)==0&false))) {{
            __CLR4_4_1aw0aw0lc8azt8f.R.inc(14158);return -1;
        } }else {{
            __CLR4_4_1aw0aw0lc8azt8f.R.inc(14159);return 1;
        }
    }}finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public boolean equals(Object obj) {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14160);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14161);if ((((obj instanceof MillisDurationField)&&(__CLR4_4_1aw0aw0lc8azt8f.R.iget(14162)!=0|true))||(__CLR4_4_1aw0aw0lc8azt8f.R.iget(14163)==0&false))) {{
            __CLR4_4_1aw0aw0lc8azt8f.R.inc(14164);return getUnitMillis() == ((MillisDurationField) obj).getUnitMillis();
        }
        }__CLR4_4_1aw0aw0lc8azt8f.R.inc(14165);return false;
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    public int hashCode() {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14166);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14167);return (int) getUnitMillis();
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    /**
     * Get a suitable debug string.
     * 
     * @return debug string
     */
    public String toString() {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14168);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14169);return "DurationField[millis]";
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

    /**
     * Deserialize to the singleton.
     */
    private Object readResolve() {try{__CLR4_4_1aw0aw0lc8azt8f.R.inc(14170);
        __CLR4_4_1aw0aw0lc8azt8f.R.inc(14171);return INSTANCE;
    }finally{__CLR4_4_1aw0aw0lc8azt8f.R.flushNeeded();}}

}
