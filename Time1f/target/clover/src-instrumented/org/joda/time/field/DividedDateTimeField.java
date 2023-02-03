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
 * Divides a DateTimeField such that the retrieved values are reduced by a
 * fixed divisor. The field's unit duration is scaled accordingly, but the
 * range duration is unchanged.
 * <p>
 * DividedDateTimeField is thread-safe and immutable.
 *
 * @see RemainderDateTimeField
 * 
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public class DividedDateTimeField extends DecoratedDateTimeField {public static class __CLR4_4_1anoanolc8azt7k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,13902,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = 8318475124230605365L;

    // Shared with RemainderDateTimeField.
    final int iDivisor;
    final DurationField iDurationField;
    final DurationField iRangeDurationField;

    private final int iMin;
    private final int iMax;

    /**
     * Constructor.
     * 
     * @param field  the field to wrap, like "year()".
     * @param type  the field type this field will actually use
     * @param divisor  divisor, such as 100 years in a century
     * @throws IllegalArgumentException if divisor is less than two
     */
    public DividedDateTimeField(DateTimeField field,
                                DateTimeFieldType type, int divisor) {
        this(field, field.getRangeDurationField(), type, divisor);__CLR4_4_1anoanolc8azt7k.R.inc(13813);try{__CLR4_4_1anoanolc8azt7k.R.inc(13812);
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param field  the field to wrap, like "year()".
     * @param rangeField  the range field, null to derive
     * @param type  the field type this field will actually use
     * @param divisor  divisor, such as 100 years in a century
     * @throws IllegalArgumentException if divisor is less than two
     */
    public DividedDateTimeField(DateTimeField field, DurationField rangeField,
                                DateTimeFieldType type, int divisor) {
        super(field, type);__CLR4_4_1anoanolc8azt7k.R.inc(13815);try{__CLR4_4_1anoanolc8azt7k.R.inc(13814);
        __CLR4_4_1anoanolc8azt7k.R.inc(13816);if ((((divisor < 2)&&(__CLR4_4_1anoanolc8azt7k.R.iget(13817)!=0|true))||(__CLR4_4_1anoanolc8azt7k.R.iget(13818)==0&false))) {{
            __CLR4_4_1anoanolc8azt7k.R.inc(13819);throw new IllegalArgumentException("The divisor must be at least 2");
        }
        }__CLR4_4_1anoanolc8azt7k.R.inc(13820);DurationField unitField = field.getDurationField();
        __CLR4_4_1anoanolc8azt7k.R.inc(13821);if ((((unitField == null)&&(__CLR4_4_1anoanolc8azt7k.R.iget(13822)!=0|true))||(__CLR4_4_1anoanolc8azt7k.R.iget(13823)==0&false))) {{
            __CLR4_4_1anoanolc8azt7k.R.inc(13824);iDurationField = null;
        } }else {{
            __CLR4_4_1anoanolc8azt7k.R.inc(13825);iDurationField = new ScaledDurationField(
                unitField, type.getDurationType(), divisor);
        }
        }__CLR4_4_1anoanolc8azt7k.R.inc(13826);iRangeDurationField = rangeField;
        __CLR4_4_1anoanolc8azt7k.R.inc(13827);iDivisor = divisor;
        __CLR4_4_1anoanolc8azt7k.R.inc(13828);int i = field.getMinimumValue();
        __CLR4_4_1anoanolc8azt7k.R.inc(13829);int min = ((((i >= 0) )&&(__CLR4_4_1anoanolc8azt7k.R.iget(13830)!=0|true))||(__CLR4_4_1anoanolc8azt7k.R.iget(13831)==0&false))? i / divisor : ((i + 1) / divisor - 1);
        __CLR4_4_1anoanolc8azt7k.R.inc(13832);int j = field.getMaximumValue();
        __CLR4_4_1anoanolc8azt7k.R.inc(13833);int max = ((((j >= 0) )&&(__CLR4_4_1anoanolc8azt7k.R.iget(13834)!=0|true))||(__CLR4_4_1anoanolc8azt7k.R.iget(13835)==0&false))? j / divisor : ((j + 1) / divisor - 1);
        __CLR4_4_1anoanolc8azt7k.R.inc(13836);iMin = min;
        __CLR4_4_1anoanolc8azt7k.R.inc(13837);iMax = max;
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    /**
     * Construct a DividedDateTimeField that compliments the given
     * RemainderDateTimeField.
     *
     * @param remainderField  complimentary remainder field, like "yearOfCentury()".
     * @param type  the field type this field will actually use
     */
    public DividedDateTimeField(RemainderDateTimeField remainderField, DateTimeFieldType type) {
        this(remainderField, null, type);__CLR4_4_1anoanolc8azt7k.R.inc(13839);try{__CLR4_4_1anoanolc8azt7k.R.inc(13838);
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    /**
     * Construct a DividedDateTimeField that compliments the given
     * RemainderDateTimeField.
     *
     * @param remainderField  complimentary remainder field, like "yearOfCentury()".
     * @param rangeField  the range field, null to derive
     * @param type  the field type this field will actually use
     */
    public DividedDateTimeField(RemainderDateTimeField remainderField, DurationField rangeField, DateTimeFieldType type) {
        super(remainderField.getWrappedField(), type);__CLR4_4_1anoanolc8azt7k.R.inc(13841);try{__CLR4_4_1anoanolc8azt7k.R.inc(13840);
        __CLR4_4_1anoanolc8azt7k.R.inc(13842);int divisor = iDivisor = remainderField.iDivisor;
        __CLR4_4_1anoanolc8azt7k.R.inc(13843);iDurationField = remainderField.iRangeField;
        __CLR4_4_1anoanolc8azt7k.R.inc(13844);iRangeDurationField = rangeField;
        __CLR4_4_1anoanolc8azt7k.R.inc(13845);DateTimeField field = getWrappedField();
        __CLR4_4_1anoanolc8azt7k.R.inc(13846);int i = field.getMinimumValue();
        __CLR4_4_1anoanolc8azt7k.R.inc(13847);int min = ((((i >= 0) )&&(__CLR4_4_1anoanolc8azt7k.R.iget(13848)!=0|true))||(__CLR4_4_1anoanolc8azt7k.R.iget(13849)==0&false))? i / divisor : ((i + 1) / divisor - 1);
        __CLR4_4_1anoanolc8azt7k.R.inc(13850);int j = field.getMaximumValue();
        __CLR4_4_1anoanolc8azt7k.R.inc(13851);int max = ((((j >= 0) )&&(__CLR4_4_1anoanolc8azt7k.R.iget(13852)!=0|true))||(__CLR4_4_1anoanolc8azt7k.R.iget(13853)==0&false))? j / divisor : ((j + 1) / divisor - 1);
        __CLR4_4_1anoanolc8azt7k.R.inc(13854);iMin = min;
        __CLR4_4_1anoanolc8azt7k.R.inc(13855);iMax = max;
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    @Override
    public DurationField getRangeDurationField() {try{__CLR4_4_1anoanolc8azt7k.R.inc(13856);
        __CLR4_4_1anoanolc8azt7k.R.inc(13857);if ((((iRangeDurationField != null)&&(__CLR4_4_1anoanolc8azt7k.R.iget(13858)!=0|true))||(__CLR4_4_1anoanolc8azt7k.R.iget(13859)==0&false))) {{
            __CLR4_4_1anoanolc8azt7k.R.inc(13860);return iRangeDurationField;
        }
        }__CLR4_4_1anoanolc8azt7k.R.inc(13861);return super.getRangeDurationField();
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    /**
     * Get the amount of scaled units from the specified time instant.
     * 
     * @param instant  the time instant in millis to query.
     * @return the amount of scaled units extracted from the input.
     */
    public int get(long instant) {try{__CLR4_4_1anoanolc8azt7k.R.inc(13862);
        __CLR4_4_1anoanolc8azt7k.R.inc(13863);int value = getWrappedField().get(instant);
        __CLR4_4_1anoanolc8azt7k.R.inc(13864);if ((((value >= 0)&&(__CLR4_4_1anoanolc8azt7k.R.iget(13865)!=0|true))||(__CLR4_4_1anoanolc8azt7k.R.iget(13866)==0&false))) {{
            __CLR4_4_1anoanolc8azt7k.R.inc(13867);return value / iDivisor;
        } }else {{
            __CLR4_4_1anoanolc8azt7k.R.inc(13868);return ((value + 1) / iDivisor) - 1;
        }
    }}finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    /**
     * Add the specified amount of scaled units to the specified time
     * instant. The amount added may be negative.
     * 
     * @param instant  the time instant in millis to update.
     * @param amount  the amount of scaled units to add (can be negative).
     * @return the updated time instant.
     */
    public long add(long instant, int amount) {try{__CLR4_4_1anoanolc8azt7k.R.inc(13869);
        __CLR4_4_1anoanolc8azt7k.R.inc(13870);return getWrappedField().add(instant, amount * iDivisor);
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    /**
     * Add the specified amount of scaled units to the specified time
     * instant. The amount added may be negative.
     * 
     * @param instant  the time instant in millis to update.
     * @param amount  the amount of scaled units to add (can be negative).
     * @return the updated time instant.
     */
    public long add(long instant, long amount) {try{__CLR4_4_1anoanolc8azt7k.R.inc(13871);
        __CLR4_4_1anoanolc8azt7k.R.inc(13872);return getWrappedField().add(instant, amount * iDivisor);
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    /**
     * Add to the scaled component of the specified time instant,
     * wrapping around within that component if necessary.
     * 
     * @param instant  the time instant in millis to update.
     * @param amount  the amount of scaled units to add (can be negative).
     * @return the updated time instant.
     */
    public long addWrapField(long instant, int amount) {try{__CLR4_4_1anoanolc8azt7k.R.inc(13873);
        __CLR4_4_1anoanolc8azt7k.R.inc(13874);return set(instant, FieldUtils.getWrappedValue(get(instant), amount, iMin, iMax));
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1anoanolc8azt7k.R.inc(13875);
        __CLR4_4_1anoanolc8azt7k.R.inc(13876);return getWrappedField().getDifference(minuendInstant, subtrahendInstant) / iDivisor;
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1anoanolc8azt7k.R.inc(13877);
        __CLR4_4_1anoanolc8azt7k.R.inc(13878);return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant) / iDivisor;
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    /**
     * Set the specified amount of scaled units to the specified time instant.
     * 
     * @param instant  the time instant in millis to update.
     * @param value  value of scaled units to set.
     * @return the updated time instant.
     * @throws IllegalArgumentException if value is too large or too small.
     */
    public long set(long instant, int value) {try{__CLR4_4_1anoanolc8azt7k.R.inc(13879);
        __CLR4_4_1anoanolc8azt7k.R.inc(13880);FieldUtils.verifyValueBounds(this, value, iMin, iMax);
        __CLR4_4_1anoanolc8azt7k.R.inc(13881);int remainder = getRemainder(getWrappedField().get(instant));
        __CLR4_4_1anoanolc8azt7k.R.inc(13882);return getWrappedField().set(instant, value * iDivisor + remainder);
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    /**
     * Returns a scaled version of the wrapped field's unit duration field.
     */
    public DurationField getDurationField() {try{__CLR4_4_1anoanolc8azt7k.R.inc(13883);
        __CLR4_4_1anoanolc8azt7k.R.inc(13884);return iDurationField;
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    /**
     * Get the minimum value for the field.
     * 
     * @return the minimum value
     */
    public int getMinimumValue() {try{__CLR4_4_1anoanolc8azt7k.R.inc(13885);
        __CLR4_4_1anoanolc8azt7k.R.inc(13886);return iMin;
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    /**
     * Get the maximum value for the field.
     * 
     * @return the maximum value
     */
    public int getMaximumValue() {try{__CLR4_4_1anoanolc8azt7k.R.inc(13887);
        __CLR4_4_1anoanolc8azt7k.R.inc(13888);return iMax;
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_1anoanolc8azt7k.R.inc(13889);
        __CLR4_4_1anoanolc8azt7k.R.inc(13890);DateTimeField field = getWrappedField();
        __CLR4_4_1anoanolc8azt7k.R.inc(13891);return field.roundFloor(field.set(instant, get(instant) * iDivisor));
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_1anoanolc8azt7k.R.inc(13892);
        __CLR4_4_1anoanolc8azt7k.R.inc(13893);return set(instant, get(getWrappedField().remainder(instant)));
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    /**
     * Returns the divisor applied, in the field's units.
     * 
     * @return the divisor
     */
    public int getDivisor() {try{__CLR4_4_1anoanolc8azt7k.R.inc(13894);
        __CLR4_4_1anoanolc8azt7k.R.inc(13895);return iDivisor;
    }finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

    private int getRemainder(int value) {try{__CLR4_4_1anoanolc8azt7k.R.inc(13896);
        __CLR4_4_1anoanolc8azt7k.R.inc(13897);if ((((value >= 0)&&(__CLR4_4_1anoanolc8azt7k.R.iget(13898)!=0|true))||(__CLR4_4_1anoanolc8azt7k.R.iget(13899)==0&false))) {{
            __CLR4_4_1anoanolc8azt7k.R.inc(13900);return value % iDivisor;
        } }else {{
            __CLR4_4_1anoanolc8azt7k.R.inc(13901);return (iDivisor - 1) + ((value + 1) % iDivisor);
        }
    }}finally{__CLR4_4_1anoanolc8azt7k.R.flushNeeded();}}

}
