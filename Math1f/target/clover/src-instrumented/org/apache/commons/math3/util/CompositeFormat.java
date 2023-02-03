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

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

/**
 * Base class for formatters of composite objects (complex numbers, vectors ...).
 *
 * @version $Id$
 */
public class CompositeFormat {public static class __CLR4_4_117k717k7lb90pava{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,56535,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Class contains only static methods.
     */
    private CompositeFormat() {try{__CLR4_4_117k717k7lb90pava.R.inc(56455);}finally{__CLR4_4_117k717k7lb90pava.R.flushNeeded();}}

    /**
     * Create a default number format.  The default number format is based on
     * {@link NumberFormat#getInstance()} with the only customizing that the
     * maximum number of fraction digits is set to 10.
     * @return the default number format.
     */
    public static NumberFormat getDefaultNumberFormat() {try{__CLR4_4_117k717k7lb90pava.R.inc(56456);
        __CLR4_4_117k717k7lb90pava.R.inc(56457);return getDefaultNumberFormat(Locale.getDefault());
    }finally{__CLR4_4_117k717k7lb90pava.R.flushNeeded();}}

    /**
     * Create a default number format.  The default number format is based on
     * {@link NumberFormat#getInstance(java.util.Locale)} with the only
     * customizing that the maximum number of fraction digits is set to 10.
     * @param locale the specific locale used by the format.
     * @return the default number format specific to the given locale.
     */
    public static NumberFormat getDefaultNumberFormat(final Locale locale) {try{__CLR4_4_117k717k7lb90pava.R.inc(56458);
        __CLR4_4_117k717k7lb90pava.R.inc(56459);final NumberFormat nf = NumberFormat.getInstance(locale);
        __CLR4_4_117k717k7lb90pava.R.inc(56460);nf.setMaximumFractionDigits(10);
        __CLR4_4_117k717k7lb90pava.R.inc(56461);return nf;
    }finally{__CLR4_4_117k717k7lb90pava.R.flushNeeded();}}

    /**
     * Parses <code>source</code> until a non-whitespace character is found.
     *
     * @param source the string to parse
     * @param pos input/output parsing parameter.  On output, <code>pos</code>
     *        holds the index of the next non-whitespace character.
     */
    public static void parseAndIgnoreWhitespace(final String source,
                                                final ParsePosition pos) {try{__CLR4_4_117k717k7lb90pava.R.inc(56462);
        __CLR4_4_117k717k7lb90pava.R.inc(56463);parseNextCharacter(source, pos);
        __CLR4_4_117k717k7lb90pava.R.inc(56464);pos.setIndex(pos.getIndex() - 1);
    }finally{__CLR4_4_117k717k7lb90pava.R.flushNeeded();}}

    /**
     * Parses <code>source</code> until a non-whitespace character is found.
     *
     * @param source the string to parse
     * @param pos input/output parsing parameter.
     * @return the first non-whitespace character.
     */
    public static char parseNextCharacter(final String source,
                                          final ParsePosition pos) {try{__CLR4_4_117k717k7lb90pava.R.inc(56465);
         __CLR4_4_117k717k7lb90pava.R.inc(56466);int index = pos.getIndex();
         __CLR4_4_117k717k7lb90pava.R.inc(56467);final int n = source.length();
         __CLR4_4_117k717k7lb90pava.R.inc(56468);char ret = 0;

         __CLR4_4_117k717k7lb90pava.R.inc(56469);if ((((index < n)&&(__CLR4_4_117k717k7lb90pava.R.iget(56470)!=0|true))||(__CLR4_4_117k717k7lb90pava.R.iget(56471)==0&false))) {{
             __CLR4_4_117k717k7lb90pava.R.inc(56472);char c;
             __CLR4_4_117k717k7lb90pava.R.inc(56473);do {{
                 __CLR4_4_117k717k7lb90pava.R.inc(56474);c = source.charAt(index++);
             } }while ((((Character.isWhitespace(c) && index < n)&&(__CLR4_4_117k717k7lb90pava.R.iget(56475)!=0|true))||(__CLR4_4_117k717k7lb90pava.R.iget(56476)==0&false)));
             __CLR4_4_117k717k7lb90pava.R.inc(56477);pos.setIndex(index);

             __CLR4_4_117k717k7lb90pava.R.inc(56478);if ((((index < n)&&(__CLR4_4_117k717k7lb90pava.R.iget(56479)!=0|true))||(__CLR4_4_117k717k7lb90pava.R.iget(56480)==0&false))) {{
                 __CLR4_4_117k717k7lb90pava.R.inc(56481);ret = c;
             }
         }}

         }__CLR4_4_117k717k7lb90pava.R.inc(56482);return ret;
    }finally{__CLR4_4_117k717k7lb90pava.R.flushNeeded();}}

