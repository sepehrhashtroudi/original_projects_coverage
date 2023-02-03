/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.MutableDateTime.Property;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;

/**
 * Factory that creates complex instances of DateTimeFormatter via method calls.
 * <p>
 * Datetime formatting is performed by the {@link DateTimeFormatter} class.
 * Three classes provide factory methods to create formatters, and this is one.
 * The others are {@link DateTimeFormat} and {@link ISODateTimeFormat}.
 * <p>
 * DateTimeFormatterBuilder is used for constructing formatters which are then
 * used to print or parse. The formatters are built by appending specific fields
 * or other formatters to an instance of this builder.
 * <p>
 * For example, a formatter that prints month and year, like "January 1970",
 * can be constructed as follows:
 * <p>
 * <pre>
 * DateTimeFormatter monthAndYear = new DateTimeFormatterBuilder()
 *     .appendMonthOfYearText()
 *     .appendLiteral(' ')
 *     .appendYear(4, 4)
 *     .toFormatter();
 * </pre>
 * <p>
 * DateTimeFormatterBuilder itself is mutable and not thread-safe, but the
 * formatters that it builds are thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @author Fredrik Borgh
 * @since 1.0
 * @see DateTimeFormat
 * @see ISODateTimeFormat
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DateTimeFormatterBuilder {public static class __CLR4_4_1bzobzolc8aztgs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,17185,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Array of printers and parsers (alternating). */
    private ArrayList<Object> iElementPairs;
    /** Cache of the last returned formatter. */
    private Object iFormatter;

    //-----------------------------------------------------------------------
    /**
     * Creates a DateTimeFormatterBuilder.
     */
    public DateTimeFormatterBuilder() {
        super();__CLR4_4_1bzobzolc8aztgs.R.inc(15541);try{__CLR4_4_1bzobzolc8aztgs.R.inc(15540);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15542);iElementPairs = new ArrayList<Object>();
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a DateTimeFormatter using all the appended elements.
     * <p>
     * This is the main method used by applications at the end of the build
     * process to create a usable formatter.
     * <p>
     * Subsequent changes to this builder do not affect the returned formatter.
     * <p>
     * The returned formatter may not support both printing and parsing.
     * The methods {@link DateTimeFormatter#isPrinter()} and
     * {@link DateTimeFormatter#isParser()} will help you determine the state
     * of the formatter.
     *
     * @throws UnsupportedOperationException if neither printing nor parsing is supported
     */
    public DateTimeFormatter toFormatter() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15543);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15544);Object f = getFormatter();
        __CLR4_4_1bzobzolc8aztgs.R.inc(15545);DateTimePrinter printer = null;
        __CLR4_4_1bzobzolc8aztgs.R.inc(15546);if ((((isPrinter(f))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15547)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15548)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15549);printer = (DateTimePrinter) f;
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15550);DateTimeParser parser = null;
        __CLR4_4_1bzobzolc8aztgs.R.inc(15551);if ((((isParser(f))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15552)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15553)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15554);parser = (DateTimeParser) f;
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15555);if ((((printer != null || parser != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15556)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15557)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15558);return new DateTimeFormatter(printer, parser);
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15559);throw new UnsupportedOperationException("Both printing and parsing not supported");
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Internal method to create a DateTimePrinter instance using all the
     * appended elements.
     * <p>
     * Most applications will not use this method.
     * If you want a printer in an application, call {@link #toFormatter()}
     * and just use the printing API.
     * <p>
     * Subsequent changes to this builder do not affect the returned printer.
     *
     * @throws UnsupportedOperationException if printing is not supported
     */
    public DateTimePrinter toPrinter() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15560);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15561);Object f = getFormatter();
        __CLR4_4_1bzobzolc8aztgs.R.inc(15562);if ((((isPrinter(f))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15563)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15564)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15565);return (DateTimePrinter) f;
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15566);throw new UnsupportedOperationException("Printing is not supported");
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Internal method to create a DateTimeParser instance using all the
     * appended elements.
     * <p>
     * Most applications will not use this method.
     * If you want a parser in an application, call {@link #toFormatter()}
     * and just use the parsing API.
     * <p>
     * Subsequent changes to this builder do not affect the returned parser.
     *
     * @throws UnsupportedOperationException if parsing is not supported
     */
    public DateTimeParser toParser() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15567);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15568);Object f = getFormatter();
        __CLR4_4_1bzobzolc8aztgs.R.inc(15569);if ((((isParser(f))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15570)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15571)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15572);return (DateTimeParser) f;
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15573);throw new UnsupportedOperationException("Parsing is not supported");
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns true if toFormatter can be called without throwing an
     * UnsupportedOperationException.
     * 
     * @return true if a formatter can be built
     */
    public boolean canBuildFormatter() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15574);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15575);return isFormatter(getFormatter());
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Returns true if toPrinter can be called without throwing an
     * UnsupportedOperationException.
     * 
     * @return true if a printer can be built
     */
    public boolean canBuildPrinter() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15576);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15577);return isPrinter(getFormatter());
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Returns true if toParser can be called without throwing an
     * UnsupportedOperationException.
     * 
     * @return true if a parser can be built
     */
    public boolean canBuildParser() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15578);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15579);return isParser(getFormatter());
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Clears out all the appended elements, allowing this builder to be
     * reused.
     */
    public void clear() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15580);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15581);iFormatter = null;
        __CLR4_4_1bzobzolc8aztgs.R.inc(15582);iElementPairs.clear();
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends another formatter.
     * <p>
     * This extracts the underlying printer and parser and appends them
     * The printer and parser interfaces are the low-level part of the formatting API.
     * Normally, instances are extracted from another formatter.
     * Note however that any formatter specific information, such as the locale,
     * time-zone, chronology, offset parsing or pivot/default year, will not be
     * extracted by this method.
     *
     * @param formatter  the formatter to add
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if formatter is null or of an invalid type
     */
    public DateTimeFormatterBuilder append(DateTimeFormatter formatter) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15583);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15584);if ((((formatter == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15585)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15586)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15587);throw new IllegalArgumentException("No formatter supplied");
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15588);return append0(formatter.getPrinter(), formatter.getParser());
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Appends just a printer. With no matching parser, a parser cannot be
     * built from this DateTimeFormatterBuilder.
     * <p>
     * The printer interface is part of the low-level part of the formatting API.
     * Normally, instances are extracted from another formatter.
     * Note however that any formatter specific information, such as the locale,
     * time-zone, chronology, offset parsing or pivot/default year, will not be
     * extracted by this method.
     *
     * @param printer  the printer to add, not null
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if printer is null or of an invalid type
     */
    public DateTimeFormatterBuilder append(DateTimePrinter printer) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15589);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15590);checkPrinter(printer);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15591);return append0(printer, null);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Appends just a parser. With no matching printer, a printer cannot be
     * built from this builder.
     * <p>
     * The parser interface is part of the low-level part of the formatting API.
     * Normally, instances are extracted from another formatter.
     * Note however that any formatter specific information, such as the locale,
     * time-zone, chronology, offset parsing or pivot/default year, will not be
     * extracted by this method.
     *
     * @param parser  the parser to add, not null
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if parser is null or of an invalid type
     */
    public DateTimeFormatterBuilder append(DateTimeParser parser) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15592);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15593);checkParser(parser);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15594);return append0(null, parser);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Appends a printer/parser pair.
     * <p>
     * The printer and parser interfaces are the low-level part of the formatting API.
     * Normally, instances are extracted from another formatter.
     * Note however that any formatter specific information, such as the locale,
     * time-zone, chronology, offset parsing or pivot/default year, will not be
     * extracted by this method.
     *
     * @param printer  the printer to add, not null
     * @param parser  the parser to add, not null
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if printer or parser is null or of an invalid type
     */
    public DateTimeFormatterBuilder append(DateTimePrinter printer, DateTimeParser parser) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15595);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15596);checkPrinter(printer);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15597);checkParser(parser);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15598);return append0(printer, parser);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Appends a printer and a set of matching parsers. When parsing, the first
     * parser in the list is selected for parsing. If it fails, the next is
     * chosen, and so on. If none of these parsers succeeds, then the failed
     * position of the parser that made the greatest progress is returned.
     * <p>
     * Only the printer is optional. In addition, it is illegal for any but the
     * last of the parser array elements to be null. If the last element is
     * null, this represents the empty parser. The presence of an empty parser
     * indicates that the entire array of parse formats is optional.
     * <p>
     * The printer and parser interfaces are the low-level part of the formatting API.
     * Normally, instances are extracted from another formatter.
     * Note however that any formatter specific information, such as the locale,
     * time-zone, chronology, offset parsing or pivot/default year, will not be
     * extracted by this method.
     *
     * @param printer  the printer to add
     * @param parsers  the parsers to add
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if any printer or parser is of an invalid type
     * @throws IllegalArgumentException if any parser element but the last is null
     */
    public DateTimeFormatterBuilder append(DateTimePrinter printer, DateTimeParser[] parsers) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15599);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15600);if ((((printer != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15601)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15602)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15603);checkPrinter(printer);
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15604);if ((((parsers == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15605)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15606)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15607);throw new IllegalArgumentException("No parsers supplied");
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15608);int length = parsers.length;
        __CLR4_4_1bzobzolc8aztgs.R.inc(15609);if ((((length == 1)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15610)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15611)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15612);if ((((parsers[0] == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15613)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15614)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(15615);throw new IllegalArgumentException("No parser supplied");
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(15616);return append0(printer, parsers[0]);
        }

        }__CLR4_4_1bzobzolc8aztgs.R.inc(15617);DateTimeParser[] copyOfParsers = new DateTimeParser[length];
        __CLR4_4_1bzobzolc8aztgs.R.inc(15618);int i;
        __CLR4_4_1bzobzolc8aztgs.R.inc(15619);for (i = 0; (((i < length - 1)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15620)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15621)==0&false)); i++) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15622);if ((copyOfParsers[i] = parsers[i]) == null) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(15625);throw new IllegalArgumentException("Incomplete parser array");
            }
        }}
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15626);copyOfParsers[i] = parsers[i];

        __CLR4_4_1bzobzolc8aztgs.R.inc(15627);return append0(printer, new MatchingParser(copyOfParsers));
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Appends just a parser element which is optional. With no matching
     * printer, a printer cannot be built from this DateTimeFormatterBuilder.
     * <p>
     * The parser interface is part of the low-level part of the formatting API.
     * Normally, instances are extracted from another formatter.
     * Note however that any formatter specific information, such as the locale,
     * time-zone, chronology, offset parsing or pivot/default year, will not be
     * extracted by this method.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if parser is null or of an invalid type
     */
    public DateTimeFormatterBuilder appendOptional(DateTimeParser parser) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15628);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15629);checkParser(parser);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15630);DateTimeParser[] parsers = new DateTimeParser[] {parser, null};
        __CLR4_4_1bzobzolc8aztgs.R.inc(15631);return append0(null, new MatchingParser(parsers));
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks if the parser is non null and a provider.
     * 
     * @param parser  the parser to check
     */
    private void checkParser(DateTimeParser parser) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15632);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15633);if ((((parser == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15634)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15635)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15636);throw new IllegalArgumentException("No parser supplied");
        }
    }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Checks if the printer is non null and a provider.
     * 
     * @param printer  the printer to check
     */
    private void checkPrinter(DateTimePrinter printer) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15637);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15638);if ((((printer == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15639)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15640)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15641);throw new IllegalArgumentException("No printer supplied");
        }
    }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    private DateTimeFormatterBuilder append0(Object element) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15642);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15643);iFormatter = null;
        // Add the element as both a printer and parser.
        __CLR4_4_1bzobzolc8aztgs.R.inc(15644);iElementPairs.add(element);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15645);iElementPairs.add(element);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15646);return this;
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    private DateTimeFormatterBuilder append0(
            DateTimePrinter printer, DateTimeParser parser) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15647);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15648);iFormatter = null;
        __CLR4_4_1bzobzolc8aztgs.R.inc(15649);iElementPairs.add(printer);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15650);iElementPairs.add(parser);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15651);return this;
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Instructs the printer to emit a specific character, and the parser to
     * expect it. The parser is case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendLiteral(char c) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15652);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15653);return append0(new CharacterLiteral(c));
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit specific text, and the parser to expect
     * it. The parser is case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if text is null
     */
    public DateTimeFormatterBuilder appendLiteral(String text) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15654);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15655);if ((((text == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15656)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15657)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15658);throw new IllegalArgumentException("Literal must not be null");
        }
        }boolean __CLB4_4_1_bool0=false;__CLR4_4_1bzobzolc8aztgs.R.inc(15659);switch (text.length()) {
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1bzobzolc8aztgs.R.inc(15660);__CLB4_4_1_bool0=true;}
                __CLR4_4_1bzobzolc8aztgs.R.inc(15661);return this;
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1bzobzolc8aztgs.R.inc(15662);__CLB4_4_1_bool0=true;}
                __CLR4_4_1bzobzolc8aztgs.R.inc(15663);return append0(new CharacterLiteral(text.charAt(0)));
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1bzobzolc8aztgs.R.inc(15664);__CLB4_4_1_bool0=true;}
                __CLR4_4_1bzobzolc8aztgs.R.inc(15665);return append0(new StringLiteral(text));
        }
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a field value as a decimal number, and the
     * parser to expect an unsigned decimal number.
     *
     * @param fieldType  type of field to append
     * @param minDigits  minimum number of digits to <i>print</i>
     * @param maxDigits  maximum number of digits to <i>parse</i>, or the estimated
     * maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null
     */
    public DateTimeFormatterBuilder appendDecimal(
            DateTimeFieldType fieldType, int minDigits, int maxDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15666);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15667);if ((((fieldType == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15668)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15669)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15670);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15671);if ((((maxDigits < minDigits)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15672)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15673)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15674);maxDigits = minDigits;
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15675);if ((((minDigits < 0 || maxDigits <= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15676)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15677)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15678);throw new IllegalArgumentException();
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15679);if ((((minDigits <= 1)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15680)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15681)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15682);return append0(new UnpaddedNumber(fieldType, maxDigits, false));
        } }else {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15683);return append0(new PaddedNumber(fieldType, maxDigits, false, minDigits));
        }
    }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a field value as a fixed-width decimal
     * number (smaller numbers will be left-padded with zeros), and the parser
     * to expect an unsigned decimal number with the same fixed width.
     * 
     * @param fieldType  type of field to append
     * @param numDigits  the exact number of digits to parse or print, except if
     * printed value requires more digits
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null or if <code>numDigits <= 0</code>
     * @since 1.5
     */
    public DateTimeFormatterBuilder appendFixedDecimal(
            DateTimeFieldType fieldType, int numDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15684);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15685);if ((((fieldType == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15686)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15687)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15688);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15689);if ((((numDigits <= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15690)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15691)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15692);throw new IllegalArgumentException("Illegal number of digits: " + numDigits);
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15693);return append0(new FixedNumber(fieldType, numDigits, false));
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a field value as a decimal number, and the
     * parser to expect a signed decimal number.
     *
     * @param fieldType  type of field to append
     * @param minDigits  minimum number of digits to <i>print</i>
     * @param maxDigits  maximum number of digits to <i>parse</i>, or the estimated
     * maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null
     */
    public DateTimeFormatterBuilder appendSignedDecimal(
            DateTimeFieldType fieldType, int minDigits, int maxDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15694);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15695);if ((((fieldType == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15696)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15697)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15698);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15699);if ((((maxDigits < minDigits)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15700)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15701)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15702);maxDigits = minDigits;
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15703);if ((((minDigits < 0 || maxDigits <= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15704)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15705)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15706);throw new IllegalArgumentException();
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15707);if ((((minDigits <= 1)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15708)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15709)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15710);return append0(new UnpaddedNumber(fieldType, maxDigits, true));
        } }else {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15711);return append0(new PaddedNumber(fieldType, maxDigits, true, minDigits));
        }
    }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a field value as a fixed-width decimal
     * number (smaller numbers will be left-padded with zeros), and the parser
     * to expect an signed decimal number with the same fixed width.
     * 
     * @param fieldType  type of field to append
     * @param numDigits  the exact number of digits to parse or print, except if
     * printed value requires more digits
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null or if <code>numDigits <= 0</code>
     * @since 1.5
     */
    public DateTimeFormatterBuilder appendFixedSignedDecimal(
            DateTimeFieldType fieldType, int numDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15712);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15713);if ((((fieldType == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15714)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15715)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15716);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15717);if ((((numDigits <= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15718)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15719)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15720);throw new IllegalArgumentException("Illegal number of digits: " + numDigits);
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15721);return append0(new FixedNumber(fieldType, numDigits, true));
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a field value as text, and the
     * parser to expect text.
     *
     * @param fieldType  type of field to append
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null
     */
    public DateTimeFormatterBuilder appendText(DateTimeFieldType fieldType) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15722);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15723);if ((((fieldType == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15724)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15725)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15726);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15727);return append0(new TextField(fieldType, false));
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a field value as short text, and the
     * parser to expect text.
     *
     * @param fieldType  type of field to append
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null
     */
    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType fieldType) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15728);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15729);if ((((fieldType == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15730)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15731)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15732);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15733);return append0(new TextField(fieldType, true));
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a remainder of time as a decimal fraction,
     * without decimal point. For example, if the field is specified as
     * minuteOfHour and the time is 12:30:45, the value printed is 75. A
     * decimal point is implied, so the fraction is 0.75, or three-quarters of
     * a minute.
     *
     * @param fieldType  type of field to append
     * @param minDigits  minimum number of digits to print.
     * @param maxDigits  maximum number of digits to print or parse.
     * @return this DateTimeFormatterBuilder, for chaining
     * @throws IllegalArgumentException if field type is null
     */
    public DateTimeFormatterBuilder appendFraction(
            DateTimeFieldType fieldType, int minDigits, int maxDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15734);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15735);if ((((fieldType == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15736)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15737)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15738);throw new IllegalArgumentException("Field type must not be null");
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15739);if ((((maxDigits < minDigits)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15740)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15741)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15742);maxDigits = minDigits;
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15743);if ((((minDigits < 0 || maxDigits <= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15744)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15745)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15746);throw new IllegalArgumentException();
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15747);return append0(new Fraction(fieldType, minDigits, maxDigits));
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Appends the print/parse of a fractional second.
     * <p>
     * This reliably handles the case where fractional digits are being handled
     * beyond a visible decimal point. The digits parsed will always be treated
     * as the most significant (numerically largest) digits.
     * Thus '23' will be parsed as 230 milliseconds.
     * Contrast this behaviour to {@link #appendMillisOfSecond}.
     * This method does not print or parse the decimal point itself.
     * 
     * @param minDigits  minimum number of digits to print
     * @param maxDigits  maximum number of digits to print or parse
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendFractionOfSecond(int minDigits, int maxDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15748);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15749);return appendFraction(DateTimeFieldType.secondOfDay(), minDigits, maxDigits);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Appends the print/parse of a fractional minute.
     * <p>
     * This reliably handles the case where fractional digits are being handled
     * beyond a visible decimal point. The digits parsed will always be treated
     * as the most significant (numerically largest) digits.
     * Thus '23' will be parsed as 0.23 minutes (converted to milliseconds).
     * This method does not print or parse the decimal point itself.
     * 
     * @param minDigits  minimum number of digits to print
     * @param maxDigits  maximum number of digits to print or parse
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendFractionOfMinute(int minDigits, int maxDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15750);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15751);return appendFraction(DateTimeFieldType.minuteOfDay(), minDigits, maxDigits);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Appends the print/parse of a fractional hour.
     * <p>
     * This reliably handles the case where fractional digits are being handled
     * beyond a visible decimal point. The digits parsed will always be treated
     * as the most significant (numerically largest) digits.
     * Thus '23' will be parsed as 0.23 hours (converted to milliseconds).
     * This method does not print or parse the decimal point itself.
     * 
     * @param minDigits  minimum number of digits to print
     * @param maxDigits  maximum number of digits to print or parse
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendFractionOfHour(int minDigits, int maxDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15752);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15753);return appendFraction(DateTimeFieldType.hourOfDay(), minDigits, maxDigits);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Appends the print/parse of a fractional day.
     * <p>
     * This reliably handles the case where fractional digits are being handled
     * beyond a visible decimal point. The digits parsed will always be treated
     * as the most significant (numerically largest) digits.
     * Thus '23' will be parsed as 0.23 days (converted to milliseconds).
     * This method does not print or parse the decimal point itself.
     * 
     * @param minDigits  minimum number of digits to print
     * @param maxDigits  maximum number of digits to print or parse
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendFractionOfDay(int minDigits, int maxDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15754);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15755);return appendFraction(DateTimeFieldType.dayOfYear(), minDigits, maxDigits);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric millisOfSecond field.
     * <p>
     * This method will append a field that prints a three digit value.
     * During parsing the value that is parsed is assumed to be three digits.
     * If less than three digits are present then they will be counted as the
     * smallest parts of the millisecond. This is probably not what you want
     * if you are using the field as a fraction. Instead, a fractional
     * millisecond should be produced using {@link #appendFractionOfSecond}.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMillisOfSecond(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15756);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15757);return appendDecimal(DateTimeFieldType.millisOfSecond(), minDigits, 3);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric millisOfDay field.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMillisOfDay(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15758);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15759);return appendDecimal(DateTimeFieldType.millisOfDay(), minDigits, 8);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric secondOfMinute field.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendSecondOfMinute(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15760);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15761);return appendDecimal(DateTimeFieldType.secondOfMinute(), minDigits, 2);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric secondOfDay field.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendSecondOfDay(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15762);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15763);return appendDecimal(DateTimeFieldType.secondOfDay(), minDigits, 5);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric minuteOfHour field.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMinuteOfHour(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15764);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15765);return appendDecimal(DateTimeFieldType.minuteOfHour(), minDigits, 2);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric minuteOfDay field.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMinuteOfDay(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15766);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15767);return appendDecimal(DateTimeFieldType.minuteOfDay(), minDigits, 4);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric hourOfDay field.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendHourOfDay(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15768);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15769);return appendDecimal(DateTimeFieldType.hourOfDay(), minDigits, 2);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric clockhourOfDay field.
     *
     * @param minDigits minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendClockhourOfDay(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15770);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15771);return appendDecimal(DateTimeFieldType.clockhourOfDay(), minDigits, 2);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric hourOfHalfday field.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendHourOfHalfday(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15772);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15773);return appendDecimal(DateTimeFieldType.hourOfHalfday(), minDigits, 2);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric clockhourOfHalfday field.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendClockhourOfHalfday(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15774);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15775);return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), minDigits, 2);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric dayOfWeek field.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendDayOfWeek(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15776);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15777);return appendDecimal(DateTimeFieldType.dayOfWeek(), minDigits, 1);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric dayOfMonth field.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendDayOfMonth(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15778);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15779);return appendDecimal(DateTimeFieldType.dayOfMonth(), minDigits, 2);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric dayOfYear field.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendDayOfYear(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15780);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15781);return appendDecimal(DateTimeFieldType.dayOfYear(), minDigits, 3);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric weekOfWeekyear field.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendWeekOfWeekyear(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15782);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15783);return appendDecimal(DateTimeFieldType.weekOfWeekyear(), minDigits, 2);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric weekyear field.
     *
     * @param minDigits  minimum number of digits to <i>print</i>
     * @param maxDigits  maximum number of digits to <i>parse</i>, or the estimated
     * maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendWeekyear(int minDigits, int maxDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15784);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15785);return appendSignedDecimal(DateTimeFieldType.weekyear(), minDigits, maxDigits);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric monthOfYear field.
     *
     * @param minDigits  minimum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMonthOfYear(int minDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15786);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15787);return appendDecimal(DateTimeFieldType.monthOfYear(), minDigits, 2);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric year field.
     *
     * @param minDigits  minimum number of digits to <i>print</i>
     * @param maxDigits  maximum number of digits to <i>parse</i>, or the estimated
     * maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendYear(int minDigits, int maxDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15788);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15789);return appendSignedDecimal(DateTimeFieldType.year(), minDigits, maxDigits);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric year field which always prints
     * and parses two digits. A pivot year is used during parsing to determine
     * the range of supported years as <code>(pivot - 50) .. (pivot + 49)</code>.
     *
     * <pre>
     * pivot   supported range   00 is   20 is   40 is   60 is   80 is
     * ---------------------------------------------------------------
     * 1950      1900..1999      1900    1920    1940    1960    1980
     * 1975      1925..2024      2000    2020    1940    1960    1980
     * 2000      1950..2049      2000    2020    2040    1960    1980
     * 2025      1975..2074      2000    2020    2040    2060    1980
     * 2050      2000..2099      2000    2020    2040    2060    2080
     * </pre>
     *
     * @param pivot  pivot year to use when parsing
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTwoDigitYear(int pivot) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15790);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15791);return appendTwoDigitYear(pivot, false);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric year field which always prints
     * two digits. A pivot year is used during parsing to determine the range
     * of supported years as <code>(pivot - 50) .. (pivot + 49)</code>. If
     * parse is instructed to be lenient and the digit count is not two, it is
     * treated as an absolute year. With lenient parsing, specifying a positive
     * or negative sign before the year also makes it absolute.
     *
     * @param pivot  pivot year to use when parsing
     * @param lenientParse  when true, if digit count is not two, it is treated
     * as an absolute year
     * @return this DateTimeFormatterBuilder, for chaining
     * @since 1.1
     */
    public DateTimeFormatterBuilder appendTwoDigitYear(int pivot, boolean lenientParse) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15792);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15793);return append0(new TwoDigitYear(DateTimeFieldType.year(), pivot, lenientParse));
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric weekyear field which always prints
     * and parses two digits. A pivot year is used during parsing to determine
     * the range of supported years as <code>(pivot - 50) .. (pivot + 49)</code>.
     *
     * <pre>
     * pivot   supported range   00 is   20 is   40 is   60 is   80 is
     * ---------------------------------------------------------------
     * 1950      1900..1999      1900    1920    1940    1960    1980
     * 1975      1925..2024      2000    2020    1940    1960    1980
     * 2000      1950..2049      2000    2020    2040    1960    1980
     * 2025      1975..2074      2000    2020    2040    2060    1980
     * 2050      2000..2099      2000    2020    2040    2060    2080
     * </pre>
     *
     * @param pivot  pivot weekyear to use when parsing
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int pivot) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15794);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15795);return appendTwoDigitWeekyear(pivot, false);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric weekyear field which always prints
     * two digits. A pivot year is used during parsing to determine the range
     * of supported years as <code>(pivot - 50) .. (pivot + 49)</code>. If
     * parse is instructed to be lenient and the digit count is not two, it is
     * treated as an absolute weekyear. With lenient parsing, specifying a positive
     * or negative sign before the weekyear also makes it absolute.
     *
     * @param pivot  pivot weekyear to use when parsing
     * @param lenientParse  when true, if digit count is not two, it is treated
     * as an absolute weekyear
     * @return this DateTimeFormatterBuilder, for chaining
     * @since 1.1
     */
    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int pivot, boolean lenientParse) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15796);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15797);return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), pivot, lenientParse));
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric yearOfEra field.
     *
     * @param minDigits  minimum number of digits to <i>print</i>
     * @param maxDigits  maximum number of digits to <i>parse</i>, or the estimated
     * maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendYearOfEra(int minDigits, int maxDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15798);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15799);return appendDecimal(DateTimeFieldType.yearOfEra(), minDigits, maxDigits);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric year of century field.
     *
     * @param minDigits  minimum number of digits to print
     * @param maxDigits  maximum number of digits to <i>parse</i>, or the estimated
     * maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendYearOfCentury(int minDigits, int maxDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15800);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15801);return appendDecimal(DateTimeFieldType.yearOfCentury(), minDigits, maxDigits);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a numeric century of era field.
     *
     * @param minDigits  minimum number of digits to print
     * @param maxDigits  maximum number of digits to <i>parse</i>, or the estimated
     * maximum number of digits to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendCenturyOfEra(int minDigits, int maxDigits) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15802);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15803);return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), minDigits, maxDigits);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a locale-specific AM/PM text, and the
     * parser to expect it. The parser is case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendHalfdayOfDayText() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15804);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15805);return appendText(DateTimeFieldType.halfdayOfDay());
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a locale-specific dayOfWeek text. The
     * parser will accept a long or short dayOfWeek text, case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendDayOfWeekText() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15806);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15807);return appendText(DateTimeFieldType.dayOfWeek());
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a short locale-specific dayOfWeek
     * text. The parser will accept a long or short dayOfWeek text,
     * case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendDayOfWeekShortText() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15808);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15809);return appendShortText(DateTimeFieldType.dayOfWeek());
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a short locale-specific monthOfYear
     * text. The parser will accept a long or short monthOfYear text,
     * case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMonthOfYearText() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15810); 
        __CLR4_4_1bzobzolc8aztgs.R.inc(15811);return appendText(DateTimeFieldType.monthOfYear());
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a locale-specific monthOfYear text. The
     * parser will accept a long or short monthOfYear text, case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendMonthOfYearShortText() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15812);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15813);return appendShortText(DateTimeFieldType.monthOfYear());
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a locale-specific era text (BC/AD), and
     * the parser to expect it. The parser is case-insensitive.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendEraText() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15814);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15815);return appendText(DateTimeFieldType.era());
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a locale-specific time zone name.
     * Using this method prevents parsing, because time zone names are not unique.
     * See {@link #appendTimeZoneName(Map)}.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTimeZoneName() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15816);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15817);return append0(new TimeZoneName(TimeZoneName.LONG_NAME, null), null);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a locale-specific time zone name, providing a lookup for parsing.
     * Time zone names are not unique, thus the API forces you to supply the lookup.
     * The names are searched in the order of the map, thus it is strongly recommended
     * to use a {@code LinkedHashMap} or similar.
     *
     * @param parseLookup  the table of names, not null
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> parseLookup) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15818);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15819);TimeZoneName pp = new TimeZoneName(TimeZoneName.LONG_NAME, parseLookup);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15820);return append0(pp, pp);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a short locale-specific time zone name.
     * Using this method prevents parsing, because time zone names are not unique.
     * See {@link #appendTimeZoneShortName(Map)}.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTimeZoneShortName() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15821);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15822);return append0(new TimeZoneName(TimeZoneName.SHORT_NAME, null), null);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit a short locale-specific time zone
     * name, providing a lookup for parsing.
     * Time zone names are not unique, thus the API forces you to supply the lookup.
     * The names are searched in the order of the map, thus it is strongly recommended
     * to use a {@code LinkedHashMap} or similar.
     *
     * @param parseLookup  the table of names, null to use the {@link DateTimeUtils#getDefaultTimeZoneNames() default names}
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> parseLookup) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15823);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15824);TimeZoneName pp = new TimeZoneName(TimeZoneName.SHORT_NAME, parseLookup);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15825);return append0(pp, pp);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit the identifier of the time zone.
     * From version 2.0, this field can be parsed.
     *
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTimeZoneId() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15826);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15827);return append0(TimeZoneId.INSTANCE, TimeZoneId.INSTANCE);
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit text and numbers to display time zone
     * offset from UTC. A parser will use the parsed time zone offset to adjust
     * the datetime.
     * <p>
     * If zero offset text is supplied, then it will be printed when the zone is zero.
     * During parsing, either the zero offset text, or the offset will be parsed.
     *
     * @param zeroOffsetText  the text to use if time zone offset is zero. If
     * null, offset is always shown.
     * @param showSeparators  if true, prints ':' separator before minute and
     * second field and prints '.' separator before fraction field.
     * @param minFields  minimum number of fields to print, stopping when no
     * more precision is required. 1=hours, 2=minutes, 3=seconds, 4=fraction
     * @param maxFields  maximum number of fields to print
     * @return this DateTimeFormatterBuilder, for chaining
     */
    public DateTimeFormatterBuilder appendTimeZoneOffset(
            String zeroOffsetText, boolean showSeparators,
            int minFields, int maxFields) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15828);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15829);return append0(new TimeZoneOffset
                       (zeroOffsetText, zeroOffsetText, showSeparators, minFields, maxFields));
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    /**
     * Instructs the printer to emit text and numbers to display time zone
     * offset from UTC. A parser will use the parsed time zone offset to adjust
     * the datetime.
     * <p>
     * If zero offset print text is supplied, then it will be printed when the zone is zero.
     * If zero offset parse text is supplied, then either it or the offset will be parsed.
     *
     * @param zeroOffsetPrintText  the text to print if time zone offset is zero. If
     * null, offset is always shown.
     * @param zeroOffsetParseText  the text to optionally parse to indicate that the time
     * zone offset is zero. If null, then always use the offset.
     * @param showSeparators  if true, prints ':' separator before minute and
     * second field and prints '.' separator before fraction field.
     * @param minFields  minimum number of fields to print, stopping when no
     * more precision is required. 1=hours, 2=minutes, 3=seconds, 4=fraction
     * @param maxFields  maximum number of fields to print
     * @return this DateTimeFormatterBuilder, for chaining
     * @since 2.0
     */
    public DateTimeFormatterBuilder appendTimeZoneOffset(
            String zeroOffsetPrintText, String zeroOffsetParseText, boolean showSeparators,
            int minFields, int maxFields) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15830);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15831);return append0(new TimeZoneOffset
                       (zeroOffsetPrintText, zeroOffsetParseText, showSeparators, minFields, maxFields));
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Calls upon {@link DateTimeFormat} to parse the pattern and append the
     * results into this builder.
     *
     * @param pattern  pattern specification
     * @throws IllegalArgumentException if the pattern is invalid
     * @see DateTimeFormat
     */
    public DateTimeFormatterBuilder appendPattern(String pattern) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15832);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15833);DateTimeFormat.appendPatternTo(this, pattern);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15834);return this;
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private Object getFormatter() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15835);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15836);Object f = iFormatter;

        __CLR4_4_1bzobzolc8aztgs.R.inc(15837);if ((((f == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15838)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15839)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15840);if ((((iElementPairs.size() == 2)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15841)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15842)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(15843);Object printer = iElementPairs.get(0);
                __CLR4_4_1bzobzolc8aztgs.R.inc(15844);Object parser = iElementPairs.get(1);

                __CLR4_4_1bzobzolc8aztgs.R.inc(15845);if ((((printer != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15846)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15847)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(15848);if ((((printer == parser || parser == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15849)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15850)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(15851);f = printer;
                    }
                }} }else {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(15852);f = parser;
                }
            }}

            }__CLR4_4_1bzobzolc8aztgs.R.inc(15853);if ((((f == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15854)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15855)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(15856);f = new Composite(iElementPairs);
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(15857);iFormatter = f;
        }

        }__CLR4_4_1bzobzolc8aztgs.R.inc(15858);return f;
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    private boolean isPrinter(Object f) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15859);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15860);if ((((f instanceof DateTimePrinter)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15861)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15862)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15863);if ((((f instanceof Composite)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15864)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15865)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(15866);return ((Composite)f).isPrinter();
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(15867);return true;
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15868);return false;
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    private boolean isParser(Object f) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15869);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15870);if ((((f instanceof DateTimeParser)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15871)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15872)==0&false))) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15873);if ((((f instanceof Composite)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15874)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15875)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(15876);return ((Composite)f).isParser();
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(15877);return true;
        }
        }__CLR4_4_1bzobzolc8aztgs.R.inc(15878);return false;
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    private boolean isFormatter(Object f) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15879);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15880);return (isPrinter(f) || isParser(f));
    }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    static void appendUnknownString(StringBuffer buf, int len) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15881);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15882);for (int i = len; (((--i >= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15883)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15884)==0&false));) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15885);buf.append('\ufffd');
        }
    }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    static void printUnknownString(Writer out, int len) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15886);
        __CLR4_4_1bzobzolc8aztgs.R.inc(15887);for (int i = len; (((--i >= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15888)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15889)==0&false));) {{
            __CLR4_4_1bzobzolc8aztgs.R.inc(15890);out.write('\ufffd');
        }
    }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static class CharacterLiteral
            implements DateTimePrinter, DateTimeParser {

        private final char iValue;

        CharacterLiteral(char value) {
            super();__CLR4_4_1bzobzolc8aztgs.R.inc(15892);try{__CLR4_4_1bzobzolc8aztgs.R.inc(15891);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15893);iValue = value;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15894);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15895);return 1;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                StringBuffer buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15896);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15897);buf.append(iValue);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                Writer out, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15898);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15899);out.write(iValue);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15900);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15901);buf.append(iValue);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15902);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15903);out.write(iValue);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15904);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15905);return 1;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15906);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15907);if ((((position >= text.length())&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15908)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15909)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(15910);return ~position;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(15911);char a = text.charAt(position);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15912);char b = iValue;

            __CLR4_4_1bzobzolc8aztgs.R.inc(15913);if ((((a != b)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15914)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15915)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(15916);a = Character.toUpperCase(a);
                __CLR4_4_1bzobzolc8aztgs.R.inc(15917);b = Character.toUpperCase(b);
                __CLR4_4_1bzobzolc8aztgs.R.inc(15918);if ((((a != b)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15919)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15920)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(15921);a = Character.toLowerCase(a);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(15922);b = Character.toLowerCase(b);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(15923);if ((((a != b)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15924)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15925)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(15926);return ~position;
                    }
                }}
            }}

            }__CLR4_4_1bzobzolc8aztgs.R.inc(15927);return position + 1;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class StringLiteral
            implements DateTimePrinter, DateTimeParser {

        private final String iValue;

        StringLiteral(String value) {
            super();__CLR4_4_1bzobzolc8aztgs.R.inc(15929);try{__CLR4_4_1bzobzolc8aztgs.R.inc(15928);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15930);iValue = value;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15931);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15932);return iValue.length();
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                StringBuffer buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15933);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15934);buf.append(iValue);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                Writer out, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15935);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15936);out.write(iValue);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15937);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15938);buf.append(iValue);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15939);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15940);out.write(iValue);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15941);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15942);return iValue.length();
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15943);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15944);if ((((text.regionMatches(true, position, iValue, 0, iValue.length()))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15945)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15946)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(15947);return position + iValue.length();
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(15948);return ~position;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static abstract class NumberFormatter
            implements DateTimePrinter, DateTimeParser {
        protected final DateTimeFieldType iFieldType;
        protected final int iMaxParsedDigits;
        protected final boolean iSigned;

        NumberFormatter(DateTimeFieldType fieldType,
                int maxParsedDigits, boolean signed) {
            super();__CLR4_4_1bzobzolc8aztgs.R.inc(15950);try{__CLR4_4_1bzobzolc8aztgs.R.inc(15949);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15951);iFieldType = fieldType;
            __CLR4_4_1bzobzolc8aztgs.R.inc(15952);iMaxParsedDigits = maxParsedDigits;
            __CLR4_4_1bzobzolc8aztgs.R.inc(15953);iSigned = signed;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15954);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15955);return iMaxParsedDigits;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(15956);
            __CLR4_4_1bzobzolc8aztgs.R.inc(15957);int limit = Math.min(iMaxParsedDigits, text.length() - position);

            __CLR4_4_1bzobzolc8aztgs.R.inc(15958);boolean negative = false;
            __CLR4_4_1bzobzolc8aztgs.R.inc(15959);int length = 0;
            __CLR4_4_1bzobzolc8aztgs.R.inc(15960);while ((((length < limit)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15961)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15962)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(15963);char c = text.charAt(position + length);
                __CLR4_4_1bzobzolc8aztgs.R.inc(15964);if ((((length == 0 && (c == '-' || c == '+') && iSigned)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15965)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15966)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(15967);negative = c == '-';

                    // Next character must be a digit.
                    __CLR4_4_1bzobzolc8aztgs.R.inc(15968);if (length + 1 >= limit || 
                        (c = text.charAt(position + length + 1)) < '0' || c > '9')
                    {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(15971);break;
                    }

                    }__CLR4_4_1bzobzolc8aztgs.R.inc(15972);if ((((negative)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15973)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15974)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(15975);length++;
                    } }else {{
                        // Skip the '+' for parseInt to succeed.
                        __CLR4_4_1bzobzolc8aztgs.R.inc(15976);position++;
                    }
                    // Expand the limit to disregard the sign character.
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(15977);limit = Math.min(limit + 1, text.length() - position);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(15978);continue;
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(15979);if ((((c < '0' || c > '9')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15980)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15981)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(15982);break;
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(15983);length++;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(15984);if ((((length == 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15985)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15986)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(15987);return ~position;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(15988);int value;
            __CLR4_4_1bzobzolc8aztgs.R.inc(15989);if ((((length >= 9)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15990)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15991)==0&false))) {{
                // Since value may exceed integer limits, use stock parser
                // which checks for this.
                __CLR4_4_1bzobzolc8aztgs.R.inc(15992);value = Integer.parseInt(text.substring(position, position += length));
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(15993);int i = position;
                __CLR4_4_1bzobzolc8aztgs.R.inc(15994);if ((((negative)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(15995)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(15996)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(15997);i++;
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(15998);try {
                    __CLR4_4_1bzobzolc8aztgs.R.inc(15999);value = text.charAt(i++) - '0';
                } catch (StringIndexOutOfBoundsException e) {
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16000);return ~position;
                }
                __CLR4_4_1bzobzolc8aztgs.R.inc(16001);position += length;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16002);while ((((i < position)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16003)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16004)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16005);value = ((value << 3) + (value << 1)) + text.charAt(i++) - '0';
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16006);if ((((negative)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16007)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16008)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16009);value = -value;
                }
            }}

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16010);bucket.saveField(iFieldType, value);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16011);return position;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class UnpaddedNumber extends NumberFormatter {

        protected UnpaddedNumber(DateTimeFieldType fieldType,
                       int maxParsedDigits, boolean signed)
        {
            super(fieldType, maxParsedDigits, signed);__CLR4_4_1bzobzolc8aztgs.R.inc(16013);try{__CLR4_4_1bzobzolc8aztgs.R.inc(16012);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16014);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16015);return iMaxParsedDigits;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                StringBuffer buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16016);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16017);try {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16018);DateTimeField field = iFieldType.getField(chrono);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16019);FormatUtils.appendUnpaddedInteger(buf, field.get(instant));
            } catch (RuntimeException e) {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16020);buf.append('\ufffd');
            }
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                Writer out, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16021);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16022);try {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16023);DateTimeField field = iFieldType.getField(chrono);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16024);FormatUtils.writeUnpaddedInteger(out, field.get(instant));
            } catch (RuntimeException e) {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16025);out.write('\ufffd');
            }
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16026);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16027);if ((((partial.isSupported(iFieldType))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16028)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16029)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16030);try {
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16031);FormatUtils.appendUnpaddedInteger(buf, partial.get(iFieldType));
                } catch (RuntimeException e) {
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16032);buf.append('\ufffd');
                }
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16033);buf.append('\ufffd');
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16034);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16035);if ((((partial.isSupported(iFieldType))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16036)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16037)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16038);try {
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16039);FormatUtils.writeUnpaddedInteger(out, partial.get(iFieldType));
                } catch (RuntimeException e) {
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16040);out.write('\ufffd');
                }
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16041);out.write('\ufffd');
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class PaddedNumber extends NumberFormatter {

        protected final int iMinPrintedDigits;

        protected PaddedNumber(DateTimeFieldType fieldType, int maxParsedDigits,
                     boolean signed, int minPrintedDigits)
        {
            super(fieldType, maxParsedDigits, signed);__CLR4_4_1bzobzolc8aztgs.R.inc(16043);try{__CLR4_4_1bzobzolc8aztgs.R.inc(16042);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16044);iMinPrintedDigits = minPrintedDigits;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16045);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16046);return iMaxParsedDigits;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                StringBuffer buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16047);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16048);try {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16049);DateTimeField field = iFieldType.getField(chrono);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16050);FormatUtils.appendPaddedInteger(buf, field.get(instant), iMinPrintedDigits);
            } catch (RuntimeException e) {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16051);appendUnknownString(buf, iMinPrintedDigits);
            }
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                Writer out, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16052);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16053);try {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16054);DateTimeField field = iFieldType.getField(chrono);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16055);FormatUtils.writePaddedInteger(out, field.get(instant), iMinPrintedDigits);
            } catch (RuntimeException e) {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16056);printUnknownString(out, iMinPrintedDigits);
            }
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16057);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16058);if ((((partial.isSupported(iFieldType))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16059)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16060)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16061);try {
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16062);FormatUtils.appendPaddedInteger(buf, partial.get(iFieldType), iMinPrintedDigits);
                } catch (RuntimeException e) {
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16063);appendUnknownString(buf, iMinPrintedDigits);
                }
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16064);appendUnknownString(buf, iMinPrintedDigits);
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16065);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16066);if ((((partial.isSupported(iFieldType))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16067)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16068)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16069);try {
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16070);FormatUtils.writePaddedInteger(out, partial.get(iFieldType), iMinPrintedDigits);
                } catch (RuntimeException e) {
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16071);printUnknownString(out, iMinPrintedDigits);
                }
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16072);printUnknownString(out, iMinPrintedDigits);
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class FixedNumber extends PaddedNumber {

        protected FixedNumber(DateTimeFieldType fieldType, int numDigits, boolean signed) {
            super(fieldType, numDigits, signed, numDigits);__CLR4_4_1bzobzolc8aztgs.R.inc(16074);try{__CLR4_4_1bzobzolc8aztgs.R.inc(16073);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16075);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16076);int newPos = super.parseInto(bucket, text, position);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16077);if ((((newPos < 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16078)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16079)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16080);return newPos;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16081);int expectedPos = position + iMaxParsedDigits;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16082);if ((((newPos != expectedPos)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16083)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16084)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16085);if ((((iSigned)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16086)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16087)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16088);char c = text.charAt(position);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16089);if ((((c == '-' || c == '+')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16090)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16091)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16092);expectedPos++;
                    }
                }}
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16093);if ((((newPos > expectedPos)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16094)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16095)==0&false))) {{
                    // The failure is at the position of the first extra digit.
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16096);return ~(expectedPos + 1);
                } }else {__CLR4_4_1bzobzolc8aztgs.R.inc(16097);if ((((newPos < expectedPos)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16098)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16099)==0&false))) {{
                    // The failure is at the position where the next digit should be.
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16100);return ~newPos;
                }
            }}}
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16101);return newPos;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class TwoDigitYear
            implements DateTimePrinter, DateTimeParser {

        /** The field to print/parse. */
        private final DateTimeFieldType iType;
        /** The pivot year. */
        private final int iPivot;
        private final boolean iLenientParse;

        TwoDigitYear(DateTimeFieldType type, int pivot, boolean lenientParse) {
            super();__CLR4_4_1bzobzolc8aztgs.R.inc(16103);try{__CLR4_4_1bzobzolc8aztgs.R.inc(16102);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16104);iType = type;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16105);iPivot = pivot;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16106);iLenientParse = lenientParse;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16107);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16108);return (((iLenientParse )&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16109)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16110)==0&false))? 4 : 2;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16111);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16112);int limit = text.length() - position;

            __CLR4_4_1bzobzolc8aztgs.R.inc(16113);if ((((!iLenientParse)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16114)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16115)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16116);limit = Math.min(2, limit);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16117);if ((((limit < 2)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16118)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16119)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16120);return ~position;
                }
            }} }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16121);boolean hasSignChar = false;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16122);boolean negative = false;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16123);int length = 0;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16124);while ((((length < limit)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16125)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16126)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16127);char c = text.charAt(position + length);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16128);if ((((length == 0 && (c == '-' || c == '+'))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16129)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16130)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16131);hasSignChar = true;
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16132);negative = c == '-';
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16133);if ((((negative)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16134)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16135)==0&false))) {{
                            __CLR4_4_1bzobzolc8aztgs.R.inc(16136);length++;
                        } }else {{
                            // Skip the '+' for parseInt to succeed.
                            __CLR4_4_1bzobzolc8aztgs.R.inc(16137);position++;
                            __CLR4_4_1bzobzolc8aztgs.R.inc(16138);limit--;
                        }
                        }__CLR4_4_1bzobzolc8aztgs.R.inc(16139);continue;
                    }
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(16140);if ((((c < '0' || c > '9')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16141)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16142)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16143);break;
                    }
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(16144);length++;
                }
                
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16145);if ((((length == 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16146)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16147)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16148);return ~position;
                }

                }__CLR4_4_1bzobzolc8aztgs.R.inc(16149);if ((((hasSignChar || length != 2)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16150)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16151)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16152);int value;
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16153);if ((((length >= 9)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16154)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16155)==0&false))) {{
                        // Since value may exceed integer limits, use stock
                        // parser which checks for this.
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16156);value = Integer.parseInt(text.substring(position, position += length));
                    } }else {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16157);int i = position;
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16158);if ((((negative)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16159)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16160)==0&false))) {{
                            __CLR4_4_1bzobzolc8aztgs.R.inc(16161);i++;
                        }
                        }__CLR4_4_1bzobzolc8aztgs.R.inc(16162);try {
                            __CLR4_4_1bzobzolc8aztgs.R.inc(16163);value = text.charAt(i++) - '0';
                        } catch (StringIndexOutOfBoundsException e) {
                            __CLR4_4_1bzobzolc8aztgs.R.inc(16164);return ~position;
                        }
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16165);position += length;
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16166);while ((((i < position)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16167)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16168)==0&false))) {{
                            __CLR4_4_1bzobzolc8aztgs.R.inc(16169);value = ((value << 3) + (value << 1)) + text.charAt(i++) - '0';
                        }
                        }__CLR4_4_1bzobzolc8aztgs.R.inc(16170);if ((((negative)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16171)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16172)==0&false))) {{
                            __CLR4_4_1bzobzolc8aztgs.R.inc(16173);value = -value;
                        }
                    }}
                    
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(16174);bucket.saveField(iType, value);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16175);return position;
                }
            }}

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16176);int year;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16177);char c = text.charAt(position);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16178);if ((((c < '0' || c > '9')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16179)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16180)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16181);return ~position;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16182);year = c - '0';
            __CLR4_4_1bzobzolc8aztgs.R.inc(16183);c = text.charAt(position + 1);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16184);if ((((c < '0' || c > '9')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16185)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16186)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16187);return ~position;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16188);year = ((year << 3) + (year << 1)) + c - '0';

            __CLR4_4_1bzobzolc8aztgs.R.inc(16189);int pivot = iPivot;
            // If the bucket pivot year is non-null, use that when parsing
            __CLR4_4_1bzobzolc8aztgs.R.inc(16190);if ((((bucket.getPivotYear() != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16191)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16192)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16193);pivot = bucket.getPivotYear().intValue();
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16194);int low = pivot - 50;

            __CLR4_4_1bzobzolc8aztgs.R.inc(16195);int t;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16196);if ((((low >= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16197)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16198)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16199);t = low % 100;
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16200);t = 99 + ((low + 1) % 100);
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16201);year += low + (((((year < t) )&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16202)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16203)==0&false))? 100 : 0) - t;

            __CLR4_4_1bzobzolc8aztgs.R.inc(16204);bucket.saveField(iType, year);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16205);return position + 2;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
        
        public int estimatePrintedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16206);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16207);return 2;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                StringBuffer buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16208);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16209);int year = getTwoDigitYear(instant, chrono);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16210);if ((((year < 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16211)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16212)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16213);buf.append('\ufffd');
                __CLR4_4_1bzobzolc8aztgs.R.inc(16214);buf.append('\ufffd');
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16215);FormatUtils.appendPaddedInteger(buf, year, 2);
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                Writer out, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16216);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16217);int year = getTwoDigitYear(instant, chrono);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16218);if ((((year < 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16219)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16220)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16221);out.write('\ufffd');
                __CLR4_4_1bzobzolc8aztgs.R.inc(16222);out.write('\ufffd');
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16223);FormatUtils.writePaddedInteger(out, year, 2);
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        private int getTwoDigitYear(long instant, Chronology chrono) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16224);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16225);try {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16226);int year = iType.getField(chrono).get(instant);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16227);if ((((year < 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16228)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16229)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16230);year = -year;
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16231);return year % 100;
            } catch (RuntimeException e) {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16232);return -1;
            }
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16233);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16234);int year = getTwoDigitYear(partial);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16235);if ((((year < 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16236)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16237)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16238);buf.append('\ufffd');
                __CLR4_4_1bzobzolc8aztgs.R.inc(16239);buf.append('\ufffd');
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16240);FormatUtils.appendPaddedInteger(buf, year, 2);
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16241);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16242);int year = getTwoDigitYear(partial);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16243);if ((((year < 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16244)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16245)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16246);out.write('\ufffd');
                __CLR4_4_1bzobzolc8aztgs.R.inc(16247);out.write('\ufffd');
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16248);FormatUtils.writePaddedInteger(out, year, 2);
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        private int getTwoDigitYear(ReadablePartial partial) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16249);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16250);if ((((partial.isSupported(iType))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16251)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16252)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16253);try {
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16254);int year = partial.get(iType);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16255);if ((((year < 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16256)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16257)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16258);year = -year;
                    }
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(16259);return year % 100;
                } catch (RuntimeException e) {}
            } 
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16260);return -1;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class TextField
            implements DateTimePrinter, DateTimeParser {

        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache =
                    new HashMap<Locale, Map<DateTimeFieldType, Object[]>>();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        TextField(DateTimeFieldType fieldType, boolean isShort) {
            super();__CLR4_4_1bzobzolc8aztgs.R.inc(16262);try{__CLR4_4_1bzobzolc8aztgs.R.inc(16261);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16263);iFieldType = fieldType;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16264);iShort = isShort;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16265);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16266);return (((iShort )&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16267)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16268)==0&false))? 6 : 20;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                StringBuffer buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16269);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16270);try {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16271);buf.append(print(instant, chrono, locale));
            } catch (RuntimeException e) {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16272);buf.append('\ufffd');
            }
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                Writer out, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16273);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16274);try {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16275);out.write(print(instant, chrono, locale));
            } catch (RuntimeException e) {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16276);out.write('\ufffd');
            }
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16277);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16278);try {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16279);buf.append(print(partial, locale));
            } catch (RuntimeException e) {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16280);buf.append('\ufffd');
            }
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16281);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16282);try {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16283);out.write(print(partial, locale));
            } catch (RuntimeException e) {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16284);out.write('\ufffd');
            }
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        private String print(long instant, Chronology chrono, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16285);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16286);DateTimeField field = iFieldType.getField(chrono);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16287);if ((((iShort)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16288)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16289)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16290);return field.getAsShortText(instant, locale);
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16291);return field.getAsText(instant, locale);
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        private String print(ReadablePartial partial, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16292);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16293);if ((((partial.isSupported(iFieldType))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16294)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16295)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16296);DateTimeField field = iFieldType.getField(partial.getChronology());
                __CLR4_4_1bzobzolc8aztgs.R.inc(16297);if ((((iShort)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16298)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16299)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16300);return field.getAsShortText(partial, locale);
                } }else {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16301);return field.getAsText(partial, locale);
                }
            }} }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16302);return "\ufffd";
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16303);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16304);return estimatePrintedLength();
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        @SuppressWarnings("unchecked")
        public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16305);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16306);Locale locale = bucket.getLocale();
            // handle languages which might have non ASCII A-Z or punctuation
            // bug 1788282
            __CLR4_4_1bzobzolc8aztgs.R.inc(16307);Set<String> validValues = null;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16308);int maxLength = 0;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16309);synchronized (cParseCache) {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16310);Map<DateTimeFieldType, Object[]> innerMap = cParseCache.get(locale);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16311);if ((((innerMap == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16312)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16313)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16314);innerMap = new HashMap<DateTimeFieldType, Object[]>();
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16315);cParseCache.put(locale, innerMap);
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16316);Object[] array = innerMap.get(iFieldType);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16317);if ((((array == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16318)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16319)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16320);validValues = new HashSet<String>(32);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16321);MutableDateTime dt = new MutableDateTime(0L, DateTimeZone.UTC);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16322);Property property = dt.property(iFieldType);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16323);int min = property.getMinimumValueOverall();
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16324);int max = property.getMaximumValueOverall();
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16325);if ((((max - min > 32)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16326)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16327)==0&false))) {{  // protect against invalid fields
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16328);return ~position;
                    }
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(16329);maxLength = property.getMaximumTextLength(locale);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16330);for (int i = min; (((i <= max)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16331)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16332)==0&false)); i++) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16333);property.set(i);
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16334);validValues.add(property.getAsShortText(locale));
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16335);validValues.add(property.getAsShortText(locale).toLowerCase(locale));
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16336);validValues.add(property.getAsShortText(locale).toUpperCase(locale));
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16337);validValues.add(property.getAsText(locale));
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16338);validValues.add(property.getAsText(locale).toLowerCase(locale));
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16339);validValues.add(property.getAsText(locale).toUpperCase(locale));
                    }
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(16340);if (((("en".equals(locale.getLanguage()) && iFieldType == DateTimeFieldType.era())&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16341)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16342)==0&false))) {{
                        // hack to support for parsing "BCE" and "CE" if the language is English
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16343);validValues.add("BCE");
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16344);validValues.add("bce");
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16345);validValues.add("CE");
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16346);validValues.add("ce");
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16347);maxLength = 3;
                    }
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(16348);array = new Object[] {validValues, Integer.valueOf(maxLength)};
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16349);innerMap.put(iFieldType, array);
                } }else {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16350);validValues = (Set<String>) array[0];
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16351);maxLength = ((Integer) array[1]).intValue();
                }
            }}
            // match the longest string first using our knowledge of the max length
            __CLR4_4_1bzobzolc8aztgs.R.inc(16352);int limit = Math.min(text.length(), position + maxLength);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16353);for (int i = limit; (((i > position)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16354)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16355)==0&false)); i--) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16356);String match = text.substring(position, i);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16357);if ((((validValues.contains(match))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16358)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16359)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16360);bucket.saveField(iFieldType, match, locale);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16361);return i;
                }
            }}
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16362);return ~position;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class Fraction
            implements DateTimePrinter, DateTimeParser {

        private final DateTimeFieldType iFieldType;
        protected int iMinDigits;
        protected int iMaxDigits;

        protected Fraction(DateTimeFieldType fieldType, int minDigits, int maxDigits) {
            super();__CLR4_4_1bzobzolc8aztgs.R.inc(16364);try{__CLR4_4_1bzobzolc8aztgs.R.inc(16363);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16365);iFieldType = fieldType;
            // Limit the precision requirements.
            __CLR4_4_1bzobzolc8aztgs.R.inc(16366);if ((((maxDigits > 18)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16367)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16368)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16369);maxDigits = 18;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16370);iMinDigits = minDigits;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16371);iMaxDigits = maxDigits;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16372);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16373);return iMaxDigits;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                StringBuffer buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16374);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16375);try {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16376);printTo(buf, null, instant, chrono);
            } catch (IOException e) {
                // Not gonna happen.
            }
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                Writer out, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16377);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16378);printTo(null, out, instant, chrono);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16379);
            // removed check whether field is supported, as input field is typically
            // secondOfDay which is unsupported by TimeOfDay
            __CLR4_4_1bzobzolc8aztgs.R.inc(16380);long millis = partial.getChronology().set(partial, 0L);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16381);try {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16382);printTo(buf, null, millis, partial.getChronology());
            } catch (IOException e) {
                // Not gonna happen.
            }
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16383);
            // removed check whether field is supported, as input field is typically
            // secondOfDay which is unsupported by TimeOfDay
            __CLR4_4_1bzobzolc8aztgs.R.inc(16384);long millis = partial.getChronology().set(partial, 0L);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16385);printTo(null, out, millis, partial.getChronology());
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        protected void printTo(StringBuffer buf, Writer out, long instant, Chronology chrono)
            throws IOException
        {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16386);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16387);DateTimeField field = iFieldType.getField(chrono);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16388);int minDigits = iMinDigits;

            __CLR4_4_1bzobzolc8aztgs.R.inc(16389);long fraction;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16390);try {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16391);fraction = field.remainder(instant);
            } catch (RuntimeException e) {
                __CLR4_4_1bzobzolc8aztgs.R.inc(16392);if ((((buf != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16393)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16394)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16395);appendUnknownString(buf, minDigits);
                } }else {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16396);printUnknownString(out, minDigits);
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16397);return;
            }

            __CLR4_4_1bzobzolc8aztgs.R.inc(16398);if ((((fraction == 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16399)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16400)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16401);if ((((buf != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16402)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16403)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16404);while ((((--minDigits >= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16405)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16406)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16407);buf.append('0');
                    }
                }} }else {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16408);while ((((--minDigits >= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16409)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16410)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16411);out.write('0');
                    }
                }}
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16412);return;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16413);String str;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16414);long[] fractionData = getFractionData(fraction, field);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16415);long scaled = fractionData[0];
            __CLR4_4_1bzobzolc8aztgs.R.inc(16416);int maxDigits = (int) fractionData[1];
            
            __CLR4_4_1bzobzolc8aztgs.R.inc(16417);if (((((scaled & 0x7fffffff) == scaled)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16418)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16419)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16420);str = Integer.toString((int) scaled);
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16421);str = Long.toString(scaled);
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16422);int length = str.length();
            __CLR4_4_1bzobzolc8aztgs.R.inc(16423);int digits = maxDigits;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16424);while ((((length < digits)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16425)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16426)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16427);if ((((buf != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16428)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16429)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16430);buf.append('0');
                } }else {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16431);out.write('0');
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16432);minDigits--;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16433);digits--;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16434);if ((((minDigits < digits)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16435)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16436)==0&false))) {{
                // Chop off as many trailing zero digits as necessary.
                __CLR4_4_1bzobzolc8aztgs.R.inc(16437);while ((((minDigits < digits)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16438)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16439)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16440);if ((((length <= 1 || str.charAt(length - 1) != '0')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16441)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16442)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16443);break;
                    }
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(16444);digits--;
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16445);length--;
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16446);if ((((length < str.length())&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16447)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16448)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16449);if ((((buf != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16450)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16451)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16452);for (int i=0; (((i<length)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16453)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16454)==0&false)); i++) {{
                            __CLR4_4_1bzobzolc8aztgs.R.inc(16455);buf.append(str.charAt(i));
                        }
                    }} }else {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16456);for (int i=0; (((i<length)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16457)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16458)==0&false)); i++) {{
                            __CLR4_4_1bzobzolc8aztgs.R.inc(16459);out.write(str.charAt(i));
                        }
                    }}
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(16460);return;
                }
            }}

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16461);if ((((buf != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16462)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16463)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16464);buf.append(str);
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16465);out.write(str);
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
        
        private long[] getFractionData(long fraction, DateTimeField field) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16466);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16467);long rangeMillis = field.getDurationField().getUnitMillis();
            __CLR4_4_1bzobzolc8aztgs.R.inc(16468);long scalar;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16469);int maxDigits = iMaxDigits;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16470);while (true) {{
                boolean __CLB4_4_1_bool1=false;__CLR4_4_1bzobzolc8aztgs.R.inc(16471);switch (maxDigits) {
                default:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16472);__CLB4_4_1_bool1=true;} __CLR4_4_1bzobzolc8aztgs.R.inc(16473);scalar = 1L; __CLR4_4_1bzobzolc8aztgs.R.inc(16474);break;
                case 1:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16475);__CLB4_4_1_bool1=true;}  __CLR4_4_1bzobzolc8aztgs.R.inc(16476);scalar = 10L; __CLR4_4_1bzobzolc8aztgs.R.inc(16477);break;
                case 2:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16478);__CLB4_4_1_bool1=true;}  __CLR4_4_1bzobzolc8aztgs.R.inc(16479);scalar = 100L; __CLR4_4_1bzobzolc8aztgs.R.inc(16480);break;
                case 3:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16481);__CLB4_4_1_bool1=true;}  __CLR4_4_1bzobzolc8aztgs.R.inc(16482);scalar = 1000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16483);break;
                case 4:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16484);__CLB4_4_1_bool1=true;}  __CLR4_4_1bzobzolc8aztgs.R.inc(16485);scalar = 10000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16486);break;
                case 5:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16487);__CLB4_4_1_bool1=true;}  __CLR4_4_1bzobzolc8aztgs.R.inc(16488);scalar = 100000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16489);break;
                case 6:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16490);__CLB4_4_1_bool1=true;}  __CLR4_4_1bzobzolc8aztgs.R.inc(16491);scalar = 1000000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16492);break;
                case 7:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16493);__CLB4_4_1_bool1=true;}  __CLR4_4_1bzobzolc8aztgs.R.inc(16494);scalar = 10000000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16495);break;
                case 8:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16496);__CLB4_4_1_bool1=true;}  __CLR4_4_1bzobzolc8aztgs.R.inc(16497);scalar = 100000000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16498);break;
                case 9:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16499);__CLB4_4_1_bool1=true;}  __CLR4_4_1bzobzolc8aztgs.R.inc(16500);scalar = 1000000000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16501);break;
                case 10:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16502);__CLB4_4_1_bool1=true;} __CLR4_4_1bzobzolc8aztgs.R.inc(16503);scalar = 10000000000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16504);break;
                case 11:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16505);__CLB4_4_1_bool1=true;} __CLR4_4_1bzobzolc8aztgs.R.inc(16506);scalar = 100000000000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16507);break;
                case 12:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16508);__CLB4_4_1_bool1=true;} __CLR4_4_1bzobzolc8aztgs.R.inc(16509);scalar = 1000000000000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16510);break;
                case 13:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16511);__CLB4_4_1_bool1=true;} __CLR4_4_1bzobzolc8aztgs.R.inc(16512);scalar = 10000000000000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16513);break;
                case 14:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16514);__CLB4_4_1_bool1=true;} __CLR4_4_1bzobzolc8aztgs.R.inc(16515);scalar = 100000000000000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16516);break;
                case 15:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16517);__CLB4_4_1_bool1=true;} __CLR4_4_1bzobzolc8aztgs.R.inc(16518);scalar = 1000000000000000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16519);break;
                case 16:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16520);__CLB4_4_1_bool1=true;} __CLR4_4_1bzobzolc8aztgs.R.inc(16521);scalar = 10000000000000000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16522);break;
                case 17:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16523);__CLB4_4_1_bool1=true;} __CLR4_4_1bzobzolc8aztgs.R.inc(16524);scalar = 100000000000000000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16525);break;
                case 18:if (!__CLB4_4_1_bool1) {__CLR4_4_1bzobzolc8aztgs.R.inc(16526);__CLB4_4_1_bool1=true;} __CLR4_4_1bzobzolc8aztgs.R.inc(16527);scalar = 1000000000000000000L; __CLR4_4_1bzobzolc8aztgs.R.inc(16528);break;
                }
                __CLR4_4_1bzobzolc8aztgs.R.inc(16529);if ((((((rangeMillis * scalar) / scalar) == rangeMillis)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16530)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16531)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16532);break;
                }
                // Overflowed: scale down.
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16533);maxDigits--;
            }
            
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16534);return new long[] {fraction * scalar / rangeMillis, maxDigits};
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16535);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16536);return iMaxDigits;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16537);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16538);DateTimeField field = iFieldType.getField(bucket.getChronology());
            
            __CLR4_4_1bzobzolc8aztgs.R.inc(16539);int limit = Math.min(iMaxDigits, text.length() - position);

            __CLR4_4_1bzobzolc8aztgs.R.inc(16540);long value = 0;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16541);long n = field.getDurationField().getUnitMillis() * 10;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16542);int length = 0;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16543);while ((((length < limit)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16544)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16545)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16546);char c = text.charAt(position + length);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16547);if ((((c < '0' || c > '9')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16548)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16549)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16550);break;
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16551);length++;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16552);long nn = n / 10;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16553);value += (c - '0') * nn;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16554);n = nn;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16555);value /= 10;

            __CLR4_4_1bzobzolc8aztgs.R.inc(16556);if ((((length == 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16557)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16558)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16559);return ~position;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16560);if ((((value > Integer.MAX_VALUE)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16561)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16562)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16563);return ~position;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16564);DateTimeField parseField = new PreciseDateTimeField(
                DateTimeFieldType.millisOfSecond(),
                MillisDurationField.INSTANCE,
                field.getDurationField());

            __CLR4_4_1bzobzolc8aztgs.R.inc(16565);bucket.saveField(parseField, (int) value);

            __CLR4_4_1bzobzolc8aztgs.R.inc(16566);return position + length;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class TimeZoneOffset
            implements DateTimePrinter, DateTimeParser {

        private final String iZeroOffsetPrintText;
        private final String iZeroOffsetParseText;
        private final boolean iShowSeparators;
        private final int iMinFields;
        private final int iMaxFields;

        TimeZoneOffset(String zeroOffsetPrintText, String zeroOffsetParseText,
                                boolean showSeparators,
                                int minFields, int maxFields)
        {
            super();__CLR4_4_1bzobzolc8aztgs.R.inc(16568);try{__CLR4_4_1bzobzolc8aztgs.R.inc(16567);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16569);iZeroOffsetPrintText = zeroOffsetPrintText;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16570);iZeroOffsetParseText = zeroOffsetParseText;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16571);iShowSeparators = showSeparators;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16572);if ((((minFields <= 0 || maxFields < minFields)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16573)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16574)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16575);throw new IllegalArgumentException();
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16576);if ((((minFields > 4)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16577)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16578)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16579);minFields = 4;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16580);maxFields = 4;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16581);iMinFields = minFields;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16582);iMaxFields = maxFields;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
            
        public int estimatePrintedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16583);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16584);int est = 1 + iMinFields << 1;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16585);if ((((iShowSeparators)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16586)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16587)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16588);est += iMinFields - 1;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16589);if ((((iZeroOffsetPrintText != null && iZeroOffsetPrintText.length() > est)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16590)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16591)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16592);est = iZeroOffsetPrintText.length();
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16593);return est;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
        
        public void printTo(
                StringBuffer buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16594);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16595);if ((((displayZone == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16596)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16597)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16598);return;  // no zone
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16599);if ((((displayOffset == 0 && iZeroOffsetPrintText != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16600)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16601)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16602);buf.append(iZeroOffsetPrintText);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16603);return;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16604);if ((((displayOffset >= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16605)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16606)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16607);buf.append('+');
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16608);buf.append('-');
                __CLR4_4_1bzobzolc8aztgs.R.inc(16609);displayOffset = -displayOffset;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16610);int hours = displayOffset / DateTimeConstants.MILLIS_PER_HOUR;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16611);FormatUtils.appendPaddedInteger(buf, hours, 2);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16612);if ((((iMaxFields == 1)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16613)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16614)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16615);return;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16616);displayOffset -= hours * (int)DateTimeConstants.MILLIS_PER_HOUR;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16617);if ((((displayOffset == 0 && iMinFields <= 1)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16618)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16619)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16620);return;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16621);int minutes = displayOffset / DateTimeConstants.MILLIS_PER_MINUTE;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16622);if ((((iShowSeparators)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16623)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16624)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16625);buf.append(':');
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16626);FormatUtils.appendPaddedInteger(buf, minutes, 2);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16627);if ((((iMaxFields == 2)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16628)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16629)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16630);return;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16631);displayOffset -= minutes * DateTimeConstants.MILLIS_PER_MINUTE;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16632);if ((((displayOffset == 0 && iMinFields <= 2)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16633)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16634)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16635);return;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16636);int seconds = displayOffset / DateTimeConstants.MILLIS_PER_SECOND;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16637);if ((((iShowSeparators)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16638)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16639)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16640);buf.append(':');
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16641);FormatUtils.appendPaddedInteger(buf, seconds, 2);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16642);if ((((iMaxFields == 3)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16643)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16644)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16645);return;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16646);displayOffset -= seconds * DateTimeConstants.MILLIS_PER_SECOND;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16647);if ((((displayOffset == 0 && iMinFields <= 3)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16648)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16649)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16650);return;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16651);if ((((iShowSeparators)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16652)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16653)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16654);buf.append('.');
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16655);FormatUtils.appendPaddedInteger(buf, displayOffset, 3);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
        
        public void printTo(
                Writer out, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16656);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16657);if ((((displayZone == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16658)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16659)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16660);return;  // no zone
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16661);if ((((displayOffset == 0 && iZeroOffsetPrintText != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16662)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16663)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16664);out.write(iZeroOffsetPrintText);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16665);return;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16666);if ((((displayOffset >= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16667)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16668)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16669);out.write('+');
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16670);out.write('-');
                __CLR4_4_1bzobzolc8aztgs.R.inc(16671);displayOffset = -displayOffset;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16672);int hours = displayOffset / DateTimeConstants.MILLIS_PER_HOUR;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16673);FormatUtils.writePaddedInteger(out, hours, 2);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16674);if ((((iMaxFields == 1)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16675)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16676)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16677);return;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16678);displayOffset -= hours * (int)DateTimeConstants.MILLIS_PER_HOUR;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16679);if ((((displayOffset == 0 && iMinFields == 1)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16680)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16681)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16682);return;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16683);int minutes = displayOffset / DateTimeConstants.MILLIS_PER_MINUTE;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16684);if ((((iShowSeparators)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16685)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16686)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16687);out.write(':');
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16688);FormatUtils.writePaddedInteger(out, minutes, 2);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16689);if ((((iMaxFields == 2)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16690)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16691)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16692);return;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16693);displayOffset -= minutes * DateTimeConstants.MILLIS_PER_MINUTE;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16694);if ((((displayOffset == 0 && iMinFields == 2)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16695)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16696)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16697);return;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16698);int seconds = displayOffset / DateTimeConstants.MILLIS_PER_SECOND;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16699);if ((((iShowSeparators)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16700)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16701)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16702);out.write(':');
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16703);FormatUtils.writePaddedInteger(out, seconds, 2);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16704);if ((((iMaxFields == 3)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16705)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16706)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16707);return;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16708);displayOffset -= seconds * DateTimeConstants.MILLIS_PER_SECOND;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16709);if ((((displayOffset == 0 && iMinFields == 3)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16710)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16711)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16712);return;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16713);if ((((iShowSeparators)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16714)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16715)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16716);out.write('.');
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16717);FormatUtils.writePaddedInteger(out, displayOffset, 3);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16718);
            // no zone info
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16719);
            // no zone info
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16720);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16721);return estimatePrintedLength();
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16722);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16723);int limit = text.length() - position;

            __CLR4_4_1bzobzolc8aztgs.R.inc(16724);zeroOffset:
            if ((((iZeroOffsetParseText != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16725)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16726)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16727);if ((((iZeroOffsetParseText.length() == 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16728)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16729)==0&false))) {{
                    // Peek ahead, looking for sign character.
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16730);if ((((limit > 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16731)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16732)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16733);char c = text.charAt(position);
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16734);if ((((c == '-' || c == '+')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16735)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16736)==0&false))) {{
                            __CLR4_4_1bzobzolc8aztgs.R.inc(16737);break zeroOffset;
                        }
                    }}
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(16738);bucket.setOffset(Integer.valueOf(0));
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16739);return position;
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16740);if ((((text.regionMatches(true, position, iZeroOffsetParseText, 0, iZeroOffsetParseText.length()))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16741)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16742)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16743);bucket.setOffset(Integer.valueOf(0));
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16744);return position + iZeroOffsetParseText.length();
                }
            }}

            // Format to expect is sign character followed by at least one digit.

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16745);if ((((limit <= 1)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16746)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16747)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16748);return ~position;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16749);boolean negative;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16750);char c = text.charAt(position);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16751);if ((((c == '-')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16752)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16753)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16754);negative = true;
            } }else {__CLR4_4_1bzobzolc8aztgs.R.inc(16755);if ((((c == '+')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16756)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16757)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16758);negative = false;
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16759);return ~position;
            }

            }}__CLR4_4_1bzobzolc8aztgs.R.inc(16760);limit--;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16761);position++;

            // Format following sign is one of:
            //
            // hh
            // hhmm
            // hhmmss
            // hhmmssSSS
            // hh:mm
            // hh:mm:ss
            // hh:mm:ss.SSS

            // First parse hours.

            __CLR4_4_1bzobzolc8aztgs.R.inc(16762);if ((((digitCount(text, position, 2) < 2)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16763)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16764)==0&false))) {{
                // Need two digits for hour.
                __CLR4_4_1bzobzolc8aztgs.R.inc(16765);return ~position;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16766);int offset;

            __CLR4_4_1bzobzolc8aztgs.R.inc(16767);int hours = FormatUtils.parseTwoDigits(text, position);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16768);if ((((hours > 23)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16769)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16770)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16771);return ~position;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16772);offset = hours * DateTimeConstants.MILLIS_PER_HOUR;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16773);limit -= 2;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16774);position += 2;

            __CLR4_4_1bzobzolc8aztgs.R.inc(16775);parse: {
                // Need to decide now if separators are expected or parsing
                // stops at hour field.

                __CLR4_4_1bzobzolc8aztgs.R.inc(16776);if ((((limit <= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16777)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16778)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16779);break parse;
                }

                }__CLR4_4_1bzobzolc8aztgs.R.inc(16780);boolean expectSeparators;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16781);c = text.charAt(position);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16782);if ((((c == ':')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16783)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16784)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16785);expectSeparators = true;
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16786);limit--;
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16787);position++;
                } }else {__CLR4_4_1bzobzolc8aztgs.R.inc(16788);if ((((c >= '0' && c <= '9')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16789)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16790)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16791);expectSeparators = false;
                } }else {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16792);break parse;
                }

                // Proceed to parse minutes.

                }}__CLR4_4_1bzobzolc8aztgs.R.inc(16793);int count = digitCount(text, position, 2);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16794);if ((((count == 0 && !expectSeparators)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16795)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16796)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16797);break parse;
                } }else {__CLR4_4_1bzobzolc8aztgs.R.inc(16798);if ((((count < 2)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16799)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16800)==0&false))) {{
                    // Need two digits for minute.
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16801);return ~position;
                }

                }}__CLR4_4_1bzobzolc8aztgs.R.inc(16802);int minutes = FormatUtils.parseTwoDigits(text, position);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16803);if ((((minutes > 59)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16804)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16805)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16806);return ~position;
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16807);offset += minutes * DateTimeConstants.MILLIS_PER_MINUTE;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16808);limit -= 2;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16809);position += 2;

                // Proceed to parse seconds.

                __CLR4_4_1bzobzolc8aztgs.R.inc(16810);if ((((limit <= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16811)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16812)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16813);break parse;
                }

                }__CLR4_4_1bzobzolc8aztgs.R.inc(16814);if ((((expectSeparators)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16815)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16816)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16817);if ((((text.charAt(position) != ':')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16818)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16819)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16820);break parse;
                    }
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(16821);limit--;
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16822);position++;
                }

                }__CLR4_4_1bzobzolc8aztgs.R.inc(16823);count = digitCount(text, position, 2);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16824);if ((((count == 0 && !expectSeparators)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16825)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16826)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16827);break parse;
                } }else {__CLR4_4_1bzobzolc8aztgs.R.inc(16828);if ((((count < 2)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16829)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16830)==0&false))) {{
                    // Need two digits for second.
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16831);return ~position;
                }

                }}__CLR4_4_1bzobzolc8aztgs.R.inc(16832);int seconds = FormatUtils.parseTwoDigits(text, position);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16833);if ((((seconds > 59)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16834)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16835)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16836);return ~position;
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16837);offset += seconds * DateTimeConstants.MILLIS_PER_SECOND;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16838);limit -= 2;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16839);position += 2;

                // Proceed to parse fraction of second.

                __CLR4_4_1bzobzolc8aztgs.R.inc(16840);if ((((limit <= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16841)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16842)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16843);break parse;
                }

                }__CLR4_4_1bzobzolc8aztgs.R.inc(16844);if ((((expectSeparators)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16845)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16846)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16847);if ((((text.charAt(position) != '.' && text.charAt(position) != ',')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16848)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16849)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16850);break parse;
                    }
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(16851);limit--;
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16852);position++;
                }
                
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16853);count = digitCount(text, position, 3);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16854);if ((((count == 0 && !expectSeparators)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16855)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16856)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16857);break parse;
                } }else {__CLR4_4_1bzobzolc8aztgs.R.inc(16858);if ((((count < 1)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16859)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16860)==0&false))) {{
                    // Need at least one digit for fraction of second.
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16861);return ~position;
                }

                }}__CLR4_4_1bzobzolc8aztgs.R.inc(16862);offset += (text.charAt(position++) - '0') * 100;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16863);if ((((count > 1)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16864)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16865)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16866);offset += (text.charAt(position++) - '0') * 10;
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16867);if ((((count > 2)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16868)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16869)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16870);offset += text.charAt(position++) - '0';
                    }
                }}
            }}

            __CLR4_4_1bzobzolc8aztgs.R.inc(16871);bucket.setOffset(Integer.valueOf((((negative )&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16872)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16873)==0&false))? -offset : offset));
            __CLR4_4_1bzobzolc8aztgs.R.inc(16874);return position;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        /**
         * Returns actual amount of digits to parse, but no more than original
         * 'amount' parameter.
         */
        private int digitCount(String text, int position, int amount) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16875);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16876);int limit = Math.min(text.length() - position, amount);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16877);amount = 0;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16878);for (; (((limit > 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16879)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16880)==0&false)); limit--) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16881);char c = text.charAt(position + amount);
                __CLR4_4_1bzobzolc8aztgs.R.inc(16882);if ((((c < '0' || c > '9')&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16883)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16884)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16885);break;
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16886);amount++;
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16887);return amount;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class TimeZoneName
            implements DateTimePrinter, DateTimeParser {

        static final int LONG_NAME = 0;
        static final int SHORT_NAME = 1;

        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        TimeZoneName(int type, Map<String, DateTimeZone> parseLookup) {
            super();__CLR4_4_1bzobzolc8aztgs.R.inc(16889);try{__CLR4_4_1bzobzolc8aztgs.R.inc(16888);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16890);iType = type;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16891);iParseLookup = parseLookup;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16892);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16893);return ((((iType == SHORT_NAME )&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16894)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16895)==0&false))? 4 : 20);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                StringBuffer buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16896);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16897);buf.append(print(instant - displayOffset, displayZone, locale));
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                Writer out, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16898);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16899);out.write(print(instant - displayOffset, displayZone, locale));
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        private String print(long instant, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16900);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16901);if ((((displayZone == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16902)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16903)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16904);return "";  // no zone
            }
            }boolean __CLB4_4_1_bool2=false;__CLR4_4_1bzobzolc8aztgs.R.inc(16905);switch (iType) {
                case LONG_NAME:if (!__CLB4_4_1_bool2) {__CLR4_4_1bzobzolc8aztgs.R.inc(16906);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16907);return displayZone.getName(instant, locale);
                case SHORT_NAME:if (!__CLB4_4_1_bool2) {__CLR4_4_1bzobzolc8aztgs.R.inc(16908);__CLB4_4_1_bool2=true;}
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16909);return displayZone.getShortName(instant, locale);
            }
            __CLR4_4_1bzobzolc8aztgs.R.inc(16910);return "";
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16911);
            // no zone info
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16912);
            // no zone info
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16913);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16914);return ((((iType == SHORT_NAME )&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16915)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16916)==0&false))? 4 : 20);
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16917);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16918);Map<String, DateTimeZone> parseLookup = iParseLookup;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16919);parseLookup = ((((parseLookup != null )&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16920)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16921)==0&false))? parseLookup : DateTimeUtils.getDefaultTimeZoneNames());
            __CLR4_4_1bzobzolc8aztgs.R.inc(16922);String str = text.substring(position);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16923);String matched = null;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16924);for (String name : parseLookup.keySet()) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16925);if ((((str.startsWith(name))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16926)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16927)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16928);if ((((matched == null || name.length() > matched.length())&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16929)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16930)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16931);matched = name;
                    }
                }}
            }}
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16932);if ((((matched != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16933)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16934)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16935);bucket.setZone(parseLookup.get(matched));
                __CLR4_4_1bzobzolc8aztgs.R.inc(16936);return position + matched.length();
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16937);return ~position;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static enum TimeZoneId
            implements DateTimePrinter, DateTimeParser {

        INSTANCE;
        static final Set<String> ALL_IDS = DateTimeZone.getAvailableIDs();
        static final int MAX_LENGTH;
        static {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16938);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16939);int max = 0;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16940);for (String id : ALL_IDS) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16941);max = Math.max(max, id.length());
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16942);MAX_LENGTH = max;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16943);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16944);return MAX_LENGTH;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                StringBuffer buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16945);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16946);buf.append((((displayZone != null )&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16947)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16948)==0&false))? displayZone.getID() : "");
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                Writer out, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16949);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16950);out.write((((displayZone != null )&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16951)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16952)==0&false))? displayZone.getID() : "");
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16953);
            // no zone info
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16954);
            // no zone info
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16955);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16956);return MAX_LENGTH;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(16957);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16958);String str = text.substring(position);
            __CLR4_4_1bzobzolc8aztgs.R.inc(16959);String best = null;
            __CLR4_4_1bzobzolc8aztgs.R.inc(16960);for (String id : ALL_IDS) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16961);if ((((str.startsWith(id))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16962)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16963)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16964);if ((((best == null || id.length() > best.length())&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16965)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16966)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(16967);best = id;
                    }
                }}
            }}
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16968);if ((((best != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16969)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16970)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16971);bucket.setZone(DateTimeZone.forID(best));
                __CLR4_4_1bzobzolc8aztgs.R.inc(16972);return position + best.length();
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(16973);return ~position;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class Composite
            implements DateTimePrinter, DateTimeParser {

        private final DateTimePrinter[] iPrinters;
        private final DateTimeParser[] iParsers;

        private final int iPrintedLengthEstimate;
        private final int iParsedLengthEstimate;

        Composite(List<Object> elementPairs) {
            super();__CLR4_4_1bzobzolc8aztgs.R.inc(16975);try{__CLR4_4_1bzobzolc8aztgs.R.inc(16974);

            __CLR4_4_1bzobzolc8aztgs.R.inc(16976);List<Object> printerList = new ArrayList<Object>();
            __CLR4_4_1bzobzolc8aztgs.R.inc(16977);List<Object> parserList = new ArrayList<Object>();

            __CLR4_4_1bzobzolc8aztgs.R.inc(16978);decompose(elementPairs, printerList, parserList);

            __CLR4_4_1bzobzolc8aztgs.R.inc(16979);if ((((printerList.contains(null) || printerList.isEmpty())&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16980)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16981)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16982);iPrinters = null;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16983);iPrintedLengthEstimate = 0;
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16984);int size = printerList.size();
                __CLR4_4_1bzobzolc8aztgs.R.inc(16985);iPrinters = new DateTimePrinter[size];
                __CLR4_4_1bzobzolc8aztgs.R.inc(16986);int printEst = 0;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16987);for (int i=0; (((i<size)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16988)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16989)==0&false)); i++) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16990);DateTimePrinter printer = (DateTimePrinter) printerList.get(i);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16991);printEst += printer.estimatePrintedLength();
                    __CLR4_4_1bzobzolc8aztgs.R.inc(16992);iPrinters[i] = printer;
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(16993);iPrintedLengthEstimate = printEst;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(16994);if ((((parserList.contains(null) || parserList.isEmpty())&&(__CLR4_4_1bzobzolc8aztgs.R.iget(16995)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(16996)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16997);iParsers = null;
                __CLR4_4_1bzobzolc8aztgs.R.inc(16998);iParsedLengthEstimate = 0;
            } }else {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(16999);int size = parserList.size();
                __CLR4_4_1bzobzolc8aztgs.R.inc(17000);iParsers = new DateTimeParser[size];
                __CLR4_4_1bzobzolc8aztgs.R.inc(17001);int parseEst = 0;
                __CLR4_4_1bzobzolc8aztgs.R.inc(17002);for (int i=0; (((i<size)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17003)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17004)==0&false)); i++) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17005);DateTimeParser parser = (DateTimeParser) parserList.get(i);
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17006);parseEst += parser.estimateParsedLength();
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17007);iParsers[i] = parser;
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(17008);iParsedLengthEstimate = parseEst;
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(17009);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17010);return iPrintedLengthEstimate;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                StringBuffer buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(17011);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17012);DateTimePrinter[] elements = iPrinters;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17013);if ((((elements == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17014)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17015)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17016);throw new UnsupportedOperationException();
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(17017);if ((((locale == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17018)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17019)==0&false))) {{
                // Guard against default locale changing concurrently.
                __CLR4_4_1bzobzolc8aztgs.R.inc(17020);locale = Locale.getDefault();
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(17021);int len = elements.length;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17022);for (int i = 0; (((i < len)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17023)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17024)==0&false)); i++) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17025);elements[i].printTo(buf, instant, chrono, displayOffset, displayZone, locale);
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(
                Writer out, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(17026);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17027);DateTimePrinter[] elements = iPrinters;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17028);if ((((elements == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17029)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17030)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17031);throw new UnsupportedOperationException();
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(17032);if ((((locale == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17033)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17034)==0&false))) {{
                // Guard against default locale changing concurrently.
                __CLR4_4_1bzobzolc8aztgs.R.inc(17035);locale = Locale.getDefault();
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(17036);int len = elements.length;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17037);for (int i = 0; (((i < len)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17038)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17039)==0&false)); i++) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17040);elements[i].printTo(out, instant, chrono, displayOffset, displayZone, locale);
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(17041);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17042);DateTimePrinter[] elements = iPrinters;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17043);if ((((elements == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17044)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17045)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17046);throw new UnsupportedOperationException();
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(17047);if ((((locale == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17048)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17049)==0&false))) {{
                // Guard against default locale changing concurrently.
                __CLR4_4_1bzobzolc8aztgs.R.inc(17050);locale = Locale.getDefault();
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(17051);int len = elements.length;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17052);for (int i=0; (((i<len)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17053)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17054)==0&false)); i++) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17055);elements[i].printTo(buf, partial, locale);
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1bzobzolc8aztgs.R.inc(17056);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17057);DateTimePrinter[] elements = iPrinters;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17058);if ((((elements == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17059)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17060)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17061);throw new UnsupportedOperationException();
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(17062);if ((((locale == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17063)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17064)==0&false))) {{
                // Guard against default locale changing concurrently.
                __CLR4_4_1bzobzolc8aztgs.R.inc(17065);locale = Locale.getDefault();
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(17066);int len = elements.length;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17067);for (int i=0; (((i<len)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17068)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17069)==0&false)); i++) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17070);elements[i].printTo(out, partial, locale);
            }
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(17071);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17072);return iParsedLengthEstimate;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(17073);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17074);DateTimeParser[] elements = iParsers;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17075);if ((((elements == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17076)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17077)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17078);throw new UnsupportedOperationException();
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(17079);int len = elements.length;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17080);for (int i=0; (((i<len && position >= 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17081)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17082)==0&false)); i++) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17083);position = elements[i].parseInto(bucket, text, position);
            }
            }__CLR4_4_1bzobzolc8aztgs.R.inc(17084);return position;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        boolean isPrinter() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(17085);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17086);return iPrinters != null;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        boolean isParser() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(17087);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17088);return iParsers != null;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        /**
         * Processes the element pairs, putting results into the given printer
         * and parser lists.
         */
        private void decompose(List<Object> elementPairs, List<Object> printerList, List<Object> parserList) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(17089);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17090);int size = elementPairs.size();
            __CLR4_4_1bzobzolc8aztgs.R.inc(17091);for (int i=0; (((i<size)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17092)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17093)==0&false)); i+=2) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17094);Object element = elementPairs.get(i);
                __CLR4_4_1bzobzolc8aztgs.R.inc(17095);if ((((element instanceof Composite)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17096)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17097)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17098);addArrayToList(printerList, ((Composite)element).iPrinters);
                } }else {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17099);printerList.add(element);
                }

                }__CLR4_4_1bzobzolc8aztgs.R.inc(17100);element = elementPairs.get(i + 1);
                __CLR4_4_1bzobzolc8aztgs.R.inc(17101);if ((((element instanceof Composite)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17102)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17103)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17104);addArrayToList(parserList, ((Composite)element).iParsers);
                } }else {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17105);parserList.add(element);
                }
            }}
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        private void addArrayToList(List<Object> list, Object[] array) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(17106);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17107);if ((((array != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17108)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17109)==0&false))) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17110);for (int i=0; (((i<array.length)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17111)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17112)==0&false)); i++) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17113);list.add(array[i]);
                }
            }}
        }}finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MatchingParser
            implements DateTimeParser {

        private final DateTimeParser[] iParsers;
        private final int iParsedLengthEstimate;

        MatchingParser(DateTimeParser[] parsers) {
            super();__CLR4_4_1bzobzolc8aztgs.R.inc(17115);try{__CLR4_4_1bzobzolc8aztgs.R.inc(17114);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17116);iParsers = parsers;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17117);int est = 0;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17118);for (int i=parsers.length; (((--i>=0 )&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17119)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17120)==0&false));) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17121);DateTimeParser parser = parsers[i];
                __CLR4_4_1bzobzolc8aztgs.R.inc(17122);if ((((parser != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17123)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17124)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17125);int len = parser.estimateParsedLength();
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17126);if ((((len > est)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17127)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17128)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(17129);est = len;
                    }
                }}
            }}
            }__CLR4_4_1bzobzolc8aztgs.R.inc(17130);iParsedLengthEstimate = est;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1bzobzolc8aztgs.R.inc(17131);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17132);return iParsedLengthEstimate;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_1bzobzolc8aztgs.R.inc(17133);
            __CLR4_4_1bzobzolc8aztgs.R.inc(17134);DateTimeParser[] parsers = iParsers;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17135);int length = parsers.length;

            __CLR4_4_1bzobzolc8aztgs.R.inc(17136);final Object originalState = bucket.saveState();
            __CLR4_4_1bzobzolc8aztgs.R.inc(17137);boolean isOptional = false;

            __CLR4_4_1bzobzolc8aztgs.R.inc(17138);int bestValidPos = position;
            __CLR4_4_1bzobzolc8aztgs.R.inc(17139);Object bestValidState = null;

            __CLR4_4_1bzobzolc8aztgs.R.inc(17140);int bestInvalidPos = position;

            __CLR4_4_1bzobzolc8aztgs.R.inc(17141);for (int i=0; (((i<length)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17142)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17143)==0&false)); i++) {{
                __CLR4_4_1bzobzolc8aztgs.R.inc(17144);DateTimeParser parser = parsers[i];
                __CLR4_4_1bzobzolc8aztgs.R.inc(17145);if ((((parser == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17146)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17147)==0&false))) {{
                    // The empty parser wins only if nothing is better.
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17148);if ((((bestValidPos <= position)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17149)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17150)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(17151);return position;
                    }
                    }__CLR4_4_1bzobzolc8aztgs.R.inc(17152);isOptional = true;
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17153);break;
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(17154);int parsePos = parser.parseInto(bucket, text, position);
                __CLR4_4_1bzobzolc8aztgs.R.inc(17155);if ((((parsePos >= position)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17156)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17157)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17158);if ((((parsePos > bestValidPos)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17159)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17160)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(17161);if ((((parsePos >= text.length() ||
                            (i + 1) >= length || parsers[i + 1] == null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17162)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17163)==0&false))) {{

                            // Completely parsed text or no more parsers to
                            // check. Skip the rest.
                            __CLR4_4_1bzobzolc8aztgs.R.inc(17164);return parsePos;
                        }
                        }__CLR4_4_1bzobzolc8aztgs.R.inc(17165);bestValidPos = parsePos;
                        __CLR4_4_1bzobzolc8aztgs.R.inc(17166);bestValidState = bucket.saveState();
                    }
                }} }else {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17167);if ((((parsePos < 0)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17168)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17169)==0&false))) {{
                        __CLR4_4_1bzobzolc8aztgs.R.inc(17170);parsePos = ~parsePos;
                        __CLR4_4_1bzobzolc8aztgs.R.inc(17171);if ((((parsePos > bestInvalidPos)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17172)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17173)==0&false))) {{
                            __CLR4_4_1bzobzolc8aztgs.R.inc(17174);bestInvalidPos = parsePos;
                        }
                    }}
                }}
                }__CLR4_4_1bzobzolc8aztgs.R.inc(17175);bucket.restoreState(originalState);
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(17176);if ((((bestValidPos > position || (bestValidPos == position && isOptional))&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17177)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17178)==0&false))) {{
                // Restore the state to the best valid parse.
                __CLR4_4_1bzobzolc8aztgs.R.inc(17179);if ((((bestValidState != null)&&(__CLR4_4_1bzobzolc8aztgs.R.iget(17180)!=0|true))||(__CLR4_4_1bzobzolc8aztgs.R.iget(17181)==0&false))) {{
                    __CLR4_4_1bzobzolc8aztgs.R.inc(17182);bucket.restoreState(bestValidState);
                }
                }__CLR4_4_1bzobzolc8aztgs.R.inc(17183);return bestValidPos;
            }

            }__CLR4_4_1bzobzolc8aztgs.R.inc(17184);return ~bestInvalidPos;
        }finally{__CLR4_4_1bzobzolc8aztgs.R.flushNeeded();}}
    }

}
