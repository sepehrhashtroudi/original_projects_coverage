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
package org.apache.commons.math3.stat.regression;

import java.util.Random;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.random.ISAACRandom;
import org.junit.Assert;
import org.junit.Test;


/**
 * Test cases for the TestStatistic class.
 *
 * @version $Id$
 */

public final class SimpleRegressionTest {static class __CLR4_4_12czq2czqlb90pet8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,110520,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /*
     * NIST "Norris" refernce data set from
     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Norris.dat
     * Strangely, order is {y,x}
     */
    private double[][] data = { { 0.1, 0.2 }, {338.8, 337.4 }, {118.1, 118.2 },
            {888.0, 884.6 }, {9.2, 10.1 }, {228.1, 226.5 }, {668.5, 666.3 }, {998.5, 996.3 },
            {449.1, 448.6 }, {778.9, 777.0 }, {559.2, 558.2 }, {0.3, 0.4 }, {0.1, 0.6 }, {778.1, 775.5 },
            {668.8, 666.9 }, {339.3, 338.0 }, {448.9, 447.5 }, {10.8, 11.6 }, {557.7, 556.0 },
            {228.3, 228.1 }, {998.0, 995.8 }, {888.8, 887.6 }, {119.6, 120.2 }, {0.3, 0.3 },
            {0.6, 0.3 }, {557.6, 556.8 }, {339.3, 339.1 }, {888.0, 887.2 }, {998.5, 999.0 },
            {778.9, 779.0 }, {10.2, 11.1 }, {117.6, 118.3 }, {228.9, 229.2 }, {668.4, 669.1 },
            {449.2, 448.9 }, {0.2, 0.5 }
    };

    /*
     * Correlation example from
     * http://www.xycoon.com/correlation.htm
     */
    private double[][] corrData = { { 101.0, 99.2 }, {100.1, 99.0 }, {100.0, 100.0 },
            {90.6, 111.6 }, {86.5, 122.2 }, {89.7, 117.6 }, {90.6, 121.1 }, {82.8, 136.0 },
            {70.1, 154.2 }, {65.4, 153.6 }, {61.3, 158.5 }, {62.5, 140.6 }, {63.6, 136.2 },
            {52.6, 168.0 }, {59.7, 154.3 }, {59.5, 149.0 }, {61.3, 165.5 }
    };

    /*
     * From Moore and Mcabe, "Introduction to the Practice of Statistics"
     * Example 10.3
     */
    private double[][] infData = { { 15.6, 5.2 }, {26.8, 6.1 }, {37.8, 8.7 }, {36.4, 8.5 },
            {35.5, 8.8 }, {18.6, 4.9 }, {15.3, 4.5 }, {7.9, 2.5 }, {0.0, 1.1 }
    };

    /*
     * Points to remove in the remove tests
     */
    private double[][] removeSingle = {infData[1]};
    private double[][] removeMultiple = { infData[1], infData[2] };
    private double removeX = infData[0][0];
    private double removeY = infData[0][1];


    /*
     * Data with bad linear fit
     */
    private double[][] infData2 = { { 1, 1 }, {2, 0 }, {3, 5 }, {4, 2 },
            {5, -1 }, {6, 12 }
    };


    /*
     * Data from NIST NOINT1
     */
    private double[][] noint1 = {
        {130.0,60.0},
        {131.0,61.0},
        {132.0,62.0},
        {133.0,63.0},
        {134.0,64.0},
        {135.0,65.0},
        {136.0,66.0},
        {137.0,67.0},
        {138.0,68.0},
        {139.0,69.0},
        {140.0,70.0}
    };

    /*
     * Data from NIST NOINT2
     *
     */
    private double[][] noint2 = {
        {3.0,4},
        {4,5},
        {4,6}
    };


