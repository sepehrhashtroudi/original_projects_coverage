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

import java.util.Date;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeZone;

/**
 * Test cases for FixedDateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestFixedDateTimeZone extends TestCase {static class __CLR4_4_11cb11cb1lc8azxr3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,62657,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_11cb11cb1lc8azxr3.R.inc(62605);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62606);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_11cb11cb1lc8azxr3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_11cb11cb1lc8azxr3.R.inc(62607);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62608);return new TestSuite(TestFixedDateTimeZone.class);
    }finally{__CLR4_4_11cb11cb1lc8azxr3.R.flushNeeded();}}

    private DateTimeZone originalDateTimeZone = null;

    public TestFixedDateTimeZone(String name) {
        super(name);__CLR4_4_11cb11cb1lc8azxr3.R.inc(62610);try{__CLR4_4_11cb11cb1lc8azxr3.R.inc(62609);
    }finally{__CLR4_4_11cb11cb1lc8azxr3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_11cb11cb1lc8azxr3.R.inc(62611);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62612);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62613);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_11cb11cb1lc8azxr3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_11cb11cb1lc8azxr3.R.inc(62614);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62615);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_11cb11cb1lc8azxr3.R.flushNeeded();}}

    public void testEquals() throws Exception {__CLR4_4_11cb11cb1lc8azxr3.R.globalSliceStart(getClass().getName(),62616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6081cbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cb11cb1lc8azxr3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cb11cb1lc8azxr3.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6081cbc() throws Exception{try{__CLR4_4_11cb11cb1lc8azxr3.R.inc(62616);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62617);FixedDateTimeZone zone1 = new FixedDateTimeZone("A", "B", 1, 5);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62618);FixedDateTimeZone zone1b = new FixedDateTimeZone("A", "B", 1, 5);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62619);FixedDateTimeZone zone2 = new FixedDateTimeZone("A", "C", 1, 5);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62620);FixedDateTimeZone zone3 = new FixedDateTimeZone("A", "B", 2, 5);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62621);FixedDateTimeZone zone4 = new FixedDateTimeZone("A", "B", 1, 6);
        
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62622);assertEquals(true, zone1.equals(zone1));
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62623);assertEquals(true, zone1.equals(zone1b));
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62624);assertEquals(true, zone1.equals(zone2));  // second arg ignored
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62625);assertEquals(false, zone1.equals(zone3));
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62626);assertEquals(false, zone1.equals(zone4));
    }finally{__CLR4_4_11cb11cb1lc8azxr3.R.flushNeeded();}}

    public void testHashCode() throws Exception {__CLR4_4_11cb11cb1lc8azxr3.R.globalSliceStart(getClass().getName(),62627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zkhv81cbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cb11cb1lc8azxr3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cb11cb1lc8azxr3.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zkhv81cbn() throws Exception{try{__CLR4_4_11cb11cb1lc8azxr3.R.inc(62627);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62628);FixedDateTimeZone zone1 = new FixedDateTimeZone("A", "B", 1, 5);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62629);FixedDateTimeZone zone1b = new FixedDateTimeZone("A", "B", 1, 5);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62630);FixedDateTimeZone zone2 = new FixedDateTimeZone("A", "C", 1, 5);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62631);FixedDateTimeZone zone3 = new FixedDateTimeZone("A", "B", 2, 5);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62632);FixedDateTimeZone zone4 = new FixedDateTimeZone("A", "B", 1, 6);
        
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62633);assertEquals(true, zone1.hashCode() == zone1.hashCode());
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62634);assertEquals(true, zone1.hashCode() == zone1b.hashCode());
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62635);assertEquals(true, zone1.hashCode() == zone2.hashCode());  // second arg ignored
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62636);assertEquals(false, zone1.hashCode() == zone3.hashCode());
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62637);assertEquals(false, zone1.hashCode() == zone4.hashCode());
    }finally{__CLR4_4_11cb11cb1lc8azxr3.R.flushNeeded();}}

    public void testToTimeZone1() throws Exception {__CLR4_4_11cb11cb1lc8azxr3.R.globalSliceStart(getClass().getName(),62638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1laif4e1cby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cb11cb1lc8azxr3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cb11cb1lc8azxr3.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testToTimeZone1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1laif4e1cby() throws Exception{try{__CLR4_4_11cb11cb1lc8azxr3.R.inc(62638);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62639);FixedDateTimeZone zone = new FixedDateTimeZone("+00:01", "+00:01", 60000, 60000);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62640);java.util.TimeZone tz = zone.toTimeZone();
        
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62641);assertEquals(60000, tz.getRawOffset());
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62642);assertEquals(60000, getOffset(tz, 1167638400000L));
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62643);assertEquals(60000, getOffset(tz, 1185951600000L));
    }finally{__CLR4_4_11cb11cb1lc8azxr3.R.flushNeeded();}}

    public void testToTimeZone2() throws Exception {__CLR4_4_11cb11cb1lc8azxr3.R.globalSliceStart(getClass().getName(),62644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1igbx1cc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cb11cb1lc8azxr3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cb11cb1lc8azxr3.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testToTimeZone2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1igbx1cc4() throws Exception{try{__CLR4_4_11cb11cb1lc8azxr3.R.inc(62644);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62645);FixedDateTimeZone zone = new FixedDateTimeZone("A", "B", 1, 5);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62646);java.util.TimeZone tz = zone.toTimeZone();
        
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62647);assertEquals(1, tz.getRawOffset());
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62648);assertEquals(1, getOffset(tz, 1167638400000L));
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62649);assertEquals(1, getOffset(tz, 1185951600000L));
    }finally{__CLR4_4_11cb11cb1lc8azxr3.R.flushNeeded();}}

    /** Make test compile on JDK 1.3. */
    private int getOffset(TimeZone zone, long millis) {try{__CLR4_4_11cb11cb1lc8azxr3.R.inc(62650);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62651);Date date = new Date(millis);
        __CLR4_4_11cb11cb1lc8azxr3.R.inc(62652);if ((((zone.inDaylightTime(date))&&(__CLR4_4_11cb11cb1lc8azxr3.R.iget(62653)!=0|true))||(__CLR4_4_11cb11cb1lc8azxr3.R.iget(62654)==0&false))) {{
            __CLR4_4_11cb11cb1lc8azxr3.R.inc(62655);return zone.getRawOffset() + 3600000;
        }
        }__CLR4_4_11cb11cb1lc8azxr3.R.inc(62656);return zone.getRawOffset();
    }finally{__CLR4_4_11cb11cb1lc8azxr3.R.flushNeeded();}}

}
