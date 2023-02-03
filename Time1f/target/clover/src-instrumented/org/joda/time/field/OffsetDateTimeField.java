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
 * Generic offset adjusting datetime field.
 * <p>
 * OffsetDateTimeField is thread-safe and immutable.
 * 
 * @author Brian S O'Neill
 * @since 1.0
 */
public class OffsetDateTimeField extends DecoratedDateTimeField {public static class __CLR4_4_1axoaxolc8azt8o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,14234,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @SuppressWarnings("unused")
    private static final long serialVersionUID = 3145790132623583142L;

    private final int iOffset;

    private final int iMin;
    private final int iMax;

    /**
     * Constructor.
     * 
     * @param field  the field to wrap, like "year()".
     * @param offset  offset to add to field values
     * @throws IllegalArgumentException if offset is zero
     */
    public OffsetDateTimeField(DateTimeField field, int offset) {
        this(field, ((((field == null )&&(__CLR4_4_1axoaxolc8azt8o.R.iget(14173)!=0|true))||(__CLR4_4_1axoaxolc8azt8o.R.iget(14174)==0&false))? null : field.getType()), offset, Integer.MIN_VALUE, Integer.MAX_VALUE);__CLR4_4_1axoaxolc8azt8o.R.inc(14175);try{__CLR4_4_1axoaxolc8azt8o.R.inc(14172);
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param field  the field to wrap, like "year()".
     * @param type  the field type this field actually uses
     * @param offset  offset to add to field values
     * @throws IllegalArgumentException if offset is zero
     */
    public OffsetDateTimeField(DateTimeField field, DateTimeFieldType type, int offset) {
        this(field, type, offset, Integer.MIN_VALUE, Integer.MAX_VALUE);__CLR4_4_1axoaxolc8azt8o.R.inc(14177);try{__CLR4_4_1axoaxolc8azt8o.R.inc(14176);
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param field  the field to wrap, like "year()".
     * @param type  the field type this field actually uses
     * @param offset  offset to add to field values
     * @param minValue  minimum allowed value
     * @param maxValue  maximum allowed value
     * @throws IllegalArgumentException if offset is zero
     */
    public OffsetDateTimeField(DateTimeField field, DateTimeFieldType type, int offset,
                               int minValue, int maxValue) {
        super(field, type);__CLR4_4_1axoaxolc8azt8o.R.inc(14179);try{__CLR4_4_1axoaxolc8azt8o.R.inc(14178);
                
        __CLR4_4_1axoaxolc8azt8o.R.inc(14180);if ((((offset == 0)&&(__CLR4_4_1axoaxolc8azt8o.R.iget(14181)!=0|true))||(__CLR4_4_1axoaxolc8azt8o.R.iget(14182)==0&false))) {{
            __CLR4_4_1axoaxolc8azt8o.R.inc(14183);throw new IllegalArgumentException("The offset cannot be zero");
        }

        }__CLR4_4_1axoaxolc8azt8o.R.inc(14184);iOffset = offset;

        __CLR4_4_1axoaxolc8azt8o.R.inc(14185);if ((((minValue < (field.getMinimumValue() + offset))&&(__CLR4_4_1axoaxolc8azt8o.R.iget(14186)!=0|true))||(__CLR4_4_1axoaxolc8azt8o.R.iget(14187)==0&false))) {{
            __CLR4_4_1axoaxolc8azt8o.R.inc(14188);iMin = field.getMinimumValue() + offset;
        } }else {{
            __CLR4_4_1axoaxolc8azt8o.R.inc(14189);iMin = minValue;
        }
        }__CLR4_4_1axoaxolc8azt8o.R.inc(14190);if ((((maxValue > (field.getMaximumValue() + offset))&&(__CLR4_4_1axoaxolc8azt8o.R.iget(14191)!=0|true))||(__CLR4_4_1axoaxolc8azt8o.R.iget(14192)==0&false))) {{
            __CLR4_4_1axoaxolc8azt8o.R.inc(14193);iMax = field.getMaximumValue() + offset;
        } }else {{
            __CLR4_4_1axoaxolc8azt8o.R.inc(14194);iMax = maxValue;
        }
    }}finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    /**
     * Get the amount of offset units from the specified time instant.
     * 
     * @param instant  the time instant in millis to query.
     * @return the amount of units extracted from the input.
     */
    public int get(long instant) {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14195);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14196);return super.get(instant) + iOffset;
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    /**
     * Add the specified amount of offset units to the specified time
     * instant. The amount added may be negative.
     * 
     * @param instant  the time instant in millis to update.
     * @param amount  the amount of units to add (can be negative).
     * @return the updated time instant.
     */
    public long add(long instant, int amount) {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14197);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14198);instant = super.add(instant, amount);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14199);FieldUtils.verifyValueBounds(this, get(instant), iMin, iMax);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14200);return instant;
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    /**
     * Add the specified amount of offset units to the specified time
     * instant. The amount added may be negative.
     * 
     * @param instant  the time instant in millis to update.
     * @param amount  the amount of units to add (can be negative).
     * @return the updated time instant.
     */
    public long add(long instant, long amount) {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14201);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14202);instant = super.add(instant, amount);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14203);FieldUtils.verifyValueBounds(this, get(instant), iMin, iMax);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14204);return instant;
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    /**
     * Add to the offset component of the specified time instant,
     * wrapping around within that component if necessary.
     * 
     * @param instant  the time instant in millis to update.
     * @param amount  the amount of units to add (can be negative).
     * @return the updated time instant.
     */
    public long addWrapField(long instant, int amount) {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14205);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14206);return set(instant, FieldUtils.getWrappedValue(get(instant), amount, iMin, iMax));
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    /**
     * Set the specified amount of offset units to the specified time instant.
     * 
     * @param instant  the time instant in millis to update.
     * @param value  value of units to set.
     * @return the updated time instant.
     * @throws IllegalArgumentException if value is too large or too small.
     */
    public long set(long instant, int value) {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14207);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14208);FieldUtils.verifyValueBounds(this, value, iMin, iMax);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14209);return super.set(instant, value - iOffset);
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    public boolean isLeap(long instant) {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14210);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14211);return getWrappedField().isLeap(instant);
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    public int getLeapAmount(long instant) {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14212);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14213);return getWrappedField().getLeapAmount(instant);
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    public DurationField getLeapDurationField() {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14214);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14215);return getWrappedField().getLeapDurationField();
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    /**
     * Get the minimum value for the field.
     * 
     * @return the minimum value
     */
    public int getMinimumValue() {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14216);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14217);return iMin;
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    /**
     * Get the maximum value for the field.
     * 
     * @return the maximum value
     */
    public int getMaximumValue() {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14218);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14219);return iMax;
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}
    
    public long roundFloor(long instant) {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14220);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14221);return getWrappedField().roundFloor(instant);
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    public long roundCeiling(long instant) {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14222);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14223);return getWrappedField().roundCeiling(instant);
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    public long roundHalfFloor(long instant) {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14224);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14225);return getWrappedField().roundHalfFloor(instant);
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    public long roundHalfCeiling(long instant) {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14226);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14227);return getWrappedField().roundHalfCeiling(instant);
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    public long roundHalfEven(long instant) {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14228);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14229);return getWrappedField().roundHalfEven(instant);
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14230);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14231);return getWrappedField().remainder(instant);
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}

    /**
     * Returns the offset added to the field values.
     * 
     * @return the offset
     */
    public int getOffset() {try{__CLR4_4_1axoaxolc8azt8o.R.inc(14232);
        __CLR4_4_1axoaxolc8azt8o.R.inc(14233);return iOffset;
    }finally{__CLR4_4_1axoaxolc8azt8o.R.flushNeeded();}}
}
