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

import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;


/**
 * @version $Id$
 */
public class FractionTest {static class __CLR4_4_11nbe1nbelb90pcnm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,77266,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private void assertFraction(int expectedNumerator, int expectedDenominator, Fraction actual) {try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76874);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76875);Assert.assertEquals(expectedNumerator, actual.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76876);Assert.assertEquals(expectedDenominator, actual.getDenominator());
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testConstructor() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),76877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h1nbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h1nbh(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76877);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76878);assertFraction(0, 1, new Fraction(0, 1));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76879);assertFraction(0, 1, new Fraction(0, 2));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76880);assertFraction(0, 1, new Fraction(0, -1));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76881);assertFraction(1, 2, new Fraction(1, 2));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76882);assertFraction(1, 2, new Fraction(2, 4));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76883);assertFraction(-1, 2, new Fraction(-1, 2));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76884);assertFraction(-1, 2, new Fraction(1, -2));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76885);assertFraction(-1, 2, new Fraction(-2, 4));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76886);assertFraction(-1, 2, new Fraction(2, -4));

        // overflow
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76887);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(76888);new Fraction(Integer.MIN_VALUE, -1);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(76889);Assert.fail();
        } catch (MathArithmeticException ex) {
            // success
        }
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76890);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(76891);new Fraction(1, Integer.MIN_VALUE);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(76892);Assert.fail();
        } catch (MathArithmeticException ex) {
            // success
        }

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76893);assertFraction(0, 1, new Fraction(0.00000000000001));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76894);assertFraction(2, 5, new Fraction(0.40000000000001));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76895);assertFraction(15, 1, new Fraction(15.0000000000001));
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test(expected=ConvergenceException.class)
    public void testGoldenRatio() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),76896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14uewq11nc0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,111,108,100,101,110,82,97,116,105,111,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testGoldenRatio",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14uewq11nc0(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76896);
        // the golden ratio is notoriously a difficult number for continuous fraction
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76897);new Fraction((1 + FastMath.sqrt(5)) / 2, 1.0e-12, 25);
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    // MATH-179
    @Test
    public void testDoubleConstructor() throws ConvergenceException  {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),76898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m2qfz21nc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testDoubleConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m2qfz21nc2() throws ConvergenceException{try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76898);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76899);assertFraction(1, 2, new Fraction((double)1 / (double)2));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76900);assertFraction(1, 3, new Fraction((double)1 / (double)3));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76901);assertFraction(2, 3, new Fraction((double)2 / (double)3));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76902);assertFraction(1, 4, new Fraction((double)1 / (double)4));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76903);assertFraction(3, 4, new Fraction((double)3 / (double)4));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76904);assertFraction(1, 5, new Fraction((double)1 / (double)5));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76905);assertFraction(2, 5, new Fraction((double)2 / (double)5));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76906);assertFraction(3, 5, new Fraction((double)3 / (double)5));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76907);assertFraction(4, 5, new Fraction((double)4 / (double)5));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76908);assertFraction(1, 6, new Fraction((double)1 / (double)6));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76909);assertFraction(5, 6, new Fraction((double)5 / (double)6));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76910);assertFraction(1, 7, new Fraction((double)1 / (double)7));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76911);assertFraction(2, 7, new Fraction((double)2 / (double)7));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76912);assertFraction(3, 7, new Fraction((double)3 / (double)7));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76913);assertFraction(4, 7, new Fraction((double)4 / (double)7));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76914);assertFraction(5, 7, new Fraction((double)5 / (double)7));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76915);assertFraction(6, 7, new Fraction((double)6 / (double)7));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76916);assertFraction(1, 8, new Fraction((double)1 / (double)8));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76917);assertFraction(3, 8, new Fraction((double)3 / (double)8));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76918);assertFraction(5, 8, new Fraction((double)5 / (double)8));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76919);assertFraction(7, 8, new Fraction((double)7 / (double)8));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76920);assertFraction(1, 9, new Fraction((double)1 / (double)9));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76921);assertFraction(2, 9, new Fraction((double)2 / (double)9));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76922);assertFraction(4, 9, new Fraction((double)4 / (double)9));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76923);assertFraction(5, 9, new Fraction((double)5 / (double)9));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76924);assertFraction(7, 9, new Fraction((double)7 / (double)9));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76925);assertFraction(8, 9, new Fraction((double)8 / (double)9));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76926);assertFraction(1, 10, new Fraction((double)1 / (double)10));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76927);assertFraction(3, 10, new Fraction((double)3 / (double)10));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76928);assertFraction(7, 10, new Fraction((double)7 / (double)10));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76929);assertFraction(9, 10, new Fraction((double)9 / (double)10));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76930);assertFraction(1, 11, new Fraction((double)1 / (double)11));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76931);assertFraction(2, 11, new Fraction((double)2 / (double)11));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76932);assertFraction(3, 11, new Fraction((double)3 / (double)11));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76933);assertFraction(4, 11, new Fraction((double)4 / (double)11));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76934);assertFraction(5, 11, new Fraction((double)5 / (double)11));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76935);assertFraction(6, 11, new Fraction((double)6 / (double)11));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76936);assertFraction(7, 11, new Fraction((double)7 / (double)11));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76937);assertFraction(8, 11, new Fraction((double)8 / (double)11));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76938);assertFraction(9, 11, new Fraction((double)9 / (double)11));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76939);assertFraction(10, 11, new Fraction((double)10 / (double)11));
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    // MATH-181
    @Test
    public void testDigitLimitConstructor() throws ConvergenceException  {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),76940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iy40671nd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testDigitLimitConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iy40671nd8() throws ConvergenceException{try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76940);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76941);assertFraction(2, 5, new Fraction(0.4,   9));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76942);assertFraction(2, 5, new Fraction(0.4,  99));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76943);assertFraction(2, 5, new Fraction(0.4, 999));

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76944);assertFraction(3, 5,      new Fraction(0.6152,    9));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76945);assertFraction(8, 13,     new Fraction(0.6152,   99));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76946);assertFraction(510, 829,  new Fraction(0.6152,  999));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76947);assertFraction(769, 1250, new Fraction(0.6152, 9999));

        // MATH-996
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76948);assertFraction(1, 2, new Fraction(0.5000000001, 10));
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testIntegerOverflow() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),76949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17912q31ndh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testIntegerOverflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17912q31ndh(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76949);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76950);checkIntegerOverflow(0.75000000001455192);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76951);checkIntegerOverflow(1.0e10);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76952);checkIntegerOverflow(-1.0e10);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76953);checkIntegerOverflow(-43979.60679604749);
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    private void checkIntegerOverflow(double a) {try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76954);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76955);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(76956);@SuppressWarnings("unused")
            Fraction f = new Fraction(a, 1.0e-12, 1000);
            //System.out.println(f.getNumerator() + "/" + f.getDenominator());
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(76957);Assert.fail("an exception should have been thrown");
        } catch (ConvergenceException ce) {
            // expected behavior
        }
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testEpsilonLimitConstructor() throws ConvergenceException  {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),76958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11bghmm1ndq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testEpsilonLimitConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11bghmm1ndq() throws ConvergenceException{try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76958);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76959);assertFraction(2, 5, new Fraction(0.4, 1.0e-5, 100));

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76960);assertFraction(3, 5,      new Fraction(0.6152, 0.02, 100));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76961);assertFraction(8, 13,     new Fraction(0.6152, 1.0e-3, 100));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76962);assertFraction(251, 408,  new Fraction(0.6152, 1.0e-4, 100));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76963);assertFraction(251, 408,  new Fraction(0.6152, 1.0e-5, 100));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76964);assertFraction(510, 829,  new Fraction(0.6152, 1.0e-6, 100));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76965);assertFraction(769, 1250, new Fraction(0.6152, 1.0e-7, 100));
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),76966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfv1ndy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfv1ndy(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76966);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76967);Fraction first = new Fraction(1, 2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76968);Fraction second = new Fraction(1, 3);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76969);Fraction third = new Fraction(1, 2);

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76970);Assert.assertEquals(0, first.compareTo(first));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76971);Assert.assertEquals(0, first.compareTo(third));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76972);Assert.assertEquals(1, first.compareTo(second));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76973);Assert.assertEquals(-1, second.compareTo(first));

        // these two values are different approximations of PI
        // the first  one is approximately PI - 3.07e-18
        // the second one is approximately PI + 1.936e-17
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76974);Fraction pi1 = new Fraction(1068966896, 340262731);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76975);Fraction pi2 = new Fraction( 411557987, 131002976);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76976);Assert.assertEquals(-1, pi1.compareTo(pi2));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76977);Assert.assertEquals( 1, pi2.compareTo(pi1));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76978);Assert.assertEquals(0.0, pi1.doubleValue() - pi2.doubleValue(), 1.0e-20);
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testDoubleValue() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),76979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6zy2z1neb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testDoubleValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6zy2z1neb(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76979);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76980);Fraction first = new Fraction(1, 2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76981);Fraction second = new Fraction(1, 3);

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76982);Assert.assertEquals(0.5, first.doubleValue(), 0.0);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76983);Assert.assertEquals(1.0 / 3.0, second.doubleValue(), 0.0);
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testFloatValue() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),76984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qbbche1neg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testFloatValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qbbche1neg(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76984);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76985);Fraction first = new Fraction(1, 2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76986);Fraction second = new Fraction(1, 3);

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76987);Assert.assertEquals(0.5f, first.floatValue(), 0.0f);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76988);Assert.assertEquals((float)(1.0 / 3.0), second.floatValue(), 0.0f);
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testIntValue() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),76989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vlmpn1nel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testIntValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vlmpn1nel(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76989);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76990);Fraction first = new Fraction(1, 2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76991);Fraction second = new Fraction(3, 2);

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76992);Assert.assertEquals(0, first.intValue());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76993);Assert.assertEquals(1, second.intValue());
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testLongValue() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),76994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mfkegm1neq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testLongValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mfkegm1neq(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76994);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76995);Fraction first = new Fraction(1, 2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76996);Fraction second = new Fraction(3, 2);

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76997);Assert.assertEquals(0L, first.longValue());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(76998);Assert.assertEquals(1L, second.longValue());
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testConstructorDouble() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),76999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1re3jkw1nev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testConstructorDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1re3jkw1nev(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(76999);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77000);assertFraction(1, 2, new Fraction(0.5));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77001);assertFraction(1, 3, new Fraction(1.0 / 3.0));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77002);assertFraction(17, 100, new Fraction(17.0 / 100.0));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77003);assertFraction(317, 100, new Fraction(317.0 / 100.0));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77004);assertFraction(-1, 2, new Fraction(-0.5));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77005);assertFraction(-1, 3, new Fraction(-1.0 / 3.0));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77006);assertFraction(-17, 100, new Fraction(17.0 / -100.0));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77007);assertFraction(-317, 100, new Fraction(-317.0 / 100.0));
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testAbs() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),77008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l56wuf1nf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testAbs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l56wuf1nf4(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(77008);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77009);Fraction a = new Fraction(10, 21);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77010);Fraction b = new Fraction(-10, 21);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77011);Fraction c = new Fraction(10, -21);

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77012);assertFraction(10, 21, a.abs());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77013);assertFraction(10, 21, b.abs());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77014);assertFraction(10, 21, c.abs());
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testPercentage() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),77015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18u2ykz1nfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testPercentage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18u2ykz1nfb(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(77015);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77016);Assert.assertEquals(50.0, new Fraction(1, 2).percentageValue(), 1.0e-15);
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testMath835() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),77017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csejfr1nfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testMath835",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csejfr1nfd(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(77017);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77018);final int numer = Integer.MAX_VALUE / 99;
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77019);final int denom = 1;
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77020);final double percentage = 100 * ((double) numer) / denom;
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77021);final Fraction frac = new Fraction(numer, denom);
        // With the implementation that preceded the fix suggested in MATH-835,
        // this test was failing, due to overflow.
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77022);Assert.assertEquals(percentage, frac.percentageValue(), Math.ulp(percentage));
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testReciprocal() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),77023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r5n8t1nfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testReciprocal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r5n8t1nfj(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(77023);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77024);Fraction f = null;

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77025);f = new Fraction(50, 75);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77026);f = f.reciprocal();
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77027);Assert.assertEquals(3, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77028);Assert.assertEquals(2, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77029);f = new Fraction(4, 3);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77030);f = f.reciprocal();
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77031);Assert.assertEquals(3, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77032);Assert.assertEquals(4, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77033);f = new Fraction(-15, 47);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77034);f = f.reciprocal();
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77035);Assert.assertEquals(-47, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77036);Assert.assertEquals(15, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77037);f = new Fraction(0, 3);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77038);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77039);f = f.reciprocal();
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77040);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {}

        // large values
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77041);f = new Fraction(Integer.MAX_VALUE, 1);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77042);f = f.reciprocal();
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77043);Assert.assertEquals(1, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77044);Assert.assertEquals(Integer.MAX_VALUE, f.getDenominator());
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testNegate() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),77045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffqfwl1ng5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testNegate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffqfwl1ng5(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(77045);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77046);Fraction f = null;

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77047);f = new Fraction(50, 75);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77048);f = f.negate();
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77049);Assert.assertEquals(-2, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77050);Assert.assertEquals(3, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77051);f = new Fraction(-50, 75);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77052);f = f.negate();
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77053);Assert.assertEquals(2, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77054);Assert.assertEquals(3, f.getDenominator());

        // large values
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77055);f = new Fraction(Integer.MAX_VALUE-1, Integer.MAX_VALUE);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77056);f = f.negate();
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77057);Assert.assertEquals(Integer.MIN_VALUE+2, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77058);Assert.assertEquals(Integer.MAX_VALUE, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77059);f = new Fraction(Integer.MIN_VALUE, 1);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77060);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77061);f = f.negate();
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77062);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {}
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testAdd() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),77063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1ngn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1ngn(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(77063);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77064);Fraction a = new Fraction(1, 2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77065);Fraction b = new Fraction(2, 3);

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77066);assertFraction(1, 1, a.add(a));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77067);assertFraction(7, 6, a.add(b));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77068);assertFraction(7, 6, b.add(a));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77069);assertFraction(4, 3, b.add(b));

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77070);Fraction f1 = new Fraction(Integer.MAX_VALUE - 1, 1);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77071);Fraction f2 = Fraction.ONE;
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77072);Fraction f = f1.add(f2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77073);Assert.assertEquals(Integer.MAX_VALUE, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77074);Assert.assertEquals(1, f.getDenominator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77075);f = f1.add(1);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77076);Assert.assertEquals(Integer.MAX_VALUE, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77077);Assert.assertEquals(1, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77078);f1 = new Fraction(-1, 13*13*2*2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77079);f2 = new Fraction(-2, 13*17*2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77080);f = f1.add(f2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77081);Assert.assertEquals(13*13*17*2*2, f.getDenominator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77082);Assert.assertEquals(-17 - 2*13*2, f.getNumerator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77083);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77084);f.add(null);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77085);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {}

        // if this fraction is added naively, it will overflow.
        // check that it doesn't.
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77086);f1 = new Fraction(1,32768*3);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77087);f2 = new Fraction(1,59049);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77088);f = f1.add(f2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77089);Assert.assertEquals(52451, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77090);Assert.assertEquals(1934917632, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77091);f1 = new Fraction(Integer.MIN_VALUE, 3);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77092);f2 = new Fraction(1,3);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77093);f = f1.add(f2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77094);Assert.assertEquals(Integer.MIN_VALUE+1, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77095);Assert.assertEquals(3, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77096);f1 = new Fraction(Integer.MAX_VALUE - 1, 1);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77097);f2 = Fraction.ONE;
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77098);f = f1.add(f2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77099);Assert.assertEquals(Integer.MAX_VALUE, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77100);Assert.assertEquals(1, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77101);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77102);f = f.add(Fraction.ONE); // should overflow
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77103);Assert.fail("expecting MathArithmeticException but got: " + f.toString());
        } catch (MathArithmeticException ex) {}

        // denominator should not be a multiple of 2 or 3 to trigger overflow
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77104);f1 = new Fraction(Integer.MIN_VALUE, 5);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77105);f2 = new Fraction(-1,5);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77106);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77107);f = f1.add(f2); // should overflow
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77108);Assert.fail("expecting MathArithmeticException but got: " + f.toString());
        } catch (MathArithmeticException ex) {}

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77109);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77110);f= new Fraction(-Integer.MAX_VALUE, 1);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77111);f = f.add(f);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77112);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {}

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77113);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77114);f= new Fraction(-Integer.MAX_VALUE, 1);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77115);f = f.add(f);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77116);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {}

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77117);f1 = new Fraction(3,327680);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77118);f2 = new Fraction(2,59049);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77119);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77120);f = f1.add(f2); // should overflow
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77121);Assert.fail("expecting MathArithmeticException but got: " + f.toString());
        } catch (MathArithmeticException ex) {}
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testDivide() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),77122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ae8h2m1nia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testDivide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ae8h2m1nia(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(77122);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77123);Fraction a = new Fraction(1, 2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77124);Fraction b = new Fraction(2, 3);

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77125);assertFraction(1, 1, a.divide(a));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77126);assertFraction(3, 4, a.divide(b));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77127);assertFraction(4, 3, b.divide(a));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77128);assertFraction(1, 1, b.divide(b));

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77129);Fraction f1 = new Fraction(3, 5);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77130);Fraction f2 = Fraction.ZERO;
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77131);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77132);f1.divide(f2);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77133);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {}

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77134);f1 = new Fraction(0, 5);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77135);f2 = new Fraction(2, 7);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77136);Fraction f = f1.divide(f2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77137);Assert.assertSame(Fraction.ZERO, f);

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77138);f1 = new Fraction(2, 7);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77139);f2 = Fraction.ONE;
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77140);f = f1.divide(f2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77141);Assert.assertEquals(2, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77142);Assert.assertEquals(7, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77143);f1 = new Fraction(1, Integer.MAX_VALUE);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77144);f = f1.divide(f1);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77145);Assert.assertEquals(1, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77146);Assert.assertEquals(1, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77147);f1 = new Fraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77148);f2 = new Fraction(1, Integer.MAX_VALUE);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77149);f = f1.divide(f2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77150);Assert.assertEquals(Integer.MIN_VALUE, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77151);Assert.assertEquals(1, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77152);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77153);f.divide(null);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77154);Assert.fail("MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {}

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77155);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77156);f1 = new Fraction(1, Integer.MAX_VALUE);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77157);f = f1.divide(f1.reciprocal());  // should overflow
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77158);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {}
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77159);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77160);f1 = new Fraction(1, -Integer.MAX_VALUE);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77161);f = f1.divide(f1.reciprocal());  // should overflow
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77162);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {}

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77163);f1 = new Fraction(6, 35);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77164);f  = f1.divide(15);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77165);Assert.assertEquals(2, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77166);Assert.assertEquals(175, f.getDenominator());

    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testMultiply() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),77167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn1njj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn1njj(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(77167);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77168);Fraction a = new Fraction(1, 2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77169);Fraction b = new Fraction(2, 3);

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77170);assertFraction(1, 4, a.multiply(a));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77171);assertFraction(1, 3, a.multiply(b));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77172);assertFraction(1, 3, b.multiply(a));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77173);assertFraction(4, 9, b.multiply(b));

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77174);Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77175);Fraction f2 = new Fraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77176);Fraction f = f1.multiply(f2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77177);Assert.assertEquals(Integer.MIN_VALUE, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77178);Assert.assertEquals(1, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77179);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77180);f.multiply(null);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77181);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {}

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77182);f1 = new Fraction(6, 35);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77183);f  = f1.multiply(15);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77184);Assert.assertEquals(18, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77185);Assert.assertEquals(7, f.getDenominator());
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testSubtract() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),77186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hib6tp1nk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testSubtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hib6tp1nk2(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(77186);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77187);Fraction a = new Fraction(1, 2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77188);Fraction b = new Fraction(2, 3);

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77189);assertFraction(0, 1, a.subtract(a));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77190);assertFraction(-1, 6, a.subtract(b));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77191);assertFraction(1, 6, b.subtract(a));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77192);assertFraction(0, 1, b.subtract(b));

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77193);Fraction f = new Fraction(1,1);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77194);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77195);f.subtract(null);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77196);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {}

        // if this fraction is subtracted naively, it will overflow.
        // check that it doesn't.
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77197);Fraction f1 = new Fraction(1,32768*3);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77198);Fraction f2 = new Fraction(1,59049);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77199);f = f1.subtract(f2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77200);Assert.assertEquals(-13085, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77201);Assert.assertEquals(1934917632, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77202);f1 = new Fraction(Integer.MIN_VALUE, 3);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77203);f2 = new Fraction(1,3).negate();
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77204);f = f1.subtract(f2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77205);Assert.assertEquals(Integer.MIN_VALUE+1, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77206);Assert.assertEquals(3, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77207);f1 = new Fraction(Integer.MAX_VALUE, 1);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77208);f2 = Fraction.ONE;
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77209);f = f1.subtract(f2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77210);Assert.assertEquals(Integer.MAX_VALUE-1, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77211);Assert.assertEquals(1, f.getDenominator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77212);f = f1.subtract(1);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77213);Assert.assertEquals(Integer.MAX_VALUE-1, f.getNumerator());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77214);Assert.assertEquals(1, f.getDenominator());

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77215);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77216);f1 = new Fraction(1, Integer.MAX_VALUE);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77217);f2 = new Fraction(1, Integer.MAX_VALUE - 1);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77218);f = f1.subtract(f2);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77219);Assert.fail("expecting MathArithmeticException");  //should overflow
        } catch (MathArithmeticException ex) {}

        // denominator should not be a multiple of 2 or 3 to trigger overflow
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77220);f1 = new Fraction(Integer.MIN_VALUE, 5);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77221);f2 = new Fraction(1,5);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77222);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77223);f = f1.subtract(f2); // should overflow
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77224);Assert.fail("expecting MathArithmeticException but got: " + f.toString());
        } catch (MathArithmeticException ex) {}

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77225);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77226);f= new Fraction(Integer.MIN_VALUE, 1);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77227);f = f.subtract(Fraction.ONE);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77228);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {}

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77229);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77230);f= new Fraction(Integer.MAX_VALUE, 1);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77231);f = f.subtract(Fraction.ONE.negate());
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77232);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {}

        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77233);f1 = new Fraction(3,327680);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77234);f2 = new Fraction(2,59049);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77235);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77236);f = f1.subtract(f2); // should overflow
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77237);Assert.fail("expecting MathArithmeticException but got: " + f.toString());
        } catch (MathArithmeticException ex) {}
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),77238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w81nli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w81nli(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(77238);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77239);Fraction zero  = new Fraction(0,1);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77240);Fraction nullFraction = null;
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77241);Assert.assertTrue( zero.equals(zero));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77242);Assert.assertFalse(zero.equals(nullFraction));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77243);Assert.assertFalse(zero.equals(Double.valueOf(0)));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77244);Fraction zero2 = new Fraction(0,2);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77245);Assert.assertTrue(zero.equals(zero2));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77246);Assert.assertEquals(zero.hashCode(), zero2.hashCode());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77247);Fraction one = new Fraction(1,1);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77248);Assert.assertFalse((one.equals(zero) ||zero.equals(one)));
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testGetReducedFraction() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),77249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f04h251nlt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testGetReducedFraction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f04h251nlt(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(77249);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77250);Fraction threeFourths = new Fraction(3, 4);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77251);Assert.assertTrue(threeFourths.equals(Fraction.getReducedFraction(6, 8)));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77252);Assert.assertTrue(Fraction.ZERO.equals(Fraction.getReducedFraction(0, -1)));
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77253);try {
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77254);Fraction.getReducedFraction(1, 0);
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77255);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
            // expected
        }
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77256);Assert.assertEquals(Fraction.getReducedFraction
                (2, Integer.MIN_VALUE).getNumerator(),-1);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77257);Assert.assertEquals(Fraction.getReducedFraction
                (1, -1).getNumerator(), -1);
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),77258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1nm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1nm2(){try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(77258);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77259);Assert.assertEquals("0", new Fraction(0, 3).toString());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77260);Assert.assertEquals("3", new Fraction(6, 2).toString());
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77261);Assert.assertEquals("2 / 3", new Fraction(18, 27).toString());
    }finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

    @Test
    public void testSerial() throws FractionConversionException {__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceStart(getClass().getName(),77262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv1nm6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nbe1nbelb90pcnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nbe1nbelb90pcnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.FractionTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv1nm6() throws FractionConversionException{try{__CLR4_4_11nbe1nbelb90pcnm.R.inc(77262);
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77263);Fraction[] fractions = {
            new Fraction(3, 4), Fraction.ONE, Fraction.ZERO,
            new Fraction(17), new Fraction(FastMath.PI, 1000),
            new Fraction(-5, 2)
        };
        __CLR4_4_11nbe1nbelb90pcnm.R.inc(77264);for (Fraction fraction : fractions) {{
            __CLR4_4_11nbe1nbelb90pcnm.R.inc(77265);Assert.assertEquals(fraction, TestUtils.serializeAndRecover(fraction));
        }
    }}finally{__CLR4_4_11nbe1nbelb90pcnm.R.flushNeeded();}}

}
