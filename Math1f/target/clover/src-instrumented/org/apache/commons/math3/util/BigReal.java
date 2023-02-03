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


import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Arbitrary precision decimal number.
 * <p>
 * This class is a simple wrapper around the standard <code>BigDecimal</code>
 * in order to implement the {@link FieldElement} interface.
 * </p>
 * @since 2.0
 * @version $Id$
 */
public class BigReal implements FieldElement<BigReal>, Comparable<BigReal>, Serializable {public static class __CLR4_4_1179i179ilb90paus{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,56150,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** A big real representing 0. */
    public static final BigReal ZERO = new BigReal(BigDecimal.ZERO);

    /** A big real representing 1. */
    public static final BigReal ONE = new BigReal(BigDecimal.ONE);

    /** Serializable version identifier. */
    private static final long serialVersionUID = 4984534880991310382L;

    /** Underlying BigDecimal. */
    private final BigDecimal d;

    /** Rounding mode for divisions. **/
    private RoundingMode roundingMode = RoundingMode.HALF_UP;

    /*** BigDecimal scale ***/
    private int scale = 64;

    /** Build an instance from a BigDecimal.
     * @param val value of the instance
     */
    public BigReal(BigDecimal val) {try{__CLR4_4_1179i179ilb90paus.R.inc(56070);
        __CLR4_4_1179i179ilb90paus.R.inc(56071);d =  val;
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from a BigInteger.
     * @param val value of the instance
     */
    public BigReal(BigInteger val) {try{__CLR4_4_1179i179ilb90paus.R.inc(56072);
        __CLR4_4_1179i179ilb90paus.R.inc(56073);d = new BigDecimal(val);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from an unscaled BigInteger.
     * @param unscaledVal unscaled value
     * @param scale scale to use
     */
    public BigReal(BigInteger unscaledVal, int scale) {try{__CLR4_4_1179i179ilb90paus.R.inc(56074);
        __CLR4_4_1179i179ilb90paus.R.inc(56075);d = new BigDecimal(unscaledVal, scale);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from an unscaled BigInteger.
     * @param unscaledVal unscaled value
     * @param scale scale to use
     * @param mc to used
     */
    public BigReal(BigInteger unscaledVal, int scale, MathContext mc) {try{__CLR4_4_1179i179ilb90paus.R.inc(56076);
        __CLR4_4_1179i179ilb90paus.R.inc(56077);d = new BigDecimal(unscaledVal, scale, mc);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from a BigInteger.
     * @param val value of the instance
     * @param mc context to use
     */
    public BigReal(BigInteger val, MathContext mc) {try{__CLR4_4_1179i179ilb90paus.R.inc(56078);
        __CLR4_4_1179i179ilb90paus.R.inc(56079);d = new BigDecimal(val, mc);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from a characters representation.
     * @param in character representation of the value
     */
    public BigReal(char[] in) {try{__CLR4_4_1179i179ilb90paus.R.inc(56080);
        __CLR4_4_1179i179ilb90paus.R.inc(56081);d = new BigDecimal(in);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from a characters representation.
     * @param in character representation of the value
     * @param offset offset of the first character to analyze
     * @param len length of the array slice to analyze
     */
    public BigReal(char[] in, int offset, int len) {try{__CLR4_4_1179i179ilb90paus.R.inc(56082);
        __CLR4_4_1179i179ilb90paus.R.inc(56083);d = new BigDecimal(in, offset, len);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from a characters representation.
     * @param in character representation of the value
     * @param offset offset of the first character to analyze
     * @param len length of the array slice to analyze
     * @param mc context to use
     */
    public BigReal(char[] in, int offset, int len, MathContext mc) {try{__CLR4_4_1179i179ilb90paus.R.inc(56084);
        __CLR4_4_1179i179ilb90paus.R.inc(56085);d = new BigDecimal(in, offset, len, mc);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from a characters representation.
     * @param in character representation of the value
     * @param mc context to use
     */
    public BigReal(char[] in, MathContext mc) {try{__CLR4_4_1179i179ilb90paus.R.inc(56086);
        __CLR4_4_1179i179ilb90paus.R.inc(56087);d = new BigDecimal(in, mc);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from a double.
     * @param val value of the instance
     */
    public BigReal(double val) {try{__CLR4_4_1179i179ilb90paus.R.inc(56088);
        __CLR4_4_1179i179ilb90paus.R.inc(56089);d = new BigDecimal(val);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from a double.
     * @param val value of the instance
     * @param mc context to use
     */
    public BigReal(double val, MathContext mc) {try{__CLR4_4_1179i179ilb90paus.R.inc(56090);
        __CLR4_4_1179i179ilb90paus.R.inc(56091);d = new BigDecimal(val, mc);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from an int.
     * @param val value of the instance
     */
    public BigReal(int val) {try{__CLR4_4_1179i179ilb90paus.R.inc(56092);
        __CLR4_4_1179i179ilb90paus.R.inc(56093);d = new BigDecimal(val);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from an int.
     * @param val value of the instance
     * @param mc context to use
     */
    public BigReal(int val, MathContext mc) {try{__CLR4_4_1179i179ilb90paus.R.inc(56094);
        __CLR4_4_1179i179ilb90paus.R.inc(56095);d = new BigDecimal(val, mc);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from a long.
     * @param val value of the instance
     */
    public BigReal(long val) {try{__CLR4_4_1179i179ilb90paus.R.inc(56096);
        __CLR4_4_1179i179ilb90paus.R.inc(56097);d = new BigDecimal(val);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from a long.
     * @param val value of the instance
     * @param mc context to use
     */
    public BigReal(long val, MathContext mc) {try{__CLR4_4_1179i179ilb90paus.R.inc(56098);
        __CLR4_4_1179i179ilb90paus.R.inc(56099);d = new BigDecimal(val, mc);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from a String representation.
     * @param val character representation of the value
     */
    public BigReal(String val) {try{__CLR4_4_1179i179ilb90paus.R.inc(56100);
        __CLR4_4_1179i179ilb90paus.R.inc(56101);d = new BigDecimal(val);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Build an instance from a String representation.
     * @param val character representation of the value
     * @param mc context to use
     */
    public BigReal(String val, MathContext mc)  {try{__CLR4_4_1179i179ilb90paus.R.inc(56102);
        __CLR4_4_1179i179ilb90paus.R.inc(56103);d = new BigDecimal(val, mc);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /***
     * Gets the rounding mode for division operations
     * The default is {@code RoundingMode.HALF_UP}
     * @return the rounding mode.
     * @since 2.1
     */
    public RoundingMode getRoundingMode() {try{__CLR4_4_1179i179ilb90paus.R.inc(56104);
        __CLR4_4_1179i179ilb90paus.R.inc(56105);return roundingMode;
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /***
     * Sets the rounding mode for decimal divisions.
     * @param roundingMode rounding mode for decimal divisions
     * @since 2.1
     */
    public void setRoundingMode(RoundingMode roundingMode) {try{__CLR4_4_1179i179ilb90paus.R.inc(56106);
        __CLR4_4_1179i179ilb90paus.R.inc(56107);this.roundingMode = roundingMode;
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /***
     * Sets the scale for division operations.
     * The default is 64
     * @return the scale
     * @since 2.1
     */
    public int getScale() {try{__CLR4_4_1179i179ilb90paus.R.inc(56108);
        __CLR4_4_1179i179ilb90paus.R.inc(56109);return scale;
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /***
     * Sets the scale for division operations.
     * @param scale scale for division operations
     * @since 2.1
     */
    public void setScale(int scale) {try{__CLR4_4_1179i179ilb90paus.R.inc(56110);
        __CLR4_4_1179i179ilb90paus.R.inc(56111);this.scale = scale;
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** {@inheritDoc} */
    public BigReal add(BigReal a) {try{__CLR4_4_1179i179ilb90paus.R.inc(56112);
        __CLR4_4_1179i179ilb90paus.R.inc(56113);return new BigReal(d.add(a.d));
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** {@inheritDoc} */
    public BigReal subtract(BigReal a) {try{__CLR4_4_1179i179ilb90paus.R.inc(56114);
        __CLR4_4_1179i179ilb90paus.R.inc(56115);return new BigReal(d.subtract(a.d));
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** {@inheritDoc} */
    public BigReal negate() {try{__CLR4_4_1179i179ilb90paus.R.inc(56116);
        __CLR4_4_1179i179ilb90paus.R.inc(56117);return new BigReal(d.negate());
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws MathArithmeticException if {@code a} is zero
     */
    public BigReal divide(BigReal a) throws MathArithmeticException {try{__CLR4_4_1179i179ilb90paus.R.inc(56118);
        __CLR4_4_1179i179ilb90paus.R.inc(56119);try {
            __CLR4_4_1179i179ilb90paus.R.inc(56120);return new BigReal(d.divide(a.d, scale, roundingMode));
        } catch (ArithmeticException e) {
            // Division by zero has occurred
            __CLR4_4_1179i179ilb90paus.R.inc(56121);throw new MathArithmeticException(LocalizedFormats.ZERO_NOT_ALLOWED);
        }
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws MathArithmeticException if {@code this} is zero
     */
    public BigReal reciprocal() throws MathArithmeticException {try{__CLR4_4_1179i179ilb90paus.R.inc(56122);
        __CLR4_4_1179i179ilb90paus.R.inc(56123);try {
            __CLR4_4_1179i179ilb90paus.R.inc(56124);return new BigReal(BigDecimal.ONE.divide(d, scale, roundingMode));
        } catch (ArithmeticException e) {
            // Division by zero has occurred
            __CLR4_4_1179i179ilb90paus.R.inc(56125);throw new MathArithmeticException(LocalizedFormats.ZERO_NOT_ALLOWED);
        }
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** {@inheritDoc} */
    public BigReal multiply(BigReal a) {try{__CLR4_4_1179i179ilb90paus.R.inc(56126);
        __CLR4_4_1179i179ilb90paus.R.inc(56127);return new BigReal(d.multiply(a.d));
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** {@inheritDoc} */
    public BigReal multiply(final int n) {try{__CLR4_4_1179i179ilb90paus.R.inc(56128);
        __CLR4_4_1179i179ilb90paus.R.inc(56129);return new BigReal(d.multiply(new BigDecimal(n)));
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int compareTo(BigReal a) {try{__CLR4_4_1179i179ilb90paus.R.inc(56130);
        __CLR4_4_1179i179ilb90paus.R.inc(56131);return d.compareTo(a.d);
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Get the double value corresponding to the instance.
     * @return double value corresponding to the instance
     */
    public double doubleValue() {try{__CLR4_4_1179i179ilb90paus.R.inc(56132);
        __CLR4_4_1179i179ilb90paus.R.inc(56133);return d.doubleValue();
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** Get the BigDecimal value corresponding to the instance.
     * @return BigDecimal value corresponding to the instance
     */
    public BigDecimal bigDecimalValue() {try{__CLR4_4_1179i179ilb90paus.R.inc(56134);
        __CLR4_4_1179i179ilb90paus.R.inc(56135);return d;
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object other) {try{__CLR4_4_1179i179ilb90paus.R.inc(56136);
        __CLR4_4_1179i179ilb90paus.R.inc(56137);if ((((this == other)&&(__CLR4_4_1179i179ilb90paus.R.iget(56138)!=0|true))||(__CLR4_4_1179i179ilb90paus.R.iget(56139)==0&false))){{
            __CLR4_4_1179i179ilb90paus.R.inc(56140);return true;
        }

        }__CLR4_4_1179i179ilb90paus.R.inc(56141);if ((((other instanceof BigReal)&&(__CLR4_4_1179i179ilb90paus.R.iget(56142)!=0|true))||(__CLR4_4_1179i179ilb90paus.R.iget(56143)==0&false))){{
            __CLR4_4_1179i179ilb90paus.R.inc(56144);return d.equals(((BigReal) other).d);
        }
        }__CLR4_4_1179i179ilb90paus.R.inc(56145);return false;
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int hashCode() {try{__CLR4_4_1179i179ilb90paus.R.inc(56146);
        __CLR4_4_1179i179ilb90paus.R.inc(56147);return d.hashCode();
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Field<BigReal> getField() {try{__CLR4_4_1179i179ilb90paus.R.inc(56148);
        __CLR4_4_1179i179ilb90paus.R.inc(56149);return BigRealField.getInstance();
    }finally{__CLR4_4_1179i179ilb90paus.R.flushNeeded();}}
}
