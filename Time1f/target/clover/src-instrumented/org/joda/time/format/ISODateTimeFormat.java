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

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTimeFieldType;

/**
 * Factory that creates instances of DateTimeFormatter based on the ISO8601 standard.
 * <p>
 * Date-time formatting is performed by the {@link DateTimeFormatter} class.
 * Three classes provide factory methods to create formatters, and this is one.
 * The others are {@link DateTimeFormat} and {@link DateTimeFormatterBuilder}.
 * <p>
 * ISO8601 is the international standard for data interchange. It defines a
 * framework, rather than an absolute standard. As a result this provider has a
 * number of methods that represent common uses of the framework. The most common
 * formats are {@link #date() date}, {@link #time() time}, and {@link #dateTime() dateTime}.
 * <p>
 * For example, to format a date time in ISO format:
 * <pre>
 * DateTime dt = new DateTime();
 * DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
 * String str = fmt.print(dt);
 * </pre>
 * <p>
 * Note that these formatters mostly follow the ISO8601 standard for printing.
 * For parsing, the formatters are more lenient and allow formats that are not
 * in strict compliance with the standard.
 * <p>
 * It is important to understand that these formatters are not linked to
 * the <code>ISOChronology</code>. These formatters may be used with any
 * chronology, however there may be certain side effects with more unusual
 * chronologies. For example, the ISO formatters rely on dayOfWeek being
 * single digit, dayOfMonth being two digit and dayOfYear being three digit.
 * A chronology with a ten day week would thus cause issues. However, in
 * general, it is safe to use these formatters with other chronologies.
 * <p>
 * ISODateTimeFormat is thread-safe and immutable, and the formatters it
 * returns are as well.
 *
 * @author Brian S O'Neill
 * @since 1.0
 * @see DateTimeFormat
 * @see DateTimeFormatterBuilder
 */
