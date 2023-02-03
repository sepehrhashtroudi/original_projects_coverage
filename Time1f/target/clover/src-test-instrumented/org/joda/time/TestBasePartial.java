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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.BasePartial;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TestBasePartial extends TestCase {static class __CLR4_4_1gu2gu2lc8azu27{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,21877,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21818);
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21819);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21820);
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21821);return new TestSuite(TestBasePartial.class);
    }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}

    public TestBasePartial(String name) {
        super(name);__CLR4_4_1gu2gu2lc8azu27.R.inc(21823);try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21822);
    }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21824);
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21825);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21826);zone = DateTimeZone.getDefault();
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21827);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21828);
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21829);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21830);DateTimeZone.setDefault(zone);
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21831);zone = null;
    }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetMethods() throws Throwable {__CLR4_4_1gu2gu2lc8azu27.R.globalSliceStart(getClass().getName(),21832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mqk2ehgug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gu2gu2lc8azu27.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gu2gu2lc8azu27.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBasePartial.testSetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mqk2ehgug() throws Throwable{try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21832);
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21833);MockPartial mock = new MockPartial();
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21834);assertEquals(1970, mock.getYear());
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21835);assertEquals(1, mock.getMonthOfYear());
        
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21836);mock.setYear(2004);
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21837);assertEquals(2004, mock.getYear());
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21838);assertEquals(1, mock.getMonthOfYear());
        
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21839);mock.setMonthOfYear(6);
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21840);assertEquals(2004, mock.getYear());
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21841);assertEquals(6, mock.getMonthOfYear());
        
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21842);mock.set(2005, 5);
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21843);assertEquals(2005, mock.getYear());
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21844);assertEquals(5, mock.getMonthOfYear());
        
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21845);try {
            __CLR4_4_1gu2gu2lc8azu27.R.inc(21846);mock.setMonthOfYear(0);
            __CLR4_4_1gu2gu2lc8azu27.R.inc(21847);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21848);assertEquals(2005, mock.getYear());
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21849);assertEquals(5, mock.getMonthOfYear());
        
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21850);try {
            __CLR4_4_1gu2gu2lc8azu27.R.inc(21851);mock.setMonthOfYear(13);
            __CLR4_4_1gu2gu2lc8azu27.R.inc(21852);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21853);assertEquals(2005, mock.getYear());
        __CLR4_4_1gu2gu2lc8azu27.R.inc(21854);assertEquals(5, mock.getMonthOfYear());
    }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}

    static class MockPartial extends BasePartial {
        
        MockPartial() {
            super(new int[] {1970, 1}, null);__CLR4_4_1gu2gu2lc8azu27.R.inc(21856);try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21855);
        }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}

        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21857);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1gu2gu2lc8azu27.R.inc(21858);switch (index) {
                case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1gu2gu2lc8azu27.R.inc(21859);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1gu2gu2lc8azu27.R.inc(21860);return chrono.year();
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1gu2gu2lc8azu27.R.inc(21861);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1gu2gu2lc8azu27.R.inc(21862);return chrono.monthOfYear();
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_1gu2gu2lc8azu27.R.inc(21863);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1gu2gu2lc8azu27.R.inc(21864);throw new IndexOutOfBoundsException();
            }
        }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}

        public int size() {try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21865);
            __CLR4_4_1gu2gu2lc8azu27.R.inc(21866);return 2;
        }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}
        
        public int getYear() {try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21867);
            __CLR4_4_1gu2gu2lc8azu27.R.inc(21868);return getValue(0);
        }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}
        
        public void setYear(int year) {try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21869);
            __CLR4_4_1gu2gu2lc8azu27.R.inc(21870);setValue(0, year);
        }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}
        
        public int getMonthOfYear() {try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21871);
            __CLR4_4_1gu2gu2lc8azu27.R.inc(21872);return getValue(1);
        }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}
        
        public void setMonthOfYear(int month) {try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21873);
            __CLR4_4_1gu2gu2lc8azu27.R.inc(21874);setValue(1, month);
        }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}
        
        public void set(int year, int month) {try{__CLR4_4_1gu2gu2lc8azu27.R.inc(21875);
            __CLR4_4_1gu2gu2lc8azu27.R.inc(21876);setValues(new int[] {year, month});
        }finally{__CLR4_4_1gu2gu2lc8azu27.R.flushNeeded();}}
    }
}
