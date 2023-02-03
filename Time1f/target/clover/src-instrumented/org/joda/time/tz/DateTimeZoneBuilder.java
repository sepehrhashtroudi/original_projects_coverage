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

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/**
 * DateTimeZoneBuilder allows complex DateTimeZones to be constructed. Since
 * creating a new DateTimeZone this way is a relatively expensive operation,
 * built zones can be written to a file. Reading back the encoded data is a
 * quick operation.
 * <p>
 * DateTimeZoneBuilder itself is mutable and not thread-safe, but the
 * DateTimeZone objects that it builds are thread-safe and immutable.
 * <p>
 * It is intended that {@link ZoneInfoCompiler} be used to read time zone data
 * files, indirectly calling DateTimeZoneBuilder. The following complex
 * example defines the America/Los_Angeles time zone, with all historical
 * transitions:
 * 
 * <pre>
 * DateTimeZone America_Los_Angeles = new DateTimeZoneBuilder()
 *     .addCutover(-2147483648, 'w', 1, 1, 0, false, 0)
 *     .setStandardOffset(-28378000)
 *     .setFixedSavings("LMT", 0)
 *     .addCutover(1883, 'w', 11, 18, 0, false, 43200000)
 *     .setStandardOffset(-28800000)
 *     .addRecurringSavings("PDT", 3600000, 1918, 1919, 'w',  3, -1, 7, false, 7200000)
 *     .addRecurringSavings("PST",       0, 1918, 1919, 'w', 10, -1, 7, false, 7200000)
 *     .addRecurringSavings("PWT", 3600000, 1942, 1942, 'w',  2,  9, 0, false, 7200000)
 *     .addRecurringSavings("PPT", 3600000, 1945, 1945, 'u',  8, 14, 0, false, 82800000)
 *     .addRecurringSavings("PST",       0, 1945, 1945, 'w',  9, 30, 0, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1948, 1948, 'w',  3, 14, 0, false, 7200000)
 *     .addRecurringSavings("PST",       0, 1949, 1949, 'w',  1,  1, 0, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1950, 1966, 'w',  4, -1, 7, false, 7200000)
 *     .addRecurringSavings("PST",       0, 1950, 1961, 'w',  9, -1, 7, false, 7200000)
 *     .addRecurringSavings("PST",       0, 1962, 1966, 'w', 10, -1, 7, false, 7200000)
 *     .addRecurringSavings("PST",       0, 1967, 2147483647, 'w', 10, -1, 7, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1967, 1973, 'w', 4, -1,  7, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1974, 1974, 'w', 1,  6,  0, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1975, 1975, 'w', 2, 23,  0, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1976, 1986, 'w', 4, -1,  7, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1987, 2147483647, 'w', 4, 1, 7, true, 7200000)
 *     .toDateTimeZone("America/Los_Angeles", true);
 * </pre>
 *
 * @author Brian S O'Neill
 * @see ZoneInfoCompiler
 * @see ZoneInfoProvider
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DateTimeZoneBuilder {public static class __CLR4_4_1f72f72lc8aztr5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,20747,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Decodes a built DateTimeZone from the given stream, as encoded by
     * writeTo.
     *
     * @param in input stream to read encoded DateTimeZone from.
     * @param id time zone id to assign
     */
    public static DateTimeZone readFrom(InputStream in, String id) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19694);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19695);if ((((in instanceof DataInput)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19696)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19697)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19698);return readFrom((DataInput)in, id);
        } }else {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19699);return readFrom((DataInput)new DataInputStream(in), id);
        }
    }}finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    /**
     * Decodes a built DateTimeZone from the given stream, as encoded by
     * writeTo.
     *
     * @param in input stream to read encoded DateTimeZone from.
     * @param id time zone id to assign
     */
    public static DateTimeZone readFrom(DataInput in, String id) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19700);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1f72f72lc8aztr5.R.inc(19701);switch (in.readUnsignedByte()) {
        case 'F':if (!__CLB4_4_1_bool0) {__CLR4_4_1f72f72lc8aztr5.R.inc(19702);__CLB4_4_1_bool0=true;}
            __CLR4_4_1f72f72lc8aztr5.R.inc(19703);DateTimeZone fixed = new FixedDateTimeZone
                (id, in.readUTF(), (int)readMillis(in), (int)readMillis(in));
            __CLR4_4_1f72f72lc8aztr5.R.inc(19704);if ((((fixed.equals(DateTimeZone.UTC))&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19705)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19706)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19707);fixed = DateTimeZone.UTC;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(19708);return fixed;
        case 'C':if (!__CLB4_4_1_bool0) {__CLR4_4_1f72f72lc8aztr5.R.inc(19709);__CLB4_4_1_bool0=true;}
            __CLR4_4_1f72f72lc8aztr5.R.inc(19710);return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(in, id));
        case 'P':if (!__CLB4_4_1_bool0) {__CLR4_4_1f72f72lc8aztr5.R.inc(19711);__CLB4_4_1_bool0=true;}
            __CLR4_4_1f72f72lc8aztr5.R.inc(19712);return PrecalculatedZone.readFrom(in, id);
        default:if (!__CLB4_4_1_bool0) {__CLR4_4_1f72f72lc8aztr5.R.inc(19713);__CLB4_4_1_bool0=true;}
            __CLR4_4_1f72f72lc8aztr5.R.inc(19714);throw new IOException("Invalid encoding");
        }
    }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    /**
     * Millisecond encoding formats:
     *
     * upper two bits  units       field length  approximate range
     * ---------------------------------------------------------------
     * 00              30 minutes  1 byte        +/- 16 hours
     * 01              minutes     4 bytes       +/- 1020 years
     * 10              seconds     5 bytes       +/- 4355 years
     * 11              millis      9 bytes       +/- 292,000,000 years
     *
     * Remaining bits in field form signed offset from 1970-01-01T00:00:00Z.
     */
    static void writeMillis(DataOutput out, long millis) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19715);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19716);if ((((millis % (30 * 60000L) == 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19717)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19718)==0&false))) {{
            // Try to write in 30 minute units.
            __CLR4_4_1f72f72lc8aztr5.R.inc(19719);long units = millis / (30 * 60000L);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19720);if ((((((units << (64 - 6)) >> (64 - 6)) == units)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19721)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19722)==0&false))) {{
                // Form 00 (6 bits effective precision)
                __CLR4_4_1f72f72lc8aztr5.R.inc(19723);out.writeByte((int)(units & 0x3f));
                __CLR4_4_1f72f72lc8aztr5.R.inc(19724);return;
            }
        }}

        }__CLR4_4_1f72f72lc8aztr5.R.inc(19725);if ((((millis % 60000L == 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19726)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19727)==0&false))) {{
            // Try to write minutes.
            __CLR4_4_1f72f72lc8aztr5.R.inc(19728);long minutes = millis / 60000L;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19729);if ((((((minutes << (64 - 30)) >> (64 - 30)) == minutes)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19730)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19731)==0&false))) {{
                // Form 01 (30 bits effective precision)
                __CLR4_4_1f72f72lc8aztr5.R.inc(19732);out.writeInt(0x40000000 | (int)(minutes & 0x3fffffff));
                __CLR4_4_1f72f72lc8aztr5.R.inc(19733);return;
            }
        }}
        
        }__CLR4_4_1f72f72lc8aztr5.R.inc(19734);if ((((millis % 1000L == 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19735)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19736)==0&false))) {{
            // Try to write seconds.
            __CLR4_4_1f72f72lc8aztr5.R.inc(19737);long seconds = millis / 1000L;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19738);if ((((((seconds << (64 - 38)) >> (64 - 38)) == seconds)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19739)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19740)==0&false))) {{
                // Form 10 (38 bits effective precision)
                __CLR4_4_1f72f72lc8aztr5.R.inc(19741);out.writeByte(0x80 | (int)((seconds >> 32) & 0x3f));
                __CLR4_4_1f72f72lc8aztr5.R.inc(19742);out.writeInt((int)(seconds & 0xffffffff));
                __CLR4_4_1f72f72lc8aztr5.R.inc(19743);return;
            }
        }}

        // Write milliseconds either because the additional precision is
        // required or the minutes didn't fit in the field.
        
        // Form 11 (64-bits effective precision, but write as if 70 bits)
        }__CLR4_4_1f72f72lc8aztr5.R.inc(19744);out.writeByte((((millis < 0 )&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19745)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19746)==0&false))? 0xff : 0xc0);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19747);out.writeLong(millis);
    }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    /**
     * Reads encoding generated by writeMillis.
     */
    static long readMillis(DataInput in) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19748);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19749);int v = in.readUnsignedByte();
        boolean __CLB4_4_1_bool1=false;__CLR4_4_1f72f72lc8aztr5.R.inc(19750);switch (v >> 6) {
        case 0:if (!__CLB4_4_1_bool1) {__CLR4_4_1f72f72lc8aztr5.R.inc(19751);__CLB4_4_1_bool1=true;} default:if (!__CLB4_4_1_bool1) {__CLR4_4_1f72f72lc8aztr5.R.inc(19752);__CLB4_4_1_bool1=true;}
            // Form 00 (6 bits effective precision)
            __CLR4_4_1f72f72lc8aztr5.R.inc(19753);v = (v << (32 - 6)) >> (32 - 6);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19754);return v * (30 * 60000L);

        case 1:if (!__CLB4_4_1_bool1) {__CLR4_4_1f72f72lc8aztr5.R.inc(19755);__CLB4_4_1_bool1=true;}
            // Form 01 (30 bits effective precision)
            __CLR4_4_1f72f72lc8aztr5.R.inc(19756);v = (v << (32 - 6)) >> (32 - 30);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19757);v |= (in.readUnsignedByte()) << 16;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19758);v |= (in.readUnsignedByte()) << 8;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19759);v |= (in.readUnsignedByte());
            __CLR4_4_1f72f72lc8aztr5.R.inc(19760);return v * 60000L;

        case 2:if (!__CLB4_4_1_bool1) {__CLR4_4_1f72f72lc8aztr5.R.inc(19761);__CLB4_4_1_bool1=true;}
            // Form 10 (38 bits effective precision)
            __CLR4_4_1f72f72lc8aztr5.R.inc(19762);long w = (((long)v) << (64 - 6)) >> (64 - 38);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19763);w |= (in.readUnsignedByte()) << 24;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19764);w |= (in.readUnsignedByte()) << 16;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19765);w |= (in.readUnsignedByte()) << 8;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19766);w |= (in.readUnsignedByte());
            __CLR4_4_1f72f72lc8aztr5.R.inc(19767);return w * 1000L;

        case 3:if (!__CLB4_4_1_bool1) {__CLR4_4_1f72f72lc8aztr5.R.inc(19768);__CLB4_4_1_bool1=true;}
            // Form 11 (64-bits effective precision)
            __CLR4_4_1f72f72lc8aztr5.R.inc(19769);return in.readLong();
        }
    }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    private static DateTimeZone buildFixedZone(String id, String nameKey,
                                               int wallOffset, int standardOffset) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19770);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19771);if (((("UTC".equals(id) && id.equals(nameKey) &&
            wallOffset == 0 && standardOffset == 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19772)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19773)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19774);return DateTimeZone.UTC;
        }
        }__CLR4_4_1f72f72lc8aztr5.R.inc(19775);return new FixedDateTimeZone(id, nameKey, wallOffset, standardOffset);
    }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    // List of RuleSets.
    private final ArrayList<RuleSet> iRuleSets;

    public DateTimeZoneBuilder() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19776);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19777);iRuleSets = new ArrayList<RuleSet>(10);
    }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    /**
     * Adds a cutover for added rules. The standard offset at the cutover
     * defaults to 0. Call setStandardOffset afterwards to change it.
     *
     * @param year  the year of cutover
     * @param mode 'u' - cutover is measured against UTC, 'w' - against wall
     *  offset, 's' - against standard offset
     * @param monthOfYear  the month from 1 (January) to 12 (December)
     * @param dayOfMonth  if negative, set to ((last day of month) - ~dayOfMonth).
     *  For example, if -1, set to last day of month
     * @param dayOfWeek  from 1 (Monday) to 7 (Sunday), if 0 then ignore
     * @param advanceDayOfWeek  if dayOfMonth does not fall on dayOfWeek, advance to
     *  dayOfWeek when true, retreat when false.
     * @param millisOfDay  additional precision for specifying time of day of cutover
     */
    public DateTimeZoneBuilder addCutover(int year,
                                          char mode,
                                          int monthOfYear,
                                          int dayOfMonth,
                                          int dayOfWeek,
                                          boolean advanceDayOfWeek,
                                          int millisOfDay)
    {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19778);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19779);if ((((iRuleSets.size() > 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19780)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19781)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19782);OfYear ofYear = new OfYear
                (mode, monthOfYear, dayOfMonth, dayOfWeek, advanceDayOfWeek, millisOfDay);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19783);RuleSet lastRuleSet = iRuleSets.get(iRuleSets.size() - 1);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19784);lastRuleSet.setUpperLimit(year, ofYear);
        }
        }__CLR4_4_1f72f72lc8aztr5.R.inc(19785);iRuleSets.add(new RuleSet());
        __CLR4_4_1f72f72lc8aztr5.R.inc(19786);return this;
    }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    /**
     * Sets the standard offset to use for newly added rules until the next
     * cutover is added.
     * @param standardOffset  the standard offset in millis
     */
    public DateTimeZoneBuilder setStandardOffset(int standardOffset) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19787);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19788);getLastRuleSet().setStandardOffset(standardOffset);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19789);return this;
    }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    /**
     * Set a fixed savings rule at the cutover.
     */
    public DateTimeZoneBuilder setFixedSavings(String nameKey, int saveMillis) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19790);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19791);getLastRuleSet().setFixedSavings(nameKey, saveMillis);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19792);return this;
    }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    /**
     * Add a recurring daylight saving time rule.
     *
     * @param nameKey  the name key of new rule
     * @param saveMillis  the milliseconds to add to standard offset
     * @param fromYear  the first year that rule is in effect, MIN_VALUE indicates
     * beginning of time
     * @param toYear  the last year (inclusive) that rule is in effect, MAX_VALUE
     *  indicates end of time
     * @param mode  'u' - transitions are calculated against UTC, 'w' -
     *  transitions are calculated against wall offset, 's' - transitions are
     *  calculated against standard offset
     * @param monthOfYear  the month from 1 (January) to 12 (December)
     * @param dayOfMonth  if negative, set to ((last day of month) - ~dayOfMonth).
     *  For example, if -1, set to last day of month
     * @param dayOfWeek  from 1 (Monday) to 7 (Sunday), if 0 then ignore
     * @param advanceDayOfWeek  if dayOfMonth does not fall on dayOfWeek, advance to
     *  dayOfWeek when true, retreat when false.
     * @param millisOfDay  additional precision for specifying time of day of transitions
     */
    public DateTimeZoneBuilder addRecurringSavings(String nameKey, int saveMillis,
                                                   int fromYear, int toYear,
                                                   char mode,
                                                   int monthOfYear,
                                                   int dayOfMonth,
                                                   int dayOfWeek,
                                                   boolean advanceDayOfWeek,
                                                   int millisOfDay)
    {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19793);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19794);if ((((fromYear <= toYear)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19795)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19796)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19797);OfYear ofYear = new OfYear
                (mode, monthOfYear, dayOfMonth, dayOfWeek, advanceDayOfWeek, millisOfDay);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19798);Recurrence recurrence = new Recurrence(ofYear, nameKey, saveMillis);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19799);Rule rule = new Rule(recurrence, fromYear, toYear);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19800);getLastRuleSet().addRule(rule);
        }
        }__CLR4_4_1f72f72lc8aztr5.R.inc(19801);return this;
    }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    private RuleSet getLastRuleSet() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19802);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19803);if ((((iRuleSets.size() == 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19804)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19805)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19806);addCutover(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        }
        }__CLR4_4_1f72f72lc8aztr5.R.inc(19807);return iRuleSets.get(iRuleSets.size() - 1);
    }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}
    
    /**
     * Processes all the rules and builds a DateTimeZone.
     *
     * @param id  time zone id to assign
     * @param outputID  true if the zone id should be output
     */
    public DateTimeZone toDateTimeZone(String id, boolean outputID) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19808);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19809);if ((((id == null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19810)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19811)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19812);throw new IllegalArgumentException();
        }

        // Discover where all the transitions occur and store the results in
        // these lists.
        }__CLR4_4_1f72f72lc8aztr5.R.inc(19813);ArrayList<Transition> transitions = new ArrayList<Transition>();

        // Tail zone picks up remaining transitions in the form of an endless
        // DST cycle.
        __CLR4_4_1f72f72lc8aztr5.R.inc(19814);DSTZone tailZone = null;

        __CLR4_4_1f72f72lc8aztr5.R.inc(19815);long millis = Long.MIN_VALUE;
        __CLR4_4_1f72f72lc8aztr5.R.inc(19816);int saveMillis = 0;
            
        __CLR4_4_1f72f72lc8aztr5.R.inc(19817);int ruleSetCount = iRuleSets.size();
        __CLR4_4_1f72f72lc8aztr5.R.inc(19818);for (int i=0; (((i<ruleSetCount)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19819)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19820)==0&false)); i++) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19821);RuleSet rs = iRuleSets.get(i);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19822);Transition next = rs.firstTransition(millis);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19823);if ((((next == null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19824)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19825)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19826);continue;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(19827);addTransition(transitions, next);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19828);millis = next.getMillis();
            __CLR4_4_1f72f72lc8aztr5.R.inc(19829);saveMillis = next.getSaveMillis();

            // Copy it since we're going to destroy it.
            __CLR4_4_1f72f72lc8aztr5.R.inc(19830);rs = new RuleSet(rs);

            __CLR4_4_1f72f72lc8aztr5.R.inc(19831);while ((next = rs.nextTransition(millis, saveMillis)) != null) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19834);if ((((addTransition(transitions, next))&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19835)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19836)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(19837);if ((((tailZone != null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19838)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19839)==0&false))) {{
                        // Got the extra transition before DSTZone.
                        __CLR4_4_1f72f72lc8aztr5.R.inc(19840);break;
                    }
                }}
                }__CLR4_4_1f72f72lc8aztr5.R.inc(19841);millis = next.getMillis();
                __CLR4_4_1f72f72lc8aztr5.R.inc(19842);saveMillis = next.getSaveMillis();
                __CLR4_4_1f72f72lc8aztr5.R.inc(19843);if ((((tailZone == null && i == ruleSetCount - 1)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19844)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19845)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(19846);tailZone = rs.buildTailZone(id);
                    // If tailZone is not null, don't break out of main loop until
                    // at least one more transition is calculated. This ensures a
                    // correct 'seam' to the DSTZone.
                }
            }}

            }__CLR4_4_1f72f72lc8aztr5.R.inc(19847);millis = rs.getUpperLimit(saveMillis);
        }

        // Check if a simpler zone implementation can be returned.
        }__CLR4_4_1f72f72lc8aztr5.R.inc(19848);if ((((transitions.size() == 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19849)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19850)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19851);if ((((tailZone != null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19852)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19853)==0&false))) {{
                // This shouldn't happen, but handle just in case.
                __CLR4_4_1f72f72lc8aztr5.R.inc(19854);return tailZone;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(19855);return buildFixedZone(id, "UTC", 0, 0);
        }
        }__CLR4_4_1f72f72lc8aztr5.R.inc(19856);if ((((transitions.size() == 1 && tailZone == null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19857)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19858)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19859);Transition tr = transitions.get(0);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19860);return buildFixedZone(id, tr.getNameKey(),
                                  tr.getWallOffset(), tr.getStandardOffset());
        }

        }__CLR4_4_1f72f72lc8aztr5.R.inc(19861);PrecalculatedZone zone = PrecalculatedZone.create(id, outputID, transitions, tailZone);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19862);if ((((zone.isCachable())&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19863)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19864)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19865);return CachedDateTimeZone.forZone(zone);
        }
        }__CLR4_4_1f72f72lc8aztr5.R.inc(19866);return zone;
    }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    private boolean addTransition(ArrayList<Transition> transitions, Transition tr) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19867);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19868);int size = transitions.size();
        __CLR4_4_1f72f72lc8aztr5.R.inc(19869);if ((((size == 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19870)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19871)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19872);transitions.add(tr);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19873);return true;
        }

        }__CLR4_4_1f72f72lc8aztr5.R.inc(19874);Transition last = transitions.get(size - 1);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19875);if ((((!tr.isTransitionFrom(last))&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19876)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19877)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19878);return false;
        }

        // If local time of new transition is same as last local time, just
        // replace last transition with new one.
        }__CLR4_4_1f72f72lc8aztr5.R.inc(19879);int offsetForLast = 0;
        __CLR4_4_1f72f72lc8aztr5.R.inc(19880);if ((((size >= 2)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19881)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19882)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19883);offsetForLast = transitions.get(size - 2).getWallOffset();
        }
        }__CLR4_4_1f72f72lc8aztr5.R.inc(19884);int offsetForNew = last.getWallOffset();

        __CLR4_4_1f72f72lc8aztr5.R.inc(19885);long lastLocal = last.getMillis() + offsetForLast;
        __CLR4_4_1f72f72lc8aztr5.R.inc(19886);long newLocal = tr.getMillis() + offsetForNew;

        __CLR4_4_1f72f72lc8aztr5.R.inc(19887);if ((((newLocal != lastLocal)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19888)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19889)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19890);transitions.add(tr);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19891);return true;
        }

        }__CLR4_4_1f72f72lc8aztr5.R.inc(19892);transitions.remove(size - 1);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19893);return addTransition(transitions, tr);
    }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    /**
     * Encodes a built DateTimeZone to the given stream. Call readFrom to
     * decode the data into a DateTimeZone object.
     *
     * @param out  the output stream to receive the encoded DateTimeZone
     * @since 1.5 (parameter added)
     */
    public void writeTo(String zoneID, OutputStream out) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19894);
        __CLR4_4_1f72f72lc8aztr5.R.inc(19895);if ((((out instanceof DataOutput)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19896)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19897)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19898);writeTo(zoneID, (DataOutput)out);
        } }else {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19899);writeTo(zoneID, (DataOutput)new DataOutputStream(out));
        }
    }}finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    /**
     * Encodes a built DateTimeZone to the given stream. Call readFrom to
     * decode the data into a DateTimeZone object.
     *
     * @param out  the output stream to receive the encoded DateTimeZone
     * @since 1.5 (parameter added)
     */
    public void writeTo(String zoneID, DataOutput out) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19900);
        // pass false so zone id is not written out
        __CLR4_4_1f72f72lc8aztr5.R.inc(19901);DateTimeZone zone = toDateTimeZone(zoneID, false);

        __CLR4_4_1f72f72lc8aztr5.R.inc(19902);if ((((zone instanceof FixedDateTimeZone)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19903)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19904)==0&false))) {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19905);out.writeByte('F'); // 'F' for fixed
            __CLR4_4_1f72f72lc8aztr5.R.inc(19906);out.writeUTF(zone.getNameKey(0));
            __CLR4_4_1f72f72lc8aztr5.R.inc(19907);writeMillis(out, zone.getOffset(0));
            __CLR4_4_1f72f72lc8aztr5.R.inc(19908);writeMillis(out, zone.getStandardOffset(0));
        } }else {{
            __CLR4_4_1f72f72lc8aztr5.R.inc(19909);if ((((zone instanceof CachedDateTimeZone)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19910)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19911)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19912);out.writeByte('C'); // 'C' for cached, precalculated
                __CLR4_4_1f72f72lc8aztr5.R.inc(19913);zone = ((CachedDateTimeZone)zone).getUncachedZone();
            } }else {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19914);out.writeByte('P'); // 'P' for precalculated, uncached
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(19915);((PrecalculatedZone)zone).writeTo(out);
        }
    }}finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

    /**
     * Supports setting fields of year and moving between transitions.
     */
    private static final class OfYear {
        static OfYear readFrom(DataInput in) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19916);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19917);return new OfYear((char)in.readUnsignedByte(),
                              (int)in.readUnsignedByte(),
                              (int)in.readByte(),
                              (int)in.readUnsignedByte(),
                              in.readBoolean(),
                              (int)readMillis(in));
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        // Is 'u', 'w', or 's'.
        final char iMode;

        final int iMonthOfYear;
        final int iDayOfMonth;
        final int iDayOfWeek;
        final boolean iAdvance;
        final int iMillisOfDay;

        OfYear(char mode,
               int monthOfYear,
               int dayOfMonth,
               int dayOfWeek, boolean advanceDayOfWeek,
               int millisOfDay)
        {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19918);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19919);if ((((mode != 'u' && mode != 'w' && mode != 's')&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19920)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19921)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19922);throw new IllegalArgumentException("Unknown mode: " + mode);
            }

            }__CLR4_4_1f72f72lc8aztr5.R.inc(19923);iMode = mode;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19924);iMonthOfYear = monthOfYear;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19925);iDayOfMonth = dayOfMonth;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19926);iDayOfWeek = dayOfWeek;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19927);iAdvance = advanceDayOfWeek;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19928);iMillisOfDay = millisOfDay;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * @param standardOffset standard offset just before instant
         */
        public long setInstant(int year, int standardOffset, int saveMillis) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19929);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19930);int offset;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19931);if ((((iMode == 'w')&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19932)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19933)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19934);offset = standardOffset + saveMillis;
            } }else {__CLR4_4_1f72f72lc8aztr5.R.inc(19935);if ((((iMode == 's')&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19936)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19937)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19938);offset = standardOffset;
            } }else {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19939);offset = 0;
            }

            }}__CLR4_4_1f72f72lc8aztr5.R.inc(19940);Chronology chrono = ISOChronology.getInstanceUTC();
            __CLR4_4_1f72f72lc8aztr5.R.inc(19941);long millis = chrono.year().set(0, year);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19942);millis = chrono.monthOfYear().set(millis, iMonthOfYear);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19943);millis = chrono.millisOfDay().set(millis, iMillisOfDay);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19944);millis = setDayOfMonth(chrono, millis);

            __CLR4_4_1f72f72lc8aztr5.R.inc(19945);if ((((iDayOfWeek != 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19946)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19947)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19948);millis = setDayOfWeek(chrono, millis);
            }

            // Convert from local time to UTC.
            }__CLR4_4_1f72f72lc8aztr5.R.inc(19949);return millis - offset;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * @param standardOffset standard offset just before next recurrence
         */
        public long next(long instant, int standardOffset, int saveMillis) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19950);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19951);int offset;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19952);if ((((iMode == 'w')&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19953)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19954)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19955);offset = standardOffset + saveMillis;
            } }else {__CLR4_4_1f72f72lc8aztr5.R.inc(19956);if ((((iMode == 's')&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19957)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19958)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19959);offset = standardOffset;
            } }else {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19960);offset = 0;
            }

            // Convert from UTC to local time.
            }}__CLR4_4_1f72f72lc8aztr5.R.inc(19961);instant += offset;

            __CLR4_4_1f72f72lc8aztr5.R.inc(19962);Chronology chrono = ISOChronology.getInstanceUTC();
            __CLR4_4_1f72f72lc8aztr5.R.inc(19963);long next = chrono.monthOfYear().set(instant, iMonthOfYear);
            // Be lenient with millisOfDay.
            __CLR4_4_1f72f72lc8aztr5.R.inc(19964);next = chrono.millisOfDay().set(next, 0);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19965);next = chrono.millisOfDay().add(next, iMillisOfDay);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19966);next = setDayOfMonthNext(chrono, next);

            __CLR4_4_1f72f72lc8aztr5.R.inc(19967);if ((((iDayOfWeek == 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19968)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19969)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19970);if ((((next <= instant)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19971)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19972)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(19973);next = chrono.year().add(next, 1);
                    __CLR4_4_1f72f72lc8aztr5.R.inc(19974);next = setDayOfMonthNext(chrono, next);
                }
            }} }else {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19975);next = setDayOfWeek(chrono, next);
                __CLR4_4_1f72f72lc8aztr5.R.inc(19976);if ((((next <= instant)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19977)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19978)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(19979);next = chrono.year().add(next, 1);
                    __CLR4_4_1f72f72lc8aztr5.R.inc(19980);next = chrono.monthOfYear().set(next, iMonthOfYear);
                    __CLR4_4_1f72f72lc8aztr5.R.inc(19981);next = setDayOfMonthNext(chrono, next);
                    __CLR4_4_1f72f72lc8aztr5.R.inc(19982);next = setDayOfWeek(chrono, next);
                }
            }}

            // Convert from local time to UTC.
            }__CLR4_4_1f72f72lc8aztr5.R.inc(19983);return next - offset;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * @param standardOffset standard offset just before previous recurrence
         */
        public long previous(long instant, int standardOffset, int saveMillis) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(19984);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19985);int offset;
            __CLR4_4_1f72f72lc8aztr5.R.inc(19986);if ((((iMode == 'w')&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19987)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19988)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19989);offset = standardOffset + saveMillis;
            } }else {__CLR4_4_1f72f72lc8aztr5.R.inc(19990);if ((((iMode == 's')&&(__CLR4_4_1f72f72lc8aztr5.R.iget(19991)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(19992)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19993);offset = standardOffset;
            } }else {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(19994);offset = 0;
            }

            // Convert from UTC to local time.
            }}__CLR4_4_1f72f72lc8aztr5.R.inc(19995);instant += offset;

            __CLR4_4_1f72f72lc8aztr5.R.inc(19996);Chronology chrono = ISOChronology.getInstanceUTC();
            __CLR4_4_1f72f72lc8aztr5.R.inc(19997);long prev = chrono.monthOfYear().set(instant, iMonthOfYear);
            // Be lenient with millisOfDay.
            __CLR4_4_1f72f72lc8aztr5.R.inc(19998);prev = chrono.millisOfDay().set(prev, 0);
            __CLR4_4_1f72f72lc8aztr5.R.inc(19999);prev = chrono.millisOfDay().add(prev, iMillisOfDay);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20000);prev = setDayOfMonthPrevious(chrono, prev);

            __CLR4_4_1f72f72lc8aztr5.R.inc(20001);if ((((iDayOfWeek == 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20002)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20003)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20004);if ((((prev >= instant)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20005)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20006)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20007);prev = chrono.year().add(prev, -1);
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20008);prev = setDayOfMonthPrevious(chrono, prev);
                }
            }} }else {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20009);prev = setDayOfWeek(chrono, prev);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20010);if ((((prev >= instant)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20011)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20012)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20013);prev = chrono.year().add(prev, -1);
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20014);prev = chrono.monthOfYear().set(prev, iMonthOfYear);
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20015);prev = setDayOfMonthPrevious(chrono, prev);
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20016);prev = setDayOfWeek(chrono, prev);
                }
            }}

            // Convert from local time to UTC.
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20017);return prev - offset;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public boolean equals(Object obj) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20018);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20019);if ((((this == obj)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20020)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20021)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20022);return true;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20023);if ((((obj instanceof OfYear)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20024)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20025)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20026);OfYear other = (OfYear)obj;
                __CLR4_4_1f72f72lc8aztr5.R.inc(20027);return
                    iMode == other.iMode &&
                    iMonthOfYear == other.iMonthOfYear &&
                    iDayOfMonth == other.iDayOfMonth &&
                    iDayOfWeek == other.iDayOfWeek &&
                    iAdvance == other.iAdvance &&
                    iMillisOfDay == other.iMillisOfDay;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20028);return false;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /*
        public String toString() {
            return
                "[OfYear]\n" + 
                "Mode: " + iMode + '\n' +
                "MonthOfYear: " + iMonthOfYear + '\n' +
                "DayOfMonth: " + iDayOfMonth + '\n' +
                "DayOfWeek: " + iDayOfWeek + '\n' +
                "AdvanceDayOfWeek: " + iAdvance + '\n' +
                "MillisOfDay: " + iMillisOfDay + '\n';
        }
        */

        public void writeTo(DataOutput out) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20029);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20030);out.writeByte(iMode);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20031);out.writeByte(iMonthOfYear);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20032);out.writeByte(iDayOfMonth);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20033);out.writeByte(iDayOfWeek);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20034);out.writeBoolean(iAdvance);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20035);writeMillis(out, iMillisOfDay);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * If month-day is 02-29 and year isn't leap, advances to next leap year.
         */
        private long setDayOfMonthNext(Chronology chrono, long next) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20036);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20037);try {
                __CLR4_4_1f72f72lc8aztr5.R.inc(20038);next = setDayOfMonth(chrono, next);
            } catch (IllegalArgumentException e) {
                __CLR4_4_1f72f72lc8aztr5.R.inc(20039);if ((((iMonthOfYear == 2 && iDayOfMonth == 29)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20040)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20041)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20042);while ((((chrono.year().isLeap(next) == false)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20043)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20044)==0&false))) {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20045);next = chrono.year().add(next, 1);
                    }
                    }__CLR4_4_1f72f72lc8aztr5.R.inc(20046);next = setDayOfMonth(chrono, next);
                } }else {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20047);throw e;
                }
            }}
            __CLR4_4_1f72f72lc8aztr5.R.inc(20048);return next;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * If month-day is 02-29 and year isn't leap, retreats to previous leap year.
         */
        private long setDayOfMonthPrevious(Chronology chrono, long prev) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20049);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20050);try {
                __CLR4_4_1f72f72lc8aztr5.R.inc(20051);prev = setDayOfMonth(chrono, prev);
            } catch (IllegalArgumentException e) {
                __CLR4_4_1f72f72lc8aztr5.R.inc(20052);if ((((iMonthOfYear == 2 && iDayOfMonth == 29)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20053)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20054)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20055);while ((((chrono.year().isLeap(prev) == false)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20056)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20057)==0&false))) {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20058);prev = chrono.year().add(prev, -1);
                    }
                    }__CLR4_4_1f72f72lc8aztr5.R.inc(20059);prev = setDayOfMonth(chrono, prev);
                } }else {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20060);throw e;
                }
            }}
            __CLR4_4_1f72f72lc8aztr5.R.inc(20061);return prev;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        private long setDayOfMonth(Chronology chrono, long instant) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20062);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20063);if ((((iDayOfMonth >= 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20064)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20065)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20066);instant = chrono.dayOfMonth().set(instant, iDayOfMonth);
            } }else {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20067);instant = chrono.dayOfMonth().set(instant, 1);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20068);instant = chrono.monthOfYear().add(instant, 1);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20069);instant = chrono.dayOfMonth().add(instant, iDayOfMonth);
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20070);return instant;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        private long setDayOfWeek(Chronology chrono, long instant) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20071);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20072);int dayOfWeek = chrono.dayOfWeek().get(instant);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20073);int daysToAdd = iDayOfWeek - dayOfWeek;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20074);if ((((daysToAdd != 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20075)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20076)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20077);if ((((iAdvance)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20078)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20079)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20080);if ((((daysToAdd < 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20081)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20082)==0&false))) {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20083);daysToAdd += 7;
                    }
                }} }else {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20084);if ((((daysToAdd > 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20085)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20086)==0&false))) {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20087);daysToAdd -= 7;
                    }
                }}
                }__CLR4_4_1f72f72lc8aztr5.R.inc(20088);instant = chrono.dayOfWeek().add(instant, daysToAdd);
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20089);return instant;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}
    }

    /**
     * Extends OfYear with a nameKey and savings.
     */
    private static final class Recurrence {
        static Recurrence readFrom(DataInput in) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20090);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20091);return new Recurrence(OfYear.readFrom(in), in.readUTF(), (int)readMillis(in));
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        final OfYear iOfYear;
        final String iNameKey;
        final int iSaveMillis;

        Recurrence(OfYear ofYear, String nameKey, int saveMillis) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20092);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20093);iOfYear = ofYear;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20094);iNameKey = nameKey;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20095);iSaveMillis = saveMillis;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public OfYear getOfYear() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20096);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20097);return iOfYear;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * @param standardOffset standard offset just before next recurrence
         */
        public long next(long instant, int standardOffset, int saveMillis) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20098);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20099);return iOfYear.next(instant, standardOffset, saveMillis);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * @param standardOffset standard offset just before previous recurrence
         */
        public long previous(long instant, int standardOffset, int saveMillis) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20100);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20101);return iOfYear.previous(instant, standardOffset, saveMillis);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public String getNameKey() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20102);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20103);return iNameKey;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public int getSaveMillis() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20104);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20105);return iSaveMillis;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public boolean equals(Object obj) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20106);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20107);if ((((this == obj)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20108)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20109)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20110);return true;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20111);if ((((obj instanceof Recurrence)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20112)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20113)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20114);Recurrence other = (Recurrence)obj;
                __CLR4_4_1f72f72lc8aztr5.R.inc(20115);return
                    iSaveMillis == other.iSaveMillis &&
                    iNameKey.equals(other.iNameKey) &&
                    iOfYear.equals(other.iOfYear);
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20116);return false;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public void writeTo(DataOutput out) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20117);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20118);iOfYear.writeTo(out);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20119);out.writeUTF(iNameKey);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20120);writeMillis(out, iSaveMillis);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        Recurrence rename(String nameKey) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20121);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20122);return new Recurrence(iOfYear, nameKey, iSaveMillis);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        Recurrence renameAppend(String appendNameKey) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20123);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20124);return rename((iNameKey + appendNameKey).intern());
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}
    }

    /**
     * Extends Recurrence with inclusive year limits.
     */
    private static final class Rule {
        final Recurrence iRecurrence;
        final int iFromYear; // inclusive
        final int iToYear;   // inclusive

        Rule(Recurrence recurrence, int fromYear, int toYear) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20125);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20126);iRecurrence = recurrence;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20127);iFromYear = fromYear;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20128);iToYear = toYear;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        @SuppressWarnings("unused")
        public int getFromYear() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20129);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20130);return iFromYear;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public int getToYear() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20131);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20132);return iToYear;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        @SuppressWarnings("unused")
        public OfYear getOfYear() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20133);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20134);return iRecurrence.getOfYear();
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public String getNameKey() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20135);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20136);return iRecurrence.getNameKey();
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public int getSaveMillis() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20137);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20138);return iRecurrence.getSaveMillis();
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public long next(final long instant, int standardOffset, int saveMillis) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20139);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20140);Chronology chrono = ISOChronology.getInstanceUTC();

            __CLR4_4_1f72f72lc8aztr5.R.inc(20141);final int wallOffset = standardOffset + saveMillis;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20142);long testInstant = instant;

            __CLR4_4_1f72f72lc8aztr5.R.inc(20143);int year;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20144);if ((((instant == Long.MIN_VALUE)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20145)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20146)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20147);year = Integer.MIN_VALUE;
            } }else {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20148);year = chrono.year().get(instant + wallOffset);
            }

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20149);if ((((year < iFromYear)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20150)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20151)==0&false))) {{
                // First advance instant to start of from year.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20152);testInstant = chrono.year().set(0, iFromYear) - wallOffset;
                // Back off one millisecond to account for next recurrence
                // being exactly at the beginning of the year.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20153);testInstant -= 1;
            }

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20154);long next = iRecurrence.next(testInstant, standardOffset, saveMillis);

            __CLR4_4_1f72f72lc8aztr5.R.inc(20155);if ((((next > instant)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20156)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20157)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20158);year = chrono.year().get(next + wallOffset);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20159);if ((((year > iToYear)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20160)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20161)==0&false))) {{
                    // Out of range, return original value.
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20162);next = instant;
                }
            }}

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20163);return next;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}
    }

    private static final class Transition {
        private final long iMillis;
        private final String iNameKey;
        private final int iWallOffset;
        private final int iStandardOffset;

        Transition(long millis, Transition tr) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20164);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20165);iMillis = millis;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20166);iNameKey = tr.iNameKey;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20167);iWallOffset = tr.iWallOffset;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20168);iStandardOffset = tr.iStandardOffset;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        Transition(long millis, Rule rule, int standardOffset) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20169);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20170);iMillis = millis;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20171);iNameKey = rule.getNameKey();
            __CLR4_4_1f72f72lc8aztr5.R.inc(20172);iWallOffset = standardOffset + rule.getSaveMillis();
            __CLR4_4_1f72f72lc8aztr5.R.inc(20173);iStandardOffset = standardOffset;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        Transition(long millis, String nameKey,
                   int wallOffset, int standardOffset) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20174);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20175);iMillis = millis;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20176);iNameKey = nameKey;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20177);iWallOffset = wallOffset;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20178);iStandardOffset = standardOffset;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public long getMillis() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20179);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20180);return iMillis;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public String getNameKey() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20181);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20182);return iNameKey;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public int getWallOffset() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20183);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20184);return iWallOffset;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public int getStandardOffset() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20185);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20186);return iStandardOffset;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public int getSaveMillis() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20187);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20188);return iWallOffset - iStandardOffset;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * There must be a change in the millis, wall offsets or name keys.
         */
        public boolean isTransitionFrom(Transition other) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20189);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20190);if ((((other == null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20191)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20192)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20193);return true;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20194);return iMillis > other.iMillis &&
                (iWallOffset != other.iWallOffset ||
                 //iStandardOffset != other.iStandardOffset ||
                 !(iNameKey.equals(other.iNameKey)));
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}
    }

    private static final class RuleSet {
        private static final int YEAR_LIMIT;

        static {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20195);
            // Don't pre-calculate more than 100 years into the future. Almost
            // all zones will stop pre-calculating far sooner anyhow. Either a
            // simple DST cycle is detected or the last rule is a fixed
            // offset. If a zone has a fixed offset set more than 100 years
            // into the future, then it won't be observed.
            __CLR4_4_1f72f72lc8aztr5.R.inc(20196);long now = DateTimeUtils.currentTimeMillis();
            __CLR4_4_1f72f72lc8aztr5.R.inc(20197);YEAR_LIMIT = ISOChronology.getInstanceUTC().year().get(now) + 100;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        private int iStandardOffset;
        private ArrayList<Rule> iRules;

        // Optional.
        private String iInitialNameKey;
        private int iInitialSaveMillis;

        // Upper limit is exclusive.
        private int iUpperYear;
        private OfYear iUpperOfYear;

        RuleSet() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20198);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20199);iRules = new ArrayList<Rule>(10);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20200);iUpperYear = Integer.MAX_VALUE;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * Copy constructor.
         */
        RuleSet(RuleSet rs) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20201);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20202);iStandardOffset = rs.iStandardOffset;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20203);iRules = new ArrayList<Rule>(rs.iRules);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20204);iInitialNameKey = rs.iInitialNameKey;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20205);iInitialSaveMillis = rs.iInitialSaveMillis;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20206);iUpperYear = rs.iUpperYear;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20207);iUpperOfYear = rs.iUpperOfYear;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        @SuppressWarnings("unused")
        public int getStandardOffset() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20208);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20209);return iStandardOffset;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public void setStandardOffset(int standardOffset) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20210);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20211);iStandardOffset = standardOffset;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public void setFixedSavings(String nameKey, int saveMillis) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20212);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20213);iInitialNameKey = nameKey;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20214);iInitialSaveMillis = saveMillis;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public void addRule(Rule rule) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20215);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20216);if ((((!iRules.contains(rule))&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20217)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20218)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20219);iRules.add(rule);
            }
        }}finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public void setUpperLimit(int year, OfYear ofYear) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20220);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20221);iUpperYear = year;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20222);iUpperOfYear = ofYear;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * Returns a transition at firstMillis with the first name key and
         * offsets for this rule set. This method may return null.
         *
         * @param firstMillis millis of first transition
         */
        public Transition firstTransition(final long firstMillis) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20223);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20224);if ((((iInitialNameKey != null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20225)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20226)==0&false))) {{
                // Initial zone info explicitly set, so don't search the rules.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20227);return new Transition(firstMillis, iInitialNameKey,
                                      iStandardOffset + iInitialSaveMillis, iStandardOffset);
            }

            // Make a copy before we destroy the rules.
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20228);ArrayList<Rule> copy = new ArrayList<Rule>(iRules);

            // Iterate through all the transitions until firstMillis is
            // reached. Use the name key and savings for whatever rule reaches
            // the limit.

            __CLR4_4_1f72f72lc8aztr5.R.inc(20229);long millis = Long.MIN_VALUE;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20230);int saveMillis = 0;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20231);Transition first = null;

            __CLR4_4_1f72f72lc8aztr5.R.inc(20232);Transition next;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20233);while ((next = nextTransition(millis, saveMillis)) != null) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20236);millis = next.getMillis();

                __CLR4_4_1f72f72lc8aztr5.R.inc(20237);if ((((millis == firstMillis)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20238)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20239)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20240);first = new Transition(firstMillis, next);
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20241);break;
                }

                }__CLR4_4_1f72f72lc8aztr5.R.inc(20242);if ((((millis > firstMillis)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20243)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20244)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20245);if ((((first == null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20246)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20247)==0&false))) {{
                        // Find first rule without savings. This way a more
                        // accurate nameKey is found even though no rule
                        // extends to the RuleSet's lower limit.
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20248);for (Rule rule : copy) {{
                            __CLR4_4_1f72f72lc8aztr5.R.inc(20249);if ((((rule.getSaveMillis() == 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20250)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20251)==0&false))) {{
                                __CLR4_4_1f72f72lc8aztr5.R.inc(20252);first = new Transition(firstMillis, rule, iStandardOffset);
                                __CLR4_4_1f72f72lc8aztr5.R.inc(20253);break;
                            }
                        }}
                    }}
                    }__CLR4_4_1f72f72lc8aztr5.R.inc(20254);if ((((first == null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20255)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20256)==0&false))) {{
                        // Found no rule without savings. Create a transition
                        // with no savings anyhow, and use the best available
                        // name key.
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20257);first = new Transition(firstMillis, next.getNameKey(),
                                               iStandardOffset, iStandardOffset);
                    }
                    }__CLR4_4_1f72f72lc8aztr5.R.inc(20258);break;
                }
                
                // Set first to the best transition found so far, but next
                // iteration may find something closer to lower limit.
                }__CLR4_4_1f72f72lc8aztr5.R.inc(20259);first = new Transition(firstMillis, next);

                __CLR4_4_1f72f72lc8aztr5.R.inc(20260);saveMillis = next.getSaveMillis();
            }

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20261);iRules = copy;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20262);return first;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * Returns null if RuleSet is exhausted or upper limit reached. Calling
         * this method will throw away rules as they each become
         * exhausted. Copy the RuleSet before using it to compute transitions.
         *
         * Returned transition may be a duplicate from previous
         * transition. Caller must call isTransitionFrom to filter out
         * duplicates.
         *
         * @param saveMillis savings before next transition
         */
        public Transition nextTransition(final long instant, final int saveMillis) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20263);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20264);Chronology chrono = ISOChronology.getInstanceUTC();

            // Find next matching rule.
            __CLR4_4_1f72f72lc8aztr5.R.inc(20265);Rule nextRule = null;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20266);long nextMillis = Long.MAX_VALUE;
            
            __CLR4_4_1f72f72lc8aztr5.R.inc(20267);Iterator<Rule> it = iRules.iterator();
            __CLR4_4_1f72f72lc8aztr5.R.inc(20268);while ((((it.hasNext())&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20269)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20270)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20271);Rule rule = it.next();
                __CLR4_4_1f72f72lc8aztr5.R.inc(20272);long next = rule.next(instant, iStandardOffset, saveMillis);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20273);if ((((next <= instant)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20274)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20275)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20276);it.remove();
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20277);continue;
                }
                // Even if next is same as previous next, choose the rule
                // in order for more recently added rules to override.
                }__CLR4_4_1f72f72lc8aztr5.R.inc(20278);if ((((next <= nextMillis)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20279)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20280)==0&false))) {{
                    // Found a better match.
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20281);nextRule = rule;
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20282);nextMillis = next;
                }
            }}
            
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20283);if ((((nextRule == null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20284)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20285)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20286);return null;
            }
            
            // Stop precalculating if year reaches some arbitrary limit.
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20287);if ((((chrono.year().get(nextMillis) >= YEAR_LIMIT)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20288)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20289)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20290);return null;
            }
            
            // Check if upper limit reached or passed.
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20291);if ((((iUpperYear < Integer.MAX_VALUE)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20292)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20293)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20294);long upperMillis =
                    iUpperOfYear.setInstant(iUpperYear, iStandardOffset, saveMillis);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20295);if ((((nextMillis >= upperMillis)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20296)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20297)==0&false))) {{
                    // At or after upper limit.
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20298);return null;
                }
            }}
            
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20299);return new Transition(nextMillis, nextRule, iStandardOffset);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * @param saveMillis savings before upper limit
         */
        public long getUpperLimit(int saveMillis) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20300);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20301);if ((((iUpperYear == Integer.MAX_VALUE)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20302)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20303)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20304);return Long.MAX_VALUE;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20305);return iUpperOfYear.setInstant(iUpperYear, iStandardOffset, saveMillis);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * Returns null if none can be built.
         */
        public DSTZone buildTailZone(String id) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20306);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20307);if ((((iRules.size() == 2)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20308)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20309)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20310);Rule startRule = iRules.get(0);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20311);Rule endRule = iRules.get(1);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20312);if ((((startRule.getToYear() == Integer.MAX_VALUE &&
                    endRule.getToYear() == Integer.MAX_VALUE)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20313)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20314)==0&false))) {{

                    // With exactly two infinitely recurring rules left, a
                    // simple DSTZone can be formed.

                    // The order of rules can come in any order, and it doesn't
                    // really matter which rule was chosen the 'start' and
                    // which is chosen the 'end'. DSTZone works properly either
                    // way.
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20315);return new DSTZone(id, iStandardOffset,
                                       startRule.iRecurrence, endRule.iRecurrence);
                }
            }}
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20316);return null;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}
    }

    private static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;

        static DSTZone readFrom(DataInput in, String id) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20317);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20318);return new DSTZone(id, (int)readMillis(in), 
                               Recurrence.readFrom(in), Recurrence.readFrom(in));
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        final int iStandardOffset;
        final Recurrence iStartRecurrence;
        final Recurrence iEndRecurrence;

        DSTZone(String id, int standardOffset,
                Recurrence startRecurrence, Recurrence endRecurrence) {
            super(id);__CLR4_4_1f72f72lc8aztr5.R.inc(20320);try{__CLR4_4_1f72f72lc8aztr5.R.inc(20319);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20321);iStandardOffset = standardOffset;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20322);iStartRecurrence = startRecurrence;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20323);iEndRecurrence = endRecurrence;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public String getNameKey(long instant) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20324);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20325);return findMatchingRecurrence(instant).getNameKey();
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public int getOffset(long instant) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20326);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20327);return iStandardOffset + findMatchingRecurrence(instant).getSaveMillis();
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public int getStandardOffset(long instant) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20328);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20329);return iStandardOffset;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public boolean isFixed() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20330);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20331);return false;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public long nextTransition(long instant) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20332);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20333);int standardOffset = iStandardOffset;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20334);Recurrence startRecurrence = iStartRecurrence;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20335);Recurrence endRecurrence = iEndRecurrence;

            __CLR4_4_1f72f72lc8aztr5.R.inc(20336);long start, end;

            __CLR4_4_1f72f72lc8aztr5.R.inc(20337);try {
                __CLR4_4_1f72f72lc8aztr5.R.inc(20338);start = startRecurrence.next
                    (instant, standardOffset, endRecurrence.getSaveMillis());
                __CLR4_4_1f72f72lc8aztr5.R.inc(20339);if ((((instant > 0 && start < 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20340)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20341)==0&false))) {{
                    // Overflowed.
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20342);start = instant;
                }
            }} catch (IllegalArgumentException e) {
                // Overflowed.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20343);start = instant;
            } catch (ArithmeticException e) {
                // Overflowed.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20344);start = instant;
            }

            __CLR4_4_1f72f72lc8aztr5.R.inc(20345);try {
                __CLR4_4_1f72f72lc8aztr5.R.inc(20346);end = endRecurrence.next
                    (instant, standardOffset, startRecurrence.getSaveMillis());
                __CLR4_4_1f72f72lc8aztr5.R.inc(20347);if ((((instant > 0 && end < 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20348)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20349)==0&false))) {{
                    // Overflowed.
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20350);end = instant;
                }
            }} catch (IllegalArgumentException e) {
                // Overflowed.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20351);end = instant;
            } catch (ArithmeticException e) {
                // Overflowed.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20352);end = instant;
            }

            __CLR4_4_1f72f72lc8aztr5.R.inc(20353);return ((((start > end) )&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20354)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20355)==0&false))? end : start;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public long previousTransition(long instant) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20356);
            // Increment in order to handle the case where instant is exactly at
            // a transition.
            __CLR4_4_1f72f72lc8aztr5.R.inc(20357);instant++;

            __CLR4_4_1f72f72lc8aztr5.R.inc(20358);int standardOffset = iStandardOffset;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20359);Recurrence startRecurrence = iStartRecurrence;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20360);Recurrence endRecurrence = iEndRecurrence;

            __CLR4_4_1f72f72lc8aztr5.R.inc(20361);long start, end;

            __CLR4_4_1f72f72lc8aztr5.R.inc(20362);try {
                __CLR4_4_1f72f72lc8aztr5.R.inc(20363);start = startRecurrence.previous
                    (instant, standardOffset, endRecurrence.getSaveMillis());
                __CLR4_4_1f72f72lc8aztr5.R.inc(20364);if ((((instant < 0 && start > 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20365)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20366)==0&false))) {{
                    // Overflowed.
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20367);start = instant;
                }
            }} catch (IllegalArgumentException e) {
                // Overflowed.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20368);start = instant;
            } catch (ArithmeticException e) {
                // Overflowed.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20369);start = instant;
            }

            __CLR4_4_1f72f72lc8aztr5.R.inc(20370);try {
                __CLR4_4_1f72f72lc8aztr5.R.inc(20371);end = endRecurrence.previous
                    (instant, standardOffset, startRecurrence.getSaveMillis());
                __CLR4_4_1f72f72lc8aztr5.R.inc(20372);if ((((instant < 0 && end > 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20373)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20374)==0&false))) {{
                    // Overflowed.
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20375);end = instant;
                }
            }} catch (IllegalArgumentException e) {
                // Overflowed.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20376);end = instant;
            } catch (ArithmeticException e) {
                // Overflowed.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20377);end = instant;
            }

            __CLR4_4_1f72f72lc8aztr5.R.inc(20378);return (((((start > end) )&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20379)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20380)==0&false))? start : end) - 1;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public boolean equals(Object obj) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20381);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20382);if ((((this == obj)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20383)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20384)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20385);return true;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20386);if ((((obj instanceof DSTZone)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20387)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20388)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20389);DSTZone other = (DSTZone)obj;
                __CLR4_4_1f72f72lc8aztr5.R.inc(20390);return
                    getID().equals(other.getID()) &&
                    iStandardOffset == other.iStandardOffset &&
                    iStartRecurrence.equals(other.iStartRecurrence) &&
                    iEndRecurrence.equals(other.iEndRecurrence);
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20391);return false;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public void writeTo(DataOutput out) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20392);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20393);writeMillis(out, iStandardOffset);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20394);iStartRecurrence.writeTo(out);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20395);iEndRecurrence.writeTo(out);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        private Recurrence findMatchingRecurrence(long instant) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20396);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20397);int standardOffset = iStandardOffset;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20398);Recurrence startRecurrence = iStartRecurrence;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20399);Recurrence endRecurrence = iEndRecurrence;

            __CLR4_4_1f72f72lc8aztr5.R.inc(20400);long start, end;

            __CLR4_4_1f72f72lc8aztr5.R.inc(20401);try {
                __CLR4_4_1f72f72lc8aztr5.R.inc(20402);start = startRecurrence.next
                    (instant, standardOffset, endRecurrence.getSaveMillis());
            } catch (IllegalArgumentException e) {
                // Overflowed.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20403);start = instant;
            } catch (ArithmeticException e) {
                // Overflowed.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20404);start = instant;
            }

            __CLR4_4_1f72f72lc8aztr5.R.inc(20405);try {
                __CLR4_4_1f72f72lc8aztr5.R.inc(20406);end = endRecurrence.next
                    (instant, standardOffset, startRecurrence.getSaveMillis());
            } catch (IllegalArgumentException e) {
                // Overflowed.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20407);end = instant;
            } catch (ArithmeticException e) {
                // Overflowed.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20408);end = instant;
            }

            __CLR4_4_1f72f72lc8aztr5.R.inc(20409);return ((((start > end) )&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20410)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20411)==0&false))? startRecurrence : endRecurrence;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}
    }

    private static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;

        static PrecalculatedZone readFrom(DataInput in, String id) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20412);
            // Read string pool.
            __CLR4_4_1f72f72lc8aztr5.R.inc(20413);int poolSize = in.readUnsignedShort();
            __CLR4_4_1f72f72lc8aztr5.R.inc(20414);String[] pool = new String[poolSize];
            __CLR4_4_1f72f72lc8aztr5.R.inc(20415);for (int i=0; (((i<poolSize)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20416)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20417)==0&false)); i++) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20418);pool[i] = in.readUTF();
            }

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20419);int size = in.readInt();
            __CLR4_4_1f72f72lc8aztr5.R.inc(20420);long[] transitions = new long[size];
            __CLR4_4_1f72f72lc8aztr5.R.inc(20421);int[] wallOffsets = new int[size];
            __CLR4_4_1f72f72lc8aztr5.R.inc(20422);int[] standardOffsets = new int[size];
            __CLR4_4_1f72f72lc8aztr5.R.inc(20423);String[] nameKeys = new String[size];
            
            __CLR4_4_1f72f72lc8aztr5.R.inc(20424);for (int i=0; (((i<size)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20425)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20426)==0&false)); i++) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20427);transitions[i] = readMillis(in);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20428);wallOffsets[i] = (int)readMillis(in);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20429);standardOffsets[i] = (int)readMillis(in);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20430);try {
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20431);int index;
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20432);if ((((poolSize < 256)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20433)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20434)==0&false))) {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20435);index = in.readUnsignedByte();
                    } }else {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20436);index = in.readUnsignedShort();
                    }
                    }__CLR4_4_1f72f72lc8aztr5.R.inc(20437);nameKeys[i] = pool[index];
                } catch (ArrayIndexOutOfBoundsException e) {
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20438);throw new IOException("Invalid encoding");
                }
            }

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20439);DSTZone tailZone = null;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20440);if ((((in.readBoolean())&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20441)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20442)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20443);tailZone = DSTZone.readFrom(in, id);
            }

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20444);return new PrecalculatedZone
                (id, transitions, wallOffsets, standardOffsets, nameKeys, tailZone);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        /**
         * Factory to create instance from builder.
         * 
         * @param id  the zone id
         * @param outputID  true if the zone id should be output
         * @param transitions  the list of Transition objects
         * @param tailZone  optional zone for getting info beyond precalculated tables
         */
        static PrecalculatedZone create(String id, boolean outputID, ArrayList<Transition> transitions,
                                        DSTZone tailZone) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20445);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20446);int size = transitions.size();
            __CLR4_4_1f72f72lc8aztr5.R.inc(20447);if ((((size == 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20448)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20449)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20450);throw new IllegalArgumentException();
            }

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20451);long[] trans = new long[size];
            __CLR4_4_1f72f72lc8aztr5.R.inc(20452);int[] wallOffsets = new int[size];
            __CLR4_4_1f72f72lc8aztr5.R.inc(20453);int[] standardOffsets = new int[size];
            __CLR4_4_1f72f72lc8aztr5.R.inc(20454);String[] nameKeys = new String[size];

            __CLR4_4_1f72f72lc8aztr5.R.inc(20455);Transition last = null;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20456);for (int i=0; (((i<size)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20457)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20458)==0&false)); i++) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20459);Transition tr = transitions.get(i);

                __CLR4_4_1f72f72lc8aztr5.R.inc(20460);if ((((!tr.isTransitionFrom(last))&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20461)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20462)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20463);throw new IllegalArgumentException(id);
                }

                }__CLR4_4_1f72f72lc8aztr5.R.inc(20464);trans[i] = tr.getMillis();
                __CLR4_4_1f72f72lc8aztr5.R.inc(20465);wallOffsets[i] = tr.getWallOffset();
                __CLR4_4_1f72f72lc8aztr5.R.inc(20466);standardOffsets[i] = tr.getStandardOffset();
                __CLR4_4_1f72f72lc8aztr5.R.inc(20467);nameKeys[i] = tr.getNameKey();

                __CLR4_4_1f72f72lc8aztr5.R.inc(20468);last = tr;
            }

            // Some timezones (Australia) have the same name key for
            // summer and winter which messes everything up. Fix it here.
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20469);String[] zoneNameData = new String[5];
            __CLR4_4_1f72f72lc8aztr5.R.inc(20470);String[][] zoneStrings = new DateFormatSymbols(Locale.ENGLISH).getZoneStrings();
            __CLR4_4_1f72f72lc8aztr5.R.inc(20471);for (int j = 0; (((j < zoneStrings.length)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20472)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20473)==0&false)); j++) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20474);String[] set = zoneStrings[j];
                __CLR4_4_1f72f72lc8aztr5.R.inc(20475);if ((((set != null && set.length == 5 && id.equals(set[0]))&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20476)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20477)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20478);zoneNameData = set;
                }
            }}

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20479);Chronology chrono = ISOChronology.getInstanceUTC();

            __CLR4_4_1f72f72lc8aztr5.R.inc(20480);for (int i = 0; (((i < nameKeys.length - 1)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20481)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20482)==0&false)); i++) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20483);String curNameKey = nameKeys[i];
                __CLR4_4_1f72f72lc8aztr5.R.inc(20484);String nextNameKey = nameKeys[i + 1];
                __CLR4_4_1f72f72lc8aztr5.R.inc(20485);long curOffset = wallOffsets[i];
                __CLR4_4_1f72f72lc8aztr5.R.inc(20486);long nextOffset = wallOffsets[i + 1];
                __CLR4_4_1f72f72lc8aztr5.R.inc(20487);long curStdOffset = standardOffsets[i];
                __CLR4_4_1f72f72lc8aztr5.R.inc(20488);long nextStdOffset = standardOffsets[i + 1];
                __CLR4_4_1f72f72lc8aztr5.R.inc(20489);Period p = new Period(trans[i], trans[i + 1], PeriodType.yearMonthDay(), chrono);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20490);if ((((curOffset != nextOffset &&
                        curStdOffset == nextStdOffset &&
                        curNameKey.equals(nextNameKey) &&
                        p.getYears() == 0 && p.getMonths() > 4 && p.getMonths() < 8 &&
                        curNameKey.equals(zoneNameData[2]) &&
                        curNameKey.equals(zoneNameData[4]))&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20491)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20492)==0&false))) {{
                    
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20493);if ((((ZoneInfoCompiler.verbose())&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20494)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20495)==0&false))) {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20496);System.out.println("Fixing duplicate name key - " + nextNameKey);
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20497);System.out.println("     - " + new DateTime(trans[i], chrono) +
                                           " - " + new DateTime(trans[i + 1], chrono));
                    }
                    }__CLR4_4_1f72f72lc8aztr5.R.inc(20498);if ((((curOffset > nextOffset)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20499)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20500)==0&false))) {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20501);nameKeys[i] = (curNameKey + "-Summer").intern();
                    } }else {__CLR4_4_1f72f72lc8aztr5.R.inc(20502);if ((((curOffset < nextOffset)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20503)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20504)==0&false))) {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20505);nameKeys[i + 1] = (nextNameKey + "-Summer").intern();
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20506);i++;
                    }
                }}}
            }}

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20507);if ((((tailZone != null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20508)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20509)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20510);if ((((tailZone.iStartRecurrence.getNameKey()
                    .equals(tailZone.iEndRecurrence.getNameKey()))&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20511)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20512)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20513);if ((((ZoneInfoCompiler.verbose())&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20514)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20515)==0&false))) {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20516);System.out.println("Fixing duplicate recurrent name key - " +
                                           tailZone.iStartRecurrence.getNameKey());
                    }
                    }__CLR4_4_1f72f72lc8aztr5.R.inc(20517);if ((((tailZone.iStartRecurrence.getSaveMillis() > 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20518)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20519)==0&false))) {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20520);tailZone = new DSTZone(
                            tailZone.getID(),
                            tailZone.iStandardOffset,
                            tailZone.iStartRecurrence.renameAppend("-Summer"),
                            tailZone.iEndRecurrence);
                    } }else {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20521);tailZone = new DSTZone(
                            tailZone.getID(),
                            tailZone.iStandardOffset,
                            tailZone.iStartRecurrence,
                            tailZone.iEndRecurrence.renameAppend("-Summer"));
                    }
                }}
            }}
            
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20522);return new PrecalculatedZone
                (((((outputID )&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20523)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20524)==0&false))? id : ""), trans, wallOffsets, standardOffsets, nameKeys, tailZone);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        // All array fields have the same length.

        private final long[] iTransitions;

        private final int[] iWallOffsets;
        private final int[] iStandardOffsets;
        private final String[] iNameKeys;

        private final DSTZone iTailZone;

        /**
         * Constructor used ONLY for valid input, loaded via static methods.
         */
        private PrecalculatedZone(String id, long[] transitions, int[] wallOffsets,
                          int[] standardOffsets, String[] nameKeys, DSTZone tailZone)
        {
            super(id);__CLR4_4_1f72f72lc8aztr5.R.inc(20526);try{__CLR4_4_1f72f72lc8aztr5.R.inc(20525);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20527);iTransitions = transitions;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20528);iWallOffsets = wallOffsets;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20529);iStandardOffsets = standardOffsets;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20530);iNameKeys = nameKeys;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20531);iTailZone = tailZone;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public String getNameKey(long instant) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20532);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20533);long[] transitions = iTransitions;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20534);int i = Arrays.binarySearch(transitions, instant);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20535);if ((((i >= 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20536)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20537)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20538);return iNameKeys[i];
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20539);i = ~i;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20540);if ((((i < transitions.length)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20541)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20542)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20543);if ((((i > 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20544)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20545)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20546);return iNameKeys[i - 1];
                }
                }__CLR4_4_1f72f72lc8aztr5.R.inc(20547);return "UTC";
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20548);if ((((iTailZone == null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20549)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20550)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20551);return iNameKeys[i - 1];
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20552);return iTailZone.getNameKey(instant);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public int getOffset(long instant) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20553);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20554);long[] transitions = iTransitions;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20555);int i = Arrays.binarySearch(transitions, instant);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20556);if ((((i >= 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20557)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20558)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20559);return iWallOffsets[i];
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20560);i = ~i;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20561);if ((((i < transitions.length)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20562)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20563)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20564);if ((((i > 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20565)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20566)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20567);return iWallOffsets[i - 1];
                }
                }__CLR4_4_1f72f72lc8aztr5.R.inc(20568);return 0;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20569);if ((((iTailZone == null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20570)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20571)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20572);return iWallOffsets[i - 1];
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20573);return iTailZone.getOffset(instant);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public int getStandardOffset(long instant) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20574);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20575);long[] transitions = iTransitions;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20576);int i = Arrays.binarySearch(transitions, instant);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20577);if ((((i >= 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20578)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20579)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20580);return iStandardOffsets[i];
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20581);i = ~i;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20582);if ((((i < transitions.length)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20583)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20584)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20585);if ((((i > 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20586)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20587)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20588);return iStandardOffsets[i - 1];
                }
                }__CLR4_4_1f72f72lc8aztr5.R.inc(20589);return 0;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20590);if ((((iTailZone == null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20591)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20592)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20593);return iStandardOffsets[i - 1];
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20594);return iTailZone.getStandardOffset(instant);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public boolean isFixed() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20595);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20596);return false;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public long nextTransition(long instant) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20597);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20598);long[] transitions = iTransitions;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20599);int i = Arrays.binarySearch(transitions, instant);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20600);i = ((((i >= 0) )&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20601)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20602)==0&false))? (i + 1) : ~i;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20603);if ((((i < transitions.length)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20604)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20605)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20606);return transitions[i];
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20607);if ((((iTailZone == null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20608)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20609)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20610);return instant;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20611);long end = transitions[transitions.length - 1];
            __CLR4_4_1f72f72lc8aztr5.R.inc(20612);if ((((instant < end)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20613)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20614)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20615);instant = end;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20616);return iTailZone.nextTransition(instant);
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public long previousTransition(long instant) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20617);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20618);long[] transitions = iTransitions;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20619);int i = Arrays.binarySearch(transitions, instant);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20620);if ((((i >= 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20621)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20622)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20623);if ((((instant > Long.MIN_VALUE)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20624)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20625)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20626);return instant - 1;
                }
                }__CLR4_4_1f72f72lc8aztr5.R.inc(20627);return instant;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20628);i = ~i;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20629);if ((((i < transitions.length)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20630)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20631)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20632);if ((((i > 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20633)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20634)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20635);long prev = transitions[i - 1];
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20636);if ((((prev > Long.MIN_VALUE)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20637)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20638)==0&false))) {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20639);return prev - 1;
                    }
                }}
                }__CLR4_4_1f72f72lc8aztr5.R.inc(20640);return instant;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20641);if ((((iTailZone != null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20642)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20643)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20644);long prev = iTailZone.previousTransition(instant);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20645);if ((((prev < instant)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20646)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20647)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20648);return prev;
                }
            }}
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20649);long prev = transitions[i - 1];
            __CLR4_4_1f72f72lc8aztr5.R.inc(20650);if ((((prev > Long.MIN_VALUE)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20651)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20652)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20653);return prev - 1;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20654);return instant;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public boolean equals(Object obj) {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20655);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20656);if ((((this == obj)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20657)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20658)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20659);return true;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20660);if ((((obj instanceof PrecalculatedZone)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20661)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20662)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20663);PrecalculatedZone other = (PrecalculatedZone)obj;
                __CLR4_4_1f72f72lc8aztr5.R.inc(20664);return
                    getID().equals(other.getID()) &&
                    Arrays.equals(iTransitions, other.iTransitions) &&
                    Arrays.equals(iNameKeys, other.iNameKeys) &&
                    Arrays.equals(iWallOffsets, other.iWallOffsets) &&
                    Arrays.equals(iStandardOffsets, other.iStandardOffsets) &&
                    (((((iTailZone == null)
                     )&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20665)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20666)==0&false))? (null == other.iTailZone)
                     : (iTailZone.equals(other.iTailZone)));
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20667);return false;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public void writeTo(DataOutput out) throws IOException {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20668);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20669);int size = iTransitions.length;

            // Create unique string pool.
            __CLR4_4_1f72f72lc8aztr5.R.inc(20670);Set<String> poolSet = new HashSet<String>();
            __CLR4_4_1f72f72lc8aztr5.R.inc(20671);for (int i=0; (((i<size)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20672)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20673)==0&false)); i++) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20674);poolSet.add(iNameKeys[i]);
            }

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20675);int poolSize = poolSet.size();
            __CLR4_4_1f72f72lc8aztr5.R.inc(20676);if ((((poolSize > 65535)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20677)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20678)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20679);throw new UnsupportedOperationException("String pool is too large");
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20680);String[] pool = new String[poolSize];
            __CLR4_4_1f72f72lc8aztr5.R.inc(20681);Iterator<String> it = poolSet.iterator();
            __CLR4_4_1f72f72lc8aztr5.R.inc(20682);for (int i=0; (((it.hasNext())&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20683)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20684)==0&false)); i++) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20685);pool[i] = it.next();
            }

            // Write out the pool.
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20686);out.writeShort(poolSize);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20687);for (int i=0; (((i<poolSize)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20688)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20689)==0&false)); i++) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20690);out.writeUTF(pool[i]);
            }

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20691);out.writeInt(size);

            __CLR4_4_1f72f72lc8aztr5.R.inc(20692);for (int i=0; (((i<size)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20693)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20694)==0&false)); i++) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20695);writeMillis(out, iTransitions[i]);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20696);writeMillis(out, iWallOffsets[i]);
                __CLR4_4_1f72f72lc8aztr5.R.inc(20697);writeMillis(out, iStandardOffsets[i]);
                
                // Find pool index and write it out.
                __CLR4_4_1f72f72lc8aztr5.R.inc(20698);String nameKey = iNameKeys[i];
                __CLR4_4_1f72f72lc8aztr5.R.inc(20699);for (int j=0; (((j<poolSize)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20700)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20701)==0&false)); j++) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20702);if ((((pool[j].equals(nameKey))&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20703)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20704)==0&false))) {{
                        __CLR4_4_1f72f72lc8aztr5.R.inc(20705);if ((((poolSize < 256)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20706)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20707)==0&false))) {{
                            __CLR4_4_1f72f72lc8aztr5.R.inc(20708);out.writeByte(j);
                        } }else {{
                            __CLR4_4_1f72f72lc8aztr5.R.inc(20709);out.writeShort(j);
                        }
                        }__CLR4_4_1f72f72lc8aztr5.R.inc(20710);break;
                    }
                }}
            }}

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20711);out.writeBoolean(iTailZone != null);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20712);if ((((iTailZone != null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20713)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20714)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20715);iTailZone.writeTo(out);
            }
        }}finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}

        public boolean isCachable() {try{__CLR4_4_1f72f72lc8aztr5.R.inc(20716);
            __CLR4_4_1f72f72lc8aztr5.R.inc(20717);if ((((iTailZone != null)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20718)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20719)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20720);return true;
            }
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20721);long[] transitions = iTransitions;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20722);if ((((transitions.length <= 1)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20723)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20724)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20725);return false;
            }

            // Add up all the distances between transitions that are less than
            // about two years.
            }__CLR4_4_1f72f72lc8aztr5.R.inc(20726);double distances = 0;
            __CLR4_4_1f72f72lc8aztr5.R.inc(20727);int count = 0;

            __CLR4_4_1f72f72lc8aztr5.R.inc(20728);for (int i=1; (((i<transitions.length)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20729)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20730)==0&false)); i++) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20731);long diff = transitions[i] - transitions[i - 1];
                __CLR4_4_1f72f72lc8aztr5.R.inc(20732);if ((((diff < ((366L + 365) * 24 * 60 * 60 * 1000))&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20733)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20734)==0&false))) {{
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20735);distances += (double)diff;
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20736);count++;
                }
            }}

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20737);if ((((count > 0)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20738)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20739)==0&false))) {{
                __CLR4_4_1f72f72lc8aztr5.R.inc(20740);double avg = distances / count;
                __CLR4_4_1f72f72lc8aztr5.R.inc(20741);avg /= 24 * 60 * 60 * 1000;
                __CLR4_4_1f72f72lc8aztr5.R.inc(20742);if ((((avg >= 25)&&(__CLR4_4_1f72f72lc8aztr5.R.iget(20743)!=0|true))||(__CLR4_4_1f72f72lc8aztr5.R.iget(20744)==0&false))) {{
                    // Only bother caching if average distance between
                    // transitions is at least 25 days. Why 25?
                    // CachedDateTimeZone is more efficient if the distance
                    // between transitions is large. With an average of 25, it
                    // will on average perform about 2 tests per cache
                    // hit. (49.7 / 25) is approximately 2.
                    __CLR4_4_1f72f72lc8aztr5.R.inc(20745);return true;
                }
            }}

            }__CLR4_4_1f72f72lc8aztr5.R.inc(20746);return false;
        }finally{__CLR4_4_1f72f72lc8aztr5.R.flushNeeded();}}
    }
}
