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
package org.apache.commons.math3.linear;

import org.junit.Test;
import org.junit.Assert;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathIllegalStateException;

/**
 * Test cases for the {@link Array2DRowRealMatrix} class.
 *
 * @version $Id$
 */

public final class Array2DRowRealMatrixTest {static class __CLR4_4_11qq81qq8lb90pcz3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,81995,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // 3 x 3 identity matrix
    protected double[][] id = { {1d,0d,0d}, {0d,1d,0d}, {0d,0d,1d} };

    // Test data for group operations
    protected double[][] testData = { {1d,2d,3d}, {2d,5d,3d}, {1d,0d,8d} };
    protected double[][] testDataLU = {{2d, 5d, 3d}, {.5d, -2.5d, 6.5d}, {0.5d, 0.2d, .2d}};
    protected double[][] testDataPlus2 = { {3d,4d,5d}, {4d,7d,5d}, {3d,2d,10d} };
    protected double[][] testDataMinus = { {-1d,-2d,-3d}, {-2d,-5d,-3d},
       {-1d,0d,-8d} };
    protected double[] testDataRow1 = {1d,2d,3d};
    protected double[] testDataCol3 = {3d,3d,8d};
    protected double[][] testDataInv =
        { {-40d,16d,9d}, {13d,-5d,-3d}, {5d,-2d,-1d} };
    protected double[] preMultTest = {8,12,33};
    protected double[][] testData2 ={ {1d,2d,3d}, {2d,5d,3d}};
    protected double[][] testData2T = { {1d,2d}, {2d,5d}, {3d,3d}};
    protected double[][] testDataPlusInv =
        { {-39d,18d,12d}, {15d,0d,0d}, {6d,-2d,7d} };

    // lu decomposition tests
    protected double[][] luData = { {2d,3d,3d}, {0d,5d,7d}, {6d,9d,8d} };
    protected double[][] luDataLUDecomposition = { {6d,9d,8d}, {0d,5d,7d},
            {0.33333333333333,0d,0.33333333333333} };

    // singular matrices
    protected double[][] singular = { {2d,3d}, {2d,3d} };
    protected double[][] bigSingular = {{1d,2d,3d,4d}, {2d,5d,3d,4d},
        {7d,3d,256d,1930d}, {3d,7d,6d,8d}}; // 4th row = 1st + 2nd
    protected double[][] detData = { {1d,2d,3d}, {4d,5d,6d}, {7d,8d,10d} };
    protected double[][] detData2 = { {1d, 3d}, {2d, 4d}};

    // vectors
    protected double[] testVector = {1,2,3};
    protected double[] testVector2 = {1,2,3,4};

    // submatrix accessor tests
    protected double[][] subTestData = {{1, 2, 3, 4}, {1.5, 2.5, 3.5, 4.5},
            {2, 4, 6, 8}, {4, 5, 6, 7}};
    // array selections
    protected double[][] subRows02Cols13 = { {2, 4}, {4, 8}};
    protected double[][] subRows03Cols12 = { {2, 3}, {5, 6}};
    protected double[][] subRows03Cols123 = { {2, 3, 4} , {5, 6, 7}};
    // effective permutations
    protected double[][] subRows20Cols123 = { {4, 6, 8} , {2, 3, 4}};
    protected double[][] subRows31Cols31 = {{7, 5}, {4.5, 2.5}};
    // contiguous ranges
    protected double[][] subRows01Cols23 = {{3,4} , {3.5, 4.5}};
    protected double[][] subRows23Cols00 = {{2} , {4}};
    protected double[][] subRows00Cols33 = {{4}};
    // row matrices
    protected double[][] subRow0 = {{1,2,3,4}};
    protected double[][] subRow3 = {{4,5,6,7}};
    // column matrices
    protected double[][] subColumn1 = {{2}, {2.5}, {4}, {5}};
    protected double[][] subColumn3 = {{4}, {4.5}, {8}, {7}};

    // tolerances
    protected double entryTolerance = 10E-16;
    protected double normTolerance = 10E-14;
    protected double powerTolerance = 10E-16;

