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
package org.joda.time.tz;

import java.text.DateFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.joda.time.DateTimeUtils;

/**
 * The default name provider acquires localized names from
 * {@link DateFormatSymbols java.text.DateFormatSymbols}.
 * <p>
 * DefaultNameProvider is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
@SuppressWarnings("unchecked")
public class DefaultNameProvider implements NameProvider {public static class __CLR4_4_1g0bg0blc8azts4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,20801,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // locale -> (id -> (nameKey -> [shortName, name]))
    private HashMap<Locale, Map<String, Map<String, Object>>> iByLocaleCache = createCache();

    public DefaultNameProvider() {try{__CLR4_4_1g0bg0blc8azts4.R.inc(20747);
    }finally{__CLR4_4_1g0bg0blc8azts4.R.flushNeeded();}}

    public String getShortName(Locale locale, String id, String nameKey) {try{__CLR4_4_1g0bg0blc8azts4.R.inc(20748);
        __CLR4_4_1g0bg0blc8azts4.R.inc(20749);String[] nameSet = getNameSet(locale, id, nameKey);
        __CLR4_4_1g0bg0blc8azts4.R.inc(20750);return (((nameSet == null )&&(__CLR4_4_1g0bg0blc8azts4.R.iget(20751)!=0|true))||(__CLR4_4_1g0bg0blc8azts4.R.iget(20752)==0&false))? null : nameSet[0];
    }finally{__CLR4_4_1g0bg0blc8azts4.R.flushNeeded();}}
    
    public String getName(Locale locale, String id, String nameKey) {try{__CLR4_4_1g0bg0blc8azts4.R.inc(20753);
        __CLR4_4_1g0bg0blc8azts4.R.inc(20754);String[] nameSet = getNameSet(locale, id, nameKey);
        __CLR4_4_1g0bg0blc8azts4.R.inc(20755);return (((nameSet == null )&&(__CLR4_4_1g0bg0blc8azts4.R.iget(20756)!=0|true))||(__CLR4_4_1g0bg0blc8azts4.R.iget(20757)==0&false))? null : nameSet[1];
    }finally{__CLR4_4_1g0bg0blc8azts4.R.flushNeeded();}}

    private synchronized String[] getNameSet(Locale locale, String id, String nameKey) {try{__CLR4_4_1g0bg0blc8azts4.R.inc(20758);
        __CLR4_4_1g0bg0blc8azts4.R.inc(20759);if ((((locale == null || id == null || nameKey == null)&&(__CLR4_4_1g0bg0blc8azts4.R.iget(20760)!=0|true))||(__CLR4_4_1g0bg0blc8azts4.R.iget(20761)==0&false))) {{
            __CLR4_4_1g0bg0blc8azts4.R.inc(20762);return null;
        }

        }__CLR4_4_1g0bg0blc8azts4.R.inc(20763);Map<String, Map<String, Object>> byIdCache = iByLocaleCache.get(locale);
        __CLR4_4_1g0bg0blc8azts4.R.inc(20764);if ((((byIdCache == null)&&(__CLR4_4_1g0bg0blc8azts4.R.iget(20765)!=0|true))||(__CLR4_4_1g0bg0blc8azts4.R.iget(20766)==0&false))) {{
            __CLR4_4_1g0bg0blc8azts4.R.inc(20767);iByLocaleCache.put(locale, byIdCache = createCache());
        }

        }__CLR4_4_1g0bg0blc8azts4.R.inc(20768);Map<String, Object> byNameKeyCache = byIdCache.get(id);
        __CLR4_4_1g0bg0blc8azts4.R.inc(20769);if ((((byNameKeyCache == null)&&(__CLR4_4_1g0bg0blc8azts4.R.iget(20770)!=0|true))||(__CLR4_4_1g0bg0blc8azts4.R.iget(20771)==0&false))) {{
            __CLR4_4_1g0bg0blc8azts4.R.inc(20772);byIdCache.put(id, byNameKeyCache = createCache());
            
            __CLR4_4_1g0bg0blc8azts4.R.inc(20773);String[][] zoneStringsEn = DateTimeUtils.getDateFormatSymbols(Locale.ENGLISH).getZoneStrings();
            __CLR4_4_1g0bg0blc8azts4.R.inc(20774);String[] setEn = null;
            __CLR4_4_1g0bg0blc8azts4.R.inc(20775);for (String[] strings : zoneStringsEn) {{
              __CLR4_4_1g0bg0blc8azts4.R.inc(20776);if ((((strings != null && strings.length == 5 && id.equals(strings[0]))&&(__CLR4_4_1g0bg0blc8azts4.R.iget(20777)!=0|true))||(__CLR4_4_1g0bg0blc8azts4.R.iget(20778)==0&false))) {{
                __CLR4_4_1g0bg0blc8azts4.R.inc(20779);setEn = strings;
                __CLR4_4_1g0bg0blc8azts4.R.inc(20780);break;
              }
            }}
            }__CLR4_4_1g0bg0blc8azts4.R.inc(20781);String[][] zoneStringsLoc = DateTimeUtils.getDateFormatSymbols(locale).getZoneStrings();
            __CLR4_4_1g0bg0blc8azts4.R.inc(20782);String[] setLoc = null;
            __CLR4_4_1g0bg0blc8azts4.R.inc(20783);for (String[] strings : zoneStringsLoc) {{
              __CLR4_4_1g0bg0blc8azts4.R.inc(20784);if ((((strings != null && strings.length == 5 && id.equals(strings[0]))&&(__CLR4_4_1g0bg0blc8azts4.R.iget(20785)!=0|true))||(__CLR4_4_1g0bg0blc8azts4.R.iget(20786)==0&false))) {{
                __CLR4_4_1g0bg0blc8azts4.R.inc(20787);setLoc = strings;
                __CLR4_4_1g0bg0blc8azts4.R.inc(20788);break;
              }
            }}
            
            }__CLR4_4_1g0bg0blc8azts4.R.inc(20789);if ((((setEn != null && setLoc != null)&&(__CLR4_4_1g0bg0blc8azts4.R.iget(20790)!=0|true))||(__CLR4_4_1g0bg0blc8azts4.R.iget(20791)==0&false))) {{
              __CLR4_4_1g0bg0blc8azts4.R.inc(20792);byNameKeyCache.put(setEn[2], new String[] {setLoc[2], setLoc[1]});
              // need to handle case where summer and winter have the same
              // abbreviation, such as EST in Australia [1716305]
              // we handle this by appending "-Summer", cf ZoneInfoCompiler
              __CLR4_4_1g0bg0blc8azts4.R.inc(20793);if ((((setEn[2].equals(setEn[4]))&&(__CLR4_4_1g0bg0blc8azts4.R.iget(20794)!=0|true))||(__CLR4_4_1g0bg0blc8azts4.R.iget(20795)==0&false))) {{
                  __CLR4_4_1g0bg0blc8azts4.R.inc(20796);byNameKeyCache.put(setEn[4] + "-Summer", new String[] {setLoc[4], setLoc[3]});
              } }else {{
                  __CLR4_4_1g0bg0blc8azts4.R.inc(20797);byNameKeyCache.put(setEn[4], new String[] {setLoc[4], setLoc[3]});
              }
            }}
        }}
        }__CLR4_4_1g0bg0blc8azts4.R.inc(20798);return (String[]) byNameKeyCache.get(nameKey);
    }finally{__CLR4_4_1g0bg0blc8azts4.R.flushNeeded();}}

    private HashMap createCache() {try{__CLR4_4_1g0bg0blc8azts4.R.inc(20799);
        __CLR4_4_1g0bg0blc8azts4.R.inc(20800);return new HashMap(7);
    }finally{__CLR4_4_1g0bg0blc8azts4.R.flushNeeded();}}
}
