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

import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeUtils.MillisProvider;
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for DateTimeUtils.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeUtils extends TestCase {static class __CLR4_4_1inuinulc8azubi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,24453,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final GJChronology GJ = GJChronology.getInstance();
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1inuinulc8azubi.R.inc(24186);
        __CLR4_4_1inuinulc8azubi.R.inc(24187);String str = System.getProperty("java.version");
        __CLR4_4_1inuinulc8azubi.R.inc(24188);boolean old = true;
        __CLR4_4_1inuinulc8azubi.R.inc(24189);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1inuinulc8azubi.R.iget(24190)!=0|true))||(__CLR4_4_1inuinulc8azubi.R.iget(24191)==0&false))) {{
            __CLR4_4_1inuinulc8azubi.R.inc(24192);old = false;
        }
        }__CLR4_4_1inuinulc8azubi.R.inc(24193);OLD_JDK = old;
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1inuinulc8azubi.R.inc(24194);
        // don't call Policy.getPolicy()
        __CLR4_4_1inuinulc8azubi.R.inc(24195);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1inuinulc8azubi.R.inc(24196);
                __CLR4_4_1inuinulc8azubi.R.inc(24197);Permissions p = new Permissions();
                __CLR4_4_1inuinulc8azubi.R.inc(24198);p.add(new AllPermission());  // enable everything
                __CLR4_4_1inuinulc8azubi.R.inc(24199);return p;
            }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1inuinulc8azubi.R.inc(24200);
            }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1inuinulc8azubi.R.inc(24201);
                __CLR4_4_1inuinulc8azubi.R.inc(24202);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1inuinulc8azubi.R.iget(24203)!=0|true))||(__CLR4_4_1inuinulc8azubi.R.iget(24204)==0&false))) {{
                    __CLR4_4_1inuinulc8azubi.R.inc(24205);return false;
                }
                }__CLR4_4_1inuinulc8azubi.R.inc(24206);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}
        };
        __CLR4_4_1inuinulc8azubi.R.inc(24207);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1inuinulc8azubi.R.inc(24208);
                __CLR4_4_1inuinulc8azubi.R.inc(24209);Permissions p = new Permissions();
                __CLR4_4_1inuinulc8azubi.R.inc(24210);p.add(new AllPermission());  // enable everything
                __CLR4_4_1inuinulc8azubi.R.inc(24211);return p;
            }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1inuinulc8azubi.R.inc(24212);
            }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}
    
    public static void main(String[] args) {try{__CLR4_4_1inuinulc8azubi.R.inc(24213);
        __CLR4_4_1inuinulc8azubi.R.inc(24214);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1inuinulc8azubi.R.inc(24215);
        __CLR4_4_1inuinulc8azubi.R.inc(24216);return new TestSuite(TestDateTimeUtils.class);
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    public TestDateTimeUtils(String name) {
        super(name);__CLR4_4_1inuinulc8azubi.R.inc(24218);try{__CLR4_4_1inuinulc8azubi.R.inc(24217);
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1inuinulc8azubi.R.inc(24219);
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1inuinulc8azubi.R.inc(24220);
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjiot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjiot(){try{__CLR4_4_1inuinulc8azubi.R.inc(24221);
        __CLR4_4_1inuinulc8azubi.R.inc(24222);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1inuinulc8azubi.R.inc(24223);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1inuinulc8azubi.R.inc(24224);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testClass() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11x2ulviox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11x2ulviox(){try{__CLR4_4_1inuinulc8azubi.R.inc(24225);
        __CLR4_4_1inuinulc8azubi.R.inc(24226);Class<?> cls = DateTimeUtils.class;
        __CLR4_4_1inuinulc8azubi.R.inc(24227);assertEquals(true, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_1inuinulc8azubi.R.inc(24228);assertEquals(false, Modifier.isFinal(cls.getModifiers()));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24229);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_1inuinulc8azubi.R.inc(24230);assertEquals(true, Modifier.isProtected(cls.getDeclaredConstructors()[0].getModifiers()));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24231);new DateTimeUtils() {};
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testSystemMillis() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oi2esuip4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testSystemMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oi2esuip4(){try{__CLR4_4_1inuinulc8azubi.R.inc(24232);
        __CLR4_4_1inuinulc8azubi.R.inc(24233);long nowSystem = System.currentTimeMillis();
        __CLR4_4_1inuinulc8azubi.R.inc(24234);long now = DateTimeUtils.currentTimeMillis();
        __CLR4_4_1inuinulc8azubi.R.inc(24235);assertTrue((now >= nowSystem));
        __CLR4_4_1inuinulc8azubi.R.inc(24236);assertTrue((now - nowSystem) < 10000L);
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSystemMillisSecurity() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tft4iip9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testSystemMillisSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tft4iip9(){try{__CLR4_4_1inuinulc8azubi.R.inc(24237);
        __CLR4_4_1inuinulc8azubi.R.inc(24238);if ((((OLD_JDK)&&(__CLR4_4_1inuinulc8azubi.R.iget(24239)!=0|true))||(__CLR4_4_1inuinulc8azubi.R.iget(24240)==0&false))) {{
            __CLR4_4_1inuinulc8azubi.R.inc(24241);return;
        }
        }__CLR4_4_1inuinulc8azubi.R.inc(24242);try {
            __CLR4_4_1inuinulc8azubi.R.inc(24243);try {
                __CLR4_4_1inuinulc8azubi.R.inc(24244);Policy.setPolicy(RESTRICT);
                __CLR4_4_1inuinulc8azubi.R.inc(24245);System.setSecurityManager(new SecurityManager());
                __CLR4_4_1inuinulc8azubi.R.inc(24246);DateTimeUtils.setCurrentMillisSystem();
                __CLR4_4_1inuinulc8azubi.R.inc(24247);fail();
            } catch (SecurityException ex) {
                // ok
            } finally {
                __CLR4_4_1inuinulc8azubi.R.inc(24248);System.setSecurityManager(null);
                __CLR4_4_1inuinulc8azubi.R.inc(24249);Policy.setPolicy(ALLOW);
            }
        } finally {
            __CLR4_4_1inuinulc8azubi.R.inc(24250);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFixedMillis() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xo9rn3ipn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testFixedMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xo9rn3ipn(){try{__CLR4_4_1inuinulc8azubi.R.inc(24251);
        __CLR4_4_1inuinulc8azubi.R.inc(24252);try {
            __CLR4_4_1inuinulc8azubi.R.inc(24253);DateTimeUtils.setCurrentMillisFixed(0L);
            __CLR4_4_1inuinulc8azubi.R.inc(24254);assertEquals(0L, DateTimeUtils.currentTimeMillis());
            __CLR4_4_1inuinulc8azubi.R.inc(24255);assertEquals(0L, DateTimeUtils.currentTimeMillis());
            __CLR4_4_1inuinulc8azubi.R.inc(24256);assertEquals(0L, DateTimeUtils.currentTimeMillis());
        } finally {
            __CLR4_4_1inuinulc8azubi.R.inc(24257);DateTimeUtils.setCurrentMillisSystem();
        }
        __CLR4_4_1inuinulc8azubi.R.inc(24258);long nowSystem = System.currentTimeMillis();
        __CLR4_4_1inuinulc8azubi.R.inc(24259);long now = DateTimeUtils.currentTimeMillis();
        __CLR4_4_1inuinulc8azubi.R.inc(24260);assertTrue((now >= nowSystem));
        __CLR4_4_1inuinulc8azubi.R.inc(24261);assertTrue((now - nowSystem) < 10000L);
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFixedMillisSecurity() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fc5mcxipy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testFixedMillisSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fc5mcxipy(){try{__CLR4_4_1inuinulc8azubi.R.inc(24262);
        __CLR4_4_1inuinulc8azubi.R.inc(24263);if ((((OLD_JDK)&&(__CLR4_4_1inuinulc8azubi.R.iget(24264)!=0|true))||(__CLR4_4_1inuinulc8azubi.R.iget(24265)==0&false))) {{
            __CLR4_4_1inuinulc8azubi.R.inc(24266);return;
        }
        }__CLR4_4_1inuinulc8azubi.R.inc(24267);try {
            __CLR4_4_1inuinulc8azubi.R.inc(24268);try {
                __CLR4_4_1inuinulc8azubi.R.inc(24269);Policy.setPolicy(RESTRICT);
                __CLR4_4_1inuinulc8azubi.R.inc(24270);System.setSecurityManager(new SecurityManager());
                __CLR4_4_1inuinulc8azubi.R.inc(24271);DateTimeUtils.setCurrentMillisFixed(0L);
                __CLR4_4_1inuinulc8azubi.R.inc(24272);fail();
            } catch (SecurityException ex) {
                // ok
            } finally {
                __CLR4_4_1inuinulc8azubi.R.inc(24273);System.setSecurityManager(null);
                __CLR4_4_1inuinulc8azubi.R.inc(24274);Policy.setPolicy(ALLOW);
            }
        } finally {
            __CLR4_4_1inuinulc8azubi.R.inc(24275);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testOffsetMillis() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fty0fiiqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testOffsetMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fty0fiiqc(){try{__CLR4_4_1inuinulc8azubi.R.inc(24276);
        __CLR4_4_1inuinulc8azubi.R.inc(24277);try {
            // set time to one day ago
            __CLR4_4_1inuinulc8azubi.R.inc(24278);DateTimeUtils.setCurrentMillisOffset(-24 * 60 *  60 * 1000);
            __CLR4_4_1inuinulc8azubi.R.inc(24279);long nowSystem = System.currentTimeMillis();
            __CLR4_4_1inuinulc8azubi.R.inc(24280);long now = DateTimeUtils.currentTimeMillis();
            __CLR4_4_1inuinulc8azubi.R.inc(24281);long nowAdjustDay = now + (24 * 60 *  60 * 1000);
            __CLR4_4_1inuinulc8azubi.R.inc(24282);assertTrue((now < nowSystem));
            __CLR4_4_1inuinulc8azubi.R.inc(24283);assertTrue((nowAdjustDay >= nowSystem));
            __CLR4_4_1inuinulc8azubi.R.inc(24284);assertTrue((nowAdjustDay - nowSystem) < 10000L);
        } finally {
            __CLR4_4_1inuinulc8azubi.R.inc(24285);DateTimeUtils.setCurrentMillisSystem();
        }
        __CLR4_4_1inuinulc8azubi.R.inc(24286);long nowSystem = System.currentTimeMillis();
        __CLR4_4_1inuinulc8azubi.R.inc(24287);long now = DateTimeUtils.currentTimeMillis();
        __CLR4_4_1inuinulc8azubi.R.inc(24288);assertTrue((now >= nowSystem));
        __CLR4_4_1inuinulc8azubi.R.inc(24289);assertTrue((now - nowSystem) < 10000L);
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testOffsetMillisToZero() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfm2y3iqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testOffsetMillisToZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfm2y3iqq(){try{__CLR4_4_1inuinulc8azubi.R.inc(24290);}finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testOffsetMillisToZero() {
//         long now1 = 0L;
//         try {
//             // set time to one day ago
//             DateTimeUtils.setCurrentMillisOffset(0);
//             now1 = DateTimeUtils.currentTimeMillis();
//         } finally {
//             DateTimeUtils.setCurrentMillisSystem();
//         }
//         long now2 = DateTimeUtils.currentTimeMillis();
//         assertEquals(now1, now2);
//     }

    //-----------------------------------------------------------------------
    public void testOffsetMillisSecurity() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txu3zmiqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testOffsetMillisSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txu3zmiqr(){try{__CLR4_4_1inuinulc8azubi.R.inc(24291);
        __CLR4_4_1inuinulc8azubi.R.inc(24292);if ((((OLD_JDK)&&(__CLR4_4_1inuinulc8azubi.R.iget(24293)!=0|true))||(__CLR4_4_1inuinulc8azubi.R.iget(24294)==0&false))) {{
            __CLR4_4_1inuinulc8azubi.R.inc(24295);return;
        }
        }__CLR4_4_1inuinulc8azubi.R.inc(24296);try {
            __CLR4_4_1inuinulc8azubi.R.inc(24297);try {
                __CLR4_4_1inuinulc8azubi.R.inc(24298);Policy.setPolicy(RESTRICT);
                __CLR4_4_1inuinulc8azubi.R.inc(24299);System.setSecurityManager(new SecurityManager());
                __CLR4_4_1inuinulc8azubi.R.inc(24300);DateTimeUtils.setCurrentMillisOffset(-24 * 60 *  60 * 1000);
                __CLR4_4_1inuinulc8azubi.R.inc(24301);fail();
            } catch (SecurityException ex) {
                // ok
            } finally {
                __CLR4_4_1inuinulc8azubi.R.inc(24302);System.setSecurityManager(null);
                __CLR4_4_1inuinulc8azubi.R.inc(24303);Policy.setPolicy(ALLOW);
            }
        } finally {
            __CLR4_4_1inuinulc8azubi.R.inc(24304);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMillisProvider() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p78rioir5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProvider",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p78rioir5(){try{__CLR4_4_1inuinulc8azubi.R.inc(24305);
        __CLR4_4_1inuinulc8azubi.R.inc(24306);try {
            __CLR4_4_1inuinulc8azubi.R.inc(24307);DateTimeUtils.setCurrentMillisProvider(new MillisProvider() {
                public long getMillis() {try{__CLR4_4_1inuinulc8azubi.R.inc(24308);
                    __CLR4_4_1inuinulc8azubi.R.inc(24309);return 1L;
                }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}
            });
            __CLR4_4_1inuinulc8azubi.R.inc(24310);assertEquals(1L, DateTimeUtils.currentTimeMillis());
        } finally {
            __CLR4_4_1inuinulc8azubi.R.inc(24311);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    public void testMillisProvider_null() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m3cbvoirc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProvider_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m3cbvoirc(){try{__CLR4_4_1inuinulc8azubi.R.inc(24312);
        __CLR4_4_1inuinulc8azubi.R.inc(24313);try {
            __CLR4_4_1inuinulc8azubi.R.inc(24314);DateTimeUtils.setCurrentMillisProvider(null);
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMillisProviderSecurity() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1auay9cirf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProviderSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1auay9cirf(){try{__CLR4_4_1inuinulc8azubi.R.inc(24315);
        __CLR4_4_1inuinulc8azubi.R.inc(24316);if ((((OLD_JDK)&&(__CLR4_4_1inuinulc8azubi.R.iget(24317)!=0|true))||(__CLR4_4_1inuinulc8azubi.R.iget(24318)==0&false))) {{
            __CLR4_4_1inuinulc8azubi.R.inc(24319);return;
        }
        }__CLR4_4_1inuinulc8azubi.R.inc(24320);try {
            __CLR4_4_1inuinulc8azubi.R.inc(24321);try {
                __CLR4_4_1inuinulc8azubi.R.inc(24322);Policy.setPolicy(RESTRICT);
                __CLR4_4_1inuinulc8azubi.R.inc(24323);System.setSecurityManager(new SecurityManager());
                __CLR4_4_1inuinulc8azubi.R.inc(24324);DateTimeUtils.setCurrentMillisProvider(new MillisProvider() {
                    public long getMillis() {try{__CLR4_4_1inuinulc8azubi.R.inc(24325);
                        __CLR4_4_1inuinulc8azubi.R.inc(24326);return 0L;
                    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}
                });
                __CLR4_4_1inuinulc8azubi.R.inc(24327);fail();
            } catch (SecurityException ex) {
                // ok
            } finally {
                __CLR4_4_1inuinulc8azubi.R.inc(24328);System.setSecurityManager(null);
                __CLR4_4_1inuinulc8azubi.R.inc(24329);Policy.setPolicy(ALLOW);
            }
        } finally {
            __CLR4_4_1inuinulc8azubi.R.inc(24330);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetInstantMillis_RI() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14fwtd2irv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetInstantMillis_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14fwtd2irv(){try{__CLR4_4_1inuinulc8azubi.R.inc(24331);
        __CLR4_4_1inuinulc8azubi.R.inc(24332);Instant i = new Instant(123L);
        __CLR4_4_1inuinulc8azubi.R.inc(24333);assertEquals(123L, DateTimeUtils.getInstantMillis(i));
        __CLR4_4_1inuinulc8azubi.R.inc(24334);try {
            __CLR4_4_1inuinulc8azubi.R.inc(24335);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
            __CLR4_4_1inuinulc8azubi.R.inc(24336);assertEquals(TEST_TIME_NOW, DateTimeUtils.getInstantMillis(null));
        } finally {
            __CLR4_4_1inuinulc8azubi.R.inc(24337);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetInstantChronology_RI() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1japirsis2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetInstantChronology_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1japirsis2(){try{__CLR4_4_1inuinulc8azubi.R.inc(24338);
        __CLR4_4_1inuinulc8azubi.R.inc(24339);DateTime dt = new DateTime(123L, BuddhistChronology.getInstance());
        __CLR4_4_1inuinulc8azubi.R.inc(24340);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getInstantChronology(dt));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24341);Instant i = new Instant(123L);
        __CLR4_4_1inuinulc8azubi.R.inc(24342);assertEquals(ISOChronology.getInstanceUTC(), DateTimeUtils.getInstantChronology(i));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24343);AbstractInstant ai = new AbstractInstant() {
            public long getMillis() {try{__CLR4_4_1inuinulc8azubi.R.inc(24344);
                __CLR4_4_1inuinulc8azubi.R.inc(24345);return 0L;
            }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}
            public Chronology getChronology() {try{__CLR4_4_1inuinulc8azubi.R.inc(24346);
                __CLR4_4_1inuinulc8azubi.R.inc(24347);return null; // testing for this
            }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}
        };
        __CLR4_4_1inuinulc8azubi.R.inc(24348);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(ai));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24349);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(null));
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetIntervalChronology_RInterval() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wuvtsise();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetIntervalChronology_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wuvtsise(){try{__CLR4_4_1inuinulc8azubi.R.inc(24350);
        __CLR4_4_1inuinulc8azubi.R.inc(24351);Interval dt = new Interval(123L, 456L, BuddhistChronology.getInstance());
        __CLR4_4_1inuinulc8azubi.R.inc(24352);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24353);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24354);MutableInterval ai = new MutableInterval() {
            private static final long serialVersionUID = 1L;

            public Chronology getChronology() {try{__CLR4_4_1inuinulc8azubi.R.inc(24355);
                __CLR4_4_1inuinulc8azubi.R.inc(24356);return null; // testing for this
            }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}
        };
        __CLR4_4_1inuinulc8azubi.R.inc(24357);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(ai));
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetIntervalChronology_RI_RI() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hk4vcism();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetIntervalChronology_RI_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hk4vcism(){try{__CLR4_4_1inuinulc8azubi.R.inc(24358);
        __CLR4_4_1inuinulc8azubi.R.inc(24359);DateTime dt1 = new DateTime(123L, BuddhistChronology.getInstance());
        __CLR4_4_1inuinulc8azubi.R.inc(24360);DateTime dt2 = new DateTime(123L, CopticChronology.getInstance());
        __CLR4_4_1inuinulc8azubi.R.inc(24361);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, dt2));
        __CLR4_4_1inuinulc8azubi.R.inc(24362);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, null));
        __CLR4_4_1inuinulc8azubi.R.inc(24363);assertEquals(CopticChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, dt2));
        __CLR4_4_1inuinulc8azubi.R.inc(24364);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, null));
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetReadableInterval_ReadableInterval() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmvs3iist();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetReadableInterval_ReadableInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmvs3iist(){try{__CLR4_4_1inuinulc8azubi.R.inc(24365);
        __CLR4_4_1inuinulc8azubi.R.inc(24366);ReadableInterval input = new Interval(0, 100L);
        __CLR4_4_1inuinulc8azubi.R.inc(24367);assertEquals(input, DateTimeUtils.getReadableInterval(input));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24368);try {
            __CLR4_4_1inuinulc8azubi.R.inc(24369);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
            __CLR4_4_1inuinulc8azubi.R.inc(24370);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW), DateTimeUtils.getReadableInterval(null));
        } finally {
            __CLR4_4_1inuinulc8azubi.R.inc(24371);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetChronology_Chronology() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w3ckv6it0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetChronology_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w3ckv6it0(){try{__CLR4_4_1inuinulc8azubi.R.inc(24372);
        __CLR4_4_1inuinulc8azubi.R.inc(24373);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getChronology(BuddhistChronology.getInstance()));
        __CLR4_4_1inuinulc8azubi.R.inc(24374);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getChronology(null));
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetZone_Zone() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lypqjiit3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetZone_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lypqjiit3(){try{__CLR4_4_1inuinulc8azubi.R.inc(24375);
        __CLR4_4_1inuinulc8azubi.R.inc(24376);assertEquals(PARIS, DateTimeUtils.getZone(PARIS));
        __CLR4_4_1inuinulc8azubi.R.inc(24377);assertEquals(DateTimeZone.getDefault(), DateTimeUtils.getZone(null));
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPeriodType_PeriodType() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m36ev6it6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetPeriodType_PeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m36ev6it6(){try{__CLR4_4_1inuinulc8azubi.R.inc(24378);
        __CLR4_4_1inuinulc8azubi.R.inc(24379);assertEquals(PeriodType.dayTime(), DateTimeUtils.getPeriodType(PeriodType.dayTime()));
        __CLR4_4_1inuinulc8azubi.R.inc(24380);assertEquals(PeriodType.standard(), DateTimeUtils.getPeriodType(null));
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetDurationMillis_RI() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a048wxit9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetDurationMillis_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a048wxit9(){try{__CLR4_4_1inuinulc8azubi.R.inc(24381);
        __CLR4_4_1inuinulc8azubi.R.inc(24382);Duration dur = new Duration(123L);
        __CLR4_4_1inuinulc8azubi.R.inc(24383);assertEquals(123L, DateTimeUtils.getDurationMillis(dur));
        __CLR4_4_1inuinulc8azubi.R.inc(24384);assertEquals(0L, DateTimeUtils.getDurationMillis(null));
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testIsContiguous_RP() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hfi9a8itd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testIsContiguous_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hfi9a8itd(){try{__CLR4_4_1inuinulc8azubi.R.inc(24385);
        __CLR4_4_1inuinulc8azubi.R.inc(24386);YearMonthDay ymd = new YearMonthDay(2005, 6, 9);
        __CLR4_4_1inuinulc8azubi.R.inc(24387);assertEquals(true, DateTimeUtils.isContiguous(ymd));
        __CLR4_4_1inuinulc8azubi.R.inc(24388);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0);
        __CLR4_4_1inuinulc8azubi.R.inc(24389);assertEquals(true, DateTimeUtils.isContiguous(tod));
        __CLR4_4_1inuinulc8azubi.R.inc(24390);Partial year = new Partial(DateTimeFieldType.year(), 2005);
        __CLR4_4_1inuinulc8azubi.R.inc(24391);assertEquals(true, DateTimeUtils.isContiguous(year));
        __CLR4_4_1inuinulc8azubi.R.inc(24392);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12);
        __CLR4_4_1inuinulc8azubi.R.inc(24393);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay));
        __CLR4_4_1inuinulc8azubi.R.inc(24394);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12);
        __CLR4_4_1inuinulc8azubi.R.inc(24395);assertEquals(false, DateTimeUtils.isContiguous(yearHour));
        __CLR4_4_1inuinulc8azubi.R.inc(24396);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2);
        __CLR4_4_1inuinulc8azubi.R.inc(24397);assertEquals(false, DateTimeUtils.isContiguous(ymdd));
        __CLR4_4_1inuinulc8azubi.R.inc(24398);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5);
        __CLR4_4_1inuinulc8azubi.R.inc(24399);assertEquals(false, DateTimeUtils.isContiguous(dd));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24400);try {
            __CLR4_4_1inuinulc8azubi.R.inc(24401);DateTimeUtils.isContiguous((ReadablePartial) null);
            __CLR4_4_1inuinulc8azubi.R.inc(24402);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testIsContiguous_RP_GJChronology() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ps2agitv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testIsContiguous_RP_GJChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ps2agitv(){try{__CLR4_4_1inuinulc8azubi.R.inc(24403);
        __CLR4_4_1inuinulc8azubi.R.inc(24404);YearMonthDay ymd = new YearMonthDay(2005, 6, 9, GJ);
        __CLR4_4_1inuinulc8azubi.R.inc(24405);assertEquals(true, DateTimeUtils.isContiguous(ymd));
        __CLR4_4_1inuinulc8azubi.R.inc(24406);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0, GJ);
        __CLR4_4_1inuinulc8azubi.R.inc(24407);assertEquals(true, DateTimeUtils.isContiguous(tod));
        __CLR4_4_1inuinulc8azubi.R.inc(24408);Partial year = new Partial(DateTimeFieldType.year(), 2005, GJ);
        __CLR4_4_1inuinulc8azubi.R.inc(24409);assertEquals(true, DateTimeUtils.isContiguous(year));
        __CLR4_4_1inuinulc8azubi.R.inc(24410);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12, GJ);
        __CLR4_4_1inuinulc8azubi.R.inc(24411);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay));
        __CLR4_4_1inuinulc8azubi.R.inc(24412);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12);
        __CLR4_4_1inuinulc8azubi.R.inc(24413);assertEquals(false, DateTimeUtils.isContiguous(yearHour));
        __CLR4_4_1inuinulc8azubi.R.inc(24414);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2);
        __CLR4_4_1inuinulc8azubi.R.inc(24415);assertEquals(false, DateTimeUtils.isContiguous(ymdd));
        __CLR4_4_1inuinulc8azubi.R.inc(24416);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5);
        __CLR4_4_1inuinulc8azubi.R.inc(24417);assertEquals(false, DateTimeUtils.isContiguous(dd));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24418);try {
            __CLR4_4_1inuinulc8azubi.R.inc(24419);DateTimeUtils.isContiguous((ReadablePartial) null);
            __CLR4_4_1inuinulc8azubi.R.inc(24420);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_julianDay() {__CLR4_4_1inuinulc8azubi.R.globalSliceStart(getClass().getName(),24421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kolpz5iud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1inuinulc8azubi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1inuinulc8azubi.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.test_julianDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kolpz5iud(){try{__CLR4_4_1inuinulc8azubi.R.inc(24421);
        __CLR4_4_1inuinulc8azubi.R.inc(24422);DateTime base = new DateTime(1970, 1, 1, 0, 0, DateTimeZone.UTC);
        
        __CLR4_4_1inuinulc8azubi.R.inc(24423);assertEquals(2440587.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1inuinulc8azubi.R.inc(24424);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1inuinulc8azubi.R.inc(24425);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.5d));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24426);base = base.plusHours(6);
        __CLR4_4_1inuinulc8azubi.R.inc(24427);assertEquals(2440587.75d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1inuinulc8azubi.R.inc(24428);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1inuinulc8azubi.R.inc(24429);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.75d));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24430);base = base.plusHours(6);
        __CLR4_4_1inuinulc8azubi.R.inc(24431);assertEquals(2440588d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1inuinulc8azubi.R.inc(24432);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1inuinulc8azubi.R.inc(24433);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588d));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24434);base = base.plusHours(6);
        __CLR4_4_1inuinulc8azubi.R.inc(24435);assertEquals(2440588.25d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1inuinulc8azubi.R.inc(24436);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1inuinulc8azubi.R.inc(24437);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.25d));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24438);base = base.plusHours(6);
        __CLR4_4_1inuinulc8azubi.R.inc(24439);assertEquals(2440588.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1inuinulc8azubi.R.inc(24440);assertEquals(2440589, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1inuinulc8azubi.R.inc(24441);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.5d));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24442);base = new DateTime(2012, 8, 31, 23, 50, DateTimeZone.UTC);
        __CLR4_4_1inuinulc8azubi.R.inc(24443);assertEquals(2456171.4930555555, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1inuinulc8azubi.R.inc(24444);assertEquals(2456171, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24445);base = new DateTime(-4713, 1, 1, 12, 0, JulianChronology.getInstanceUTC());
        __CLR4_4_1inuinulc8azubi.R.inc(24446);assertEquals(0d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1inuinulc8azubi.R.inc(24447);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1inuinulc8azubi.R.inc(24448);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(0d));
        
        __CLR4_4_1inuinulc8azubi.R.inc(24449);base = new DateTime(-4713, 1, 1, 0, 0, JulianChronology.getInstanceUTC());
        __CLR4_4_1inuinulc8azubi.R.inc(24450);assertEquals(-0.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1inuinulc8azubi.R.inc(24451);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1inuinulc8azubi.R.inc(24452);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(-0.5d));
    }finally{__CLR4_4_1inuinulc8azubi.R.flushNeeded();}}

}
