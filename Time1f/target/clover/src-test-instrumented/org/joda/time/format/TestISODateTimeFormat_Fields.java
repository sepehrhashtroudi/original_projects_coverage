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
package org.joda.time.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeFieldType;
import org.joda.time.Partial;

/**
 * This class is a Junit unit test for ISODateTimeFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormat_Fields extends TestCase {static class __CLR4_4_11ap41ap4lc8azxlh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,61243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60520);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60521);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60522);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60523);return new TestSuite(TestISODateTimeFormat_Fields.class);
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    public TestISODateTimeFormat_Fields(String name) {
        super(name);__CLR4_4_11ap41ap4lc8azxlh.R.inc(60525);try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60524);
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60526);
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60527);
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_null() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hfh6d91apc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hfh6d91apc(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60528);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60529);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(60530);ISODateTimeFormat.forFields((Collection) null, true, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(60531);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_empty() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15lq1xh1apg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_empty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15lq1xh1apg(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60532);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60533);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(60534);ISODateTimeFormat.forFields(new ArrayList(), true, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(60535);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    public void testForFields_calBased_YMD() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gm3ugk1apk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YMD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gm3ugk1apk(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60536);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60537);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60538);int[] values = new int[] {2005, 6, 25};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60539);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60540);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60541);assertEquals("2005-06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60542);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60543);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60544);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60545);assertEquals("2005-06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60546);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60547);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60548);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60549);assertEquals("20050625", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60550);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60551);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60552);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60553);assertEquals("20050625", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60554);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_calBased_YMD_unmodifiable() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aqfmn21aq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YMD_unmodifiable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aqfmn21aq3(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60555);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60556);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60557);int[] values = new int[] {2005, 6, 25};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60558);List types = Collections.unmodifiableList(new ArrayList(Arrays.asList(fields)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60559);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60560);assertEquals("2005-06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60561);assertEquals(3, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60562);types = Arrays.asList(fields);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60563);f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60564);assertEquals("2005-06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60565);assertEquals(3, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_calBased_YMD_duplicates() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gm6mtz1aqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YMD_duplicates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gm6mtz1aqe(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60566);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60567);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60568);DateTimeFieldType[] dupFields = new DateTimeFieldType[] {
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
                DateTimeFieldType.monthOfYear(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60569);int[] values = new int[] {2005, 6, 25};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60570);List types = new ArrayList(Arrays.asList(dupFields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60571);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60572);assertEquals("2005-06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60573);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60574);types = Arrays.asList(dupFields);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60575);f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60576);assertEquals("2005-06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60577);assertEquals(4, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_calBased_Y() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17t2mgb1aqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_Y",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17t2mgb1aqq(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60578);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60579);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.year(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60580);int[] values = new int[] {2005};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60581);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60582);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60583);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60584);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60585);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60586);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60587);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60588);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60589);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60590);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60591);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60592);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60593);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60594);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60595);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60596);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_calBased_M() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o81u151ar9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_M",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o81u151ar9(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60597);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60598);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.monthOfYear(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60599);int[] values = new int[] {6};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60600);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60601);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60602);assertEquals("--06", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60603);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60604);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60605);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60606);assertEquals("--06", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60607);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60608);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60609);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60610);assertEquals("--06", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60611);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60612);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60613);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60614);assertEquals("--06", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60615);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_calBased_D() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150xv341ars();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_D",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150xv341ars(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60616);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60617);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60618);int[] values = new int[] {25};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60619);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60620);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60621);assertEquals("---25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60622);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60623);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60624);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60625);assertEquals("---25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60626);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60627);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60628);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60629);assertEquals("---25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60630);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60631);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60632);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60633);assertEquals("---25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60634);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_calBased_YM() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uke3vq1asb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uke3vq1asb(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60635);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60636);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60637);int[] values = new int[] {2005, 6};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60638);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60639);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60640);assertEquals("2005-06", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60641);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60642);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60643);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60644);assertEquals("2005-06", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60645);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60646);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60647);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60648);assertEquals("2005-06", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60649);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60650);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60651);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60652);assertEquals("2005-06", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60653);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_calBased_MD() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15c5vb1asu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_MD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15c5vb1asu(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60654);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60655);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60656);int[] values = new int[] {6, 25};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60657);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60658);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60659);assertEquals("--06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60660);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60661);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60662);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60663);assertEquals("--06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60664);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60665);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60666);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60667);assertEquals("--0625", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60668);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60669);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60670);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60671);assertEquals("--0625", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60672);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_calBased_YD() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11beerh1atd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11beerh1atd(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60673);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60674);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.year(),
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60675);int[] values = new int[] {2005, 25};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60676);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60677);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60678);assertEquals("2005--25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60679);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60680);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60681);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60682);assertEquals("2005--25", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60683);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60684);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60685);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(60686);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(60687);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60688);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60689);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(60690);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(60691);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    public void testForFields_weekBased_YWD() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzbuse1atw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YWD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzbuse1atw(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60692);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60693);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.weekyear(),
                DateTimeFieldType.weekOfWeekyear(),
                DateTimeFieldType.dayOfWeek(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60694);int[] values = new int[] {2005, 8, 5};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60695);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60696);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60697);assertEquals("2005-W08-5", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60698);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60699);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60700);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60701);assertEquals("2005-W08-5", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60702);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60703);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60704);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60705);assertEquals("2005W085", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60706);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60707);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60708);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60709);assertEquals("2005W085", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60710);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_weekBased_Y() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bpbwgf1auf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_Y",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bpbwgf1auf(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60711);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60712);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.weekyear(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60713);int[] values = new int[] {2005};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60714);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60715);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60716);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60717);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60718);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60719);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60720);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60721);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60722);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60723);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60724);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60725);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60726);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60727);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60728);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60729);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_weekBased_W() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7bu1d1auy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_W",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7bu1d1auy(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60730);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60731);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.weekOfWeekyear(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60732);int[] values = new int[] {8};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60733);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60734);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60735);assertEquals("-W08", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60736);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60737);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60738);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60739);assertEquals("-W08", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60740);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60741);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60742);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60743);assertEquals("-W08", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60744);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60745);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60746);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60747);assertEquals("-W08", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60748);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_weekBased_D() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18x75381avh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_D",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18x75381avh(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60749);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60750);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.dayOfWeek(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60751);int[] values = new int[] {5};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60752);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60753);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60754);assertEquals("-W-5", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60755);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60756);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60757);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60758);assertEquals("-W-5", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60759);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60760);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60761);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60762);assertEquals("-W-5", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60763);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60764);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60765);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60766);assertEquals("-W-5", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60767);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_weekBased_YW() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbi7o41aw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YW",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbi7o41aw0(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60768);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60769);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.weekyear(),
                DateTimeFieldType.weekOfWeekyear(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60770);int[] values = new int[] {2005, 8};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60771);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60772);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60773);assertEquals("2005-W08", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60774);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60775);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60776);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60777);assertEquals("2005-W08", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60778);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60779);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60780);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60781);assertEquals("2005W08", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60782);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60783);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60784);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60785);assertEquals("2005W08", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60786);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_weekBased_WD() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y715ib1awj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_WD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y715ib1awj(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60787);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60788);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.weekOfWeekyear(),
                DateTimeFieldType.dayOfWeek(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60789);int[] values = new int[] {8, 5};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60790);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60791);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60792);assertEquals("-W08-5", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60793);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60794);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60795);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60796);assertEquals("-W08-5", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60797);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60798);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60799);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60800);assertEquals("-W085", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60801);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60802);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60803);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60804);assertEquals("-W085", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60805);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_weekBased_YD() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mlmwm91ax2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mlmwm91ax2(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60806);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60807);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.weekyear(),
                DateTimeFieldType.dayOfWeek(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60808);int[] values = new int[] {2005, 5};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60809);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60810);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60811);assertEquals("2005-W-5", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60812);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60813);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60814);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60815);assertEquals("2005W-5", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60816);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60817);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60818);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(60819);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(60820);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60821);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60822);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(60823);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(60824);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    public void testForFields_ordinalBased_YD() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfpa801axl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_YD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfpa801axl(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60825);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60826);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.year(),
                DateTimeFieldType.dayOfYear(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60827);int[] values = new int[] {2005, 177};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60828);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60829);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60830);assertEquals("2005-177", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60831);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60832);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60833);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60834);assertEquals("2005-177", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60835);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60836);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60837);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60838);assertEquals("2005177", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60839);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60840);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60841);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60842);assertEquals("2005177", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60843);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_ordinalBased_Y() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11w5u1a1ay4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_Y",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11w5u1a1ay4(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60844);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60845);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.year(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60846);int[] values = new int[] {2005};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60847);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60848);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60849);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60850);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60851);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60852);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60853);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60854);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60855);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60856);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60857);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60858);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60859);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60860);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60861);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60862);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_ordinalBased_D() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vyxbx1ayn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_D",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vyxbx1ayn(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60863);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60864);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.dayOfYear(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60865);int[] values = new int[] {177};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60866);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60867);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60868);assertEquals("-177", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60869);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60870);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60871);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60872);assertEquals("-177", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60873);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60874);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60875);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60876);assertEquals("-177", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60877);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60878);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60879);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60880);assertEquals("-177", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60881);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    public void testForFields_time_HMSm() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kt6suv1az6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HMSm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kt6suv1az6(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60882);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60883);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.secondOfMinute(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60884);int[] values = new int[] {10, 20, 30, 40};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60885);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60886);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60887);assertEquals("10:20:30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60888);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60889);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60890);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60891);assertEquals("10:20:30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60892);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60893);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60894);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60895);assertEquals("102030.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60896);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60897);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60898);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60899);assertEquals("102030.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60900);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_HMS() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3zwry1azp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HMS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3zwry1azp(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60901);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60902);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.secondOfMinute(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60903);int[] values = new int[] {10, 20, 30};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60904);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60905);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60906);assertEquals("10:20:30", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60907);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60908);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60909);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60910);assertEquals("10:20:30", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60911);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60912);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60913);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60914);assertEquals("102030", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60915);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60916);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60917);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60918);assertEquals("102030", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60919);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_HM() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18f4y0f1b08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18f4y0f1b08(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60920);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60921);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.minuteOfHour(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60922);int[] values = new int[] {10, 20};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60923);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60924);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60925);assertEquals("10:20", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60926);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60927);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60928);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60929);assertEquals("10:20", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60930);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60931);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60932);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60933);assertEquals("1020", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60934);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60935);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60936);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60937);assertEquals("1020", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60938);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_H() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9pro41b0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_H",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9pro41b0r(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60939);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60940);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.hourOfDay(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60941);int[] values = new int[] {10};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60942);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60943);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60944);assertEquals("10", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60945);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60946);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60947);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60948);assertEquals("10", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60949);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60950);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60951);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60952);assertEquals("10", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60953);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60954);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60955);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60956);assertEquals("10", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60957);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_MSm() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxj0sr1b1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_MSm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxj0sr1b1a(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60958);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60959);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.secondOfMinute(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60960);int[] values = new int[] {20, 30, 40};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60961);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60962);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60963);assertEquals("-20:30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60964);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60965);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60966);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60967);assertEquals("-20:30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60968);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60969);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60970);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60971);assertEquals("-2030.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60972);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60973);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60974);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60975);assertEquals("-2030.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60976);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_MS() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yg75io1b1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_MS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yg75io1b1t(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60977);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60978);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.secondOfMinute(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60979);int[] values = new int[] {20, 30};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60980);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60981);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60982);assertEquals("-20:30", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60983);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60984);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60985);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60986);assertEquals("-20:30", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60987);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60988);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60989);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60990);assertEquals("-2030", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60991);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60992);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60993);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60994);assertEquals("-2030", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60995);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_M() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),60996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160pxpr1b2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_M",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160pxpr1b2c(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(60996);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60997);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.minuteOfHour(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60998);int[] values = new int[] {20};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(60999);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61000);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61001);assertEquals("-20", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61002);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61003);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61004);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61005);assertEquals("-20", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61006);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61007);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61008);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61009);assertEquals("-20", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61010);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61011);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61012);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61013);assertEquals("-20", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61014);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_Sm() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),61015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d4vhfo1b2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_Sm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d4vhfo1b2v(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(61015);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61016);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.secondOfMinute(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61017);int[] values = new int[] {30, 40};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61018);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61019);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61020);assertEquals("--30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61021);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61022);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61023);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61024);assertEquals("--30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61025);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61026);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61027);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61028);assertEquals("--30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61029);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61030);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61031);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61032);assertEquals("--30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61033);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_S() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),61034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dh9v131b3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_S",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dh9v131b3e(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(61034);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61035);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.secondOfMinute(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61036);int[] values = new int[] {30};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61037);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61038);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61039);assertEquals("--30", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61040);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61041);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61042);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61043);assertEquals("--30", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61044);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61045);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61046);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61047);assertEquals("--30", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61048);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61049);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61050);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61051);assertEquals("--30", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61052);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_m() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),61053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qy4xm91b3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_m",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qy4xm91b3x(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(61053);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61054);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61055);int[] values = new int[] {40};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61056);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61057);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61058);assertEquals("---.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61059);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61060);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61061);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61062);assertEquals("---.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61063);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61064);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61065);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61066);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61067);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61068);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61069);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61070);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61071);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_Hm() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),61072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tn48mp1b4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_Hm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tn48mp1b4g(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(61072);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61073);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61074);int[] values = new int[] {10, 40};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61075);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61076);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61077);assertEquals("10--.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61078);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61079);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61080);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61081);assertEquals("10--.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61082);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61083);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61084);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61085);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61086);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61087);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61088);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61089);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61090);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_HS() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),61091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rx4qr91b4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rx4qr91b4z(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(61091);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61092);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.secondOfMinute(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61093);int[] values = new int[] {10, 30};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61094);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61095);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61096);assertEquals("10-30", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61097);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61098);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61099);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61100);assertEquals("10-30", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61101);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61102);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61103);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61104);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61105);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61106);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61107);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61108);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61109);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_Mm() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),61110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n41tva1b5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_Mm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n41tva1b5i(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(61110);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61111);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61112);int[] values = new int[] {20, 40};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61113);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61114);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61115);assertEquals("-20-.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61116);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61117);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61118);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61119);assertEquals("-20-.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61120);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61121);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61122);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61123);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61124);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61125);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61126);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61127);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61128);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_HSm() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),61129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ylsh461b61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HSm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ylsh461b61(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(61129);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61130);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.secondOfMinute(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61131);int[] values = new int[] {10, 30, 40};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61132);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61133);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61134);assertEquals("10-30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61135);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61136);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61137);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61138);assertEquals("10-30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61139);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61140);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61141);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61142);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61143);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61144);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61145);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61146);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61147);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_time_HMm() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),61148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11n4u6s1b6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HMm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11n4u6s1b6k(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(61148);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61149);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61150);int[] values = new int[] {10, 20, 40};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61151);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61152);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61153);assertEquals("10:20-.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61154);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61155);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61156);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61157);assertEquals("1020-.040", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61158);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61159);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61160);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61161);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61162);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61163);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61164);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61165);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61166);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    public void testForFields_datetime_YMDH() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),61167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqxte41b73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_YMDH",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqxte41b73(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(61167);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61168);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
                DateTimeFieldType.hourOfDay(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61169);int[] values = new int[] {2005, 6, 25, 12};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61170);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61171);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61172);assertEquals("2005-06-25T12", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61173);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61174);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61175);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61176);assertEquals("2005-06-25T12", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61177);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61178);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61179);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61180);assertEquals("20050625T12", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61181);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61182);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61183);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61184);assertEquals("20050625T12", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61185);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_datetime_DH() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),61186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18e41wg1b7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_DH",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18e41wg1b7m(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(61186);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61187);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.dayOfMonth(),
                DateTimeFieldType.hourOfDay(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61188);int[] values = new int[] {25, 12};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61189);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61190);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61191);assertEquals("---25T12", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61192);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61193);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61194);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61195);assertEquals("---25T12", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61196);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61197);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61198);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61199);assertEquals("---25T12", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61200);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61201);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61202);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61203);assertEquals("---25T12", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61204);assertEquals(0, types.size());
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_datetime_YH() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),61205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16svghh1b85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_YH",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16svghh1b85(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(61205);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61206);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.year(),
                DateTimeFieldType.hourOfDay(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61207);int[] values = new int[] {2005, 12};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61208);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61209);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61210);assertEquals("2005T12", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61211);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61212);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61213);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61214);assertEquals("2005T12", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61215);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61216);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61217);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61218);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61219);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61220);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61221);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61222);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61223);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields_datetime_DM() {__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceStart(getClass().getName(),61224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1on3vut1b8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ap41ap4lc8azxlh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ap41ap4lc8azxlh.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_DM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1on3vut1b8o(){try{__CLR4_4_11ap41ap4lc8azxlh.R.inc(61224);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61225);DateTimeFieldType[] fields = new DateTimeFieldType[] {
                DateTimeFieldType.dayOfMonth(),
                DateTimeFieldType.minuteOfHour(),
        };
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61226);int[] values = new int[] {25, 20};
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61227);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61228);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61229);assertEquals("---25T-20", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61230);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61231);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61232);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61233);assertEquals("---25T-20", f.print(new Partial(fields, values)));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61234);assertEquals(0, types.size());
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61235);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61236);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61237);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61238);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61239);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11ap41ap4lc8azxlh.R.inc(61240);try {
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61241);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11ap41ap4lc8azxlh.R.inc(61242);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_11ap41ap4lc8azxlh.R.flushNeeded();}}

}
