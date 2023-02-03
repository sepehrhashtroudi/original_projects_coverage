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
package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;

/**
 * DateTimeZone represents a time zone.
 * <p>
 * A time zone is a system of rules to convert time from one geographic 
 * location to another. For example, Paris, France is one hour ahead of
 * London, England. Thus when it is 10:00 in London, it is 11:00 in Paris.
 * <p>
 * All time zone rules are expressed, for historical reasons, relative to
 * Greenwich, London. Local time in Greenwich is referred to as Greenwich Mean
 * Time (GMT).  This is similar, but not precisely identical, to Universal 
 * Coordinated Time, or UTC. This library only uses the term UTC.
 * <p>
 * Using this system, America/Los_Angeles is expressed as UTC-08:00, or UTC-07:00
 * in the summer. The offset -08:00 indicates that America/Los_Angeles time is
 * obtained from UTC by adding -08:00, that is, by subtracting 8 hours.
 * <p>
 * The offset differs in the summer because of daylight saving time, or DST.
 * The following definitions of time are generally used:
 * <ul>
 * <li>UTC - The reference time.
 * <li>Standard Time - The local time without a daylight saving time offset.
 * For example, in Paris, standard time is UTC+01:00.
 * <li>Daylight Saving Time - The local time with a daylight saving time 
 * offset. This offset is typically one hour, but not always. It is typically
 * used in most countries away from the equator.  In Paris, daylight saving 
 * time is UTC+02:00.
 * <li>Wall Time - This is what a local clock on the wall reads. This will be
 * either Standard Time or Daylight Saving Time depending on the time of year
 * and whether the location uses Daylight Saving Time.
 * </ul>
 * <p>
 * Unlike the Java TimeZone class, DateTimeZone is immutable. It also only
 * supports long format time zone ids. Thus EST and ECT are not accepted.
 * However, the factory that accepts a TimeZone will attempt to convert from
 * the old short id to a suitable long id.
 * <p>
 * DateTimeZone is thread-safe and immutable, and all subclasses must be as
 * well.
 * 
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class DateTimeZone implements Serializable {public static class __CLR4_4_1vxvxlc8azrt1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,1681,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /** Serialization version. */
    private static final long serialVersionUID = 5546345482340108586L;

    /** The time zone for Universal Coordinated Time */
    public static final DateTimeZone UTC = new FixedDateTimeZone("UTC", "UTC", 0, 0);
    /** Maximum offset. */
    private static final int MAX_MILLIS = (86400 * 1000) - 1;

    /** The instance that is providing time zones. */
    private static Provider cProvider;
    /** The instance that is providing time zone names. */
    private static NameProvider cNameProvider;
    /** The set of ID strings. */
    private static Set<String> cAvailableIDs;
    /** The default time zone. */
    private static volatile DateTimeZone cDefault;
    /** A formatter for printing and parsing zones. */
    private static DateTimeFormatter cOffsetFormatter;

    /** Cache that maps fixed offset strings to softly referenced DateTimeZones */
    private static Map<String, SoftReference<DateTimeZone>> iFixedOffsetCache;

    /** Cache of old zone IDs to new zone IDs */
    private static Map<String, String> cZoneIdConversion;

    static {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1149);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1150);setProvider0(null);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1151);setNameProvider0(null);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the default time zone.
     * <p>
     * The default time zone is derived from the system property {@code user.timezone}.
     * If that is {@code null} or is not a valid identifier, then the value of the
     * JDK {@code TimeZone} default is converted. If that fails, {@code UTC} is used.
     * <p>
     * NOTE: If the {@code java.util.TimeZone} default is updated <i>after</i> calling this
     * method, then the change will not be picked up here.
     * 
     * @return the default datetime zone object
     */
    public static DateTimeZone getDefault() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1152);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1153);DateTimeZone zone = cDefault;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1154);if ((((zone == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1155)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1156)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1157);synchronized(DateTimeZone.class) {
                __CLR4_4_1vxvxlc8azrt1.R.inc(1158);zone = cDefault;
                __CLR4_4_1vxvxlc8azrt1.R.inc(1159);if ((((zone == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1160)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1161)==0&false))) {{
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1162);DateTimeZone temp = null;
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1163);try {
                        __CLR4_4_1vxvxlc8azrt1.R.inc(1164);try {
                            __CLR4_4_1vxvxlc8azrt1.R.inc(1165);String id = System.getProperty("user.timezone");
                            __CLR4_4_1vxvxlc8azrt1.R.inc(1166);if ((((id != null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1167)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1168)==0&false))) {{  // null check avoids stack overflow
                                __CLR4_4_1vxvxlc8azrt1.R.inc(1169);temp = forID(id);
                            }
                        }} catch (RuntimeException ex) {
                            // ignored
                        }
                        __CLR4_4_1vxvxlc8azrt1.R.inc(1170);if ((((temp == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1171)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1172)==0&false))) {{
                            __CLR4_4_1vxvxlc8azrt1.R.inc(1173);temp = forTimeZone(TimeZone.getDefault());
                        }
                    }} catch (IllegalArgumentException ex) {
                        // ignored
                    }
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1174);if ((((temp == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1175)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1176)==0&false))) {{
                        __CLR4_4_1vxvxlc8azrt1.R.inc(1177);temp = UTC;
                    }
                    }__CLR4_4_1vxvxlc8azrt1.R.inc(1178);cDefault = zone = temp;
                }
            }}
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1179);return zone;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Sets the default time zone.
     * <p>
     * NOTE: Calling this method does <i>not</i> set the {@code java.util.TimeZone} default.
     * 
     * @param zone  the default datetime zone object, must not be null
     * @throws IllegalArgumentException if the zone is null
     * @throws SecurityException if the application has insufficient security rights
     */
    public static void setDefault(DateTimeZone zone) throws SecurityException {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1180);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1181);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_1vxvxlc8azrt1.R.inc(1182);if ((((sm != null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1183)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1184)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1185);sm.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1186);if ((((zone == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1187)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1188)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1189);throw new IllegalArgumentException("The datetime zone must not be null");
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1190);synchronized(DateTimeZone.class) {
            __CLR4_4_1vxvxlc8azrt1.R.inc(1191);cDefault = zone;
        }
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets a time zone instance for the specified time zone id.
     * <p>
     * The time zone id may be one of those returned by getAvailableIDs.
     * Short ids, as accepted by {@link java.util.TimeZone}, are not accepted.
     * All IDs must be specified in the long format.
     * The exception is UTC, which is an acceptable id.
     * <p>
     * Alternatively a locale independent, fixed offset, datetime zone can
     * be specified. The form <code>[+-]hh:mm</code> can be used.
     * 
     * @param id  the ID of the datetime zone, null means default
     * @return the DateTimeZone object for the ID
     * @throws IllegalArgumentException if the ID is not recognised
     */
    @FromString
    public static DateTimeZone forID(String id) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1192);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1193);if ((((id == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1194)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1195)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1196);return getDefault();
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1197);if ((((id.equals("UTC"))&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1198)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1199)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1200);return DateTimeZone.UTC;
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1201);DateTimeZone zone = cProvider.getZone(id);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1202);if ((((zone != null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1203)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1204)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1205);return zone;
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1206);if ((((id.startsWith("+") || id.startsWith("-"))&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1207)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1208)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1209);int offset = parseOffset(id);
            __CLR4_4_1vxvxlc8azrt1.R.inc(1210);if ((((offset == 0L)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1211)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1212)==0&false))) {{
                __CLR4_4_1vxvxlc8azrt1.R.inc(1213);return DateTimeZone.UTC;
            } }else {{
                __CLR4_4_1vxvxlc8azrt1.R.inc(1214);id = printOffset(offset);
                __CLR4_4_1vxvxlc8azrt1.R.inc(1215);return fixedOffsetZone(id, offset);
            }
        }}
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1216);throw new IllegalArgumentException("The datetime zone id '" + id + "' is not recognised");
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets a time zone instance for the specified offset to UTC in hours.
     * This method assumes standard length hours.
     * <p>
     * This factory is a convenient way of constructing zones with a fixed offset.
     * 
     * @param hoursOffset  the offset in hours from UTC, from -23 to +23
     * @return the DateTimeZone object for the offset
     * @throws IllegalArgumentException if the offset is too large or too small
     */
    public static DateTimeZone forOffsetHours(int hoursOffset) throws IllegalArgumentException {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1217);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1218);return forOffsetHoursMinutes(hoursOffset, 0);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets a time zone instance for the specified offset to UTC in hours and minutes.
     * This method assumes 60 minutes in an hour, and standard length minutes.
     * <p>
     * This factory is a convenient way of constructing zones with a fixed offset.
     * The hours value must be in the range -23 to +23.
     * The minutes value must be in the range -59 to +59.
     * The following combinations of sign for the hour and minute are possible:
     * <pre>
     *  Hour    Minute    Example    Result
     * 
     *  +ve     +ve       (2, 15)    +02:15
     *  +ve     zero      (2, 0)     +02:00
     *  +ve     -ve       (2, -15)   IllegalArgumentException
     * 
     *  zero    +ve       (0, 15)    +00:15
     *  zero    zero      (0, 0)     +00:00
     *  zero    -ve       (0, -15)   -00:15
     * 
     *  -ve     +ve       (-2, 15)   -02:15
     *  -ve     zero      (-2, 0)    -02:00
     *  -ve     -ve       (-2, -15)  -02:15
     * </pre>
     * Note that in versions before 2.3, the minutes had to be zero or positive.
     * 
     * @param hoursOffset  the offset in hours from UTC, from -23 to +23
     * @param minutesOffset  the offset in minutes from UTC, from -59 to +59
     * @return the DateTimeZone object for the offset
     * @throws IllegalArgumentException if any value is out of range, the minutes are negative
     *  when the hours are positive, or the resulting offset exceeds +/- 23:59:59.000
     */
    public static DateTimeZone forOffsetHoursMinutes(int hoursOffset, int minutesOffset) throws IllegalArgumentException {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1219);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1220);if ((((hoursOffset == 0 && minutesOffset == 0)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1221)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1222)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1223);return DateTimeZone.UTC;
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1224);if ((((hoursOffset < -23 || hoursOffset > 23)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1225)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1226)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1227);throw new IllegalArgumentException("Hours out of range: " + hoursOffset);
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1228);if ((((minutesOffset < -59 || minutesOffset > 59)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1229)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1230)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1231);throw new IllegalArgumentException("Minutes out of range: " + minutesOffset);
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1232);if ((((hoursOffset > 0 && minutesOffset < 0)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1233)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1234)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1235);throw new IllegalArgumentException("Positive hours must not have negative minutes: " + minutesOffset);
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1236);int offset = 0;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1237);try {
            __CLR4_4_1vxvxlc8azrt1.R.inc(1238);int hoursInMinutes = hoursOffset * 60;
            __CLR4_4_1vxvxlc8azrt1.R.inc(1239);if ((((hoursInMinutes < 0)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1240)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1241)==0&false))) {{
                __CLR4_4_1vxvxlc8azrt1.R.inc(1242);minutesOffset = hoursInMinutes - Math.abs(minutesOffset);
            } }else {{
                __CLR4_4_1vxvxlc8azrt1.R.inc(1243);minutesOffset = hoursInMinutes + minutesOffset;
            }
            }__CLR4_4_1vxvxlc8azrt1.R.inc(1244);offset = FieldUtils.safeMultiply(minutesOffset, DateTimeConstants.MILLIS_PER_MINUTE);
        } catch (ArithmeticException ex) {
            __CLR4_4_1vxvxlc8azrt1.R.inc(1245);throw new IllegalArgumentException("Offset is too large");
        }
        __CLR4_4_1vxvxlc8azrt1.R.inc(1246);return forOffsetMillis(offset);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets a time zone instance for the specified offset to UTC in milliseconds.
     *
     * @param millisOffset  the offset in millis from UTC, from -23:59:59.999 to +23:59:59.999
     * @return the DateTimeZone object for the offset
     */
    public static DateTimeZone forOffsetMillis(int millisOffset) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1247);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1248);if ((((millisOffset < -MAX_MILLIS || millisOffset > MAX_MILLIS)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1249)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1250)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1251);throw new IllegalArgumentException("Millis out of range: " + millisOffset);
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1252);String id = printOffset(millisOffset);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1253);return fixedOffsetZone(id, millisOffset);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets a time zone instance for a JDK TimeZone.
     * <p>
     * DateTimeZone only accepts a subset of the IDs from TimeZone. The
     * excluded IDs are the short three letter form (except UTC). This 
     * method will attempt to convert between time zones created using the
     * short IDs and the full version.
     * <p>
     * This method is not designed to parse time zones with rules created by
     * applications using <code>SimpleTimeZone</code> directly.
     * 
     * @param zone  the zone to convert, null means default
     * @return the DateTimeZone object for the zone
     * @throws IllegalArgumentException if the zone is not recognised
     */
    public static DateTimeZone forTimeZone(TimeZone zone) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1254);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1255);if ((((zone == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1256)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1257)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1258);return getDefault();
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1259);final String id = zone.getID();
        __CLR4_4_1vxvxlc8azrt1.R.inc(1260);if ((((id.equals("UTC"))&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1261)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1262)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1263);return DateTimeZone.UTC;
        }

        // Convert from old alias before consulting provider since they may differ.
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1264);DateTimeZone dtz = null;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1265);String convId = getConvertedId(id);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1266);if ((((convId != null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1267)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1268)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1269);dtz = cProvider.getZone(convId);
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1270);if ((((dtz == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1271)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1272)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1273);dtz = cProvider.getZone(id);
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1274);if ((((dtz != null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1275)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1276)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1277);return dtz;
        }

        // Support GMT+/-hh:mm formats
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1278);if ((((convId == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1279)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1280)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1281);convId = zone.getID();
            __CLR4_4_1vxvxlc8azrt1.R.inc(1282);if ((((convId.startsWith("GMT+") || convId.startsWith("GMT-"))&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1283)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1284)==0&false))) {{
                __CLR4_4_1vxvxlc8azrt1.R.inc(1285);convId = convId.substring(3);
                __CLR4_4_1vxvxlc8azrt1.R.inc(1286);int offset = parseOffset(convId);
                __CLR4_4_1vxvxlc8azrt1.R.inc(1287);if ((((offset == 0L)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1288)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1289)==0&false))) {{
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1290);return DateTimeZone.UTC;
                } }else {{
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1291);convId = printOffset(offset);
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1292);return fixedOffsetZone(convId, offset);
                }
            }}
        }}
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1293);throw new IllegalArgumentException("The datetime zone id '" + id + "' is not recognised");
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the zone using a fixed offset amount.
     * 
     * @param id  the zone id
     * @param offset  the offset in millis
     * @return the zone
     */
    private static synchronized DateTimeZone fixedOffsetZone(String id, int offset) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1294);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1295);if ((((offset == 0)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1296)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1297)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1298);return DateTimeZone.UTC;
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1299);if ((((iFixedOffsetCache == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1300)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1301)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1302);iFixedOffsetCache = new HashMap<String, SoftReference<DateTimeZone>>();
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1303);DateTimeZone zone;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1304);Reference<DateTimeZone> ref = iFixedOffsetCache.get(id);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1305);if ((((ref != null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1306)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1307)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1308);zone = ref.get();
            __CLR4_4_1vxvxlc8azrt1.R.inc(1309);if ((((zone != null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1310)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1311)==0&false))) {{
                __CLR4_4_1vxvxlc8azrt1.R.inc(1312);return zone;
            }
        }}
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1313);zone = new FixedDateTimeZone(id, null, offset, offset);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1314);iFixedOffsetCache.put(id, new SoftReference<DateTimeZone>(zone));
        __CLR4_4_1vxvxlc8azrt1.R.inc(1315);return zone;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets all the available IDs supported.
     * 
     * @return an unmodifiable Set of String IDs
     */
    public static Set<String> getAvailableIDs() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1316);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1317);return cAvailableIDs;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the zone provider factory.
     * <p>
     * The zone provider is a pluggable instance factory that supplies the
     * actual instances of DateTimeZone.
     * 
     * @return the provider
     */
    public static Provider getProvider() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1318);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1319);return cProvider;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Sets the zone provider factory.
     * <p>
     * The zone provider is a pluggable instance factory that supplies the
     * actual instances of DateTimeZone.
     * 
     * @param provider  provider to use, or null for default
     * @throws SecurityException if you do not have the permission DateTimeZone.setProvider
     * @throws IllegalArgumentException if the provider is invalid
     */
    public static void setProvider(Provider provider) throws SecurityException {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1320);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1321);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_1vxvxlc8azrt1.R.inc(1322);if ((((sm != null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1323)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1324)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1325);sm.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1326);setProvider0(provider);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Sets the zone provider factory without performing the security check.
     * 
     * @param provider  provider to use, or null for default
     * @throws IllegalArgumentException if the provider is invalid
     */
    private static void setProvider0(Provider provider) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1327);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1328);if ((((provider == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1329)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1330)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1331);provider = getDefaultProvider();
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1332);Set<String> ids = provider.getAvailableIDs();
        __CLR4_4_1vxvxlc8azrt1.R.inc(1333);if ((((ids == null || ids.size() == 0)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1334)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1335)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1336);throw new IllegalArgumentException
                ("The provider doesn't have any available ids");
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1337);if ((((!ids.contains("UTC"))&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1338)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1339)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1340);throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1341);if ((((!UTC.equals(provider.getZone("UTC")))&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1342)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1343)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1344);throw new IllegalArgumentException("Invalid UTC zone provided");
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1345);cProvider = provider;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1346);cAvailableIDs = ids;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets the default zone provider.
     * <p>
     * Tries the system property <code>org.joda.time.DateTimeZone.Provider</code>.
     * Then tries a <code>ZoneInfoProvider</code> using the data in <code>org/joda/time/tz/data</code>.
     * Then uses <code>UTCProvider</code>.
     * 
     * @return the default name provider
     */
    private static Provider getDefaultProvider() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1347);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1348);Provider provider = null;

        __CLR4_4_1vxvxlc8azrt1.R.inc(1349);try {
            __CLR4_4_1vxvxlc8azrt1.R.inc(1350);String providerClass = System.getProperty("org.joda.time.DateTimeZone.Provider");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1351);if ((((providerClass != null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1352)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1353)==0&false))) {{
                __CLR4_4_1vxvxlc8azrt1.R.inc(1354);try {
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1355);provider = (Provider) Class.forName(providerClass).newInstance();
                } catch (Exception ex) {
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1356);throw new RuntimeException(ex);
                }
            }
        }} catch (SecurityException ex) {
            // ignored
        }

        __CLR4_4_1vxvxlc8azrt1.R.inc(1357);if ((((provider == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1358)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1359)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1360);try {
                __CLR4_4_1vxvxlc8azrt1.R.inc(1361);provider = new ZoneInfoProvider("org/joda/time/tz/data");
            } catch (Exception ex) {
                __CLR4_4_1vxvxlc8azrt1.R.inc(1362);ex.printStackTrace();
            }
        }

        }__CLR4_4_1vxvxlc8azrt1.R.inc(1363);if ((((provider == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1364)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1365)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1366);provider = new UTCProvider();
        }

        }__CLR4_4_1vxvxlc8azrt1.R.inc(1367);return provider;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the name provider factory.
     * <p>
     * The name provider is a pluggable instance factory that supplies the
     * names of each DateTimeZone.
     * 
     * @return the provider
     */
    public static NameProvider getNameProvider() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1368);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1369);return cNameProvider;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Sets the name provider factory.
     * <p>
     * The name provider is a pluggable instance factory that supplies the
     * names of each DateTimeZone.
     * 
     * @param nameProvider  provider to use, or null for default
     * @throws SecurityException if you do not have the permission DateTimeZone.setNameProvider
     * @throws IllegalArgumentException if the provider is invalid
     */
    public static void setNameProvider(NameProvider nameProvider) throws SecurityException {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1370);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1371);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_1vxvxlc8azrt1.R.inc(1372);if ((((sm != null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1373)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1374)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1375);sm.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1376);setNameProvider0(nameProvider);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Sets the name provider factory without performing the security check.
     * 
     * @param nameProvider  provider to use, or null for default
     * @throws IllegalArgumentException if the provider is invalid
     */
    private static void setNameProvider0(NameProvider nameProvider) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1377);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1378);if ((((nameProvider == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1379)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1380)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1381);nameProvider = getDefaultNameProvider();
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1382);cNameProvider = nameProvider;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets the default name provider.
     * <p>
     * Tries the system property <code>org.joda.time.DateTimeZone.NameProvider</code>.
     * Then uses <code>DefaultNameProvider</code>.
     * 
     * @return the default name provider
     */
    private static NameProvider getDefaultNameProvider() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1383);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1384);NameProvider nameProvider = null;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1385);try {
            __CLR4_4_1vxvxlc8azrt1.R.inc(1386);String providerClass = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1387);if ((((providerClass != null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1388)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1389)==0&false))) {{
                __CLR4_4_1vxvxlc8azrt1.R.inc(1390);try {
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1391);nameProvider = (NameProvider) Class.forName(providerClass).newInstance();
                } catch (Exception ex) {
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1392);throw new RuntimeException(ex);
                }
            }
        }} catch (SecurityException ex) {
            // ignore
        }

        __CLR4_4_1vxvxlc8azrt1.R.inc(1393);if ((((nameProvider == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1394)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1395)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1396);nameProvider = new DefaultNameProvider();
        }

        }__CLR4_4_1vxvxlc8azrt1.R.inc(1397);return nameProvider;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Converts an old style id to a new style id.
     * 
     * @param id  the old style id
     * @return the new style id, null if not found
     */
    private static synchronized String getConvertedId(String id) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1398);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1399);Map<String, String> map = cZoneIdConversion;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1400);if ((((map == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1401)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1402)==0&false))) {{
            // Backwards compatibility with TimeZone.
            __CLR4_4_1vxvxlc8azrt1.R.inc(1403);map = new HashMap<String, String>();
            __CLR4_4_1vxvxlc8azrt1.R.inc(1404);map.put("GMT", "UTC");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1405);map.put("WET", "WET");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1406);map.put("CET", "CET");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1407);map.put("MET", "CET");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1408);map.put("ECT", "CET");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1409);map.put("EET", "EET");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1410);map.put("MIT", "Pacific/Apia");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1411);map.put("HST", "Pacific/Honolulu");  // JDK 1.1 compatible
            __CLR4_4_1vxvxlc8azrt1.R.inc(1412);map.put("AST", "America/Anchorage");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1413);map.put("PST", "America/Los_Angeles");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1414);map.put("MST", "America/Denver");  // JDK 1.1 compatible
            __CLR4_4_1vxvxlc8azrt1.R.inc(1415);map.put("PNT", "America/Phoenix");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1416);map.put("CST", "America/Chicago");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1417);map.put("EST", "America/New_York");  // JDK 1.1 compatible
            __CLR4_4_1vxvxlc8azrt1.R.inc(1418);map.put("IET", "America/Indiana/Indianapolis");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1419);map.put("PRT", "America/Puerto_Rico");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1420);map.put("CNT", "America/St_Johns");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1421);map.put("AGT", "America/Argentina/Buenos_Aires");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1422);map.put("BET", "America/Sao_Paulo");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1423);map.put("ART", "Africa/Cairo");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1424);map.put("CAT", "Africa/Harare");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1425);map.put("EAT", "Africa/Addis_Ababa");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1426);map.put("NET", "Asia/Yerevan");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1427);map.put("PLT", "Asia/Karachi");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1428);map.put("IST", "Asia/Kolkata");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1429);map.put("BST", "Asia/Dhaka");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1430);map.put("VST", "Asia/Ho_Chi_Minh");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1431);map.put("CTT", "Asia/Shanghai");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1432);map.put("JST", "Asia/Tokyo");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1433);map.put("ACT", "Australia/Darwin");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1434);map.put("AET", "Australia/Sydney");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1435);map.put("SST", "Pacific/Guadalcanal");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1436);map.put("NST", "Pacific/Auckland");
            __CLR4_4_1vxvxlc8azrt1.R.inc(1437);cZoneIdConversion = map;
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1438);return map.get(id);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    private static int parseOffset(String str) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1439);
        // Can't use a real chronology if called during class
        // initialization. Offset parser doesn't need it anyhow.
        __CLR4_4_1vxvxlc8azrt1.R.inc(1440);Chronology chrono = new BaseChronology() {
            private static final long serialVersionUID = -3128740902654445468L;
            public DateTimeZone getZone() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1441);
                __CLR4_4_1vxvxlc8azrt1.R.inc(1442);return null;
            }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}
            public Chronology withUTC() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1443);
                __CLR4_4_1vxvxlc8azrt1.R.inc(1444);return this;
            }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}
            public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1445);
                __CLR4_4_1vxvxlc8azrt1.R.inc(1446);return this;
            }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}
            public String toString() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1447);
                __CLR4_4_1vxvxlc8azrt1.R.inc(1448);return getClass().getName();
            }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}
        };
        __CLR4_4_1vxvxlc8azrt1.R.inc(1449);return -(int) offsetFormatter().withChronology(chrono).parseMillis(str);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Formats a timezone offset string.
     * <p>
     * This method is kept separate from the formatting classes to speed and
     * simplify startup and classloading.
     * 
     * @param offset  the offset in milliseconds
     * @return the time zone string
     */
    private static String printOffset(int offset) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1450);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1451);StringBuffer buf = new StringBuffer();
        __CLR4_4_1vxvxlc8azrt1.R.inc(1452);if ((((offset >= 0)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1453)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1454)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1455);buf.append('+');
        } }else {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1456);buf.append('-');
            __CLR4_4_1vxvxlc8azrt1.R.inc(1457);offset = -offset;
        }

        }__CLR4_4_1vxvxlc8azrt1.R.inc(1458);int hours = offset / DateTimeConstants.MILLIS_PER_HOUR;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1459);FormatUtils.appendPaddedInteger(buf, hours, 2);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1460);offset -= hours * (int) DateTimeConstants.MILLIS_PER_HOUR;

        __CLR4_4_1vxvxlc8azrt1.R.inc(1461);int minutes = offset / DateTimeConstants.MILLIS_PER_MINUTE;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1462);buf.append(':');
        __CLR4_4_1vxvxlc8azrt1.R.inc(1463);FormatUtils.appendPaddedInteger(buf, minutes, 2);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1464);offset -= minutes * DateTimeConstants.MILLIS_PER_MINUTE;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1465);if ((((offset == 0)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1466)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1467)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1468);return buf.toString();
        }

        }__CLR4_4_1vxvxlc8azrt1.R.inc(1469);int seconds = offset / DateTimeConstants.MILLIS_PER_SECOND;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1470);buf.append(':');
        __CLR4_4_1vxvxlc8azrt1.R.inc(1471);FormatUtils.appendPaddedInteger(buf, seconds, 2);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1472);offset -= seconds * DateTimeConstants.MILLIS_PER_SECOND;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1473);if ((((offset == 0)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1474)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1475)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1476);return buf.toString();
        }

        }__CLR4_4_1vxvxlc8azrt1.R.inc(1477);buf.append('.');
        __CLR4_4_1vxvxlc8azrt1.R.inc(1478);FormatUtils.appendPaddedInteger(buf, offset, 3);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1479);return buf.toString();
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets a printer/parser for managing the offset id formatting.
     * 
     * @return the formatter
     */
    private static synchronized DateTimeFormatter offsetFormatter() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1480);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1481);if ((((cOffsetFormatter == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1482)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1483)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1484);cOffsetFormatter = new DateTimeFormatterBuilder()
                .appendTimeZoneOffset(null, true, 2, 4)
                .toFormatter();
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1485);return cOffsetFormatter;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    // Instance fields and methods
    //--------------------------------------------------------------------

    private final String iID;

    /**
     * Constructor.
     * 
     * @param id  the id to use
     * @throws IllegalArgumentException if the id is null
     */
    protected DateTimeZone(String id) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1486);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1487);if ((((id == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1488)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1489)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1490);throw new IllegalArgumentException("Id must not be null");
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1491);iID = id;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    // Principal methods
    //--------------------------------------------------------------------

    /**
     * Gets the ID of this datetime zone.
     * 
     * @return the ID of this datetime zone
     */
    @ToString
    public final String getID() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1492);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1493);return iID;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Returns a non-localized name that is unique to this time zone. It can be
     * combined with id to form a unique key for fetching localized names.
     *
     * @param instant  milliseconds from 1970-01-01T00:00:00Z to get the name for
     * @return name key or null if id should be used for names
     */
    public abstract String getNameKey(long instant);

    /**
     * Gets the short name of this datetime zone suitable for display using
     * the default locale.
     * <p>
     * If the name is not available for the locale, then this method returns a
     * string in the format <code>[+-]hh:mm</code>.
     * 
     * @param instant  milliseconds from 1970-01-01T00:00:00Z to get the name for
     * @return the human-readable short name in the default locale
     */
    public final String getShortName(long instant) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1494);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1495);return getShortName(instant, null);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets the short name of this datetime zone suitable for display using
     * the specified locale.
     * <p>
     * If the name is not available for the locale, then this method returns a
     * string in the format <code>[+-]hh:mm</code>.
     * 
     * @param instant  milliseconds from 1970-01-01T00:00:00Z to get the name for
     * @param locale  the locale to get the name for
     * @return the human-readable short name in the specified locale
     */
    public String getShortName(long instant, Locale locale) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1496);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1497);if ((((locale == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1498)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1499)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1500);locale = Locale.getDefault();
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1501);String nameKey = getNameKey(instant);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1502);if ((((nameKey == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1503)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1504)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1505);return iID;
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1506);String name = cNameProvider.getShortName(locale, iID, nameKey);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1507);if ((((name != null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1508)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1509)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1510);return name;
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1511);return printOffset(getOffset(instant));
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets the long name of this datetime zone suitable for display using
     * the default locale.
     * <p>
     * If the name is not available for the locale, then this method returns a
     * string in the format <code>[+-]hh:mm</code>.
     * 
     * @param instant  milliseconds from 1970-01-01T00:00:00Z to get the name for
     * @return the human-readable long name in the default locale
     */
    public final String getName(long instant) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1512);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1513);return getName(instant, null);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets the long name of this datetime zone suitable for display using
     * the specified locale.
     * <p>
     * If the name is not available for the locale, then this method returns a
     * string in the format <code>[+-]hh:mm</code>.
     * 
     * @param instant  milliseconds from 1970-01-01T00:00:00Z to get the name for
     * @param locale  the locale to get the name for
     * @return the human-readable long name in the specified locale
     */
    public String getName(long instant, Locale locale) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1514);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1515);if ((((locale == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1516)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1517)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1518);locale = Locale.getDefault();
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1519);String nameKey = getNameKey(instant);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1520);if ((((nameKey == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1521)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1522)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1523);return iID;
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1524);String name = cNameProvider.getName(locale, iID, nameKey);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1525);if ((((name != null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1526)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1527)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1528);return name;
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1529);return printOffset(getOffset(instant));
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets the millisecond offset to add to UTC to get local time.
     * 
     * @param instant  milliseconds from 1970-01-01T00:00:00Z to get the offset for
     * @return the millisecond offset to add to UTC to get local time
     */
    public abstract int getOffset(long instant);

    /**
     * Gets the millisecond offset to add to UTC to get local time.
     * 
     * @param instant  instant to get the offset for, null means now
     * @return the millisecond offset to add to UTC to get local time
     */
    public final int getOffset(ReadableInstant instant) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1530);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1531);if ((((instant == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1532)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1533)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1534);return getOffset(DateTimeUtils.currentTimeMillis());
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1535);return getOffset(instant.getMillis());
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets the standard millisecond offset to add to UTC to get local time,
     * when standard time is in effect.
     * 
     * @param instant  milliseconds from 1970-01-01T00:00:00Z to get the offset for
     * @return the millisecond offset to add to UTC to get local time
     */
    public abstract int getStandardOffset(long instant);

    /**
     * Checks whether, at a particular instant, the offset is standard or not.
     * <p>
     * This method can be used to determine whether Summer Time (DST) applies.
     * As a general rule, if the offset at the specified instant is standard,
     * then either Winter time applies, or there is no Summer Time. If the
     * instant is not standard, then Summer Time applies.
     * <p>
     * The implementation of the method is simply whether {@link #getOffset(long)}
     * equals {@link #getStandardOffset(long)} at the specified instant.
     * 
     * @param instant  milliseconds from 1970-01-01T00:00:00Z to get the offset for
     * @return true if the offset at the given instant is the standard offset
     * @since 1.5
     */
    public boolean isStandardOffset(long instant) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1536);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1537);return getOffset(instant) == getStandardOffset(instant);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets the millisecond offset to subtract from local time to get UTC time.
     * This offset can be used to undo adding the offset obtained by getOffset.
     *
     * <pre>
     * millisLocal == millisUTC   + getOffset(millisUTC)
     * millisUTC   == millisLocal - getOffsetFromLocal(millisLocal)
     * </pre>
     *
     * NOTE: After calculating millisLocal, some error may be introduced. At
     * offset transitions (due to DST or other historical changes), ranges of
     * local times may map to different UTC times.
     * <p>
     * This method will return an offset suitable for calculating an instant
     * after any DST gap. For example, consider a zone with a cutover
     * from 01:00 to 01:59:<br />
     * Input: 00:00  Output: 00:00<br />
     * Input: 00:30  Output: 00:30<br />
     * Input: 01:00  Output: 02:00<br />
     * Input: 01:30  Output: 02:30<br />
     * Input: 02:00  Output: 02:00<br />
     * Input: 02:30  Output: 02:30<br />
     * <p>
     * During a DST overlap (where the local time is ambiguous) this method will return
     * the earlier instant. The combination of these two rules is to always favour
     * daylight (summer) time over standard (winter) time.
     * <p>
     * NOTE: Prior to v2.0, the DST overlap behaviour was not defined and varied by hemisphere.
     * Prior to v1.5, the DST gap behaviour was also not defined.
     *
     * @param instantLocal  the millisecond instant, relative to this time zone, to get the offset for
     * @return the millisecond offset to subtract from local time to get UTC time
     */
    public int getOffsetFromLocal(long instantLocal) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1538);
        // get the offset at instantLocal (first estimate)
        __CLR4_4_1vxvxlc8azrt1.R.inc(1539);final int offsetLocal = getOffset(instantLocal);
        // adjust instantLocal using the estimate and recalc the offset
        __CLR4_4_1vxvxlc8azrt1.R.inc(1540);final long instantAdjusted = instantLocal - offsetLocal;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1541);final int offsetAdjusted = getOffset(instantAdjusted);
        // if the offsets differ, we must be near a DST boundary
        __CLR4_4_1vxvxlc8azrt1.R.inc(1542);if ((((offsetLocal != offsetAdjusted)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1543)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1544)==0&false))) {{
            // we need to ensure that time is always after the DST gap
            // this happens naturally for positive offsets, but not for negative
            __CLR4_4_1vxvxlc8azrt1.R.inc(1545);if (((((offsetLocal - offsetAdjusted) < 0)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1546)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1547)==0&false))) {{
                // if we just return offsetAdjusted then the time is pushed
                // back before the transition, whereas it should be
                // on or after the transition
                __CLR4_4_1vxvxlc8azrt1.R.inc(1548);long nextLocal = nextTransition(instantAdjusted);
                __CLR4_4_1vxvxlc8azrt1.R.inc(1549);long nextAdjusted = nextTransition(instantLocal - offsetAdjusted);
                __CLR4_4_1vxvxlc8azrt1.R.inc(1550);if ((((nextLocal != nextAdjusted)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1551)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1552)==0&false))) {{
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1553);return offsetLocal;
                }
            }}
        }} }else {__CLR4_4_1vxvxlc8azrt1.R.inc(1554);if ((((offsetLocal >= 0)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1555)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1556)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1557);long prev = previousTransition(instantAdjusted);
            __CLR4_4_1vxvxlc8azrt1.R.inc(1558);if ((((prev < instantAdjusted)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1559)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1560)==0&false))) {{
                __CLR4_4_1vxvxlc8azrt1.R.inc(1561);int offsetPrev = getOffset(prev);
                __CLR4_4_1vxvxlc8azrt1.R.inc(1562);int diff = offsetPrev - offsetLocal;
                __CLR4_4_1vxvxlc8azrt1.R.inc(1563);if ((((instantAdjusted - prev <= diff)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1564)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1565)==0&false))) {{
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1566);return offsetPrev;
                }
            }}
        }}
        }}__CLR4_4_1vxvxlc8azrt1.R.inc(1567);return offsetAdjusted;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Converts a standard UTC instant to a local instant with the same
     * local time. This conversion is used before performing a calculation
     * so that the calculation can be done using a simple local zone.
     *
     * @param instantUTC  the UTC instant to convert to local
     * @return the local instant with the same local time
     * @throws ArithmeticException if the result overflows a long
     * @since 1.5
     */
    public long convertUTCToLocal(long instantUTC) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1568);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1569);int offset = getOffset(instantUTC);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1570);long instantLocal = instantUTC + offset;
        // If there is a sign change, but the two values have the same sign...
        __CLR4_4_1vxvxlc8azrt1.R.inc(1571);if (((((instantUTC ^ instantLocal) < 0 && (instantUTC ^ offset) >= 0)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1572)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1573)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1574);throw new ArithmeticException("Adding time zone offset caused overflow");
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1575);return instantLocal;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Converts a local instant to a standard UTC instant with the same
     * local time attempting to use the same offset as the original.
     * <p>
     * This conversion is used after performing a calculation
     * where the calculation was done using a simple local zone.
     * Whenever possible, the same offset as the original offset will be used.
     * This is most significant during a daylight savings overlap.
     *
     * @param instantLocal  the local instant to convert to UTC
     * @param strict  whether the conversion should reject non-existent local times
     * @param originalInstantUTC  the original instant that the calculation is based on
     * @return the UTC instant with the same local time, 
     * @throws ArithmeticException if the result overflows a long
     * @throws IllegalArgumentException if the zone has no equivalent local time
     * @since 2.0
     */
    public long convertLocalToUTC(long instantLocal, boolean strict, long originalInstantUTC) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1576);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1577);int offsetOriginal = getOffset(originalInstantUTC);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1578);long instantUTC = instantLocal - offsetOriginal;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1579);int offsetLocalFromOriginal = getOffset(instantUTC);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1580);if ((((offsetLocalFromOriginal == offsetOriginal)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1581)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1582)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1583);return instantUTC;
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1584);return convertLocalToUTC(instantLocal, strict);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Converts a local instant to a standard UTC instant with the same
     * local time. This conversion is used after performing a calculation
     * where the calculation was done using a simple local zone.
     *
     * @param instantLocal  the local instant to convert to UTC
     * @param strict  whether the conversion should reject non-existent local times
     * @return the UTC instant with the same local time, 
     * @throws ArithmeticException if the result overflows a long
     * @throws IllegalInstantException if the zone has no equivalent local time
     * @since 1.5
     */
    public long convertLocalToUTC(long instantLocal, boolean strict) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1585);
        // get the offset at instantLocal (first estimate)
        __CLR4_4_1vxvxlc8azrt1.R.inc(1586);int offsetLocal = getOffset(instantLocal);
        // adjust instantLocal using the estimate and recalc the offset
        __CLR4_4_1vxvxlc8azrt1.R.inc(1587);int offset = getOffset(instantLocal - offsetLocal);
        // if the offsets differ, we must be near a DST boundary
        __CLR4_4_1vxvxlc8azrt1.R.inc(1588);if ((((offsetLocal != offset)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1589)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1590)==0&false))) {{
            // if strict then always check if in DST gap
            // otherwise only check if zone in Western hemisphere (as the
            // value of offset is already correct for Eastern hemisphere)
            __CLR4_4_1vxvxlc8azrt1.R.inc(1591);if ((((strict || offsetLocal < 0)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1592)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1593)==0&false))) {{
                // determine if we are in the DST gap
                __CLR4_4_1vxvxlc8azrt1.R.inc(1594);long nextLocal = nextTransition(instantLocal - offsetLocal);
                __CLR4_4_1vxvxlc8azrt1.R.inc(1595);if ((((nextLocal == (instantLocal - offsetLocal))&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1596)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1597)==0&false))) {{
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1598);nextLocal = Long.MAX_VALUE;
                }
                }__CLR4_4_1vxvxlc8azrt1.R.inc(1599);long nextAdjusted = nextTransition(instantLocal - offset);
                __CLR4_4_1vxvxlc8azrt1.R.inc(1600);if ((((nextAdjusted == (instantLocal - offset))&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1601)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1602)==0&false))) {{
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1603);nextAdjusted = Long.MAX_VALUE;
                }
                }__CLR4_4_1vxvxlc8azrt1.R.inc(1604);if ((((nextLocal != nextAdjusted)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1605)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1606)==0&false))) {{
                    // yes we are in the DST gap
                    __CLR4_4_1vxvxlc8azrt1.R.inc(1607);if ((((strict)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1608)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1609)==0&false))) {{
                        // DST gap is not acceptable
                        __CLR4_4_1vxvxlc8azrt1.R.inc(1610);throw new IllegalInstantException(instantLocal, getID());
                    } }else {{
                        // DST gap is acceptable, but for the Western hemisphere
                        // the offset is wrong and will result in local times
                        // before the cutover so use the offsetLocal instead
                        __CLR4_4_1vxvxlc8azrt1.R.inc(1611);offset = offsetLocal;
                    }
                }}
            }}
        }}
        // check for overflow
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1612);long instantUTC = instantLocal - offset;
        // If there is a sign change, but the two values have different signs...
        __CLR4_4_1vxvxlc8azrt1.R.inc(1613);if (((((instantLocal ^ instantUTC) < 0 && (instantLocal ^ offset) < 0)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1614)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1615)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1616);throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1617);return instantUTC;
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets the millisecond instant in another zone keeping the same local time.
     * <p>
     * The conversion is performed by converting the specified UTC millis to local
     * millis in this zone, then converting back to UTC millis in the new zone.
     *
     * @param newZone  the new zone, null means default
     * @param oldInstant  the UTC millisecond instant to convert
     * @return the UTC millisecond instant with the same local time in the new zone
     */
    public long getMillisKeepLocal(DateTimeZone newZone, long oldInstant) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1618);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1619);if ((((newZone == null)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1620)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1621)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1622);newZone = DateTimeZone.getDefault();
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1623);if ((((newZone == this)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1624)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1625)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1626);return oldInstant;
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1627);long instantLocal = convertUTCToLocal(oldInstant);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1628);return newZone.convertLocalToUTC(instantLocal, false, oldInstant);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