public class ISODateTimeFormat {public static class __CLR4_4_1dmcdmclc8aztld{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,18356,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructor.
     *
     * @since 1.1 (previously private)
     */
    protected ISODateTimeFormat() {
        super();__CLR4_4_1dmcdmclc8aztld.R.inc(17653);try{__CLR4_4_1dmcdmclc8aztld.R.inc(17652);
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a formatter that outputs only those fields specified.
     * <p>
     * This method examines the fields provided and returns an ISO-style
     * formatter that best fits. This can be useful for outputting
     * less-common ISO styles, such as YearMonth (YYYY-MM) or MonthDay (--MM-DD).
     * <p>
     * The list provided may have overlapping fields, such as dayOfWeek and
     * dayOfMonth. In this case, the style is chosen based on the following
     * list, thus in the example, the calendar style is chosen as dayOfMonth
     * is higher in priority than dayOfWeek:
     * <ul>
     * <li>monthOfYear - calendar date style
     * <li>dayOfYear - ordinal date style
     * <li>weekOfWeekYear - week date style
     * <li>dayOfMonth - calendar date style
     * <li>dayOfWeek - week date style
     * <li>year
     * <li>weekyear
     * </ul>
     * The supported formats are:
     * <pre>
     * Extended      Basic       Fields
     * 2005-03-25    20050325    year/monthOfYear/dayOfMonth
     * 2005-03       2005-03     year/monthOfYear
     * 2005--25      2005--25    year/dayOfMonth *
     * 2005          2005        year
     * --03-25       --0325      monthOfYear/dayOfMonth
     * --03          --03        monthOfYear
     * ---03         ---03       dayOfMonth
     * 2005-084      2005084     year/dayOfYear
     * -084          -084        dayOfYear
     * 2005-W12-5    2005W125    weekyear/weekOfWeekyear/dayOfWeek
     * 2005-W-5      2005W-5     weekyear/dayOfWeek *
     * 2005-W12      2005W12     weekyear/weekOfWeekyear
     * -W12-5        -W125       weekOfWeekyear/dayOfWeek
     * -W12          -W12        weekOfWeekyear
     * -W-5          -W-5        dayOfWeek
     * 10:20:30.040  102030.040  hour/minute/second/milli
     * 10:20:30      102030      hour/minute/second
     * 10:20         1020        hour/minute
     * 10            10          hour
     * -20:30.040    -2030.040   minute/second/milli
     * -20:30        -2030       minute/second
     * -20           -20         minute
     * --30.040      --30.040    second/milli
     * --30          --30        second
     * ---.040       ---.040     milli *
     * 10-30.040     10-30.040   hour/second/milli *
     * 10:20-.040    1020-.040   hour/minute/milli *
     * 10-30         10-30       hour/second *
     * 10--.040      10--.040    hour/milli *
     * -20-.040      -20-.040    minute/milli *
     *   plus datetime formats like {date}T{time}
     * </pre>
     * * indiates that this is not an official ISO format and can be excluded
     * by passing in <code>strictISO</code> as <code>true</code>.
     * <p>
     * This method can side effect the input collection of fields.
     * If the input collection is modifiable, then each field that was added to
     * the formatter will be removed from the collection, including any duplicates.
     * If the input collection is unmodifiable then no side effect occurs.
     * <p>
     * This side effect processing is useful if you need to know whether all
     * the fields were converted into the formatter or not. To achieve this,
     * pass in a modifiable list, and check that it is empty on exit.
     *
     * @param fields  the fields to get a formatter for, not null,
     *  updated by the method call unless unmodifiable,
     *  removing those fields built in the formatter
     * @param extended  true to use the extended format (with separators)
     * @param strictISO  true to stick exactly to ISO8601, false to include additional formats
     * @return a suitable formatter
     * @throws IllegalArgumentException if there is no format for the fields
     * @since 1.1
     */
    public static DateTimeFormatter forFields(
        Collection<DateTimeFieldType> fields,
        boolean extended,
        boolean strictISO) {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17654);
        
        __CLR4_4_1dmcdmclc8aztld.R.inc(17655);if ((((fields == null || fields.size() == 0)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17656)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17657)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17658);throw new IllegalArgumentException("The fields must not be null or empty");
        }
        }__CLR4_4_1dmcdmclc8aztld.R.inc(17659);Set<DateTimeFieldType> workingFields = new HashSet<DateTimeFieldType>(fields);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17660);int inputSize = workingFields.size();
        __CLR4_4_1dmcdmclc8aztld.R.inc(17661);boolean reducedPrec = false;
        __CLR4_4_1dmcdmclc8aztld.R.inc(17662);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        // date
        __CLR4_4_1dmcdmclc8aztld.R.inc(17663);if ((((workingFields.contains(DateTimeFieldType.monthOfYear()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17664)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17665)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17666);reducedPrec = dateByMonth(bld, workingFields, extended, strictISO);
        } }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17667);if ((((workingFields.contains(DateTimeFieldType.dayOfYear()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17668)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17669)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17670);reducedPrec = dateByOrdinal(bld, workingFields, extended, strictISO);
        } }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17671);if ((((workingFields.contains(DateTimeFieldType.weekOfWeekyear()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17672)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17673)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17674);reducedPrec = dateByWeek(bld, workingFields, extended, strictISO);
        } }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17675);if ((((workingFields.contains(DateTimeFieldType.dayOfMonth()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17676)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17677)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17678);reducedPrec = dateByMonth(bld, workingFields, extended, strictISO);
        } }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17679);if ((((workingFields.contains(DateTimeFieldType.dayOfWeek()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17680)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17681)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17682);reducedPrec = dateByWeek(bld, workingFields, extended, strictISO);
        } }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17683);if ((((workingFields.remove(DateTimeFieldType.year()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17684)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17685)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17686);bld.append(Constants.ye);
            __CLR4_4_1dmcdmclc8aztld.R.inc(17687);reducedPrec = true;
        } }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17688);if ((((workingFields.remove(DateTimeFieldType.weekyear()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17689)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17690)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17691);bld.append(Constants.we);
            __CLR4_4_1dmcdmclc8aztld.R.inc(17692);reducedPrec = true;
        }
        }}}}}}}__CLR4_4_1dmcdmclc8aztld.R.inc(17693);boolean datePresent = (workingFields.size() < inputSize);
        
        // time
        __CLR4_4_1dmcdmclc8aztld.R.inc(17694);time(bld, workingFields, extended, strictISO, reducedPrec, datePresent);
        
        // result
        __CLR4_4_1dmcdmclc8aztld.R.inc(17695);if ((((bld.canBuildFormatter() == false)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17696)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17697)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17698);throw new IllegalArgumentException("No valid format for fields: " + fields);
        }
        
        // side effect the input collection to indicate the processed fields
        // handling unmodifiable collections with no side effect
        }__CLR4_4_1dmcdmclc8aztld.R.inc(17699);try {
            __CLR4_4_1dmcdmclc8aztld.R.inc(17700);fields.retainAll(workingFields);
        } catch (UnsupportedOperationException ex) {
            // ignore, so we can handle unmodifiable collections
        }
        __CLR4_4_1dmcdmclc8aztld.R.inc(17701);return bld.toFormatter();
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a date using the calendar date format.
     * Specification reference: 5.2.1.
     *
     * @param bld  the builder
     * @param fields  the fields
     * @param extended  true to use extended format
     * @param strictISO  true to only allow ISO formats
     * @return true if reduced precision
     * @since 1.1
     */
    private static boolean dateByMonth(
        DateTimeFormatterBuilder bld,
        Collection<DateTimeFieldType> fields,
        boolean extended,
        boolean strictISO) {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17702);
        
        __CLR4_4_1dmcdmclc8aztld.R.inc(17703);boolean reducedPrec = false;
        __CLR4_4_1dmcdmclc8aztld.R.inc(17704);if ((((fields.remove(DateTimeFieldType.year()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17705)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17706)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17707);bld.append(Constants.ye);
            __CLR4_4_1dmcdmclc8aztld.R.inc(17708);if ((((fields.remove(DateTimeFieldType.monthOfYear()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17709)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17710)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(17711);if ((((fields.remove(DateTimeFieldType.dayOfMonth()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17712)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17713)==0&false))) {{
                    // YYYY-MM-DD/YYYYMMDD
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17714);appendSeparator(bld, extended);
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17715);bld.appendMonthOfYear(2);
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17716);appendSeparator(bld, extended);
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17717);bld.appendDayOfMonth(2);
                } }else {{
                    // YYYY-MM/YYYY-MM
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17718);bld.appendLiteral('-');
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17719);bld.appendMonthOfYear(2);
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17720);reducedPrec = true;
                }
            }} }else {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(17721);if ((((fields.remove(DateTimeFieldType.dayOfMonth()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17722)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17723)==0&false))) {{
                    // YYYY--DD/YYYY--DD (non-iso)
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17724);checkNotStrictISO(fields, strictISO);
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17725);bld.appendLiteral('-');
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17726);bld.appendLiteral('-');
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17727);bld.appendDayOfMonth(2);
                } }else {{
                    // YYYY/YYYY
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17728);reducedPrec = true;
                }
            }}
            
        }} }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17729);if ((((fields.remove(DateTimeFieldType.monthOfYear()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17730)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17731)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17732);bld.appendLiteral('-');
            __CLR4_4_1dmcdmclc8aztld.R.inc(17733);bld.appendLiteral('-');
            __CLR4_4_1dmcdmclc8aztld.R.inc(17734);bld.appendMonthOfYear(2);
            __CLR4_4_1dmcdmclc8aztld.R.inc(17735);if ((((fields.remove(DateTimeFieldType.dayOfMonth()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17736)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17737)==0&false))) {{
                // --MM-DD/--MMDD
                __CLR4_4_1dmcdmclc8aztld.R.inc(17738);appendSeparator(bld, extended);
                __CLR4_4_1dmcdmclc8aztld.R.inc(17739);bld.appendDayOfMonth(2);
            } }else {{
                // --MM/--MM
                __CLR4_4_1dmcdmclc8aztld.R.inc(17740);reducedPrec = true;
            }
        }} }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17741);if ((((fields.remove(DateTimeFieldType.dayOfMonth()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17742)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17743)==0&false))) {{
            // ---DD/---DD
            __CLR4_4_1dmcdmclc8aztld.R.inc(17744);bld.appendLiteral('-');
            __CLR4_4_1dmcdmclc8aztld.R.inc(17745);bld.appendLiteral('-');
            __CLR4_4_1dmcdmclc8aztld.R.inc(17746);bld.appendLiteral('-');
            __CLR4_4_1dmcdmclc8aztld.R.inc(17747);bld.appendDayOfMonth(2);
        }
        }}}__CLR4_4_1dmcdmclc8aztld.R.inc(17748);return reducedPrec;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a date using the ordinal date format.
     * Specification reference: 5.2.2.
     *
     * @param bld  the builder
     * @param fields  the fields
     * @param extended  true to use extended format
     * @param strictISO  true to only allow ISO formats
     * @since 1.1
     */
    private static boolean dateByOrdinal(
        DateTimeFormatterBuilder bld,
        Collection<DateTimeFieldType> fields,
        boolean extended,
        boolean strictISO) {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17749);
        
        __CLR4_4_1dmcdmclc8aztld.R.inc(17750);boolean reducedPrec = false;
        __CLR4_4_1dmcdmclc8aztld.R.inc(17751);if ((((fields.remove(DateTimeFieldType.year()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17752)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17753)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17754);bld.append(Constants.ye);
            __CLR4_4_1dmcdmclc8aztld.R.inc(17755);if ((((fields.remove(DateTimeFieldType.dayOfYear()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17756)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17757)==0&false))) {{
                // YYYY-DDD/YYYYDDD
                __CLR4_4_1dmcdmclc8aztld.R.inc(17758);appendSeparator(bld, extended);
                __CLR4_4_1dmcdmclc8aztld.R.inc(17759);bld.appendDayOfYear(3);
            } }else {{
                // YYYY/YYYY
                __CLR4_4_1dmcdmclc8aztld.R.inc(17760);reducedPrec = true;
            }
            
        }} }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17761);if ((((fields.remove(DateTimeFieldType.dayOfYear()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17762)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17763)==0&false))) {{
            // -DDD/-DDD
            __CLR4_4_1dmcdmclc8aztld.R.inc(17764);bld.appendLiteral('-');
            __CLR4_4_1dmcdmclc8aztld.R.inc(17765);bld.appendDayOfYear(3);
        }
        }}__CLR4_4_1dmcdmclc8aztld.R.inc(17766);return reducedPrec;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a date using the calendar date format.
     * Specification reference: 5.2.3.
     *
     * @param bld  the builder
     * @param fields  the fields
     * @param extended  true to use extended format
     * @param strictISO  true to only allow ISO formats
     * @since 1.1
     */
    private static boolean dateByWeek(
        DateTimeFormatterBuilder bld,
        Collection<DateTimeFieldType> fields,
        boolean extended,
        boolean strictISO) {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17767);
        
        __CLR4_4_1dmcdmclc8aztld.R.inc(17768);boolean reducedPrec = false;
        __CLR4_4_1dmcdmclc8aztld.R.inc(17769);if ((((fields.remove(DateTimeFieldType.weekyear()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17770)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17771)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17772);bld.append(Constants.we);
            __CLR4_4_1dmcdmclc8aztld.R.inc(17773);if ((((fields.remove(DateTimeFieldType.weekOfWeekyear()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17774)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17775)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(17776);appendSeparator(bld, extended);
                __CLR4_4_1dmcdmclc8aztld.R.inc(17777);bld.appendLiteral('W');
                __CLR4_4_1dmcdmclc8aztld.R.inc(17778);bld.appendWeekOfWeekyear(2);
                __CLR4_4_1dmcdmclc8aztld.R.inc(17779);if ((((fields.remove(DateTimeFieldType.dayOfWeek()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17780)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17781)==0&false))) {{
                    // YYYY-WWW-D/YYYYWWWD
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17782);appendSeparator(bld, extended);
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17783);bld.appendDayOfWeek(1);
                } }else {{
                    // YYYY-WWW/YYYY-WWW
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17784);reducedPrec = true;
                }
            }} }else {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(17785);if ((((fields.remove(DateTimeFieldType.dayOfWeek()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17786)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17787)==0&false))) {{
                    // YYYY-W-D/YYYYW-D (non-iso)
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17788);checkNotStrictISO(fields, strictISO);
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17789);appendSeparator(bld, extended);
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17790);bld.appendLiteral('W');
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17791);bld.appendLiteral('-');
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17792);bld.appendDayOfWeek(1);
                } }else {{
                    // YYYY/YYYY
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17793);reducedPrec = true;
                }
            }}
            
        }} }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17794);if ((((fields.remove(DateTimeFieldType.weekOfWeekyear()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17795)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17796)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17797);bld.appendLiteral('-');
            __CLR4_4_1dmcdmclc8aztld.R.inc(17798);bld.appendLiteral('W');
            __CLR4_4_1dmcdmclc8aztld.R.inc(17799);bld.appendWeekOfWeekyear(2);
            __CLR4_4_1dmcdmclc8aztld.R.inc(17800);if ((((fields.remove(DateTimeFieldType.dayOfWeek()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17801)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17802)==0&false))) {{
                // -WWW-D/-WWWD
                __CLR4_4_1dmcdmclc8aztld.R.inc(17803);appendSeparator(bld, extended);
                __CLR4_4_1dmcdmclc8aztld.R.inc(17804);bld.appendDayOfWeek(1);
            } }else {{
                // -WWW/-WWW
                __CLR4_4_1dmcdmclc8aztld.R.inc(17805);reducedPrec = true;
            }
        }} }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17806);if ((((fields.remove(DateTimeFieldType.dayOfWeek()))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17807)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17808)==0&false))) {{
            // -W-D/-W-D
            __CLR4_4_1dmcdmclc8aztld.R.inc(17809);bld.appendLiteral('-');
            __CLR4_4_1dmcdmclc8aztld.R.inc(17810);bld.appendLiteral('W');
            __CLR4_4_1dmcdmclc8aztld.R.inc(17811);bld.appendLiteral('-');
            __CLR4_4_1dmcdmclc8aztld.R.inc(17812);bld.appendDayOfWeek(1);
        }
        }}}__CLR4_4_1dmcdmclc8aztld.R.inc(17813);return reducedPrec;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds the time fields to the builder.
     * Specification reference: 5.3.1.
     * 
     * @param bld  the builder
     * @param fields  the fields
     * @param extended  whether to use the extended format
     * @param strictISO  whether to be strict
     * @param reducedPrec  whether the date was reduced precision
     * @param datePresent  whether there was a date
     * @since 1.1
     */
    private static void time(
        DateTimeFormatterBuilder bld,
        Collection<DateTimeFieldType> fields,
        boolean extended,
        boolean strictISO,
        boolean reducedPrec,
        boolean datePresent) {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17814);
        
        __CLR4_4_1dmcdmclc8aztld.R.inc(17815);boolean hour = fields.remove(DateTimeFieldType.hourOfDay());
        __CLR4_4_1dmcdmclc8aztld.R.inc(17816);boolean minute = fields.remove(DateTimeFieldType.minuteOfHour());
        __CLR4_4_1dmcdmclc8aztld.R.inc(17817);boolean second = fields.remove(DateTimeFieldType.secondOfMinute());
        __CLR4_4_1dmcdmclc8aztld.R.inc(17818);boolean milli = fields.remove(DateTimeFieldType.millisOfSecond());
        __CLR4_4_1dmcdmclc8aztld.R.inc(17819);if ((((!hour && !minute && !second && !milli)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17820)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17821)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17822);return;
        }
        }__CLR4_4_1dmcdmclc8aztld.R.inc(17823);if ((((hour || minute || second || milli)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17824)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17825)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17826);if ((((strictISO && reducedPrec)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17827)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17828)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(17829);throw new IllegalArgumentException("No valid ISO8601 format for fields because Date was reduced precision: " + fields);
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(17830);if ((((datePresent)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17831)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17832)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(17833);bld.appendLiteral('T');
            }
        }}
        }__CLR4_4_1dmcdmclc8aztld.R.inc(17834);if ((((hour && minute && second || (hour && !second && !milli))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17835)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17836)==0&false))) {{
            // OK - HMSm/HMS/HM/H - valid in combination with date
        } }else {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17837);if ((((strictISO && datePresent)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17838)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17839)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(17840);throw new IllegalArgumentException("No valid ISO8601 format for fields because Time was truncated: " + fields);
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(17841);if ((((!hour && (minute && second || (minute && !milli) || second))&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17842)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17843)==0&false))) {{
                // OK - MSm/MS/M/Sm/S - valid ISO formats
            } }else {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(17844);if ((((strictISO)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17845)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17846)==0&false))) {{
                    __CLR4_4_1dmcdmclc8aztld.R.inc(17847);throw new IllegalArgumentException("No valid ISO8601 format for fields: " + fields);
                }
            }}
        }}
        }__CLR4_4_1dmcdmclc8aztld.R.inc(17848);if ((((hour)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17849)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17850)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17851);bld.appendHourOfDay(2);
        } }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17852);if ((((minute || second || milli)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17853)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17854)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17855);bld.appendLiteral('-');
        }
        }}__CLR4_4_1dmcdmclc8aztld.R.inc(17856);if ((((extended && hour && minute)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17857)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17858)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17859);bld.appendLiteral(':');
        }
        }__CLR4_4_1dmcdmclc8aztld.R.inc(17860);if ((((minute)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17861)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17862)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17863);bld.appendMinuteOfHour(2);
        } }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17864);if ((((second || milli)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17865)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17866)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17867);bld.appendLiteral('-');
        }
        }}__CLR4_4_1dmcdmclc8aztld.R.inc(17868);if ((((extended && minute && second)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17869)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17870)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17871);bld.appendLiteral(':');
        }
        }__CLR4_4_1dmcdmclc8aztld.R.inc(17872);if ((((second)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17873)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17874)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17875);bld.appendSecondOfMinute(2);
        } }else {__CLR4_4_1dmcdmclc8aztld.R.inc(17876);if ((((milli)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17877)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17878)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17879);bld.appendLiteral('-');
        }
        }}__CLR4_4_1dmcdmclc8aztld.R.inc(17880);if ((((milli)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17881)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17882)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17883);bld.appendLiteral('.');
            __CLR4_4_1dmcdmclc8aztld.R.inc(17884);bld.appendMillisOfSecond(3);
        }
    }}finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks that the iso only flag is not set, throwing an exception if it is.
     * 
     * @param fields  the fields
     * @param strictISO  true if only ISO formats allowed
     * @since 1.1
     */
    private static void checkNotStrictISO(Collection<DateTimeFieldType> fields, boolean strictISO) {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17885);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17886);if ((((strictISO)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17887)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17888)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17889);throw new IllegalArgumentException("No valid ISO8601 format for fields: " + fields);
        }
    }}finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Appends the separator if necessary.
     *
     * @param bld  the builder
     * @param extended  whether to append the separator
     * @param sep  the separator
     * @since 1.1
     */
    private static void appendSeparator(DateTimeFormatterBuilder bld, boolean extended) {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17890);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17891);if ((((extended)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17892)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(17893)==0&false))) {{
            __CLR4_4_1dmcdmclc8aztld.R.inc(17894);bld.appendLiteral('-');
        }
    }}finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a generic ISO date parser for parsing dates with a possible zone.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * date              = date-element ['T' offset]
     * date-element      = std-date-element | ord-date-element | week-date-element
     * std-date-element  = yyyy ['-' MM ['-' dd]]
     * ord-date-element  = yyyy ['-' DDD]
     * week-date-element = xxxx '-W' ww ['-' e]
     * offset            = 'Z' | (('+' | '-') HH [':' mm [':' ss [('.' | ',') SSS]]])
     * </pre>
     */
    public static DateTimeFormatter dateParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17895);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17896);return Constants.dp;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a generic ISO date parser for parsing local dates.
     * This parser is initialised with the local (UTC) time zone.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * date-element      = std-date-element | ord-date-element | week-date-element
     * std-date-element  = yyyy ['-' MM ['-' dd]]
     * ord-date-element  = yyyy ['-' DDD]
     * week-date-element = xxxx '-W' ww ['-' e]
     * </pre>
     * @since 1.3
     */
    public static DateTimeFormatter localDateParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17897);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17898);return Constants.ldp;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a generic ISO date parser for parsing dates.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * date-element      = std-date-element | ord-date-element | week-date-element
     * std-date-element  = yyyy ['-' MM ['-' dd]]
     * ord-date-element  = yyyy ['-' DDD]
     * week-date-element = xxxx '-W' ww ['-' e]
     * </pre>
     */
    public static DateTimeFormatter dateElementParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17899);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17900);return Constants.dpe;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a generic ISO time parser for parsing times with a possible zone.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * time           = ['T'] time-element [offset]
     * time-element   = HH [minute-element] | [fraction]
     * minute-element = ':' mm [second-element] | [fraction]
     * second-element = ':' ss [fraction]
     * fraction       = ('.' | ',') digit+
     * offset         = 'Z' | (('+' | '-') HH [':' mm [':' ss [('.' | ',') SSS]]])
     * </pre>
     */
    public static DateTimeFormatter timeParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17901);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17902);return Constants.tp;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a generic ISO time parser for parsing local times.
     * This parser is initialised with the local (UTC) time zone.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * time           = ['T'] time-element
     * time-element   = HH [minute-element] | [fraction]
     * minute-element = ':' mm [second-element] | [fraction]
     * second-element = ':' ss [fraction]
     * fraction       = ('.' | ',') digit+
     * </pre>
     * @since 1.3
     */
    public static DateTimeFormatter localTimeParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17903);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17904);return Constants.ltp;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a generic ISO time parser.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * time-element   = HH [minute-element] | [fraction]
     * minute-element = ':' mm [second-element] | [fraction]
     * second-element = ':' ss [fraction]
     * fraction       = ('.' | ',') digit+
     * </pre>
     */
    public static DateTimeFormatter timeElementParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17905);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17906);return Constants.tpe;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a generic ISO datetime parser which parses either a date or
     * a time or both. The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * datetime          = time | date-opt-time
     * time              = 'T' time-element [offset]
     * date-opt-time     = date-element ['T' [time-element] [offset]]
     * date-element      = std-date-element | ord-date-element | week-date-element
     * std-date-element  = yyyy ['-' MM ['-' dd]]
     * ord-date-element  = yyyy ['-' DDD]
     * week-date-element = xxxx '-W' ww ['-' e]
     * time-element      = HH [minute-element] | [fraction]
     * minute-element    = ':' mm [second-element] | [fraction]
     * second-element    = ':' ss [fraction]
     * fraction          = ('.' | ',') digit+
     * offset            = 'Z' | (('+' | '-') HH [':' mm [':' ss [('.' | ',') SSS]]])
     * </pre>
     */
    public static DateTimeFormatter dateTimeParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17907);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17908);return Constants.dtp;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a generic ISO datetime parser where the date is mandatory and
     * the time is optional. This parser can parse zoned datetimes.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * date-opt-time     = date-element ['T' [time-element] [offset]]
     * date-element      = std-date-element | ord-date-element | week-date-element
     * std-date-element  = yyyy ['-' MM ['-' dd]]
     * ord-date-element  = yyyy ['-' DDD]
     * week-date-element = xxxx '-W' ww ['-' e]
     * time-element      = HH [minute-element] | [fraction]
     * minute-element    = ':' mm [second-element] | [fraction]
     * second-element    = ':' ss [fraction]
     * fraction          = ('.' | ',') digit+
     * </pre>
     * @since 1.3
     */
    public static DateTimeFormatter dateOptionalTimeParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17909);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17910);return Constants.dotp;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a generic ISO datetime parser where the date is mandatory and
     * the time is optional. This parser only parses local datetimes.
     * This parser is initialised with the local (UTC) time zone.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * <p>
     * It accepts formats described by the following syntax:
     * <pre>
     * datetime          = date-element ['T' time-element]
     * date-element      = std-date-element | ord-date-element | week-date-element
     * std-date-element  = yyyy ['-' MM ['-' dd]]
     * ord-date-element  = yyyy ['-' DDD]
     * week-date-element = xxxx '-W' ww ['-' e]
     * time-element      = HH [minute-element] | [fraction]
     * minute-element    = ':' mm [second-element] | [fraction]
     * second-element    = ':' ss [fraction]
     * fraction          = ('.' | ',') digit+
     * </pre>
     * @since 1.3
     */
    public static DateTimeFormatter localDateOptionalTimeParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17911);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17912);return Constants.ldotp;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a formatter for a full date as four digit year, two digit month
     * of year, and two digit day of month (yyyy-MM-dd).
     * 
     * @return a formatter for yyyy-MM-dd
     */
    public static DateTimeFormatter date() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17913);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17914);return yearMonthDay();
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, two digit second of minute, three digit fraction of second, and
     * time zone offset (HH:mm:ss.SSSZZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for HH:mm:ss.SSSZZ
     */
    public static DateTimeFormatter time() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17915);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17916);return Constants.t;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, two digit second of minute, and time zone offset (HH:mm:ssZZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for HH:mm:ssZZ
     */
    public static DateTimeFormatter timeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17917);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17918);return Constants.tx;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, two digit second of minute, three digit fraction of second, and
     * time zone offset prefixed by 'T' ('T'HH:mm:ss.SSSZZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for 'T'HH:mm:ss.SSSZZ
     */
    public static DateTimeFormatter tTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17919);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17920);return Constants.tt;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, two digit second of minute, and time zone offset prefixed
     * by 'T' ('T'HH:mm:ssZZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for 'T'HH:mm:ssZZ
     */
    public static DateTimeFormatter tTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17921);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17922);return Constants.ttx;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date and time, separated by a 'T'
     * (yyyy-MM-dd'T'HH:mm:ss.SSSZZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for yyyy-MM-dd'T'HH:mm:ss.SSSZZ
     */
    public static DateTimeFormatter dateTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17923);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17924);return Constants.dt;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date and time without millis,
     * separated by a 'T' (yyyy-MM-dd'T'HH:mm:ssZZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for yyyy-MM-dd'T'HH:mm:ssZZ
     */
    public static DateTimeFormatter dateTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17925);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17926);return Constants.dtx;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a full ordinal date, using a four
     * digit year and three digit dayOfYear (yyyy-DDD).
     * 
     * @return a formatter for yyyy-DDD
     * @since 1.1
     */
    public static DateTimeFormatter ordinalDate() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17927);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17928);return Constants.od;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a full ordinal date and time, using a four
     * digit year and three digit dayOfYear (yyyy-DDD'T'HH:mm:ss.SSSZZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for yyyy-DDD'T'HH:mm:ss.SSSZZ
     * @since 1.1
     */
    public static DateTimeFormatter ordinalDateTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17929);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17930);return Constants.odt;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a full ordinal date and time without millis,
     * using a four digit year and three digit dayOfYear (yyyy-DDD'T'HH:mm:ssZZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for yyyy-DDD'T'HH:mm:ssZZ
     * @since 1.1
     */
    public static DateTimeFormatter ordinalDateTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17931);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17932);return Constants.odtx;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a full date as four digit weekyear, two digit
     * week of weekyear, and one digit day of week (xxxx-'W'ww-e).
     * 
     * @return a formatter for xxxx-'W'ww-e
     */
    public static DateTimeFormatter weekDate() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17933);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17934);return Constants.wwd;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full weekyear date and time,
     * separated by a 'T' (xxxx-'W'ww-e'T'HH:mm:ss.SSSZZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for xxxx-'W'ww-e'T'HH:mm:ss.SSSZZ
     */
    public static DateTimeFormatter weekDateTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17935);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17936);return Constants.wdt;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full weekyear date and time without millis,
     * separated by a 'T' (xxxx-'W'ww-e'T'HH:mm:ssZZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HH:mm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for xxxx-'W'ww-e'T'HH:mm:ssZZ
     */
    public static DateTimeFormatter weekDateTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17937);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17938);return Constants.wdtx;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a basic formatter for a full date as four digit year, two digit
     * month of year, and two digit day of month (yyyyMMdd).
     * 
     * @return a formatter for yyyyMMdd
     */
    public static DateTimeFormatter basicDate() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17939);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17940);return Constants.bd;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a basic formatter for a two digit hour of day, two digit minute
     * of hour, two digit second of minute, three digit millis, and time zone
     * offset (HHmmss.SSSZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for HHmmss.SSSZ
     */
    public static DateTimeFormatter basicTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17941);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17942);return Constants.bt;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a basic formatter for a two digit hour of day, two digit minute
     * of hour, two digit second of minute, and time zone offset (HHmmssZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for HHmmssZ
     */
    public static DateTimeFormatter basicTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17943);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17944);return Constants.btx;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a basic formatter for a two digit hour of day, two digit minute
     * of hour, two digit second of minute, three digit millis, and time zone
     * offset prefixed by 'T' ('T'HHmmss.SSSZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for 'T'HHmmss.SSSZ
     */
    public static DateTimeFormatter basicTTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17945);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17946);return Constants.btt;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a basic formatter for a two digit hour of day, two digit minute
     * of hour, two digit second of minute, and time zone offset prefixed by 'T'
     * ('T'HHmmssZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for 'T'HHmmssZ
     */
    public static DateTimeFormatter basicTTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17947);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17948);return Constants.bttx;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a basic formatter that combines a basic date and time, separated
     * by a 'T' (yyyyMMdd'T'HHmmss.SSSZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for yyyyMMdd'T'HHmmss.SSSZ
     */
    public static DateTimeFormatter basicDateTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17949);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17950);return Constants.bdt;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a basic formatter that combines a basic date and time without millis,
     * separated by a 'T' (yyyyMMdd'T'HHmmssZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for yyyyMMdd'T'HHmmssZ
     */
    public static DateTimeFormatter basicDateTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17951);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17952);return Constants.bdtx;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a full ordinal date, using a four
     * digit year and three digit dayOfYear (yyyyDDD).
     * 
     * @return a formatter for yyyyDDD
     * @since 1.1
     */
    public static DateTimeFormatter basicOrdinalDate() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17953);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17954);return Constants.bod;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a full ordinal date and time, using a four
     * digit year and three digit dayOfYear (yyyyDDD'T'HHmmss.SSSZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for yyyyDDD'T'HHmmss.SSSZ
     * @since 1.1
     */
    public static DateTimeFormatter basicOrdinalDateTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17955);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17956);return Constants.bodt;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a full ordinal date and time without millis,
     * using a four digit year and three digit dayOfYear (yyyyDDD'T'HHmmssZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for yyyyDDD'T'HHmmssZ
     * @since 1.1
     */
    public static DateTimeFormatter basicOrdinalDateTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17957);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17958);return Constants.bodtx;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a basic formatter for a full date as four digit weekyear, two
     * digit week of weekyear, and one digit day of week (xxxx'W'wwe).
     * 
     * @return a formatter for xxxx'W'wwe
     */
    public static DateTimeFormatter basicWeekDate() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17959);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17960);return Constants.bwd;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a basic formatter that combines a basic weekyear date and time,
     * separated by a 'T' (xxxx'W'wwe'T'HHmmss.SSSZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for xxxx'W'wwe'T'HHmmss.SSSZ
     */
    public static DateTimeFormatter basicWeekDateTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17961);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17962);return Constants.bwdt;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a basic formatter that combines a basic weekyear date and time
     * without millis, separated by a 'T' (xxxx'W'wwe'T'HHmmssZ).
     * The time zone offset is 'Z' for zero, and of the form '\u00b1HHmm' for non-zero.
     * The parser is strict by default, thus time string {@code 24:00} cannot be parsed.
     * 
     * @return a formatter for xxxx'W'wwe'T'HHmmssZ
     */
    public static DateTimeFormatter basicWeekDateTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17963);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17964);return Constants.bwdtx;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a formatter for a four digit year. (yyyy)
     * 
     * @return a formatter for yyyy
     */
    public static DateTimeFormatter year() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17965);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17966);return Constants.ye;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a four digit year and two digit month of
     * year. (yyyy-MM)
     * 
     * @return a formatter for yyyy-MM
     */
    public static DateTimeFormatter yearMonth() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17967);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17968);return Constants.ym;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a four digit year, two digit month of year, and
     * two digit day of month. (yyyy-MM-dd)
     * 
     * @return a formatter for yyyy-MM-dd
     */
    public static DateTimeFormatter yearMonthDay() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17969);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17970);return Constants.ymd;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a four digit weekyear. (xxxx)
     * 
     * @return a formatter for xxxx
     */
    public static DateTimeFormatter weekyear() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17971);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17972);return Constants.we;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a four digit weekyear and two digit week of
     * weekyear. (xxxx-'W'ww)
     * 
     * @return a formatter for xxxx-'W'ww
     */
    public static DateTimeFormatter weekyearWeek() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17973);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17974);return Constants.ww;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a four digit weekyear, two digit week of
     * weekyear, and one digit day of week. (xxxx-'W'ww-e)
     * 
     * @return a formatter for xxxx-'W'ww-e
     */
    public static DateTimeFormatter weekyearWeekDay() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17975);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17976);return Constants.wwd;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day. (HH)
     * 
     * @return a formatter for HH
     */
    public static DateTimeFormatter hour() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17977);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17978);return Constants.hde;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day and two digit minute of
     * hour. (HH:mm)
     * 
     * @return a formatter for HH:mm
     */
    public static DateTimeFormatter hourMinute() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17979);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17980);return Constants.hm;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, and two digit second of minute. (HH:mm:ss)
     * 
     * @return a formatter for HH:mm:ss
     */
    public static DateTimeFormatter hourMinuteSecond() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17981);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17982);return Constants.hms;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, two digit second of minute, and three digit fraction of
     * second (HH:mm:ss.SSS). Parsing will parse up to 3 fractional second
     * digits.
     * 
     * @return a formatter for HH:mm:ss.SSS
     */
    public static DateTimeFormatter hourMinuteSecondMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17983);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17984);return Constants.hmsl;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter for a two digit hour of day, two digit minute of
     * hour, two digit second of minute, and three digit fraction of
     * second (HH:mm:ss.SSS). Parsing will parse up to 9 fractional second
     * digits, throwing away all except the first three.
     * 
     * @return a formatter for HH:mm:ss.SSS
     */
    public static DateTimeFormatter hourMinuteSecondFraction() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17985);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17986);return Constants.hmsf;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date and two digit hour of
     * day. (yyyy-MM-dd'T'HH)
     * 
     * @return a formatter for yyyy-MM-dd'T'HH
     */
    public static DateTimeFormatter dateHour() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17987);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17988);return Constants.dh;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date, two digit hour of day,
     * and two digit minute of hour. (yyyy-MM-dd'T'HH:mm)
     * 
     * @return a formatter for yyyy-MM-dd'T'HH:mm
     */
    public static DateTimeFormatter dateHourMinute() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17989);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17990);return Constants.dhm;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date, two digit hour of day,
     * two digit minute of hour, and two digit second of
     * minute. (yyyy-MM-dd'T'HH:mm:ss)
     * 
     * @return a formatter for yyyy-MM-dd'T'HH:mm:ss
     */
    public static DateTimeFormatter dateHourMinuteSecond() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17991);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17992);return Constants.dhms;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date, two digit hour of day,
     * two digit minute of hour, two digit second of minute, and three digit
     * fraction of second (yyyy-MM-dd'T'HH:mm:ss.SSS). Parsing will parse up
     * to 3 fractional second digits.
     * 
     * @return a formatter for yyyy-MM-dd'T'HH:mm:ss.SSS
     */
    public static DateTimeFormatter dateHourMinuteSecondMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17993);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17994);return Constants.dhmsl;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    /**
     * Returns a formatter that combines a full date, two digit hour of day,
     * two digit minute of hour, two digit second of minute, and three digit
     * fraction of second (yyyy-MM-dd'T'HH:mm:ss.SSS). Parsing will parse up
     * to 9 fractional second digits, throwing away all except the first three.
     * 
     * @return a formatter for yyyy-MM-dd'T'HH:mm:ss.SSS
     */
    public static DateTimeFormatter dateHourMinuteSecondFraction() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17995);
        __CLR4_4_1dmcdmclc8aztld.R.inc(17996);return Constants.dhmsf;
    }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static final class Constants {
        private static final DateTimeFormatter
            ye = yearElement(),  // year element (yyyy)
            mye = monthElement(), // monthOfYear element (-MM)
            dme = dayOfMonthElement(), // dayOfMonth element (-dd)
            we = weekyearElement(),  // weekyear element (xxxx)
            wwe = weekElement(), // weekOfWeekyear element (-ww)
            dwe = dayOfWeekElement(), // dayOfWeek element (-ee)
            dye = dayOfYearElement(), // dayOfYear element (-DDD)
            hde = hourElement(), // hourOfDay element (HH)
            mhe = minuteElement(), // minuteOfHour element (:mm)
            sme = secondElement(), // secondOfMinute element (:ss)
            fse = fractionElement(), // fractionOfSecond element (.SSSSSSSSS)
            ze = offsetElement(),  // zone offset element
            lte = literalTElement(), // literal 'T' element
            
            //y,   // year (same as year element)
            ym = yearMonth(),  // year month
            ymd = yearMonthDay(), // year month day

            //w,   // weekyear (same as weekyear element)
            ww = weekyearWeek(),  // weekyear week
            wwd = weekyearWeekDay(), // weekyear week day

            //h,    // hour (same as hour element)
            hm = hourMinute(),   // hour minute
            hms = hourMinuteSecond(),  // hour minute second
            hmsl = hourMinuteSecondMillis(), // hour minute second millis
            hmsf = hourMinuteSecondFraction(), // hour minute second fraction

            dh = dateHour(),    // date hour
            dhm = dateHourMinute(),   // date hour minute
            dhms = dateHourMinuteSecond(),  // date hour minute second
            dhmsl = dateHourMinuteSecondMillis(), // date hour minute second millis
            dhmsf = dateHourMinuteSecondFraction(), // date hour minute second fraction

            //d,  // date (same as ymd)
            t = time(),  // time
            tx = timeNoMillis(),  // time no millis
            tt = tTime(),  // Ttime
            ttx = tTimeNoMillis(),  // Ttime no millis
            dt = dateTime(), // date time
            dtx = dateTimeNoMillis(), // date time no millis

            //wd,  // week date (same as wwd)
            wdt = weekDateTime(), // week date time
            wdtx = weekDateTimeNoMillis(), // week date time no millis

            od = ordinalDate(),  // ordinal date (same as yd)
            odt = ordinalDateTime(), // ordinal date time
            odtx = ordinalDateTimeNoMillis(), // ordinal date time no millis

            bd = basicDate(),  // basic date
            bt = basicTime(),  // basic time
            btx = basicTimeNoMillis(),  // basic time no millis
            btt = basicTTime(), // basic Ttime
            bttx = basicTTimeNoMillis(), // basic Ttime no millis
            bdt = basicDateTime(), // basic date time
            bdtx = basicDateTimeNoMillis(), // basic date time no millis

            bod = basicOrdinalDate(),  // basic ordinal date
            bodt = basicOrdinalDateTime(), // basic ordinal date time
            bodtx = basicOrdinalDateTimeNoMillis(), // basic ordinal date time no millis

            bwd = basicWeekDate(),  // basic week date
            bwdt = basicWeekDateTime(), // basic week date time
            bwdtx = basicWeekDateTimeNoMillis(), // basic week date time no millis

            dpe = dateElementParser(), // date parser element
            tpe = timeElementParser(), // time parser element
            dp = dateParser(),  // date parser
            ldp = localDateParser(), // local date parser
            tp = timeParser(),  // time parser
            ltp = localTimeParser(), // local time parser
            dtp = dateTimeParser(), // date time parser
            dotp = dateOptionalTimeParser(), // date optional time parser
            ldotp = localDateOptionalTimeParser(); // local date optional time parser

        //-----------------------------------------------------------------------
        private static DateTimeFormatter dateParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(17997);
            __CLR4_4_1dmcdmclc8aztld.R.inc(17998);if ((((dp == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(17999)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18000)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18001);DateTimeParser tOffset = new DateTimeFormatterBuilder()
                    .appendLiteral('T')
                    .append(offsetElement()).toParser();
                __CLR4_4_1dmcdmclc8aztld.R.inc(18002);return new DateTimeFormatterBuilder()
                    .append(dateElementParser())
                    .appendOptional(tOffset)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18003);return dp;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter localDateParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18004);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18005);if ((((ldp == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18006)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18007)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18008);return dateElementParser().withZoneUTC();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18009);return ldp;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter dateElementParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18010);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18011);if ((((dpe == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18012)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18013)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18014);return new DateTimeFormatterBuilder()
                    .append(null, new DateTimeParser[] {
                        new DateTimeFormatterBuilder()
                        .append(yearElement())
                        .appendOptional
                        (new DateTimeFormatterBuilder()
                         .append(monthElement())
                         .appendOptional(dayOfMonthElement().getParser())
                         .toParser())
                        .toParser(),
                        new DateTimeFormatterBuilder()
                        .append(weekyearElement())
                        .append(weekElement())
                        .appendOptional(dayOfWeekElement().getParser())
                        .toParser(),
                        new DateTimeFormatterBuilder()
                        .append(yearElement())
                        .append(dayOfYearElement())
                        .toParser()
                    })
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18015);return dpe;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter timeParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18016);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18017);if ((((tp == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18018)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18019)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18020);return new DateTimeFormatterBuilder()
                    .appendOptional(literalTElement().getParser())
                    .append(timeElementParser())
                    .appendOptional(offsetElement().getParser())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18021);return tp;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter localTimeParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18022);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18023);if ((((ltp == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18024)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18025)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18026);return new DateTimeFormatterBuilder()
                    .appendOptional(literalTElement().getParser())
                    .append(timeElementParser())
                    .toFormatter().withZoneUTC();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18027);return ltp;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter timeElementParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18028);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18029);if ((((tpe == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18030)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18031)==0&false))) {{
                // Decimal point can be either '.' or ','
                __CLR4_4_1dmcdmclc8aztld.R.inc(18032);DateTimeParser decimalPoint = new DateTimeFormatterBuilder()
                    .append(null, new DateTimeParser[] {
                        new DateTimeFormatterBuilder()
                        .appendLiteral('.')
                        .toParser(),
                        new DateTimeFormatterBuilder()
                        .appendLiteral(',')
                        .toParser()
                    })
                    .toParser();

                __CLR4_4_1dmcdmclc8aztld.R.inc(18033);return new DateTimeFormatterBuilder()
                    // time-element
                    .append(hourElement())
                    .append
                    (null, new DateTimeParser[] {
                        new DateTimeFormatterBuilder()
                        // minute-element
                        .append(minuteElement())
                        .append
                        (null, new DateTimeParser[] {
                            new DateTimeFormatterBuilder()
                            // second-element
                            .append(secondElement())
                            // second fraction
                            .appendOptional(new DateTimeFormatterBuilder()
                                            .append(decimalPoint)
                                            .appendFractionOfSecond(1, 9)
                                            .toParser())
                            .toParser(),
                            // minute fraction
                            new DateTimeFormatterBuilder()
                            .append(decimalPoint)
                            .appendFractionOfMinute(1, 9)
                            .toParser(),
                            null
                        })
                        .toParser(),
                        // hour fraction
                        new DateTimeFormatterBuilder()
                        .append(decimalPoint)
                        .appendFractionOfHour(1, 9)
                        .toParser(),
                        null
                    })
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18034);return tpe;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter dateTimeParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18035);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18036);if ((((dtp == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18037)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18038)==0&false))) {{
                // This is different from the general time parser in that the 'T'
                // is required.
                __CLR4_4_1dmcdmclc8aztld.R.inc(18039);DateTimeParser time = new DateTimeFormatterBuilder()
                    .appendLiteral('T')
                    .append(timeElementParser())
                    .appendOptional(offsetElement().getParser())
                    .toParser();
                __CLR4_4_1dmcdmclc8aztld.R.inc(18040);return new DateTimeFormatterBuilder()
                    .append(null, new DateTimeParser[] {time, dateOptionalTimeParser().getParser()})
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18041);return dtp;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter dateOptionalTimeParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18042);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18043);if ((((dotp == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18044)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18045)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18046);DateTimeParser timeOrOffset = new DateTimeFormatterBuilder()
                    .appendLiteral('T')
                    .appendOptional(timeElementParser().getParser())
                    .appendOptional(offsetElement().getParser())
                    .toParser();
                __CLR4_4_1dmcdmclc8aztld.R.inc(18047);return new DateTimeFormatterBuilder()
                    .append(dateElementParser())
                    .appendOptional(timeOrOffset)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18048);return dotp;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter localDateOptionalTimeParser() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18049);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18050);if ((((ldotp == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18051)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18052)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18053);DateTimeParser time = new DateTimeFormatterBuilder()
                    .appendLiteral('T')
                    .append(timeElementParser())
                    .toParser();
                __CLR4_4_1dmcdmclc8aztld.R.inc(18054);return new DateTimeFormatterBuilder()
                    .append(dateElementParser())
                    .appendOptional(time)
                    .toFormatter().withZoneUTC();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18055);return ldotp;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        private static DateTimeFormatter time() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18056);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18057);if ((((t == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18058)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18059)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18060);return new DateTimeFormatterBuilder()
                    .append(hourMinuteSecondFraction())
                    .append(offsetElement())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18061);return t;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter timeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18062);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18063);if ((((tx == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18064)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18065)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18066);return new DateTimeFormatterBuilder()
                    .append(hourMinuteSecond())
                    .append(offsetElement())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18067);return tx;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter tTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18068);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18069);if ((((tt == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18070)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18071)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18072);return new DateTimeFormatterBuilder()
                    .append(literalTElement())
                    .append(time())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18073);return tt;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter tTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18074);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18075);if ((((ttx == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18076)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18077)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18078);return new DateTimeFormatterBuilder()
                    .append(literalTElement())
                    .append(timeNoMillis())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18079);return ttx;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter dateTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18080);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18081);if ((((dt == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18082)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18083)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18084);return new DateTimeFormatterBuilder()
                    .append(date())
                    .append(tTime())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18085);return dt;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter dateTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18086);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18087);if ((((dtx == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18088)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18089)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18090);return new DateTimeFormatterBuilder()
                    .append(date())
                    .append(tTimeNoMillis())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18091);return dtx;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter ordinalDate() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18092);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18093);if ((((od == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18094)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18095)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18096);return new DateTimeFormatterBuilder()
                    .append(yearElement())
                    .append(dayOfYearElement())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18097);return od;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter ordinalDateTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18098);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18099);if ((((odt == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18100)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18101)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18102);return new DateTimeFormatterBuilder()
                    .append(ordinalDate())
                    .append(tTime())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18103);return odt;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter ordinalDateTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18104);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18105);if ((((odtx == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18106)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18107)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18108);return new DateTimeFormatterBuilder()
                    .append(ordinalDate())
                    .append(tTimeNoMillis())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18109);return odtx;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter weekDateTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18110);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18111);if ((((wdt == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18112)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18113)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18114);return new DateTimeFormatterBuilder()
                    .append(weekDate())
                    .append(tTime())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18115);return wdt;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter weekDateTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18116);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18117);if ((((wdtx == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18118)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18119)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18120);return new DateTimeFormatterBuilder()
                    .append(weekDate())
                    .append(tTimeNoMillis())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18121);return wdtx;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        private static DateTimeFormatter basicDate() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18122);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18123);if ((((bd == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18124)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18125)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18126);return new DateTimeFormatterBuilder()
                    .appendYear(4, 4)
                    .appendFixedDecimal(DateTimeFieldType.monthOfYear(), 2)
                    .appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18127);return bd;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter basicTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18128);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18129);if ((((bt == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18130)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18131)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18132);return new DateTimeFormatterBuilder()
                    .appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2)
                    .appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2)
                    .appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2)
                    .appendLiteral('.')
                    .appendFractionOfSecond(3, 9)
                    .appendTimeZoneOffset("Z", false, 2, 2)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18133);return bt;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter basicTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18134);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18135);if ((((btx == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18136)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18137)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18138);return new DateTimeFormatterBuilder()
                    .appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2)
                    .appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2)
                    .appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2)
                    .appendTimeZoneOffset("Z", false, 2, 2)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18139);return btx;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter basicTTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18140);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18141);if ((((btt == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18142)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18143)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18144);return new DateTimeFormatterBuilder()
                    .append(literalTElement())
                    .append(basicTime())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18145);return btt;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter basicTTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18146);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18147);if ((((bttx == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18148)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18149)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18150);return new DateTimeFormatterBuilder()
                    .append(literalTElement())
                    .append(basicTimeNoMillis())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18151);return bttx;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter basicDateTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18152);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18153);if ((((bdt == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18154)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18155)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18156);return new DateTimeFormatterBuilder()
                    .append(basicDate())
                    .append(basicTTime())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18157);return bdt;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter basicDateTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18158);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18159);if ((((bdtx == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18160)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18161)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18162);return new DateTimeFormatterBuilder()
                    .append(basicDate())
                    .append(basicTTimeNoMillis())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18163);return bdtx;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter basicOrdinalDate() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18164);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18165);if ((((bod == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18166)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18167)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18168);return new DateTimeFormatterBuilder()
                    .appendYear(4, 4)
                    .appendFixedDecimal(DateTimeFieldType.dayOfYear(), 3)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18169);return bod;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter basicOrdinalDateTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18170);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18171);if ((((bodt == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18172)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18173)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18174);return new DateTimeFormatterBuilder()
                    .append(basicOrdinalDate())
                    .append(basicTTime())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18175);return bodt;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter basicOrdinalDateTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18176);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18177);if ((((bodtx == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18178)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18179)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18180);return new DateTimeFormatterBuilder()
                    .append(basicOrdinalDate())
                    .append(basicTTimeNoMillis())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18181);return bodtx;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter basicWeekDate() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18182);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18183);if ((((bwd == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18184)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18185)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18186);return new DateTimeFormatterBuilder()
                    .appendWeekyear(4, 4)
                    .appendLiteral('W')
                    .appendFixedDecimal(DateTimeFieldType.weekOfWeekyear(), 2)
                    .appendFixedDecimal(DateTimeFieldType.dayOfWeek(), 1)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18187);return bwd;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter basicWeekDateTime() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18188);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18189);if ((((bwdt == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18190)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18191)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18192);return new DateTimeFormatterBuilder()
                    .append(basicWeekDate())
                    .append(basicTTime())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18193);return bwdt;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter basicWeekDateTimeNoMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18194);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18195);if ((((bwdtx == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18196)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18197)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18198);return new DateTimeFormatterBuilder()
                    .append(basicWeekDate())
                    .append(basicTTimeNoMillis())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18199);return bwdtx;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        private static DateTimeFormatter yearMonth() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18200);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18201);if ((((ym == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18202)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18203)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18204);return new DateTimeFormatterBuilder()
                    .append(yearElement())
                    .append(monthElement())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18205);return ym;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter yearMonthDay() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18206);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18207);if ((((ymd == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18208)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18209)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18210);return new DateTimeFormatterBuilder()
                    .append(yearElement())
                    .append(monthElement())
                    .append(dayOfMonthElement())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18211);return ymd;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter weekyearWeek() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18212);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18213);if ((((ww == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18214)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18215)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18216);return new DateTimeFormatterBuilder()
                    .append(weekyearElement())
                    .append(weekElement())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18217);return ww;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter weekyearWeekDay() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18218);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18219);if ((((wwd == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18220)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18221)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18222);return new DateTimeFormatterBuilder()
                    .append(weekyearElement())
                    .append(weekElement())
                    .append(dayOfWeekElement())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18223);return wwd;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter hourMinute() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18224);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18225);if ((((hm == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18226)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18227)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18228);return new DateTimeFormatterBuilder()
                    .append(hourElement())
                    .append(minuteElement())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18229);return hm;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter hourMinuteSecond() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18230);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18231);if ((((hms == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18232)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18233)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18234);return new DateTimeFormatterBuilder()
                    .append(hourElement())
                    .append(minuteElement())
                    .append(secondElement())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18235);return hms;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter hourMinuteSecondMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18236);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18237);if ((((hmsl == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18238)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18239)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18240);return new DateTimeFormatterBuilder()
                    .append(hourElement())
                    .append(minuteElement())
                    .append(secondElement())
                    .appendLiteral('.')
                    .appendFractionOfSecond(3, 3)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18241);return hmsl;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter hourMinuteSecondFraction() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18242);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18243);if ((((hmsf == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18244)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18245)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18246);return new DateTimeFormatterBuilder()
                    .append(hourElement())
                    .append(minuteElement())
                    .append(secondElement())
                    .append(fractionElement())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18247);return hmsf;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter dateHour() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18248);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18249);if ((((dh == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18250)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18251)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18252);return new DateTimeFormatterBuilder()
                    .append(date())
                    .append(literalTElement())
                    .append(hour())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18253);return dh;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter dateHourMinute() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18254);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18255);if ((((dhm == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18256)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18257)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18258);return new DateTimeFormatterBuilder()
                    .append(date())
                    .append(literalTElement())
                    .append(hourMinute())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18259);return dhm;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter dateHourMinuteSecond() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18260);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18261);if ((((dhms == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18262)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18263)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18264);return new DateTimeFormatterBuilder()
                    .append(date())
                    .append(literalTElement())
                    .append(hourMinuteSecond())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18265);return dhms;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter dateHourMinuteSecondMillis() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18266);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18267);if ((((dhmsl == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18268)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18269)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18270);return new DateTimeFormatterBuilder()
                    .append(date())
                    .append(literalTElement())
                    .append(hourMinuteSecondMillis())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18271);return dhmsl;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        private static DateTimeFormatter dateHourMinuteSecondFraction() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18272);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18273);if ((((dhmsf == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18274)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18275)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18276);return new DateTimeFormatterBuilder()
                    .append(date())
                    .append(literalTElement())
                    .append(hourMinuteSecondFraction())
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18277);return dhmsf;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

        //-----------------------------------------------------------------------
        private static DateTimeFormatter yearElement() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18278);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18279);if ((((ye == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18280)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18281)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18282);return new DateTimeFormatterBuilder()
                    .appendYear(4, 9)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18283);return ye;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}
    
        private static DateTimeFormatter monthElement() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18284);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18285);if ((((mye == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18286)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18287)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18288);return new DateTimeFormatterBuilder()
                    .appendLiteral('-')
                    .appendMonthOfYear(2)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18289);return mye;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}
    
        private static DateTimeFormatter dayOfMonthElement() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18290);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18291);if ((((dme == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18292)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18293)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18294);return new DateTimeFormatterBuilder()
                    .appendLiteral('-')
                    .appendDayOfMonth(2)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18295);return dme;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}
    
        private static DateTimeFormatter weekyearElement() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18296);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18297);if ((((we == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18298)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18299)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18300);return new DateTimeFormatterBuilder()
                    .appendWeekyear(4, 9)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18301);return we;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}
    
        private static DateTimeFormatter weekElement() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18302);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18303);if ((((wwe == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18304)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18305)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18306);return new DateTimeFormatterBuilder()
                    .appendLiteral("-W")
                    .appendWeekOfWeekyear(2)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18307);return wwe;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}
    
        private static DateTimeFormatter dayOfWeekElement() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18308);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18309);if ((((dwe == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18310)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18311)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18312);return new DateTimeFormatterBuilder()
                    .appendLiteral('-')
                    .appendDayOfWeek(1)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18313);return dwe;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}
    
        private static DateTimeFormatter dayOfYearElement() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18314);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18315);if ((((dye == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18316)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18317)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18318);return new DateTimeFormatterBuilder()
                    .appendLiteral('-')
                    .appendDayOfYear(3)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18319);return dye;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}
        
        private static DateTimeFormatter literalTElement() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18320);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18321);if ((((lte == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18322)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18323)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18324);return new DateTimeFormatterBuilder()
                    .appendLiteral('T')
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18325);return lte;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}
    
        private static DateTimeFormatter hourElement() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18326);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18327);if ((((hde == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18328)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18329)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18330);return new DateTimeFormatterBuilder()
                    .appendHourOfDay(2)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18331);return hde;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}
    
        private static DateTimeFormatter minuteElement() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18332);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18333);if ((((mhe == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18334)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18335)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18336);return new DateTimeFormatterBuilder()
                    .appendLiteral(':')
                    .appendMinuteOfHour(2)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18337);return mhe;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}
    
        private static DateTimeFormatter secondElement() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18338);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18339);if ((((sme == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18340)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18341)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18342);return new DateTimeFormatterBuilder()
                    .appendLiteral(':')
                    .appendSecondOfMinute(2)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18343);return sme;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}
    
        private static DateTimeFormatter fractionElement() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18344);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18345);if ((((fse == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18346)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18347)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18348);return new DateTimeFormatterBuilder()
                    .appendLiteral('.')
                    // Support parsing up to nanosecond precision even though
                    // those extra digits will be dropped.
                    .appendFractionOfSecond(3, 9)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18349);return fse;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}
    
        private static DateTimeFormatter offsetElement() {try{__CLR4_4_1dmcdmclc8aztld.R.inc(18350);
            __CLR4_4_1dmcdmclc8aztld.R.inc(18351);if ((((ze == null)&&(__CLR4_4_1dmcdmclc8aztld.R.iget(18352)!=0|true))||(__CLR4_4_1dmcdmclc8aztld.R.iget(18353)==0&false))) {{
                __CLR4_4_1dmcdmclc8aztld.R.inc(18354);return new DateTimeFormatterBuilder()
                    .appendTimeZoneOffset("Z", true, 2, 4)
                    .toFormatter();
            }
            }__CLR4_4_1dmcdmclc8aztld.R.inc(18355);return ze;
        }finally{__CLR4_4_1dmcdmclc8aztld.R.flushNeeded();}}

    }

}
