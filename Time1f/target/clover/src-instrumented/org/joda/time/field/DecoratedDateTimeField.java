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
package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/**
 * <code>DecoratedDateTimeField</code> extends {@link BaseDateTimeField},
 * implementing only the minimum required set of methods. These implemented
 * methods delegate to a wrapped field.
 * <p>
 * This design allows new DateTimeField types to be defined that piggyback on
 * top of another, inheriting all the safe method implementations from
 * BaseDateTimeField. Should any method require pure delegation to the
 * wrapped field, simply override and use the provided getWrappedField method.
 * <p>
 * DecoratedDateTimeField is thread-safe and immutable, and its subclasses must
 * be as well.
 *
 * @author Brian S O'Neill
 * @since 1.0
 * @see DelegatedDateTimeField
 */
public abstract class DecoratedDateTimeField extends BaseDateTimeField {public static class __CLR4_4_1agzagzlc8azt6n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,13600,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    @SuppressWarnings("unused")
    private static final long serialVersionUID = 203115783733757597L;

    /** The DateTimeField being wrapped */
    private final DateTimeField iField;

    /**
     * Constructor.
     * 
     * @param field  the field being decorated
     * @param type  allow type to be overridden
     */
    protected DecoratedDateTimeField(DateTimeField field, DateTimeFieldType type) {
        super(type);__CLR4_4_1agzagzlc8azt6n.R.inc(13572);try{__CLR4_4_1agzagzlc8azt6n.R.inc(13571);
        __CLR4_4_1agzagzlc8azt6n.R.inc(13573);if ((((field == null)&&(__CLR4_4_1agzagzlc8azt6n.R.iget(13574)!=0|true))||(__CLR4_4_1agzagzlc8azt6n.R.iget(13575)==0&false))) {{
            __CLR4_4_1agzagzlc8azt6n.R.inc(13576);throw new IllegalArgumentException("The field must not be null");
        }
        }__CLR4_4_1agzagzlc8azt6n.R.inc(13577);if ((((!field.isSupported())&&(__CLR4_4_1agzagzlc8azt6n.R.iget(13578)!=0|true))||(__CLR4_4_1agzagzlc8azt6n.R.iget(13579)==0&false))) {{
            __CLR4_4_1agzagzlc8azt6n.R.inc(13580);throw new IllegalArgumentException("The field must be supported");
        }
        }__CLR4_4_1agzagzlc8azt6n.R.inc(13581);iField = field;
    }finally{__CLR4_4_1agzagzlc8azt6n.R.flushNeeded();}}

    /**
     * Gets the wrapped date time field.
     * 
     * @return the wrapped DateTimeField
     */
    public final DateTimeField getWrappedField() {try{__CLR4_4_1agzagzlc8azt6n.R.inc(13582);
        __CLR4_4_1agzagzlc8azt6n.R.inc(13583);return iField;
    }finally{__CLR4_4_1agzagzlc8azt6n.R.flushNeeded();}}

    public boolean isLenient() {try{__CLR4_4_1agzagzlc8azt6n.R.inc(13584);
        __CLR4_4_1agzagzlc8azt6n.R.inc(13585);return iField.isLenient();
    }finally{__CLR4_4_1agzagzlc8azt6n.R.flushNeeded();}}

    public int get(long instant) {try{__CLR4_4_1agzagzlc8azt6n.R.inc(13586);
        __CLR4_4_1agzagzlc8azt6n.R.inc(13587);return iField.get(instant);
    }finally{__CLR4_4_1agzagzlc8azt6n.R.flushNeeded();}}

    public long set(long instant, int value) {try{__CLR4_4_1agzagzlc8azt6n.R.inc(13588);
        __CLR4_4_1agzagzlc8azt6n.R.inc(13589);return iField.set(instant, value);
    }finally{__CLR4_4_1agzagzlc8azt6n.R.flushNeeded();}}

    public DurationField getDurationField() {try{__CLR4_4_1agzagzlc8azt6n.R.inc(13590);
        __CLR4_4_1agzagzlc8azt6n.R.inc(13591);return iField.getDurationField();
    }finally{__CLR4_4_1agzagzlc8azt6n.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_1agzagzlc8azt6n.R.inc(13592);
        __CLR4_4_1agzagzlc8azt6n.R.inc(13593);return iField.getRangeDurationField();
    }finally{__CLR4_4_1agzagzlc8azt6n.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_1agzagzlc8azt6n.R.inc(13594);
        __CLR4_4_1agzagzlc8azt6n.R.inc(13595);return iField.getMinimumValue();
    }finally{__CLR4_4_1agzagzlc8azt6n.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_1agzagzlc8azt6n.R.inc(13596);
        __CLR4_4_1agzagzlc8azt6n.R.inc(13597);return iField.getMaximumValue();
    }finally{__CLR4_4_1agzagzlc8azt6n.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_1agzagzlc8azt6n.R.inc(13598);
        __CLR4_4_1agzagzlc8azt6n.R.inc(13599);return iField.roundFloor(instant);
    }finally{__CLR4_4_1agzagzlc8azt6n.R.flushNeeded();}}

}
