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
package org.apache.commons.math3.fraction;

import java.math.BigInteger;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.NullArgumentException;

/**
 * Formats a BigFraction number in proper format.  The number format for each of
 * the whole number, numerator and, denominator can be configured.
 * <p>
 * Minus signs are only allowed in the whole number part - i.e.,
 * "-3 1/2" is legitimate and denotes -7/2, but "-3 -1/2" is invalid and
 * will result in a <code>ParseException</code>.</p>
 *
 * @since 1.1
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ProperBigFractionFormat extends BigFractionFormat {public static class __CLR4_4_1blablalb90p7xd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15117,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -6337346779577272307L;

    /** The format used for the whole number. */
    private NumberFormat wholeFormat;

    /**
     * Create a proper formatting instance with the default number format for
     * the whole, numerator, and denominator.
     */
    public ProperBigFractionFormat() {
        this(getDefaultNumberFormat());__CLR4_4_1blablalb90p7xd.R.inc(15023);try{__CLR4_4_1blablalb90p7xd.R.inc(15022);
    }finally{__CLR4_4_1blablalb90p7xd.R.flushNeeded();}}

    /**
     * Create a proper formatting instance with a custom number format for the
     * whole, numerator, and denominator.
     * @param format the custom format for the whole, numerator, and
     *        denominator.
     */
    public ProperBigFractionFormat(final NumberFormat format) {
        this(format, (NumberFormat)format.clone(), (NumberFormat)format.clone());__CLR4_4_1blablalb90p7xd.R.inc(15025);try{__CLR4_4_1blablalb90p7xd.R.inc(15024);
    }finally{__CLR4_4_1blablalb90p7xd.R.flushNeeded();}}

    /**
     * Create a proper formatting instance with a custom number format for each
     * of the whole, numerator, and denominator.
     * @param wholeFormat the custom format for the whole.
     * @param numeratorFormat the custom format for the numerator.
     * @param denominatorFormat the custom format for the denominator.
     */
    public ProperBigFractionFormat(final NumberFormat wholeFormat,
                                   final NumberFormat numeratorFormat,
                                   final NumberFormat denominatorFormat) {
        super(numeratorFormat, denominatorFormat);__CLR4_4_1blablalb90p7xd.R.inc(15027);try{__CLR4_4_1blablalb90p7xd.R.inc(15026);
        __CLR4_4_1blablalb90p7xd.R.inc(15028);setWholeFormat(wholeFormat);
    }finally{__CLR4_4_1blablalb90p7xd.R.flushNeeded();}}

    /**
     * Formats a {@link BigFraction} object to produce a string.  The BigFraction
     * is output in proper format.
     *
     * @param fraction the object to format.
     * @param toAppendTo where the text is to be appended
     * @param pos On input: an alignment field, if desired. On output: the
     *            offsets of the alignment field
     * @return the value passed in as toAppendTo.
     */
    @Override
    public StringBuffer format(final BigFraction fraction,
                               final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_4_1blablalb90p7xd.R.inc(15029);

        __CLR4_4_1blablalb90p7xd.R.inc(15030);pos.setBeginIndex(0);
        __CLR4_4_1blablalb90p7xd.R.inc(15031);pos.setEndIndex(0);

        __CLR4_4_1blablalb90p7xd.R.inc(15032);BigInteger num = fraction.getNumerator();
        __CLR4_4_1blablalb90p7xd.R.inc(15033);BigInteger den = fraction.getDenominator();
        __CLR4_4_1blablalb90p7xd.R.inc(15034);BigInteger whole = num.divide(den);
        __CLR4_4_1blablalb90p7xd.R.inc(15035);num = num.remainder(den);

        __CLR4_4_1blablalb90p7xd.R.inc(15036);if ((((!BigInteger.ZERO.equals(whole))&&(__CLR4_4_1blablalb90p7xd.R.iget(15037)!=0|true))||(__CLR4_4_1blablalb90p7xd.R.iget(15038)==0&false))) {{
            __CLR4_4_1blablalb90p7xd.R.inc(15039);getWholeFormat().format(whole, toAppendTo, pos);
            __CLR4_4_1blablalb90p7xd.R.inc(15040);toAppendTo.append(' ');
            __CLR4_4_1blablalb90p7xd.R.inc(15041);if ((((num.compareTo(BigInteger.ZERO) < 0)&&(__CLR4_4_1blablalb90p7xd.R.iget(15042)!=0|true))||(__CLR4_4_1blablalb90p7xd.R.iget(15043)==0&false))) {{
                __CLR4_4_1blablalb90p7xd.R.inc(15044);num = num.negate();
            }
        }}
        }__CLR4_4_1blablalb90p7xd.R.inc(15045);getNumeratorFormat().format(num, toAppendTo, pos);
        __CLR4_4_1blablalb90p7xd.R.inc(15046);toAppendTo.append(" / ");
        __CLR4_4_1blablalb90p7xd.R.inc(15047);getDenominatorFormat().format(den, toAppendTo, pos);

        __CLR4_4_1blablalb90p7xd.R.inc(15048);return toAppendTo;
    }finally{__CLR4_4_1blablalb90p7xd.R.flushNeeded();}}

    /**
     * Access the whole format.
     * @return the whole format.
     */
    public NumberFormat getWholeFormat() {try{__CLR4_4_1blablalb90p7xd.R.inc(15049);
        __CLR4_4_1blablalb90p7xd.R.inc(15050);return wholeFormat;
    }finally{__CLR4_4_1blablalb90p7xd.R.flushNeeded();}}

    /**
     * Parses a string to produce a {@link BigFraction} object.  This method
     * expects the string to be formatted as a proper BigFraction.
     * <p>
     * Minus signs are only allowed in the whole number part - i.e.,
     * "-3 1/2" is legitimate and denotes -7/2, but "-3 -1/2" is invalid and
     * will result in a <code>ParseException</code>.</p>
     *
     * @param source the string to parse
     * @param pos input/ouput parsing parameter.
     * @return the parsed {@link BigFraction} object.
     */
    @Override
    public BigFraction parse(final String source, final ParsePosition pos) {try{__CLR4_4_1blablalb90p7xd.R.inc(15051);
        // try to parse improper BigFraction
        __CLR4_4_1blablalb90p7xd.R.inc(15052);BigFraction ret = super.parse(source, pos);
        __CLR4_4_1blablalb90p7xd.R.inc(15053);if ((((ret != null)&&(__CLR4_4_1blablalb90p7xd.R.iget(15054)!=0|true))||(__CLR4_4_1blablalb90p7xd.R.iget(15055)==0&false))) {{
            __CLR4_4_1blablalb90p7xd.R.inc(15056);return ret;
        }

        }__CLR4_4_1blablalb90p7xd.R.inc(15057);final int initialIndex = pos.getIndex();

        // parse whitespace
        __CLR4_4_1blablalb90p7xd.R.inc(15058);parseAndIgnoreWhitespace(source, pos);

        // parse whole
        __CLR4_4_1blablalb90p7xd.R.inc(15059);BigInteger whole = parseNextBigInteger(source, pos);
        __CLR4_4_1blablalb90p7xd.R.inc(15060);if ((((whole == null)&&(__CLR4_4_1blablalb90p7xd.R.iget(15061)!=0|true))||(__CLR4_4_1blablalb90p7xd.R.iget(15062)==0&false))) {{
            // invalid integer number
            // set index back to initial, error index should already be set
            // character examined.
            __CLR4_4_1blablalb90p7xd.R.inc(15063);pos.setIndex(initialIndex);
            __CLR4_4_1blablalb90p7xd.R.inc(15064);return null;
        }

        // parse whitespace
        }__CLR4_4_1blablalb90p7xd.R.inc(15065);parseAndIgnoreWhitespace(source, pos);

        // parse numerator
        __CLR4_4_1blablalb90p7xd.R.inc(15066);BigInteger num = parseNextBigInteger(source, pos);
        __CLR4_4_1blablalb90p7xd.R.inc(15067);if ((((num == null)&&(__CLR4_4_1blablalb90p7xd.R.iget(15068)!=0|true))||(__CLR4_4_1blablalb90p7xd.R.iget(15069)==0&false))) {{
            // invalid integer number
            // set index back to initial, error index should already be set
            // character examined.
            __CLR4_4_1blablalb90p7xd.R.inc(15070);pos.setIndex(initialIndex);
            __CLR4_4_1blablalb90p7xd.R.inc(15071);return null;
        }

        }__CLR4_4_1blablalb90p7xd.R.inc(15072);if ((((num.compareTo(BigInteger.ZERO) < 0)&&(__CLR4_4_1blablalb90p7xd.R.iget(15073)!=0|true))||(__CLR4_4_1blablalb90p7xd.R.iget(15074)==0&false))) {{
            // minus signs should be leading, invalid expression
            __CLR4_4_1blablalb90p7xd.R.inc(15075);pos.setIndex(initialIndex);
            __CLR4_4_1blablalb90p7xd.R.inc(15076);return null;
        }

        // parse '/'
        }__CLR4_4_1blablalb90p7xd.R.inc(15077);final int startIndex = pos.getIndex();
        __CLR4_4_1blablalb90p7xd.R.inc(15078);final char c = parseNextCharacter(source, pos);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1blablalb90p7xd.R.inc(15079);switch (c) {
        case 0 :if (!__CLB4_4_1_bool0) {__CLR4_4_1blablalb90p7xd.R.inc(15080);__CLB4_4_1_bool0=true;}
            // no '/'
            // return num as a BigFraction
            __CLR4_4_1blablalb90p7xd.R.inc(15081);return new BigFraction(num);
        case '/' :if (!__CLB4_4_1_bool0) {__CLR4_4_1blablalb90p7xd.R.inc(15082);__CLB4_4_1_bool0=true;}
            // found '/', continue parsing denominator
            __CLR4_4_1blablalb90p7xd.R.inc(15083);break;
        default :if (!__CLB4_4_1_bool0) {__CLR4_4_1blablalb90p7xd.R.inc(15084);__CLB4_4_1_bool0=true;}
            // invalid '/'
            // set index back to initial, error index should be the last
            // character examined.
            __CLR4_4_1blablalb90p7xd.R.inc(15085);pos.setIndex(initialIndex);
            __CLR4_4_1blablalb90p7xd.R.inc(15086);pos.setErrorIndex(startIndex);
            __CLR4_4_1blablalb90p7xd.R.inc(15087);return null;
        }

        // parse whitespace
        __CLR4_4_1blablalb90p7xd.R.inc(15088);parseAndIgnoreWhitespace(source, pos);

        // parse denominator
        __CLR4_4_1blablalb90p7xd.R.inc(15089);final BigInteger den = parseNextBigInteger(source, pos);
        __CLR4_4_1blablalb90p7xd.R.inc(15090);if ((((den == null)&&(__CLR4_4_1blablalb90p7xd.R.iget(15091)!=0|true))||(__CLR4_4_1blablalb90p7xd.R.iget(15092)==0&false))) {{
            // invalid integer number
            // set index back to initial, error index should already be set
            // character examined.
            __CLR4_4_1blablalb90p7xd.R.inc(15093);pos.setIndex(initialIndex);
            __CLR4_4_1blablalb90p7xd.R.inc(15094);return null;
        }

        }__CLR4_4_1blablalb90p7xd.R.inc(15095);if ((((den.compareTo(BigInteger.ZERO) < 0)&&(__CLR4_4_1blablalb90p7xd.R.iget(15096)!=0|true))||(__CLR4_4_1blablalb90p7xd.R.iget(15097)==0&false))) {{
            // minus signs must be leading, invalid
            __CLR4_4_1blablalb90p7xd.R.inc(15098);pos.setIndex(initialIndex);
            __CLR4_4_1blablalb90p7xd.R.inc(15099);return null;
        }

        }__CLR4_4_1blablalb90p7xd.R.inc(15100);boolean wholeIsNeg = whole.compareTo(BigInteger.ZERO) < 0;
        __CLR4_4_1blablalb90p7xd.R.inc(15101);if ((((wholeIsNeg)&&(__CLR4_4_1blablalb90p7xd.R.iget(15102)!=0|true))||(__CLR4_4_1blablalb90p7xd.R.iget(15103)==0&false))) {{
            __CLR4_4_1blablalb90p7xd.R.inc(15104);whole = whole.negate();
        }
        }__CLR4_4_1blablalb90p7xd.R.inc(15105);num = whole.multiply(den).add(num);
        __CLR4_4_1blablalb90p7xd.R.inc(15106);if ((((wholeIsNeg)&&(__CLR4_4_1blablalb90p7xd.R.iget(15107)!=0|true))||(__CLR4_4_1blablalb90p7xd.R.iget(15108)==0&false))) {{
            __CLR4_4_1blablalb90p7xd.R.inc(15109);num = num.negate();
        }

        }__CLR4_4_1blablalb90p7xd.R.inc(15110);return new BigFraction(num, den);

    }finally{__CLR4_4_1blablalb90p7xd.R.flushNeeded();}}

    /**
     * Modify the whole format.
     * @param format The new whole format value.
     * @throws NullArgumentException if {@code format} is {@code null}.
     */
    public void setWholeFormat(final NumberFormat format) {try{__CLR4_4_1blablalb90p7xd.R.inc(15111);
        __CLR4_4_1blablalb90p7xd.R.inc(15112);if ((((format == null)&&(__CLR4_4_1blablalb90p7xd.R.iget(15113)!=0|true))||(__CLR4_4_1blablalb90p7xd.R.iget(15114)==0&false))) {{
            __CLR4_4_1blablalb90p7xd.R.inc(15115);throw new NullArgumentException(LocalizedFormats.WHOLE_FORMAT);
        }
        }__CLR4_4_1blablalb90p7xd.R.inc(15116);this.wholeFormat = format;
    }finally{__CLR4_4_1blablalb90p7xd.R.flushNeeded();}}
}