//    //-----------------------------------------------------------------------
//    /**
//     * Checks if the given {@link LocalDateTime} is within an overlap.
//     * <p>
//     * When switching from Daylight Savings Time to standard time there is
//     * typically an overlap where the same clock hour occurs twice. This
//     * method identifies whether the local datetime refers to such an overlap.
//     * 
//     * @param localDateTime  the time to check, not null
//     * @return true if the given datetime refers to an overlap
//     */
//    public boolean isLocalDateTimeOverlap(LocalDateTime localDateTime) {
//        if (isFixed()) {
//            return false;
//        }
//        long instantLocal = localDateTime.toDateTime(DateTimeZone.UTC).getMillis();
//        // get the offset at instantLocal (first estimate)
//        int offsetLocal = getOffset(instantLocal);
//        // adjust instantLocal using the estimate and recalc the offset
//        int offset = getOffset(instantLocal - offsetLocal);
//        // if the offsets differ, we must be near a DST boundary
//        if (offsetLocal != offset) {
//            long nextLocal = nextTransition(instantLocal - offsetLocal);
//            long nextAdjusted = nextTransition(instantLocal - offset);
//            if (nextLocal != nextAdjusted) {
//                // in DST gap
//                return false;
//            }
//            long diff = Math.abs(offset - offsetLocal);
//            DateTime dateTime = localDateTime.toDateTime(this);
//            DateTime adjusted = dateTime.plus(diff);
//            if (dateTime.getHourOfDay() == adjusted.getHourOfDay() &&
//                    dateTime.getMinuteOfHour() == adjusted.getMinuteOfHour() &&
//                    dateTime.getSecondOfMinute() == adjusted.getSecondOfMinute()) {
//                return true;
//            }
//            adjusted = dateTime.minus(diff);
//            if (dateTime.getHourOfDay() == adjusted.getHourOfDay() &&
//                    dateTime.getMinuteOfHour() == adjusted.getMinuteOfHour() &&
//                    dateTime.getSecondOfMinute() == adjusted.getSecondOfMinute()) {
//                return true;
//            }
//            return false;
//        }
//        return false;
//    }
//        
//        
//        DateTime dateTime = null;
//        try {
//            dateTime = localDateTime.toDateTime(this);
//        } catch (IllegalArgumentException ex) {
//            return false;  // it is a gap, not an overlap
//        }
//        long offset1 = Math.abs(getOffset(dateTime.getMillis() + 1) - getStandardOffset(dateTime.getMillis() + 1));
//        long offset2 = Math.abs(getOffset(dateTime.getMillis() - 1) - getStandardOffset(dateTime.getMillis() - 1));
//        long offset = Math.max(offset1, offset2);
//        if (offset == 0) {
//            return false;
//        }
//        DateTime adjusted = dateTime.plus(offset);
//        if (dateTime.getHourOfDay() == adjusted.getHourOfDay() &&
//                dateTime.getMinuteOfHour() == adjusted.getMinuteOfHour() &&
//                dateTime.getSecondOfMinute() == adjusted.getSecondOfMinute()) {
//            return true;
//        }
//        adjusted = dateTime.minus(offset);
//        if (dateTime.getHourOfDay() == adjusted.getHourOfDay() &&
//                dateTime.getMinuteOfHour() == adjusted.getMinuteOfHour() &&
//                dateTime.getSecondOfMinute() == adjusted.getSecondOfMinute()) {
//            return true;
//        }
//        return false;
        