    /** test dimensions */
    @Test
    public void testDimensions() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21qq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21qq8(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81296);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81297);Array2DRowRealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81298);Array2DRowRealMatrix m2 = new Array2DRowRealMatrix(testData2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81299);Assert.assertEquals("testData row dimension",3,m.getRowDimension());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81300);Assert.assertEquals("testData column dimension",3,m.getColumnDimension());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81301);Assert.assertTrue("testData is square",m.isSquare());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81302);Assert.assertEquals("testData2 row dimension",m2.getRowDimension(),2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81303);Assert.assertEquals("testData2 column dimension",m2.getColumnDimension(),3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81304);Assert.assertTrue("testData2 is not square",!m2.isSquare());
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** test copy functions */
    @Test
    public void testCopyFunctions() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pd8kqt1qqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testCopyFunctions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pd8kqt1qqh(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81305);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81306);Array2DRowRealMatrix m1 = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81307);Array2DRowRealMatrix m2 = new Array2DRowRealMatrix(m1.getData());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81308);Assert.assertEquals(m2,m1);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81309);Array2DRowRealMatrix m3 = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81310);Array2DRowRealMatrix m4 = new Array2DRowRealMatrix(m3.getData(), false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81311);Assert.assertEquals(m4,m3);
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** test add */
    @Test
    public void testAdd() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1qqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1qqo(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81312);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81313);Array2DRowRealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81314);Array2DRowRealMatrix mInv = new Array2DRowRealMatrix(testDataInv);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81315);RealMatrix mPlusMInv = m.add(mInv);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81316);double[][] sumEntries = mPlusMInv.getData();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81317);for (int row = 0; (((row < m.getRowDimension())&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81318)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81319)==0&false)); row++) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81320);for (int col = 0; (((col < m.getColumnDimension())&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81321)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81322)==0&false)); col++) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81323);Assert.assertEquals("sum entry entry",
                    testDataPlusInv[row][col],sumEntries[row][col],
                        entryTolerance);
            }
        }}
    }}finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** test add failure */
    @Test
    public void testAddFail() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qefw2c1qr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testAddFail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qefw2c1qr0(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81324);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81325);Array2DRowRealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81326);Array2DRowRealMatrix m2 = new Array2DRowRealMatrix(testData2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81327);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81328);m.add(m2);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81329);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** test norm */
    @Test
    public void testNorm() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs5o971qr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testNorm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs5o971qr6(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81330);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81331);Array2DRowRealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81332);Array2DRowRealMatrix m2 = new Array2DRowRealMatrix(testData2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81333);Assert.assertEquals("testData norm",14d,m.getNorm(),entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81334);Assert.assertEquals("testData2 norm",7d,m2.getNorm(),entryTolerance);
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** test Frobenius norm */
    @Test
    public void testFrobeniusNorm() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g77plc1qrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testFrobeniusNorm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g77plc1qrb(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81335);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81336);Array2DRowRealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81337);Array2DRowRealMatrix m2 = new Array2DRowRealMatrix(testData2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81338);Assert.assertEquals("testData Frobenius norm", FastMath.sqrt(117.0), m.getFrobeniusNorm(), entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81339);Assert.assertEquals("testData2 Frobenius norm", FastMath.sqrt(52.0), m2.getFrobeniusNorm(), entryTolerance);
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

     /** test m-n = m + -n */
    @Test
    public void testPlusMinus() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg67nv1qrg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testPlusMinus",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg67nv1qrg(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81340);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81341);Array2DRowRealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81342);Array2DRowRealMatrix m2 = new Array2DRowRealMatrix(testDataInv);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81343);TestUtils.assertEquals("m-n = m + -n",m.subtract(m2),
            m2.scalarMultiply(-1d).add(m),entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81344);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81345);m.subtract(new Array2DRowRealMatrix(testData2));
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81346);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** test multiply */
    @Test
    public void testMultiply() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn1qrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn1qrn(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81347);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81348);Array2DRowRealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81349);Array2DRowRealMatrix mInv = new Array2DRowRealMatrix(testDataInv);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81350);Array2DRowRealMatrix identity = new Array2DRowRealMatrix(id);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81351);Array2DRowRealMatrix m2 = new Array2DRowRealMatrix(testData2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81352);TestUtils.assertEquals("inverse multiply",m.multiply(mInv),
            identity,entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81353);TestUtils.assertEquals("inverse multiply",mInv.multiply(m),
            identity,entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81354);TestUtils.assertEquals("identity multiply",m.multiply(identity),
            m,entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81355);TestUtils.assertEquals("identity multiply",identity.multiply(mInv),
            mInv,entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81356);TestUtils.assertEquals("identity multiply",m2.multiply(identity),
            m2,entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81357);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81358);m.multiply(new Array2DRowRealMatrix(bigSingular));
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81359);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    //Additional Test for Array2DRowRealMatrixTest.testMultiply

    private double[][] d3 = new double[][] {{1,2,3,4},{5,6,7,8}};
    private double[][] d4 = new double[][] {{1},{2},{3},{4}};
    private double[][] d5 = new double[][] {{30},{70}};

    @Test
    public void testMultiply2() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ccbh251qs0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testMultiply2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ccbh251qs0(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81360);
       __CLR4_4_11qq81qq8lb90pcz3.R.inc(81361);RealMatrix m3 = new Array2DRowRealMatrix(d3);
       __CLR4_4_11qq81qq8lb90pcz3.R.inc(81362);RealMatrix m4 = new Array2DRowRealMatrix(d4);
       __CLR4_4_11qq81qq8lb90pcz3.R.inc(81363);RealMatrix m5 = new Array2DRowRealMatrix(d5);
       __CLR4_4_11qq81qq8lb90pcz3.R.inc(81364);TestUtils.assertEquals("m3*m4=m5", m3.multiply(m4), m5, entryTolerance);
   }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testPower() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7pxfe1qs5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testPower",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7pxfe1qs5(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81365);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81366);Array2DRowRealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81367);Array2DRowRealMatrix mInv = new Array2DRowRealMatrix(testDataInv);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81368);Array2DRowRealMatrix mPlusInv = new Array2DRowRealMatrix(testDataPlusInv);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81369);Array2DRowRealMatrix identity = new Array2DRowRealMatrix(id);

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81370);TestUtils.assertEquals("m^0", m.power(0),
            identity, entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81371);TestUtils.assertEquals("mInv^0", mInv.power(0),
                identity, entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81372);TestUtils.assertEquals("mPlusInv^0", mPlusInv.power(0),
                identity, entryTolerance);

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81373);TestUtils.assertEquals("m^1", m.power(1),
                m, entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81374);TestUtils.assertEquals("mInv^1", mInv.power(1),
                mInv, entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81375);TestUtils.assertEquals("mPlusInv^1", mPlusInv.power(1),
                mPlusInv, entryTolerance);

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81376);RealMatrix C1 = m.copy();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81377);RealMatrix C2 = mInv.copy();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81378);RealMatrix C3 = mPlusInv.copy();

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81379);for (int i = 2; (((i <= 10)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81380)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81381)==0&false)); ++i) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81382);C1 = C1.multiply(m);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81383);C2 = C2.multiply(mInv);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81384);C3 = C3.multiply(mPlusInv);

            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81385);TestUtils.assertEquals("m^" + i, m.power(i),
                    C1, entryTolerance);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81386);TestUtils.assertEquals("mInv^" + i, mInv.power(i),
                    C2, entryTolerance);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81387);TestUtils.assertEquals("mPlusInv^" + i, mPlusInv.power(i),
                    C3, entryTolerance);
        }

        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81388);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81389);Array2DRowRealMatrix mNotSquare = new Array2DRowRealMatrix(testData2T);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81390);mNotSquare.power(2);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81391);Assert.fail("Expecting NonSquareMatrixException");
        } catch (NonSquareMatrixException ex) {
            // ignored
        }

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81392);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81393);m.power(-1);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81394);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** test trace */
    @Test
    public void testTrace() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ht6t61qsz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testTrace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ht6t61qsz(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81395);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81396);RealMatrix m = new Array2DRowRealMatrix(id);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81397);Assert.assertEquals("identity trace",3d,m.getTrace(),entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81398);m = new Array2DRowRealMatrix(testData2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81399);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81400);m.getTrace();
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81401);Assert.fail("Expecting NonSquareMatrixException");
        } catch (NonSquareMatrixException ex) {
            // ignored
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** test sclarAdd */
    @Test
    public void testScalarAdd() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r073wq1qt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testScalarAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r073wq1qt6(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81402);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81403);RealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81404);TestUtils.assertEquals("scalar add",new Array2DRowRealMatrix(testDataPlus2),
            m.scalarAdd(2d),entryTolerance);
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** test operate */
    @Test
    public void testOperate() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ga6hzt1qt9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testOperate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ga6hzt1qt9(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81405);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81406);RealMatrix m = new Array2DRowRealMatrix(id);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81407);TestUtils.assertEquals("identity operate", testVector,
                    m.operate(testVector), entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81408);TestUtils.assertEquals("identity operate", testVector,
                    m.operate(new ArrayRealVector(testVector)).toArray(), entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81409);m = new Array2DRowRealMatrix(bigSingular);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81410);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81411);m.operate(testVector);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81412);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** test issue MATH-209 */
    @Test
    public void testMath209() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kh1w4o1qth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testMath209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kh1w4o1qth(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81413);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81414);RealMatrix a = new Array2DRowRealMatrix(new double[][] {
                { 1, 2 }, { 3, 4 }, { 5, 6 }
        }, false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81415);double[] b = a.operate(new double[] { 1, 1 });
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81416);Assert.assertEquals(a.getRowDimension(), b.length);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81417);Assert.assertEquals( 3.0, b[0], 1.0e-12);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81418);Assert.assertEquals( 7.0, b[1], 1.0e-12);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81419);Assert.assertEquals(11.0, b[2], 1.0e-12);
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** test transpose */
    @Test
    public void testTranspose() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gtyr21qto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testTranspose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gtyr21qto(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81420);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81421);RealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81422);RealMatrix mIT = new LUDecomposition(m).getSolver().getInverse().transpose();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81423);RealMatrix mTI = new LUDecomposition(m.transpose()).getSolver().getInverse();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81424);TestUtils.assertEquals("inverse-transpose", mIT, mTI, normTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81425);m = new Array2DRowRealMatrix(testData2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81426);RealMatrix mt = new Array2DRowRealMatrix(testData2T);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81427);TestUtils.assertEquals("transpose",mt,m.transpose(),normTolerance);
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** test preMultiply by vector */
    @Test
    public void testPremultiplyVector() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5c08x1qtw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testPremultiplyVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5c08x1qtw(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81428);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81429);RealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81430);TestUtils.assertEquals("premultiply", m.preMultiply(testVector),
                    preMultTest, normTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81431);TestUtils.assertEquals("premultiply", m.preMultiply(new ArrayRealVector(testVector).toArray()),
                    preMultTest, normTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81432);m = new Array2DRowRealMatrix(bigSingular);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81433);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81434);m.preMultiply(testVector);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81435);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testPremultiply() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16waah01qu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testPremultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16waah01qu4(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81436);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81437);RealMatrix m3 = new Array2DRowRealMatrix(d3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81438);RealMatrix m4 = new Array2DRowRealMatrix(d4);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81439);RealMatrix m5 = new Array2DRowRealMatrix(d5);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81440);TestUtils.assertEquals("m3*m4=m5", m4.preMultiply(m3), m5, entryTolerance);

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81441);Array2DRowRealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81442);Array2DRowRealMatrix mInv = new Array2DRowRealMatrix(testDataInv);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81443);Array2DRowRealMatrix identity = new Array2DRowRealMatrix(id);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81444);TestUtils.assertEquals("inverse multiply",m.preMultiply(mInv),
                identity,entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81445);TestUtils.assertEquals("inverse multiply",mInv.preMultiply(m),
                identity,entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81446);TestUtils.assertEquals("identity multiply",m.preMultiply(identity),
                m,entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81447);TestUtils.assertEquals("identity multiply",identity.preMultiply(mInv),
                mInv,entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81448);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81449);m.preMultiply(new Array2DRowRealMatrix(bigSingular));
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81450);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testGetVectors() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kuaj711quj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testGetVectors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kuaj711quj(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81451);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81452);RealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81453);TestUtils.assertEquals("get row",m.getRow(0),testDataRow1,entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81454);TestUtils.assertEquals("get col",m.getColumn(2),testDataCol3,entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81455);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81456);m.getRow(10);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81457);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // ignored
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81458);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81459);m.getColumn(-1);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81460);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // ignored
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testGetEntry() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kt3pn1qut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testGetEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kt3pn1qut(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81461);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81462);RealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81463);Assert.assertEquals("get entry",m.getEntry(0,1),2d,entryTolerance);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81464);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81465);m.getEntry(10, 4);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81466);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** test examples in user guide */
    @Test
    public void testExamples() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knwny1quz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testExamples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knwny1quz(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81467);
        // Create a real matrix with two rows and three columns
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81468);double[][] matrixData = { {1d,2d,3d}, {2d,5d,3d}};
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81469);RealMatrix m = new Array2DRowRealMatrix(matrixData);
        // One more with three rows, two columns
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81470);double[][] matrixData2 = { {1d,2d}, {2d,5d}, {1d, 7d}};
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81471);RealMatrix n = new Array2DRowRealMatrix(matrixData2);
        // Now multiply m by n
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81472);RealMatrix p = m.multiply(n);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81473);Assert.assertEquals(2, p.getRowDimension());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81474);Assert.assertEquals(2, p.getColumnDimension());
        // Invert p
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81475);RealMatrix pInverse = new LUDecomposition(p).getSolver().getInverse();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81476);Assert.assertEquals(2, pInverse.getRowDimension());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81477);Assert.assertEquals(2, pInverse.getColumnDimension());

        // Solve example
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81478);double[][] coefficientsData = {{2, 3, -2}, {-1, 7, 6}, {4, -3, -5}};
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81479);RealMatrix coefficients = new Array2DRowRealMatrix(coefficientsData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81480);RealVector constants = new ArrayRealVector(new double[]{1, -2, 1}, false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81481);RealVector solution = new LUDecomposition(coefficients).getSolver().solve(constants);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81482);final double cst0 = constants.getEntry(0);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81483);final double cst1 = constants.getEntry(1);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81484);final double cst2 = constants.getEntry(2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81485);final double sol0 = solution.getEntry(0);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81486);final double sol1 = solution.getEntry(1);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81487);final double sol2 = solution.getEntry(2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81488);Assert.assertEquals(2 * sol0 + 3 * sol1 -2 * sol2, cst0, 1E-12);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81489);Assert.assertEquals(-1 * sol0 + 7 * sol1 + 6 * sol2, cst1, 1E-12);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81490);Assert.assertEquals(4 * sol0 - 3 * sol1 -5 * sol2, cst2, 1E-12);
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    // test submatrix accessors
    @Test
    public void testGetSubMatrix() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19452rg1qvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testGetSubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19452rg1qvn(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81491);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81492);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81493);checkGetSubMatrix(m, subRows23Cols00,  2 , 3 , 0, 0, false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81494);checkGetSubMatrix(m, subRows00Cols33,  0 , 0 , 3, 3, false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81495);checkGetSubMatrix(m, subRows01Cols23,  0 , 1 , 2, 3, false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81496);checkGetSubMatrix(m, subRows02Cols13,  new int[] { 0, 2 }, new int[] { 1, 3 },    false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81497);checkGetSubMatrix(m, subRows03Cols12,  new int[] { 0, 3 }, new int[] { 1, 2 },    false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81498);checkGetSubMatrix(m, subRows03Cols123, new int[] { 0, 3 }, new int[] { 1, 2, 3 }, false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81499);checkGetSubMatrix(m, subRows20Cols123, new int[] { 2, 0 }, new int[] { 1, 2, 3 }, false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81500);checkGetSubMatrix(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 },    false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81501);checkGetSubMatrix(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 },    false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81502);checkGetSubMatrix(m, null,  1, 0, 2, 4, true);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81503);checkGetSubMatrix(m, null, -1, 1, 2, 2, true);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81504);checkGetSubMatrix(m, null,  1, 0, 2, 2, true);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81505);checkGetSubMatrix(m, null,  1, 0, 2, 4, true);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81506);checkGetSubMatrix(m, null, new int[] {},    new int[] { 0 }, true);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81507);checkGetSubMatrix(m, null, new int[] { 0 }, new int[] { 4 }, true);
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    private void checkGetSubMatrix(RealMatrix m, double[][] reference,
                                   int startRow, int endRow, int startColumn, int endColumn,
                                   boolean mustFail) {try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81508);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81509);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81510);RealMatrix sub = m.getSubMatrix(startRow, endRow, startColumn, endColumn);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81511);Assert.assertEquals(new Array2DRowRealMatrix(reference), sub);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81512);if ((((mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81513)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81514)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81515);Assert.fail("Expecting OutOfRangeException or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81516);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81517)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81518)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81519);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81520);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81521)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81522)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81523);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81524);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81525)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81526)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81527);throw e;
            }
        }}
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    private void checkGetSubMatrix(RealMatrix m, double[][] reference,
                                   int[] selectedRows, int[] selectedColumns,
                                   boolean mustFail) {try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81528);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81529);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81530);RealMatrix sub = m.getSubMatrix(selectedRows, selectedColumns);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81531);Assert.assertEquals(new Array2DRowRealMatrix(reference), sub);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81532);if ((((mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81533)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81534)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81535);Assert.fail("Expecting OutOfRangeException or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81536);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81537)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81538)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81539);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81540);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81541)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81542)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81543);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81544);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81545)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81546)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81547);throw e;
            }
        }}
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testCopySubMatrix() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y87lfj1qx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testCopySubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y87lfj1qx8(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81548);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81549);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81550);checkCopy(m, subRows23Cols00,  2 , 3 , 0, 0, false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81551);checkCopy(m, subRows00Cols33,  0 , 0 , 3, 3, false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81552);checkCopy(m, subRows01Cols23,  0 , 1 , 2, 3, false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81553);checkCopy(m, subRows02Cols13,  new int[] { 0, 2 }, new int[] { 1, 3 },    false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81554);checkCopy(m, subRows03Cols12,  new int[] { 0, 3 }, new int[] { 1, 2 },    false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81555);checkCopy(m, subRows03Cols123, new int[] { 0, 3 }, new int[] { 1, 2, 3 }, false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81556);checkCopy(m, subRows20Cols123, new int[] { 2, 0 }, new int[] { 1, 2, 3 }, false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81557);checkCopy(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 },    false);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81558);checkCopy(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 },    false);

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81559);checkCopy(m, null,  1, 0, 2, 4, true);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81560);checkCopy(m, null, -1, 1, 2, 2, true);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81561);checkCopy(m, null,  1, 0, 2, 2, true);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81562);checkCopy(m, null,  1, 0, 2, 4, true);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81563);checkCopy(m, null, new int[] {},    new int[] { 0 }, true);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81564);checkCopy(m, null, new int[] { 0 }, new int[] { 4 }, true);
        
        // rectangular check
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81565);double[][] copy = new double[][] { { 0, 0, 0 }, { 0, 0 } };
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81566);checkCopy(m, copy, 0, 1, 0, 2, true);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81567);checkCopy(m, copy, new int[] { 0, 1 }, new int[] { 0, 1, 2 }, true);
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    private void checkCopy(RealMatrix m, double[][] reference,
                           int startRow, int endRow, int startColumn, int endColumn,
                           boolean mustFail) {try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81568);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81569);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81570);double[][] sub = ((((reference == null) )&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81571)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81572)==0&false))?
                             new double[1][1] : createIdenticalCopy(reference);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81573);m.copySubMatrix(startRow, endRow, startColumn, endColumn, sub);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81574);Assert.assertEquals(new Array2DRowRealMatrix(reference), new Array2DRowRealMatrix(sub));
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81575);if ((((mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81576)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81577)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81578);Assert.fail("Expecting OutOfRangeException or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81579);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81580)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81581)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81582);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81583);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81584)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81585)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81586);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81587);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81588)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81589)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81590);throw e;
            }
        }} catch (MatrixDimensionMismatchException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81591);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81592)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81593)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81594);throw e;
            }
        }}
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    private void checkCopy(RealMatrix m, double[][] reference,
                           int[] selectedRows, int[] selectedColumns,
                           boolean mustFail) {try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81595);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81596);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81597);double[][] sub = ((((reference == null) )&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81598)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81599)==0&false))?
                    new double[1][1] : createIdenticalCopy(reference);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81600);m.copySubMatrix(selectedRows, selectedColumns, sub);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81601);Assert.assertEquals(new Array2DRowRealMatrix(reference), new Array2DRowRealMatrix(sub));
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81602);if ((((mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81603)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81604)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81605);Assert.fail("Expecting OutOfRangeException or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81606);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81607)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81608)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81609);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81610);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81611)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81612)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81613);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81614);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81615)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81616)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81617);throw e;
            }
        }} catch (MatrixDimensionMismatchException e) {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81618);if ((((!mustFail)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81619)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81620)==0&false))) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81621);throw e;
            }
        }}
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    private double[][] createIdenticalCopy(final double[][] matrix) {try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81622);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81623);final double[][] matrixCopy = new double[matrix.length][];
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81624);for (int i = 0; (((i < matrixCopy.length)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81625)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81626)==0&false)); i++) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81627);matrixCopy[i] = new double[matrix[i].length];
        }
        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81628);return matrixCopy;
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testGetRowMatrix() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11v9mla1qzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testGetRowMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11v9mla1qzh(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81629);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81630);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81631);RealMatrix mRow0 = new Array2DRowRealMatrix(subRow0);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81632);RealMatrix mRow3 = new Array2DRowRealMatrix(subRow3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81633);Assert.assertEquals("Row0", mRow0,
                m.getRowMatrix(0));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81634);Assert.assertEquals("Row3", mRow3,
                m.getRowMatrix(3));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81635);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81636);m.getRowMatrix(-1);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81637);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81638);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81639);m.getRowMatrix(4);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81640);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testSetRowMatrix() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uydvo21qzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testSetRowMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uydvo21qzt(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81641);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81642);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81643);RealMatrix mRow3 = new Array2DRowRealMatrix(subRow3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81644);Assert.assertNotSame(mRow3, m.getRowMatrix(0));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81645);m.setRowMatrix(0, mRow3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81646);Assert.assertEquals(mRow3, m.getRowMatrix(0));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81647);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81648);m.setRowMatrix(-1, mRow3);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81649);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81650);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81651);m.setRowMatrix(0, m);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81652);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testGetColumnMatrix() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m95wrm1r05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testGetColumnMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m95wrm1r05(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81653);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81654);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81655);RealMatrix mColumn1 = new Array2DRowRealMatrix(subColumn1);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81656);RealMatrix mColumn3 = new Array2DRowRealMatrix(subColumn3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81657);Assert.assertEquals("Column1", mColumn1,
                m.getColumnMatrix(1));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81658);Assert.assertEquals("Column3", mColumn3,
                m.getColumnMatrix(3));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81659);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81660);m.getColumnMatrix(-1);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81661);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81662);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81663);m.getColumnMatrix(4);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81664);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testSetColumnMatrix() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zh7wb61r0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testSetColumnMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zh7wb61r0h(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81665);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81666);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81667);RealMatrix mColumn3 = new Array2DRowRealMatrix(subColumn3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81668);Assert.assertNotSame(mColumn3, m.getColumnMatrix(1));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81669);m.setColumnMatrix(1, mColumn3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81670);Assert.assertEquals(mColumn3, m.getColumnMatrix(1));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81671);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81672);m.setColumnMatrix(-1, mColumn3);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81673);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81674);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81675);m.setColumnMatrix(0, m);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81676);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testGetRowVector() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p19x401r0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testGetRowVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p19x401r0t(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81677);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81678);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81679);RealVector mRow0 = new ArrayRealVector(subRow0[0]);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81680);RealVector mRow3 = new ArrayRealVector(subRow3[0]);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81681);Assert.assertEquals("Row0", mRow0, m.getRowVector(0));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81682);Assert.assertEquals("Row3", mRow3, m.getRowVector(3));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81683);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81684);m.getRowVector(-1);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81685);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81686);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81687);m.getRowVector(4);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81688);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testSetRowVector() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gwpvsc1r15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testSetRowVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gwpvsc1r15(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81689);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81690);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81691);RealVector mRow3 = new ArrayRealVector(subRow3[0]);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81692);Assert.assertNotSame(mRow3, m.getRowMatrix(0));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81693);m.setRowVector(0, mRow3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81694);Assert.assertEquals(mRow3, m.getRowVector(0));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81695);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81696);m.setRowVector(-1, mRow3);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81697);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81698);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81699);m.setRowVector(0, new ArrayRealVector(5));
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81700);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testGetColumnVector() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plxuos1r1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testGetColumnVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plxuos1r1h(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81701);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81702);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81703);RealVector mColumn1 = columnToVector(subColumn1);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81704);RealVector mColumn3 = columnToVector(subColumn3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81705);Assert.assertEquals("Column1", mColumn1, m.getColumnVector(1));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81706);Assert.assertEquals("Column3", mColumn3, m.getColumnVector(3));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81707);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81708);m.getColumnVector(-1);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81709);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81710);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81711);m.getColumnVector(4);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81712);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testSetColumnVector() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cb7lsg1r1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testSetColumnVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cb7lsg1r1t(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81713);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81714);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81715);RealVector mColumn3 = columnToVector(subColumn3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81716);Assert.assertNotSame(mColumn3, m.getColumnVector(1));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81717);m.setColumnVector(1, mColumn3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81718);Assert.assertEquals(mColumn3, m.getColumnVector(1));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81719);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81720);m.setColumnVector(-1, mColumn3);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81721);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81722);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81723);m.setColumnVector(0, new ArrayRealVector(5));
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81724);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    private RealVector columnToVector(double[][] column) {try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81725);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81726);double[] data = new double[column.length];
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81727);for (int i = 0; (((i < data.length)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81728)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81729)==0&false)); ++i) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81730);data[i] = column[i][0];
        }
        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81731);return new ArrayRealVector(data, false);
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testGetRow() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1bja51r2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testGetRow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1bja51r2c(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81732);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81733);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81734);checkArrays(subRow0[0], m.getRow(0));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81735);checkArrays(subRow3[0], m.getRow(3));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81736);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81737);m.getRow(-1);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81738);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81739);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81740);m.getRow(4);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81741);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testSetRow() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16z2y4x1r2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testSetRow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16z2y4x1r2m(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81742);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81743);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81744);Assert.assertTrue(subRow3[0][0] != m.getRow(0)[0]);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81745);m.setRow(0, subRow3[0]);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81746);checkArrays(subRow3[0], m.getRow(0));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81747);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81748);m.setRow(-1, subRow3[0]);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81749);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81750);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81751);m.setRow(0, new double[5]);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81752);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testGetColumn() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynjvhb1r2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testGetColumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynjvhb1r2x(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81753);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81754);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81755);double[] mColumn1 = columnToArray(subColumn1);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81756);double[] mColumn3 = columnToArray(subColumn3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81757);checkArrays(mColumn1, m.getColumn(1));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81758);checkArrays(mColumn3, m.getColumn(3));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81759);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81760);m.getColumn(-1);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81761);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81762);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81763);m.getColumn(4);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81764);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testSetColumn() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l5snzh1r39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testSetColumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l5snzh1r39(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81765);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81766);RealMatrix m = new Array2DRowRealMatrix(subTestData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81767);double[] mColumn3 = columnToArray(subColumn3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81768);Assert.assertTrue(mColumn3[0] != m.getColumn(1)[0]);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81769);m.setColumn(1, mColumn3);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81770);checkArrays(mColumn3, m.getColumn(1));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81771);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81772);m.setColumn(-1, mColumn3);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81773);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81774);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81775);m.setColumn(0, new double[5]);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81776);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    private double[] columnToArray(double[][] column) {try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81777);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81778);double[] data = new double[column.length];
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81779);for (int i = 0; (((i < data.length)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81780)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81781)==0&false)); ++i) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81782);data[i] = column[i][0];
        }
        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81783);return data;
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    private void checkArrays(double[] expected, double[] actual) {try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81784);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81785);Assert.assertEquals(expected.length, actual.length);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81786);for (int i = 0; (((i < expected.length)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81787)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81788)==0&false)); ++i) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81789);Assert.assertEquals(expected[i], actual[i], 0);
        }
    }}finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w81r3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w81r3y(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81790);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81791);Array2DRowRealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81792);Array2DRowRealMatrix m1 = (Array2DRowRealMatrix) m.copy();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81793);Array2DRowRealMatrix mt = (Array2DRowRealMatrix) m.transpose();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81794);Assert.assertTrue(m.hashCode() != mt.hashCode());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81795);Assert.assertEquals(m.hashCode(), m1.hashCode());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81796);Assert.assertEquals(m, m);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81797);Assert.assertEquals(m, m1);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81798);Assert.assertFalse(m.equals(null));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81799);Assert.assertFalse(m.equals(mt));
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81800);Assert.assertFalse(m.equals(new Array2DRowRealMatrix(bigSingular)));
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1r49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1r49(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81801);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81802);Array2DRowRealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81803);Assert.assertEquals("Array2DRowRealMatrix{{1.0,2.0,3.0},{2.0,5.0,3.0},{1.0,0.0,8.0}}",
                m.toString());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81804);m = new Array2DRowRealMatrix();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81805);Assert.assertEquals("Array2DRowRealMatrix{}",
                m.toString());
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testSetSubMatrix() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyz6bc1r4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testSetSubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyz6bc1r4e(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81806);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81807);Array2DRowRealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81808);m.setSubMatrix(detData2,1,1);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81809);RealMatrix expected = MatrixUtils.createRealMatrix
            (new double[][] {{1.0,2.0,3.0},{2.0,1.0,3.0},{1.0,2.0,4.0}});
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81810);Assert.assertEquals(expected, m);

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81811);m.setSubMatrix(detData2,0,0);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81812);expected = MatrixUtils.createRealMatrix
            (new double[][] {{1.0,3.0,3.0},{2.0,4.0,3.0},{1.0,2.0,4.0}});
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81813);Assert.assertEquals(expected, m);

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81814);m.setSubMatrix(testDataPlus2,0,0);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81815);expected = MatrixUtils.createRealMatrix
            (new double[][] {{3.0,4.0,5.0},{4.0,7.0,5.0},{3.0,2.0,10.0}});
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81816);Assert.assertEquals(expected, m);

        // dimension overflow
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81817);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81818);m.setSubMatrix(testData,1,1);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81819);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
        // dimension underflow
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81820);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81821);m.setSubMatrix(testData,-1,1);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81822);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81823);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81824);m.setSubMatrix(testData,1,-1);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81825);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }

        // null
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81826);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81827);m.setSubMatrix(null,1,1);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81828);Assert.fail("expecting NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81829);Array2DRowRealMatrix m2 = new Array2DRowRealMatrix();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81830);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81831);m2.setSubMatrix(testData,0,1);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81832);Assert.fail("expecting MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            // expected
        }
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81833);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81834);m2.setSubMatrix(testData,1,0);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81835);Assert.fail("expecting MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            // expected
        }

        // ragged
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81836);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81837);m.setSubMatrix(new double[][] {{1}, {2, 3}}, 0, 0);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81838);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }

        // empty
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81839);try {
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81840);m.setSubMatrix(new double[][] {{}}, 0, 0);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81841);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testWalk() {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1310jtu1r5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testWalk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1310jtu1r5e(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81842);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81843);int rows    = 150;
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81844);int columns = 75;

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81845);RealMatrix m = new Array2DRowRealMatrix(rows, columns);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81846);m.walkInRowOrder(new SetVisitor());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81847);GetVisitor getVisitor = new GetVisitor();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81848);m.walkInOptimizedOrder(getVisitor);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81849);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81850);m = new Array2DRowRealMatrix(rows, columns);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81851);m.walkInRowOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81852);getVisitor = new GetVisitor();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81853);m.walkInOptimizedOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81854);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81855);for (int i = 0; (((i < rows)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81856)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81857)==0&false)); ++i) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81858);Assert.assertEquals(0.0, m.getEntry(i, 0), 0);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81859);Assert.assertEquals(0.0, m.getEntry(i, columns - 1), 0);
        }
        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81860);for (int j = 0; (((j < columns)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81861)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81862)==0&false)); ++j) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81863);Assert.assertEquals(0.0, m.getEntry(0, j), 0);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81864);Assert.assertEquals(0.0, m.getEntry(rows - 1, j), 0);
        }

        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81865);m = new Array2DRowRealMatrix(rows, columns);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81866);m.walkInColumnOrder(new SetVisitor());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81867);getVisitor = new GetVisitor();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81868);m.walkInOptimizedOrder(getVisitor);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81869);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81870);m = new Array2DRowRealMatrix(rows, columns);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81871);m.walkInColumnOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81872);getVisitor = new GetVisitor();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81873);m.walkInOptimizedOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81874);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81875);for (int i = 0; (((i < rows)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81876)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81877)==0&false)); ++i) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81878);Assert.assertEquals(0.0, m.getEntry(i, 0), 0);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81879);Assert.assertEquals(0.0, m.getEntry(i, columns - 1), 0);
        }
        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81880);for (int j = 0; (((j < columns)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81881)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81882)==0&false)); ++j) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81883);Assert.assertEquals(0.0, m.getEntry(0, j), 0);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81884);Assert.assertEquals(0.0, m.getEntry(rows - 1, j), 0);
        }

        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81885);m = new Array2DRowRealMatrix(rows, columns);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81886);m.walkInOptimizedOrder(new SetVisitor());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81887);getVisitor = new GetVisitor();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81888);m.walkInRowOrder(getVisitor);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81889);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81890);m = new Array2DRowRealMatrix(rows, columns);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81891);m.walkInOptimizedOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81892);getVisitor = new GetVisitor();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81893);m.walkInRowOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81894);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81895);for (int i = 0; (((i < rows)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81896)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81897)==0&false)); ++i) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81898);Assert.assertEquals(0.0, m.getEntry(i, 0), 0);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81899);Assert.assertEquals(0.0, m.getEntry(i, columns - 1), 0);
        }
        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81900);for (int j = 0; (((j < columns)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81901)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81902)==0&false)); ++j) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81903);Assert.assertEquals(0.0, m.getEntry(0, j), 0);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81904);Assert.assertEquals(0.0, m.getEntry(rows - 1, j), 0);
        }

        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81905);m = new Array2DRowRealMatrix(rows, columns);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81906);m.walkInOptimizedOrder(new SetVisitor());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81907);getVisitor = new GetVisitor();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81908);m.walkInColumnOrder(getVisitor);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81909);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81910);m = new Array2DRowRealMatrix(rows, columns);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81911);m.walkInOptimizedOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81912);getVisitor = new GetVisitor();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81913);m.walkInColumnOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81914);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81915);for (int i = 0; (((i < rows)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81916)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81917)==0&false)); ++i) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81918);Assert.assertEquals(0.0, m.getEntry(i, 0), 0);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81919);Assert.assertEquals(0.0, m.getEntry(i, columns - 1), 0);
        }
        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81920);for (int j = 0; (((j < columns)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81921)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81922)==0&false)); ++j) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81923);Assert.assertEquals(0.0, m.getEntry(0, j), 0);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81924);Assert.assertEquals(0.0, m.getEntry(rows - 1, j), 0);
        }
    }}finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    @Test
    public void testSerial()  {__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceStart(getClass().getName(),81925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv1r7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qq81qq8lb90pcz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qq81qq8lb90pcz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.Array2DRowRealMatrixTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv1r7p(){try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81925);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81926);Array2DRowRealMatrix m = new Array2DRowRealMatrix(testData);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81927);Assert.assertEquals(m,TestUtils.serializeAndRecover(m));
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}


    private static class SetVisitor extends DefaultRealMatrixChangingVisitor {
        @Override
        public double visit(int i, int j, double value) {try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81928);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81929);return i + j / 1024.0;
        }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}
    }

    private static class GetVisitor extends DefaultRealMatrixPreservingVisitor {
        private int count = 0;
        @Override
        public void visit(int i, int j, double value) {try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81930);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81931);++count;
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81932);Assert.assertEquals(i + j / 1024.0, value, 0.0);
        }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}
        public int getCount() {try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81933);
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81934);return count;
        }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}
    }

    //--------------- -----------------Protected methods

    /** extracts the l  and u matrices from compact lu representation */
    protected void splitLU(RealMatrix lu, double[][] lowerData, double[][] upperData) {try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81935);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81936);if ((((!lu.isSquare())&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81937)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81938)==0&false))) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81939);throw new NonSquareMatrixException(lu.getRowDimension(), lu.getColumnDimension());
        }
        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81940);if ((((lowerData.length != lowerData[0].length)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81941)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81942)==0&false))) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81943);throw new DimensionMismatchException(lowerData.length, lowerData[0].length);
        }
        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81944);if ((((upperData.length != upperData[0].length)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81945)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81946)==0&false))) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81947);throw new DimensionMismatchException(upperData.length, upperData[0].length);
        }
        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81948);if ((((lowerData.length != upperData.length)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81949)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81950)==0&false))) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81951);throw new DimensionMismatchException(lowerData.length, upperData.length);
        }
        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81952);if ((((lowerData.length != lu.getRowDimension())&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81953)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81954)==0&false))) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81955);throw new DimensionMismatchException(lowerData.length, lu.getRowDimension());
        }

        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81956);int n = lu.getRowDimension();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81957);for (int i = 0; (((i < n)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81958)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81959)==0&false)); i++) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81960);for (int j = 0; (((j < n)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81961)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81962)==0&false)); j++) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81963);if ((((j < i)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81964)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81965)==0&false))) {{
                    __CLR4_4_11qq81qq8lb90pcz3.R.inc(81966);lowerData[i][j] = lu.getEntry(i, j);
                    __CLR4_4_11qq81qq8lb90pcz3.R.inc(81967);upperData[i][j] = 0d;
                } }else {__CLR4_4_11qq81qq8lb90pcz3.R.inc(81968);if ((((i == j)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81969)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81970)==0&false))) {{
                    __CLR4_4_11qq81qq8lb90pcz3.R.inc(81971);lowerData[i][j] = 1d;
                    __CLR4_4_11qq81qq8lb90pcz3.R.inc(81972);upperData[i][j] = lu.getEntry(i, j);
                } }else {{
                    __CLR4_4_11qq81qq8lb90pcz3.R.inc(81973);lowerData[i][j] = 0d;
                    __CLR4_4_11qq81qq8lb90pcz3.R.inc(81974);upperData[i][j] = lu.getEntry(i, j);
                }
            }}}
        }}
    }}finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

    /** Returns the result of applying the given row permutation to the matrix */
    protected RealMatrix permuteRows(RealMatrix matrix, int[] permutation) {try{__CLR4_4_11qq81qq8lb90pcz3.R.inc(81975);
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81976);if ((((!matrix.isSquare())&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81977)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81978)==0&false))) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81979);throw new NonSquareMatrixException(matrix.getRowDimension(),
                                               matrix.getColumnDimension());
        }
        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81980);if ((((matrix.getRowDimension() != permutation.length)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81981)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81982)==0&false))) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81983);throw new DimensionMismatchException(matrix.getRowDimension(), permutation.length);
        }

        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81984);int n = matrix.getRowDimension();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81985);int m = matrix.getColumnDimension();
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81986);double out[][] = new double[m][n];
        __CLR4_4_11qq81qq8lb90pcz3.R.inc(81987);for (int i = 0; (((i < n)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81988)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81989)==0&false)); i++) {{
            __CLR4_4_11qq81qq8lb90pcz3.R.inc(81990);for (int j = 0; (((j < m)&&(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81991)!=0|true))||(__CLR4_4_11qq81qq8lb90pcz3.R.iget(81992)==0&false)); j++) {{
                __CLR4_4_11qq81qq8lb90pcz3.R.inc(81993);out[i][j] = matrix.getEntry(permutation[i], j);
            }
        }}
        }__CLR4_4_11qq81qq8lb90pcz3.R.inc(81994);return new Array2DRowRealMatrix(out);
    }finally{__CLR4_4_11qq81qq8lb90pcz3.R.flushNeeded();}}

//    /** Useful for debugging */
//    private void dumpMatrix(RealMatrix m) {
//          for (int i = 0; i < m.getRowDimension(); i++) {
//              String os = "";
//              for (int j = 0; j < m.getColumnDimension(); j++) {
//                  os += m.getEntry(i, j) + " ";
//              }
//              System.out.println(os);
//          }
//    }
}

