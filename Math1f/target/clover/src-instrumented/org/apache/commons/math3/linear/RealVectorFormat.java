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

package org.apache.commons.math3.linear;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.math3.exception.MathParseException;
import org.apache.commons.math3.util.CompositeFormat;

/**
 * Formats a vector in components list format "{v0; v1; ...; vk-1}".
 * <p>The prefix and suffix "{" and "}" and the separator "; " can be replaced by
 * any user-defined strings. The number format for components can be configured.</p>
 * <p>White space is ignored at parse time, even if it is in the prefix, suffix
 * or separator specifications. So even if the default separator does include a space
 * character that is used at format time, both input string "{1;1;1}" and
 * " { 1 ; 1 ; 1 } " will be parsed without error and the same vector will be
 * returned. In the second case, however, the parse position after parsing will be
 * just after the closing curly brace, i.e. just before the trailing space.</p>
 *
 * @version $Id$
 * @since 2.0
 */
public class RealVectorFormat {public static class __CLR4_4_1mq4mq4lb90p92s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,29545,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The default prefix: "{". */
    private static final String DEFAULT_PREFIX = "{";
    /** The default suffix: "}". */
    private static final String DEFAULT_SUFFIX = "}";
    /** The default separator: ", ". */
    private static final String DEFAULT_SEPARATOR = "; ";
    /** Prefix. */
    private final String prefix;
    /** Suffix. */
    private final String suffix;
    /** Separator. */
    private final String separator;
    /** Trimmed prefix. */
    private final String trimmedPrefix;
    /** Trimmed suffix. */
    private final String trimmedSuffix;
    /** Trimmed separator. */
    private final String trimmedSeparator;
    /** The format used for components. */
    private final NumberFormat format;

