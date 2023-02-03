/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2012 Stephen Colebourne
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeZone;

/**
 * Test cases for FixedDateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestCachedDateTimeZone extends TestCase {static class __CLR4_4_11c7g1c7glc8azxqk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,62503,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_11c7g1c7glc8azxqk.R.inc(62476);
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62477);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_11c7g1c7glc8azxqk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_11c7g1c7glc8azxqk.R.inc(62478);
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62479);return new TestSuite(TestCachedDateTimeZone.class);
    }finally{__CLR4_4_11c7g1c7glc8azxqk.R.flushNeeded();}}

    private DateTimeZone originalDateTimeZone = null;

    public TestCachedDateTimeZone(String name) {
        super(name);__CLR4_4_11c7g1c7glc8azxqk.R.inc(62481);try{__CLR4_4_11c7g1c7glc8azxqk.R.inc(62480);
    }finally{__CLR4_4_11c7g1c7glc8azxqk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_11c7g1c7glc8azxqk.R.inc(62482);
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62483);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62484);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_11c7g1c7glc8azxqk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_11c7g1c7glc8azxqk.R.inc(62485);
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62486);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_11c7g1c7glc8azxqk.R.flushNeeded();}}

    public void test_caching() throws Exception {__CLR4_4_11c7g1c7glc8azxqk.R.globalSliceStart(getClass().getName(),62487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h2su071c7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c7g1c7glc8azxqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c7g1c7glc8azxqk.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCachedDateTimeZone.test_caching",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h2su071c7r() throws Exception{try{__CLR4_4_11c7g1c7glc8azxqk.R.inc(62487);
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62488);CachedDateTimeZone zone1 = CachedDateTimeZone.forZone(DateTimeZone.forID("Europe/Paris"));
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62489);CachedDateTimeZone zone2 = CachedDateTimeZone.forZone(DateTimeZone.forID("Europe/Paris"));
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62490);assertSame(zone1, zone2);
    }finally{__CLR4_4_11c7g1c7glc8azxqk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_11c7g1c7glc8azxqk.R.globalSliceStart(getClass().getName(),62491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on91c7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c7g1c7glc8azxqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c7g1c7glc8azxqk.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCachedDateTimeZone.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on91c7v() throws Exception{try{__CLR4_4_11c7g1c7glc8azxqk.R.inc(62491);
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62492);CachedDateTimeZone test = CachedDateTimeZone.forZone(DateTimeZone.forID("Europe/Paris"));
        
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62493);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62494);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62495);oos.writeObject(test);
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62496);byte[] bytes = baos.toByteArray();
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62497);oos.close();
        
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62498);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62499);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62500);CachedDateTimeZone result = (CachedDateTimeZone) ois.readObject();
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62501);ois.close();
        
        __CLR4_4_11c7g1c7glc8azxqk.R.inc(62502);assertEquals(test, result);
    }finally{__CLR4_4_11c7g1c7glc8azxqk.R.flushNeeded();}}

}
