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

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for Years.
 *
 * @author Stephen Colebourne
 */
public class TestYears extends TestCase {static class __CLR4_4_112gm12gmlc8azwj1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,50024,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49846);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49847);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49848);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49849);return new TestSuite(TestYears.class);
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    public TestYears(String name) {
        super(name);__CLR4_4_112gm12gmlc8azwj1.R.inc(49851);try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49850);
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49852);
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49853);
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstants() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlw12gu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlw12gu(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49854);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49855);assertEquals(0, Years.ZERO.getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49856);assertEquals(1, Years.ONE.getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49857);assertEquals(2, Years.TWO.getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49858);assertEquals(3, Years.THREE.getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49859);assertEquals(Integer.MAX_VALUE, Years.MAX_VALUE.getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49860);assertEquals(Integer.MIN_VALUE, Years.MIN_VALUE.getYears());
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_years_int() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iu2va12h1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_years_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iu2va12h1(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49861);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49862);assertSame(Years.ZERO, Years.years(0));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49863);assertSame(Years.ONE, Years.years(1));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49864);assertSame(Years.TWO, Years.years(2));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49865);assertSame(Years.THREE, Years.years(3));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49866);assertSame(Years.MAX_VALUE, Years.years(Integer.MAX_VALUE));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49867);assertSame(Years.MIN_VALUE, Years.years(Integer.MIN_VALUE));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49868);assertEquals(-1, Years.years(-1).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49869);assertEquals(4, Years.years(4).getYears());
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_yearsBetween_RInstant() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t79c8s12ha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t79c8s12ha(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49870);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49871);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49872);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49873);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS);
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49874);assertEquals(3, Years.yearsBetween(start, end1).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49875);assertEquals(0, Years.yearsBetween(start, start).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49876);assertEquals(0, Years.yearsBetween(end1, end1).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49877);assertEquals(-3, Years.yearsBetween(end1, start).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49878);assertEquals(6, Years.yearsBetween(start, end2).getYears());
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testFactory_yearsBetween_RPartial() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcr19g12hj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcr19g12hj(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49879);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49880);LocalDate start = new LocalDate(2006, 6, 9);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49881);LocalDate end1 = new LocalDate(2009, 6, 9);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49882);YearMonthDay end2 = new YearMonthDay(2012, 6, 9);
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49883);assertEquals(3, Years.yearsBetween(start, end1).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49884);assertEquals(0, Years.yearsBetween(start, start).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49885);assertEquals(0, Years.yearsBetween(end1, end1).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49886);assertEquals(-3, Years.yearsBetween(end1, start).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49887);assertEquals(6, Years.yearsBetween(start, end2).getYears());
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    public void testFactory_yearsIn_RInterval() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d3db0t12hs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d3db0t12hs(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49888);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49889);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49890);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49891);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS);
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49892);assertEquals(0, Years.yearsIn((ReadableInterval) null).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49893);assertEquals(3, Years.yearsIn(new Interval(start, end1)).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49894);assertEquals(0, Years.yearsIn(new Interval(start, start)).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49895);assertEquals(0, Years.yearsIn(new Interval(end1, end1)).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49896);assertEquals(6, Years.yearsIn(new Interval(start, end2)).getYears());
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    public void testFactory_parseYears_String() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmswml12i1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_parseYears_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmswml12i1(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49897);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49898);assertEquals(0, Years.parseYears((String) null).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49899);assertEquals(0, Years.parseYears("P0Y").getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49900);assertEquals(1, Years.parseYears("P1Y").getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49901);assertEquals(-3, Years.parseYears("P-3Y").getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49902);assertEquals(2, Years.parseYears("P2Y0M").getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49903);assertEquals(2, Years.parseYears("P2YT0H0M").getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49904);try {
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49905);Years.parseYears("P1M1D");
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49906);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49907);try {
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49908);Years.parseYears("P1YT1H");
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49909);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetMethods() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmz12ie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmz12ie(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49910);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49911);Years test = Years.years(20);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49912);assertEquals(20, test.getYears());
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    public void testGetFieldType() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mv12ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mv12ih(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49913);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49914);Years test = Years.years(20);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49915);assertEquals(DurationFieldType.years(), test.getFieldType());
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    public void testGetPeriodType() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1i12ik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1i12ik(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49916);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49917);Years test = Years.years(20);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49918);assertEquals(PeriodType.years(), test.getPeriodType());
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsGreaterThan() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnom12in();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnom12in(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49919);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49920);assertEquals(true, Years.THREE.isGreaterThan(Years.TWO));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49921);assertEquals(false, Years.THREE.isGreaterThan(Years.THREE));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49922);assertEquals(false, Years.TWO.isGreaterThan(Years.THREE));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49923);assertEquals(true, Years.ONE.isGreaterThan(null));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49924);assertEquals(false, Years.years(-1).isGreaterThan(null));
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    public void testIsLessThan() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kd12it();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kd12it(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49925);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49926);assertEquals(false, Years.THREE.isLessThan(Years.TWO));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49927);assertEquals(false, Years.THREE.isLessThan(Years.THREE));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49928);assertEquals(true, Years.TWO.isLessThan(Years.THREE));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49929);assertEquals(false, Years.ONE.isLessThan(null));
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49930);assertEquals(true, Years.years(-1).isLessThan(null));
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid12iz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid12iz(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49931);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49932);Years test = Years.years(20);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49933);assertEquals("P20Y", test.toString());
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49934);test = Years.years(-20);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49935);assertEquals("P-20Y", test.toString());
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on912j4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on912j4() throws Exception{try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49936);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49937);Years test = Years.THREE;
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49938);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49939);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49940);oos.writeObject(test);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49941);byte[] bytes = baos.toByteArray();
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49942);oos.close();
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49943);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49944);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49945);Years result = (Years) ois.readObject();
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49946);ois.close();
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49947);assertSame(test, result);
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_int() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4eb12jg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4eb12jg(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49948);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49949);Years test2 = Years.years(2);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49950);Years result = test2.plus(3);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49951);assertEquals(2, test2.getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49952);assertEquals(5, result.getYears());
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49953);assertEquals(1, Years.ONE.plus(0).getYears());
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49954);try {
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49955);Years.MAX_VALUE.plus(1);
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49956);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    public void testPlus_Years() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vdjml212jp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testPlus_Years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vdjml212jp(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49957);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49958);Years test2 = Years.years(2);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49959);Years test3 = Years.years(3);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49960);Years result = test2.plus(test3);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49961);assertEquals(2, test2.getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49962);assertEquals(3, test3.getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49963);assertEquals(5, result.getYears());
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49964);assertEquals(1, Years.ONE.plus(Years.ZERO).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49965);assertEquals(1, Years.ONE.plus((Years) null).getYears());
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49966);try {
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49967);Years.MAX_VALUE.plus(Years.ONE);
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49968);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    public void testMinus_int() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvp12k1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvp12k1(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49969);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49970);Years test2 = Years.years(2);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49971);Years result = test2.minus(3);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49972);assertEquals(2, test2.getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49973);assertEquals(-1, result.getYears());
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49974);assertEquals(1, Years.ONE.minus(0).getYears());
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49975);try {
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49976);Years.MIN_VALUE.minus(1);
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49977);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    public void testMinus_Years() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11n3hgk12ka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_Years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11n3hgk12ka(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49978);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49979);Years test2 = Years.years(2);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49980);Years test3 = Years.years(3);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49981);Years result = test2.minus(test3);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49982);assertEquals(2, test2.getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49983);assertEquals(3, test3.getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49984);assertEquals(-1, result.getYears());
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49985);assertEquals(1, Years.ONE.minus(Years.ZERO).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49986);assertEquals(1, Years.ONE.minus((Years) null).getYears());
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49987);try {
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49988);Years.MIN_VALUE.minus(Years.ONE);
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49989);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    public void testMultipliedBy_int() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),49990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdp12km();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdp12km(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(49990);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49991);Years test = Years.years(2);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49992);assertEquals(6, test.multipliedBy(3).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49993);assertEquals(2, test.getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49994);assertEquals(-6, test.multipliedBy(-3).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49995);assertSame(test, test.multipliedBy(1));
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49996);Years halfMax = Years.years(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(49997);try {
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49998);halfMax.multipliedBy(2);
            __CLR4_4_112gm12gmlc8azwj1.R.inc(49999);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    public void testDividedBy_int() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),50000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qv12kw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qv12kw(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(50000);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50001);Years test = Years.years(12);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50002);assertEquals(6, test.dividedBy(2).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50003);assertEquals(12, test.getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50004);assertEquals(4, test.dividedBy(3).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50005);assertEquals(3, test.dividedBy(4).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50006);assertEquals(2, test.dividedBy(5).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50007);assertEquals(2, test.dividedBy(6).getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50008);assertSame(test, test.dividedBy(1));
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50009);try {
            __CLR4_4_112gm12gmlc8azwj1.R.inc(50010);Years.ONE.dividedBy(0);
            __CLR4_4_112gm12gmlc8azwj1.R.inc(50011);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    public void testNegated() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),50012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av330712l8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av330712l8(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(50012);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50013);Years test = Years.years(12);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50014);assertEquals(-12, test.negated().getYears());
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50015);assertEquals(12, test.getYears());
        
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50016);try {
            __CLR4_4_112gm12gmlc8azwj1.R.inc(50017);Years.MIN_VALUE.negated();
            __CLR4_4_112gm12gmlc8azwj1.R.inc(50018);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddToLocalDate() {__CLR4_4_112gm12gmlc8azwj1.R.globalSliceStart(getClass().getName(),50019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yu12lf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112gm12gmlc8azwj1.R.rethrow($CLV_t2$);}finally{__CLR4_4_112gm12gmlc8azwj1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yu12lf(){try{__CLR4_4_112gm12gmlc8azwj1.R.inc(50019);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50020);Years test = Years.years(3);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50021);LocalDate date = new LocalDate(2006, 6, 1);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50022);LocalDate expected = new LocalDate(2009, 6, 1);
        __CLR4_4_112gm12gmlc8azwj1.R.inc(50023);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_112gm12gmlc8azwj1.R.flushNeeded();}}

}
