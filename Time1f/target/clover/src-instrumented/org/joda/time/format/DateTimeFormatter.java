/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

/**
 * Controls the printing and parsing of a datetime to and from a string.
 * <p>
 * This class is the main API for printing and parsing used by most applications.
 * Instances of this class are created via one of three factory classes:
 * <ul>
 * <li>{@link DateTimeFormat} - formats by pattern and style</li>
 * <li>{@link ISODateTimeFormat} - ISO8601 formats</li>
 * <li>{@link DateTimeFormatterBuilder} - complex formats created via method calls</li>
 * </ul>
 * <p>
 * An instance of this class holds a reference internally to one printer and
 * one parser. It is possible that one of these may be null, in which case the
 * formatter cannot print/parse. This can be checked via the {@link #isPrinter()}
 * and {@link #isParser()} methods.
 * <p>
 * The underlying printer/parser can be altered to behave exactly as required
 * by using one of the decorator modifiers:
 * <ul>
 * <li>{@link #withLocale(Locale)} - returns a new formatter that uses the specified locale</li>
 * <li>{@link #withZone(DateTimeZone)} - returns a new formatter that uses the specified time zone</li>
 * <li>{@link #withChronology(Chronology)} - returns a new formatter that uses the specified chronology</li>
 * <li>{@link #withOffsetParsed()} - returns a new formatter that returns the parsed time zone offset</li>
 * <li>{@link #withPivotYear(int)} - returns a new formatter with the specified pivot year</li>
 * <li>{@link #withDefaultYear(int)} - returns a new formatter with the specified default year</li>
 * </ul>
 * Each of these returns a new formatter (instances of this class are immutable).
 * <p>
 * The main methods of the class are the <code>printXxx</code> and
 * <code>parseXxx</code> methods. These are used as follows:
 * <pre>
 * // print using the defaults (default locale, chronology/zone of the datetime)
 * String dateStr = formatter.print(dt);
 * // print using the French locale
 * String dateStr = formatter.withLocale(Locale.FRENCH).print(dt);
 * // print using the UTC zone
 * String dateStr = formatter.withZone(DateTimeZone.UTC).print(dt);
 * 
 * // parse using the Paris zone
 * DateTime date = formatter.withZone(DateTimeZone.forID("Europe/Paris")).parseDateTime(str);
 * </pre>
 * <p>
 * Parsing builds up the resultant instant by 'setting' the value of each parsed field
 * from largest to smallest onto an initial instant, typically 1970-01-01T00:00Z.
 * This design means that day-of-month is set before day-of-week.
 * As such, if both the day-of-month and day-of-week are parsed, and the day-of-week
 * is incorrect, then the day-of-week overrides the day-of-month.
 * 
 * This has a side effect if the input is not consistent.
 * 
 * 
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @author Fredrik Borgh
 * @since 1.0
 */
public class DateTimeFormatter {public static class __CLR4_4_1br6br6lc8aztd8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,15540,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The internal printer used to output the datetime. */
    private final DateTimePrinter iPrinter;
    /** The internal parser used to output the datetime. */
    private final DateTimeParser iParser;
    /** The locale to use for printing and parsing. */
    private final Locale iLocale;
    /** Whether the offset is parsed. */
    private final boolean iOffsetParsed;
    /** The chronology to use as an override. */
    private final Chronology iChrono;
    /** The zone to use as an override. */
    private final DateTimeZone iZone;
    /** The pivot year to use for two-digit year parsing. */
    private final Integer iPivotYear;
    /** The default year for parsing month/day without year. */
    private final int iDefaultYear;

