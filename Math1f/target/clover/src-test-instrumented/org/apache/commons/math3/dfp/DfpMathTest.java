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

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DfpMathTest {static class __CLR4_4_11id31id3lb90pc93{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,70604,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DfpField factory;
    private Dfp pinf;
    private Dfp ninf;
    private Dfp nan;
    private Dfp qnan;

    @Before
    public void setUp() {try{__CLR4_4_11id31id3lb90pc93.R.inc(70455);
        // Some basic setup.  Define some constants and clear the status flags
        __CLR4_4_11id31id3lb90pc93.R.inc(70456);factory = new DfpField(20);
        __CLR4_4_11id31id3lb90pc93.R.inc(70457);pinf = factory.newDfp("1").divide(factory.newDfp("0"));
        __CLR4_4_11id31id3lb90pc93.R.inc(70458);ninf = factory.newDfp("-1").divide(factory.newDfp("0"));
        __CLR4_4_11id31id3lb90pc93.R.inc(70459);nan = factory.newDfp("0").divide(factory.newDfp("0"));
        __CLR4_4_11id31id3lb90pc93.R.inc(70460);qnan = factory.newDfp((byte)1, Dfp.QNAN);
        __CLR4_4_11id31id3lb90pc93.R.inc(70461);ninf.getField().clearIEEEFlags();

        // force loading of dfpmath
        __CLR4_4_11id31id3lb90pc93.R.inc(70462);Dfp pi = factory.getPi();
        __CLR4_4_11id31id3lb90pc93.R.inc(70463);pi.getField().clearIEEEFlags();
    }finally{__CLR4_4_11id31id3lb90pc93.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_4_11id31id3lb90pc93.R.inc(70464);
        __CLR4_4_11id31id3lb90pc93.R.inc(70465);pinf = null;
        __CLR4_4_11id31id3lb90pc93.R.inc(70466);ninf = null;
        __CLR4_4_11id31id3lb90pc93.R.inc(70467);nan  = null;
        __CLR4_4_11id31id3lb90pc93.R.inc(70468);qnan = null;
    }finally{__CLR4_4_11id31id3lb90pc93.R.flushNeeded();}}

    // Generic test function.  Takes params x and y and tests them for 
    // equality.  Then checks the status flags against the flags argument.
    // If the test fail, it prints the desc string
    private void test(Dfp x, Dfp y, int flags, String desc)
    {try{__CLR4_4_11id31id3lb90pc93.R.inc(70469);
        __CLR4_4_11id31id3lb90pc93.R.inc(70470);boolean b = x.equals(y);

        __CLR4_4_11id31id3lb90pc93.R.inc(70471);if ((((!x.equals(y) && !x.unequal(y))&&(__CLR4_4_11id31id3lb90pc93.R.iget(70472)!=0|true))||(__CLR4_4_11id31id3lb90pc93.R.iget(70473)==0&false)))  // NaNs involved 
            {__CLR4_4_11id31id3lb90pc93.R.inc(70474);b = (x.toString().equals(y.toString()));

        }__CLR4_4_11id31id3lb90pc93.R.inc(70475);if ((((x.equals(factory.newDfp("0")))&&(__CLR4_4_11id31id3lb90pc93.R.iget(70476)!=0|true))||(__CLR4_4_11id31id3lb90pc93.R.iget(70477)==0&false)))  // distinguish +/- zero
            {__CLR4_4_11id31id3lb90pc93.R.inc(70478);b = (b && (x.toString().equals(y.toString())));

        }__CLR4_4_11id31id3lb90pc93.R.inc(70479);b = (b && x.getField().getIEEEFlags() == flags);

        __CLR4_4_11id31id3lb90pc93.R.inc(70480);if ((((!b)&&(__CLR4_4_11id31id3lb90pc93.R.iget(70481)!=0|true))||(__CLR4_4_11id31id3lb90pc93.R.iget(70482)==0&false)))
            {__CLR4_4_11id31id3lb90pc93.R.inc(70483);Assert.assertTrue("assersion failed "+desc+" x = "+x.toString()+" flags = "+x.getField().getIEEEFlags(), b);

        }__CLR4_4_11id31id3lb90pc93.R.inc(70484);x.getField().clearIEEEFlags();
    }finally{__CLR4_4_11id31id3lb90pc93.R.flushNeeded();}}

    @Test
    public void testPow()  
    {__CLR4_4_11id31id3lb90pc93.R.globalSliceStart(getClass().getName(),70485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xazw8d1idx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11id31id3lb90pc93.R.rethrow($CLV_t2$);}finally{__CLR4_4_11id31id3lb90pc93.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpMathTest.testPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xazw8d1idx(){try{__CLR4_4_11id31id3lb90pc93.R.inc(70485);
        // Test special cases  exponent of zero
        __CLR4_4_11id31id3lb90pc93.R.inc(70486);test(DfpMath.pow(factory.newDfp("0"), factory.newDfp("0")),      
             factory.newDfp("1"), 
             0, "pow #1");

        __CLR4_4_11id31id3lb90pc93.R.inc(70487);test(DfpMath.pow(factory.newDfp("0"), factory.newDfp("-0")),      
             factory.newDfp("1"), 
             0, "pow #2");

        __CLR4_4_11id31id3lb90pc93.R.inc(70488);test(DfpMath.pow(factory.newDfp("2"), factory.newDfp("0")),      
             factory.newDfp("1"), 
             0, "pow #3");

        __CLR4_4_11id31id3lb90pc93.R.inc(70489);test(DfpMath.pow(factory.newDfp("-2"), factory.newDfp("-0")),      
             factory.newDfp("1"), 
             0, "pow #4");

        __CLR4_4_11id31id3lb90pc93.R.inc(70490);test(DfpMath.pow(pinf, factory.newDfp("-0")),      
             factory.newDfp("1"), 
             0, "pow #5");

        __CLR4_4_11id31id3lb90pc93.R.inc(70491);test(DfpMath.pow(pinf, factory.newDfp("0")),
             factory.newDfp("1"), 
             0, "pow #6");

        __CLR4_4_11id31id3lb90pc93.R.inc(70492);test(DfpMath.pow(ninf, factory.newDfp("-0")),      
             factory.newDfp("1"), 
             0, "pow #7");

        __CLR4_4_11id31id3lb90pc93.R.inc(70493);test(DfpMath.pow(ninf, factory.newDfp("0")),
             factory.newDfp("1"), 
             0, "pow #8");

        __CLR4_4_11id31id3lb90pc93.R.inc(70494);test(DfpMath.pow(qnan, factory.newDfp("0")),
             factory.newDfp("1"), 
             0, "pow #8");

        // exponent of one
        __CLR4_4_11id31id3lb90pc93.R.inc(70495);test(DfpMath.pow(factory.newDfp("0"), factory.newDfp("1")),
             factory.newDfp("0"), 
             0, "pow #9");

        __CLR4_4_11id31id3lb90pc93.R.inc(70496);test(DfpMath.pow(factory.newDfp("-0"), factory.newDfp("1")),      
             factory.newDfp("-0"), 
             0, "pow #10");

        __CLR4_4_11id31id3lb90pc93.R.inc(70497);test(DfpMath.pow(factory.newDfp("2"), factory.newDfp("1")),
             factory.newDfp("2"), 
             0, "pow #11");

        __CLR4_4_11id31id3lb90pc93.R.inc(70498);test(DfpMath.pow(factory.newDfp("-2"), factory.newDfp("1")),
             factory.newDfp("-2"), 
             0, "pow #12");

        __CLR4_4_11id31id3lb90pc93.R.inc(70499);test(DfpMath.pow(pinf, factory.newDfp("1")),      
             pinf, 
             0, "pow #13");

        __CLR4_4_11id31id3lb90pc93.R.inc(70500);test(DfpMath.pow(ninf, factory.newDfp("1")),
             ninf, 
             0, "pow #14");

        __CLR4_4_11id31id3lb90pc93.R.inc(70501);test(DfpMath.pow(qnan, factory.newDfp("1")),
             qnan, 
             DfpField.FLAG_INVALID, "pow #14.1");

        // exponent of NaN
        __CLR4_4_11id31id3lb90pc93.R.inc(70502);test(DfpMath.pow(factory.newDfp("0"), qnan),
             qnan, 
             DfpField.FLAG_INVALID, "pow #15");

        __CLR4_4_11id31id3lb90pc93.R.inc(70503);test(DfpMath.pow(factory.newDfp("-0"), qnan),      
             qnan, 
             DfpField.FLAG_INVALID, "pow #16");

        __CLR4_4_11id31id3lb90pc93.R.inc(70504);test(DfpMath.pow(factory.newDfp("2"), qnan),
             qnan, 
             DfpField.FLAG_INVALID, "pow #17");

        __CLR4_4_11id31id3lb90pc93.R.inc(70505);test(DfpMath.pow(factory.newDfp("-2"), qnan),
             qnan, 
             DfpField.FLAG_INVALID, "pow #18");

        __CLR4_4_11id31id3lb90pc93.R.inc(70506);test(DfpMath.pow(pinf, qnan),      
             qnan, 
             DfpField.FLAG_INVALID, "pow #19");

        __CLR4_4_11id31id3lb90pc93.R.inc(70507);test(DfpMath.pow(ninf, qnan),
             qnan, 
             DfpField.FLAG_INVALID, "pow #20");

        __CLR4_4_11id31id3lb90pc93.R.inc(70508);test(DfpMath.pow(qnan, qnan),
             qnan, 
             DfpField.FLAG_INVALID, "pow #21");

        // radix of NaN
        __CLR4_4_11id31id3lb90pc93.R.inc(70509);test(DfpMath.pow(qnan, factory.newDfp("1")),
             qnan, 
             DfpField.FLAG_INVALID, "pow #22");

        __CLR4_4_11id31id3lb90pc93.R.inc(70510);test(DfpMath.pow(qnan, factory.newDfp("-1")),      
             qnan,
             DfpField.FLAG_INVALID, "pow #23");

        __CLR4_4_11id31id3lb90pc93.R.inc(70511);test(DfpMath.pow(qnan, pinf),
             qnan,
             DfpField.FLAG_INVALID, "pow #24");

        __CLR4_4_11id31id3lb90pc93.R.inc(70512);test(DfpMath.pow(qnan, ninf),
             qnan, 
             DfpField.FLAG_INVALID, "pow #25");

        __CLR4_4_11id31id3lb90pc93.R.inc(70513);test(DfpMath.pow(qnan, qnan),
             qnan, 
             DfpField.FLAG_INVALID, "pow #26");

        // (x > 1) ^ pinf = pinf,    (x < -1) ^ pinf = pinf
        __CLR4_4_11id31id3lb90pc93.R.inc(70514);test(DfpMath.pow(factory.newDfp("2"), pinf),
             pinf, 
             0, "pow #27");

        __CLR4_4_11id31id3lb90pc93.R.inc(70515);test(DfpMath.pow(factory.newDfp("-2"), pinf),      
             pinf,
             0, "pow #28");

        __CLR4_4_11id31id3lb90pc93.R.inc(70516);test(DfpMath.pow(pinf, pinf),
             pinf,
             0, "pow #29");

        __CLR4_4_11id31id3lb90pc93.R.inc(70517);test(DfpMath.pow(ninf, pinf),
             pinf, 
             0, "pow #30");

        // (x > 1) ^ ninf = +0,    (x < -1) ^ ninf = +0
        __CLR4_4_11id31id3lb90pc93.R.inc(70518);test(DfpMath.pow(factory.newDfp("2"), ninf),
             factory.getZero(), 
             0, "pow #31");

        __CLR4_4_11id31id3lb90pc93.R.inc(70519);test(DfpMath.pow(factory.newDfp("-2"), ninf),      
             factory.getZero(),
             0, "pow #32");

        __CLR4_4_11id31id3lb90pc93.R.inc(70520);test(DfpMath.pow(pinf, ninf),
             factory.getZero(),
             0, "pow #33");

        __CLR4_4_11id31id3lb90pc93.R.inc(70521);test(DfpMath.pow(ninf, ninf),
             factory.getZero(), 
             0, "pow #34");

        // (-1 < x < 1) ^ pinf = 0
        __CLR4_4_11id31id3lb90pc93.R.inc(70522);test(DfpMath.pow(factory.newDfp("0.5"), pinf),
             factory.getZero(), 
             0, "pow #35");

        __CLR4_4_11id31id3lb90pc93.R.inc(70523);test(DfpMath.pow(factory.newDfp("-0.5"), pinf),      
             factory.getZero(),
             0, "pow #36");

        // (-1 < x < 1) ^ ninf = pinf 
        __CLR4_4_11id31id3lb90pc93.R.inc(70524);test(DfpMath.pow(factory.newDfp("0.5"), ninf),
             pinf, 
             0, "pow #37");

        __CLR4_4_11id31id3lb90pc93.R.inc(70525);test(DfpMath.pow(factory.newDfp("-0.5"), ninf),      
             pinf,
             0, "pow #38");

        // +/- 1  ^ +/-inf  = NaN
        __CLR4_4_11id31id3lb90pc93.R.inc(70526);test(DfpMath.pow(factory.getOne(), pinf),
             qnan, 
             DfpField.FLAG_INVALID, "pow #39");

        __CLR4_4_11id31id3lb90pc93.R.inc(70527);test(DfpMath.pow(factory.getOne(), ninf),      
             qnan,
             DfpField.FLAG_INVALID, "pow #40");

        __CLR4_4_11id31id3lb90pc93.R.inc(70528);test(DfpMath.pow(factory.newDfp("-1"), pinf),
             qnan, 
             DfpField.FLAG_INVALID, "pow #41");

        __CLR4_4_11id31id3lb90pc93.R.inc(70529);test(DfpMath.pow(factory.getOne().negate(), ninf),      
             qnan,
             DfpField.FLAG_INVALID, "pow #42");

        // +0  ^ +anything except 0, NAN  = +0

        __CLR4_4_11id31id3lb90pc93.R.inc(70530);test(DfpMath.pow(factory.newDfp("0"), factory.newDfp("1")),
             factory.newDfp("0"),
             0, "pow #43");

        __CLR4_4_11id31id3lb90pc93.R.inc(70531);test(DfpMath.pow(factory.newDfp("0"), factory.newDfp("1e30")),
             factory.newDfp("0"),
             0, "pow #44");

        __CLR4_4_11id31id3lb90pc93.R.inc(70532);test(DfpMath.pow(factory.newDfp("0"), factory.newDfp("1e-30")),
             factory.newDfp("0"),
             0, "pow #45");

        __CLR4_4_11id31id3lb90pc93.R.inc(70533);test(DfpMath.pow(factory.newDfp("0"), pinf),
             factory.newDfp("0"),
             0, "pow #46");

        // -0  ^ +anything except 0, NAN, odd integer  = +0

        __CLR4_4_11id31id3lb90pc93.R.inc(70534);test(DfpMath.pow(factory.newDfp("-0"), factory.newDfp("2")),
             factory.newDfp("0"),
             0, "pow #47");

        __CLR4_4_11id31id3lb90pc93.R.inc(70535);test(DfpMath.pow(factory.newDfp("-0"), factory.newDfp("1e30")),
             factory.newDfp("0"),
             0, "pow #48");

        __CLR4_4_11id31id3lb90pc93.R.inc(70536);test(DfpMath.pow(factory.newDfp("-0"), factory.newDfp("1e-30")),
             factory.newDfp("0"),
             DfpField.FLAG_INEXACT, "pow #49");

        __CLR4_4_11id31id3lb90pc93.R.inc(70537);test(DfpMath.pow(factory.newDfp("-0"), pinf),
             factory.newDfp("0"),
             0, "pow #50");

        // +0  ^ -anything except 0, NAN  = +INF

        __CLR4_4_11id31id3lb90pc93.R.inc(70538);test(DfpMath.pow(factory.newDfp("0"), factory.newDfp("-1")),
             pinf,
             0, "pow #51");

        __CLR4_4_11id31id3lb90pc93.R.inc(70539);test(DfpMath.pow(factory.newDfp("0"), factory.newDfp("-1e30")),
             pinf,
             0, "pow #52");

        __CLR4_4_11id31id3lb90pc93.R.inc(70540);test(DfpMath.pow(factory.newDfp("0"), factory.newDfp("-1e-30")),
             pinf,
             0, "pow #53");

        __CLR4_4_11id31id3lb90pc93.R.inc(70541);test(DfpMath.pow(factory.newDfp("0"), ninf),
             pinf,
             0, "pow #54");

        // -0  ^ -anything except 0, NAN, odd integer  = +INF

        __CLR4_4_11id31id3lb90pc93.R.inc(70542);test(DfpMath.pow(factory.newDfp("-0"), factory.newDfp("-2")),
             pinf,
             0, "pow #55");

        __CLR4_4_11id31id3lb90pc93.R.inc(70543);test(DfpMath.pow(factory.newDfp("-0"), factory.newDfp("-1e30")),
             pinf,
             0, "pow #56");

        __CLR4_4_11id31id3lb90pc93.R.inc(70544);test(DfpMath.pow(factory.newDfp("-0"), factory.newDfp("-1e-30")),
             pinf,
             DfpField.FLAG_INEXACT, "pow #57");

        __CLR4_4_11id31id3lb90pc93.R.inc(70545);test(DfpMath.pow(factory.newDfp("-0"), ninf),
             pinf,
             0, "pow #58");

        // -0  ^ -odd integer   =  -INF
        __CLR4_4_11id31id3lb90pc93.R.inc(70546);test(DfpMath.pow(factory.newDfp("-0"), factory.newDfp("-1")),
             ninf,
             DfpField.FLAG_INEXACT, "pow #59");

        __CLR4_4_11id31id3lb90pc93.R.inc(70547);test(DfpMath.pow(factory.newDfp("-0"), factory.newDfp("-12345")),
             ninf,
             DfpField.FLAG_INEXACT, "pow #60");

        // -0  ^ +odd integer   =  -0
        __CLR4_4_11id31id3lb90pc93.R.inc(70548);test(DfpMath.pow(factory.newDfp("-0"), factory.newDfp("3")),
             factory.newDfp("-0"),
             DfpField.FLAG_INEXACT, "pow #61");

        __CLR4_4_11id31id3lb90pc93.R.inc(70549);test(DfpMath.pow(factory.newDfp("-0"), factory.newDfp("12345")),
             factory.newDfp("-0"),
             DfpField.FLAG_INEXACT, "pow #62");

        // pinf  ^ +anything   = pinf 
        __CLR4_4_11id31id3lb90pc93.R.inc(70550);test(DfpMath.pow(pinf, factory.newDfp("3")),
             pinf,
             0, "pow #63");

        __CLR4_4_11id31id3lb90pc93.R.inc(70551);test(DfpMath.pow(pinf, factory.newDfp("1e30")),
             pinf,
             0, "pow #64");

        __CLR4_4_11id31id3lb90pc93.R.inc(70552);test(DfpMath.pow(pinf, factory.newDfp("1e-30")),
             pinf,
             0, "pow #65");

        __CLR4_4_11id31id3lb90pc93.R.inc(70553);test(DfpMath.pow(pinf, pinf),
             pinf,
             0, "pow #66");

        // pinf  ^ -anything   = +0 

        __CLR4_4_11id31id3lb90pc93.R.inc(70554);test(DfpMath.pow(pinf, factory.newDfp("-3")),
             factory.getZero(),
             0, "pow #67");

        __CLR4_4_11id31id3lb90pc93.R.inc(70555);test(DfpMath.pow(pinf, factory.newDfp("-1e30")),
             factory.getZero(),
             0, "pow #68");

        __CLR4_4_11id31id3lb90pc93.R.inc(70556);test(DfpMath.pow(pinf, factory.newDfp("-1e-30")),
             factory.getZero(),
             0, "pow #69");

        __CLR4_4_11id31id3lb90pc93.R.inc(70557);test(DfpMath.pow(pinf, ninf),
             factory.getZero(),
             0, "pow #70");

        // ninf  ^ anything   = -0 ^ -anything
        // ninf  ^ -anything except 0, NAN, odd integer  = +0

        __CLR4_4_11id31id3lb90pc93.R.inc(70558);test(DfpMath.pow(ninf, factory.newDfp("-2")),
             factory.newDfp("0"),
             0, "pow #71");

        __CLR4_4_11id31id3lb90pc93.R.inc(70559);test(DfpMath.pow(ninf, factory.newDfp("-1e30")),
             factory.newDfp("0"),
             0, "pow #72");

        __CLR4_4_11id31id3lb90pc93.R.inc(70560);test(DfpMath.pow(ninf, factory.newDfp("-1e-30")),
             factory.newDfp("0"),
             DfpField.FLAG_INEXACT, "pow #73");

        __CLR4_4_11id31id3lb90pc93.R.inc(70561);test(DfpMath.pow(ninf, ninf),
             factory.newDfp("0"),
             0, "pow #74");

        // ninf  ^ +anything except 0, NAN, odd integer  = +INF

        __CLR4_4_11id31id3lb90pc93.R.inc(70562);test(DfpMath.pow(ninf, factory.newDfp("2")),
             pinf,
             0, "pow #75");

        __CLR4_4_11id31id3lb90pc93.R.inc(70563);test(DfpMath.pow(ninf, factory.newDfp("1e30")),
             pinf,
             0, "pow #76");

        __CLR4_4_11id31id3lb90pc93.R.inc(70564);test(DfpMath.pow(ninf, factory.newDfp("1e-30")),
             pinf,
             DfpField.FLAG_INEXACT, "pow #77");

        __CLR4_4_11id31id3lb90pc93.R.inc(70565);test(DfpMath.pow(ninf, pinf),
             pinf,
             0, "pow #78");

        // ninf  ^ +odd integer   =  -INF
        __CLR4_4_11id31id3lb90pc93.R.inc(70566);test(DfpMath.pow(ninf, factory.newDfp("3")),
             ninf,
             DfpField.FLAG_INEXACT, "pow #79");

        __CLR4_4_11id31id3lb90pc93.R.inc(70567);test(DfpMath.pow(ninf, factory.newDfp("12345")),
             ninf,
             DfpField.FLAG_INEXACT, "pow #80");

        // ninf  ^ -odd integer   =  -0
        __CLR4_4_11id31id3lb90pc93.R.inc(70568);test(DfpMath.pow(ninf, factory.newDfp("-3")),
             factory.newDfp("-0"),
             DfpField.FLAG_INEXACT, "pow #81");

        __CLR4_4_11id31id3lb90pc93.R.inc(70569);test(DfpMath.pow(ninf, factory.newDfp("-12345")),
             factory.newDfp("-0"),
             DfpField.FLAG_INEXACT, "pow #82");

        // -anything ^ integer 
        __CLR4_4_11id31id3lb90pc93.R.inc(70570);test(DfpMath.pow(factory.newDfp("-2"), factory.newDfp("3")),
             factory.newDfp("-8"),
             DfpField.FLAG_INEXACT, "pow #83");

        __CLR4_4_11id31id3lb90pc93.R.inc(70571);test(DfpMath.pow(factory.newDfp("-2"), factory.newDfp("16")),
             factory.newDfp("65536"),
             0, "pow #84");

        __CLR4_4_11id31id3lb90pc93.R.inc(70572);test(DfpMath.pow(factory.newDfp("-2"), factory.newDfp("-3")),
             factory.newDfp("-0.125"),
             DfpField.FLAG_INEXACT, "pow #85");

        __CLR4_4_11id31id3lb90pc93.R.inc(70573);test(DfpMath.pow(factory.newDfp("-2"), factory.newDfp("-4")),
             factory.newDfp("0.0625"),
             0, "pow #86");

        // -anything ^ noninteger = NaN

        __CLR4_4_11id31id3lb90pc93.R.inc(70574);test(DfpMath.pow(factory.newDfp("-2"), factory.newDfp("-4.1")),
             qnan,
             DfpField.FLAG_INVALID|DfpField.FLAG_INEXACT, "pow #87");

        // Some fractional cases.
        __CLR4_4_11id31id3lb90pc93.R.inc(70575);test(DfpMath.pow(factory.newDfp("2"),factory.newDfp("1.5")),
             factory.newDfp("2.8284271247461901"), 
             DfpField.FLAG_INEXACT, "pow #88");
    }finally{__CLR4_4_11id31id3lb90pc93.R.flushNeeded();}}

    @Test
    public void testSin()
    {__CLR4_4_11id31id3lb90pc93.R.globalSliceStart(getClass().getName(),70576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wfmv711igg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11id31id3lb90pc93.R.rethrow($CLV_t2$);}finally{__CLR4_4_11id31id3lb90pc93.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpMathTest.testSin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wfmv711igg(){try{__CLR4_4_11id31id3lb90pc93.R.inc(70576);
        __CLR4_4_11id31id3lb90pc93.R.inc(70577);test(DfpMath.sin(pinf),
             nan,
             DfpField.FLAG_INVALID|DfpField.FLAG_INEXACT, "sin #1");

        __CLR4_4_11id31id3lb90pc93.R.inc(70578);test(DfpMath.sin(nan),
             nan,
             DfpField.FLAG_INVALID|DfpField.FLAG_INEXACT, "sin #2");

        __CLR4_4_11id31id3lb90pc93.R.inc(70579);test(DfpMath.sin(factory.getZero()),
             factory.getZero(),
             DfpField.FLAG_INEXACT, "sin #3");

        __CLR4_4_11id31id3lb90pc93.R.inc(70580);test(DfpMath.sin(factory.getPi()),
             factory.getZero(),
             DfpField.FLAG_INEXACT, "sin #4");

        __CLR4_4_11id31id3lb90pc93.R.inc(70581);test(DfpMath.sin(factory.getPi().negate()),
             factory.newDfp("-0"),
             DfpField.FLAG_INEXACT, "sin #5");

        __CLR4_4_11id31id3lb90pc93.R.inc(70582);test(DfpMath.sin(factory.getPi().multiply(2)),
             factory.getZero(),
             DfpField.FLAG_INEXACT, "sin #6");

        __CLR4_4_11id31id3lb90pc93.R.inc(70583);test(DfpMath.sin(factory.getPi().divide(2)),
             factory.getOne(),
             DfpField.FLAG_INEXACT, "sin #7");

        __CLR4_4_11id31id3lb90pc93.R.inc(70584);test(DfpMath.sin(factory.getPi().divide(2).negate()),
             factory.getOne().negate(),
             DfpField.FLAG_INEXACT, "sin #8");

        __CLR4_4_11id31id3lb90pc93.R.inc(70585);test(DfpMath.sin(DfpMath.atan(factory.getOne())),  // pi/4
             factory.newDfp("0.5").sqrt(),
             DfpField.FLAG_INEXACT, "sin #9");

        __CLR4_4_11id31id3lb90pc93.R.inc(70586);test(DfpMath.sin(DfpMath.atan(factory.getOne())).negate(),  // -pi/4
             factory.newDfp("0.5").sqrt().negate(),
             DfpField.FLAG_INEXACT, "sin #10");

        __CLR4_4_11id31id3lb90pc93.R.inc(70587);test(DfpMath.sin(DfpMath.atan(factory.getOne())).negate(),  // -pi/4
             factory.newDfp("0.5").sqrt().negate(),
             DfpField.FLAG_INEXACT, "sin #11");

        __CLR4_4_11id31id3lb90pc93.R.inc(70588);test(DfpMath.sin(factory.newDfp("0.1")),
             factory.newDfp("0.0998334166468281523"),
             DfpField.FLAG_INEXACT, "sin #12");

        __CLR4_4_11id31id3lb90pc93.R.inc(70589);test(DfpMath.sin(factory.newDfp("0.2")),
             factory.newDfp("0.19866933079506121546"),
             DfpField.FLAG_INEXACT, "sin #13");

        __CLR4_4_11id31id3lb90pc93.R.inc(70590);test(DfpMath.sin(factory.newDfp("0.3")),
             factory.newDfp("0.2955202066613395751"),
             DfpField.FLAG_INEXACT, "sin #14");

        __CLR4_4_11id31id3lb90pc93.R.inc(70591);test(DfpMath.sin(factory.newDfp("0.4")),
             factory.newDfp("0.38941834230865049166"),
             DfpField.FLAG_INEXACT, "sin #15");

        __CLR4_4_11id31id3lb90pc93.R.inc(70592);test(DfpMath.sin(factory.newDfp("0.5")),
             factory.newDfp("0.47942553860420300026"),  // off by one ULP
             DfpField.FLAG_INEXACT, "sin #16");

        __CLR4_4_11id31id3lb90pc93.R.inc(70593);test(DfpMath.sin(factory.newDfp("0.6")),
             factory.newDfp("0.56464247339503535721"),  // off by one ULP
             DfpField.FLAG_INEXACT, "sin #17");

        __CLR4_4_11id31id3lb90pc93.R.inc(70594);test(DfpMath.sin(factory.newDfp("0.7")),
             factory.newDfp("0.64421768723769105367"),  
             DfpField.FLAG_INEXACT, "sin #18");

        __CLR4_4_11id31id3lb90pc93.R.inc(70595);test(DfpMath.sin(factory.newDfp("0.8")),        
             factory.newDfp("0.71735609089952276163"),
             DfpField.FLAG_INEXACT, "sin #19");

        __CLR4_4_11id31id3lb90pc93.R.inc(70596);test(DfpMath.sin(factory.newDfp("0.9")),        // off by one ULP
             factory.newDfp("0.78332690962748338847"),
             DfpField.FLAG_INEXACT, "sin #20");

        __CLR4_4_11id31id3lb90pc93.R.inc(70597);test(DfpMath.sin(factory.newDfp("1.0")),
             factory.newDfp("0.84147098480789650666"),
             DfpField.FLAG_INEXACT, "sin #21");

        __CLR4_4_11id31id3lb90pc93.R.inc(70598);test(DfpMath.sin(factory.newDfp("1.1")),
             factory.newDfp("0.89120736006143533995"),
             DfpField.FLAG_INEXACT, "sin #22");

        __CLR4_4_11id31id3lb90pc93.R.inc(70599);test(DfpMath.sin(factory.newDfp("1.2")),
             factory.newDfp("0.93203908596722634968"),
             DfpField.FLAG_INEXACT, "sin #23");

        __CLR4_4_11id31id3lb90pc93.R.inc(70600);test(DfpMath.sin(factory.newDfp("1.3")),
             factory.newDfp("0.9635581854171929647"),
             DfpField.FLAG_INEXACT, "sin #24");

        __CLR4_4_11id31id3lb90pc93.R.inc(70601);test(DfpMath.sin(factory.newDfp("1.4")),
             factory.newDfp("0.98544972998846018066"),
             DfpField.FLAG_INEXACT, "sin #25");

        __CLR4_4_11id31id3lb90pc93.R.inc(70602);test(DfpMath.sin(factory.newDfp("1.5")),
             factory.newDfp("0.99749498660405443096"),
             DfpField.FLAG_INEXACT, "sin #26");

        __CLR4_4_11id31id3lb90pc93.R.inc(70603);test(DfpMath.sin(factory.newDfp("1.6")),
             factory.newDfp("0.99957360304150516323"),
             DfpField.FLAG_INEXACT, "sin #27");
    }finally{__CLR4_4_11id31id3lb90pc93.R.flushNeeded();}}


}
