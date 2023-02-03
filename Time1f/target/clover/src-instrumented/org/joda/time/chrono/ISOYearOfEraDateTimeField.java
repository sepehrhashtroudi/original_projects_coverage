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

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.FieldUtils;

/**
 * This field is not publicy exposed by ISOChronology, but rather it is used to
 * build the yearOfCentury and centuryOfEra fields. It merely drops the sign of
 * the year.
 *
 * @author Brian S O'Neill
 * @see GJYearOfEraDateTimeField
 * @since 1.0
 */
class ISOYearOfEraDateTimeField extends DecoratedDateTimeField {public static class __CLR4_4_18kf8kflc8azsz2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,11143,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = 7037524068969447317L;

    /**
     * Singleton instance
     */
    static final DateTimeField INSTANCE = new ISOYearOfEraDateTimeField();

    /**
     * Restricted constructor.
     */
    private ISOYearOfEraDateTimeField() {
        super(GregorianChronology.getInstanceUTC().year(), DateTimeFieldType.yearOfEra());__CLR4_4_18kf8kflc8azsz2.R.inc(11104);try{__CLR4_4_18kf8kflc8azsz2.R.inc(11103);
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    @Override
    public DurationField getRangeDurationField() {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11105);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11106);return GregorianChronology.getInstanceUTC().eras();
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    public int get(long instant) {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11107);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11108);int year = getWrappedField().get(instant);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11109);return (((year < 0 )&&(__CLR4_4_18kf8kflc8azsz2.R.iget(11110)!=0|true))||(__CLR4_4_18kf8kflc8azsz2.R.iget(11111)==0&false))? -year : year;
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    public long add(long instant, int years) {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11112);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11113);return getWrappedField().add(instant, years);
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    public long add(long instant, long years) {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11114);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11115);return getWrappedField().add(instant, years);
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    public long addWrapField(long instant, int years) {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11116);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11117);return getWrappedField().addWrapField(instant, years);
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int years) {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11118);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11119);return getWrappedField().addWrapField(instant, fieldIndex, values, years);
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11120);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11121);return getWrappedField().getDifference(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11122);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11123);return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    public long set(long instant, int year) {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11124);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11125);FieldUtils.verifyValueBounds(this, year, 0, getMaximumValue());
        __CLR4_4_18kf8kflc8azsz2.R.inc(11126);if ((((getWrappedField().get(instant) < 0)&&(__CLR4_4_18kf8kflc8azsz2.R.iget(11127)!=0|true))||(__CLR4_4_18kf8kflc8azsz2.R.iget(11128)==0&false))) {{
            __CLR4_4_18kf8kflc8azsz2.R.inc(11129);year = -year;
        }
        }__CLR4_4_18kf8kflc8azsz2.R.inc(11130);return super.set(instant, year);
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11131);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11132);return 0;
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11133);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11134);return getWrappedField().getMaximumValue();
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11135);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11136);return getWrappedField().roundFloor(instant);
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    public long roundCeiling(long instant) {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11137);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11138);return getWrappedField().roundCeiling(instant);
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11139);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11140);return getWrappedField().remainder(instant);
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_18kf8kflc8azsz2.R.inc(11141);
        __CLR4_4_18kf8kflc8azsz2.R.inc(11142);return INSTANCE;
    }finally{__CLR4_4_18kf8kflc8azsz2.R.flushNeeded();}}
}
