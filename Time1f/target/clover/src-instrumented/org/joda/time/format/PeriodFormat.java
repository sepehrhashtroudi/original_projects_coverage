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

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Factory that creates instances of PeriodFormatter.
 * <p>
 * Period formatting is performed by the {@link PeriodFormatter} class.
 * Three classes provide factory methods to create formatters, and this is one.
 * The others are {@link ISOPeriodFormat} and {@link PeriodFormatterBuilder}.
 * <p>
 * PeriodFormat is thread-safe and immutable, and the formatters it returns
 * are as well.
 *
 * @author Brian S O'Neill
 * @since 1.0
 * @see ISOPeriodFormat
 * @see PeriodFormatterBuilder
 */
public class PeriodFormat {public static class __CLR4_4_1e6se6slc8aztly{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,18404,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The resource bundle name.
     */
    private static final String BUNDLE_NAME = "org.joda.time.format.messages";
    /**
     * The created formatters.
     */
    private static final ConcurrentMap<Locale, PeriodFormatter> FORMATTERS = new ConcurrentHashMap<Locale, PeriodFormatter>();

    /**
     * Constructor.
     *
     * @since 1.1 (previously private)
     */
    protected PeriodFormat() {
        super();__CLR4_4_1e6se6slc8aztly.R.inc(18389);try{__CLR4_4_1e6se6slc8aztly.R.inc(18388);
    }finally{__CLR4_4_1e6se6slc8aztly.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the default formatter that outputs words in English.
     * <p>
     * This calls {@link #wordBased(Locale)} using a locale of {@code ENGLISH}.
     * 
     * @return the formatter, not null
     */
    public static PeriodFormatter getDefault() {try{__CLR4_4_1e6se6slc8aztly.R.inc(18390);
        __CLR4_4_1e6se6slc8aztly.R.inc(18391);return wordBased(Locale.ENGLISH);
    }finally{__CLR4_4_1e6se6slc8aztly.R.flushNeeded();}}

    /**
     * Returns a word based formatter for the JDK default locale.
     * <p>
     * This calls {@link #wordBased(Locale)} using the {@link Locale#getDefault() default locale}.
     * 
     * @return the formatter, not null
     * @since 2.0
     */
    public static PeriodFormatter wordBased() {try{__CLR4_4_1e6se6slc8aztly.R.inc(18392);
        __CLR4_4_1e6se6slc8aztly.R.inc(18393);return wordBased(Locale.getDefault());
    }finally{__CLR4_4_1e6se6slc8aztly.R.flushNeeded();}}

    /**
     * Returns a word based formatter for the specified locale.
     * <p>
     * The words are configured in a resource bundle text file -
     * {@code org.joda.time.format.messages}.
     * This can be added to via the normal classpath resource bundle mechanisms.
     * <p>
     * Available languages are English, Danish, Dutch, French, German, Japanese, Portuguese, and Spanish.
     * 
     * @return the formatter, not null
     * @since 2.0
     */
    public static PeriodFormatter wordBased(Locale locale) {try{__CLR4_4_1e6se6slc8aztly.R.inc(18394);
        __CLR4_4_1e6se6slc8aztly.R.inc(18395);PeriodFormatter pf = FORMATTERS.get(locale);
        __CLR4_4_1e6se6slc8aztly.R.inc(18396);if ((((pf == null)&&(__CLR4_4_1e6se6slc8aztly.R.iget(18397)!=0|true))||(__CLR4_4_1e6se6slc8aztly.R.iget(18398)==0&false))) {{
            __CLR4_4_1e6se6slc8aztly.R.inc(18399);ResourceBundle b = ResourceBundle.getBundle(BUNDLE_NAME, locale);
            __CLR4_4_1e6se6slc8aztly.R.inc(18400);String[] variants = {
                    b.getString("PeriodFormat.space"), b.getString("PeriodFormat.comma"),
                    b.getString("PeriodFormat.commandand"), b.getString("PeriodFormat.commaspaceand")};
            __CLR4_4_1e6se6slc8aztly.R.inc(18401);pf = new PeriodFormatterBuilder()
                .appendYears()
                .appendSuffix(b.getString("PeriodFormat.year"), b.getString("PeriodFormat.years"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendMonths()
                .appendSuffix(b.getString("PeriodFormat.month"), b.getString("PeriodFormat.months"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendWeeks()
                .appendSuffix(b.getString("PeriodFormat.week"), b.getString("PeriodFormat.weeks"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendDays()
                .appendSuffix(b.getString("PeriodFormat.day"), b.getString("PeriodFormat.days"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendHours()
                .appendSuffix(b.getString("PeriodFormat.hour"), b.getString("PeriodFormat.hours"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendMinutes()
                .appendSuffix(b.getString("PeriodFormat.minute"), b.getString("PeriodFormat.minutes"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendSeconds()
                .appendSuffix(b.getString("PeriodFormat.second"), b.getString("PeriodFormat.seconds"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendMillis()
                .appendSuffix(b.getString("PeriodFormat.millisecond"), b.getString("PeriodFormat.milliseconds"))
                .toFormatter();
            __CLR4_4_1e6se6slc8aztly.R.inc(18402);FORMATTERS.putIfAbsent(locale, pf);
        }
        }__CLR4_4_1e6se6slc8aztly.R.inc(18403);return pf;
    }finally{__CLR4_4_1e6se6slc8aztly.R.flushNeeded();}}

}
