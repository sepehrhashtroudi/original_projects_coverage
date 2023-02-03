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
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/**
 * General utilities that don't fit elsewhere.
 * <p>
 * FieldUtils is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class FieldUtils {public static class __CLR4_4_1aq6aq6lc8azt7x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,14034,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Restricted constructor.
     */
    private FieldUtils() {
        super();__CLR4_4_1aq6aq6lc8azt7x.R.inc(13903);try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(13902);
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}
    
    //------------------------------------------------------------------------
    /**
     * Negates the input throwing an exception if it can't negate it.
     * 
     * @param value  the value to negate
     * @return the negated value
     * @throws ArithmeticException if the value is Integer.MIN_VALUE
     * @since 1.1
     */
    public static int safeNegate(int value) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(13904);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13905);if ((((value == Integer.MIN_VALUE)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13906)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13907)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(13908);throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(13909);return -value;
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}
    
    /**
     * Add two values throwing an exception if overflow occurs.
     * 
     * @param val1  the first value
     * @param val2  the second value
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     */
    public static int safeAdd(int val1, int val2) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(13910);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13911);int sum = val1 + val2;
        // If there is a sign change, but the two values have the same sign...
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13912);if (((((val1 ^ sum) < 0 && (val1 ^ val2) >= 0)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13913)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13914)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(13915);throw new ArithmeticException
                ("The calculation caused an overflow: " + val1 + " + " + val2);
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(13916);return sum;
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}
    
    /**
     * Add two values throwing an exception if overflow occurs.
     * 
     * @param val1  the first value
     * @param val2  the second value
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     */
    public static long safeAdd(long val1, long val2) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(13917);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13918);long sum = val1 + val2;
        // If there is a sign change, but the two values have the same sign...
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13919);if (((((val1 ^ sum) < 0 && (val1 ^ val2) >= 0)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13920)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13921)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(13922);throw new ArithmeticException
                ("The calculation caused an overflow: " + val1 + " + " + val2);
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(13923);return sum;
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}
    
    /**
     * Subtracts two values throwing an exception if overflow occurs.
     * 
     * @param val1  the first value, to be taken away from
     * @param val2  the second value, the amount to take away
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     */
    public static long safeSubtract(long val1, long val2) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(13924);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13925);long diff = val1 - val2;
        // If there is a sign change, but the two values have different signs...
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13926);if (((((val1 ^ diff) < 0 && (val1 ^ val2) < 0)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13927)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13928)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(13929);throw new ArithmeticException
                ("The calculation caused an overflow: " + val1 + " - " + val2);
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(13930);return diff;
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}
    
    /**
     * Multiply two values throwing an exception if overflow occurs.
     * 
     * @param val1  the first value
     * @param val2  the second value
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     * @since 1.2
     */
    public static int safeMultiply(int val1, int val2) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(13931);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13932);long total = (long) val1 * (long) val2;
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13933);if ((((total < Integer.MIN_VALUE || total > Integer.MAX_VALUE)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13934)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13935)==0&false))) {{
          __CLR4_4_1aq6aq6lc8azt7x.R.inc(13936);throw new ArithmeticException("Multiplication overflows an int: " + val1 + " * " + val2);
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(13937);return (int) total;
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}

    /**
     * Multiply two values throwing an exception if overflow occurs.
     * 
     * @param val1  the first value
     * @param val2  the second value
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     * @since 1.2
     */
    public static long safeMultiply(long val1, int val2) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(13938);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1aq6aq6lc8azt7x.R.inc(13939);switch (val2) {
            case -1:if (!__CLB4_4_1_bool0) {__CLR4_4_1aq6aq6lc8azt7x.R.inc(13940);__CLB4_4_1_bool0=true;}
                __CLR4_4_1aq6aq6lc8azt7x.R.inc(13941);if ((((val1 == Long.MIN_VALUE)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13942)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13943)==0&false))) {{
                    __CLR4_4_1aq6aq6lc8azt7x.R.inc(13944);throw new ArithmeticException("Multiplication overflows a long: " + val1 + " * " + val2);
                }
                }__CLR4_4_1aq6aq6lc8azt7x.R.inc(13945);return -val1;
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1aq6aq6lc8azt7x.R.inc(13946);__CLB4_4_1_bool0=true;}
                __CLR4_4_1aq6aq6lc8azt7x.R.inc(13947);return 0L;
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1aq6aq6lc8azt7x.R.inc(13948);__CLB4_4_1_bool0=true;}
                __CLR4_4_1aq6aq6lc8azt7x.R.inc(13949);return val1;
        }
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13950);long total = val1 * val2;
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13951);if ((((total / val2 != val1)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13952)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13953)==0&false))) {{
          __CLR4_4_1aq6aq6lc8azt7x.R.inc(13954);throw new ArithmeticException("Multiplication overflows a long: " + val1 + " * " + val2);
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(13955);return total;
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}

    /**
     * Multiply two values throwing an exception if overflow occurs.
     * 
     * @param val1  the first value
     * @param val2  the second value
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     */
    public static long safeMultiply(long val1, long val2) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(13956);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13957);if ((((val2 == 1)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13958)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13959)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(13960);return val1;
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(13961);if ((((val1 == 1)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13962)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13963)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(13964);return val2;
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(13965);if ((((val1 == 0 || val2 == 0)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13966)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13967)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(13968);return 0;
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(13969);long total = val1 * val2;
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13970);if ((((total / val2 != val1 || val1 == Long.MIN_VALUE && val2 == -1 || val2 == Long.MIN_VALUE && val1 == -1)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13971)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13972)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(13973);throw new ArithmeticException("Multiplication overflows a long: " + val1 + " * " + val2);
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(13974);return total;
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}

    /**
     * Divides the dividend by the divisor throwing an exception if 
     * overflow occurs or the divisor is zero.
     * 
     * @param dividend  the dividend
     * @param divisor  the divisor
     * @return the new total
     * @throws ArithmeticException if the operation overflows or the divisor is zero
     */
    public static long safeDivide(long dividend, long divisor) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(13975);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13976);if ((((dividend == Long.MIN_VALUE && divisor == -1L)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13977)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13978)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(13979);throw new ArithmeticException("Multiplication overflows a long: " + dividend + " / " + divisor);
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(13980);return dividend / divisor;
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}

    /**
     * Casts to an int throwing an exception if overflow occurs.
     * 
     * @param value  the value
     * @return the value as an int
     * @throws ArithmeticException if the value is too big or too small
     */
    public static int safeToInt(long value) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(13981);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13982);if ((((Integer.MIN_VALUE <= value && value <= Integer.MAX_VALUE)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13983)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13984)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(13985);return (int) value;
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(13986);throw new ArithmeticException("Value cannot fit in an int: " + value);
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}
    
    /**
     * Multiply two values to return an int throwing an exception if overflow occurs.
     * 
     * @param val1  the first value
     * @param val2  the second value
     * @return the new total
     * @throws ArithmeticException if the value is too big or too small
     */
    public static int safeMultiplyToInt(long val1, long val2) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(13987);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13988);long val = FieldUtils.safeMultiply(val1, val2);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13989);return FieldUtils.safeToInt(val);
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Verify that input values are within specified bounds.
     * 
     * @param value  the value to check
     * @param lowerBound  the lower bound allowed for value
     * @param upperBound  the upper bound allowed for value
     * @throws IllegalFieldValueException if value is not in the specified bounds
     */
    public static void verifyValueBounds(DateTimeField field, 
                                         int value, int lowerBound, int upperBound) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(13990);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13991);if (((((value < lowerBound) || (value > upperBound))&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13992)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13993)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(13994);throw new IllegalFieldValueException
                (field.getType(), Integer.valueOf(value),
                 Integer.valueOf(lowerBound), Integer.valueOf(upperBound));
        }
    }}finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}

    /**
     * Verify that input values are within specified bounds.
     * 
     * @param value  the value to check
     * @param lowerBound  the lower bound allowed for value
     * @param upperBound  the upper bound allowed for value
     * @throws IllegalFieldValueException if value is not in the specified bounds
     * @since 1.1
     */
    public static void verifyValueBounds(DateTimeFieldType fieldType, 
                                         int value, int lowerBound, int upperBound) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(13995);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(13996);if (((((value < lowerBound) || (value > upperBound))&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13997)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(13998)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(13999);throw new IllegalFieldValueException
                (fieldType, Integer.valueOf(value),
                 Integer.valueOf(lowerBound), Integer.valueOf(upperBound));
        }
    }}finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}

    /**
     * Verify that input values are within specified bounds.
     * 
     * @param value  the value to check
     * @param lowerBound  the lower bound allowed for value
     * @param upperBound  the upper bound allowed for value
     * @throws IllegalFieldValueException if value is not in the specified bounds
     */
    public static void verifyValueBounds(String fieldName,
                                         int value, int lowerBound, int upperBound) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(14000);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(14001);if (((((value < lowerBound) || (value > upperBound))&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(14002)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(14003)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(14004);throw new IllegalFieldValueException
                (fieldName, Integer.valueOf(value),
                 Integer.valueOf(lowerBound), Integer.valueOf(upperBound));
        }
    }}finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}

    /**
     * Utility method used by addWrapField implementations to ensure the new
     * value lies within the field's legal value range.
     *
     * @param currentValue the current value of the data, which may lie outside
     * the wrapped value range
     * @param wrapValue  the value to add to current value before
     *  wrapping.  This may be negative.
     * @param minValue the wrap range minimum value.
     * @param maxValue the wrap range maximum value.  This must be
     *  greater than minValue (checked by the method).
     * @return the wrapped value
     * @throws IllegalArgumentException if minValue is greater
     *  than or equal to maxValue
     */
    public static int getWrappedValue(int currentValue, int wrapValue,
                                      int minValue, int maxValue) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(14005);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(14006);return getWrappedValue(currentValue + wrapValue, minValue, maxValue);
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}

    /**
     * Utility method that ensures the given value lies within the field's
     * legal value range.
     * 
     * @param value  the value to fit into the wrapped value range
     * @param minValue the wrap range minimum value.
     * @param maxValue the wrap range maximum value.  This must be
     *  greater than minValue (checked by the method).
     * @return the wrapped value
     * @throws IllegalArgumentException if minValue is greater
     *  than or equal to maxValue
     */
    public static int getWrappedValue(int value, int minValue, int maxValue) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(14007);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(14008);if ((((minValue >= maxValue)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(14009)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(14010)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(14011);throw new IllegalArgumentException("MIN > MAX");
        }

        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(14012);int wrapRange = maxValue - minValue + 1;
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(14013);value -= minValue;

        __CLR4_4_1aq6aq6lc8azt7x.R.inc(14014);if ((((value >= 0)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(14015)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(14016)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(14017);return (value % wrapRange) + minValue;
        }

        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(14018);int remByRange = (-value) % wrapRange;

        __CLR4_4_1aq6aq6lc8azt7x.R.inc(14019);if ((((remByRange == 0)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(14020)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(14021)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(14022);return 0 + minValue;
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(14023);return (wrapRange - remByRange) + minValue;
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares two objects as equals handling null.
     * 
     * @param object1  the first object
     * @param object2  the second object
     * @return true if equal
     * @since 1.4
     */
    public static boolean equals(Object object1, Object object2) {try{__CLR4_4_1aq6aq6lc8azt7x.R.inc(14024);
        __CLR4_4_1aq6aq6lc8azt7x.R.inc(14025);if ((((object1 == object2)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(14026)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(14027)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(14028);return true;
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(14029);if ((((object1 == null || object2 == null)&&(__CLR4_4_1aq6aq6lc8azt7x.R.iget(14030)!=0|true))||(__CLR4_4_1aq6aq6lc8azt7x.R.iget(14031)==0&false))) {{
            __CLR4_4_1aq6aq6lc8azt7x.R.inc(14032);return false;
        }
        }__CLR4_4_1aq6aq6lc8azt7x.R.inc(14033);return object1.equals(object2);
    }finally{__CLR4_4_1aq6aq6lc8azt7x.R.flushNeeded();}}

}
