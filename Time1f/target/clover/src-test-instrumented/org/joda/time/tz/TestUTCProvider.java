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
package org.joda.time.tz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Set;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeZone;

/**
 * This class is a JUnit test for UTCProvider.
 *
 * @author Stephen Colebourne
 */
public class TestUTCProvider extends TestCase {static class __CLR4_4_11cch1cchlc8azxr6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,62680,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_11cch1cchlc8azxr6.R.inc(62657);
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62658);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_11cch1cchlc8azxr6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_11cch1cchlc8azxr6.R.inc(62659);
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62660);return new TestSuite(TestUTCProvider.class);
    }finally{__CLR4_4_11cch1cchlc8azxr6.R.flushNeeded();}}

    public TestUTCProvider(String name) {
        super(name);__CLR4_4_11cch1cchlc8azxr6.R.inc(62662);try{__CLR4_4_11cch1cchlc8azxr6.R.inc(62661);
    }finally{__CLR4_4_11cch1cchlc8azxr6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testClass() throws Exception {__CLR4_4_11cch1cchlc8azxr6.R.globalSliceStart(getClass().getName(),62663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11x2ulv1ccn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cch1cchlc8azxr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cch1cchlc8azxr6.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestUTCProvider.testClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11x2ulv1ccn() throws Exception{try{__CLR4_4_11cch1cchlc8azxr6.R.inc(62663);
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62664);Class cls = UTCProvider.class;
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62665);assertEquals(true, Modifier.isPublic(cls.getModifiers()));
        
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62666);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62667);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62668);assertEquals(true, Modifier.isPublic(con.getModifiers()));
    }finally{__CLR4_4_11cch1cchlc8azxr6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetAvailableIDs() throws Exception {__CLR4_4_11cch1cchlc8azxr6.R.globalSliceStart(getClass().getName(),62669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mu0qey1cct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cch1cchlc8azxr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cch1cchlc8azxr6.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestUTCProvider.testGetAvailableIDs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mu0qey1cct() throws Exception{try{__CLR4_4_11cch1cchlc8azxr6.R.inc(62669);
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62670);Provider p = new UTCProvider();
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62671);Set set = p.getAvailableIDs();
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62672);assertEquals(1, set.size());
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62673);assertEquals("UTC", set.iterator().next());
    }finally{__CLR4_4_11cch1cchlc8azxr6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetZone_String() throws Exception {__CLR4_4_11cch1cchlc8azxr6.R.globalSliceStart(getClass().getName(),62674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b846ft1ccy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cch1cchlc8azxr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cch1cchlc8azxr6.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestUTCProvider.testGetZone_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b846ft1ccy() throws Exception{try{__CLR4_4_11cch1cchlc8azxr6.R.inc(62674);
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62675);Provider p = new UTCProvider();
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62676);assertSame(DateTimeZone.UTC, p.getZone("UTC"));
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62677);assertEquals(null, p.getZone(null));
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62678);assertEquals(null, p.getZone("Europe/London"));
        __CLR4_4_11cch1cchlc8azxr6.R.inc(62679);assertEquals(null, p.getZone("Blah"));
    }finally{__CLR4_4_11cch1cchlc8azxr6.R.flushNeeded();}}

}