    /**
     * Create an instance with default settings.
     * <p>The instance uses the default prefix, suffix and separator:
     * "{", "}", and "; " and the default number format for components.</p>
     */
    public RealVectorFormat() {
        this(DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_SEPARATOR,
             CompositeFormat.getDefaultNumberFormat());__CLR4_4_1mq4mq4lb90p92s.R.inc(29453);try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29452);
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * Create an instance with a custom number format for components.
     * @param format the custom format for components.
     */
    public RealVectorFormat(final NumberFormat format) {
        this(DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_SEPARATOR, format);__CLR4_4_1mq4mq4lb90p92s.R.inc(29455);try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29454);
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * Create an instance with custom prefix, suffix and separator.
     * @param prefix prefix to use instead of the default "{"
     * @param suffix suffix to use instead of the default "}"
     * @param separator separator to use instead of the default "; "
     */
    public RealVectorFormat(final String prefix, final String suffix,
                            final String separator) {
        this(prefix, suffix, separator,
             CompositeFormat.getDefaultNumberFormat());__CLR4_4_1mq4mq4lb90p92s.R.inc(29457);try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29456);
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * Create an instance with custom prefix, suffix, separator and format
     * for components.
     * @param prefix prefix to use instead of the default "{"
     * @param suffix suffix to use instead of the default "}"
     * @param separator separator to use instead of the default "; "
     * @param format the custom format for components.
     */
    public RealVectorFormat(final String prefix, final String suffix,
                            final String separator, final NumberFormat format) {try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29458);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29459);this.prefix      = prefix;
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29460);this.suffix      = suffix;
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29461);this.separator   = separator;
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29462);trimmedPrefix    = prefix.trim();
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29463);trimmedSuffix    = suffix.trim();
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29464);trimmedSeparator = separator.trim();
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29465);this.format      = format;
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * Get the set of locales for which real vectors formats are available.
     * <p>This is the same set as the {@link NumberFormat} set.</p>
     * @return available real vector format locales.
     */
    public static Locale[] getAvailableLocales() {try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29466);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29467);return NumberFormat.getAvailableLocales();
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * Get the format prefix.
     * @return format prefix.
     */
    public String getPrefix() {try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29468);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29469);return prefix;
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * Get the format suffix.
     * @return format suffix.
     */
    public String getSuffix() {try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29470);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29471);return suffix;
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * Get the format separator between components.
     * @return format separator.
     */
    public String getSeparator() {try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29472);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29473);return separator;
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * Get the components format.
     * @return components format.
     */
    public NumberFormat getFormat() {try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29474);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29475);return format;
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * Returns the default real vector format for the current locale.
     * @return the default real vector format.
     */
    public static RealVectorFormat getInstance() {try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29476);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29477);return getInstance(Locale.getDefault());
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * Returns the default real vector format for the given locale.
     * @param locale the specific locale used by the format.
     * @return the real vector format specific to the given locale.
     */
    public static RealVectorFormat getInstance(final Locale locale) {try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29478);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29479);return new RealVectorFormat(CompositeFormat.getDefaultNumberFormat(locale));
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * This method calls {@link #format(RealVector,StringBuffer,FieldPosition)}.
     *
     * @param v RealVector object to format.
     * @return a formatted vector.
     */
    public String format(RealVector v) {try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29480);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29481);return format(v, new StringBuffer(), new FieldPosition(0)).toString();
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * Formats a {@link RealVector} object to produce a string.
     * @param vector the object to format.
     * @param toAppendTo where the text is to be appended
     * @param pos On input: an alignment field, if desired. On output: the
     *            offsets of the alignment field
     * @return the value passed in as toAppendTo.
     */
    public StringBuffer format(RealVector vector, StringBuffer toAppendTo,
                               FieldPosition pos) {try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29482);

        __CLR4_4_1mq4mq4lb90p92s.R.inc(29483);pos.setBeginIndex(0);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29484);pos.setEndIndex(0);

        // format prefix
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29485);toAppendTo.append(prefix);

        // format components
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29486);for (int i = 0; (((i < vector.getDimension())&&(__CLR4_4_1mq4mq4lb90p92s.R.iget(29487)!=0|true))||(__CLR4_4_1mq4mq4lb90p92s.R.iget(29488)==0&false)); ++i) {{
            __CLR4_4_1mq4mq4lb90p92s.R.inc(29489);if ((((i > 0)&&(__CLR4_4_1mq4mq4lb90p92s.R.iget(29490)!=0|true))||(__CLR4_4_1mq4mq4lb90p92s.R.iget(29491)==0&false))) {{
                __CLR4_4_1mq4mq4lb90p92s.R.inc(29492);toAppendTo.append(separator);
            }
            }__CLR4_4_1mq4mq4lb90p92s.R.inc(29493);CompositeFormat.formatDouble(vector.getEntry(i), format, toAppendTo, pos);
        }

        // format suffix
        }__CLR4_4_1mq4mq4lb90p92s.R.inc(29494);toAppendTo.append(suffix);

        __CLR4_4_1mq4mq4lb90p92s.R.inc(29495);return toAppendTo;
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * Parse a string to produce a {@link RealVector} object.
     *
     * @param source String to parse.
     * @return the parsed {@link RealVector} object.
     * @throws MathParseException if the beginning of the specified string
     * cannot be parsed.
     */
    public ArrayRealVector parse(String source) {try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29496);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29497);final ParsePosition parsePosition = new ParsePosition(0);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29498);final ArrayRealVector result = parse(source, parsePosition);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29499);if ((((parsePosition.getIndex() == 0)&&(__CLR4_4_1mq4mq4lb90p92s.R.iget(29500)!=0|true))||(__CLR4_4_1mq4mq4lb90p92s.R.iget(29501)==0&false))) {{
            __CLR4_4_1mq4mq4lb90p92s.R.inc(29502);throw new MathParseException(source,
                                         parsePosition.getErrorIndex(),
                                         ArrayRealVector.class);
        }
        }__CLR4_4_1mq4mq4lb90p92s.R.inc(29503);return result;
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}

    /**
     * Parse a string to produce a {@link RealVector} object.
     *
     * @param source String to parse.
     * @param pos input/ouput parsing parameter.
     * @return the parsed {@link RealVector} object.
     */
    public ArrayRealVector parse(String source, ParsePosition pos) {try{__CLR4_4_1mq4mq4lb90p92s.R.inc(29504);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29505);int initialIndex = pos.getIndex();

        // parse prefix
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29506);CompositeFormat.parseAndIgnoreWhitespace(source, pos);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29507);if ((((!CompositeFormat.parseFixedstring(source, trimmedPrefix, pos))&&(__CLR4_4_1mq4mq4lb90p92s.R.iget(29508)!=0|true))||(__CLR4_4_1mq4mq4lb90p92s.R.iget(29509)==0&false))) {{
            __CLR4_4_1mq4mq4lb90p92s.R.inc(29510);return null;
        }

        // parse components
        }__CLR4_4_1mq4mq4lb90p92s.R.inc(29511);List<Number> components = new ArrayList<Number>();
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29512);for (boolean loop = true; (((loop)&&(__CLR4_4_1mq4mq4lb90p92s.R.iget(29513)!=0|true))||(__CLR4_4_1mq4mq4lb90p92s.R.iget(29514)==0&false));){{

            __CLR4_4_1mq4mq4lb90p92s.R.inc(29515);if ((((!components.isEmpty())&&(__CLR4_4_1mq4mq4lb90p92s.R.iget(29516)!=0|true))||(__CLR4_4_1mq4mq4lb90p92s.R.iget(29517)==0&false))) {{
                __CLR4_4_1mq4mq4lb90p92s.R.inc(29518);CompositeFormat.parseAndIgnoreWhitespace(source, pos);
                __CLR4_4_1mq4mq4lb90p92s.R.inc(29519);if ((((!CompositeFormat.parseFixedstring(source, trimmedSeparator, pos))&&(__CLR4_4_1mq4mq4lb90p92s.R.iget(29520)!=0|true))||(__CLR4_4_1mq4mq4lb90p92s.R.iget(29521)==0&false))) {{
                    __CLR4_4_1mq4mq4lb90p92s.R.inc(29522);loop = false;
                }
            }}

            }__CLR4_4_1mq4mq4lb90p92s.R.inc(29523);if ((((loop)&&(__CLR4_4_1mq4mq4lb90p92s.R.iget(29524)!=0|true))||(__CLR4_4_1mq4mq4lb90p92s.R.iget(29525)==0&false))) {{
                __CLR4_4_1mq4mq4lb90p92s.R.inc(29526);CompositeFormat.parseAndIgnoreWhitespace(source, pos);
                __CLR4_4_1mq4mq4lb90p92s.R.inc(29527);Number component = CompositeFormat.parseNumber(source, format, pos);
                __CLR4_4_1mq4mq4lb90p92s.R.inc(29528);if ((((component != null)&&(__CLR4_4_1mq4mq4lb90p92s.R.iget(29529)!=0|true))||(__CLR4_4_1mq4mq4lb90p92s.R.iget(29530)==0&false))) {{
                    __CLR4_4_1mq4mq4lb90p92s.R.inc(29531);components.add(component);
                } }else {{
                    // invalid component
                    // set index back to initial, error index should already be set
                    __CLR4_4_1mq4mq4lb90p92s.R.inc(29532);pos.setIndex(initialIndex);
                    __CLR4_4_1mq4mq4lb90p92s.R.inc(29533);return null;
                }
            }}

        }}

        // parse suffix
        }__CLR4_4_1mq4mq4lb90p92s.R.inc(29534);CompositeFormat.parseAndIgnoreWhitespace(source, pos);
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29535);if ((((!CompositeFormat.parseFixedstring(source, trimmedSuffix, pos))&&(__CLR4_4_1mq4mq4lb90p92s.R.iget(29536)!=0|true))||(__CLR4_4_1mq4mq4lb90p92s.R.iget(29537)==0&false))) {{
            __CLR4_4_1mq4mq4lb90p92s.R.inc(29538);return null;
        }

        // build vector
        }__CLR4_4_1mq4mq4lb90p92s.R.inc(29539);double[] data = new double[components.size()];
        __CLR4_4_1mq4mq4lb90p92s.R.inc(29540);for (int i = 0; (((i < data.length)&&(__CLR4_4_1mq4mq4lb90p92s.R.iget(29541)!=0|true))||(__CLR4_4_1mq4mq4lb90p92s.R.iget(29542)==0&false)); ++i) {{
            __CLR4_4_1mq4mq4lb90p92s.R.inc(29543);data[i] = components.get(i).doubleValue();
        }
        }__CLR4_4_1mq4mq4lb90p92s.R.inc(29544);return new ArrayRealVector(data, false);
    }finally{__CLR4_4_1mq4mq4lb90p92s.R.flushNeeded();}}
}
