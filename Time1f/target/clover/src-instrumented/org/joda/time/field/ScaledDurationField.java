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

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/**
 * Scales a DurationField such that it's unit millis becomes larger in
 * magnitude.
 * <p>
 * ScaledDurationField is thread-safe and immutable.
 *
 * @see PreciseDurationField
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public class ScaledDurationField extends DecoratedDurationField {public static class __CLR4_4_1b4mb4mlc8azta1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,14480,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -3205227092378684157L;

    private final int iScalar;

    /**
     * Constructor
     * 
     * @param field  the field to wrap, like "year()".
     * @param type  the type this field will actually use
     * @param scalar  scalar, such as 100 years in a century
     * @throws IllegalArgumentException if scalar is zero or one.
     */
    public ScaledDurationField(DurationField field, DurationFieldType type, int scalar) {
        super(field, type);__CLR4_4_1b4mb4mlc8azta1.R.inc(14423);try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14422);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14424);if ((((scalar == 0 || scalar == 1)&&(__CLR4_4_1b4mb4mlc8azta1.R.iget(14425)!=0|true))||(__CLR4_4_1b4mb4mlc8azta1.R.iget(14426)==0&false))) {{
            __CLR4_4_1b4mb4mlc8azta1.R.inc(14427);throw new IllegalArgumentException("The scalar must not be 0 or 1");
        }
        }__CLR4_4_1b4mb4mlc8azta1.R.inc(14428);iScalar = scalar;
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    public int getValue(long duration) {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14429);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14430);return getWrappedField().getValue(duration) / iScalar;
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    public long getValueAsLong(long duration) {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14431);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14432);return getWrappedField().getValueAsLong(duration) / iScalar;
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    public int getValue(long duration, long instant) {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14433);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14434);return getWrappedField().getValue(duration, instant) / iScalar;
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14435);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14436);return getWrappedField().getValueAsLong(duration, instant) / iScalar;
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    public long getMillis(int value) {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14437);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14438);long scaled = ((long) value) * ((long) iScalar);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14439);return getWrappedField().getMillis(scaled);
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    public long getMillis(long value) {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14440);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14441);long scaled = FieldUtils.safeMultiply(value, iScalar);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14442);return getWrappedField().getMillis(scaled);
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    public long getMillis(int value, long instant) {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14443);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14444);long scaled = ((long) value) * ((long) iScalar);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14445);return getWrappedField().getMillis(scaled, instant);
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    public long getMillis(long value, long instant) {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14446);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14447);long scaled = FieldUtils.safeMultiply(value, iScalar);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14448);return getWrappedField().getMillis(scaled, instant);
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    public long add(long instant, int value) {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14449);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14450);long scaled = ((long) value) * ((long) iScalar);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14451);return getWrappedField().add(instant, scaled);
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    public long add(long instant, long value) {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14452);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14453);long scaled = FieldUtils.safeMultiply(value, iScalar);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14454);return getWrappedField().add(instant, scaled);
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14455);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14456);return getWrappedField().getDifference(minuendInstant, subtrahendInstant) / iScalar;
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14457);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14458);return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant) / iScalar;
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    public long getUnitMillis() {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14459);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14460);return getWrappedField().getUnitMillis() * iScalar;
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the scalar applied, in the field's units.
     * 
     * @return the scalar
     */
    public int getScalar() {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14461);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14462);return iScalar;
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    /**
     * Compares this duration field to another.
     * Two fields are equal if of the same type and duration.
     * 
     * @param obj  the object to compare to
     * @return if equal
     */
    public boolean equals(Object obj) {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14463);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14464);if ((((this == obj)&&(__CLR4_4_1b4mb4mlc8azta1.R.iget(14465)!=0|true))||(__CLR4_4_1b4mb4mlc8azta1.R.iget(14466)==0&false))) {{
            __CLR4_4_1b4mb4mlc8azta1.R.inc(14467);return true;
        } }else {__CLR4_4_1b4mb4mlc8azta1.R.inc(14468);if ((((obj instanceof ScaledDurationField)&&(__CLR4_4_1b4mb4mlc8azta1.R.iget(14469)!=0|true))||(__CLR4_4_1b4mb4mlc8azta1.R.iget(14470)==0&false))) {{
            __CLR4_4_1b4mb4mlc8azta1.R.inc(14471);ScaledDurationField other = (ScaledDurationField) obj;
            __CLR4_4_1b4mb4mlc8azta1.R.inc(14472);return (getWrappedField().equals(other.getWrappedField())) &&
                   (getType() == other.getType()) &&
                   (iScalar == other.iScalar);
        }
        }}__CLR4_4_1b4mb4mlc8azta1.R.inc(14473);return false;
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

    /**
     * Gets a hash code for this instance.
     * 
     * @return a suitable hashcode
     */
    public int hashCode() {try{__CLR4_4_1b4mb4mlc8azta1.R.inc(14474);
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14475);long scalar = iScalar;
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14476);int hash = (int) (scalar ^ (scalar >>> 32));
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14477);hash += getType().hashCode();
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14478);hash += getWrappedField().hashCode();
        __CLR4_4_1b4mb4mlc8azta1.R.inc(14479);return hash;
    }finally{__CLR4_4_1b4mb4mlc8azta1.R.flushNeeded();}}

}
