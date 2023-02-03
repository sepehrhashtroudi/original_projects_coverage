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
 * Formats a {@code nxm} matrix in components list format
 * "{{a<sub>0</sub><sub>0</sub>,a<sub>0</sub><sub>1</sub>, ...,
 * a<sub>0</sub><sub>m-1</sub>},{a<sub>1</sub><sub>0</sub>,
 * a<sub>1</sub><sub>1</sub>, ..., a<sub>1</sub><sub>m-1</sub>},{...},{
 * a<sub>n-1</sub><sub>0</sub>, a<sub>n-1</sub><sub>1</sub>, ...,
 * a<sub>n-1</sub><sub>m-1</sub>}}".
 * <p>The prefix and suffix "{" and "}", the row prefix and suffix "{" and "}",
 * the row separator "," and the column separator "," can be replaced by any
 * user-defined strings. The number format for components can be configured.</p>
 *
 * <p>White space is ignored at parse time, even if it is in the prefix, suffix
 * or separator specifications. So even if the default separator does include a space
 * character that is used at format time, both input string "{{1,1,1}}" and
 * " { { 1 , 1 , 1 } } " will be parsed without error and the same matrix will be
 * returned. In the second case, however, the parse position after parsing will be
 * just after the closing curly brace, i.e. just before the trailing space.</p>
 *
 * <p><b>Note:</b> the grouping functionality of the used {@link NumberFormat} is
 * disabled to prevent problems when parsing (e.g. 1,345.34 would be a valid number
 * but conflicts with the default column separator).</p>
 *
 * @since 3.1
 * @version $Id$
 */
public class RealMatrixFormat {public static class __CLR4_4_1m8xm8xlb90p91d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,28983,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The default prefix: "{". */
    private static final String DEFAULT_PREFIX = "{";
    /** The default suffix: "}". */
    private static final String DEFAULT_SUFFIX = "}";
    /** The default row prefix: "{". */
    private static final String DEFAULT_ROW_PREFIX = "{";
    /** The default row suffix: "}". */
    private static final String DEFAULT_ROW_SUFFIX = "}";
    /** The default row separator: ",". */
    private static final String DEFAULT_ROW_SEPARATOR = ",";
    /** The default column separator: ",". */
    private static final String DEFAULT_COLUMN_SEPARATOR = ",";
    /** Prefix. */
    private final String prefix;
    /** Suffix. */
    private final String suffix;
    /** Row prefix. */
    private final String rowPrefix;
    /** Row suffix. */
    private final String rowSuffix;
    /** Row separator. */
    private final String rowSeparator;
    /** Column separator. */
    private final String columnSeparator;
    /** The format used for components. */
    private final NumberFormat format;