//        long millis = dateTime.getMillis();
//        long nextTransition = nextTransition(millis);
//        long previousTransition = previousTransition(millis);
//        long deltaToPreviousTransition = millis - previousTransition;
//        long deltaToNextTransition = nextTransition - millis;
//        if (deltaToNextTransition < deltaToPreviousTransition) {
//            int offset = getOffset(nextTransition);
//            int standardOffset = getStandardOffset(nextTransition);
//            if (Math.abs(offset - standardOffset) >= deltaToNextTransition) {
//                return true;
//            }
//        } else  {
//            int offset = getOffset(previousTransition);
//            int standardOffset = getStandardOffset(previousTransition);
//            if (Math.abs(offset - standardOffset) >= deltaToPreviousTransition) {
//                return true;
//            }
//        }
//        return false;
//    }

    /**
     * Checks if the given {@link LocalDateTime} is within a gap.
     * <p>
     * When switching from standard time to Daylight Savings Time there is
     * typically a gap where a clock hour is missing. This method identifies
     * whether the local datetime refers to such a gap.
     * 
     * @param localDateTime  the time to check, not null
     * @return true if the given datetime refers to a gap
     * @since 1.6
     */
    public boolean isLocalDateTimeGap(LocalDateTime localDateTime) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1629);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1630);if ((((isFixed())&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1631)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1632)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1633);return false;
        }
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1634);try {
            __CLR4_4_1vxvxlc8azrt1.R.inc(1635);localDateTime.toDateTime(this);
            __CLR4_4_1vxvxlc8azrt1.R.inc(1636);return false;
        } catch (IllegalInstantException ex) {
            __CLR4_4_1vxvxlc8azrt1.R.inc(1637);return true;
        }
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Adjusts the offset to be the earlier or later one during an overlap.
     * 
     * @param instant  the instant to adjust
     * @param earlierOrLater  false for earlier, true for later
     * @return the adjusted instant millis
     */
    public long adjustOffset(long instant, boolean earlierOrLater) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1638);
        // a bit messy, but will work in all non-pathological cases
        
        // evaluate 3 hours before and after to work out if anything is happening
        __CLR4_4_1vxvxlc8azrt1.R.inc(1639);long instantBefore = instant - 3 * DateTimeConstants.MILLIS_PER_HOUR;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1640);long instantAfter = instant + 3 * DateTimeConstants.MILLIS_PER_HOUR;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1641);long offsetBefore = getOffset(instantBefore);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1642);long offsetAfter = getOffset(instantAfter);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1643);if ((((offsetBefore <= offsetAfter)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1644)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1645)==0&false))) {{
            __CLR4_4_1vxvxlc8azrt1.R.inc(1646);return instant;  // not an overlap (less than is a gap, equal is normal case)
        }
        
        // work out range of instants that have duplicate local times
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1647);long diff = offsetBefore - offsetAfter;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1648);long transition = nextTransition(instantBefore);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1649);long overlapStart = transition - diff;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1650);long overlapEnd = transition + diff;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1651);if ((((instant < overlapStart || instant >= overlapEnd)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1652)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1653)==0&false))) {{
          __CLR4_4_1vxvxlc8azrt1.R.inc(1654);return instant;  // not an overlap
        }
        
        // calculate result
        }__CLR4_4_1vxvxlc8azrt1.R.inc(1655);long afterStart = instant - overlapStart;
        __CLR4_4_1vxvxlc8azrt1.R.inc(1656);if ((((afterStart >= diff)&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1657)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1658)==0&false))) {{
          // currently in later offset
          __CLR4_4_1vxvxlc8azrt1.R.inc(1659);return (((earlierOrLater )&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1660)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1661)==0&false))? instant : instant - diff;
        } }else {{
          // currently in earlier offset
          __CLR4_4_1vxvxlc8azrt1.R.inc(1662);return (((earlierOrLater )&&(__CLR4_4_1vxvxlc8azrt1.R.iget(1663)!=0|true))||(__CLR4_4_1vxvxlc8azrt1.R.iget(1664)==0&false))? instant + diff : instant;
        }
    }}finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}
