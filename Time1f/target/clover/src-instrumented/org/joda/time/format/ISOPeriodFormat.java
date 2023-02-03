/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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

/**
 * Factory that creates instances of PeriodFormatter for the ISO8601 standard.
 * <p>
 * Period formatting is performed by the {@link PeriodFormatter} class.
 * Three classes provide factory methods to create formatters, and this is one.
 * The others are {@link PeriodFormat} and {@link PeriodFormatterBuilder}.
 * <p>
 * ISOPeriodFormat is thread-safe and immutable, and the formatters it
 * returns are as well.
 *
 * @author Brian S O'Neill
 * @since 1.0
 * @see PeriodFormat
 * @see PeriodFormatterBuilder
 */
public class ISOPeriodFormat {public static class __CLR4_4_1e5we5wlc8aztlr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,18388,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Cache of standard format. */
    private static PeriodFormatter cStandard;
    /** Cache of alternate months format. */
    private static PeriodFormatter cAlternate;
    /** Cache of alternate extended months format. */
    private static PeriodFormatter cAlternateExtended;
    /** Cache of alternate weeks format. */
    private static PeriodFormatter cAlternateWithWeeks;
    /** Cache of alternate extended weeks format. */
    private static PeriodFormatter cAlternateExtendedWihWeeks;

