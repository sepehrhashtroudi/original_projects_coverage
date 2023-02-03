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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/**
 * Factory that creates instances of DateTimeFormatter from patterns and styles.
 * <p>
 * Datetime formatting is performed by the {@link DateTimeFormatter} class.
 * Three classes provide factory methods to create formatters, and this is one.
 * The others are {@link ISODateTimeFormat} and {@link DateTimeFormatterBuilder}.
 * <p>
 * This class provides two types of factory:
 * <ul>
 * <li>{@link #forPattern(String) Pattern} provides a DateTimeFormatter based on
 * a pattern string that is mostly compatible with the JDK date patterns.
 * <li>{@link #forStyle(String) Style} provides a DateTimeFormatter based on a
 * two character style, representing short, medium, long and full.
 * </ul>
 * <p>
 * For example, to use a patterm:
 * <pre>
 * DateTime dt = new DateTime();
 * DateTimeFormatter fmt = DateTimeFormat.forPattern("MMMM, yyyy");
 * String str = fmt.print(dt);
 * </pre>
 *
 * The pattern syntax is mostly compatible with java.text.SimpleDateFormat -
 * time zone names cannot be parsed and a few more symbols are supported.
 * All ASCII letters are reserved as pattern letters, which are defined as follows:
 * <blockquote>
 * <pre>
 * Symbol  Meaning                      Presentation  Examples
 * ------  -------                      ------------  -------
 * G       era                          text          AD
 * C       century of era (&gt;=0)         number        20
 * Y       year of era (&gt;=0)            year          1996
 *
 * x       weekyear                     year          1996
 * w       week of weekyear             number        27
 * e       day of week                  number        2
 * E       day of week                  text          Tuesday; Tue
 *
 * y       year                         year          1996
 * D       day of year                  number        189
 * M       month of year                month         July; Jul; 07
 * d       day of month                 number        10
 *
 * a       halfday of day               text          PM
 * K       hour of halfday (0~11)       number        0
 * h       clockhour of halfday (1~12)  number        12
 *
 * H       hour of day (0~23)           number        0
 * k       clockhour of day (1~24)      number        24
 * m       minute of hour               number        30
 * s       second of minute             number        55
 * S       fraction of second           millis        978
 *
 * z       time zone                    text          Pacific Standard Time; PST
 * Z       time zone offset/id          zone          -0800; -08:00; America/Los_Angeles
 *
 * '       escape for text              delimiter
 * ''      single quote                 literal       '
 * </pre>
 * </blockquote>
 * The count of pattern letters determine the format.
 * <p>
 * <strong>Text</strong>: If the number of pattern letters is 4 or more,
 * the full form is used; otherwise a short or abbreviated form is used if
 * available.
 * <p>
 * <strong>Number</strong>: The minimum number of digits.
 * Shorter numbers are zero-padded to this amount.
 * When parsing, any number of digits are accepted.
 * <p>
 * <strong>Year</strong>: Numeric presentation for year and weekyear fields
 * are handled specially. For example, if the count of 'y' is 2, the year
 * will be displayed as the zero-based year of the century, which is two
 * digits.
 * <p>
 * <strong>Month</strong>: 3 or over, use text, otherwise use number.
 * <p>
 * <strong>Millis</strong>: The exact number of fractional digits.
 * If more millisecond digits are available then specified the number will be truncated,
 * if there are fewer than specified then the number will be zero-padded to the right.
 * When parsing, only the exact number of digits are accepted.
 * <p>
 * <strong>Zone</strong>: 'Z' outputs offset without a colon, 'ZZ' outputs
 * the offset with a colon, 'ZZZ' or more outputs the zone id.
 * <p>
 * <strong>Zone names</strong>: Time zone names ('z') cannot be parsed.
 * <p>
 * Any characters in the pattern that are not in the ranges of ['a'..'z']
 * and ['A'..'Z'] will be treated as quoted text. For instance, characters
 * like ':', '.', ' ', '#' and '?' will appear in the resulting time text
 * even they are not embraced within single quotes.
 * <p>
 * DateTimeFormat is thread-safe and immutable, and the formatters it returns
 * are as well.
 *
 * @author Brian S O'Neill
 * @author Maxim Zhao
 * @since 1.0
 * @see ISODateTimeFormat
 * @see DateTimeFormatterBuilder
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DateTimeFormat {public static class __CLR4_4_1bgcbgclc8aztc3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,15234,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Style constant for FULL. */
    static final int FULL = 0;  // DateFormat.FULL
    /** Style constant for LONG. */
    static final int LONG = 1;  // DateFormat.LONG
    /** Style constant for MEDIUM. */
    static final int MEDIUM = 2;  // DateFormat.MEDIUM
    /** Style constant for SHORT. */
    static final int SHORT = 3;  // DateFormat.SHORT
    /** Style constant for NONE. */
    static final int NONE = 4;

    /** Type constant for DATE only. */
    static final int DATE = 0;
    /** Type constant for TIME only. */
    static final int TIME = 1;
    /** Type constant for DATETIME. */
    static final int DATETIME = 2;

    /** Maximum size of the pattern cache. */
    private static final int PATTERN_CACHE_SIZE = 500;

    /** Maps patterns to formatters via LRU, patterns don't vary by locale. */
    private static final Map<String, DateTimeFormatter> PATTERN_CACHE = new LinkedHashMap<String, DateTimeFormatter>(7) {
        private static final long serialVersionUID = 23L;
        @Override
        protected boolean removeEldestEntry(final Map.Entry<String, DateTimeFormatter> eldest) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14844);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(14845);return size() > PATTERN_CACHE_SIZE;
        }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}};
    };

    /** Maps patterns to formatters, patterns don't vary by locale. */
    private static final DateTimeFormatter[] STYLE_CACHE = new DateTimeFormatter[25];

    //-----------------------------------------------------------------------
    /**
     * Factory to create a formatter from a pattern string.
     * The pattern string is described above in the class level javadoc.
     * It is very similar to SimpleDateFormat patterns.
     * <p>
     * The format may contain locale specific output, and this will change as
     * you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * For example:
     * <pre>
     * DateTimeFormat.forPattern(pattern).withLocale(Locale.FRANCE).print(dt);
     * </pre>
     *
     * @param pattern  pattern specification
     * @return the formatter
     * @throws IllegalArgumentException if the pattern is invalid
     */
    public static DateTimeFormatter forPattern(String pattern) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14846);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14847);return createFormatterForPattern(pattern);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Factory to create a format from a two character style pattern.
     * <p>
     * The first character is the date style, and the second character is the
     * time style. Specify a character of 'S' for short style, 'M' for medium,
     * 'L' for long, and 'F' for full.
     * A date or time may be ommitted by specifying a style character '-'.
     * <p>
     * The returned formatter will dynamically adjust to the locale that
     * the print/parse takes place in. Thus you just call
     * {@link DateTimeFormatter#withLocale(Locale)} and the Short/Medium/Long/Full
     * style for that locale will be output. For example:
     * <pre>
     * DateTimeFormat.forStyle(style).withLocale(Locale.FRANCE).print(dt);
     * </pre>
     *
     * @param style  two characters from the set {"S", "M", "L", "F", "-"}
     * @return the formatter
     * @throws IllegalArgumentException if the style is invalid
     */
    public static DateTimeFormatter forStyle(String style) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14848);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14849);return createFormatterForStyle(style);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Returns the pattern used by a particular style and locale.
     * <p>
     * The first character is the date style, and the second character is the
     * time style. Specify a character of 'S' for short style, 'M' for medium,
     * 'L' for long, and 'F' for full.
     * A date or time may be ommitted by specifying a style character '-'.
     *
     * @param style  two characters from the set {"S", "M", "L", "F", "-"}
     * @param locale  locale to use, null means default
     * @return the formatter
     * @throws IllegalArgumentException if the style is invalid
     * @since 1.3
     */
    public static String patternForStyle(String style, Locale locale) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14850);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14851);DateTimeFormatter formatter = createFormatterForStyle(style);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14852);if ((((locale == null)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(14853)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(14854)==0&false))) {{
            __CLR4_4_1bgcbgclc8aztc3.R.inc(14855);locale = Locale.getDefault();
        }
        // Not pretty, but it works.
        }__CLR4_4_1bgcbgclc8aztc3.R.inc(14856);return ((StyleFormatter) formatter.getPrinter()).getPattern(locale);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a format that outputs a short date format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * 
     * @return the formatter
     */
    public static DateTimeFormatter shortDate() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14857);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14858);return createFormatterForStyleIndex(SHORT, NONE);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Creates a format that outputs a short time format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * 
     * @return the formatter
     */
    public static DateTimeFormatter shortTime() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14859);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14860);return createFormatterForStyleIndex(NONE, SHORT);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Creates a format that outputs a short datetime format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * 
     * @return the formatter
     */
    public static DateTimeFormatter shortDateTime() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14861);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14862);return createFormatterForStyleIndex(SHORT, SHORT);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a format that outputs a medium date format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * 
     * @return the formatter
     */
    public static DateTimeFormatter mediumDate() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14863);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14864);return createFormatterForStyleIndex(MEDIUM, NONE);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Creates a format that outputs a medium time format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * 
     * @return the formatter
     */
    public static DateTimeFormatter mediumTime() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14865);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14866);return createFormatterForStyleIndex(NONE, MEDIUM);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Creates a format that outputs a medium datetime format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * 
     * @return the formatter
     */
    public static DateTimeFormatter mediumDateTime() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14867);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14868);return createFormatterForStyleIndex(MEDIUM, MEDIUM);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a format that outputs a long date format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * 
     * @return the formatter
     */
    public static DateTimeFormatter longDate() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14869);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14870);return createFormatterForStyleIndex(LONG, NONE);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Creates a format that outputs a long time format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * 
     * @return the formatter
     */
    public static DateTimeFormatter longTime() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14871);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14872);return createFormatterForStyleIndex(NONE, LONG);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Creates a format that outputs a long datetime format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * 
     * @return the formatter
     */
    public static DateTimeFormatter longDateTime() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14873);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14874);return createFormatterForStyleIndex(LONG, LONG);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a format that outputs a full date format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * 
     * @return the formatter
     */
    public static DateTimeFormatter fullDate() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14875);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14876);return createFormatterForStyleIndex(FULL, NONE);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Creates a format that outputs a full time format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * 
     * @return the formatter
     */
    public static DateTimeFormatter fullTime() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14877);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14878);return createFormatterForStyleIndex(NONE, FULL);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Creates a format that outputs a full datetime format.
     * <p>
     * The format will change as you change the locale of the formatter.
     * Call {@link DateTimeFormatter#withLocale(Locale)} to switch the locale.
     * 
     * @return the formatter
     */
    public static DateTimeFormatter fullDateTime() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14879);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14880);return createFormatterForStyleIndex(FULL, FULL);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Parses the given pattern and appends the rules to the given
     * DateTimeFormatterBuilder.
     *
     * @param pattern  pattern specification
     * @throws IllegalArgumentException if the pattern is invalid
     */
    static void appendPatternTo(DateTimeFormatterBuilder builder, String pattern) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14881);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14882);parsePatternTo(builder, pattern);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructor.
     *
     * @since 1.1 (previously private)
     */
    protected DateTimeFormat() {
        super();__CLR4_4_1bgcbgclc8aztc3.R.inc(14884);try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14883);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Parses the given pattern and appends the rules to the given
     * DateTimeFormatterBuilder.
     *
     * @param pattern  pattern specification
     * @throws IllegalArgumentException if the pattern is invalid
     * @see #forPattern
     */
    private static void parsePatternTo(DateTimeFormatterBuilder builder, String pattern) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(14885);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14886);int length = pattern.length();
        __CLR4_4_1bgcbgclc8aztc3.R.inc(14887);int[] indexRef = new int[1];

        __CLR4_4_1bgcbgclc8aztc3.R.inc(14888);for (int i=0; (((i<length)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(14889)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(14890)==0&false)); i++) {{
            __CLR4_4_1bgcbgclc8aztc3.R.inc(14891);indexRef[0] = i;
            __CLR4_4_1bgcbgclc8aztc3.R.inc(14892);String token = parseToken(pattern, indexRef);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(14893);i = indexRef[0];

            __CLR4_4_1bgcbgclc8aztc3.R.inc(14894);int tokenLen = token.length();
            __CLR4_4_1bgcbgclc8aztc3.R.inc(14895);if ((((tokenLen == 0)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(14896)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(14897)==0&false))) {{
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14898);break;
            }
            }__CLR4_4_1bgcbgclc8aztc3.R.inc(14899);char c = token.charAt(0);

            boolean __CLB4_4_1_bool0=false;__CLR4_4_1bgcbgclc8aztc3.R.inc(14900);switch (c) {
            case 'G':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14901);__CLB4_4_1_bool0=true;} // era designator (text)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14902);builder.appendEraText();
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14903);break;
            case 'C':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14904);__CLB4_4_1_bool0=true;} // century of era (number)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14905);builder.appendCenturyOfEra(tokenLen, tokenLen);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14906);break;
            case 'x':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14907);__CLB4_4_1_bool0=true;} // weekyear (number)
            case 'y':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14908);__CLB4_4_1_bool0=true;} // year (number)
            case 'Y':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14909);__CLB4_4_1_bool0=true;} // year of era (number)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14910);if ((((tokenLen == 2)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(14911)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(14912)==0&false))) {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(14913);boolean lenientParse = true;

                    // Peek ahead to next token.
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(14914);if ((((i + 1 < length)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(14915)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(14916)==0&false))) {{
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14917);indexRef[0]++;
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14918);if ((((isNumericToken(parseToken(pattern, indexRef)))&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(14919)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(14920)==0&false))) {{
                            // If next token is a number, cannot support
                            // lenient parse, because it will consume digits
                            // that it should not.
                            __CLR4_4_1bgcbgclc8aztc3.R.inc(14921);lenientParse = false;
                        }
                        }__CLR4_4_1bgcbgclc8aztc3.R.inc(14922);indexRef[0]--;
                    }

                    // Use pivots which are compatible with SimpleDateFormat.
                    }boolean __CLB4_4_1_bool1=false;__CLR4_4_1bgcbgclc8aztc3.R.inc(14923);switch (c) {
                    case 'x':if (!__CLB4_4_1_bool1) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14924);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14925);builder.appendTwoDigitWeekyear
                            (new DateTime().getWeekyear() - 30, lenientParse);
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14926);break;
                    case 'y':if (!__CLB4_4_1_bool1) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14927);__CLB4_4_1_bool1=true;}
                    case 'Y':if (!__CLB4_4_1_bool1) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14928);__CLB4_4_1_bool1=true;}
                    default:if (!__CLB4_4_1_bool1) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14929);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14930);builder.appendTwoDigitYear(new DateTime().getYear() - 30, lenientParse);
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14931);break;
                    }
                } }else {{
                    // Try to support long year values.
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(14932);int maxDigits = 9;

                    // Peek ahead to next token.
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(14933);if ((((i + 1 < length)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(14934)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(14935)==0&false))) {{
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14936);indexRef[0]++;
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14937);if ((((isNumericToken(parseToken(pattern, indexRef)))&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(14938)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(14939)==0&false))) {{
                            // If next token is a number, cannot support long years.
                            __CLR4_4_1bgcbgclc8aztc3.R.inc(14940);maxDigits = tokenLen;
                        }
                        }__CLR4_4_1bgcbgclc8aztc3.R.inc(14941);indexRef[0]--;
                    }

                    }boolean __CLB4_4_1_bool2=false;__CLR4_4_1bgcbgclc8aztc3.R.inc(14942);switch (c) {
                    case 'x':if (!__CLB4_4_1_bool2) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14943);__CLB4_4_1_bool2=true;}
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14944);builder.appendWeekyear(tokenLen, maxDigits);
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14945);break;
                    case 'y':if (!__CLB4_4_1_bool2) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14946);__CLB4_4_1_bool2=true;}
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14947);builder.appendYear(tokenLen, maxDigits);
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14948);break;
                    case 'Y':if (!__CLB4_4_1_bool2) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14949);__CLB4_4_1_bool2=true;}
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14950);builder.appendYearOfEra(tokenLen, maxDigits);
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14951);break;
                    }
                }
                }__CLR4_4_1bgcbgclc8aztc3.R.inc(14952);break;
            case 'M':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14953);__CLB4_4_1_bool0=true;} // month of year (text and number)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14954);if ((((tokenLen >= 3)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(14955)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(14956)==0&false))) {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(14957);if ((((tokenLen >= 4)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(14958)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(14959)==0&false))) {{
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14960);builder.appendMonthOfYearText();
                    } }else {{
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(14961);builder.appendMonthOfYearShortText();
                    }
                }} }else {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(14962);builder.appendMonthOfYear(tokenLen);
                }
                }__CLR4_4_1bgcbgclc8aztc3.R.inc(14963);break;
            case 'd':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14964);__CLB4_4_1_bool0=true;} // day of month (number)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14965);builder.appendDayOfMonth(tokenLen);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14966);break;
            case 'a':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14967);__CLB4_4_1_bool0=true;} // am/pm marker (text)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14968);builder.appendHalfdayOfDayText();
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14969);break;
            case 'h':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14970);__CLB4_4_1_bool0=true;} // clockhour of halfday (number, 1..12)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14971);builder.appendClockhourOfHalfday(tokenLen);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14972);break;
            case 'H':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14973);__CLB4_4_1_bool0=true;} // hour of day (number, 0..23)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14974);builder.appendHourOfDay(tokenLen);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14975);break;
            case 'k':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14976);__CLB4_4_1_bool0=true;} // clockhour of day (1..24)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14977);builder.appendClockhourOfDay(tokenLen);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14978);break;
            case 'K':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14979);__CLB4_4_1_bool0=true;} // hour of halfday (0..11)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14980);builder.appendHourOfHalfday(tokenLen);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14981);break;
            case 'm':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14982);__CLB4_4_1_bool0=true;} // minute of hour (number)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14983);builder.appendMinuteOfHour(tokenLen);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14984);break;
            case 's':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14985);__CLB4_4_1_bool0=true;} // second of minute (number)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14986);builder.appendSecondOfMinute(tokenLen);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14987);break;
            case 'S':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14988);__CLB4_4_1_bool0=true;} // fraction of second (number)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14989);builder.appendFractionOfSecond(tokenLen, tokenLen);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14990);break;
            case 'e':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14991);__CLB4_4_1_bool0=true;} // day of week (number)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14992);builder.appendDayOfWeek(tokenLen);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14993);break;
            case 'E':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(14994);__CLB4_4_1_bool0=true;} // dayOfWeek (text)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(14995);if ((((tokenLen >= 4)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(14996)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(14997)==0&false))) {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(14998);builder.appendDayOfWeekText();
                } }else {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(14999);builder.appendDayOfWeekShortText();
                }
                }__CLR4_4_1bgcbgclc8aztc3.R.inc(15000);break;
            case 'D':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15001);__CLB4_4_1_bool0=true;} // day of year (number)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15002);builder.appendDayOfYear(tokenLen);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15003);break;
            case 'w':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15004);__CLB4_4_1_bool0=true;} // week of weekyear (number)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15005);builder.appendWeekOfWeekyear(tokenLen);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15006);break;
            case 'z':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15007);__CLB4_4_1_bool0=true;} // time zone (text)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15008);if ((((tokenLen >= 4)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15009)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15010)==0&false))) {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15011);builder.appendTimeZoneName();
                } }else {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15012);builder.appendTimeZoneShortName(null);
                }
                }__CLR4_4_1bgcbgclc8aztc3.R.inc(15013);break;
            case 'Z':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15014);__CLB4_4_1_bool0=true;} // time zone offset
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15015);if ((((tokenLen == 1)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15016)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15017)==0&false))) {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15018);builder.appendTimeZoneOffset(null, "Z", false, 2, 2);
                } }else {__CLR4_4_1bgcbgclc8aztc3.R.inc(15019);if ((((tokenLen == 2)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15020)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15021)==0&false))) {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15022);builder.appendTimeZoneOffset(null, "Z", true, 2, 2);
                } }else {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15023);builder.appendTimeZoneId();
                }
                }}__CLR4_4_1bgcbgclc8aztc3.R.inc(15024);break;
            case '\'':if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15025);__CLB4_4_1_bool0=true;} // literal text
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15026);String sub = token.substring(1);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15027);if ((((sub.length() == 1)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15028)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15029)==0&false))) {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15030);builder.appendLiteral(sub.charAt(0));
                } }else {{
                    // Create copy of sub since otherwise the temporary quoted
                    // string would still be referenced internally.
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15031);builder.appendLiteral(new String(sub));
                }
                }__CLR4_4_1bgcbgclc8aztc3.R.inc(15032);break;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15033);__CLB4_4_1_bool0=true;}
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15034);throw new IllegalArgumentException
                    ("Illegal pattern component: " + token);
            }
        }
    }}finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Parses an individual token.
     * 
     * @param pattern  the pattern string
     * @param indexRef  a single element array, where the input is the start
     *  location and the output is the location after parsing the token
     * @return the parsed token
     */
    private static String parseToken(String pattern, int[] indexRef) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15035);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15036);StringBuilder buf = new StringBuilder();

        __CLR4_4_1bgcbgclc8aztc3.R.inc(15037);int i = indexRef[0];
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15038);int length = pattern.length();

        __CLR4_4_1bgcbgclc8aztc3.R.inc(15039);char c = pattern.charAt(i);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15040);if ((((c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15041)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15042)==0&false))) {{
            // Scan a run of the same character, which indicates a time
            // pattern.
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15043);buf.append(c);

            __CLR4_4_1bgcbgclc8aztc3.R.inc(15044);while ((((i + 1 < length)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15045)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15046)==0&false))) {{
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15047);char peek = pattern.charAt(i + 1);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15048);if ((((peek == c)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15049)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15050)==0&false))) {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15051);buf.append(c);
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15052);i++;
                } }else {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15053);break;
                }
            }}
        }} }else {{
            // This will identify token as text.
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15054);buf.append('\'');

            __CLR4_4_1bgcbgclc8aztc3.R.inc(15055);boolean inLiteral = false;

            __CLR4_4_1bgcbgclc8aztc3.R.inc(15056);for (; (((i < length)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15057)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15058)==0&false)); i++) {{
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15059);c = pattern.charAt(i);
                
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15060);if ((((c == '\'')&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15061)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15062)==0&false))) {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15063);if ((((i + 1 < length && pattern.charAt(i + 1) == '\'')&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15064)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15065)==0&false))) {{
                        // '' is treated as escaped '
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(15066);i++;
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(15067);buf.append(c);
                    } }else {{
                        __CLR4_4_1bgcbgclc8aztc3.R.inc(15068);inLiteral = !inLiteral;
                    }
                }} }else {__CLR4_4_1bgcbgclc8aztc3.R.inc(15069);if ((((!inLiteral &&
                           (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'))&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15070)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15071)==0&false))) {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15072);i--;
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15073);break;
                } }else {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15074);buf.append(c);
                }
            }}}
        }}

        }__CLR4_4_1bgcbgclc8aztc3.R.inc(15075);indexRef[0] = i;
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15076);return buf.toString();
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Returns true if token should be parsed as a numeric field.
     * 
     * @param token  the token to parse
     * @return true if numeric field
     */
    private static boolean isNumericToken(String token) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15077);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15078);int tokenLen = token.length();
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15079);if ((((tokenLen > 0)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15080)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15081)==0&false))) {{
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15082);char c = token.charAt(0);
            boolean __CLB4_4_1_bool3=false;__CLR4_4_1bgcbgclc8aztc3.R.inc(15083);switch (c) {
            case 'c':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15084);__CLB4_4_1_bool3=true;} // century (number)
            case 'C':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15085);__CLB4_4_1_bool3=true;} // century of era (number)
            case 'x':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15086);__CLB4_4_1_bool3=true;} // weekyear (number)
            case 'y':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15087);__CLB4_4_1_bool3=true;} // year (number)
            case 'Y':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15088);__CLB4_4_1_bool3=true;} // year of era (number)
            case 'd':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15089);__CLB4_4_1_bool3=true;} // day of month (number)
            case 'h':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15090);__CLB4_4_1_bool3=true;} // hour of day (number, 1..12)
            case 'H':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15091);__CLB4_4_1_bool3=true;} // hour of day (number, 0..23)
            case 'm':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15092);__CLB4_4_1_bool3=true;} // minute of hour (number)
            case 's':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15093);__CLB4_4_1_bool3=true;} // second of minute (number)
            case 'S':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15094);__CLB4_4_1_bool3=true;} // fraction of second (number)
            case 'e':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15095);__CLB4_4_1_bool3=true;} // day of week (number)
            case 'D':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15096);__CLB4_4_1_bool3=true;} // day of year (number)
            case 'F':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15097);__CLB4_4_1_bool3=true;} // day of week in month (number)
            case 'w':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15098);__CLB4_4_1_bool3=true;} // week of year (number)
            case 'W':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15099);__CLB4_4_1_bool3=true;} // week of month (number)
            case 'k':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15100);__CLB4_4_1_bool3=true;} // hour of day (1..24)
            case 'K':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15101);__CLB4_4_1_bool3=true;} // hour of day (0..11)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15102);return true;
            case 'M':if (!__CLB4_4_1_bool3) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15103);__CLB4_4_1_bool3=true;} // month of year (text and number)
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15104);if ((((tokenLen <= 2)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15105)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15106)==0&false))) {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15107);return true;
                }
            }}
        }
            
        }__CLR4_4_1bgcbgclc8aztc3.R.inc(15108);return false;
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Select a format from a custom pattern.
     *
     * @param pattern  pattern specification
     * @throws IllegalArgumentException if the pattern is invalid
     * @see #appendPatternTo
     */
    private static DateTimeFormatter createFormatterForPattern(String pattern) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15109);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15110);if ((((pattern == null || pattern.length() == 0)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15111)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15112)==0&false))) {{
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15113);throw new IllegalArgumentException("Invalid pattern specification");
        }
        }__CLR4_4_1bgcbgclc8aztc3.R.inc(15114);DateTimeFormatter formatter = null;
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15115);synchronized (PATTERN_CACHE) {
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15116);formatter = PATTERN_CACHE.get(pattern);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15117);if ((((formatter == null)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15118)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15119)==0&false))) {{
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15120);DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15121);parsePatternTo(builder, pattern);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15122);formatter = builder.toFormatter();

                __CLR4_4_1bgcbgclc8aztc3.R.inc(15123);PATTERN_CACHE.put(pattern, formatter);
            }
        }}
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15124);return formatter;
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Select a format from a two character style pattern. The first character
     * is the date style, and the second character is the time style. Specify a
     * character of 'S' for short style, 'M' for medium, 'L' for long, and 'F'
     * for full. A date or time may be ommitted by specifying a style character '-'.
     *
     * @param style  two characters from the set {"S", "M", "L", "F", "-"}
     * @throws IllegalArgumentException if the style is invalid
     */
    private static DateTimeFormatter createFormatterForStyle(String style) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15125);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15126);if ((((style == null || style.length() != 2)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15127)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15128)==0&false))) {{
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15129);throw new IllegalArgumentException("Invalid style specification: " + style);
        }
        }__CLR4_4_1bgcbgclc8aztc3.R.inc(15130);int dateStyle = selectStyle(style.charAt(0));
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15131);int timeStyle = selectStyle(style.charAt(1));
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15132);if ((((dateStyle == NONE && timeStyle == NONE)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15133)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15134)==0&false))) {{
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15135);throw new IllegalArgumentException("Style '--' is invalid");
        }
        }__CLR4_4_1bgcbgclc8aztc3.R.inc(15136);return createFormatterForStyleIndex(dateStyle, timeStyle);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Gets the formatter for the specified style.
     * 
     * @param dateStyle  the date style
     * @param timeStyle  the time style
     * @return the formatter
     */
    private static DateTimeFormatter createFormatterForStyleIndex(int dateStyle, int timeStyle) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15137);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15138);int index = ((dateStyle << 2) + dateStyle) + timeStyle;
        // Should never happen but do a double check...
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15139);if ((((index >= STYLE_CACHE.length)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15140)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15141)==0&false))) {{
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15142);return createDateTimeFormatter(dateStyle, timeStyle);
        }
        }__CLR4_4_1bgcbgclc8aztc3.R.inc(15143);DateTimeFormatter f = null;
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15144);synchronized (STYLE_CACHE) {
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15145);f = STYLE_CACHE[index];
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15146);if ((((f == null)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15147)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15148)==0&false))) {{
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15149);f = createDateTimeFormatter(dateStyle, timeStyle);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15150);STYLE_CACHE[index] = f;
            }
        }}
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15151);return f;
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}
    
    /**
     * Creates a formatter for the specified style.
     * @param dateStyle  the date style
     * @param timeStyle  the time style
     * @return the formatter
     */
    private static DateTimeFormatter createDateTimeFormatter(int dateStyle, int timeStyle){try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15152);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15153);int type = DATETIME;
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15154);if ((((dateStyle == NONE)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15155)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15156)==0&false))) {{
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15157);type = TIME;
        } }else {__CLR4_4_1bgcbgclc8aztc3.R.inc(15158);if ((((timeStyle == NONE)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15159)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15160)==0&false))) {{
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15161);type = DATE;
        }
        }}__CLR4_4_1bgcbgclc8aztc3.R.inc(15162);StyleFormatter llf = new StyleFormatter(dateStyle, timeStyle, type);
        __CLR4_4_1bgcbgclc8aztc3.R.inc(15163);return new DateTimeFormatter(llf, llf);
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    /**
     * Gets the JDK style code from the Joda code.
     * 
     * @param ch  the Joda style code
     * @return the JDK style code
     */
    private static int selectStyle(char ch) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15164);
        boolean __CLB4_4_1_bool4=false;__CLR4_4_1bgcbgclc8aztc3.R.inc(15165);switch (ch) {
        case 'S':if (!__CLB4_4_1_bool4) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15166);__CLB4_4_1_bool4=true;}
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15167);return SHORT;
        case 'M':if (!__CLB4_4_1_bool4) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15168);__CLB4_4_1_bool4=true;}
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15169);return MEDIUM;
        case 'L':if (!__CLB4_4_1_bool4) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15170);__CLB4_4_1_bool4=true;}
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15171);return LONG;
        case 'F':if (!__CLB4_4_1_bool4) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15172);__CLB4_4_1_bool4=true;}
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15173);return FULL;
        case '-':if (!__CLB4_4_1_bool4) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15174);__CLB4_4_1_bool4=true;}
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15175);return NONE;
        default:if (!__CLB4_4_1_bool4) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15176);__CLB4_4_1_bool4=true;}
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15177);throw new IllegalArgumentException("Invalid style character: " + ch);
        }
    }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static class StyleFormatter
            implements DateTimePrinter, DateTimeParser {

        private static final Map<String, DateTimeFormatter> cCache = new HashMap<String, DateTimeFormatter>();  // manual sync
        
        private final int iDateStyle;
        private final int iTimeStyle;
        private final int iType;

        StyleFormatter(int dateStyle, int timeStyle, int type) {
            super();__CLR4_4_1bgcbgclc8aztc3.R.inc(15179);try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15178);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15180);iDateStyle = dateStyle;
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15181);iTimeStyle = timeStyle;
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15182);iType = type;
        }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

        public int estimatePrintedLength() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15183);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15184);return 40;  // guess
        }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

        public void printTo(
                StringBuffer buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15185);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15186);DateTimePrinter p = getFormatter(locale).getPrinter();
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15187);p.printTo(buf, instant, chrono, displayOffset, displayZone, locale);
        }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

        public void printTo(
                Writer out, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15188);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15189);DateTimePrinter p = getFormatter(locale).getPrinter();
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15190);p.printTo(out, instant, chrono, displayOffset, displayZone, locale);
        }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15191);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15192);DateTimePrinter p = getFormatter(locale).getPrinter();
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15193);p.printTo(buf, partial, locale);
        }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15194);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15195);DateTimePrinter p = getFormatter(locale).getPrinter();
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15196);p.printTo(out, partial, locale);
        }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

        public int estimateParsedLength() {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15197);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15198);return 40;  // guess
        }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

        public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15199);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15200);DateTimeParser p = getFormatter(bucket.getLocale()).getParser();
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15201);return p.parseInto(bucket, text, position);
        }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

        private DateTimeFormatter getFormatter(Locale locale) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15202);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15203);locale = ((((locale == null )&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15204)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15205)==0&false))? Locale.getDefault() : locale);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15206);String key = Integer.toString(iType + (iDateStyle << 4) + (iTimeStyle << 8)) + locale.toString();
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15207);DateTimeFormatter f = null;
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15208);synchronized (cCache) {
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15209);f = cCache.get(key);
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15210);if ((((f == null)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15211)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15212)==0&false))) {{
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15213);String pattern = getPattern(locale);
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15214);f = DateTimeFormat.forPattern(pattern);
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15215);cCache.put(key, f);
                }
            }}
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15216);return f;
        }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}

        String getPattern(Locale locale) {try{__CLR4_4_1bgcbgclc8aztc3.R.inc(15217);
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15218);DateFormat f = null;
            boolean __CLB4_4_1_bool5=false;__CLR4_4_1bgcbgclc8aztc3.R.inc(15219);switch (iType) {
                case DATE:if (!__CLB4_4_1_bool5) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15220);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15221);f = DateFormat.getDateInstance(iDateStyle, locale);
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15222);break;
                case TIME:if (!__CLB4_4_1_bool5) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15223);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15224);f = DateFormat.getTimeInstance(iTimeStyle, locale);
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15225);break;
                case DATETIME:if (!__CLB4_4_1_bool5) {__CLR4_4_1bgcbgclc8aztc3.R.inc(15226);__CLB4_4_1_bool5=true;}
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15227);f = DateFormat.getDateTimeInstance(iDateStyle, iTimeStyle, locale);
                    __CLR4_4_1bgcbgclc8aztc3.R.inc(15228);break;
            }
            __CLR4_4_1bgcbgclc8aztc3.R.inc(15229);if ((((f instanceof SimpleDateFormat == false)&&(__CLR4_4_1bgcbgclc8aztc3.R.iget(15230)!=0|true))||(__CLR4_4_1bgcbgclc8aztc3.R.iget(15231)==0&false))) {{
                __CLR4_4_1bgcbgclc8aztc3.R.inc(15232);throw new IllegalArgumentException("No datetime pattern for locale: " + locale);
            }
            }__CLR4_4_1bgcbgclc8aztc3.R.inc(15233);return ((SimpleDateFormat) f).toPattern();
        }finally{__CLR4_4_1bgcbgclc8aztc3.R.flushNeeded();}}
    }

}
