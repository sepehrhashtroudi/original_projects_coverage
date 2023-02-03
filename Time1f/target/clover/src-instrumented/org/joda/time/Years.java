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
package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * An immutable time period representing a number of years.
 * <p>
 * <code>Years</code> is an immutable period that can only store years.
 * It does not store months, days or hours for example. As such it is a
 * type-safe way of representing a number of years in an application.
 * <p>
 * The number of years is set in the constructor, and may be queried using
 * <code>getYears()</code>. Basic mathematical operations are provided -
 * <code>plus()</code>, <code>minus()</code>, <code>multipliedBy()</code> and
 * <code>dividedBy()</code>.
 * <p>
 * <code>Years</code> is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.4
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class Years extends BaseSingleFieldPeriod {public static class __CLR4_4_15dy5dylc8azslc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,7078,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Constant representing zero years. */
    public static final Years ZERO = new Years(0);
    /** Constant representing one year. */
    public static final Years ONE = new Years(1);
    /** Constant representing two years. */
    public static final Years TWO = new Years(2);
    /** Constant representing three years. */
    public static final Years THREE = new Years(3);
    /** Constant representing the maximum number of years that can be stored in this object. */
    public static final Years MAX_VALUE = new Years(Integer.MAX_VALUE);
    /** Constant representing the minimum number of years that can be stored in this object. */
    public static final Years MIN_VALUE = new Years(Integer.MIN_VALUE);

    /** The paser to use for this class. */
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.years());
    /** Serialization version. */
    private static final long serialVersionUID = 87525275727380868L;

    //-----------------------------------------------------------------------
    /**
     * Obtains an instance of <code>Years</code> that may be cached.
     * <code>Years</code> is immutable, so instances can be cached and shared.
     * This factory method provides access to shared instances.
     *
     * @param years  the number of years to obtain an instance for
     * @return the instance of Years
     */
    public static Years years(int years) {try{__CLR4_4_15dy5dylc8azslc.R.inc(6982);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_15dy5dylc8azslc.R.inc(6983);switch (years) {
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_15dy5dylc8azslc.R.inc(6984);__CLB4_4_1_bool0=true;}
                __CLR4_4_15dy5dylc8azslc.R.inc(6985);return ZERO;
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_15dy5dylc8azslc.R.inc(6986);__CLB4_4_1_bool0=true;}
                __CLR4_4_15dy5dylc8azslc.R.inc(6987);return ONE;
            case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_15dy5dylc8azslc.R.inc(6988);__CLB4_4_1_bool0=true;}
                __CLR4_4_15dy5dylc8azslc.R.inc(6989);return TWO;
            case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_15dy5dylc8azslc.R.inc(6990);__CLB4_4_1_bool0=true;}
                __CLR4_4_15dy5dylc8azslc.R.inc(6991);return THREE;
            case Integer.MAX_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_15dy5dylc8azslc.R.inc(6992);__CLB4_4_1_bool0=true;}
                __CLR4_4_15dy5dylc8azslc.R.inc(6993);return MAX_VALUE;
            case Integer.MIN_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_15dy5dylc8azslc.R.inc(6994);__CLB4_4_1_bool0=true;}
                __CLR4_4_15dy5dylc8azslc.R.inc(6995);return MIN_VALUE;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_15dy5dylc8azslc.R.inc(6996);__CLB4_4_1_bool0=true;}
                __CLR4_4_15dy5dylc8azslc.R.inc(6997);return new Years(years);
        }
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a <code>Years</code> representing the number of whole years
     * between the two specified datetimes. This method corectly handles
     * any daylight savings time changes that may occur during the interval.
     *
     * @param start  the start instant, must not be null
     * @param end  the end instant, must not be null
     * @return the period in years
     * @throws IllegalArgumentException if the instants are null or invalid
     */
    public static Years yearsBetween(ReadableInstant start, ReadableInstant end) {try{__CLR4_4_15dy5dylc8azslc.R.inc(6998);
        __CLR4_4_15dy5dylc8azslc.R.inc(6999);int amount = BaseSingleFieldPeriod.between(start, end, DurationFieldType.years());
        __CLR4_4_15dy5dylc8azslc.R.inc(7000);return Years.years(amount);
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    /**
     * Creates a <code>Years</code> representing the number of whole years
     * between the two specified partial datetimes.
     * <p>
     * The two partials must contain the same fields, for example you can specify
     * two <code>LocalDate</code> objects.
     *
     * @param start  the start partial date, must not be null
     * @param end  the end partial date, must not be null
     * @return the period in years
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Years yearsBetween(ReadablePartial start, ReadablePartial end) {try{__CLR4_4_15dy5dylc8azslc.R.inc(7001);
        __CLR4_4_15dy5dylc8azslc.R.inc(7002);if ((((start instanceof LocalDate && end instanceof LocalDate)&&(__CLR4_4_15dy5dylc8azslc.R.iget(7003)!=0|true))||(__CLR4_4_15dy5dylc8azslc.R.iget(7004)==0&false)))   {{
            __CLR4_4_15dy5dylc8azslc.R.inc(7005);Chronology chrono = DateTimeUtils.getChronology(start.getChronology());
            __CLR4_4_15dy5dylc8azslc.R.inc(7006);int years = chrono.years().getDifference(
                    ((LocalDate) end).getLocalMillis(), ((LocalDate) start).getLocalMillis());
            __CLR4_4_15dy5dylc8azslc.R.inc(7007);return Years.years(years);
        }
        }__CLR4_4_15dy5dylc8azslc.R.inc(7008);int amount = BaseSingleFieldPeriod.between(start, end, ZERO);
        __CLR4_4_15dy5dylc8azslc.R.inc(7009);return Years.years(amount);
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    /**
     * Creates a <code>Years</code> representing the number of whole years
     * in the specified interval. This method corectly handles any daylight
     * savings time changes that may occur during the interval.
     *
     * @param interval  the interval to extract years from, null returns zero
     * @return the period in years
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Years yearsIn(ReadableInterval interval) {try{__CLR4_4_15dy5dylc8azslc.R.inc(7010);
        __CLR4_4_15dy5dylc8azslc.R.inc(7011);if ((((interval == null)&&(__CLR4_4_15dy5dylc8azslc.R.iget(7012)!=0|true))||(__CLR4_4_15dy5dylc8azslc.R.iget(7013)==0&false)))   {{
            __CLR4_4_15dy5dylc8azslc.R.inc(7014);return Years.ZERO;
        }
        }__CLR4_4_15dy5dylc8azslc.R.inc(7015);int amount = BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), DurationFieldType.years());
        __CLR4_4_15dy5dylc8azslc.R.inc(7016);return Years.years(amount);
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    /**
     * Creates a new <code>Years</code> by parsing a string in the ISO8601 format 'PnY'.
     * <p>
     * The parse will accept the full ISO syntax of PnYnMnWnDTnHnMnS however only the
     * years component may be non-zero. If any other component is non-zero, an exception
     * will be thrown.
     *
     * @param periodStr  the period string, null returns zero
     * @return the period in years
     * @throws IllegalArgumentException if the string format is invalid
     */
    @FromString
    public static Years parseYears(String periodStr) {try{__CLR4_4_15dy5dylc8azslc.R.inc(7017);
        __CLR4_4_15dy5dylc8azslc.R.inc(7018);if ((((periodStr == null)&&(__CLR4_4_15dy5dylc8azslc.R.iget(7019)!=0|true))||(__CLR4_4_15dy5dylc8azslc.R.iget(7020)==0&false))) {{
            __CLR4_4_15dy5dylc8azslc.R.inc(7021);return Years.ZERO;
        }
        }__CLR4_4_15dy5dylc8azslc.R.inc(7022);Period p = PARSER.parsePeriod(periodStr);
        __CLR4_4_15dy5dylc8azslc.R.inc(7023);return Years.years(p.getYears());
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new instance representing a number of years.
     * You should consider using the factory method {@link #years(int)}
     * instead of the constructor.
     *
     * @param years  the number of years to represent
     */
    private Years(int years) {
        super(years);__CLR4_4_15dy5dylc8azslc.R.inc(7025);try{__CLR4_4_15dy5dylc8azslc.R.inc(7024);
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    /**
     * Resolves singletons.
     * 
     * @return the singleton instance
     */
    private Object readResolve() {try{__CLR4_4_15dy5dylc8azslc.R.inc(7026);
        __CLR4_4_15dy5dylc8azslc.R.inc(7027);return Years.years(getValue());
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the duration field type, which is <code>years</code>.
     *
     * @return the period type
     */
    public DurationFieldType getFieldType() {try{__CLR4_4_15dy5dylc8azslc.R.inc(7028);
        __CLR4_4_15dy5dylc8azslc.R.inc(7029);return DurationFieldType.years();
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    /**
     * Gets the period type, which is <code>years</code>.
     *
     * @return the period type
     */
    public PeriodType getPeriodType() {try{__CLR4_4_15dy5dylc8azslc.R.inc(7030);
        __CLR4_4_15dy5dylc8azslc.R.inc(7031);return PeriodType.years();
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the number of years that this period represents.
     *
     * @return the number of years in the period
     */
    public int getYears() {try{__CLR4_4_15dy5dylc8azslc.R.inc(7032);
        __CLR4_4_15dy5dylc8azslc.R.inc(7033);return getValue();
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the specified number of years added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param years  the amount of years to add, may be negative
     * @return the new period plus the specified number of years
     * @throws ArithmeticException if the result overflows an int
     */
    public Years plus(int years) {try{__CLR4_4_15dy5dylc8azslc.R.inc(7034);
        __CLR4_4_15dy5dylc8azslc.R.inc(7035);if ((((years == 0)&&(__CLR4_4_15dy5dylc8azslc.R.iget(7036)!=0|true))||(__CLR4_4_15dy5dylc8azslc.R.iget(7037)==0&false))) {{
            __CLR4_4_15dy5dylc8azslc.R.inc(7038);return this;
        }
        }__CLR4_4_15dy5dylc8azslc.R.inc(7039);return Years.years(FieldUtils.safeAdd(getValue(), years));
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of years added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param years  the amount of years to add, may be negative, null means zero
     * @return the new period plus the specified number of years
     * @throws ArithmeticException if the result overflows an int
     */
    public Years plus(Years years) {try{__CLR4_4_15dy5dylc8azslc.R.inc(7040);
        __CLR4_4_15dy5dylc8azslc.R.inc(7041);if ((((years == null)&&(__CLR4_4_15dy5dylc8azslc.R.iget(7042)!=0|true))||(__CLR4_4_15dy5dylc8azslc.R.iget(7043)==0&false))) {{
            __CLR4_4_15dy5dylc8azslc.R.inc(7044);return this;
        }
        }__CLR4_4_15dy5dylc8azslc.R.inc(7045);return plus(years.getValue());
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the specified number of years taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param years  the amount of years to take away, may be negative
     * @return the new period minus the specified number of years
     * @throws ArithmeticException if the result overflows an int
     */
    public Years minus(int years) {try{__CLR4_4_15dy5dylc8azslc.R.inc(7046);
        __CLR4_4_15dy5dylc8azslc.R.inc(7047);return plus(FieldUtils.safeNegate(years));
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of years taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param years  the amount of years to take away, may be negative, null means zero
     * @return the new period minus the specified number of years
     * @throws ArithmeticException if the result overflows an int
     */
    public Years minus(Years years) {try{__CLR4_4_15dy5dylc8azslc.R.inc(7048);
        __CLR4_4_15dy5dylc8azslc.R.inc(7049);if ((((years == null)&&(__CLR4_4_15dy5dylc8azslc.R.iget(7050)!=0|true))||(__CLR4_4_15dy5dylc8azslc.R.iget(7051)==0&false))) {{
            __CLR4_4_15dy5dylc8azslc.R.inc(7052);return this;
        }
        }__CLR4_4_15dy5dylc8azslc.R.inc(7053);return minus(years.getValue());
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the years multiplied by the specified scalar.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param scalar  the amount to multiply by, may be negative
     * @return the new period multiplied by the specified scalar
     * @throws ArithmeticException if the result overflows an int
     */
    public Years multipliedBy(int scalar) {try{__CLR4_4_15dy5dylc8azslc.R.inc(7054);
        __CLR4_4_15dy5dylc8azslc.R.inc(7055);return Years.years(FieldUtils.safeMultiply(getValue(), scalar));
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    /**
     * Returns a new instance with the years divided by the specified divisor.
     * The calculation uses integer division, thus 3 divided by 2 is 1.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param divisor  the amount to divide by, may be negative
     * @return the new period divided by the specified divisor
     * @throws ArithmeticException if the divisor is zero
     */
    public Years dividedBy(int divisor) {try{__CLR4_4_15dy5dylc8azslc.R.inc(7056);
        __CLR4_4_15dy5dylc8azslc.R.inc(7057);if ((((divisor == 1)&&(__CLR4_4_15dy5dylc8azslc.R.iget(7058)!=0|true))||(__CLR4_4_15dy5dylc8azslc.R.iget(7059)==0&false))) {{
            __CLR4_4_15dy5dylc8azslc.R.inc(7060);return this;
        }
        }__CLR4_4_15dy5dylc8azslc.R.inc(7061);return Years.years(getValue() / divisor);
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new instance with the years value negated.
     *
     * @return the new period with a negated value
     * @throws ArithmeticException if the result overflows an int
     */
    public Years negated() {try{__CLR4_4_15dy5dylc8azslc.R.inc(7062);
        __CLR4_4_15dy5dylc8azslc.R.inc(7063);return Years.years(FieldUtils.safeNegate(getValue()));
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Is this years instance greater than the specified number of years.
     *
     * @param other  the other period, null means zero
     * @return true if this years instance is greater than the specified one
     */
    public boolean isGreaterThan(Years other) {try{__CLR4_4_15dy5dylc8azslc.R.inc(7064);
        __CLR4_4_15dy5dylc8azslc.R.inc(7065);if ((((other == null)&&(__CLR4_4_15dy5dylc8azslc.R.iget(7066)!=0|true))||(__CLR4_4_15dy5dylc8azslc.R.iget(7067)==0&false))) {{
            __CLR4_4_15dy5dylc8azslc.R.inc(7068);return getValue() > 0;
        }
        }__CLR4_4_15dy5dylc8azslc.R.inc(7069);return getValue() > other.getValue();
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    /**
     * Is this years instance less than the specified number of years.
     *
     * @param other  the other period, null means zero
     * @return true if this years instance is less than the specified one
     */
    public boolean isLessThan(Years other) {try{__CLR4_4_15dy5dylc8azslc.R.inc(7070);
        __CLR4_4_15dy5dylc8azslc.R.inc(7071);if ((((other == null)&&(__CLR4_4_15dy5dylc8azslc.R.iget(7072)!=0|true))||(__CLR4_4_15dy5dylc8azslc.R.iget(7073)==0&false))) {{
            __CLR4_4_15dy5dylc8azslc.R.inc(7074);return getValue() < 0;
        }
        }__CLR4_4_15dy5dylc8azslc.R.inc(7075);return getValue() < other.getValue();
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this instance as a String in the ISO8601 duration format.
     * <p>
     * For example, "P4Y" represents 4 years.
     *
     * @return the value as an ISO8601 string
     */
    @ToString
    public String toString() {try{__CLR4_4_15dy5dylc8azslc.R.inc(7076);
        __CLR4_4_15dy5dylc8azslc.R.inc(7077);return "P" + String.valueOf(getValue()) + "Y";
    }finally{__CLR4_4_15dy5dylc8azslc.R.flushNeeded();}}

}