    /**
     * Constructor.
     *
     * @since 1.1 (previously private)
     */
    protected ISOPeriodFormat() {
        super();__CLR4_4_1e5we5wlc8aztlr.R.inc(18357);try{__CLR4_4_1e5we5wlc8aztlr.R.inc(18356);
    }finally{__CLR4_4_1e5we5wlc8aztlr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * The standard ISO format - PyYmMwWdDThHmMsS.
     * Milliseconds are not output.
     * Note that the ISO8601 standard actually indicates weeks should not
     * be shown if any other field is present and vice versa.
     * 
     * @return the formatter
     */
    public static PeriodFormatter standard() {try{__CLR4_4_1e5we5wlc8aztlr.R.inc(18358);
        __CLR4_4_1e5we5wlc8aztlr.R.inc(18359);if ((((cStandard == null)&&(__CLR4_4_1e5we5wlc8aztlr.R.iget(18360)!=0|true))||(__CLR4_4_1e5we5wlc8aztlr.R.iget(18361)==0&false))) {{
            __CLR4_4_1e5we5wlc8aztlr.R.inc(18362);cStandard = new PeriodFormatterBuilder()
                .appendLiteral("P")
                .appendYears()
                .appendSuffix("Y")
                .appendMonths()
                .appendSuffix("M")
                .appendWeeks()
                .appendSuffix("W")
                .appendDays()
                .appendSuffix("D")
                .appendSeparatorIfFieldsAfter("T")
                .appendHours()
                .appendSuffix("H")
                .appendMinutes()
                .appendSuffix("M")
                .appendSecondsWithOptionalMillis()
                .appendSuffix("S")
                .toFormatter();
        }
        }__CLR4_4_1e5we5wlc8aztlr.R.inc(18363);return cStandard;
    }finally{__CLR4_4_1e5we5wlc8aztlr.R.flushNeeded();}}

    /**
     * The alternate ISO format, PyyyymmddThhmmss, which excludes weeks.
     * <p>
     * Even if weeks are present in the period, they are not output.
     * Fractional seconds (milliseconds) will appear if required.
     * 
     * @return the formatter
     */
    public static PeriodFormatter alternate() {try{__CLR4_4_1e5we5wlc8aztlr.R.inc(18364);
        __CLR4_4_1e5we5wlc8aztlr.R.inc(18365);if ((((cAlternate == null)&&(__CLR4_4_1e5we5wlc8aztlr.R.iget(18366)!=0|true))||(__CLR4_4_1e5we5wlc8aztlr.R.iget(18367)==0&false))) {{
            __CLR4_4_1e5we5wlc8aztlr.R.inc(18368);cAlternate = new PeriodFormatterBuilder()
                .appendLiteral("P")
                .printZeroAlways()
                .minimumPrintedDigits(4)
                .appendYears()
                .minimumPrintedDigits(2)
                .appendMonths()
                .appendDays()
                .appendSeparatorIfFieldsAfter("T")
                .appendHours()
                .appendMinutes()
                .appendSecondsWithOptionalMillis()
                .toFormatter();
        }
        }__CLR4_4_1e5we5wlc8aztlr.R.inc(18369);return cAlternate;
    }finally{__CLR4_4_1e5we5wlc8aztlr.R.flushNeeded();}}

    /**
     * The alternate ISO format, Pyyyy-mm-ddThh:mm:ss, which excludes weeks.
     * <p>
     * Even if weeks are present in the period, they are not output.
     * Fractional seconds (milliseconds) will appear if required.
     * 
     * @return the formatter
     */
    public static PeriodFormatter alternateExtended() {try{__CLR4_4_1e5we5wlc8aztlr.R.inc(18370);
        __CLR4_4_1e5we5wlc8aztlr.R.inc(18371);if ((((cAlternateExtended == null)&&(__CLR4_4_1e5we5wlc8aztlr.R.iget(18372)!=0|true))||(__CLR4_4_1e5we5wlc8aztlr.R.iget(18373)==0&false))) {{
            __CLR4_4_1e5we5wlc8aztlr.R.inc(18374);cAlternateExtended = new PeriodFormatterBuilder()
                .appendLiteral("P")
                .printZeroAlways()
                .minimumPrintedDigits(4)
                .appendYears()
                .appendSeparator("-")
                .minimumPrintedDigits(2)
                .appendMonths()
                .appendSeparator("-")
                .appendDays()
                .appendSeparatorIfFieldsAfter("T")
                .appendHours()
                .appendSeparator(":")
                .appendMinutes()
                .appendSeparator(":")
                .appendSecondsWithOptionalMillis()
                .toFormatter();
        }
        }__CLR4_4_1e5we5wlc8aztlr.R.inc(18375);return cAlternateExtended;
    }finally{__CLR4_4_1e5we5wlc8aztlr.R.flushNeeded();}}

    /**
     * The alternate ISO format, PyyyyWwwddThhmmss, which excludes months.
     * <p>
     * Even if months are present in the period, they are not output.
     * Fractional seconds (milliseconds) will appear if required.
     * 
     * @return the formatter
     */
    public static PeriodFormatter alternateWithWeeks() {try{__CLR4_4_1e5we5wlc8aztlr.R.inc(18376);
        __CLR4_4_1e5we5wlc8aztlr.R.inc(18377);if ((((cAlternateWithWeeks == null)&&(__CLR4_4_1e5we5wlc8aztlr.R.iget(18378)!=0|true))||(__CLR4_4_1e5we5wlc8aztlr.R.iget(18379)==0&false))) {{
            __CLR4_4_1e5we5wlc8aztlr.R.inc(18380);cAlternateWithWeeks = new PeriodFormatterBuilder()
                .appendLiteral("P")
                .printZeroAlways()
                .minimumPrintedDigits(4)
                .appendYears()
                .minimumPrintedDigits(2)
                .appendPrefix("W")
                .appendWeeks()
                .appendDays()
                .appendSeparatorIfFieldsAfter("T")
                .appendHours()
                .appendMinutes()
                .appendSecondsWithOptionalMillis()
                .toFormatter();
        }
        }__CLR4_4_1e5we5wlc8aztlr.R.inc(18381);return cAlternateWithWeeks;
    }finally{__CLR4_4_1e5we5wlc8aztlr.R.flushNeeded();}}

    /**
     * The alternate ISO format, Pyyyy-Www-ddThh:mm:ss, which excludes months.
     * <p>
     * Even if months are present in the period, they are not output.
     * Fractional seconds (milliseconds) will appear if required.
     * 
     * @return the formatter
     */
    public static PeriodFormatter alternateExtendedWithWeeks() {try{__CLR4_4_1e5we5wlc8aztlr.R.inc(18382);
        __CLR4_4_1e5we5wlc8aztlr.R.inc(18383);if ((((cAlternateExtendedWihWeeks == null)&&(__CLR4_4_1e5we5wlc8aztlr.R.iget(18384)!=0|true))||(__CLR4_4_1e5we5wlc8aztlr.R.iget(18385)==0&false))) {{
            __CLR4_4_1e5we5wlc8aztlr.R.inc(18386);cAlternateExtendedWihWeeks = new PeriodFormatterBuilder()
                .appendLiteral("P")
                .printZeroAlways()
                .minimumPrintedDigits(4)
                .appendYears()
                .appendSeparator("-")
                .minimumPrintedDigits(2)
                .appendPrefix("W")
                .appendWeeks()
                .appendSeparator("-")
                .appendDays()
                .appendSeparatorIfFieldsAfter("T")
                .appendHours()
                .appendSeparator(":")
                .appendMinutes()
                .appendSeparator(":")
                .appendSecondsWithOptionalMillis()
                .toFormatter();
        }
        }__CLR4_4_1e5we5wlc8aztlr.R.inc(18387);return cAlternateExtendedWihWeeks;
    }finally{__CLR4_4_1e5we5wlc8aztlr.R.flushNeeded();}}

}
