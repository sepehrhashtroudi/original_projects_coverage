/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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

import org.joda.time.DateTimeField;

/**
 * Converts a lenient DateTimeField into a strict one. By being strict, the set
 * throws an IllegalArgumentException if the value is out of bounds.
 * <p>
 * StrictDateTimeField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @see org.joda.time.chrono.StrictChronology
 * @see LenientDateTimeField
 * @since 1.0
 */
public class StrictDateTimeField extends DelegatedDateTimeField {public static class __CLR4_4_1b88b88lc8aztaf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,14573,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 3154803964207950910L;

    /**
     * Returns a strict version of the given field. If it is already strict,
     * then it is returned as-is. Otherwise, a new StrictDateTimeField is
     * returned.
     */
    public static DateTimeField getInstance(DateTimeField field) {try{__CLR4_4_1b88b88lc8aztaf.R.inc(14552);
        __CLR4_4_1b88b88lc8aztaf.R.inc(14553);if ((((field == null)&&(__CLR4_4_1b88b88lc8aztaf.R.iget(14554)!=0|true))||(__CLR4_4_1b88b88lc8aztaf.R.iget(14555)==0&false))) {{
            __CLR4_4_1b88b88lc8aztaf.R.inc(14556);return null;
        }
        }__CLR4_4_1b88b88lc8aztaf.R.inc(14557);if ((((field instanceof LenientDateTimeField)&&(__CLR4_4_1b88b88lc8aztaf.R.iget(14558)!=0|true))||(__CLR4_4_1b88b88lc8aztaf.R.iget(14559)==0&false))) {{
            __CLR4_4_1b88b88lc8aztaf.R.inc(14560);field = ((LenientDateTimeField)field).getWrappedField();
        }
        }__CLR4_4_1b88b88lc8aztaf.R.inc(14561);if ((((!field.isLenient())&&(__CLR4_4_1b88b88lc8aztaf.R.iget(14562)!=0|true))||(__CLR4_4_1b88b88lc8aztaf.R.iget(14563)==0&false))) {{
            __CLR4_4_1b88b88lc8aztaf.R.inc(14564);return field;
        }
        }__CLR4_4_1b88b88lc8aztaf.R.inc(14565);return new StrictDateTimeField(field);
    }finally{__CLR4_4_1b88b88lc8aztaf.R.flushNeeded();}}

    protected StrictDateTimeField(DateTimeField field) {
        super(field);__CLR4_4_1b88b88lc8aztaf.R.inc(14567);try{__CLR4_4_1b88b88lc8aztaf.R.inc(14566);
    }finally{__CLR4_4_1b88b88lc8aztaf.R.flushNeeded();}}

    public final boolean isLenient() {try{__CLR4_4_1b88b88lc8aztaf.R.inc(14568);
        __CLR4_4_1b88b88lc8aztaf.R.inc(14569);return false;
    }finally{__CLR4_4_1b88b88lc8aztaf.R.flushNeeded();}}

    /**
     * Does a bounds check before setting the value.
     *
     * @throws IllegalArgumentException if the value is invalid
     */
    public long set(long instant, int value) {try{__CLR4_4_1b88b88lc8aztaf.R.inc(14570);
        __CLR4_4_1b88b88lc8aztaf.R.inc(14571);FieldUtils.verifyValueBounds
            (this, value, getMinimumValue(instant), getMaximumValue(instant));
        __CLR4_4_1b88b88lc8aztaf.R.inc(14572);return super.set(instant, value);
    }finally{__CLR4_4_1b88b88lc8aztaf.R.flushNeeded();}}
}
