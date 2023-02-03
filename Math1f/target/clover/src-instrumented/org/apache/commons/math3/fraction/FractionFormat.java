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
import java.util.Locale;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathParseException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Formats a Fraction number in proper format or improper format.  The number
 * format for each of the whole number, numerator and, denominator can be
 * configured.
 *
 * @since 1.1
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class FractionFormat extends AbstractFormat {public static class __CLR4_4_1bj8bj8lb90p7x2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15022,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 3008655719530972611L;

    /**
     * Create an improper formatting instance with the default number format
     * for the numerator and denominator.
     */
    public FractionFormat() {try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14948);
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

    /**
     * Create an improper formatting instance with a custom number format for
     * both the numerator and denominator.
     * @param format the custom format for both the numerator and denominator.
     */
    public FractionFormat(final NumberFormat format) {
        super(format);__CLR4_4_1bj8bj8lb90p7x2.R.inc(14950);try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14949);
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

    /**
     * Create an improper formatting instance with a custom number format for
     * the numerator and a custom number format for the denominator.
     * @param numeratorFormat the custom format for the numerator.
     * @param denominatorFormat the custom format for the denominator.
     */
    public FractionFormat(final NumberFormat numeratorFormat,
                          final NumberFormat denominatorFormat) {
        super(numeratorFormat, denominatorFormat);__CLR4_4_1bj8bj8lb90p7x2.R.inc(14952);try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14951);
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

    /**
     * Get the set of locales for which complex formats are available.  This
     * is the same set as the {@link NumberFormat} set.
     * @return available complex format locales.
     */
    public static Locale[] getAvailableLocales() {try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14953);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14954);return NumberFormat.getAvailableLocales();
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

    /**
     * This static method calls formatFraction() on a default instance of
     * FractionFormat.
     *
     * @param f Fraction object to format
     * @return a formatted fraction in proper form.
     */
    public static String formatFraction(Fraction f) {try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14955);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14956);return getImproperInstance().format(f);
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

    /**
     * Returns the default complex format for the current locale.
     * @return the default complex format.
     */
    public static FractionFormat getImproperInstance() {try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14957);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14958);return getImproperInstance(Locale.getDefault());
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

    /**
     * Returns the default complex format for the given locale.
     * @param locale the specific locale used by the format.
     * @return the complex format specific to the given locale.
     */
    public static FractionFormat getImproperInstance(final Locale locale) {try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14959);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14960);return new FractionFormat(getDefaultNumberFormat(locale));
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

    /**
     * Returns the default complex format for the current locale.
     * @return the default complex format.
     */
    public static FractionFormat getProperInstance() {try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14961);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14962);return getProperInstance(Locale.getDefault());
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

    /**
     * Returns the default complex format for the given locale.
     * @param locale the specific locale used by the format.
     * @return the complex format specific to the given locale.
     */
    public static FractionFormat getProperInstance(final Locale locale) {try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14963);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14964);return new ProperFractionFormat(getDefaultNumberFormat(locale));
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

    /**
     * Create a default number format.  The default number format is based on
     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only
     * customizing is the maximum number of fraction digits, which is set to 0.
     * @return the default number format.
     */
    protected static NumberFormat getDefaultNumberFormat() {try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14965);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14966);return getDefaultNumberFormat(Locale.getDefault());
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

    /**
     * Formats a {@link Fraction} object to produce a string.  The fraction is
     * output in improper format.
     *
     * @param fraction the object to format.
     * @param toAppendTo where the text is to be appended
     * @param pos On input: an alignment field, if desired. On output: the
     *            offsets of the alignment field
     * @return the value passed in as toAppendTo.
     */
    public StringBuffer format(final Fraction fraction,
                               final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14967);

        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14968);pos.setBeginIndex(0);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14969);pos.setEndIndex(0);

        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14970);getNumeratorFormat().format(fraction.getNumerator(), toAppendTo, pos);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14971);toAppendTo.append(" / ");
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14972);getDenominatorFormat().format(fraction.getDenominator(), toAppendTo,
            pos);

        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14973);return toAppendTo;
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

    /**
     * Formats an object and appends the result to a StringBuffer. <code>obj</code> must be either a
     * {@link Fraction} object or a {@link Number} object.  Any other type of
     * object will result in an {@link IllegalArgumentException} being thrown.
     *
     * @param obj the object to format.
     * @param toAppendTo where the text is to be appended
     * @param pos On input: an alignment field, if desired. On output: the
     *            offsets of the alignment field
     * @return the value passed in as toAppendTo.
     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)
     * @throws FractionConversionException if the number cannot be converted to a fraction
     * @throws MathIllegalArgumentException if <code>obj</code> is not a valid type.
     */
    @Override
    public StringBuffer format(final Object obj,
                               final StringBuffer toAppendTo, final FieldPosition pos)
        throws FractionConversionException, MathIllegalArgumentException {try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14974);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14975);StringBuffer ret = null;

        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14976);if ((((obj instanceof Fraction)&&(__CLR4_4_1bj8bj8lb90p7x2.R.iget(14977)!=0|true))||(__CLR4_4_1bj8bj8lb90p7x2.R.iget(14978)==0&false))) {{
            __CLR4_4_1bj8bj8lb90p7x2.R.inc(14979);ret = format((Fraction) obj, toAppendTo, pos);
        } }else {__CLR4_4_1bj8bj8lb90p7x2.R.inc(14980);if ((((obj instanceof Number)&&(__CLR4_4_1bj8bj8lb90p7x2.R.iget(14981)!=0|true))||(__CLR4_4_1bj8bj8lb90p7x2.R.iget(14982)==0&false))) {{
            __CLR4_4_1bj8bj8lb90p7x2.R.inc(14983);ret = format(new Fraction(((Number) obj).doubleValue()), toAppendTo, pos);
        } }else {{
            __CLR4_4_1bj8bj8lb90p7x2.R.inc(14984);throw new MathIllegalArgumentException(LocalizedFormats.CANNOT_FORMAT_OBJECT_TO_FRACTION);
        }

        }}__CLR4_4_1bj8bj8lb90p7x2.R.inc(14985);return ret;
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

    /**
     * Parses a string to produce a {@link Fraction} object.
     * @param source the string to parse
     * @return the parsed {@link Fraction} object.
     * @exception MathParseException if the beginning of the specified string
     *            cannot be parsed.
     */
    @Override
    public Fraction parse(final String source) throws MathParseException {try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14986);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14987);final ParsePosition parsePosition = new ParsePosition(0);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14988);final Fraction result = parse(source, parsePosition);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14989);if ((((parsePosition.getIndex() == 0)&&(__CLR4_4_1bj8bj8lb90p7x2.R.iget(14990)!=0|true))||(__CLR4_4_1bj8bj8lb90p7x2.R.iget(14991)==0&false))) {{
            __CLR4_4_1bj8bj8lb90p7x2.R.inc(14992);throw new MathParseException(source, parsePosition.getErrorIndex(), Fraction.class);
        }
        }__CLR4_4_1bj8bj8lb90p7x2.R.inc(14993);return result;
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

    /**
     * Parses a string to produce a {@link Fraction} object.  This method
     * expects the string to be formatted as an improper fraction.
     * @param source the string to parse
     * @param pos input/output parsing parameter.
     * @return the parsed {@link Fraction} object.
     */
    @Override
    public Fraction parse(final String source, final ParsePosition pos) {try{__CLR4_4_1bj8bj8lb90p7x2.R.inc(14994);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14995);final int initialIndex = pos.getIndex();

        // parse whitespace
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14996);parseAndIgnoreWhitespace(source, pos);

        // parse numerator
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14997);final Number num = getNumeratorFormat().parse(source, pos);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(14998);if ((((num == null)&&(__CLR4_4_1bj8bj8lb90p7x2.R.iget(14999)!=0|true))||(__CLR4_4_1bj8bj8lb90p7x2.R.iget(15000)==0&false))) {{
            // invalid integer number
            // set index back to initial, error index should already be set
            // character examined.
            __CLR4_4_1bj8bj8lb90p7x2.R.inc(15001);pos.setIndex(initialIndex);
            __CLR4_4_1bj8bj8lb90p7x2.R.inc(15002);return null;
        }

        // parse '/'
        }__CLR4_4_1bj8bj8lb90p7x2.R.inc(15003);final int startIndex = pos.getIndex();
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(15004);final char c = parseNextCharacter(source, pos);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1bj8bj8lb90p7x2.R.inc(15005);switch (c) {
        case 0 :if (!__CLB4_4_1_bool0) {__CLR4_4_1bj8bj8lb90p7x2.R.inc(15006);__CLB4_4_1_bool0=true;}
            // no '/'
            // return num as a fraction
            __CLR4_4_1bj8bj8lb90p7x2.R.inc(15007);return new Fraction(num.intValue(), 1);
        case '/' :if (!__CLB4_4_1_bool0) {__CLR4_4_1bj8bj8lb90p7x2.R.inc(15008);__CLB4_4_1_bool0=true;}
            // found '/', continue parsing denominator
            __CLR4_4_1bj8bj8lb90p7x2.R.inc(15009);break;
        default :if (!__CLB4_4_1_bool0) {__CLR4_4_1bj8bj8lb90p7x2.R.inc(15010);__CLB4_4_1_bool0=true;}
            // invalid '/'
            // set index back to initial, error index should be the last
            // character examined.
            __CLR4_4_1bj8bj8lb90p7x2.R.inc(15011);pos.setIndex(initialIndex);
            __CLR4_4_1bj8bj8lb90p7x2.R.inc(15012);pos.setErrorIndex(startIndex);
            __CLR4_4_1bj8bj8lb90p7x2.R.inc(15013);return null;
        }

        // parse whitespace
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(15014);parseAndIgnoreWhitespace(source, pos);

        // parse denominator
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(15015);final Number den = getDenominatorFormat().parse(source, pos);
        __CLR4_4_1bj8bj8lb90p7x2.R.inc(15016);if ((((den == null)&&(__CLR4_4_1bj8bj8lb90p7x2.R.iget(15017)!=0|true))||(__CLR4_4_1bj8bj8lb90p7x2.R.iget(15018)==0&false))) {{
            // invalid integer number
            // set index back to initial, error index should already be set
            // character examined.
            __CLR4_4_1bj8bj8lb90p7x2.R.inc(15019);pos.setIndex(initialIndex);
            __CLR4_4_1bj8bj8lb90p7x2.R.inc(15020);return null;
        }

        }__CLR4_4_1bj8bj8lb90p7x2.R.inc(15021);return new Fraction(num.intValue(), den.intValue());
    }finally{__CLR4_4_1bj8bj8lb90p7x2.R.flushNeeded();}}

}
