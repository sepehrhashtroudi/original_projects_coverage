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
package org.joda.time.chrono;

import java.lang.ref.WeakReference;
import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.WeakHashMap;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.IllegalFieldValueException;

/**
 * Utility class used by a few of the GJDateTimeFields.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
class GJLocaleSymbols {public static class __CLR4_4_189v89vlc8azsy4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,10878,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int FAST_CACHE_SIZE = 64;

    private static final GJLocaleSymbols[] cFastCache = new GJLocaleSymbols[FAST_CACHE_SIZE];

    private static WeakHashMap<Locale, GJLocaleSymbols> cCache = new WeakHashMap<Locale, GJLocaleSymbols>();

    public static GJLocaleSymbols forLocale(Locale locale) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10723);
        __CLR4_4_189v89vlc8azsy4.R.inc(10724);if ((((locale == null)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10725)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10726)==0&false))) {{
            __CLR4_4_189v89vlc8azsy4.R.inc(10727);locale = Locale.getDefault();
        }
        }__CLR4_4_189v89vlc8azsy4.R.inc(10728);int index = System.identityHashCode(locale) & (FAST_CACHE_SIZE - 1);
        __CLR4_4_189v89vlc8azsy4.R.inc(10729);GJLocaleSymbols symbols = cFastCache[index];
        __CLR4_4_189v89vlc8azsy4.R.inc(10730);if ((((symbols != null && symbols.iLocale.get() == locale)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10731)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10732)==0&false))) {{
            __CLR4_4_189v89vlc8azsy4.R.inc(10733);return symbols;
        }
        }__CLR4_4_189v89vlc8azsy4.R.inc(10734);synchronized (cCache) {
            __CLR4_4_189v89vlc8azsy4.R.inc(10735);symbols = cCache.get(locale);
            __CLR4_4_189v89vlc8azsy4.R.inc(10736);if ((((symbols == null)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10737)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10738)==0&false))) {{
                __CLR4_4_189v89vlc8azsy4.R.inc(10739);symbols = new GJLocaleSymbols(locale);
                __CLR4_4_189v89vlc8azsy4.R.inc(10740);cCache.put(locale, symbols);
            }
        }}
        __CLR4_4_189v89vlc8azsy4.R.inc(10741);cFastCache[index] = symbols;
        __CLR4_4_189v89vlc8azsy4.R.inc(10742);return symbols;
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    private static String[] realignMonths(String[] months) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10743);
        __CLR4_4_189v89vlc8azsy4.R.inc(10744);String[] a = new String[13];
        __CLR4_4_189v89vlc8azsy4.R.inc(10745);for (int i=1; (((i<13)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10746)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10747)==0&false)); i++) {{
            __CLR4_4_189v89vlc8azsy4.R.inc(10748);a[i] = months[i - 1];
        }
        }__CLR4_4_189v89vlc8azsy4.R.inc(10749);return a;
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    private static String[] realignDaysOfWeek(String[] daysOfWeek) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10750);
        __CLR4_4_189v89vlc8azsy4.R.inc(10751);String[] a = new String[8];
        __CLR4_4_189v89vlc8azsy4.R.inc(10752);for (int i=1; (((i<8)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10753)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10754)==0&false)); i++) {{
            __CLR4_4_189v89vlc8azsy4.R.inc(10755);a[i] = daysOfWeek[((((i < 7) )&&(__CLR4_4_189v89vlc8azsy4.R.iget(10756)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10757)==0&false))? i + 1 : 1];
        }
        }__CLR4_4_189v89vlc8azsy4.R.inc(10758);return a;
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    private static void addSymbols(TreeMap<String, Integer> map, String[] symbols, Integer[] integers) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10759);
        __CLR4_4_189v89vlc8azsy4.R.inc(10760);for (int i=symbols.length; (((--i>=0)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10761)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10762)==0&false)); ) {{
            __CLR4_4_189v89vlc8azsy4.R.inc(10763);String symbol = symbols[i];
            __CLR4_4_189v89vlc8azsy4.R.inc(10764);if ((((symbol != null)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10765)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10766)==0&false))) {{
                __CLR4_4_189v89vlc8azsy4.R.inc(10767);map.put(symbol, integers[i]);
            }
        }}
    }}finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    private static void addNumerals(TreeMap<String, Integer> map, int start, int end, Integer[] integers) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10768);
        __CLR4_4_189v89vlc8azsy4.R.inc(10769);for (int i=start; (((i<=end)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10770)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10771)==0&false)); i++) {{
            __CLR4_4_189v89vlc8azsy4.R.inc(10772);map.put(String.valueOf(i).intern(), integers[i]);
        }
    }}finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    private static int maxLength(String[] a) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10773);
        __CLR4_4_189v89vlc8azsy4.R.inc(10774);int max = 0;
        __CLR4_4_189v89vlc8azsy4.R.inc(10775);for (int i=a.length; (((--i>=0)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10776)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10777)==0&false)); ) {{
            __CLR4_4_189v89vlc8azsy4.R.inc(10778);String s = a[i];
            __CLR4_4_189v89vlc8azsy4.R.inc(10779);if ((((s != null)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10780)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10781)==0&false))) {{
                __CLR4_4_189v89vlc8azsy4.R.inc(10782);int len = s.length();
                __CLR4_4_189v89vlc8azsy4.R.inc(10783);if ((((len > max)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10784)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10785)==0&false))) {{
                    __CLR4_4_189v89vlc8azsy4.R.inc(10786);max = len;
                }
            }}
        }}
        }__CLR4_4_189v89vlc8azsy4.R.inc(10787);return max;
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    private final WeakReference<Locale> iLocale;

    private final String[] iEras;
    private final String[] iDaysOfWeek;
    private final String[] iShortDaysOfWeek;
    private final String[] iMonths;
    private final String[] iShortMonths;
    private final String[] iHalfday;

    private final TreeMap<String, Integer> iParseEras;
    private final TreeMap<String, Integer> iParseDaysOfWeek;
    private final TreeMap<String, Integer> iParseMonths;

    private final int iMaxEraLength;
    private final int iMaxDayOfWeekLength;
    private final int iMaxShortDayOfWeekLength;
    private final int iMaxMonthLength;
    private final int iMaxShortMonthLength;
    private final int iMaxHalfdayLength;

    /**
     * @param locale must not be null
     */
    private GJLocaleSymbols(Locale locale) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10788);
        __CLR4_4_189v89vlc8azsy4.R.inc(10789);iLocale = new WeakReference<Locale>(locale);
        
        __CLR4_4_189v89vlc8azsy4.R.inc(10790);DateFormatSymbols dfs = DateTimeUtils.getDateFormatSymbols(locale);
        
        __CLR4_4_189v89vlc8azsy4.R.inc(10791);iEras = dfs.getEras();
        __CLR4_4_189v89vlc8azsy4.R.inc(10792);iDaysOfWeek = realignDaysOfWeek(dfs.getWeekdays());
        __CLR4_4_189v89vlc8azsy4.R.inc(10793);iShortDaysOfWeek = realignDaysOfWeek(dfs.getShortWeekdays());
        __CLR4_4_189v89vlc8azsy4.R.inc(10794);iMonths = realignMonths(dfs.getMonths());
        __CLR4_4_189v89vlc8azsy4.R.inc(10795);iShortMonths = realignMonths(dfs.getShortMonths());
        __CLR4_4_189v89vlc8azsy4.R.inc(10796);iHalfday = dfs.getAmPmStrings();

        __CLR4_4_189v89vlc8azsy4.R.inc(10797);Integer[] integers = new Integer[13];
        __CLR4_4_189v89vlc8azsy4.R.inc(10798);for (int i=0; (((i<13)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10799)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10800)==0&false)); i++) {{
            __CLR4_4_189v89vlc8azsy4.R.inc(10801);integers[i] = Integer.valueOf(i);
        }

        }__CLR4_4_189v89vlc8azsy4.R.inc(10802);iParseEras = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
        __CLR4_4_189v89vlc8azsy4.R.inc(10803);addSymbols(iParseEras, iEras, integers);
        __CLR4_4_189v89vlc8azsy4.R.inc(10804);if (((("en".equals(locale.getLanguage()))&&(__CLR4_4_189v89vlc8azsy4.R.iget(10805)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10806)==0&false))) {{
            // Include support for parsing "BCE" and "CE" if the language is
            // English. At some point Joda-Time will need an independent set of
            // localized symbols and not depend on java.text.DateFormatSymbols.
            __CLR4_4_189v89vlc8azsy4.R.inc(10807);iParseEras.put("BCE", integers[0]);
            __CLR4_4_189v89vlc8azsy4.R.inc(10808);iParseEras.put("CE", integers[1]);
        }

        }__CLR4_4_189v89vlc8azsy4.R.inc(10809);iParseDaysOfWeek = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
        __CLR4_4_189v89vlc8azsy4.R.inc(10810);addSymbols(iParseDaysOfWeek, iDaysOfWeek, integers);
        __CLR4_4_189v89vlc8azsy4.R.inc(10811);addSymbols(iParseDaysOfWeek, iShortDaysOfWeek, integers);
        __CLR4_4_189v89vlc8azsy4.R.inc(10812);addNumerals(iParseDaysOfWeek, 1, 7, integers);

        __CLR4_4_189v89vlc8azsy4.R.inc(10813);iParseMonths = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
        __CLR4_4_189v89vlc8azsy4.R.inc(10814);addSymbols(iParseMonths, iMonths, integers);
        __CLR4_4_189v89vlc8azsy4.R.inc(10815);addSymbols(iParseMonths, iShortMonths, integers);
        __CLR4_4_189v89vlc8azsy4.R.inc(10816);addNumerals(iParseMonths, 1, 12, integers);

        __CLR4_4_189v89vlc8azsy4.R.inc(10817);iMaxEraLength = maxLength(iEras);
        __CLR4_4_189v89vlc8azsy4.R.inc(10818);iMaxDayOfWeekLength = maxLength(iDaysOfWeek);
        __CLR4_4_189v89vlc8azsy4.R.inc(10819);iMaxShortDayOfWeekLength = maxLength(iShortDaysOfWeek);
        __CLR4_4_189v89vlc8azsy4.R.inc(10820);iMaxMonthLength = maxLength(iMonths);
        __CLR4_4_189v89vlc8azsy4.R.inc(10821);iMaxShortMonthLength = maxLength(iShortMonths);
        __CLR4_4_189v89vlc8azsy4.R.inc(10822);iMaxHalfdayLength = maxLength(iHalfday);
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public String eraValueToText(int value) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10823);
        __CLR4_4_189v89vlc8azsy4.R.inc(10824);return iEras[value];
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public int eraTextToValue(String text) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10825);
        __CLR4_4_189v89vlc8azsy4.R.inc(10826);Integer era = iParseEras.get(text);
        __CLR4_4_189v89vlc8azsy4.R.inc(10827);if ((((era != null)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10828)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10829)==0&false))) {{
            __CLR4_4_189v89vlc8azsy4.R.inc(10830);return era.intValue();
        }
        }__CLR4_4_189v89vlc8azsy4.R.inc(10831);throw new IllegalFieldValueException(DateTimeFieldType.era(), text);
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public int getEraMaxTextLength() {try{__CLR4_4_189v89vlc8azsy4.R.inc(10832);
        __CLR4_4_189v89vlc8azsy4.R.inc(10833);return iMaxEraLength;
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public String monthOfYearValueToText(int value) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10834);
        __CLR4_4_189v89vlc8azsy4.R.inc(10835);return iMonths[value];
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public String monthOfYearValueToShortText(int value) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10836);
        __CLR4_4_189v89vlc8azsy4.R.inc(10837);return iShortMonths[value];
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public int monthOfYearTextToValue(String text) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10838);
        __CLR4_4_189v89vlc8azsy4.R.inc(10839);Integer month = iParseMonths.get(text);
        __CLR4_4_189v89vlc8azsy4.R.inc(10840);if ((((month != null)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10841)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10842)==0&false))) {{
            __CLR4_4_189v89vlc8azsy4.R.inc(10843);return month.intValue();
        }
        }__CLR4_4_189v89vlc8azsy4.R.inc(10844);throw new IllegalFieldValueException(DateTimeFieldType.monthOfYear(), text);
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public int getMonthMaxTextLength() {try{__CLR4_4_189v89vlc8azsy4.R.inc(10845);
        __CLR4_4_189v89vlc8azsy4.R.inc(10846);return iMaxMonthLength;
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public int getMonthMaxShortTextLength() {try{__CLR4_4_189v89vlc8azsy4.R.inc(10847);
        __CLR4_4_189v89vlc8azsy4.R.inc(10848);return iMaxShortMonthLength;
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public String dayOfWeekValueToText(int value) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10849);
        __CLR4_4_189v89vlc8azsy4.R.inc(10850);return iDaysOfWeek[value];
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public String dayOfWeekValueToShortText(int value) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10851);
        __CLR4_4_189v89vlc8azsy4.R.inc(10852);return iShortDaysOfWeek[value];
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public int dayOfWeekTextToValue(String text) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10853);
        __CLR4_4_189v89vlc8azsy4.R.inc(10854);Integer day = iParseDaysOfWeek.get(text);
        __CLR4_4_189v89vlc8azsy4.R.inc(10855);if ((((day != null)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10856)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10857)==0&false))) {{
            __CLR4_4_189v89vlc8azsy4.R.inc(10858);return day.intValue();
        }
        }__CLR4_4_189v89vlc8azsy4.R.inc(10859);throw new IllegalFieldValueException(DateTimeFieldType.dayOfWeek(), text);
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public int getDayOfWeekMaxTextLength() {try{__CLR4_4_189v89vlc8azsy4.R.inc(10860);
        __CLR4_4_189v89vlc8azsy4.R.inc(10861);return iMaxDayOfWeekLength;
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public int getDayOfWeekMaxShortTextLength() {try{__CLR4_4_189v89vlc8azsy4.R.inc(10862);
        __CLR4_4_189v89vlc8azsy4.R.inc(10863);return iMaxShortDayOfWeekLength;
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public String halfdayValueToText(int value) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10864);
        __CLR4_4_189v89vlc8azsy4.R.inc(10865);return iHalfday[value];
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public int halfdayTextToValue(String text) {try{__CLR4_4_189v89vlc8azsy4.R.inc(10866);
        __CLR4_4_189v89vlc8azsy4.R.inc(10867);String[] halfday = iHalfday;
        __CLR4_4_189v89vlc8azsy4.R.inc(10868);for (int i = halfday.length; (((--i>=0)&&(__CLR4_4_189v89vlc8azsy4.R.iget(10869)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10870)==0&false)); ) {{
            __CLR4_4_189v89vlc8azsy4.R.inc(10871);if ((((halfday[i].equalsIgnoreCase(text))&&(__CLR4_4_189v89vlc8azsy4.R.iget(10872)!=0|true))||(__CLR4_4_189v89vlc8azsy4.R.iget(10873)==0&false))) {{
                __CLR4_4_189v89vlc8azsy4.R.inc(10874);return i;
            }
        }}
        }__CLR4_4_189v89vlc8azsy4.R.inc(10875);throw new IllegalFieldValueException(DateTimeFieldType.halfdayOfDay(), text);
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}

    public int getHalfdayMaxTextLength() {try{__CLR4_4_189v89vlc8azsy4.R.inc(10876);
        __CLR4_4_189v89vlc8azsy4.R.inc(10877);return iMaxHalfdayLength;
    }finally{__CLR4_4_189v89vlc8azsy4.R.flushNeeded();}}
}
