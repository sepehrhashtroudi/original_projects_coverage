/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;

import org.joda.time.DateTimeConstants;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/**
 * Factory that creates complex instances of PeriodFormatter via method calls.
 * <p>
 * Period formatting is performed by the {@link PeriodFormatter} class.
 * Three classes provide factory methods to create formatters, and this is one.
 * The others are {@link PeriodFormat} and {@link ISOPeriodFormat}.
 * <p>
 * PeriodFormatterBuilder is used for constructing formatters which are then
 * used to print or parse. The formatters are built by appending specific fields
 * or other formatters to an instance of this builder.
 * <p>
 * For example, a formatter that prints years and months, like "15 years and 8 months",
 * can be constructed as follows:
 * <p>
 * <pre>
 * PeriodFormatter yearsAndMonths = new PeriodFormatterBuilder()
 *     .printZeroAlways()
 *     .appendYears()
 *     .appendSuffix(" year", " years")
 *     .appendSeparator(" and ")
 *     .printZeroRarelyLast()
 *     .appendMonths()
 *     .appendSuffix(" month", " months")
 *     .toFormatter();
 * </pre>
 * <p>
 * PeriodFormatterBuilder itself is mutable and not thread-safe, but the
 * formatters that it builds are thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 * @see PeriodFormat
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class PeriodFormatterBuilder {public static class __CLR4_4_1e9me9mlc8aztoc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,19581,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int PRINT_ZERO_RARELY_FIRST = 1;
    private static final int PRINT_ZERO_RARELY_LAST = 2;
    private static final int PRINT_ZERO_IF_SUPPORTED = 3;
    private static final int PRINT_ZERO_ALWAYS = 4;
    private static final int PRINT_ZERO_NEVER = 5;
    
    private static final int YEARS = 0;
    private static final int MONTHS = 1;
    private static final int WEEKS = 2;
    private static final int DAYS = 3;
    private static final int HOURS = 4;
    private static final int MINUTES = 5;
    private static final int SECONDS = 6;
    private static final int MILLIS = 7;
    private static final int SECONDS_MILLIS = 8;
    private static final int SECONDS_OPTIONAL_MILLIS = 9;
    private static final int MAX_FIELD = SECONDS_OPTIONAL_MILLIS;

    private int iMinPrintedDigits;
    private int iPrintZeroSetting;
    private int iMaxParsedDigits;
    private boolean iRejectSignedValues;

    private PeriodFieldAffix iPrefix;

    // List of Printers and Parsers used to build a final formatter.
    private List<Object> iElementPairs;
    /** Set to true if the formatter is not a printer. */
    private boolean iNotPrinter;
    /** Set to true if the formatter is not a parser. */
    private boolean iNotParser;

    // Last PeriodFormatter appended of each field type.
    private FieldFormatter[] iFieldFormatters;

    public PeriodFormatterBuilder() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18490);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18491);clear();
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a PeriodFormatter using all the appended elements.
     * <p>
     * This is the main method used by applications at the end of the build
     * process to create a usable formatter.
     * <p>
     * Subsequent changes to this builder do not affect the returned formatter.
     * <p>
     * The returned formatter may not support both printing and parsing.
     * The methods {@link PeriodFormatter#isPrinter()} and
     * {@link PeriodFormatter#isParser()} will help you determine the state
     * of the formatter.
     * 
     * @return the newly created formatter
     * @throws IllegalStateException if the builder can produce neither a printer nor a parser
     */
    public PeriodFormatter toFormatter() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18492);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18493);PeriodFormatter formatter = toFormatter(iElementPairs, iNotPrinter, iNotParser);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18494);iFieldFormatters = (FieldFormatter[]) iFieldFormatters.clone();
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18495);return formatter;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Internal method to create a PeriodPrinter instance using all the
     * appended elements.
     * <p>
     * Most applications will not use this method.
     * If you want a printer in an application, call {@link #toFormatter()}
     * and just use the printing API.
     * <p>
     * Subsequent changes to this builder do not affect the returned printer.
     * 
     * @return the newly created printer, null if builder cannot create a printer
     */
    public PeriodPrinter toPrinter() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18496);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18497);if ((((iNotPrinter)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18498)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18499)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18500);return null;
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18501);return toFormatter().getPrinter();
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Internal method to create a PeriodParser instance using all the
     * appended elements.
     * <p>
     * Most applications will not use this method.
     * If you want a printer in an application, call {@link #toFormatter()}
     * and just use the printing API.
     * <p>
     * Subsequent changes to this builder do not affect the returned parser.
     * 
     * @return the newly created parser, null if builder cannot create a parser
     */
    public PeriodParser toParser() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18502);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18503);if ((((iNotParser)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18504)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18505)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18506);return null;
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18507);return toFormatter().getParser();
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Clears out all the appended elements, allowing this builder to be reused.
     */
    public void clear() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18508);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18509);iMinPrintedDigits = 1;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18510);iPrintZeroSetting = PRINT_ZERO_RARELY_LAST;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18511);iMaxParsedDigits = 10;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18512);iRejectSignedValues = false;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18513);iPrefix = null;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18514);if ((((iElementPairs == null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18515)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18516)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18517);iElementPairs = new ArrayList<Object>();
        } }else {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18518);iElementPairs.clear();
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18519);iNotPrinter = false;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18520);iNotParser = false;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18521);iFieldFormatters = new FieldFormatter[10];
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Appends another formatter.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder append(PeriodFormatter formatter) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18522);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18523);if ((((formatter == null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18524)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18525)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18526);throw new IllegalArgumentException("No formatter supplied");
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18527);clearPrefix();
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18528);append0(formatter.getPrinter(), formatter.getParser());
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18529);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Appends a printer parser pair.
     * <p>
     * Either the printer or the parser may be null, in which case the builder will
     * be unable to produce a parser or printer repectively.
     *
     * @param printer  appends a printer to the builder, null if printing is not supported
     * @param parser  appends a parser to the builder, null if parsing is not supported
     * @return this PeriodFormatterBuilder
     * @throws IllegalArgumentException if both the printer and parser are null
     */
    public PeriodFormatterBuilder append(PeriodPrinter printer, PeriodParser parser) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18530);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18531);if ((((printer == null && parser == null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18532)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18533)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18534);throw new IllegalArgumentException("No printer or parser supplied");
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18535);clearPrefix();
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18536);append0(printer, parser);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18537);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Instructs the printer to emit specific text, and the parser to expect it.
     * The parser is case-insensitive.
     *
     * @return this PeriodFormatterBuilder
     * @throws IllegalArgumentException if text is null
     */
    public PeriodFormatterBuilder appendLiteral(String text) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18538);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18539);if ((((text == null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18540)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18541)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18542);throw new IllegalArgumentException("Literal must not be null");
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18543);clearPrefix();
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18544);Literal literal = new Literal(text);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18545);append0(literal, literal);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18546);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Set the minimum digits printed for the next and following appended
     * fields. By default, the minimum digits printed is one. If the field value
     * is zero, it is not printed unless a printZero rule is applied.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder minimumPrintedDigits(int minDigits) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18547);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18548);iMinPrintedDigits = minDigits;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18549);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Set the maximum digits parsed for the next and following appended
     * fields. By default, the maximum digits parsed is ten.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder maximumParsedDigits(int maxDigits) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18550);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18551);iMaxParsedDigits = maxDigits;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18552);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Reject signed values when parsing the next and following appended fields.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder rejectSignedValues(boolean v) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18553);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18554);iRejectSignedValues = v;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18555);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Never print zero values for the next and following appended fields,
     * unless no fields would be printed. If no fields are printed, the printer
     * forces the last "printZeroRarely" field to print a zero.
     * <p>
     * This field setting is the default.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder printZeroRarelyLast() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18556);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18557);iPrintZeroSetting = PRINT_ZERO_RARELY_LAST;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18558);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Never print zero values for the next and following appended fields,
     * unless no fields would be printed. If no fields are printed, the printer
     * forces the first "printZeroRarely" field to print a zero.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder printZeroRarelyFirst() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18559);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18560);iPrintZeroSetting = PRINT_ZERO_RARELY_FIRST;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18561);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Print zero values for the next and following appened fields only if the
     * period supports it.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder printZeroIfSupported() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18562);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18563);iPrintZeroSetting = PRINT_ZERO_IF_SUPPORTED;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18564);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Always print zero values for the next and following appended fields,
     * even if the period doesn't support it. The parser requires values for
     * fields that always print zero.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder printZeroAlways() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18565);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18566);iPrintZeroSetting = PRINT_ZERO_ALWAYS;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18567);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Never print zero values for the next and following appended fields,
     * unless no fields would be printed. If no fields are printed, the printer
     * forces the last "printZeroRarely" field to print a zero.
     * <p>
     * This field setting is the default.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder printZeroNever() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18568);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18569);iPrintZeroSetting = PRINT_ZERO_NEVER;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18570);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Append a field prefix which applies only to the next appended field. If
     * the field is not printed, neither is the prefix.
     *
     * @param text text to print before field only if field is printed
     * @return this PeriodFormatterBuilder
     * @see #appendSuffix
     */
    public PeriodFormatterBuilder appendPrefix(String text) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18571);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18572);if ((((text == null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18573)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18574)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18575);throw new IllegalArgumentException();
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18576);return appendPrefix(new SimpleAffix(text));
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Append a field prefix which applies only to the next appended field. If
     * the field is not printed, neither is the prefix.
     * <p>
     * During parsing, the singular and plural versions are accepted whether
     * or not the actual value matches plurality.
     *
     * @param singularText text to print if field value is one
     * @param pluralText text to print if field value is not one
     * @return this PeriodFormatterBuilder
     * @see #appendSuffix
     */
    public PeriodFormatterBuilder appendPrefix(String singularText,
                                                 String pluralText) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18577);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18578);if ((((singularText == null || pluralText == null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18579)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18580)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18581);throw new IllegalArgumentException();
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18582);return appendPrefix(new PluralAffix(singularText, pluralText));
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Append a field prefix which applies only to the next appended field. If
     * the field is not printed, neither is the prefix.
     *
     * @param prefix custom prefix
     * @return this PeriodFormatterBuilder
     * @see #appendSuffix
     */
    private PeriodFormatterBuilder appendPrefix(PeriodFieldAffix prefix) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18583);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18584);if ((((prefix == null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18585)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18586)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18587);throw new IllegalArgumentException();
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18588);if ((((iPrefix != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18589)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18590)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18591);prefix = new CompositeAffix(iPrefix, prefix);
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18592);iPrefix = prefix;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18593);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Instruct the printer to emit an integer years field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendYears() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18594);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18595);appendField(YEARS);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18596);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer months field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendMonths() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18597);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18598);appendField(MONTHS);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18599);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer weeks field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendWeeks() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18600);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18601);appendField(WEEKS);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18602);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer days field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendDays() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18603);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18604);appendField(DAYS);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18605);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer hours field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendHours() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18606);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18607);appendField(HOURS);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18608);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer minutes field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendMinutes() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18609);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18610);appendField(MINUTES);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18611);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer seconds field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendSeconds() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18612);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18613);appendField(SECONDS);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18614);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Instruct the printer to emit a combined seconds and millis field, if supported.
     * The millis will overflow into the seconds if necessary.
     * The millis are always output.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendSecondsWithMillis() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18615);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18616);appendField(SECONDS_MILLIS);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18617);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Instruct the printer to emit a combined seconds and millis field, if supported.
     * The millis will overflow into the seconds if necessary.
     * The millis are only output if non-zero.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendSecondsWithOptionalMillis() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18618);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18619);appendField(SECONDS_OPTIONAL_MILLIS);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18620);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer millis field, if supported.
     * <p>
     * The number of printed and parsed digits can be controlled using
     * {@link #minimumPrintedDigits(int)} and {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendMillis() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18621);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18622);appendField(MILLIS);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18623);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Instruct the printer to emit an integer millis field, if supported.
     * <p>
     * The number of arsed digits can be controlled using {@link #maximumParsedDigits(int)}.
     *
     * @return this PeriodFormatterBuilder
     */
    public PeriodFormatterBuilder appendMillis3Digit() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18624);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18625);appendField(7, 3);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18626);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    private void appendField(int type) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18627);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18628);appendField(type, iMinPrintedDigits);
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    private void appendField(int type, int minPrinted) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18629);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18630);FieldFormatter field = new FieldFormatter(minPrinted, iPrintZeroSetting,
            iMaxParsedDigits, iRejectSignedValues, type, iFieldFormatters, iPrefix, null);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18631);append0(field, field);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18632);iFieldFormatters[type] = field;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18633);iPrefix = null;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Append a field suffix which applies only to the last appended field. If
     * the field is not printed, neither is the suffix.
     *
     * @param text text to print after field only if field is printed
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if no field exists to append to
     * @see #appendPrefix
     */
    public PeriodFormatterBuilder appendSuffix(String text) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18634);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18635);if ((((text == null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18636)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18637)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18638);throw new IllegalArgumentException();
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18639);return appendSuffix(new SimpleAffix(text));
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Append a field suffix which applies only to the last appended field. If
     * the field is not printed, neither is the suffix.
     * <p>
     * During parsing, the singular and plural versions are accepted whether or
     * not the actual value matches plurality.
     *
     * @param singularText text to print if field value is one
     * @param pluralText text to print if field value is not one
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if no field exists to append to
     * @see #appendPrefix
     */
    public PeriodFormatterBuilder appendSuffix(String singularText,
                                               String pluralText) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18640);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18641);if ((((singularText == null || pluralText == null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18642)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18643)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18644);throw new IllegalArgumentException();
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18645);return appendSuffix(new PluralAffix(singularText, pluralText));
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Append a field suffix which applies only to the last appended field. If
     * the field is not printed, neither is the suffix.
     *
     * @param suffix custom suffix
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if no field exists to append to
     * @see #appendPrefix
     */
    private PeriodFormatterBuilder appendSuffix(PeriodFieldAffix suffix) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18646);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18647);final Object originalPrinter;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18648);final Object originalParser;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18649);if ((((iElementPairs.size() > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18650)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18651)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18652);originalPrinter = iElementPairs.get(iElementPairs.size() - 2);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18653);originalParser = iElementPairs.get(iElementPairs.size() - 1);
        } }else {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18654);originalPrinter = null;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18655);originalParser = null;
        }

        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18656);if ((((originalPrinter == null || originalParser == null ||
                originalPrinter != originalParser ||
                !(originalPrinter instanceof FieldFormatter))&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18657)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18658)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18659);throw new IllegalStateException("No field to apply suffix to");
        }

        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18660);clearPrefix();
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18661);FieldFormatter newField = new FieldFormatter((FieldFormatter) originalPrinter, suffix);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18662);iElementPairs.set(iElementPairs.size() - 2, newField);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18663);iElementPairs.set(iElementPairs.size() - 1, newField);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18664);iFieldFormatters[newField.getFieldType()] = newField;
        
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18665);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Append a separator, which is output if fields are printed both before
     * and after the separator.
     * <p>
     * For example, <code>builder.appendDays().appendSeparator(",").appendHours()</code>
     * will only output the comma if both the days and hours fields are output.
     * <p>
     * The text will be parsed case-insensitively.
     * <p>
     * Note: appending a separator discontinues any further work on the latest
     * appended field.
     *
     * @param text  the text to use as a separator
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if this separator follows a previous one
     */
    public PeriodFormatterBuilder appendSeparator(String text) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18666);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18667);return appendSeparator(text, text, null, true, true);
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Append a separator, which is output only if fields are printed after the separator.
     * <p>
     * For example,
     * <code>builder.appendDays().appendSeparatorIfFieldsAfter(",").appendHours()</code>
     * will only output the comma if the hours fields is output.
     * <p>
     * The text will be parsed case-insensitively.
     * <p>
     * Note: appending a separator discontinues any further work on the latest
     * appended field.
     *
     * @param text  the text to use as a separator
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if this separator follows a previous one
     */
    public PeriodFormatterBuilder appendSeparatorIfFieldsAfter(String text) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18668);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18669);return appendSeparator(text, text, null, false, true);
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Append a separator, which is output only if fields are printed before the separator.
     * <p>
     * For example,
     * <code>builder.appendDays().appendSeparatorIfFieldsBefore(",").appendHours()</code>
     * will only output the comma if the days fields is output.
     * <p>
     * The text will be parsed case-insensitively.
     * <p>
     * Note: appending a separator discontinues any further work on the latest
     * appended field.
     *
     * @param text  the text to use as a separator
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if this separator follows a previous one
     */
    public PeriodFormatterBuilder appendSeparatorIfFieldsBefore(String text) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18670);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18671);return appendSeparator(text, text, null, true, false);
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Append a separator, which is output if fields are printed both before
     * and after the separator.
     * <p>
     * This method changes the separator depending on whether it is the last separator
     * to be output.
     * <p>
     * For example, <code>builder.appendDays().appendSeparator(",", "&").appendHours().appendSeparator(",", "&").appendMinutes()</code>
     * will output '1,2&3' if all three fields are output, '1&2' if two fields are output
     * and '1' if just one field is output.
     * <p>
     * The text will be parsed case-insensitively.
     * <p>
     * Note: appending a separator discontinues any further work on the latest
     * appended field.
     *
     * @param text  the text to use as a separator
     * @param finalText  the text used used if this is the final separator to be printed
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if this separator follows a previous one
     */
    public PeriodFormatterBuilder appendSeparator(String text, String finalText) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18672);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18673);return appendSeparator(text, finalText, null, true, true);
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    /**
     * Append a separator, which is output if fields are printed both before
     * and after the separator.
     * <p>
     * This method changes the separator depending on whether it is the last separator
     * to be output.
     * <p>
     * For example, <code>builder.appendDays().appendSeparator(",", "&").appendHours().appendSeparator(",", "&").appendMinutes()</code>
     * will output '1,2&3' if all three fields are output, '1&2' if two fields are output
     * and '1' if just one field is output.
     * <p>
     * The text will be parsed case-insensitively.
     * <p>
     * Note: appending a separator discontinues any further work on the latest
     * appended field.
     *
     * @param text  the text to use as a separator
     * @param finalText  the text used used if this is the final separator to be printed
     * @param variants  set of text values which are also acceptable when parsed
     * @return this PeriodFormatterBuilder
     * @throws IllegalStateException if this separator follows a previous one
     */
    public PeriodFormatterBuilder appendSeparator(String text, String finalText,
                                                  String[] variants) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18674);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18675);return appendSeparator(text, finalText, variants, true, true);
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    private PeriodFormatterBuilder appendSeparator(String text, String finalText,
                                                   String[] variants,
                                                   boolean useBefore, boolean useAfter) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18676);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18677);if ((((text == null || finalText == null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18678)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18679)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18680);throw new IllegalArgumentException();
        }

        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18681);clearPrefix();
        
        // optimise zero formatter case
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18682);List<Object> pairs = iElementPairs;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18683);if ((((pairs.size() == 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18684)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18685)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18686);if ((((useAfter && useBefore == false)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18687)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18688)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18689);Separator separator = new Separator(
                        text, finalText, variants,
                        Literal.EMPTY, Literal.EMPTY, useBefore, useAfter);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18690);append0(separator, separator);
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18691);return this;
        }
        
        // find the last separator added
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18692);int i;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18693);Separator lastSeparator = null;
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18694);for (i=pairs.size(); (((--i>=0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18695)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18696)==0&false)); ) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18697);if ((((pairs.get(i) instanceof Separator)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18698)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18699)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18700);lastSeparator = (Separator) pairs.get(i);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18701);pairs = pairs.subList(i + 1, pairs.size());
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18702);break;
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18703);i--;  // element pairs
        }
        
        // merge formatters
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18704);if ((((lastSeparator != null && pairs.size() == 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18705)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18706)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18707);throw new IllegalStateException("Cannot have two adjacent separators");
        } }else {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18708);Object[] comp = createComposite(pairs);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18709);pairs.clear();
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18710);Separator separator = new Separator(
                    text, finalText, variants,
                    (PeriodPrinter) comp[0], (PeriodParser) comp[1],
                    useBefore, useAfter);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18711);pairs.add(separator);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18712);pairs.add(separator);
        }
        
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18713);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void clearPrefix() throws IllegalStateException {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18714);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18715);if ((((iPrefix != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18716)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18717)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18718);throw new IllegalStateException("Prefix not followed by field");
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18719);iPrefix = null;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    private PeriodFormatterBuilder append0(PeriodPrinter printer, PeriodParser parser) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18720);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18721);iElementPairs.add(printer);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18722);iElementPairs.add(parser);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18723);iNotPrinter |= (printer == null);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18724);iNotParser |= (parser == null);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18725);return this;
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static PeriodFormatter toFormatter(List<Object> elementPairs, boolean notPrinter, boolean notParser) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18726);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18727);if ((((notPrinter && notParser)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18728)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18729)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18730);throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18731);int size = elementPairs.size();
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18732);if ((((size >= 2 && elementPairs.get(0) instanceof Separator)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18733)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18734)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18735);Separator sep = (Separator) elementPairs.get(0);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18736);if ((((sep.iAfterParser == null && sep.iAfterPrinter == null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18737)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18738)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18739);PeriodFormatter f = toFormatter(elementPairs.subList(2, size), notPrinter, notParser);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18740);sep = sep.finish(f.getPrinter(), f.getParser());
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18741);return new PeriodFormatter(sep, sep);
            }
        }}
        }__CLR4_4_1e9me9mlc8aztoc.R.inc(18742);Object[] comp = createComposite(elementPairs);
        __CLR4_4_1e9me9mlc8aztoc.R.inc(18743);if ((((notPrinter)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18744)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18745)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18746);return new PeriodFormatter(null, (PeriodParser) comp[1]);
        } }else {__CLR4_4_1e9me9mlc8aztoc.R.inc(18747);if ((((notParser)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18748)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18749)==0&false))) {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18750);return new PeriodFormatter((PeriodPrinter) comp[0], null);
        } }else {{
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18751);return new PeriodFormatter((PeriodPrinter) comp[0], (PeriodParser) comp[1]);
        }
    }}}finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    private static Object[] createComposite(List<Object> elementPairs) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18752);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1e9me9mlc8aztoc.R.inc(18753);switch (elementPairs.size()) {
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18754);__CLB4_4_1_bool0=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18755);return new Object[] {Literal.EMPTY, Literal.EMPTY};
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18756);__CLB4_4_1_bool0=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18757);return new Object[] {elementPairs.get(0), elementPairs.get(1)};
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18758);__CLB4_4_1_bool0=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18759);Composite comp = new Composite(elementPairs);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18760);return new Object[] {comp, comp};
        }
    }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Defines a formatted field's prefix or suffix text.
     * This can be used for fields such as 'n hours' or 'nH' or 'Hour:n'.
     */
    static interface PeriodFieldAffix {
        int calculatePrintedLength(int value);
        
        void printTo(StringBuffer buf, int value);
        
        void printTo(Writer out, int value) throws IOException;
        
        /**
         * @return new position after parsing affix, or ~position of failure
         */
        int parse(String periodStr, int position);

        /**
         * @return position where affix starts, or original ~position if not found
         */
        int scan(String periodStr, int position);
    }

    //-----------------------------------------------------------------------
    /**
     * Implements an affix where the text does not vary by the amount.
     */
    static class SimpleAffix implements PeriodFieldAffix {
        private final String iText;

        SimpleAffix(String text) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18761);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18762);iText = text;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int calculatePrintedLength(int value) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18763);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18764);return iText.length();
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public void printTo(StringBuffer buf, int value) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18765);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18766);buf.append(iText);
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public void printTo(Writer out, int value) throws IOException {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18767);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18768);out.write(iText);
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int parse(String periodStr, int position) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18769);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18770);String text = iText;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18771);int textLength = text.length();
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18772);if ((((periodStr.regionMatches(true, position, text, 0, textLength))&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18773)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18774)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18775);return position + textLength;
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18776);return ~position;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int scan(String periodStr, final int position) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18777);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18778);String text = iText;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18779);int textLength = text.length();
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18780);int sourceLength = periodStr.length();
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18781);search:
            for (int pos = position; (((pos < sourceLength)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18782)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18783)==0&false)); pos++) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18784);if ((((periodStr.regionMatches(true, pos, text, 0, textLength))&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18785)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18786)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(18787);return pos;
                }
                // Only allow number characters to be skipped in search of suffix.
                }boolean __CLB4_4_1_bool1=false;__CLR4_4_1e9me9mlc8aztoc.R.inc(18788);switch (periodStr.charAt(pos)) {
                case '0':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18789);__CLB4_4_1_bool1=true;} case '1':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18790);__CLB4_4_1_bool1=true;} case '2':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18791);__CLB4_4_1_bool1=true;} case '3':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18792);__CLB4_4_1_bool1=true;} case '4':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18793);__CLB4_4_1_bool1=true;}
                case '5':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18794);__CLB4_4_1_bool1=true;} case '6':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18795);__CLB4_4_1_bool1=true;} case '7':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18796);__CLB4_4_1_bool1=true;} case '8':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18797);__CLB4_4_1_bool1=true;} case '9':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18798);__CLB4_4_1_bool1=true;}
                case '.':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18799);__CLB4_4_1_bool1=true;} case ',':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18800);__CLB4_4_1_bool1=true;} case '+':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18801);__CLB4_4_1_bool1=true;} case '-':if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18802);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(18803);break;
                default:if (!__CLB4_4_1_bool1) {__CLR4_4_1e9me9mlc8aztoc.R.inc(18804);__CLB4_4_1_bool1=true;}
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(18805);break search;
                }
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18806);return ~position;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Implements an affix where the text varies by the amount of the field.
     * Only singular (1) and plural (not 1) are supported.
     */
    static class PluralAffix implements PeriodFieldAffix {
        private final String iSingularText;
        private final String iPluralText;

        PluralAffix(String singularText, String pluralText) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18807);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18808);iSingularText = singularText;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18809);iPluralText = pluralText;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int calculatePrintedLength(int value) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18810);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18811);return ((((value == 1 )&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18812)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18813)==0&false))? iSingularText : iPluralText).length();
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public void printTo(StringBuffer buf, int value) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18814);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18815);buf.append((((value == 1 )&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18816)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18817)==0&false))? iSingularText : iPluralText);
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public void printTo(Writer out, int value) throws IOException {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18818);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18819);out.write((((value == 1 )&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18820)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18821)==0&false))? iSingularText : iPluralText);
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int parse(String periodStr, int position) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18822);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18823);String text1 = iPluralText;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18824);String text2 = iSingularText; 

            __CLR4_4_1e9me9mlc8aztoc.R.inc(18825);if ((((text1.length() < text2.length())&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18826)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18827)==0&false))) {{
                // Swap in order to match longer one first.
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18828);String temp = text1;
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18829);text1 = text2;
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18830);text2 = temp;
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18831);if ((((periodStr.regionMatches
                (true, position, text1, 0, text1.length()))&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18832)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18833)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18834);return position + text1.length();
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18835);if ((((periodStr.regionMatches
                (true, position, text2, 0, text2.length()))&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18836)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18837)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18838);return position + text2.length();
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18839);return ~position;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int scan(String periodStr, final int position) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18840);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18841);String text1 = iPluralText;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18842);String text2 = iSingularText; 

            __CLR4_4_1e9me9mlc8aztoc.R.inc(18843);if ((((text1.length() < text2.length())&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18844)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18845)==0&false))) {{
                // Swap in order to match longer one first.
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18846);String temp = text1;
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18847);text1 = text2;
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18848);text2 = temp;
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18849);int textLength1 = text1.length();
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18850);int textLength2 = text2.length();

            __CLR4_4_1e9me9mlc8aztoc.R.inc(18851);int sourceLength = periodStr.length();
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18852);for (int pos = position; (((pos < sourceLength)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18853)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18854)==0&false)); pos++) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18855);if ((((periodStr.regionMatches(true, pos, text1, 0, textLength1))&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18856)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18857)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(18858);return pos;
                }
                }__CLR4_4_1e9me9mlc8aztoc.R.inc(18859);if ((((periodStr.regionMatches(true, pos, text2, 0, textLength2))&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18860)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18861)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(18862);return pos;
                }
            }}
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18863);return ~position;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Builds a composite affix by merging two other affix implementations.
     */
    static class CompositeAffix implements PeriodFieldAffix {
        private final PeriodFieldAffix iLeft;
        private final PeriodFieldAffix iRight;

        CompositeAffix(PeriodFieldAffix left, PeriodFieldAffix right) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18864);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18865);iLeft = left;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18866);iRight = right;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int calculatePrintedLength(int value) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18867);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18868);return iLeft.calculatePrintedLength(value)
                + iRight.calculatePrintedLength(value);
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public void printTo(StringBuffer buf, int value) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18869);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18870);iLeft.printTo(buf, value);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18871);iRight.printTo(buf, value);
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public void printTo(Writer out, int value) throws IOException {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18872);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18873);iLeft.printTo(out, value);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18874);iRight.printTo(out, value);
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int parse(String periodStr, int position) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18875);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18876);position = iLeft.parse(periodStr, position);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18877);if ((((position >= 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18878)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18879)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18880);position = iRight.parse(periodStr, position);
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18881);return position;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int scan(String periodStr, final int position) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18882);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18883);int pos = iLeft.scan(periodStr, position);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18884);if ((((pos >= 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18885)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18886)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18887);return iRight.scan(periodStr, pos);
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18888);return ~position;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Formats the numeric value of a field, potentially with prefix/suffix.
     */
    static class FieldFormatter
            implements PeriodPrinter, PeriodParser {
        private final int iMinPrintedDigits;
        private final int iPrintZeroSetting;
        private final int iMaxParsedDigits;
        private final boolean iRejectSignedValues;
        
        /** The index of the field type, 0=year, etc. */
        private final int iFieldType;
        /**
         * The array of the latest formatter added for each type.
         * This is shared between all the field formatters in a formatter.
         */
        private final FieldFormatter[] iFieldFormatters;
        
        private final PeriodFieldAffix iPrefix;
        private final PeriodFieldAffix iSuffix;

        FieldFormatter(int minPrintedDigits, int printZeroSetting,
                       int maxParsedDigits, boolean rejectSignedValues,
                       int fieldType, FieldFormatter[] fieldFormatters,
                       PeriodFieldAffix prefix, PeriodFieldAffix suffix) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18889);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18890);iMinPrintedDigits = minPrintedDigits;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18891);iPrintZeroSetting = printZeroSetting;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18892);iMaxParsedDigits = maxParsedDigits;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18893);iRejectSignedValues = rejectSignedValues;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18894);iFieldType = fieldType;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18895);iFieldFormatters = fieldFormatters;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18896);iPrefix = prefix;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18897);iSuffix = suffix;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        FieldFormatter(FieldFormatter field, PeriodFieldAffix suffix) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18898);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18899);iMinPrintedDigits = field.iMinPrintedDigits;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18900);iPrintZeroSetting = field.iPrintZeroSetting;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18901);iMaxParsedDigits = field.iMaxParsedDigits;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18902);iRejectSignedValues = field.iRejectSignedValues;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18903);iFieldType = field.iFieldType;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18904);iFieldFormatters = field.iFieldFormatters;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18905);iPrefix = field.iPrefix;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18906);if ((((field.iSuffix != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18907)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18908)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18909);suffix = new CompositeAffix(field.iSuffix, suffix);
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18910);iSuffix = suffix;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18911);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18912);if ((((stopAt <= 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18913)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18914)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18915);return 0;
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18916);if ((((iPrintZeroSetting == PRINT_ZERO_ALWAYS || getFieldValue(period) != Long.MAX_VALUE)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18917)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18918)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18919);return 1;
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18920);return 0;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int calculatePrintedLength(ReadablePeriod period, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18921);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18922);long valueLong = getFieldValue(period);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18923);if ((((valueLong == Long.MAX_VALUE)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18924)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18925)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18926);return 0;
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18927);int sum = Math.max(FormatUtils.calculateDigitCount(valueLong), iMinPrintedDigits);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18928);if ((((iFieldType >= SECONDS_MILLIS)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18929)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18930)==0&false))) {{
                // valueLong contains the seconds and millis fields
                // the minimum output is 0.000, which is 4 or 5 digits with a negative
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18931);sum = ((((valueLong < 0 )&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18932)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18933)==0&false))? Math.max(sum, 5) : Math.max(sum, 4));
                // plus one for the decimal point
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18934);sum++;
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18935);if ((((iFieldType == SECONDS_OPTIONAL_MILLIS &&
                        (Math.abs(valueLong) % DateTimeConstants.MILLIS_PER_SECOND) == 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18936)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18937)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(18938);sum -= 4; // remove three digits and decimal point
                }
                // reset valueLong to refer to the seconds part for the prefic/suffix calculation
                }__CLR4_4_1e9me9mlc8aztoc.R.inc(18939);valueLong = valueLong / DateTimeConstants.MILLIS_PER_SECOND;
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18940);int value = (int) valueLong;

            __CLR4_4_1e9me9mlc8aztoc.R.inc(18941);if ((((iPrefix != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18942)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18943)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18944);sum += iPrefix.calculatePrintedLength(value);
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18945);if ((((iSuffix != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18946)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18947)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18948);sum += iSuffix.calculatePrintedLength(value);
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18949);return sum;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}
        
        public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18950);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18951);long valueLong = getFieldValue(period);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18952);if ((((valueLong == Long.MAX_VALUE)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18953)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18954)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18955);return;
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18956);int value = (int) valueLong;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18957);if ((((iFieldType >= SECONDS_MILLIS)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18958)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18959)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18960);value = (int) (valueLong / DateTimeConstants.MILLIS_PER_SECOND);
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18961);if ((((iPrefix != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18962)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18963)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18964);iPrefix.printTo(buf, value);
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18965);int bufLen = buf.length();
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18966);int minDigits = iMinPrintedDigits;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18967);if ((((minDigits <= 1)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18968)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18969)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18970);FormatUtils.appendUnpaddedInteger(buf, value);
            } }else {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18971);FormatUtils.appendPaddedInteger(buf, value, minDigits);
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18972);if ((((iFieldType >= SECONDS_MILLIS)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18973)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18974)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18975);int dp = (int) (Math.abs(valueLong) % DateTimeConstants.MILLIS_PER_SECOND);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18976);if ((((iFieldType == SECONDS_MILLIS || dp > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18977)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18978)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(18979);if ((((valueLong < 0 && valueLong > -DateTimeConstants.MILLIS_PER_SECOND)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18980)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18981)==0&false))) {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(18982);buf.insert(bufLen, '-');
                    }
                    }__CLR4_4_1e9me9mlc8aztoc.R.inc(18983);buf.append('.');
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(18984);FormatUtils.appendPaddedInteger(buf, dp, 3);
                }
            }}
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18985);if ((((iSuffix != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18986)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18987)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18988);iSuffix.printTo(buf, value);
            }
        }}finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(18989);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18990);long valueLong = getFieldValue(period);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18991);if ((((valueLong == Long.MAX_VALUE)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18992)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18993)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18994);return;
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(18995);int value = (int) valueLong;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(18996);if ((((iFieldType >= SECONDS_MILLIS)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(18997)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(18998)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(18999);value = (int) (valueLong / DateTimeConstants.MILLIS_PER_SECOND);
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19000);if ((((iPrefix != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19001)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19002)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19003);iPrefix.printTo(out, value);
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19004);int minDigits = iMinPrintedDigits;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19005);if ((((minDigits <= 1)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19006)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19007)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19008);FormatUtils.writeUnpaddedInteger(out, value);
            } }else {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19009);FormatUtils.writePaddedInteger(out, value, minDigits);
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19010);if ((((iFieldType >= SECONDS_MILLIS)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19011)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19012)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19013);int dp = (int) (Math.abs(valueLong) % DateTimeConstants.MILLIS_PER_SECOND);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19014);if ((((iFieldType == SECONDS_MILLIS || dp > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19015)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19016)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19017);out.write('.');
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19018);FormatUtils.writePaddedInteger(out, dp, 3);
                }
            }}
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19019);if ((((iSuffix != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19020)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19021)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19022);iSuffix.printTo(out, value);
            }
        }}finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int parseInto(
                ReadWritablePeriod period, String text, 
                int position, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19023);

            __CLR4_4_1e9me9mlc8aztoc.R.inc(19024);boolean mustParse = (iPrintZeroSetting == PRINT_ZERO_ALWAYS);

            // Shortcut test.
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19025);if ((((position >= text.length())&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19026)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19027)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19028);return (((mustParse )&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19029)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19030)==0&false))? ~position : position;
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19031);if ((((iPrefix != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19032)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19033)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19034);position = iPrefix.parse(text, position);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19035);if ((((position >= 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19036)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19037)==0&false))) {{
                    // If prefix is found, then the parse must finish.
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19038);mustParse = true;
                } }else {{
                    // Prefix not found, so bail.
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19039);if ((((!mustParse)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19040)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19041)==0&false))) {{
                        // It's okay because parsing of this field is not
                        // required. Don't return an error. Fields down the
                        // chain can continue on, trying to parse.
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19042);return ~position;
                    }
                    }__CLR4_4_1e9me9mlc8aztoc.R.inc(19043);return position;
                }
            }}

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19044);int suffixPos = -1;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19045);if ((((iSuffix != null && !mustParse)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19046)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19047)==0&false))) {{
                // Pre-scan the suffix, to help determine if this field must be
                // parsed.
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19048);suffixPos = iSuffix.scan(text, position);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19049);if ((((suffixPos >= 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19050)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19051)==0&false))) {{
                    // If suffix is found, then parse must finish.
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19052);mustParse = true;
                } }else {{
                    // Suffix not found, so bail.
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19053);if ((((!mustParse)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19054)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19055)==0&false))) {{
                        // It's okay because parsing of this field is not
                        // required. Don't return an error. Fields down the
                        // chain can continue on, trying to parse.
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19056);return ~suffixPos;
                    }
                    }__CLR4_4_1e9me9mlc8aztoc.R.inc(19057);return suffixPos;
                }
            }}

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19058);if ((((!mustParse && !isSupported(period.getPeriodType(), iFieldType))&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19059)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19060)==0&false))) {{
                // If parsing is not required and the field is not supported,
                // exit gracefully so that another parser can continue on.
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19061);return position;
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19062);int limit;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19063);if ((((suffixPos > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19064)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19065)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19066);limit = Math.min(iMaxParsedDigits, suffixPos - position);
            } }else {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19067);limit = Math.min(iMaxParsedDigits, text.length() - position);
            }

            // validate input number
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19068);int length = 0;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19069);int fractPos = -1;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19070);boolean hasDigits = false;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19071);while ((((length < limit)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19072)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19073)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19074);char c = text.charAt(position + length);
                // leading sign
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19075);if ((((length == 0 && (c == '-' || c == '+') && !iRejectSignedValues)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19076)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19077)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19078);boolean negative = c == '-';

                    // Next character must be a digit.
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19079);if (length + 1 >= limit || 
                        (c = text.charAt(position + length + 1)) < '0' || c > '9')
                    {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19082);break;
                    }

                    }__CLR4_4_1e9me9mlc8aztoc.R.inc(19083);if ((((negative)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19084)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19085)==0&false))) {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19086);length++;
                    } }else {{
                        // Skip the '+' for parseInt to succeed.
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19087);position++;
                    }
                    // Expand the limit to disregard the sign character.
                    }__CLR4_4_1e9me9mlc8aztoc.R.inc(19088);limit = Math.min(limit + 1, text.length() - position);
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19089);continue;
                }
                // main number
                }__CLR4_4_1e9me9mlc8aztoc.R.inc(19090);if ((((c >= '0' && c <= '9')&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19091)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19092)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19093);hasDigits = true;
                } }else {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19094);if (((((c == '.' || c == ',')
                         && (iFieldType == SECONDS_MILLIS || iFieldType == SECONDS_OPTIONAL_MILLIS))&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19095)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19096)==0&false))) {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19097);if ((((fractPos >= 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19098)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19099)==0&false))) {{
                            // can't have two decimals
                            __CLR4_4_1e9me9mlc8aztoc.R.inc(19100);break;
                        }
                        }__CLR4_4_1e9me9mlc8aztoc.R.inc(19101);fractPos = position + length + 1;
                        // Expand the limit to disregard the decimal point.
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19102);limit = Math.min(limit + 1, text.length() - position);
                    } }else {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19103);break;
                    }
                }}
                }__CLR4_4_1e9me9mlc8aztoc.R.inc(19104);length++;
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19105);if ((((!hasDigits)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19106)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19107)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19108);return ~position;
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19109);if ((((suffixPos >= 0 && position + length != suffixPos)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19110)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19111)==0&false))) {{
                // If there are additional non-digit characters before the
                // suffix is reached, then assume that the suffix found belongs
                // to a field not yet reached. Return original position so that
                // another parser can continue on.
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19112);return position;
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19113);if ((((iFieldType != SECONDS_MILLIS && iFieldType != SECONDS_OPTIONAL_MILLIS)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19114)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19115)==0&false))) {{
                // Handle common case.
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19116);setFieldValue(period, iFieldType, parseInt(text, position, length));
            } }else {__CLR4_4_1e9me9mlc8aztoc.R.inc(19117);if ((((fractPos < 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19118)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19119)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19120);setFieldValue(period, SECONDS, parseInt(text, position, length));
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19121);setFieldValue(period, MILLIS, 0);
            } }else {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19122);int wholeValue = parseInt(text, position, fractPos - position - 1);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19123);setFieldValue(period, SECONDS, wholeValue);

                __CLR4_4_1e9me9mlc8aztoc.R.inc(19124);int fractLen = position + length - fractPos;
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19125);int fractValue;
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19126);if ((((fractLen <= 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19127)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19128)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19129);fractValue = 0;
                } }else {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19130);if ((((fractLen >= 3)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19131)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19132)==0&false))) {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19133);fractValue = parseInt(text, fractPos, 3);
                    } }else {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19134);fractValue = parseInt(text, fractPos, fractLen);
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19135);if ((((fractLen == 1)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19136)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19137)==0&false))) {{
                            __CLR4_4_1e9me9mlc8aztoc.R.inc(19138);fractValue *= 100;
                        } }else {{
                            __CLR4_4_1e9me9mlc8aztoc.R.inc(19139);fractValue *= 10;
                        }
                    }}
                    }__CLR4_4_1e9me9mlc8aztoc.R.inc(19140);if ((((wholeValue < 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19141)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19142)==0&false))) {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19143);fractValue = -fractValue;
                    }
                }}

                }__CLR4_4_1e9me9mlc8aztoc.R.inc(19144);setFieldValue(period, MILLIS, fractValue);
            }
                
            }}__CLR4_4_1e9me9mlc8aztoc.R.inc(19145);position += length;

            __CLR4_4_1e9me9mlc8aztoc.R.inc(19146);if ((((position >= 0 && iSuffix != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19147)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19148)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19149);position = iSuffix.parse(text, position);
            }
                
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19150);return position;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        /**
         * @param text text to parse
         * @param position position in text
         * @param length exact count of characters to parse
         * @return parsed int value
         */
        private int parseInt(String text, int position, int length) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19151);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19152);if ((((length >= 10)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19153)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19154)==0&false))) {{
                // Since value may exceed max, use stock parser which checks for this.
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19155);return Integer.parseInt(text.substring(position, position + length));
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19156);if ((((length <= 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19157)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19158)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19159);return 0;
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19160);int value = text.charAt(position++);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19161);length--;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19162);boolean negative;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19163);if ((((value == '-')&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19164)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19165)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19166);if ((((--length < 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19167)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19168)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19169);return 0;
                }
                }__CLR4_4_1e9me9mlc8aztoc.R.inc(19170);negative = true;
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19171);value = text.charAt(position++);
            } }else {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19172);negative = false;
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19173);value -= '0';
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19174);while ((((length-- > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19175)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19176)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19177);value = ((value << 3) + (value << 1)) + text.charAt(position++) - '0';
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19178);return (((negative )&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19179)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19180)==0&false))? -value : value;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        /**
         * @return Long.MAX_VALUE if nothing to print, otherwise value
         */
        long getFieldValue(ReadablePeriod period) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19181);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19182);PeriodType type;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19183);if ((((iPrintZeroSetting == PRINT_ZERO_ALWAYS)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19184)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19185)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19186);type = null; // Don't need to check if supported.
            } }else {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19187);type = period.getPeriodType();
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19188);if ((((type != null && isSupported(type, iFieldType) == false)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19189)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19190)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19191);return Long.MAX_VALUE;
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19192);long value;

            boolean __CLB4_4_1_bool2=false;__CLR4_4_1e9me9mlc8aztoc.R.inc(19193);switch (iFieldType) {
            default:if (!__CLB4_4_1_bool2) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19194);__CLB4_4_1_bool2=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19195);return Long.MAX_VALUE;
            case YEARS:if (!__CLB4_4_1_bool2) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19196);__CLB4_4_1_bool2=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19197);value = period.get(DurationFieldType.years());
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19198);break;
            case MONTHS:if (!__CLB4_4_1_bool2) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19199);__CLB4_4_1_bool2=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19200);value = period.get(DurationFieldType.months());
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19201);break;
            case WEEKS:if (!__CLB4_4_1_bool2) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19202);__CLB4_4_1_bool2=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19203);value = period.get(DurationFieldType.weeks());
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19204);break;
            case DAYS:if (!__CLB4_4_1_bool2) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19205);__CLB4_4_1_bool2=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19206);value = period.get(DurationFieldType.days());
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19207);break;
            case HOURS:if (!__CLB4_4_1_bool2) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19208);__CLB4_4_1_bool2=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19209);value = period.get(DurationFieldType.hours());
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19210);break;
            case MINUTES:if (!__CLB4_4_1_bool2) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19211);__CLB4_4_1_bool2=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19212);value = period.get(DurationFieldType.minutes());
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19213);break;
            case SECONDS:if (!__CLB4_4_1_bool2) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19214);__CLB4_4_1_bool2=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19215);value = period.get(DurationFieldType.seconds());
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19216);break;
            case MILLIS:if (!__CLB4_4_1_bool2) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19217);__CLB4_4_1_bool2=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19218);value = period.get(DurationFieldType.millis());
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19219);break;
            case SECONDS_MILLIS:if (!__CLB4_4_1_bool2) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19220);__CLB4_4_1_bool2=true;} // drop through
            case SECONDS_OPTIONAL_MILLIS:if (!__CLB4_4_1_bool2) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19221);__CLB4_4_1_bool2=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19222);int seconds = period.get(DurationFieldType.seconds());
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19223);int millis = period.get(DurationFieldType.millis());
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19224);value = (seconds * (long) DateTimeConstants.MILLIS_PER_SECOND) + millis;
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19225);break;
            }

            // determine if period is zero and this is the last field
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19226);if ((((value == 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19227)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19228)==0&false))) {{
                boolean __CLB4_4_1_bool3=false;__CLR4_4_1e9me9mlc8aztoc.R.inc(19229);switch (iPrintZeroSetting) {
                case PRINT_ZERO_NEVER:if (!__CLB4_4_1_bool3) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19230);__CLB4_4_1_bool3=true;}
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19231);return Long.MAX_VALUE;
                case PRINT_ZERO_RARELY_LAST:if (!__CLB4_4_1_bool3) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19232);__CLB4_4_1_bool3=true;}
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19233);if ((((isZero(period) && iFieldFormatters[iFieldType] == this)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19234)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19235)==0&false))) {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19236);for (int i = iFieldType + 1; (((i <= MAX_FIELD)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19237)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19238)==0&false)); i++) {{
                            __CLR4_4_1e9me9mlc8aztoc.R.inc(19239);if ((((isSupported(type, i) && iFieldFormatters[i] != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19240)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19241)==0&false))) {{
                                __CLR4_4_1e9me9mlc8aztoc.R.inc(19242);return Long.MAX_VALUE;
                            }
                        }}
                    }} }else {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19243);return Long.MAX_VALUE;
                    }
                    }__CLR4_4_1e9me9mlc8aztoc.R.inc(19244);break;
                case PRINT_ZERO_RARELY_FIRST:if (!__CLB4_4_1_bool3) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19245);__CLB4_4_1_bool3=true;}
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19246);if ((((isZero(period) && iFieldFormatters[iFieldType] == this)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19247)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19248)==0&false))) {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19249);int i = Math.min(iFieldType, 8);  // line split out for IBM JDK
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19250);i--;                              // see bug 1660490
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19251);for (; (((i >= 0 && i <= MAX_FIELD)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19252)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19253)==0&false)); i--) {{
                            __CLR4_4_1e9me9mlc8aztoc.R.inc(19254);if ((((isSupported(type, i) && iFieldFormatters[i] != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19255)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19256)==0&false))) {{
                                __CLR4_4_1e9me9mlc8aztoc.R.inc(19257);return Long.MAX_VALUE;
                            }
                        }}
                    }} }else {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19258);return Long.MAX_VALUE;
                    }
                    }__CLR4_4_1e9me9mlc8aztoc.R.inc(19259);break;
                }
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19260);return value;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        boolean isZero(ReadablePeriod period) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19261);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19262);for (int i = 0, isize = period.size(); (((i < isize)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19263)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19264)==0&false)); i++) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19265);if ((((period.getValue(i) != 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19266)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19267)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19268);return false;
                }
            }}
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19269);return true;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        boolean isSupported(PeriodType type, int field) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19270);
            boolean __CLB4_4_1_bool4=false;__CLR4_4_1e9me9mlc8aztoc.R.inc(19271);switch (field) {
            default:if (!__CLB4_4_1_bool4) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19272);__CLB4_4_1_bool4=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19273);return false;
            case YEARS:if (!__CLB4_4_1_bool4) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19274);__CLB4_4_1_bool4=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19275);return type.isSupported(DurationFieldType.years());
            case MONTHS:if (!__CLB4_4_1_bool4) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19276);__CLB4_4_1_bool4=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19277);return type.isSupported(DurationFieldType.months());
            case WEEKS:if (!__CLB4_4_1_bool4) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19278);__CLB4_4_1_bool4=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19279);return type.isSupported(DurationFieldType.weeks());
            case DAYS:if (!__CLB4_4_1_bool4) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19280);__CLB4_4_1_bool4=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19281);return type.isSupported(DurationFieldType.days());
            case HOURS:if (!__CLB4_4_1_bool4) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19282);__CLB4_4_1_bool4=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19283);return type.isSupported(DurationFieldType.hours());
            case MINUTES:if (!__CLB4_4_1_bool4) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19284);__CLB4_4_1_bool4=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19285);return type.isSupported(DurationFieldType.minutes());
            case SECONDS:if (!__CLB4_4_1_bool4) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19286);__CLB4_4_1_bool4=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19287);return type.isSupported(DurationFieldType.seconds());
            case MILLIS:if (!__CLB4_4_1_bool4) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19288);__CLB4_4_1_bool4=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19289);return type.isSupported(DurationFieldType.millis());
            case SECONDS_MILLIS:if (!__CLB4_4_1_bool4) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19290);__CLB4_4_1_bool4=true;} // drop through
            case SECONDS_OPTIONAL_MILLIS:if (!__CLB4_4_1_bool4) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19291);__CLB4_4_1_bool4=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19292);return type.isSupported(DurationFieldType.seconds()) ||
                       type.isSupported(DurationFieldType.millis());
            }
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        void setFieldValue(ReadWritablePeriod period, int field, int value) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19293);
            boolean __CLB4_4_1_bool5=false;__CLR4_4_1e9me9mlc8aztoc.R.inc(19294);switch (field) {
            default:if (!__CLB4_4_1_bool5) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19295);__CLB4_4_1_bool5=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19296);break;
            case YEARS:if (!__CLB4_4_1_bool5) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19297);__CLB4_4_1_bool5=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19298);period.setYears(value);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19299);break;
            case MONTHS:if (!__CLB4_4_1_bool5) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19300);__CLB4_4_1_bool5=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19301);period.setMonths(value);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19302);break;
            case WEEKS:if (!__CLB4_4_1_bool5) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19303);__CLB4_4_1_bool5=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19304);period.setWeeks(value);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19305);break;
            case DAYS:if (!__CLB4_4_1_bool5) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19306);__CLB4_4_1_bool5=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19307);period.setDays(value);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19308);break;
            case HOURS:if (!__CLB4_4_1_bool5) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19309);__CLB4_4_1_bool5=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19310);period.setHours(value);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19311);break;
            case MINUTES:if (!__CLB4_4_1_bool5) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19312);__CLB4_4_1_bool5=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19313);period.setMinutes(value);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19314);break;
            case SECONDS:if (!__CLB4_4_1_bool5) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19315);__CLB4_4_1_bool5=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19316);period.setSeconds(value);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19317);break;
            case MILLIS:if (!__CLB4_4_1_bool5) {__CLR4_4_1e9me9mlc8aztoc.R.inc(19318);__CLB4_4_1_bool5=true;}
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19319);period.setMillis(value);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19320);break;
            }
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        int getFieldType() {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19321);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19322);return iFieldType;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Handles a simple literal piece of text.
     */
    static class Literal
            implements PeriodPrinter, PeriodParser {
        static final Literal EMPTY = new Literal("");
        private final String iText;

        Literal(String text) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19323);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19324);iText = text;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19325);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19326);return 0;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int calculatePrintedLength(ReadablePeriod period, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19327);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19328);return iText.length();
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19329);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19330);buf.append(iText);
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19331);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19332);out.write(iText);
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int parseInto(
                ReadWritablePeriod period, String periodStr,
                int position, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19333);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19334);if ((((periodStr.regionMatches(true, position, iText, 0, iText.length()))&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19335)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19336)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19337);return position + iText.length();
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19338);return ~position;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Handles a separator, that splits the fields into multiple parts.
     * For example, the 'T' in the ISO8601 standard.
     */
    static class Separator
            implements PeriodPrinter, PeriodParser {
        private final String iText;
        private final String iFinalText;
        private final String[] iParsedForms;

        private final boolean iUseBefore;
        private final boolean iUseAfter;

        private final PeriodPrinter iBeforePrinter;
        private volatile PeriodPrinter iAfterPrinter;
        private final PeriodParser iBeforeParser;
        private volatile PeriodParser iAfterParser;

        Separator(String text, String finalText, String[] variants,
                PeriodPrinter beforePrinter, PeriodParser beforeParser,
                boolean useBefore, boolean useAfter) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19339);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19340);iText = text;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19341);iFinalText = finalText;

            __CLR4_4_1e9me9mlc8aztoc.R.inc(19342);if (((((finalText == null || text.equals(finalText)) &&
                (variants == null || variants.length == 0))&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19343)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19344)==0&false))) {{

                __CLR4_4_1e9me9mlc8aztoc.R.inc(19345);iParsedForms = new String[] {text};
            } }else {{
                // Filter and reverse sort the parsed forms.
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19346);TreeSet<String> parsedSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19347);parsedSet.add(text);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19348);parsedSet.add(finalText);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19349);if ((((variants != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19350)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19351)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19352);for (int i=variants.length; (((--i>=0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19353)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19354)==0&false)); ) {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19355);parsedSet.add(variants[i]);
                    }
                }}
                }__CLR4_4_1e9me9mlc8aztoc.R.inc(19356);ArrayList<String> parsedList = new ArrayList<String>(parsedSet);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19357);Collections.reverse(parsedList);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19358);iParsedForms = parsedList.toArray(new String[parsedList.size()]);
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19359);iBeforePrinter = beforePrinter;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19360);iBeforeParser = beforeParser;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19361);iUseBefore = useBefore;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19362);iUseAfter = useAfter;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19363);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19364);int sum = iBeforePrinter.countFieldsToPrint(period, stopAt, locale);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19365);if ((((sum < stopAt)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19366)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19367)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19368);sum += iAfterPrinter.countFieldsToPrint(period, stopAt, locale);
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19369);return sum;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int calculatePrintedLength(ReadablePeriod period, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19370);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19371);PeriodPrinter before = iBeforePrinter;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19372);PeriodPrinter after = iAfterPrinter;
            
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19373);int sum = before.calculatePrintedLength(period, locale)
                    + after.calculatePrintedLength(period, locale);
            
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19374);if ((((iUseBefore)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19375)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19376)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19377);if ((((before.countFieldsToPrint(period, 1, locale) > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19378)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19379)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19380);if ((((iUseAfter)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19381)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19382)==0&false))) {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19383);int afterCount = after.countFieldsToPrint(period, 2, locale);
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19384);if ((((afterCount > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19385)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19386)==0&false))) {{
                            __CLR4_4_1e9me9mlc8aztoc.R.inc(19387);sum += ((((afterCount > 1 )&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19388)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19389)==0&false))? iText : iFinalText).length();
                        }
                    }} }else {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19390);sum += iText.length();
                    }
                }}
            }} }else {__CLR4_4_1e9me9mlc8aztoc.R.inc(19391);if ((((iUseAfter && after.countFieldsToPrint(period, 1, locale) > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19392)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19393)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19394);sum += iText.length();
            }
            
            }}__CLR4_4_1e9me9mlc8aztoc.R.inc(19395);return sum;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19396);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19397);PeriodPrinter before = iBeforePrinter;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19398);PeriodPrinter after = iAfterPrinter;
            
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19399);before.printTo(buf, period, locale);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19400);if ((((iUseBefore)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19401)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19402)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19403);if ((((before.countFieldsToPrint(period, 1, locale) > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19404)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19405)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19406);if ((((iUseAfter)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19407)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19408)==0&false))) {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19409);int afterCount = after.countFieldsToPrint(period, 2, locale);
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19410);if ((((afterCount > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19411)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19412)==0&false))) {{
                            __CLR4_4_1e9me9mlc8aztoc.R.inc(19413);buf.append((((afterCount > 1 )&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19414)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19415)==0&false))? iText : iFinalText);
                        }
                    }} }else {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19416);buf.append(iText);
                    }
                }}
            }} }else {__CLR4_4_1e9me9mlc8aztoc.R.inc(19417);if ((((iUseAfter && after.countFieldsToPrint(period, 1, locale) > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19418)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19419)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19420);buf.append(iText);
            }
            }}__CLR4_4_1e9me9mlc8aztoc.R.inc(19421);after.printTo(buf, period, locale);
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19422);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19423);PeriodPrinter before = iBeforePrinter;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19424);PeriodPrinter after = iAfterPrinter;
            
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19425);before.printTo(out, period, locale);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19426);if ((((iUseBefore)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19427)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19428)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19429);if ((((before.countFieldsToPrint(period, 1, locale) > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19430)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19431)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19432);if ((((iUseAfter)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19433)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19434)==0&false))) {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19435);int afterCount = after.countFieldsToPrint(period, 2, locale);
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19436);if ((((afterCount > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19437)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19438)==0&false))) {{
                            __CLR4_4_1e9me9mlc8aztoc.R.inc(19439);out.write((((afterCount > 1 )&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19440)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19441)==0&false))? iText : iFinalText);
                        }
                    }} }else {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19442);out.write(iText);
                    }
                }}
            }} }else {__CLR4_4_1e9me9mlc8aztoc.R.inc(19443);if ((((iUseAfter && after.countFieldsToPrint(period, 1, locale) > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19444)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19445)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19446);out.write(iText);
            }
            }}__CLR4_4_1e9me9mlc8aztoc.R.inc(19447);after.printTo(out, period, locale);
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int parseInto(
                ReadWritablePeriod period, String periodStr,
                int position, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19448);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19449);int oldPos = position;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19450);position = iBeforeParser.parseInto(period, periodStr, position, locale);

            __CLR4_4_1e9me9mlc8aztoc.R.inc(19451);if ((((position < 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19452)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19453)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19454);return position;
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19455);boolean found = false;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19456);int parsedFormLength = -1;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19457);if ((((position > oldPos)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19458)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19459)==0&false))) {{
                // Consume this separator.
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19460);String[] parsedForms = iParsedForms;
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19461);int length = parsedForms.length;
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19462);for (int i=0; (((i < length)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19463)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19464)==0&false)); i++) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19465);String parsedForm = parsedForms[i];
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19466);if (((((parsedForm == null || parsedForm.length() == 0) ||
                        periodStr.regionMatches
                        (true, position, parsedForm, 0, parsedForm.length()))&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19467)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19468)==0&false))) {{
                        
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19469);parsedFormLength = ((((parsedForm == null )&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19470)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19471)==0&false))? 0 : parsedForm.length());
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19472);position += parsedFormLength;
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19473);found = true;
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19474);break;
                    }
                }}
            }}

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19475);oldPos = position;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19476);position = iAfterParser.parseInto(period, periodStr, position, locale);

            __CLR4_4_1e9me9mlc8aztoc.R.inc(19477);if ((((position < 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19478)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19479)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19480);return position;
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19481);if ((((found && position == oldPos && parsedFormLength > 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19482)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19483)==0&false))) {{
                // Separator should not have been supplied.
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19484);return ~oldPos;
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19485);if ((((position > oldPos && !found && !iUseBefore)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19486)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19487)==0&false))) {{
                // Separator was required.
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19488);return ~oldPos;
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19489);return position;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        Separator finish(PeriodPrinter afterPrinter, PeriodParser afterParser) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19490);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19491);iAfterPrinter = afterPrinter;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19492);iAfterParser = afterParser;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19493);return this;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Composite implementation that merges other fields to create a full pattern.
     */
    static class Composite
            implements PeriodPrinter, PeriodParser {
        
        private final PeriodPrinter[] iPrinters;
        private final PeriodParser[] iParsers;

        Composite(List<Object> elementPairs) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19494);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19495);List<Object> printerList = new ArrayList<Object>();
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19496);List<Object> parserList = new ArrayList<Object>();

            __CLR4_4_1e9me9mlc8aztoc.R.inc(19497);decompose(elementPairs, printerList, parserList);

            __CLR4_4_1e9me9mlc8aztoc.R.inc(19498);if ((((printerList.size() <= 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19499)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19500)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19501);iPrinters = null;
            } }else {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19502);iPrinters = printerList.toArray(
                        new PeriodPrinter[printerList.size()]);
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19503);if ((((parserList.size() <= 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19504)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19505)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19506);iParsers = null;
            } }else {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19507);iParsers = parserList.toArray(
                        new PeriodParser[parserList.size()]);
            }
        }}finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19508);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19509);int sum = 0;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19510);PeriodPrinter[] printers = iPrinters;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19511);for (int i=printers.length; (((sum < stopAt && --i>=0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19512)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19513)==0&false)); ) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19514);sum += printers[i].countFieldsToPrint(period, Integer.MAX_VALUE, locale);
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19515);return sum;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int calculatePrintedLength(ReadablePeriod period, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19516);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19517);int sum = 0;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19518);PeriodPrinter[] printers = iPrinters;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19519);for (int i=printers.length; (((--i>=0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19520)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19521)==0&false)); ) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19522);sum += printers[i].calculatePrintedLength(period, locale);
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19523);return sum;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19524);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19525);PeriodPrinter[] printers = iPrinters;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19526);int len = printers.length;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19527);for (int i=0; (((i<len)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19528)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19529)==0&false)); i++) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19530);printers[i].printTo(buf, period, locale);
            }
        }}finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19531);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19532);PeriodPrinter[] printers = iPrinters;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19533);int len = printers.length;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19534);for (int i=0; (((i<len)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19535)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19536)==0&false)); i++) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19537);printers[i].printTo(out, period, locale);
            }
        }}finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        public int parseInto(
                ReadWritablePeriod period, String periodStr,
                int position, Locale locale) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19538);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19539);PeriodParser[] parsers = iParsers;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19540);if ((((parsers == null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19541)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19542)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19543);throw new UnsupportedOperationException();
            }

            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19544);int len = parsers.length;
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19545);for (int i=0; (((i<len && position >= 0)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19546)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19547)==0&false)); i++) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19548);position = parsers[i].parseInto(period, periodStr, position, locale);
            }
            }__CLR4_4_1e9me9mlc8aztoc.R.inc(19549);return position;
        }finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        private void decompose(List<Object> elementPairs, List<Object> printerList, List<Object> parserList) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19550);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19551);int size = elementPairs.size();
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19552);for (int i=0; (((i<size)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19553)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19554)==0&false)); i+=2) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19555);Object element = elementPairs.get(i);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19556);if ((((element instanceof PeriodPrinter)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19557)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19558)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19559);if ((((element instanceof Composite)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19560)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19561)==0&false))) {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19562);addArrayToList(printerList, ((Composite) element).iPrinters);
                    } }else {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19563);printerList.add(element);
                    }
                }}

                }__CLR4_4_1e9me9mlc8aztoc.R.inc(19564);element = elementPairs.get(i + 1);
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19565);if ((((element instanceof PeriodParser)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19566)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19567)==0&false))) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19568);if ((((element instanceof Composite)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19569)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19570)==0&false))) {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19571);addArrayToList(parserList, ((Composite) element).iParsers);
                    } }else {{
                        __CLR4_4_1e9me9mlc8aztoc.R.inc(19572);parserList.add(element);
                    }
                }}
            }}
        }}finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}

        private void addArrayToList(List<Object> list, Object[] array) {try{__CLR4_4_1e9me9mlc8aztoc.R.inc(19573);
            __CLR4_4_1e9me9mlc8aztoc.R.inc(19574);if ((((array != null)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19575)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19576)==0&false))) {{
                __CLR4_4_1e9me9mlc8aztoc.R.inc(19577);for (int i=0; (((i<array.length)&&(__CLR4_4_1e9me9mlc8aztoc.R.iget(19578)!=0|true))||(__CLR4_4_1e9me9mlc8aztoc.R.iget(19579)==0&false)); i++) {{
                    __CLR4_4_1e9me9mlc8aztoc.R.inc(19580);list.add(array[i]);
                }
            }}
        }}finally{__CLR4_4_1e9me9mlc8aztoc.R.flushNeeded();}}
    }

}
