/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.math3.util;

import org.apache.commons.math3.RealFieldElement;
import org.apache.commons.math3.Field;
import org.apache.commons.math3.exception.DimensionMismatchException;

/**
 * This class wraps a {@code double} value in an object. It is similar to the
 * standard class {@link Double}, while also implementing the
 * {@link RealFieldElement} interface.
 *
 * @since 3.1
 * @version $Id$
 */
public class Decimal64 extends Number
                       implements RealFieldElement<Decimal64>, Comparable<Decimal64> {public static class __CLR4_4_117o117o1lb90pavo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,56769,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The constant value of {@code 0d} as a {@code Decimal64}. */
    public static final Decimal64 ZERO;

    /** The constant value of {@code 1d} as a {@code Decimal64}. */
    public static final Decimal64 ONE;

    /**
     * The constant value of {@link Double#NEGATIVE_INFINITY} as a
     * {@code Decimal64}.
     */
    public static final Decimal64 NEGATIVE_INFINITY;

    /**
     * The constant value of {@link Double#POSITIVE_INFINITY} as a
     * {@code Decimal64}.
     */
    public static final Decimal64 POSITIVE_INFINITY;

    /** The constant value of {@link Double#NaN} as a {@code Decimal64}. */
    public static final Decimal64 NAN;

    /** */
    private static final long serialVersionUID = 20120227L;

    static {try{__CLR4_4_117o117o1lb90pavo.R.inc(56593);
        __CLR4_4_117o117o1lb90pavo.R.inc(56594);ZERO = new Decimal64(0d);
        __CLR4_4_117o117o1lb90pavo.R.inc(56595);ONE = new Decimal64(1d);
        __CLR4_4_117o117o1lb90pavo.R.inc(56596);NEGATIVE_INFINITY = new Decimal64(Double.NEGATIVE_INFINITY);
        __CLR4_4_117o117o1lb90pavo.R.inc(56597);POSITIVE_INFINITY = new Decimal64(Double.POSITIVE_INFINITY);
        __CLR4_4_117o117o1lb90pavo.R.inc(56598);NAN = new Decimal64(Double.NaN);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** The primitive {@code double} value of this object. */
    private final double value;

    /**
     * Creates a new instance of this class.
     *
     * @param x the primitive {@code double} value of the object to be created
     */
    public Decimal64(final double x) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56599);
        __CLR4_4_117o117o1lb90pavo.R.inc(56600);this.value = x;
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /*
     * Methods from the FieldElement interface.
     */

    /** {@inheritDoc} */
    public Field<Decimal64> getField() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56601);
        __CLR4_4_117o117o1lb90pavo.R.inc(56602);return Decimal64Field.getInstance();
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The current implementation strictly enforces
     * {@code this.add(a).equals(new Decimal64(this.doubleValue()
     * + a.doubleValue()))}.
     */
    public Decimal64 add(final Decimal64 a) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56603);
        __CLR4_4_117o117o1lb90pavo.R.inc(56604);return new Decimal64(this.value + a.value);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The current implementation strictly enforces
     * {@code this.subtract(a).equals(new Decimal64(this.doubleValue()
     * - a.doubleValue()))}.
     */
    public Decimal64 subtract(final Decimal64 a) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56605);
        __CLR4_4_117o117o1lb90pavo.R.inc(56606);return new Decimal64(this.value - a.value);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The current implementation strictly enforces
     * {@code this.negate().equals(new Decimal64(-this.doubleValue()))}.
     */
    public Decimal64 negate() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56607);
        __CLR4_4_117o117o1lb90pavo.R.inc(56608);return new Decimal64(-this.value);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The current implementation strictly enforces
     * {@code this.multiply(a).equals(new Decimal64(this.doubleValue()
     * * a.doubleValue()))}.
     */
    public Decimal64 multiply(final Decimal64 a) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56609);
        __CLR4_4_117o117o1lb90pavo.R.inc(56610);return new Decimal64(this.value * a.value);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The current implementation strictly enforces
     * {@code this.multiply(n).equals(new Decimal64(n * this.doubleValue()))}.
     */
    public Decimal64 multiply(final int n) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56611);
        __CLR4_4_117o117o1lb90pavo.R.inc(56612);return new Decimal64(n * this.value);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The current implementation strictly enforces
     * {@code this.divide(a).equals(new Decimal64(this.doubleValue()
     * / a.doubleValue()))}.
     *
     */
    public Decimal64 divide(final Decimal64 a) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56613);
        __CLR4_4_117o117o1lb90pavo.R.inc(56614);return new Decimal64(this.value / a.value);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The current implementation strictly enforces
     * {@code this.reciprocal().equals(new Decimal64(1.0
     * / this.doubleValue()))}.
     */
    public Decimal64 reciprocal() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56615);
        __CLR4_4_117o117o1lb90pavo.R.inc(56616);return new Decimal64(1.0 / this.value);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /*
     * Methods from the Number abstract class
     */

    /**
     * {@inheritDoc}
     *
     * The current implementation performs casting to a {@code byte}.
     */
    @Override
    public byte byteValue() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56617);
        __CLR4_4_117o117o1lb90pavo.R.inc(56618);return (byte) value;
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The current implementation performs casting to a {@code short}.
     */
    @Override
    public short shortValue() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56619);
        __CLR4_4_117o117o1lb90pavo.R.inc(56620);return (short) value;
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The current implementation performs casting to a {@code int}.
     */
    @Override
    public int intValue() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56621);
        __CLR4_4_117o117o1lb90pavo.R.inc(56622);return (int) value;
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The current implementation performs casting to a {@code long}.
     */
    @Override
    public long longValue() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56623);
        __CLR4_4_117o117o1lb90pavo.R.inc(56624);return (long) value;
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The current implementation performs casting to a {@code float}.
     */
    @Override
    public float floatValue() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56625);
        __CLR4_4_117o117o1lb90pavo.R.inc(56626);return (float) value;
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double doubleValue() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56627);
        __CLR4_4_117o117o1lb90pavo.R.inc(56628);return value;
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /*
     * Methods from the Comparable interface.
     */

    /**
     * {@inheritDoc}
     *
     * The current implementation returns the same value as
     * <center> {@code new Double(this.doubleValue()).compareTo(new
     * Double(o.doubleValue()))} </center>
     *
     * @see Double#compareTo(Double)
     */
    public int compareTo(final Decimal64 o) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56629);
        __CLR4_4_117o117o1lb90pavo.R.inc(56630);return Double.compare(this.value, o.value);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /*
     * Methods from the Object abstract class.
     */

    /** {@inheritDoc} */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56631);
        __CLR4_4_117o117o1lb90pavo.R.inc(56632);if ((((obj instanceof Decimal64)&&(__CLR4_4_117o117o1lb90pavo.R.iget(56633)!=0|true))||(__CLR4_4_117o117o1lb90pavo.R.iget(56634)==0&false))) {{
            __CLR4_4_117o117o1lb90pavo.R.inc(56635);final Decimal64 that = (Decimal64) obj;
            __CLR4_4_117o117o1lb90pavo.R.inc(56636);return Double.doubleToLongBits(this.value) == Double
                    .doubleToLongBits(that.value);
        }
        }__CLR4_4_117o117o1lb90pavo.R.inc(56637);return false;
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The current implementation returns the same value as
     * {@code new Double(this.doubleValue()).hashCode()}
     *
     * @see Double#hashCode()
     */
    @Override
    public int hashCode() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56638);
        __CLR4_4_117o117o1lb90pavo.R.inc(56639);long v = Double.doubleToLongBits(value);
        __CLR4_4_117o117o1lb90pavo.R.inc(56640);return (int) (v ^ (v >>> 32));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The returned {@code String} is equal to
     * {@code Double.toString(this.doubleValue())}
     *
     * @see Double#toString(double)
     */
    @Override
    public String toString() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56641);
        __CLR4_4_117o117o1lb90pavo.R.inc(56642);return Double.toString(value);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /*
     * Methods inspired by the Double class.
     */

    /**
     * Returns {@code true} if {@code this} double precision number is infinite
     * ({@link Double#POSITIVE_INFINITY} or {@link Double#NEGATIVE_INFINITY}).
     *
     * @return {@code true} if {@code this} number is infinite
     */
    public boolean isInfinite() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56643);
        __CLR4_4_117o117o1lb90pavo.R.inc(56644);return Double.isInfinite(value);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /**
     * Returns {@code true} if {@code this} double precision number is
     * Not-a-Number ({@code NaN}), false otherwise.
     *
     * @return {@code true} if {@code this} is {@code NaN}
     */
    public boolean isNaN() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56645);
        __CLR4_4_117o117o1lb90pavo.R.inc(56646);return Double.isNaN(value);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public double getReal() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56647);
        __CLR4_4_117o117o1lb90pavo.R.inc(56648);return value;
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 add(final double a) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56649);
        __CLR4_4_117o117o1lb90pavo.R.inc(56650);return new Decimal64(value + a);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 subtract(final double a) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56651);
        __CLR4_4_117o117o1lb90pavo.R.inc(56652);return new Decimal64(value - a);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 multiply(final double a) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56653);
        __CLR4_4_117o117o1lb90pavo.R.inc(56654);return new Decimal64(value * a);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 divide(final double a) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56655);
        __CLR4_4_117o117o1lb90pavo.R.inc(56656);return new Decimal64(value / a);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 remainder(final double a) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56657);
        __CLR4_4_117o117o1lb90pavo.R.inc(56658);return new Decimal64(FastMath.IEEEremainder(value, a));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 remainder(final Decimal64 a) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56659);
        __CLR4_4_117o117o1lb90pavo.R.inc(56660);return new Decimal64(FastMath.IEEEremainder(value, a.value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 abs() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56661);
        __CLR4_4_117o117o1lb90pavo.R.inc(56662);return new Decimal64(FastMath.abs(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 ceil() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56663);
        __CLR4_4_117o117o1lb90pavo.R.inc(56664);return new Decimal64(FastMath.ceil(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 floor() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56665);
        __CLR4_4_117o117o1lb90pavo.R.inc(56666);return new Decimal64(FastMath.floor(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 rint() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56667);
        __CLR4_4_117o117o1lb90pavo.R.inc(56668);return new Decimal64(FastMath.rint(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public long round() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56669);
        __CLR4_4_117o117o1lb90pavo.R.inc(56670);return FastMath.round(value);
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 signum() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56671);
        __CLR4_4_117o117o1lb90pavo.R.inc(56672);return new Decimal64(FastMath.signum(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 copySign(final Decimal64 sign) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56673);
        __CLR4_4_117o117o1lb90pavo.R.inc(56674);return new Decimal64(FastMath.copySign(value, sign.value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 copySign(final double sign) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56675);
        __CLR4_4_117o117o1lb90pavo.R.inc(56676);return new Decimal64(FastMath.copySign(value, sign));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 scalb(final int n) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56677);
        __CLR4_4_117o117o1lb90pavo.R.inc(56678);return new Decimal64(FastMath.scalb(value, n));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 hypot(final Decimal64 y) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56679);
        __CLR4_4_117o117o1lb90pavo.R.inc(56680);return new Decimal64(FastMath.hypot(value, y.value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 sqrt() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56681);
        __CLR4_4_117o117o1lb90pavo.R.inc(56682);return new Decimal64(FastMath.sqrt(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 cbrt() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56683);
        __CLR4_4_117o117o1lb90pavo.R.inc(56684);return new Decimal64(FastMath.cbrt(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 rootN(final int n) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56685);
        __CLR4_4_117o117o1lb90pavo.R.inc(56686);if ((((value < 0)&&(__CLR4_4_117o117o1lb90pavo.R.iget(56687)!=0|true))||(__CLR4_4_117o117o1lb90pavo.R.iget(56688)==0&false))) {{
            __CLR4_4_117o117o1lb90pavo.R.inc(56689);return new Decimal64(-FastMath.pow(-value, 1.0 / n));
        } }else {{
            __CLR4_4_117o117o1lb90pavo.R.inc(56690);return new Decimal64(FastMath.pow(value, 1.0 / n));
        }
    }}finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 pow(final double p) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56691);
        __CLR4_4_117o117o1lb90pavo.R.inc(56692);return new Decimal64(FastMath.pow(value, p));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 pow(final int n) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56693);
        __CLR4_4_117o117o1lb90pavo.R.inc(56694);return new Decimal64(FastMath.pow(value, n));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 pow(final Decimal64 e) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56695);
        __CLR4_4_117o117o1lb90pavo.R.inc(56696);return new Decimal64(FastMath.pow(value, e.value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 exp() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56697);
        __CLR4_4_117o117o1lb90pavo.R.inc(56698);return new Decimal64(FastMath.exp(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 expm1() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56699);
        __CLR4_4_117o117o1lb90pavo.R.inc(56700);return new Decimal64(FastMath.expm1(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 log() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56701);
        __CLR4_4_117o117o1lb90pavo.R.inc(56702);return new Decimal64(FastMath.log(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 log1p() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56703);
        __CLR4_4_117o117o1lb90pavo.R.inc(56704);return new Decimal64(FastMath.log1p(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** Base 10 logarithm.
     * @return base 10 logarithm of the instance
     * @since 3.2
     */
    public Decimal64 log10() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56705);
        __CLR4_4_117o117o1lb90pavo.R.inc(56706);return new Decimal64(FastMath.log10(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 cos() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56707);
        __CLR4_4_117o117o1lb90pavo.R.inc(56708);return new Decimal64(FastMath.cos(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 sin() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56709);
        __CLR4_4_117o117o1lb90pavo.R.inc(56710);return new Decimal64(FastMath.sin(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 tan() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56711);
        __CLR4_4_117o117o1lb90pavo.R.inc(56712);return new Decimal64(FastMath.tan(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 acos() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56713);
        __CLR4_4_117o117o1lb90pavo.R.inc(56714);return new Decimal64(FastMath.acos(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 asin() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56715);
        __CLR4_4_117o117o1lb90pavo.R.inc(56716);return new Decimal64(FastMath.asin(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 atan() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56717);
        __CLR4_4_117o117o1lb90pavo.R.inc(56718);return new Decimal64(FastMath.atan(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 atan2(final Decimal64 x) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56719);
        __CLR4_4_117o117o1lb90pavo.R.inc(56720);return new Decimal64(FastMath.atan2(value, x.value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 cosh() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56721);
        __CLR4_4_117o117o1lb90pavo.R.inc(56722);return new Decimal64(FastMath.cosh(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 sinh() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56723);
        __CLR4_4_117o117o1lb90pavo.R.inc(56724);return new Decimal64(FastMath.sinh(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 tanh() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56725);
        __CLR4_4_117o117o1lb90pavo.R.inc(56726);return new Decimal64(FastMath.tanh(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 acosh() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56727);
        __CLR4_4_117o117o1lb90pavo.R.inc(56728);return new Decimal64(FastMath.acosh(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 asinh() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56729);
        __CLR4_4_117o117o1lb90pavo.R.inc(56730);return new Decimal64(FastMath.asinh(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 atanh() {try{__CLR4_4_117o117o1lb90pavo.R.inc(56731);
        __CLR4_4_117o117o1lb90pavo.R.inc(56732);return new Decimal64(FastMath.atanh(value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 linearCombination(final Decimal64[] a, final Decimal64[] b)
        throws DimensionMismatchException {try{__CLR4_4_117o117o1lb90pavo.R.inc(56733);
        __CLR4_4_117o117o1lb90pavo.R.inc(56734);if ((((a.length != b.length)&&(__CLR4_4_117o117o1lb90pavo.R.iget(56735)!=0|true))||(__CLR4_4_117o117o1lb90pavo.R.iget(56736)==0&false))) {{
            __CLR4_4_117o117o1lb90pavo.R.inc(56737);throw new DimensionMismatchException(a.length, b.length);
        }
        }__CLR4_4_117o117o1lb90pavo.R.inc(56738);final double[] aDouble = new double[a.length];
        __CLR4_4_117o117o1lb90pavo.R.inc(56739);final double[] bDouble = new double[b.length];
        __CLR4_4_117o117o1lb90pavo.R.inc(56740);for (int i = 0; (((i < a.length)&&(__CLR4_4_117o117o1lb90pavo.R.iget(56741)!=0|true))||(__CLR4_4_117o117o1lb90pavo.R.iget(56742)==0&false)); ++i) {{
            __CLR4_4_117o117o1lb90pavo.R.inc(56743);aDouble[i] = a[i].value;
            __CLR4_4_117o117o1lb90pavo.R.inc(56744);bDouble[i] = b[i].value;
        }
        }__CLR4_4_117o117o1lb90pavo.R.inc(56745);return new Decimal64(MathArrays.linearCombination(aDouble, bDouble));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 linearCombination(final double[] a, final Decimal64[] b)
        throws DimensionMismatchException {try{__CLR4_4_117o117o1lb90pavo.R.inc(56746);
        __CLR4_4_117o117o1lb90pavo.R.inc(56747);if ((((a.length != b.length)&&(__CLR4_4_117o117o1lb90pavo.R.iget(56748)!=0|true))||(__CLR4_4_117o117o1lb90pavo.R.iget(56749)==0&false))) {{
            __CLR4_4_117o117o1lb90pavo.R.inc(56750);throw new DimensionMismatchException(a.length, b.length);
        }
        }__CLR4_4_117o117o1lb90pavo.R.inc(56751);final double[] bDouble = new double[b.length];
        __CLR4_4_117o117o1lb90pavo.R.inc(56752);for (int i = 0; (((i < a.length)&&(__CLR4_4_117o117o1lb90pavo.R.iget(56753)!=0|true))||(__CLR4_4_117o117o1lb90pavo.R.iget(56754)==0&false)); ++i) {{
            __CLR4_4_117o117o1lb90pavo.R.inc(56755);bDouble[i] = b[i].value;
        }
        }__CLR4_4_117o117o1lb90pavo.R.inc(56756);return new Decimal64(MathArrays.linearCombination(a, bDouble));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 linearCombination(final Decimal64 a1, final Decimal64 b1,
                                       final Decimal64 a2, final Decimal64 b2) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56757);
        __CLR4_4_117o117o1lb90pavo.R.inc(56758);return new Decimal64(MathArrays.linearCombination(a1.value, b1.value,
                                                          a2.value, b2.value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 linearCombination(final double a1, final Decimal64 b1,
                                       final double a2, final Decimal64 b2) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56759);
        __CLR4_4_117o117o1lb90pavo.R.inc(56760);return new Decimal64(MathArrays.linearCombination(a1, b1.value,
                                                          a2, b2.value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 linearCombination(final Decimal64 a1, final Decimal64 b1,
                                       final Decimal64 a2, final Decimal64 b2,
                                       final Decimal64 a3, final Decimal64 b3) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56761);
        __CLR4_4_117o117o1lb90pavo.R.inc(56762);return new Decimal64(MathArrays.linearCombination(a1.value, b1.value,
                                                          a2.value, b2.value,
                                                          a3.value, b3.value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 linearCombination(final double a1, final Decimal64 b1,
                                       final double a2, final Decimal64 b2,
                                       final double a3, final Decimal64 b3) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56763);
        __CLR4_4_117o117o1lb90pavo.R.inc(56764);return new Decimal64(MathArrays.linearCombination(a1, b1.value,
                                                          a2, b2.value,
                                                          a3, b3.value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 linearCombination(final Decimal64 a1, final Decimal64 b1,
                                       final Decimal64 a2, final Decimal64 b2,
                                       final Decimal64 a3, final Decimal64 b3,
                                       final Decimal64 a4, final Decimal64 b4) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56765);
        __CLR4_4_117o117o1lb90pavo.R.inc(56766);return new Decimal64(MathArrays.linearCombination(a1.value, b1.value,
                                                          a2.value, b2.value,
                                                          a3.value, b3.value,
                                                          a4.value, b4.value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

    /** {@inheritDoc}
     * @since 3.2
     */
    public Decimal64 linearCombination(final double a1, final Decimal64 b1,
                                       final double a2, final Decimal64 b2,
                                       final double a3, final Decimal64 b3,
                                       final double a4, final Decimal64 b4) {try{__CLR4_4_117o117o1lb90pavo.R.inc(56767);
        __CLR4_4_117o117o1lb90pavo.R.inc(56768);return new Decimal64(MathArrays.linearCombination(a1, b1.value,
                                                          a2, b2.value,
                                                          a3, b3.value,
                                                          a4, b4.value));
    }finally{__CLR4_4_117o117o1lb90pavo.R.flushNeeded();}}

}
