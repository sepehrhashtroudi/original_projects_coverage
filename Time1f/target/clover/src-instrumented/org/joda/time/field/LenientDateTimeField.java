/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2007 Stephen Colebourne
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

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;

/**
 * Converts a strict DateTimeField into a lenient one. By being lenient, the
 * set method accepts out of bounds values, performing an addition instead.
 * <p>
 * LenientDateTimeField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @see org.joda.time.chrono.LenientChronology
 * @see StrictDateTimeField
 * @since 1.0
 */
public class LenientDateTimeField extends DelegatedDateTimeField {public static class __CLR4_4_1avcavclc8azt8a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,14112,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 8714085824173290599L;

    private final Chronology iBase;

    /**
     * Returns a lenient version of the given field. If it is already lenient,
     * then it is returned as-is. Otherwise, a new LenientDateTimeField is
     * returned.
     */
    public static DateTimeField getInstance(DateTimeField field, Chronology base) {try{__CLR4_4_1avcavclc8azt8a.R.inc(14088);
        __CLR4_4_1avcavclc8azt8a.R.inc(14089);if ((((field == null)&&(__CLR4_4_1avcavclc8azt8a.R.iget(14090)!=0|true))||(__CLR4_4_1avcavclc8azt8a.R.iget(14091)==0&false))) {{
            __CLR4_4_1avcavclc8azt8a.R.inc(14092);return null;
        }
        }__CLR4_4_1avcavclc8azt8a.R.inc(14093);if ((((field instanceof StrictDateTimeField)&&(__CLR4_4_1avcavclc8azt8a.R.iget(14094)!=0|true))||(__CLR4_4_1avcavclc8azt8a.R.iget(14095)==0&false))) {{
            __CLR4_4_1avcavclc8azt8a.R.inc(14096);field = ((StrictDateTimeField)field).getWrappedField();
        }
        }__CLR4_4_1avcavclc8azt8a.R.inc(14097);if ((((field.isLenient())&&(__CLR4_4_1avcavclc8azt8a.R.iget(14098)!=0|true))||(__CLR4_4_1avcavclc8azt8a.R.iget(14099)==0&false))) {{
            __CLR4_4_1avcavclc8azt8a.R.inc(14100);return field;
        }
        }__CLR4_4_1avcavclc8azt8a.R.inc(14101);return new LenientDateTimeField(field, base);
    }finally{__CLR4_4_1avcavclc8azt8a.R.flushNeeded();}}

    protected LenientDateTimeField(DateTimeField field, Chronology base) {
        super(field);__CLR4_4_1avcavclc8azt8a.R.inc(14103);try{__CLR4_4_1avcavclc8azt8a.R.inc(14102);
        __CLR4_4_1avcavclc8azt8a.R.inc(14104);iBase = base;
    }finally{__CLR4_4_1avcavclc8azt8a.R.flushNeeded();}}

    public final boolean isLenient() {try{__CLR4_4_1avcavclc8azt8a.R.inc(14105);
        __CLR4_4_1avcavclc8azt8a.R.inc(14106);return true;
    }finally{__CLR4_4_1avcavclc8azt8a.R.flushNeeded();}}

    /**
     * Set values which may be out of bounds by adding the difference between
     * the new value and the current value.
     */
    public long set(long instant, int value) {try{__CLR4_4_1avcavclc8azt8a.R.inc(14107);
        // lenient needs to handle time zone chronologies
        // so we do the calculation using local milliseconds
        __CLR4_4_1avcavclc8azt8a.R.inc(14108);long localInstant = iBase.getZone().convertUTCToLocal(instant);
        __CLR4_4_1avcavclc8azt8a.R.inc(14109);long difference = FieldUtils.safeSubtract(value, get(instant));
        __CLR4_4_1avcavclc8azt8a.R.inc(14110);localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
        __CLR4_4_1avcavclc8azt8a.R.inc(14111);return iBase.getZone().convertLocalToUTC(localInstant, false, instant);
    }finally{__CLR4_4_1avcavclc8azt8a.R.flushNeeded();}}
}
