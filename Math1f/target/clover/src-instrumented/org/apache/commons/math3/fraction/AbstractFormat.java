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

import java.io.Serializable;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Common part shared by both {@link FractionFormat} and {@link BigFractionFormat}.
 * @version $Id$
 * @since 2.0
 */
public abstract class AbstractFormat extends NumberFormat implements Serializable {public static class __CLR4_4_1axpaxplb90p7u4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,14228,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = -6981118387974191891L;

    /** The format used for the denominator. */
    private NumberFormat denominatorFormat;

    /** The format used for the numerator. */
    private NumberFormat numeratorFormat;

    /**
     * Create an improper formatting instance with the default number format
     * for the numerator and denominator.
     */
    protected AbstractFormat() {
        this(getDefaultNumberFormat());__CLR4_4_1axpaxplb90p7u4.R.inc(14174);try{__CLR4_4_1axpaxplb90p7u4.R.inc(14173);
    }finally{__CLR4_4_1axpaxplb90p7u4.R.flushNeeded();}}

    /**
     * Create an improper formatting instance with a custom number format for
     * both the numerator and denominator.
     * @param format the custom format for both the numerator and denominator.
     */
    protected AbstractFormat(final NumberFormat format) {
        this(format, (NumberFormat) format.clone());__CLR4_4_1axpaxplb90p7u4.R.inc(14176);try{__CLR4_4_1axpaxplb90p7u4.R.inc(14175);
    }finally{__CLR4_4_1axpaxplb90p7u4.R.flushNeeded();}}

