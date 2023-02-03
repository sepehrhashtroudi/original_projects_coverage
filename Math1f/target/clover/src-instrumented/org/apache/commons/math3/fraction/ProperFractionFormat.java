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

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.MathUtils;

/**
 * Formats a Fraction number in proper format.  The number format for each of
 * the whole number, numerator and, denominator can be configured.
 * <p>
 * Minus signs are only allowed in the whole number part - i.e.,
 * "-3 1/2" is legitimate and denotes -7/2, but "-3 -1/2" is invalid and
 * will result in a <code>ParseException</code>.</p>
 *
 * @since 1.1
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ProperFractionFormat extends FractionFormat {public static class __CLR4_4_1bnxbnxlb90p7xn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15202,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 760934726031766749L;

    /** The format used for the whole number. */
    private NumberFormat wholeFormat;

    /**
     * Create a proper formatting instance with the default number format for
     * the whole, numerator, and denominator.
     */
    public ProperFractionFormat() {
        this(getDefaultNumberFormat());__CLR4_4_1bnxbnxlb90p7xn.R.inc(15118);try{__CLR4_4_1bnxbnxlb90p7xn.R.inc(15117);
    }finally{__CLR4_4_1bnxbnxlb90p7xn.R.flushNeeded();}}

    /**
     * Create a proper formatting instance with a custom number format for the
     * whole, numerator, and denominator.
     * @param format the custom format for the whole, numerator, and
     *        denominator.
     */
    public ProperFractionFormat(NumberFormat format) {
        this(format, (NumberFormat)format.clone(), (NumberFormat)format.clone());__CLR4_4_1bnxbnxlb90p7xn.R.inc(15120);try{__CLR4_4_1bnxbnxlb90p7xn.R.inc(15119);
    }finally{__CLR4_4_1bnxbnxlb90p7xn.R.flushNeeded();}}

    /**
     * Create a proper formatting instance with a custom number format for each
     * of the whole, numerator, and denominator.
     * @param wholeFormat the custom format for the whole.
     * @param numeratorFormat the custom format for the numerator.
     * @param denominatorFormat the custom format for the denominator.
     */
    public ProperFractionFormat(NumberFormat wholeFormat,
            NumberFormat numeratorFormat,
            NumberFormat denominatorFormat)
    {
        super(numeratorFormat, denominatorFormat);__CLR4_4_1bnxbnxlb90p7xn.R.inc(15122);try{__CLR4_4_1bnxbnxlb90p7xn.R.inc(15121);
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15123);setWholeFormat(wholeFormat);
    }finally{__CLR4_4_1bnxbnxlb90p7xn.R.flushNeeded();}}

    /**
     * Formats a {@link Fraction} object to produce a string.  The fraction
     * is output in proper format.
     *
     * @param fraction the object to format.
     * @param toAppendTo where the text is to be appended
     * @param pos On input: an alignment field, if desired. On output: the
     *            offsets of the alignment field
     * @return the value passed in as toAppendTo.
     */
    @Override
    public StringBuffer format(Fraction fraction, StringBuffer toAppendTo,
            FieldPosition pos) {try{__CLR4_4_1bnxbnxlb90p7xn.R.inc(15124);

        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15125);pos.setBeginIndex(0);
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15126);pos.setEndIndex(0);

        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15127);int num = fraction.getNumerator();
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15128);int den = fraction.getDenominator();
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15129);int whole = num / den;
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15130);num = num % den;

        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15131);if ((((whole != 0)&&(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15132)!=0|true))||(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15133)==0&false))) {{
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15134);getWholeFormat().format(whole, toAppendTo, pos);
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15135);toAppendTo.append(' ');
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15136);num = Math.abs(num);
        }
        }__CLR4_4_1bnxbnxlb90p7xn.R.inc(15137);getNumeratorFormat().format(num, toAppendTo, pos);
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15138);toAppendTo.append(" / ");
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15139);getDenominatorFormat().format(den, toAppendTo,
            pos);

        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15140);return toAppendTo;
    }finally{__CLR4_4_1bnxbnxlb90p7xn.R.flushNeeded();}}

    /**
     * Access the whole format.
     * @return the whole format.
     */
    public NumberFormat getWholeFormat() {try{__CLR4_4_1bnxbnxlb90p7xn.R.inc(15141);
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15142);return wholeFormat;
    }finally{__CLR4_4_1bnxbnxlb90p7xn.R.flushNeeded();}}

    /**
     * Parses a string to produce a {@link Fraction} object.  This method
     * expects the string to be formatted as a proper fraction.
     * <p>
     * Minus signs are only allowed in the whole number part - i.e.,
     * "-3 1/2" is legitimate and denotes -7/2, but "-3 -1/2" is invalid and
     * will result in a <code>ParseException</code>.</p>
     *
     * @param source the string to parse
     * @param pos input/ouput parsing parameter.
     * @return the parsed {@link Fraction} object.
     */
    @Override
    public Fraction parse(String source, ParsePosition pos) {try{__CLR4_4_1bnxbnxlb90p7xn.R.inc(15143);
        // try to parse improper fraction
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15144);Fraction ret = super.parse(source, pos);
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15145);if ((((ret != null)&&(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15146)!=0|true))||(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15147)==0&false))) {{
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15148);return ret;
        }

        }__CLR4_4_1bnxbnxlb90p7xn.R.inc(15149);int initialIndex = pos.getIndex();

        // parse whitespace
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15150);parseAndIgnoreWhitespace(source, pos);

        // parse whole
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15151);Number whole = getWholeFormat().parse(source, pos);
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15152);if ((((whole == null)&&(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15153)!=0|true))||(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15154)==0&false))) {{
            // invalid integer number
            // set index back to initial, error index should already be set
            // character examined.
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15155);pos.setIndex(initialIndex);
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15156);return null;
        }

        // parse whitespace
        }__CLR4_4_1bnxbnxlb90p7xn.R.inc(15157);parseAndIgnoreWhitespace(source, pos);

        // parse numerator
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15158);Number num = getNumeratorFormat().parse(source, pos);
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15159);if ((((num == null)&&(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15160)!=0|true))||(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15161)==0&false))) {{
            // invalid integer number
            // set index back to initial, error index should already be set
            // character examined.
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15162);pos.setIndex(initialIndex);
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15163);return null;
        }

        }__CLR4_4_1bnxbnxlb90p7xn.R.inc(15164);if ((((num.intValue() < 0)&&(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15165)!=0|true))||(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15166)==0&false))) {{
            // minus signs should be leading, invalid expression
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15167);pos.setIndex(initialIndex);
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15168);return null;
        }

        // parse '/'
        }__CLR4_4_1bnxbnxlb90p7xn.R.inc(15169);int startIndex = pos.getIndex();
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15170);char c = parseNextCharacter(source, pos);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1bnxbnxlb90p7xn.R.inc(15171);switch (c) {
        case 0 :if (!__CLB4_4_1_bool0) {__CLR4_4_1bnxbnxlb90p7xn.R.inc(15172);__CLB4_4_1_bool0=true;}
            // no '/'
            // return num as a fraction
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15173);return new Fraction(num.intValue(), 1);
        case '/' :if (!__CLB4_4_1_bool0) {__CLR4_4_1bnxbnxlb90p7xn.R.inc(15174);__CLB4_4_1_bool0=true;}
            // found '/', continue parsing denominator
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15175);break;
        default :if (!__CLB4_4_1_bool0) {__CLR4_4_1bnxbnxlb90p7xn.R.inc(15176);__CLB4_4_1_bool0=true;}
            // invalid '/'
            // set index back to initial, error index should be the last
            // character examined.
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15177);pos.setIndex(initialIndex);
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15178);pos.setErrorIndex(startIndex);
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15179);return null;
        }

        // parse whitespace
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15180);parseAndIgnoreWhitespace(source, pos);

        // parse denominator
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15181);Number den = getDenominatorFormat().parse(source, pos);
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15182);if ((((den == null)&&(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15183)!=0|true))||(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15184)==0&false))) {{
            // invalid integer number
            // set index back to initial, error index should already be set
            // character examined.
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15185);pos.setIndex(initialIndex);
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15186);return null;
        }

        }__CLR4_4_1bnxbnxlb90p7xn.R.inc(15187);if ((((den.intValue() < 0)&&(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15188)!=0|true))||(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15189)==0&false))) {{
            // minus signs must be leading, invalid
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15190);pos.setIndex(initialIndex);
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15191);return null;
        }

        }__CLR4_4_1bnxbnxlb90p7xn.R.inc(15192);int w = whole.intValue();
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15193);int n = num.intValue();
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15194);int d = den.intValue();
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15195);return new Fraction(((Math.abs(w) * d) + n) * MathUtils.copySign(1, w), d);
    }finally{__CLR4_4_1bnxbnxlb90p7xn.R.flushNeeded();}}

    /**
     * Modify the whole format.
     * @param format The new whole format value.
     * @throws NullArgumentException if {@code format} is {@code null}.
     */
    public void setWholeFormat(NumberFormat format) {try{__CLR4_4_1bnxbnxlb90p7xn.R.inc(15196);
        __CLR4_4_1bnxbnxlb90p7xn.R.inc(15197);if ((((format == null)&&(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15198)!=0|true))||(__CLR4_4_1bnxbnxlb90p7xn.R.iget(15199)==0&false))) {{
            __CLR4_4_1bnxbnxlb90p7xn.R.inc(15200);throw new NullArgumentException(LocalizedFormats.WHOLE_FORMAT);
        }
        }__CLR4_4_1bnxbnxlb90p7xn.R.inc(15201);this.wholeFormat = format;
    }finally{__CLR4_4_1bnxbnxlb90p7xn.R.flushNeeded();}}
}
