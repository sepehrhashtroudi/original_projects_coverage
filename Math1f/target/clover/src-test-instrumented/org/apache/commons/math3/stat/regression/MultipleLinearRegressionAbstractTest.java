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

import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public abstract class MultipleLinearRegressionAbstractTest {static class __CLR4_4_12cr02cr0lb90pes4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,109886,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected AbstractMultipleLinearRegression regression;

    @Before
    public void setUp(){try{__CLR4_4_12cr02cr0lb90pes4.R.inc(109836);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109837);regression = createRegression();
    }finally{__CLR4_4_12cr02cr0lb90pes4.R.flushNeeded();}}

    protected abstract AbstractMultipleLinearRegression createRegression();

    protected abstract int getNumberOfRegressors();

    protected abstract int getSampleSize();

    @Test
    public void canEstimateRegressionParameters(){__CLR4_4_12cr02cr0lb90pes4.R.globalSliceStart(getClass().getName(),109838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hb9nme2cr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cr02cr0lb90pes4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cr02cr0lb90pes4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.canEstimateRegressionParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hb9nme2cr2(){try{__CLR4_4_12cr02cr0lb90pes4.R.inc(109838);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109839);double[] beta = regression.estimateRegressionParameters();
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109840);Assert.assertEquals(getNumberOfRegressors(), beta.length);
    }finally{__CLR4_4_12cr02cr0lb90pes4.R.flushNeeded();}}

    @Test
    public void canEstimateResiduals(){__CLR4_4_12cr02cr0lb90pes4.R.globalSliceStart(getClass().getName(),109841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdv312cr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cr02cr0lb90pes4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cr02cr0lb90pes4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.canEstimateResiduals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdv312cr5(){try{__CLR4_4_12cr02cr0lb90pes4.R.inc(109841);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109842);double[] e = regression.estimateResiduals();
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109843);Assert.assertEquals(getSampleSize(), e.length);
    }finally{__CLR4_4_12cr02cr0lb90pes4.R.flushNeeded();}}

    @Test
    public void canEstimateRegressionParametersVariance(){__CLR4_4_12cr02cr0lb90pes4.R.globalSliceStart(getClass().getName(),109844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_195ti32cr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cr02cr0lb90pes4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cr02cr0lb90pes4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.canEstimateRegressionParametersVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_195ti32cr8(){try{__CLR4_4_12cr02cr0lb90pes4.R.inc(109844);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109845);double[][] variance = regression.estimateRegressionParametersVariance();
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109846);Assert.assertEquals(getNumberOfRegressors(), variance.length);
    }finally{__CLR4_4_12cr02cr0lb90pes4.R.flushNeeded();}}

    @Test
    public void canEstimateRegressandVariance(){__CLR4_4_12cr02cr0lb90pes4.R.globalSliceStart(getClass().getName(),109847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uq7klc2crb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cr02cr0lb90pes4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cr02cr0lb90pes4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.canEstimateRegressandVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uq7klc2crb(){try{__CLR4_4_12cr02cr0lb90pes4.R.inc(109847);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109848);if ((((getSampleSize() > getNumberOfRegressors())&&(__CLR4_4_12cr02cr0lb90pes4.R.iget(109849)!=0|true))||(__CLR4_4_12cr02cr0lb90pes4.R.iget(109850)==0&false))) {{
            __CLR4_4_12cr02cr0lb90pes4.R.inc(109851);double variance = regression.estimateRegressandVariance();
            __CLR4_4_12cr02cr0lb90pes4.R.inc(109852);Assert.assertTrue(variance > 0.0);
        }
    }}finally{__CLR4_4_12cr02cr0lb90pes4.R.flushNeeded();}}
    
    /**
     * Verifies that newSampleData methods consistently insert unitary columns
     * in design matrix.  Confirms the fix for MATH-411.
     */
    @Test
    public void testNewSample() {__CLR4_4_12cr02cr0lb90pes4.R.globalSliceStart(getClass().getName(),109853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r4cs752crh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cr02cr0lb90pes4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cr02cr0lb90pes4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.testNewSample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r4cs752crh(){try{__CLR4_4_12cr02cr0lb90pes4.R.inc(109853);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109854);double[] design = new double[] {
          1, 19, 22, 33,
          2, 20, 30, 40,
          3, 25, 35, 45,
          4, 27, 37, 47
        };
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109855);double[] y = new double[] {1, 2, 3, 4}; 
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109856);double[][] x = new double[][] {
          {19, 22, 33},
          {20, 30, 40},
          {25, 35, 45},
          {27, 37, 47}   
        };
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109857);AbstractMultipleLinearRegression regression = createRegression();
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109858);regression.newSampleData(design, 4, 3);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109859);RealMatrix flatX = regression.getX().copy();
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109860);RealVector flatY = regression.getY().copy();
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109861);regression.newXSampleData(x);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109862);regression.newYSampleData(y);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109863);Assert.assertEquals(flatX, regression.getX());
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109864);Assert.assertEquals(flatY, regression.getY());
        
        // No intercept
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109865);regression.setNoIntercept(true);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109866);regression.newSampleData(design, 4, 3);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109867);flatX = regression.getX().copy();
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109868);flatY = regression.getY().copy();
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109869);regression.newXSampleData(x);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109870);regression.newYSampleData(y);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109871);Assert.assertEquals(flatX, regression.getX());
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109872);Assert.assertEquals(flatY, regression.getY());
    }finally{__CLR4_4_12cr02cr0lb90pes4.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void testNewSampleNullData() {__CLR4_4_12cr02cr0lb90pes4.R.globalSliceStart(getClass().getName(),109873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1prrbbk2cs1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,119,83,97,109,112,108,101,78,117,108,108,68,97,116,97,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cr02cr0lb90pes4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cr02cr0lb90pes4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.testNewSampleNullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1prrbbk2cs1(){try{__CLR4_4_12cr02cr0lb90pes4.R.inc(109873);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109874);double[] data = null;
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109875);createRegression().newSampleData(data, 2, 3); 
    }finally{__CLR4_4_12cr02cr0lb90pes4.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void testNewSampleInvalidData() {__CLR4_4_12cr02cr0lb90pes4.R.globalSliceStart(getClass().getName(),109876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1djoxu82cs4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,119,83,97,109,112,108,101,73,110,118,97,108,105,100,68,97,116,97,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cr02cr0lb90pes4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cr02cr0lb90pes4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.testNewSampleInvalidData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1djoxu82cs4(){try{__CLR4_4_12cr02cr0lb90pes4.R.inc(109876);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109877);double[] data = new double[] {1, 2, 3, 4};
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109878);createRegression().newSampleData(data, 2, 3);
    }finally{__CLR4_4_12cr02cr0lb90pes4.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void testNewSampleInsufficientData() {__CLR4_4_12cr02cr0lb90pes4.R.globalSliceStart(getClass().getName(),109879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gt7sp82cs7();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,119,83,97,109,112,108,101,73,110,115,117,102,102,105,99,105,101,110,116,68,97,116,97,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cr02cr0lb90pes4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cr02cr0lb90pes4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.testNewSampleInsufficientData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gt7sp82cs7(){try{__CLR4_4_12cr02cr0lb90pes4.R.inc(109879);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109880);double[] data = new double[] {1, 2, 3, 4};
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109881);createRegression().newSampleData(data, 1, 3);
    }finally{__CLR4_4_12cr02cr0lb90pes4.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void testXSampleDataNull() {__CLR4_4_12cr02cr0lb90pes4.R.globalSliceStart(getClass().getName(),109882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ed6u542csa();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,88,83,97,109,112,108,101,68,97,116,97,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cr02cr0lb90pes4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cr02cr0lb90pes4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.testXSampleDataNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ed6u542csa(){try{__CLR4_4_12cr02cr0lb90pes4.R.inc(109882);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109883);createRegression().newXSampleData(null);
    }finally{__CLR4_4_12cr02cr0lb90pes4.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void testYSampleDataNull() {__CLR4_4_12cr02cr0lb90pes4.R.globalSliceStart(getClass().getName(),109884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9anef2csc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,89,83,97,109,112,108,101,68,97,116,97,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12cr02cr0lb90pes4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12cr02cr0lb90pes4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MultipleLinearRegressionAbstractTest.testYSampleDataNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9anef2csc(){try{__CLR4_4_12cr02cr0lb90pes4.R.inc(109884);
        __CLR4_4_12cr02cr0lb90pes4.R.inc(109885);createRegression().newYSampleData(null);
    }finally{__CLR4_4_12cr02cr0lb90pes4.R.flushNeeded();}}

}