    /**
     * Test that the SimpleRegression objects generated from combining two
     * SimpleRegression objects created from subsets of data are identical to
     * SimpleRegression objects created from the combined data.
     */
    @Test
    public void testAppend() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1twdi3x2czq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testAppend",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1twdi3x2czq(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110150);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110151);check(false);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110152);check(true);
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    /**
     * Checks that adding data to a single model gives the same result
     * as adding "parts" of the dataset to smaller models and using append
     * to aggregate the smaller models.
     *
     * @param includeIntercept
     */
    private void check(boolean includeIntercept) {try{__CLR4_4_12czq2czqlb90pet8.R.inc(110153);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110154);final int sets = 2;
        __CLR4_4_12czq2czqlb90pet8.R.inc(110155);final ISAACRandom rand = new ISAACRandom(10L);// Seed can be changed
        __CLR4_4_12czq2czqlb90pet8.R.inc(110156);final SimpleRegression whole = new SimpleRegression(includeIntercept);// regression of the whole set
        __CLR4_4_12czq2czqlb90pet8.R.inc(110157);final SimpleRegression parts = new SimpleRegression(includeIntercept);// regression with parts.

        __CLR4_4_12czq2czqlb90pet8.R.inc(110158);for (int s = 0; (((s < sets)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110159)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110160)==0&false)); s++) {{// loop through each subset of data.
            __CLR4_4_12czq2czqlb90pet8.R.inc(110161);final double coef = rand.nextDouble();
            __CLR4_4_12czq2czqlb90pet8.R.inc(110162);final SimpleRegression sub = new SimpleRegression(includeIntercept);// sub regression
            __CLR4_4_12czq2czqlb90pet8.R.inc(110163);for (int i = 0; (((i < 5)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110164)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110165)==0&false)); i++) {{ // loop through individual samlpes.
                __CLR4_4_12czq2czqlb90pet8.R.inc(110166);final double x = rand.nextDouble();
                __CLR4_4_12czq2czqlb90pet8.R.inc(110167);final double y = x * coef + rand.nextDouble();// some noise
                __CLR4_4_12czq2czqlb90pet8.R.inc(110168);sub.addData(x, y);
                __CLR4_4_12czq2czqlb90pet8.R.inc(110169);whole.addData(x, y);
            }
            }__CLR4_4_12czq2czqlb90pet8.R.inc(110170);parts.append(sub);
            __CLR4_4_12czq2czqlb90pet8.R.inc(110171);Assert.assertTrue(equals(parts, whole, 1E-6));
        }
    }}finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    /**
     * Returns true iff the statistics reported by model1 are all within tol of
     * those reported by model2.
     *
     * @param model1 first model
     * @param model2 second model
     * @param tol tolerance
     * @return true if the two models report the same regression stats
     */
    private boolean equals(SimpleRegression model1, SimpleRegression model2, double tol) {try{__CLR4_4_12czq2czqlb90pet8.R.inc(110172);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110173);if ((((model1.getN() != model2.getN())&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110174)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110175)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110176);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110177);if ((((Math.abs(model1.getIntercept() - model2.getIntercept()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110178)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110179)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110180);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110181);if ((((Math.abs(model1.getInterceptStdErr() - model2.getInterceptStdErr()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110182)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110183)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110184);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110185);if ((((Math.abs(model1.getMeanSquareError() - model2.getMeanSquareError()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110186)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110187)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110188);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110189);if ((((Math.abs(model1.getR() - model2.getR()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110190)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110191)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110192);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110193);if ((((Math.abs(model1.getRegressionSumSquares() - model2.getRegressionSumSquares()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110194)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110195)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110196);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110197);if ((((Math.abs(model1.getRSquare() - model2.getRSquare()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110198)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110199)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110200);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110201);if ((((Math.abs(model1.getSignificance() - model2.getSignificance()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110202)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110203)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110204);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110205);if ((((Math.abs(model1.getSlope() - model2.getSlope()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110206)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110207)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110208);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110209);if ((((Math.abs(model1.getSlopeConfidenceInterval() - model2.getSlopeConfidenceInterval()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110210)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110211)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110212);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110213);if ((((Math.abs(model1.getSlopeStdErr() - model2.getSlopeStdErr()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110214)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110215)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110216);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110217);if ((((Math.abs(model1.getSumOfCrossProducts() - model2.getSumOfCrossProducts()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110218)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110219)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110220);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110221);if ((((Math.abs(model1.getSumSquaredErrors() - model2.getSumSquaredErrors()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110222)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110223)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110224);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110225);if ((((Math.abs(model1.getTotalSumSquares() - model2.getTotalSumSquares()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110226)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110227)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110228);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110229);if ((((Math.abs(model1.getXSumSquares() - model2.getXSumSquares()) > tol)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110230)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110231)==0&false))) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110232);return false;
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110233);return true;
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    @Test
    public void testRegressIfaceMethod(){__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15d07on2d22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRegressIfaceMethod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15d07on2d22(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110234);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110235);final SimpleRegression regression = new SimpleRegression(true);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110236);final UpdatingMultipleLinearRegression iface = regression;
        __CLR4_4_12czq2czqlb90pet8.R.inc(110237);final SimpleRegression regressionNoint = new SimpleRegression( false );
        __CLR4_4_12czq2czqlb90pet8.R.inc(110238);final SimpleRegression regressionIntOnly= new SimpleRegression( false );
        __CLR4_4_12czq2czqlb90pet8.R.inc(110239);for (int i = 0; (((i < data.length)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110240)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110241)==0&false)); i++) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110242);iface.addObservation( new double[]{data[i][1]}, data[i][0]);
            __CLR4_4_12czq2czqlb90pet8.R.inc(110243);regressionNoint.addData(data[i][1], data[i][0]);
            __CLR4_4_12czq2czqlb90pet8.R.inc(110244);regressionIntOnly.addData(1.0, data[i][0]);
        }

        //should not be null
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110245);final RegressionResults fullReg = iface.regress( );
        __CLR4_4_12czq2czqlb90pet8.R.inc(110246);Assert.assertNotNull(fullReg);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110247);Assert.assertEquals("intercept", regression.getIntercept(), fullReg.getParameterEstimate(0), 1.0e-16);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110248);Assert.assertEquals("intercept std err",regression.getInterceptStdErr(), fullReg.getStdErrorOfEstimate(0),1.0E-16);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110249);Assert.assertEquals("slope", regression.getSlope(), fullReg.getParameterEstimate(1), 1.0e-16);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110250);Assert.assertEquals("slope std err",regression.getSlopeStdErr(), fullReg.getStdErrorOfEstimate(1),1.0E-16);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110251);Assert.assertEquals("number of observations",regression.getN(), fullReg.getN());
        __CLR4_4_12czq2czqlb90pet8.R.inc(110252);Assert.assertEquals("r-square",regression.getRSquare(), fullReg.getRSquared(), 1.0E-16);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110253);Assert.assertEquals("SSR", regression.getRegressionSumSquares(), fullReg.getRegressionSumSquares() ,1.0E-16);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110254);Assert.assertEquals("MSE", regression.getMeanSquareError(), fullReg.getMeanSquareError() ,1.0E-16);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110255);Assert.assertEquals("SSE", regression.getSumSquaredErrors(), fullReg.getErrorSumSquares() ,1.0E-16);


        __CLR4_4_12czq2czqlb90pet8.R.inc(110256);final RegressionResults noInt   = iface.regress( new int[]{1} );
        __CLR4_4_12czq2czqlb90pet8.R.inc(110257);Assert.assertNotNull(noInt);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110258);Assert.assertEquals("slope", regressionNoint.getSlope(), noInt.getParameterEstimate(0), 1.0e-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110259);Assert.assertEquals("slope std err",regressionNoint.getSlopeStdErr(), noInt.getStdErrorOfEstimate(0),1.0E-16);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110260);Assert.assertEquals("number of observations",regressionNoint.getN(), noInt.getN());
        __CLR4_4_12czq2czqlb90pet8.R.inc(110261);Assert.assertEquals("r-square",regressionNoint.getRSquare(), noInt.getRSquared(), 1.0E-16);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110262);Assert.assertEquals("SSR", regressionNoint.getRegressionSumSquares(), noInt.getRegressionSumSquares() ,1.0E-8);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110263);Assert.assertEquals("MSE", regressionNoint.getMeanSquareError(), noInt.getMeanSquareError() ,1.0E-16);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110264);Assert.assertEquals("SSE", regressionNoint.getSumSquaredErrors(), noInt.getErrorSumSquares() ,1.0E-16);

        __CLR4_4_12czq2czqlb90pet8.R.inc(110265);final RegressionResults onlyInt = iface.regress( new int[]{0} );
        __CLR4_4_12czq2czqlb90pet8.R.inc(110266);Assert.assertNotNull(onlyInt);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110267);Assert.assertEquals("slope", regressionIntOnly.getSlope(), onlyInt.getParameterEstimate(0), 1.0e-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110268);Assert.assertEquals("slope std err",regressionIntOnly.getSlopeStdErr(), onlyInt.getStdErrorOfEstimate(0),1.0E-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110269);Assert.assertEquals("number of observations",regressionIntOnly.getN(), onlyInt.getN());
        __CLR4_4_12czq2czqlb90pet8.R.inc(110270);Assert.assertEquals("r-square",regressionIntOnly.getRSquare(), onlyInt.getRSquared(), 1.0E-14);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110271);Assert.assertEquals("SSE", regressionIntOnly.getSumSquaredErrors(), onlyInt.getErrorSumSquares() ,1.0E-8);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110272);Assert.assertEquals("SSR", regressionIntOnly.getRegressionSumSquares(), onlyInt.getRegressionSumSquares() ,1.0E-8);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110273);Assert.assertEquals("MSE", regressionIntOnly.getMeanSquareError(), onlyInt.getMeanSquareError() ,1.0E-8);

    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    /**
     * Verify that regress generates exceptions as advertised for bad model specifications.
     */
    @Test
    public void testRegressExceptions() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2ivsw2d36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRegressExceptions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2ivsw2d36(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110274);
        // No intercept
        __CLR4_4_12czq2czqlb90pet8.R.inc(110275);final SimpleRegression noIntRegression = new SimpleRegression(false);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110276);noIntRegression.addData(noint2[0][1], noint2[0][0]);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110277);noIntRegression.addData(noint2[1][1], noint2[1][0]);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110278);noIntRegression.addData(noint2[2][1], noint2[2][0]);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110279);try { // null array
            __CLR4_4_12czq2czqlb90pet8.R.inc(110280);noIntRegression.regress(null);
            __CLR4_4_12czq2czqlb90pet8.R.inc(110281);Assert.fail("Expecting MathIllegalArgumentException for null array");
        } catch (MathIllegalArgumentException ex) {
            // Expected
        }
        __CLR4_4_12czq2czqlb90pet8.R.inc(110282);try { // empty array
            __CLR4_4_12czq2czqlb90pet8.R.inc(110283);noIntRegression.regress(new int[] {});
            __CLR4_4_12czq2czqlb90pet8.R.inc(110284);Assert.fail("Expecting MathIllegalArgumentException for empty array");
        } catch (MathIllegalArgumentException ex) {
            // Expected
        }
        __CLR4_4_12czq2czqlb90pet8.R.inc(110285);try { // more than 1 regressor
            __CLR4_4_12czq2czqlb90pet8.R.inc(110286);noIntRegression.regress(new int[] {0, 1});
            __CLR4_4_12czq2czqlb90pet8.R.inc(110287);Assert.fail("Expecting ModelSpecificationException - too many regressors");
        } catch (ModelSpecificationException ex) {
            // Expected
        }
        __CLR4_4_12czq2czqlb90pet8.R.inc(110288);try { // invalid regressor
            __CLR4_4_12czq2czqlb90pet8.R.inc(110289);noIntRegression.regress(new int[] {1});
            __CLR4_4_12czq2czqlb90pet8.R.inc(110290);Assert.fail("Expecting OutOfRangeException - invalid regression");
        } catch (OutOfRangeException ex) {
            // Expected
        }

        // With intercept
        __CLR4_4_12czq2czqlb90pet8.R.inc(110291);final SimpleRegression regression = new SimpleRegression(true);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110292);regression.addData(noint2[0][1], noint2[0][0]);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110293);regression.addData(noint2[1][1], noint2[1][0]);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110294);regression.addData(noint2[2][1], noint2[2][0]);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110295);try { // null array
            __CLR4_4_12czq2czqlb90pet8.R.inc(110296);regression.regress(null);
            __CLR4_4_12czq2czqlb90pet8.R.inc(110297);Assert.fail("Expecting MathIllegalArgumentException for null array");
        } catch (MathIllegalArgumentException ex) {
            // Expected
        }
        __CLR4_4_12czq2czqlb90pet8.R.inc(110298);try { // empty array
            __CLR4_4_12czq2czqlb90pet8.R.inc(110299);regression.regress(new int[] {});
            __CLR4_4_12czq2czqlb90pet8.R.inc(110300);Assert.fail("Expecting MathIllegalArgumentException for empty array");
        } catch (MathIllegalArgumentException ex) {
            // Expected
        }
        __CLR4_4_12czq2czqlb90pet8.R.inc(110301);try { // more than 2 regressors
            __CLR4_4_12czq2czqlb90pet8.R.inc(110302);regression.regress(new int[] {0, 1, 2});
            __CLR4_4_12czq2czqlb90pet8.R.inc(110303);Assert.fail("Expecting ModelSpecificationException - too many regressors");
        } catch (ModelSpecificationException ex) {
            // Expected
        }
        __CLR4_4_12czq2czqlb90pet8.R.inc(110304);try { // wrong order
            __CLR4_4_12czq2czqlb90pet8.R.inc(110305);regression.regress(new int[] {1,0});
            __CLR4_4_12czq2czqlb90pet8.R.inc(110306);Assert.fail("Expecting ModelSpecificationException - invalid regression");
        } catch (ModelSpecificationException ex) {
            // Expected
        }
        __CLR4_4_12czq2czqlb90pet8.R.inc(110307);try { // out of range
            __CLR4_4_12czq2czqlb90pet8.R.inc(110308);regression.regress(new int[] {3,4});
            __CLR4_4_12czq2czqlb90pet8.R.inc(110309);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // Expected
        }
        __CLR4_4_12czq2czqlb90pet8.R.inc(110310);try { // out of range
            __CLR4_4_12czq2czqlb90pet8.R.inc(110311);regression.regress(new int[] {0,2});
            __CLR4_4_12czq2czqlb90pet8.R.inc(110312);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // Expected
        }
        __CLR4_4_12czq2czqlb90pet8.R.inc(110313);try { // out of range
            __CLR4_4_12czq2czqlb90pet8.R.inc(110314);regression.regress(new int[] {2});
            __CLR4_4_12czq2czqlb90pet8.R.inc(110315);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // Expected
        }
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    @Test
    public void testNoInterceot_noint2(){__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcu5iy2d4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNoInterceot_noint2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcu5iy2d4c(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110316);
         __CLR4_4_12czq2czqlb90pet8.R.inc(110317);SimpleRegression regression = new SimpleRegression(false);
         __CLR4_4_12czq2czqlb90pet8.R.inc(110318);regression.addData(noint2[0][1], noint2[0][0]);
         __CLR4_4_12czq2czqlb90pet8.R.inc(110319);regression.addData(noint2[1][1], noint2[1][0]);
         __CLR4_4_12czq2czqlb90pet8.R.inc(110320);regression.addData(noint2[2][1], noint2[2][0]);
         __CLR4_4_12czq2czqlb90pet8.R.inc(110321);Assert.assertEquals("intercept", 0, regression.getIntercept(), 0);
         __CLR4_4_12czq2czqlb90pet8.R.inc(110322);Assert.assertEquals("slope", 0.727272727272727,
                 regression.getSlope(), 10E-12);
         __CLR4_4_12czq2czqlb90pet8.R.inc(110323);Assert.assertEquals("slope std err", 0.420827318078432E-01,
                regression.getSlopeStdErr(),10E-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110324);Assert.assertEquals("number of observations", 3, regression.getN());
        __CLR4_4_12czq2czqlb90pet8.R.inc(110325);Assert.assertEquals("r-square", 0.993348115299335,
            regression.getRSquare(), 10E-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110326);Assert.assertEquals("SSR", 40.7272727272727,
            regression.getRegressionSumSquares(), 10E-9);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110327);Assert.assertEquals("MSE", 0.136363636363636,
            regression.getMeanSquareError(), 10E-10);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110328);Assert.assertEquals("SSE", 0.272727272727273,
            regression.getSumSquaredErrors(),10E-9);
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    @Test
    public void testNoIntercept_noint1(){__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1olgwoq2d4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNoIntercept_noint1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1olgwoq2d4p(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110329);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110330);SimpleRegression regression = new SimpleRegression(false);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110331);for (int i = 0; (((i < noint1.length)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110332)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110333)==0&false)); i++) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110334);regression.addData(noint1[i][1], noint1[i][0]);
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110335);Assert.assertEquals("intercept", 0, regression.getIntercept(), 0);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110336);Assert.assertEquals("slope", 2.07438016528926, regression.getSlope(), 10E-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110337);Assert.assertEquals("slope std err", 0.165289256198347E-01,
                regression.getSlopeStdErr(),10E-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110338);Assert.assertEquals("number of observations", 11, regression.getN());
        __CLR4_4_12czq2czqlb90pet8.R.inc(110339);Assert.assertEquals("r-square", 0.999365492298663,
            regression.getRSquare(), 10E-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110340);Assert.assertEquals("SSR", 200457.727272727,
            regression.getRegressionSumSquares(), 10E-9);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110341);Assert.assertEquals("MSE", 12.7272727272727,
            regression.getMeanSquareError(), 10E-10);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110342);Assert.assertEquals("SSE", 127.272727272727,
            regression.getSumSquaredErrors(),10E-9);

    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    @Test
    public void testNorris() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gy5f2c2d53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNorris",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gy5f2c2d53(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110343);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110344);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110345);for (int i = 0; (((i < data.length)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110346)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110347)==0&false)); i++) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110348);regression.addData(data[i][1], data[i][0]);
        }
        // Tests against certified values from
        // http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Norris.dat
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110349);Assert.assertEquals("slope", 1.00211681802045, regression.getSlope(), 10E-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110350);Assert.assertEquals("slope std err", 0.429796848199937E-03,
                regression.getSlopeStdErr(),10E-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110351);Assert.assertEquals("number of observations", 36, regression.getN());
        __CLR4_4_12czq2czqlb90pet8.R.inc(110352);Assert.assertEquals( "intercept", -0.262323073774029,
            regression.getIntercept(),10E-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110353);Assert.assertEquals("std err intercept", 0.232818234301152,
            regression.getInterceptStdErr(),10E-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110354);Assert.assertEquals("r-square", 0.999993745883712,
            regression.getRSquare(), 10E-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110355);Assert.assertEquals("SSR", 4255954.13232369,
            regression.getRegressionSumSquares(), 10E-9);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110356);Assert.assertEquals("MSE", 0.782864662630069,
            regression.getMeanSquareError(), 10E-10);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110357);Assert.assertEquals("SSE", 26.6173985294224,
            regression.getSumSquaredErrors(),10E-9);
        // ------------  End certified data tests

        __CLR4_4_12czq2czqlb90pet8.R.inc(110358);Assert.assertEquals( "predict(0)",  -0.262323073774029,
            regression.predict(0), 10E-12);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110359);Assert.assertEquals("predict(1)", 1.00211681802045 - 0.262323073774029,
            regression.predict(1), 10E-12);
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    @Test
    public void testCorr() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_164f4dh2d5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testCorr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_164f4dh2d5k(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110360);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110361);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110362);regression.addData(corrData);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110363);Assert.assertEquals("number of observations", 17, regression.getN());
        __CLR4_4_12czq2czqlb90pet8.R.inc(110364);Assert.assertEquals("r-square", .896123, regression.getRSquare(), 10E-6);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110365);Assert.assertEquals("r", -0.94663767742, regression.getR(), 1E-10);
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    @Test
    public void testNaNs() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h7k2oh2d5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNaNs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h7k2oh2d5q(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110366);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110367);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110368);Assert.assertTrue("intercept not NaN", Double.isNaN(regression.getIntercept()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110369);Assert.assertTrue("slope not NaN", Double.isNaN(regression.getSlope()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110370);Assert.assertTrue("slope std err not NaN", Double.isNaN(regression.getSlopeStdErr()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110371);Assert.assertTrue("intercept std err not NaN", Double.isNaN(regression.getInterceptStdErr()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110372);Assert.assertTrue("MSE not NaN", Double.isNaN(regression.getMeanSquareError()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110373);Assert.assertTrue("e not NaN", Double.isNaN(regression.getR()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110374);Assert.assertTrue("r-square not NaN", Double.isNaN(regression.getRSquare()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110375);Assert.assertTrue( "RSS not NaN", Double.isNaN(regression.getRegressionSumSquares()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110376);Assert.assertTrue("SSE not NaN",Double.isNaN(regression.getSumSquaredErrors()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110377);Assert.assertTrue("SSTO not NaN", Double.isNaN(regression.getTotalSumSquares()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110378);Assert.assertTrue("predict not NaN", Double.isNaN(regression.predict(0)));

        __CLR4_4_12czq2czqlb90pet8.R.inc(110379);regression.addData(1, 2);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110380);regression.addData(1, 3);

        // No x variation, so these should still blow...
        __CLR4_4_12czq2czqlb90pet8.R.inc(110381);Assert.assertTrue("intercept not NaN", Double.isNaN(regression.getIntercept()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110382);Assert.assertTrue("slope not NaN", Double.isNaN(regression.getSlope()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110383);Assert.assertTrue("slope std err not NaN", Double.isNaN(regression.getSlopeStdErr()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110384);Assert.assertTrue("intercept std err not NaN", Double.isNaN(regression.getInterceptStdErr()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110385);Assert.assertTrue("MSE not NaN", Double.isNaN(regression.getMeanSquareError()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110386);Assert.assertTrue("e not NaN", Double.isNaN(regression.getR()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110387);Assert.assertTrue("r-square not NaN", Double.isNaN(regression.getRSquare()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110388);Assert.assertTrue("RSS not NaN", Double.isNaN(regression.getRegressionSumSquares()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110389);Assert.assertTrue("SSE not NaN", Double.isNaN(regression.getSumSquaredErrors()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110390);Assert.assertTrue("predict not NaN", Double.isNaN(regression.predict(0)));

        // but SSTO should be OK
        __CLR4_4_12czq2czqlb90pet8.R.inc(110391);Assert.assertTrue("SSTO NaN", !Double.isNaN(regression.getTotalSumSquares()));

        __CLR4_4_12czq2czqlb90pet8.R.inc(110392);regression = new SimpleRegression();

        __CLR4_4_12czq2czqlb90pet8.R.inc(110393);regression.addData(1, 2);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110394);regression.addData(3, 3);

        // All should be OK except MSE, s(b0), s(b1) which need one more df
        __CLR4_4_12czq2czqlb90pet8.R.inc(110395);Assert.assertTrue("interceptNaN", !Double.isNaN(regression.getIntercept()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110396);Assert.assertTrue("slope NaN", !Double.isNaN(regression.getSlope()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110397);Assert.assertTrue("slope std err not NaN", Double.isNaN(regression.getSlopeStdErr()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110398);Assert.assertTrue("intercept std err not NaN", Double.isNaN(regression.getInterceptStdErr()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110399);Assert.assertTrue("MSE not NaN", Double.isNaN(regression.getMeanSquareError()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110400);Assert.assertTrue("r NaN", !Double.isNaN(regression.getR()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110401);Assert.assertTrue("r-square NaN", !Double.isNaN(regression.getRSquare()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110402);Assert.assertTrue("RSS NaN", !Double.isNaN(regression.getRegressionSumSquares()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110403);Assert.assertTrue("SSE NaN", !Double.isNaN(regression.getSumSquaredErrors()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110404);Assert.assertTrue("SSTO NaN", !Double.isNaN(regression.getTotalSumSquares()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110405);Assert.assertTrue("predict NaN", !Double.isNaN(regression.predict(0)));

        __CLR4_4_12czq2czqlb90pet8.R.inc(110406);regression.addData(1, 4);

        // MSE, MSE, s(b0), s(b1) should all be OK now
        __CLR4_4_12czq2czqlb90pet8.R.inc(110407);Assert.assertTrue("MSE NaN", !Double.isNaN(regression.getMeanSquareError()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110408);Assert.assertTrue("slope std err NaN", !Double.isNaN(regression.getSlopeStdErr()));
        __CLR4_4_12czq2czqlb90pet8.R.inc(110409);Assert.assertTrue("intercept std err NaN", !Double.isNaN(regression.getInterceptStdErr()));
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    @Test
    public void testClear() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jlyl6q2d6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testClear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jlyl6q2d6y(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110410);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110411);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110412);regression.addData(corrData);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110413);Assert.assertEquals("number of observations", 17, regression.getN());
        __CLR4_4_12czq2czqlb90pet8.R.inc(110414);regression.clear();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110415);Assert.assertEquals("number of observations", 0, regression.getN());
        __CLR4_4_12czq2czqlb90pet8.R.inc(110416);regression.addData(corrData);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110417);Assert.assertEquals("r-square", .896123, regression.getRSquare(), 10E-6);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110418);regression.addData(data);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110419);Assert.assertEquals("number of observations", 53, regression.getN());
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    @Test
    public void testInference() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129r9ji2d78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testInference",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129r9ji2d78(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110420);
        //----------  verified against R, version 1.8.1 -----
        // infData
        __CLR4_4_12czq2czqlb90pet8.R.inc(110421);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110422);regression.addData(infData);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110423);Assert.assertEquals("slope std err", 0.011448491,
                regression.getSlopeStdErr(), 1E-10);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110424);Assert.assertEquals("std err intercept", 0.286036932,
                regression.getInterceptStdErr(),1E-8);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110425);Assert.assertEquals("significance", 4.596e-07,
                regression.getSignificance(),1E-8);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110426);Assert.assertEquals("slope conf interval half-width", 0.0270713794287,
                regression.getSlopeConfidenceInterval(),1E-8);
        // infData2
        __CLR4_4_12czq2czqlb90pet8.R.inc(110427);regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110428);regression.addData(infData2);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110429);Assert.assertEquals("slope std err", 1.07260253,
                regression.getSlopeStdErr(), 1E-8);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110430);Assert.assertEquals("std err intercept",4.17718672,
                regression.getInterceptStdErr(),1E-8);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110431);Assert.assertEquals("significance", 0.261829133982,
                regression.getSignificance(),1E-11);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110432);Assert.assertEquals("slope conf interval half-width", 2.97802204827,
                regression.getSlopeConfidenceInterval(),1E-8);
        //------------- End R-verified tests -------------------------------

        //FIXME: get a real example to test against with alpha = .01
        __CLR4_4_12czq2czqlb90pet8.R.inc(110433);Assert.assertTrue("tighter means wider",
                regression.getSlopeConfidenceInterval() < regression.getSlopeConfidenceInterval(0.01));

        __CLR4_4_12czq2czqlb90pet8.R.inc(110434);try {
            __CLR4_4_12czq2czqlb90pet8.R.inc(110435);regression.getSlopeConfidenceInterval(1);
            __CLR4_4_12czq2czqlb90pet8.R.inc(110436);Assert.fail("expecting MathIllegalArgumentException for alpha = 1");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }

    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    @Test
    public void testPerfect() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qi7vuq2d7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testPerfect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qi7vuq2d7p(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110437);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110438);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110439);int n = 100;
        __CLR4_4_12czq2czqlb90pet8.R.inc(110440);for (int i = 0; (((i < n)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110441)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110442)==0&false)); i++) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110443);regression.addData(((double) i) / (n - 1), i);
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110444);Assert.assertEquals(0.0, regression.getSignificance(), 1.0e-5);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110445);Assert.assertTrue(regression.getSlope() > 0.0);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110446);Assert.assertTrue(regression.getSumSquaredErrors() >= 0.0);
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    @Test
    public void testPerfectNegative() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h3xe472d7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testPerfectNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h3xe472d7z(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110447);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110448);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110449);int n = 100;
        __CLR4_4_12czq2czqlb90pet8.R.inc(110450);for (int i = 0; (((i < n)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110451)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110452)==0&false)); i++) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110453);regression.addData(- ((double) i) / (n - 1), i);
        }

        }__CLR4_4_12czq2czqlb90pet8.R.inc(110454);Assert.assertEquals(0.0, regression.getSignificance(), 1.0e-5);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110455);Assert.assertTrue(regression.getSlope() < 0.0);
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    @Test
    public void testRandom() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ujoeas2d88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRandom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ujoeas2d88(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110456);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110457);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110458);Random random = new Random(1);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110459);int n = 100;
        __CLR4_4_12czq2czqlb90pet8.R.inc(110460);for (int i = 0; (((i < n)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110461)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110462)==0&false)); i++) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110463);regression.addData(((double) i) / (n - 1), random.nextDouble());
        }

        }__CLR4_4_12czq2czqlb90pet8.R.inc(110464);Assert.assertTrue( 0.0 < regression.getSignificance()
                    && regression.getSignificance() < 1.0);
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}


    // Jira MATH-85 = Bugzilla 39432
    @Test
    public void testSSENonNegative() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ca7p22d8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testSSENonNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ca7p22d8h(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110465);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110466);double[] y = { 8915.102, 8919.302, 8923.502 };
        __CLR4_4_12czq2czqlb90pet8.R.inc(110467);double[] x = { 1.107178495E2, 1.107264895E2, 1.107351295E2 };
        __CLR4_4_12czq2czqlb90pet8.R.inc(110468);SimpleRegression reg = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110469);for (int i = 0; (((i < x.length)&&(__CLR4_4_12czq2czqlb90pet8.R.iget(110470)!=0|true))||(__CLR4_4_12czq2czqlb90pet8.R.iget(110471)==0&false)); i++) {{
            __CLR4_4_12czq2czqlb90pet8.R.inc(110472);reg.addData(x[i], y[i]);
        }
        }__CLR4_4_12czq2czqlb90pet8.R.inc(110473);Assert.assertTrue(reg.getSumSquaredErrors() >= 0.0);
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    // Test remove X,Y (single observation)
    @Test
    public void testRemoveXY() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xp9qaq2d8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveXY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xp9qaq2d8q(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110474);
        // Create regression with inference data then remove to test
        __CLR4_4_12czq2czqlb90pet8.R.inc(110475);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110476);regression.addData(infData);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110477);regression.removeData(removeX, removeY);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110478);regression.addData(removeX, removeY);
        // Use the inference assertions to make sure that everything worked
        __CLR4_4_12czq2czqlb90pet8.R.inc(110479);Assert.assertEquals("slope std err", 0.011448491,
                regression.getSlopeStdErr(), 1E-10);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110480);Assert.assertEquals("std err intercept", 0.286036932,
                regression.getInterceptStdErr(),1E-8);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110481);Assert.assertEquals("significance", 4.596e-07,
                regression.getSignificance(),1E-8);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110482);Assert.assertEquals("slope conf interval half-width", 0.0270713794287,
                regression.getSlopeConfidenceInterval(),1E-8);
     }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}


    // Test remove single observation in array
    @Test
    public void testRemoveSingle() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppvjyz2d8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveSingle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppvjyz2d8z(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110483);
        // Create regression with inference data then remove to test
        __CLR4_4_12czq2czqlb90pet8.R.inc(110484);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110485);regression.addData(infData);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110486);regression.removeData(removeSingle);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110487);regression.addData(removeSingle);
        // Use the inference assertions to make sure that everything worked
        __CLR4_4_12czq2czqlb90pet8.R.inc(110488);Assert.assertEquals("slope std err", 0.011448491,
                regression.getSlopeStdErr(), 1E-10);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110489);Assert.assertEquals("std err intercept", 0.286036932,
                regression.getInterceptStdErr(),1E-8);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110490);Assert.assertEquals("significance", 4.596e-07,
                regression.getSignificance(),1E-8);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110491);Assert.assertEquals("slope conf interval half-width", 0.0270713794287,
                regression.getSlopeConfidenceInterval(),1E-8);
     }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    // Test remove multiple observations
    @Test
    public void testRemoveMultiple() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14r7hqr2d98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveMultiple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14r7hqr2d98(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110492);
        // Create regression with inference data then remove to test
        __CLR4_4_12czq2czqlb90pet8.R.inc(110493);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110494);regression.addData(infData);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110495);regression.removeData(removeMultiple);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110496);regression.addData(removeMultiple);
        // Use the inference assertions to make sure that everything worked
        __CLR4_4_12czq2czqlb90pet8.R.inc(110497);Assert.assertEquals("slope std err", 0.011448491,
                regression.getSlopeStdErr(), 1E-10);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110498);Assert.assertEquals("std err intercept", 0.286036932,
                regression.getInterceptStdErr(),1E-8);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110499);Assert.assertEquals("significance", 4.596e-07,
                regression.getSignificance(),1E-8);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110500);Assert.assertEquals("slope conf interval half-width", 0.0270713794287,
                regression.getSlopeConfidenceInterval(),1E-8);
     }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    // Remove observation when empty
    @Test
    public void testRemoveObsFromEmpty() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vosm8w2d9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveObsFromEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vosm8w2d9h(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110501);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110502);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110503);regression.removeData(removeX, removeY);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110504);Assert.assertEquals(regression.getN(), 0);
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    // Remove single observation to empty
    @Test
    public void testRemoveObsFromSingle() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dx4uhv2d9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveObsFromSingle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dx4uhv2d9l(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110505);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110506);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110507);regression.addData(removeX, removeY);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110508);regression.removeData(removeX, removeY);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110509);Assert.assertEquals(regression.getN(), 0);
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    // Remove multiple observations to empty
    @Test
    public void testRemoveMultipleToEmpty() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4cwa52d9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveMultipleToEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4cwa52d9q(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110510);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110511);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110512);regression.addData(removeMultiple);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110513);regression.removeData(removeMultiple);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110514);Assert.assertEquals(regression.getN(), 0);
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}

    // Remove multiple observations past empty (i.e. size of array > n)
    @Test
    public void testRemoveMultiplePastEmpty() {__CLR4_4_12czq2czqlb90pet8.R.globalSliceStart(getClass().getName(),110515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vuz6mc2d9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12czq2czqlb90pet8.R.rethrow($CLV_t2$);}finally{__CLR4_4_12czq2czqlb90pet8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveMultiplePastEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vuz6mc2d9v(){try{__CLR4_4_12czq2czqlb90pet8.R.inc(110515);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110516);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_12czq2czqlb90pet8.R.inc(110517);regression.addData(removeX, removeY);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110518);regression.removeData(removeMultiple);
        __CLR4_4_12czq2czqlb90pet8.R.inc(110519);Assert.assertEquals(regression.getN(), 0);
    }finally{__CLR4_4_12czq2czqlb90pet8.R.flushNeeded();}}
}
