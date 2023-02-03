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


import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.linear.DefaultRealMatrixChangingVisitor;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.stat.StatUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OLSMultipleLinearRegressionTest extends MultipleLinearRegressionAbstractTest {static class __CLR4_4_12cse2cselb90pesr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,110150,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double[] y;
    private double[][] x;

    @Before
    @Override
    public void setUp(){try{__CLR4_4_12cse2cselb90pesr.R.inc(109886);
        __CLR4_4_12cse2cselb90pesr.R.inc(109887);y = new double[]{11.0, 12.0, 13.0, 14.0, 15.0, 16.0};
        __CLR4_4_12cse2cselb90pesr.R.inc(109888);x = new double[6][];
        __CLR4_4_12cse2cselb90pesr.R.inc(109889);x[0] = new double[]{0, 0, 0, 0, 0};
        __CLR4_4_12cse2cselb90pesr.R.inc(109890);x[1] = new double[]{2.0, 0, 0, 0, 0};
        __CLR4_4_12cse2cselb90pesr.R.inc(109891);x[2] = new double[]{0, 3.0, 0, 0, 0};
        __CLR4_4_12cse2cselb90pesr.R.inc(109892);x[3] = new double[]{0, 0, 4.0, 0, 0};
        __CLR4_4_12cse2cselb90pesr.R.inc(109893);x[4] = new double[]{0, 0, 0, 5.0, 0};
        __CLR4_4_12cse2cselb90pesr.R.inc(109894);x[5] = new double[]{0, 0, 0, 0, 6.0};
        __CLR4_4_12cse2cselb90pesr.R.inc(109895);super.setUp();
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}

    @Override
    protected OLSMultipleLinearRegression createRegression() {try{__CLR4_4_12cse2cselb90pesr.R.inc(109896);
        __CLR4_4_12cse2cselb90pesr.R.inc(109897);OLSMultipleLinearRegression regression = new OLSMultipleLinearRegression();
        __CLR4_4_12cse2cselb90pesr.R.inc(109898);regression.newSampleData(y, x);
        __CLR4_4_12cse2cselb90pesr.R.inc(109899);return regression;
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}

    @Override
    protected int getNumberOfRegressors() {try{__CLR4_4_12cse2cselb90pesr.R.inc(109900);
        __CLR4_4_12cse2cselb90pesr.R.inc(109901);return x[0].length + 1;
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}

    @Override
    protected int getSampleSize() {try{__CLR4_4_12cse2cselb90pesr.R.inc(109902);
        __CLR4_4_12cse2cselb90pesr.R.inc(109903);return y.length;
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void cannotAddSampleDataWithSizeMismatch() {__CLR4_4_12cse2cselb90pesr.R.globalSliceStart(getClass().getName(),109904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1budlo22csw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,99,97,110,110,111,116,65,100,100,83,97,109,112,108,101,68,97,116,97,87,105,116,104,83,105,122,101,77,105,115,109,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cse2cselb90pesr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cse2cselb90pesr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest.cannotAddSampleDataWithSizeMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1budlo22csw(){try{__CLR4_4_12cse2cselb90pesr.R.inc(109904);
        __CLR4_4_12cse2cselb90pesr.R.inc(109905);double[] y = new double[]{1.0, 2.0};
        __CLR4_4_12cse2cselb90pesr.R.inc(109906);double[][] x = new double[1][];
        __CLR4_4_12cse2cselb90pesr.R.inc(109907);x[0] = new double[]{1.0, 0};
        __CLR4_4_12cse2cselb90pesr.R.inc(109908);createRegression().newSampleData(y, x);
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}

    @Test
    public void testPerfectFit() {__CLR4_4_12cse2cselb90pesr.R.globalSliceStart(getClass().getName(),109909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1i9vn2ct1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cse2cselb90pesr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cse2cselb90pesr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest.testPerfectFit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1i9vn2ct1(){try{__CLR4_4_12cse2cselb90pesr.R.inc(109909);
        __CLR4_4_12cse2cselb90pesr.R.inc(109910);double[] betaHat = regression.estimateRegressionParameters();
        __CLR4_4_12cse2cselb90pesr.R.inc(109911);TestUtils.assertEquals(betaHat,
                               new double[]{ 11.0, 1.0 / 2.0, 2.0 / 3.0, 3.0 / 4.0, 4.0 / 5.0, 5.0 / 6.0 },
                               1e-14);
        __CLR4_4_12cse2cselb90pesr.R.inc(109912);double[] residuals = regression.estimateResiduals();
        __CLR4_4_12cse2cselb90pesr.R.inc(109913);TestUtils.assertEquals(residuals, new double[]{0d,0d,0d,0d,0d,0d},
                               1e-14);
        __CLR4_4_12cse2cselb90pesr.R.inc(109914);RealMatrix errors =
            new Array2DRowRealMatrix(regression.estimateRegressionParametersVariance(), false);
        __CLR4_4_12cse2cselb90pesr.R.inc(109915);final double[] s = { 1.0, -1.0 /  2.0, -1.0 /  3.0, -1.0 /  4.0, -1.0 /  5.0, -1.0 /  6.0 };
        __CLR4_4_12cse2cselb90pesr.R.inc(109916);RealMatrix referenceVariance = new Array2DRowRealMatrix(s.length, s.length);
        __CLR4_4_12cse2cselb90pesr.R.inc(109917);referenceVariance.walkInOptimizedOrder(new DefaultRealMatrixChangingVisitor() {
            @Override
            public double visit(int row, int column, double value) {try{__CLR4_4_12cse2cselb90pesr.R.inc(109918);
                __CLR4_4_12cse2cselb90pesr.R.inc(109919);if ((((row == 0)&&(__CLR4_4_12cse2cselb90pesr.R.iget(109920)!=0|true))||(__CLR4_4_12cse2cselb90pesr.R.iget(109921)==0&false))) {{
                    __CLR4_4_12cse2cselb90pesr.R.inc(109922);return s[column];
                }
                }__CLR4_4_12cse2cselb90pesr.R.inc(109923);double x = s[row] * s[column];
                __CLR4_4_12cse2cselb90pesr.R.inc(109924);return ((((row == column) )&&(__CLR4_4_12cse2cselb90pesr.R.iget(109925)!=0|true))||(__CLR4_4_12cse2cselb90pesr.R.iget(109926)==0&false))? 2 * x : x;
            }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}
        });
       __CLR4_4_12cse2cselb90pesr.R.inc(109927);Assert.assertEquals(0.0,
                     errors.subtract(referenceVariance).getNorm(),
                     5.0e-16 * referenceVariance.getNorm());
       __CLR4_4_12cse2cselb90pesr.R.inc(109928);Assert.assertEquals(1, ((OLSMultipleLinearRegression) regression).calculateRSquared(), 1E-12);
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}


    /**
     * Test Longley dataset against certified values provided by NIST.
     * Data Source: J. Longley (1967) "An Appraisal of Least Squares
     * Programs for the Electronic Computer from the Point of View of the User"
     * Journal of the American Statistical Association, vol. 62. September,
     * pp. 819-841.
     *
     * Certified values (and data) are from NIST:
     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Longley.dat
     */
    @Test
    public void testLongly() {__CLR4_4_12cse2cselb90pesr.R.globalSliceStart(getClass().getName(),109929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjv2zi2ctl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cse2cselb90pesr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cse2cselb90pesr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest.testLongly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjv2zi2ctl(){try{__CLR4_4_12cse2cselb90pesr.R.inc(109929);
        // Y values are first, then independent vars
        // Each row is one observation
        __CLR4_4_12cse2cselb90pesr.R.inc(109930);double[] design = new double[] {
            60323,83.0,234289,2356,1590,107608,1947,
            61122,88.5,259426,2325,1456,108632,1948,
            60171,88.2,258054,3682,1616,109773,1949,
            61187,89.5,284599,3351,1650,110929,1950,
            63221,96.2,328975,2099,3099,112075,1951,
            63639,98.1,346999,1932,3594,113270,1952,
            64989,99.0,365385,1870,3547,115094,1953,
            63761,100.0,363112,3578,3350,116219,1954,
            66019,101.2,397469,2904,3048,117388,1955,
            67857,104.6,419180,2822,2857,118734,1956,
            68169,108.4,442769,2936,2798,120445,1957,
            66513,110.8,444546,4681,2637,121950,1958,
            68655,112.6,482704,3813,2552,123366,1959,
            69564,114.2,502601,3931,2514,125368,1960,
            69331,115.7,518173,4806,2572,127852,1961,
            70551,116.9,554894,4007,2827,130081,1962
        };

        __CLR4_4_12cse2cselb90pesr.R.inc(109931);final int nobs = 16;
        __CLR4_4_12cse2cselb90pesr.R.inc(109932);final int nvars = 6;

        // Estimate the model
        __CLR4_4_12cse2cselb90pesr.R.inc(109933);OLSMultipleLinearRegression model = new OLSMultipleLinearRegression();
        __CLR4_4_12cse2cselb90pesr.R.inc(109934);model.newSampleData(design, nobs, nvars);

        // Check expected beta values from NIST
        __CLR4_4_12cse2cselb90pesr.R.inc(109935);double[] betaHat = model.estimateRegressionParameters();
        __CLR4_4_12cse2cselb90pesr.R.inc(109936);TestUtils.assertEquals(betaHat,
          new double[]{-3482258.63459582, 15.0618722713733,
                -0.358191792925910E-01,-2.02022980381683,
                -1.03322686717359,-0.511041056535807E-01,
                 1829.15146461355}, 2E-8); //

        // Check expected residuals from R
        __CLR4_4_12cse2cselb90pesr.R.inc(109937);double[] residuals = model.estimateResiduals();
        __CLR4_4_12cse2cselb90pesr.R.inc(109938);TestUtils.assertEquals(residuals, new double[]{
                267.340029759711,-94.0139423988359,46.28716775752924,
                -410.114621930906,309.7145907602313,-249.3112153297231,
                -164.0489563956039,-13.18035686637081,14.30477260005235,
                 455.394094551857,-17.26892711483297,-39.0550425226967,
                -155.5499735953195,-85.6713080421283,341.9315139607727,
                -206.7578251937366},
                      1E-8);

        // Check standard errors from NIST
        __CLR4_4_12cse2cselb90pesr.R.inc(109939);double[] errors = model.estimateRegressionParametersStandardErrors();
        __CLR4_4_12cse2cselb90pesr.R.inc(109940);TestUtils.assertEquals(new double[] {890420.383607373,
                       84.9149257747669,
                       0.334910077722432E-01,
                       0.488399681651699,
                       0.214274163161675,
                       0.226073200069370,
                       455.478499142212}, errors, 1E-6);
        
        // Check regression standard error against R
        __CLR4_4_12cse2cselb90pesr.R.inc(109941);Assert.assertEquals(304.8540735619638, model.estimateRegressionStandardError(), 1E-10);
        
        // Check R-Square statistics against R
        __CLR4_4_12cse2cselb90pesr.R.inc(109942);Assert.assertEquals(0.995479004577296, model.calculateRSquared(), 1E-12);
        __CLR4_4_12cse2cselb90pesr.R.inc(109943);Assert.assertEquals(0.992465007628826, model.calculateAdjustedRSquared(), 1E-12);
        
        __CLR4_4_12cse2cselb90pesr.R.inc(109944);checkVarianceConsistency(model);
        
        // Estimate model without intercept
        __CLR4_4_12cse2cselb90pesr.R.inc(109945);model.setNoIntercept(true);
        __CLR4_4_12cse2cselb90pesr.R.inc(109946);model.newSampleData(design, nobs, nvars);
        
        // Check expected beta values from R
        __CLR4_4_12cse2cselb90pesr.R.inc(109947);betaHat = model.estimateRegressionParameters();
        __CLR4_4_12cse2cselb90pesr.R.inc(109948);TestUtils.assertEquals(betaHat,
          new double[]{-52.99357013868291, 0.07107319907358,
                -0.42346585566399,-0.57256866841929,
                -0.41420358884978, 48.41786562001326}, 1E-11); 
        
        // Check standard errors from R
        __CLR4_4_12cse2cselb90pesr.R.inc(109949);errors = model.estimateRegressionParametersStandardErrors();
        __CLR4_4_12cse2cselb90pesr.R.inc(109950);TestUtils.assertEquals(new double[] {129.54486693117232, 0.03016640003786,
                0.41773654056612, 0.27899087467676, 0.32128496193363,
                17.68948737819961}, errors, 1E-11);
        
        // Check expected residuals from R
        __CLR4_4_12cse2cselb90pesr.R.inc(109951);residuals = model.estimateResiduals();
        __CLR4_4_12cse2cselb90pesr.R.inc(109952);TestUtils.assertEquals(residuals, new double[]{
                279.90274927293092, -130.32465380836874, 90.73228661967445, -401.31252201634948,
                -440.46768772620027, -543.54512853774793, 201.32111639536299, 215.90889365977932,
                73.09368242049943, 913.21694494481869, 424.82484953610174, -8.56475876776709,
                -361.32974610842876, 27.34560497213464, 151.28955976355002, -492.49937355336846},
                      1E-10);
        
        // Check regression standard error against R
        __CLR4_4_12cse2cselb90pesr.R.inc(109953);Assert.assertEquals(475.1655079819517, model.estimateRegressionStandardError(), 1E-10);
        
        // Check R-Square statistics against R
        __CLR4_4_12cse2cselb90pesr.R.inc(109954);Assert.assertEquals(0.9999670130706, model.calculateRSquared(), 1E-12);
        __CLR4_4_12cse2cselb90pesr.R.inc(109955);Assert.assertEquals(0.999947220913, model.calculateAdjustedRSquared(), 1E-12);
         
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}

    /**
     * Test R Swiss fertility dataset against R.
     * Data Source: R datasets package
     */
    @Test
    public void testSwissFertility() {__CLR4_4_12cse2cselb90pesr.R.globalSliceStart(getClass().getName(),109956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q647sy2cuc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cse2cselb90pesr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cse2cselb90pesr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest.testSwissFertility",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q647sy2cuc(){try{__CLR4_4_12cse2cselb90pesr.R.inc(109956);
        __CLR4_4_12cse2cselb90pesr.R.inc(109957);double[] design = new double[] {
            80.2,17.0,15,12,9.96,
            83.1,45.1,6,9,84.84,
            92.5,39.7,5,5,93.40,
            85.8,36.5,12,7,33.77,
            76.9,43.5,17,15,5.16,
            76.1,35.3,9,7,90.57,
            83.8,70.2,16,7,92.85,
            92.4,67.8,14,8,97.16,
            82.4,53.3,12,7,97.67,
            82.9,45.2,16,13,91.38,
            87.1,64.5,14,6,98.61,
            64.1,62.0,21,12,8.52,
            66.9,67.5,14,7,2.27,
            68.9,60.7,19,12,4.43,
            61.7,69.3,22,5,2.82,
            68.3,72.6,18,2,24.20,
            71.7,34.0,17,8,3.30,
            55.7,19.4,26,28,12.11,
            54.3,15.2,31,20,2.15,
            65.1,73.0,19,9,2.84,
            65.5,59.8,22,10,5.23,
            65.0,55.1,14,3,4.52,
            56.6,50.9,22,12,15.14,
            57.4,54.1,20,6,4.20,
            72.5,71.2,12,1,2.40,
            74.2,58.1,14,8,5.23,
            72.0,63.5,6,3,2.56,
            60.5,60.8,16,10,7.72,
            58.3,26.8,25,19,18.46,
            65.4,49.5,15,8,6.10,
            75.5,85.9,3,2,99.71,
            69.3,84.9,7,6,99.68,
            77.3,89.7,5,2,100.00,
            70.5,78.2,12,6,98.96,
            79.4,64.9,7,3,98.22,
            65.0,75.9,9,9,99.06,
            92.2,84.6,3,3,99.46,
            79.3,63.1,13,13,96.83,
            70.4,38.4,26,12,5.62,
            65.7,7.7,29,11,13.79,
            72.7,16.7,22,13,11.22,
            64.4,17.6,35,32,16.92,
            77.6,37.6,15,7,4.97,
            67.6,18.7,25,7,8.65,
            35.0,1.2,37,53,42.34,
            44.7,46.6,16,29,50.43,
            42.8,27.7,22,29,58.33
        };
        
        __CLR4_4_12cse2cselb90pesr.R.inc(109958);final int nobs = 47;
        __CLR4_4_12cse2cselb90pesr.R.inc(109959);final int nvars = 4;

        // Estimate the model
        __CLR4_4_12cse2cselb90pesr.R.inc(109960);OLSMultipleLinearRegression model = new OLSMultipleLinearRegression();
        __CLR4_4_12cse2cselb90pesr.R.inc(109961);model.newSampleData(design, nobs, nvars);

        // Check expected beta values from R
        __CLR4_4_12cse2cselb90pesr.R.inc(109962);double[] betaHat = model.estimateRegressionParameters();
        __CLR4_4_12cse2cselb90pesr.R.inc(109963);TestUtils.assertEquals(betaHat,
                new double[]{91.05542390271397,
                -0.22064551045715,
                -0.26058239824328,
                -0.96161238456030,
                 0.12441843147162}, 1E-12);

        // Check expected residuals from R
        __CLR4_4_12cse2cselb90pesr.R.inc(109964);double[] residuals = model.estimateResiduals();
        __CLR4_4_12cse2cselb90pesr.R.inc(109965);TestUtils.assertEquals(residuals, new double[]{
                7.1044267859730512,1.6580347433531366,
                4.6944952770029644,8.4548022690166160,13.6547432343186212,
               -9.3586864458500774,7.5822446330520386,15.5568995563859289,
                0.8113090736598980,7.1186762732484308,7.4251378771228724,
                2.6761316873234109,0.8351584810309354,7.1769991119615177,
               -3.8746753206299553,-3.1337779476387251,-0.1412575244091504,
                1.1186809170469780,-6.3588097346816594,3.4039270429434074,
                2.3374058329820175,-7.9272368576900503,-7.8361010968497959,
               -11.2597369269357070,0.9445333697827101,6.6544245101380328,
               -0.9146136301118665,-4.3152449403848570,-4.3536932047009183,
               -3.8907885169304661,-6.3027643926302188,-7.8308982189289091,
               -3.1792280015332750,-6.7167298771158226,-4.8469946718041754,
               -10.6335664353633685,11.1031134362036958,6.0084032641811733,
                5.4326230830188482,-7.2375578629692230,2.1671550814448222,
                15.0147574652763112,4.8625103516321015,-7.1597256413907706,
                -0.4515205619767598,-10.2916870903837587,-15.7812984571900063},
                1E-12);

        // Check standard errors from R
        __CLR4_4_12cse2cselb90pesr.R.inc(109966);double[] errors = model.estimateRegressionParametersStandardErrors();
        __CLR4_4_12cse2cselb90pesr.R.inc(109967);TestUtils.assertEquals(new double[] {6.94881329475087,
                0.07360008972340,
                0.27410957467466,
                0.19454551679325,
                0.03726654773803}, errors, 1E-10);
        
        // Check regression standard error against R
        __CLR4_4_12cse2cselb90pesr.R.inc(109968);Assert.assertEquals(7.73642194433223, model.estimateRegressionStandardError(), 1E-12);
        
        // Check R-Square statistics against R
        __CLR4_4_12cse2cselb90pesr.R.inc(109969);Assert.assertEquals(0.649789742860228, model.calculateRSquared(), 1E-12);
        __CLR4_4_12cse2cselb90pesr.R.inc(109970);Assert.assertEquals(0.6164363850373927, model.calculateAdjustedRSquared(), 1E-12);
        
        __CLR4_4_12cse2cselb90pesr.R.inc(109971);checkVarianceConsistency(model);
        
        // Estimate the model with no intercept
        __CLR4_4_12cse2cselb90pesr.R.inc(109972);model = new OLSMultipleLinearRegression();
        __CLR4_4_12cse2cselb90pesr.R.inc(109973);model.setNoIntercept(true);
        __CLR4_4_12cse2cselb90pesr.R.inc(109974);model.newSampleData(design, nobs, nvars);

        // Check expected beta values from R
        __CLR4_4_12cse2cselb90pesr.R.inc(109975);betaHat = model.estimateRegressionParameters();
        __CLR4_4_12cse2cselb90pesr.R.inc(109976);TestUtils.assertEquals(betaHat,
                new double[]{0.52191832900513,
                  2.36588087917963,
                  -0.94770353802795, 
                  0.30851985863609}, 1E-12);

        // Check expected residuals from R
        __CLR4_4_12cse2cselb90pesr.R.inc(109977);residuals = model.estimateResiduals();
        __CLR4_4_12cse2cselb90pesr.R.inc(109978);TestUtils.assertEquals(residuals, new double[]{
                44.138759883538249, 27.720705122356215, 35.873200836126799, 
                34.574619581211977, 26.600168342080213, 15.074636243026923, -12.704904871199814,
                1.497443824078134, 2.691972687079431, 5.582798774291231, -4.422986561283165, 
                -9.198581600334345, 4.481765170730647, 2.273520207553216, -22.649827853221336,
                -17.747900013943308, 20.298314638496436, 6.861405135329779, -8.684712790954924,
                -10.298639278062371, -9.896618896845819, 4.568568616351242, -15.313570491727944,
                -13.762961360873966, 7.156100301980509, 16.722282219843990, 26.716200609071898,
                -1.991466398777079, -2.523342564719335, 9.776486693095093, -5.297535127628603,
                -16.639070567471094, -10.302057295211819, -23.549487860816846, 1.506624392156384,
                -17.939174438345930, 13.105792202765040, -1.943329906928462, -1.516005841666695,
                -0.759066561832886, 20.793137744128977, -2.485236153005426, 27.588238710486976,
                2.658333257106881, -15.998337823623046, -5.550742066720694, -14.219077806826615},
                1E-12);

        // Check standard errors from R
        __CLR4_4_12cse2cselb90pesr.R.inc(109979);errors = model.estimateRegressionParametersStandardErrors();
        __CLR4_4_12cse2cselb90pesr.R.inc(109980);TestUtils.assertEquals(new double[] {0.10470063765677, 0.41684100584290,
                0.43370143099691, 0.07694953606522}, errors, 1E-10);
        
        // Check regression standard error against R
        __CLR4_4_12cse2cselb90pesr.R.inc(109981);Assert.assertEquals(17.24710630547, model.estimateRegressionStandardError(), 1E-10);
        
        // Check R-Square statistics against R
        __CLR4_4_12cse2cselb90pesr.R.inc(109982);Assert.assertEquals(0.946350722085, model.calculateRSquared(), 1E-12);
        __CLR4_4_12cse2cselb90pesr.R.inc(109983);Assert.assertEquals(0.9413600915813, model.calculateAdjustedRSquared(), 1E-12);
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}

    /**
     * Test hat matrix computation
     *
     */
    @Test
    public void testHat() {__CLR4_4_12cse2cselb90pesr.R.globalSliceStart(getClass().getName(),109984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9muy82cv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cse2cselb90pesr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cse2cselb90pesr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest.testHat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9muy82cv4(){try{__CLR4_4_12cse2cselb90pesr.R.inc(109984);

        /*
         * This example is from "The Hat Matrix in Regression and ANOVA",
         * David C. Hoaglin and Roy E. Welsch,
         * The American Statistician, Vol. 32, No. 1 (Feb., 1978), pp. 17-22.
         *
         */
        __CLR4_4_12cse2cselb90pesr.R.inc(109985);double[] design = new double[] {
                11.14, .499, 11.1,
                12.74, .558, 8.9,
                13.13, .604, 8.8,
                11.51, .441, 8.9,
                12.38, .550, 8.8,
                12.60, .528, 9.9,
                11.13, .418, 10.7,
                11.7, .480, 10.5,
                11.02, .406, 10.5,
                11.41, .467, 10.7
        };

        __CLR4_4_12cse2cselb90pesr.R.inc(109986);int nobs = 10;
        __CLR4_4_12cse2cselb90pesr.R.inc(109987);int nvars = 2;

        // Estimate the model
        __CLR4_4_12cse2cselb90pesr.R.inc(109988);OLSMultipleLinearRegression model = new OLSMultipleLinearRegression();
        __CLR4_4_12cse2cselb90pesr.R.inc(109989);model.newSampleData(design, nobs, nvars);

        __CLR4_4_12cse2cselb90pesr.R.inc(109990);RealMatrix hat = model.calculateHat();

        // Reference data is upper half of symmetric hat matrix
        __CLR4_4_12cse2cselb90pesr.R.inc(109991);double[] referenceData = new double[] {
                .418, -.002,  .079, -.274, -.046,  .181,  .128,  .222,  .050,  .242,
                       .242,  .292,  .136,  .243,  .128, -.041,  .033, -.035,  .004,
                              .417, -.019,  .273,  .187, -.126,  .044, -.153,  .004,
                                     .604,  .197, -.038,  .168, -.022,  .275, -.028,
                                            .252,  .111, -.030,  .019, -.010, -.010,
                                                   .148,  .042,  .117,  .012,  .111,
                                                          .262,  .145,  .277,  .174,
                                                                 .154,  .120,  .168,
                                                                        .315,  .148,
                                                                               .187
        };

        // Check against reference data and verify symmetry
        __CLR4_4_12cse2cselb90pesr.R.inc(109992);int k = 0;
        __CLR4_4_12cse2cselb90pesr.R.inc(109993);for (int i = 0; (((i < 10)&&(__CLR4_4_12cse2cselb90pesr.R.iget(109994)!=0|true))||(__CLR4_4_12cse2cselb90pesr.R.iget(109995)==0&false)); i++) {{
            __CLR4_4_12cse2cselb90pesr.R.inc(109996);for (int j = i; (((j < 10)&&(__CLR4_4_12cse2cselb90pesr.R.iget(109997)!=0|true))||(__CLR4_4_12cse2cselb90pesr.R.iget(109998)==0&false)); j++) {{
                __CLR4_4_12cse2cselb90pesr.R.inc(109999);Assert.assertEquals(referenceData[k], hat.getEntry(i, j), 10e-3);
                __CLR4_4_12cse2cselb90pesr.R.inc(110000);Assert.assertEquals(hat.getEntry(i, j), hat.getEntry(j, i), 10e-12);
                __CLR4_4_12cse2cselb90pesr.R.inc(110001);k++;
            }
        }}

        /*
         * Verify that residuals computed using the hat matrix are close to
         * what we get from direct computation, i.e. r = (I - H) y
         */
        }__CLR4_4_12cse2cselb90pesr.R.inc(110002);double[] residuals = model.estimateResiduals();
        __CLR4_4_12cse2cselb90pesr.R.inc(110003);RealMatrix I = MatrixUtils.createRealIdentityMatrix(10);
        __CLR4_4_12cse2cselb90pesr.R.inc(110004);double[] hatResiduals = I.subtract(hat).operate(model.getY()).toArray();
        __CLR4_4_12cse2cselb90pesr.R.inc(110005);TestUtils.assertEquals(residuals, hatResiduals, 10e-12);
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}

    /**
     * test calculateYVariance
     */
    @Test
    public void testYVariance() {__CLR4_4_12cse2cselb90pesr.R.globalSliceStart(getClass().getName(),110006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cw1fz52cvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cse2cselb90pesr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cse2cselb90pesr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest.testYVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cw1fz52cvq(){try{__CLR4_4_12cse2cselb90pesr.R.inc(110006);

        // assumes: y = new double[]{11.0, 12.0, 13.0, 14.0, 15.0, 16.0};

        __CLR4_4_12cse2cselb90pesr.R.inc(110007);OLSMultipleLinearRegression model = new OLSMultipleLinearRegression();
        __CLR4_4_12cse2cselb90pesr.R.inc(110008);model.newSampleData(y, x);
        __CLR4_4_12cse2cselb90pesr.R.inc(110009);TestUtils.assertEquals(model.calculateYVariance(), 3.5, 0);
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}
    
    /**
     * Verifies that calculateYVariance and calculateResidualVariance return consistent
     * values with direct variance computation from Y, residuals, respectively.
     */
    protected void checkVarianceConsistency(OLSMultipleLinearRegression model) {try{__CLR4_4_12cse2cselb90pesr.R.inc(110010);
        // Check Y variance consistency
        __CLR4_4_12cse2cselb90pesr.R.inc(110011);TestUtils.assertEquals(StatUtils.variance(model.getY().toArray()), model.calculateYVariance(), 0);
        
        // Check residual variance consistency
        __CLR4_4_12cse2cselb90pesr.R.inc(110012);double[] residuals = model.calculateResiduals().toArray();
        __CLR4_4_12cse2cselb90pesr.R.inc(110013);RealMatrix X = model.getX();
        __CLR4_4_12cse2cselb90pesr.R.inc(110014);TestUtils.assertEquals(
                StatUtils.variance(model.calculateResiduals().toArray()) * (residuals.length - 1),
                model.calculateErrorVariance() * (X.getRowDimension() - X.getColumnDimension()), 1E-20);
        
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}
    
    /**
     * Verifies that setting X and Y separately has the same effect as newSample(X,Y).
     */
    @Test
    public void testNewSample2() {__CLR4_4_12cse2cselb90pesr.R.globalSliceStart(getClass().getName(),110015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmbfsv2cvz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cse2cselb90pesr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cse2cselb90pesr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest.testNewSample2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmbfsv2cvz(){try{__CLR4_4_12cse2cselb90pesr.R.inc(110015);
        __CLR4_4_12cse2cselb90pesr.R.inc(110016);double[] y = new double[] {1, 2, 3, 4}; 
        __CLR4_4_12cse2cselb90pesr.R.inc(110017);double[][] x = new double[][] {
          {19, 22, 33},
          {20, 30, 40},
          {25, 35, 45},
          {27, 37, 47}   
        };
        __CLR4_4_12cse2cselb90pesr.R.inc(110018);OLSMultipleLinearRegression regression = new OLSMultipleLinearRegression();
        __CLR4_4_12cse2cselb90pesr.R.inc(110019);regression.newSampleData(y, x);
        __CLR4_4_12cse2cselb90pesr.R.inc(110020);RealMatrix combinedX = regression.getX().copy();
        __CLR4_4_12cse2cselb90pesr.R.inc(110021);RealVector combinedY = regression.getY().copy();
        __CLR4_4_12cse2cselb90pesr.R.inc(110022);regression.newXSampleData(x);
        __CLR4_4_12cse2cselb90pesr.R.inc(110023);regression.newYSampleData(y);
        __CLR4_4_12cse2cselb90pesr.R.inc(110024);Assert.assertEquals(combinedX, regression.getX());
        __CLR4_4_12cse2cselb90pesr.R.inc(110025);Assert.assertEquals(combinedY, regression.getY());
        
        // No intercept
        __CLR4_4_12cse2cselb90pesr.R.inc(110026);regression.setNoIntercept(true);
        __CLR4_4_12cse2cselb90pesr.R.inc(110027);regression.newSampleData(y, x);
        __CLR4_4_12cse2cselb90pesr.R.inc(110028);combinedX = regression.getX().copy();
        __CLR4_4_12cse2cselb90pesr.R.inc(110029);combinedY = regression.getY().copy();
        __CLR4_4_12cse2cselb90pesr.R.inc(110030);regression.newXSampleData(x);
        __CLR4_4_12cse2cselb90pesr.R.inc(110031);regression.newYSampleData(y);
        __CLR4_4_12cse2cselb90pesr.R.inc(110032);Assert.assertEquals(combinedX, regression.getX());
        __CLR4_4_12cse2cselb90pesr.R.inc(110033);Assert.assertEquals(combinedY, regression.getY());
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void testNewSampleDataYNull() {__CLR4_4_12cse2cselb90pesr.R.globalSliceStart(getClass().getName(),110034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12z60052cwi();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,119,83,97,109,112,108,101,68,97,116,97,89,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cse2cselb90pesr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cse2cselb90pesr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest.testNewSampleDataYNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12z60052cwi(){try{__CLR4_4_12cse2cselb90pesr.R.inc(110034);
        __CLR4_4_12cse2cselb90pesr.R.inc(110035);createRegression().newSampleData(null, new double[][] {});
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void testNewSampleDataXNull() {__CLR4_4_12cse2cselb90pesr.R.globalSliceStart(getClass().getName(),110036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15dtvj02cwk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,119,83,97,109,112,108,101,68,97,116,97,88,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cse2cselb90pesr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cse2cselb90pesr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest.testNewSampleDataXNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15dtvj02cwk(){try{__CLR4_4_12cse2cselb90pesr.R.inc(110036);
        __CLR4_4_12cse2cselb90pesr.R.inc(110037);createRegression().newSampleData(new double[] {}, null);
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}
    
     /*
     * This is a test based on the Wampler1 data set
     * http://www.itl.nist.gov/div898/strd/lls/data/Wampler1.shtml
     */
    @Test
    public void testWampler1() {__CLR4_4_12cse2cselb90pesr.R.globalSliceStart(getClass().getName(),110038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131wh8i2cwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cse2cselb90pesr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cse2cselb90pesr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest.testWampler1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131wh8i2cwm(){try{__CLR4_4_12cse2cselb90pesr.R.inc(110038);
        __CLR4_4_12cse2cselb90pesr.R.inc(110039);double[] data = new double[]{
            1, 0,
            6, 1,
            63, 2,
            364, 3,
            1365, 4,
            3906, 5,
            9331, 6,
            19608, 7,
            37449, 8,
            66430, 9,
            111111, 10,
            177156, 11,
            271453, 12,
            402234, 13,
            579195, 14,
            813616, 15,
            1118481, 16,
            1508598, 17,
            2000719, 18,
            2613660, 19,
            3368421, 20};
        __CLR4_4_12cse2cselb90pesr.R.inc(110040);OLSMultipleLinearRegression model = new OLSMultipleLinearRegression();


        __CLR4_4_12cse2cselb90pesr.R.inc(110041);final int nvars = 5;
        __CLR4_4_12cse2cselb90pesr.R.inc(110042);final int nobs = 21;
        __CLR4_4_12cse2cselb90pesr.R.inc(110043);double[] tmp = new double[(nvars + 1) * nobs];
        __CLR4_4_12cse2cselb90pesr.R.inc(110044);int off = 0;
        __CLR4_4_12cse2cselb90pesr.R.inc(110045);int off2 = 0;
        __CLR4_4_12cse2cselb90pesr.R.inc(110046);for (int i = 0; (((i < nobs)&&(__CLR4_4_12cse2cselb90pesr.R.iget(110047)!=0|true))||(__CLR4_4_12cse2cselb90pesr.R.iget(110048)==0&false)); i++) {{
            __CLR4_4_12cse2cselb90pesr.R.inc(110049);tmp[off2] = data[off];
            __CLR4_4_12cse2cselb90pesr.R.inc(110050);tmp[off2 + 1] = data[off + 1];
            __CLR4_4_12cse2cselb90pesr.R.inc(110051);tmp[off2 + 2] = tmp[off2 + 1] * tmp[off2 + 1];
            __CLR4_4_12cse2cselb90pesr.R.inc(110052);tmp[off2 + 3] = tmp[off2 + 1] * tmp[off2 + 2];
            __CLR4_4_12cse2cselb90pesr.R.inc(110053);tmp[off2 + 4] = tmp[off2 + 1] * tmp[off2 + 3];
            __CLR4_4_12cse2cselb90pesr.R.inc(110054);tmp[off2 + 5] = tmp[off2 + 1] * tmp[off2 + 4];
            __CLR4_4_12cse2cselb90pesr.R.inc(110055);off2 += (nvars + 1);
            __CLR4_4_12cse2cselb90pesr.R.inc(110056);off += 2;
        }
        }__CLR4_4_12cse2cselb90pesr.R.inc(110057);model.newSampleData(tmp, nobs, nvars);
        __CLR4_4_12cse2cselb90pesr.R.inc(110058);double[] betaHat = model.estimateRegressionParameters();
        __CLR4_4_12cse2cselb90pesr.R.inc(110059);TestUtils.assertEquals(betaHat,
                new double[]{1.0,
                    1.0, 1.0,
                    1.0, 1.0,
                    1.0}, 1E-8);

        __CLR4_4_12cse2cselb90pesr.R.inc(110060);double[] se = model.estimateRegressionParametersStandardErrors();
        __CLR4_4_12cse2cselb90pesr.R.inc(110061);TestUtils.assertEquals(se,
                new double[]{0.0,
                    0.0, 0.0,
                    0.0, 0.0,
                    0.0}, 1E-8); 

        __CLR4_4_12cse2cselb90pesr.R.inc(110062);TestUtils.assertEquals(1.0, model.calculateRSquared(), 1.0e-10);
        __CLR4_4_12cse2cselb90pesr.R.inc(110063);TestUtils.assertEquals(0, model.estimateErrorVariance(), 1.0e-7);
        __CLR4_4_12cse2cselb90pesr.R.inc(110064);TestUtils.assertEquals(0.00, model.calculateResidualSumOfSquares(), 1.0e-6);

        __CLR4_4_12cse2cselb90pesr.R.inc(110065);return;
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}
    
    /*
     * This is a test based on the Wampler2 data set
     * http://www.itl.nist.gov/div898/strd/lls/data/Wampler2.shtml
     */
    @Test
    public void testWampler2() {__CLR4_4_12cse2cselb90pesr.R.globalSliceStart(getClass().getName(),110066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_173hjz2cxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cse2cselb90pesr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cse2cselb90pesr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest.testWampler2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_173hjz2cxe(){try{__CLR4_4_12cse2cselb90pesr.R.inc(110066);
        __CLR4_4_12cse2cselb90pesr.R.inc(110067);double[] data = new double[]{
            1.00000, 0,
            1.11111, 1,
            1.24992, 2,
            1.42753, 3,
            1.65984, 4,
            1.96875, 5,
            2.38336, 6,
            2.94117, 7,
            3.68928, 8,
            4.68559, 9,
            6.00000, 10,
            7.71561, 11,
            9.92992, 12,
            12.75603, 13,
            16.32384, 14,
            20.78125, 15,
            26.29536, 16,
            33.05367, 17,
            41.26528, 18,
            51.16209, 19,
            63.00000, 20};
        __CLR4_4_12cse2cselb90pesr.R.inc(110068);OLSMultipleLinearRegression model = new OLSMultipleLinearRegression();


        __CLR4_4_12cse2cselb90pesr.R.inc(110069);final int nvars = 5;
        __CLR4_4_12cse2cselb90pesr.R.inc(110070);final int nobs = 21;
        __CLR4_4_12cse2cselb90pesr.R.inc(110071);double[] tmp = new double[(nvars + 1) * nobs];
        __CLR4_4_12cse2cselb90pesr.R.inc(110072);int off = 0;
        __CLR4_4_12cse2cselb90pesr.R.inc(110073);int off2 = 0;
        __CLR4_4_12cse2cselb90pesr.R.inc(110074);for (int i = 0; (((i < nobs)&&(__CLR4_4_12cse2cselb90pesr.R.iget(110075)!=0|true))||(__CLR4_4_12cse2cselb90pesr.R.iget(110076)==0&false)); i++) {{
            __CLR4_4_12cse2cselb90pesr.R.inc(110077);tmp[off2] = data[off];
            __CLR4_4_12cse2cselb90pesr.R.inc(110078);tmp[off2 + 1] = data[off + 1];
            __CLR4_4_12cse2cselb90pesr.R.inc(110079);tmp[off2 + 2] = tmp[off2 + 1] * tmp[off2 + 1];
            __CLR4_4_12cse2cselb90pesr.R.inc(110080);tmp[off2 + 3] = tmp[off2 + 1] * tmp[off2 + 2];
            __CLR4_4_12cse2cselb90pesr.R.inc(110081);tmp[off2 + 4] = tmp[off2 + 1] * tmp[off2 + 3];
            __CLR4_4_12cse2cselb90pesr.R.inc(110082);tmp[off2 + 5] = tmp[off2 + 1] * tmp[off2 + 4];
            __CLR4_4_12cse2cselb90pesr.R.inc(110083);off2 += (nvars + 1);
            __CLR4_4_12cse2cselb90pesr.R.inc(110084);off += 2;
        }
        }__CLR4_4_12cse2cselb90pesr.R.inc(110085);model.newSampleData(tmp, nobs, nvars);
        __CLR4_4_12cse2cselb90pesr.R.inc(110086);double[] betaHat = model.estimateRegressionParameters();
        __CLR4_4_12cse2cselb90pesr.R.inc(110087);TestUtils.assertEquals(betaHat,
                new double[]{
                    1.0,
                    1.0e-1,
                    1.0e-2,
                    1.0e-3, 1.0e-4,
                    1.0e-5}, 1E-8);

        __CLR4_4_12cse2cselb90pesr.R.inc(110088);double[] se = model.estimateRegressionParametersStandardErrors();
        __CLR4_4_12cse2cselb90pesr.R.inc(110089);TestUtils.assertEquals(se,
                new double[]{0.0,
                    0.0, 0.0,
                    0.0, 0.0,
                    0.0}, 1E-8); 
        __CLR4_4_12cse2cselb90pesr.R.inc(110090);TestUtils.assertEquals(1.0, model.calculateRSquared(), 1.0e-10);
        __CLR4_4_12cse2cselb90pesr.R.inc(110091);TestUtils.assertEquals(0, model.estimateErrorVariance(), 1.0e-7);
        __CLR4_4_12cse2cselb90pesr.R.inc(110092);TestUtils.assertEquals(0.00, model.calculateResidualSumOfSquares(), 1.0e-6);
        __CLR4_4_12cse2cselb90pesr.R.inc(110093);return;
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}
    
    /*
     * This is a test based on the Wampler3 data set
     * http://www.itl.nist.gov/div898/strd/lls/data/Wampler3.shtml
     */
    @Test
    public void testWampler3() {__CLR4_4_12cse2cselb90pesr.R.globalSliceStart(getClass().getName(),110094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13g3gcg2cy6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cse2cselb90pesr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cse2cselb90pesr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest.testWampler3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13g3gcg2cy6(){try{__CLR4_4_12cse2cselb90pesr.R.inc(110094);
        __CLR4_4_12cse2cselb90pesr.R.inc(110095);double[] data = new double[]{
            760, 0,
            -2042, 1,
            2111, 2,
            -1684, 3,
            3888, 4,
            1858, 5,
            11379, 6,
            17560, 7,
            39287, 8,
            64382, 9,
            113159, 10,
            175108, 11,
            273291, 12,
            400186, 13,
            581243, 14,
            811568, 15,
            1121004, 16,
            1506550, 17,
            2002767, 18,
            2611612, 19,
            3369180, 20};

        __CLR4_4_12cse2cselb90pesr.R.inc(110096);OLSMultipleLinearRegression model = new OLSMultipleLinearRegression();
        __CLR4_4_12cse2cselb90pesr.R.inc(110097);final int nvars = 5;
        __CLR4_4_12cse2cselb90pesr.R.inc(110098);final int nobs = 21;
        __CLR4_4_12cse2cselb90pesr.R.inc(110099);double[] tmp = new double[(nvars + 1) * nobs];
        __CLR4_4_12cse2cselb90pesr.R.inc(110100);int off = 0;
        __CLR4_4_12cse2cselb90pesr.R.inc(110101);int off2 = 0;
        __CLR4_4_12cse2cselb90pesr.R.inc(110102);for (int i = 0; (((i < nobs)&&(__CLR4_4_12cse2cselb90pesr.R.iget(110103)!=0|true))||(__CLR4_4_12cse2cselb90pesr.R.iget(110104)==0&false)); i++) {{
            __CLR4_4_12cse2cselb90pesr.R.inc(110105);tmp[off2] = data[off];
            __CLR4_4_12cse2cselb90pesr.R.inc(110106);tmp[off2 + 1] = data[off + 1];
            __CLR4_4_12cse2cselb90pesr.R.inc(110107);tmp[off2 + 2] = tmp[off2 + 1] * tmp[off2 + 1];
            __CLR4_4_12cse2cselb90pesr.R.inc(110108);tmp[off2 + 3] = tmp[off2 + 1] * tmp[off2 + 2];
            __CLR4_4_12cse2cselb90pesr.R.inc(110109);tmp[off2 + 4] = tmp[off2 + 1] * tmp[off2 + 3];
            __CLR4_4_12cse2cselb90pesr.R.inc(110110);tmp[off2 + 5] = tmp[off2 + 1] * tmp[off2 + 4];
            __CLR4_4_12cse2cselb90pesr.R.inc(110111);off2 += (nvars + 1);
            __CLR4_4_12cse2cselb90pesr.R.inc(110112);off += 2;
        }
        }__CLR4_4_12cse2cselb90pesr.R.inc(110113);model.newSampleData(tmp, nobs, nvars);
        __CLR4_4_12cse2cselb90pesr.R.inc(110114);double[] betaHat = model.estimateRegressionParameters();
        __CLR4_4_12cse2cselb90pesr.R.inc(110115);TestUtils.assertEquals(betaHat,
                new double[]{
                    1.0,
                    1.0,
                    1.0,
                    1.0,
                    1.0,
                    1.0}, 1E-8); 

        __CLR4_4_12cse2cselb90pesr.R.inc(110116);double[] se = model.estimateRegressionParametersStandardErrors();
        __CLR4_4_12cse2cselb90pesr.R.inc(110117);TestUtils.assertEquals(se,
                new double[]{2152.32624678170,
                    2363.55173469681, 779.343524331583,
                    101.475507550350, 5.64566512170752,
                    0.112324854679312}, 1E-8); //

        __CLR4_4_12cse2cselb90pesr.R.inc(110118);TestUtils.assertEquals(.999995559025820, model.calculateRSquared(), 1.0e-10);
        __CLR4_4_12cse2cselb90pesr.R.inc(110119);TestUtils.assertEquals(5570284.53333333, model.estimateErrorVariance(), 1.0e-6);
        __CLR4_4_12cse2cselb90pesr.R.inc(110120);TestUtils.assertEquals(83554268.0000000, model.calculateResidualSumOfSquares(), 1.0e-5);
        __CLR4_4_12cse2cselb90pesr.R.inc(110121);return;
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}

    /*
     * This is a test based on the Wampler4 data set
     * http://www.itl.nist.gov/div898/strd/lls/data/Wampler4.shtml
     */
    @Test
    public void testWampler4() {__CLR4_4_12cse2cselb90pesr.R.globalSliceStart(getClass().getName(),110122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16p3f4x2cyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cse2cselb90pesr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cse2cselb90pesr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest.testWampler4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16p3f4x2cyy(){try{__CLR4_4_12cse2cselb90pesr.R.inc(110122);
        __CLR4_4_12cse2cselb90pesr.R.inc(110123);double[] data = new double[]{
            75901, 0,
            -204794, 1,
            204863, 2,
            -204436, 3,
            253665, 4,
            -200894, 5,
            214131, 6,
            -185192, 7,
            221249, 8,
            -138370, 9,
            315911, 10,
            -27644, 11,
            455253, 12,
            197434, 13,
            783995, 14,
            608816, 15,
            1370781, 16,
            1303798, 17,
            2205519, 18,
            2408860, 19,
            3444321, 20};

        __CLR4_4_12cse2cselb90pesr.R.inc(110124);OLSMultipleLinearRegression model = new OLSMultipleLinearRegression();
        __CLR4_4_12cse2cselb90pesr.R.inc(110125);final int nvars = 5;
        __CLR4_4_12cse2cselb90pesr.R.inc(110126);final int nobs = 21;
        __CLR4_4_12cse2cselb90pesr.R.inc(110127);double[] tmp = new double[(nvars + 1) * nobs];
        __CLR4_4_12cse2cselb90pesr.R.inc(110128);int off = 0;
        __CLR4_4_12cse2cselb90pesr.R.inc(110129);int off2 = 0;
        __CLR4_4_12cse2cselb90pesr.R.inc(110130);for (int i = 0; (((i < nobs)&&(__CLR4_4_12cse2cselb90pesr.R.iget(110131)!=0|true))||(__CLR4_4_12cse2cselb90pesr.R.iget(110132)==0&false)); i++) {{
            __CLR4_4_12cse2cselb90pesr.R.inc(110133);tmp[off2] = data[off];
            __CLR4_4_12cse2cselb90pesr.R.inc(110134);tmp[off2 + 1] = data[off + 1];
            __CLR4_4_12cse2cselb90pesr.R.inc(110135);tmp[off2 + 2] = tmp[off2 + 1] * tmp[off2 + 1];
            __CLR4_4_12cse2cselb90pesr.R.inc(110136);tmp[off2 + 3] = tmp[off2 + 1] * tmp[off2 + 2];
            __CLR4_4_12cse2cselb90pesr.R.inc(110137);tmp[off2 + 4] = tmp[off2 + 1] * tmp[off2 + 3];
            __CLR4_4_12cse2cselb90pesr.R.inc(110138);tmp[off2 + 5] = tmp[off2 + 1] * tmp[off2 + 4];
            __CLR4_4_12cse2cselb90pesr.R.inc(110139);off2 += (nvars + 1);
            __CLR4_4_12cse2cselb90pesr.R.inc(110140);off += 2;
        }
        }__CLR4_4_12cse2cselb90pesr.R.inc(110141);model.newSampleData(tmp, nobs, nvars);
        __CLR4_4_12cse2cselb90pesr.R.inc(110142);double[] betaHat = model.estimateRegressionParameters();
        __CLR4_4_12cse2cselb90pesr.R.inc(110143);TestUtils.assertEquals(betaHat,
                new double[]{
                    1.0,
                    1.0,
                    1.0,
                    1.0,
                    1.0,
                    1.0}, 1E-6); 

        __CLR4_4_12cse2cselb90pesr.R.inc(110144);double[] se = model.estimateRegressionParametersStandardErrors();
        __CLR4_4_12cse2cselb90pesr.R.inc(110145);TestUtils.assertEquals(se,
                new double[]{215232.624678170,
                    236355.173469681, 77934.3524331583,
                    10147.5507550350, 564.566512170752,
                    11.2324854679312}, 1E-8); 

        __CLR4_4_12cse2cselb90pesr.R.inc(110146);TestUtils.assertEquals(.957478440825662, model.calculateRSquared(), 1.0e-10);
        __CLR4_4_12cse2cselb90pesr.R.inc(110147);TestUtils.assertEquals(55702845333.3333, model.estimateErrorVariance(), 1.0e-4);
        __CLR4_4_12cse2cselb90pesr.R.inc(110148);TestUtils.assertEquals(835542680000.000, model.calculateResidualSumOfSquares(), 1.0e-3);
        __CLR4_4_12cse2cselb90pesr.R.inc(110149);return;
    }finally{__CLR4_4_12cse2cselb90pesr.R.flushNeeded();}}
}
