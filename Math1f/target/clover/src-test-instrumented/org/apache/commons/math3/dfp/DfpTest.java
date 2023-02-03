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

package org.apache.commons.math3.dfp;

import org.apache.commons.math3.ExtendedFieldElementAbstractTest;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DfpTest extends ExtendedFieldElementAbstractTest<Dfp> {static class __CLR4_4_11ih81ih8lb90pcab{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,71350,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected Dfp build(final double x) {try{__CLR4_4_11ih81ih8lb90pcab.R.inc(70604);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70605);return field.newDfp(x);
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    private DfpField field;
    private Dfp pinf;
    private Dfp ninf;
    private Dfp nan;
    private Dfp snan;
    private Dfp qnan;

    @Before
    public void setUp() {try{__CLR4_4_11ih81ih8lb90pcab.R.inc(70606);
        // Some basic setup.  Define some constants and clear the status flags
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70607);field = new DfpField(20);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70608);pinf = field.newDfp("1").divide(field.newDfp("0"));
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70609);ninf = field.newDfp("-1").divide(field.newDfp("0"));
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70610);nan = field.newDfp("0").divide(field.newDfp("0"));
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70611);snan = field.newDfp((byte)1, Dfp.SNAN);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70612);qnan = field.newDfp((byte)1, Dfp.QNAN);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70613);ninf.getField().clearIEEEFlags();
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_4_11ih81ih8lb90pcab.R.inc(70614);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70615);field = null;
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70616);pinf    = null;
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70617);ninf    = null;
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70618);nan     = null;
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70619);snan    = null;
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70620);qnan    = null;
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    // Generic test function.  Takes params x and y and tests them for
    // equality.  Then checks the status flags against the flags argument.
    // If the test fail, it prints the desc string
    private void test(Dfp x, Dfp y, int flags, String desc)
    {try{__CLR4_4_11ih81ih8lb90pcab.R.inc(70621);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70622);boolean b = x.equals(y);

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70623);if ((((!x.equals(y) && !x.unequal(y))&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70624)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70625)==0&false)))  // NaNs involved
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70626);b = (x.toString().equals(y.toString()));

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70627);if ((((x.equals(field.newDfp("0")))&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70628)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70629)==0&false)))  // distinguish +/- zero
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70630);b = (b && (x.toString().equals(y.toString())));

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70631);b = (b && x.getField().getIEEEFlags() == flags);

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70632);if ((((!b)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70633)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70634)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70635);Assert.assertTrue("assersion failed "+desc+" x = "+x.toString()+" flags = "+x.getField().getIEEEFlags(), b);

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70636);x.getField().clearIEEEFlags();
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testByteConstructor() {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),70637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0d3h51ii5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testByteConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0d3h51ii5(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(70637);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70638);Assert.assertEquals("0.", new Dfp(field, (byte) 0).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70639);Assert.assertEquals("1.", new Dfp(field, (byte) 1).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70640);Assert.assertEquals("-1.", new Dfp(field, (byte) -1).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70641);Assert.assertEquals("-128.", new Dfp(field, Byte.MIN_VALUE).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70642);Assert.assertEquals("127.", new Dfp(field, Byte.MAX_VALUE).toString());
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testIntConstructor() {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),70643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggb1b81iib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testIntConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggb1b81iib(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(70643);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70644);Assert.assertEquals("0.", new Dfp(field, 0).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70645);Assert.assertEquals("1.", new Dfp(field, 1).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70646);Assert.assertEquals("-1.", new Dfp(field, -1).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70647);Assert.assertEquals("1234567890.", new Dfp(field, 1234567890).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70648);Assert.assertEquals("-1234567890.", new Dfp(field, -1234567890).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70649);Assert.assertEquals("-2147483648.", new Dfp(field, Integer.MIN_VALUE).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70650);Assert.assertEquals("2147483647.", new Dfp(field, Integer.MAX_VALUE).toString());
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testLongConstructor() {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),70651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aaiogd1iij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testLongConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aaiogd1iij(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(70651);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70652);Assert.assertEquals("0.", new Dfp(field, 0l).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70653);Assert.assertEquals("1.", new Dfp(field, 1l).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70654);Assert.assertEquals("-1.", new Dfp(field, -1l).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70655);Assert.assertEquals("1234567890.", new Dfp(field, 1234567890l).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70656);Assert.assertEquals("-1234567890.", new Dfp(field, -1234567890l).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70657);Assert.assertEquals("-9223372036854775808.", new Dfp(field, Long.MIN_VALUE).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70658);Assert.assertEquals("9223372036854775807.", new Dfp(field, Long.MAX_VALUE).toString());
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    /*
     *  Test addition
     */
    @Test
    public void testAdd()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),70659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1iir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1iir(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(70659);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70660);test(field.newDfp("1").add(field.newDfp("1")),      // Basic tests   1+1 = 2
             field.newDfp("2"),
             0, "Add #1");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70661);test(field.newDfp("1").add(field.newDfp("-1")),     // 1 + (-1) = 0
             field.newDfp("0"),
             0, "Add #2");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70662);test(field.newDfp("-1").add(field.newDfp("1")),     // (-1) + 1 = 0
             field.newDfp("0"),
             0, "Add #3");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70663);test(field.newDfp("-1").add(field.newDfp("-1")),     // (-1) + (-1) = -2
             field.newDfp("-2"),
             0, "Add #4");

        // rounding mode is round half even

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70664);test(field.newDfp("1").add(field.newDfp("1e-16")),     // rounding on add
             field.newDfp("1.0000000000000001"),
             0, "Add #5");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70665);test(field.newDfp("1").add(field.newDfp("1e-17")),     // rounding on add
             field.newDfp("1"),
             DfpField.FLAG_INEXACT, "Add #6");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70666);test(field.newDfp("0.90999999999999999999").add(field.newDfp("0.1")),     // rounding on add
             field.newDfp("1.01"),
             DfpField.FLAG_INEXACT, "Add #7");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70667);test(field.newDfp(".10000000000000005000").add(field.newDfp(".9")),     // rounding on add
             field.newDfp("1."),
             DfpField.FLAG_INEXACT, "Add #8");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70668);test(field.newDfp(".10000000000000015000").add(field.newDfp(".9")),     // rounding on add
             field.newDfp("1.0000000000000002"),
             DfpField.FLAG_INEXACT, "Add #9");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70669);test(field.newDfp(".10000000000000014999").add(field.newDfp(".9")),     // rounding on add
             field.newDfp("1.0000000000000001"),
             DfpField.FLAG_INEXACT, "Add #10");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70670);test(field.newDfp(".10000000000000015001").add(field.newDfp(".9")),     // rounding on add
             field.newDfp("1.0000000000000002"),
             DfpField.FLAG_INEXACT, "Add #11");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70671);test(field.newDfp(".11111111111111111111").add(field.newDfp("11.1111111111111111")), // rounding on add
             field.newDfp("11.22222222222222222222"),
             DfpField.FLAG_INEXACT, "Add #12");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70672);test(field.newDfp(".11111111111111111111").add(field.newDfp("1111111111111111.1111")), // rounding on add
             field.newDfp("1111111111111111.2222"),
             DfpField.FLAG_INEXACT, "Add #13");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70673);test(field.newDfp(".11111111111111111111").add(field.newDfp("11111111111111111111")), // rounding on add
             field.newDfp("11111111111111111111"),
             DfpField.FLAG_INEXACT, "Add #14");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70674);test(field.newDfp("9.9999999999999999999e131071").add(field.newDfp("-1e131052")), // overflow on add
             field.newDfp("9.9999999999999999998e131071"),
             0, "Add #15");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70675);test(field.newDfp("9.9999999999999999999e131071").add(field.newDfp("1e131052")), // overflow on add
             pinf,
             DfpField.FLAG_OVERFLOW, "Add #16");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70676);test(field.newDfp("-9.9999999999999999999e131071").add(field.newDfp("-1e131052")), // overflow on add
             ninf,
             DfpField.FLAG_OVERFLOW, "Add #17");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70677);test(field.newDfp("-9.9999999999999999999e131071").add(field.newDfp("1e131052")), // overflow on add
             field.newDfp("-9.9999999999999999998e131071"),
             0, "Add #18");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70678);test(field.newDfp("1e-131072").add(field.newDfp("1e-131072")), // underflow on add
             field.newDfp("2e-131072"),
             0, "Add #19");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70679);test(field.newDfp("1.0000000000000001e-131057").add(field.newDfp("-1e-131057")), // underflow on add
             field.newDfp("1e-131073"),
             DfpField.FLAG_UNDERFLOW, "Add #20");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70680);test(field.newDfp("1.1e-131072").add(field.newDfp("-1e-131072")), // underflow on add
             field.newDfp("1e-131073"),
             DfpField.FLAG_UNDERFLOW, "Add #21");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70681);test(field.newDfp("1.0000000000000001e-131072").add(field.newDfp("-1e-131072")), // underflow on add
             field.newDfp("1e-131088"),
             DfpField.FLAG_UNDERFLOW, "Add #22");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70682);test(field.newDfp("1.0000000000000001e-131078").add(field.newDfp("-1e-131078")), // underflow on add
             field.newDfp("0"),
             DfpField.FLAG_UNDERFLOW, "Add #23");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70683);test(field.newDfp("1.0").add(field.newDfp("-1e-20")), // loss of precision on alignment?
             field.newDfp("0.99999999999999999999"),
             0, "Add #23.1");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70684);test(field.newDfp("-0.99999999999999999999").add(field.newDfp("1")), // proper normalization?
             field.newDfp("0.00000000000000000001"),
             0, "Add #23.2");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70685);test(field.newDfp("1").add(field.newDfp("0")), // adding zeros
             field.newDfp("1"),
             0, "Add #24");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70686);test(field.newDfp("0").add(field.newDfp("0")), // adding zeros
             field.newDfp("0"),
             0, "Add #25");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70687);test(field.newDfp("-0").add(field.newDfp("0")), // adding zeros
             field.newDfp("0"),
             0, "Add #26");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70688);test(field.newDfp("0").add(field.newDfp("-0")), // adding zeros
             field.newDfp("0"),
             0, "Add #27");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70689);test(field.newDfp("-0").add(field.newDfp("-0")), // adding zeros
             field.newDfp("-0"),
             0, "Add #28");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70690);test(field.newDfp("1e-20").add(field.newDfp("0")), // adding zeros
             field.newDfp("1e-20"),
             0, "Add #29");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70691);test(field.newDfp("1e-40").add(field.newDfp("0")), // adding zeros
             field.newDfp("1e-40"),
             0, "Add #30");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70692);test(pinf.add(ninf), // adding infinities
             nan,
             DfpField.FLAG_INVALID, "Add #31");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70693);test(ninf.add(pinf), // adding infinities
             nan,
             DfpField.FLAG_INVALID, "Add #32");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70694);test(ninf.add(ninf), // adding infinities
             ninf,
             0, "Add #33");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70695);test(pinf.add(pinf), // adding infinities
             pinf,
             0, "Add #34");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70696);test(pinf.add(field.newDfp("0")), // adding infinities
             pinf,
             0, "Add #35");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70697);test(pinf.add(field.newDfp("-1e131071")), // adding infinities
             pinf,
             0, "Add #36");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70698);test(pinf.add(field.newDfp("1e131071")), // adding infinities
             pinf,
             0, "Add #37");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70699);test(field.newDfp("0").add(pinf), // adding infinities
             pinf,
             0, "Add #38");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70700);test(field.newDfp("-1e131071").add(pinf), // adding infinities
             pinf,
             0, "Add #39");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70701);test(field.newDfp("1e131071").add(pinf), // adding infinities
             pinf,
             0, "Add #40");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70702);test(ninf.add(field.newDfp("0")), // adding infinities
             ninf,
             0, "Add #41");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70703);test(ninf.add(field.newDfp("-1e131071")), // adding infinities
             ninf,
             0, "Add #42");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70704);test(ninf.add(field.newDfp("1e131071")), // adding infinities
             ninf,
             0, "Add #43");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70705);test(field.newDfp("0").add(ninf), // adding infinities
             ninf,
             0, "Add #44");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70706);test(field.newDfp("-1e131071").add(ninf), // adding infinities
             ninf,
             0, "Add #45");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70707);test(field.newDfp("1e131071").add(ninf), // adding infinities
             ninf,
             0, "Add #46");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70708);test(field.newDfp("9.9999999999999999999e131071").add(field.newDfp("5e131051")),  // overflow
             pinf,
             DfpField.FLAG_OVERFLOW, "Add #47");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70709);test(field.newDfp("9.9999999999999999999e131071").add(field.newDfp("4.9999999999999999999e131051")),  // overflow
             field.newDfp("9.9999999999999999999e131071"),
             DfpField.FLAG_INEXACT, "Add #48");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70710);test(nan.add(field.newDfp("1")),
             nan,
             0, "Add #49");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70711);test(field.newDfp("1").add(nan),
             nan,
             0, "Add #50");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70712);test(field.newDfp("12345678123456781234").add(field.newDfp("0.12345678123456781234")),
             field.newDfp("12345678123456781234"),
             DfpField.FLAG_INEXACT, "Add #51");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70713);test(field.newDfp("12345678123456781234").add(field.newDfp("123.45678123456781234")),
             field.newDfp("12345678123456781357"),
             DfpField.FLAG_INEXACT, "Add #52");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70714);test(field.newDfp("123.45678123456781234").add(field.newDfp("12345678123456781234")),
             field.newDfp("12345678123456781357"),
             DfpField.FLAG_INEXACT, "Add #53");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70715);test(field.newDfp("12345678123456781234").add(field.newDfp(".00001234567812345678")),
             field.newDfp("12345678123456781234"),
             DfpField.FLAG_INEXACT, "Add #54");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70716);test(field.newDfp("12345678123456781234").add(field.newDfp(".00000000123456781234")),
             field.newDfp("12345678123456781234"),
             DfpField.FLAG_INEXACT, "Add #55");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70717);test(field.newDfp("-0").add(field.newDfp("-0")),
             field.newDfp("-0"),
             0, "Add #56");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70718);test(field.newDfp("0").add(field.newDfp("-0")),
             field.newDfp("0"),
             0, "Add #57");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70719);test(field.newDfp("-0").add(field.newDfp("0")),
             field.newDfp("0"),
             0, "Add #58");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70720);test(field.newDfp("0").add(field.newDfp("0")),
             field.newDfp("0"),
             0, "Add #59");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Test comparisons

    // utility function to help test comparisons
    private void cmptst(Dfp a, Dfp b, String op, boolean result, double num)
    {try{__CLR4_4_11ih81ih8lb90pcab.R.inc(70721);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70722);if ((((op == "equal")&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70723)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70724)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70725);if ((((a.equals(b) != result)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70726)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70727)==0&false)))
                {__CLR4_4_11ih81ih8lb90pcab.R.inc(70728);Assert.fail("assersion failed.  "+op+" compare #"+num);

        }}__CLR4_4_11ih81ih8lb90pcab.R.inc(70729);if ((((op == "unequal")&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70730)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70731)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70732);if ((((a.unequal(b) != result)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70733)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70734)==0&false)))
                {__CLR4_4_11ih81ih8lb90pcab.R.inc(70735);Assert.fail("assersion failed.  "+op+" compare #"+num);

        }}__CLR4_4_11ih81ih8lb90pcab.R.inc(70736);if ((((op == "lessThan")&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70737)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70738)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70739);if ((((a.lessThan(b) != result)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70740)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70741)==0&false)))
                {__CLR4_4_11ih81ih8lb90pcab.R.inc(70742);Assert.fail("assersion failed.  "+op+" compare #"+num);

        }}__CLR4_4_11ih81ih8lb90pcab.R.inc(70743);if ((((op == "greaterThan")&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70744)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70745)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70746);if ((((a.greaterThan(b) != result)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70747)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70748)==0&false)))
                {__CLR4_4_11ih81ih8lb90pcab.R.inc(70749);Assert.fail("assersion failed.  "+op+" compare #"+num);
    }}}finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void  testCompare()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),70750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18o8au21ila();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testCompare",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18o8au21ila(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(70750);
        // test equal() comparison
        // check zero vs. zero
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70751);field.clearIEEEFlags();

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70752);cmptst(field.newDfp("0"), field.newDfp("0"), "equal", true, 1);         // 0 == 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70753);cmptst(field.newDfp("0"), field.newDfp("-0"), "equal", true, 2);        // 0 == -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70754);cmptst(field.newDfp("-0"), field.newDfp("-0"), "equal", true, 3);       // -0 == -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70755);cmptst(field.newDfp("-0"), field.newDfp("0"), "equal", true, 4);        // -0 == 0

        // check zero vs normal numbers

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70756);cmptst(field.newDfp("0"), field.newDfp("1"), "equal", false, 5);         // 0 == 1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70757);cmptst(field.newDfp("1"), field.newDfp("0"), "equal", false, 6);         // 1 == 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70758);cmptst(field.newDfp("-1"), field.newDfp("0"), "equal", false, 7);        // -1 == 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70759);cmptst(field.newDfp("0"), field.newDfp("-1"), "equal", false, 8);        // 0 == -1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70760);cmptst(field.newDfp("0"), field.newDfp("1e-131072"), "equal", false, 9); // 0 == 1e-131072
        // check flags
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70761);if ((((field.getIEEEFlags() != 0)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70762)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70763)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70764);Assert.fail("assersion failed.  compare flags = "+field.getIEEEFlags());

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70765);cmptst(field.newDfp("0"), field.newDfp("1e-131078"), "equal", false, 10); // 0 == 1e-131078

        // check flags  -- underflow should be set
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70766);if ((((field.getIEEEFlags() != DfpField.FLAG_UNDERFLOW)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70767)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70768)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70769);Assert.fail("assersion failed.  compare flags = "+field.getIEEEFlags());

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70770);field.clearIEEEFlags();

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70771);cmptst(field.newDfp("0"), field.newDfp("1e+131071"), "equal", false, 11); // 0 == 1e+131071

        // check zero vs infinities

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70772);cmptst(field.newDfp("0"), pinf, "equal", false, 12);    // 0 == pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70773);cmptst(field.newDfp("0"), ninf, "equal", false, 13);    // 0 == ninf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70774);cmptst(field.newDfp("-0"), pinf, "equal", false, 14);   // -0 == pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70775);cmptst(field.newDfp("-0"), ninf, "equal", false, 15);   // -0 == ninf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70776);cmptst(pinf, field.newDfp("0"), "equal", false, 16);    // pinf == 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70777);cmptst(ninf, field.newDfp("0"), "equal", false, 17);    // ninf == 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70778);cmptst(pinf, field.newDfp("-0"), "equal", false, 18);   // pinf == -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70779);cmptst(ninf, field.newDfp("-0"), "equal", false, 19);   // ninf == -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70780);cmptst(ninf, pinf, "equal", false, 19.10);     // ninf == pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70781);cmptst(pinf, ninf, "equal", false, 19.11);     // pinf == ninf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70782);cmptst(pinf, pinf, "equal", true, 19.12);     // pinf == pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70783);cmptst(ninf, ninf, "equal", true, 19.13);     // ninf == ninf

        // check some normal numbers
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70784);cmptst(field.newDfp("1"), field.newDfp("1"), "equal", true, 20);   // 1 == 1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70785);cmptst(field.newDfp("1"), field.newDfp("-1"), "equal", false, 21);   // 1 == -1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70786);cmptst(field.newDfp("-1"), field.newDfp("-1"), "equal", true, 22);   // -1 == -1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70787);cmptst(field.newDfp("1"), field.newDfp("1.0000000000000001"), "equal", false, 23);   // 1 == 1.0000000000000001

        // The tests below checks to ensure that comparisons don't set FLAG_INEXACT
        // 100000 == 1.0000000000000001
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70788);cmptst(field.newDfp("1e20"), field.newDfp("1.0000000000000001"), "equal", false, 24);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70789);if ((((field.getIEEEFlags() != 0)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70790)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70791)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70792);Assert.fail("assersion failed.  compare flags = "+field.getIEEEFlags());

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70793);cmptst(field.newDfp("0.000001"), field.newDfp("1e-6"), "equal", true, 25);

        // check some nans -- nans shouldnt equal anything

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70794);cmptst(snan, snan, "equal", false, 27);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70795);cmptst(qnan, qnan, "equal", false, 28);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70796);cmptst(snan, qnan, "equal", false, 29);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70797);cmptst(qnan, snan, "equal", false, 30);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70798);cmptst(qnan, field.newDfp("0"), "equal", false, 31);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70799);cmptst(snan, field.newDfp("0"), "equal", false, 32);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70800);cmptst(field.newDfp("0"), snan, "equal", false, 33);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70801);cmptst(field.newDfp("0"), qnan, "equal", false, 34);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70802);cmptst(qnan, pinf, "equal", false, 35);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70803);cmptst(snan, pinf, "equal", false, 36);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70804);cmptst(pinf, snan, "equal", false, 37);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70805);cmptst(pinf, qnan, "equal", false, 38);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70806);cmptst(qnan, ninf, "equal", false, 39);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70807);cmptst(snan, ninf, "equal", false, 40);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70808);cmptst(ninf, snan, "equal", false, 41);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70809);cmptst(ninf, qnan, "equal", false, 42);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70810);cmptst(qnan, field.newDfp("-1"), "equal", false, 43);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70811);cmptst(snan, field.newDfp("-1"), "equal", false, 44);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70812);cmptst(field.newDfp("-1"), snan, "equal", false, 45);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70813);cmptst(field.newDfp("-1"), qnan, "equal", false, 46);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70814);cmptst(qnan, field.newDfp("1"), "equal", false, 47);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70815);cmptst(snan, field.newDfp("1"), "equal", false, 48);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70816);cmptst(field.newDfp("1"), snan, "equal", false, 49);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70817);cmptst(field.newDfp("1"), qnan, "equal", false, 50);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70818);cmptst(snan.negate(), snan, "equal", false, 51);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70819);cmptst(qnan.negate(), qnan, "equal", false, 52);

        //
        // Tests for un equal  -- do it all over again
        //

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70820);cmptst(field.newDfp("0"), field.newDfp("0"), "unequal", false, 1);         // 0 == 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70821);cmptst(field.newDfp("0"), field.newDfp("-0"), "unequal", false, 2);        // 0 == -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70822);cmptst(field.newDfp("-0"), field.newDfp("-0"), "unequal", false, 3);       // -0 == -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70823);cmptst(field.newDfp("-0"), field.newDfp("0"), "unequal", false, 4);        // -0 == 0

        // check zero vs normal numbers

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70824);cmptst(field.newDfp("0"), field.newDfp("1"), "unequal", true, 5);         // 0 == 1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70825);cmptst(field.newDfp("1"), field.newDfp("0"), "unequal", true, 6);         // 1 == 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70826);cmptst(field.newDfp("-1"), field.newDfp("0"), "unequal", true, 7);        // -1 == 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70827);cmptst(field.newDfp("0"), field.newDfp("-1"), "unequal", true, 8);        // 0 == -1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70828);cmptst(field.newDfp("0"), field.newDfp("1e-131072"), "unequal", true, 9); // 0 == 1e-131072
        // check flags
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70829);if ((((field.getIEEEFlags() != 0)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70830)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70831)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70832);Assert.fail("assersion failed.  compare flags = "+field.getIEEEFlags());

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70833);cmptst(field.newDfp("0"), field.newDfp("1e-131078"), "unequal", true, 10); // 0 == 1e-131078

        // check flags  -- underflow should be set
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70834);if ((((field.getIEEEFlags() != DfpField.FLAG_UNDERFLOW)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70835)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70836)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70837);Assert.fail("assersion failed.  compare flags = "+field.getIEEEFlags());

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70838);field.clearIEEEFlags();

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70839);cmptst(field.newDfp("0"), field.newDfp("1e+131071"), "unequal", true, 11); // 0 == 1e+131071

        // check zero vs infinities

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70840);cmptst(field.newDfp("0"), pinf, "unequal", true, 12);    // 0 == pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70841);cmptst(field.newDfp("0"), ninf, "unequal", true, 13);    // 0 == ninf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70842);cmptst(field.newDfp("-0"), pinf, "unequal", true, 14);   // -0 == pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70843);cmptst(field.newDfp("-0"), ninf, "unequal", true, 15);   // -0 == ninf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70844);cmptst(pinf, field.newDfp("0"), "unequal", true, 16);    // pinf == 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70845);cmptst(ninf, field.newDfp("0"), "unequal", true, 17);    // ninf == 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70846);cmptst(pinf, field.newDfp("-0"), "unequal", true, 18);   // pinf == -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70847);cmptst(ninf, field.newDfp("-0"), "unequal", true, 19);   // ninf == -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70848);cmptst(ninf, pinf, "unequal", true, 19.10);     // ninf == pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70849);cmptst(pinf, ninf, "unequal", true, 19.11);     // pinf == ninf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70850);cmptst(pinf, pinf, "unequal", false, 19.12);     // pinf == pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70851);cmptst(ninf, ninf, "unequal", false, 19.13);     // ninf == ninf

        // check some normal numbers
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70852);cmptst(field.newDfp("1"), field.newDfp("1"), "unequal", false, 20);   // 1 == 1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70853);cmptst(field.newDfp("1"), field.newDfp("-1"), "unequal", true, 21);   // 1 == -1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70854);cmptst(field.newDfp("-1"), field.newDfp("-1"), "unequal", false, 22);   // -1 == -1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70855);cmptst(field.newDfp("1"), field.newDfp("1.0000000000000001"), "unequal", true, 23);   // 1 == 1.0000000000000001

        // The tests below checks to ensure that comparisons don't set FLAG_INEXACT
        // 100000 == 1.0000000000000001
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70856);cmptst(field.newDfp("1e20"), field.newDfp("1.0000000000000001"), "unequal", true, 24);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70857);if ((((field.getIEEEFlags() != 0)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70858)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70859)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70860);Assert.fail("assersion failed.  compare flags = "+field.getIEEEFlags());

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70861);cmptst(field.newDfp("0.000001"), field.newDfp("1e-6"), "unequal", false, 25);

        // check some nans -- nans shouldnt be unequal to anything

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70862);cmptst(snan, snan, "unequal", false, 27);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70863);cmptst(qnan, qnan, "unequal", false, 28);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70864);cmptst(snan, qnan, "unequal", false, 29);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70865);cmptst(qnan, snan, "unequal", false, 30);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70866);cmptst(qnan, field.newDfp("0"), "unequal", false, 31);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70867);cmptst(snan, field.newDfp("0"), "unequal", false, 32);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70868);cmptst(field.newDfp("0"), snan, "unequal", false, 33);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70869);cmptst(field.newDfp("0"), qnan, "unequal", false, 34);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70870);cmptst(qnan, pinf, "unequal", false, 35);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70871);cmptst(snan, pinf, "unequal", false, 36);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70872);cmptst(pinf, snan, "unequal", false, 37);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70873);cmptst(pinf, qnan, "unequal", false, 38);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70874);cmptst(qnan, ninf, "unequal", false, 39);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70875);cmptst(snan, ninf, "unequal", false, 40);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70876);cmptst(ninf, snan, "unequal", false, 41);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70877);cmptst(ninf, qnan, "unequal", false, 42);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70878);cmptst(qnan, field.newDfp("-1"), "unequal", false, 43);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70879);cmptst(snan, field.newDfp("-1"), "unequal", false, 44);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70880);cmptst(field.newDfp("-1"), snan, "unequal", false, 45);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70881);cmptst(field.newDfp("-1"), qnan, "unequal", false, 46);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70882);cmptst(qnan, field.newDfp("1"), "unequal", false, 47);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70883);cmptst(snan, field.newDfp("1"), "unequal", false, 48);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70884);cmptst(field.newDfp("1"), snan, "unequal", false, 49);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70885);cmptst(field.newDfp("1"), qnan, "unequal", false, 50);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70886);cmptst(snan.negate(), snan, "unequal", false, 51);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70887);cmptst(qnan.negate(), qnan, "unequal", false, 52);

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70888);if ((((field.getIEEEFlags() != 0)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70889)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70890)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70891);Assert.fail("assersion failed.  compare unequal flags = "+field.getIEEEFlags());

        //
        // Tests for lessThan  -- do it all over again
        //

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70892);cmptst(field.newDfp("0"), field.newDfp("0"), "lessThan", false, 1);         // 0 < 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70893);cmptst(field.newDfp("0"), field.newDfp("-0"), "lessThan", false, 2);        // 0 < -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70894);cmptst(field.newDfp("-0"), field.newDfp("-0"), "lessThan", false, 3);       // -0 < -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70895);cmptst(field.newDfp("-0"), field.newDfp("0"), "lessThan", false, 4);        // -0 < 0

        // check zero vs normal numbers

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70896);cmptst(field.newDfp("0"), field.newDfp("1"), "lessThan", true, 5);         // 0 < 1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70897);cmptst(field.newDfp("1"), field.newDfp("0"), "lessThan", false, 6);         // 1 < 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70898);cmptst(field.newDfp("-1"), field.newDfp("0"), "lessThan", true, 7);        // -1 < 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70899);cmptst(field.newDfp("0"), field.newDfp("-1"), "lessThan", false, 8);        // 0 < -1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70900);cmptst(field.newDfp("0"), field.newDfp("1e-131072"), "lessThan", true, 9); // 0 < 1e-131072
        // check flags
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70901);if ((((field.getIEEEFlags() != 0)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70902)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70903)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70904);Assert.fail("assersion failed.  compare flags = "+field.getIEEEFlags());

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70905);cmptst(field.newDfp("0"), field.newDfp("1e-131078"), "lessThan", true, 10); // 0 < 1e-131078

        // check flags  -- underflow should be set
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70906);if ((((field.getIEEEFlags() != DfpField.FLAG_UNDERFLOW)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70907)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70908)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70909);Assert.fail("assersion failed.  compare flags = "+field.getIEEEFlags());
        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70910);field.clearIEEEFlags();

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70911);cmptst(field.newDfp("0"), field.newDfp("1e+131071"), "lessThan", true, 11); // 0 < 1e+131071

        // check zero vs infinities

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70912);cmptst(field.newDfp("0"), pinf, "lessThan", true, 12);    // 0 < pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70913);cmptst(field.newDfp("0"), ninf, "lessThan", false, 13);    // 0 < ninf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70914);cmptst(field.newDfp("-0"), pinf, "lessThan", true, 14);   // -0 < pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70915);cmptst(field.newDfp("-0"), ninf, "lessThan", false, 15);   // -0 < ninf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70916);cmptst(pinf, field.newDfp("0"), "lessThan", false, 16);    // pinf < 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70917);cmptst(ninf, field.newDfp("0"), "lessThan", true, 17);    // ninf < 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70918);cmptst(pinf, field.newDfp("-0"), "lessThan", false, 18);   // pinf < -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70919);cmptst(ninf, field.newDfp("-0"), "lessThan", true, 19);   // ninf < -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70920);cmptst(ninf, pinf, "lessThan", true, 19.10);     // ninf < pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70921);cmptst(pinf, ninf, "lessThan", false, 19.11);     // pinf < ninf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70922);cmptst(pinf, pinf, "lessThan", false, 19.12);     // pinf < pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70923);cmptst(ninf, ninf, "lessThan", false, 19.13);     // ninf < ninf

        // check some normal numbers
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70924);cmptst(field.newDfp("1"), field.newDfp("1"), "lessThan", false, 20);   // 1 < 1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70925);cmptst(field.newDfp("1"), field.newDfp("-1"), "lessThan", false, 21);   // 1 < -1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70926);cmptst(field.newDfp("-1"), field.newDfp("-1"), "lessThan", false, 22);   // -1 < -1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70927);cmptst(field.newDfp("1"), field.newDfp("1.0000000000000001"), "lessThan", true, 23);   // 1 < 1.0000000000000001

        // The tests below checks to ensure that comparisons don't set FLAG_INEXACT
        // 100000 < 1.0000000000000001
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70928);cmptst(field.newDfp("1e20"), field.newDfp("1.0000000000000001"), "lessThan", false, 24);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70929);if ((((field.getIEEEFlags() != 0)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70930)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70931)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70932);Assert.fail("assersion failed.  compare flags = "+field.getIEEEFlags());

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70933);cmptst(field.newDfp("0.000001"), field.newDfp("1e-6"), "lessThan", false, 25);

        // check some nans -- nans shouldnt be lessThan to anything
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70934);cmptst(snan, snan, "lessThan", false, 27);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70935);cmptst(qnan, qnan, "lessThan", false, 28);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70936);cmptst(snan, qnan, "lessThan", false, 29);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70937);cmptst(qnan, snan, "lessThan", false, 30);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70938);cmptst(qnan, field.newDfp("0"), "lessThan", false, 31);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70939);cmptst(snan, field.newDfp("0"), "lessThan", false, 32);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70940);cmptst(field.newDfp("0"), snan, "lessThan", false, 33);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70941);cmptst(field.newDfp("0"), qnan, "lessThan", false, 34);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70942);cmptst(qnan, pinf, "lessThan", false, 35);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70943);cmptst(snan, pinf, "lessThan", false, 36);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70944);cmptst(pinf, snan, "lessThan", false, 37);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70945);cmptst(pinf, qnan, "lessThan", false, 38);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70946);cmptst(qnan, ninf, "lessThan", false, 39);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70947);cmptst(snan, ninf, "lessThan", false, 40);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70948);cmptst(ninf, snan, "lessThan", false, 41);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70949);cmptst(ninf, qnan, "lessThan", false, 42);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70950);cmptst(qnan, field.newDfp("-1"), "lessThan", false, 43);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70951);cmptst(snan, field.newDfp("-1"), "lessThan", false, 44);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70952);cmptst(field.newDfp("-1"), snan, "lessThan", false, 45);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70953);cmptst(field.newDfp("-1"), qnan, "lessThan", false, 46);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70954);cmptst(qnan, field.newDfp("1"), "lessThan", false, 47);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70955);cmptst(snan, field.newDfp("1"), "lessThan", false, 48);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70956);cmptst(field.newDfp("1"), snan, "lessThan", false, 49);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70957);cmptst(field.newDfp("1"), qnan, "lessThan", false, 50);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70958);cmptst(snan.negate(), snan, "lessThan", false, 51);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70959);cmptst(qnan.negate(), qnan, "lessThan", false, 52);

        //lessThan compares with nans should raise FLAG_INVALID
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70960);if ((((field.getIEEEFlags() != DfpField.FLAG_INVALID)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70961)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70962)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70963);Assert.fail("assersion failed.  compare lessThan flags = "+field.getIEEEFlags());
        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70964);field.clearIEEEFlags();

        //
        // Tests for greaterThan  -- do it all over again
        //

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70965);cmptst(field.newDfp("0"), field.newDfp("0"), "greaterThan", false, 1);         // 0 > 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70966);cmptst(field.newDfp("0"), field.newDfp("-0"), "greaterThan", false, 2);        // 0 > -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70967);cmptst(field.newDfp("-0"), field.newDfp("-0"), "greaterThan", false, 3);       // -0 > -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70968);cmptst(field.newDfp("-0"), field.newDfp("0"), "greaterThan", false, 4);        // -0 > 0

        // check zero vs normal numbers

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70969);cmptst(field.newDfp("0"), field.newDfp("1"), "greaterThan", false, 5);         // 0 > 1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70970);cmptst(field.newDfp("1"), field.newDfp("0"), "greaterThan", true, 6);         // 1 > 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70971);cmptst(field.newDfp("-1"), field.newDfp("0"), "greaterThan", false, 7);        // -1 > 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70972);cmptst(field.newDfp("0"), field.newDfp("-1"), "greaterThan", true, 8);        // 0 > -1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70973);cmptst(field.newDfp("0"), field.newDfp("1e-131072"), "greaterThan", false, 9); // 0 > 1e-131072
        // check flags
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70974);if ((((field.getIEEEFlags() != 0)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70975)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70976)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70977);Assert.fail("assersion failed.  compare flags = "+field.getIEEEFlags());

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70978);cmptst(field.newDfp("0"), field.newDfp("1e-131078"), "greaterThan", false, 10); // 0 > 1e-131078

        // check flags  -- underflow should be set
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70979);if ((((field.getIEEEFlags() != DfpField.FLAG_UNDERFLOW)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(70980)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(70981)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(70982);Assert.fail("assersion failed.  compare flags = "+field.getIEEEFlags());
        }__CLR4_4_11ih81ih8lb90pcab.R.inc(70983);field.clearIEEEFlags();

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70984);cmptst(field.newDfp("0"), field.newDfp("1e+131071"), "greaterThan", false, 11); // 0 > 1e+131071

        // check zero vs infinities

        __CLR4_4_11ih81ih8lb90pcab.R.inc(70985);cmptst(field.newDfp("0"), pinf, "greaterThan", false, 12);    // 0 > pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70986);cmptst(field.newDfp("0"), ninf, "greaterThan", true, 13);    // 0 > ninf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70987);cmptst(field.newDfp("-0"), pinf, "greaterThan", false, 14);   // -0 > pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70988);cmptst(field.newDfp("-0"), ninf, "greaterThan", true, 15);   // -0 > ninf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70989);cmptst(pinf, field.newDfp("0"), "greaterThan", true, 16);    // pinf > 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70990);cmptst(ninf, field.newDfp("0"), "greaterThan", false, 17);    // ninf > 0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70991);cmptst(pinf, field.newDfp("-0"), "greaterThan", true, 18);   // pinf > -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70992);cmptst(ninf, field.newDfp("-0"), "greaterThan", false, 19);   // ninf > -0
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70993);cmptst(ninf, pinf, "greaterThan", false, 19.10);     // ninf > pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70994);cmptst(pinf, ninf, "greaterThan", true, 19.11);     // pinf > ninf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70995);cmptst(pinf, pinf, "greaterThan", false, 19.12);     // pinf > pinf
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70996);cmptst(ninf, ninf, "greaterThan", false, 19.13);     // ninf > ninf

        // check some normal numbers
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70997);cmptst(field.newDfp("1"), field.newDfp("1"), "greaterThan", false, 20);   // 1 > 1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70998);cmptst(field.newDfp("1"), field.newDfp("-1"), "greaterThan", true, 21);   // 1 > -1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(70999);cmptst(field.newDfp("-1"), field.newDfp("-1"), "greaterThan", false, 22);   // -1 > -1
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71000);cmptst(field.newDfp("1"), field.newDfp("1.0000000000000001"), "greaterThan", false, 23);   // 1 > 1.0000000000000001

        // The tests below checks to ensure that comparisons don't set FLAG_INEXACT
        // 100000 > 1.0000000000000001
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71001);cmptst(field.newDfp("1e20"), field.newDfp("1.0000000000000001"), "greaterThan", true, 24);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71002);if ((((field.getIEEEFlags() != 0)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(71003)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(71004)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(71005);Assert.fail("assersion failed.  compare flags = "+field.getIEEEFlags());

        }__CLR4_4_11ih81ih8lb90pcab.R.inc(71006);cmptst(field.newDfp("0.000001"), field.newDfp("1e-6"), "greaterThan", false, 25);

        // check some nans -- nans shouldnt be greaterThan to anything
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71007);cmptst(snan, snan, "greaterThan", false, 27);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71008);cmptst(qnan, qnan, "greaterThan", false, 28);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71009);cmptst(snan, qnan, "greaterThan", false, 29);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71010);cmptst(qnan, snan, "greaterThan", false, 30);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71011);cmptst(qnan, field.newDfp("0"), "greaterThan", false, 31);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71012);cmptst(snan, field.newDfp("0"), "greaterThan", false, 32);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71013);cmptst(field.newDfp("0"), snan, "greaterThan", false, 33);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71014);cmptst(field.newDfp("0"), qnan, "greaterThan", false, 34);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71015);cmptst(qnan, pinf, "greaterThan", false, 35);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71016);cmptst(snan, pinf, "greaterThan", false, 36);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71017);cmptst(pinf, snan, "greaterThan", false, 37);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71018);cmptst(pinf, qnan, "greaterThan", false, 38);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71019);cmptst(qnan, ninf, "greaterThan", false, 39);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71020);cmptst(snan, ninf, "greaterThan", false, 40);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71021);cmptst(ninf, snan, "greaterThan", false, 41);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71022);cmptst(ninf, qnan, "greaterThan", false, 42);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71023);cmptst(qnan, field.newDfp("-1"), "greaterThan", false, 43);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71024);cmptst(snan, field.newDfp("-1"), "greaterThan", false, 44);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71025);cmptst(field.newDfp("-1"), snan, "greaterThan", false, 45);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71026);cmptst(field.newDfp("-1"), qnan, "greaterThan", false, 46);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71027);cmptst(qnan, field.newDfp("1"), "greaterThan", false, 47);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71028);cmptst(snan, field.newDfp("1"), "greaterThan", false, 48);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71029);cmptst(field.newDfp("1"), snan, "greaterThan", false, 49);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71030);cmptst(field.newDfp("1"), qnan, "greaterThan", false, 50);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71031);cmptst(snan.negate(), snan, "greaterThan", false, 51);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71032);cmptst(qnan.negate(), qnan, "greaterThan", false, 52);

        //greaterThan compares with nans should raise FLAG_INVALID
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71033);if ((((field.getIEEEFlags() != DfpField.FLAG_INVALID)&&(__CLR4_4_11ih81ih8lb90pcab.R.iget(71034)!=0|true))||(__CLR4_4_11ih81ih8lb90pcab.R.iget(71035)==0&false)))
            {__CLR4_4_11ih81ih8lb90pcab.R.inc(71036);Assert.fail("assersion failed.  compare greaterThan flags = "+field.getIEEEFlags());
        }__CLR4_4_11ih81ih8lb90pcab.R.inc(71037);field.clearIEEEFlags();
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    //
    // Test multiplication
    //
    @Test
    public void testMultiply()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn1ita();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn1ita(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71038);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71039);test(field.newDfp("1").multiply(field.newDfp("1")),      // Basic tests   1*1 = 1
             field.newDfp("1"),
             0, "Multiply #1");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71040);test(field.newDfp("1").multiply(1),             // Basic tests   1*1 = 1
             field.newDfp("1"),
             0, "Multiply #2");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71041);test(field.newDfp("-1").multiply(field.newDfp("1")),     // Basic tests   -1*1 = -1
             field.newDfp("-1"),
             0, "Multiply #3");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71042);test(field.newDfp("-1").multiply(1),            // Basic tests   -1*1 = -1
             field.newDfp("-1"),
             0, "Multiply #4");

        // basic tests with integers
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71043);test(field.newDfp("2").multiply(field.newDfp("3")),
             field.newDfp("6"),
             0, "Multiply #5");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71044);test(field.newDfp("2").multiply(3),
             field.newDfp("6"),
             0, "Multiply #6");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71045);test(field.newDfp("-2").multiply(field.newDfp("3")),
             field.newDfp("-6"),
             0, "Multiply #7");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71046);test(field.newDfp("-2").multiply(3),
             field.newDfp("-6"),
             0, "Multiply #8");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71047);test(field.newDfp("2").multiply(field.newDfp("-3")),
             field.newDfp("-6"),
             0, "Multiply #9");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71048);test(field.newDfp("-2").multiply(field.newDfp("-3")),
             field.newDfp("6"),
             0, "Multiply #10");

        //multiply by zero

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71049);test(field.newDfp("-2").multiply(field.newDfp("0")),
             field.newDfp("-0"),
             0, "Multiply #11");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71050);test(field.newDfp("-2").multiply(0),
             field.newDfp("-0"),
             0, "Multiply #12");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71051);test(field.newDfp("2").multiply(field.newDfp("0")),
             field.newDfp("0"),
             0, "Multiply #13");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71052);test(field.newDfp("2").multiply(0),
             field.newDfp("0"),
             0, "Multiply #14");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71053);test(field.newDfp("2").multiply(pinf),
             pinf,
             0, "Multiply #15");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71054);test(field.newDfp("2").multiply(ninf),
             ninf,
             0, "Multiply #16");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71055);test(field.newDfp("-2").multiply(pinf),
             ninf,
             0, "Multiply #17");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71056);test(field.newDfp("-2").multiply(ninf),
             pinf,
             0, "Multiply #18");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71057);test(ninf.multiply(field.newDfp("-2")),
             pinf,
             0, "Multiply #18.1");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71058);test(field.newDfp("5e131071").multiply(2),
             pinf,
             DfpField.FLAG_OVERFLOW, "Multiply #19");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71059);test(field.newDfp("5e131071").multiply(field.newDfp("1.999999999999999")),
             field.newDfp("9.9999999999999950000e131071"),
             0, "Multiply #20");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71060);test(field.newDfp("-5e131071").multiply(2),
             ninf,
             DfpField.FLAG_OVERFLOW, "Multiply #22");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71061);test(field.newDfp("-5e131071").multiply(field.newDfp("1.999999999999999")),
             field.newDfp("-9.9999999999999950000e131071"),
             0, "Multiply #23");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71062);test(field.newDfp("1e-65539").multiply(field.newDfp("1e-65539")),
             field.newDfp("1e-131078"),
             DfpField.FLAG_UNDERFLOW, "Multiply #24");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71063);test(field.newDfp("1").multiply(nan),
             nan,
             0, "Multiply #25");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71064);test(nan.multiply(field.newDfp("1")),
             nan,
             0, "Multiply #26");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71065);test(nan.multiply(pinf),
             nan,
             0, "Multiply #27");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71066);test(pinf.multiply(nan),
             nan,
             0, "Multiply #27");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71067);test(pinf.multiply(field.newDfp("0")),
             nan,
             DfpField.FLAG_INVALID, "Multiply #28");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71068);test(field.newDfp("0").multiply(pinf),
             nan,
             DfpField.FLAG_INVALID, "Multiply #29");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71069);test(pinf.multiply(pinf),
             pinf,
             0, "Multiply #30");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71070);test(ninf.multiply(pinf),
             ninf,
             0, "Multiply #31");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71071);test(pinf.multiply(ninf),
             ninf,
             0, "Multiply #32");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71072);test(ninf.multiply(ninf),
             pinf,
             0, "Multiply #33");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71073);test(pinf.multiply(1),
             pinf,
             0, "Multiply #34");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71074);test(pinf.multiply(0),
             nan,
             DfpField.FLAG_INVALID, "Multiply #35");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71075);test(nan.multiply(1),
             nan,
             0, "Multiply #36");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71076);test(field.newDfp("1").multiply(10000),
             field.newDfp("10000"),
             0, "Multiply #37");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71077);test(field.newDfp("2").multiply(1000000),
             field.newDfp("2000000"),
             0, "Multiply #38");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71078);test(field.newDfp("1").multiply(-1),
             field.newDfp("-1"),
             0, "Multiply #39");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testDivide()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ae8h2m1iuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testDivide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ae8h2m1iuf(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71079);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71080);test(field.newDfp("1").divide(nan),      // divide by NaN = NaN
             nan,
             0, "Divide #1");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71081);test(nan.divide(field.newDfp("1")),      // NaN / number = NaN
             nan,
             0, "Divide #2");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71082);test(pinf.divide(field.newDfp("1")),
             pinf,
             0, "Divide #3");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71083);test(pinf.divide(field.newDfp("-1")),
             ninf,
             0, "Divide #4");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71084);test(pinf.divide(pinf),
             nan,
             DfpField.FLAG_INVALID, "Divide #5");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71085);test(ninf.divide(pinf),
             nan,
             DfpField.FLAG_INVALID, "Divide #6");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71086);test(pinf.divide(ninf),
             nan,
             DfpField.FLAG_INVALID, "Divide #7");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71087);test(ninf.divide(ninf),
             nan,
             DfpField.FLAG_INVALID, "Divide #8");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71088);test(field.newDfp("0").divide(field.newDfp("0")),
             nan,
             DfpField.FLAG_DIV_ZERO, "Divide #9");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71089);test(field.newDfp("1").divide(field.newDfp("0")),
             pinf,
             DfpField.FLAG_DIV_ZERO, "Divide #10");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71090);test(field.newDfp("1").divide(field.newDfp("-0")),
             ninf,
             DfpField.FLAG_DIV_ZERO, "Divide #11");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71091);test(field.newDfp("-1").divide(field.newDfp("0")),
             ninf,
             DfpField.FLAG_DIV_ZERO, "Divide #12");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71092);test(field.newDfp("-1").divide(field.newDfp("-0")),
             pinf,
             DfpField.FLAG_DIV_ZERO, "Divide #13");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71093);test(field.newDfp("1").divide(field.newDfp("3")),
             field.newDfp("0.33333333333333333333"),
             DfpField.FLAG_INEXACT, "Divide #14");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71094);test(field.newDfp("1").divide(field.newDfp("6")),
             field.newDfp("0.16666666666666666667"),
             DfpField.FLAG_INEXACT, "Divide #15");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71095);test(field.newDfp("10").divide(field.newDfp("6")),
             field.newDfp("1.6666666666666667"),
             DfpField.FLAG_INEXACT, "Divide #16");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71096);test(field.newDfp("100").divide(field.newDfp("6")),
             field.newDfp("16.6666666666666667"),
             DfpField.FLAG_INEXACT, "Divide #17");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71097);test(field.newDfp("1000").divide(field.newDfp("6")),
             field.newDfp("166.6666666666666667"),
             DfpField.FLAG_INEXACT, "Divide #18");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71098);test(field.newDfp("10000").divide(field.newDfp("6")),
             field.newDfp("1666.6666666666666667"),
             DfpField.FLAG_INEXACT, "Divide #19");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71099);test(field.newDfp("1").divide(field.newDfp("1")),
             field.newDfp("1"),
             0, "Divide #20");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71100);test(field.newDfp("1").divide(field.newDfp("-1")),
             field.newDfp("-1"),
             0, "Divide #21");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71101);test(field.newDfp("-1").divide(field.newDfp("1")),
             field.newDfp("-1"),
             0, "Divide #22");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71102);test(field.newDfp("-1").divide(field.newDfp("-1")),
             field.newDfp("1"),
             0, "Divide #23");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71103);test(field.newDfp("1e-65539").divide(field.newDfp("1e65539")),
             field.newDfp("1e-131078"),
             DfpField.FLAG_UNDERFLOW, "Divide #24");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71104);test(field.newDfp("1e65539").divide(field.newDfp("1e-65539")),
             pinf,
             DfpField.FLAG_OVERFLOW, "Divide #24");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71105);test(field.newDfp("2").divide(field.newDfp("1.5")),     // test trial-divisor too high
             field.newDfp("1.3333333333333333"),
             DfpField.FLAG_INEXACT, "Divide #25");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71106);test(field.newDfp("2").divide(pinf),
             field.newDfp("0"),
             0, "Divide #26");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71107);test(field.newDfp("2").divide(ninf),
             field.newDfp("-0"),
             0, "Divide #27");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71108);test(field.newDfp("0").divide(field.newDfp("1")),
             field.newDfp("0"),
             0, "Divide #28");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testReciprocal()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r5n8t1iv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testReciprocal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r5n8t1iv9(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71109);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71110);test(nan.reciprocal(),
             nan,
             0, "Reciprocal #1");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71111);test(field.newDfp("0").reciprocal(),
             pinf,
             DfpField.FLAG_DIV_ZERO, "Reciprocal #2");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71112);test(field.newDfp("-0").reciprocal(),
             ninf,
             DfpField.FLAG_DIV_ZERO, "Reciprocal #3");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71113);test(field.newDfp("3").reciprocal(),
             field.newDfp("0.33333333333333333333"),
             DfpField.FLAG_INEXACT, "Reciprocal #4");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71114);test(field.newDfp("6").reciprocal(),
             field.newDfp("0.16666666666666666667"),
             DfpField.FLAG_INEXACT, "Reciprocal #5");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71115);test(field.newDfp("1").reciprocal(),
             field.newDfp("1"),
             0, "Reciprocal #6");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71116);test(field.newDfp("-1").reciprocal(),
             field.newDfp("-1"),
             0, "Reciprocal #7");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71117);test(pinf.reciprocal(),
             field.newDfp("0"),
             0, "Reciprocal #8");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71118);test(ninf.reciprocal(),
             field.newDfp("-0"),
             0, "Reciprocal #9");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testDivideInt()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1liba451ivj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testDivideInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1liba451ivj(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71119);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71120);test(nan.divide(1),      // NaN / number = NaN
             nan,
             0, "DivideInt #1");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71121);test(pinf.divide(1),
             pinf,
             0, "DivideInt #2");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71122);test(field.newDfp("0").divide(0),
             nan,
             DfpField.FLAG_DIV_ZERO, "DivideInt #3");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71123);test(field.newDfp("1").divide(0),
             pinf,
             DfpField.FLAG_DIV_ZERO, "DivideInt #4");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71124);test(field.newDfp("-1").divide(0),
             ninf,
             DfpField.FLAG_DIV_ZERO, "DivideInt #5");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71125);test(field.newDfp("1").divide(3),
             field.newDfp("0.33333333333333333333"),
             DfpField.FLAG_INEXACT, "DivideInt #6");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71126);test(field.newDfp("1").divide(6),
             field.newDfp("0.16666666666666666667"),
             DfpField.FLAG_INEXACT, "DivideInt #7");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71127);test(field.newDfp("10").divide(6),
             field.newDfp("1.6666666666666667"),
             DfpField.FLAG_INEXACT, "DivideInt #8");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71128);test(field.newDfp("100").divide(6),
             field.newDfp("16.6666666666666667"),
             DfpField.FLAG_INEXACT, "DivideInt #9");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71129);test(field.newDfp("1000").divide(6),
             field.newDfp("166.6666666666666667"),
             DfpField.FLAG_INEXACT, "DivideInt #10");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71130);test(field.newDfp("10000").divide(6),
             field.newDfp("1666.6666666666666667"),
             DfpField.FLAG_INEXACT, "DivideInt #20");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71131);test(field.newDfp("1").divide(1),
             field.newDfp("1"),
             0, "DivideInt #21");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71132);test(field.newDfp("1e-131077").divide(10),
             field.newDfp("1e-131078"),
             DfpField.FLAG_UNDERFLOW, "DivideInt #22");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71133);test(field.newDfp("0").divide(1),
             field.newDfp("0"),
             0, "DivideInt #23");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71134);test(field.newDfp("1").divide(10000),
             nan,
             DfpField.FLAG_INVALID, "DivideInt #24");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71135);test(field.newDfp("1").divide(-1),
             nan,
             DfpField.FLAG_INVALID, "DivideInt #25");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testNextAfter()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wb8hpa1iw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testNextAfter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wb8hpa1iw0(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71136);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71137);test(field.newDfp("1").nextAfter(pinf),
             field.newDfp("1.0000000000000001"),
             0, "NextAfter #1");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71138);test(field.newDfp("1.0000000000000001").nextAfter(ninf),
             field.newDfp("1"),
             0, "NextAfter #1.5");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71139);test(field.newDfp("1").nextAfter(ninf),
             field.newDfp("0.99999999999999999999"),
             0, "NextAfter #2");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71140);test(field.newDfp("0.99999999999999999999").nextAfter(field.newDfp("2")),
             field.newDfp("1"),
             0, "NextAfter #3");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71141);test(field.newDfp("-1").nextAfter(ninf),
             field.newDfp("-1.0000000000000001"),
             0, "NextAfter #4");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71142);test(field.newDfp("-1").nextAfter(pinf),
             field.newDfp("-0.99999999999999999999"),
             0, "NextAfter #5");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71143);test(field.newDfp("-0.99999999999999999999").nextAfter(field.newDfp("-2")),
             field.newDfp("-1"),
             0, "NextAfter #6");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71144);test(field.newDfp("2").nextAfter(field.newDfp("2")),
             field.newDfp("2"),
             0, "NextAfter #7");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71145);test(field.newDfp("0").nextAfter(field.newDfp("0")),
             field.newDfp("0"),
             0, "NextAfter #8");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71146);test(field.newDfp("-2").nextAfter(field.newDfp("-2")),
             field.newDfp("-2"),
             0, "NextAfter #9");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71147);test(field.newDfp("0").nextAfter(field.newDfp("1")),
             field.newDfp("1e-131092"),
             DfpField.FLAG_UNDERFLOW, "NextAfter #10");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71148);test(field.newDfp("0").nextAfter(field.newDfp("-1")),
             field.newDfp("-1e-131092"),
             DfpField.FLAG_UNDERFLOW, "NextAfter #11");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71149);test(field.newDfp("-1e-131092").nextAfter(pinf),
             field.newDfp("-0"),
             DfpField.FLAG_UNDERFLOW|DfpField.FLAG_INEXACT, "Next After #12");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71150);test(field.newDfp("1e-131092").nextAfter(ninf),
             field.newDfp("0"),
             DfpField.FLAG_UNDERFLOW|DfpField.FLAG_INEXACT, "Next After #13");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71151);test(field.newDfp("9.9999999999999999999e131078").nextAfter(pinf),
             pinf,
             DfpField.FLAG_OVERFLOW|DfpField.FLAG_INEXACT, "Next After #14");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testToString()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1iwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1iwg(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71152);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71153);Assert.assertEquals("toString #1", "Infinity", pinf.toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71154);Assert.assertEquals("toString #2", "-Infinity", ninf.toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71155);Assert.assertEquals("toString #3", "NaN", nan.toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71156);Assert.assertEquals("toString #4", "NaN", field.newDfp((byte) 1, Dfp.QNAN).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71157);Assert.assertEquals("toString #5", "NaN", field.newDfp((byte) 1, Dfp.SNAN).toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71158);Assert.assertEquals("toString #6", "1.2300000000000000e100", field.newDfp("1.23e100").toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71159);Assert.assertEquals("toString #7", "-1.2300000000000000e100", field.newDfp("-1.23e100").toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71160);Assert.assertEquals("toString #8", "12345678.1234", field.newDfp("12345678.1234").toString());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71161);Assert.assertEquals("toString #9", "0.00001234", field.newDfp("0.00001234").toString());
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Override
    @Test
    public void testRound()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyajvh1iwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testRound",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyajvh1iwq(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71162);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71163);field.setRoundingMode(DfpField.RoundingMode.ROUND_DOWN);

        // Round down
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71164);test(field.newDfp("12345678901234567890").add(field.newDfp("0.9")),
             field.newDfp("12345678901234567890"),
             DfpField.FLAG_INEXACT, "Round #1");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71165);test(field.newDfp("12345678901234567890").add(field.newDfp("0.99999999")),
             field.newDfp("12345678901234567890"),
             DfpField.FLAG_INEXACT, "Round #2");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71166);test(field.newDfp("-12345678901234567890").add(field.newDfp("-0.99999999")),
             field.newDfp("-12345678901234567890"),
             DfpField.FLAG_INEXACT, "Round #3");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71167);field.setRoundingMode(DfpField.RoundingMode.ROUND_UP);

        // Round up
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71168);test(field.newDfp("12345678901234567890").add(field.newDfp("0.1")),
             field.newDfp("12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #4");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71169);test(field.newDfp("12345678901234567890").add(field.newDfp("0.0001")),
             field.newDfp("12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #5");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71170);test(field.newDfp("-12345678901234567890").add(field.newDfp("-0.1")),
             field.newDfp("-12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #6");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71171);test(field.newDfp("-12345678901234567890").add(field.newDfp("-0.0001")),
             field.newDfp("-12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #7");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71172);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_UP);

        // Round half up
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71173);test(field.newDfp("12345678901234567890").add(field.newDfp("0.4999")),
             field.newDfp("12345678901234567890"),
             DfpField.FLAG_INEXACT, "Round #8");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71174);test(field.newDfp("12345678901234567890").add(field.newDfp("0.5000")),
             field.newDfp("12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #9");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71175);test(field.newDfp("-12345678901234567890").add(field.newDfp("-0.4999")),
             field.newDfp("-12345678901234567890"),
             DfpField.FLAG_INEXACT, "Round #10");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71176);test(field.newDfp("-12345678901234567890").add(field.newDfp("-0.5000")),
             field.newDfp("-12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #11");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71177);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_DOWN);

        // Round half down
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71178);test(field.newDfp("12345678901234567890").add(field.newDfp("0.5001")),
             field.newDfp("12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #12");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71179);test(field.newDfp("12345678901234567890").add(field.newDfp("0.5000")),
             field.newDfp("12345678901234567890"),
             DfpField.FLAG_INEXACT, "Round #13");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71180);test(field.newDfp("-12345678901234567890").add(field.newDfp("-0.5001")),
             field.newDfp("-12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #14");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71181);test(field.newDfp("-12345678901234567890").add(field.newDfp("-0.5000")),
             field.newDfp("-12345678901234567890"),
             DfpField.FLAG_INEXACT, "Round #15");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71182);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_ODD);

        // Round half odd
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71183);test(field.newDfp("12345678901234567890").add(field.newDfp("0.5000")),
             field.newDfp("12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #16");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71184);test(field.newDfp("12345678901234567891").add(field.newDfp("0.5000")),
             field.newDfp("12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #17");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71185);test(field.newDfp("-12345678901234567890").add(field.newDfp("-0.5000")),
             field.newDfp("-12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #18");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71186);test(field.newDfp("-12345678901234567891").add(field.newDfp("-0.5000")),
             field.newDfp("-12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #19");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71187);field.setRoundingMode(DfpField.RoundingMode.ROUND_CEIL);

        // Round ceil
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71188);test(field.newDfp("12345678901234567890").add(field.newDfp("0.0001")),
             field.newDfp("12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #20");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71189);test(field.newDfp("-12345678901234567890").add(field.newDfp("-0.9999")),
             field.newDfp("-12345678901234567890"),
             DfpField.FLAG_INEXACT, "Round #21");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71190);field.setRoundingMode(DfpField.RoundingMode.ROUND_FLOOR);

        // Round floor
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71191);test(field.newDfp("12345678901234567890").add(field.newDfp("0.9999")),
             field.newDfp("12345678901234567890"),
             DfpField.FLAG_INEXACT, "Round #22");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71192);test(field.newDfp("-12345678901234567890").add(field.newDfp("-0.0001")),
             field.newDfp("-12345678901234567891"),
             DfpField.FLAG_INEXACT, "Round #23");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71193);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_EVEN);  // reset
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Override
    @Test
    public void testCeil()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1omoba61ixm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testCeil",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1omoba61ixm(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71194);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71195);test(field.newDfp("1234.0000000000000001").ceil(),
             field.newDfp("1235"),
             DfpField.FLAG_INEXACT, "Ceil #1");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Override
    @Test
    public void testFloor()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d7rmw11ixo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testFloor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d7rmw11ixo(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71196);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71197);test(field.newDfp("1234.9999999999999999").floor(),
             field.newDfp("1234"),
             DfpField.FLAG_INEXACT, "Floor #1");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Override
    @Test
    public void testRint()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1knmqwa1ixq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testRint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1knmqwa1ixq(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71198);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71199);test(field.newDfp("1234.50000000001").rint(),
             field.newDfp("1235"),
             DfpField.FLAG_INEXACT, "Rint #1");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71200);test(field.newDfp("1234.5000").rint(),
             field.newDfp("1234"),
             DfpField.FLAG_INEXACT, "Rint #2");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71201);test(field.newDfp("1235.5000").rint(),
             field.newDfp("1236"),
             DfpField.FLAG_INEXACT, "Rint #3");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testCopySign()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kluukr1ixu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testCopySign",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kluukr1ixu(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71202);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71203);test(Dfp.copysign(field.newDfp("1234."), field.newDfp("-1")),
             field.newDfp("-1234"),
             0, "CopySign #1");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71204);test(Dfp.copysign(field.newDfp("-1234."), field.newDfp("-1")),
             field.newDfp("-1234"),
             0, "CopySign #2");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71205);test(Dfp.copysign(field.newDfp("-1234."), field.newDfp("1")),
             field.newDfp("1234"),
             0, "CopySign #3");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71206);test(Dfp.copysign(field.newDfp("1234."), field.newDfp("1")),
             field.newDfp("1234"),
             0, "CopySign #4");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testIntValue()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vlmpn1ixz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testIntValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vlmpn1ixz(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71207);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71208);Assert.assertEquals("intValue #1", 1234, field.newDfp("1234").intValue());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71209);Assert.assertEquals("intValue #2", -1234, field.newDfp("-1234").intValue());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71210);Assert.assertEquals("intValue #3", 1234, field.newDfp("1234.5").intValue());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71211);Assert.assertEquals("intValue #4", 1235, field.newDfp("1234.500001").intValue());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71212);Assert.assertEquals("intValue #5", 2147483647, field.newDfp("1e1000").intValue());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71213);Assert.assertEquals("intValue #6", -2147483648, field.newDfp("-1e1000").intValue());
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testLog10K()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzyhkx1iy6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testLog10K",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzyhkx1iy6(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71214);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71215);Assert.assertEquals("log10K #1", 1, field.newDfp("123456").log10K());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71216);Assert.assertEquals("log10K #2", 2, field.newDfp("123456789").log10K());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71217);Assert.assertEquals("log10K #3", 0, field.newDfp("2").log10K());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71218);Assert.assertEquals("log10K #3", 0, field.newDfp("1").log10K());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71219);Assert.assertEquals("log10K #4", -1, field.newDfp("0.1").log10K());
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testPower10K()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uhd16o1iyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testPower10K",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uhd16o1iyc(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71220);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71221);Dfp d = field.newDfp();

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71222);test(d.power10K(0), field.newDfp("1"), 0, "Power10 #1");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71223);test(d.power10K(1), field.newDfp("10000"), 0, "Power10 #2");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71224);test(d.power10K(2), field.newDfp("100000000"), 0, "Power10 #3");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71225);test(d.power10K(-1), field.newDfp("0.0001"), 0, "Power10 #4");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71226);test(d.power10K(-2), field.newDfp("0.00000001"), 0, "Power10 #5");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71227);test(d.power10K(-3), field.newDfp("0.000000000001"), 0, "Power10 #6");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testLog10()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qum23c1iyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testLog10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qum23c1iyk(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71228);

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71229);Assert.assertEquals("log10 #1", 1, field.newDfp("12").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71230);Assert.assertEquals("log10 #2", 2, field.newDfp("123").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71231);Assert.assertEquals("log10 #3", 3, field.newDfp("1234").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71232);Assert.assertEquals("log10 #4", 4, field.newDfp("12345").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71233);Assert.assertEquals("log10 #5", 5, field.newDfp("123456").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71234);Assert.assertEquals("log10 #6", 6, field.newDfp("1234567").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71235);Assert.assertEquals("log10 #6", 7, field.newDfp("12345678").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71236);Assert.assertEquals("log10 #7", 8, field.newDfp("123456789").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71237);Assert.assertEquals("log10 #8", 9, field.newDfp("1234567890").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71238);Assert.assertEquals("log10 #9", 10, field.newDfp("12345678901").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71239);Assert.assertEquals("log10 #10", 11, field.newDfp("123456789012").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71240);Assert.assertEquals("log10 #11", 12, field.newDfp("1234567890123").intLog10());

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71241);Assert.assertEquals("log10 #12", 0, field.newDfp("2").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71242);Assert.assertEquals("log10 #13", 0, field.newDfp("1").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71243);Assert.assertEquals("log10 #14", -1, field.newDfp("0.12").intLog10());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71244);Assert.assertEquals("log10 #15", -2, field.newDfp("0.012").intLog10());
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testPower10()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12oygp31iz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testPower10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12oygp31iz1(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71245);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71246);Dfp d = field.newDfp();

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71247);test(d.power10(0), field.newDfp("1"), 0, "Power10 #1");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71248);test(d.power10(1), field.newDfp("10"), 0, "Power10 #2");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71249);test(d.power10(2), field.newDfp("100"), 0, "Power10 #3");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71250);test(d.power10(3), field.newDfp("1000"), 0, "Power10 #4");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71251);test(d.power10(4), field.newDfp("10000"), 0, "Power10 #5");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71252);test(d.power10(5), field.newDfp("100000"), 0, "Power10 #6");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71253);test(d.power10(6), field.newDfp("1000000"), 0, "Power10 #7");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71254);test(d.power10(7), field.newDfp("10000000"), 0, "Power10 #8");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71255);test(d.power10(8), field.newDfp("100000000"), 0, "Power10 #9");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71256);test(d.power10(9), field.newDfp("1000000000"), 0, "Power10 #10");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71257);test(d.power10(-1), field.newDfp(".1"), 0, "Power10 #11");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71258);test(d.power10(-2), field.newDfp(".01"), 0, "Power10 #12");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71259);test(d.power10(-3), field.newDfp(".001"), 0, "Power10 #13");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71260);test(d.power10(-4), field.newDfp(".0001"), 0, "Power10 #14");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71261);test(d.power10(-5), field.newDfp(".00001"), 0, "Power10 #15");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71262);test(d.power10(-6), field.newDfp(".000001"), 0, "Power10 #16");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71263);test(d.power10(-7), field.newDfp(".0000001"), 0, "Power10 #17");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71264);test(d.power10(-8), field.newDfp(".00000001"), 0, "Power10 #18");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71265);test(d.power10(-9), field.newDfp(".000000001"), 0, "Power10 #19");
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71266);test(d.power10(-10), field.newDfp(".0000000001"), 0, "Power10 #20");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testRemainder()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y5fixm1izn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testRemainder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y5fixm1izn(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71267);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71268);test(field.newDfp("10").remainder(field.newDfp("3")),
             field.newDfp("1"),
             DfpField.FLAG_INEXACT, "Remainder #1");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71269);test(field.newDfp("9").remainder(field.newDfp("3")),
             field.newDfp("0"),
             0, "Remainder #2");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71270);test(field.newDfp("-9").remainder(field.newDfp("3")),
             field.newDfp("-0"),
             0, "Remainder #3");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Override
    @Test
    public void testSqrt()
    {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eyjxll1izr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testSqrt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eyjxll1izr(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71271);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71272);test(field.newDfp("0").sqrt(),
             field.newDfp("0"),
             0, "Sqrt #1");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71273);test(field.newDfp("-0").sqrt(),
             field.newDfp("-0"),
             0, "Sqrt #2");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71274);test(field.newDfp("1").sqrt(),
             field.newDfp("1"),
             0, "Sqrt #3");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71275);test(field.newDfp("2").sqrt(),
             field.newDfp("1.4142135623730950"),
             DfpField.FLAG_INEXACT, "Sqrt #4");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71276);test(field.newDfp("3").sqrt(),
             field.newDfp("1.7320508075688773"),
             DfpField.FLAG_INEXACT, "Sqrt #5");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71277);test(field.newDfp("5").sqrt(),
             field.newDfp("2.2360679774997897"),
             DfpField.FLAG_INEXACT, "Sqrt #6");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71278);test(field.newDfp("500").sqrt(),
             field.newDfp("22.3606797749978970"),
             DfpField.FLAG_INEXACT, "Sqrt #6.2");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71279);test(field.newDfp("50000").sqrt(),
             field.newDfp("223.6067977499789696"),
             DfpField.FLAG_INEXACT, "Sqrt #6.3");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71280);test(field.newDfp("-1").sqrt(),
             nan,
             DfpField.FLAG_INVALID, "Sqrt #7");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71281);test(pinf.sqrt(),
             pinf,
             0, "Sqrt #8");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71282);test(field.newDfp((byte) 1, Dfp.QNAN).sqrt(),
             nan,
             0, "Sqrt #9");

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71283);test(field.newDfp((byte) 1, Dfp.SNAN).sqrt(),
             nan,
             DfpField.FLAG_INVALID, "Sqrt #9");
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testIssue567() {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ywtau1j04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testIssue567",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ywtau1j04(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71284);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71285);DfpField field = new DfpField(100);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71286);Assert.assertEquals(0.0, field.getZero().toDouble(), Precision.SAFE_MIN);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71287);Assert.assertEquals(0.0, field.newDfp(0.0).toDouble(), Precision.SAFE_MIN);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71288);Assert.assertEquals(-1, FastMath.copySign(1, field.newDfp(-0.0).toDouble()), Precision.EPSILON);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71289);Assert.assertEquals(+1, FastMath.copySign(1, field.newDfp(+0.0).toDouble()), Precision.EPSILON);
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testIsZero() {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec98np1j0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testIsZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec98np1j0a(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71290);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71291);Assert.assertTrue(field.getZero().isZero());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71292);Assert.assertTrue(field.getZero().negate().isZero());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71293);Assert.assertTrue(field.newDfp(+0.0).isZero());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71294);Assert.assertTrue(field.newDfp(-0.0).isZero());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71295);Assert.assertFalse(field.newDfp(1.0e-90).isZero());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71296);Assert.assertFalse(nan.isZero());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71297);Assert.assertFalse(nan.negate().isZero());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71298);Assert.assertFalse(pinf.isZero());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71299);Assert.assertFalse(pinf.negate().isZero());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71300);Assert.assertFalse(ninf.isZero());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71301);Assert.assertFalse(ninf.negate().isZero());
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testSignPredicates() {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e2hsq61j0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testSignPredicates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e2hsq61j0m(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71302);

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71303);Assert.assertTrue(field.getZero().negativeOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71304);Assert.assertTrue(field.getZero().positiveOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71305);Assert.assertFalse(field.getZero().strictlyNegative());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71306);Assert.assertFalse(field.getZero().strictlyPositive());

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71307);Assert.assertTrue(field.getZero().negate().negativeOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71308);Assert.assertTrue(field.getZero().negate().positiveOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71309);Assert.assertFalse(field.getZero().negate().strictlyNegative());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71310);Assert.assertFalse(field.getZero().negate().strictlyPositive());

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71311);Assert.assertFalse(field.getOne().negativeOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71312);Assert.assertTrue(field.getOne().positiveOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71313);Assert.assertFalse(field.getOne().strictlyNegative());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71314);Assert.assertTrue(field.getOne().strictlyPositive());

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71315);Assert.assertTrue(field.getOne().negate().negativeOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71316);Assert.assertFalse(field.getOne().negate().positiveOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71317);Assert.assertTrue(field.getOne().negate().strictlyNegative());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71318);Assert.assertFalse(field.getOne().negate().strictlyPositive());

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71319);Assert.assertFalse(nan.negativeOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71320);Assert.assertFalse(nan.positiveOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71321);Assert.assertFalse(nan.strictlyNegative());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71322);Assert.assertFalse(nan.strictlyPositive());

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71323);Assert.assertFalse(nan.negate().negativeOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71324);Assert.assertFalse(nan.negate().positiveOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71325);Assert.assertFalse(nan.negate().strictlyNegative());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71326);Assert.assertFalse(nan.negate().strictlyPositive());

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71327);Assert.assertFalse(pinf.negativeOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71328);Assert.assertTrue(pinf.positiveOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71329);Assert.assertFalse(pinf.strictlyNegative());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71330);Assert.assertTrue(pinf.strictlyPositive());

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71331);Assert.assertTrue(pinf.negate().negativeOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71332);Assert.assertFalse(pinf.negate().positiveOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71333);Assert.assertTrue(pinf.negate().strictlyNegative());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71334);Assert.assertFalse(pinf.negate().strictlyPositive());

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71335);Assert.assertTrue(ninf.negativeOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71336);Assert.assertFalse(ninf.positiveOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71337);Assert.assertTrue(ninf.strictlyNegative());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71338);Assert.assertFalse(ninf.strictlyPositive());

        __CLR4_4_11ih81ih8lb90pcab.R.inc(71339);Assert.assertFalse(ninf.negate().negativeOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71340);Assert.assertTrue(ninf.negate().positiveOrNull());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71341);Assert.assertFalse(ninf.negate().strictlyNegative());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71342);Assert.assertTrue(ninf.negate().strictlyPositive());

    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

    @Test
    public void testSpecialConstructors() {__CLR4_4_11ih81ih8lb90pcab.R.globalSliceStart(getClass().getName(),71343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzby551j1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ih81ih8lb90pcab.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ih81ih8lb90pcab.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpTest.testSpecialConstructors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzby551j1r(){try{__CLR4_4_11ih81ih8lb90pcab.R.inc(71343);
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71344);Assert.assertEquals(ninf, field.newDfp(Double.NEGATIVE_INFINITY));
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71345);Assert.assertEquals(ninf, field.newDfp("-Infinity"));
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71346);Assert.assertEquals(pinf, field.newDfp(Double.POSITIVE_INFINITY));
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71347);Assert.assertEquals(pinf, field.newDfp("Infinity"));
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71348);Assert.assertTrue(field.newDfp(Double.NaN).isNaN());
        __CLR4_4_11ih81ih8lb90pcab.R.inc(71349);Assert.assertTrue(field.newDfp("NaN").isNaN());
    }finally{__CLR4_4_11ih81ih8lb90pcab.R.flushNeeded();}}

}
