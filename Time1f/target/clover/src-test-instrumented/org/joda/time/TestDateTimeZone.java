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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.text.DateFormatSymbols;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;

/**
 * This class is a JUnit test for DateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeZone extends TestCase {static class __CLR4_4_1iv9iv9lc8azudh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,25034,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24453);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24454);String str = System.getProperty("java.version");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24455);boolean old = true;
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24456);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1iv9iv9lc8azudh.R.iget(24457)!=0|true))||(__CLR4_4_1iv9iv9lc8azudh.R.iget(24458)==0&false))) {{
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24459);old = false;
        }
        }__CLR4_4_1iv9iv9lc8azudh.R.inc(24460);OLD_JDK = old;
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
    
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_SUMMER =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-01-09
    private long TEST_TIME_WINTER =
            (y2002days + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
//    // 2002-04-05 Fri
//    private long TEST_TIME1 =
//            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 12L * DateTimeConstants.MILLIS_PER_HOUR
//            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    // 2003-05-06 Tue
//    private long TEST_TIME2 =
//            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 14L * DateTimeConstants.MILLIS_PER_HOUR
//            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24461);
        // don't call Policy.getPolicy()
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24462);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24463);
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24464);Permissions p = new Permissions();
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24465);p.add(new AllPermission());  // enable everything
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24466);return p;
            }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24467);
            }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24468);
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24469);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1iv9iv9lc8azudh.R.iget(24470)!=0|true))||(__CLR4_4_1iv9iv9lc8azudh.R.iget(24471)==0&false))) {{
                    __CLR4_4_1iv9iv9lc8azudh.R.inc(24472);return false;
                }
                }__CLR4_4_1iv9iv9lc8azudh.R.inc(24473);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        };
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24474);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24475);
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24476);Permissions p = new Permissions();
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24477);p.add(new AllPermission());  // enable everything
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24478);return p;
            }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24479);
            }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
    
    private DateTimeZone zone;
    private Locale locale;

    public static void main(String[] args) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24480);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24481);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24482);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24483);return new TestSuite(TestDateTimeZone.class);
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public TestDateTimeZone(String name) {
        super(name);__CLR4_4_1iv9iv9lc8azudh.R.inc(24485);try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24484);
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24486);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24487);locale = Locale.getDefault();
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24488);zone = DateTimeZone.getDefault();
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24489);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24490);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24491);Locale.setDefault(locale);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24492);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testDefault() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xwf06uiwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xwf06uiwd(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24493);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24494);assertNotNull(DateTimeZone.getDefault());
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24495);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24496);assertSame(PARIS, DateTimeZone.getDefault());
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24497);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24498);DateTimeZone.setDefault(null);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24499);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
            
    public void testDefaultSecurity() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ld1quiwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testDefaultSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ld1quiwk(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24500);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24501);if ((((OLD_JDK)&&(__CLR4_4_1iv9iv9lc8azudh.R.iget(24502)!=0|true))||(__CLR4_4_1iv9iv9lc8azudh.R.iget(24503)==0&false))) {{
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24504);return;
        }
        }__CLR4_4_1iv9iv9lc8azudh.R.inc(24505);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24506);Policy.setPolicy(RESTRICT);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24507);System.setSecurityManager(new SecurityManager());
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24508);DateTimeZone.setDefault(PARIS);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24509);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24510);System.setSecurityManager(null);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24511);Policy.setPolicy(ALLOW);
        }
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForID_String() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cty2zfiww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForID_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cty2zfiww(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24512);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24513);assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID((String) null));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24514);DateTimeZone zone = DateTimeZone.forID("Europe/London");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24515);assertEquals("Europe/London", zone.getID());
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24516);zone = DateTimeZone.forID("UTC");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24517);assertSame(DateTimeZone.UTC, zone);
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24518);zone = DateTimeZone.forID("+00:00");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24519);assertSame(DateTimeZone.UTC, zone);
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24520);zone = DateTimeZone.forID("+00");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24521);assertSame(DateTimeZone.UTC, zone);
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24522);zone = DateTimeZone.forID("+01:23");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24523);assertEquals("+01:23", zone.getID());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24524);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE),
                zone.getOffset(TEST_TIME_SUMMER));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24525);zone = DateTimeZone.forID("-02:00");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24526);assertEquals("-02:00", zone.getID());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24527);assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR),
                zone.getOffset(TEST_TIME_SUMMER));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24528);zone = DateTimeZone.forID("-07:05:34.0");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24529);assertEquals("-07:05:34", zone.getID());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24530);assertEquals((-7L * DateTimeConstants.MILLIS_PER_HOUR) +
                    (-5L * DateTimeConstants.MILLIS_PER_MINUTE) +
                    (-34L * DateTimeConstants.MILLIS_PER_SECOND),
                    zone.getOffset(TEST_TIME_SUMMER));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24531);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24532);DateTimeZone.forID("SST");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24533);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24534);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24535);DateTimeZone.forID("europe/london");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24536);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24537);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24538);DateTimeZone.forID("Europe/UK");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24539);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24540);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24541);DateTimeZone.forID("+");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24542);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24543);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24544);DateTimeZone.forID("+0");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24545);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testForID_String_old() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19uw4zixu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForID_String_old",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19uw4zixu(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24546);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24547);Map<String, String> map = new LinkedHashMap<String, String>();
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24548);map.put("GMT", "UTC");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24549);map.put("WET", "WET");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24550);map.put("CET", "CET");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24551);map.put("MET", "CET");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24552);map.put("ECT", "CET");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24553);map.put("EET", "EET");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24554);map.put("MIT", "Pacific/Apia");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24555);map.put("HST", "Pacific/Honolulu");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24556);map.put("AST", "America/Anchorage");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24557);map.put("PST", "America/Los_Angeles");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24558);map.put("MST", "America/Denver");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24559);map.put("PNT", "America/Phoenix");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24560);map.put("CST", "America/Chicago");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24561);map.put("EST", "America/New_York");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24562);map.put("IET", "America/Indiana/Indianapolis");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24563);map.put("PRT", "America/Puerto_Rico");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24564);map.put("CNT", "America/St_Johns");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24565);map.put("AGT", "America/Argentina/Buenos_Aires");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24566);map.put("BET", "America/Sao_Paulo");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24567);map.put("ART", "Africa/Cairo");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24568);map.put("CAT", "Africa/Harare");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24569);map.put("EAT", "Africa/Addis_Ababa");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24570);map.put("NET", "Asia/Yerevan");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24571);map.put("PLT", "Asia/Karachi");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24572);map.put("IST", "Asia/Kolkata");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24573);map.put("BST", "Asia/Dhaka");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24574);map.put("VST", "Asia/Ho_Chi_Minh");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24575);map.put("CTT", "Asia/Shanghai");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24576);map.put("JST", "Asia/Tokyo");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24577);map.put("ACT", "Australia/Darwin");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24578);map.put("AET", "Australia/Sydney");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24579);map.put("SST", "Pacific/Guadalcanal");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24580);map.put("NST", "Pacific/Auckland");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24581);for (String key : map.keySet()) {{
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24582);String value = map.get(key);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24583);TimeZone juZone = TimeZone.getTimeZone(key);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24584);DateTimeZone zone = DateTimeZone.forTimeZone(juZone);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24585);assertEquals(value, zone.getID());
//            System.out.println(juZone);
//            System.out.println(juZone.getDisplayName());
//            System.out.println(zone);
//            System.out.println("------");
        }
    }}finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForOffsetHours_int() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_171l9vgiyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_171l9vgiyy(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24586);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24587);assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24588);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetHours(3));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24589);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHours(-2));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24590);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24591);DateTimeZone.forOffsetHours(999999);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24592);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}        

    //-----------------------------------------------------------------------
    public void testForOffsetHoursMinutes_int_int() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vbwiniz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetHoursMinutes_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vbwiniz5(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24593);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24594);assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24595);assertEquals(DateTimeZone.forID("+23:59"), DateTimeZone.forOffsetHoursMinutes(23, 59));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24596);assertEquals(DateTimeZone.forID("+02:15"), DateTimeZone.forOffsetHoursMinutes(2, 15));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24597);assertEquals(DateTimeZone.forID("+02:00"), DateTimeZone.forOffsetHoursMinutes(2, 0));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24598);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24599);DateTimeZone.forOffsetHoursMinutes(2, -15);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24600);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24601);assertEquals(DateTimeZone.forID("+00:15"), DateTimeZone.forOffsetHoursMinutes(0, 15));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24602);assertEquals(DateTimeZone.forID("+00:00"), DateTimeZone.forOffsetHoursMinutes(0, 0));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24603);assertEquals(DateTimeZone.forID("-00:15"), DateTimeZone.forOffsetHoursMinutes(0, -15));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24604);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHoursMinutes(-2, 0));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24605);assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, -15));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24606);assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, 15));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24607);assertEquals(DateTimeZone.forID("-23:59"), DateTimeZone.forOffsetHoursMinutes(-23, 59));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24608);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24609);DateTimeZone.forOffsetHoursMinutes(2, 60);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24610);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24611);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24612);DateTimeZone.forOffsetHoursMinutes(-2, 60);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24613);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24614);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24615);DateTimeZone.forOffsetHoursMinutes(24, 0);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24616);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24617);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24618);DateTimeZone.forOffsetHoursMinutes(-24, 0);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24619);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}        

    //-----------------------------------------------------------------------
    public void testForOffsetMillis_int() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd46g7izw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd46g7izw(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24620);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24621);assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24622);assertEquals(DateTimeZone.forID("+23:59:59.999"), DateTimeZone.forOffsetMillis((24 * 60 * 60 * 1000) - 1));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24623);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetMillis(3 * 60 * 60 * 1000));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24624);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetMillis(-2 * 60 * 60 * 1000));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24625);assertEquals(DateTimeZone.forID("-23:59:59.999"), DateTimeZone.forOffsetMillis((-24 * 60 * 60 * 1000) + 1));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24626);assertEquals(DateTimeZone.forID("+04:45:17.045"),
                DateTimeZone.forOffsetMillis(
                        4 * 60 * 60 * 1000 + 45 * 60 * 1000 + 17 * 1000 + 45));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}        

    //-----------------------------------------------------------------------
    public void testForTimeZone_TimeZone() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1by9ru9j03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForTimeZone_TimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1by9ru9j03(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24627);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24628);assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone((TimeZone) null));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24629);DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24630);assertEquals("Europe/London", zone.getID());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24631);assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24632);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("+00:00"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24633);assertSame(DateTimeZone.UTC, zone);
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24634);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24635);assertSame(DateTimeZone.UTC, zone);
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24636);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24637);assertSame(DateTimeZone.UTC, zone);
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24638);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24639);assertSame(DateTimeZone.UTC, zone);
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24640);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+01:23"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24641);assertEquals("+01:23", zone.getID());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24642);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE),
                zone.getOffset(TEST_TIME_SUMMER));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24643);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+1:23"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24644);assertEquals("+01:23", zone.getID());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24645);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE),
                zone.getOffset(TEST_TIME_SUMMER));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24646);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-02:00"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24647);assertEquals("-02:00", zone.getID());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24648);assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24649);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+2"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24650);assertEquals("+02:00", zone.getID());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24651);assertEquals((2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24652);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24653);assertEquals("America/New_York", zone.getID());
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testTimeZoneConversion() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ipqkrcj0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testTimeZoneConversion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ipqkrcj0u(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24654);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24655);TimeZone jdkTimeZone = TimeZone.getTimeZone("GMT-10");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24656);assertEquals("GMT-10:00", jdkTimeZone.getID());
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24657);DateTimeZone jodaTimeZone = DateTimeZone.forTimeZone(jdkTimeZone);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24658);assertEquals("-10:00", jodaTimeZone.getID());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24659);assertEquals(jdkTimeZone.getRawOffset(), jodaTimeZone.getOffset(0L));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24660);TimeZone convertedTimeZone = jodaTimeZone.toTimeZone();
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24661);assertEquals("GMT-10:00", jdkTimeZone.getID());
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24662);assertEquals(jdkTimeZone.getID(), convertedTimeZone.getID());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24663);assertEquals(jdkTimeZone.getRawOffset(), convertedTimeZone.getRawOffset());
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetAvailableIDs() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mu0qeyj14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetAvailableIDs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mu0qeyj14(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24664);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24665);assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testProvider() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4ayd2j16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4ayd2j16(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24666);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24667);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24668);assertNotNull(DateTimeZone.getProvider());
        
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24669);Provider provider = DateTimeZone.getProvider();
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24670);DateTimeZone.setProvider(null);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24671);assertEquals(provider.getClass(), DateTimeZone.getProvider().getClass());
        
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24672);try {
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24673);DateTimeZone.setProvider(new MockNullIDSProvider());
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24674);fail();
            } catch (IllegalArgumentException ex) {}
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24675);try {
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24676);DateTimeZone.setProvider(new MockEmptyIDSProvider());
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24677);fail();
            } catch (IllegalArgumentException ex) {}
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24678);try {
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24679);DateTimeZone.setProvider(new MockNoUTCProvider());
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24680);fail();
            } catch (IllegalArgumentException ex) {}
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24681);try {
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24682);DateTimeZone.setProvider(new MockBadUTCProvider());
                __CLR4_4_1iv9iv9lc8azudh.R.inc(24683);fail();
            } catch (IllegalArgumentException ex) {}
        
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24684);Provider prov = new MockOKProvider();
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24685);DateTimeZone.setProvider(prov);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24686);assertSame(prov, DateTimeZone.getProvider());
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24687);assertEquals(2, DateTimeZone.getAvailableIDs().size());
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24688);assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24689);assertTrue(DateTimeZone.getAvailableIDs().contains("Europe/London"));
        } finally {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24690);DateTimeZone.setProvider(null);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24691);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass());
        }
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24692);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24693);System.setProperty("org.joda.time.DateTimeZone.Provider", "org.joda.time.tz.UTCProvider");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24694);DateTimeZone.setProvider(null);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24695);assertEquals(UTCProvider.class, DateTimeZone.getProvider().getClass());
        } finally {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24696);System.getProperties().remove("org.joda.time.DateTimeZone.Provider");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24697);DateTimeZone.setProvider(null);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24698);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass());
        }
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testProvider_badClassName() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16r4ke7j23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider_badClassName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16r4ke7j23(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24699);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24700);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24701);System.setProperty("org.joda.time.DateTimeZone.Provider", "xxx");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24702);DateTimeZone.setProvider(null);
            
        } catch (RuntimeException ex) {
            // expected
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24703);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass());
        } finally {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24704);System.getProperties().remove("org.joda.time.DateTimeZone.Provider");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24705);DateTimeZone.setProvider(null);
        }
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
    
    public void testProviderSecurity() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttojxmj2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProviderSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttojxmj2a(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24706);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24707);if ((((OLD_JDK)&&(__CLR4_4_1iv9iv9lc8azudh.R.iget(24708)!=0|true))||(__CLR4_4_1iv9iv9lc8azudh.R.iget(24709)==0&false))) {{
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24710);return;
        }
        }__CLR4_4_1iv9iv9lc8azudh.R.inc(24711);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24712);Policy.setPolicy(RESTRICT);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24713);System.setSecurityManager(new SecurityManager());
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24714);DateTimeZone.setProvider(new MockOKProvider());
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24715);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24716);System.setSecurityManager(null);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24717);Policy.setPolicy(ALLOW);
        }
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    static class MockNullIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24718);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24719);return null;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24720);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24721);return null;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
    }
    static class MockEmptyIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24722);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24723);return new HashSet();
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24724);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24725);return null;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
    }
    static class MockNoUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24726);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24727);Set set = new HashSet();
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24728);set.add("Europe/London");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24729);return set;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24730);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24731);return null;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
    }
    static class MockBadUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24732);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24733);Set set = new HashSet();
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24734);set.add("UTC");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24735);set.add("Europe/London");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24736);return set;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24737);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24738);return null;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
    }
    static class MockOKProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24739);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24740);Set set = new HashSet();
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24741);set.add("UTC");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24742);set.add("Europe/London");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24743);return set;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24744);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24745);return DateTimeZone.UTC;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testNameProvider() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggyvxnj3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggyvxnj3e(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24746);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24747);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24748);assertNotNull(DateTimeZone.getNameProvider());
        
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24749);NameProvider provider = DateTimeZone.getNameProvider();
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24750);DateTimeZone.setNameProvider(null);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24751);assertEquals(provider.getClass(), DateTimeZone.getNameProvider().getClass());
        
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24752);provider = new MockOKButNullNameProvider();
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24753);DateTimeZone.setNameProvider(provider);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24754);assertSame(provider, DateTimeZone.getNameProvider());
            
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24755);assertEquals("+00:00", DateTimeZone.UTC.getShortName(TEST_TIME_SUMMER));
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24756);assertEquals("+00:00", DateTimeZone.UTC.getName(TEST_TIME_SUMMER));
        } finally {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24757);DateTimeZone.setNameProvider(null);
        }
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24758);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24759);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "org.joda.time.tz.DefaultNameProvider");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24760);DateTimeZone.setNameProvider(null);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24761);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass());
        } finally {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24762);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24763);DateTimeZone.setNameProvider(null);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24764);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass());
        }
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testNameProvider_badClassName() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1meizsaj3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider_badClassName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1meizsaj3x(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24765);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24766);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24767);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "xxx");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24768);DateTimeZone.setProvider(null);
            
        } catch (RuntimeException ex) {
            // expected
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24769);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass());
        } finally {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24770);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider");
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24771);DateTimeZone.setProvider(null);
        }
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testNameProviderSecurity() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdjynpj44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProviderSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdjynpj44(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24772);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24773);if ((((OLD_JDK)&&(__CLR4_4_1iv9iv9lc8azudh.R.iget(24774)!=0|true))||(__CLR4_4_1iv9iv9lc8azudh.R.iget(24775)==0&false))) {{
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24776);return;
        }
        }__CLR4_4_1iv9iv9lc8azudh.R.inc(24777);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24778);Policy.setPolicy(RESTRICT);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24779);System.setSecurityManager(new SecurityManager());
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24780);DateTimeZone.setNameProvider(new MockOKButNullNameProvider());
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24781);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24782);System.setSecurityManager(null);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24783);Policy.setPolicy(ALLOW);
        }
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    static class MockOKButNullNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24784);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24785);return null;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        public String getName(Locale locale, String id, String nameKey) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24786);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24787);return null;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testConstructor() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hj4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hj4k(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24788);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24789);assertEquals(1, DateTimeZone.class.getDeclaredConstructors().length);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24790);assertTrue(Modifier.isProtected(DateTimeZone.class.getDeclaredConstructors()[0].getModifiers()));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24791);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24792);new DateTimeZone(null) {
                public String getNameKey(long instant) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24793);
                    __CLR4_4_1iv9iv9lc8azudh.R.inc(24794);return null;
                }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
                public int getOffset(long instant) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24795);
                    __CLR4_4_1iv9iv9lc8azudh.R.inc(24796);return 0;
                }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
                public int getStandardOffset(long instant) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24797);
                    __CLR4_4_1iv9iv9lc8azudh.R.inc(24798);return 0;
                }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
                public boolean isFixed() {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24799);
                    __CLR4_4_1iv9iv9lc8azudh.R.inc(24800);return false;
                }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
                public long nextTransition(long instant) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24801);
                    __CLR4_4_1iv9iv9lc8azudh.R.inc(24802);return 0;
                }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
                public long previousTransition(long instant) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24803);
                    __CLR4_4_1iv9iv9lc8azudh.R.inc(24804);return 0;
                }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
                public boolean equals(Object object) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24805);
                    __CLR4_4_1iv9iv9lc8azudh.R.inc(24806);return false;
                }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
            };
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetID() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nau9sqj53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetID",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nau9sqj53(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24807);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24808);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24809);assertEquals("Europe/Paris", zone.getID());
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testGetNameKey() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gaxst3j56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetNameKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gaxst3j56(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24810);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24811);DateTimeZone zone = DateTimeZone.forID("Europe/London");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24812);assertEquals("BST", zone.getNameKey(TEST_TIME_SUMMER));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24813);assertEquals("GMT", zone.getNameKey(TEST_TIME_WINTER));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    static final boolean JDK6;
    static {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24814);
      __CLR4_4_1iv9iv9lc8azudh.R.inc(24815);boolean jdk6 = true;
      __CLR4_4_1iv9iv9lc8azudh.R.inc(24816);try {
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24817);DateFormatSymbols.class.getMethod("getInstance", new Class[] {Locale.class});
      } catch (Exception ex) {
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24818);jdk6 = false;
      } 
      __CLR4_4_1iv9iv9lc8azudh.R.inc(24819);JDK6 = jdk6;
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testGetShortName() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7sb9mj5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7sb9mj5g(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24820);}finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testGetShortName() {
//         DateTimeZone zone = DateTimeZone.forID("Europe/London");
//         assertEquals("BST", zone.getShortName(TEST_TIME_SUMMER));
//         assertEquals("GMT", zone.getShortName(TEST_TIME_WINTER));
//         assertEquals("BST", zone.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH));
//     }

    public void testGetShortName_berlin() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f64lhhj5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortName_berlin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f64lhhj5h(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24821);}finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testGetShortName_berlin() {
//         DateTimeZone berlin = DateTimeZone.forID("Europe/Berlin");
//         assertEquals("CET", berlin.getShortName(TEST_TIME_WINTER, Locale.ENGLISH));
//         assertEquals("CEST", berlin.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH));
//         if (JDK6) {
//           assertEquals("MEZ", berlin.getShortName(TEST_TIME_WINTER, Locale.GERMAN));
//           assertEquals("MESZ", berlin.getShortName(TEST_TIME_SUMMER, Locale.GERMAN));
//         } else {
//           assertEquals("CET", berlin.getShortName(TEST_TIME_WINTER, Locale.GERMAN));
//           assertEquals("CEST", berlin.getShortName(TEST_TIME_SUMMER, Locale.GERMAN));
//         }
//     }

    public void testGetShortNameProviderName() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqz7waj5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortNameProviderName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqz7waj5i(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24822);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24823);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, "Europe/London", "BST"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24824);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, null, "BST"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24825);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, "Europe/London", null));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24826);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, null, null));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testGetShortNameNullKey() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h3azz8j5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortNameNullKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h3azz8j5n(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24827);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24828);DateTimeZone zone = new MockDateTimeZone("Europe/London");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24829);assertEquals("Europe/London", zone.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testGetName() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yb2b9mj5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yb2b9mj5q(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24830);}finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testGetName() {
//         DateTimeZone zone = DateTimeZone.forID("Europe/London");
//         assertEquals("British Summer Time", zone.getName(TEST_TIME_SUMMER));
//         assertEquals("Greenwich Mean Time", zone.getName(TEST_TIME_WINTER));
//         assertEquals("British Summer Time", zone.getName(TEST_TIME_SUMMER, Locale.ENGLISH));
//     }

    public void testGetName_berlin() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cm5wknj5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetName_berlin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cm5wknj5r(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24831);}finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testGetName_berlin() {
//       DateTimeZone berlin = DateTimeZone.forID("Europe/Berlin");
//       assertEquals("Central European Time", berlin.getName(TEST_TIME_WINTER, Locale.ENGLISH));
//       assertEquals("Central European Summer Time", berlin.getName(TEST_TIME_SUMMER, Locale.ENGLISH));
//       if (JDK6) {
//         assertEquals("Mitteleurop\u00e4ische Zeit", berlin.getName(TEST_TIME_WINTER, Locale.GERMAN));
//         assertEquals("Mitteleurop\u00e4ische Sommerzeit", berlin.getName(TEST_TIME_SUMMER, Locale.GERMAN));
//       } else {
//         assertEquals("Zentraleurop\u00e4ische Zeit", berlin.getName(TEST_TIME_WINTER, Locale.GERMAN));
//         assertEquals("Zentraleurop\u00e4ische Sommerzeit", berlin.getName(TEST_TIME_SUMMER, Locale.GERMAN));
//       }
//   }

    public void testGetNameProviderName() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15si5rmj5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetNameProviderName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15si5rmj5s(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24832);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24833);assertEquals(null, DateTimeZone.getNameProvider().getName(null, "Europe/London", "BST"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24834);assertEquals(null, DateTimeZone.getNameProvider().getName(Locale.ENGLISH, null, "BST"));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24835);assertEquals(null, DateTimeZone.getNameProvider().getName(Locale.ENGLISH, "Europe/London", null));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24836);assertEquals(null, DateTimeZone.getNameProvider().getName(null, null, null));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testGetNameNullKey() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5ijxsj5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetNameNullKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5ijxsj5x(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24837);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24838);DateTimeZone zone = new MockDateTimeZone("Europe/London");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24839);assertEquals("Europe/London", zone.getName(TEST_TIME_SUMMER, Locale.ENGLISH));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    static class MockDateTimeZone extends DateTimeZone {
        public MockDateTimeZone(String id) {
            super(id);__CLR4_4_1iv9iv9lc8azudh.R.inc(24841);try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24840);
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        public String getNameKey(long instant) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24842);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24843);return null;  // null
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        public int getOffset(long instant) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24844);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24845);return 0;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        public int getStandardOffset(long instant) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24846);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24847);return 0;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        public boolean isFixed() {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24848);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24849);return false;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        public long nextTransition(long instant) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24850);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24851);return 0;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        public long previousTransition(long instant) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24852);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24853);return 0;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
        public boolean equals(Object object) {try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24854);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24855);return false;
        }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testGetOffset_long() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfybv9j6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetOffset_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfybv9j6g(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24856);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24857);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24858);assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_SUMMER));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24859);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_WINTER));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24860);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_SUMMER));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24861);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_WINTER));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24862);assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_SUMMER));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24863);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_WINTER));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24864);assertEquals(false, zone.isStandardOffset(TEST_TIME_SUMMER));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24865);assertEquals(true, zone.isStandardOffset(TEST_TIME_WINTER));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testGetOffset_RI() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15clxaej6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetOffset_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15clxaej6q(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24866);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24867);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24868);assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_SUMMER)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24869);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_WINTER)));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24870);assertEquals(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset(null));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testGetOffsetFixed() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z8j0zgj6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetOffsetFixed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z8j0zgj6v(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24871);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24872);DateTimeZone zone = DateTimeZone.forID("+01:00");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24873);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_SUMMER));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24874);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_WINTER));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24875);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_SUMMER));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24876);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_WINTER));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24877);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_SUMMER));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24878);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_WINTER));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24879);assertEquals(true, zone.isStandardOffset(TEST_TIME_SUMMER));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24880);assertEquals(true, zone.isStandardOffset(TEST_TIME_WINTER));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testGetOffsetFixed_RI() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1raxneoj75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetOffsetFixed_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1raxneoj75(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24881);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24882);DateTimeZone zone = DateTimeZone.forID("+01:00");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24883);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_SUMMER)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24884);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_WINTER)));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24885);assertEquals(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset(null));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetMillisKeepLocal() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161hj3xj7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetMillisKeepLocal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161hj3xj7a(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24886);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24887);long millisLondon = TEST_TIME_SUMMER;
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24888);long millisParis = TEST_TIME_SUMMER - 1L * DateTimeConstants.MILLIS_PER_HOUR;
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24889);assertEquals(millisLondon, LONDON.getMillisKeepLocal(LONDON, millisLondon));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24890);assertEquals(millisParis, LONDON.getMillisKeepLocal(LONDON, millisParis));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24891);assertEquals(millisLondon, PARIS.getMillisKeepLocal(PARIS, millisLondon));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24892);assertEquals(millisParis, PARIS.getMillisKeepLocal(PARIS, millisParis));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24893);assertEquals(millisParis, LONDON.getMillisKeepLocal(PARIS, millisLondon));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24894);assertEquals(millisLondon, PARIS.getMillisKeepLocal(LONDON, millisParis));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24895);DateTimeZone zone = DateTimeZone.getDefault();
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24896);try {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24897);DateTimeZone.setDefault(LONDON);
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24898);assertEquals(millisLondon, PARIS.getMillisKeepLocal(null, millisParis));
        } finally {
            __CLR4_4_1iv9iv9lc8azudh.R.inc(24899);DateTimeZone.setDefault(zone);
        }
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsFixed() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8oj3zj7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsFixed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8oj3zj7o(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24900);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24901);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24902);assertEquals(false, zone.isFixed());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24903);assertEquals(true, DateTimeZone.UTC.isFixed());
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTransitionFixed() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdpdxwj7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testTransitionFixed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdpdxwj7s(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24904);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24905);DateTimeZone zone = DateTimeZone.forID("+01:00");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24906);assertEquals(TEST_TIME_SUMMER, zone.nextTransition(TEST_TIME_SUMMER));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24907);assertEquals(TEST_TIME_WINTER, zone.nextTransition(TEST_TIME_WINTER));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24908);assertEquals(TEST_TIME_SUMMER, zone.previousTransition(TEST_TIME_SUMMER));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24909);assertEquals(TEST_TIME_WINTER, zone.previousTransition(TEST_TIME_WINTER));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

//    //-----------------------------------------------------------------------
//    public void testIsLocalDateTimeOverlap_Berlin() {
//        DateTimeZone zone = DateTimeZone.forID("Europe/Berlin");
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 1, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 1, 59, 59, 99)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 0)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 30)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 59, 59, 99)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 3, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 4, 0)));
//        
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 1, 30)));  // before gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 2, 30)));  // gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 3, 30)));  // after gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 12, 24, 12, 34)));
//    }
//
//    //-----------------------------------------------------------------------
//    public void testIsLocalDateTimeOverlap_NewYork() {
//        DateTimeZone zone = DateTimeZone.forID("America/New_York");
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 0, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 0, 59, 59, 99)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 0)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 30)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 59, 59, 99)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 2, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 3, 0)));
//        
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 1, 30)));  // before gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 2, 30)));  // gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 3, 30)));  // after gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 12, 24, 12, 34)));
//    }

    //-----------------------------------------------------------------------
    public void testIsLocalDateTimeGap_Berlin() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ip2ipwj7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsLocalDateTimeGap_Berlin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ip2ipwj7y(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24910);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24911);DateTimeZone zone = DateTimeZone.forID("Europe/Berlin");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24912);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 0)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24913);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 59, 59, 99)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24914);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 0)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24915);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 30)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24916);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 59, 59, 99)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24917);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 3, 0)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24918);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 4, 0)));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24919);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 1, 30)));  // before overlap
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24920);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 2, 30)));  // overlap
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24921);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 3, 30)));  // after overlap
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24922);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 12, 24, 12, 34)));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsLocalDateTimeGap_NewYork() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ijd7b7j8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsLocalDateTimeGap_NewYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ijd7b7j8b(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24923);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24924);DateTimeZone zone = DateTimeZone.forID("America/New_York");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24925);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 1, 0)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24926);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 1, 59, 59, 99)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24927);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 0)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24928);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 30)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24929);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 59, 59, 99)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24930);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 3, 0)));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24931);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 4, 0)));
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24932);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 11, 4, 0, 30)));  // before overlap
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24933);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 11, 4, 1, 30)));  // overlap
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24934);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 11, 4, 2, 30)));  // after overlap
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24935);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 12, 24, 12, 34)));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToTimeZone() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1inqrn1j8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testToTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1inqrn1j8o(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24936);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24937);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24938);TimeZone tz = zone.toTimeZone();
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24939);assertEquals("Europe/Paris", tz.getID());
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEqualsHashCode() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77j8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77j8s(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24940);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24941);DateTimeZone zone1 = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24942);DateTimeZone zone2 = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24943);assertEquals(true, zone1.equals(zone1));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24944);assertEquals(true, zone1.equals(zone2));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24945);assertEquals(true, zone2.equals(zone1));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24946);assertEquals(true, zone2.equals(zone2));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24947);assertEquals(true, zone1.hashCode() == zone2.hashCode());
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24948);DateTimeZone zone3 = DateTimeZone.forID("Europe/London");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24949);assertEquals(true, zone3.equals(zone3));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24950);assertEquals(false, zone1.equals(zone3));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24951);assertEquals(false, zone2.equals(zone3));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24952);assertEquals(false, zone3.equals(zone1));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24953);assertEquals(false, zone3.equals(zone2));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24954);assertEquals(false, zone1.hashCode() == zone3.hashCode());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24955);assertEquals(true, zone3.hashCode() == zone3.hashCode());
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24956);DateTimeZone zone4 = DateTimeZone.forID("+01:00");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24957);assertEquals(true, zone4.equals(zone4));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24958);assertEquals(false, zone1.equals(zone4));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24959);assertEquals(false, zone2.equals(zone4));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24960);assertEquals(false, zone3.equals(zone4));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24961);assertEquals(false, zone4.equals(zone1));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24962);assertEquals(false, zone4.equals(zone2));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24963);assertEquals(false, zone4.equals(zone3));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24964);assertEquals(false, zone1.hashCode() == zone4.hashCode());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24965);assertEquals(true, zone4.hashCode() == zone4.hashCode());
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24966);DateTimeZone zone5 = DateTimeZone.forID("+02:00");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24967);assertEquals(true, zone5.equals(zone5));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24968);assertEquals(false, zone1.equals(zone5));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24969);assertEquals(false, zone2.equals(zone5));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24970);assertEquals(false, zone3.equals(zone5));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24971);assertEquals(false, zone4.equals(zone5));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24972);assertEquals(false, zone5.equals(zone1));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24973);assertEquals(false, zone5.equals(zone2));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24974);assertEquals(false, zone5.equals(zone3));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24975);assertEquals(false, zone5.equals(zone4));
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24976);assertEquals(false, zone1.hashCode() == zone5.hashCode());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24977);assertEquals(true, zone5.hashCode() == zone5.hashCode());
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidj9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidj9u(){try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24978);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24979);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24980);assertEquals("Europe/Paris", zone.toString());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24981);assertEquals("UTC", DateTimeZone.UTC.toString());
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization1() throws Exception {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfkbx6j9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testSerialization1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfkbx6j9y() throws Exception{try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24982);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24983);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24984);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24985);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24986);oos.writeObject(zone);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24987);byte[] bytes = baos.toByteArray();
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24988);oos.close();
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24989);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24990);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24991);DateTimeZone result = (DateTimeZone) ois.readObject();
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24992);ois.close();
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24993);assertSame(zone, result);
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization2() throws Exception {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),24994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yokapnjaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testSerialization2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yokapnjaa() throws Exception{try{__CLR4_4_1iv9iv9lc8azudh.R.inc(24994);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24995);DateTimeZone zone = DateTimeZone.forID("+01:00");
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24996);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24997);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24998);oos.writeObject(zone);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(24999);byte[] bytes = baos.toByteArray();
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25000);oos.close();
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25001);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25002);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25003);DateTimeZone result = (DateTimeZone) ois.readObject();
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25004);ois.close();
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25005);assertSame(zone, result);
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testCommentParse() throws Exception {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),25006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xogb7xjam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testCommentParse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xogb7xjam() throws Exception{try{__CLR4_4_1iv9iv9lc8azudh.R.inc(25006);
        // A bug in ZoneInfoCompiler's handling of comments broke Europe/Athens
        // after 1980. This test is included to make sure it doesn't break again.

        __CLR4_4_1iv9iv9lc8azudh.R.inc(25007);DateTimeZone zone = DateTimeZone.forID("Europe/Athens");
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25008);DateTime dt = new DateTime(2005, 5, 5, 20, 10, 15, 0, zone);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25009);assertEquals(1115313015000L, dt.getMillis());
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testPatchedNameKeysLondon() throws Exception {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),25010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3084zjaq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysLondon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3084zjaq() throws Exception{try{__CLR4_4_1iv9iv9lc8azudh.R.inc(25010);
        // the tz database does not have unique name keys [1716305]
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25011);DateTimeZone zone = DateTimeZone.forID("Europe/London");
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25012);DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25013);String str1 = zone.getName(now.getMillis());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25014);String str2 = zone.getName(now.plusMonths(6).getMillis());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25015);assertEquals(false, str1.equals(str2));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testPatchedNameKeysSydney() throws Exception {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),25016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzbz29jaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysSydney",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzbz29jaw() throws Exception{try{__CLR4_4_1iv9iv9lc8azudh.R.inc(25016);
        // the tz database does not have unique name keys [1716305]
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25017);DateTimeZone zone = DateTimeZone.forID("Australia/Sydney");
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25018);DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25019);String str1 = zone.getName(now.getMillis());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25020);String str2 = zone.getName(now.plusMonths(6).getMillis());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25021);assertEquals(false, str1.equals(str2));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testPatchedNameKeysSydneyHistoric() throws Exception {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),25022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k3k02mjb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysSydneyHistoric",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k3k02mjb2() throws Exception{try{__CLR4_4_1iv9iv9lc8azudh.R.inc(25022);
        // the tz database does not have unique name keys [1716305]
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25023);DateTimeZone zone = DateTimeZone.forID("Australia/Sydney");
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25024);DateTime now = new DateTime(1996, 1, 1, 0, 0, 0, 0);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25025);String str1 = zone.getName(now.getMillis());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25026);String str2 = zone.getName(now.plusMonths(6).getMillis());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25027);assertEquals(false, str1.equals(str2));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

    public void testPatchedNameKeysGazaHistoric() throws Exception {__CLR4_4_1iv9iv9lc8azudh.R.globalSliceStart(getClass().getName(),25028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9o6p1jb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iv9iv9lc8azudh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iv9iv9lc8azudh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysGazaHistoric",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9o6p1jb8() throws Exception{try{__CLR4_4_1iv9iv9lc8azudh.R.inc(25028);
        // the tz database does not have unique name keys [1716305]
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25029);DateTimeZone zone = DateTimeZone.forID("Africa/Johannesburg");
        
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25030);DateTime now = new DateTime(1943, 1, 1, 0, 0, 0, 0);
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25031);String str1 = zone.getName(now.getMillis());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25032);String str2 = zone.getName(now.plusMonths(6).getMillis());
        __CLR4_4_1iv9iv9lc8azudh.R.inc(25033);assertEquals(false, str1.equals(str2));
    }finally{__CLR4_4_1iv9iv9lc8azudh.R.flushNeeded();}}

}
