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

import java.lang.reflect.Method;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import org.joda.time.chrono.ISOChronology;

/**
 * DateTimeUtils provide public utility methods for the date-time library.
 * <p>
 * DateTimeUtils uses shared static variables which are declared as volatile
 * for thread-safety. These can be changed during the lifetime of the application
 * however doing so is generally a bad idea.
 *
 * @author Stephen Colebourne
 * @since 1.0
 */
public class DateTimeUtils {public static class __CLR4_4_1raralc8azrpy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,1149,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The singleton instance of the system millisecond provider. */
    private static final SystemMillisProvider SYSTEM_MILLIS_PROVIDER = new SystemMillisProvider();
    /** The millisecond provider currently in use. */
    private static volatile MillisProvider cMillisProvider = SYSTEM_MILLIS_PROVIDER;
    /** The millisecond provider currently in use. */
    private static volatile Map<String, DateTimeZone> cZoneNames;
    static {try{__CLR4_4_1raralc8azrpy.R.inc(982);
        // names from RFC-822 / JDK
        // this is all very US-centric and dubious, but perhaps it will help some
        __CLR4_4_1raralc8azrpy.R.inc(983);Map<String, DateTimeZone> map = new LinkedHashMap<String, DateTimeZone>();
        __CLR4_4_1raralc8azrpy.R.inc(984);map.put("UT", DateTimeZone.UTC);
        __CLR4_4_1raralc8azrpy.R.inc(985);map.put("UTC", DateTimeZone.UTC);
        __CLR4_4_1raralc8azrpy.R.inc(986);map.put("GMT", DateTimeZone.UTC);
        __CLR4_4_1raralc8azrpy.R.inc(987);put(map, "EST", "America/New_York");
        __CLR4_4_1raralc8azrpy.R.inc(988);put(map, "EDT", "America/New_York");
        __CLR4_4_1raralc8azrpy.R.inc(989);put(map, "CST", "America/Chicago");
        __CLR4_4_1raralc8azrpy.R.inc(990);put(map, "CDT", "America/Chicago");
        __CLR4_4_1raralc8azrpy.R.inc(991);put(map, "MST", "America/Denver");
        __CLR4_4_1raralc8azrpy.R.inc(992);put(map, "MDT", "America/Denver");
        __CLR4_4_1raralc8azrpy.R.inc(993);put(map, "PST", "America/Los_Angeles");
        __CLR4_4_1raralc8azrpy.R.inc(994);put(map, "PDT", "America/Los_Angeles");
        __CLR4_4_1raralc8azrpy.R.inc(995);cZoneNames = Collections.unmodifiableMap(map);
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}
    private static void put(Map<String, DateTimeZone> map, String name, String id) {try{__CLR4_4_1raralc8azrpy.R.inc(996);
        __CLR4_4_1raralc8azrpy.R.inc(997);try {
            __CLR4_4_1raralc8azrpy.R.inc(998);map.put(name, DateTimeZone.forID(id));
        } catch (RuntimeException ex) {
            // ignore
        }
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    /**
     * Restrictive constructor
     */
    protected DateTimeUtils() {
        super();__CLR4_4_1raralc8azrpy.R.inc(1000);try{__CLR4_4_1raralc8azrpy.R.inc(999);
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the current time in milliseconds.
     * <p>
     * By default this returns <code>System.currentTimeMillis()</code>.
     * This may be changed using other methods in this class.
     * 
     * @return the current time in milliseconds from 1970-01-01T00:00:00Z
     */
    public static final long currentTimeMillis() {try{__CLR4_4_1raralc8azrpy.R.inc(1001);
        __CLR4_4_1raralc8azrpy.R.inc(1002);return cMillisProvider.getMillis();
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    /**
     * Resets the current time to return the system time.
     * <p>
     * This method changes the behaviour of {@link #currentTimeMillis()}.
     * Whenever the current time is queried, {@link System#currentTimeMillis()} is used.
     * 
     * @throws SecurityException if the application does not have sufficient security rights
     */
    public static final void setCurrentMillisSystem() throws SecurityException {try{__CLR4_4_1raralc8azrpy.R.inc(1003);
        __CLR4_4_1raralc8azrpy.R.inc(1004);checkPermission();
        __CLR4_4_1raralc8azrpy.R.inc(1005);cMillisProvider = SYSTEM_MILLIS_PROVIDER;
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    /**
     * Sets the current time to return a fixed millisecond time.
     * <p>
     * This method changes the behaviour of {@link #currentTimeMillis()}.
     * Whenever the current time is queried, the same millisecond time will be returned.
     * 
     * @param fixedMillis  the fixed millisecond time to use
     * @throws SecurityException if the application does not have sufficient security rights
     */
    public static final void setCurrentMillisFixed(long fixedMillis) throws SecurityException {try{__CLR4_4_1raralc8azrpy.R.inc(1006);
        __CLR4_4_1raralc8azrpy.R.inc(1007);checkPermission();
        __CLR4_4_1raralc8azrpy.R.inc(1008);cMillisProvider = new FixedMillisProvider(fixedMillis);
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    /**
     * Sets the current time to return the system time plus an offset.
     * <p>
     * This method changes the behaviour of {@link #currentTimeMillis()}.
     * Whenever the current time is queried, {@link System#currentTimeMillis()} is used
     * and then offset by adding the millisecond value specified here.
     * 
     * @param offsetMillis  the fixed millisecond time to use
     * @throws SecurityException if the application does not have sufficient security rights
     */
    public static final void setCurrentMillisOffset(long offsetMillis) throws SecurityException {try{__CLR4_4_1raralc8azrpy.R.inc(1009);
        __CLR4_4_1raralc8azrpy.R.inc(1010);checkPermission();
        __CLR4_4_1raralc8azrpy.R.inc(1011);if ((((offsetMillis == 0)&&(__CLR4_4_1raralc8azrpy.R.iget(1012)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1013)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1014);cMillisProvider = SYSTEM_MILLIS_PROVIDER;
        } }else {{
            __CLR4_4_1raralc8azrpy.R.inc(1015);cMillisProvider = new OffsetMillisProvider(offsetMillis);
        }
    }}finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    /**
     * Sets the provider of the current time to class specified.
     * <p>
     * This method changes the behaviour of {@link #currentTimeMillis()}.
     * Whenever the current time is queried, the specified class will be called.
     * 
     * @param millisProvider  the provider of the current time to use, not null
     * @throws SecurityException if the application does not have sufficient security rights
     * @since 2.0
     */
    public static final void setCurrentMillisProvider(MillisProvider millisProvider) throws SecurityException {try{__CLR4_4_1raralc8azrpy.R.inc(1016);
        __CLR4_4_1raralc8azrpy.R.inc(1017);if ((((millisProvider == null)&&(__CLR4_4_1raralc8azrpy.R.iget(1018)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1019)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1020);throw new IllegalArgumentException("The MillisProvider must not be null");
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1021);checkPermission();
        __CLR4_4_1raralc8azrpy.R.inc(1022);cMillisProvider = millisProvider;
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    /**
     * Checks whether the provider may be changed using permission 'CurrentTime.setProvider'.
     * 
     * @throws SecurityException if the provider may not be changed
     */
    private static void checkPermission() throws SecurityException {try{__CLR4_4_1raralc8azrpy.R.inc(1023);
        __CLR4_4_1raralc8azrpy.R.inc(1024);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_1raralc8azrpy.R.inc(1025);if ((((sm != null)&&(__CLR4_4_1raralc8azrpy.R.iget(1026)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1027)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1028);sm.checkPermission(new JodaTimePermission("CurrentTime.setProvider"));
        }
    }}finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the millisecond instant from the specified instant object handling null.
     * <p>
     * If the instant object is <code>null</code>, the {@link #currentTimeMillis()}
     * will be returned. Otherwise, the millis from the object are returned.
     * 
     * @param instant  the instant to examine, null means now
     * @return the time in milliseconds from 1970-01-01T00:00:00Z
     */
    public static final long getInstantMillis(ReadableInstant instant) {try{__CLR4_4_1raralc8azrpy.R.inc(1029);
        __CLR4_4_1raralc8azrpy.R.inc(1030);if ((((instant == null)&&(__CLR4_4_1raralc8azrpy.R.iget(1031)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1032)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1033);return DateTimeUtils.currentTimeMillis();
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1034);return instant.getMillis();
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the chronology from the specified instant object handling null.
     * <p>
     * If the instant object is <code>null</code>, or the instant's chronology is
     * <code>null</code>, {@link ISOChronology#getInstance()} will be returned.
     * Otherwise, the chronology from the object is returned.
     * 
     * @param instant  the instant to examine, null means ISO in the default zone
     * @return the chronology, never null
     */
    public static final Chronology getInstantChronology(ReadableInstant instant) {try{__CLR4_4_1raralc8azrpy.R.inc(1035);
        __CLR4_4_1raralc8azrpy.R.inc(1036);if ((((instant == null)&&(__CLR4_4_1raralc8azrpy.R.iget(1037)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1038)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1039);return ISOChronology.getInstance();
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1040);Chronology chrono = instant.getChronology();
        __CLR4_4_1raralc8azrpy.R.inc(1041);if ((((chrono == null)&&(__CLR4_4_1raralc8azrpy.R.iget(1042)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1043)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1044);return ISOChronology.getInstance();
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1045);return chrono;
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the chronology from the specified instant based interval handling null.
     * <p>
     * The chronology is obtained from the start if that is not null, or from the
     * end if the start is null. The result is additionally checked, and if still
     * null then {@link ISOChronology#getInstance()} will be returned.
     * 
     * @param start  the instant to examine and use as the primary source of the chronology
     * @param end  the instant to examine and use as the secondary source of the chronology
     * @return the chronology, never null
     */
    public static final Chronology getIntervalChronology(ReadableInstant start, ReadableInstant end) {try{__CLR4_4_1raralc8azrpy.R.inc(1046);
        __CLR4_4_1raralc8azrpy.R.inc(1047);Chronology chrono = null;
        __CLR4_4_1raralc8azrpy.R.inc(1048);if ((((start != null)&&(__CLR4_4_1raralc8azrpy.R.iget(1049)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1050)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1051);chrono = start.getChronology();
        } }else {__CLR4_4_1raralc8azrpy.R.inc(1052);if ((((end != null)&&(__CLR4_4_1raralc8azrpy.R.iget(1053)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1054)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1055);chrono = end.getChronology();
        }
        }}__CLR4_4_1raralc8azrpy.R.inc(1056);if ((((chrono == null)&&(__CLR4_4_1raralc8azrpy.R.iget(1057)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1058)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1059);chrono = ISOChronology.getInstance();
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1060);return chrono;
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the chronology from the specified interval object handling null.
     * <p>
     * If the interval object is <code>null</code>, or the interval's chronology is
     * <code>null</code>, {@link ISOChronology#getInstance()} will be returned.
     * Otherwise, the chronology from the object is returned.
     * 
     * @param interval  the interval to examine, null means ISO in the default zone
     * @return the chronology, never null
     */
    public static final Chronology getIntervalChronology(ReadableInterval interval) {try{__CLR4_4_1raralc8azrpy.R.inc(1061);
        __CLR4_4_1raralc8azrpy.R.inc(1062);if ((((interval == null)&&(__CLR4_4_1raralc8azrpy.R.iget(1063)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1064)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1065);return ISOChronology.getInstance();
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1066);Chronology chrono = interval.getChronology();
        __CLR4_4_1raralc8azrpy.R.inc(1067);if ((((chrono == null)&&(__CLR4_4_1raralc8azrpy.R.iget(1068)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1069)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1070);return ISOChronology.getInstance();
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1071);return chrono;
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the interval handling null.
     * <p>
     * If the interval is <code>null</code>, an interval representing now
     * to now in the {@link ISOChronology#getInstance() ISOChronology}
     * will be returned. Otherwise, the interval specified is returned.
     * 
     * @param interval  the interval to use, null means now to now
     * @return the interval, never null
     * @since 1.1
     */
    public static final ReadableInterval getReadableInterval(ReadableInterval interval) {try{__CLR4_4_1raralc8azrpy.R.inc(1072);
        __CLR4_4_1raralc8azrpy.R.inc(1073);if ((((interval == null)&&(__CLR4_4_1raralc8azrpy.R.iget(1074)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1075)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1076);long now = DateTimeUtils.currentTimeMillis();
            __CLR4_4_1raralc8azrpy.R.inc(1077);interval = new Interval(now, now);
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1078);return interval;
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the chronology handling null.
     * <p>
     * If the chronology is <code>null</code>, {@link ISOChronology#getInstance()}
     * will be returned. Otherwise, the chronology is returned.
     * 
     * @param chrono  the chronology to use, null means ISO in the default zone
     * @return the chronology, never null
     */
    public static final Chronology getChronology(Chronology chrono) {try{__CLR4_4_1raralc8azrpy.R.inc(1079);
        __CLR4_4_1raralc8azrpy.R.inc(1080);if ((((chrono == null)&&(__CLR4_4_1raralc8azrpy.R.iget(1081)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1082)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1083);return ISOChronology.getInstance();
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1084);return chrono;
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the zone handling null.
     * <p>
     * If the zone is <code>null</code>, {@link DateTimeZone#getDefault()}
     * will be returned. Otherwise, the zone specified is returned.
     * 
     * @param zone  the time zone to use, null means the default zone
     * @return the time zone, never null
     */
    public static final DateTimeZone getZone(DateTimeZone zone) {try{__CLR4_4_1raralc8azrpy.R.inc(1085);
        __CLR4_4_1raralc8azrpy.R.inc(1086);if ((((zone == null)&&(__CLR4_4_1raralc8azrpy.R.iget(1087)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1088)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1089);return DateTimeZone.getDefault();
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1090);return zone;
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the period type handling null.
     * <p>
     * If the zone is <code>null</code>, {@link PeriodType#standard()}
     * will be returned. Otherwise, the type specified is returned.
     * 
     * @param type  the time zone to use, null means the standard type
     * @return the type to use, never null
     */
    public static final PeriodType getPeriodType(PeriodType type) {try{__CLR4_4_1raralc8azrpy.R.inc(1091);
        __CLR4_4_1raralc8azrpy.R.inc(1092);if ((((type == null)&&(__CLR4_4_1raralc8azrpy.R.iget(1093)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1094)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1095);return PeriodType.standard();
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1096);return type;
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the millisecond duration from the specified duration object handling null.
     * <p>
     * If the duration object is <code>null</code>, zero will be returned.
     * Otherwise, the millis from the object are returned.
     * 
     * @param duration  the duration to examine, null means zero
     * @return the duration in milliseconds
     */
    public static final long getDurationMillis(ReadableDuration duration) {try{__CLR4_4_1raralc8azrpy.R.inc(1097);
        __CLR4_4_1raralc8azrpy.R.inc(1098);if ((((duration == null)&&(__CLR4_4_1raralc8azrpy.R.iget(1099)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1100)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1101);return 0L;
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1102);return duration.getMillis();
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks whether the partial is contiguous.
     * <p>
     * A partial is contiguous if one field starts where another ends.
     * <p>
     * For example <code>LocalDate</code> is contiguous because DayOfMonth has
     * the same range (Month) as the unit of the next field (MonthOfYear), and
     * MonthOfYear has the same range (Year) as the unit of the next field (Year).
     * <p>
     * Similarly, <code>LocalTime</code> is contiguous, as it consists of
     * MillisOfSecond, SecondOfMinute, MinuteOfHour and HourOfDay (note how
     * the names of each field 'join up').
     * <p>
     * However, a Year/HourOfDay partial is not contiguous because the range
     * field Day is not equal to the next field Year.
     * Similarly, a DayOfWeek/DayOfMonth partial is not contiguous because
     * the range Month is not equal to the next field Day.
     * 
     * @param partial  the partial to check
     * @return true if the partial is contiguous
     * @throws IllegalArgumentException if the partial is null
     * @since 1.1
     */
    public static final boolean isContiguous(ReadablePartial partial) {try{__CLR4_4_1raralc8azrpy.R.inc(1103);
        __CLR4_4_1raralc8azrpy.R.inc(1104);if ((((partial == null)&&(__CLR4_4_1raralc8azrpy.R.iget(1105)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1106)==0&false))) {{
            __CLR4_4_1raralc8azrpy.R.inc(1107);throw new IllegalArgumentException("Partial must not be null");
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1108);DurationFieldType lastType = null;
        __CLR4_4_1raralc8azrpy.R.inc(1109);for (int i = 0; (((i < partial.size())&&(__CLR4_4_1raralc8azrpy.R.iget(1110)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1111)==0&false)); i++) {{
            __CLR4_4_1raralc8azrpy.R.inc(1112);DateTimeField loopField = partial.getField(i);
            __CLR4_4_1raralc8azrpy.R.inc(1113);if ((((i > 0)&&(__CLR4_4_1raralc8azrpy.R.iget(1114)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1115)==0&false))) {{
                __CLR4_4_1raralc8azrpy.R.inc(1116);if ((((loopField.getRangeDurationField() == null || loopField.getRangeDurationField().getType() != lastType)&&(__CLR4_4_1raralc8azrpy.R.iget(1117)!=0|true))||(__CLR4_4_1raralc8azrpy.R.iget(1118)==0&false))) {{
                    __CLR4_4_1raralc8azrpy.R.inc(1119);return false;
                }
            }}
            }__CLR4_4_1raralc8azrpy.R.inc(1120);lastType = loopField.getDurationField().getType();
        }
        }__CLR4_4_1raralc8azrpy.R.inc(1121);return true;
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the {@link DateFormatSymbols} based on the given locale.
     * <p>
     * If JDK 6 or newer is being used, DateFormatSymbols.getInstance(locale) will
     * be used in order to allow the use of locales defined as extensions.
     * Otherwise, new DateFormatSymbols(locale) will be used.
     * See JDK 6 {@link DateFormatSymbols} for further information.
     * 
     * @param locale  the {@link Locale} used to get the correct {@link DateFormatSymbols}
     * @return the symbols
     * @since 2.0
     */
    public static final DateFormatSymbols getDateFormatSymbols(Locale locale) {try{__CLR4_4_1raralc8azrpy.R.inc(1122);
        __CLR4_4_1raralc8azrpy.R.inc(1123);try {
            __CLR4_4_1raralc8azrpy.R.inc(1124);Method method = DateFormatSymbols.class.getMethod("getInstance", new Class[] {Locale.class});
            __CLR4_4_1raralc8azrpy.R.inc(1125);return (DateFormatSymbols) method.invoke(null, new Object[] {locale});
        } catch (Exception ex) {
            __CLR4_4_1raralc8azrpy.R.inc(1126);return new DateFormatSymbols(locale);
        }
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the default map of time zone names.
     * <p>
     * This can be changed by {@link #setDefaultTimeZoneNames}.
     * <p>
     * The default set of short time zone names is as follows:
     * <ul>
     * <li>UT - UTC
     * <li>UTC - UTC
     * <li>GMT - UTC
     * <li>EST - America/New_York
     * <li>EDT - America/New_York
     * <li>CST - America/Chicago
     * <li>CDT - America/Chicago
     * <li>MST - America/Denver
     * <li>MDT - America/Denver
     * <li>PST - America/Los_Angeles
     * <li>PDT - America/Los_Angeles
     * </ul>
     * 
     * @return the unmodifiable map of abbreviations to zones, not null
     * @since 2.2
     */
    public static final Map<String, DateTimeZone> getDefaultTimeZoneNames() {try{__CLR4_4_1raralc8azrpy.R.inc(1127);
        __CLR4_4_1raralc8azrpy.R.inc(1128);return cZoneNames;
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    /**
     * Sets the default map of time zone names.
     * <p>
     * The map is copied before storage.
     * 
     * @param names  the map of abbreviations to zones, not null
     * @since 2.2
     */
    public static final void setDefaultTimeZoneNames(Map<String, DateTimeZone> names) {try{__CLR4_4_1raralc8azrpy.R.inc(1129);
        __CLR4_4_1raralc8azrpy.R.inc(1130);cZoneNames = Collections.unmodifiableMap(new HashMap<String, DateTimeZone>(names));
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    /**
     * Calculates the astronomical Julian Day for an instant.
     * <p>
     * The <a href="http://en.wikipedia.org/wiki/Julian_day">Julian day</a> is a well-known
     * system of time measurement for scientific use by the astronomy community.
     * It expresses the interval of time in days and fractions of a day since
     * January 1, 4713 BC (Julian) Greenwich noon.
     * <p>
     * Each day starts at midday (not midnight) and time is expressed as a fraction.
     * Thus the fraction 0.25 is 18:00. equal to one quarter of the day from midday to midday.
     * <p>
     * Note that this method has nothing to do with the day-of-year.
     * 
     * @param epochMillis  the epoch millis from 1970-01-01Z
     * @return the astronomical Julian Day represented by the specified instant
     * @since 2.2
     */
    public static final double toJulianDay(long epochMillis) {try{__CLR4_4_1raralc8azrpy.R.inc(1131);
        // useful links
        // http://en.wikipedia.org/wiki/Julian_day#cite_note-13 - Wikipedia
        // http://aa.usno.navy.mil/data/docs/JulianDate.php" - USNO
        // http://users.zoominternet.net/~matto/Java/Julian%20Date%20Converter.htm - Julian Date Converter by Matt Oltersdorf
        // http://ssd.jpl.nasa.gov/tc.cgi#top - CalTech
        __CLR4_4_1raralc8azrpy.R.inc(1132);double epochDay = epochMillis / 86400000d;
        __CLR4_4_1raralc8azrpy.R.inc(1133);return epochDay + 2440587.5d;
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    /**
     * Calculates the astronomical Julian Day Number for an instant.
     * <p>
     * The {@link #toJulianDay(long)} method calculates the astronomical Julian Day
     * with a fraction based on days starting at midday.
     * This method calculates the variant where days start at midnight.
     * JDN 0 is used for the date equivalent to Monday January 1, 4713 BC (Julian).
     * Thus these days start 12 hours before those of the fractional Julian Day.
     * <p>
     * Note that this method has nothing to do with the day-of-year.
     * 
     * @param epochMillis  the epoch millis from 1970-01-01Z
     * @return the astronomical Julian Day represented by the specified instant
     * @since 2.2
     */
    public static final long toJulianDayNumber(long epochMillis) {try{__CLR4_4_1raralc8azrpy.R.inc(1134);
        __CLR4_4_1raralc8azrpy.R.inc(1135);return (long) Math.floor(toJulianDay(epochMillis) + 0.5d);
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    /**
     * Creates a date-time from a Julian Day.
     * <p>
     * Returns the {@code DateTime} object equal to the specified Julian Day.
     * 
     * @param julianDay  the Julian Day
     * @return the epoch millis from 1970-01-01Z
     * @since 2.2
     */
    public static final long fromJulianDay(double julianDay) {try{__CLR4_4_1raralc8azrpy.R.inc(1136);
        __CLR4_4_1raralc8azrpy.R.inc(1137);double epochDay = julianDay - 2440587.5d;
        __CLR4_4_1raralc8azrpy.R.inc(1138);return (long) (epochDay * 86400000d);
    }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * A millisecond provider, allowing control of the system clock.
     * 
     * @author Stephen Colebourne
     * @since 2.0 (previously private)
     */
    public static interface MillisProvider {
        /**
         * Gets the current time.
         * <p>
         * Implementations of this method must be thread-safe.
         * 
         * @return the current time in milliseconds
         */
        long getMillis();
    }

    /**
     * System millis provider.
     */
    static class SystemMillisProvider implements MillisProvider {
        /**
         * Gets the current time.
         * @return the current time in millis
         */
        public long getMillis() {try{__CLR4_4_1raralc8azrpy.R.inc(1139);
            __CLR4_4_1raralc8azrpy.R.inc(1140);return System.currentTimeMillis();
        }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}
    }

    /**
     * Fixed millisecond provider.
     */
    static class FixedMillisProvider implements MillisProvider {
        /** The fixed millis value. */
        private final long iMillis;
        
        /**
         * Constructor.
         * @param offsetMillis  the millis offset
         */
        FixedMillisProvider(long fixedMillis) {try{__CLR4_4_1raralc8azrpy.R.inc(1141);
            __CLR4_4_1raralc8azrpy.R.inc(1142);iMillis = fixedMillis;
        }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}
        
        /**
         * Gets the current time.
         * @return the current time in millis
         */
        public long getMillis() {try{__CLR4_4_1raralc8azrpy.R.inc(1143);
            __CLR4_4_1raralc8azrpy.R.inc(1144);return iMillis;
        }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}
    }

    /**
     * Offset from system millis provider.
     */
    static class OffsetMillisProvider implements MillisProvider {
        /** The millis offset. */
        private final long iMillis;
        
        /**
         * Constructor.
         * @param offsetMillis  the millis offset
         */
        OffsetMillisProvider(long offsetMillis) {try{__CLR4_4_1raralc8azrpy.R.inc(1145);
            __CLR4_4_1raralc8azrpy.R.inc(1146);iMillis = offsetMillis;
        }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}
        
        /**
         * Gets the current time.
         * @return the current time in millis
         */
        public long getMillis() {try{__CLR4_4_1raralc8azrpy.R.inc(1147);
            __CLR4_4_1raralc8azrpy.R.inc(1148);return System.currentTimeMillis() + iMillis;
        }finally{__CLR4_4_1raralc8azrpy.R.flushNeeded();}}
    }

}