    /**
     * Parses <code>source</code> for special double values.  These values
     * include Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.
     *
     * @param source the string to parse
     * @param value the special value to parse.
     * @param pos input/output parsing parameter.
     * @return the special number.
     */
    private static Number parseNumber(final String source, final double value,
                                      final ParsePosition pos) {try{__CLR4_4_117k717k7lb90pava.R.inc(56483);
        __CLR4_4_117k717k7lb90pava.R.inc(56484);Number ret = null;

        __CLR4_4_117k717k7lb90pava.R.inc(56485);StringBuilder sb = new StringBuilder();
        __CLR4_4_117k717k7lb90pava.R.inc(56486);sb.append('(');
        __CLR4_4_117k717k7lb90pava.R.inc(56487);sb.append(value);
        __CLR4_4_117k717k7lb90pava.R.inc(56488);sb.append(')');

        __CLR4_4_117k717k7lb90pava.R.inc(56489);final int n = sb.length();
        __CLR4_4_117k717k7lb90pava.R.inc(56490);final int startIndex = pos.getIndex();
        __CLR4_4_117k717k7lb90pava.R.inc(56491);final int endIndex = startIndex + n;
        __CLR4_4_117k717k7lb90pava.R.inc(56492);if ((((endIndex < source.length() &&
            source.substring(startIndex, endIndex).compareTo(sb.toString()) == 0)&&(__CLR4_4_117k717k7lb90pava.R.iget(56493)!=0|true))||(__CLR4_4_117k717k7lb90pava.R.iget(56494)==0&false))) {{
            __CLR4_4_117k717k7lb90pava.R.inc(56495);ret = Double.valueOf(value);
            __CLR4_4_117k717k7lb90pava.R.inc(56496);pos.setIndex(endIndex);
        }

        }__CLR4_4_117k717k7lb90pava.R.inc(56497);return ret;
    }finally{__CLR4_4_117k717k7lb90pava.R.flushNeeded();}}

    /**
     * Parses <code>source</code> for a number.  This method can parse normal,
     * numeric values as well as special values.  These special values include
     * Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.
     *
     * @param source the string to parse
     * @param format the number format used to parse normal, numeric values.
     * @param pos input/output parsing parameter.
     * @return the parsed number.
     */
    public static Number parseNumber(final String source, final NumberFormat format,
                                     final ParsePosition pos) {try{__CLR4_4_117k717k7lb90pava.R.inc(56498);
        __CLR4_4_117k717k7lb90pava.R.inc(56499);final int startIndex = pos.getIndex();
        __CLR4_4_117k717k7lb90pava.R.inc(56500);Number number = format.parse(source, pos);
        __CLR4_4_117k717k7lb90pava.R.inc(56501);final int endIndex = pos.getIndex();

        // check for error parsing number
        __CLR4_4_117k717k7lb90pava.R.inc(56502);if ((((startIndex == endIndex)&&(__CLR4_4_117k717k7lb90pava.R.iget(56503)!=0|true))||(__CLR4_4_117k717k7lb90pava.R.iget(56504)==0&false))) {{
            // try parsing special numbers
            __CLR4_4_117k717k7lb90pava.R.inc(56505);final double[] special = {
                Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY
            };
            __CLR4_4_117k717k7lb90pava.R.inc(56506);for (int i = 0; (((i < special.length)&&(__CLR4_4_117k717k7lb90pava.R.iget(56507)!=0|true))||(__CLR4_4_117k717k7lb90pava.R.iget(56508)==0&false)); ++i) {{
                __CLR4_4_117k717k7lb90pava.R.inc(56509);number = parseNumber(source, special[i], pos);
                __CLR4_4_117k717k7lb90pava.R.inc(56510);if ((((number != null)&&(__CLR4_4_117k717k7lb90pava.R.iget(56511)!=0|true))||(__CLR4_4_117k717k7lb90pava.R.iget(56512)==0&false))) {{
                    __CLR4_4_117k717k7lb90pava.R.inc(56513);break;
                }
            }}
        }}

        }__CLR4_4_117k717k7lb90pava.R.inc(56514);return number;
    }finally{__CLR4_4_117k717k7lb90pava.R.flushNeeded();}}