    /**
     * Creates a new formatter, however you will normally use the factory
     * or the builder.
     * 
     * @param printer  the internal printer, null if cannot print
     * @param parser  the internal parser, null if cannot parse
     */
    public DateTimeFormatter(
            DateTimePrinter printer, DateTimeParser parser) {
        super();__CLR4_4_1br6br6lc8aztd8.R.inc(15235);try{__CLR4_4_1br6br6lc8aztd8.R.inc(15234);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15236);iPrinter = printer;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15237);iParser = parser;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15238);iLocale = null;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15239);iOffsetParsed = false;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15240);iChrono = null;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15241);iZone = null;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15242);iPivotYear = null;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15243);iDefaultYear = 2000;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Constructor.
     */
    private DateTimeFormatter(
            DateTimePrinter printer, DateTimeParser parser,
            Locale locale, boolean offsetParsed,
            Chronology chrono, DateTimeZone zone,
            Integer pivotYear, int defaultYear) {
        super();__CLR4_4_1br6br6lc8aztd8.R.inc(15245);try{__CLR4_4_1br6br6lc8aztd8.R.inc(15244);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15246);iPrinter = printer;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15247);iParser = parser;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15248);iLocale = locale;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15249);iOffsetParsed = offsetParsed;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15250);iChrono = chrono;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15251);iZone = zone;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15252);iPivotYear = pivotYear;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15253);iDefaultYear = defaultYear;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Is this formatter capable of printing.
     * 
     * @return true if this is a printer
     */
    public boolean isPrinter() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15254);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15255);return (iPrinter != null);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Gets the internal printer object that performs the real printing work.
     * 
     * @return the internal printer; is null if printing not supported
     */
    public DateTimePrinter getPrinter() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15256);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15257);return iPrinter;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Is this formatter capable of parsing.
     * 
     * @return true if this is a parser
     */
    public boolean isParser() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15258);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15259);return (iParser != null);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Gets the internal parser object that performs the real parsing work.
     * 
     * @return the internal parser; is null if parsing not supported
     */
    public DateTimeParser getParser() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15260);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15261);return iParser;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new formatter with a different locale that will be used
     * for printing and parsing.
     * <p>
     * A DateTimeFormatter is immutable, so a new instance is returned,
     * and the original is unaltered and still usable.
     * 
     * @param locale the locale to use; if null, formatter uses default locale
     * at invocation time
     * @return the new formatter
     */
    public DateTimeFormatter withLocale(Locale locale) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15262);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15263);if ((((locale == getLocale() || (locale != null && locale.equals(getLocale())))&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15264)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15265)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15266);return this;
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15267);return new DateTimeFormatter(iPrinter, iParser, locale,
                iOffsetParsed, iChrono, iZone, iPivotYear, iDefaultYear);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Gets the locale that will be used for printing and parsing.
     * 
     * @return the locale to use; if null, formatter uses default locale at
     * invocation time
     */
    public Locale getLocale() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15268);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15269);return iLocale;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new formatter that will create a datetime with a time zone
     * equal to that of the offset of the parsed string.
     * <p>
     * After calling this method, a string '2004-06-09T10:20:30-08:00' will
     * create a datetime with a zone of -08:00 (a fixed zone, with no daylight
     * savings rules). If the parsed string represents a local time (no zone
     * offset) the parsed datetime will be in the default zone.
     * <p>
     * Calling this method sets the override zone to null.
     * Calling the override zone method sets this flag off.
     * 
     * @return the new formatter
     */
    public DateTimeFormatter withOffsetParsed() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15270);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15271);if ((((iOffsetParsed == true)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15272)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15273)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15274);return this;
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15275);return new DateTimeFormatter(iPrinter, iParser, iLocale,
                true, iChrono, null, iPivotYear, iDefaultYear);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Checks whether the offset from the string is used as the zone of
     * the parsed datetime.
     * 
     * @return true if the offset from the string is used as the zone
     */
    public boolean isOffsetParsed() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15276);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15277);return iOffsetParsed;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new formatter that will use the specified chronology in
     * preference to that of the printed object, or ISO on a parse.
     * <p>
     * When printing, this chronolgy will be used in preference to the chronology
     * from the datetime that would otherwise be used.
     * <p>
     * When parsing, this chronology will be set on the parsed datetime.
     * <p>
     * A null chronology means no-override.
     * If both an override chronology and an override zone are set, the
     * override zone will take precedence over the zone in the chronology.
     * 
     * @param chrono  the chronology to use as an override
     * @return the new formatter
     */
    public DateTimeFormatter withChronology(Chronology chrono) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15278);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15279);if ((((iChrono == chrono)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15280)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15281)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15282);return this;
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15283);return new DateTimeFormatter(iPrinter, iParser, iLocale,
                iOffsetParsed, chrono, iZone, iPivotYear, iDefaultYear);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Gets the chronology to use as an override.
     * 
     * @return the chronology to use as an override
     */
    public Chronology getChronology() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15284);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15285);return iChrono;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Gets the chronology to use as an override.
     * 
     * @return the chronology to use as an override
     * @deprecated Use the method with the correct spelling
     */
    @Deprecated
    public Chronology getChronolgy() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15286);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15287);return iChrono;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new formatter that will use the UTC zone in preference
     * to the zone of the printed object, or default zone on a parse.
     * <p>
     * When printing, UTC will be used in preference to the zone
     * from the datetime that would otherwise be used.
     * <p>
     * When parsing, UTC will be set on the parsed datetime.
     * <p>
     * If both an override chronology and an override zone are set, the
     * override zone will take precedence over the zone in the chronology.
     * 
     * @return the new formatter, never null
     * @since 2.0
     */
    public DateTimeFormatter withZoneUTC() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15288);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15289);return withZone(DateTimeZone.UTC);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Returns a new formatter that will use the specified zone in preference
     * to the zone of the printed object, or default zone on a parse.
     * <p>
     * When printing, this zone will be used in preference to the zone
     * from the datetime that would otherwise be used.
     * <p>
     * When parsing, this zone will be set on the parsed datetime.
     * <p>
     * A null zone means of no-override.
     * If both an override chronology and an override zone are set, the
     * override zone will take precedence over the zone in the chronology.
     * 
     * @param zone  the zone to use as an override
     * @return the new formatter
     */
    public DateTimeFormatter withZone(DateTimeZone zone) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15290);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15291);if ((((iZone == zone)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15292)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15293)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15294);return this;
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15295);return new DateTimeFormatter(iPrinter, iParser, iLocale,
                false, iChrono, zone, iPivotYear, iDefaultYear);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Gets the zone to use as an override.
     * 
     * @return the zone to use as an override
     */
    public DateTimeZone getZone() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15296);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15297);return iZone;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new formatter that will use the specified pivot year for two
     * digit year parsing in preference to that stored in the parser.
     * <p>
     * This setting is useful for changing the pivot year of formats built
     * using a pattern - {@link DateTimeFormat#forPattern(String)}.
     * <p>
     * When parsing, this pivot year is used. Null means no-override.
     * There is no effect when printing.
     * <p>
     * The pivot year enables a two digit year to be converted to a four
     * digit year. The pivot represents the year in the middle of the
     * supported range of years. Thus the full range of years that will
     * be built is <code>(pivot - 50) .. (pivot + 49)</code>.
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
     * @param pivotYear  the pivot year to use as an override when parsing
     * @return the new formatter
     * @since 1.1
     */
    public DateTimeFormatter withPivotYear(Integer pivotYear) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15298);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15299);if ((((iPivotYear == pivotYear || (iPivotYear != null && iPivotYear.equals(pivotYear)))&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15300)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15301)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15302);return this;
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15303);return new DateTimeFormatter(iPrinter, iParser, iLocale,
                iOffsetParsed, iChrono, iZone, pivotYear, iDefaultYear);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Returns a new formatter that will use the specified pivot year for two
     * digit year parsing in preference to that stored in the parser.
     * <p>
     * This setting is useful for changing the pivot year of formats built
     * using a pattern - {@link DateTimeFormat#forPattern(String)}.
     * <p>
     * When parsing, this pivot year is used.
     * There is no effect when printing.
     * <p>
     * The pivot year enables a two digit year to be converted to a four
     * digit year. The pivot represents the year in the middle of the
     * supported range of years. Thus the full range of years that will
     * be built is <code>(pivot - 50) .. (pivot + 49)</code>.
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
     * @param pivotYear  the pivot year to use as an override when parsing
     * @return the new formatter
     * @since 1.1
     */
    public DateTimeFormatter withPivotYear(int pivotYear) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15304);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15305);return withPivotYear(Integer.valueOf(pivotYear));
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Gets the pivot year to use as an override.
     *
     * @return the pivot year to use as an override
     * @since 1.1
     */
    public Integer getPivotYear() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15306);
      __CLR4_4_1br6br6lc8aztd8.R.inc(15307);return iPivotYear;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a new formatter that will use the specified default year.
     * <p>
     * The default year is used when parsing in the case where there is a
     * month or a day but not a year. Specifically, it is used if there is
     * a field parsed with a duration between the length of a month and the
     * length of a day inclusive.
     * <p>
     * This value is typically used to move the year from 1970 to a leap year
     * to enable February 29th to be parsed.
     * Unless customised, the year 2000 is used.
     * <p>
     * This setting has no effect when printing.
     *
     * @param defaultYear  the default year to use
     * @return the new formatter, not null
     * @since 2.0
     */
    public DateTimeFormatter withDefaultYear(int defaultYear) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15308);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15309);return new DateTimeFormatter(iPrinter, iParser, iLocale,
                iOffsetParsed, iChrono, iZone, iPivotYear, defaultYear);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Gets the default year for parsing months and days.
     *
     * @return the default year for parsing months and days
     * @since 2.0
     */
    public int getDefaultYear() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15310);
      __CLR4_4_1br6br6lc8aztd8.R.inc(15311);return iDefaultYear;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Prints a ReadableInstant, using the chronology supplied by the instant.
     *
     * @param buf  the destination to format to, not null
     * @param instant  instant to format, null means now
     */
    public void printTo(StringBuffer buf, ReadableInstant instant) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15312);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15313);long millis = DateTimeUtils.getInstantMillis(instant);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15314);Chronology chrono = DateTimeUtils.getInstantChronology(instant);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15315);printTo(buf, millis, chrono);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Prints a ReadableInstant, using the chronology supplied by the instant.
     *
     * @param out  the destination to format to, not null
     * @param instant  instant to format, null means now
     */
    public void printTo(Writer out, ReadableInstant instant) throws IOException {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15316);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15317);long millis = DateTimeUtils.getInstantMillis(instant);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15318);Chronology chrono = DateTimeUtils.getInstantChronology(instant);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15319);printTo(out, millis, chrono);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Prints a ReadableInstant, using the chronology supplied by the instant.
     *
     * @param appendable  the destination to format to, not null
     * @param instant  instant to format, null means now
     * @since 2.0
     */
    public void printTo(Appendable appendable, ReadableInstant instant) throws IOException {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15320);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15321);appendable.append(print(instant));
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Prints an instant from milliseconds since 1970-01-01T00:00:00Z,
     * using ISO chronology in the default DateTimeZone.
     *
     * @param buf  the destination to format to, not null
     * @param instant  millis since 1970-01-01T00:00:00Z
     */
    public void printTo(StringBuffer buf, long instant) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15322);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15323);printTo(buf, instant, null);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Prints an instant from milliseconds since 1970-01-01T00:00:00Z,
     * using ISO chronology in the default DateTimeZone.
     *
     * @param out  the destination to format to, not null
     * @param instant  millis since 1970-01-01T00:00:00Z
     */
    public void printTo(Writer out, long instant) throws IOException {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15324);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15325);printTo(out, instant, null);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Prints an instant from milliseconds since 1970-01-01T00:00:00Z,
     * using ISO chronology in the default DateTimeZone.
     *
     * @param appendable  the destination to format to, not null
     * @param instant  millis since 1970-01-01T00:00:00Z
     * @since 2.0
     */
    public void printTo(Appendable appendable, long instant) throws IOException {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15326);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15327);appendable.append(print(instant));
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Prints a ReadablePartial.
     * <p>
     * Neither the override chronology nor the override zone are used
     * by this method.
     *
     * @param buf  the destination to format to, not null
     * @param partial  partial to format
     */
    public void printTo(StringBuffer buf, ReadablePartial partial) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15328);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15329);DateTimePrinter printer = requirePrinter();
        __CLR4_4_1br6br6lc8aztd8.R.inc(15330);if ((((partial == null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15331)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15332)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15333);throw new IllegalArgumentException("The partial must not be null");
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15334);printer.printTo(buf, partial, iLocale);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Prints a ReadablePartial.
     * <p>
     * Neither the override chronology nor the override zone are used
     * by this method.
     *
     * @param out  the destination to format to, not null
     * @param partial  partial to format
     */
    public void printTo(Writer out, ReadablePartial partial) throws IOException {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15335);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15336);DateTimePrinter printer = requirePrinter();
        __CLR4_4_1br6br6lc8aztd8.R.inc(15337);if ((((partial == null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15338)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15339)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15340);throw new IllegalArgumentException("The partial must not be null");
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15341);printer.printTo(out, partial, iLocale);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Prints a ReadablePartial.
     * <p>
     * Neither the override chronology nor the override zone are used
     * by this method.
     *
     * @param appendable  the destination to format to, not null
     * @param partial  partial to format
     * @since 2.0
     */
    public void printTo(Appendable appendable, ReadablePartial partial) throws IOException {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15342);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15343);appendable.append(print(partial));
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Prints a ReadableInstant to a String.
     * <p>
     * This method will use the override zone and the override chronololgy if
     * they are set. Otherwise it will use the chronology and zone of the instant.
     *
     * @param instant  instant to format, null means now
     * @return the printed result
     */
    public String print(ReadableInstant instant) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15344);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15345);StringBuffer buf = new StringBuffer(requirePrinter().estimatePrintedLength());
        __CLR4_4_1br6br6lc8aztd8.R.inc(15346);printTo(buf, instant);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15347);return buf.toString();
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Prints a millisecond instant to a String.
     * <p>
     * This method will use the override zone and the override chronololgy if
     * they are set. Otherwise it will use the ISO chronology and default zone.
     *
     * @param instant  millis since 1970-01-01T00:00:00Z
     * @return the printed result
     */
    public String print(long instant) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15348);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15349);StringBuffer buf = new StringBuffer(requirePrinter().estimatePrintedLength());
        __CLR4_4_1br6br6lc8aztd8.R.inc(15350);printTo(buf, instant);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15351);return buf.toString();
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Prints a ReadablePartial to a new String.
     * <p>
     * Neither the override chronology nor the override zone are used
     * by this method.
     *
     * @param partial  partial to format
     * @return the printed result
     */
    public String print(ReadablePartial partial) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15352);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15353);StringBuffer buf = new StringBuffer(requirePrinter().estimatePrintedLength());
        __CLR4_4_1br6br6lc8aztd8.R.inc(15354);printTo(buf, partial);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15355);return buf.toString();
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    private void printTo(StringBuffer buf, long instant, Chronology chrono) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15356);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15357);DateTimePrinter printer = requirePrinter();
        __CLR4_4_1br6br6lc8aztd8.R.inc(15358);chrono = selectChronology(chrono);
        // Shift instant into local time (UTC) to avoid excessive offset
        // calculations when printing multiple fields in a composite printer.
        __CLR4_4_1br6br6lc8aztd8.R.inc(15359);DateTimeZone zone = chrono.getZone();
        __CLR4_4_1br6br6lc8aztd8.R.inc(15360);int offset = zone.getOffset(instant);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15361);long adjustedInstant = instant + offset;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15362);if (((((instant ^ adjustedInstant) < 0 && (instant ^ offset) >= 0)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15363)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15364)==0&false))) {{
            // Time zone offset overflow, so revert to UTC.
            __CLR4_4_1br6br6lc8aztd8.R.inc(15365);zone = DateTimeZone.UTC;
            __CLR4_4_1br6br6lc8aztd8.R.inc(15366);offset = 0;
            __CLR4_4_1br6br6lc8aztd8.R.inc(15367);adjustedInstant = instant;
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15368);printer.printTo(buf, adjustedInstant, chrono.withUTC(), offset, zone, iLocale);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    private void printTo(Writer buf, long instant, Chronology chrono) throws IOException {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15369);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15370);DateTimePrinter printer = requirePrinter();
        __CLR4_4_1br6br6lc8aztd8.R.inc(15371);chrono = selectChronology(chrono);
        // Shift instant into local time (UTC) to avoid excessive offset
        // calculations when printing multiple fields in a composite printer.
        __CLR4_4_1br6br6lc8aztd8.R.inc(15372);DateTimeZone zone = chrono.getZone();
        __CLR4_4_1br6br6lc8aztd8.R.inc(15373);int offset = zone.getOffset(instant);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15374);long adjustedInstant = instant + offset;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15375);if (((((instant ^ adjustedInstant) < 0 && (instant ^ offset) >= 0)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15376)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15377)==0&false))) {{
            // Time zone offset overflow, so revert to UTC.
            __CLR4_4_1br6br6lc8aztd8.R.inc(15378);zone = DateTimeZone.UTC;
            __CLR4_4_1br6br6lc8aztd8.R.inc(15379);offset = 0;
            __CLR4_4_1br6br6lc8aztd8.R.inc(15380);adjustedInstant = instant;
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15381);printer.printTo(buf, adjustedInstant, chrono.withUTC(), offset, zone, iLocale);
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Checks whether printing is supported.
     * 
     * @throws UnsupportedOperationException if printing is not supported
     */
    private DateTimePrinter requirePrinter() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15382);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15383);DateTimePrinter printer = iPrinter;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15384);if ((((printer == null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15385)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15386)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15387);throw new UnsupportedOperationException("Printing not supported");
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15388);return printer;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Parses a datetime from the given text, at the given position, saving the
     * result into the fields of the given ReadWritableInstant. If the parse
     * succeeds, the return value is the new text position. Note that the parse
     * may succeed without fully reading the text and in this case those fields
     * that were read will be set.
     * <p>
     * Only those fields present in the string will be changed in the specified
     * instant. All other fields will remain unaltered. Thus if the string only
     * contains a year and a month, then the day and time will be retained from
     * the input instant. If this is not the behaviour you want, then reset the
     * fields before calling this method, or use {@link #parseDateTime(String)}
     * or {@link #parseMutableDateTime(String)}.
     * <p>
     * If it fails, the return value is negative, but the instant may still be
     * modified. To determine the position where the parse failed, apply the
     * one's complement operator (~) on the return value.
     * <p>
     * This parse method ignores the {@link #getDefaultYear() default year} and
     * parses using the year from the supplied instant based on the chronology
     * and time-zone of the supplied instant.
     * <p>
     * The parse will use the chronology of the instant.
     *
     * @param instant  an instant that will be modified, not null
     * @param text  the text to parse
     * @param position  position to start parsing from
     * @return new position, negative value means parse failed -
     *  apply complement operator (~) to get position of failure
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException if the instant is null
     * @throws IllegalArgumentException if any field is out of range
     */
    public int parseInto(ReadWritableInstant instant, String text, int position) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15389);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15390);DateTimeParser parser = requireParser();
        __CLR4_4_1br6br6lc8aztd8.R.inc(15391);if ((((instant == null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15392)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15393)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15394);throw new IllegalArgumentException("Instant must not be null");
        }
        
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15395);long instantMillis = instant.getMillis();
        __CLR4_4_1br6br6lc8aztd8.R.inc(15396);Chronology chrono = instant.getChronology();
        __CLR4_4_1br6br6lc8aztd8.R.inc(15397);int defaultYear = DateTimeUtils.getChronology(chrono).year().get(instantMillis);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15398);long instantLocal = instantMillis + chrono.getZone().getOffset(instantMillis);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15399);chrono = selectChronology(chrono);
        
        __CLR4_4_1br6br6lc8aztd8.R.inc(15400);DateTimeParserBucket bucket = new DateTimeParserBucket(
            instantLocal, chrono, iLocale, iPivotYear, defaultYear);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15401);int newPos = parser.parseInto(bucket, text, position);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15402);instant.setMillis(bucket.computeMillis(false, text));
        __CLR4_4_1br6br6lc8aztd8.R.inc(15403);if ((((iOffsetParsed && bucket.getOffsetInteger() != null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15404)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15405)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15406);int parsedOffset = bucket.getOffsetInteger();
            __CLR4_4_1br6br6lc8aztd8.R.inc(15407);DateTimeZone parsedZone = DateTimeZone.forOffsetMillis(parsedOffset);
            __CLR4_4_1br6br6lc8aztd8.R.inc(15408);chrono = chrono.withZone(parsedZone);
        } }else {__CLR4_4_1br6br6lc8aztd8.R.inc(15409);if ((((bucket.getZone() != null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15410)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15411)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15412);chrono = chrono.withZone(bucket.getZone());
        }
        }}__CLR4_4_1br6br6lc8aztd8.R.inc(15413);instant.setChronology(chrono);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15414);if ((((iZone != null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15415)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15416)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15417);instant.setZone(iZone);
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15418);return newPos;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Parses a datetime from the given text, returning the number of
     * milliseconds since the epoch, 1970-01-01T00:00:00Z.
     * <p>
     * The parse will use the ISO chronology, and the default time zone.
     * If the text contains a time zone string then that will be taken into account.
     *
     * @param text  text to parse
     * @return parsed value expressed in milliseconds since the epoch
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException if the text to parse is invalid
     */
    public long parseMillis(String text) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15419);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15420);DateTimeParser parser = requireParser();
        
        __CLR4_4_1br6br6lc8aztd8.R.inc(15421);Chronology chrono = selectChronology(iChrono);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15422);DateTimeParserBucket bucket = new DateTimeParserBucket(0, chrono, iLocale, iPivotYear, iDefaultYear);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15423);int newPos = parser.parseInto(bucket, text, 0);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15424);if ((((newPos >= 0)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15425)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15426)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15427);if ((((newPos >= text.length())&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15428)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15429)==0&false))) {{
                __CLR4_4_1br6br6lc8aztd8.R.inc(15430);return bucket.computeMillis(true, text);
            }
        }} }else {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15431);newPos = ~newPos;
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15432);throw new IllegalArgumentException(FormatUtils.createErrorMessage(text, newPos));
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Parses only the local date from the given text, returning a new LocalDate.
     * <p>
     * This will parse the text fully according to the formatter, using the UTC zone.
     * Once parsed, only the local date will be used.
     * This means that any parsed time, time-zone or offset field is completely ignored.
     * It also means that the zone and offset-parsed settings are ignored.
     *
     * @param text  the text to parse, not null
     * @return the parsed date, never null
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException if the text to parse is invalid
     * @since 2.0
     */
    public LocalDate parseLocalDate(String text) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15433);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15434);return parseLocalDateTime(text).toLocalDate();
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Parses only the local time from the given text, returning a new LocalTime.
     * <p>
     * This will parse the text fully according to the formatter, using the UTC zone.
     * Once parsed, only the local time will be used.
     * This means that any parsed date, time-zone or offset field is completely ignored.
     * It also means that the zone and offset-parsed settings are ignored.
     *
     * @param text  the text to parse, not null
     * @return the parsed time, never null
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException if the text to parse is invalid
     * @since 2.0
     */
    public LocalTime parseLocalTime(String text) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15435);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15436);return parseLocalDateTime(text).toLocalTime();
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Parses only the local date-time from the given text, returning a new LocalDateTime.
     * <p>
     * This will parse the text fully according to the formatter, using the UTC zone.
     * Once parsed, only the local date-time will be used.
     * This means that any parsed time-zone or offset field is completely ignored.
     * It also means that the zone and offset-parsed settings are ignored.
     *
     * @param text  the text to parse, not null
     * @return the parsed date-time, never null
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException if the text to parse is invalid
     * @since 2.0
     */
    public LocalDateTime parseLocalDateTime(String text) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15437);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15438);DateTimeParser parser = requireParser();
        
        __CLR4_4_1br6br6lc8aztd8.R.inc(15439);Chronology chrono = selectChronology(null).withUTC();  // always use UTC, avoiding DST gaps
        __CLR4_4_1br6br6lc8aztd8.R.inc(15440);DateTimeParserBucket bucket = new DateTimeParserBucket(0, chrono, iLocale, iPivotYear, iDefaultYear);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15441);int newPos = parser.parseInto(bucket, text, 0);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15442);if ((((newPos >= 0)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15443)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15444)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15445);if ((((newPos >= text.length())&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15446)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15447)==0&false))) {{
                __CLR4_4_1br6br6lc8aztd8.R.inc(15448);long millis = bucket.computeMillis(true, text);
                __CLR4_4_1br6br6lc8aztd8.R.inc(15449);if ((((bucket.getOffsetInteger() != null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15450)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15451)==0&false))) {{  // treat withOffsetParsed() as being true
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15452);int parsedOffset = bucket.getOffsetInteger();
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15453);DateTimeZone parsedZone = DateTimeZone.forOffsetMillis(parsedOffset);
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15454);chrono = chrono.withZone(parsedZone);
                } }else {__CLR4_4_1br6br6lc8aztd8.R.inc(15455);if ((((bucket.getZone() != null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15456)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15457)==0&false))) {{
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15458);chrono = chrono.withZone(bucket.getZone());
                }
                }}__CLR4_4_1br6br6lc8aztd8.R.inc(15459);return new LocalDateTime(millis, chrono);
            }
        }} }else {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15460);newPos = ~newPos;
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15461);throw new IllegalArgumentException(FormatUtils.createErrorMessage(text, newPos));
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Parses a date-time from the given text, returning a new DateTime.
     * <p>
     * The parse will use the zone and chronology specified on this formatter.
     * <p>
     * If the text contains a time zone string then that will be taken into
     * account in adjusting the time of day as follows.
     * If the {@link #withOffsetParsed()} has been called, then the resulting
     * DateTime will have a fixed offset based on the parsed time zone.
     * Otherwise the resulting DateTime will have the zone of this formatter,
     * but the parsed zone may have caused the time to be adjusted.
     *
     * @param text  the text to parse, not null
     * @return the parsed date-time, never null
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException if the text to parse is invalid
     */
    public DateTime parseDateTime(String text) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15462);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15463);DateTimeParser parser = requireParser();
        
        __CLR4_4_1br6br6lc8aztd8.R.inc(15464);Chronology chrono = selectChronology(null);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15465);DateTimeParserBucket bucket = new DateTimeParserBucket(0, chrono, iLocale, iPivotYear, iDefaultYear);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15466);int newPos = parser.parseInto(bucket, text, 0);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15467);if ((((newPos >= 0)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15468)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15469)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15470);if ((((newPos >= text.length())&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15471)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15472)==0&false))) {{
                __CLR4_4_1br6br6lc8aztd8.R.inc(15473);long millis = bucket.computeMillis(true, text);
                __CLR4_4_1br6br6lc8aztd8.R.inc(15474);if ((((iOffsetParsed && bucket.getOffsetInteger() != null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15475)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15476)==0&false))) {{
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15477);int parsedOffset = bucket.getOffsetInteger();
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15478);DateTimeZone parsedZone = DateTimeZone.forOffsetMillis(parsedOffset);
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15479);chrono = chrono.withZone(parsedZone);
                } }else {__CLR4_4_1br6br6lc8aztd8.R.inc(15480);if ((((bucket.getZone() != null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15481)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15482)==0&false))) {{
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15483);chrono = chrono.withZone(bucket.getZone());
                }
                }}__CLR4_4_1br6br6lc8aztd8.R.inc(15484);DateTime dt = new DateTime(millis, chrono);
                __CLR4_4_1br6br6lc8aztd8.R.inc(15485);if ((((iZone != null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15486)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15487)==0&false))) {{
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15488);dt = dt.withZone(iZone);
                }
                }__CLR4_4_1br6br6lc8aztd8.R.inc(15489);return dt;
            }
        }} }else {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15490);newPos = ~newPos;
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15491);throw new IllegalArgumentException(FormatUtils.createErrorMessage(text, newPos));
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Parses a date-time from the given text, returning a new MutableDateTime.
     * <p>
     * The parse will use the zone and chronology specified on this formatter.
     * <p>
     * If the text contains a time zone string then that will be taken into
     * account in adjusting the time of day as follows.
     * If the {@link #withOffsetParsed()} has been called, then the resulting
     * DateTime will have a fixed offset based on the parsed time zone.
     * Otherwise the resulting DateTime will have the zone of this formatter,
     * but the parsed zone may have caused the time to be adjusted.
     *
     * @param text  the text to parse, not null
     * @return the parsed date-time, never null
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException if the text to parse is invalid
     */
    public MutableDateTime parseMutableDateTime(String text) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15492);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15493);DateTimeParser parser = requireParser();
        
        __CLR4_4_1br6br6lc8aztd8.R.inc(15494);Chronology chrono = selectChronology(null);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15495);DateTimeParserBucket bucket = new DateTimeParserBucket(0, chrono, iLocale, iPivotYear, iDefaultYear);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15496);int newPos = parser.parseInto(bucket, text, 0);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15497);if ((((newPos >= 0)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15498)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15499)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15500);if ((((newPos >= text.length())&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15501)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15502)==0&false))) {{
                __CLR4_4_1br6br6lc8aztd8.R.inc(15503);long millis = bucket.computeMillis(true, text);
                __CLR4_4_1br6br6lc8aztd8.R.inc(15504);if ((((iOffsetParsed && bucket.getOffsetInteger() != null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15505)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15506)==0&false))) {{
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15507);int parsedOffset = bucket.getOffsetInteger();
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15508);DateTimeZone parsedZone = DateTimeZone.forOffsetMillis(parsedOffset);
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15509);chrono = chrono.withZone(parsedZone);
                } }else {__CLR4_4_1br6br6lc8aztd8.R.inc(15510);if ((((bucket.getZone() != null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15511)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15512)==0&false))) {{
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15513);chrono = chrono.withZone(bucket.getZone());
                }
                }}__CLR4_4_1br6br6lc8aztd8.R.inc(15514);MutableDateTime dt = new MutableDateTime(millis, chrono);
                __CLR4_4_1br6br6lc8aztd8.R.inc(15515);if ((((iZone != null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15516)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15517)==0&false))) {{
                    __CLR4_4_1br6br6lc8aztd8.R.inc(15518);dt.setZone(iZone);
                }
                }__CLR4_4_1br6br6lc8aztd8.R.inc(15519);return dt;
            }
        }} }else {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15520);newPos = ~newPos;
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15521);throw new IllegalArgumentException(FormatUtils.createErrorMessage(text, newPos));
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    /**
     * Checks whether parsing is supported.
     * 
     * @throws UnsupportedOperationException if parsing is not supported
     */
    private DateTimeParser requireParser() {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15522);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15523);DateTimeParser parser = iParser;
        __CLR4_4_1br6br6lc8aztd8.R.inc(15524);if ((((parser == null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15525)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15526)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15527);throw new UnsupportedOperationException("Parsing not supported");
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15528);return parser;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Determines the correct chronology to use.
     *
     * @param chrono  the proposed chronology
     * @return the actual chronology
     */
    private Chronology selectChronology(Chronology chrono) {try{__CLR4_4_1br6br6lc8aztd8.R.inc(15529);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15530);chrono = DateTimeUtils.getChronology(chrono);
        __CLR4_4_1br6br6lc8aztd8.R.inc(15531);if ((((iChrono != null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15532)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15533)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15534);chrono = iChrono;
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15535);if ((((iZone != null)&&(__CLR4_4_1br6br6lc8aztd8.R.iget(15536)!=0|true))||(__CLR4_4_1br6br6lc8aztd8.R.iget(15537)==0&false))) {{
            __CLR4_4_1br6br6lc8aztd8.R.inc(15538);chrono = chrono.withZone(iZone);
        }
        }__CLR4_4_1br6br6lc8aztd8.R.inc(15539);return chrono;
    }finally{__CLR4_4_1br6br6lc8aztd8.R.flushNeeded();}}

}
