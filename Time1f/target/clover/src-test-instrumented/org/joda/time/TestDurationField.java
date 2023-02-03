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
package org.joda.time;

import org.joda.time.chrono.ISOChronology;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for DurationField.
 *
 * @author Stephen Colebourne
 */
public class TestDurationField extends TestCase {static class __CLR4_4_1lv5lv5lc8azuoj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,28355,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1lv5lv5lc8azuoj.R.inc(28337);
        __CLR4_4_1lv5lv5lc8azuoj.R.inc(28338);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lv5lv5lc8azuoj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lv5lv5lc8azuoj.R.inc(28339);
        __CLR4_4_1lv5lv5lc8azuoj.R.inc(28340);return new TestSuite(TestDurationField.class);
    }finally{__CLR4_4_1lv5lv5lc8azuoj.R.flushNeeded();}}

    public TestDurationField(String name) {
        super(name);__CLR4_4_1lv5lv5lc8azuoj.R.inc(28342);try{__CLR4_4_1lv5lv5lc8azuoj.R.inc(28341);
    }finally{__CLR4_4_1lv5lv5lc8azuoj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lv5lv5lc8azuoj.R.inc(28343);
    }finally{__CLR4_4_1lv5lv5lc8azuoj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lv5lv5lc8azuoj.R.inc(28344);
    }finally{__CLR4_4_1lv5lv5lc8azuoj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_subtract() throws Exception {__CLR4_4_1lv5lv5lc8azuoj.R.globalSliceStart(getClass().getName(),28345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sdze0olvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lv5lv5lc8azuoj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lv5lv5lc8azuoj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationField.test_subtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sdze0olvd() throws Exception{try{__CLR4_4_1lv5lv5lc8azuoj.R.inc(28345);
        __CLR4_4_1lv5lv5lc8azuoj.R.inc(28346);DurationField fld = ISOChronology.getInstanceUTC().millis();
        __CLR4_4_1lv5lv5lc8azuoj.R.inc(28347);assertEquals(900, fld.subtract(1000L, 100));
        __CLR4_4_1lv5lv5lc8azuoj.R.inc(28348);assertEquals(900L, fld.subtract(1000L, 100L));
        __CLR4_4_1lv5lv5lc8azuoj.R.inc(28349);assertEquals((1000L - Integer.MAX_VALUE), fld.subtract(1000L, Integer.MAX_VALUE));
        __CLR4_4_1lv5lv5lc8azuoj.R.inc(28350);assertEquals((1000L - Integer.MIN_VALUE), fld.subtract(1000L, Integer.MIN_VALUE));
        __CLR4_4_1lv5lv5lc8azuoj.R.inc(28351);assertEquals((1000L - Long.MAX_VALUE), fld.subtract(1000L, Long.MAX_VALUE));
        __CLR4_4_1lv5lv5lc8azuoj.R.inc(28352);try {
            __CLR4_4_1lv5lv5lc8azuoj.R.inc(28353);fld.subtract(-1000L, Long.MIN_VALUE);
            __CLR4_4_1lv5lv5lc8azuoj.R.inc(28354);fail();
        } catch (ArithmeticException ex) {}
    }finally{__CLR4_4_1lv5lv5lc8azuoj.R.flushNeeded();}}

}
