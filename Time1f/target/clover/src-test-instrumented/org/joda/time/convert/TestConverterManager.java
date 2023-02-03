/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
package org.joda.time.convert;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Interval;
import org.joda.time.JodaTimePermission;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.TimeOfDay;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a JUnit test for ConverterManager.
 *
 * @author Stephen Colebourne
 */
public class TestConverterManager extends TestCase {static class __CLR4_4_115n015n0lc8azwxu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,54631,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_115n015n0lc8azwxu.R.inc(53964);
        __CLR4_4_115n015n0lc8azwxu.R.inc(53965);String str = System.getProperty("java.version");
        __CLR4_4_115n015n0lc8azwxu.R.inc(53966);boolean old = true;
        __CLR4_4_115n015n0lc8azwxu.R.inc(53967);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_115n015n0lc8azwxu.R.iget(53968)!=0|true))||(__CLR4_4_115n015n0lc8azwxu.R.iget(53969)==0&false))) {{
            __CLR4_4_115n015n0lc8azwxu.R.inc(53970);old = false;
        }
        }__CLR4_4_115n015n0lc8azwxu.R.inc(53971);OLD_JDK = old;
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_115n015n0lc8azwxu.R.inc(53972);
        // don't call Policy.getPolicy()
        __CLR4_4_115n015n0lc8azwxu.R.inc(53973);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(53974);
                __CLR4_4_115n015n0lc8azwxu.R.inc(53975);Permissions p = new Permissions();
                __CLR4_4_115n015n0lc8azwxu.R.inc(53976);p.add(new AllPermission());  // enable everything
                __CLR4_4_115n015n0lc8azwxu.R.inc(53977);return p;
            }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(53978);
            }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(53979);
                __CLR4_4_115n015n0lc8azwxu.R.inc(53980);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_115n015n0lc8azwxu.R.iget(53981)!=0|true))||(__CLR4_4_115n015n0lc8azwxu.R.iget(53982)==0&false))) {{
                    __CLR4_4_115n015n0lc8azwxu.R.inc(53983);return false;
                }
                }__CLR4_4_115n015n0lc8azwxu.R.inc(53984);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(53985);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(53986);
                __CLR4_4_115n015n0lc8azwxu.R.inc(53987);Permissions p = new Permissions();
                __CLR4_4_115n015n0lc8azwxu.R.inc(53988);p.add(new AllPermission());  // enable everything
                __CLR4_4_115n015n0lc8azwxu.R.inc(53989);return p;
            }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(53990);
            }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(53991);
        __CLR4_4_115n015n0lc8azwxu.R.inc(53992);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(53993);
        __CLR4_4_115n015n0lc8azwxu.R.inc(53994);return new TestSuite(TestConverterManager.class);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public TestConverterManager(String name) {
        super(name);__CLR4_4_115n015n0lc8azwxu.R.inc(53996);try{__CLR4_4_115n015n0lc8azwxu.R.inc(53995);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSingleton() throws Exception {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),53997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk15nx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk15nx() throws Exception{try{__CLR4_4_115n015n0lc8azwxu.R.inc(53997);
        __CLR4_4_115n015n0lc8azwxu.R.inc(53998);Class cls = ConverterManager.class;
        __CLR4_4_115n015n0lc8azwxu.R.inc(53999);assertEquals(true, Modifier.isPublic(cls.getModifiers()));
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54000);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54001);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54002);assertEquals(true, Modifier.isProtected(con.getModifiers()));
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54003);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_115n015n0lc8azwxu.R.inc(54004);assertEquals(true, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetInstantConverter() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ocox615o5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ocox615o5(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54005);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54006);InstantConverter c = ConverterManager.getInstance().getInstantConverter(new Long(0L));
        __CLR4_4_115n015n0lc8azwxu.R.inc(54007);assertEquals(Long.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54008);c = ConverterManager.getInstance().getInstantConverter(new DateTime());
        __CLR4_4_115n015n0lc8azwxu.R.inc(54009);assertEquals(ReadableInstant.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54010);c = ConverterManager.getInstance().getInstantConverter("");
        __CLR4_4_115n015n0lc8azwxu.R.inc(54011);assertEquals(String.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54012);c = ConverterManager.getInstance().getInstantConverter(new Date());
        __CLR4_4_115n015n0lc8azwxu.R.inc(54013);assertEquals(Date.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54014);c = ConverterManager.getInstance().getInstantConverter(new GregorianCalendar());
        __CLR4_4_115n015n0lc8azwxu.R.inc(54015);assertEquals(Calendar.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54016);c = ConverterManager.getInstance().getInstantConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54017);assertEquals(null, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54018);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54019);ConverterManager.getInstance().getInstantConverter(Boolean.TRUE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54020);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testGetInstantConverterRemovedNull() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_192qws515ol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterRemovedNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_192qws515ol(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54021);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54022);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54023);ConverterManager.getInstance().removeInstantConverter(NullConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54024);try {
                __CLR4_4_115n015n0lc8azwxu.R.inc(54025);ConverterManager.getInstance().getInstantConverter(null);
                __CLR4_4_115n015n0lc8azwxu.R.inc(54026);fail();
            } catch (IllegalArgumentException ex) {}
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54027);ConverterManager.getInstance().addInstantConverter(NullConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54028);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testGetInstantConverterOKMultipleMatches() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113m7aj15ot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterOKMultipleMatches",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113m7aj15ot(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54029);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54030);InstantConverter c = new InstantConverter() {
            public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54031);__CLR4_4_115n015n0lc8azwxu.R.inc(54032);return 0;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54033);__CLR4_4_115n015n0lc8azwxu.R.inc(54034);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54035);__CLR4_4_115n015n0lc8azwxu.R.inc(54036);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54037);__CLR4_4_115n015n0lc8azwxu.R.inc(54038);return ReadableDateTime.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54039);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54040);ConverterManager.getInstance().addInstantConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54041);InstantConverter ok = ConverterManager.getInstance().getInstantConverter(new DateTime());
            // ReadableDateTime and ReadableInstant both match, but RI discarded as less specific
            __CLR4_4_115n015n0lc8azwxu.R.inc(54042);assertEquals(ReadableDateTime.class, ok.getSupportedType());
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54043);ConverterManager.getInstance().removeInstantConverter(c);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54044);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testGetInstantConverterBadMultipleMatches() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1jpiw15p9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterBadMultipleMatches",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1jpiw15p9(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54045);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54046);InstantConverter c = new InstantConverter() {
            public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54047);__CLR4_4_115n015n0lc8azwxu.R.inc(54048);return 0;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54049);__CLR4_4_115n015n0lc8azwxu.R.inc(54050);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54051);__CLR4_4_115n015n0lc8azwxu.R.inc(54052);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54053);__CLR4_4_115n015n0lc8azwxu.R.inc(54054);return Serializable.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54055);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54056);ConverterManager.getInstance().addInstantConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54057);try {
                __CLR4_4_115n015n0lc8azwxu.R.inc(54058);ConverterManager.getInstance().getInstantConverter(new DateTime());
                __CLR4_4_115n015n0lc8azwxu.R.inc(54059);fail();
            } catch (IllegalStateException ex) {
                // Serializable and ReadableInstant both match, so cannot pick
            }
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54060);ConverterManager.getInstance().removeInstantConverter(c);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54061);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetInstantConverters() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157gv8p15pq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157gv8p15pq(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54062);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54063);InstantConverter[] array = ConverterManager.getInstance().getInstantConverters();
        __CLR4_4_115n015n0lc8azwxu.R.inc(54064);assertEquals(6, array.length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddInstantConverter1() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sa2gqy15pt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sa2gqy15pt(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54065);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54066);InstantConverter c = new InstantConverter() {
            public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54067);__CLR4_4_115n015n0lc8azwxu.R.inc(54068);return 0;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54069);__CLR4_4_115n015n0lc8azwxu.R.inc(54070);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54071);__CLR4_4_115n015n0lc8azwxu.R.inc(54072);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54073);__CLR4_4_115n015n0lc8azwxu.R.inc(54074);return Boolean.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54075);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54076);InstantConverter removed = ConverterManager.getInstance().addInstantConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54077);assertEquals(null, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54078);assertEquals(Boolean.class, ConverterManager.getInstance().getInstantConverter(Boolean.TRUE).getSupportedType());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54079);assertEquals(7, ConverterManager.getInstance().getInstantConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54080);ConverterManager.getInstance().removeInstantConverter(c);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54081);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddInstantConverter2() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vj2fjf15qa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vj2fjf15qa(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54082);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54083);InstantConverter c = new InstantConverter() {
            public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54084);__CLR4_4_115n015n0lc8azwxu.R.inc(54085);return 0;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54086);__CLR4_4_115n015n0lc8azwxu.R.inc(54087);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54088);__CLR4_4_115n015n0lc8azwxu.R.inc(54089);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54090);__CLR4_4_115n015n0lc8azwxu.R.inc(54091);return String.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54092);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54093);InstantConverter removed = ConverterManager.getInstance().addInstantConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54094);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54095);assertEquals(String.class, ConverterManager.getInstance().getInstantConverter("").getSupportedType());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54096);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54097);ConverterManager.getInstance().addInstantConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54098);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddInstantConverter3() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ys2ebw15qr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ys2ebw15qr(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54099);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54100);InstantConverter removed = ConverterManager.getInstance().addInstantConverter(StringConverter.INSTANCE);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54101);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54102);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddInstantConverter4() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x01our15qv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverter4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x01our15qv(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54103);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54104);InstantConverter removed = ConverterManager.getInstance().addInstantConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54105);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54106);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddInstantConverterSecurity() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hch3f15qz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hch3f15qz(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54107);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54108);if ((((OLD_JDK)&&(__CLR4_4_115n015n0lc8azwxu.R.iget(54109)!=0|true))||(__CLR4_4_115n015n0lc8azwxu.R.iget(54110)==0&false))) {{
            __CLR4_4_115n015n0lc8azwxu.R.inc(54111);return;
        }
        }__CLR4_4_115n015n0lc8azwxu.R.inc(54112);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54113);Policy.setPolicy(RESTRICT);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54114);System.setSecurityManager(new SecurityManager());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54115);ConverterManager.getInstance().addInstantConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54116);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54117);System.setSecurityManager(null);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54118);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54119);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testRemoveInstantConverter1() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qyfzsz15rc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveInstantConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qyfzsz15rc(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54120);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54121);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54122);InstantConverter removed = ConverterManager.getInstance().removeInstantConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54123);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54124);assertEquals(5, ConverterManager.getInstance().getInstantConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54125);ConverterManager.getInstance().addInstantConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54126);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemoveInstantConverter2() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7fylg15rj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveInstantConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7fylg15rj(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54127);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54128);InstantConverter c = new InstantConverter() {
            public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54129);__CLR4_4_115n015n0lc8azwxu.R.inc(54130);return 0;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54131);__CLR4_4_115n015n0lc8azwxu.R.inc(54132);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54133);__CLR4_4_115n015n0lc8azwxu.R.inc(54134);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54135);__CLR4_4_115n015n0lc8azwxu.R.inc(54136);return Boolean.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54137);InstantConverter removed = ConverterManager.getInstance().removeInstantConverter(c);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54138);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54139);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemoveInstantConverter3() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xgfxdx15rw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveInstantConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xgfxdx15rw(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54140);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54141);InstantConverter removed = ConverterManager.getInstance().removeInstantConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54142);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54143);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemoveInstantConverterSecurity() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vely1o15s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveInstantConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vely1o15s0(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54144);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54145);if ((((OLD_JDK)&&(__CLR4_4_115n015n0lc8azwxu.R.iget(54146)!=0|true))||(__CLR4_4_115n015n0lc8azwxu.R.iget(54147)==0&false))) {{
            __CLR4_4_115n015n0lc8azwxu.R.inc(54148);return;
        }
        }__CLR4_4_115n015n0lc8azwxu.R.inc(54149);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54150);Policy.setPolicy(RESTRICT);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54151);System.setSecurityManager(new SecurityManager());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54152);ConverterManager.getInstance().removeInstantConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54153);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54154);System.setSecurityManager(null);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54155);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54156);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static final int PARTIAL_SIZE = 7;
    
    public void testGetPartialConverter() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qqq5qi15sd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qqq5qi15sd(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54157);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54158);PartialConverter c = ConverterManager.getInstance().getPartialConverter(new Long(0L));
        __CLR4_4_115n015n0lc8azwxu.R.inc(54159);assertEquals(Long.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54160);c = ConverterManager.getInstance().getPartialConverter(new TimeOfDay());
        __CLR4_4_115n015n0lc8azwxu.R.inc(54161);assertEquals(ReadablePartial.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54162);c = ConverterManager.getInstance().getPartialConverter(new DateTime());
        __CLR4_4_115n015n0lc8azwxu.R.inc(54163);assertEquals(ReadableInstant.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54164);c = ConverterManager.getInstance().getPartialConverter("");
        __CLR4_4_115n015n0lc8azwxu.R.inc(54165);assertEquals(String.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54166);c = ConverterManager.getInstance().getPartialConverter(new Date());
        __CLR4_4_115n015n0lc8azwxu.R.inc(54167);assertEquals(Date.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54168);c = ConverterManager.getInstance().getPartialConverter(new GregorianCalendar());
        __CLR4_4_115n015n0lc8azwxu.R.inc(54169);assertEquals(Calendar.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54170);c = ConverterManager.getInstance().getPartialConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54171);assertEquals(null, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54172);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54173);ConverterManager.getInstance().getPartialConverter(Boolean.TRUE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54174);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testGetPartialConverterRemovedNull() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119y8yd15sv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterRemovedNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119y8yd15sv(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54175);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54176);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54177);ConverterManager.getInstance().removePartialConverter(NullConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54178);try {
                __CLR4_4_115n015n0lc8azwxu.R.inc(54179);ConverterManager.getInstance().getPartialConverter(null);
                __CLR4_4_115n015n0lc8azwxu.R.inc(54180);fail();
            } catch (IllegalArgumentException ex) {}
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54181);ConverterManager.getInstance().addPartialConverter(NullConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54182);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testGetPartialConverterOKMultipleMatches() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1880bn915t3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterOKMultipleMatches",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1880bn915t3(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54183);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54184);PartialConverter c = new PartialConverter() {
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54185);__CLR4_4_115n015n0lc8azwxu.R.inc(54186);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54187);__CLR4_4_115n015n0lc8azwxu.R.inc(54188);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54189);__CLR4_4_115n015n0lc8azwxu.R.inc(54190);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54191);__CLR4_4_115n015n0lc8azwxu.R.inc(54192);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54193);__CLR4_4_115n015n0lc8azwxu.R.inc(54194);return ReadableDateTime.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54195);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54196);ConverterManager.getInstance().addPartialConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54197);PartialConverter ok = ConverterManager.getInstance().getPartialConverter(new DateTime());
            // ReadableDateTime and ReadablePartial both match, but RI discarded as less specific
            __CLR4_4_115n015n0lc8azwxu.R.inc(54198);assertEquals(ReadableDateTime.class, ok.getSupportedType());
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54199);ConverterManager.getInstance().removePartialConverter(c);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54200);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testGetPartialConverterBadMultipleMatches() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3m99k15tl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterBadMultipleMatches",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3m99k15tl(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54201);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54202);PartialConverter c = new PartialConverter() {
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54203);__CLR4_4_115n015n0lc8azwxu.R.inc(54204);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54205);__CLR4_4_115n015n0lc8azwxu.R.inc(54206);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54207);__CLR4_4_115n015n0lc8azwxu.R.inc(54208);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54209);__CLR4_4_115n015n0lc8azwxu.R.inc(54210);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54211);__CLR4_4_115n015n0lc8azwxu.R.inc(54212);return Serializable.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54213);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54214);ConverterManager.getInstance().addPartialConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54215);try {
                __CLR4_4_115n015n0lc8azwxu.R.inc(54216);ConverterManager.getInstance().getPartialConverter(new DateTime());
                __CLR4_4_115n015n0lc8azwxu.R.inc(54217);fail();
            } catch (IllegalStateException ex) {
                // Serializable and ReadablePartial both match, so cannot pick
            }
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54218);ConverterManager.getInstance().removePartialConverter(c);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54219);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPartialConverters() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hl867r15u4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hl867r15u4(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54220);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54221);PartialConverter[] array = ConverterManager.getInstance().getPartialConverters();
        __CLR4_4_115n015n0lc8azwxu.R.inc(54222);assertEquals(PARTIAL_SIZE, array.length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddPartialConverter1() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jycjrq15u7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jycjrq15u7(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54223);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54224);PartialConverter c = new PartialConverter() {
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54225);__CLR4_4_115n015n0lc8azwxu.R.inc(54226);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54227);__CLR4_4_115n015n0lc8azwxu.R.inc(54228);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54229);__CLR4_4_115n015n0lc8azwxu.R.inc(54230);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54231);__CLR4_4_115n015n0lc8azwxu.R.inc(54232);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54233);__CLR4_4_115n015n0lc8azwxu.R.inc(54234);return Boolean.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54235);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54236);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54237);assertEquals(null, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54238);assertEquals(Boolean.class, ConverterManager.getInstance().getPartialConverter(Boolean.TRUE).getSupportedType());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54239);assertEquals(PARTIAL_SIZE + 1, ConverterManager.getInstance().getPartialConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54240);ConverterManager.getInstance().removePartialConverter(c);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54241);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddPartialConverter2() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpckz915uq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpckz915uq(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54242);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54243);PartialConverter c = new PartialConverter() {
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54244);__CLR4_4_115n015n0lc8azwxu.R.inc(54245);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54246);__CLR4_4_115n015n0lc8azwxu.R.inc(54247);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54248);__CLR4_4_115n015n0lc8azwxu.R.inc(54249);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54250);__CLR4_4_115n015n0lc8azwxu.R.inc(54251);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54252);__CLR4_4_115n015n0lc8azwxu.R.inc(54253);return String.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54254);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54255);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54256);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54257);assertEquals(String.class, ConverterManager.getInstance().getPartialConverter("").getSupportedType());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54258);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54259);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54260);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddPartialConverter3() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgcm6s15v9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgcm6s15v9(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54261);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54262);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54263);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54264);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddPartialConverter4() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7cneb15vd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7cneb15vd(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54265);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54266);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54267);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54268);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddPartialConverterSecurity() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jsy47p15vh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jsy47p15vh(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54269);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54270);if ((((OLD_JDK)&&(__CLR4_4_115n015n0lc8azwxu.R.iget(54271)!=0|true))||(__CLR4_4_115n015n0lc8azwxu.R.iget(54272)==0&false))) {{
            __CLR4_4_115n015n0lc8azwxu.R.inc(54273);return;
        }
        }__CLR4_4_115n015n0lc8azwxu.R.inc(54274);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54275);Policy.setPolicy(RESTRICT);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54276);System.setSecurityManager(new SecurityManager());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54277);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54278);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54279);System.setSecurityManager(null);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54280);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54281);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testRemovePartialConverter1() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9z0pp15vu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePartialConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9z0pp15vu(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54282);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54283);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54284);PartialConverter removed = ConverterManager.getInstance().removePartialConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54285);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54286);assertEquals(PARTIAL_SIZE - 1, ConverterManager.getInstance().getPartialConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54287);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54288);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemovePartialConverter2() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0z1x815w1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePartialConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0z1x815w1(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54289);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54290);PartialConverter c = new PartialConverter() {
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54291);__CLR4_4_115n015n0lc8azwxu.R.inc(54292);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54293);__CLR4_4_115n015n0lc8azwxu.R.inc(54294);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54295);__CLR4_4_115n015n0lc8azwxu.R.inc(54296);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54297);__CLR4_4_115n015n0lc8azwxu.R.inc(54298);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54299);__CLR4_4_115n015n0lc8azwxu.R.inc(54300);return Boolean.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54301);PartialConverter removed = ConverterManager.getInstance().removePartialConverter(c);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54302);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54303);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemovePartialConverter3() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1erz34r15wg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePartialConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1erz34r15wg(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54304);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54305);PartialConverter removed = ConverterManager.getInstance().removePartialConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54306);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54307);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemovePartialConverterSecurity() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jc7imc15wk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePartialConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jc7imc15wk(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54308);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54309);if ((((OLD_JDK)&&(__CLR4_4_115n015n0lc8azwxu.R.iget(54310)!=0|true))||(__CLR4_4_115n015n0lc8azwxu.R.iget(54311)==0&false))) {{
            __CLR4_4_115n015n0lc8azwxu.R.inc(54312);return;
        }
        }__CLR4_4_115n015n0lc8azwxu.R.inc(54313);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54314);Policy.setPolicy(RESTRICT);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54315);System.setSecurityManager(new SecurityManager());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54316);ConverterManager.getInstance().removeInstantConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54317);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54318);System.setSecurityManager(null);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54319);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54320);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static int DURATION_SIZE = 5;
    
    public void testGetDurationConverter() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12459db15wx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12459db15wx(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54321);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54322);DurationConverter c = ConverterManager.getInstance().getDurationConverter(new Long(0L));
        __CLR4_4_115n015n0lc8azwxu.R.inc(54323);assertEquals(Long.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54324);c = ConverterManager.getInstance().getDurationConverter(new Duration(123L));
        __CLR4_4_115n015n0lc8azwxu.R.inc(54325);assertEquals(ReadableDuration.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54326);c = ConverterManager.getInstance().getDurationConverter(new Interval(0L, 1000L));
        __CLR4_4_115n015n0lc8azwxu.R.inc(54327);assertEquals(ReadableInterval.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54328);c = ConverterManager.getInstance().getDurationConverter("");
        __CLR4_4_115n015n0lc8azwxu.R.inc(54329);assertEquals(String.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54330);c = ConverterManager.getInstance().getDurationConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54331);assertEquals(null, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54332);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54333);ConverterManager.getInstance().getDurationConverter(Boolean.TRUE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54334);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testGetDurationConverterRemovedNull() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5ss8615xb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverterRemovedNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5ss8615xb(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54335);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54336);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54337);ConverterManager.getInstance().removeDurationConverter(NullConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54338);try {
                __CLR4_4_115n015n0lc8azwxu.R.inc(54339);ConverterManager.getInstance().getDurationConverter(null);
                __CLR4_4_115n015n0lc8azwxu.R.inc(54340);fail();
            } catch (IllegalArgumentException ex) {}
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54341);ConverterManager.getInstance().addDurationConverter(NullConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54342);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetDurationConverters() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zhgwky15xj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zhgwky15xj(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54343);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54344);DurationConverter[] array = ConverterManager.getInstance().getDurationConverters();
        __CLR4_4_115n015n0lc8azwxu.R.inc(54345);assertEquals(DURATION_SIZE, array.length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddDurationConverter1() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kqo35115xm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kqo35115xm(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54346);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54347);DurationConverter c = new DurationConverter() {
            public long getDurationMillis(Object object) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54348);__CLR4_4_115n015n0lc8azwxu.R.inc(54349);return 0;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54350);__CLR4_4_115n015n0lc8azwxu.R.inc(54351);return Boolean.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54352);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54353);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54354);assertEquals(null, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54355);assertEquals(Boolean.class, ConverterManager.getInstance().getDurationConverter(Boolean.TRUE).getSupportedType());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54356);assertEquals(DURATION_SIZE + 1, ConverterManager.getInstance().getDurationConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54357);ConverterManager.getInstance().removeDurationConverter(c);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54358);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddDurationConverter2() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hho4ck15xz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hho4ck15xz(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54359);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54360);DurationConverter c = new DurationConverter() {
            public long getDurationMillis(Object object) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54361);__CLR4_4_115n015n0lc8azwxu.R.inc(54362);return 0;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54363);__CLR4_4_115n015n0lc8azwxu.R.inc(54364);return String.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54365);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54366);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54367);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54368);assertEquals(String.class, ConverterManager.getInstance().getDurationConverter("").getSupportedType());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54369);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54370);ConverterManager.getInstance().addDurationConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54371);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddDurationConverter3() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e8o5k315yc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e8o5k315yc(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54372);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54373);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54374);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54375);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddDurationConverterSecurity() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy2dms15yg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy2dms15yg(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54376);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54377);if ((((OLD_JDK)&&(__CLR4_4_115n015n0lc8azwxu.R.iget(54378)!=0|true))||(__CLR4_4_115n015n0lc8azwxu.R.iget(54379)==0&false))) {{
            __CLR4_4_115n015n0lc8azwxu.R.inc(54380);return;
        }
        }__CLR4_4_115n015n0lc8azwxu.R.inc(54381);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54382);Policy.setPolicy(RESTRICT);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54383);System.setSecurityManager(new SecurityManager());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54384);ConverterManager.getInstance().addDurationConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54385);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54386);System.setSecurityManager(null);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54387);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54388);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testRemoveDurationConverter1() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19a3dky15yt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveDurationConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19a3dky15yt(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54389);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54390);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54391);DurationConverter removed = ConverterManager.getInstance().removeDurationConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54392);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54393);assertEquals(DURATION_SIZE - 1, ConverterManager.getInstance().getDurationConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54394);ConverterManager.getInstance().addDurationConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54395);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemoveDurationConverter2() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj3cdf15z0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveDurationConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj3cdf15z0(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54396);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54397);DurationConverter c = new DurationConverter() {
            public long getDurationMillis(Object object) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54398);__CLR4_4_115n015n0lc8azwxu.R.inc(54399);return 0;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54400);__CLR4_4_115n015n0lc8azwxu.R.inc(54401);return Boolean.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54402);DurationConverter removed = ConverterManager.getInstance().removeDurationConverter(c);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54403);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54404);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemoveDurationConverter3() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fs3b5w15z9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveDurationConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fs3b5w15z9(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54405);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54406);DurationConverter removed = ConverterManager.getInstance().removeDurationConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54407);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54408);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemoveDurationConverterSecurity() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t14nct15zd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveDurationConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t14nct15zd(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54409);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54410);if ((((OLD_JDK)&&(__CLR4_4_115n015n0lc8azwxu.R.iget(54411)!=0|true))||(__CLR4_4_115n015n0lc8azwxu.R.iget(54412)==0&false))) {{
            __CLR4_4_115n015n0lc8azwxu.R.inc(54413);return;
        }
        }__CLR4_4_115n015n0lc8azwxu.R.inc(54414);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54415);Policy.setPolicy(RESTRICT);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54416);System.setSecurityManager(new SecurityManager());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54417);ConverterManager.getInstance().removeDurationConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54418);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54419);System.setSecurityManager(null);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54420);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54421);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static int PERIOD_SIZE = 5;
    
    public void testGetPeriodConverter() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jr6ncy15zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jr6ncy15zq(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54422);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54423);PeriodConverter c = ConverterManager.getInstance().getPeriodConverter(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_115n015n0lc8azwxu.R.inc(54424);assertEquals(ReadablePeriod.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54425);c = ConverterManager.getInstance().getPeriodConverter(new Duration(123L));
        __CLR4_4_115n015n0lc8azwxu.R.inc(54426);assertEquals(ReadableDuration.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54427);c = ConverterManager.getInstance().getPeriodConverter(new Interval(0L, 1000L));
        __CLR4_4_115n015n0lc8azwxu.R.inc(54428);assertEquals(ReadableInterval.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54429);c = ConverterManager.getInstance().getPeriodConverter("");
        __CLR4_4_115n015n0lc8azwxu.R.inc(54430);assertEquals(String.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54431);c = ConverterManager.getInstance().getPeriodConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54432);assertEquals(null, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54433);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54434);ConverterManager.getInstance().getPeriodConverter(Boolean.TRUE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54435);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testGetPeriodConverterRemovedNull() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19dotmb1604();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverterRemovedNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19dotmb1604(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54436);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54437);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54438);ConverterManager.getInstance().removePeriodConverter(NullConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54439);try {
                __CLR4_4_115n015n0lc8azwxu.R.inc(54440);ConverterManager.getInstance().getPeriodConverter(null);
                __CLR4_4_115n015n0lc8azwxu.R.inc(54441);fail();
            } catch (IllegalArgumentException ex) {}
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54442);ConverterManager.getInstance().addPeriodConverter(NullConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54443);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPeriodConverters() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e2rigv160c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e2rigv160c(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54444);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54445);PeriodConverter[] array = ConverterManager.getInstance().getPeriodConverters();
        __CLR4_4_115n015n0lc8azwxu.R.inc(54446);assertEquals(PERIOD_SIZE, array.length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddPeriodConverter1() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bi731k160f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bi731k160f(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54447);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54448);PeriodConverter c = new PeriodConverter() {
            public void setInto(ReadWritablePeriod duration, Object object, Chronology c) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54449);}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public PeriodType getPeriodType(Object object) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54450);__CLR4_4_115n015n0lc8azwxu.R.inc(54451);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54452);__CLR4_4_115n015n0lc8azwxu.R.inc(54453);return Boolean.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54454);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54455);PeriodConverter removed = ConverterManager.getInstance().addPeriodConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54456);assertEquals(null, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54457);assertEquals(Boolean.class, ConverterManager.getInstance().getPeriodConverter(Boolean.TRUE).getSupportedType());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54458);assertEquals(PERIOD_SIZE + 1, ConverterManager.getInstance().getPeriodConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54459);ConverterManager.getInstance().removePeriodConverter(c);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54460);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddPeriodConverter2() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1er71u1160t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1er71u1160t(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54461);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54462);PeriodConverter c = new PeriodConverter() {
            public void setInto(ReadWritablePeriod duration, Object object, Chronology c) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54463);}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public PeriodType getPeriodType(Object object) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54464);__CLR4_4_115n015n0lc8azwxu.R.inc(54465);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54466);__CLR4_4_115n015n0lc8azwxu.R.inc(54467);return String.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54468);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54469);PeriodConverter removed = ConverterManager.getInstance().addPeriodConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54470);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54471);assertEquals(String.class, ConverterManager.getInstance().getPeriodConverter("").getSupportedType());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54472);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54473);ConverterManager.getInstance().addPeriodConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54474);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddPeriodConverter3() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i070mi1617();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i070mi1617(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54475);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54476);PeriodConverter removed = ConverterManager.getInstance().addPeriodConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54477);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54478);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddPeriodConverterSecurity() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1coolav161b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1coolav161b(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54479);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54480);if ((((OLD_JDK)&&(__CLR4_4_115n015n0lc8azwxu.R.iget(54481)!=0|true))||(__CLR4_4_115n015n0lc8azwxu.R.iget(54482)==0&false))) {{
            __CLR4_4_115n015n0lc8azwxu.R.inc(54483);return;
        }
        }__CLR4_4_115n015n0lc8azwxu.R.inc(54484);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54485);Policy.setPolicy(RESTRICT);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54486);System.setSecurityManager(new SecurityManager());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54487);ConverterManager.getInstance().addPeriodConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54488);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54489);System.setSecurityManager(null);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54490);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54491);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testRemovePeriodConverter1() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx3j2n161o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx3j2n161o(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54492);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54493);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54494);PeriodConverter removed = ConverterManager.getInstance().removePeriodConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54495);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54496);assertEquals(PERIOD_SIZE - 1, ConverterManager.getInstance().getPeriodConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54497);ConverterManager.getInstance().addPeriodConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54498);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemovePeriodConverter2() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q63hv4161v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q63hv4161v(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54499);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54500);PeriodConverter c = new PeriodConverter() {
            public void setInto(ReadWritablePeriod duration, Object object, Chronology c) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54501);}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public PeriodType getPeriodType(Object object) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54502);__CLR4_4_115n015n0lc8azwxu.R.inc(54503);return null;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54504);__CLR4_4_115n015n0lc8azwxu.R.inc(54505);return Boolean.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54506);PeriodConverter removed = ConverterManager.getInstance().removePeriodConverter(c);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54507);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54508);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemovePeriodConverter3() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tf3gnl1625();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tf3gnl1625(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54509);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54510);PeriodConverter removed = ConverterManager.getInstance().removePeriodConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54511);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54512);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemovePeriodConverterSecurity() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tr4jww1629();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tr4jww1629(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54513);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54514);if ((((OLD_JDK)&&(__CLR4_4_115n015n0lc8azwxu.R.iget(54515)!=0|true))||(__CLR4_4_115n015n0lc8azwxu.R.iget(54516)==0&false))) {{
            __CLR4_4_115n015n0lc8azwxu.R.inc(54517);return;
        }
        }__CLR4_4_115n015n0lc8azwxu.R.inc(54518);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54519);Policy.setPolicy(RESTRICT);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54520);System.setSecurityManager(new SecurityManager());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54521);ConverterManager.getInstance().removePeriodConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54522);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54523);System.setSecurityManager(null);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54524);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54525);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static int INTERVAL_SIZE = 3;

    public void testGetIntervalConverter() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1br8dku162m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1br8dku162m(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54526);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54527);IntervalConverter c = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 1000L));
        __CLR4_4_115n015n0lc8azwxu.R.inc(54528);assertEquals(ReadableInterval.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54529);c = ConverterManager.getInstance().getIntervalConverter("");
        __CLR4_4_115n015n0lc8azwxu.R.inc(54530);assertEquals(String.class, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54531);c = ConverterManager.getInstance().getIntervalConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54532);assertEquals(null, c.getSupportedType());
        
        __CLR4_4_115n015n0lc8azwxu.R.inc(54533);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54534);ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54535);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_115n015n0lc8azwxu.R.inc(54536);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54537);ConverterManager.getInstance().getIntervalConverter(new Long(0));
            __CLR4_4_115n015n0lc8azwxu.R.inc(54538);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testGetIntervalConverterRemovedNull() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t2tson162z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverterRemovedNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t2tson162z(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54539);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54540);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54541);ConverterManager.getInstance().removeIntervalConverter(NullConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54542);try {
                __CLR4_4_115n015n0lc8azwxu.R.inc(54543);ConverterManager.getInstance().getIntervalConverter(null);
                __CLR4_4_115n015n0lc8azwxu.R.inc(54544);fail();
            } catch (IllegalArgumentException ex) {}
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54545);ConverterManager.getInstance().addIntervalConverter(NullConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54546);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetIntervalConverters() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kseqt91637();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kseqt91637(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54547);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54548);IntervalConverter[] array = ConverterManager.getInstance().getIntervalConverters();
        __CLR4_4_115n015n0lc8azwxu.R.inc(54549);assertEquals(INTERVAL_SIZE, array.length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddIntervalConverter1() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zfok4163a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zfok4163a(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54550);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54551);IntervalConverter c = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54552);__CLR4_4_115n015n0lc8azwxu.R.inc(54553);return false;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54554);}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54555);__CLR4_4_115n015n0lc8azwxu.R.inc(54556);return Boolean.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54557);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54558);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54559);assertEquals(null, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54560);assertEquals(Boolean.class, ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE).getSupportedType());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54561);assertEquals(INTERVAL_SIZE + 1, ConverterManager.getInstance().getIntervalConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54562);ConverterManager.getInstance().removeIntervalConverter(c);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54563);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddIntervalConverter2() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12qfprn163o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12qfprn163o(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54564);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54565);IntervalConverter c = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54566);__CLR4_4_115n015n0lc8azwxu.R.inc(54567);return false;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54568);}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54569);__CLR4_4_115n015n0lc8azwxu.R.inc(54570);return String.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54571);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54572);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(c);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54573);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54574);assertEquals(String.class, ConverterManager.getInstance().getIntervalConverter("").getSupportedType());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54575);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54576);ConverterManager.getInstance().addIntervalConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54577);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddIntervalConverter3() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ik90u1642();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ik90u1642(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54578);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54579);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54580);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54581);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testAddIntervalConverterSecurity() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18zxsa51646();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18zxsa51646(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54582);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54583);if ((((OLD_JDK)&&(__CLR4_4_115n015n0lc8azwxu.R.iget(54584)!=0|true))||(__CLR4_4_115n015n0lc8azwxu.R.iget(54585)==0&false))) {{
            __CLR4_4_115n015n0lc8azwxu.R.inc(54586);return;
        }
        }__CLR4_4_115n015n0lc8azwxu.R.inc(54587);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54588);Policy.setPolicy(RESTRICT);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54589);System.setSecurityManager(new SecurityManager());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54590);ConverterManager.getInstance().addIntervalConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54591);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54592);System.setSecurityManager(null);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54593);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54594);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testRemoveIntervalConverter1() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o1bs5v164j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o1bs5v164j(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54595);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54596);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54597);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54598);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54599);assertEquals(INTERVAL_SIZE - 1, ConverterManager.getInstance().getIntervalConverters().length);
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54600);ConverterManager.getInstance().addIntervalConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54601);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemoveIntervalConverter2() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rabqyc164q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rabqyc164q(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54602);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54603);IntervalConverter c = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54604);__CLR4_4_115n015n0lc8azwxu.R.inc(54605);return false;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54606);}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
            public Class getSupportedType() {try{__CLR4_4_115n015n0lc8azwxu.R.inc(54607);__CLR4_4_115n015n0lc8azwxu.R.inc(54608);return Boolean.class;}finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}
        };
        __CLR4_4_115n015n0lc8azwxu.R.inc(54609);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(c);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54610);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54611);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemoveIntervalConverter3() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ujbpqt1650();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ujbpqt1650(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54612);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54613);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(null);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54614);assertEquals(null, removed);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54615);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    public void testRemoveIntervalConverterSecurity() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewvik41654();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewvik41654(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54616);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54617);if ((((OLD_JDK)&&(__CLR4_4_115n015n0lc8azwxu.R.iget(54618)!=0|true))||(__CLR4_4_115n015n0lc8azwxu.R.iget(54619)==0&false))) {{
            __CLR4_4_115n015n0lc8azwxu.R.inc(54620);return;
        }
        }__CLR4_4_115n015n0lc8azwxu.R.inc(54621);try {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54622);Policy.setPolicy(RESTRICT);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54623);System.setSecurityManager(new SecurityManager());
            __CLR4_4_115n015n0lc8azwxu.R.inc(54624);ConverterManager.getInstance().removeIntervalConverter(StringConverter.INSTANCE);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54625);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_115n015n0lc8azwxu.R.inc(54626);System.setSecurityManager(null);
            __CLR4_4_115n015n0lc8azwxu.R.inc(54627);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_115n015n0lc8azwxu.R.inc(54628);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_115n015n0lc8azwxu.R.globalSliceStart(getClass().getName(),54629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid165h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115n015n0lc8azwxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_115n015n0lc8azwxu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid165h(){try{__CLR4_4_115n015n0lc8azwxu.R.inc(54629);
        __CLR4_4_115n015n0lc8azwxu.R.inc(54630);assertEquals("ConverterManager[6 instant,7 partial,5 duration,5 period,3 interval]", ConverterManager.getInstance().toString());
    }finally{__CLR4_4_115n015n0lc8azwxu.R.flushNeeded();}}

}
