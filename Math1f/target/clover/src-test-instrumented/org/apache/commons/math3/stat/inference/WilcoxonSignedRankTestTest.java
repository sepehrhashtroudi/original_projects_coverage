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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.junit.Assert;
import org.junit.Test;


/**
 * Test cases for the WilcoxonSignedRangTest class.
 *
 * @version $Id$
 */

public class WilcoxonSignedRankTestTest {static class __CLR4_4_12c142c14lb90peql{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,108959,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected WilcoxonSignedRankTest testStatistic = new WilcoxonSignedRankTest();

    @Test
    public void testWilcoxonSignedRankSimple() {__CLR4_4_12c142c14lb90peql.R.globalSliceStart(getClass().getName(),108904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19vz3i42c14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c142c14lb90peql.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c142c14lb90peql.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.WilcoxonSignedRankTestTest.testWilcoxonSignedRankSimple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19vz3i42c14(){try{__CLR4_4_12c142c14lb90peql.R.inc(108904);
        /* Target values computed using R version 2.11.1
         * x <- c(1.83, 0.50, 1.62, 2.48, 1.68, 1.88, 1.55, 3.06, 1.30)
         * y <- c(0.878, 0.647, 0.598, 2.05, 1.06, 1.29, 1.06, 3.14, 1.29)
         */
        __CLR4_4_12c142c14lb90peql.R.inc(108905);final double x[] = {1.83, 0.50, 1.62, 2.48, 1.68, 1.88, 1.55, 3.06, 1.30};
        __CLR4_4_12c142c14lb90peql.R.inc(108906);final double y[] = {0.878, 0.647, 0.598, 2.05, 1.06, 1.29, 1.06, 3.14, 1.29};
        
        /* EXACT:
         * wilcox.test(x, y, alternative = "two.sided", mu = 0, paired = TRUE, exact = TRUE, correct = FALSE)
         * V = 40, p-value = 0.03906
         * 
         * Corresponds to the value obtained in R.
         */
        __CLR4_4_12c142c14lb90peql.R.inc(108907);Assert.assertEquals(40, testStatistic.wilcoxonSignedRank(x, y), 1e-10);
        __CLR4_4_12c142c14lb90peql.R.inc(108908);Assert.assertEquals(0.03906, testStatistic.wilcoxonSignedRankTest(x, y, true), 1e-5);        
        
        /* ASYMPTOTIC:
         * wilcox.test(x, y, alternative = "two.sided", mu = 0, paired = TRUE, exact = FALSE, correct = FALSE)
         * V = 40, p-value = 0.03815
         * 
         * This is not entirely the same due to different corrects, 
         * e.g. http://mlsc.lboro.ac.uk/resources/statistics/wsrt.pdf
         * and src/library/stats/R/wilcox.test.R in the R source
         */
        __CLR4_4_12c142c14lb90peql.R.inc(108909);Assert.assertEquals(40, testStatistic.wilcoxonSignedRank(x, y), 1e-10);
        __CLR4_4_12c142c14lb90peql.R.inc(108910);Assert.assertEquals(0.0329693812, testStatistic.wilcoxonSignedRankTest(x, y, false), 1e-10);
    }finally{__CLR4_4_12c142c14lb90peql.R.flushNeeded();}}
    
    @Test
    public void testWilcoxonSignedRankInputValidation() {__CLR4_4_12c142c14lb90peql.R.globalSliceStart(getClass().getName(),108911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdim5d2c1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12c142c14lb90peql.R.rethrow($CLV_t2$);}finally{__CLR4_4_12c142c14lb90peql.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.WilcoxonSignedRankTestTest.testWilcoxonSignedRankInputValidation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdim5d2c1b(){try{__CLR4_4_12c142c14lb90peql.R.inc(108911);
        /*
         * Exact only for sample size <= 30
         */
        __CLR4_4_12c142c14lb90peql.R.inc(108912);final double[] x1 = new double[30];
        __CLR4_4_12c142c14lb90peql.R.inc(108913);final double[] x2 = new double[31];
        __CLR4_4_12c142c14lb90peql.R.inc(108914);final double[] y1 = new double[30];
        __CLR4_4_12c142c14lb90peql.R.inc(108915);final double[] y2 = new double[31];
        __CLR4_4_12c142c14lb90peql.R.inc(108916);for (int i = 0; (((i < 30)&&(__CLR4_4_12c142c14lb90peql.R.iget(108917)!=0|true))||(__CLR4_4_12c142c14lb90peql.R.iget(108918)==0&false)); ++i) {{
            __CLR4_4_12c142c14lb90peql.R.inc(108919);x1[i] = x2[i] = y1[i] = y2[i] = i;            
        }
        
        // Exactly 30 is okay
        //testStatistic.wilcoxonSignedRankTest(x1, y1, true);            
        
        }__CLR4_4_12c142c14lb90peql.R.inc(108920);try {
            __CLR4_4_12c142c14lb90peql.R.inc(108921);testStatistic.wilcoxonSignedRankTest(x2, y2, true);
            __CLR4_4_12c142c14lb90peql.R.inc(108922);Assert.fail("More than 30 samples and exact chosen, NumberIsTooLargeException expected");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
        
        /* Samples must be present, i.e. length > 0
         */
        __CLR4_4_12c142c14lb90peql.R.inc(108923);try {
            __CLR4_4_12c142c14lb90peql.R.inc(108924);testStatistic.wilcoxonSignedRankTest(new double[] { }, new double[] { 1.0 }, true);
            __CLR4_4_12c142c14lb90peql.R.inc(108925);Assert.fail("x does not contain samples (exact), NoDataException expected");
        } catch (NoDataException ex) {
            // expected
        }

        __CLR4_4_12c142c14lb90peql.R.inc(108926);try {
            __CLR4_4_12c142c14lb90peql.R.inc(108927);testStatistic.wilcoxonSignedRankTest(new double[] { }, new double[] { 1.0 }, false);
            __CLR4_4_12c142c14lb90peql.R.inc(108928);Assert.fail("x does not contain samples (asymptotic), NoDataException expected");
        } catch (NoDataException ex) {
            // expected
        }

        __CLR4_4_12c142c14lb90peql.R.inc(108929);try {
            __CLR4_4_12c142c14lb90peql.R.inc(108930);testStatistic.wilcoxonSignedRankTest(new double[] { 1.0 }, new double[] { }, true);
            __CLR4_4_12c142c14lb90peql.R.inc(108931);Assert.fail("y does not contain samples (exact), NoDataException expected");
        } catch (NoDataException ex) {
            // expected
        }

        __CLR4_4_12c142c14lb90peql.R.inc(108932);try {
            __CLR4_4_12c142c14lb90peql.R.inc(108933);testStatistic.wilcoxonSignedRankTest(new double[] { 1.0 }, new double[] { }, false);
            __CLR4_4_12c142c14lb90peql.R.inc(108934);Assert.fail("y does not contain samples (asymptotic), NoDataException expected");
        } catch (NoDataException ex) {
            // expected
        }

        /* Samples not same size, i.e. cannot be pairred
         */
        __CLR4_4_12c142c14lb90peql.R.inc(108935);try {
            __CLR4_4_12c142c14lb90peql.R.inc(108936);testStatistic.wilcoxonSignedRankTest(new double[] { 1.0, 2.0 }, new double[] { 3.0 }, true);
            __CLR4_4_12c142c14lb90peql.R.inc(108937);Assert.fail("x and y not same size (exact), DimensionMismatchException expected");
        } catch (DimensionMismatchException ex) {
            // expected
        }

        __CLR4_4_12c142c14lb90peql.R.inc(108938);try {
            __CLR4_4_12c142c14lb90peql.R.inc(108939);testStatistic.wilcoxonSignedRankTest(new double[] { 1.0, 2.0 }, new double[] { 3.0 }, false);
            __CLR4_4_12c142c14lb90peql.R.inc(108940);Assert.fail("x and y not same size (asymptotic), DimensionMismatchException expected");
        } catch (DimensionMismatchException ex) {
            // expected
        }
        
        /*
         * x and y is null
         */
        __CLR4_4_12c142c14lb90peql.R.inc(108941);try {
            __CLR4_4_12c142c14lb90peql.R.inc(108942);testStatistic.wilcoxonSignedRankTest(null, null, true);
            __CLR4_4_12c142c14lb90peql.R.inc(108943);Assert.fail("x and y is null (exact), NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }
        
        __CLR4_4_12c142c14lb90peql.R.inc(108944);try {
            __CLR4_4_12c142c14lb90peql.R.inc(108945);testStatistic.wilcoxonSignedRankTest(null, null, false);
            __CLR4_4_12c142c14lb90peql.R.inc(108946);Assert.fail("x and y is null (asymptotic), NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }
        
        /*
         * x or y is null
         */
        __CLR4_4_12c142c14lb90peql.R.inc(108947);try {
            __CLR4_4_12c142c14lb90peql.R.inc(108948);testStatistic.wilcoxonSignedRankTest(null, new double[] { 1.0 }, true);
            __CLR4_4_12c142c14lb90peql.R.inc(108949);Assert.fail("x is null (exact), NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }
        
        __CLR4_4_12c142c14lb90peql.R.inc(108950);try {
            __CLR4_4_12c142c14lb90peql.R.inc(108951);testStatistic.wilcoxonSignedRankTest(null, new double[] { 1.0 }, false);
            __CLR4_4_12c142c14lb90peql.R.inc(108952);Assert.fail("x is null (asymptotic), NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }
        
        __CLR4_4_12c142c14lb90peql.R.inc(108953);try {
            __CLR4_4_12c142c14lb90peql.R.inc(108954);testStatistic.wilcoxonSignedRankTest(new double[] { 1.0 }, null, true);
            __CLR4_4_12c142c14lb90peql.R.inc(108955);Assert.fail("y is null (exact), NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }
        
        __CLR4_4_12c142c14lb90peql.R.inc(108956);try {
            __CLR4_4_12c142c14lb90peql.R.inc(108957);testStatistic.wilcoxonSignedRankTest(new double[] { 1.0 }, null, false);
            __CLR4_4_12c142c14lb90peql.R.inc(108958);Assert.fail("y is null (asymptotic), NullArgumentException expected");
        } catch (NullArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_12c142c14lb90peql.R.flushNeeded();}}
}