    /**
     * Create an improper formatting instance with a custom number format for
     * the numerator and a custom number format for the denominator.
     * @param numeratorFormat the custom format for the numerator.
     * @param denominatorFormat the custom format for the denominator.
     */
    protected AbstractFormat(final NumberFormat numeratorFormat,
                             final NumberFormat denominatorFormat) {try{__CLR4_4_1axpaxplb90p7u4.R.inc(14177);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14178);this.numeratorFormat   = numeratorFormat;
        __CLR4_4_1axpaxplb90p7u4.R.inc(14179);this.denominatorFormat = denominatorFormat;
    }finally{__CLR4_4_1axpaxplb90p7u4.R.flushNeeded();}}

    /**
     * Create a default number format.  The default number format is based on
     * {@link NumberFormat#getNumberInstance(java.util.Locale)}. The only
     * customization is the maximum number of BigFraction digits, which is set to 0.
     * @return the default number format.
     */
    protected static NumberFormat getDefaultNumberFormat() {try{__CLR4_4_1axpaxplb90p7u4.R.inc(14180);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14181);return getDefaultNumberFormat(Locale.getDefault());
    }finally{__CLR4_4_1axpaxplb90p7u4.R.flushNeeded();}}

    /**
     * Create a default number format.  The default number format is based on
     * {@link NumberFormat#getNumberInstance(java.util.Locale)}. The only
     * customization is the maximum number of BigFraction digits, which is set to 0.
     * @param locale the specific locale used by the format.
     * @return the default number format specific to the given locale.
     */
    protected static NumberFormat getDefaultNumberFormat(final Locale locale) {try{__CLR4_4_1axpaxplb90p7u4.R.inc(14182);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14183);final NumberFormat nf = NumberFormat.getNumberInstance(locale);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14184);nf.setMaximumFractionDigits(0);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14185);nf.setParseIntegerOnly(true);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14186);return nf;
    }finally{__CLR4_4_1axpaxplb90p7u4.R.flushNeeded();}}

    /**
     * Access the denominator format.
     * @return the denominator format.
     */
    public NumberFormat getDenominatorFormat() {try{__CLR4_4_1axpaxplb90p7u4.R.inc(14187);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14188);return denominatorFormat;
    }finally{__CLR4_4_1axpaxplb90p7u4.R.flushNeeded();}}

    /**
     * Access the numerator format.
     * @return the numerator format.
     */
    public NumberFormat getNumeratorFormat() {try{__CLR4_4_1axpaxplb90p7u4.R.inc(14189);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14190);return numeratorFormat;
    }finally{__CLR4_4_1axpaxplb90p7u4.R.flushNeeded();}}

    /**
     * Modify the denominator format.
     * @param format the new denominator format value.
     * @throws NullArgumentException if {@code format} is {@code null}.
     */
    public void setDenominatorFormat(final NumberFormat format) {try{__CLR4_4_1axpaxplb90p7u4.R.inc(14191);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14192);if ((((format == null)&&(__CLR4_4_1axpaxplb90p7u4.R.iget(14193)!=0|true))||(__CLR4_4_1axpaxplb90p7u4.R.iget(14194)==0&false))) {{
            __CLR4_4_1axpaxplb90p7u4.R.inc(14195);throw new NullArgumentException(LocalizedFormats.DENOMINATOR_FORMAT);
        }
        }__CLR4_4_1axpaxplb90p7u4.R.inc(14196);this.denominatorFormat = format;
    }finally{__CLR4_4_1axpaxplb90p7u4.R.flushNeeded();}}

    /**
     * Modify the numerator format.
     * @param format the new numerator format value.
     * @throws NullArgumentException if {@code format} is {@code null}.
     */
    public void setNumeratorFormat(final NumberFormat format) {try{__CLR4_4_1axpaxplb90p7u4.R.inc(14197);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14198);if ((((format == null)&&(__CLR4_4_1axpaxplb90p7u4.R.iget(14199)!=0|true))||(__CLR4_4_1axpaxplb90p7u4.R.iget(14200)==0&false))) {{
            __CLR4_4_1axpaxplb90p7u4.R.inc(14201);throw new NullArgumentException(LocalizedFormats.NUMERATOR_FORMAT);
        }
        }__CLR4_4_1axpaxplb90p7u4.R.inc(14202);this.numeratorFormat = format;
    }finally{__CLR4_4_1axpaxplb90p7u4.R.flushNeeded();}}

    /**
     * Parses <code>source</code> until a non-whitespace character is found.
     * @param source the string to parse
     * @param pos input/output parsing parameter.  On output, <code>pos</code>
     *        holds the index of the next non-whitespace character.
     */
    protected static void parseAndIgnoreWhitespace(final String source,
                                                   final ParsePosition pos) {try{__CLR4_4_1axpaxplb90p7u4.R.inc(14203);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14204);parseNextCharacter(source, pos);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14205);pos.setIndex(pos.getIndex() - 1);
    }finally{__CLR4_4_1axpaxplb90p7u4.R.flushNeeded();}}

    /**
     * Parses <code>source</code> until a non-whitespace character is found.
     * @param source the string to parse
     * @param pos input/output parsing parameter.
     * @return the first non-whitespace character.
     */
    protected static char parseNextCharacter(final String source,
                                             final ParsePosition pos) {try{__CLR4_4_1axpaxplb90p7u4.R.inc(14206);
         __CLR4_4_1axpaxplb90p7u4.R.inc(14207);int index = pos.getIndex();
         __CLR4_4_1axpaxplb90p7u4.R.inc(14208);final int n = source.length();
         __CLR4_4_1axpaxplb90p7u4.R.inc(14209);char ret = 0;

         __CLR4_4_1axpaxplb90p7u4.R.inc(14210);if ((((index < n)&&(__CLR4_4_1axpaxplb90p7u4.R.iget(14211)!=0|true))||(__CLR4_4_1axpaxplb90p7u4.R.iget(14212)==0&false))) {{
             __CLR4_4_1axpaxplb90p7u4.R.inc(14213);char c;
             __CLR4_4_1axpaxplb90p7u4.R.inc(14214);do {{
                 __CLR4_4_1axpaxplb90p7u4.R.inc(14215);c = source.charAt(index++);
             } }while ((((Character.isWhitespace(c) && index < n)&&(__CLR4_4_1axpaxplb90p7u4.R.iget(14216)!=0|true))||(__CLR4_4_1axpaxplb90p7u4.R.iget(14217)==0&false)));
             __CLR4_4_1axpaxplb90p7u4.R.inc(14218);pos.setIndex(index);

             __CLR4_4_1axpaxplb90p7u4.R.inc(14219);if ((((index < n)&&(__CLR4_4_1axpaxplb90p7u4.R.iget(14220)!=0|true))||(__CLR4_4_1axpaxplb90p7u4.R.iget(14221)==0&false))) {{
                 __CLR4_4_1axpaxplb90p7u4.R.inc(14222);ret = c;
             }
         }}

         }__CLR4_4_1axpaxplb90p7u4.R.inc(14223);return ret;
    }finally{__CLR4_4_1axpaxplb90p7u4.R.flushNeeded();}}

    /**
     * Formats a double value as a fraction and appends the result to a StringBuffer.
     *
     * @param value the double value to format
     * @param buffer StringBuffer to append to
     * @param position On input: an alignment field, if desired. On output: the
     *            offsets of the alignment field
     * @return a reference to the appended buffer
     * @see #format(Object, StringBuffer, FieldPosition)
     */
    @Override
    public StringBuffer format(final double value,
                               final StringBuffer buffer, final FieldPosition position) {try{__CLR4_4_1axpaxplb90p7u4.R.inc(14224);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14225);return format(Double.valueOf(value), buffer, position);
    }finally{__CLR4_4_1axpaxplb90p7u4.R.flushNeeded();}}


    /**
     * Formats a long value as a fraction and appends the result to a StringBuffer.
     *
     * @param value the long value to format
     * @param buffer StringBuffer to append to
     * @param position On input: an alignment field, if desired. On output: the
     *            offsets of the alignment field
     * @return a reference to the appended buffer
     * @see #format(Object, StringBuffer, FieldPosition)
     */
    @Override
    public StringBuffer format(final long value,
                               final StringBuffer buffer, final FieldPosition position) {try{__CLR4_4_1axpaxplb90p7u4.R.inc(14226);
        __CLR4_4_1axpaxplb90p7u4.R.inc(14227);return format(Long.valueOf(value), buffer, position);
    }finally{__CLR4_4_1axpaxplb90p7u4.R.flushNeeded();}}

}