    /**
     * Create an instance with default settings.
     * <p>The instance uses the default prefix, suffix and row/column separator:
     * "[", "]", ";" and ", " and the default number format for components.</p>
     */
    public RealMatrixFormat() {
        this(DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ROW_PREFIX, DEFAULT_ROW_SUFFIX,
                DEFAULT_ROW_SEPARATOR, DEFAULT_COLUMN_SEPARATOR, CompositeFormat.getDefaultNumberFormat());__CLR4_4_1m8xm8xlb90p91d.R.inc(28834);try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28833);
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Create an instance with a custom number format for components.
     * @param format the custom format for components.
     */
    public RealMatrixFormat(final NumberFormat format) {
        this(DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ROW_PREFIX, DEFAULT_ROW_SUFFIX,
                DEFAULT_ROW_SEPARATOR, DEFAULT_COLUMN_SEPARATOR, format);__CLR4_4_1m8xm8xlb90p91d.R.inc(28836);try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28835);
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Create an instance with custom prefix, suffix and separator.
     * @param prefix prefix to use instead of the default "{"
     * @param suffix suffix to use instead of the default "}"
     * @param rowPrefix row prefix to use instead of the default "{"
     * @param rowSuffix row suffix to use instead of the default "}"
     * @param rowSeparator tow separator to use instead of the default ";"
     * @param columnSeparator column separator to use instead of the default ", "
     */
    public RealMatrixFormat(final String prefix, final String suffix,
                            final String rowPrefix, final String rowSuffix,
                            final String rowSeparator, final String columnSeparator) {
        this(prefix, suffix, rowPrefix, rowSuffix, rowSeparator, columnSeparator,
                CompositeFormat.getDefaultNumberFormat());__CLR4_4_1m8xm8xlb90p91d.R.inc(28838);try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28837);
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Create an instance with custom prefix, suffix, separator and format
     * for components.
     * @param prefix prefix to use instead of the default "{"
     * @param suffix suffix to use instead of the default "}"
     * @param rowPrefix row prefix to use instead of the default "{"
     * @param rowSuffix row suffix to use instead of the default "}"
     * @param rowSeparator tow separator to use instead of the default ";"
     * @param columnSeparator column separator to use instead of the default ", "
     * @param format the custom format for components.
     */
    public RealMatrixFormat(final String prefix, final String suffix,
                            final String rowPrefix, final String rowSuffix,
                            final String rowSeparator, final String columnSeparator,
                            final NumberFormat format) {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28839);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28840);this.prefix            = prefix;
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28841);this.suffix            = suffix;
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28842);this.rowPrefix         = rowPrefix;
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28843);this.rowSuffix         = rowSuffix;
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28844);this.rowSeparator      = rowSeparator;
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28845);this.columnSeparator   = columnSeparator;
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28846);this.format            = format;
        // disable grouping to prevent parsing problems
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28847);this.format.setGroupingUsed(false);
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Get the set of locales for which real vectors formats are available.
     * <p>This is the same set as the {@link NumberFormat} set.</p>
     * @return available real vector format locales.
     */
    public static Locale[] getAvailableLocales() {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28848);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28849);return NumberFormat.getAvailableLocales();
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Get the format prefix.
     * @return format prefix.
     */
    public String getPrefix() {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28850);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28851);return prefix;
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Get the format suffix.
     * @return format suffix.
     */
    public String getSuffix() {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28852);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28853);return suffix;
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Get the format prefix.
     * @return format prefix.
     */
    public String getRowPrefix() {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28854);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28855);return rowPrefix;
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Get the format suffix.
     * @return format suffix.
     */
    public String getRowSuffix() {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28856);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28857);return rowSuffix;
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Get the format separator between rows of the matrix.
     * @return format separator for rows.
     */
    public String getRowSeparator() {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28858);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28859);return rowSeparator;
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Get the format separator between components.
     * @return format separator between components.
     */
    public String getColumnSeparator() {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28860);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28861);return columnSeparator;
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Get the components format.
     * @return components format.
     */
    public NumberFormat getFormat() {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28862);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28863);return format;
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Returns the default real vector format for the current locale.
     * @return the default real vector format.
     */
    public static RealMatrixFormat getInstance() {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28864);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28865);return getInstance(Locale.getDefault());
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Returns the default real vector format for the given locale.
     * @param locale the specific locale used by the format.
     * @return the real vector format specific to the given locale.
     */
    public static RealMatrixFormat getInstance(final Locale locale) {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28866);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28867);return new RealMatrixFormat(CompositeFormat.getDefaultNumberFormat(locale));
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * This method calls {@link #format(RealMatrix,StringBuffer,FieldPosition)}.
     *
     * @param m RealMatrix object to format.
     * @return a formatted matrix.
     */
    public String format(RealMatrix m) {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28868);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28869);return format(m, new StringBuffer(), new FieldPosition(0)).toString();
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Formats a {@link RealMatrix} object to produce a string.
     * @param matrix the object to format.
     * @param toAppendTo where the text is to be appended
     * @param pos On input: an alignment field, if desired. On output: the
     *            offsets of the alignment field
     * @return the value passed in as toAppendTo.
     */
    public StringBuffer format(RealMatrix matrix, StringBuffer toAppendTo,
                               FieldPosition pos) {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28870);

        __CLR4_4_1m8xm8xlb90p91d.R.inc(28871);pos.setBeginIndex(0);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28872);pos.setEndIndex(0);

        // format prefix
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28873);toAppendTo.append(prefix);

        // format rows
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28874);final int rows = matrix.getRowDimension();
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28875);for (int i = 0; (((i < rows)&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28876)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28877)==0&false)); ++i) {{
            __CLR4_4_1m8xm8xlb90p91d.R.inc(28878);toAppendTo.append(rowPrefix);
            __CLR4_4_1m8xm8xlb90p91d.R.inc(28879);for (int j = 0; (((j < matrix.getColumnDimension())&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28880)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28881)==0&false)); ++j) {{
                __CLR4_4_1m8xm8xlb90p91d.R.inc(28882);if ((((j > 0)&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28883)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28884)==0&false))) {{
                    __CLR4_4_1m8xm8xlb90p91d.R.inc(28885);toAppendTo.append(columnSeparator);
                }
                }__CLR4_4_1m8xm8xlb90p91d.R.inc(28886);CompositeFormat.formatDouble(matrix.getEntry(i, j), format, toAppendTo, pos);
            }
            }__CLR4_4_1m8xm8xlb90p91d.R.inc(28887);toAppendTo.append(rowSuffix);
            __CLR4_4_1m8xm8xlb90p91d.R.inc(28888);if ((((i < rows - 1)&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28889)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28890)==0&false))) {{
                __CLR4_4_1m8xm8xlb90p91d.R.inc(28891);toAppendTo.append(rowSeparator);
            }
        }}

        // format suffix
        }__CLR4_4_1m8xm8xlb90p91d.R.inc(28892);toAppendTo.append(suffix);

        __CLR4_4_1m8xm8xlb90p91d.R.inc(28893);return toAppendTo;
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Parse a string to produce a {@link RealMatrix} object.
     *
     * @param source String to parse.
     * @return the parsed {@link RealMatrix} object.
     * @throws MathParseException if the beginning of the specified string
     * cannot be parsed.
     */
    public RealMatrix parse(String source) {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28894);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28895);final ParsePosition parsePosition = new ParsePosition(0);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28896);final RealMatrix result = parse(source, parsePosition);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28897);if ((((parsePosition.getIndex() == 0)&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28898)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28899)==0&false))) {{
            __CLR4_4_1m8xm8xlb90p91d.R.inc(28900);throw new MathParseException(source,
                                         parsePosition.getErrorIndex(),
                                         Array2DRowRealMatrix.class);
        }
        }__CLR4_4_1m8xm8xlb90p91d.R.inc(28901);return result;
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}

    /**
     * Parse a string to produce a {@link RealMatrix} object.
     *
     * @param source String to parse.
     * @param pos input/ouput parsing parameter.
     * @return the parsed {@link RealMatrix} object.
     */
    public RealMatrix parse(String source, ParsePosition pos) {try{__CLR4_4_1m8xm8xlb90p91d.R.inc(28902);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28903);int initialIndex = pos.getIndex();

        __CLR4_4_1m8xm8xlb90p91d.R.inc(28904);final String trimmedPrefix = prefix.trim();
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28905);final String trimmedSuffix = suffix.trim();
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28906);final String trimmedRowPrefix = rowPrefix.trim();
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28907);final String trimmedRowSuffix = rowSuffix.trim();
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28908);final String trimmedColumnSeparator = columnSeparator.trim();
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28909);final String trimmedRowSeparator = rowSeparator.trim();

        // parse prefix
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28910);CompositeFormat.parseAndIgnoreWhitespace(source, pos);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28911);if ((((!CompositeFormat.parseFixedstring(source, trimmedPrefix, pos))&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28912)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28913)==0&false))) {{
            __CLR4_4_1m8xm8xlb90p91d.R.inc(28914);return null;
        }

        // parse components
        }__CLR4_4_1m8xm8xlb90p91d.R.inc(28915);List<List<Number>> matrix = new ArrayList<List<Number>>();
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28916);List<Number> rowComponents = new ArrayList<Number>();
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28917);for (boolean loop = true; (((loop)&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28918)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28919)==0&false));){{

            __CLR4_4_1m8xm8xlb90p91d.R.inc(28920);if ((((!rowComponents.isEmpty())&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28921)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28922)==0&false))) {{
                __CLR4_4_1m8xm8xlb90p91d.R.inc(28923);CompositeFormat.parseAndIgnoreWhitespace(source, pos);
                __CLR4_4_1m8xm8xlb90p91d.R.inc(28924);if ((((!CompositeFormat.parseFixedstring(source, trimmedColumnSeparator, pos))&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28925)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28926)==0&false))) {{
                    __CLR4_4_1m8xm8xlb90p91d.R.inc(28927);if ((((trimmedRowSuffix.length() != 0 &&
                        !CompositeFormat.parseFixedstring(source, trimmedRowSuffix, pos))&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28928)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28929)==0&false))) {{
                        __CLR4_4_1m8xm8xlb90p91d.R.inc(28930);return null;
                    } }else {{
                        __CLR4_4_1m8xm8xlb90p91d.R.inc(28931);CompositeFormat.parseAndIgnoreWhitespace(source, pos);
                        __CLR4_4_1m8xm8xlb90p91d.R.inc(28932);if ((((CompositeFormat.parseFixedstring(source, trimmedRowSeparator, pos))&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28933)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28934)==0&false))) {{
                            __CLR4_4_1m8xm8xlb90p91d.R.inc(28935);matrix.add(rowComponents);
                            __CLR4_4_1m8xm8xlb90p91d.R.inc(28936);rowComponents = new ArrayList<Number>();
                            __CLR4_4_1m8xm8xlb90p91d.R.inc(28937);continue;
                        } }else {{
                            __CLR4_4_1m8xm8xlb90p91d.R.inc(28938);loop = false;
                        }
                    }}
                }}
            }} }else {{
                __CLR4_4_1m8xm8xlb90p91d.R.inc(28939);CompositeFormat.parseAndIgnoreWhitespace(source, pos);
                __CLR4_4_1m8xm8xlb90p91d.R.inc(28940);if ((((trimmedRowPrefix.length() != 0 &&
                    !CompositeFormat.parseFixedstring(source, trimmedRowPrefix, pos))&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28941)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28942)==0&false))) {{
                    __CLR4_4_1m8xm8xlb90p91d.R.inc(28943);return null;
                }
            }}

            }__CLR4_4_1m8xm8xlb90p91d.R.inc(28944);if ((((loop)&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28945)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28946)==0&false))) {{
                __CLR4_4_1m8xm8xlb90p91d.R.inc(28947);CompositeFormat.parseAndIgnoreWhitespace(source, pos);
                __CLR4_4_1m8xm8xlb90p91d.R.inc(28948);Number component = CompositeFormat.parseNumber(source, format, pos);
                __CLR4_4_1m8xm8xlb90p91d.R.inc(28949);if ((((component != null)&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28950)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28951)==0&false))) {{
                    __CLR4_4_1m8xm8xlb90p91d.R.inc(28952);rowComponents.add(component);
                } }else {{
                    __CLR4_4_1m8xm8xlb90p91d.R.inc(28953);if ((((rowComponents.isEmpty())&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28954)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28955)==0&false))) {{
                        __CLR4_4_1m8xm8xlb90p91d.R.inc(28956);loop = false;
                    } }else {{
                        // invalid component
                        // set index back to initial, error index should already be set
                        __CLR4_4_1m8xm8xlb90p91d.R.inc(28957);pos.setIndex(initialIndex);
                        __CLR4_4_1m8xm8xlb90p91d.R.inc(28958);return null;
                    }
                }}
            }}

        }}

        }__CLR4_4_1m8xm8xlb90p91d.R.inc(28959);if ((((!rowComponents.isEmpty())&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28960)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28961)==0&false))) {{
            __CLR4_4_1m8xm8xlb90p91d.R.inc(28962);matrix.add(rowComponents);
        }

        // parse suffix
        }__CLR4_4_1m8xm8xlb90p91d.R.inc(28963);CompositeFormat.parseAndIgnoreWhitespace(source, pos);
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28964);if ((((!CompositeFormat.parseFixedstring(source, trimmedSuffix, pos))&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28965)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28966)==0&false))) {{
            __CLR4_4_1m8xm8xlb90p91d.R.inc(28967);return null;
        }

        // do not allow an empty matrix
        }__CLR4_4_1m8xm8xlb90p91d.R.inc(28968);if ((((matrix.isEmpty())&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28969)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28970)==0&false))) {{
            __CLR4_4_1m8xm8xlb90p91d.R.inc(28971);pos.setIndex(initialIndex);
            __CLR4_4_1m8xm8xlb90p91d.R.inc(28972);return null;
        }

        // build vector
        }__CLR4_4_1m8xm8xlb90p91d.R.inc(28973);double[][] data = new double[matrix.size()][];
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28974);int row = 0;
        __CLR4_4_1m8xm8xlb90p91d.R.inc(28975);for (List<Number> rowList : matrix) {{
            __CLR4_4_1m8xm8xlb90p91d.R.inc(28976);data[row] = new double[rowList.size()];
            __CLR4_4_1m8xm8xlb90p91d.R.inc(28977);for (int i = 0; (((i < rowList.size())&&(__CLR4_4_1m8xm8xlb90p91d.R.iget(28978)!=0|true))||(__CLR4_4_1m8xm8xlb90p91d.R.iget(28979)==0&false)); i++) {{
                __CLR4_4_1m8xm8xlb90p91d.R.inc(28980);data[row][i] = rowList.get(i).doubleValue();
            }
            }__CLR4_4_1m8xm8xlb90p91d.R.inc(28981);row++;
        }
        }__CLR4_4_1m8xm8xlb90p91d.R.inc(28982);return MatrixUtils.createRealMatrix(data);
    }finally{__CLR4_4_1m8xm8xlb90p91d.R.flushNeeded();}}
}