    /**
     * Parse <code>source</code> for an expected fixed string.
     * @param source the string to parse
     * @param expected expected string
     * @param pos input/output parsing parameter.
     * @return true if the expected string was there
     */
    public static boolean parseFixedstring(final String source,
                                           final String expected,
                                           final ParsePosition pos) {try{__CLR4_4_117k717k7lb90pava.R.inc(56515);

        __CLR4_4_117k717k7lb90pava.R.inc(56516);final int startIndex = pos.getIndex();
        __CLR4_4_117k717k7lb90pava.R.inc(56517);final int endIndex = startIndex + expected.length();
        __CLR4_4_117k717k7lb90pava.R.inc(56518);if (((((startIndex >= source.length()) ||
            (endIndex > source.length()) ||
            (source.substring(startIndex, endIndex).compareTo(expected) != 0))&&(__CLR4_4_117k717k7lb90pava.R.iget(56519)!=0|true))||(__CLR4_4_117k717k7lb90pava.R.iget(56520)==0&false))) {{
            // set index back to start, error index should be the start index
            __CLR4_4_117k717k7lb90pava.R.inc(56521);pos.setIndex(startIndex);
            __CLR4_4_117k717k7lb90pava.R.inc(56522);pos.setErrorIndex(startIndex);
            __CLR4_4_117k717k7lb90pava.R.inc(56523);return false;
        }

        // the string was here
        }__CLR4_4_117k717k7lb90pava.R.inc(56524);pos.setIndex(endIndex);
        __CLR4_4_117k717k7lb90pava.R.inc(56525);return true;
    }finally{__CLR4_4_117k717k7lb90pava.R.flushNeeded();}}

    /**
     * Formats a double value to produce a string.  In general, the value is
     * formatted using the formatting rules of <code>format</code>.  There are
     * three exceptions to this:
     * <ol>
     * <li>NaN is formatted as '(NaN)'</li>
     * <li>Positive infinity is formatted as '(Infinity)'</li>
     * <li>Negative infinity is formatted as '(-Infinity)'</li>
     * </ol>
     *
     * @param value the double to format.
     * @param format the format used.
     * @param toAppendTo where the text is to be appended
     * @param pos On input: an alignment field, if desired. On output: the
     *            offsets of the alignment field
     * @return the value passed in as toAppendTo.
     */
    public static StringBuffer formatDouble(final double value, final NumberFormat format,
                                            final StringBuffer toAppendTo,
                                            final FieldPosition pos) {try{__CLR4_4_117k717k7lb90pava.R.inc(56526);
        __CLR4_4_117k717k7lb90pava.R.inc(56527);if( (((Double.isNaN(value) || Double.isInfinite(value) )&&(__CLR4_4_117k717k7lb90pava.R.iget(56528)!=0|true))||(__CLR4_4_117k717k7lb90pava.R.iget(56529)==0&false))) {{
            __CLR4_4_117k717k7lb90pava.R.inc(56530);toAppendTo.append('(');
            __CLR4_4_117k717k7lb90pava.R.inc(56531);toAppendTo.append(value);
            __CLR4_4_117k717k7lb90pava.R.inc(56532);toAppendTo.append(')');
        } }else {{
            __CLR4_4_117k717k7lb90pava.R.inc(56533);format.format(value, toAppendTo, pos);
        }
        }__CLR4_4_117k717k7lb90pava.R.inc(56534);return toAppendTo;
    }finally{__CLR4_4_117k717k7lb90pava.R.flushNeeded();}}
}