//    System.out.println(new DateTime(transitionStart, DateTimeZone.UTC) + " " + new DateTime(transitionStart, this));

    //-----------------------------------------------------------------------
    /**
     * Returns true if this time zone has no transitions.
     *
     * @return true if no transitions
     */
    public abstract boolean isFixed();

    /**
     * Advances the given instant to where the time zone offset or name changes.
     * If the instant returned is exactly the same as passed in, then
     * no changes occur after the given instant.
     *
     * @param instant  milliseconds from 1970-01-01T00:00:00Z
     * @return milliseconds from 1970-01-01T00:00:00Z
     */
    public abstract long nextTransition(long instant);

    /**
     * Retreats the given instant to where the time zone offset or name changes.
     * If the instant returned is exactly the same as passed in, then
     * no changes occur before the given instant.
     *
     * @param instant  milliseconds from 1970-01-01T00:00:00Z
     * @return milliseconds from 1970-01-01T00:00:00Z
     */
    public abstract long previousTransition(long instant);

    // Basic methods
    //--------------------------------------------------------------------

    /**
     * Get the datetime zone as a {@link java.util.TimeZone}.
     * 
     * @return the closest matching TimeZone object
     */
    public java.util.TimeZone toTimeZone() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1665);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1666);return java.util.TimeZone.getTimeZone(iID);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Compare this datetime zone with another.
     * 
     * @param object the object to compare with
     * @return true if equal, based on the ID and all internal rules
     */
    public abstract boolean equals(Object object);

    /**
     * Gets a hash code compatable with equals.
     * 
     * @return suitable hashcode
     */
    public int hashCode() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1667);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1668);return 57 + getID().hashCode();
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Gets the datetime zone as a string, which is simply its ID.
     * @return the id of the zone
     */
    public String toString() {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1669);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1670);return getID();
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * By default, when DateTimeZones are serialized, only a "stub" object
     * referring to the id is written out. When the stub is read in, it
     * replaces itself with a DateTimeZone object.
     * @return a stub object to go in the stream
     */
    protected Object writeReplace() throws ObjectStreamException {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1671);
        __CLR4_4_1vxvxlc8azrt1.R.inc(1672);return new Stub(iID);
    }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

    /**
     * Used to serialize DateTimeZones by id.
     */
    private static final class Stub implements Serializable {
        /** Serialization lock. */
        private static final long serialVersionUID = -6471952376487863581L;
        /** The ID of the zone. */
        private transient String iID;

        /**
         * Constructor.
         * @param id  the id of the zone
         */
        Stub(String id) {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1673);
            __CLR4_4_1vxvxlc8azrt1.R.inc(1674);iID = id;
        }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

        private void writeObject(ObjectOutputStream out) throws IOException {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1675);
            __CLR4_4_1vxvxlc8azrt1.R.inc(1676);out.writeUTF(iID);
        }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

        private void readObject(ObjectInputStream in) throws IOException {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1677);
            __CLR4_4_1vxvxlc8azrt1.R.inc(1678);iID = in.readUTF();
        }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}

        private Object readResolve() throws ObjectStreamException {try{__CLR4_4_1vxvxlc8azrt1.R.inc(1679);
            __CLR4_4_1vxvxlc8azrt1.R.inc(1680);return forID(iID);
        }finally{__CLR4_4_1vxvxlc8azrt1.R.flushNeeded();}}
    }

}
