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

package org.apache.commons.math3.complex;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


/**
 * @version $Id$
 */
public class ComplexTest {static class __CLR4_4_11hb91hb9lb90pc6p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,69833,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    private double inf = Double.POSITIVE_INFINITY;
    private double neginf = Double.NEGATIVE_INFINITY;
    private double nan = Double.NaN;
    private double pi = FastMath.PI;
    private Complex oneInf = new Complex(1, inf);
    private Complex oneNegInf = new Complex(1, neginf);
    private Complex infOne = new Complex(inf, 1);
    private Complex infZero = new Complex(inf, 0);
    private Complex infNaN = new Complex(inf, nan);
    private Complex infNegInf = new Complex(inf, neginf);
    private Complex infInf = new Complex(inf, inf);
    private Complex negInfInf = new Complex(neginf, inf);
    private Complex negInfZero = new Complex(neginf, 0);
    private Complex negInfOne = new Complex(neginf, 1);
    private Complex negInfNaN = new Complex(neginf, nan);
    private Complex negInfNegInf = new Complex(neginf, neginf);
    private Complex oneNaN = new Complex(1, nan);
    private Complex zeroInf = new Complex(0, inf);
    private Complex zeroNaN = new Complex(0, nan);
    private Complex nanInf = new Complex(nan, inf);
    private Complex nanNegInf = new Complex(nan, neginf);
    private Complex nanZero = new Complex(nan, 0);

