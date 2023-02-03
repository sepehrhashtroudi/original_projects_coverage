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

package org.apache.commons.math3.complex;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathParseException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.CompositeFormat;

/**
 * Formats a Complex number in cartesian format "Re(c) + Im(c)i".  'i' can
 * be replaced with 'j' (or anything else), and the number format for both real
 * and imaginary parts can be configured.
 *
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ComplexFormat {public static class __CLR4_4_153c53clb90p78q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,6756,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

     /** The default imaginary character. */
    private static final String DEFAULT_IMAGINARY_CHARACTER = "i";
    /** The notation used to signify the imaginary part of the complex number. */
    private final String imaginaryCharacter;
    /** The format used for the imaginary part. */
    private final NumberFormat imaginaryFormat;
    /** The format used for the real part. */
    private final NumberFormat realFormat;

    /**
     * Create an instance with the default imaginary character, 'i', and the
     * default number format for both real and imaginary parts.
     */
    public ComplexFormat() {try{__CLR4_4_153c53clb90p78q.R.inc(6600);
        __CLR4_4_153c53clb90p78q.R.inc(6601);this.imaginaryCharacter = DEFAULT_IMAGINARY_CHARACTER;
        __CLR4_4_153c53clb90p78q.R.inc(6602);this.imaginaryFormat = CompositeFormat.getDefaultNumberFormat();
        __CLR4_4_153c53clb90p78q.R.inc(6603);this.realFormat = imaginaryFormat;
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Create an instance with a custom number format for both real and
     * imaginary parts.
     * @param format the custom format for both real and imaginary parts.
     * @throws NullArgumentException if {@code realFormat} is {@code null}.
     */
    public ComplexFormat(NumberFormat format) throws NullArgumentException {try{__CLR4_4_153c53clb90p78q.R.inc(6604);
        __CLR4_4_153c53clb90p78q.R.inc(6605);if ((((format == null)&&(__CLR4_4_153c53clb90p78q.R.iget(6606)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6607)==0&false))) {{
            __CLR4_4_153c53clb90p78q.R.inc(6608);throw new NullArgumentException(LocalizedFormats.IMAGINARY_FORMAT);
        }
        }__CLR4_4_153c53clb90p78q.R.inc(6609);this.imaginaryCharacter = DEFAULT_IMAGINARY_CHARACTER;
        __CLR4_4_153c53clb90p78q.R.inc(6610);this.imaginaryFormat = format;
        __CLR4_4_153c53clb90p78q.R.inc(6611);this.realFormat = format;
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Create an instance with a custom number format for the real part and a
     * custom number format for the imaginary part.
     * @param realFormat the custom format for the real part.
     * @param imaginaryFormat the custom format for the imaginary part.
     * @throws NullArgumentException if {@code imaginaryFormat} is {@code null}.
     * @throws NullArgumentException if {@code realFormat} is {@code null}.
      */
    public ComplexFormat(NumberFormat realFormat, NumberFormat imaginaryFormat)
        throws NullArgumentException {try{__CLR4_4_153c53clb90p78q.R.inc(6612);
        __CLR4_4_153c53clb90p78q.R.inc(6613);if ((((imaginaryFormat == null)&&(__CLR4_4_153c53clb90p78q.R.iget(6614)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6615)==0&false))) {{
            __CLR4_4_153c53clb90p78q.R.inc(6616);throw new NullArgumentException(LocalizedFormats.IMAGINARY_FORMAT);
        }
        }__CLR4_4_153c53clb90p78q.R.inc(6617);if ((((realFormat == null)&&(__CLR4_4_153c53clb90p78q.R.iget(6618)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6619)==0&false))) {{
            __CLR4_4_153c53clb90p78q.R.inc(6620);throw new NullArgumentException(LocalizedFormats.REAL_FORMAT);
        }

        }__CLR4_4_153c53clb90p78q.R.inc(6621);this.imaginaryCharacter = DEFAULT_IMAGINARY_CHARACTER;
        __CLR4_4_153c53clb90p78q.R.inc(6622);this.imaginaryFormat = imaginaryFormat;
        __CLR4_4_153c53clb90p78q.R.inc(6623);this.realFormat = realFormat;
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Create an instance with a custom imaginary character, and the default
     * number format for both real and imaginary parts.
     * @param imaginaryCharacter The custom imaginary character.
     * @throws NullArgumentException if {@code imaginaryCharacter} is
     * {@code null}.
     * @throws NoDataException if {@code imaginaryCharacter} is an
     * empty string.
     */
    public ComplexFormat(String imaginaryCharacter)
        throws NullArgumentException, NoDataException {
        this(imaginaryCharacter, CompositeFormat.getDefaultNumberFormat());__CLR4_4_153c53clb90p78q.R.inc(6625);try{__CLR4_4_153c53clb90p78q.R.inc(6624);
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Create an instance with a custom imaginary character, and a custom number
     * format for both real and imaginary parts.
     * @param imaginaryCharacter The custom imaginary character.
     * @param format the custom format for both real and imaginary parts.
     * @throws NullArgumentException if {@code imaginaryCharacter} is
     * {@code null}.
     * @throws NoDataException if {@code imaginaryCharacter} is an
     * empty string.
     * @throws NullArgumentException if {@code format} is {@code null}.
     */
    public ComplexFormat(String imaginaryCharacter, NumberFormat format)
        throws NullArgumentException, NoDataException {
        this(imaginaryCharacter, format, format);__CLR4_4_153c53clb90p78q.R.inc(6627);try{__CLR4_4_153c53clb90p78q.R.inc(6626);
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Create an instance with a custom imaginary character, a custom number
     * format for the real part, and a custom number format for the imaginary
     * part.
     *
     * @param imaginaryCharacter The custom imaginary character.
     * @param realFormat the custom format for the real part.
     * @param imaginaryFormat the custom format for the imaginary part.
     * @throws NullArgumentException if {@code imaginaryCharacter} is
     * {@code null}.
     * @throws NoDataException if {@code imaginaryCharacter} is an
     * empty string.
     * @throws NullArgumentException if {@code imaginaryFormat} is {@code null}.
     * @throws NullArgumentException if {@code realFormat} is {@code null}.
     */
    public ComplexFormat(String imaginaryCharacter,
                         NumberFormat realFormat,
                         NumberFormat imaginaryFormat)
        throws NullArgumentException, NoDataException {try{__CLR4_4_153c53clb90p78q.R.inc(6628);
        __CLR4_4_153c53clb90p78q.R.inc(6629);if ((((imaginaryCharacter == null)&&(__CLR4_4_153c53clb90p78q.R.iget(6630)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6631)==0&false))) {{
            __CLR4_4_153c53clb90p78q.R.inc(6632);throw new NullArgumentException();
        }
        }__CLR4_4_153c53clb90p78q.R.inc(6633);if ((((imaginaryCharacter.length() == 0)&&(__CLR4_4_153c53clb90p78q.R.iget(6634)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6635)==0&false))) {{
            __CLR4_4_153c53clb90p78q.R.inc(6636);throw new NoDataException();
        }
        }__CLR4_4_153c53clb90p78q.R.inc(6637);if ((((imaginaryFormat == null)&&(__CLR4_4_153c53clb90p78q.R.iget(6638)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6639)==0&false))) {{
            __CLR4_4_153c53clb90p78q.R.inc(6640);throw new NullArgumentException(LocalizedFormats.IMAGINARY_FORMAT);
        }
        }__CLR4_4_153c53clb90p78q.R.inc(6641);if ((((realFormat == null)&&(__CLR4_4_153c53clb90p78q.R.iget(6642)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6643)==0&false))) {{
            __CLR4_4_153c53clb90p78q.R.inc(6644);throw new NullArgumentException(LocalizedFormats.REAL_FORMAT);
        }

        }__CLR4_4_153c53clb90p78q.R.inc(6645);this.imaginaryCharacter = imaginaryCharacter;
        __CLR4_4_153c53clb90p78q.R.inc(6646);this.imaginaryFormat = imaginaryFormat;
        __CLR4_4_153c53clb90p78q.R.inc(6647);this.realFormat = realFormat;
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Get the set of locales for which complex formats are available.
     * <p>This is the same set as the {@link NumberFormat} set.</p>
     * @return available complex format locales.
     */
    public static Locale[] getAvailableLocales() {try{__CLR4_4_153c53clb90p78q.R.inc(6648);
        __CLR4_4_153c53clb90p78q.R.inc(6649);return NumberFormat.getAvailableLocales();
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * This method calls {@link #format(Object,StringBuffer,FieldPosition)}.
     *
     * @param c Complex object to format.
     * @return A formatted number in the form "Re(c) + Im(c)i".
     */
    public String format(Complex c) {try{__CLR4_4_153c53clb90p78q.R.inc(6650);
        __CLR4_4_153c53clb90p78q.R.inc(6651);return format(c, new StringBuffer(), new FieldPosition(0)).toString();
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * This method calls {@link #format(Object,StringBuffer,FieldPosition)}.
     *
     * @param c Double object to format.
     * @return A formatted number.
     */
    public String format(Double c) {try{__CLR4_4_153c53clb90p78q.R.inc(6652);
        __CLR4_4_153c53clb90p78q.R.inc(6653);return format(new Complex(c, 0), new StringBuffer(), new FieldPosition(0)).toString();
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Formats a {@link Complex} object to produce a string.
     *
     * @param complex the object to format.
     * @param toAppendTo where the text is to be appended
     * @param pos On input: an alignment field, if desired. On output: the
     *            offsets of the alignment field
     * @return the value passed in as toAppendTo.
     */
    public StringBuffer format(Complex complex, StringBuffer toAppendTo,
                               FieldPosition pos) {try{__CLR4_4_153c53clb90p78q.R.inc(6654);
        __CLR4_4_153c53clb90p78q.R.inc(6655);pos.setBeginIndex(0);
        __CLR4_4_153c53clb90p78q.R.inc(6656);pos.setEndIndex(0);

        // format real
        __CLR4_4_153c53clb90p78q.R.inc(6657);double re = complex.getReal();
        __CLR4_4_153c53clb90p78q.R.inc(6658);CompositeFormat.formatDouble(re, getRealFormat(), toAppendTo, pos);

        // format sign and imaginary
        __CLR4_4_153c53clb90p78q.R.inc(6659);double im = complex.getImaginary();
        __CLR4_4_153c53clb90p78q.R.inc(6660);StringBuffer imAppendTo;
        __CLR4_4_153c53clb90p78q.R.inc(6661);if ((((im < 0.0)&&(__CLR4_4_153c53clb90p78q.R.iget(6662)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6663)==0&false))) {{
            __CLR4_4_153c53clb90p78q.R.inc(6664);toAppendTo.append(" - ");
            __CLR4_4_153c53clb90p78q.R.inc(6665);imAppendTo = formatImaginary(-im, new StringBuffer(), pos);
            __CLR4_4_153c53clb90p78q.R.inc(6666);toAppendTo.append(imAppendTo);
            __CLR4_4_153c53clb90p78q.R.inc(6667);toAppendTo.append(getImaginaryCharacter());
        } }else {__CLR4_4_153c53clb90p78q.R.inc(6668);if ((((im > 0.0 || Double.isNaN(im))&&(__CLR4_4_153c53clb90p78q.R.iget(6669)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6670)==0&false))) {{
            __CLR4_4_153c53clb90p78q.R.inc(6671);toAppendTo.append(" + ");
            __CLR4_4_153c53clb90p78q.R.inc(6672);imAppendTo = formatImaginary(im, new StringBuffer(), pos);
            __CLR4_4_153c53clb90p78q.R.inc(6673);toAppendTo.append(imAppendTo);
            __CLR4_4_153c53clb90p78q.R.inc(6674);toAppendTo.append(getImaginaryCharacter());
        }

        }}__CLR4_4_153c53clb90p78q.R.inc(6675);return toAppendTo;
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Format the absolute value of the imaginary part.
     *
     * @param absIm Absolute value of the imaginary part of a complex number.
     * @param toAppendTo where the text is to be appended.
     * @param pos On input: an alignment field, if desired. On output: the
     * offsets of the alignment field.
     * @return the value passed in as toAppendTo.
     */
    private StringBuffer formatImaginary(double absIm,
                                         StringBuffer toAppendTo,
                                         FieldPosition pos) {try{__CLR4_4_153c53clb90p78q.R.inc(6676);
        __CLR4_4_153c53clb90p78q.R.inc(6677);pos.setBeginIndex(0);
        __CLR4_4_153c53clb90p78q.R.inc(6678);pos.setEndIndex(0);

        __CLR4_4_153c53clb90p78q.R.inc(6679);CompositeFormat.formatDouble(absIm, getImaginaryFormat(), toAppendTo, pos);
        __CLR4_4_153c53clb90p78q.R.inc(6680);if ((((toAppendTo.toString().equals("1"))&&(__CLR4_4_153c53clb90p78q.R.iget(6681)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6682)==0&false))) {{
            // Remove the character "1" if it is the only one.
            __CLR4_4_153c53clb90p78q.R.inc(6683);toAppendTo.setLength(0);
        }

        }__CLR4_4_153c53clb90p78q.R.inc(6684);return toAppendTo;
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Formats a object to produce a string.  {@code obj} must be either a
     * {@link Complex} object or a {@link Number} object.  Any other type of
     * object will result in an {@link IllegalArgumentException} being thrown.
     *
     * @param obj the object to format.
     * @param toAppendTo where the text is to be appended
     * @param pos On input: an alignment field, if desired. On output: the
     *            offsets of the alignment field
     * @return the value passed in as toAppendTo.
     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)
     * @throws MathIllegalArgumentException is {@code obj} is not a valid type.
     */
    public StringBuffer format(Object obj, StringBuffer toAppendTo,
                               FieldPosition pos)
        throws MathIllegalArgumentException {try{__CLR4_4_153c53clb90p78q.R.inc(6685);

        __CLR4_4_153c53clb90p78q.R.inc(6686);StringBuffer ret = null;

        __CLR4_4_153c53clb90p78q.R.inc(6687);if ((((obj instanceof Complex)&&(__CLR4_4_153c53clb90p78q.R.iget(6688)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6689)==0&false))) {{
            __CLR4_4_153c53clb90p78q.R.inc(6690);ret = format( (Complex)obj, toAppendTo, pos);
        } }else {__CLR4_4_153c53clb90p78q.R.inc(6691);if ((((obj instanceof Number)&&(__CLR4_4_153c53clb90p78q.R.iget(6692)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6693)==0&false))) {{
            __CLR4_4_153c53clb90p78q.R.inc(6694);ret = format(new Complex(((Number)obj).doubleValue(), 0.0),
                         toAppendTo, pos);
        } }else {{
            __CLR4_4_153c53clb90p78q.R.inc(6695);throw new MathIllegalArgumentException(LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_COMPLEX,
                                                   obj.getClass().getName());
        }

        }}__CLR4_4_153c53clb90p78q.R.inc(6696);return ret;
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Access the imaginaryCharacter.
     * @return the imaginaryCharacter.
     */
    public String getImaginaryCharacter() {try{__CLR4_4_153c53clb90p78q.R.inc(6697);
        __CLR4_4_153c53clb90p78q.R.inc(6698);return imaginaryCharacter;
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Access the imaginaryFormat.
     * @return the imaginaryFormat.
     */
    public NumberFormat getImaginaryFormat() {try{__CLR4_4_153c53clb90p78q.R.inc(6699);
        __CLR4_4_153c53clb90p78q.R.inc(6700);return imaginaryFormat;
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Returns the default complex format for the current locale.
     * @return the default complex format.
     */
    public static ComplexFormat getInstance() {try{__CLR4_4_153c53clb90p78q.R.inc(6701);
        __CLR4_4_153c53clb90p78q.R.inc(6702);return getInstance(Locale.getDefault());
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Returns the default complex format for the given locale.
     * @param locale the specific locale used by the format.
     * @return the complex format specific to the given locale.
     */
    public static ComplexFormat getInstance(Locale locale) {try{__CLR4_4_153c53clb90p78q.R.inc(6703);
        __CLR4_4_153c53clb90p78q.R.inc(6704);NumberFormat f = CompositeFormat.getDefaultNumberFormat(locale);
        __CLR4_4_153c53clb90p78q.R.inc(6705);return new ComplexFormat(f);
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Returns the default complex format for the given locale.
     * @param locale the specific locale used by the format.
     * @param imaginaryCharacter Imaginary character.
     * @return the complex format specific to the given locale.
     * @throws NullArgumentException if {@code imaginaryCharacter} is
     * {@code null}.
     * @throws NoDataException if {@code imaginaryCharacter} is an
     * empty string.
     */
    public static ComplexFormat getInstance(String imaginaryCharacter, Locale locale)
        throws NullArgumentException, NoDataException {try{__CLR4_4_153c53clb90p78q.R.inc(6706);
        __CLR4_4_153c53clb90p78q.R.inc(6707);NumberFormat f = CompositeFormat.getDefaultNumberFormat(locale);
        __CLR4_4_153c53clb90p78q.R.inc(6708);return new ComplexFormat(imaginaryCharacter, f);
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Access the realFormat.
     * @return the realFormat.
     */
    public NumberFormat getRealFormat() {try{__CLR4_4_153c53clb90p78q.R.inc(6709);
        __CLR4_4_153c53clb90p78q.R.inc(6710);return realFormat;
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Parses a string to produce a {@link Complex} object.
     *
     * @param source the string to parse.
     * @return the parsed {@link Complex} object.
     * @throws MathParseException if the beginning of the specified string
     * cannot be parsed.
     */
    public Complex parse(String source) throws MathParseException {try{__CLR4_4_153c53clb90p78q.R.inc(6711);
        __CLR4_4_153c53clb90p78q.R.inc(6712);ParsePosition parsePosition = new ParsePosition(0);
        __CLR4_4_153c53clb90p78q.R.inc(6713);Complex result = parse(source, parsePosition);
        __CLR4_4_153c53clb90p78q.R.inc(6714);if ((((parsePosition.getIndex() == 0)&&(__CLR4_4_153c53clb90p78q.R.iget(6715)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6716)==0&false))) {{
            __CLR4_4_153c53clb90p78q.R.inc(6717);throw new MathParseException(source,
                                         parsePosition.getErrorIndex(),
                                         Complex.class);
        }
        }__CLR4_4_153c53clb90p78q.R.inc(6718);return result;
    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}

    /**
     * Parses a string to produce a {@link Complex} object.
     *
     * @param source the string to parse
     * @param pos input/ouput parsing parameter.
     * @return the parsed {@link Complex} object.
     */
    public Complex parse(String source, ParsePosition pos) {try{__CLR4_4_153c53clb90p78q.R.inc(6719);
        __CLR4_4_153c53clb90p78q.R.inc(6720);int initialIndex = pos.getIndex();

        // parse whitespace
        __CLR4_4_153c53clb90p78q.R.inc(6721);CompositeFormat.parseAndIgnoreWhitespace(source, pos);

        // parse real
        __CLR4_4_153c53clb90p78q.R.inc(6722);Number re = CompositeFormat.parseNumber(source, getRealFormat(), pos);
        __CLR4_4_153c53clb90p78q.R.inc(6723);if ((((re == null)&&(__CLR4_4_153c53clb90p78q.R.iget(6724)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6725)==0&false))) {{
            // invalid real number
            // set index back to initial, error index should already be set
            __CLR4_4_153c53clb90p78q.R.inc(6726);pos.setIndex(initialIndex);
            __CLR4_4_153c53clb90p78q.R.inc(6727);return null;
        }

        // parse sign
        }__CLR4_4_153c53clb90p78q.R.inc(6728);int startIndex = pos.getIndex();
        __CLR4_4_153c53clb90p78q.R.inc(6729);char c = CompositeFormat.parseNextCharacter(source, pos);
        __CLR4_4_153c53clb90p78q.R.inc(6730);int sign = 0;
        boolean __CLB4_4_1_bool0=false;__CLR4_4_153c53clb90p78q.R.inc(6731);switch (c) {
        case 0 :if (!__CLB4_4_1_bool0) {__CLR4_4_153c53clb90p78q.R.inc(6732);__CLB4_4_1_bool0=true;}
            // no sign
            // return real only complex number
            __CLR4_4_153c53clb90p78q.R.inc(6733);return new Complex(re.doubleValue(), 0.0);
        case '-' :if (!__CLB4_4_1_bool0) {__CLR4_4_153c53clb90p78q.R.inc(6734);__CLB4_4_1_bool0=true;}
            __CLR4_4_153c53clb90p78q.R.inc(6735);sign = -1;
            __CLR4_4_153c53clb90p78q.R.inc(6736);break;
        case '+' :if (!__CLB4_4_1_bool0) {__CLR4_4_153c53clb90p78q.R.inc(6737);__CLB4_4_1_bool0=true;}
            __CLR4_4_153c53clb90p78q.R.inc(6738);sign = 1;
            __CLR4_4_153c53clb90p78q.R.inc(6739);break;
        default :if (!__CLB4_4_1_bool0) {__CLR4_4_153c53clb90p78q.R.inc(6740);__CLB4_4_1_bool0=true;}
            // invalid sign
            // set index back to initial, error index should be the last
            // character examined.
            __CLR4_4_153c53clb90p78q.R.inc(6741);pos.setIndex(initialIndex);
            __CLR4_4_153c53clb90p78q.R.inc(6742);pos.setErrorIndex(startIndex);
            __CLR4_4_153c53clb90p78q.R.inc(6743);return null;
        }

        // parse whitespace
        __CLR4_4_153c53clb90p78q.R.inc(6744);CompositeFormat.parseAndIgnoreWhitespace(source, pos);

        // parse imaginary
        __CLR4_4_153c53clb90p78q.R.inc(6745);Number im = CompositeFormat.parseNumber(source, getRealFormat(), pos);
        __CLR4_4_153c53clb90p78q.R.inc(6746);if ((((im == null)&&(__CLR4_4_153c53clb90p78q.R.iget(6747)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6748)==0&false))) {{
            // invalid imaginary number
            // set index back to initial, error index should already be set
            __CLR4_4_153c53clb90p78q.R.inc(6749);pos.setIndex(initialIndex);
            __CLR4_4_153c53clb90p78q.R.inc(6750);return null;
        }

        // parse imaginary character
        }__CLR4_4_153c53clb90p78q.R.inc(6751);if ((((!CompositeFormat.parseFixedstring(source, getImaginaryCharacter(), pos))&&(__CLR4_4_153c53clb90p78q.R.iget(6752)!=0|true))||(__CLR4_4_153c53clb90p78q.R.iget(6753)==0&false))) {{
            __CLR4_4_153c53clb90p78q.R.inc(6754);return null;
        }

        }__CLR4_4_153c53clb90p78q.R.inc(6755);return new Complex(re.doubleValue(), im.doubleValue() * sign);

    }finally{__CLR4_4_153c53clb90p78q.R.flushNeeded();}}
}
