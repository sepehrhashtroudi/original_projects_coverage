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

public class DfpDecTest {static class __CLR4_4_11i8s1i8slb90pc8n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,70455,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DfpField field;
    private Dfp pinf;
    private Dfp ninf;

    @Before
    public void setUp() {try{__CLR4_4_11i8s1i8slb90pc8n.R.inc(70300);
        // Some basic setup.  Define some constants and clear the status flags
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70301);field = new DfpField(20);
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70302);pinf = new DfpDec(field, 1).divide(new DfpDec(field, 0));
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70303);ninf = new DfpDec(field, -1).divide(new DfpDec(field, 0));
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70304);ninf.getField().clearIEEEFlags();
    }finally{__CLR4_4_11i8s1i8slb90pc8n.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_4_11i8s1i8slb90pc8n.R.inc(70305);
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70306);field = null;
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70307);pinf    = null;
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70308);ninf    = null;
    }finally{__CLR4_4_11i8s1i8slb90pc8n.R.flushNeeded();}}

    // Generic test function.  Takes params x and y and tests them for 
    // equality.  Then checks the status flags against the flags argument.
    // If the test fail, it prints the desc string
    private void test(Dfp x, Dfp y, int flags, String desc) {try{__CLR4_4_11i8s1i8slb90pc8n.R.inc(70309);
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70310);boolean b = x.equals(y);

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70311);if ((((!x.equals(y) && !x.unequal(y))&&(__CLR4_4_11i8s1i8slb90pc8n.R.iget(70312)!=0|true))||(__CLR4_4_11i8s1i8slb90pc8n.R.iget(70313)==0&false)))  // NaNs involved 
            {__CLR4_4_11i8s1i8slb90pc8n.R.inc(70314);b = (x.toString().equals(y.toString()));

        }__CLR4_4_11i8s1i8slb90pc8n.R.inc(70315);if ((((x.equals(new DfpDec(field, 0)))&&(__CLR4_4_11i8s1i8slb90pc8n.R.iget(70316)!=0|true))||(__CLR4_4_11i8s1i8slb90pc8n.R.iget(70317)==0&false)))  // distinguish +/- zero
            {__CLR4_4_11i8s1i8slb90pc8n.R.inc(70318);b = (b && (x.toString().equals(y.toString())));

        }__CLR4_4_11i8s1i8slb90pc8n.R.inc(70319);b = (b && x.getField().getIEEEFlags() == flags);

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70320);if ((((!b)&&(__CLR4_4_11i8s1i8slb90pc8n.R.iget(70321)!=0|true))||(__CLR4_4_11i8s1i8slb90pc8n.R.iget(70322)==0&false)))
            {__CLR4_4_11i8s1i8slb90pc8n.R.inc(70323);Assert.assertTrue("assersion failed "+desc+" x = "+x.toString()+" flags = "+x.getField().getIEEEFlags(), b);

        }__CLR4_4_11i8s1i8slb90pc8n.R.inc(70324);x.getField().clearIEEEFlags();
    }finally{__CLR4_4_11i8s1i8slb90pc8n.R.flushNeeded();}}

    @Test
    public void testRound()
    {__CLR4_4_11i8s1i8slb90pc8n.R.globalSliceStart(getClass().getName(),70325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyajvh1i9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i8s1i8slb90pc8n.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i8s1i8slb90pc8n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpDecTest.testRound",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyajvh1i9h(){try{__CLR4_4_11i8s1i8slb90pc8n.R.inc(70325);
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70326);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_EVEN);

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70327);test(new DfpDec(field, "12345678901234567890"),
             new DfpDec(field, "12345678901234568000"),
             DfpField.FLAG_INEXACT, "Round #1");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70328);test(new DfpDec(field, "0.12345678901234567890"),
             new DfpDec(field, "0.12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #2");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70329);test(new DfpDec(field, "0.12345678901234567500"),
             new DfpDec(field, "0.12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #3");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70330);test(new DfpDec(field, "0.12345678901234568500"),
             new DfpDec(field, "0.12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #4");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70331);test(new DfpDec(field, "0.12345678901234568501"),
             new DfpDec(field, "0.12345678901234569"),
             DfpField.FLAG_INEXACT, "Round #5");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70332);test(new DfpDec(field, "0.12345678901234568499"),
             new DfpDec(field, "0.12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #6");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70333);test(new DfpDec(field, "1.2345678901234567890"),
             new DfpDec(field, "1.2345678901234568"),
             DfpField.FLAG_INEXACT, "Round #7");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70334);test(new DfpDec(field, "1.2345678901234567500"),
             new DfpDec(field, "1.2345678901234568"),
             DfpField.FLAG_INEXACT, "Round #8");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70335);test(new DfpDec(field, "1.2345678901234568500"),
             new DfpDec(field, "1.2345678901234568"),
             DfpField.FLAG_INEXACT, "Round #9");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70336);test(new DfpDec(field, "1.2345678901234568000").add(new DfpDec(field, ".0000000000000000501")),
             new DfpDec(field, "1.2345678901234569"),
             DfpField.FLAG_INEXACT, "Round #10");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70337);test(new DfpDec(field, "1.2345678901234568499"),
             new DfpDec(field, "1.2345678901234568"),
             DfpField.FLAG_INEXACT, "Round #11");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70338);test(new DfpDec(field, "12.345678901234567890"),
             new DfpDec(field, "12.345678901234568"),
             DfpField.FLAG_INEXACT, "Round #12");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70339);test(new DfpDec(field, "12.345678901234567500"),
             new DfpDec(field, "12.345678901234568"),
             DfpField.FLAG_INEXACT, "Round #13");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70340);test(new DfpDec(field, "12.345678901234568500"),
             new DfpDec(field, "12.345678901234568"),
             DfpField.FLAG_INEXACT, "Round #14");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70341);test(new DfpDec(field, "12.345678901234568").add(new DfpDec(field, ".000000000000000501")),
             new DfpDec(field, "12.345678901234569"),
             DfpField.FLAG_INEXACT, "Round #15");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70342);test(new DfpDec(field, "12.345678901234568499"),
             new DfpDec(field, "12.345678901234568"),
             DfpField.FLAG_INEXACT, "Round #16");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70343);test(new DfpDec(field, "123.45678901234567890"),
             new DfpDec(field, "123.45678901234568"),
             DfpField.FLAG_INEXACT, "Round #17");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70344);test(new DfpDec(field, "123.45678901234567500"),
             new DfpDec(field, "123.45678901234568"),
             DfpField.FLAG_INEXACT, "Round #18");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70345);test(new DfpDec(field, "123.45678901234568500"),
             new DfpDec(field, "123.45678901234568"),
             DfpField.FLAG_INEXACT, "Round #19");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70346);test(new DfpDec(field, "123.456789012345685").add(new DfpDec(field, ".00000000000000501")),
             new DfpDec(field, "123.45678901234569"),
             DfpField.FLAG_INEXACT, "Round #20");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70347);test(new DfpDec(field, "123.45678901234568499"),
             new DfpDec(field, "123.45678901234568"),
             DfpField.FLAG_INEXACT, "Round #21");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70348);field.setRoundingMode(DfpField.RoundingMode.ROUND_DOWN);

        // Round down
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70349);test(new DfpDec(field, "12345678901234567").add(new DfpDec(field, "0.9")),
             new DfpDec(field, "12345678901234567"),
             DfpField.FLAG_INEXACT, "Round #22");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70350);test(new DfpDec(field, "12345678901234567").add(new DfpDec(field, "0.99999999")),
             new DfpDec(field, "12345678901234567"),
             DfpField.FLAG_INEXACT, "Round #23");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70351);test(new DfpDec(field, "-12345678901234567").add(new DfpDec(field, "-0.99999999")),
             new DfpDec(field, "-12345678901234567"),
             DfpField.FLAG_INEXACT, "Round #24");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70352);field.setRoundingMode(DfpField.RoundingMode.ROUND_UP);

        // Round up
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70353);test(new DfpDec(field, "12345678901234567").add(new DfpDec(field, "0.1")),
             new DfpDec(field, "12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #25");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70354);test(new DfpDec(field, "12345678901234567").add(new DfpDec(field, "0.0001")),
             new DfpDec(field, "12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #26");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70355);test(new DfpDec(field, "-12345678901234567").add(new DfpDec(field, "-0.1")),
             new DfpDec(field, "-12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #27");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70356);test(new DfpDec(field, "-12345678901234567").add(new DfpDec(field, "-0.0001")),
             new DfpDec(field, "-12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #28");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70357);test(new DfpDec(field, "-12345678901234567").add(new DfpDec(field, "0")),
             new DfpDec(field, "-12345678901234567"),
             0, "Round #28.5");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70358);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_UP);

        // Round half up
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70359);test(new DfpDec(field, "12345678901234567").add(new DfpDec(field, "0.499999999999")),
             new DfpDec(field, "12345678901234567"),
             DfpField.FLAG_INEXACT, "Round #29");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70360);test(new DfpDec(field, "12345678901234567").add(new DfpDec(field, "0.50000001")),
             new DfpDec(field, "12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #30");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70361);test(new DfpDec(field, "12345678901234567").add(new DfpDec(field, "0.5")),
             new DfpDec(field, "12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #30.5");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70362);test(new DfpDec(field, "-12345678901234567").add(new DfpDec(field, "-0.499999999999")),
             new DfpDec(field, "-12345678901234567"),
             DfpField.FLAG_INEXACT, "Round #31");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70363);test(new DfpDec(field, "-12345678901234567").add(new DfpDec(field, "-0.50000001")),
             new DfpDec(field, "-12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #32");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70364);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_DOWN);

        // Round half down
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70365);test(new DfpDec(field, "12345678901234567").add(new DfpDec(field, "0.5001")),
             new DfpDec(field, "12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #33");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70366);test(new DfpDec(field, "12345678901234567").add(new DfpDec(field, "0.5000")),
             new DfpDec(field, "12345678901234567"),
             DfpField.FLAG_INEXACT, "Round #34");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70367);test(new DfpDec(field, "-12345678901234567").add(new DfpDec(field, "-0.5001")),
             new DfpDec(field, "-12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #35");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70368);test(new DfpDec(field, "-12345678901234567").add(new DfpDec(field, "-0.6")),
             new DfpDec(field, "-12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #35.5");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70369);test(new DfpDec(field, "-12345678901234567").add(new DfpDec(field, "-0.5000")),
             new DfpDec(field, "-12345678901234567"),
             DfpField.FLAG_INEXACT, "Round #36");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70370);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_ODD);

        // Round half odd
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70371);test(new DfpDec(field, "12345678901234568").add(new DfpDec(field, "0.5000")),
             new DfpDec(field, "12345678901234569"),
             DfpField.FLAG_INEXACT, "Round #37");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70372);test(new DfpDec(field, "12345678901234567").add(new DfpDec(field, "0.5000")),
             new DfpDec(field, "12345678901234567"),
             DfpField.FLAG_INEXACT, "Round #38");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70373);test(new DfpDec(field, "-12345678901234568").add(new DfpDec(field, "-0.5000")),
             new DfpDec(field, "-12345678901234569"),
             DfpField.FLAG_INEXACT, "Round #39");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70374);test(new DfpDec(field, "-12345678901234567").add(new DfpDec(field, "-0.5000")),
             new DfpDec(field, "-12345678901234567"),
             DfpField.FLAG_INEXACT, "Round #40");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70375);field.setRoundingMode(DfpField.RoundingMode.ROUND_CEIL);

        // Round ceil
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70376);test(new DfpDec(field, "12345678901234567").add(new DfpDec(field, "0.0001")),
             new DfpDec(field, "12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #41");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70377);test(new DfpDec(field, "-12345678901234567").add(new DfpDec(field, "-0.9999")),
             new DfpDec(field, "-12345678901234567"),
             DfpField.FLAG_INEXACT, "Round #42");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70378);field.setRoundingMode(DfpField.RoundingMode.ROUND_FLOOR);

        // Round floor
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70379);test(new DfpDec(field, "12345678901234567").add(new DfpDec(field, "0.9999")),
             new DfpDec(field, "12345678901234567"),
             DfpField.FLAG_INEXACT, "Round #43");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70380);test(new DfpDec(field, "-12345678901234567").add(new DfpDec(field, "-0.0001")),
             new DfpDec(field, "-12345678901234568"),
             DfpField.FLAG_INEXACT, "Round #44");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70381);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_EVEN);  // reset
    }finally{__CLR4_4_11i8s1i8slb90pc8n.R.flushNeeded();}}

    @Test
    public void testRoundDecimal10()
    {__CLR4_4_11i8s1i8slb90pc8n.R.globalSliceStart(getClass().getName(),70382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11dpl1h1ib2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i8s1i8slb90pc8n.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i8s1i8slb90pc8n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpDecTest.testRoundDecimal10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11dpl1h1ib2(){try{__CLR4_4_11i8s1i8slb90pc8n.R.inc(70382);
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70383);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_EVEN);

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70384);test(new Decimal10(field, "1234567891234567890"),
             new Decimal10(field, "1234567891000000000"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #1");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70385);test(new Decimal10(field, "0.1234567891634567890"),
             new Decimal10(field, "0.1234567892"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #2");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70386);test(new Decimal10(field, "0.1234567891500000000"),
             new Decimal10(field, "0.1234567892"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #3");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70387);test(new Decimal10(field, "0.1234567890500"),
             new Decimal10(field, "0.1234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #4");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70388);test(new Decimal10(field, "0.1234567890501"),
             new Decimal10(field, "0.1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #5");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70389);test(new Decimal10(field, "0.1234567890499"),
             new Decimal10(field, "0.1234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #6");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70390);test(new Decimal10(field, "1.234567890890"),
             new Decimal10(field, "1.234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #7");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70391);test(new Decimal10(field, "1.234567891500"),
             new Decimal10(field, "1.234567892"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #8");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70392);test(new Decimal10(field, "1.234567890500"),
             new Decimal10(field, "1.234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #9");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70393);test(new Decimal10(field, "1.234567890000").add(new Decimal10(field, ".000000000501")),
             new Decimal10(field, "1.234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #10");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70394);test(new Decimal10(field, "1.234567890499"),
             new Decimal10(field, "1.234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #11");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70395);test(new Decimal10(field, "12.34567890890"),
             new Decimal10(field, "12.34567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #12");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70396);test(new Decimal10(field, "12.34567891500"),
             new Decimal10(field, "12.34567892"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #13");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70397);test(new Decimal10(field, "12.34567890500"),
             new Decimal10(field, "12.34567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #14");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70398);test(new Decimal10(field, "12.34567890").add(new Decimal10(field, ".00000000501")),
             new Decimal10(field, "12.34567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #15");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70399);test(new Decimal10(field, "12.34567890499"),
             new Decimal10(field, "12.34567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #16");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70400);test(new Decimal10(field, "123.4567890890"),
             new Decimal10(field, "123.4567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #17");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70401);test(new Decimal10(field, "123.4567891500"),
             new Decimal10(field, "123.4567892"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #18");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70402);test(new Decimal10(field, "123.4567890500"),
             new Decimal10(field, "123.4567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #19");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70403);test(new Decimal10(field, "123.4567890").add(new Decimal10(field, ".0000000501")),
             new Decimal10(field, "123.4567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #20");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70404);test(new Decimal10(field, "123.4567890499"),
             new Decimal10(field, "123.4567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #21");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70405);field.setRoundingMode(DfpField.RoundingMode.ROUND_DOWN);

        // RoundDecimal10 down
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70406);test(new Decimal10(field, "1234567890").add(new Decimal10(field, "0.9")),
             new Decimal10(field, "1234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #22");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70407);test(new Decimal10(field, "1234567890").add(new Decimal10(field, "0.99999999")),
             new Decimal10(field, "1234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #23");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70408);test(new Decimal10(field, "-1234567890").add(new Decimal10(field, "-0.99999999")),
             new Decimal10(field, "-1234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #24");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70409);field.setRoundingMode(DfpField.RoundingMode.ROUND_UP);

        // RoundDecimal10 up
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70410);test(new Decimal10(field, 1234567890).add(new Decimal10(field, "0.1")),
             new Decimal10(field, 1234567891l),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #25");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70411);test(new Decimal10(field, "1234567890").add(new Decimal10(field, "0.0001")),
             new Decimal10(field, "1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #26");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70412);test(new Decimal10(field, "-1234567890").add(new Decimal10(field, "-0.1")),
             new Decimal10(field, "-1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #27");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70413);test(new Decimal10(field, "-1234567890").add(new Decimal10(field, "-0.0001")),
             new Decimal10(field, "-1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #28");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70414);test(new Decimal10(field, "-1234567890").add(new Decimal10(field, "0")),
             new Decimal10(field, "-1234567890"),
             0, "RoundDecimal10 #28.5");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70415);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_UP);

        // RoundDecimal10 half up
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70416);test(new Decimal10(field, "1234567890").add(new Decimal10(field, "0.4999999999")),
             new Decimal10(field, "1234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #29");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70417);test(new Decimal10(field, "1234567890").add(new Decimal10(field, "0.50000001")),
             new Decimal10(field, "1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #30");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70418);test(new Decimal10(field, "1234567890").add(new Decimal10(field, "0.5")),
             new Decimal10(field, "1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #30.5");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70419);test(new Decimal10(field, "-1234567890").add(new Decimal10(field, "-0.4999999999")),
             new Decimal10(field, "-1234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #31");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70420);test(new Decimal10(field, "-1234567890").add(new Decimal10(field, "-0.50000001")),
             new Decimal10(field, "-1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #32");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70421);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_DOWN);

        // RoundDecimal10 half down
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70422);test(new Decimal10(field, "1234567890").add(new Decimal10(field, "0.5001")),
             new Decimal10(field, "1234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #33");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70423);test(new Decimal10(field, "1234567890").add(new Decimal10(field, "0.5000")),
             new Decimal10(field, "1234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #34");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70424);test(new Decimal10(field, "-1234567890").add(new Decimal10(field, "-0.5001")),
             new Decimal10(field, "-1234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #35");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70425);test(new Decimal10(field, "-1234567890").add(new Decimal10(field, "-0.6")),
             new Decimal10(field, "-1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #35.5");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70426);test(new Decimal10(field, "-1234567890").add(new Decimal10(field, "-0.5000")),
             new Decimal10(field, "-1234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #36");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70427);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_ODD);

        // RoundDecimal10 half odd
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70428);test(new Decimal10(field, "1234567890").add(new Decimal10(field, "0.5000")),
             new Decimal10(field, "1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #37");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70429);test(new Decimal10(field, "1234567891").add(new Decimal10(field, "0.5000")),
             new Decimal10(field, "1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #38");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70430);test(new Decimal10(field, "-1234567890").add(new Decimal10(field, "-0.5000")),
             new Decimal10(field, "-1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #39");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70431);test(new Decimal10(field, "-1234567891").add(new Decimal10(field, "-0.5000")),
             new Decimal10(field, "-1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #40");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70432);field.setRoundingMode(DfpField.RoundingMode.ROUND_CEIL);

        // RoundDecimal10 ceil
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70433);test(new Decimal10(field, "1234567890").add(new Decimal10(field, "0.0001")),
             new Decimal10(field, "1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #41");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70434);test(new Decimal10(field, "-1234567890").add(new Decimal10(field, "-0.9999")),
             new Decimal10(field, "-1234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #42");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70435);field.setRoundingMode(DfpField.RoundingMode.ROUND_FLOOR);

        // RoundDecimal10 floor
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70436);test(new Decimal10(field, "1234567890").add(new Decimal10(field, "0.9999")),
             new Decimal10(field, "1234567890"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #43");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70437);test(new Decimal10(field, "-1234567890").add(new Decimal10(field, "-0.0001")),
             new Decimal10(field, "-1234567891"),
             DfpField.FLAG_INEXACT, "RoundDecimal10 #44");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70438);field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_EVEN);  // reset
    }finally{__CLR4_4_11i8s1i8slb90pc8n.R.flushNeeded();}}

    @Test
    public void testNextAfter()
    {__CLR4_4_11i8s1i8slb90pc8n.R.globalSliceStart(getClass().getName(),70439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wb8hpa1icn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i8s1i8slb90pc8n.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i8s1i8slb90pc8n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.DfpDecTest.testNextAfter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wb8hpa1icn(){try{__CLR4_4_11i8s1i8slb90pc8n.R.inc(70439);
        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70440);test(new DfpDec(field, 1).nextAfter(pinf),
             new DfpDec(field, "1.0000000000000001"),
             0, "NextAfter #1");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70441);test(new DfpDec(field, "1.0000000000000001").nextAfter(ninf),
             new DfpDec(field, 1),
             0, "NextAfter #1.5");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70442);test(new DfpDec(field, 1).nextAfter(ninf),
             new DfpDec(field, "0.99999999999999999"),
             0, "NextAfter #2");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70443);test(new DfpDec(field, "0.99999999999999999").nextAfter(new DfpDec(field, 2)),
             new DfpDec(field, 1),
             0, "NextAfter #3");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70444);test(new DfpDec(field, -1).nextAfter(ninf),
             new DfpDec(field, "-1.0000000000000001"),
             0, "NextAfter #4");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70445);test(new DfpDec(field, -1).nextAfter(pinf),
             new DfpDec(field, "-0.99999999999999999"),
             0, "NextAfter #5");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70446);test(new DfpDec(field, "-0.99999999999999999").nextAfter(new DfpDec(field, -2)),
             new DfpDec(field, (byte) -1),
             0, "NextAfter #6");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70447);test(new DfpDec(field, (byte) 2).nextAfter(new DfpDec(field, 2)),
             new DfpDec(field, 2l),
             0, "NextAfter #7");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70448);test(new DfpDec(field, 0).nextAfter(new DfpDec(field, 0)),
             new DfpDec(field, 0),
             0, "NextAfter #8");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70449);test(new DfpDec(field, -2).nextAfter(new DfpDec(field, -2)),
             new DfpDec(field, -2),
             0, "NextAfter #9");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70450);test(new DfpDec(field, 0).nextAfter(new DfpDec(field, 1)),
             new DfpDec(field, "1e-131092"),
             DfpField.FLAG_UNDERFLOW, "NextAfter #10");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70451);test(new DfpDec(field, 0).nextAfter(new DfpDec(field, -1)),
             new DfpDec(field, "-1e-131092"),
             DfpField.FLAG_UNDERFLOW, "NextAfter #11");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70452);test(new DfpDec(field, "-1e-131092").nextAfter(pinf),
             new DfpDec(field, "-0"),
             DfpField.FLAG_UNDERFLOW|DfpField.FLAG_INEXACT, "Next After #12");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70453);test(new DfpDec(field, "1e-131092").nextAfter(ninf), 
             new DfpDec(field, "0"),
             DfpField.FLAG_UNDERFLOW|DfpField.FLAG_INEXACT, "Next After #13");

        __CLR4_4_11i8s1i8slb90pc8n.R.inc(70454);test(new DfpDec(field, "9.9999999999999999e131078").nextAfter(pinf),
             pinf,
             DfpField.FLAG_OVERFLOW|DfpField.FLAG_INEXACT, "Next After #14");
    }finally{__CLR4_4_11i8s1i8slb90pc8n.R.flushNeeded();}}

}