    @Test
    public void testConstructor() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h1hb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h1hb9(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69093);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69094);Complex z = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69095);Assert.assertEquals(3.0, z.getReal(), 1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69096);Assert.assertEquals(4.0, z.getImaginary(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testConstructorNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ci2y4m1hbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testConstructorNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ci2y4m1hbd(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69097);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69098);Complex z = new Complex(3.0, Double.NaN);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69099);Assert.assertTrue(z.isNaN());

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69100);z = new Complex(nan, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69101);Assert.assertTrue(z.isNaN());

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69102);z = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69103);Assert.assertFalse(z.isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAbs() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l56wuf1hbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAbs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l56wuf1hbk(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69104);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69105);Complex z = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69106);Assert.assertEquals(5.0, z.abs(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAbsNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r43haa1hbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAbsNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r43haa1hbn(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69107);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69108);Assert.assertTrue(Double.isNaN(Complex.NaN.abs()));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69109);Complex z = new Complex(inf, nan);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69110);Assert.assertTrue(Double.isNaN(z.abs()));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAbsInfinite() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184blvp1hbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAbsInfinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184blvp1hbr(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69111);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69112);Complex z = new Complex(inf, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69113);Assert.assertEquals(inf, z.abs(), 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69114);z = new Complex(0, neginf);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69115);Assert.assertEquals(inf, z.abs(), 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69116);z = new Complex(inf, neginf);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69117);Assert.assertEquals(inf, z.abs(), 0);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAdd() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1hby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1hby(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69118);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69119);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69120);Complex y = new Complex(5.0, 6.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69121);Complex z = x.add(y);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69122);Assert.assertEquals(8.0, z.getReal(), 1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69123);Assert.assertEquals(10.0, z.getImaginary(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAddNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sy6fsd1hc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAddNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sy6fsd1hc4(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69124);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69125);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69126);Complex z = x.add(Complex.NaN);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69127);Assert.assertSame(Complex.NaN, z);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69128);z = new Complex(1, nan);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69129);Complex w = x.add(z);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69130);Assert.assertSame(Complex.NaN, w);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAddInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jvjmpl1hcb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAddInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jvjmpl1hcb(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69131);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69132);Complex x = new Complex(1, 1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69133);Complex z = new Complex(inf, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69134);Complex w = x.add(z);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69135);Assert.assertEquals(w.getImaginary(), 1, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69136);Assert.assertEquals(inf, w.getReal(), 0);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69137);x = new Complex(neginf, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69138);Assert.assertTrue(Double.isNaN(x.add(z).getReal()));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}


    @Test
    public void testScalarAdd() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r073wq1hcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r073wq1hcj(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69139);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69140);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69141);double yDouble = 2.0;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69142);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69143);Assert.assertEquals(x.add(yComplex), x.add(yDouble));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarAddNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p0hr351hco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarAddNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p0hr351hco(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69144);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69145);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69146);double yDouble = Double.NaN;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69147);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69148);Assert.assertEquals(x.add(yComplex), x.add(yDouble));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarAddInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nt8bet1hct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarAddInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nt8bet1hct(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69149);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69150);Complex x = new Complex(1, 1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69151);double yDouble = Double.POSITIVE_INFINITY;

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69152);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69153);Assert.assertEquals(x.add(yComplex), x.add(yDouble));

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69154);x = new Complex(neginf, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69155);Assert.assertEquals(x.add(yComplex), x.add(yDouble));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testConjugate() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ylifkj1hd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testConjugate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ylifkj1hd0(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69156);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69157);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69158);Complex z = x.conjugate();
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69159);Assert.assertEquals(3.0, z.getReal(), 1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69160);Assert.assertEquals(-4.0, z.getImaginary(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testConjugateNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1foamw41hd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testConjugateNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1foamw41hd5(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69161);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69162);Complex z = Complex.NaN.conjugate();
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69163);Assert.assertTrue(z.isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testConjugateInfiinite() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofe9hq1hd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testConjugateInfiinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofe9hq1hd8(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69164);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69165);Complex z = new Complex(0, inf);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69166);Assert.assertEquals(neginf, z.conjugate().getImaginary(), 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69167);z = new Complex(0, neginf);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69168);Assert.assertEquals(inf, z.conjugate().getImaginary(), 0);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testDivide() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ae8h2m1hdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testDivide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ae8h2m1hdd(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69169);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69170);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69171);Complex y = new Complex(5.0, 6.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69172);Complex z = x.divide(y);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69173);Assert.assertEquals(39.0 / 61.0, z.getReal(), 1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69174);Assert.assertEquals(2.0 / 61.0, z.getImaginary(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testDivideReal() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dubv1s1hdj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testDivideReal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dubv1s1hdj(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69175);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69176);Complex x = new Complex(2d, 3d);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69177);Complex y = new Complex(2d, 0d);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69178);Assert.assertEquals(new Complex(1d, 1.5), x.divide(y));

    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testDivideImaginary() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j40wcr1hdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testDivideImaginary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j40wcr1hdn(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69179);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69180);Complex x = new Complex(2d, 3d);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69181);Complex y = new Complex(0d, 2d);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69182);Assert.assertEquals(new Complex(1.5d, -1d), x.divide(y));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testDivideInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140t8sd1hdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testDivideInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140t8sd1hdr(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69183);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69184);Complex x = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69185);Complex w = new Complex(neginf, inf);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69186);Assert.assertTrue(x.divide(w).equals(Complex.ZERO));

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69187);Complex z = w.divide(x);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69188);Assert.assertTrue(Double.isNaN(z.getReal()));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69189);Assert.assertEquals(inf, z.getImaginary(), 0);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69190);w = new Complex(inf, inf);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69191);z = w.divide(x);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69192);Assert.assertTrue(Double.isNaN(z.getImaginary()));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69193);Assert.assertEquals(inf, z.getReal(), 0);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69194);w = new Complex(1, inf);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69195);z = w.divide(w);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69196);Assert.assertTrue(Double.isNaN(z.getReal()));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69197);Assert.assertTrue(Double.isNaN(z.getImaginary()));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testDivideZero() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sb5vl21he6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testDivideZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sb5vl21he6(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69198);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69199);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69200);Complex z = x.divide(Complex.ZERO);
        // Assert.assertEquals(z, Complex.INF); // See MATH-657
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69201);Assert.assertEquals(z, Complex.NaN);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testDivideZeroZero() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15xd0pq1hea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testDivideZeroZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15xd0pq1hea(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69202);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69203);Complex x = new Complex(0.0, 0.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69204);Complex z = x.divide(Complex.ZERO);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69205);Assert.assertEquals(z, Complex.NaN);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testDivideNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8789j1hee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testDivideNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8789j1hee(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69206);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69207);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69208);Complex z = x.divide(Complex.NaN);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69209);Assert.assertTrue(z.isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testDivideNaNInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bw2obc1hei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testDivideNaNInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bw2obc1hei(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69210);
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69211);Complex z = oneInf.divide(Complex.ONE);
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69212);Assert.assertTrue(Double.isNaN(z.getReal()));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69213);Assert.assertEquals(inf, z.getImaginary(), 0);

       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69214);z = negInfNegInf.divide(oneNaN);
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69215);Assert.assertTrue(Double.isNaN(z.getReal()));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69216);Assert.assertTrue(Double.isNaN(z.getImaginary()));

       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69217);z = negInfInf.divide(Complex.ONE);
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69218);Assert.assertTrue(Double.isNaN(z.getReal()));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69219);Assert.assertTrue(Double.isNaN(z.getImaginary()));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarDivide() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16gjsde1hes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarDivide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16gjsde1hes(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69220);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69221);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69222);double yDouble = 2.0;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69223);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69224);Assert.assertEquals(x.divide(yComplex), x.divide(yDouble));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarDivideNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_132p34b1hex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarDivideNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_132p34b1hex(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69225);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69226);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69227);double yDouble = Double.NaN;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69228);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69229);Assert.assertEquals(x.divide(yComplex), x.divide(yDouble));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarDivideInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j4owcv1hf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarDivideInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j4owcv1hf2(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69230);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69231);Complex x = new Complex(1,1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69232);double yDouble = Double.POSITIVE_INFINITY;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69233);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69234);TestUtils.assertEquals(x.divide(yComplex), x.divide(yDouble), 0);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69235);yDouble = Double.NEGATIVE_INFINITY;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69236);yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69237);TestUtils.assertEquals(x.divide(yComplex), x.divide(yDouble), 0);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69238);x = new Complex(1, Double.NEGATIVE_INFINITY);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69239);TestUtils.assertEquals(x.divide(yComplex), x.divide(yDouble), 0);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarDivideZero() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zagana1hfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarDivideZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zagana1hfc(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69240);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69241);Complex x = new Complex(1,1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69242);TestUtils.assertEquals(x.divide(Complex.ZERO), x.divide(0), 0);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testReciprocal() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r5n8t1hff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testReciprocal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r5n8t1hff(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69243);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69244);Complex z = new Complex(5.0, 6.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69245);Complex act = z.reciprocal();
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69246);double expRe = 5.0 / 61.0;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69247);double expIm = -6.0 / 61.0;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69248);Assert.assertEquals(expRe, act.getReal(), FastMath.ulp(expRe));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69249);Assert.assertEquals(expIm, act.getImaginary(), FastMath.ulp(expIm));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testReciprocalReal() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gs8cnl1hfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testReciprocalReal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gs8cnl1hfm(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69250);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69251);Complex z = new Complex(-2.0, 0.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69252);Assert.assertEquals(new Complex(-0.5, 0.0), z.reciprocal());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testReciprocalImaginary() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfold81hfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testReciprocalImaginary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfold81hfp(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69253);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69254);Complex z = new Complex(0.0, -2.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69255);Assert.assertEquals(new Complex(0.0, 0.5), z.reciprocal());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testReciprocalInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6bu701hfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testReciprocalInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6bu701hfs(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69256);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69257);Complex z = new Complex(neginf, inf);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69258);Assert.assertTrue(z.reciprocal().equals(Complex.ZERO));

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69259);z = new Complex(1, inf).reciprocal();
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69260);Assert.assertEquals(z, Complex.ZERO);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testReciprocalZero() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12bec4b1hfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testReciprocalZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12bec4b1hfx(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69261);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69262);Assert.assertEquals(Complex.ZERO.reciprocal(), Complex.INF);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testReciprocalNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yne8ay1hfz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testReciprocalNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yne8ay1hfz(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69263);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69264);Assert.assertTrue(Complex.NaN.reciprocal().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testMultiply() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn1hg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn1hg1(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69265);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69266);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69267);Complex y = new Complex(5.0, 6.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69268);Complex z = x.multiply(y);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69269);Assert.assertEquals(-9.0, z.getReal(), 1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69270);Assert.assertEquals(38.0, z.getImaginary(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testMultiplyNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1se0hyk1hg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testMultiplyNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1se0hyk1hg7(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69271);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69272);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69273);Complex z = x.multiply(Complex.NaN);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69274);Assert.assertSame(Complex.NaN, z);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69275);z = Complex.NaN.multiply(5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69276);Assert.assertSame(Complex.NaN, z);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testMultiplyInfInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q1b3yb1hgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testMultiplyInfInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q1b3yb1hgd(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69277);
        // Assert.assertTrue(infInf.multiply(infInf).isNaN()); // MATH-620
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69278);Assert.assertTrue(infInf.multiply(infInf).isInfinite());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testMultiplyNaNInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kox13x1hgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testMultiplyNaNInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kox13x1hgf(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69279);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69280);Complex z = new Complex(1,1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69281);Complex w = z.multiply(infOne);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69282);Assert.assertEquals(w.getReal(), inf, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69283);Assert.assertEquals(w.getImaginary(), inf, 0);

        // [MATH-164]
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69284);Assert.assertTrue(new Complex( 1,0).multiply(infInf).equals(Complex.INF));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69285);Assert.assertTrue(new Complex(-1,0).multiply(infInf).equals(Complex.INF));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69286);Assert.assertTrue(new Complex( 1,0).multiply(negInfZero).equals(Complex.INF));

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69287);w = oneInf.multiply(oneNegInf);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69288);Assert.assertEquals(w.getReal(), inf, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69289);Assert.assertEquals(w.getImaginary(), inf, 0);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69290);w = negInfNegInf.multiply(oneNaN);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69291);Assert.assertTrue(Double.isNaN(w.getReal()));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69292);Assert.assertTrue(Double.isNaN(w.getImaginary()));

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69293);z = new Complex(1, neginf);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69294);Assert.assertSame(Complex.INF, z.multiply(z));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarMultiply() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dzcl1z1hgv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dzcl1z1hgv(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69295);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69296);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69297);double yDouble = 2.0;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69298);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69299);Assert.assertEquals(x.multiply(yComplex), x.multiply(yDouble));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69300);int zInt = -5;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69301);Complex zComplex = new Complex(zInt);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69302);Assert.assertEquals(x.multiply(zComplex), x.multiply(zInt));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarMultiplyNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b4ybts1hh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarMultiplyNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b4ybts1hh3(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69303);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69304);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69305);double yDouble = Double.NaN;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69306);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69307);Assert.assertEquals(x.multiply(yComplex), x.multiply(yDouble));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarMultiplyInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b2fnne1hh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarMultiplyInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b2fnne1hh8(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69308);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69309);Complex x = new Complex(1, 1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69310);double yDouble = Double.POSITIVE_INFINITY;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69311);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69312);Assert.assertEquals(x.multiply(yComplex), x.multiply(yDouble));

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69313);yDouble = Double.NEGATIVE_INFINITY;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69314);yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69315);Assert.assertEquals(x.multiply(yComplex), x.multiply(yDouble));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testNegate() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffqfwl1hhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testNegate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffqfwl1hhg(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69316);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69317);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69318);Complex z = x.negate();
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69319);Assert.assertEquals(-3.0, z.getReal(), 1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69320);Assert.assertEquals(-4.0, z.getImaginary(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testNegateNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19zcos21hhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testNegateNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19zcos21hhl(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69321);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69322);Complex z = Complex.NaN.negate();
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69323);Assert.assertTrue(z.isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSubtract() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hib6tp1hho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSubtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hib6tp1hho(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69324);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69325);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69326);Complex y = new Complex(5.0, 6.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69327);Complex z = x.subtract(y);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69328);Assert.assertEquals(-2.0, z.getReal(), 1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69329);Assert.assertEquals(-2.0, z.getImaginary(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSubtractNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlq8041hhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSubtractNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlq8041hhu(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69330);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69331);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69332);Complex z = x.subtract(Complex.NaN);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69333);Assert.assertSame(Complex.NaN, z);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69334);z = new Complex(1, nan);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69335);Complex w = x.subtract(z);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69336);Assert.assertSame(Complex.NaN, w);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSubtractInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7zuhu1hi1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSubtractInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7zuhu1hi1(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69337);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69338);Complex x = new Complex(1, 1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69339);Complex z = new Complex(neginf, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69340);Complex w = x.subtract(z);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69341);Assert.assertEquals(w.getImaginary(), 1, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69342);Assert.assertEquals(inf, w.getReal(), 0);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69343);x = new Complex(neginf, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69344);Assert.assertTrue(Double.isNaN(x.subtract(z).getReal()));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarSubtract() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z3bnfd1hi9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarSubtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z3bnfd1hi9(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69345);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69346);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69347);double yDouble = 2.0;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69348);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69349);Assert.assertEquals(x.subtract(yComplex), x.subtract(yDouble));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarSubtractNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o6bnu81hie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarSubtractNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o6bnu81hie(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69350);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69351);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69352);double yDouble = Double.NaN;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69353);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69354);Assert.assertEquals(x.subtract(yComplex), x.subtract(yDouble));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarSubtractInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11yxod21hij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarSubtractInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11yxod21hij(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69355);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69356);Complex x = new Complex(1, 1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69357);double yDouble = Double.POSITIVE_INFINITY;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69358);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69359);Assert.assertEquals(x.subtract(yComplex), x.subtract(yDouble));

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69360);x = new Complex(neginf, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69361);Assert.assertEquals(x.subtract(yComplex), x.subtract(yDouble));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}


    @Test
    public void testEqualsNull() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16bccdd1hiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testEqualsNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16bccdd1hiq(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69362);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69363);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69364);Assert.assertFalse(x.equals(null));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testEqualsClass() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2ss4u1hit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testEqualsClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2ss4u1hit(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69365);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69366);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69367);Assert.assertFalse(x.equals(this));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testEqualsSame() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13f480y1hiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testEqualsSame",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13f480y1hiw(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69368);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69369);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69370);Assert.assertTrue(x.equals(x));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testEqualsTrue() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7e92y1hiz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testEqualsTrue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7e92y1hiz(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69371);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69372);Complex x = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69373);Complex y = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69374);Assert.assertTrue(x.equals(y));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testEqualsRealDifference() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v3oeqb1hj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testEqualsRealDifference",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v3oeqb1hj3(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69375);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69376);Complex x = new Complex(0.0, 0.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69377);Complex y = new Complex(0.0 + Double.MIN_VALUE, 0.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69378);Assert.assertFalse(x.equals(y));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testEqualsImaginaryDifference() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vzwjpw1hj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testEqualsImaginaryDifference",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vzwjpw1hj7(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69379);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69380);Complex x = new Complex(0.0, 0.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69381);Complex y = new Complex(0.0, 0.0 + Double.MIN_VALUE);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69382);Assert.assertFalse(x.equals(y));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testEqualsNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nl95f31hjb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testEqualsNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nl95f31hjb(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69383);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69384);Complex realNaN = new Complex(Double.NaN, 0.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69385);Complex imaginaryNaN = new Complex(0.0, Double.NaN);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69386);Complex complexNaN = Complex.NaN;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69387);Assert.assertTrue(realNaN.equals(imaginaryNaN));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69388);Assert.assertTrue(imaginaryNaN.equals(complexNaN));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69389);Assert.assertTrue(realNaN.equals(complexNaN));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zkhv81hji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zkhv81hji(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69390);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69391);Complex x = new Complex(0.0, 0.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69392);Complex y = new Complex(0.0, 0.0 + Double.MIN_VALUE);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69393);Assert.assertFalse(x.hashCode()==y.hashCode());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69394);y = new Complex(0.0 + Double.MIN_VALUE, 0.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69395);Assert.assertFalse(x.hashCode()==y.hashCode());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69396);Complex realNaN = new Complex(Double.NaN, 0.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69397);Complex imaginaryNaN = new Complex(0.0, Double.NaN);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69398);Assert.assertEquals(realNaN.hashCode(), imaginaryNaN.hashCode());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69399);Assert.assertEquals(imaginaryNaN.hashCode(), Complex.NaN.hashCode());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAcos() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_175tfgf1hjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAcos",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_175tfgf1hjs(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69400);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69401);Complex z = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69402);Complex expected = new Complex(0.936812, -2.30551);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69403);TestUtils.assertEquals(expected, z.acos(), 1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69404);TestUtils.assertEquals(new Complex(FastMath.acos(0), 0),
                Complex.ZERO.acos(), 1.0e-12);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAcosInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9djdc1hjx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAcosInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9djdc1hjx(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69405);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69406);TestUtils.assertSame(Complex.NaN, oneInf.acos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69407);TestUtils.assertSame(Complex.NaN, oneNegInf.acos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69408);TestUtils.assertSame(Complex.NaN, infOne.acos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69409);TestUtils.assertSame(Complex.NaN, negInfOne.acos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69410);TestUtils.assertSame(Complex.NaN, infInf.acos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69411);TestUtils.assertSame(Complex.NaN, infNegInf.acos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69412);TestUtils.assertSame(Complex.NaN, negInfInf.acos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69413);TestUtils.assertSame(Complex.NaN, negInfNegInf.acos());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAcosNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141zjw61hk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAcosNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141zjw61hk6(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69414);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69415);Assert.assertTrue(Complex.NaN.acos().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAsin() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18gmpn41hk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAsin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18gmpn41hk8(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69416);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69417);Complex z = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69418);Complex expected = new Complex(0.633984, 2.30551);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69419);TestUtils.assertEquals(expected, z.asin(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAsinNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jth9yx1hkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAsinNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jth9yx1hkc(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69420);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69421);Assert.assertTrue(Complex.NaN.asin().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAsinInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12dwpi91hke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAsinInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12dwpi91hke(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69422);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69423);TestUtils.assertSame(Complex.NaN, oneInf.asin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69424);TestUtils.assertSame(Complex.NaN, oneNegInf.asin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69425);TestUtils.assertSame(Complex.NaN, infOne.asin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69426);TestUtils.assertSame(Complex.NaN, negInfOne.asin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69427);TestUtils.assertSame(Complex.NaN, infInf.asin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69428);TestUtils.assertSame(Complex.NaN, infNegInf.asin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69429);TestUtils.assertSame(Complex.NaN, negInfInf.asin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69430);TestUtils.assertSame(Complex.NaN, negInfNegInf.asin());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}


    @Test
    public void testAtan() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z90gx31hkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAtan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z90gx31hkn(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69431);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69432);Complex z = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69433);Complex expected = new Complex(1.44831, 0.158997);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69434);TestUtils.assertEquals(expected, z.atan(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAtanInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6bq7e1hkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAtanInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6bq7e1hkr(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69435);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69436);TestUtils.assertSame(Complex.NaN, oneInf.atan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69437);TestUtils.assertSame(Complex.NaN, oneNegInf.atan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69438);TestUtils.assertSame(Complex.NaN, infOne.atan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69439);TestUtils.assertSame(Complex.NaN, negInfOne.atan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69440);TestUtils.assertSame(Complex.NaN, infInf.atan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69441);TestUtils.assertSame(Complex.NaN, infNegInf.atan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69442);TestUtils.assertSame(Complex.NaN, negInfInf.atan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69443);TestUtils.assertSame(Complex.NaN, negInfNegInf.atan());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAtanI() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7lnz21hl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAtanI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7lnz21hl0(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69444);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69445);Assert.assertTrue(Complex.I.atan().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testAtanNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxqq81hl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testAtanNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxqq81hl2(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69446);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69447);Assert.assertTrue(Complex.NaN.atan().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testCos() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mz11ok1hl4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testCos",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mz11ok1hl4(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69448);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69449);Complex z = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69450);Complex expected = new Complex(-27.03495, -3.851153);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69451);TestUtils.assertEquals(expected, z.cos(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testCosNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewtodp1hl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testCosNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewtodp1hl8(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69452);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69453);Assert.assertTrue(Complex.NaN.cos().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testCosInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17akb3h1hla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testCosInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17akb3h1hla(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69454);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69455);TestUtils.assertSame(infNegInf, oneInf.cos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69456);TestUtils.assertSame(infInf, oneNegInf.cos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69457);TestUtils.assertSame(Complex.NaN, infOne.cos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69458);TestUtils.assertSame(Complex.NaN, negInfOne.cos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69459);TestUtils.assertSame(Complex.NaN, infInf.cos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69460);TestUtils.assertSame(Complex.NaN, infNegInf.cos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69461);TestUtils.assertSame(Complex.NaN, negInfInf.cos());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69462);TestUtils.assertSame(Complex.NaN, negInfNegInf.cos());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testCosh() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13cad0a1hlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testCosh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13cad0a1hlj(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69463);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69464);Complex z = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69465);Complex expected = new Complex(-6.58066, -7.58155);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69466);TestUtils.assertEquals(expected, z.cosh(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testCoshNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m5uott1hln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testCoshNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m5uott1hln(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69467);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69468);Assert.assertTrue(Complex.NaN.cosh().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testCoshInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnvdo51hlp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testCoshInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnvdo51hlp(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69469);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69470);TestUtils.assertSame(Complex.NaN, oneInf.cosh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69471);TestUtils.assertSame(Complex.NaN, oneNegInf.cosh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69472);TestUtils.assertSame(infInf, infOne.cosh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69473);TestUtils.assertSame(infNegInf, negInfOne.cosh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69474);TestUtils.assertSame(Complex.NaN, infInf.cosh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69475);TestUtils.assertSame(Complex.NaN, infNegInf.cosh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69476);TestUtils.assertSame(Complex.NaN, negInfInf.cosh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69477);TestUtils.assertSame(Complex.NaN, negInfNegInf.cosh());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testExp() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdnn6a1hly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testExp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdnn6a1hly(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69478);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69479);Complex z = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69480);Complex expected = new Complex(-13.12878, -15.20078);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69481);TestUtils.assertEquals(expected, z.exp(), 1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69482);TestUtils.assertEquals(Complex.ONE,
                Complex.ZERO.exp(), 10e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69483);Complex iPi = Complex.I.multiply(new Complex(pi,0));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69484);TestUtils.assertEquals(Complex.ONE.negate(),
                iPi.exp(), 10e-12);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testExpNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqmhp31hm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testExpNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqmhp31hm5(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69485);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69486);Assert.assertTrue(Complex.NaN.exp().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testExpInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13j8i7x1hm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testExpInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13j8i7x1hm7(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69487);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69488);TestUtils.assertSame(Complex.NaN, oneInf.exp());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69489);TestUtils.assertSame(Complex.NaN, oneNegInf.exp());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69490);TestUtils.assertSame(infInf, infOne.exp());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69491);TestUtils.assertSame(Complex.ZERO, negInfOne.exp());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69492);TestUtils.assertSame(Complex.NaN, infInf.exp());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69493);TestUtils.assertSame(Complex.NaN, infNegInf.exp());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69494);TestUtils.assertSame(Complex.NaN, negInfInf.exp());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69495);TestUtils.assertSame(Complex.NaN, negInfNegInf.exp());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testLog() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5ksyv1hmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testLog",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5ksyv1hmg(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69496);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69497);Complex z = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69498);Complex expected = new Complex(1.60944, 0.927295);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69499);TestUtils.assertEquals(expected, z.log(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testLogNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gf1jzk1hmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testLogNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gf1jzk1hmk(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69500);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69501);Assert.assertTrue(Complex.NaN.log().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testLogInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15scfhm1hmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testLogInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15scfhm1hmm(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69502);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69503);TestUtils.assertEquals(new Complex(inf, pi / 2),
                oneInf.log(), 10e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69504);TestUtils.assertEquals(new Complex(inf, -pi / 2),
                oneNegInf.log(), 10e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69505);TestUtils.assertEquals(infZero, infOne.log(), 10e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69506);TestUtils.assertEquals(new Complex(inf, pi),
                negInfOne.log(), 10e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69507);TestUtils.assertEquals(new Complex(inf, pi / 4),
                infInf.log(), 10e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69508);TestUtils.assertEquals(new Complex(inf, -pi / 4),
                infNegInf.log(), 10e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69509);TestUtils.assertEquals(new Complex(inf, 3d * pi / 4),
                negInfInf.log(), 10e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69510);TestUtils.assertEquals(new Complex(inf, - 3d * pi / 4),
                negInfNegInf.log(), 10e-12);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testLogZero() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mqihpd1hmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testLogZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mqihpd1hmv(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69511);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69512);TestUtils.assertSame(negInfZero, Complex.ZERO.log());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testPow() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xazw8d1hmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xazw8d1hmx(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69513);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69514);Complex x = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69515);Complex y = new Complex(5, 6);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69516);Complex expected = new Complex(-1.860893, 11.83677);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69517);TestUtils.assertEquals(expected, x.pow(y), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testPowNaNBase() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r8qdzn1hn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testPowNaNBase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r8qdzn1hn2(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69518);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69519);Complex x = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69520);Assert.assertTrue(Complex.NaN.pow(x).isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testPowNaNExponent() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gs4dor1hn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testPowNaNExponent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gs4dor1hn5(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69521);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69522);Complex x = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69523);Assert.assertTrue(x.pow(Complex.NaN).isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

   @Test
   public void testPowInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rvmdtq1hn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testPowInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rvmdtq1hn8(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69524);
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69525);TestUtils.assertSame(Complex.NaN,Complex.ONE.pow(oneInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69526);TestUtils.assertSame(Complex.NaN,Complex.ONE.pow(oneNegInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69527);TestUtils.assertSame(Complex.NaN,Complex.ONE.pow(infOne));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69528);TestUtils.assertSame(Complex.NaN,Complex.ONE.pow(infInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69529);TestUtils.assertSame(Complex.NaN,Complex.ONE.pow(infNegInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69530);TestUtils.assertSame(Complex.NaN,Complex.ONE.pow(negInfInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69531);TestUtils.assertSame(Complex.NaN,Complex.ONE.pow(negInfNegInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69532);TestUtils.assertSame(Complex.NaN,infOne.pow(Complex.ONE));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69533);TestUtils.assertSame(Complex.NaN,negInfOne.pow(Complex.ONE));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69534);TestUtils.assertSame(Complex.NaN,infInf.pow(Complex.ONE));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69535);TestUtils.assertSame(Complex.NaN,infNegInf.pow(Complex.ONE));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69536);TestUtils.assertSame(Complex.NaN,negInfInf.pow(Complex.ONE));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69537);TestUtils.assertSame(Complex.NaN,negInfNegInf.pow(Complex.ONE));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69538);TestUtils.assertSame(Complex.NaN,negInfNegInf.pow(infNegInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69539);TestUtils.assertSame(Complex.NaN,negInfNegInf.pow(negInfNegInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69540);TestUtils.assertSame(Complex.NaN,negInfNegInf.pow(infInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69541);TestUtils.assertSame(Complex.NaN,infInf.pow(infNegInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69542);TestUtils.assertSame(Complex.NaN,infInf.pow(negInfNegInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69543);TestUtils.assertSame(Complex.NaN,infInf.pow(infInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69544);TestUtils.assertSame(Complex.NaN,infNegInf.pow(infNegInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69545);TestUtils.assertSame(Complex.NaN,infNegInf.pow(negInfNegInf));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69546);TestUtils.assertSame(Complex.NaN,infNegInf.pow(infInf));
   }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

   @Test
   public void testPowZero() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mt1ky31hnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testPowZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mt1ky31hnv(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69547);
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69548);TestUtils.assertSame(Complex.NaN,
               Complex.ZERO.pow(Complex.ONE));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69549);TestUtils.assertSame(Complex.NaN,
               Complex.ZERO.pow(Complex.ZERO));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69550);TestUtils.assertSame(Complex.NaN,
               Complex.ZERO.pow(Complex.I));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69551);TestUtils.assertEquals(Complex.ONE,
               Complex.ONE.pow(Complex.ZERO), 10e-12);
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69552);TestUtils.assertEquals(Complex.ONE,
               Complex.I.pow(Complex.ZERO), 10e-12);
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69553);TestUtils.assertEquals(Complex.ONE,
               new Complex(-1, 3).pow(Complex.ZERO), 10e-12);
   }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarPow() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sh9s2p1ho2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sh9s2p1ho2(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69554);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69555);Complex x = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69556);double yDouble = 5.0;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69557);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69558);Assert.assertEquals(x.pow(yComplex), x.pow(yDouble));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarPowNaNBase() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yo89qf1ho7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarPowNaNBase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yo89qf1ho7(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69559);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69560);Complex x = Complex.NaN;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69561);double yDouble = 5.0;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69562);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69563);Assert.assertEquals(x.pow(yComplex), x.pow(yDouble));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testScalarPowNaNExponent() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j8zmp51hoc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarPowNaNExponent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j8zmp51hoc(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69564);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69565);Complex x = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69566);double yDouble = Double.NaN;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69567);Complex yComplex = new Complex(yDouble);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69568);Assert.assertEquals(x.pow(yComplex), x.pow(yDouble));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

   @Test
   public void testScalarPowInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxxp4i1hoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarPowInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxxp4i1hoh(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69569);
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69570);TestUtils.assertSame(Complex.NaN,Complex.ONE.pow(Double.POSITIVE_INFINITY));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69571);TestUtils.assertSame(Complex.NaN,Complex.ONE.pow(Double.NEGATIVE_INFINITY));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69572);TestUtils.assertSame(Complex.NaN,infOne.pow(1.0));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69573);TestUtils.assertSame(Complex.NaN,negInfOne.pow(1.0));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69574);TestUtils.assertSame(Complex.NaN,infInf.pow(1.0));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69575);TestUtils.assertSame(Complex.NaN,infNegInf.pow(1.0));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69576);TestUtils.assertSame(Complex.NaN,negInfInf.pow(10));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69577);TestUtils.assertSame(Complex.NaN,negInfNegInf.pow(1.0));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69578);TestUtils.assertSame(Complex.NaN,negInfNegInf.pow(Double.POSITIVE_INFINITY));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69579);TestUtils.assertSame(Complex.NaN,negInfNegInf.pow(Double.POSITIVE_INFINITY));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69580);TestUtils.assertSame(Complex.NaN,infInf.pow(Double.POSITIVE_INFINITY));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69581);TestUtils.assertSame(Complex.NaN,infInf.pow(Double.NEGATIVE_INFINITY));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69582);TestUtils.assertSame(Complex.NaN,infNegInf.pow(Double.NEGATIVE_INFINITY));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69583);TestUtils.assertSame(Complex.NaN,infNegInf.pow(Double.POSITIVE_INFINITY));
   }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

   @Test
   public void testScalarPowZero() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s63msp1how();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testScalarPowZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s63msp1how(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69584);
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69585);TestUtils.assertSame(Complex.NaN, Complex.ZERO.pow(1.0));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69586);TestUtils.assertSame(Complex.NaN, Complex.ZERO.pow(0.0));
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69587);TestUtils.assertEquals(Complex.ONE, Complex.ONE.pow(0.0), 10e-12);
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69588);TestUtils.assertEquals(Complex.ONE, Complex.I.pow(0.0), 10e-12);
       __CLR4_4_11hb91hb9lb90pc6p.R.inc(69589);TestUtils.assertEquals(Complex.ONE, new Complex(-1, 3).pow(0.0), 10e-12);
   }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testpowNull() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2d2r01hp2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,112,111,119,78,117,108,108,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testpowNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2d2r01hp2(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69590);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69591);Complex.ONE.pow(null);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSin() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wfmv711hp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wfmv711hp4(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69592);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69593);Complex z = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69594);Complex expected = new Complex(3.853738, -27.01681);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69595);TestUtils.assertEquals(expected, z.sin(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSinInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkwirm1hp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSinInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkwirm1hp8(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69596);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69597);TestUtils.assertSame(infInf, oneInf.sin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69598);TestUtils.assertSame(infNegInf, oneNegInf.sin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69599);TestUtils.assertSame(Complex.NaN, infOne.sin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69600);TestUtils.assertSame(Complex.NaN, negInfOne.sin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69601);TestUtils.assertSame(Complex.NaN, infInf.sin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69602);TestUtils.assertSame(Complex.NaN, infNegInf.sin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69603);TestUtils.assertSame(Complex.NaN, negInfInf.sin());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69604);TestUtils.assertSame(Complex.NaN, negInfNegInf.sin());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSinNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8tjqc1hph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSinNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8tjqc1hph(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69605);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69606);Assert.assertTrue(Complex.NaN.sin().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSinh() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g86csp1hpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSinh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g86csp1hpj(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69607);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69608);Complex z = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69609);Complex expected = new Complex(-6.54812, -7.61923);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69610);TestUtils.assertEquals(expected, z.sinh(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSinhNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17mih6o1hpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSinhNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17mih6o1hpn(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69611);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69612);Assert.assertTrue(Complex.NaN.sinh().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSinhInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekviai1hpp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSinhInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekviai1hpp(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69613);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69614);TestUtils.assertSame(Complex.NaN, oneInf.sinh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69615);TestUtils.assertSame(Complex.NaN, oneNegInf.sinh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69616);TestUtils.assertSame(infInf, infOne.sinh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69617);TestUtils.assertSame(negInfInf, negInfOne.sinh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69618);TestUtils.assertSame(Complex.NaN, infInf.sinh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69619);TestUtils.assertSame(Complex.NaN, infNegInf.sinh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69620);TestUtils.assertSame(Complex.NaN, negInfInf.sinh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69621);TestUtils.assertSame(Complex.NaN, negInfNegInf.sinh());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSqrtRealPositive() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hm5psg1hpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSqrtRealPositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hm5psg1hpy(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69622);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69623);Complex z = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69624);Complex expected = new Complex(2, 1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69625);TestUtils.assertEquals(expected, z.sqrt(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSqrtRealZero() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mne8wv1hq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSqrtRealZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mne8wv1hq2(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69626);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69627);Complex z = new Complex(0.0, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69628);Complex expected = new Complex(1.41421, 1.41421);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69629);TestUtils.assertEquals(expected, z.sqrt(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSqrtRealNegative() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ulldg1hq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSqrtRealNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ulldg1hq6(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69630);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69631);Complex z = new Complex(-3.0, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69632);Complex expected = new Complex(1, 2);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69633);TestUtils.assertEquals(expected, z.sqrt(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSqrtImaginaryZero() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghn4dm1hqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSqrtImaginaryZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghn4dm1hqa(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69634);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69635);Complex z = new Complex(-3.0, 0.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69636);Complex expected = new Complex(0.0, 1.73205);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69637);TestUtils.assertEquals(expected, z.sqrt(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSqrtImaginaryNegative() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gkd4t1hqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSqrtImaginaryNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gkd4t1hqe(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69638);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69639);Complex z = new Complex(-3.0, -4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69640);Complex expected = new Complex(1.0, -2.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69641);TestUtils.assertEquals(expected, z.sqrt(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSqrtPolar() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vngib1hqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSqrtPolar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vngib1hqi(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69642);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69643);double r = 1;
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69644);for (int i = 0; (((i < 5)&&(__CLR4_4_11hb91hb9lb90pc6p.R.iget(69645)!=0|true))||(__CLR4_4_11hb91hb9lb90pc6p.R.iget(69646)==0&false)); i++) {{
            __CLR4_4_11hb91hb9lb90pc6p.R.inc(69647);r += i;
            __CLR4_4_11hb91hb9lb90pc6p.R.inc(69648);double theta = 0;
            __CLR4_4_11hb91hb9lb90pc6p.R.inc(69649);for (int j =0; (((j < 11)&&(__CLR4_4_11hb91hb9lb90pc6p.R.iget(69650)!=0|true))||(__CLR4_4_11hb91hb9lb90pc6p.R.iget(69651)==0&false)); j++) {{
                __CLR4_4_11hb91hb9lb90pc6p.R.inc(69652);theta += pi /12;
                __CLR4_4_11hb91hb9lb90pc6p.R.inc(69653);Complex z = ComplexUtils.polar2Complex(r, theta);
                __CLR4_4_11hb91hb9lb90pc6p.R.inc(69654);Complex sqrtz = ComplexUtils.polar2Complex(FastMath.sqrt(r), theta / 2);
                __CLR4_4_11hb91hb9lb90pc6p.R.inc(69655);TestUtils.assertEquals(sqrtz, z.sqrt(), 10e-12);
            }
        }}
    }}finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSqrtNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4mrkg1hqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSqrtNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4mrkg1hqw(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69656);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69657);Assert.assertTrue(Complex.NaN.sqrt().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSqrtInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jp3axi1hqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSqrtInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jp3axi1hqy(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69658);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69659);TestUtils.assertSame(infNaN, oneInf.sqrt());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69660);TestUtils.assertSame(infNaN, oneNegInf.sqrt());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69661);TestUtils.assertSame(infZero, infOne.sqrt());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69662);TestUtils.assertSame(zeroInf, negInfOne.sqrt());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69663);TestUtils.assertSame(infNaN, infInf.sqrt());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69664);TestUtils.assertSame(infNaN, infNegInf.sqrt());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69665);TestUtils.assertSame(nanInf, negInfInf.sqrt());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69666);TestUtils.assertSame(nanNegInf, negInfNegInf.sqrt());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSqrt1z() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vzq34u1hr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSqrt1z",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vzq34u1hr7(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69667);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69668);Complex z = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69669);Complex expected = new Complex(4.08033, -2.94094);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69670);TestUtils.assertEquals(expected, z.sqrt1z(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSqrt1zNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8cjnr1hrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSqrt1zNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8cjnr1hrb(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69671);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69672);Assert.assertTrue(Complex.NaN.sqrt1z().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testTan() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15n93x21hrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testTan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15n93x21hrd(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69673);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69674);Complex z = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69675);Complex expected = new Complex(-0.000187346, 0.999356);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69676);TestUtils.assertEquals(expected, z.tan(), 1.0e-5);
        /* Check that no overflow occurs (MATH-722) */
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69677);Complex actual = new Complex(3.0, 1E10).tan();
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69678);expected = new Complex(0, 1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69679);TestUtils.assertEquals(expected, actual, 1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69680);actual = new Complex(3.0, -1E10).tan();
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69681);expected = new Complex(0, -1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69682);TestUtils.assertEquals(expected, actual, 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testTanNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzvhjn1hrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testTanNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzvhjn1hrn(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69683);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69684);Assert.assertTrue(Complex.NaN.tan().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testTanInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147ihxj1hrp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testTanInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147ihxj1hrp(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69685);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69686);TestUtils.assertSame(Complex.valueOf(0.0, 1.0), oneInf.tan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69687);TestUtils.assertSame(Complex.valueOf(0.0, -1.0), oneNegInf.tan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69688);TestUtils.assertSame(Complex.NaN, infOne.tan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69689);TestUtils.assertSame(Complex.NaN, negInfOne.tan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69690);TestUtils.assertSame(Complex.NaN, infInf.tan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69691);TestUtils.assertSame(Complex.NaN, infNegInf.tan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69692);TestUtils.assertSame(Complex.NaN, negInfInf.tan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69693);TestUtils.assertSame(Complex.NaN, negInfNegInf.tan());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

   @Test
   public void testTanCritical() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aytrzp1hry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testTanCritical",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aytrzp1hry(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69694);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69695);TestUtils.assertSame(infNaN, new Complex(pi/2, 0).tan());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69696);TestUtils.assertSame(negInfNaN, new Complex(-pi/2, 0).tan());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testTanh() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvfj281hs1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testTanh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvfj281hs1(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69697);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69698);Complex z = new Complex(3, 4);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69699);Complex expected = new Complex(1.00071, 0.00490826);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69700);TestUtils.assertEquals(expected, z.tanh(), 1.0e-5);
        /* Check that no overflow occurs (MATH-722) */
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69701);Complex actual = new Complex(1E10, 3.0).tanh();
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69702);expected = new Complex(1, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69703);TestUtils.assertEquals(expected, actual, 1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69704);actual = new Complex(-1E10, 3.0).tanh();
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69705);expected = new Complex(-1, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69706);TestUtils.assertEquals(expected, actual, 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testTanhNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12fldbd1hsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testTanhNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12fldbd1hsb(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69707);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69708);Assert.assertTrue(Complex.NaN.tanh().isNaN());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testTanhInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrsm5t1hsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testTanhInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrsm5t1hsd(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69709);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69710);TestUtils.assertSame(Complex.NaN, oneInf.tanh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69711);TestUtils.assertSame(Complex.NaN, oneNegInf.tanh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69712);TestUtils.assertSame(Complex.valueOf(1.0, 0.0), infOne.tanh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69713);TestUtils.assertSame(Complex.valueOf(-1.0, 0.0), negInfOne.tanh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69714);TestUtils.assertSame(Complex.NaN, infInf.tanh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69715);TestUtils.assertSame(Complex.NaN, infNegInf.tanh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69716);TestUtils.assertSame(Complex.NaN, negInfInf.tanh());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69717);TestUtils.assertSame(Complex.NaN, negInfNegInf.tanh());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testTanhCritical() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tggnfj1hsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testTanhCritical",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tggnfj1hsm(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69718);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69719);TestUtils.assertSame(nanInf, new Complex(0, pi/2).tanh());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    /** test issue MATH-221 */
    @Test
    public void testMath221() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4c3361hso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testMath221",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4c3361hso(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69720);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69721);Assert.assertEquals(new Complex(0,-1), new Complex(0,1).multiply(new Complex(-1,0)));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    /**
     * Test: computing <b>third roots</b> of z.
     * <pre>
     * <code>
     * <b>z = -2 + 2 * i</b>
     *   => z_0 =  1      +          i
     *   => z_1 = -1.3660 + 0.3660 * i
     *   => z_2 =  0.3660 - 1.3660 * i
     * </code>
     * </pre>
     */
    @Test
    public void testNthRoot_normal_thirdRoot() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113xhvf1hsq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testNthRoot_normal_thirdRoot",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113xhvf1hsq(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69722);
        // The complex number we want to compute all third-roots for.
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69723);Complex z = new Complex(-2,2);
        // The List holding all third roots
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69724);Complex[] thirdRootsOfZ = z.nthRoot(3).toArray(new Complex[0]);
        // Returned Collection must not be empty!
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69725);Assert.assertEquals(3, thirdRootsOfZ.length);
        // test z_0
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69726);Assert.assertEquals(1.0,                  thirdRootsOfZ[0].getReal(),      1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69727);Assert.assertEquals(1.0,                  thirdRootsOfZ[0].getImaginary(), 1.0e-5);
        // test z_1
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69728);Assert.assertEquals(-1.3660254037844386,  thirdRootsOfZ[1].getReal(),      1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69729);Assert.assertEquals(0.36602540378443843,  thirdRootsOfZ[1].getImaginary(), 1.0e-5);
        // test z_2
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69730);Assert.assertEquals(0.366025403784439,    thirdRootsOfZ[2].getReal(),      1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69731);Assert.assertEquals(-1.3660254037844384,  thirdRootsOfZ[2].getImaginary(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}


    /**
     * Test: computing <b>fourth roots</b> of z.
     * <pre>
     * <code>
     * <b>z = 5 - 2 * i</b>
     *   => z_0 =  1.5164 - 0.1446 * i
     *   => z_1 =  0.1446 + 1.5164 * i
     *   => z_2 = -1.5164 + 0.1446 * i
     *   => z_3 = -1.5164 - 0.1446 * i
     * </code>
     * </pre>
     */
    @Test
    public void testNthRoot_normal_fourthRoot() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19896q61ht0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testNthRoot_normal_fourthRoot",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19896q61ht0(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69732);
        // The complex number we want to compute all third-roots for.
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69733);Complex z = new Complex(5,-2);
        // The List holding all fourth roots
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69734);Complex[] fourthRootsOfZ = z.nthRoot(4).toArray(new Complex[0]);
        // Returned Collection must not be empty!
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69735);Assert.assertEquals(4, fourthRootsOfZ.length);
        // test z_0
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69736);Assert.assertEquals(1.5164629308487783,     fourthRootsOfZ[0].getReal(),      1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69737);Assert.assertEquals(-0.14469266210702247,   fourthRootsOfZ[0].getImaginary(), 1.0e-5);
        // test z_1
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69738);Assert.assertEquals(0.14469266210702256,    fourthRootsOfZ[1].getReal(),      1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69739);Assert.assertEquals(1.5164629308487783,     fourthRootsOfZ[1].getImaginary(), 1.0e-5);
        // test z_2
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69740);Assert.assertEquals(-1.5164629308487783,    fourthRootsOfZ[2].getReal(),      1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69741);Assert.assertEquals(0.14469266210702267,    fourthRootsOfZ[2].getImaginary(), 1.0e-5);
        // test z_3
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69742);Assert.assertEquals(-0.14469266210702275,   fourthRootsOfZ[3].getReal(),      1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69743);Assert.assertEquals(-1.5164629308487783,    fourthRootsOfZ[3].getImaginary(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    /**
     * Test: computing <b>third roots</b> of z.
     * <pre>
     * <code>
     * <b>z = 8</b>
     *   => z_0 =  2
     *   => z_1 = -1 + 1.73205 * i
     *   => z_2 = -1 - 1.73205 * i
     * </code>
     * </pre>
     */
    @Test
    public void testNthRoot_cornercase_thirdRoot_imaginaryPartEmpty() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lo69e31htc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testNthRoot_cornercase_thirdRoot_imaginaryPartEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lo69e31htc(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69744);
        // The number 8 has three third roots. One we all already know is the number 2.
        // But there are two more complex roots.
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69745);Complex z = new Complex(8,0);
        // The List holding all third roots
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69746);Complex[] thirdRootsOfZ = z.nthRoot(3).toArray(new Complex[0]);
        // Returned Collection must not be empty!
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69747);Assert.assertEquals(3, thirdRootsOfZ.length);
        // test z_0
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69748);Assert.assertEquals(2.0,                thirdRootsOfZ[0].getReal(),      1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69749);Assert.assertEquals(0.0,                thirdRootsOfZ[0].getImaginary(), 1.0e-5);
        // test z_1
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69750);Assert.assertEquals(-1.0,               thirdRootsOfZ[1].getReal(),      1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69751);Assert.assertEquals(1.7320508075688774, thirdRootsOfZ[1].getImaginary(), 1.0e-5);
        // test z_2
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69752);Assert.assertEquals(-1.0,               thirdRootsOfZ[2].getReal(),      1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69753);Assert.assertEquals(-1.732050807568877, thirdRootsOfZ[2].getImaginary(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}


    /**
     * Test: computing <b>third roots</b> of z with real part 0.
     * <pre>
     * <code>
     * <b>z = 2 * i</b>
     *   => z_0 =  1.0911 + 0.6299 * i
     *   => z_1 = -1.0911 + 0.6299 * i
     *   => z_2 = -2.3144 - 1.2599 * i
     * </code>
     * </pre>
     */
    @Test
    public void testNthRoot_cornercase_thirdRoot_realPartZero() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kprghv1htm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testNthRoot_cornercase_thirdRoot_realPartZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kprghv1htm(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69754);
        // complex number with only imaginary part
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69755);Complex z = new Complex(0,2);
        // The List holding all third roots
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69756);Complex[] thirdRootsOfZ = z.nthRoot(3).toArray(new Complex[0]);
        // Returned Collection must not be empty!
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69757);Assert.assertEquals(3, thirdRootsOfZ.length);
        // test z_0
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69758);Assert.assertEquals(1.0911236359717216,      thirdRootsOfZ[0].getReal(),      1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69759);Assert.assertEquals(0.6299605249474365,      thirdRootsOfZ[0].getImaginary(), 1.0e-5);
        // test z_1
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69760);Assert.assertEquals(-1.0911236359717216,     thirdRootsOfZ[1].getReal(),      1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69761);Assert.assertEquals(0.6299605249474365,      thirdRootsOfZ[1].getImaginary(), 1.0e-5);
        // test z_2
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69762);Assert.assertEquals(-2.3144374213981936E-16, thirdRootsOfZ[2].getReal(),      1.0e-5);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69763);Assert.assertEquals(-1.2599210498948732,     thirdRootsOfZ[2].getImaginary(), 1.0e-5);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    /**
     * Test cornercases with NaN and Infinity.
     */
    @Test
    public void testNthRoot_cornercase_NAN_Inf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e28eix1htw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testNthRoot_cornercase_NAN_Inf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e28eix1htw(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69764);
        // NaN + finite -> NaN
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69765);List<Complex> roots = oneNaN.nthRoot(3);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69766);Assert.assertEquals(1,roots.size());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69767);Assert.assertEquals(Complex.NaN, roots.get(0));

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69768);roots = nanZero.nthRoot(3);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69769);Assert.assertEquals(1,roots.size());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69770);Assert.assertEquals(Complex.NaN, roots.get(0));

        // NaN + infinite -> NaN
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69771);roots = nanInf.nthRoot(3);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69772);Assert.assertEquals(1,roots.size());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69773);Assert.assertEquals(Complex.NaN, roots.get(0));

        // finite + infinite -> Inf
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69774);roots = oneInf.nthRoot(3);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69775);Assert.assertEquals(1,roots.size());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69776);Assert.assertEquals(Complex.INF, roots.get(0));

        // infinite + infinite -> Inf
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69777);roots = negInfInf.nthRoot(3);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69778);Assert.assertEquals(1,roots.size());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69779);Assert.assertEquals(Complex.INF, roots.get(0));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    /**
     * Test standard values
     */
    @Test
    public void testGetArgument() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uxsdy01huc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testGetArgument",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uxsdy01huc(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69780);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69781);Complex z = new Complex(1, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69782);Assert.assertEquals(0.0, z.getArgument(), 1.0e-12);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69783);z = new Complex(1, 1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69784);Assert.assertEquals(FastMath.PI/4, z.getArgument(), 1.0e-12);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69785);z = new Complex(0, 1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69786);Assert.assertEquals(FastMath.PI/2, z.getArgument(), 1.0e-12);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69787);z = new Complex(-1, 1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69788);Assert.assertEquals(3 * FastMath.PI/4, z.getArgument(), 1.0e-12);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69789);z = new Complex(-1, 0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69790);Assert.assertEquals(FastMath.PI, z.getArgument(), 1.0e-12);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69791);z = new Complex(-1, -1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69792);Assert.assertEquals(-3 * FastMath.PI/4, z.getArgument(), 1.0e-12);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69793);z = new Complex(0, -1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69794);Assert.assertEquals(-FastMath.PI/2, z.getArgument(), 1.0e-12);

        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69795);z = new Complex(1, -1);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69796);Assert.assertEquals(-FastMath.PI/4, z.getArgument(), 1.0e-12);

    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    /**
     * Verify atan2-style handling of infinite parts
     */
    @Test
    public void testGetArgumentInf() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15jmkvb1hut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testGetArgumentInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15jmkvb1hut(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69797);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69798);Assert.assertEquals(FastMath.PI/4, infInf.getArgument(), 1.0e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69799);Assert.assertEquals(FastMath.PI/2, oneInf.getArgument(), 1.0e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69800);Assert.assertEquals(0.0, infOne.getArgument(), 1.0e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69801);Assert.assertEquals(FastMath.PI/2, zeroInf.getArgument(), 1.0e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69802);Assert.assertEquals(0.0, infZero.getArgument(), 1.0e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69803);Assert.assertEquals(FastMath.PI, negInfOne.getArgument(), 1.0e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69804);Assert.assertEquals(-3.0*FastMath.PI/4, negInfNegInf.getArgument(), 1.0e-12);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69805);Assert.assertEquals(-FastMath.PI/2, oneNegInf.getArgument(), 1.0e-12);
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    /**
     * Verify that either part NaN results in NaN
     */
    @Test
    public void testGetArgumentNaN() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rr0kch1hv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testGetArgumentNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rr0kch1hv2(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69806);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69807);Assert.assertTrue(Double.isNaN(nanZero.getArgument()));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69808);Assert.assertTrue(Double.isNaN(zeroNaN.getArgument()));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69809);Assert.assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    @Test
    public void testSerial() {__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceStart(getClass().getName(),69810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv1hv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hb91hb9lb90pc6p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hb91hb9lb90pc6p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv1hv6(){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69810);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69811);Complex z = new Complex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69812);Assert.assertEquals(z, TestUtils.serializeAndRecover(z));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69813);Complex ncmplx = (Complex)TestUtils.serializeAndRecover(oneNaN);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69814);Assert.assertEquals(nanZero, ncmplx);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69815);Assert.assertTrue(ncmplx.isNaN());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69816);Complex infcmplx = (Complex)TestUtils.serializeAndRecover(infInf);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69817);Assert.assertEquals(infInf, infcmplx);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69818);Assert.assertTrue(infcmplx.isInfinite());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69819);TestComplex tz = new TestComplex(3.0, 4.0);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69820);Assert.assertEquals(tz, TestUtils.serializeAndRecover(tz));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69821);TestComplex ntcmplx = (TestComplex)TestUtils.serializeAndRecover(new TestComplex(oneNaN));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69822);Assert.assertEquals(nanZero, ntcmplx);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69823);Assert.assertTrue(ntcmplx.isNaN());
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69824);TestComplex inftcmplx = (TestComplex)TestUtils.serializeAndRecover(new TestComplex(infInf));
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69825);Assert.assertEquals(infInf, inftcmplx);
        __CLR4_4_11hb91hb9lb90pc6p.R.inc(69826);Assert.assertTrue(inftcmplx.isInfinite());
    }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    /**
     * Class to test extending Complex
     */
    public static class TestComplex extends Complex {

        /**
         * Serialization identifier.
         */
        private static final long serialVersionUID = 3268726724160389237L;

        public TestComplex(double real, double imaginary) {
            super(real, imaginary);__CLR4_4_11hb91hb9lb90pc6p.R.inc(69828);try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69827);
        }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

        public TestComplex(Complex other){
            this(other.getReal(), other.getImaginary());__CLR4_4_11hb91hb9lb90pc6p.R.inc(69830);try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69829);
        }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

        @Override
        protected TestComplex createComplex(double real, double imaginary){try{__CLR4_4_11hb91hb9lb90pc6p.R.inc(69831);
            __CLR4_4_11hb91hb9lb90pc6p.R.inc(69832);return new TestComplex(real, imaginary);
        }finally{__CLR4_4_11hb91hb9lb90pc6p.R.flushNeeded();}}

    }
}
