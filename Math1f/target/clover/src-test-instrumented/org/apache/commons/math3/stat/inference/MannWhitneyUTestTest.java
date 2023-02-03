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
package org.apache.commons.math3.stat.inference;

import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;


/**
 * Test cases for the MannWhitneyUTestImpl class.
 *
 * @version $Id$
 */

public class MannWhitneyUTestTest {static class __CLR4_4_12bo02bo0lb90pepr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,108466,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected MannWhitneyUTest testStatistic = new MannWhitneyUTest();

    @Test
    public void testMannWhitneyUSimple() {__CLR4_4_12bo02bo0lb90pepr.R.globalSliceStart(getClass().getName(),108432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gd2nm2bo0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bo02bo0lb90pepr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bo02bo0lb90pepr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.MannWhitneyUTestTest.testMannWhitneyUSimple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gd2nm2bo0(){try{__CLR4_4_12bo02bo0lb90pepr.R.inc(108432);
        /* Target values computed using R version 2.11.1
         * x <- c(19, 22, 16, 29, 24)
         * y <- c(20, 11, 17, 12)
         * wilcox.test(x, y, alternative = "two.sided", mu = 0, paired = FALSE, exact = FALSE, correct = FALSE)
         * W = 17, p-value = 0.08641 
         */
        __CLR4_4_12bo02bo0lb90pepr.R.inc(108433);final double x[] = {19, 22, 16, 29, 24};
        __CLR4_4_12bo02bo0lb90pepr.R.inc(108434);final double y[] = {20, 11, 17, 12};
        
        __CLR4_4_12bo02bo0lb90pepr.R.inc(108435);Assert.assertEquals(17, testStatistic.mannWhitneyU(x, y), 1e-10);
        __CLR4_4_12bo02bo0lb90pepr.R.inc(108436);Assert.assertEquals(0.08641, testStatistic.mannWhitneyUTest(x, y), 1e-5);
    }finally{__CLR4_4_12bo02bo0lb90pepr.R.flushNeeded();}}


    @Test
    public void testMannWhitneyUInputValidation() {__CLR4_4_12bo02bo0lb90pepr.R.globalSliceStart(getClass().getName(),108437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115ms452bo5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bo02bo0lb90pepr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bo02bo0lb90pepr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.MannWhitneyUTestTest.testMannWhitneyUInputValidation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115ms452bo5(){try{__CLR4_4_12bo02bo0lb90pepr.R.inc(108437);
        /* Samples must be present, i.e. length > 0
         */
        __CLR4_4_12bo02bo0lb90pepr.R.inc(108438);try {
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108439);testStatistic.mannWhitneyUTest(new double[] { }, new double[] { 1.0 });
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108440);Assert.fail("x does not contain samples (exact), NoDataException expected");
        } catch (NoDataException ex) {
            // expected
        }

        __CLR4_4_12bo02bo0lb90pepr.R.inc(108441);try {
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108442);testStatistic.mannWhitneyUTest(new double[] { 1.0 }, new double[] { });
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108443);Assert.fail("y does not contain samples (exact), NoDataException expected");
        } catch (NoDataException ex) {
            // expected
        }

        /*
         * x and y is null
         */
        __CLR4_4_12bo02bo0lb90pepr.R.inc(108444);try {
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108445);testStatistic.mannWhitneyUTest(null, null);
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108446);Assert.fail("x and y is null (exact), NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }
        
        __CLR4_4_12bo02bo0lb90pepr.R.inc(108447);try {
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108448);testStatistic.mannWhitneyUTest(null, null);
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108449);Assert.fail("x and y is null (asymptotic), NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }
        
        /*
         * x or y is null
         */
        __CLR4_4_12bo02bo0lb90pepr.R.inc(108450);try {
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108451);testStatistic.mannWhitneyUTest(null, new double[] { 1.0 });
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108452);Assert.fail("x is null (exact), NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }
        
        __CLR4_4_12bo02bo0lb90pepr.R.inc(108453);try {
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108454);testStatistic.mannWhitneyUTest(new double[] { 1.0 }, null);
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108455);Assert.fail("y is null (exact), NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_12bo02bo0lb90pepr.R.flushNeeded();}}
    
    @Test
    public void testBigDataSet() {__CLR4_4_12bo02bo0lb90pepr.R.globalSliceStart(getClass().getName(),108456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bnib8x2boo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bo02bo0lb90pepr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bo02bo0lb90pepr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.MannWhitneyUTestTest.testBigDataSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bnib8x2boo(){try{__CLR4_4_12bo02bo0lb90pepr.R.inc(108456);
        __CLR4_4_12bo02bo0lb90pepr.R.inc(108457);double[] d1 = new double[1500];
        __CLR4_4_12bo02bo0lb90pepr.R.inc(108458);double[] d2 = new double[1500];
        __CLR4_4_12bo02bo0lb90pepr.R.inc(108459);for (int i = 0; (((i < 1500)&&(__CLR4_4_12bo02bo0lb90pepr.R.iget(108460)!=0|true))||(__CLR4_4_12bo02bo0lb90pepr.R.iget(108461)==0&false)); i++) {{
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108462);d1[i] = 2 * i;
            __CLR4_4_12bo02bo0lb90pepr.R.inc(108463);d2[i] = 2 * i + 1;
        }
        }__CLR4_4_12bo02bo0lb90pepr.R.inc(108464);double result = testStatistic.mannWhitneyUTest(d1, d2);
        __CLR4_4_12bo02bo0lb90pepr.R.inc(108465);Assert.assertTrue(result > 0.1);
    }finally{__CLR4_4_12bo02bo0lb90pepr.R.flushNeeded();}}
}
