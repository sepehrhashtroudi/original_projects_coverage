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

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Properties extends TestCase {static class __CLR4_4_110ee10eelc8azwbk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,47661,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
        
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_110ee10eelc8azwbk.R.inc(47174);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47175);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_110ee10eelc8azwbk.R.inc(47176);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47177);return new TestSuite(TestTimeOfDay_Properties.class);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public TestTimeOfDay_Properties(String name) {
        super(name);__CLR4_4_110ee10eelc8azwbk.R.inc(47179);try{__CLR4_4_110ee10eelc8azwbk.R.inc(47178);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_110ee10eelc8azwbk.R.inc(47180);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47181);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47182);zone = DateTimeZone.getDefault();
        __CLR4_4_110ee10eelc8azwbk.R.inc(47183);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_110ee10eelc8azwbk.R.inc(47184);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47185);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_110ee10eelc8azwbk.R.inc(47186);DateTimeZone.setDefault(zone);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47187);zone = null;
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetHour() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mry6ka10es();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mry6ka10es(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47188);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47189);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47190);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47191);assertEquals("hourOfDay", test.hourOfDay().getName());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47192);assertEquals("Property[hourOfDay]", test.hourOfDay().toString());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47193);assertSame(test, test.hourOfDay().getReadablePartial());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47194);assertSame(test, test.hourOfDay().getTimeOfDay());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47195);assertEquals(10, test.hourOfDay().get());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47196);assertEquals("10", test.hourOfDay().getAsString());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47197);assertEquals("10", test.hourOfDay().getAsText());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47198);assertEquals("10", test.hourOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47199);assertEquals("10", test.hourOfDay().getAsShortText());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47200);assertEquals("10", test.hourOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47201);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47202);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47203);assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47204);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesHour() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xi8wm10f9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMaxMinValuesHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xi8wm10f9(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47205);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47206);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47207);assertEquals(0, test.hourOfDay().getMinimumValue());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47208);assertEquals(0, test.hourOfDay().getMinimumValueOverall());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47209);assertEquals(23, test.hourOfDay().getMaximumValue());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47210);assertEquals(23, test.hourOfDay().getMaximumValueOverall());
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyAddHour() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15c189x10ff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15c189x10ff(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47211);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47212);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47213);TimeOfDay copy = test.hourOfDay().addToCopy(9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47214);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47215);check(copy, 19, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47216);copy = test.hourOfDay().addToCopy(0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47217);check(copy, 10, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47218);copy = test.hourOfDay().addToCopy(13);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47219);check(copy, 23, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47220);copy = test.hourOfDay().addToCopy(14);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47221);check(copy, 0, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47222);copy = test.hourOfDay().addToCopy(-10);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47223);check(copy, 0, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47224);copy = test.hourOfDay().addToCopy(-11);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47225);check(copy, 23, 20, 30, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyAddNoWrapHour() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dnr3w010fu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddNoWrapHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dnr3w010fu(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47226);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47227);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47228);TimeOfDay copy = test.hourOfDay().addNoWrapToCopy(9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47229);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47230);check(copy, 19, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47231);copy = test.hourOfDay().addNoWrapToCopy(0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47232);check(copy, 10, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47233);copy = test.hourOfDay().addNoWrapToCopy(13);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47234);check(copy, 23, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47235);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47236);test.hourOfDay().addNoWrapToCopy(14);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47237);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110ee10eelc8azwbk.R.inc(47238);check(test, 10, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47239);copy = test.hourOfDay().addNoWrapToCopy(-10);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47240);check(copy, 0, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47241);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47242);test.hourOfDay().addNoWrapToCopy(-11);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47243);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110ee10eelc8azwbk.R.inc(47244);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyAddWrapFieldHour() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x88om710gd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x88om710gd(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47245);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47246);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47247);TimeOfDay copy = test.hourOfDay().addWrapFieldToCopy(9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47248);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47249);check(copy, 19, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47250);copy = test.hourOfDay().addWrapFieldToCopy(0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47251);check(copy, 10, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47252);copy = test.hourOfDay().addWrapFieldToCopy(18);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47253);check(copy, 4, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47254);copy = test.hourOfDay().addWrapFieldToCopy(-15);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47255);check(copy, 19, 20, 30, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertySetHour() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyrp2y10go();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyrp2y10go(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47256);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47257);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47258);TimeOfDay copy = test.hourOfDay().setCopy(12);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47259);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47260);check(copy, 12, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47261);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47262);test.hourOfDay().setCopy(24);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47263);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110ee10eelc8azwbk.R.inc(47264);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47265);test.hourOfDay().setCopy(-1);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47266);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertySetTextHour() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yha1910gz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yha1910gz(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47267);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47268);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47269);TimeOfDay copy = test.hourOfDay().setCopy("12");
        __CLR4_4_110ee10eelc8azwbk.R.inc(47270);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47271);check(copy, 12, 20, 30, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyWithMaximumValueHour() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otnz9310h4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyWithMaximumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otnz9310h4(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47272);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47273);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47274);TimeOfDay copy = test.hourOfDay().withMaximumValue();
        __CLR4_4_110ee10eelc8azwbk.R.inc(47275);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47276);check(copy, 23, 20, 30, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyWithMinimumValueHour() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6uf1h10h9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyWithMinimumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6uf1h10h9(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47277);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47278);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47279);TimeOfDay copy = test.hourOfDay().withMinimumValue();
        __CLR4_4_110ee10eelc8azwbk.R.inc(47280);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47281);check(copy, 0, 20, 30, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyCompareToHour() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174ldgc10he();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyCompareToHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174ldgc10he(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47282);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47283);TimeOfDay test1 = new TimeOfDay(TEST_TIME1);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47284);TimeOfDay test2 = new TimeOfDay(TEST_TIME2);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47285);assertEquals(true, test1.hourOfDay().compareTo(test2) < 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47286);assertEquals(true, test2.hourOfDay().compareTo(test1) > 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47287);assertEquals(true, test1.hourOfDay().compareTo(test1) == 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47288);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47289);test1.hourOfDay().compareTo((ReadablePartial) null);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47290);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47291);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47292);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47293);assertEquals(true, test1.hourOfDay().compareTo(dt2) < 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47294);assertEquals(true, test2.hourOfDay().compareTo(dt1) > 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47295);assertEquals(true, test1.hourOfDay().compareTo(dt1) == 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47296);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47297);test1.hourOfDay().compareTo((ReadableInstant) null);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47298);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMinute() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oej7l610hv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oej7l610hv(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47299);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47300);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47301);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47302);assertEquals("minuteOfHour", test.minuteOfHour().getName());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47303);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47304);assertSame(test, test.minuteOfHour().getReadablePartial());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47305);assertSame(test, test.minuteOfHour().getTimeOfDay());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47306);assertEquals(20, test.minuteOfHour().get());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47307);assertEquals("20", test.minuteOfHour().getAsString());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47308);assertEquals("20", test.minuteOfHour().getAsText());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47309);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47310);assertEquals("20", test.minuteOfHour().getAsShortText());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47311);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47312);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47313);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47314);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47315);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesMinute() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110m2u210ic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMaxMinValuesMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110m2u210ic(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47316);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47317);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47318);assertEquals(0, test.minuteOfHour().getMinimumValue());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47319);assertEquals(0, test.minuteOfHour().getMinimumValueOverall());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47320);assertEquals(59, test.minuteOfHour().getMaximumValue());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47321);assertEquals(59, test.minuteOfHour().getMaximumValueOverall());
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyAddMinute() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pugv6d10ii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pugv6d10ii(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47322);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47323);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47324);TimeOfDay copy = test.minuteOfHour().addToCopy(9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47325);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47326);check(copy, 10, 29, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47327);copy = test.minuteOfHour().addToCopy(39);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47328);check(copy, 10, 59, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47329);copy = test.minuteOfHour().addToCopy(40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47330);check(copy, 11, 0, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47331);copy = test.minuteOfHour().addToCopy(1 * 60 + 45);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47332);check(copy, 12, 5, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47333);copy = test.minuteOfHour().addToCopy(13 * 60 + 39);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47334);check(copy, 23, 59, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47335);copy = test.minuteOfHour().addToCopy(13 * 60 + 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47336);check(copy, 0, 0, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47337);copy = test.minuteOfHour().addToCopy(-9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47338);check(copy, 10, 11, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47339);copy = test.minuteOfHour().addToCopy(-19);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47340);check(copy, 10, 1, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47341);copy = test.minuteOfHour().addToCopy(-20);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47342);check(copy, 10, 0, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47343);copy = test.minuteOfHour().addToCopy(-21);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47344);check(copy, 9, 59, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47345);copy = test.minuteOfHour().addToCopy(-(10 * 60 + 20));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47346);check(copy, 0, 0, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47347);copy = test.minuteOfHour().addToCopy(-(10 * 60 + 21));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47348);check(copy, 23, 59, 30, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyAddNoWrapMinute() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgy8w010j9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddNoWrapMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgy8w010j9(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47349);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47350);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47351);TimeOfDay copy = test.minuteOfHour().addNoWrapToCopy(9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47352);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47353);check(copy, 10, 29, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47354);copy = test.minuteOfHour().addNoWrapToCopy(39);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47355);check(copy, 10, 59, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47356);copy = test.minuteOfHour().addNoWrapToCopy(40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47357);check(copy, 11, 0, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47358);copy = test.minuteOfHour().addNoWrapToCopy(1 * 60 + 45);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47359);check(copy, 12, 5, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47360);copy = test.minuteOfHour().addNoWrapToCopy(13 * 60 + 39);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47361);check(copy, 23, 59, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47362);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47363);test.minuteOfHour().addNoWrapToCopy(13 * 60 + 40);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47364);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110ee10eelc8azwbk.R.inc(47365);check(test, 10, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47366);copy = test.minuteOfHour().addNoWrapToCopy(-9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47367);check(copy, 10, 11, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47368);copy = test.minuteOfHour().addNoWrapToCopy(-19);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47369);check(copy, 10, 1, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47370);copy = test.minuteOfHour().addNoWrapToCopy(-20);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47371);check(copy, 10, 0, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47372);copy = test.minuteOfHour().addNoWrapToCopy(-21);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47373);check(copy, 9, 59, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47374);copy = test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 20));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47375);check(copy, 0, 0, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47376);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47377);test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 21));
            __CLR4_4_110ee10eelc8azwbk.R.inc(47378);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110ee10eelc8azwbk.R.inc(47379);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyAddWrapFieldMinute() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qahkvj10k4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qahkvj10k4(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47380);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47381);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47382);TimeOfDay copy = test.minuteOfHour().addWrapFieldToCopy(9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47383);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47384);check(copy, 10, 29, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47385);copy = test.minuteOfHour().addWrapFieldToCopy(49);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47386);check(copy, 10, 9, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47387);copy = test.minuteOfHour().addWrapFieldToCopy(-47);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47388);check(copy, 10, 33, 30, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertySetMinute() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196rp2u10kd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196rp2u10kd(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47389);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47390);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47391);TimeOfDay copy = test.minuteOfHour().setCopy(12);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47392);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47393);check(copy, 10, 12, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47394);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47395);test.minuteOfHour().setCopy(60);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47396);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110ee10eelc8azwbk.R.inc(47397);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47398);test.minuteOfHour().setCopy(-1);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47399);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertySetTextMinute() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18h1pnn10ko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18h1pnn10ko(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47400);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47401);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47402);TimeOfDay copy = test.minuteOfHour().setCopy("12");
        __CLR4_4_110ee10eelc8azwbk.R.inc(47403);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47404);check(copy, 10, 12, 30, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyCompareToMinute() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtzyp810kt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyCompareToMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtzyp810kt(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47405);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47406);TimeOfDay test1 = new TimeOfDay(TEST_TIME1);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47407);TimeOfDay test2 = new TimeOfDay(TEST_TIME2);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47408);assertEquals(true, test1.minuteOfHour().compareTo(test2) < 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47409);assertEquals(true, test2.minuteOfHour().compareTo(test1) > 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47410);assertEquals(true, test1.minuteOfHour().compareTo(test1) == 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47411);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47412);test1.minuteOfHour().compareTo((ReadablePartial) null);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47413);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47414);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47415);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47416);assertEquals(true, test1.minuteOfHour().compareTo(dt2) < 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47417);assertEquals(true, test2.minuteOfHour().compareTo(dt1) > 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47418);assertEquals(true, test1.minuteOfHour().compareTo(dt1) == 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47419);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47420);test1.minuteOfHour().compareTo((ReadableInstant) null);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47421);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetSecond() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plsrcm10la();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plsrcm10la(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47422);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47423);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47424);assertSame(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47425);assertEquals("secondOfMinute", test.secondOfMinute().getName());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47426);assertEquals("Property[secondOfMinute]", test.secondOfMinute().toString());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47427);assertSame(test, test.secondOfMinute().getReadablePartial());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47428);assertSame(test, test.secondOfMinute().getTimeOfDay());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47429);assertEquals(30, test.secondOfMinute().get());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47430);assertEquals("30", test.secondOfMinute().getAsString());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47431);assertEquals("30", test.secondOfMinute().getAsText());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47432);assertEquals("30", test.secondOfMinute().getAsText(Locale.FRENCH));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47433);assertEquals("30", test.secondOfMinute().getAsShortText());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47434);assertEquals("30", test.secondOfMinute().getAsShortText(Locale.FRENCH));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47435);assertEquals(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47436);assertEquals(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47437);assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47438);assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesSecond() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1e5ve10lr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMaxMinValuesSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1e5ve10lr(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47439);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47440);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47441);assertEquals(0, test.secondOfMinute().getMinimumValue());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47442);assertEquals(0, test.secondOfMinute().getMinimumValueOverall());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47443);assertEquals(59, test.secondOfMinute().getMaximumValue());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47444);assertEquals(59, test.secondOfMinute().getMaximumValueOverall());
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyAddSecond() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o5v3rf10lx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o5v3rf10lx(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47445);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47446);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47447);TimeOfDay copy = test.secondOfMinute().addToCopy(9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47448);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47449);check(copy, 10, 20, 39, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47450);copy = test.secondOfMinute().addToCopy(29);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47451);check(copy, 10, 20, 59, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47452);copy = test.secondOfMinute().addToCopy(30);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47453);check(copy, 10, 21, 0, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47454);copy = test.secondOfMinute().addToCopy(39 * 60 + 29);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47455);check(copy, 10, 59, 59, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47456);copy = test.secondOfMinute().addToCopy(39 * 60 + 30);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47457);check(copy, 11, 0, 0, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47458);copy = test.secondOfMinute().addToCopy(13 * 60 * 60 + 39 * 60 + 30);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47459);check(copy, 0, 0, 0, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47460);copy = test.secondOfMinute().addToCopy(-9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47461);check(copy, 10, 20, 21, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47462);copy = test.secondOfMinute().addToCopy(-30);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47463);check(copy, 10, 20, 0, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47464);copy = test.secondOfMinute().addToCopy(-31);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47465);check(copy, 10, 19, 59, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47466);copy = test.secondOfMinute().addToCopy(-(10 * 60 * 60 + 20 * 60 + 30));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47467);check(copy, 0, 0, 0, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47468);copy = test.secondOfMinute().addToCopy(-(10 * 60 * 60 + 20 * 60 + 31));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47469);check(copy, 23, 59, 59, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyAddNoWrapSecond() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mjdq1s10mm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddNoWrapSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mjdq1s10mm(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47470);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47471);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47472);TimeOfDay copy = test.secondOfMinute().addNoWrapToCopy(9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47473);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47474);check(copy, 10, 20, 39, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47475);copy = test.secondOfMinute().addNoWrapToCopy(29);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47476);check(copy, 10, 20, 59, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47477);copy = test.secondOfMinute().addNoWrapToCopy(30);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47478);check(copy, 10, 21, 0, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47479);copy = test.secondOfMinute().addNoWrapToCopy(39 * 60 + 29);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47480);check(copy, 10, 59, 59, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47481);copy = test.secondOfMinute().addNoWrapToCopy(39 * 60 + 30);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47482);check(copy, 11, 0, 0, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47483);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47484);test.secondOfMinute().addNoWrapToCopy(13 * 60 * 60 + 39 * 60 + 30);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47485);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110ee10eelc8azwbk.R.inc(47486);check(test, 10, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47487);copy = test.secondOfMinute().addNoWrapToCopy(-9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47488);check(copy, 10, 20, 21, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47489);copy = test.secondOfMinute().addNoWrapToCopy(-30);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47490);check(copy, 10, 20, 0, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47491);copy = test.secondOfMinute().addNoWrapToCopy(-31);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47492);check(copy, 10, 19, 59, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47493);copy = test.secondOfMinute().addNoWrapToCopy(-(10 * 60 * 60 + 20 * 60 + 30));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47494);check(copy, 0, 0, 0, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47495);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47496);test.secondOfMinute().addNoWrapToCopy(-(10 * 60 * 60 + 20 * 60 + 31));
            __CLR4_4_110ee10eelc8azwbk.R.inc(47497);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110ee10eelc8azwbk.R.inc(47498);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyAddWrapFieldSecond() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_159phu710nf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_159phu710nf(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47499);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47500);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47501);TimeOfDay copy = test.secondOfMinute().addWrapFieldToCopy(9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47502);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47503);check(copy, 10, 20, 39, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47504);copy = test.secondOfMinute().addWrapFieldToCopy(49);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47505);check(copy, 10, 20, 19, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47506);copy = test.secondOfMinute().addWrapFieldToCopy(-47);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47507);check(copy, 10, 20, 43, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertySetSecond() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7js4610no();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7js4610no(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47508);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47509);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47510);TimeOfDay copy = test.secondOfMinute().setCopy(12);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47511);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47512);check(copy, 10, 20, 12, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47513);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47514);test.secondOfMinute().setCopy(60);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47515);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110ee10eelc8azwbk.R.inc(47516);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47517);test.secondOfMinute().setCopy(-1);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47518);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertySetTextSecond() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thtsoz10nz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thtsoz10nz(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47519);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47520);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47521);TimeOfDay copy = test.secondOfMinute().setCopy("12");
        __CLR4_4_110ee10eelc8azwbk.R.inc(47522);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47523);check(copy, 10, 20, 12, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyCompareToSecond() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146s4c410o4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyCompareToSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146s4c410o4(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47524);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47525);TimeOfDay test1 = new TimeOfDay(TEST_TIME1);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47526);TimeOfDay test2 = new TimeOfDay(TEST_TIME2);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47527);assertEquals(true, test1.secondOfMinute().compareTo(test2) < 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47528);assertEquals(true, test2.secondOfMinute().compareTo(test1) > 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47529);assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47530);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47531);test1.secondOfMinute().compareTo((ReadablePartial) null);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47532);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47533);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47534);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47535);assertEquals(true, test1.secondOfMinute().compareTo(dt2) < 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47536);assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47537);assertEquals(true, test1.secondOfMinute().compareTo(dt1) == 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47538);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47539);test1.secondOfMinute().compareTo((ReadableInstant) null);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47540);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMilli() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15098b10ol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15098b10ol(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47541);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47542);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47543);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47544);assertEquals("millisOfSecond", test.millisOfSecond().getName());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47545);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47546);assertSame(test, test.millisOfSecond().getReadablePartial());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47547);assertSame(test, test.millisOfSecond().getTimeOfDay());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47548);assertEquals(40, test.millisOfSecond().get());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47549);assertEquals("40", test.millisOfSecond().getAsString());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47550);assertEquals("40", test.millisOfSecond().getAsText());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47551);assertEquals("40", test.millisOfSecond().getAsText(Locale.FRENCH));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47552);assertEquals("40", test.millisOfSecond().getAsShortText());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47553);assertEquals("40", test.millisOfSecond().getAsShortText(Locale.FRENCH));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47554);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47555);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47556);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47557);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesMilli() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ob72xh10p2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMaxMinValuesMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ob72xh10p2(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47558);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47559);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47560);assertEquals(0, test.millisOfSecond().getMinimumValue());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47561);assertEquals(0, test.millisOfSecond().getMinimumValueOverall());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47562);assertEquals(999, test.millisOfSecond().getMaximumValue());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47563);assertEquals(999, test.millisOfSecond().getMaximumValueOverall());
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyAddMilli() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1reinne10p8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1reinne10p8(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47564);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47565);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47566);TimeOfDay copy = test.millisOfSecond().addToCopy(9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47567);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47568);check(copy, 10, 20, 30, 49);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47569);copy = test.millisOfSecond().addToCopy(959);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47570);check(copy, 10, 20, 30, 999);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47571);copy = test.millisOfSecond().addToCopy(960);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47572);check(copy, 10, 20, 31, 0);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47573);copy = test.millisOfSecond().addToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47574);check(copy, 23, 59, 59, 999);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47575);copy = test.millisOfSecond().addToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47576);check(copy, 0, 0, 0, 0);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47577);copy = test.millisOfSecond().addToCopy(-9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47578);check(copy, 10, 20, 30, 31);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47579);copy = test.millisOfSecond().addToCopy(-40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47580);check(copy, 10, 20, 30, 0);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47581);copy = test.millisOfSecond().addToCopy(-41);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47582);check(copy, 10, 20, 29, 999);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47583);copy = test.millisOfSecond().addToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47584);check(copy, 0, 0, 0, 0);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47585);copy = test.millisOfSecond().addToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47586);check(copy, 23, 59, 59, 999);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyAddNoWrapMilli() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16u0mcv10pv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddNoWrapMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16u0mcv10pv(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47587);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47588);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47589);TimeOfDay copy = test.millisOfSecond().addNoWrapToCopy(9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47590);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47591);check(copy, 10, 20, 30, 49);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47592);copy = test.millisOfSecond().addNoWrapToCopy(959);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47593);check(copy, 10, 20, 30, 999);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47594);copy = test.millisOfSecond().addNoWrapToCopy(960);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47595);check(copy, 10, 20, 31, 0);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47596);copy = test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47597);check(copy, 23, 59, 59, 999);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47598);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47599);test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47600);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110ee10eelc8azwbk.R.inc(47601);check(test, 10, 20, 30, 40);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47602);copy = test.millisOfSecond().addNoWrapToCopy(-9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47603);check(copy, 10, 20, 30, 31);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47604);copy = test.millisOfSecond().addNoWrapToCopy(-40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47605);check(copy, 10, 20, 30, 0);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47606);copy = test.millisOfSecond().addNoWrapToCopy(-41);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47607);check(copy, 10, 20, 29, 999);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47608);copy = test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40));
        __CLR4_4_110ee10eelc8azwbk.R.inc(47609);check(copy, 0, 0, 0, 0);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47610);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47611);test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41));
            __CLR4_4_110ee10eelc8azwbk.R.inc(47612);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110ee10eelc8azwbk.R.inc(47613);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyAddWrapFieldMilli() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vk7sea10qm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vk7sea10qm(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47614);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47615);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47616);TimeOfDay copy = test.millisOfSecond().addWrapFieldToCopy(9);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47617);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47618);check(copy, 10, 20, 30, 49);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47619);copy = test.millisOfSecond().addWrapFieldToCopy(995);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47620);check(copy, 10, 20, 30, 35);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47621);copy = test.millisOfSecond().addWrapFieldToCopy(-47);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47622);check(copy, 10, 20, 30, 993);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertySetMilli() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1feqhbt10qv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1feqhbt10qv(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47623);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47624);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47625);TimeOfDay copy = test.millisOfSecond().setCopy(12);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47626);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47627);check(copy, 10, 20, 30, 12);
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47628);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47629);test.millisOfSecond().setCopy(1000);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47630);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110ee10eelc8azwbk.R.inc(47631);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47632);test.millisOfSecond().setCopy(-1);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47633);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertySetTextMilli() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17iyw2c10r6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17iyw2c10r6(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47634);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47635);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47636);TimeOfDay copy = test.millisOfSecond().setCopy("12");
        __CLR4_4_110ee10eelc8azwbk.R.inc(47637);check(test, 10, 20, 30, 40);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47638);check(copy, 10, 20, 30, 12);
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    public void testPropertyCompareToMilli() {__CLR4_4_110ee10eelc8azwbk.R.globalSliceStart(getClass().getName(),47639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rds2t10rb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110ee10eelc8azwbk.R.rethrow($CLV_t2$);}finally{__CLR4_4_110ee10eelc8azwbk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyCompareToMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rds2t10rb(){try{__CLR4_4_110ee10eelc8azwbk.R.inc(47639);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47640);TimeOfDay test1 = new TimeOfDay(TEST_TIME1);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47641);TimeOfDay test2 = new TimeOfDay(TEST_TIME2);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47642);assertEquals(true, test1.millisOfSecond().compareTo(test2) < 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47643);assertEquals(true, test2.millisOfSecond().compareTo(test1) > 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47644);assertEquals(true, test1.millisOfSecond().compareTo(test1) == 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47645);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47646);test1.millisOfSecond().compareTo((ReadablePartial) null);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47647);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_110ee10eelc8azwbk.R.inc(47648);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47649);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47650);assertEquals(true, test1.millisOfSecond().compareTo(dt2) < 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47651);assertEquals(true, test2.millisOfSecond().compareTo(dt1) > 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47652);assertEquals(true, test1.millisOfSecond().compareTo(dt1) == 0);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47653);try {
            __CLR4_4_110ee10eelc8azwbk.R.inc(47654);test1.millisOfSecond().compareTo((ReadableInstant) null);
            __CLR4_4_110ee10eelc8azwbk.R.inc(47655);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_110ee10eelc8azwbk.R.inc(47656);
        __CLR4_4_110ee10eelc8azwbk.R.inc(47657);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47658);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47659);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_110ee10eelc8azwbk.R.inc(47660);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_110ee10eelc8azwbk.R.flushNeeded();}}
}
