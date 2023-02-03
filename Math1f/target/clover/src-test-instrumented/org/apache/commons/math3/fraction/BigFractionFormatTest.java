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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;

import org.apache.commons.math3.exception.MathParseException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BigFractionFormatTest {static class __CLR4_4_11mqd1mqdlb90pcm3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,76285,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    BigFractionFormat properFormat = null;
    BigFractionFormat improperFormat = null;

    protected Locale getLocale() {try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76117);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76118);return Locale.getDefault();
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Before
    public void setUp() {try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76119);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76120);properFormat = BigFractionFormat.getProperInstance(getLocale());
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76121);improperFormat = BigFractionFormat.getImproperInstance(getLocale());
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testFormat() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ezusw1mqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ezusw1mqi(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76122);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76123);BigFraction c = new BigFraction(1, 2);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76124);String expected = "1 / 2";

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76125);String actual = properFormat.format(c);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76126);Assert.assertEquals(expected, actual);

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76127);actual = improperFormat.format(c);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76128);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testFormatNegative() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y30ikb1mqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testFormatNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y30ikb1mqp(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76129);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76130);BigFraction c = new BigFraction(-1, 2);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76131);String expected = "-1 / 2";

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76132);String actual = properFormat.format(c);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76133);Assert.assertEquals(expected, actual);

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76134);actual = improperFormat.format(c);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76135);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testFormatZero() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14451m01mqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testFormatZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14451m01mqw(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76136);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76137);BigFraction c = new BigFraction(0, 1);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76138);String expected = "0 / 1";

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76139);String actual = properFormat.format(c);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76140);Assert.assertEquals(expected, actual);

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76141);actual = improperFormat.format(c);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76142);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testFormatImproper() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cv3zq41mr3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testFormatImproper",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cv3zq41mr3(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76143);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76144);BigFraction c = new BigFraction(5, 3);

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76145);String actual = properFormat.format(c);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76146);Assert.assertEquals("1 2 / 3", actual);

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76147);actual = improperFormat.format(c);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76148);Assert.assertEquals("5 / 3", actual);
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testFormatImproperNegative() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otkt211mr9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testFormatImproperNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otkt211mr9(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76149);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76150);BigFraction c = new BigFraction(-5, 3);

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76151);String actual = properFormat.format(c);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76152);Assert.assertEquals("-1 2 / 3", actual);

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76153);actual = improperFormat.format(c);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76154);Assert.assertEquals("-5 / 3", actual);
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testParse() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1se4tqw1mrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testParse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1se4tqw1mrf(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76155);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76156);String source = "1 / 2";

        {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76157);BigFraction c = properFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76158);Assert.assertNotNull(c);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76159);Assert.assertEquals(BigInteger.ONE, c.getNumerator());
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76160);Assert.assertEquals(BigInteger.valueOf(2l), c.getDenominator());

            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76161);c = improperFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76162);Assert.assertNotNull(c);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76163);Assert.assertEquals(BigInteger.ONE, c.getNumerator());
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76164);Assert.assertEquals(BigInteger.valueOf(2l), c.getDenominator());
        }
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testParseInteger() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bop9wk1mrp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testParseInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bop9wk1mrp(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76165);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76166);String source = "10";
        {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76167);BigFraction c = properFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76168);Assert.assertNotNull(c);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76169);Assert.assertEquals(BigInteger.TEN, c.getNumerator());
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76170);Assert.assertEquals(BigInteger.ONE, c.getDenominator());
        }
        {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76171);BigFraction c = improperFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76172);Assert.assertNotNull(c);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76173);Assert.assertEquals(BigInteger.TEN, c.getNumerator());
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76174);Assert.assertEquals(BigInteger.ONE, c.getDenominator());
        }
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testParseInvalid() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o10xp1mrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testParseInvalid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o10xp1mrz(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76175);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76176);String source = "a";
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76177);String msg = "should not be able to parse '10 / a'.";
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76178);try {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76179);properFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76180);Assert.fail(msg);
        } catch (MathParseException ex) {
            // success
        }
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76181);try {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76182);improperFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76183);Assert.fail(msg);
        } catch (MathParseException ex) {
            // success
        }
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testParseInvalidDenominator() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17i18rt1ms8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testParseInvalidDenominator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17i18rt1ms8(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76184);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76185);String source = "10 / a";
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76186);String msg = "should not be able to parse '10 / a'.";
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76187);try {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76188);properFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76189);Assert.fail(msg);
        } catch (MathParseException ex) {
            // success
        }
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76190);try {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76191);improperFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76192);Assert.fail(msg);
        } catch (MathParseException ex) {
            // success
        }
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testParseNegative() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15d9aeb1msh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testParseNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15d9aeb1msh(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76193);

        {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76194);String source = "-1 / 2";
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76195);BigFraction c = properFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76196);Assert.assertNotNull(c);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76197);Assert.assertEquals(-1, c.getNumeratorAsInt());
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76198);Assert.assertEquals(2, c.getDenominatorAsInt());

            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76199);c = improperFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76200);Assert.assertNotNull(c);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76201);Assert.assertEquals(-1, c.getNumeratorAsInt());
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76202);Assert.assertEquals(2, c.getDenominatorAsInt());

            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76203);source = "1 / -2";
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76204);c = properFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76205);Assert.assertNotNull(c);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76206);Assert.assertEquals(-1, c.getNumeratorAsInt());
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76207);Assert.assertEquals(2, c.getDenominatorAsInt());

            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76208);c = improperFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76209);Assert.assertNotNull(c);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76210);Assert.assertEquals(-1, c.getNumeratorAsInt());
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76211);Assert.assertEquals(2, c.getDenominatorAsInt());
        }
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testParseProper() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpllgo1mt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testParseProper",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpllgo1mt0(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76212);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76213);String source = "1 2 / 3";

        {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76214);BigFraction c = properFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76215);Assert.assertNotNull(c);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76216);Assert.assertEquals(5, c.getNumeratorAsInt());
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76217);Assert.assertEquals(3, c.getDenominatorAsInt());
        }

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76218);try {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76219);improperFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76220);Assert.fail("invalid improper fraction.");
        } catch (MathParseException ex) {
            // success
        }
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testParseProperNegative() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yro2q51mt9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testParseProperNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yro2q51mt9(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76221);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76222);String source = "-1 2 / 3";
        {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76223);BigFraction c = properFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76224);Assert.assertNotNull(c);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76225);Assert.assertEquals(-5, c.getNumeratorAsInt());
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76226);Assert.assertEquals(3, c.getDenominatorAsInt());
        }

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76227);try {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76228);improperFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76229);Assert.fail("invalid improper fraction.");
        } catch (MathParseException ex) {
            // success
        }
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testParseProperInvalidMinus() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jue9in1mti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testParseProperInvalidMinus",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jue9in1mti(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76230);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76231);String source = "2 -2 / 3";
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76232);try {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76233);properFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76234);Assert.fail("invalid minus in improper fraction.");
        } catch (MathParseException ex) {
            // expected
        }
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76235);source = "2 2 / -3";
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76236);try {
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76237);properFormat.parse(source);
            __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76238);Assert.fail("invalid minus in improper fraction.");
        } catch (MathParseException ex) {
            // expected
        }
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testParseBig() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tndye1mtr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testParseBig",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tndye1mtr(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76239);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76240);BigFraction f1 =
            improperFormat.parse("167213075789791382630275400487886041651764456874403" +
                                 " / " +
                                 "53225575123090058458126718248444563466137046489291");
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76241);Assert.assertEquals(FastMath.PI, f1.doubleValue(), 0.0);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76242);BigFraction f2 =
            properFormat.parse("3 " +
                               "7536350420521207255895245742552351253353317406530" +
                               " / " +
                               "53225575123090058458126718248444563466137046489291");
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76243);Assert.assertEquals(FastMath.PI, f2.doubleValue(), 0.0);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76244);Assert.assertEquals(f1, f2);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76245);BigDecimal pi =
            new BigDecimal("3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117068");
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76246);Assert.assertEquals(pi, f1.bigDecimalValue(99, BigDecimal.ROUND_HALF_EVEN));
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testNumeratorFormat() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1866yr91mtz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testNumeratorFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1866yr91mtz(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76247);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76248);NumberFormat old = properFormat.getNumeratorFormat();
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76249);NumberFormat nf = NumberFormat.getInstance();
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76250);nf.setParseIntegerOnly(true);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76251);properFormat.setNumeratorFormat(nf);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76252);Assert.assertEquals(nf, properFormat.getNumeratorFormat());
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76253);properFormat.setNumeratorFormat(old);

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76254);old = improperFormat.getNumeratorFormat();
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76255);nf = NumberFormat.getInstance();
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76256);nf.setParseIntegerOnly(true);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76257);improperFormat.setNumeratorFormat(nf);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76258);Assert.assertEquals(nf, improperFormat.getNumeratorFormat());
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76259);improperFormat.setNumeratorFormat(old);
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testDenominatorFormat() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhlfgu1muc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testDenominatorFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhlfgu1muc(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76260);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76261);NumberFormat old = properFormat.getDenominatorFormat();
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76262);NumberFormat nf = NumberFormat.getInstance();
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76263);nf.setParseIntegerOnly(true);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76264);properFormat.setDenominatorFormat(nf);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76265);Assert.assertEquals(nf, properFormat.getDenominatorFormat());
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76266);properFormat.setDenominatorFormat(old);

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76267);old = improperFormat.getDenominatorFormat();
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76268);nf = NumberFormat.getInstance();
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76269);nf.setParseIntegerOnly(true);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76270);improperFormat.setDenominatorFormat(nf);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76271);Assert.assertEquals(nf, improperFormat.getDenominatorFormat());
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76272);improperFormat.setDenominatorFormat(old);
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testWholeFormat() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12qyen11mup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testWholeFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12qyen11mup(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76273);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76274);ProperBigFractionFormat format = (ProperBigFractionFormat)properFormat;

        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76275);NumberFormat old = format.getWholeFormat();
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76276);NumberFormat nf = NumberFormat.getInstance();
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76277);nf.setParseIntegerOnly(true);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76278);format.setWholeFormat(nf);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76279);Assert.assertEquals(nf, format.getWholeFormat());
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76280);format.setWholeFormat(old);
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testLongFormat() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1566ooc1mux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testLongFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1566ooc1mux(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76281);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76282);Assert.assertEquals("10 / 1", improperFormat.format(10l));
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}

    @Test
    public void testDoubleFormat() {__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceStart(getClass().getName(),76283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1um0wdd1muz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mqd1mqdlb90pcm3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mqd1mqdlb90pcm3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionFormatTest.testDoubleFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1um0wdd1muz(){try{__CLR4_4_11mqd1mqdlb90pcm3.R.inc(76283);
        __CLR4_4_11mqd1mqdlb90pcm3.R.inc(76284);Assert.assertEquals("1 / 16", improperFormat.format(0.0625));
    }finally{__CLR4_4_11mqd1mqdlb90pcm3.R.flushNeeded();}}
}
