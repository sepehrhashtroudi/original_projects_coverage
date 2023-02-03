/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.math3.fraction;

import java.text.NumberFormat;
import java.util.Locale;

import org.apache.commons.math3.exception.MathParseException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FractionFormatTest {static class __CLR4_4_11n671n67lb90pcn2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,76874,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    FractionFormat properFormat = null;
    FractionFormat improperFormat = null;

    protected Locale getLocale() {try{__CLR4_4_11n671n67lb90pcn2.R.inc(76687);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76688);return Locale.getDefault();
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Before
    public void setUp() {try{__CLR4_4_11n671n67lb90pcn2.R.inc(76689);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76690);properFormat = FractionFormat.getProperInstance(getLocale());
        __CLR4_4_11n671n67lb90pcn2.R.inc(76691);improperFormat = FractionFormat.getImproperInstance(getLocale());
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testFormat() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ezusw1n6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ezusw1n6c(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76692);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76693);Fraction c = new Fraction(1, 2);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76694);String expected = "1 / 2";

        __CLR4_4_11n671n67lb90pcn2.R.inc(76695);String actual = properFormat.format(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76696);Assert.assertEquals(expected, actual);

        __CLR4_4_11n671n67lb90pcn2.R.inc(76697);actual = improperFormat.format(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76698);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testFormatNegative() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y30ikb1n6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testFormatNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y30ikb1n6j(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76699);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76700);Fraction c = new Fraction(-1, 2);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76701);String expected = "-1 / 2";

        __CLR4_4_11n671n67lb90pcn2.R.inc(76702);String actual = properFormat.format(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76703);Assert.assertEquals(expected, actual);

        __CLR4_4_11n671n67lb90pcn2.R.inc(76704);actual = improperFormat.format(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76705);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testFormatZero() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14451m01n6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testFormatZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14451m01n6q(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76706);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76707);Fraction c = new Fraction(0, 1);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76708);String expected = "0 / 1";

        __CLR4_4_11n671n67lb90pcn2.R.inc(76709);String actual = properFormat.format(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76710);Assert.assertEquals(expected, actual);

        __CLR4_4_11n671n67lb90pcn2.R.inc(76711);actual = improperFormat.format(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76712);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testFormatImproper() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cv3zq41n6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testFormatImproper",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cv3zq41n6x(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76713);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76714);Fraction c = new Fraction(5, 3);

        __CLR4_4_11n671n67lb90pcn2.R.inc(76715);String actual = properFormat.format(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76716);Assert.assertEquals("1 2 / 3", actual);

        __CLR4_4_11n671n67lb90pcn2.R.inc(76717);actual = improperFormat.format(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76718);Assert.assertEquals("5 / 3", actual);
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testFormatImproperNegative() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otkt211n73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testFormatImproperNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otkt211n73(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76719);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76720);Fraction c = new Fraction(-5, 3);

        __CLR4_4_11n671n67lb90pcn2.R.inc(76721);String actual = properFormat.format(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76722);Assert.assertEquals("-1 2 / 3", actual);

        __CLR4_4_11n671n67lb90pcn2.R.inc(76723);actual = improperFormat.format(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76724);Assert.assertEquals("-5 / 3", actual);
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testParse() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1se4tqw1n79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testParse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1se4tqw1n79(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76725);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76726);String source = "1 / 2";

        __CLR4_4_11n671n67lb90pcn2.R.inc(76727);try {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76728);Fraction c = properFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76729);Assert.assertNotNull(c);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76730);Assert.assertEquals(1, c.getNumerator());
            __CLR4_4_11n671n67lb90pcn2.R.inc(76731);Assert.assertEquals(2, c.getDenominator());

            __CLR4_4_11n671n67lb90pcn2.R.inc(76732);c = improperFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76733);Assert.assertNotNull(c);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76734);Assert.assertEquals(1, c.getNumerator());
            __CLR4_4_11n671n67lb90pcn2.R.inc(76735);Assert.assertEquals(2, c.getDenominator());
        } catch (MathParseException ex) {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76736);Assert.fail(ex.getMessage());
        }
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testParseInteger() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bop9wk1n7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testParseInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bop9wk1n7l(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76737);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76738);String source = "10";
        {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76739);Fraction c = properFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76740);Assert.assertNotNull(c);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76741);Assert.assertEquals(10, c.getNumerator());
            __CLR4_4_11n671n67lb90pcn2.R.inc(76742);Assert.assertEquals(1, c.getDenominator());
        }
        {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76743);Fraction c = improperFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76744);Assert.assertNotNull(c);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76745);Assert.assertEquals(10, c.getNumerator());
            __CLR4_4_11n671n67lb90pcn2.R.inc(76746);Assert.assertEquals(1, c.getDenominator());
        }
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testParseOne1() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m0pp711n7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testParseOne1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m0pp711n7v(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76747);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76748);String source = "1 / 1";
        __CLR4_4_11n671n67lb90pcn2.R.inc(76749);Fraction c = properFormat.parse(source);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76750);Assert.assertNotNull(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76751);Assert.assertEquals(1, c.getNumerator());
        __CLR4_4_11n671n67lb90pcn2.R.inc(76752);Assert.assertEquals(1, c.getDenominator());
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testParseOne2() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1irpqek1n81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testParseOne2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1irpqek1n81(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76753);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76754);String source = "10 / 10";
        __CLR4_4_11n671n67lb90pcn2.R.inc(76755);Fraction c = properFormat.parse(source);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76756);Assert.assertNotNull(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76757);Assert.assertEquals(1, c.getNumerator());
        __CLR4_4_11n671n67lb90pcn2.R.inc(76758);Assert.assertEquals(1, c.getDenominator());
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testParseZero1() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1chcjkf1n87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testParseZero1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1chcjkf1n87(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76759);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76760);String source = "0 / 1";
        __CLR4_4_11n671n67lb90pcn2.R.inc(76761);Fraction c = properFormat.parse(source);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76762);Assert.assertNotNull(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76763);Assert.assertEquals(0, c.getNumerator());
        __CLR4_4_11n671n67lb90pcn2.R.inc(76764);Assert.assertEquals(1, c.getDenominator());
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testParseZero2() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqcicw1n8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testParseZero2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqcicw1n8d(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76765);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76766);String source = "-0 / 1";
        __CLR4_4_11n671n67lb90pcn2.R.inc(76767);Fraction c = properFormat.parse(source);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76768);Assert.assertNotNull(c);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76769);Assert.assertEquals(0, c.getNumerator());
        __CLR4_4_11n671n67lb90pcn2.R.inc(76770);Assert.assertEquals(1, c.getDenominator());
        // This test shows that the sign is not preserved.
        __CLR4_4_11n671n67lb90pcn2.R.inc(76771);Assert.assertEquals(Double.POSITIVE_INFINITY, 1d / c.doubleValue(), 0);
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testParseInvalid() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o10xp1n8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testParseInvalid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o10xp1n8k(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76772);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76773);String source = "a";
        __CLR4_4_11n671n67lb90pcn2.R.inc(76774);String msg = "should not be able to parse '10 / a'.";
        __CLR4_4_11n671n67lb90pcn2.R.inc(76775);try {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76776);properFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76777);Assert.fail(msg);
        } catch (MathParseException ex) {
            // success
        }
        __CLR4_4_11n671n67lb90pcn2.R.inc(76778);try {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76779);improperFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76780);Assert.fail(msg);
        } catch (MathParseException ex) {
            // success
        }
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testParseInvalidDenominator() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17i18rt1n8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testParseInvalidDenominator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17i18rt1n8t(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76781);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76782);String source = "10 / a";
        __CLR4_4_11n671n67lb90pcn2.R.inc(76783);String msg = "should not be able to parse '10 / a'.";
        __CLR4_4_11n671n67lb90pcn2.R.inc(76784);try {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76785);properFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76786);Assert.fail(msg);
        } catch (MathParseException ex) {
            // success
        }
        __CLR4_4_11n671n67lb90pcn2.R.inc(76787);try {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76788);improperFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76789);Assert.fail(msg);
        } catch (MathParseException ex) {
            // success
        }
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testParseNegative() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15d9aeb1n92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testParseNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15d9aeb1n92(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76790);

        {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76791);String source = "-1 / 2";
            __CLR4_4_11n671n67lb90pcn2.R.inc(76792);Fraction c = properFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76793);Assert.assertNotNull(c);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76794);Assert.assertEquals(-1, c.getNumerator());
            __CLR4_4_11n671n67lb90pcn2.R.inc(76795);Assert.assertEquals(2, c.getDenominator());

            __CLR4_4_11n671n67lb90pcn2.R.inc(76796);c = improperFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76797);Assert.assertNotNull(c);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76798);Assert.assertEquals(-1, c.getNumerator());
            __CLR4_4_11n671n67lb90pcn2.R.inc(76799);Assert.assertEquals(2, c.getDenominator());

            __CLR4_4_11n671n67lb90pcn2.R.inc(76800);source = "1 / -2";
            __CLR4_4_11n671n67lb90pcn2.R.inc(76801);c = properFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76802);Assert.assertNotNull(c);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76803);Assert.assertEquals(-1, c.getNumerator());
            __CLR4_4_11n671n67lb90pcn2.R.inc(76804);Assert.assertEquals(2, c.getDenominator());

            __CLR4_4_11n671n67lb90pcn2.R.inc(76805);c = improperFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76806);Assert.assertNotNull(c);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76807);Assert.assertEquals(-1, c.getNumerator());
            __CLR4_4_11n671n67lb90pcn2.R.inc(76808);Assert.assertEquals(2, c.getDenominator());
        }
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testParseProper() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpllgo1n9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testParseProper",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpllgo1n9l(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76809);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76810);String source = "1 2 / 3";

        {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76811);Fraction c = properFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76812);Assert.assertNotNull(c);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76813);Assert.assertEquals(5, c.getNumerator());
            __CLR4_4_11n671n67lb90pcn2.R.inc(76814);Assert.assertEquals(3, c.getDenominator());
        }

        __CLR4_4_11n671n67lb90pcn2.R.inc(76815);try {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76816);improperFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76817);Assert.fail("invalid improper fraction.");
        } catch (MathParseException ex) {
            // success
        }
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testParseProperNegative() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yro2q51n9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testParseProperNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yro2q51n9u(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76818);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76819);String source = "-1 2 / 3";
        {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76820);Fraction c = properFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76821);Assert.assertNotNull(c);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76822);Assert.assertEquals(-5, c.getNumerator());
            __CLR4_4_11n671n67lb90pcn2.R.inc(76823);Assert.assertEquals(3, c.getDenominator());
        }

        __CLR4_4_11n671n67lb90pcn2.R.inc(76824);try {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76825);improperFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76826);Assert.fail("invalid improper fraction.");
        } catch (MathParseException ex) {
            // success
        }
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testParseProperInvalidMinus() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jue9in1na3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testParseProperInvalidMinus",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jue9in1na3(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76827);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76828);String source = "2 -2 / 3";
        __CLR4_4_11n671n67lb90pcn2.R.inc(76829);try {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76830);properFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76831);Assert.fail("invalid minus in improper fraction.");
        } catch (MathParseException ex) {
            // expected
        }
        __CLR4_4_11n671n67lb90pcn2.R.inc(76832);source = "2 2 / -3";
        __CLR4_4_11n671n67lb90pcn2.R.inc(76833);try {
            __CLR4_4_11n671n67lb90pcn2.R.inc(76834);properFormat.parse(source);
            __CLR4_4_11n671n67lb90pcn2.R.inc(76835);Assert.fail("invalid minus in improper fraction.");
        } catch (MathParseException ex) {
            // expected
        }
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testNumeratorFormat() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1866yr91nac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testNumeratorFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1866yr91nac(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76836);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76837);NumberFormat old = properFormat.getNumeratorFormat();
        __CLR4_4_11n671n67lb90pcn2.R.inc(76838);NumberFormat nf = NumberFormat.getInstance();
        __CLR4_4_11n671n67lb90pcn2.R.inc(76839);nf.setParseIntegerOnly(true);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76840);properFormat.setNumeratorFormat(nf);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76841);Assert.assertEquals(nf, properFormat.getNumeratorFormat());
        __CLR4_4_11n671n67lb90pcn2.R.inc(76842);properFormat.setNumeratorFormat(old);

        __CLR4_4_11n671n67lb90pcn2.R.inc(76843);old = improperFormat.getNumeratorFormat();
        __CLR4_4_11n671n67lb90pcn2.R.inc(76844);nf = NumberFormat.getInstance();
        __CLR4_4_11n671n67lb90pcn2.R.inc(76845);nf.setParseIntegerOnly(true);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76846);improperFormat.setNumeratorFormat(nf);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76847);Assert.assertEquals(nf, improperFormat.getNumeratorFormat());
        __CLR4_4_11n671n67lb90pcn2.R.inc(76848);improperFormat.setNumeratorFormat(old);
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testDenominatorFormat() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhlfgu1nap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testDenominatorFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhlfgu1nap(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76849);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76850);NumberFormat old = properFormat.getDenominatorFormat();
        __CLR4_4_11n671n67lb90pcn2.R.inc(76851);NumberFormat nf = NumberFormat.getInstance();
        __CLR4_4_11n671n67lb90pcn2.R.inc(76852);nf.setParseIntegerOnly(true);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76853);properFormat.setDenominatorFormat(nf);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76854);Assert.assertEquals(nf, properFormat.getDenominatorFormat());
        __CLR4_4_11n671n67lb90pcn2.R.inc(76855);properFormat.setDenominatorFormat(old);

        __CLR4_4_11n671n67lb90pcn2.R.inc(76856);old = improperFormat.getDenominatorFormat();
        __CLR4_4_11n671n67lb90pcn2.R.inc(76857);nf = NumberFormat.getInstance();
        __CLR4_4_11n671n67lb90pcn2.R.inc(76858);nf.setParseIntegerOnly(true);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76859);improperFormat.setDenominatorFormat(nf);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76860);Assert.assertEquals(nf, improperFormat.getDenominatorFormat());
        __CLR4_4_11n671n67lb90pcn2.R.inc(76861);improperFormat.setDenominatorFormat(old);
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testWholeFormat() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12qyen11nb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testWholeFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12qyen11nb2(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76862);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76863);ProperFractionFormat format = (ProperFractionFormat)properFormat;

        __CLR4_4_11n671n67lb90pcn2.R.inc(76864);NumberFormat old = format.getWholeFormat();
        __CLR4_4_11n671n67lb90pcn2.R.inc(76865);NumberFormat nf = NumberFormat.getInstance();
        __CLR4_4_11n671n67lb90pcn2.R.inc(76866);nf.setParseIntegerOnly(true);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76867);format.setWholeFormat(nf);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76868);Assert.assertEquals(nf, format.getWholeFormat());
        __CLR4_4_11n671n67lb90pcn2.R.inc(76869);format.setWholeFormat(old);
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testLongFormat() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1566ooc1nba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testLongFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1566ooc1nba(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76870);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76871);Assert.assertEquals("10 / 1", improperFormat.format(10l));
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}

    @Test
    public void testDoubleFormat() {__CLR4_4_11n671n67lb90pcn2.R.globalSliceStart(getClass().getName(),76872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1um0wdd1nbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11n671n67lb90pcn2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11n671n67lb90pcn2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionFormatTest.testDoubleFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1um0wdd1nbc(){try{__CLR4_4_11n671n67lb90pcn2.R.inc(76872);
        __CLR4_4_11n671n67lb90pcn2.R.inc(76873);Assert.assertEquals("355 / 113", improperFormat.format(FastMath.PI));
    }finally{__CLR4_4_11n671n67lb90pcn2.R.flushNeeded();}}
}
