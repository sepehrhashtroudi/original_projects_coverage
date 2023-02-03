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
package org.joda.time.tz;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Compiles IANA ZoneInfo database files into binary files for each time zone
 * in the database. {@link DateTimeZoneBuilder} is used to construct and encode
 * compiled data files. {@link ZoneInfoProvider} loads the encoded files and
 * converts them back into {@link DateTimeZone} objects.
 * <p>
 * Although this tool is similar to zic, the binary formats are not
 * compatible. The latest IANA time zone database files may be obtained
 * <a href="http://www.iana.org/time-zones">here</a>.
 * <p>
 * ZoneInfoCompiler is mutable and not thread-safe, although the main method
 * may be safely invoked by multiple threads.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ZoneInfoCompiler {public static class __CLR4_4_1g36g36lc8azttl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,21413,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static DateTimeOfYear cStartOfYear;

    static Chronology cLenientISO;

    static ThreadLocal<Boolean> cVerbose = new ThreadLocal<Boolean>() {
        protected Boolean initialValue() {try{__CLR4_4_1g36g36lc8azttl.R.inc(20850);
            __CLR4_4_1g36g36lc8azttl.R.inc(20851);return Boolean.FALSE;
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}
    };

    /**
     * Gets a flag indicating that verbose logging is required.
     * @return true to log verbosely
     */
    public static boolean verbose() {try{__CLR4_4_1g36g36lc8azttl.R.inc(20852);
        __CLR4_4_1g36g36lc8azttl.R.inc(20853);return cVerbose.get();
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Launches the ZoneInfoCompiler tool.
     *
     * <pre>
     * Usage: java org.joda.time.tz.ZoneInfoCompiler &lt;options&gt; &lt;source files&gt;
     * where possible options include:
     *   -src &lt;directory&gt;    Specify where to read source files
     *   -dst &lt;directory&gt;    Specify where to write generated files
     *   -verbose            Output verbosely (default false)
     * </pre>
     */
    public static void main(String[] args) throws Exception {try{__CLR4_4_1g36g36lc8azttl.R.inc(20854);
        __CLR4_4_1g36g36lc8azttl.R.inc(20855);if ((((args.length == 0)&&(__CLR4_4_1g36g36lc8azttl.R.iget(20856)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20857)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20858);printUsage();
            __CLR4_4_1g36g36lc8azttl.R.inc(20859);return;
        }

        }__CLR4_4_1g36g36lc8azttl.R.inc(20860);File inputDir = null;
        __CLR4_4_1g36g36lc8azttl.R.inc(20861);File outputDir = null;
        __CLR4_4_1g36g36lc8azttl.R.inc(20862);boolean verbose = false;

        __CLR4_4_1g36g36lc8azttl.R.inc(20863);int i;
        __CLR4_4_1g36g36lc8azttl.R.inc(20864);for (i=0; (((i<args.length)&&(__CLR4_4_1g36g36lc8azttl.R.iget(20865)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20866)==0&false)); i++) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20867);try {
                __CLR4_4_1g36g36lc8azttl.R.inc(20868);if (((("-src".equals(args[i]))&&(__CLR4_4_1g36g36lc8azttl.R.iget(20869)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20870)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(20871);inputDir = new File(args[++i]);
                } }else {__CLR4_4_1g36g36lc8azttl.R.inc(20872);if (((("-dst".equals(args[i]))&&(__CLR4_4_1g36g36lc8azttl.R.iget(20873)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20874)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(20875);outputDir = new File(args[++i]);
                } }else {__CLR4_4_1g36g36lc8azttl.R.inc(20876);if (((("-verbose".equals(args[i]))&&(__CLR4_4_1g36g36lc8azttl.R.iget(20877)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20878)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(20879);verbose = true;
                } }else {__CLR4_4_1g36g36lc8azttl.R.inc(20880);if (((("-?".equals(args[i]))&&(__CLR4_4_1g36g36lc8azttl.R.iget(20881)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20882)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(20883);printUsage();
                    __CLR4_4_1g36g36lc8azttl.R.inc(20884);return;
                } }else {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(20885);break;
                }
            }}}}} catch (IndexOutOfBoundsException e) {
                __CLR4_4_1g36g36lc8azttl.R.inc(20886);printUsage();
                __CLR4_4_1g36g36lc8azttl.R.inc(20887);return;
            }
        }

        }__CLR4_4_1g36g36lc8azttl.R.inc(20888);if ((((i >= args.length)&&(__CLR4_4_1g36g36lc8azttl.R.iget(20889)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20890)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20891);printUsage();
            __CLR4_4_1g36g36lc8azttl.R.inc(20892);return;
        }

        }__CLR4_4_1g36g36lc8azttl.R.inc(20893);File[] sources = new File[args.length - i];
        __CLR4_4_1g36g36lc8azttl.R.inc(20894);for (int j=0; (((i<args.length)&&(__CLR4_4_1g36g36lc8azttl.R.iget(20895)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20896)==0&false)); i++,j++) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20897);sources[j] = (((inputDir == null )&&(__CLR4_4_1g36g36lc8azttl.R.iget(20898)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20899)==0&false))? new File(args[i]) : new File(inputDir, args[i]);
        }

        }__CLR4_4_1g36g36lc8azttl.R.inc(20900);cVerbose.set(verbose);
        __CLR4_4_1g36g36lc8azttl.R.inc(20901);ZoneInfoCompiler zic = new ZoneInfoCompiler();
        __CLR4_4_1g36g36lc8azttl.R.inc(20902);zic.compile(outputDir, sources);
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    private static void printUsage() {try{__CLR4_4_1g36g36lc8azttl.R.inc(20903);
        __CLR4_4_1g36g36lc8azttl.R.inc(20904);System.out.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
        __CLR4_4_1g36g36lc8azttl.R.inc(20905);System.out.println("where possible options include:");
        __CLR4_4_1g36g36lc8azttl.R.inc(20906);System.out.println("  -src <directory>    Specify where to read source files");
        __CLR4_4_1g36g36lc8azttl.R.inc(20907);System.out.println("  -dst <directory>    Specify where to write generated files");
        __CLR4_4_1g36g36lc8azttl.R.inc(20908);System.out.println("  -verbose            Output verbosely (default false)");
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    static DateTimeOfYear getStartOfYear() {try{__CLR4_4_1g36g36lc8azttl.R.inc(20909);
        __CLR4_4_1g36g36lc8azttl.R.inc(20910);if ((((cStartOfYear == null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(20911)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20912)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20913);cStartOfYear = new DateTimeOfYear();
        }
        }__CLR4_4_1g36g36lc8azttl.R.inc(20914);return cStartOfYear;
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    static Chronology getLenientISOChronology() {try{__CLR4_4_1g36g36lc8azttl.R.inc(20915);
        __CLR4_4_1g36g36lc8azttl.R.inc(20916);if ((((cLenientISO == null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(20917)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20918)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20919);cLenientISO = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        }
        }__CLR4_4_1g36g36lc8azttl.R.inc(20920);return cLenientISO;
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    /**
     * @param zimap maps string ids to DateTimeZone objects.
     */
    static void writeZoneInfoMap(DataOutputStream dout, Map<String, DateTimeZone> zimap) throws IOException {try{__CLR4_4_1g36g36lc8azttl.R.inc(20921);
        // Build the string pool.
        __CLR4_4_1g36g36lc8azttl.R.inc(20922);Map<String, Short> idToIndex = new HashMap<String, Short>(zimap.size());
        __CLR4_4_1g36g36lc8azttl.R.inc(20923);TreeMap<Short, String> indexToId = new TreeMap<Short, String>();

        __CLR4_4_1g36g36lc8azttl.R.inc(20924);short count = 0;
        __CLR4_4_1g36g36lc8azttl.R.inc(20925);for (Entry<String, DateTimeZone> entry : zimap.entrySet()) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20926);String id = (String)entry.getKey();
            __CLR4_4_1g36g36lc8azttl.R.inc(20927);if ((((!idToIndex.containsKey(id))&&(__CLR4_4_1g36g36lc8azttl.R.iget(20928)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20929)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(20930);Short index = Short.valueOf(count);
                __CLR4_4_1g36g36lc8azttl.R.inc(20931);idToIndex.put(id, index);
                __CLR4_4_1g36g36lc8azttl.R.inc(20932);indexToId.put(index, id);
                __CLR4_4_1g36g36lc8azttl.R.inc(20933);if ((((++count == 0)&&(__CLR4_4_1g36g36lc8azttl.R.iget(20934)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20935)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(20936);throw new InternalError("Too many time zone ids");
                }
            }}
            }__CLR4_4_1g36g36lc8azttl.R.inc(20937);id = ((DateTimeZone)entry.getValue()).getID();
            __CLR4_4_1g36g36lc8azttl.R.inc(20938);if ((((!idToIndex.containsKey(id))&&(__CLR4_4_1g36g36lc8azttl.R.iget(20939)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20940)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(20941);Short index = Short.valueOf(count);
                __CLR4_4_1g36g36lc8azttl.R.inc(20942);idToIndex.put(id, index);
                __CLR4_4_1g36g36lc8azttl.R.inc(20943);indexToId.put(index, id);
                __CLR4_4_1g36g36lc8azttl.R.inc(20944);if ((((++count == 0)&&(__CLR4_4_1g36g36lc8azttl.R.iget(20945)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20946)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(20947);throw new InternalError("Too many time zone ids");
                }
            }}
        }}

        // Write the string pool, ordered by index.
        }__CLR4_4_1g36g36lc8azttl.R.inc(20948);dout.writeShort(indexToId.size());
        __CLR4_4_1g36g36lc8azttl.R.inc(20949);for (String id : indexToId.values()) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20950);dout.writeUTF(id);
        }

        // Write the mappings.
        }__CLR4_4_1g36g36lc8azttl.R.inc(20951);dout.writeShort(zimap.size());
        __CLR4_4_1g36g36lc8azttl.R.inc(20952);for (Entry<String, DateTimeZone> entry : zimap.entrySet()) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20953);String id = entry.getKey();
            __CLR4_4_1g36g36lc8azttl.R.inc(20954);dout.writeShort(idToIndex.get(id).shortValue());
            __CLR4_4_1g36g36lc8azttl.R.inc(20955);id = entry.getValue().getID();
            __CLR4_4_1g36g36lc8azttl.R.inc(20956);dout.writeShort(idToIndex.get(id).shortValue());
        }
    }}finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    static int parseYear(String str, int def) {try{__CLR4_4_1g36g36lc8azttl.R.inc(20957);
        __CLR4_4_1g36g36lc8azttl.R.inc(20958);str = str.toLowerCase();
        __CLR4_4_1g36g36lc8azttl.R.inc(20959);if ((((str.equals("minimum") || str.equals("min"))&&(__CLR4_4_1g36g36lc8azttl.R.iget(20960)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20961)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20962);return Integer.MIN_VALUE;
        } }else {__CLR4_4_1g36g36lc8azttl.R.inc(20963);if ((((str.equals("maximum") || str.equals("max"))&&(__CLR4_4_1g36g36lc8azttl.R.iget(20964)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20965)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20966);return Integer.MAX_VALUE;
        } }else {__CLR4_4_1g36g36lc8azttl.R.inc(20967);if ((((str.equals("only"))&&(__CLR4_4_1g36g36lc8azttl.R.iget(20968)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20969)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20970);return def;
        }
        }}}__CLR4_4_1g36g36lc8azttl.R.inc(20971);return Integer.parseInt(str);
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    static int parseMonth(String str) {try{__CLR4_4_1g36g36lc8azttl.R.inc(20972);
        __CLR4_4_1g36g36lc8azttl.R.inc(20973);DateTimeField field = ISOChronology.getInstanceUTC().monthOfYear();
        __CLR4_4_1g36g36lc8azttl.R.inc(20974);return field.get(field.set(0, str, Locale.ENGLISH));
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    static int parseDayOfWeek(String str) {try{__CLR4_4_1g36g36lc8azttl.R.inc(20975);
        __CLR4_4_1g36g36lc8azttl.R.inc(20976);DateTimeField field = ISOChronology.getInstanceUTC().dayOfWeek();
        __CLR4_4_1g36g36lc8azttl.R.inc(20977);return field.get(field.set(0, str, Locale.ENGLISH));
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}
    
    static String parseOptional(String str) {try{__CLR4_4_1g36g36lc8azttl.R.inc(20978);
        __CLR4_4_1g36g36lc8azttl.R.inc(20979);return ((((str.equals("-")) )&&(__CLR4_4_1g36g36lc8azttl.R.iget(20980)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20981)==0&false))? null : str;
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    static int parseTime(String str) {try{__CLR4_4_1g36g36lc8azttl.R.inc(20982);
        __CLR4_4_1g36g36lc8azttl.R.inc(20983);DateTimeFormatter p = ISODateTimeFormat.hourMinuteSecondFraction();
        __CLR4_4_1g36g36lc8azttl.R.inc(20984);MutableDateTime mdt = new MutableDateTime(0, getLenientISOChronology());
        __CLR4_4_1g36g36lc8azttl.R.inc(20985);int pos = 0;
        __CLR4_4_1g36g36lc8azttl.R.inc(20986);if ((((str.startsWith("-"))&&(__CLR4_4_1g36g36lc8azttl.R.iget(20987)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20988)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20989);pos = 1;
        }
        }__CLR4_4_1g36g36lc8azttl.R.inc(20990);int newPos = p.parseInto(mdt, str, pos);
        __CLR4_4_1g36g36lc8azttl.R.inc(20991);if ((((newPos == ~pos)&&(__CLR4_4_1g36g36lc8azttl.R.iget(20992)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20993)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20994);throw new IllegalArgumentException(str);
        }
        }__CLR4_4_1g36g36lc8azttl.R.inc(20995);int millis = (int)mdt.getMillis();
        __CLR4_4_1g36g36lc8azttl.R.inc(20996);if ((((pos == 1)&&(__CLR4_4_1g36g36lc8azttl.R.iget(20997)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(20998)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(20999);millis = -millis;
        }
        }__CLR4_4_1g36g36lc8azttl.R.inc(21000);return millis;
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    static char parseZoneChar(char c) {try{__CLR4_4_1g36g36lc8azttl.R.inc(21001);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1g36g36lc8azttl.R.inc(21002);switch (c) {
        case 's':if (!__CLB4_4_1_bool0) {__CLR4_4_1g36g36lc8azttl.R.inc(21003);__CLB4_4_1_bool0=true;} case 'S':if (!__CLB4_4_1_bool0) {__CLR4_4_1g36g36lc8azttl.R.inc(21004);__CLB4_4_1_bool0=true;}
            // Standard time
            __CLR4_4_1g36g36lc8azttl.R.inc(21005);return 's';
        case 'u':if (!__CLB4_4_1_bool0) {__CLR4_4_1g36g36lc8azttl.R.inc(21006);__CLB4_4_1_bool0=true;} case 'U':if (!__CLB4_4_1_bool0) {__CLR4_4_1g36g36lc8azttl.R.inc(21007);__CLB4_4_1_bool0=true;} case 'g':if (!__CLB4_4_1_bool0) {__CLR4_4_1g36g36lc8azttl.R.inc(21008);__CLB4_4_1_bool0=true;} case 'G':if (!__CLB4_4_1_bool0) {__CLR4_4_1g36g36lc8azttl.R.inc(21009);__CLB4_4_1_bool0=true;} case 'z':if (!__CLB4_4_1_bool0) {__CLR4_4_1g36g36lc8azttl.R.inc(21010);__CLB4_4_1_bool0=true;} case 'Z':if (!__CLB4_4_1_bool0) {__CLR4_4_1g36g36lc8azttl.R.inc(21011);__CLB4_4_1_bool0=true;}
            // UTC
            __CLR4_4_1g36g36lc8azttl.R.inc(21012);return 'u';
        case 'w':if (!__CLB4_4_1_bool0) {__CLR4_4_1g36g36lc8azttl.R.inc(21013);__CLB4_4_1_bool0=true;} case 'W':if (!__CLB4_4_1_bool0) {__CLR4_4_1g36g36lc8azttl.R.inc(21014);__CLB4_4_1_bool0=true;} default:if (!__CLB4_4_1_bool0) {__CLR4_4_1g36g36lc8azttl.R.inc(21015);__CLB4_4_1_bool0=true;}
            // Wall time
            __CLR4_4_1g36g36lc8azttl.R.inc(21016);return 'w';
        }
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    /**
     * @return false if error.
     */
    static boolean test(String id, DateTimeZone tz) {try{__CLR4_4_1g36g36lc8azttl.R.inc(21017);
        __CLR4_4_1g36g36lc8azttl.R.inc(21018);if ((((!id.equals(tz.getID()))&&(__CLR4_4_1g36g36lc8azttl.R.iget(21019)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21020)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(21021);return true;
        }

        // Test to ensure that reported transitions are not duplicated.

        }__CLR4_4_1g36g36lc8azttl.R.inc(21022);long millis = ISOChronology.getInstanceUTC().year().set(0, 1850);
        __CLR4_4_1g36g36lc8azttl.R.inc(21023);long end = ISOChronology.getInstanceUTC().year().set(0, 2050);

        __CLR4_4_1g36g36lc8azttl.R.inc(21024);int offset = tz.getOffset(millis);
        __CLR4_4_1g36g36lc8azttl.R.inc(21025);String key = tz.getNameKey(millis);

        __CLR4_4_1g36g36lc8azttl.R.inc(21026);List<Long> transitions = new ArrayList<Long>();

        __CLR4_4_1g36g36lc8azttl.R.inc(21027);while (true) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(21028);long next = tz.nextTransition(millis);
            __CLR4_4_1g36g36lc8azttl.R.inc(21029);if ((((next == millis || next > end)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21030)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21031)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21032);break;
            }

            }__CLR4_4_1g36g36lc8azttl.R.inc(21033);millis = next;

            __CLR4_4_1g36g36lc8azttl.R.inc(21034);int nextOffset = tz.getOffset(millis);
            __CLR4_4_1g36g36lc8azttl.R.inc(21035);String nextKey = tz.getNameKey(millis);

            __CLR4_4_1g36g36lc8azttl.R.inc(21036);if ((((offset == nextOffset
                && key.equals(nextKey))&&(__CLR4_4_1g36g36lc8azttl.R.iget(21037)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21038)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21039);System.out.println("*d* Error in " + tz.getID() + " "
                                   + new DateTime(millis,
                                                  ISOChronology.getInstanceUTC()));
                __CLR4_4_1g36g36lc8azttl.R.inc(21040);return false;
            }

            }__CLR4_4_1g36g36lc8azttl.R.inc(21041);if ((((nextKey == null || (nextKey.length() < 3 && !"??".equals(nextKey)))&&(__CLR4_4_1g36g36lc8azttl.R.iget(21042)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21043)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21044);System.out.println("*s* Error in " + tz.getID() + " "
                                   + new DateTime(millis,
                                                  ISOChronology.getInstanceUTC())
                                   + ", nameKey=" + nextKey);
                __CLR4_4_1g36g36lc8azttl.R.inc(21045);return false;
            }

            }__CLR4_4_1g36g36lc8azttl.R.inc(21046);transitions.add(Long.valueOf(millis));

            __CLR4_4_1g36g36lc8azttl.R.inc(21047);offset = nextOffset;
            __CLR4_4_1g36g36lc8azttl.R.inc(21048);key = nextKey;
        }

        // Now verify that reverse transitions match up.

        }__CLR4_4_1g36g36lc8azttl.R.inc(21049);millis = ISOChronology.getInstanceUTC().year().set(0, 2050);
        __CLR4_4_1g36g36lc8azttl.R.inc(21050);end = ISOChronology.getInstanceUTC().year().set(0, 1850);

        __CLR4_4_1g36g36lc8azttl.R.inc(21051);for (int i=transitions.size(); (((--i>= 0)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21052)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21053)==0&false)); ) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(21054);long prev = tz.previousTransition(millis);
            __CLR4_4_1g36g36lc8azttl.R.inc(21055);if ((((prev == millis || prev < end)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21056)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21057)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21058);break;
            }

            }__CLR4_4_1g36g36lc8azttl.R.inc(21059);millis = prev;

            __CLR4_4_1g36g36lc8azttl.R.inc(21060);long trans = transitions.get(i).longValue();
            
            __CLR4_4_1g36g36lc8azttl.R.inc(21061);if ((((trans - 1 != millis)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21062)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21063)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21064);System.out.println("*r* Error in " + tz.getID() + " "
                                   + new DateTime(millis,
                                                  ISOChronology.getInstanceUTC()) + " != "
                                   + new DateTime(trans - 1,
                                                  ISOChronology.getInstanceUTC()));
                                   
                __CLR4_4_1g36g36lc8azttl.R.inc(21065);return false;
            }
        }}

        }__CLR4_4_1g36g36lc8azttl.R.inc(21066);return true;
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    // Maps names to RuleSets.
    private Map<String, RuleSet> iRuleSets;

    // List of Zone objects.
    private List<Zone> iZones;

    // List String pairs to link.
    private List<String> iLinks;

    public ZoneInfoCompiler() {try{__CLR4_4_1g36g36lc8azttl.R.inc(21067);
        __CLR4_4_1g36g36lc8azttl.R.inc(21068);iRuleSets = new HashMap<String, RuleSet>();
        __CLR4_4_1g36g36lc8azttl.R.inc(21069);iZones = new ArrayList<Zone>();
        __CLR4_4_1g36g36lc8azttl.R.inc(21070);iLinks = new ArrayList<String>();
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    /**
     * Returns a map of ids to DateTimeZones.
     *
     * @param outputDir optional directory to write compiled data files to
     * @param sources optional list of source files to parse
     */
    public Map<String, DateTimeZone> compile(File outputDir, File[] sources) throws IOException {try{__CLR4_4_1g36g36lc8azttl.R.inc(21071);
        __CLR4_4_1g36g36lc8azttl.R.inc(21072);if ((((sources != null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21073)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21074)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(21075);for (int i=0; (((i<sources.length)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21076)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21077)==0&false)); i++) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21078);BufferedReader in = new BufferedReader(new FileReader(sources[i]));
                __CLR4_4_1g36g36lc8azttl.R.inc(21079);parseDataFile(in);
                __CLR4_4_1g36g36lc8azttl.R.inc(21080);in.close();
            }
        }}

        }__CLR4_4_1g36g36lc8azttl.R.inc(21081);if ((((outputDir != null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21082)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21083)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(21084);if ((((!outputDir.exists())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21085)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21086)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21087);if ((((!outputDir.mkdirs())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21088)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21089)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21090);throw new IOException("Destination directory doesn't exist and cannot be created: " + outputDir);
                }
            }}
            }__CLR4_4_1g36g36lc8azttl.R.inc(21091);if ((((!outputDir.isDirectory())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21092)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21093)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21094);throw new IOException("Destination is not a directory: " + outputDir);
            }
        }}

        }__CLR4_4_1g36g36lc8azttl.R.inc(21095);Map<String, DateTimeZone> map = new TreeMap<String, DateTimeZone>();

        __CLR4_4_1g36g36lc8azttl.R.inc(21096);System.out.println("Writing zoneinfo files");
        __CLR4_4_1g36g36lc8azttl.R.inc(21097);for (int i=0; (((i<iZones.size())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21098)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21099)==0&false)); i++) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(21100);Zone zone = iZones.get(i);
            __CLR4_4_1g36g36lc8azttl.R.inc(21101);DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
            __CLR4_4_1g36g36lc8azttl.R.inc(21102);zone.addToBuilder(builder, iRuleSets);
            __CLR4_4_1g36g36lc8azttl.R.inc(21103);final DateTimeZone original = builder.toDateTimeZone(zone.iName, true);
            __CLR4_4_1g36g36lc8azttl.R.inc(21104);DateTimeZone tz = original;
            __CLR4_4_1g36g36lc8azttl.R.inc(21105);if ((((test(tz.getID(), tz))&&(__CLR4_4_1g36g36lc8azttl.R.iget(21106)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21107)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21108);map.put(tz.getID(), tz);
                __CLR4_4_1g36g36lc8azttl.R.inc(21109);if ((((outputDir != null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21110)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21111)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21112);if ((((ZoneInfoCompiler.verbose())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21113)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21114)==0&false))) {{
                        __CLR4_4_1g36g36lc8azttl.R.inc(21115);System.out.println("Writing " + tz.getID());
                    }
                    }__CLR4_4_1g36g36lc8azttl.R.inc(21116);File file = new File(outputDir, tz.getID());
                    __CLR4_4_1g36g36lc8azttl.R.inc(21117);if ((((!file.getParentFile().exists())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21118)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21119)==0&false))) {{
                        __CLR4_4_1g36g36lc8azttl.R.inc(21120);file.getParentFile().mkdirs();
                    }
                    }__CLR4_4_1g36g36lc8azttl.R.inc(21121);OutputStream out = new FileOutputStream(file);
                    __CLR4_4_1g36g36lc8azttl.R.inc(21122);try {
                        __CLR4_4_1g36g36lc8azttl.R.inc(21123);builder.writeTo(zone.iName, out);
                    } finally {
                        __CLR4_4_1g36g36lc8azttl.R.inc(21124);out.close();
                    }

                    // Test if it can be read back.
                    __CLR4_4_1g36g36lc8azttl.R.inc(21125);InputStream in = new FileInputStream(file);
                    __CLR4_4_1g36g36lc8azttl.R.inc(21126);DateTimeZone tz2 = DateTimeZoneBuilder.readFrom(in, tz.getID());
                    __CLR4_4_1g36g36lc8azttl.R.inc(21127);in.close();

                    __CLR4_4_1g36g36lc8azttl.R.inc(21128);if ((((!original.equals(tz2))&&(__CLR4_4_1g36g36lc8azttl.R.iget(21129)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21130)==0&false))) {{
                        __CLR4_4_1g36g36lc8azttl.R.inc(21131);System.out.println("*e* Error in " + tz.getID() +
                                           ": Didn't read properly from file");
                    }
                }}
            }}
        }}

        }__CLR4_4_1g36g36lc8azttl.R.inc(21132);for (int pass=0; (((pass<2)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21133)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21134)==0&false)); pass++) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(21135);for (int i=0; (((i<iLinks.size())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21136)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21137)==0&false)); i += 2) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21138);String id = iLinks.get(i);
                __CLR4_4_1g36g36lc8azttl.R.inc(21139);String alias = iLinks.get(i + 1);
                __CLR4_4_1g36g36lc8azttl.R.inc(21140);DateTimeZone tz = map.get(id);
                __CLR4_4_1g36g36lc8azttl.R.inc(21141);if ((((tz == null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21142)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21143)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21144);if ((((pass > 0)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21145)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21146)==0&false))) {{
                        __CLR4_4_1g36g36lc8azttl.R.inc(21147);System.out.println("Cannot find time zone '" + id +
                                           "' to link alias '" + alias + "' to");
                    }
                }} }else {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21148);map.put(alias, tz);
                }
            }}
        }}

        }__CLR4_4_1g36g36lc8azttl.R.inc(21149);if ((((outputDir != null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21150)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21151)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(21152);System.out.println("Writing ZoneInfoMap");
            __CLR4_4_1g36g36lc8azttl.R.inc(21153);File file = new File(outputDir, "ZoneInfoMap");
            __CLR4_4_1g36g36lc8azttl.R.inc(21154);if ((((!file.getParentFile().exists())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21155)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21156)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21157);file.getParentFile().mkdirs();
            }

            }__CLR4_4_1g36g36lc8azttl.R.inc(21158);OutputStream out = new FileOutputStream(file);
            __CLR4_4_1g36g36lc8azttl.R.inc(21159);DataOutputStream dout = new DataOutputStream(out);
            __CLR4_4_1g36g36lc8azttl.R.inc(21160);try {
                // Sort and filter out any duplicates that match case.
                __CLR4_4_1g36g36lc8azttl.R.inc(21161);Map<String, DateTimeZone> zimap = new TreeMap<String, DateTimeZone>(String.CASE_INSENSITIVE_ORDER);
                __CLR4_4_1g36g36lc8azttl.R.inc(21162);zimap.putAll(map);
                __CLR4_4_1g36g36lc8azttl.R.inc(21163);writeZoneInfoMap(dout, zimap);
            } finally {
                __CLR4_4_1g36g36lc8azttl.R.inc(21164);dout.close();
            }
        }

        }__CLR4_4_1g36g36lc8azttl.R.inc(21165);return map;
    }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    public void parseDataFile(BufferedReader in) throws IOException {try{__CLR4_4_1g36g36lc8azttl.R.inc(21166);
        __CLR4_4_1g36g36lc8azttl.R.inc(21167);Zone zone = null;
        __CLR4_4_1g36g36lc8azttl.R.inc(21168);String line;
        __CLR4_4_1g36g36lc8azttl.R.inc(21169);while ((line = in.readLine()) != null) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(21172);String trimmed = line.trim();
            __CLR4_4_1g36g36lc8azttl.R.inc(21173);if ((((trimmed.length() == 0 || trimmed.charAt(0) == '#')&&(__CLR4_4_1g36g36lc8azttl.R.iget(21174)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21175)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21176);continue;
            }

            }__CLR4_4_1g36g36lc8azttl.R.inc(21177);int index = line.indexOf('#');
            __CLR4_4_1g36g36lc8azttl.R.inc(21178);if ((((index >= 0)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21179)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21180)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21181);line = line.substring(0, index);
            }

            //System.out.println(line);

            }__CLR4_4_1g36g36lc8azttl.R.inc(21182);StringTokenizer st = new StringTokenizer(line, " \t");

            __CLR4_4_1g36g36lc8azttl.R.inc(21183);if ((((Character.isWhitespace(line.charAt(0)) && st.hasMoreTokens())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21184)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21185)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21186);if ((((zone != null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21187)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21188)==0&false))) {{
                    // Zone continuation
                    __CLR4_4_1g36g36lc8azttl.R.inc(21189);zone.chain(st);
                }
                }__CLR4_4_1g36g36lc8azttl.R.inc(21190);continue;
            } }else {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21191);if ((((zone != null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21192)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21193)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21194);iZones.add(zone);
                }
                }__CLR4_4_1g36g36lc8azttl.R.inc(21195);zone = null;
            }

            }__CLR4_4_1g36g36lc8azttl.R.inc(21196);if ((((st.hasMoreTokens())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21197)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21198)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21199);String token = st.nextToken();
                __CLR4_4_1g36g36lc8azttl.R.inc(21200);if ((((token.equalsIgnoreCase("Rule"))&&(__CLR4_4_1g36g36lc8azttl.R.iget(21201)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21202)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21203);Rule r = new Rule(st);
                    __CLR4_4_1g36g36lc8azttl.R.inc(21204);RuleSet rs = iRuleSets.get(r.iName);
                    __CLR4_4_1g36g36lc8azttl.R.inc(21205);if ((((rs == null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21206)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21207)==0&false))) {{
                        __CLR4_4_1g36g36lc8azttl.R.inc(21208);rs = new RuleSet(r);
                        __CLR4_4_1g36g36lc8azttl.R.inc(21209);iRuleSets.put(r.iName, rs);
                    } }else {{
                        __CLR4_4_1g36g36lc8azttl.R.inc(21210);rs.addRule(r);
                    }
                }} }else {__CLR4_4_1g36g36lc8azttl.R.inc(21211);if ((((token.equalsIgnoreCase("Zone"))&&(__CLR4_4_1g36g36lc8azttl.R.iget(21212)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21213)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21214);zone = new Zone(st);
                } }else {__CLR4_4_1g36g36lc8azttl.R.inc(21215);if ((((token.equalsIgnoreCase("Link"))&&(__CLR4_4_1g36g36lc8azttl.R.iget(21216)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21217)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21218);iLinks.add(st.nextToken());
                    __CLR4_4_1g36g36lc8azttl.R.inc(21219);iLinks.add(st.nextToken());
                } }else {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21220);System.out.println("Unknown line: " + line);
                }
            }}}}
        }}

        }__CLR4_4_1g36g36lc8azttl.R.inc(21221);if ((((zone != null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21222)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21223)==0&false))) {{
            __CLR4_4_1g36g36lc8azttl.R.inc(21224);iZones.add(zone);
        }
    }}finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

    static class DateTimeOfYear {
        public final int iMonthOfYear;
        public final int iDayOfMonth;
        public final int iDayOfWeek;
        public final boolean iAdvanceDayOfWeek;
        public final int iMillisOfDay;
        public final char iZoneChar;

        DateTimeOfYear() {try{__CLR4_4_1g36g36lc8azttl.R.inc(21225);
            __CLR4_4_1g36g36lc8azttl.R.inc(21226);iMonthOfYear = 1;
            __CLR4_4_1g36g36lc8azttl.R.inc(21227);iDayOfMonth = 1;
            __CLR4_4_1g36g36lc8azttl.R.inc(21228);iDayOfWeek = 0;
            __CLR4_4_1g36g36lc8azttl.R.inc(21229);iAdvanceDayOfWeek = false;
            __CLR4_4_1g36g36lc8azttl.R.inc(21230);iMillisOfDay = 0;
            __CLR4_4_1g36g36lc8azttl.R.inc(21231);iZoneChar = 'w';
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        DateTimeOfYear(StringTokenizer st) {try{__CLR4_4_1g36g36lc8azttl.R.inc(21232);
            __CLR4_4_1g36g36lc8azttl.R.inc(21233);int month = 1;
            __CLR4_4_1g36g36lc8azttl.R.inc(21234);int day = 1;
            __CLR4_4_1g36g36lc8azttl.R.inc(21235);int dayOfWeek = 0;
            __CLR4_4_1g36g36lc8azttl.R.inc(21236);int millis = 0;
            __CLR4_4_1g36g36lc8azttl.R.inc(21237);boolean advance = false;
            __CLR4_4_1g36g36lc8azttl.R.inc(21238);char zoneChar = 'w';

            __CLR4_4_1g36g36lc8azttl.R.inc(21239);if ((((st.hasMoreTokens())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21240)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21241)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21242);month = parseMonth(st.nextToken());

                __CLR4_4_1g36g36lc8azttl.R.inc(21243);if ((((st.hasMoreTokens())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21244)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21245)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21246);String str = st.nextToken();
                    __CLR4_4_1g36g36lc8azttl.R.inc(21247);if ((((str.startsWith("last"))&&(__CLR4_4_1g36g36lc8azttl.R.iget(21248)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21249)==0&false))) {{
                        __CLR4_4_1g36g36lc8azttl.R.inc(21250);day = -1;
                        __CLR4_4_1g36g36lc8azttl.R.inc(21251);dayOfWeek = parseDayOfWeek(str.substring(4));
                        __CLR4_4_1g36g36lc8azttl.R.inc(21252);advance = false;
                    } }else {{
                        __CLR4_4_1g36g36lc8azttl.R.inc(21253);try {
                            __CLR4_4_1g36g36lc8azttl.R.inc(21254);day = Integer.parseInt(str);
                            __CLR4_4_1g36g36lc8azttl.R.inc(21255);dayOfWeek = 0;
                            __CLR4_4_1g36g36lc8azttl.R.inc(21256);advance = false;
                        } catch (NumberFormatException e) {
                            __CLR4_4_1g36g36lc8azttl.R.inc(21257);int index = str.indexOf(">=");
                            __CLR4_4_1g36g36lc8azttl.R.inc(21258);if ((((index > 0)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21259)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21260)==0&false))) {{
                                __CLR4_4_1g36g36lc8azttl.R.inc(21261);day = Integer.parseInt(str.substring(index + 2));
                                __CLR4_4_1g36g36lc8azttl.R.inc(21262);dayOfWeek = parseDayOfWeek(str.substring(0, index));
                                __CLR4_4_1g36g36lc8azttl.R.inc(21263);advance = true;
                            } }else {{
                                __CLR4_4_1g36g36lc8azttl.R.inc(21264);index = str.indexOf("<=");
                                __CLR4_4_1g36g36lc8azttl.R.inc(21265);if ((((index > 0)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21266)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21267)==0&false))) {{
                                    __CLR4_4_1g36g36lc8azttl.R.inc(21268);day = Integer.parseInt(str.substring(index + 2));
                                    __CLR4_4_1g36g36lc8azttl.R.inc(21269);dayOfWeek = parseDayOfWeek(str.substring(0, index));
                                    __CLR4_4_1g36g36lc8azttl.R.inc(21270);advance = false;
                                } }else {{
                                    __CLR4_4_1g36g36lc8azttl.R.inc(21271);throw new IllegalArgumentException(str);
                                }
                            }}
                        }}
                    }

                    }__CLR4_4_1g36g36lc8azttl.R.inc(21272);if ((((st.hasMoreTokens())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21273)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21274)==0&false))) {{
                        __CLR4_4_1g36g36lc8azttl.R.inc(21275);str = st.nextToken();
                        __CLR4_4_1g36g36lc8azttl.R.inc(21276);zoneChar = parseZoneChar(str.charAt(str.length() - 1));
                        __CLR4_4_1g36g36lc8azttl.R.inc(21277);if ((((str.equals("24:00"))&&(__CLR4_4_1g36g36lc8azttl.R.iget(21278)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21279)==0&false))) {{
                            __CLR4_4_1g36g36lc8azttl.R.inc(21280);LocalDate date = ((((day == -1 )&&(__CLR4_4_1g36g36lc8azttl.R.iget(21281)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21282)==0&false))?
                                    new LocalDate(2001, month, 1).plusMonths(1) :
                                    new LocalDate(2001, month, day).plusDays(1));
                            __CLR4_4_1g36g36lc8azttl.R.inc(21283);advance = (day != -1);
                            __CLR4_4_1g36g36lc8azttl.R.inc(21284);month = date.getMonthOfYear();
                            __CLR4_4_1g36g36lc8azttl.R.inc(21285);day = date.getDayOfMonth();
                            __CLR4_4_1g36g36lc8azttl.R.inc(21286);dayOfWeek = ((dayOfWeek - 1 + 1) % 7) + 1;
                        } }else {{
                            __CLR4_4_1g36g36lc8azttl.R.inc(21287);millis = parseTime(str);
                        }
                    }}
                }}
            }}

            }__CLR4_4_1g36g36lc8azttl.R.inc(21288);iMonthOfYear = month;
            __CLR4_4_1g36g36lc8azttl.R.inc(21289);iDayOfMonth = day;
            __CLR4_4_1g36g36lc8azttl.R.inc(21290);iDayOfWeek = dayOfWeek;
            __CLR4_4_1g36g36lc8azttl.R.inc(21291);iAdvanceDayOfWeek = advance;
            __CLR4_4_1g36g36lc8azttl.R.inc(21292);iMillisOfDay = millis;
            __CLR4_4_1g36g36lc8azttl.R.inc(21293);iZoneChar = zoneChar;
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        /**
         * Adds a recurring savings rule to the builder.
         */
        public void addRecurring(DateTimeZoneBuilder builder, String nameKey,
                                 int saveMillis, int fromYear, int toYear)
        {try{__CLR4_4_1g36g36lc8azttl.R.inc(21294);
            __CLR4_4_1g36g36lc8azttl.R.inc(21295);builder.addRecurringSavings(nameKey, saveMillis,
                                        fromYear, toYear,
                                        iZoneChar,
                                        iMonthOfYear,
                                        iDayOfMonth,
                                        iDayOfWeek,
                                        iAdvanceDayOfWeek,
                                        iMillisOfDay);
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        /**
         * Adds a cutover to the builder.
         */
        public void addCutover(DateTimeZoneBuilder builder, int year) {try{__CLR4_4_1g36g36lc8azttl.R.inc(21296);
            __CLR4_4_1g36g36lc8azttl.R.inc(21297);builder.addCutover(year,
                               iZoneChar,
                               iMonthOfYear,
                               iDayOfMonth,
                               iDayOfWeek,
                               iAdvanceDayOfWeek,
                               iMillisOfDay);
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        public String toString() {try{__CLR4_4_1g36g36lc8azttl.R.inc(21298);
            __CLR4_4_1g36g36lc8azttl.R.inc(21299);return
                "MonthOfYear: " + iMonthOfYear + "\n" +
                "DayOfMonth: " + iDayOfMonth + "\n" +
                "DayOfWeek: " + iDayOfWeek + "\n" +
                "AdvanceDayOfWeek: " + iAdvanceDayOfWeek + "\n" +
                "MillisOfDay: " + iMillisOfDay + "\n" +
                "ZoneChar: " + iZoneChar + "\n";
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}
    }

    private static class Rule {
        public final String iName;
        public final int iFromYear;
        public final int iToYear;
        public final String iType;
        public final DateTimeOfYear iDateTimeOfYear;
        public final int iSaveMillis;
        public final String iLetterS;

        Rule(StringTokenizer st) {try{__CLR4_4_1g36g36lc8azttl.R.inc(21300);
            __CLR4_4_1g36g36lc8azttl.R.inc(21301);iName = st.nextToken().intern();
            __CLR4_4_1g36g36lc8azttl.R.inc(21302);iFromYear = parseYear(st.nextToken(), 0);
            __CLR4_4_1g36g36lc8azttl.R.inc(21303);iToYear = parseYear(st.nextToken(), iFromYear);
            __CLR4_4_1g36g36lc8azttl.R.inc(21304);if ((((iToYear < iFromYear)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21305)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21306)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21307);throw new IllegalArgumentException();
            }
            }__CLR4_4_1g36g36lc8azttl.R.inc(21308);iType = parseOptional(st.nextToken());
            __CLR4_4_1g36g36lc8azttl.R.inc(21309);iDateTimeOfYear = new DateTimeOfYear(st);
            __CLR4_4_1g36g36lc8azttl.R.inc(21310);iSaveMillis = parseTime(st.nextToken());
            __CLR4_4_1g36g36lc8azttl.R.inc(21311);iLetterS = parseOptional(st.nextToken());
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        /**
         * Adds a recurring savings rule to the builder.
         */
        public void addRecurring(DateTimeZoneBuilder builder, String nameFormat) {try{__CLR4_4_1g36g36lc8azttl.R.inc(21312);
            __CLR4_4_1g36g36lc8azttl.R.inc(21313);String nameKey = formatName(nameFormat);
            __CLR4_4_1g36g36lc8azttl.R.inc(21314);iDateTimeOfYear.addRecurring
                (builder, nameKey, iSaveMillis, iFromYear, iToYear);
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        private String formatName(String nameFormat) {try{__CLR4_4_1g36g36lc8azttl.R.inc(21315);
            __CLR4_4_1g36g36lc8azttl.R.inc(21316);int index = nameFormat.indexOf('/');
            __CLR4_4_1g36g36lc8azttl.R.inc(21317);if ((((index > 0)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21318)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21319)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21320);if ((((iSaveMillis == 0)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21321)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21322)==0&false))) {{
                    // Extract standard name.
                    __CLR4_4_1g36g36lc8azttl.R.inc(21323);return nameFormat.substring(0, index).intern();
                } }else {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21324);return nameFormat.substring(index + 1).intern();
                }
            }}
            }__CLR4_4_1g36g36lc8azttl.R.inc(21325);index = nameFormat.indexOf("%s");
            __CLR4_4_1g36g36lc8azttl.R.inc(21326);if ((((index < 0)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21327)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21328)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21329);return nameFormat;
            }
            }__CLR4_4_1g36g36lc8azttl.R.inc(21330);String left = nameFormat.substring(0, index);
            __CLR4_4_1g36g36lc8azttl.R.inc(21331);String right = nameFormat.substring(index + 2);
            __CLR4_4_1g36g36lc8azttl.R.inc(21332);String name;
            __CLR4_4_1g36g36lc8azttl.R.inc(21333);if ((((iLetterS == null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21334)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21335)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21336);name = left.concat(right);
            } }else {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21337);name = left + iLetterS + right;
            }
            }__CLR4_4_1g36g36lc8azttl.R.inc(21338);return name.intern();
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        public String toString() {try{__CLR4_4_1g36g36lc8azttl.R.inc(21339);
            __CLR4_4_1g36g36lc8azttl.R.inc(21340);return
                "[Rule]\n" + 
                "Name: " + iName + "\n" +
                "FromYear: " + iFromYear + "\n" +
                "ToYear: " + iToYear + "\n" +
                "Type: " + iType + "\n" +
                iDateTimeOfYear +
                "SaveMillis: " + iSaveMillis + "\n" +
                "LetterS: " + iLetterS + "\n";
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}
    }

    private static class RuleSet {
        private List<Rule> iRules;

        RuleSet(Rule rule) {try{__CLR4_4_1g36g36lc8azttl.R.inc(21341);
            __CLR4_4_1g36g36lc8azttl.R.inc(21342);iRules = new ArrayList<Rule>();
            __CLR4_4_1g36g36lc8azttl.R.inc(21343);iRules.add(rule);
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        void addRule(Rule rule) {try{__CLR4_4_1g36g36lc8azttl.R.inc(21344);
            __CLR4_4_1g36g36lc8azttl.R.inc(21345);if ((((!(rule.iName.equals(iRules.get(0).iName)))&&(__CLR4_4_1g36g36lc8azttl.R.iget(21346)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21347)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21348);throw new IllegalArgumentException("Rule name mismatch");
            }
            }__CLR4_4_1g36g36lc8azttl.R.inc(21349);iRules.add(rule);
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        /**
         * Adds recurring savings rules to the builder.
         */
        public void addRecurring(DateTimeZoneBuilder builder, String nameFormat) {try{__CLR4_4_1g36g36lc8azttl.R.inc(21350);
            __CLR4_4_1g36g36lc8azttl.R.inc(21351);for (int i=0; (((i<iRules.size())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21352)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21353)==0&false)); i++) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21354);Rule rule = iRules.get(i);
                __CLR4_4_1g36g36lc8azttl.R.inc(21355);rule.addRecurring(builder, nameFormat);
            }
        }}finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}
    }

    private static class Zone {
        public final String iName;
        public final int iOffsetMillis;
        public final String iRules;
        public final String iFormat;
        public final int iUntilYear;
        public final DateTimeOfYear iUntilDateTimeOfYear;

        private Zone iNext;

        Zone(StringTokenizer st) {
            this(st.nextToken(), st);__CLR4_4_1g36g36lc8azttl.R.inc(21357);try{__CLR4_4_1g36g36lc8azttl.R.inc(21356);
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        private Zone(String name, StringTokenizer st) {try{__CLR4_4_1g36g36lc8azttl.R.inc(21358);
            __CLR4_4_1g36g36lc8azttl.R.inc(21359);iName = name.intern();
            __CLR4_4_1g36g36lc8azttl.R.inc(21360);iOffsetMillis = parseTime(st.nextToken());
            __CLR4_4_1g36g36lc8azttl.R.inc(21361);iRules = parseOptional(st.nextToken());
            __CLR4_4_1g36g36lc8azttl.R.inc(21362);iFormat = st.nextToken().intern();

            __CLR4_4_1g36g36lc8azttl.R.inc(21363);int year = Integer.MAX_VALUE;
            __CLR4_4_1g36g36lc8azttl.R.inc(21364);DateTimeOfYear dtOfYear = getStartOfYear();

            __CLR4_4_1g36g36lc8azttl.R.inc(21365);if ((((st.hasMoreTokens())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21366)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21367)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21368);year = Integer.parseInt(st.nextToken());
                __CLR4_4_1g36g36lc8azttl.R.inc(21369);if ((((st.hasMoreTokens())&&(__CLR4_4_1g36g36lc8azttl.R.iget(21370)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21371)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21372);dtOfYear = new DateTimeOfYear(st);
                }
            }}

            }__CLR4_4_1g36g36lc8azttl.R.inc(21373);iUntilYear = year;
            __CLR4_4_1g36g36lc8azttl.R.inc(21374);iUntilDateTimeOfYear = dtOfYear;
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        void chain(StringTokenizer st) {try{__CLR4_4_1g36g36lc8azttl.R.inc(21375);
            __CLR4_4_1g36g36lc8azttl.R.inc(21376);if ((((iNext != null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21377)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21378)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21379);iNext.chain(st);
            } }else {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21380);iNext = new Zone(iName, st);
            }
        }}finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        /*
        public DateTimeZone buildDateTimeZone(Map ruleSets) {
            DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
            addToBuilder(builder, ruleSets);
            return builder.toDateTimeZone(iName);
        }
        */

        /**
         * Adds zone info to the builder.
         */
        public void addToBuilder(DateTimeZoneBuilder builder, Map<String, RuleSet> ruleSets) {try{__CLR4_4_1g36g36lc8azttl.R.inc(21381);
            __CLR4_4_1g36g36lc8azttl.R.inc(21382);addToBuilder(this, builder, ruleSets);
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        private static void addToBuilder(Zone zone,
                                         DateTimeZoneBuilder builder,
                                         Map<String, RuleSet> ruleSets)
        {try{__CLR4_4_1g36g36lc8azttl.R.inc(21383);
            __CLR4_4_1g36g36lc8azttl.R.inc(21384);for (; (((zone != null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21385)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21386)==0&false)); zone = zone.iNext) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21387);builder.setStandardOffset(zone.iOffsetMillis);

                __CLR4_4_1g36g36lc8azttl.R.inc(21388);if ((((zone.iRules == null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21389)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21390)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21391);builder.setFixedSavings(zone.iFormat, 0);
                } }else {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21392);try {
                        // Check if iRules actually just refers to a savings.
                        __CLR4_4_1g36g36lc8azttl.R.inc(21393);int saveMillis = parseTime(zone.iRules);
                        __CLR4_4_1g36g36lc8azttl.R.inc(21394);builder.setFixedSavings(zone.iFormat, saveMillis);
                    }
                    catch (Exception e) {
                        __CLR4_4_1g36g36lc8azttl.R.inc(21395);RuleSet rs = ruleSets.get(zone.iRules);
                        __CLR4_4_1g36g36lc8azttl.R.inc(21396);if ((((rs == null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21397)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21398)==0&false))) {{
                            __CLR4_4_1g36g36lc8azttl.R.inc(21399);throw new IllegalArgumentException
                                ("Rules not found: " + zone.iRules);
                        }
                        }__CLR4_4_1g36g36lc8azttl.R.inc(21400);rs.addRecurring(builder, zone.iFormat);
                    }
                }

                }__CLR4_4_1g36g36lc8azttl.R.inc(21401);if ((((zone.iUntilYear == Integer.MAX_VALUE)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21402)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21403)==0&false))) {{
                    __CLR4_4_1g36g36lc8azttl.R.inc(21404);break;
                }

                }__CLR4_4_1g36g36lc8azttl.R.inc(21405);zone.iUntilDateTimeOfYear.addCutover(builder, zone.iUntilYear);
            }
        }}finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}

        public String toString() {try{__CLR4_4_1g36g36lc8azttl.R.inc(21406);
            __CLR4_4_1g36g36lc8azttl.R.inc(21407);String str =
                "[Zone]\n" + 
                "Name: " + iName + "\n" +
                "OffsetMillis: " + iOffsetMillis + "\n" +
                "Rules: " + iRules + "\n" +
                "Format: " + iFormat + "\n" +
                "UntilYear: " + iUntilYear + "\n" +
                iUntilDateTimeOfYear;

            __CLR4_4_1g36g36lc8azttl.R.inc(21408);if ((((iNext == null)&&(__CLR4_4_1g36g36lc8azttl.R.iget(21409)!=0|true))||(__CLR4_4_1g36g36lc8azttl.R.iget(21410)==0&false))) {{
                __CLR4_4_1g36g36lc8azttl.R.inc(21411);return str;
            }

            }__CLR4_4_1g36g36lc8azttl.R.inc(21412);return str + "...\n" + iNext.toString();
        }finally{__CLR4_4_1g36g36lc8azttl.R.flushNeeded();}}
    }
}

